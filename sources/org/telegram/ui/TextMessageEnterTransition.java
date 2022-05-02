package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EmptyStubSpan;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.MessageEnterTransitionContainer;

public class TextMessageEnterTransition implements MessageEnterTransitionContainer.Transition {
    private int animationIndex;
    private ValueAnimator animator;
    boolean changeColor;
    private ChatActivity chatActivity;
    MessageEnterTransitionContainer container;
    boolean crossfade;
    Bitmap crossfadeTextBitmap;
    float crossfadeTextOffset;
    MessageObject currentMessageObject;
    boolean drawBitmaps;
    private float drawableFromBottom;
    float drawableFromTop;
    ChatActivityEnterView enterView;
    int fromColor;
    Drawable fromMessageDrawable;
    private float fromStartX;
    private float fromStartY;
    private Matrix gradientMatrix;
    private Paint gradientPaint;
    private LinearGradient gradientShader;
    boolean hasReply;
    StaticLayout layout;
    RecyclerListView listView;
    private int messageId;
    ChatMessageCell messageView;
    float progress;
    int replayFromColor;
    int replayObjectFromColor;
    float replyFromStartX;
    float replyFromStartY;
    float replyMessageDx;
    float replyNameDx;
    private final Theme.ResourcesProvider resourcesProvider;
    StaticLayout rtlLayout;
    private float scaleFrom;
    private float scaleY;
    Bitmap textLayoutBitmap;
    Bitmap textLayoutBitmapRtl;
    MessageObject.TextLayoutBlock textLayoutBlock;
    float textX;
    float textY;
    int toColor;
    float toXOffset;
    float toXOffsetRtl;
    Paint bitmapPaint = new Paint(1);
    boolean initBitmaps = false;
    private final int currentAccount = UserConfig.selectedAccount;

