package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.util.ObjectsCompat$$ExternalSyntheticBackport0;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$BotInfo;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_photo;
import org.telegram.tgnet.TLRPC$TL_photoStrippedSize;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.TypefaceSpan;

public class BotHelpCell extends View {
    private boolean animating;
    private String currentPhotoKey;
    private BotHelpCellDelegate delegate;
    private int height;
    private ImageReceiver imageReceiver;
    private boolean isPhotoVisible;
    private boolean isTextVisible;
    private String oldText;
    private int photoHeight;
    private ClickableSpan pressedLink;
    private Theme.ResourcesProvider resourcesProvider;
    private StaticLayout textLayout;
    private int textX;
    private int textY;
    private int width;
    private LinkPath urlPath = new LinkPath();
    private int imagePadding = AndroidUtilities.dp(4.0f);

    public interface BotHelpCellDelegate {
        void didPressUrl(String str);
    }

    public BotHelpCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.imageReceiver = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        this.imageReceiver.setCrossfadeWithOldImage(true);
        this.imageReceiver.setCrossfadeDuration(300);
    }

    public void setDelegate(BotHelpCellDelegate botHelpCellDelegate) {
        this.delegate = botHelpCellDelegate;
    }

    private void resetPressedLink() {
        if (this.pressedLink != null) {
            this.pressedLink = null;
        }
        invalidate();
    }

    public void setText(boolean z, String str) {
        setText(z, str, null, null);
    }

    public void setText(boolean z, String str, TLObject tLObject, TLRPC$BotInfo tLRPC$BotInfo) {
        int i;
        boolean z2 = tLObject != null;
        boolean z3 = !TextUtils.isEmpty(str);
        if ((str == null || str.length() == 0) && !z2) {
            setVisibility(8);
            return;
        }
        String str2 = str == null ? "" : str;
        if (!str2.equals(this.oldText) || this.isPhotoVisible != z2) {
            this.isPhotoVisible = z2;
            this.isTextVisible = z3;
            if (z2) {
                String keyForParentObject = FileRefController.getKeyForParentObject(tLRPC$BotInfo);
                if (!ObjectsCompat$$ExternalSyntheticBackport0.m(this.currentPhotoKey, keyForParentObject)) {
                    this.currentPhotoKey = keyForParentObject;
                    if (tLObject instanceof TLRPC$TL_photo) {
                        TLRPC$Photo tLRPC$Photo = (TLRPC$Photo) tLObject;
                        this.imageReceiver.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, 400), tLRPC$Photo), "400_400", null, "jpg", tLRPC$BotInfo, 0);
                    } else if (tLObject instanceof TLRPC$Document) {
                        TLRPC$Document tLRPC$Document = (TLRPC$Document) tLObject;
                        TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 400);
                        BitmapDrawable bitmapDrawable = null;
                        if (SharedConfig.getDevicePerformanceClass() != 0) {
                            Iterator<TLRPC$PhotoSize> it = tLRPC$Document.thumbs.iterator();
                            while (it.hasNext()) {
                                TLRPC$PhotoSize next = it.next();
                                if (next instanceof TLRPC$TL_photoStrippedSize) {
                                    bitmapDrawable = new BitmapDrawable(getResources(), ImageLoader.getStrippedPhotoBitmap(next.bytes, "b"));
                                }
                            }
                        }
                        this.imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$Document), ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForDocument(MessageObject.getDocumentVideoThumb(tLRPC$Document), tLRPC$Document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, tLRPC$Document), "86_86_b", bitmapDrawable, tLRPC$Document.size, "mp4", tLRPC$BotInfo, 0);
                    }
                    int dp = AndroidUtilities.dp(SharedConfig.bubbleRadius) - AndroidUtilities.dp(2.0f);
                    int dp2 = AndroidUtilities.dp(4.0f);
                    if (!this.isTextVisible) {
                        dp2 = dp;
                    }
                    this.imageReceiver.setRoundRadius(dp, dp, dp2, dp2);
                }
            }
            this.oldText = AndroidUtilities.getSafeString(str2);
            setVisibility(0);
            if (AndroidUtilities.isTablet()) {
                i = AndroidUtilities.getMinTabletSide();
            } else {
                Point point = AndroidUtilities.displaySize;
                i = Math.min(point.x, point.y);
            }
            int i2 = (int) (i * 0.7f);
            if (this.isTextVisible) {
                String[] split = str2.split("\n");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String string = LocaleController.getString((int) R.string.BotInfoTitle);
                if (z) {
                    spannableStringBuilder.append((CharSequence) string);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                }
                for (int i3 = 0; i3 < split.length; i3++) {
                    spannableStringBuilder.append((CharSequence) split[i3].trim());
                    if (i3 != split.length - 1) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                }
                MessageObject.addLinks(false, spannableStringBuilder);
                if (z) {
                    spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM)), 0, string.length(), 33);
                }
                Emoji.replaceEmoji(spannableStringBuilder, Theme.chat_msgTextPaint.getFontMetricsInt(), AndroidUtilities.dp(20.0f), false);
                try {
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, Theme.chat_msgTextPaint, i2 - (this.isPhotoVisible ? AndroidUtilities.dp(5.0f) : 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.textLayout = staticLayout;
                    this.width = 0;
                    this.height = staticLayout.getHeight() + AndroidUtilities.dp(22.0f);
                    int lineCount = this.textLayout.getLineCount();
                    for (int i4 = 0; i4 < lineCount; i4++) {
                        this.width = (int) Math.ceil(Math.max(this.width, this.textLayout.getLineWidth(i4) + this.textLayout.getLineLeft(i4)));
                    }
                    if (this.width > i2 || this.isPhotoVisible) {
                        this.width = i2;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (this.isPhotoVisible) {
                this.width = i2;
            }
            int dp3 = this.width + AndroidUtilities.dp(22.0f);
            this.width = dp3;
            if (this.isPhotoVisible) {
                int i5 = this.height;
                double d = dp3;
                Double.isNaN(d);
                int i6 = (int) (d * 0.5625d);
                this.photoHeight = i6;
                this.height = i5 + i6 + AndroidUtilities.dp(4.0f);
            }
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.BotHelpCell.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), this.height + AndroidUtilities.dp(8.0f));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int i;
        int width = (getWidth() - this.width) / 2;
        int dp = this.photoHeight + AndroidUtilities.dp(2.0f);
        Drawable shadowDrawable = Theme.chat_msgInMediaDrawable.getShadowDrawable();
        if (shadowDrawable != null) {
            shadowDrawable.setBounds(width, dp, this.width + width, this.height + dp);
            shadowDrawable.draw(canvas);
        }
        Point point = AndroidUtilities.displaySize;
        int i2 = point.x;
        int i3 = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            i2 = view.getMeasuredWidth();
            i3 = view.getMeasuredHeight();
        }
        int i4 = i3;
        Theme.MessageDrawable messageDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgInMedia");
        messageDrawable.setTop((int) getY(), i2, i4, false, false);
        messageDrawable.setBounds(width, 0, this.width + width, this.height);
        messageDrawable.draw(canvas);
        this.imageReceiver.setImageCoords(width + i, this.imagePadding, this.width - (i * 2), this.photoHeight - i);
        this.imageReceiver.draw(canvas);
        Theme.chat_msgTextPaint.setColor(getThemedColor("chat_messageTextIn"));
        Theme.chat_msgTextPaint.linkColor = getThemedColor("chat_messageLinkIn");
        canvas.save();
        int dp2 = AndroidUtilities.dp(this.isPhotoVisible ? 14.0f : 11.0f) + width;
        this.textX = dp2;
        float f = dp2;
        int dp3 = AndroidUtilities.dp(11.0f) + dp;
        this.textY = dp3;
        canvas.translate(f, dp3);
        if (this.pressedLink != null) {
            canvas.drawPath(this.urlPath, Theme.chat_urlPaint);
        }
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageReceiver.onDetachedFromWindow();
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.textLayout.getText());
    }

    public boolean animating() {
        return this.animating;
    }

    public void setAnimating(boolean z) {
        this.animating = z;
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }

    private Drawable getThemedDrawable(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Drawable drawable = resourcesProvider != null ? resourcesProvider.getDrawable(str) : null;
        return drawable != null ? drawable : Theme.getThemeDrawable(str);
    }
}
