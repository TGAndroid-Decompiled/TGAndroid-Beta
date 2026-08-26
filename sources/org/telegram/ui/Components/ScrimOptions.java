package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda112;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda14;

public final class ScrimOptions extends Dialog {
    public static final int $r8$clinit = 0;
    public Bitmap blurBitmap;
    public Paint blurBitmapPaint;
    public BitmapShader blurBitmapShader;
    public Matrix blurMatrix;
    public final SizeNotifierFrameLayout containerView;
    public final Context context;
    public boolean dismissing;
    public final BlurredBackgroundDrawableViewFactory iBlur3Factory;
    public final BlurredBackgroundSourceBitmap iBlur3SourceBitmap;
    public ValueAnimator openAnimator;
    public float openProgress;
    public ItemOptions options;
    public boolean optionsAtCenter;
    public FrameLayout optionsContainer;
    public ViewGroup optionsView;
    public final Theme.ResourcesProvider resourcesProvider;
    public Drawable scrimDrawable;
    public BlurredBackgroundDrawable scrimDrawableBackground;
    public float scrimDrawableSh;
    public float scrimDrawableSw;
    public float scrimDrawableTx1;
    public float scrimDrawableTx2;
    public float scrimDrawableTy2;
    public final ChatActivity.AnonymousClass60 windowView;

