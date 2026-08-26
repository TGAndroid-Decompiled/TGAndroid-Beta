package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$MediaCell$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public class MessageContainsEmojiButton extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int EMOJI_STICKER_TYPE = 2;
    public static final int EMOJI_TYPE = 0;
    public static final int REACTIONS_TYPE = 1;
    public static final int SINGLE_REACTION_TYPE = 3;
    public static final int STICKERS_BOT_TYPE = 4;
    public boolean checkWidth;
    private int currentAccount;
    private AnimatedEmojiDrawable emojiDrawable;
    private Rect emojiDrawableBounds;
    private CharSequence endText;
    private TLRPC.InputStickerSet inputStickerSet;
    private int lastLineHeight;
    private int lastLineMargin;
    private int lastLineTop;
    private CharSequence lastMainTextText;
    private int lastMainTextWidth;
    private CharSequence lastSecondPartText;
    private int lastSecondPartTextWidth;
    private int lastWidth;
    private ValueAnimator loadAnimator;
    private float loadT;
    private Rect loadingBoundsFrom;
    private Rect loadingBoundsTo;
    private LoadingDrawable loadingDrawable;
    private boolean loadingDrawableBoundsSet;
    private CharSequence mainText;
    private StaticLayout mainTextLayout;
    private Theme.ResourcesProvider resourcesProvider;
    private CharSequence secondPartText;
    private StaticLayout secondPartTextLayout;
    private TextPaint textPaint;
    int type;

    public class BoldAndAccent extends CharacterStyle {
        private BoldAndAccent() {
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setTypeface(AndroidUtilities.bold());
            int alpha = textPaint.getAlpha();
            textPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, MessageContainsEmojiButton.this.resourcesProvider));
            textPaint.setAlpha(alpha);
        }
    }

    public MessageContainsEmojiButton(int i, Context context, Theme.ResourcesProvider resourcesProvider, ArrayList<TLRPC.InputStickerSet> arrayList, int i2) {
        String str;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        ArrayList<TLRPC.Document> arrayList2;
        super(context);
        this.emojiDrawableBounds = new Rect();
        this.loadingDrawableBoundsSet = false;
        this.lastWidth = -1;
        this.checkWidth = true;
        this.loadT = 0.0f;
        this.currentAccount = i;
        this.type = i2;
        setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 0, 16));
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.textPaint.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider));
        if (arrayList.size() > 1) {
            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(i2 == 0 ? LocaleController.formatPluralString("MessageContainsEmojiPacks", arrayList.size(), new Object[0]) : LocaleController.formatPluralString("MessageContainsReactionsPacks", arrayList.size(), new Object[0]));
            this.mainText = spannableStringBuilderReplaceTags;
            TypefaceSpan[] typefaceSpanArr = (TypefaceSpan[]) spannableStringBuilderReplaceTags.getSpans(0, spannableStringBuilderReplaceTags.length(), TypefaceSpan.class);
            for (int i3 = 0; typefaceSpanArr != null && i3 < typefaceSpanArr.length; i3++) {
                int spanStart = spannableStringBuilderReplaceTags.getSpanStart(typefaceSpanArr[i3]);
                int spanEnd = spannableStringBuilderReplaceTags.getSpanEnd(typefaceSpanArr[i3]);
                spannableStringBuilderReplaceTags.removeSpan(typefaceSpanArr[i3]);
                spannableStringBuilderReplaceTags.setSpan(new BoldAndAccent(), spanStart, spanEnd, 33);
            }
            return;
        }
        if (arrayList.size() != 1) {
            if (i2 == 4) {
                this.mainText = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StickersCheckStickersBotForMoreOptions), Theme.key_chat_messageLinkIn, 2, null, resourcesProvider);
                return;
            }
            return;
        }
        String string = i2 == 0 ? LocaleController.getString(R.string.MessageContainsEmojiPack) : i2 == 3 ? LocaleController.getString(R.string.MessageContainsReactionPack) : LocaleController.getString(R.string.MessageContainsReactionsPack);
        String[] strArrSplit = string.split("%s");
        if (strArrSplit.length <= 1) {
            this.mainText = string;
            return;
        }
        TLRPC.InputStickerSet inputStickerSet = arrayList.get(0);
        this.inputStickerSet = inputStickerSet;
        if (inputStickerSet == null || (stickerSet = MediaDataController.getInstance(i).getStickerSet(this.inputStickerSet, false)) == null || (stickerSet2 = stickerSet.set) == null) {
            str = null;
            document = null;
        } else {
            str = stickerSet2.title;
            int i4 = 0;
            while (true) {
                ArrayList<TLRPC.Document> arrayList3 = stickerSet.documents;
                if (arrayList3 == null || i4 >= arrayList3.size()) {
                    document = null;
                    break;
                } else {
                    if (stickerSet.documents.get(i4).id == stickerSet.set.thumb_document_id) {
                        document = stickerSet.documents.get(i4);
                        break;
                    }
                    i4++;
                }
            }
            if (document == null && (arrayList2 = stickerSet.documents) != null && arrayList2.size() > 0) {
                document = stickerSet.documents.get(0);
            }
        }
        if (str == null || document == null) {
            this.mainText = strArrSplit[0];
            this.endText = strArrSplit[1];
            LoadingDrawable loadingDrawable = new LoadingDrawable(resourcesProvider);
            this.loadingDrawable = loadingDrawable;
            loadingDrawable.colorKey1 = Theme.key_actionBarDefaultSubmenuBackground;
            loadingDrawable.colorKey2 = Theme.key_listSelector;
            loadingDrawable.setRadiiDp(4.0f);
            return;
        }
        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
        spannableString.setSpan(new AnimatedEmojiSpan(document, this.textPaint.getFontMetricsInt()) {
            @Override
            public void draw(Canvas canvas, CharSequence charSequence, int i5, int i6, float f, int i7, int i8, int i9, Paint paint) {
                int i10 = i9 + i7;
                int i11 = this.measuredSize;
                MessageContainsEmojiButton.this.emojiDrawableBounds.set((int) f, (i10 - i11) / 2, (int) (f + i11), (i10 + i11) / 2);
            }
        }, 0, spannableString.length(), 33);
        AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(i, 0, document);
        this.emojiDrawable = animatedEmojiDrawableMake;
        animatedEmojiDrawableMake.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider), PorterDuff.Mode.SRC_IN));
        this.emojiDrawable.addView(this);
        SpannableString spannableString2 = new SpannableString(str);
        spannableString2.setSpan(new BoldAndAccent(), 0, spannableString2.length(), 33);
        this.mainText = new SpannableStringBuilder().append((CharSequence) strArrSplit[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) strArrSplit[1]);
        this.loadT = 1.0f;
        this.inputStickerSet = null;
    }

    public void lambda$didReceivedNotification$0(boolean z, ValueAnimator valueAnimator) {
        this.loadT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
        if (z) {
            requestLayout();
        }
    }

    private int updateLayout(int i, boolean z) {
        float height;
        if (i <= 0) {
            return 0;
        }
        CharSequence charSequence = this.mainText;
        if (charSequence != this.lastMainTextText || this.lastMainTextWidth != i) {
            if (charSequence != null) {
                CharSequence charSequence2 = this.mainText;
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), this.textPaint, Math.max(i, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.mainTextLayout = staticLayout;
                if (this.loadingDrawable != null && this.loadingBoundsTo == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.lastLineMargin = AndroidUtilities.dp(2.0f) + ((int) this.mainTextLayout.getPrimaryHorizontal(this.mainText.length()));
                    this.lastLineTop = this.mainTextLayout.getLineTop(lineCount);
                    int lineBottom = this.mainTextLayout.getLineBottom(lineCount);
                    this.lastLineHeight = lineBottom - this.lastLineTop;
                    float fMin = Math.min(AndroidUtilities.dp(100.0f), this.mainTextLayout.getWidth() - this.lastLineMargin);
                    if (this.loadingBoundsFrom == null) {
                        this.loadingBoundsFrom = new Rect();
                    }
                    Rect rect = this.loadingBoundsFrom;
                    int i2 = this.lastLineMargin;
                    rect.set(i2, this.lastLineTop, (int) (i2 + fMin), lineBottom);
                    this.loadingDrawable.setBounds(this.loadingBoundsFrom);
                    this.loadingDrawableBoundsSet = true;
                }
            } else {
                this.mainTextLayout = null;
                this.loadingDrawableBoundsSet = false;
            }
            this.lastMainTextText = this.mainText;
            this.lastMainTextWidth = i;
        }
        CharSequence charSequence3 = this.secondPartText;
        if (charSequence3 != this.lastSecondPartText || this.lastSecondPartTextWidth != i) {
            if (charSequence3 != null) {
                CharSequence charSequence4 = this.secondPartText;
                this.secondPartTextLayout = new StaticLayout(charSequence4, 0, charSequence4.length(), this.textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                this.secondPartTextLayout = null;
            }
            this.lastSecondPartText = this.secondPartText;
            this.lastSecondPartTextWidth = i;
        }
        StaticLayout staticLayout2 = this.mainTextLayout;
        int height2 = staticLayout2 != null ? staticLayout2.getHeight() : 0;
        StaticLayout staticLayout3 = this.secondPartTextLayout;
        if (staticLayout3 != null) {
            height = (staticLayout3.getHeight() - this.lastLineHeight) * (z ? 1.0f : this.loadT);
        } else {
            height = 0.0f;
        }
        return height2 + ((int) height);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.TL_messages_stickerSet stickerSet;
        String str;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        if (i != NotificationCenter.groupStickersDidLoad || this.inputStickerSet == null || (stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(this.inputStickerSet, false)) == null) {
            return;
        }
        TLRPC.StickerSet stickerSet2 = stickerSet.set;
        if (stickerSet2 != null) {
            str = stickerSet2.title;
            int i3 = 0;
            while (true) {
                ArrayList<TLRPC.Document> arrayList2 = stickerSet.documents;
                if (arrayList2 == null || i3 >= arrayList2.size()) {
                    document = null;
                    break;
                } else {
                    if (stickerSet.documents.get(i3).id == stickerSet.set.thumb_document_id) {
                        document = stickerSet.documents.get(i3);
                        break;
                    }
                    i3++;
                }
            }
            if (document == null && (arrayList = stickerSet.documents) != null && arrayList.size() > 0) {
                document = stickerSet.documents.get(0);
            }
        } else {
            str = null;
            document = null;
        }
        if (str == null || document == null) {
            return;
        }
        AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(this.currentAccount, 0, document);
        this.emojiDrawable = animatedEmojiDrawableMake;
        animatedEmojiDrawableMake.addView(this);
        invalidate();
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(new ReplacementSpan() {
            @Override
            public void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f, int i6, int i7, int i8, Paint paint) {
            }

            @Override
            public int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
                return MessageContainsEmojiButton.this.lastLineMargin;
            }
        }, 0, 1, 33);
        SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
        spannableString2.setSpan(new AnimatedEmojiSpan(document, this.textPaint.getFontMetricsInt()) {
            @Override
            public void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f, int i6, int i7, int i8, Paint paint) {
                int i9 = MessageContainsEmojiButton.this.lastLineTop;
                int i10 = i8 + i6;
                int i11 = this.measuredSize;
                MessageContainsEmojiButton.this.emojiDrawableBounds.set((int) f, RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(i10, i11, 2, i9), (int) (f + i11), ((i10 + this.measuredSize) / 2) + MessageContainsEmojiButton.this.lastLineTop);
            }
        }, 0, spannableString2.length(), 33);
        SpannableString spannableString3 = new SpannableString(str);
        spannableString3.setSpan(new BoldAndAccent(), 0, spannableString3.length(), 33);
        this.secondPartText = new SpannableStringBuilder().append((CharSequence) spannableString).append((CharSequence) spannableString2).append(' ').append((CharSequence) spannableString3).append(this.endText);
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int iUpdateLayout = updateLayout((this.lastWidth - getPaddingLeft()) - getPaddingRight(), true);
        if (this.loadingBoundsFrom != null && this.secondPartTextLayout != null) {
            if (this.loadingBoundsTo == null) {
                this.loadingBoundsTo = new Rect();
            }
            StaticLayout staticLayout = this.secondPartTextLayout;
            float primaryHorizontal = staticLayout.getPrimaryHorizontal(staticLayout.getLineEnd(0));
            Rect rect = this.loadingBoundsTo;
            Rect rect2 = this.loadingBoundsFrom;
            rect.set(rect2.left, rect2.top, (int) primaryHorizontal, rect2.bottom);
        }
        this.inputStickerSet = null;
        ValueAnimator valueAnimator = this.loadAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z = Math.abs(measuredHeight - iUpdateLayout) > AndroidUtilities.dp(3.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.loadT, 1.0f);
        this.loadAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new InstantCameraView$$ExternalSyntheticLambda3(this, z, 3));
        this.loadAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.loadAnimator.setStartDelay(150L);
        this.loadAnimator.setDuration(400L);
        this.loadAnimator.start();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.addView(this);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.removeView(this);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.mainTextLayout != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            this.textPaint.setAlpha(255);
            this.mainTextLayout.draw(canvas);
            LoadingDrawable loadingDrawable = this.loadingDrawable;
            if (loadingDrawable != null && this.loadingDrawableBoundsSet) {
                loadingDrawable.setAlpha((int) ((1.0f - this.loadT) * 255.0f));
                Rect rect2 = this.loadingBoundsFrom;
                if (rect2 != null && (rect = this.loadingBoundsTo) != null) {
                    float f = this.loadT;
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    AndroidUtilities.lerp(rect2, rect, f, rect3);
                    this.loadingDrawable.setBounds(rect3);
                }
                this.loadingDrawable.draw(canvas);
                invalidate();
            }
            if (this.secondPartTextLayout != null) {
                canvas.save();
                canvas.translate(0.0f, this.lastLineTop);
                this.textPaint.setAlpha((int) (this.loadT * 255.0f));
                this.secondPartTextLayout.draw(canvas);
                canvas.restore();
            }
            AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.setAlpha((int) (this.loadT * 255.0f));
                this.emojiDrawable.setBounds(this.emojiDrawableBounds);
                this.emojiDrawable.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3;
        setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        int size = View.MeasureSpec.getSize(i);
        if (this.checkWidth && (i3 = this.lastWidth) > 0) {
            size = Math.min(size, i3);
        }
        this.lastWidth = size;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + updateLayout(paddingLeft, false), 1073741824));
    }
}
