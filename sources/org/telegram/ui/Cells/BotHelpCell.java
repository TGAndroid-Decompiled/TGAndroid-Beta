package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import j$.util.Objects;
import java.util.ArrayList;
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
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda356;
import org.telegram.ui.Components.ClipRoundedDrawable;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanNoUnderline;

public abstract class BotHelpCell extends View {
    public boolean animating;
    public final int currentAccount;
    public String currentPhotoKey;
    public BotHelpCellDelegate delegate;
    public int height;
    public final int imagePadding;
    public final ImageReceiver imageReceiver;
    public boolean isPhotoVisible;
    public boolean isTextVisible;
    public final LinkSpanDrawable.LinkCollector links;
    public String oldManagerBotName;
    public String oldText;
    public int photoHeight;
    public LinkSpanDrawable pressedLink;
    public final Theme.ResourcesProvider resourcesProvider;
    public final BaseCell.RippleDrawableSafe selectorDrawable;
    public int selectorDrawableRadius;
    public StaticLayout textLayout;
    public int textX;
    public int textY;
    public int width;

    public interface BotHelpCellDelegate {
    }

    public final class BotIntroDrawable extends Drawable {
        public int alpha;
        public final Paint backgroundPaint;
        public final Paint codePaint;
        public ColorFilter colorFilter;
        public final Drawable icon;
        public final Paint layerPaint;

