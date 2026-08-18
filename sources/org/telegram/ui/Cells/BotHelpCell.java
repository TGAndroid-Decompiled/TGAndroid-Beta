package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ClipRoundedDrawable;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanNoUnderline;

public abstract class BotHelpCell extends View {
    private boolean animating;
    private final int currentAccount;
    private String currentPhotoKey;
    private BotHelpCellDelegate delegate;
    private int height;
    private int imagePadding;
    private ImageReceiver imageReceiver;
    private boolean isPhotoVisible;
    private boolean isTextVisible;
    private LinkSpanDrawable.LinkCollector links;
    private String oldManagerBotName;
    private String oldText;
    private int photoHeight;
    private LinkSpanDrawable pressedLink;
    private final Theme.ResourcesProvider resourcesProvider;
    private Drawable selectorDrawable;
    private int selectorDrawableRadius;
    private StaticLayout textLayout;
    private int textX;
    private int textY;
    public boolean wasDraw;
    private int width;

    public interface BotHelpCellDelegate {
        void didPressUrl(String str);
    }

    public int getSideMenuWidth() {
        return 0;
    }

    public BotHelpCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.links = new LinkSpanDrawable.LinkCollector(this);
        this.imagePadding = AndroidUtilities.dp(4.0f);
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.imageReceiver = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        this.imageReceiver.setCrossfadeWithOldImage(true);
        this.imageReceiver.setCrossfadeDuration(300);
        int color = Theme.getColor(Theme.key_listSelector, resourcesProvider);
        int i2 = SharedConfig.bubbleRadius;
        this.selectorDrawableRadius = i2;
        Drawable drawableCreateRadSelectorDrawable = Theme.createRadSelectorDrawable(color, i2, i2);
        this.selectorDrawable = drawableCreateRadSelectorDrawable;
        drawableCreateRadSelectorDrawable.setCallback(this);
    }

    public void setDelegate(BotHelpCellDelegate botHelpCellDelegate) {
        this.delegate = botHelpCellDelegate;
    }

    private void resetPressedLink() {
        if (this.pressedLink != null) {
            this.pressedLink = null;
        }
        this.links.clear();
        invalidate();
    }

    public void setText(boolean z, String str) {
        setText(z, 0L, str, null, null, null);
    }

    public void setText(boolean z, long j, String str, TLObject tLObject, TL_bots.BotInfo botInfo, String str2) {
        int iMin;
        boolean z2 = tLObject != null;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if ((str == null || str.length() == 0) && TextUtils.isEmpty(str2) && !z2) {
            setVisibility(8);
            return;
        }
        String str3 = str == null ? "" : str;
        if (str3.equals(this.oldText) && TextUtils.equals(this.oldManagerBotName, str2) && this.isPhotoVisible == z2) {
            return;
        }
        boolean z3 = TextUtils.isEmpty(str3) && tLObject == null && !TextUtils.isEmpty(str2) && j != 0;
        boolean z4 = z2 || z3;
        this.isPhotoVisible = z4;
        this.isTextVisible = !zIsEmpty || z3;
        if (z3) {
            if (!Objects.equals(this.currentPhotoKey, "setup")) {
                this.currentPhotoKey = "setup";
                this.imageReceiver.setImageBitmap(new ClipRoundedDrawable(getContext().getResources().getDrawable(R.drawable.setup_bot_header).mutate()));
                int iDp = AndroidUtilities.dp(SharedConfig.bubbleRadius) - AndroidUtilities.dp(2.0f);
                int iDp2 = AndroidUtilities.dp(4.0f);
                if (!this.isTextVisible) {
                    iDp2 = iDp;
                }
                this.imageReceiver.setRoundRadius(iDp, iDp, iDp2, iDp2);
            }
        } else if (z4) {
            String keyForParentObject = FileRefController.getKeyForParentObject(botInfo);
            if (!Objects.equals(this.currentPhotoKey, keyForParentObject)) {
                this.currentPhotoKey = keyForParentObject;
                if (tLObject instanceof TLRPC.TL_photo) {
                    TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                    this.imageReceiver.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 400), photo), "400_400", null, "jpg", botInfo, 0);
                } else if (tLObject instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) tLObject;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 400);
                    BitmapDrawable bitmapDrawable = null;
                    if (SharedConfig.getDevicePerformanceClass() != 0) {
                        for (TLRPC.PhotoSize photoSize : document.thumbs) {
                            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                bitmapDrawable = new BitmapDrawable(getResources(), ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, "b"));
                            }
                        }
                    }
                    this.imageReceiver.setImage(ImageLocation.getForDocument(document), "g", ImageLocation.getForDocument(MessageObject.getDocumentVideoThumb(document), document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "86_86_b", bitmapDrawable, document.size, "mp4", botInfo, 0);
                }
                int iDp3 = AndroidUtilities.dp(SharedConfig.bubbleRadius) - AndroidUtilities.dp(2.0f);
                int iDp4 = AndroidUtilities.dp(4.0f);
                if (!this.isTextVisible) {
                    iDp4 = iDp3;
                }
                this.imageReceiver.setRoundRadius(iDp3, iDp3, iDp4, iDp4);
            }
        }
        this.oldText = AndroidUtilities.getSafeString(str3);
        this.oldManagerBotName = str2;
        setVisibility(0);
        if (AndroidUtilities.isTablet()) {
            iMin = AndroidUtilities.getMinTabletSide();
        } else {
            Point point = AndroidUtilities.displaySize;
            iMin = Math.min(point.x, point.y);
        }
        int i = (int) (iMin * 0.7f);
        if (this.isTextVisible) {
            String[] strArrSplit = str3.split("\n");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (z3) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ManagedBotChatInfo, DialogObject.getName(this.currentAccount, j), str2)));
            } else {
                String string = LocaleController.getString(R.string.BotInfoTitle);
                if (z) {
                    spannableStringBuilder.append((CharSequence) string);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                }
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    spannableStringBuilder.append((CharSequence) strArrSplit[i2].trim());
                    if (i2 != strArrSplit.length - 1) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                }
                MessageObject.addLinks(false, spannableStringBuilder);
                if (z) {
                    spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, string.length(), 33);
                }
            }
            Emoji.replaceEmoji(spannableStringBuilder, Theme.chat_msgTextPaint.getFontMetricsInt(), false);
            try {
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, Theme.chat_msgTextPaint, i - (this.isPhotoVisible ? AndroidUtilities.dp(5.0f) : 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.textLayout = staticLayout;
                this.width = 0;
                this.height = staticLayout.getHeight() + AndroidUtilities.dp(22.0f);
                int lineCount = this.textLayout.getLineCount();
                for (int i3 = 0; i3 < lineCount; i3++) {
                    this.width = (int) Math.ceil(Math.max(this.width, this.textLayout.getLineWidth(i3) + this.textLayout.getLineLeft(i3)));
                }
                if (this.width > i || this.isPhotoVisible) {
                    this.width = i;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (this.isPhotoVisible) {
            this.width = i;
        }
        int iDp5 = this.width + AndroidUtilities.dp(22.0f);
        this.width = iDp5;
        if (this.isPhotoVisible) {
            int i4 = this.height;
            int i5 = (int) (((double) iDp5) * 0.5625d);
            this.photoHeight = i5;
            this.height = i4 + i5 + AndroidUtilities.dp(4.0f);
        }
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout == null) {
            return null;
        }
        return staticLayout.getText();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.textLayout == null) {
            z = false;
        } else {
            if (motionEvent.getAction() == 0 || (this.pressedLink != null && motionEvent.getAction() == 1)) {
                if (motionEvent.getAction() == 0) {
                    resetPressedLink();
                    try {
                        int i = (int) (x - this.textX);
                        int i2 = (int) (y - this.textY);
                        int lineForVertical = this.textLayout.getLineForVertical(i2);
                        float f = i;
                        int offsetForHorizontal = this.textLayout.getOffsetForHorizontal(lineForVertical, f);
                        float lineLeft = this.textLayout.getLineLeft(lineForVertical);
                        if (lineLeft <= f && lineLeft + this.textLayout.getLineWidth(lineForVertical) >= f) {
                            Spannable spannable = (Spannable) this.textLayout.getText();
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length != 0) {
                                resetPressedLink();
                                this.pressedLink = new LinkSpanDrawable(clickableSpanArr[0], this.resourcesProvider, f, i2);
                                try {
                                    try {
                                        int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                                        LinkPath linkPathObtainNewPath = this.pressedLink.obtainNewPath();
                                        linkPathObtainNewPath.setCurrentLayout(this.textLayout, spanStart, 0.0f);
                                        this.textLayout.getSelectionPath(spanStart, spannable.getSpanEnd(clickableSpanArr[0]), linkPathObtainNewPath);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    this.links.addLink(this.pressedLink);
                                    invalidate();
                                    z = true;
                                } catch (Exception e2) {
                                    e = e2;
                                    z = true;
                                    resetPressedLink();
                                    FileLog.e(e);
                                }
                            } else {
                                resetPressedLink();
                            }
                        } else {
                            resetPressedLink();
                        }
                    } catch (Exception e3) {
                        e = e3;
                        z = false;
                    }
                } else {
                    LinkSpanDrawable linkSpanDrawable = this.pressedLink;
                    if (linkSpanDrawable != null) {
                        try {
                            ClickableSpan clickableSpan = (ClickableSpan) linkSpanDrawable.getSpan();
                            if (clickableSpan instanceof URLSpanNoUnderline) {
                                String url = ((URLSpanNoUnderline) clickableSpan).getURL();
                                if (url.startsWith("@") || url.startsWith("#") || url.startsWith("/") || url.startsWith("$")) {
                                    BotHelpCellDelegate botHelpCellDelegate = this.delegate;
                                    if (botHelpCellDelegate != null) {
                                        botHelpCellDelegate.didPressUrl(url);
                                    }
                                }
                            } else if (clickableSpan instanceof URLSpan) {
                                BotHelpCellDelegate botHelpCellDelegate2 = this.delegate;
                                if (botHelpCellDelegate2 != null) {
                                    botHelpCellDelegate2.didPressUrl(((URLSpan) clickableSpan).getURL());
                                }
                            } else if (clickableSpan != null) {
                                clickableSpan.onClick(this);
                            }
                        } catch (Exception e4) {
                            FileLog.e(e4);
                        }
                        resetPressedLink();
                        z = true;
                    }
                }
            } else if (motionEvent.getAction() == 3) {
                resetPressedLink();
            }
            z = false;
        }
        if (this.selectorDrawable != null) {
            if (!z && y > 0.0f && motionEvent.getAction() == 0 && isClickable()) {
                this.selectorDrawable.setState(new int[]{16842919, 16842910});
                this.selectorDrawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                invalidate();
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.selectorDrawable.setState(new int[0]);
                invalidate();
                if (!z && motionEvent.getAction() == 1) {
                    performClick();
                }
            }
            z = true;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), this.height + AndroidUtilities.dp(8.0f));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getSideMenuWidth() / 2.0f, 0.0f);
        int width = (getWidth() - this.width) / 2;
        int iDp = this.photoHeight + AndroidUtilities.dp(2.0f);
        Drawable shadowDrawable = Theme.chat_msgInMediaDrawable.getShadowDrawable();
        if (shadowDrawable != null) {
            shadowDrawable.setBounds(width, iDp, this.width + width, this.height + iDp);
            shadowDrawable.draw(canvas);
        }
        Point point = AndroidUtilities.displaySize;
        int measuredWidth = point.x;
        int measuredHeight = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
        }
        int i = measuredHeight;
        MessageDrawable messageDrawable = (MessageDrawable) getThemedDrawable("drawableMsgInMedia");
        messageDrawable.setTop((int) getY(), measuredWidth, i, false, false);
        messageDrawable.setBounds(width, 0, this.width + width, this.height);
        messageDrawable.draw(canvas);
        Drawable drawable = this.selectorDrawable;
        if (drawable != null) {
            int i2 = this.selectorDrawableRadius;
            int i3 = SharedConfig.bubbleRadius;
            if (i2 != i3) {
                this.selectorDrawableRadius = i3;
                Theme.setMaskDrawableRad(drawable, i3, i3);
            }
            this.selectorDrawable.setBounds(AndroidUtilities.dp(2.0f) + width, AndroidUtilities.dp(2.0f), (this.width + width) - AndroidUtilities.dp(2.0f), this.height - AndroidUtilities.dp(2.0f));
            this.selectorDrawable.draw(canvas);
        }
        ImageReceiver imageReceiver = this.imageReceiver;
        int i4 = this.imagePadding;
        imageReceiver.setImageCoords(width + i4, i4, this.width - (i4 * 2), this.photoHeight - i4);
        this.imageReceiver.draw(canvas);
        Theme.chat_msgTextPaint.setColor(getThemedColor(Theme.key_chat_messageTextIn));
        Theme.chat_msgTextPaint.linkColor = getThemedColor(Theme.key_chat_messageLinkIn);
        canvas.save();
        int iDp2 = AndroidUtilities.dp(this.isPhotoVisible ? 14.0f : 11.0f) + width;
        this.textX = iDp2;
        float f = iDp2;
        int iDp3 = AndroidUtilities.dp(11.0f) + iDp;
        this.textY = iDp3;
        canvas.translate(f, iDp3);
        if (this.links.draw(canvas)) {
            invalidate();
        }
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
        this.wasDraw = true;
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
        this.wasDraw = false;
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout != null) {
            accessibilityNodeInfo.setText(staticLayout.getText());
        }
    }

    public boolean animating() {
        return this.animating;
    }

    public void setAnimating(boolean z) {
        this.animating = z;
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    private Drawable getThemedDrawable(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Drawable drawable = resourcesProvider != null ? resourcesProvider.getDrawable(str) : null;
        return drawable != null ? drawable : Theme.getThemeDrawable(str);
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.selectorDrawable || super.verifyDrawable(drawable);
    }
}
