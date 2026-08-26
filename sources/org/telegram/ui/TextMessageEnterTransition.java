package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_vision_label.zzdq;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.ChatReplyContainer$Layout;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GroupCallPip;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ReplyMessageLine;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Stories.PeerStoriesView$40$$ExternalSyntheticLambda1;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public final class TextMessageEnterTransition implements MessageEnterTransitionContainer.Transition {
    public final AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack;
    public final ValueAnimator animator;
    public final boolean changeColor;
    public final ChatActivity chatActivity;
    public final MessageEnterTransitionContainer container;
    public final boolean crossfade;
    public final MessageObject currentMessageObject;
    public final float drawableFromBottom;
    public final float drawableFromTop;
    public final ChatActivity.AnonymousClass39 enterView;
    public final int fromColor;
    public final NinePatchDrawable fromMessageDrawable;
    public final float fromStartX;
    public final float fromStartY;
    public final Matrix gradientMatrix;
    public final Paint gradientPaint;
    public final LinearGradient gradientShader;
    public final boolean hasReply;
    public final StaticLayout layout;
    public final RecyclerListView listView;
    public final float listViewTargetBottomPadding;
    public final int messageId;
    public final RectF messageReplySelectorRect;
    public final ChatMessageCell messageView;
    public final AnimationNotificationsLocker notificationsLocker;
    public float progress;
    public final int replayFromColor;
    public final int replayObjectFromColor;
    public final float replyFromStartWidth;
    public final float replyFromStartX;
    public final float replyFromStartY;
    public final float replyNameDx;
    public final RectF replySelectorRect;
    public final Theme.ResourcesProvider resourcesProvider;
    public float[] roundRectRadii;
    public final StaticLayout rtlLayout;
    public final float scaleFrom;
    public final MessageObject.TextLayoutBlock textLayoutBlock;
    public float textX;
    public float textY;
    public final PointF tmpPointF;
    public final int toColor;
    public final float toXOffset;
    public final float toXOffsetRtl;

    public TextMessageEnterTransition(ChatMessageCell chatMessageCell, ChatActivity chatActivity, RecyclerListView recyclerListView, MessageEnterTransitionContainer messageEnterTransitionContainer, Theme.ResourcesProvider resourcesProvider) {
        float f;
        int lineTop;
        float f2;
        int i;
        int i2;
        MessageDrawable currentBackgroundDrawable;
        int i3;
        Object[] spans;
        Paint paint = new Paint(1);
        this.notificationsLocker = new AnimationNotificationsLocker();
        PointF pointF = new PointF();
        this.tmpPointF = pointF;
        this.replySelectorRect = new RectF();
        this.messageReplySelectorRect = new RectF();
        this.resourcesProvider = resourcesProvider;
        if (chatMessageCell.getMessageObject().textLayoutBlocks == null || chatMessageCell.getMessageObject().textLayoutBlocks.size() > 1 || chatMessageCell.getMessageObject().textLayoutBlocks.isEmpty() || chatMessageCell.getMessageObject().textLayoutBlocks.get(0).textLayout.getLineCount() > 10) {
            return;
        }
        this.messageView = chatMessageCell;
        this.listView = recyclerListView;
        this.container = messageEnterTransitionContainer;
        this.chatActivity = chatActivity;
        ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity.chatActivityEnterView;
        this.enterView = anonymousClass39;
        if (anonymousClass39 == null || anonymousClass39.getEditField() == null || anonymousClass39.getEditField().getLayout() == null) {
            return;
        }
        anonymousClass39.getRecordCircle();
        paint.setFilterBitmap(true);
        this.currentMessageObject = chatMessageCell.getMessageObject();
        if (!chatMessageCell.getTransitionParams().wasDraw) {
            chatMessageCell.draw(new Canvas());
        }
        chatMessageCell.setEnterTransitionInProgress(true);
        Editable editText = anonymousClass39.getEditText();
        CharSequence charSequenceReplaceEmoji = chatMessageCell.getMessageObject().messageText;
        this.crossfade = false;
        anonymousClass39.getEditField().getLayout().getHeight();
        TextPaint textPaint = Theme.chat_msgTextPaint;
        AndroidUtilities.dp(20.0f);
        if (chatMessageCell.getMessageObject().getEmojiOnlyCount() != 0) {
            boolean z = chatMessageCell.getMessageObject().emojiOnlyCount == chatMessageCell.getMessageObject().animatedEmojiCount;
            f = 4.0f;
            switch (Math.max(chatMessageCell.getMessageObject().emojiOnlyCount, chatMessageCell.getMessageObject().animatedEmojiCount)) {
                case 0:
                case 1:
                case 2:
                    textPaint = z ? Theme.chat_msgTextPaintEmoji[0] : Theme.chat_msgTextPaintEmoji[2];
                    break;
                case 3:
                    textPaint = z ? Theme.chat_msgTextPaintEmoji[1] : Theme.chat_msgTextPaintEmoji[3];
                    break;
                case 4:
                    textPaint = z ? Theme.chat_msgTextPaintEmoji[2] : Theme.chat_msgTextPaintEmoji[4];
                    break;
                case 5:
                    textPaint = z ? Theme.chat_msgTextPaintEmoji[3] : Theme.chat_msgTextPaintEmoji[5];
                    break;
                case 6:
                    textPaint = z ? Theme.chat_msgTextPaintEmoji[4] : Theme.chat_msgTextPaintEmoji[5];
                    break;
                default:
                    textPaint = Theme.chat_msgTextPaintEmoji[5];
                    break;
            }
            if (textPaint != null) {
                textPaint.getTextSize();
                AndroidUtilities.dp(4.0f);
            }
        } else {
            f = 4.0f;
        }
        boolean z2 = (charSequenceReplaceEmoji instanceof Spannable) && (spans = ((Spannable) charSequenceReplaceEmoji).getSpans(0, charSequenceReplaceEmoji.length(), Object.class)) != null && spans.length > 0;
        if (editText.length() != charSequenceReplaceEmoji.length() || z2) {
            this.crossfade = true;
            int[] iArr = new int[1];
            CharSequence charSequenceTrim = AndroidUtilities.trim(editText, iArr);
            if (iArr[0] > 0) {
                lineTop = anonymousClass39.getEditField().getLayout().getLineTop(anonymousClass39.getEditField().getLayout().getLineForOffset(iArr[0]));
                anonymousClass39.getEditField().getLayout().getLineBottom(anonymousClass39.getEditField().getLayout().getLineForOffset(charSequenceTrim.length() + iArr[0]));
            } else {
                lineTop = 0;
            }
            AnimatedEmojiSpan.cloneSpans(charSequenceReplaceEmoji);
            charSequenceReplaceEmoji = Emoji.replaceEmoji(editText, textPaint.getFontMetricsInt(), false);
        } else {
            lineTop = 0;
        }
        CharSequence charSequence = charSequenceReplaceEmoji;
        float textSize = anonymousClass39.getEditField().getTextSize() / textPaint.getTextSize();
        this.scaleFrom = textSize;
        int lineCount = anonymousClass39.getEditField().getLayout().getLineCount();
        int width = (int) (anonymousClass39.getEditField().getLayout().getWidth() / textSize);
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.layout = hyphenationFrequency.setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
        } else {
            this.layout = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        this.animatedEmojiStack = AnimatedEmojiSpan.update(2, (View) null, this.animatedEmojiStack, this.layout);
        ViewPositionWatcher.computeCoordinatesInParent(anonymousClass39.getEditField(), chatActivity.contentView, pointF);
        float f3 = pointF.y;
        this.fromStartX = pointF.x;
        this.fromStartY = ((AndroidUtilities.dp(10.0f) + f3) - anonymousClass39.getEditField().getScrollY()) + lineTop;
        this.toXOffset = 0.0f;
        float f4 = Float.MAX_VALUE;
        for (int i4 = 0; i4 < this.layout.getLineCount(); i4++) {
            float lineLeft = this.layout.getLineLeft(i4);
            if (lineLeft < f4) {
                f4 = lineLeft;
            }
        }
        if (f4 != Float.MAX_VALUE) {
            this.toXOffset = f4;
        }
        this.layout.getHeight();
        float fDp = AndroidUtilities.dp(f) + f3;
        this.drawableFromTop = fDp;
        if (this.enterView.isTopViewVisible()) {
            this.drawableFromTop = fDp - AndroidUtilities.dp(12.0f);
        }
        this.drawableFromBottom = f3 + anonymousClass39.getEditField().getMeasuredHeight();
        MessageObject.TextLayoutBlock textLayoutBlock = chatMessageCell.getMessageObject().textLayoutBlocks.get(0);
        this.textLayoutBlock = textLayoutBlock;
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        int i5 = Theme.key_chat_messageTextOut;
        double dCalculateLuminance = ColorUtils.calculateLuminance(Theme.getColor(i5, this.resourcesProvider));
        int i6 = Theme.key_chat_messagePanelText;
        if (Math.abs(dCalculateLuminance - ColorUtils.calculateLuminance(Theme.getColor(i6, this.resourcesProvider))) > 0.20000000298023224d) {
            this.crossfade = true;
            this.changeColor = true;
        }
        this.fromColor = Theme.getColor(i6, this.resourcesProvider);
        this.toColor = Theme.getColor(i5, this.resourcesProvider);
        if (staticLayout.getLineCount() == this.layout.getLineCount()) {
            lineCount = staticLayout.getLineCount();
            int i7 = 0;
            i = 0;
            i2 = 0;
            while (true) {
                if (i7 < lineCount) {
                    StaticLayout staticLayout2 = this.layout;
                    f2 = 0.0f;
                    if (staticLayout2.getLineRight(i7) != staticLayout2.getWidth() || staticLayout2.getLineLeft(i7) == 0.0f) {
                        i++;
                    } else {
                        i2++;
                    }
                    if (staticLayout.getLineEnd(i7) != this.layout.getLineEnd(i7)) {
                        this.crossfade = true;
                    } else {
                        i7++;
                    }
                } else {
                    f2 = 0.0f;
                }
            }
        } else {
            f2 = 0.0f;
            this.crossfade = true;
            i = 0;
            i2 = 0;
        }
        if (!this.crossfade && i2 > 0 && i > 0) {
            SpannableString spannableString = new SpannableString(charSequence);
            SpannableString spannableString2 = new SpannableString(charSequence);
            float f5 = Float.MAX_VALUE;
            int i8 = 0;
            while (i8 < lineCount) {
                StaticLayout staticLayout3 = this.layout;
                if (staticLayout3.getLineRight(i8) != staticLayout3.getWidth() || staticLayout3.getLineLeft(i8) == f2) {
                    i3 = lineCount;
                    spannableString2.setSpan(new CountrySelectActivity.AnonymousClass5(false), this.layout.getLineStart(i8), this.layout.getLineEnd(i8), 0);
                } else {
                    i3 = lineCount;
                    spannableString.setSpan(new CountrySelectActivity.AnonymousClass5(false), this.layout.getLineStart(i8), this.layout.getLineEnd(i8), 0);
                    float lineLeft2 = this.layout.getLineLeft(i8);
                    if (lineLeft2 < f5) {
                        f5 = lineLeft2;
                    }
                }
                i8++;
                lineCount = i3;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0);
                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                this.layout = hyphenationFrequency2.setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
                this.rtlLayout = StaticLayout.Builder.obtain(spannableString2, 0, spannableString2.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
            } else {
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                TextPaint textPaint2 = textPaint;
                this.layout = new StaticLayout(spannableString, textPaint2, width, alignment3, 1.0f, 0.0f, false);
                this.rtlLayout = new StaticLayout(spannableString2, textPaint2, width, alignment3, 1.0f, 0.0f, false);
            }
        }
        this.toXOffsetRtl = this.layout.getWidth() - chatMessageCell.getMessageObject().textLayoutBlocks.get(0).textLayout.getWidth();
        boolean z3 = (chatMessageCell.getMessageObject().getReplyMsgId() == 0 || chatMessageCell.replyNameLayout == null) ? false : true;
        this.hasReply = z3;
        if (z3) {
            SimpleTextView simpleTextView = ((ChatReplyContainer$Layout[]) chatActivity.replyLayout.this$0)[0].name;
            ViewPositionWatcher.computeCoordinatesInParent(simpleTextView, chatActivity.contentView, this.tmpPointF);
            PointF pointF2 = this.tmpPointF;
            this.replyFromStartX = pointF2.x;
            this.replyFromStartY = pointF2.y;
            this.replyFromStartWidth = ((View) simpleTextView.getParent()).getWidth();
            SimpleTextView simpleTextView2 = ((ChatReplyContainer$Layout[]) chatActivity.replyLayout.this$0)[0].obj;
            ViewPositionWatcher.computeCoordinatesInParent(simpleTextView2, chatActivity.contentView, this.tmpPointF);
            float f6 = this.tmpPointF.y;
            this.replayFromColor = simpleTextView.getTextColor();
            this.replayObjectFromColor = simpleTextView2.getTextColor();
            this.drawableFromTop -= AndroidUtilities.dp(46.0f);
        }
        this.listViewTargetBottomPadding = recyclerListView.getPaddingBottom() - (chatActivity.inputIslandHeightCurrent - AndroidUtilities.dp(44.0f));
        this.gradientMatrix = new Matrix();
        Paint paint2 = new Paint(1);
        this.gradientPaint = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.gradientShader = linearGradient;
        paint2.setShader(linearGradient);
        this.messageId = chatMessageCell.getMessageObject().stableId;
        anonymousClass39.getEditField().setAlpha(0.0f);
        anonymousClass39.setTextTransitionIsRunning(true);
        StaticLayout staticLayout4 = chatMessageCell.replyNameLayout;
        if (staticLayout4 != null && staticLayout4.getText().length() > 1 && chatMessageCell.replyNameLayout.getPrimaryHorizontal(0) != 0.0f) {
            this.replyNameDx = chatMessageCell.replyNameLayout.getWidth() - chatMessageCell.replyNameLayout.getLineWidth(0);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new PeerStoriesView$40$$ExternalSyntheticLambda1(this, anonymousClass39, messageEnterTransitionContainer, 5));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(250L);
        ((ArrayList) messageEnterTransitionContainer.transitions).add(this);
        messageEnterTransitionContainer.checkVisibility();
        ((ViewGroup) messageEnterTransitionContainer.parent).invalidate();
        this.notificationsLocker.lock();
        valueAnimatorOfFloat.addListener(new GroupCallPip.AnonymousClass10(this, messageEnterTransitionContainer, chatMessageCell, anonymousClass39, chatActivity));
        if (SharedConfig.getDevicePerformanceClass() != 2 || (currentBackgroundDrawable = chatMessageCell.getCurrentBackgroundDrawable(true)) == null) {
            return;
        }
        int color = Theme.getColor(Theme.key_chat_messagePanelBackground, this.resourcesProvider);
        if (currentBackgroundDrawable.transitionDrawable == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(currentBackgroundDrawable.dp(50.0f), currentBackgroundDrawable.dp(40.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Rect bounds = currentBackgroundDrawable.getBounds();
            Rect rect = currentBackgroundDrawable.backupRect;
            rect.set(bounds);
            Paint paint3 = new Paint(1);
            paint3.setColor(-1);
            currentBackgroundDrawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            currentBackgroundDrawable.draw(canvas, paint3);
            currentBackgroundDrawable.transitionDrawable = new NinePatchDrawable(bitmapCreateBitmap, zzdq.createNinePatchChunk((bitmapCreateBitmap.getWidth() / 2) - 1, (bitmapCreateBitmap.getWidth() / 2) + 1, (bitmapCreateBitmap.getHeight() / 2) - 1, (bitmapCreateBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
            currentBackgroundDrawable.setBounds(rect);
        }
        if (currentBackgroundDrawable.transitionDrawableColor != color) {
            currentBackgroundDrawable.transitionDrawableColor = color;
            currentBackgroundDrawable.transitionDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
        }
        this.fromMessageDrawable = currentBackgroundDrawable.transitionDrawable;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Canvas canvas2;
        MessageObject messageObject;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        TextMessageEnterTransition textMessageEnterTransition;
        float f11;
        float f12;
        float f13;
        ChatActivity chatActivity;
        float f14;
        int i;
        ChatMessageCell.TransitionParams transitionParams;
        boolean z;
        int i2;
        boolean z2;
        float f15;
        float f16;
        ChatMessageCell chatMessageCell;
        float f17;
        float f18;
        MessageObject.TextLayoutBlock textLayoutBlock;
        Canvas canvas3;
        float f19;
        float f20;
        ChatMessageCell.TransitionParams transitionParams2;
        float f21;
        int i3;
        boolean z3;
        float f22;
        float f23;
        int color;
        int i4;
        float f24;
        MessageObject messageObject2;
        ReplyMessageLine replyMessageLine;
        int color2;
        MessageObject messageObject3;
        TLRPC.MessageMedia messageMedia;
        float fDp;
        float fLerp;
        float fLerp2;
        RectF rectF;
        MessageObject messageObject4;
        RectF rectF2;
        float f25;
        float f26;
        int iDp;
        int iDp2;
        float f27;
        float fDp2;
        float fDp3;
        float f28;
        float fLerp3;
        float fDp4;
        ArrayList arrayList;
        int size;
        int i5;
        SpoilerEffect spoilerEffect;
        boolean z4;
        int i6;
        int i7;
        CheckBoxBase checkBoxBase;
        float f29;
        StaticLayout staticLayout;
        int color3;
        int color4;
        float f30;
        MessageObject messageObject5;
        int color5;
        float f31;
        MessageObject messageObject6;
        RecyclerListView recyclerListView = this.listView;
        float y = recyclerListView.getY();
        MessageEnterTransitionContainer messageEnterTransitionContainer = this.container;
        float y2 = (y - messageEnterTransitionContainer.getY()) + recyclerListView.getMeasuredHeight();
        float x = this.fromStartX - messageEnterTransitionContainer.getX();
        float y3 = this.fromStartY - messageEnterTransitionContainer.getY();
        ChatMessageCell chatMessageCell2 = this.messageView;
        this.textX = chatMessageCell2.getTextX();
        this.textY = chatMessageCell2.getTextY();
        if (chatMessageCell2.getMessageObject().stableId != this.messageId) {
            return;
        }
        float x2 = (recyclerListView.getX() + chatMessageCell2.getX()) - messageEnterTransitionContainer.getX();
        float top = ((recyclerListView.getTop() + (chatMessageCell2.getPaddingTop() + chatMessageCell2.getTop())) - messageEnterTransitionContainer.getY()) - (this.listViewTargetBottomPadding - recyclerListView.getPaddingBottom());
        float interpolation = ChatListItemAnimator.DEFAULT_INTERPOLATOR.getInterpolation(this.progress);
        float f32 = this.progress;
        float f33 = f32 > 0.4f ? 1.0f : f32 / 0.4f;
        float interpolation2 = CubicBezierInterpolator.EASE_OUT.getInterpolation(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(f32));
        float f34 = this.textX + x2;
        float f35 = this.textY + top;
        float f36 = 1.0f - interpolation2;
        int measuredHeight = (int) ((y2 * interpolation2) + (messageEnterTransitionContainer.getMeasuredHeight() * f36));
        boolean z5 = chatMessageCell2.getBottom() - AndroidUtilities.dp(4.0f) > recyclerListView.getMeasuredHeight() && (((float) chatMessageCell2.getMeasuredHeight()) + top) - ((float) AndroidUtilities.dp(8.0f)) > ((float) measuredHeight) && messageEnterTransitionContainer.getMeasuredHeight() > 0;
        if (z5) {
            f2 = f34;
            f = f33;
            f3 = f35;
            f4 = 0.0f;
            f5 = 1.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, Math.max(0.0f, top), messageEnterTransitionContainer.getMeasuredWidth(), messageEnterTransitionContainer.getMeasuredHeight(), 255, 31);
        } else {
            f = f33;
            f2 = f34;
            f3 = f35;
            f4 = 0.0f;
            f5 = 1.0f;
            canvas2 = canvas;
        }
        canvas2.save();
        float y4 = recyclerListView.getY();
        ChatActivity chatActivity2 = this.chatActivity;
        canvas2.clipRect(f4, ((chatActivity2.chatListViewPaddingTop + y4) - messageEnterTransitionContainer.getY()) - AndroidUtilities.dp(3.0f), messageEnterTransitionContainer.getMeasuredWidth(), messageEnterTransitionContainer.getMeasuredHeight());
        canvas2.save();
        float backgroundDrawableLeft = chatMessageCell2.getBackgroundDrawableLeft() + x2;
        float f37 = this.toXOffset;
        float f38 = backgroundDrawableLeft + ((x - (f2 - f37)) * r20);
        float backgroundDrawableTop = chatMessageCell2.getBackgroundDrawableTop() + top;
        float f39 = f5 - interpolation;
        float y5 = (backgroundDrawableTop * interpolation) + ((this.drawableFromTop - messageEnterTransitionContainer.getY()) * f39);
        float backgroundDrawableBottom = ((backgroundDrawableTop + (chatMessageCell2.getBackgroundDrawableBottom() - chatMessageCell2.getBackgroundDrawableTop())) * interpolation) + ((this.drawableFromBottom - messageEnterTransitionContainer.getY()) * f39);
        int iDp3 = (int) ((AndroidUtilities.dp(4.0f) * r20) + chatMessageCell2.getBackgroundDrawableRight() + x2);
        MessageObject messageObject7 = this.currentMessageObject;
        MessageDrawable currentBackgroundDrawable = !messageObject7.isAnimatedEmojiStickers() ? chatMessageCell2.getCurrentBackgroundDrawable(true) : null;
        if (currentBackgroundDrawable != null) {
            chatMessageCell2.setBackgroundTopY(messageEnterTransitionContainer.getTop() - recyclerListView.getTop());
            Drawable shadowDrawable = currentBackgroundDrawable.getShadowDrawable();
            f6 = f;
            if (f6 != f5) {
                f7 = interpolation;
                NinePatchDrawable ninePatchDrawable = this.fromMessageDrawable;
                messageObject = messageObject7;
                if (ninePatchDrawable != null) {
                    ninePatchDrawable.setBounds((int) f38, (int) y5, iDp3, (int) backgroundDrawableBottom);
                    ninePatchDrawable.draw(canvas2);
                }
            } else {
                messageObject = messageObject7;
                f7 = interpolation;
            }
            f8 = interpolation2;
            if (shadowDrawable != null) {
                shadowDrawable.setAlpha((int) (f8 * 255.0f));
                shadowDrawable.setBounds((int) f38, (int) y5, iDp3, (int) backgroundDrawableBottom);
                shadowDrawable.draw(canvas2);
                shadowDrawable.setAlpha(255);
            }
            currentBackgroundDrawable.setAlpha((int) (f6 * 255.0f));
            currentBackgroundDrawable.setBounds((int) f38, (int) y5, iDp3, (int) backgroundDrawableBottom);
            currentBackgroundDrawable.drawFullBubble = true;
            currentBackgroundDrawable.draw(canvas2);
            currentBackgroundDrawable.drawFullBubble = false;
            currentBackgroundDrawable.setAlpha(255);
        } else {
            messageObject = messageObject7;
            chatActivity2 = chatActivity2;
            f6 = f;
            f7 = interpolation;
            f8 = r17;
        }
        canvas2.restore();
        canvas2.save();
        if (currentBackgroundDrawable != null) {
            if (messageObject.isOutOwner()) {
                canvas2.clipRect(AndroidUtilities.dp(4.0f) + f38, AndroidUtilities.dp(4.0f) + y5, iDp3 - AndroidUtilities.dp(10.0f), backgroundDrawableBottom - AndroidUtilities.dp(4.0f));
            } else {
                canvas2.clipRect(AndroidUtilities.dp(4.0f) + f38, AndroidUtilities.dp(4.0f) + y5, iDp3 - AndroidUtilities.dp(4.0f), backgroundDrawableBottom - AndroidUtilities.dp(4.0f));
            }
        }
        float x3 = (recyclerListView.getX() + chatMessageCell2.getLeft()) - messageEnterTransitionContainer.getX();
        float f40 = f3;
        float fM = DiffUtil.m(y3, f40, f39, top);
        canvas2.translate(x3, fM);
        chatMessageCell2.drawTime(f6, canvas2, false);
        chatMessageCell2.drawNamesLayout(canvas2, f6);
        chatMessageCell2.drawCommentButton(canvas2, f6);
        chatMessageCell2.drawCaptionLayout(f6, canvas2, false);
        chatMessageCell2.drawReactionsLayout(canvas2, f6, null);
        chatMessageCell2.drawCommentLayout(canvas2, f6);
        chatMessageCell2.drawLinkPreview(canvas2, f6);
        canvas2.restore();
        if (this.hasReply) {
            chatActivity = chatActivity2;
            ((ChatReplyContainer$Layout[]) chatActivity.replyLayout.this$0)[0].name.setAlpha(0.0f);
            ((ChatReplyContainer$Layout[]) chatActivity.replyLayout.this$0)[0].obj.setAlpha(0.0f);
            AndroidUtilities.lerp(AndroidUtilities.dp(35.0f), chatMessageCell2.replyHeight, f8);
            int iDp4 = AndroidUtilities.dp(10.0f);
            float x4 = this.replyFromStartX - messageEnterTransitionContainer.getX();
            float y6 = this.replyFromStartY - messageEnterTransitionContainer.getY();
            float f41 = x2 + chatMessageCell2.replyStartX;
            float f42 = top + chatMessageCell2.replyStartY;
            if (chatMessageCell2.replyLine == null) {
                chatMessageCell2.replyLine = new ReplyMessageLine(chatMessageCell2);
            }
            chatMessageCell2.replyLine.check(chatMessageCell2.getMessageObject(), chatMessageCell2.getCurrentUser(), chatMessageCell2.getCurrentChat(), this.resourcesProvider, 0);
            boolean zShouldDrawWithoutBackground = messageObject.shouldDrawWithoutBackground();
            float f43 = f6;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (zShouldDrawWithoutBackground) {
                color = Theme.getColor(Theme.key_chat_stickerReplyNameText, resourcesProvider);
                Theme.getColor(Theme.key_chat_stickerReplyLine, resourcesProvider);
            } else {
                ReplyMessageLine replyMessageLine2 = chatMessageCell2.replyLine;
                if (replyMessageLine2 != null) {
                    i4 = replyMessageLine2.nameColorAnimated.value;
                } else if (messageObject.isOutOwner()) {
                    color = Theme.getColor(Theme.key_chat_outReplyNameText, resourcesProvider);
                    Theme.getColor(Theme.key_chat_outReplyLine, resourcesProvider);
                } else {
                    color = Theme.getColor(Theme.key_chat_inReplyNameText, resourcesProvider);
                    Theme.getColor(Theme.key_chat_inReplyLine, resourcesProvider);
                }
                if (!messageObject.shouldDrawWithoutBackground()) {
                    f24 = x4;
                    f10 = f39;
                    f12 = backgroundDrawableBottom;
                    messageObject2 = messageObject;
                    f9 = y5;
                    replyMessageLine = chatMessageCell2.replyLine;
                    if (replyMessageLine != null) {
                        color2 = replyMessageLine.nameColorAnimated.value;
                    } else if (messageObject2.hasValidReplyMessageObject()) {
                        messageObject3 = messageObject2.replyMessageObject;
                        if (messageObject3.type == 0 && TextUtils.isEmpty(messageObject3.caption)) {
                            color2 = Theme.getColor(Theme.key_chat_outReplyMediaMessageText, resourcesProvider);
                        } else {
                            messageMedia = messageObject2.replyMessageObject.messageOwner.media;
                            if (!(messageMedia instanceof TLRPC.TL_messageMediaGame) || (messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
                                color2 = Theme.getColor(Theme.key_chat_outReplyMediaMessageText, resourcesProvider);
                            } else {
                                color2 = Theme.getColor(Theme.key_chat_outReplyMessageText, resourcesProvider);
                            }
                        }
                    } else {
                        color2 = Theme.getColor(Theme.key_chat_outReplyMediaMessageText, resourcesProvider);
                    }
                } else if (messageObject.isOutOwner()) {
                    f24 = x4;
                    f10 = f39;
                    f12 = backgroundDrawableBottom;
                    messageObject2 = messageObject;
                    f9 = y5;
                    if (messageObject2.isReplyToStory()) {
                        color2 = i4;
                    } else {
                        color3 = Theme.getColor(Theme.key_chat_inReplyMessageText, resourcesProvider);
                        if (messageObject2.forceAvatar) {
                            color4 = color3;
                            f30 = 0.0f;
                        } else if (messageObject2.hasValidReplyMessageObject()) {
                            messageObject5 = messageObject2.replyMessageObject;
                            if ((messageObject5.type != 0 || !TextUtils.isEmpty(messageObject5.caption)) && !(MessageObject.getMedia(messageObject2.replyMessageObject.messageOwner) instanceof TLRPC.TL_messageMediaGame) && !(MessageObject.getMedia(messageObject2.replyMessageObject.messageOwner) instanceof TLRPC.TL_messageMediaInvoice)) {
                                color4 = color3;
                                f30 = 0.0f;
                            } else if (chatMessageCell2.isReplyQuote) {
                                color4 = color3;
                                f30 = 0.0f;
                            } else {
                                color4 = Theme.getColor(Theme.key_chat_inReplyMediaMessageText, resourcesProvider);
                                f30 = 0.6f;
                            }
                        } else if (chatMessageCell2.isReplyQuote) {
                            color4 = Theme.getColor(Theme.key_chat_inReplyMediaMessageText, resourcesProvider);
                            f30 = 0.6f;
                        } else {
                            color4 = color3;
                            f30 = 0.0f;
                        }
                        color2 = ColorUtils.blendARGB(f30, color4, Theme.adaptHue(color4, i4));
                    }
                } else if (messageObject.isReplyToStory()) {
                    f24 = x4;
                    f10 = f39;
                    f12 = backgroundDrawableBottom;
                    messageObject2 = messageObject;
                    f9 = y5;
                    color2 = i4;
                } else {
                    f24 = x4;
                    int color6 = Theme.getColor(Theme.key_chat_outReplyMessageText, resourcesProvider);
                    messageObject2 = messageObject;
                    f9 = y5;
                    if (messageObject2.forceAvatar) {
                        f10 = f39;
                    } else {
                        if (messageObject2.hasValidReplyMessageObject()) {
                            messageObject6 = messageObject2.replyMessageObject;
                            f10 = f39;
                            if ((messageObject6.type != 0 || !TextUtils.isEmpty(messageObject6.caption)) && !(MessageObject.getMedia(messageObject2.replyMessageObject.messageOwner) instanceof TLRPC.TL_messageMediaGame) && !(MessageObject.getMedia(messageObject2.replyMessageObject.messageOwner) instanceof TLRPC.TL_messageMediaInvoice)) {
                            }
                            f12 = backgroundDrawableBottom;
                            color2 = ColorUtils.blendARGB(f31, color5, Theme.adaptHue(color5, i4));
                        } else {
                            f10 = f39;
                        }
                        if (!chatMessageCell2.isReplyQuote) {
                            color5 = Theme.getColor(Theme.key_chat_outReplyMediaMessageText, resourcesProvider);
                            f31 = 0.6f;
                        }
                        f12 = backgroundDrawableBottom;
                        color2 = ColorUtils.blendARGB(f31, color5, Theme.adaptHue(color5, i4));
                    }
                    color5 = color6;
                    f31 = 0.0f;
                    f12 = backgroundDrawableBottom;
                    color2 = ColorUtils.blendARGB(f31, color5, Theme.adaptHue(color5, i4));
                }
                f13 = f7;
                Theme.chat_replyTextPaint.setColor(ColorUtils.blendARGB(f13, this.replayObjectFromColor, color2));
                Theme.chat_replyNamePaint.setColor(ColorUtils.blendARGB(f13, this.replayFromColor, i4));
                if (chatMessageCell2.needReplyImage) {
                    fDp = f24 - AndroidUtilities.dp(44.0f);
                } else {
                    fDp = f24;
                }
                fLerp = AndroidUtilities.lerp(fDp, f41, f8);
                fLerp2 = AndroidUtilities.lerp((AndroidUtilities.dp(12.0f) * f13) + y6, f42, f13);
                if (this.roundRectRadii == null) {
                    this.roundRectRadii = new float[]{fDp, fDp, 0.0f, 0.0f, 0.0f, 0.0f, fDp, fDp};
                    float fDp5 = AndroidUtilities.dp(4.0f);
                    float[] fArr = this.roundRectRadii;
                    fArr[5] = 0.0f;
                    fArr[4] = 0.0f;
                    fArr[3] = 0.0f;
                    fArr[2] = 0.0f;
                }
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(fDp, y6, this.replyFromStartWidth + fDp, AndroidUtilities.dp(35.0f) + y6);
                rectF3.offset(0.0f, AndroidUtilities.dp(12.0f) * f13);
                RectF rectF4 = this.messageReplySelectorRect;
                rectF4.set(chatMessageCell2.replySelectorRect);
                rectF4.offset(x2, fM);
                rectF = this.replySelectorRect;
                AndroidUtilities.lerp(rectF3, rectF4, f8, rectF);
                messageObject4 = messageObject2;
                chatMessageCell2.replyLine.drawBackground(canvas, rectF, f43, chatMessageCell2.isReplyQuote, chatMessageCell2.getMessageObject().shouldDrawWithoutBackground());
                canvas2 = canvas;
                f11 = f43;
                chatMessageCell2.replyLine.drawLine(canvas2, rectF, f11);
                if (chatMessageCell2.needReplyImage) {
                    canvas2.save();
                    float fHeight = rectF.height() - AndroidUtilities.dp(10.0f);
                    if (chatMessageCell2.isReplyQuote) {
                        f29 = 3.0f;
                    } else {
                        f29 = 7.0f;
                    }
                    float fLerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(35.0f), Math.min(fHeight, Theme.chat_replyTextPaint.getTextSize() + Theme.chat_replyNamePaint.getTextSize() + AndroidUtilities.dp(f29)), f8);
                    ImageReceiver imageReceiver = chatMessageCell2.replyImageReceiver;
                    float fLerp5 = AndroidUtilities.lerp(fLerp, rectF.left + AndroidUtilities.dp(8.0f), f8);
                    float f44 = rectF.top;
                    if (chatMessageCell2.isReplyQuote || (staticLayout = chatMessageCell2.replyTextLayout) == null) {
                        rectF2 = rectF;
                    } else {
                        rectF2 = rectF;
                        int i8 = staticLayout.getLineCount() <= 1 ? 2 : 0;
                        imageReceiver.setImageCoords(fLerp5, AndroidUtilities.lerp(fLerp2, f44 + AndroidUtilities.dp(i8 + 5), f8), fLerp4, fLerp4);
                        imageReceiver.draw(canvas2);
                        canvas2.restore();
                        f25 = fLerp4;
                    }
                    imageReceiver.setImageCoords(fLerp5, AndroidUtilities.lerp(fLerp2, f44 + AndroidUtilities.dp(i8 + 5), f8), fLerp4, fLerp4);
                    imageReceiver.draw(canvas2);
                    canvas2.restore();
                    f25 = fLerp4;
                } else {
                    rectF2 = rectF;
                    f25 = 0.0f;
                }
                canvas2.save();
                f26 = iDp4 * f8;
                canvas2.translate(f26, 0.0f);
                if (messageObject4.shouldDrawWithoutBackground()) {
                    iDp = AndroidUtilities.dp(6.0f);
                } else {
                    iDp = AndroidUtilities.dp(f5);
                }
                float f45 = -iDp;
                if (messageObject4.shouldDrawWithoutBackground()) {
                    iDp2 = AndroidUtilities.dp(f5);
                } else {
                    iDp2 = AndroidUtilities.dp(3.0f);
                }
                f27 = iDp2;
                float f46 = chatMessageCell2.replyTextOffset;
                fDp2 = (f41 - f46) + f45;
                float f47 = (f41 - this.replyNameDx) + f45;
                AndroidUtilities.lerp(fDp - f46, fDp2, f8);
                float fLerp6 = AndroidUtilities.lerp(fDp, f47, f8);
                if (chatMessageCell2.needReplyImage) {
                    fDp3 = AndroidUtilities.dp(3.0f) + f25;
                } else {
                    fDp3 = 0.0f;
                }
                f28 = fLerp6 + fDp3;
                if (chatMessageCell2.replyNameLayout != null) {
                    canvas2.save();
                    canvas2.translate(f28, (f27 * f8) + fLerp2);
                    int alpha = Theme.chat_replyNamePaint.getAlpha();
                    Theme.chat_replyNamePaint.setAlpha((int) (alpha * f8));
                    chatMessageCell2.replyNameLayout.draw(canvas2);
                    Theme.chat_replyNamePaint.setAlpha(alpha);
                    SimpleTextView simpleTextView = ((ChatReplyContainer$Layout[]) chatActivity.replyLayout.this$0)[0].name;
                    textMessageEnterTransition = this;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, simpleTextView.getWidth(), simpleTextView.getHeight(), (int) (f36 * 255.0f), 31);
                    simpleTextView.setAlpha(1.0f);
                    simpleTextView.draw(canvas2);
                    simpleTextView.setAlpha(0.0f);
                    canvas2.restore();
                    canvas2.restore();
                } else {
                    textMessageEnterTransition = this;
                }
                if (chatMessageCell2.isReplyQuote && chatMessageCell2.replyQuoteDrawable != null) {
                    if (chatMessageCell2.replyLine.getColor() != chatMessageCell2.replyQuoteDrawableColor) {
                        Drawable drawable = chatMessageCell2.replyQuoteDrawable;
                        int color7 = chatMessageCell2.replyLine.getColor();
                        chatMessageCell2.replyQuoteDrawableColor = color7;
                        drawable.setColorFilter(new PorterDuffColorFilter(color7, PorterDuff.Mode.SRC_IN));
                    }
                    chatMessageCell2.replyQuoteDrawable.setBounds((int) (((rectF2.right - f26) - AndroidUtilities.dp((!chatMessageCell2.drawPinnedTop ? 1 : 0) + 2)) - chatMessageCell2.replyQuoteDrawable.getIntrinsicWidth()), (int) (rectF2.top + AndroidUtilities.dp((!chatMessageCell2.drawPinnedTop ? 1 : 0) + 2)), (int) ((rectF2.right - f26) - AndroidUtilities.dp((!chatMessageCell2.drawPinnedTop ? 1 : 0) + 2)), (int) (rectF2.top + AndroidUtilities.dp((!chatMessageCell2.drawPinnedTop ? 1 : 0) + 2) + chatMessageCell2.replyQuoteDrawable.getIntrinsicHeight()));
                    chatMessageCell2.replyQuoteDrawable.setAlpha((int) (f8 * 255.0f));
                    chatMessageCell2.replyQuoteDrawable.draw(canvas2);
                }
                if (chatMessageCell2.replyTextLayout != null) {
                    canvas2.save();
                    fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(19.0f), Theme.chat_replyNamePaint.getTextSize() + AndroidUtilities.dp(4.0f) + f27, f8) + fLerp2;
                    if (chatMessageCell2.isReplyQuote && chatMessageCell2.needReplyImage) {
                        fDp2 -= AndroidUtilities.dp(2.0f);
                    }
                    if (chatMessageCell2.needReplyImage && (!chatMessageCell2.isReplyQuote || chatMessageCell2.replyTextRTL)) {
                        fDp2 = f25 + AndroidUtilities.dp(3.0f) + fDp2;
                    }
                    fDp4 = fDp2;
                    if (chatMessageCell2.isReplyTaskOrPollOption && chatMessageCell2.replyTaskCheckbox != null) {
                        float fLerp7 = AndroidUtilities.lerp(fDp - chatMessageCell2.replyTextOffset, fDp4, f8);
                        chatMessageCell2.replyTaskCheckbox.setBounds((int) fLerp7, AndroidUtilities.dp(2.0f) + ((int) fLerp3), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                        Paint paint = Theme.chat_instantViewRectPaint;
                        if (messageObject4.isOutOwner()) {
                            i6 = Theme.key_chat_outMenu;
                        } else {
                            i6 = Theme.key_chat_inMenu;
                        }
                        paint.setColor(Theme.getColor(i6, resourcesProvider));
                        canvas2.drawCircle(fLerp7 + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(8.0f) + fLerp3, AndroidUtilities.dp(5.0f), Theme.chat_instantViewRectPaint);
                        CheckBoxBase checkBoxBase2 = chatMessageCell2.replyTaskCheckbox;
                        if (messageObject4.isOutOwner()) {
                            i7 = Theme.key_chat_outAudioSeekbarFill;
                        } else {
                            i7 = Theme.key_chat_inAudioSeekbarFill;
                        }
                        checkBoxBase2.setColor(-1, i7, Theme.key_checkboxCheck);
                        checkBoxBase = chatMessageCell2.replyTaskCheckbox;
                        if (checkBoxBase.alpha != f13) {
                            checkBoxBase.alpha = f13;
                            checkBoxBase.invalidate();
                        }
                        chatMessageCell2.replyTaskCheckbox.draw(canvas2);
                    }
                    if (chatMessageCell2.isReplyTaskOrPollOption) {
                        fDp4 += AndroidUtilities.dp(16.0f);
                    }
                    if (chatMessageCell2.replyTextRTL && chatMessageCell2.replyTextOffset > 0) {
                        fDp4 = ((rectF2.right - AndroidUtilities.dp(8.0f)) - chatMessageCell2.replyTextLayout.getWidth()) - f26;
                    }
                    canvas2.translate(AndroidUtilities.lerp(fDp - chatMessageCell2.replyTextOffset, fDp4, f8), fLerp3);
                    canvas2.save();
                    arrayList = chatMessageCell2.replySpoilers;
                    SpoilerEffect.clipOutCanvas(canvas2, arrayList);
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, chatMessageCell2.replyTextLayout, chatMessageCell2.animatedEmojiReplyStack, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
                    chatMessageCell2.replyTextLayout.draw(canvas2);
                    canvas2.restore();
                    size = arrayList.size();
                    i5 = 0;
                    while (i5 < size) {
                        Object obj = arrayList.get(i5);
                        i5++;
                        spoilerEffect = (SpoilerEffect) obj;
                        z4 = spoilerEffect.shouldInvalidateColor;
                        spoilerEffect.shouldInvalidateColor = false;
                        if (z4) {
                            spoilerEffect.setColor(chatMessageCell2.replyTextLayout.getPaint().getColor());
                        }
                        spoilerEffect.draw(canvas2);
                    }
                    canvas2.restore();
                }
                canvas2.restore();
            }
            i4 = color;
            if (!messageObject.shouldDrawWithoutBackground()) {
                f24 = x4;
                f10 = f39;
                f12 = backgroundDrawableBottom;
                messageObject2 = messageObject;
                f9 = y5;
                replyMessageLine = chatMessageCell2.replyLine;
                if (replyMessageLine != null) {
                    color2 = replyMessageLine.nameColorAnimated.value;
                } else if (messageObject2.hasValidReplyMessageObject()) {
                    messageObject3 = messageObject2.replyMessageObject;
                    if (messageObject3.type == 0) {
                        messageMedia = messageObject2.replyMessageObject.messageOwner.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                            color2 = Theme.getColor(Theme.key_chat_outReplyMediaMessageText, resourcesProvider);
                        } else {
                            color2 = Theme.getColor(Theme.key_chat_outReplyMediaMessageText, resourcesProvider);
                        }
                    } else {
                        messageMedia = messageObject2.replyMessageObject.messageOwner.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                            color2 = Theme.getColor(Theme.key_chat_outReplyMediaMessageText, resourcesProvider);
                        } else {
                            color2 = Theme.getColor(Theme.key_chat_outReplyMediaMessageText, resourcesProvider);
                        }
                    }
                } else {
                    color2 = Theme.getColor(Theme.key_chat_outReplyMediaMessageText, resourcesProvider);
                }
            } else if (messageObject.isOutOwner()) {
                f24 = x4;
                f10 = f39;
                f12 = backgroundDrawableBottom;
                messageObject2 = messageObject;
                f9 = y5;
                if (messageObject2.isReplyToStory()) {
                    color2 = i4;
                } else {
                    color3 = Theme.getColor(Theme.key_chat_inReplyMessageText, resourcesProvider);
                    if (messageObject2.forceAvatar) {
                        color4 = color3;
                        f30 = 0.0f;
                    } else if (messageObject2.hasValidReplyMessageObject()) {
                        messageObject5 = messageObject2.replyMessageObject;
                        if (messageObject5.type != 0) {
                        }
                        color4 = color3;
                        f30 = 0.0f;
                    } else if (chatMessageCell2.isReplyQuote) {
                        color4 = Theme.getColor(Theme.key_chat_inReplyMediaMessageText, resourcesProvider);
                        f30 = 0.6f;
                    } else {
                        color4 = color3;
                        f30 = 0.0f;
                    }
                    color2 = ColorUtils.blendARGB(f30, color4, Theme.adaptHue(color4, i4));
                }
            } else if (messageObject.isReplyToStory()) {
                f24 = x4;
                f10 = f39;
                f12 = backgroundDrawableBottom;
                messageObject2 = messageObject;
                f9 = y5;
                color2 = i4;
            } else {
                f24 = x4;
                int color8 = Theme.getColor(Theme.key_chat_outReplyMessageText, resourcesProvider);
                messageObject2 = messageObject;
                f9 = y5;
                if (messageObject2.forceAvatar) {
                    if (messageObject2.hasValidReplyMessageObject()) {
                        messageObject6 = messageObject2.replyMessageObject;
                        f10 = f39;
                        if (messageObject6.type != 0) {
                        }
                    } else {
                        f10 = f39;
                    }
                    if (!chatMessageCell2.isReplyQuote) {
                        color5 = Theme.getColor(Theme.key_chat_outReplyMediaMessageText, resourcesProvider);
                        f31 = 0.6f;
                    }
                    f12 = backgroundDrawableBottom;
                    color2 = ColorUtils.blendARGB(f31, color5, Theme.adaptHue(color5, i4));
                } else {
                    f10 = f39;
                }
                color5 = color8;
                f31 = 0.0f;
                f12 = backgroundDrawableBottom;
                color2 = ColorUtils.blendARGB(f31, color5, Theme.adaptHue(color5, i4));
            }
            f13 = f7;
            Theme.chat_replyTextPaint.setColor(ColorUtils.blendARGB(f13, this.replayObjectFromColor, color2));
            Theme.chat_replyNamePaint.setColor(ColorUtils.blendARGB(f13, this.replayFromColor, i4));
            if (chatMessageCell2.needReplyImage) {
                fDp = f24 - AndroidUtilities.dp(44.0f);
            } else {
                fDp = f24;
            }
            fLerp = AndroidUtilities.lerp(fDp, f41, f8);
            fLerp2 = AndroidUtilities.lerp((AndroidUtilities.dp(12.0f) * f13) + y6, f42, f13);
            if (this.roundRectRadii == null) {
                this.roundRectRadii = new float[]{fDp5, fDp5, 0.0f, 0.0f, 0.0f, 0.0f, fDp5, fDp5};
                float fDp6 = AndroidUtilities.dp(4.0f);
                float[] fArr2 = this.roundRectRadii;
                fArr2[5] = 0.0f;
                fArr2[4] = 0.0f;
                fArr2[3] = 0.0f;
                fArr2[2] = 0.0f;
            }
            RectF rectF5 = AndroidUtilities.rectTmp;
            rectF5.set(fDp, y6, this.replyFromStartWidth + fDp, AndroidUtilities.dp(35.0f) + y6);
            rectF5.offset(0.0f, AndroidUtilities.dp(12.0f) * f13);
            RectF rectF6 = this.messageReplySelectorRect;
            rectF6.set(chatMessageCell2.replySelectorRect);
            rectF6.offset(x2, fM);
            rectF = this.replySelectorRect;
            AndroidUtilities.lerp(rectF5, rectF6, f8, rectF);
            messageObject4 = messageObject2;
            chatMessageCell2.replyLine.drawBackground(canvas, rectF, f43, chatMessageCell2.isReplyQuote, chatMessageCell2.getMessageObject().shouldDrawWithoutBackground());
            canvas2 = canvas;
            f11 = f43;
            chatMessageCell2.replyLine.drawLine(canvas2, rectF, f11);
            if (chatMessageCell2.needReplyImage) {
                canvas2.save();
                float fHeight2 = rectF.height() - AndroidUtilities.dp(10.0f);
                if (chatMessageCell2.isReplyQuote) {
                    f29 = 3.0f;
                } else {
                    f29 = 7.0f;
                }
                float fLerp8 = AndroidUtilities.lerp(AndroidUtilities.dp(35.0f), Math.min(fHeight2, Theme.chat_replyTextPaint.getTextSize() + Theme.chat_replyNamePaint.getTextSize() + AndroidUtilities.dp(f29)), f8);
                ImageReceiver imageReceiver2 = chatMessageCell2.replyImageReceiver;
                float fLerp9 = AndroidUtilities.lerp(fLerp, rectF.left + AndroidUtilities.dp(8.0f), f8);
                float f48 = rectF.top;
                if (chatMessageCell2.isReplyQuote) {
                    rectF2 = rectF;
                } else {
                    rectF2 = rectF;
                }
                imageReceiver2.setImageCoords(fLerp9, AndroidUtilities.lerp(fLerp2, f48 + AndroidUtilities.dp(i8 + 5), f8), fLerp8, fLerp8);
                imageReceiver2.draw(canvas2);
                canvas2.restore();
                f25 = fLerp8;
            } else {
                rectF2 = rectF;
                f25 = 0.0f;
            }
            canvas2.save();
            f26 = iDp4 * f8;
            canvas2.translate(f26, 0.0f);
            if (messageObject4.shouldDrawWithoutBackground()) {
                iDp = AndroidUtilities.dp(6.0f);
            } else {
                iDp = AndroidUtilities.dp(f5);
            }
            float f49 = -iDp;
            if (messageObject4.shouldDrawWithoutBackground()) {
                iDp2 = AndroidUtilities.dp(f5);
            } else {
                iDp2 = AndroidUtilities.dp(3.0f);
            }
            f27 = iDp2;
            float f410 = chatMessageCell2.replyTextOffset;
            fDp2 = (f41 - f410) + f49;
            float f411 = (f41 - this.replyNameDx) + f49;
            AndroidUtilities.lerp(fDp - f410, fDp2, f8);
            float fLerp10 = AndroidUtilities.lerp(fDp, f411, f8);
            if (chatMessageCell2.needReplyImage) {
                fDp3 = AndroidUtilities.dp(3.0f) + f25;
            } else {
                fDp3 = 0.0f;
            }
            f28 = fLerp10 + fDp3;
            if (chatMessageCell2.replyNameLayout != null) {
                canvas2.save();
                canvas2.translate(f28, (f27 * f8) + fLerp2);
                int alpha2 = Theme.chat_replyNamePaint.getAlpha();
                Theme.chat_replyNamePaint.setAlpha((int) (alpha2 * f8));
                chatMessageCell2.replyNameLayout.draw(canvas2);
                Theme.chat_replyNamePaint.setAlpha(alpha2);
                SimpleTextView simpleTextView2 = ((ChatReplyContainer$Layout[]) chatActivity.replyLayout.this$0)[0].name;
                textMessageEnterTransition = this;
                canvas2.saveLayerAlpha(0.0f, 0.0f, simpleTextView2.getWidth(), simpleTextView2.getHeight(), (int) (f36 * 255.0f), 31);
                simpleTextView2.setAlpha(1.0f);
                simpleTextView2.draw(canvas2);
                simpleTextView2.setAlpha(0.0f);
                canvas2.restore();
                canvas2.restore();
            } else {
                textMessageEnterTransition = this;
            }
            if (chatMessageCell2.isReplyQuote) {
                if (chatMessageCell2.replyLine.getColor() != chatMessageCell2.replyQuoteDrawableColor) {
                    Drawable drawable2 = chatMessageCell2.replyQuoteDrawable;
                    int color9 = chatMessageCell2.replyLine.getColor();
                    chatMessageCell2.replyQuoteDrawableColor = color9;
                    drawable2.setColorFilter(new PorterDuffColorFilter(color9, PorterDuff.Mode.SRC_IN));
                }
                chatMessageCell2.replyQuoteDrawable.setBounds((int) (((rectF2.right - f26) - AndroidUtilities.dp((!chatMessageCell2.drawPinnedTop ? 1 : 0) + 2)) - chatMessageCell2.replyQuoteDrawable.getIntrinsicWidth()), (int) (rectF2.top + AndroidUtilities.dp((!chatMessageCell2.drawPinnedTop ? 1 : 0) + 2)), (int) ((rectF2.right - f26) - AndroidUtilities.dp((!chatMessageCell2.drawPinnedTop ? 1 : 0) + 2)), (int) (rectF2.top + AndroidUtilities.dp((!chatMessageCell2.drawPinnedTop ? 1 : 0) + 2) + chatMessageCell2.replyQuoteDrawable.getIntrinsicHeight()));
                chatMessageCell2.replyQuoteDrawable.setAlpha((int) (f8 * 255.0f));
                chatMessageCell2.replyQuoteDrawable.draw(canvas2);
            }
            if (chatMessageCell2.replyTextLayout != null) {
                canvas2.save();
                fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(19.0f), Theme.chat_replyNamePaint.getTextSize() + AndroidUtilities.dp(4.0f) + f27, f8) + fLerp2;
                if (chatMessageCell2.isReplyQuote) {
                    fDp2 -= AndroidUtilities.dp(2.0f);
                }
                if (chatMessageCell2.needReplyImage) {
                    fDp2 = f25 + AndroidUtilities.dp(3.0f) + fDp2;
                }
                fDp4 = fDp2;
                if (chatMessageCell2.isReplyTaskOrPollOption) {
                    float fLerp11 = AndroidUtilities.lerp(fDp - chatMessageCell2.replyTextOffset, fDp4, f8);
                    chatMessageCell2.replyTaskCheckbox.setBounds((int) fLerp11, AndroidUtilities.dp(2.0f) + ((int) fLerp3), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                    Paint paint2 = Theme.chat_instantViewRectPaint;
                    if (messageObject4.isOutOwner()) {
                        i6 = Theme.key_chat_outMenu;
                    } else {
                        i6 = Theme.key_chat_inMenu;
                    }
                    paint2.setColor(Theme.getColor(i6, resourcesProvider));
                    canvas2.drawCircle(fLerp11 + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(8.0f) + fLerp3, AndroidUtilities.dp(5.0f), Theme.chat_instantViewRectPaint);
                    CheckBoxBase checkBoxBase3 = chatMessageCell2.replyTaskCheckbox;
                    if (messageObject4.isOutOwner()) {
                        i7 = Theme.key_chat_outAudioSeekbarFill;
                    } else {
                        i7 = Theme.key_chat_inAudioSeekbarFill;
                    }
                    checkBoxBase3.setColor(-1, i7, Theme.key_checkboxCheck);
                    checkBoxBase = chatMessageCell2.replyTaskCheckbox;
                    if (checkBoxBase.alpha != f13) {
                        checkBoxBase.alpha = f13;
                        checkBoxBase.invalidate();
                    }
                    chatMessageCell2.replyTaskCheckbox.draw(canvas2);
                }
                if (chatMessageCell2.isReplyTaskOrPollOption) {
                    fDp4 += AndroidUtilities.dp(16.0f);
                }
                if (chatMessageCell2.replyTextRTL) {
                    fDp4 = ((rectF2.right - AndroidUtilities.dp(8.0f)) - chatMessageCell2.replyTextLayout.getWidth()) - f26;
                }
                canvas2.translate(AndroidUtilities.lerp(fDp - chatMessageCell2.replyTextOffset, fDp4, f8), fLerp3);
                canvas2.save();
                arrayList = chatMessageCell2.replySpoilers;
                SpoilerEffect.clipOutCanvas(canvas2, arrayList);
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, chatMessageCell2.replyTextLayout, chatMessageCell2.animatedEmojiReplyStack, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
                chatMessageCell2.replyTextLayout.draw(canvas2);
                canvas2.restore();
                size = arrayList.size();
                i5 = 0;
                while (i5 < size) {
                    Object obj2 = arrayList.get(i5);
                    i5++;
                    spoilerEffect = (SpoilerEffect) obj2;
                    z4 = spoilerEffect.shouldInvalidateColor;
                    spoilerEffect.shouldInvalidateColor = false;
                    if (z4) {
                        spoilerEffect.setColor(chatMessageCell2.replyTextLayout.getPaint().getColor());
                    }
                    spoilerEffect.draw(canvas2);
                }
                canvas2.restore();
            }
            canvas2.restore();
        } else {
            f9 = y5;
            f10 = f39;
            textMessageEnterTransition = this;
            f11 = f6;
            f12 = backgroundDrawableBottom;
            f13 = f7;
            chatActivity = chatActivity2;
        }
        canvas2.save();
        if (chatMessageCell2.getMessageObject() == null || chatMessageCell2.getMessageObject().type != 19) {
            canvas2.clipRect(f38 + AndroidUtilities.dp(4.0f), f9 + AndroidUtilities.dp(4.0f), iDp3 - AndroidUtilities.dp(4.0f), f12 - AndroidUtilities.dp(4.0f));
        }
        float f50 = (textMessageEnterTransition.scaleFrom * r20) + f8;
        canvas2.save();
        float f51 = x * r20;
        float f52 = f2;
        float fM2 = DiffUtil.m(f52, f37, f8, f51);
        float f53 = y3 * f10;
        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = chatMessageCell2.getMessageObject().textLayoutBlocks;
        MessageObject.TextLayoutBlock textLayoutBlock2 = textMessageEnterTransition.textLayoutBlock;
        ChatMessageCell.TransitionParams transitionParams3 = chatMessageCell2.transitionParams;
        canvas2.translate(fM2, ((textLayoutBlock2.textYOffset(arrayList2, transitionParams3) + f40) * f13) + f53);
        float f54 = f50 * 1.0f;
        canvas2.scale(f50, f54, 0.0f, 0.0f);
        int i9 = textMessageEnterTransition.fromColor;
        boolean z6 = textMessageEnterTransition.changeColor;
        int i10 = textMessageEnterTransition.toColor;
        boolean z7 = textMessageEnterTransition.crossfade;
        StaticLayout staticLayout2 = textMessageEnterTransition.layout;
        if (z7 && z6) {
            int color10 = staticLayout2.getPaint().getColor();
            float f55 = f11;
            staticLayout2.getPaint().setColor(ColorUtils.blendARGB(f55, i9, i10));
            float f56 = 1.0f - f55;
            z2 = z7;
            z = z6;
            transitionParams = transitionParams3;
            i2 = i10;
            f14 = f54;
            i = i9;
            canvas.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f56 * 255.0f), 31);
            staticLayout2.draw(canvas);
            f15 = f13;
            textLayoutBlock = textLayoutBlock2;
            f17 = f11;
            f16 = f50;
            chatMessageCell = chatMessageCell2;
            f18 = f52;
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textMessageEnterTransition.layout, textMessageEnterTransition.animatedEmojiStack, 0.0f, null, 0.0f, 0.0f, 0.0f, f56);
            staticLayout2.getPaint().setColor(color10);
            canvas.restore();
            canvas3 = canvas;
        } else {
            f14 = f54;
            i = i9;
            transitionParams = transitionParams3;
            z = z6;
            i2 = i10;
            z2 = z7;
            f15 = f13;
            f16 = f50;
            chatMessageCell = chatMessageCell2;
            f17 = f11;
            f18 = f52;
            textLayoutBlock = textLayoutBlock2;
            if (z2) {
                float f57 = 1.0f - f17;
                canvas3 = canvas;
                canvas3.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f57 * 255.0f), 31);
                staticLayout2.draw(canvas3);
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, textMessageEnterTransition.layout, textMessageEnterTransition.animatedEmojiStack, 0.0f, null, 0.0f, 0.0f, 0.0f, f57);
                canvas3.restore();
            } else {
                canvas3 = canvas;
                staticLayout2.draw(canvas3);
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, textMessageEnterTransition.layout, textMessageEnterTransition.animatedEmojiStack, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            }
        }
        canvas3.restore();
        StaticLayout staticLayout3 = textMessageEnterTransition.rtlLayout;
        if (staticLayout3 != null) {
            canvas3.save();
            transitionParams2 = transitionParams;
            canvas3.translate(DiffUtil.m(f18, textMessageEnterTransition.toXOffsetRtl, f8, f51), ((textLayoutBlock.textYOffset(chatMessageCell.getMessageObject().textLayoutBlocks, transitionParams2) + f40) * f15) + f53);
            f19 = f16;
            f21 = f14;
            canvas3.scale(f19, f21, 0.0f, 0.0f);
            if (z2 && z) {
                int color11 = staticLayout3.getPaint().getColor();
                f20 = f17;
                i3 = i2;
                staticLayout3.getPaint().setColor(ColorUtils.setAlphaComponent(ColorUtils.blendARGB(f20, i, i3), (int) ((1.0f - f20) * Color.alpha(color11))));
                staticLayout3.draw(canvas3);
                staticLayout3.getPaint().setColor(color11);
            } else {
                f20 = f17;
                i3 = i2;
                if (z2) {
                    int alpha3 = staticLayout3.getPaint().getAlpha();
                    staticLayout3.getPaint().setAlpha((int) ((1.0f - f20) * alpha3));
                    staticLayout3.draw(canvas3);
                    staticLayout3.getPaint().setAlpha(alpha3);
                } else {
                    staticLayout3.draw(canvas3);
                }
            }
            canvas3.restore();
        } else {
            f19 = f16;
            f20 = f17;
            transitionParams2 = transitionParams;
            f21 = f14;
            i3 = i2;
        }
        if (z2) {
            canvas3.save();
            canvas3.translate(DiffUtil.m(x, f18, r20, (recyclerListView.getX() + chatMessageCell.getLeft()) - messageEnterTransitionContainer.getX()), fM);
            canvas3.scale(f19, f21, chatMessageCell.getTextX(), chatMessageCell.getTextY());
            canvas3.translate(0.0f, -0.0f);
            int color12 = Theme.chat_msgTextPaint.getColor();
            Theme.chat_msgTextPaint.setColor(i3);
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = chatMessageCell.getMessageObject().textLayoutBlocks;
            ChatMessageCell chatMessageCell3 = chatMessageCell;
            float f58 = chatMessageCell3.textY;
            if (transitionParams2.animateTextY) {
                float f59 = transitionParams2.animateFromTextY;
                float f60 = transitionParams2.animateChangeProgress;
                f23 = 1.0f;
                f58 = (f58 * f60) + ((1.0f - f60) * f59);
            } else {
                f23 = 1.0f;
            }
            float f61 = chatMessageCell3.textX;
            MessageObject messageObject8 = chatMessageCell3.currentMessageObject;
            float f62 = f58;
            Canvas canvas4 = canvas3;
            z3 = false;
            f22 = 0.0f;
            chatMessageCell3.drawMessageText(f61, f62, canvas4, arrayList3, messageObject8 == null ? 0.0f : messageObject8.textXOffset, true, f20, false, true, false, false);
            canvas3 = canvas4;
            chatMessageCell3.drawAnimatedEmojis(canvas3, f20);
            if (Theme.chat_msgTextPaint.getColor() != color12) {
                Theme.chat_msgTextPaint.setColor(color12);
            }
            canvas3.restore();
        } else {
            z3 = false;
            f22 = 0.0f;
            f23 = 1.0f;
        }
        canvas3.restore();
        if (z5) {
            Matrix matrix = textMessageEnterTransition.gradientMatrix;
            float f63 = measuredHeight;
            matrix.setTranslate(f22, f63);
            textMessageEnterTransition.gradientShader.setLocalMatrix(matrix);
            canvas3.drawRect(0.0f, f63, messageEnterTransitionContainer.getMeasuredWidth(), messageEnterTransitionContainer.getMeasuredHeight(), textMessageEnterTransition.gradientPaint);
            canvas3.restore();
        }
        float f64 = textMessageEnterTransition.progress;
        float f65 = f64 > 0.4f ? 1.0f : f64 / 0.4f;
        ChatActivity.AnonymousClass39 anonymousClass39 = textMessageEnterTransition.enterView;
        if (f65 == f23) {
            anonymousClass39.setTextTransitionIsRunning(z3);
        }
        if (anonymousClass39.getSendButton().getVisibility() != 0 || f65 >= f23) {
            return;
        }
        View sendButton = anonymousClass39.getSendButton();
        ChatActivity.ChatActivityFragmentView chatActivityFragmentView = chatActivity.contentView;
        PointF pointF = textMessageEnterTransition.tmpPointF;
        ViewPositionWatcher.computeCoordinatesInParent(sendButton, chatActivityFragmentView, pointF);
        canvas3.save();
        canvas3.translate(pointF.x - messageEnterTransitionContainer.getX(), pointF.y - messageEnterTransitionContainer.getY());
        View sendButton2 = anonymousClass39.getSendButton();
        canvas3.saveLayerAlpha(0.0f, 0.0f, sendButton2.getWidth(), sendButton2.getHeight(), (int) ((f23 - f65) * 255.0f));
        sendButton2.draw(canvas3);
        canvas3.restore();
        canvas3.restore();
        canvas3.restore();
    }
}