    @SuppressLint({"WrongConstant"})
    public TextMessageEnterTransition(final ChatMessageCell chatMessageCell, final ChatActivity chatActivity, RecyclerListView recyclerListView, final MessageEnterTransitionContainer messageEnterTransitionContainer, Theme.ResourcesProvider resourcesProvider) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        Theme.MessageDrawable currentBackgroundDrawable;
        this.drawBitmaps = false;
        this.animationIndex = -1;
        this.resourcesProvider = resourcesProvider;
        if (chatMessageCell.getMessageObject().textLayoutBlocks.size() <= 1 && !chatMessageCell.getMessageObject().textLayoutBlocks.isEmpty() && chatMessageCell.getMessageObject().textLayoutBlocks.get(0).textLayout.getLineCount() <= 10) {
            this.messageView = chatMessageCell;
            this.listView = recyclerListView;
            this.container = messageEnterTransitionContainer;
            this.chatActivity = chatActivity;
            this.enterView = chatActivity.getChatActivityEnterView();
            final ChatActivityEnterView chatActivityEnterView = chatActivity.getChatActivityEnterView();
            if (!(chatActivityEnterView == null || chatActivityEnterView.getEditField() == null || chatActivityEnterView.getEditField().getLayout() == null)) {
                float f = chatActivityEnterView.getRecordCicle().drawingCircleRadius;
                this.bitmapPaint.setFilterBitmap(true);
                this.currentMessageObject = chatMessageCell.getMessageObject();
                if (!chatMessageCell.getTransitionParams().wasDraw) {
                    chatMessageCell.draw(new Canvas());
                }
                chatMessageCell.setEnterTransitionInProgress(true);
                CharSequence text = chatActivityEnterView.getEditField().getLayout().getText();
                CharSequence charSequence = chatMessageCell.getMessageObject().messageText;
                this.crossfade = false;
                int height = chatActivityEnterView.getEditField().getLayout().getHeight();
                TextPaint textPaint = Theme.chat_msgTextPaint;
                int dp = AndroidUtilities.dp(20.0f);
                if (chatMessageCell.getMessageObject().getEmojiOnlyCount() != 0) {
                    if (chatMessageCell.getMessageObject().getEmojiOnlyCount() == 1) {
                        textPaint = Theme.chat_msgTextPaintOneEmoji;
                        dp = AndroidUtilities.dp(32.0f);
                    } else if (chatMessageCell.getMessageObject().getEmojiOnlyCount() == 2) {
                        textPaint = Theme.chat_msgTextPaintTwoEmoji;
                        dp = AndroidUtilities.dp(28.0f);
                    } else if (chatMessageCell.getMessageObject().getEmojiOnlyCount() == 3) {
                        textPaint = Theme.chat_msgTextPaintThreeEmoji;
                        dp = AndroidUtilities.dp(24.0f);
                    }
                }
                if (charSequence instanceof Spannable) {
                    for (Object obj : ((Spannable) charSequence).getSpans(0, charSequence.length(), Object.class)) {
                        if (!(obj instanceof Emoji.EmojiSpan)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (text.length() != charSequence.length() || z) {
                    this.crossfade = true;
                    String charSequence2 = text.toString();
                    String trim = charSequence2.trim();
                    int indexOf = charSequence2.indexOf(trim);
                    if (indexOf > 0) {
                        i = chatActivityEnterView.getEditField().getLayout().getLineTop(chatActivityEnterView.getEditField().getLayout().getLineForOffset(indexOf));
                        i2 = chatActivityEnterView.getEditField().getLayout().getLineBottom(chatActivityEnterView.getEditField().getLayout().getLineForOffset(indexOf + trim.length())) - i;
                    } else {
                        i2 = height;
                        i = 0;
                    }
                    charSequence = Emoji.replaceEmoji(trim, textPaint.getFontMetricsInt(), dp, false);
                } else {
                    i2 = height;
                    i = 0;
                }
                this.scaleFrom = chatActivityEnterView.getEditField().getTextSize() / textPaint.getTextSize();
                int lineCount = chatActivityEnterView.getEditField().getLayout().getLineCount();
                int width = (int) (chatActivityEnterView.getEditField().getLayout().getWidth() / this.scaleFrom);
                if (Build.VERSION.SDK_INT >= 24) {
                    this.layout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
                } else {
                    this.layout = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                float y = chatActivityEnterView.getY() + chatActivityEnterView.getEditField().getY() + ((View) chatActivityEnterView.getEditField().getParent()).getY() + ((View) chatActivityEnterView.getEditField().getParent().getParent()).getY();
                this.fromStartX = chatActivityEnterView.getX() + chatActivityEnterView.getEditField().getX() + ((View) chatActivityEnterView.getEditField().getParent()).getX() + ((View) chatActivityEnterView.getEditField().getParent().getParent()).getX();
                this.fromStartY = ((AndroidUtilities.dp(10.0f) + y) - chatActivityEnterView.getEditField().getScrollY()) + i;
                this.toXOffset = 0.0f;
                float f2 = Float.MAX_VALUE;
                for (int i5 = 0; i5 < this.layout.getLineCount(); i5++) {
                    float lineLeft = this.layout.getLineLeft(i5);
                    if (lineLeft < f2) {
                        f2 = lineLeft;
                    }
                }
                if (f2 != Float.MAX_VALUE) {
                    this.toXOffset = f2;
                }
                this.scaleY = i2 / (this.layout.getHeight() * this.scaleFrom);
                this.drawableFromTop = AndroidUtilities.dp(4.0f) + y;
                if (this.enterView.isTopViewVisible()) {
                    this.drawableFromTop -= AndroidUtilities.dp(12.0f);
                }
                this.drawableFromBottom = y + chatActivityEnterView.getEditField().getMeasuredHeight();
                MessageObject.TextLayoutBlock textLayoutBlock = chatMessageCell.getMessageObject().textLayoutBlocks.get(0);
                this.textLayoutBlock = textLayoutBlock;
                StaticLayout staticLayout = textLayoutBlock.textLayout;
                if (Math.abs(ColorUtils.calculateLuminance(getThemedColor("chat_messageTextOut")) - ColorUtils.calculateLuminance(getThemedColor("chat_messagePanelText"))) > 0.20000000298023224d) {
                    this.crossfade = true;
                    this.changeColor = true;
                }
                this.fromColor = getThemedColor("chat_messagePanelText");
                this.toColor = getThemedColor("chat_messageTextOut");
                if (staticLayout.getLineCount() == this.layout.getLineCount()) {
                    lineCount = staticLayout.getLineCount();
                    int i6 = 0;
                    i4 = 0;
                    i3 = 0;
                    while (true) {
                        if (i6 >= lineCount) {
                            break;
                        }
                        if (isRtlLine(this.layout, i6)) {
                            i3++;
                        } else {
                            i4++;
                        }
                        if (staticLayout.getLineEnd(i6) != this.layout.getLineEnd(i6)) {
                            this.crossfade = true;
                            break;
                        }
                        i6++;
                    }
                } else {
                    this.crossfade = true;
                    i4 = 0;
                    i3 = 0;
                }
                if (!this.crossfade && i3 > 0 && i4 > 0) {
                    SpannableString spannableString = new SpannableString(charSequence);
                    SpannableString spannableString2 = new SpannableString(charSequence);
                    float f3 = Float.MAX_VALUE;
                    for (int i7 = 0; i7 < lineCount; i7++) {
                        if (isRtlLine(this.layout, i7)) {
                            spannableString.setSpan(new EmptyStubSpan(), this.layout.getLineStart(i7), this.layout.getLineEnd(i7), 0);
                            float lineLeft2 = this.layout.getLineLeft(i7);
                            f3 = lineLeft2 < f3 ? lineLeft2 : f3;
                        } else {
                            spannableString2.setSpan(new EmptyStubSpan(), this.layout.getLineStart(i7), this.layout.getLineEnd(i7), 0);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        this.layout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
                        this.rtlLayout = StaticLayout.Builder.obtain(spannableString2, 0, spannableString2.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
                    } else {
                        TextPaint textPaint2 = textPaint;
                        this.layout = new StaticLayout(spannableString, textPaint2, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        this.rtlLayout = new StaticLayout(spannableString2, textPaint2, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                }
                this.toXOffsetRtl = this.layout.getWidth() - chatMessageCell.getMessageObject().textLayoutBlocks.get(0).textLayout.getWidth();
                try {
                    if (this.drawBitmaps) {
                        this.textLayoutBitmap = Bitmap.createBitmap(this.layout.getWidth(), this.layout.getHeight(), Bitmap.Config.ARGB_8888);
                        this.layout.draw(new Canvas(this.textLayoutBitmap));
                        StaticLayout staticLayout2 = this.rtlLayout;
                        if (staticLayout2 != null) {
                            this.textLayoutBitmapRtl = Bitmap.createBitmap(staticLayout2.getWidth(), this.rtlLayout.getHeight(), Bitmap.Config.ARGB_8888);
                            this.rtlLayout.draw(new Canvas(this.textLayoutBitmapRtl));
                        }
                        if (this.crossfade) {
                            if (chatMessageCell.getMeasuredHeight() < recyclerListView.getMeasuredHeight()) {
                                this.crossfadeTextOffset = 0.0f;
                                this.crossfadeTextBitmap = Bitmap.createBitmap(chatMessageCell.getMeasuredWidth(), chatMessageCell.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                            } else {
                                this.crossfadeTextOffset = chatMessageCell.getTop();
                                this.crossfadeTextBitmap = Bitmap.createBitmap(chatMessageCell.getMeasuredWidth(), recyclerListView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                            }
                        }
                    }
                } catch (Exception unused) {
                    this.drawBitmaps = false;
                }
                boolean z2 = (chatMessageCell.getMessageObject().getReplyMsgId() == 0 || chatMessageCell.replyNameLayout == null) ? false : true;
                this.hasReply = z2;
                if (z2) {
                    SimpleTextView replyNameTextView = chatActivity.getReplyNameTextView();
                    this.replyFromStartX = replyNameTextView.getX() + ((View) replyNameTextView.getParent()).getX();
                    this.replyFromStartY = replyNameTextView.getY() + ((View) replyNameTextView.getParent().getParent()).getY() + ((View) replyNameTextView.getParent().getParent().getParent()).getY();
                    SimpleTextView replyObjectTextView = chatActivity.getReplyObjectTextView();
                    replyObjectTextView.getY();
                    ((View) replyObjectTextView.getParent().getParent()).getY();
                    ((View) replyObjectTextView.getParent().getParent().getParent()).getY();
                    this.replayFromColor = chatActivity.getReplyNameTextView().getTextColor();
                    this.replayObjectFromColor = chatActivity.getReplyObjectTextView().getTextColor();
                    this.drawableFromTop -= AndroidUtilities.dp(46.0f);
                }
                this.gradientMatrix = new Matrix();
                Paint paint = new Paint(1);
                this.gradientPaint = paint;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                LinearGradient linearGradient = new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                this.gradientShader = linearGradient;
                this.gradientPaint.setShader(linearGradient);
                this.messageId = chatMessageCell.getMessageObject().stableId;
                chatActivityEnterView.getEditField().setAlpha(0.0f);
                chatActivityEnterView.setTextTransitionIsRunning(true);
                StaticLayout staticLayout3 = chatMessageCell.replyNameLayout;
                if (!(staticLayout3 == null || staticLayout3.getText().length() <= 1 || chatMessageCell.replyNameLayout.getPrimaryHorizontal(0) == 0.0f)) {
                    this.replyNameDx = chatMessageCell.replyNameLayout.getWidth() - chatMessageCell.replyNameLayout.getLineWidth(0);
                }
                StaticLayout staticLayout4 = chatMessageCell.replyTextLayout;
                if (!(staticLayout4 == null || staticLayout4.getText().length() < 1 || chatMessageCell.replyTextLayout.getPrimaryHorizontal(0) == 0.0f)) {
                    this.replyMessageDx = chatMessageCell.replyTextLayout.getWidth() - chatMessageCell.replyTextLayout.getLineWidth(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.animator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        TextMessageEnterTransition.this.lambda$new$0(chatActivityEnterView, messageEnterTransitionContainer, valueAnimator);
                    }
                });
                this.animator.setInterpolator(new LinearInterpolator());
                this.animator.setDuration(250L);
                messageEnterTransitionContainer.addTransition(this);
                this.animationIndex = NotificationCenter.getInstance(this.currentAccount).setAnimationInProgress(this.animationIndex, null);
                this.animator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        NotificationCenter.getInstance(TextMessageEnterTransition.this.currentAccount).onAnimationFinish(TextMessageEnterTransition.this.animationIndex);
                        messageEnterTransitionContainer.removeTransition(TextMessageEnterTransition.this);
                        chatMessageCell.setEnterTransitionInProgress(false);
                        chatActivityEnterView.setTextTransitionIsRunning(false);
                        chatActivityEnterView.getEditField().setAlpha(1.0f);
                        chatActivity.getReplyNameTextView().setAlpha(1.0f);
                        chatActivity.getReplyObjectTextView().setAlpha(1.0f);
                    }
                });
                if (SharedConfig.getDevicePerformanceClass() == 2 && (currentBackgroundDrawable = chatMessageCell.getCurrentBackgroundDrawable(true)) != null) {
                    this.fromMessageDrawable = currentBackgroundDrawable.getTransitionDrawable(getThemedColor("chat_messagePanelBackground"));
                }
            }
        }
    }

    public void lambda$new$0(ChatActivityEnterView chatActivityEnterView, MessageEnterTransitionContainer messageEnterTransitionContainer, ValueAnimator valueAnimator) {
        this.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        chatActivityEnterView.getEditField().setAlpha(this.progress);
        messageEnterTransitionContainer.invalidate();
    }

    public void start() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    private boolean isRtlLine(Layout layout, int i) {
        return layout.getLineRight(i) == ((float) layout.getWidth()) && layout.getLineLeft(i) != 0.0f;
    }

    @Override
    public void onDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TextMessageEnterTransition.onDraw(android.graphics.Canvas):void");
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