        public BotIntroDrawable(Context context) {
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            Paint paint2 = new Paint(1);
            this.codePaint = paint2;
            this.layerPaint = new Paint();
            this.alpha = 255;
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.msg_folders_bots).mutate();
            this.icon = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-13628751, PorterDuff.Mode.SRC_IN));
            paint.setShader(new RadialGradient(400.0f, 213.0f, 500.0f, -4811527, -9674273, Shader.TileMode.CLAMP));
            paint2.setColor(-1);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeCap(Paint.Cap.ROUND);
        }

        @Override
        public final void draw(Canvas canvas) {
            Canvas canvas2;
            int iSaveLayer;
            Rect bounds = getBounds();
            if (bounds.isEmpty() || this.alpha == 0) {
                return;
            }
            ColorFilter colorFilter = this.colorFilter;
            if (colorFilter != null) {
                Paint paint = this.layerPaint;
                paint.setColorFilter(colorFilter);
                iSaveLayer = canvas.saveLayer(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                iSaveLayer = -1;
            }
            float fWidth = bounds.width() / 800.0f;
            float fHeight = bounds.height() / 427.0f;
            Paint paint2 = this.backgroundPaint;
            paint2.setAlpha(this.alpha);
            canvas2.save();
            canvas2.translate(bounds.left, bounds.top);
            canvas2.scale(fWidth, fHeight);
            Canvas canvas3 = canvas2;
            canvas3.drawRect(0.0f, 0.0f, 800.0f, 427.0f, paint2);
            canvas3.restore();
            Paint paint3 = this.codePaint;
            paint3.setAlpha(this.alpha);
            paint3.setStrokeWidth(Math.min(fWidth, fHeight) * 16.4f);
            drawLine(canvas3, bounds, fWidth, fHeight, 449.809f, 246.04f, 483.703f, 212.418f);
            drawLine(canvas3, bounds, fWidth, fHeight, 483.703f, 212.418f, 451.291f, 179.901f);
            drawLine(canvas3, bounds, fWidth, fHeight, 350.197f, 246.04f, 316.302f, 212.418f);
            drawLine(canvas3, bounds, fWidth, fHeight, 316.302f, 212.418f, 348.716f, 179.901f);
            drawLine(canvas3, bounds, fWidth, fHeight, 379.613f, 278.0f, 420.657f, 146.0f);
            canvas3.save();
            canvas3.translate(bounds.left, bounds.top);
            canvas3.scale(fWidth, fHeight);
            drawBot(canvas3, 299.339f, 60.9305f, 56.0f, 0.1629f);
            drawBot(canvas3, 500.651f, 60.9305f, 56.0f, 0.1629f);
            drawBot(canvas3, 579.018f, 225.477f, 56.0f, 0.2239f);
            drawBot(canvas3, 220.979f, 225.477f, 56.0f, 0.2239f);
            drawBot(canvas3, 548.102f, 359.18f, 52.0f, 0.1816f);
            drawBot(canvas3, 400.0f, 382.172f, 52.0f, 0.123f);
            drawBot(canvas3, 251.891f, 359.18f, 52.0f, 0.1816f);
            drawBot(canvas3, 698.424f, 175.361f, 42.0f, 0.12f);
            drawBot(canvas3, 572.549f, 125.064f, 42.0f, 0.2409f);
            drawBot(canvas3, 650.19f, 61.1149f, 42.0f, 0.0764f);
            drawBot(canvas3, 399.994f, 18.0016f, 42.0f, 0.1231f);
            drawBot(canvas3, 149.799f, 61.1149f, 42.0f, 0.0753f);
            drawBot(canvas3, 227.44f, 125.064f, 42.0f, 0.2409f);
            drawBot(canvas3, 101.565f, 175.361f, 42.0f, 0.12f);
            drawBot(canvas3, 167.057f, 316.916f, 42.0f, 0.15f);
            drawBot(canvas3, 114.502f, 408.888f, 42.0f, 0.075f);
            drawBot(canvas3, 678.299f, 408.888f, 42.0f, 0.075f);
            drawBot(canvas3, 655.947f, 316.916f, 42.0f, 0.15f);
            canvas3.restore();
            if (iSaveLayer >= 0) {
                canvas3.restoreToCount(iSaveLayer);
            }
        }

        public final void drawBot(Canvas canvas, float f, float f2, float f3, float f4) {
            Drawable drawable = this.icon;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                return;
            }
            drawable.setAlpha(Math.round(this.alpha * f4));
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            canvas.save();
            canvas.translate(f, f2);
            canvas.scale(f3 / intrinsicWidth, f3 / intrinsicHeight);
            canvas.translate((-intrinsicWidth) / 2.0f, (-intrinsicHeight) / 2.0f);
            drawable.draw(canvas);
            canvas.restore();
        }

        public final void drawLine(Canvas canvas, Rect rect, float f, float f2, float f3, float f4, float f5, float f6) {
            float f7 = rect.left;
            float f8 = rect.top;
            canvas.drawLine((f3 * f) + f7, (f4 * f2) + f8, (f5 * f) + f7, (f6 * f2) + f8, this.codePaint);
        }

        @Override
        public final int getIntrinsicHeight() {
            return AndroidUtilities.dp(427.0f);
        }

        @Override
        public final int getIntrinsicWidth() {
            return AndroidUtilities.dp(800.0f);
        }

        @Override
        public final int getOpacity() {
            return -3;
        }

        @Override
        public final void setAlpha(int i) {
            int iMax = Math.max(0, Math.min(255, i));
            if (this.alpha != iMax) {
                this.alpha = iMax;
                invalidateSelf();
            }
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            if (this.colorFilter != colorFilter) {
                this.colorFilter = colorFilter;
                invalidateSelf();
            }
        }
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
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setCrossfadeDuration(300);
        int color = Theme.getColor(Theme.key_listSelector, resourcesProvider);
        int i2 = SharedConfig.bubbleRadius;
        this.selectorDrawableRadius = i2;
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateRadSelectorDrawable = Theme.createRadSelectorDrawable(color, i2, i2);
        this.selectorDrawable = rippleDrawableSafeCreateRadSelectorDrawable;
        rippleDrawableSafeCreateRadSelectorDrawable.setCallback(this);
    }

    public int getSideMenuWidth() {
        return 0;
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout == null) {
            return null;
        }
        return staticLayout.getText();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageReceiver.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getSideMenuWidth() / 2.0f, 0.0f);
        int width = (getWidth() - this.width) / 2;
        int iDp = AndroidUtilities.dp(2.0f) + this.photoHeight;
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
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Drawable drawable = resourcesProvider != null ? resourcesProvider.getDrawable("drawableMsgInMedia") : null;
        if (drawable == null) {
            drawable = (Drawable) Theme.defaultChatDrawables.get("drawableMsgInMedia");
        }
        MessageDrawable messageDrawable = (MessageDrawable) drawable;
        messageDrawable.setTop((int) getY(), measuredWidth, measuredHeight);
        messageDrawable.setBounds(width, 0, this.width + width, this.height);
        messageDrawable.draw(canvas);
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
        if (rippleDrawableSafe != null) {
            int i = this.selectorDrawableRadius;
            int i2 = SharedConfig.bubbleRadius;
            if (i != i2) {
                this.selectorDrawableRadius = i2;
                Theme.setMaskDrawableRad(rippleDrawableSafe, i2, i2);
            }
            rippleDrawableSafe.setBounds(AndroidUtilities.dp(2.0f) + width, AndroidUtilities.dp(2.0f), (this.width + width) - AndroidUtilities.dp(2.0f), this.height - AndroidUtilities.dp(2.0f));
            rippleDrawableSafe.draw(canvas);
        }
        ImageReceiver imageReceiver = this.imageReceiver;
        int i3 = this.imagePadding;
        imageReceiver.setImageCoords(width + i3, i3, this.width - (i3 * 2), this.photoHeight - i3);
        imageReceiver.draw(canvas);
        Theme.chat_msgTextPaint.setColor(Theme.getColor(Theme.key_chat_messageTextIn, resourcesProvider));
        Theme.chat_msgTextPaint.linkColor = Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider);
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
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout != null) {
            accessibilityNodeInfo.setText(staticLayout.getText());
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), AndroidUtilities.dp(8.0f) + this.height);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
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
                        if (lineLeft > f || lineLeft + this.textLayout.getLineWidth(lineForVertical) < f) {
                            resetPressedLink();
                        } else {
                            Spannable spannable = (Spannable) this.textLayout.getText();
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length != 0) {
                                resetPressedLink();
                                this.pressedLink = new LinkSpanDrawable(clickableSpanArr[0], this.resourcesProvider, f, i2);
                                try {
                                    try {
                                        int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                                        LinkPath linkPathObtainNewPath = this.pressedLink.obtainNewPath();
                                        linkPathObtainNewPath.setCurrentLayout(this.textLayout, spanStart, 0.0f, 0.0f);
                                        this.textLayout.getSelectionPath(spanStart, spannable.getSpanEnd(clickableSpanArr[0]), linkPathObtainNewPath);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    this.links.addLink(this.pressedLink, null);
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
                        }
                    } catch (Exception e3) {
                        e = e3;
                        z = false;
                    }
                } else {
                    LinkSpanDrawable linkSpanDrawable = this.pressedLink;
                    if (linkSpanDrawable != null) {
                        try {
                            ClickableSpan clickableSpan = (ClickableSpan) linkSpanDrawable.mSpan;
                            if (clickableSpan instanceof URLSpanNoUnderline) {
                                String url = ((URLSpanNoUnderline) clickableSpan).getURL();
                                if (url.startsWith("@") || url.startsWith("#") || url.startsWith("/") || url.startsWith("$")) {
                                    BotHelpCellDelegate botHelpCellDelegate = this.delegate;
                                    if (botHelpCellDelegate != null) {
                                        ((ChatActivity$$ExternalSyntheticLambda356) botHelpCellDelegate).didPressUrl(url);
                                    }
                                }
                            } else if (clickableSpan instanceof URLSpan) {
                                BotHelpCellDelegate botHelpCellDelegate2 = this.delegate;
                                if (botHelpCellDelegate2 != null) {
                                    ((ChatActivity$$ExternalSyntheticLambda356) botHelpCellDelegate2).didPressUrl(((URLSpan) clickableSpan).getURL());
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
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
        if (rippleDrawableSafe != null) {
            if (!z && y > 0.0f && motionEvent.getAction() == 0 && isClickable()) {
                rippleDrawableSafe.setState(new int[]{16842919, 16842910});
                rippleDrawableSafe.setHotspot(motionEvent.getX(), motionEvent.getY());
                invalidate();
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                rippleDrawableSafe.setState(new int[0]);
                invalidate();
                if (!z && motionEvent.getAction() == 1) {
                    performClick();
                }
            }
            z = true;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public final void resetPressedLink() {
        if (this.pressedLink != null) {
            this.pressedLink = null;
        }
        this.links.clear(true);
        invalidate();
    }

    public void setAnimating(boolean z) {
        this.animating = z;
    }

    public void setDelegate(BotHelpCellDelegate botHelpCellDelegate) {
        this.delegate = botHelpCellDelegate;
    }

    public final void setText(boolean z, long j, String str, TLObject tLObject, TL_bots.BotInfo botInfo, String str2) {
        char c;
        float f;
        float f2;
        int iDp;
        int iDp2;
        int iMin;
        int i;
        int iDp3;
        String[] strArrSplit;
        SpannableStringBuilder spannableStringBuilder;
        String string;
        int i2;
        boolean z2;
        int iDp4;
        int i3;
        int lineCount;
        boolean z3 = tLObject != null;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if ((str == null || str.length() == 0) && TextUtils.isEmpty(str2) && !z3) {
            setVisibility(8);
            return;
        }
        String str3 = str == null ? "" : str;
        if (str3.equals(this.oldText) && TextUtils.equals(this.oldManagerBotName, str2) && this.isPhotoVisible == z3) {
            return;
        }
        boolean z4 = TextUtils.isEmpty(str3) && tLObject == null && !TextUtils.isEmpty(str2) && j != 0;
        boolean z5 = z3 || z4;
        this.isPhotoVisible = z5;
        this.isTextVisible = !zIsEmpty || z4;
        ImageReceiver imageReceiver = this.imageReceiver;
        if (!z4) {
            if (z5) {
                String keyForParentObject = FileRefController.getKeyForParentObject(botInfo);
                if (!Objects.equals(this.currentPhotoKey, keyForParentObject)) {
                    this.currentPhotoKey = keyForParentObject;
                    if (tLObject instanceof TLRPC.TL_photo) {
                        TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                        imageReceiver.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 400), photo), "400_400", null, "jpg", botInfo, 0);
                    } else {
                        if (tLObject instanceof TLRPC.Document) {
                            TLRPC.Document document = (TLRPC.Document) tLObject;
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 400);
                            BitmapDrawable bitmapDrawable = null;
                            if (SharedConfig.getDevicePerformanceClass() != 0) {
                                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                                int size = arrayList.size();
                                int i4 = 0;
                                c = 1;
                                while (i4 < size) {
                                    TLRPC.PhotoSize photoSize = arrayList.get(i4);
                                    i4++;
                                    TLRPC.PhotoSize photoSize2 = photoSize;
                                    if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                        bitmapDrawable = new BitmapDrawable(getResources(), ImageLoader.getStrippedPhotoBitmap(photoSize2.bytes, "b"));
                                    }
                                }
                            } else {
                                c = 1;
                            }
                            f = 2.0f;
                            f2 = 4.0f;
                            imageReceiver.setImage(ImageLocation.getForDocument(document), "g", ImageLocation.getForDocument(MessageObject.getDocumentVideoThumb(document), document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "86_86_b", bitmapDrawable, document.size, "mp4", botInfo, 0);
                        }
                        iDp = AndroidUtilities.dp(SharedConfig.bubbleRadius) - AndroidUtilities.dp(f);
                        iDp2 = AndroidUtilities.dp(f2);
                        if (!this.isTextVisible) {
                            iDp2 = iDp;
                        }
                        imageReceiver.setRoundRadius(iDp, iDp, iDp2, iDp2);
                    }
                    f = 2.0f;
                    c = 1;
                    f2 = 4.0f;
                    iDp = AndroidUtilities.dp(SharedConfig.bubbleRadius) - AndroidUtilities.dp(f);
                    iDp2 = AndroidUtilities.dp(f2);
                    if (!this.isTextVisible) {
                        iDp2 = iDp;
                    }
                    imageReceiver.setRoundRadius(iDp, iDp, iDp2, iDp2);
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
            i = (int) (iMin * 0.7f);
            if (this.isTextVisible) {
                strArrSplit = str3.split("\n");
                spannableStringBuilder = new SpannableStringBuilder();
                if (z4) {
                    int i5 = R.string.ManagedBotChatInfo;
                    Object[] objArr = new Object[2];
                    objArr[0] = DialogObject.getName(this.currentAccount, j);
                    objArr[c] = str2;
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i5, objArr)));
                    z2 = false;
                } else {
                    string = LocaleController.getString(R.string.BotInfoTitle);
                    if (z) {
                        spannableStringBuilder.append((CharSequence) string);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                    }
                    for (i2 = 0; i2 < strArrSplit.length; i2++) {
                        spannableStringBuilder.append((CharSequence) strArrSplit[i2].trim());
                        if (i2 != strArrSplit.length - 1) {
                            spannableStringBuilder.append((CharSequence) "\n");
                        }
                    }
                    z2 = false;
                    MessageObject.addLinks(false, spannableStringBuilder);
                    if (z) {
                        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, string.length(), 33);
                    }
                }
                Emoji.replaceEmoji(spannableStringBuilder, Theme.chat_msgTextPaint.getFontMetricsInt(), z2);
                try {
                    TextPaint textPaint = Theme.chat_msgTextPaint;
                    if (this.isPhotoVisible) {
                        iDp4 = AndroidUtilities.dp(5.0f);
                    } else {
                        iDp4 = 0;
                    }
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, textPaint, i - iDp4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.textLayout = staticLayout;
                    this.width = 0;
                    this.height = staticLayout.getHeight() + AndroidUtilities.dp(22.0f);
                    lineCount = this.textLayout.getLineCount();
                    for (i3 = 0; i3 < lineCount; i3++) {
                        this.width = (int) Math.ceil(Math.max(this.width, this.textLayout.getLineWidth(i3) + this.textLayout.getLineLeft(i3)));
                    }
                    if (this.width <= i || this.isPhotoVisible) {
                        this.width = i;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (this.isPhotoVisible) {
                this.width = i;
            }
            iDp3 = AndroidUtilities.dp(22.0f) + this.width;
            this.width = iDp3;
            if (this.isPhotoVisible) {
                int i6 = this.height;
                int i7 = (int) (((double) iDp3) * 0.5625d);
                this.photoHeight = i7;
                this.height = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(i7, 4.0f, i6);
            }
        }
        if (!Objects.equals(this.currentPhotoKey, "setup")) {
            this.currentPhotoKey = "setup";
            imageReceiver.setImageBitmap(new ClipRoundedDrawable(new BotIntroDrawable(getContext())));
            int iDp5 = AndroidUtilities.dp(SharedConfig.bubbleRadius) - AndroidUtilities.dp(2.0f);
            int iDp6 = AndroidUtilities.dp(4.0f);
            if (!this.isTextVisible) {
                iDp6 = iDp5;
            }
            imageReceiver.setRoundRadius(iDp5, iDp5, iDp6, iDp6);
        }
        c = 1;
        this.oldText = AndroidUtilities.getSafeString(str3);
        this.oldManagerBotName = str2;
        setVisibility(0);
        if (AndroidUtilities.isTablet()) {
            iMin = AndroidUtilities.getMinTabletSide();
        } else {
            Point point2 = AndroidUtilities.displaySize;
            iMin = Math.min(point2.x, point2.y);
        }
        i = (int) (iMin * 0.7f);
        if (this.isTextVisible) {
            strArrSplit = str3.split("\n");
            spannableStringBuilder = new SpannableStringBuilder();
            if (z4) {
                int i8 = R.string.ManagedBotChatInfo;
                Object[] objArr2 = new Object[2];
                objArr2[0] = DialogObject.getName(this.currentAccount, j);
                objArr2[c] = str2;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i8, objArr2)));
                z2 = false;
            } else {
                string = LocaleController.getString(R.string.BotInfoTitle);
                if (z) {
                    spannableStringBuilder.append((CharSequence) string);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                }
                while (i2 < strArrSplit.length) {
                    spannableStringBuilder.append((CharSequence) strArrSplit[i2].trim());
                    if (i2 != strArrSplit.length - 1) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                }
                z2 = false;
                MessageObject.addLinks(false, spannableStringBuilder);
                if (z) {
                    spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, string.length(), 33);
                }
            }
            Emoji.replaceEmoji(spannableStringBuilder, Theme.chat_msgTextPaint.getFontMetricsInt(), z2);
            TextPaint textPaint2 = Theme.chat_msgTextPaint;
            if (this.isPhotoVisible) {
                iDp4 = AndroidUtilities.dp(5.0f);
            } else {
                iDp4 = 0;
            }
            StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder, textPaint2, i - iDp4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.textLayout = staticLayout2;
            this.width = 0;
            this.height = staticLayout2.getHeight() + AndroidUtilities.dp(22.0f);
            lineCount = this.textLayout.getLineCount();
            while (i3 < lineCount) {
                this.width = (int) Math.ceil(Math.max(this.width, this.textLayout.getLineWidth(i3) + this.textLayout.getLineLeft(i3)));
            }
            if (this.width <= i) {
                this.width = i;
            } else {
                this.width = i;
            }
        } else if (this.isPhotoVisible) {
            this.width = i;
        }
        iDp3 = AndroidUtilities.dp(22.0f) + this.width;
        this.width = iDp3;
        if (this.isPhotoVisible) {
            int i9 = this.height;
            int i10 = (int) (((double) iDp3) * 0.5625d);
            this.photoHeight = i10;
            this.height = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(i10, 4.0f, i9);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.selectorDrawable || super.verifyDrawable(drawable);
    }
}
