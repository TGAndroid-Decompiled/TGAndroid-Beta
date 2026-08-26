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
import org.telegram.ui.MultiContactsSelectorBottomSheet;
import org.telegram.ui.SecretVoicePlayer$$ExternalSyntheticLambda1;
import org.telegram.ui.iv.RichTextCell;

public final class MessageContainsEmojiButton extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean checkWidth;
    public final int currentAccount;
    public AnimatedEmojiDrawable emojiDrawable;
    public final Rect emojiDrawableBounds;
    public final String endText;
    public TLRPC.InputStickerSet inputStickerSet;
    public int lastLineHeight;
    public int lastLineMargin;
    public int lastLineTop;
    public CharSequence lastMainTextText;
    public int lastMainTextWidth;
    public SpannableStringBuilder lastSecondPartText;
    public int lastSecondPartTextWidth;
    public int lastWidth;
    public ValueAnimator loadAnimator;
    public float loadT;
    public Rect loadingBoundsFrom;
    public Rect loadingBoundsTo;
    public final LoadingDrawable loadingDrawable;
    public boolean loadingDrawableBoundsSet;
    public final CharSequence mainText;
    public StaticLayout mainTextLayout;
    public SpannableStringBuilder secondPartText;
    public StaticLayout secondPartTextLayout;
    public final TextPaint textPaint;

    public MessageContainsEmojiButton(int i, Context context, Theme.ResourcesProvider resourcesProvider, ArrayList arrayList, int i2) {
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
        setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 0, 16));
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider));
        if (arrayList.size() > 1) {
            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(i2 == 0 ? LocaleController.formatPluralString("MessageContainsEmojiPacks", arrayList.size(), new Object[0]) : LocaleController.formatPluralString("MessageContainsReactionsPacks", arrayList.size(), new Object[0]));
            this.mainText = spannableStringBuilderReplaceTags;
            TypefaceSpan[] typefaceSpanArr = (TypefaceSpan[]) spannableStringBuilderReplaceTags.getSpans(0, spannableStringBuilderReplaceTags.length(), TypefaceSpan.class);
            for (int i3 = 0; typefaceSpanArr != null && i3 < typefaceSpanArr.length; i3++) {
                int spanStart = spannableStringBuilderReplaceTags.getSpanStart(typefaceSpanArr[i3]);
                int spanEnd = spannableStringBuilderReplaceTags.getSpanEnd(typefaceSpanArr[i3]);
                spannableStringBuilderReplaceTags.removeSpan(typefaceSpanArr[i3]);
                spannableStringBuilderReplaceTags.setSpan(new RichTextCell.CollapsedTextPart(this, 1), spanStart, spanEnd, 33);
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
        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(0);
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
            LoadingDrawable loadingDrawable = new LoadingDrawable();
            loadingDrawable.resourcesProvider = resourcesProvider;
            this.loadingDrawable = loadingDrawable;
            loadingDrawable.colorKey1 = Theme.key_actionBarDefaultSubmenuBackground;
            loadingDrawable.colorKey2 = Theme.key_listSelector;
            loadingDrawable.setRadii(AndroidUtilities.dp(4.0f));
            return;
        }
        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
        spannableString.setSpan(new AnimatedEmojiSpan(document, this.textPaint.getFontMetricsInt()) {
            {
                super(document.id, 1.2f, fontMetricsInt);
                this.document = document;
            }

            @Override
            public final void draw(Canvas canvas, CharSequence charSequence, int i5, int i6, float f, int i7, int i8, int i9, Paint paint) {
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
        spannableString2.setSpan(new RichTextCell.CollapsedTextPart(this, 1), 0, spannableString2.length(), 33);
        this.mainText = new SpannableStringBuilder().append((CharSequence) strArrSplit[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) strArrSplit[1]);
        this.loadT = 1.0f;
        this.inputStickerSet = null;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        int i3 = 1;
        if (i != NotificationCenter.groupStickersDidLoad || this.inputStickerSet == null) {
            return;
        }
        int i4 = this.currentAccount;
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i4).getStickerSet(this.inputStickerSet, false);
        if (stickerSet == null) {
            return;
        }
        TLRPC.StickerSet stickerSet2 = stickerSet.set;
        if (stickerSet2 != null) {
            str = stickerSet2.title;
            int i5 = 0;
            while (true) {
                ArrayList<TLRPC.Document> arrayList2 = stickerSet.documents;
                if (arrayList2 == null || i5 >= arrayList2.size()) {
                    document = null;
                    break;
                } else {
                    if (stickerSet.documents.get(i5).id == stickerSet.set.thumb_document_id) {
                        document = stickerSet.documents.get(i5);
                        break;
                    }
                    i5++;
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
        AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(i4, 0, document);
        this.emojiDrawable = animatedEmojiDrawableMake;
        animatedEmojiDrawableMake.addView(this);
        invalidate();
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(new MultiContactsSelectorBottomSheet.AnonymousClass2(this, i3), 0, 1, 33);
        SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
        spannableString2.setSpan(new AnimatedEmojiSpan(document, this.textPaint.getFontMetricsInt()) {
            {
                super(document.id, 1.2f, fontMetricsInt);
                this.document = document;
            }

            @Override
            public final void draw(Canvas canvas, CharSequence charSequence, int i6, int i7, float f, int i8, int i9, int i10, Paint paint) {
                MessageContainsEmojiButton messageContainsEmojiButton = MessageContainsEmojiButton.this;
                int i11 = messageContainsEmojiButton.lastLineTop;
                int i12 = i10 + i8;
                int i13 = this.measuredSize;
                messageContainsEmojiButton.emojiDrawableBounds.set((int) f, RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(i12, i13, 2, i11), (int) (f + i13), ((i12 + i13) / 2) + i11);
            }
        }, 0, spannableString2.length(), 33);
        SpannableString spannableString3 = new SpannableString(str);
        spannableString3.setSpan(new RichTextCell.CollapsedTextPart(this, 1), 0, spannableString3.length(), 33);
        this.secondPartText = new SpannableStringBuilder().append((CharSequence) spannableString).append((CharSequence) spannableString2).append(' ').append((CharSequence) spannableString3).append((CharSequence) this.endText);
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
        valueAnimatorOfFloat.addUpdateListener(new SecretVoicePlayer$$ExternalSyntheticLambda1(6, this, z));
        this.loadAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.loadAnimator.setStartDelay(150L);
        this.loadAnimator.setDuration(400L);
        this.loadAnimator.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.addView(this);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.removeView(this);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.mainTextLayout != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.textPaint;
            textPaint.setAlpha(255);
            this.mainTextLayout.draw(canvas);
            LoadingDrawable loadingDrawable = this.loadingDrawable;
            if (loadingDrawable != null && this.loadingDrawableBoundsSet) {
                loadingDrawable.setAlpha((int) ((1.0f - this.loadT) * 255.0f));
                Rect rect2 = this.loadingBoundsFrom;
                if (rect2 != null && (rect = this.loadingBoundsTo) != null) {
                    float f = this.loadT;
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    AndroidUtilities.lerp(rect2, rect, f, rect3);
                    loadingDrawable.setBounds(rect3);
                }
                loadingDrawable.draw(canvas);
                invalidate();
            }
            if (this.secondPartTextLayout != null) {
                canvas.save();
                canvas.translate(0.0f, this.lastLineTop);
                textPaint.setAlpha((int) (this.loadT * 255.0f));
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
    public final void onMeasure(int i, int i2) {
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

    public final int updateLayout(int i, boolean z) {
        int i2;
        float height;
        if (i <= 0) {
            return 0;
        }
        CharSequence charSequence = this.lastMainTextText;
        TextPaint textPaint = this.textPaint;
        CharSequence charSequence2 = this.mainText;
        if (charSequence2 != charSequence || this.lastMainTextWidth != i) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.mainTextLayout = staticLayout;
                LoadingDrawable loadingDrawable = this.loadingDrawable;
                if (loadingDrawable != null && this.loadingBoundsTo == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.lastLineMargin = AndroidUtilities.dp(2.0f) + ((int) this.mainTextLayout.getPrimaryHorizontal(charSequence2.length()));
                    this.lastLineTop = this.mainTextLayout.getLineTop(lineCount);
                    int lineBottom = this.mainTextLayout.getLineBottom(lineCount);
                    this.lastLineHeight = lineBottom - this.lastLineTop;
                    float fMin = Math.min(AndroidUtilities.dp(100.0f), this.mainTextLayout.getWidth() - this.lastLineMargin);
                    if (this.loadingBoundsFrom == null) {
                        this.loadingBoundsFrom = new Rect();
                    }
                    Rect rect = this.loadingBoundsFrom;
                    int i3 = this.lastLineMargin;
                    rect.set(i3, this.lastLineTop, (int) (i3 + fMin), lineBottom);
                    loadingDrawable.setBounds(this.loadingBoundsFrom);
                    this.loadingDrawableBoundsSet = true;
                }
            } else {
                this.mainTextLayout = null;
                this.loadingDrawableBoundsSet = false;
            }
            this.lastMainTextText = charSequence2;
            this.lastMainTextWidth = i;
        }
        SpannableStringBuilder spannableStringBuilder = this.secondPartText;
        if (spannableStringBuilder != this.lastSecondPartText || this.lastSecondPartTextWidth != i) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.secondPartText;
                i2 = i;
                this.secondPartTextLayout = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i2 = i;
                this.secondPartTextLayout = null;
            }
            this.lastSecondPartText = this.secondPartText;
            this.lastSecondPartTextWidth = i2;
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
}