    public ScrimOptions(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, R.style.TransparentDialog);
        this.scrimDrawableSw = 1.0f;
        this.scrimDrawableSh = 1.0f;
        this.dismissing = false;
        this.context = context;
        this.resourcesProvider = resourcesProvider;
        int i = 23;
        ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(this, context, i);
        this.windowView = anonymousClass60;
        anonymousClass60.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, i));
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context, null);
        this.containerView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setClipToPadding(false);
        anonymousClass60.addView(sizeNotifierFrameLayout, LayoutHelper.createFrame(-1, -1, 119));
        BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = new BlurredBackgroundSourceBitmap();
        this.iBlur3SourceBitmap = blurredBackgroundSourceBitmap;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceBitmap);
        this.iBlur3Factory = blurredBackgroundDrawableViewFactory;
        blurredBackgroundDrawableViewFactory.viewPositionWatcher = new ViewPositionWatcher(anonymousClass60);
        blurredBackgroundDrawableViewFactory.parent = anonymousClass60;
        PhotoViewer.AnonymousClass18 anonymousClass18 = new PhotoViewer.AnonymousClass18(this, 17);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(anonymousClass60, anonymousClass18);
    }

    public static void makeGlobalBlurBitmaps(Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new PollItemMenu$$ExternalSyntheticLambda14(callback2, 4), 15.0f);
    }

    public final void animateOpenTo(Runnable runnable, boolean z) {
        ValueAnimator valueAnimator = this.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
        this.openAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 0));
        this.openAnimator.addListener(new ChatActivity.AnonymousClass63(this, z, runnable, 6));
        this.openAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.openAnimator.setDuration(350L);
        this.openAnimator.start();
    }

    @Override
    public final void dismiss() {
        if (this.dismissing) {
            return;
        }
        this.dismissing = true;
        animateOpenTo(new ChatActivity$$ExternalSyntheticLambda112(this, 3), false);
        this.windowView.invalidate();
    }

    @Override
    public final boolean isShowing() {
        return !this.dismissing;
    }

    public final void lambda$dismiss$1() {
        super.dismiss();
    }

    public final void lambda$dismissFast$3() {
        super.dismiss();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ChatActivity.AnonymousClass60 anonymousClass60 = this.windowView;
        setContentView(anonymousClass60, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        anonymousClass60.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(anonymousClass60, !Theme.currentTheme.isDark());
    }

    public final void setItemOptions(ItemOptions itemOptions) {
        int i = Theme.key_actionBarDefaultSubmenuItem;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        itemOptions.setGapBackgroundColor(Theme.multAlpha(0.06f, Theme.getColor(i, resourcesProvider)));
        itemOptions.setBlurBackground(this.iBlur3Factory, BlurredBackgroundProviderImpl.scrimMenuBackground(resourcesProvider), false);
        this.options = itemOptions;
        this.optionsView = itemOptions.layout;
        FrameLayout frameLayout = new FrameLayout(this.context);
        this.optionsContainer = frameLayout;
        frameLayout.addView(this.optionsView, LayoutHelper.createFrame(-2.0f, -2));
        this.containerView.addView(this.optionsContainer, LayoutHelper.createFrame(-2.0f, -2));
    }

    public final void setScrim(final ChatMessageCell chatMessageCell, CharacterStyle characterStyle, SpannableString spannableString, boolean z) {
        float captionX;
        float captionY;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        float f;
        boolean z2;
        float textX;
        float textY;
        int spanStart;
        int width;
        int spanEnd;
        ?? r14;
        float f2;
        RectF rectF;
        ?? r15;
        Bitmap bitmap;
        ?? r31;
        int i;
        RichMessageLayout richMessageLayout;
        RichMessageLayout.FoundLink foundLinkFindLink;
        ArrayList<ChatMessageCell.PollButton> pollButtons;
        int i2;
        float f3;
        float f4;
        int i3;
        if (chatMessageCell == null) {
            return;
        }
        chatMessageCell.getCurrentMessagesGroup();
        MessageObject messageObject = chatMessageCell.getMessageObject();
        int i4 = 0;
        boolean z3 = chatMessageCell.getExplanationLayout() != null && messageObject.expandedExplanation;
        if (z3 && z) {
            captionX = chatMessageCell.getExplanationX();
            captionY = chatMessageCell.getExplanationY();
            arrayList = chatMessageCell.getExplanationLayout().textLayoutBlocks;
            f = chatMessageCell.getExplanationLayout().textXOffset;
        } else if (chatMessageCell.getCaptionLayout() != null) {
            captionX = chatMessageCell.getCaptionX();
            captionY = chatMessageCell.getCaptionY();
            arrayList = chatMessageCell.getCaptionLayout().textLayoutBlocks;
            f = chatMessageCell.getCaptionLayout().textXOffset;
        } else {
            captionX = 0.0f;
            captionY = 0.0f;
            arrayList = null;
            f = 0.0f;
        }
        if (arrayList == null) {
            captionX = chatMessageCell.getTextX();
            captionY = chatMessageCell.getTextY() + chatMessageCell.transitionYOffsetForDrawables;
            arrayList = messageObject.textLayoutBlocks;
            f = messageObject.textXOffset;
        }
        if (arrayList == null) {
            z2 = z3;
            textX = captionX;
            textY = captionY;
            spanStart = 0;
            width = 0;
            spanEnd = 0;
            r14 = 0;
            break;
        }
        int i5 = 0;
        loop0: while (true) {
            if (i5 >= arrayList.size()) {
                z2 = z3;
                textX = captionX;
                textY = captionY;
                spanStart = 0;
                width = 0;
                spanEnd = 0;
                r14 = 0;
                break;
            }
            MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i5);
            StaticLayout staticLayout = textLayoutBlock.textLayout;
            if (staticLayout != null && (staticLayout.getText() instanceof Spanned)) {
                z2 = z3;
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) staticLayout.getText()).getSpans(i4, staticLayout.getText().length(), CharacterStyle.class);
                if (characterStyleArr != null) {
                    for (CharacterStyle characterStyle2 : characterStyleArr) {
                        if (characterStyle2 == characterStyle) {
                            spanStart = ((Spanned) staticLayout.getText()).getSpanStart(characterStyle);
                            spanEnd = ((Spanned) staticLayout.getText()).getSpanEnd(characterStyle);
                            float f5 = captionY;
                            textX = captionX + (textLayoutBlock.isRtl() ? (int) Math.ceil(f) : 0);
                            textY = textLayoutBlock.textYOffset(arrayList, chatMessageCell.transitionParams) + textLayoutBlock.padTop + f5;
                            width = textLayoutBlock.originalWidth;
                            r14 = staticLayout;
                            break loop0;
                        }
                    }
                }
            } else {
                z2 = z3;
            }
            i5++;
            z3 = z2;
            captionX = captionX;
            captionY = captionY;
            i4 = 0;
        }
        if (r14 == 0 && chatMessageCell.getDescriptionlayout() != null) {
            StaticLayout descriptionlayout = chatMessageCell.getDescriptionlayout();
            int i6 = 0;
            while (i6 == 0) {
                if (descriptionlayout != null && (descriptionlayout.getText() instanceof Spanned)) {
                    i3 = spanStart;
                    CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) ((Spanned) descriptionlayout.getText()).getSpans(0, descriptionlayout.getText().length(), CharacterStyle.class);
                    if (characterStyleArr2 != null) {
                        int i7 = 0;
                        while (true) {
                            if (i7 < characterStyleArr2.length) {
                                if (characterStyleArr2[i7] == characterStyle) {
                                    spanStart = ((Spanned) descriptionlayout.getText()).getSpanStart(characterStyle);
                                    spanEnd = ((Spanned) descriptionlayout.getText()).getSpanEnd(characterStyle);
                                    textX = chatMessageCell.getDescriptionLayoutX();
                                    textY = chatMessageCell.getDescriptionLayoutY();
                                    width = descriptionlayout.getWidth();
                                    r14 = descriptionlayout;
                                    break;
                                }
                                i7++;
                            }
                        }
                    }
                    i6++;
                    r14 = r14;
                } else {
                    i3 = spanStart;
                }
                spanStart = i3;
                i6++;
                r14 = r14;
            }
            r14 = r14;
        }
        if (r14 == 0 && ((messageObject.isTodo() || messageObject.isPoll()) && (pollButtons = chatMessageCell.getPollButtons()) != null)) {
            int i8 = 0;
            r14 = r14;
            while (i8 < pollButtons.size()) {
                ChatMessageCell.PollButton pollButton = pollButtons.get(i8);
                StaticLayout staticLayout2 = pollButton.title;
                if (staticLayout2 == null) {
                    i2 = spanStart;
                } else {
                    i2 = spanStart;
                    if (staticLayout2.getText() instanceof Spanned) {
                        f3 = textX;
                        f4 = textY;
                        CharacterStyle[] characterStyleArr3 = (CharacterStyle[]) ((Spanned) staticLayout2.getText()).getSpans(0, staticLayout2.getText().length(), CharacterStyle.class);
                        if (characterStyleArr3 != null) {
                            int i9 = 0;
                            while (true) {
                                if (i9 < characterStyleArr3.length) {
                                    if (characterStyleArr3[i9] == characterStyle) {
                                        spanStart = ((Spanned) staticLayout2.getText()).getSpanStart(characterStyle);
                                        spanEnd = ((Spanned) staticLayout2.getText()).getSpanEnd(characterStyle);
                                        textX = pollButton.titleX;
                                        textY = pollButton.titleY;
                                        width = staticLayout2.getWidth();
                                        r14 = staticLayout2;
                                        break;
                                    }
                                    i9++;
                                }
                            }
                        }
                        i8++;
                        r14 = r14;
                    }
                    spanStart = i2;
                    textY = f4;
                    textX = f3;
                    i8++;
                    r14 = r14;
                }
                f3 = textX;
                f4 = textY;
                spanStart = i2;
                textY = f4;
                textX = f3;
                i8++;
                r14 = r14;
            }
        }
        if (r14 == 0 && messageObject != null && (richMessageLayout = messageObject.richLayout) != null && (foundLinkFindLink = richMessageLayout.findLink(characterStyle)) != null) {
            r14 = foundLinkFindLink.layout;
            spanStart = foundLinkFindLink.start;
            spanEnd = foundLinkFindLink.end;
            width = foundLinkFindLink.originalWidth;
            textX = chatMessageCell.getTextX() + foundLinkFindLink.x;
            textY = chatMessageCell.getTextY() + foundLinkFindLink.y;
        }
        int i10 = width;
        int i11 = spanStart;
        float fMax = textX;
        int length = spanEnd;
        if (r14 == 0 && z2 && !z) {
            setScrim(chatMessageCell, characterStyle, spannableString, true);
            return;
        }
        if (r14 == 0) {
            return;
        }
        if (spannableString != null) {
            int lineForOffset = r14.getLineForOffset(i11);
            float lineTop = textY + r14.getLineTop(lineForOffset);
            float primaryHorizontal = r14.getPrimaryHorizontal(i11);
            float lineWidth = r14.getLineWidth(lineForOffset);
            ?? linkPath = new LinkPath(0);
            linkPath.setCurrentLayout(r14, i11, 0.0f, 0.0f);
            r14.getSelectionPath(i11, length, linkPath);
            RectF rectF2 = new RectF();
            linkPath.computeBounds(rectF2, true);
            StaticLayout staticLayoutMakeStaticLayout = MessageObject.makeStaticLayout(spannableString, r14.getPaint(), r14.getWidth(), 1.0f, 0.0f, false);
            length = spannableString.length();
            float width2 = staticLayoutMakeStaticLayout.getWidth();
            float fMax2 = 0.0f;
            for (int i12 = 0; i12 < staticLayoutMakeStaticLayout.getLineCount(); i12++) {
                width2 = Math.min(width2, staticLayoutMakeStaticLayout.getLineLeft(i12));
                fMax2 = Math.max(fMax2, staticLayoutMakeStaticLayout.getLineRight(i12));
            }
            fMax += Math.max(0.0f, Math.min(primaryHorizontal, lineWidth - Math.max(0.0f, fMax2 - width2)));
            rectF = rectF2;
            i11 = 0;
            f2 = lineTop;
            r15 = staticLayoutMakeStaticLayout;
        } else {
            f2 = textY;
            rectF = null;
            r15 = r14;
        }
        ?? r1 = r15;
        float f6 = fMax;
        Paint paint = new Paint(1);
        paint.setColor(Theme.getColor(messageObject.isOutOwner() ? Theme.key_chat_outBubble : Theme.key_chat_inBubble, this.resourcesProvider));
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(5.0f)));
        final ?? linkPath2 = new LinkPath(0);
        linkPath2.useCornerPathImplementation = true;
        linkPath2.setCurrentLayout(r1, i11, 0.0f, 0.0f);
        r1.getSelectionPath(i11, length, linkPath2);
        linkPath2.closeRects();
        final RectF rectF3 = new RectF();
        linkPath2.computeBounds(rectF3, true);
        int iWidth = (int) (rectF3.width() + AndroidUtilities.dp(5.0f));
        if (!chatMessageCell.drawBackgroundInParent() || iWidth <= 0 || rectF3.height() <= 0.0f) {
            bitmap = null;
            r31 = r1;
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, (int) rectF3.height(), Bitmap.Config.ALPHA_8);
            ?? canvas = new Canvas(bitmapCreateBitmap);
            r31 = r1;
            paint = paint;
            Paint paint2 = new Paint(1);
            paint2.setColor(-1);
            canvas.drawRect(0.0f, 0.0f, iWidth, rectF3.height(), paint2);
            Paint paint3 = new Paint(1);
            paint3.setColor(-1);
            paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(5.0f)));
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.translate(-rectF3.left, -rectF3.top);
            canvas.drawPath(linkPath2, paint3);
            bitmap = bitmapCreateBitmap;
        }
        final Paint paint4 = new Paint(3);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        chatMessageCell.setupTextColors();
        TextPaint textPaint = new TextPaint(r31.getPaint());
        textPaint.set(r31.getPaint());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AnimatedEmojiSpan.cloneSpans(r31.getText(), -1, textPaint.getFontMetricsInt()));
        if (i11 > 0) {
            i = 0;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(0), 0, i11, 33);
        } else {
            i = 0;
        }
        if (length < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 33);
        }
        final StaticLayout staticLayoutMakeStaticLayout2 = MessageObject.makeStaticLayout(spannableStringBuilder, textPaint, i10, 1.0f, messageObject.totalAnimatedEmojiCount >= 4 ? -1.0f : 0.0f, false);
        final int[] iArr = new int[2];
        chatMessageCell.getLocationOnScreen(iArr);
        final int[] iArr2 = {iArr[0] + ((int) f6), iArr[1] + ((int) f2)};
        final Paint paint5 = paint;
        final Bitmap bitmap2 = bitmap;
        this.scrimDrawable = new Drawable() {
            public int alpha = 255;

            @Override
            public final void draw(Canvas canvas2) {
                if (this.alpha <= 0) {
                    return;
                }
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(getBounds());
                float f7 = rectF4.left;
                CornerPathEffect cornerPathEffect = LinkPath.roundedEffect;
                rectF4.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
                canvas2.save();
                canvas2.saveLayerAlpha(rectF4, this.alpha, 31);
                int[] iArr3 = iArr2;
                canvas2.translate(iArr3[0], iArr3[1]);
                LinkPath linkPath3 = linkPath2;
                ChatMessageCell chatMessageCell2 = chatMessageCell;
                if (chatMessageCell2 == null || !chatMessageCell2.drawBackgroundInParent()) {
                    canvas2.drawPath(linkPath3, paint5);
                } else {
                    MessageDrawable messageDrawable = chatMessageCell2.currentBackgroundDrawable;
                    if (messageDrawable == null || messageDrawable.paint == null) {
                        canvas2.translate(-iArr3[0], -iArr3[1]);
                        int[] iArr4 = iArr;
                        canvas2.translate(iArr4[0], chatMessageCell2.getPaddingTop() + iArr4[1]);
                        chatMessageCell2.drawBackgroundInternal(canvas2, true, false);
                        canvas2.translate(-iArr4[0], (-iArr4[1]) - chatMessageCell2.getPaddingTop());
                        canvas2.translate(iArr3[0], iArr3[1]);
                    } else {
                        canvas2.save();
                        chatMessageCell2.setBackgroundTopY(true);
                        canvas2.translate(0.0f, -chatMessageCell2.currentBackgroundDrawable.topY);
                        canvas2.drawPaint(chatMessageCell2.currentBackgroundDrawable.paint);
                        canvas2.restore();
                    }
                    Bitmap bitmap3 = bitmap2;
                    if (bitmap3 != null) {
                        canvas2.save();
                        RectF rectF5 = rectF3;
                        canvas2.drawBitmap(bitmap3, rectF5.left, rectF5.top, paint4);
                        canvas2.restore();
                    }
                }
                canvas2.clipPath(linkPath3);
                staticLayoutMakeStaticLayout2.draw(canvas2);
                canvas2.restore();
            }

            @Override
            public final int getOpacity() {
                return -2;
            }

            @Override
            public final void setAlpha(int i13) {
                this.alpha = i13;
            }

            @Override
            public final void setColorFilter(ColorFilter colorFilter) {
            }
        };
        int iDp = (int) ((AndroidUtilities.dp(5.0f) / 2.0f) + iArr[0] + f6 + rectF3.left);
        int i13 = (int) (iArr[1] + f2 + rectF3.top);
        this.scrimDrawable.setBounds(iDp, i13, ((int) rectF3.width()) + iDp, ((int) rectF3.height()) + i13);
        if (spannableString != null) {
            float f7 = iDp;
            if (rectF3.width() + f7 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(8.0f)) {
                this.scrimDrawableTx2 -= (rectF3.width() + f7) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(8.0f));
            }
            float f8 = i13;
            if (rectF3.height() + f8 > ((AndroidUtilities.displaySize.y - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f)) {
                this.scrimDrawableTy2 -= (rectF3.height() + f8) - (((AndroidUtilities.displaySize.y - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f));
            }
            if (rectF != null) {
                this.scrimDrawableSw = rectF.width() / rectF3.width();
                this.scrimDrawableSh = rectF.height() / rectF3.height();
            }
        }
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            makeGlobalBlurBitmaps(new GiftSheet$$ExternalSyntheticLambda8(this, 8));
            animateOpenTo(null, true);
        }
    }
}
