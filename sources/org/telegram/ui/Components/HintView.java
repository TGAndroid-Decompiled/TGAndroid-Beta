package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;

public class HintView extends FrameLayout {
    public AnimatorSet animatorSet;
    public final ImageView arrowImageView;
    public int bottomOffset;
    public final int currentType;
    public View currentView;
    public float extraTranslationY;
    public boolean hasCloseButton;
    public Runnable hideRunnable;
    public ImageView imageView;
    public final boolean isTopArrow;
    public ChatMessageCell messageCell;
    public String overrideText;
    public final Theme.ResourcesProvider resourcesProvider;
    public long showingDuration;
    public int shownY;
    public final ArticleViewer.AnonymousClass9 textView;
    public float translationY;
    public boolean useScale;

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final HintView this$0;

        public AnonymousClass1(HintView hintView, int i) {
            this.$r8$classId = i;
            this.this$0 = hintView;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    HintView hintView = this.this$0;
                    hintView.animatorSet = null;
                    if (!hintView.hasCloseButton) {
                        HintView$1$$ExternalSyntheticLambda0 hintView$1$$ExternalSyntheticLambda0 = new HintView$1$$ExternalSyntheticLambda0(this, 0);
                        hintView.hideRunnable = hintView$1$$ExternalSyntheticLambda0;
                        AndroidUtilities.runOnUIThread(hintView$1$$ExternalSyntheticLambda0, hintView.currentType == 0 ? 10000L : 2000L);
                    }
                    break;
                case 1:
                    HintView hintView2 = this.this$0;
                    hintView2.animatorSet = null;
                    if (!hintView2.hasCloseButton) {
                        HintView$1$$ExternalSyntheticLambda0 hintView$1$$ExternalSyntheticLambda1 = new HintView$1$$ExternalSyntheticLambda0(this, 14);
                        hintView2.hideRunnable = hintView$1$$ExternalSyntheticLambda1;
                        AndroidUtilities.runOnUIThread(hintView$1$$ExternalSyntheticLambda1, hintView2.showingDuration);
                    }
                    break;
                default:
                    HintView hintView3 = this.this$0;
                    hintView3.setVisibility(4);
                    hintView3.getClass();
                    hintView3.currentView = null;
                    hintView3.messageCell = null;
                    hintView3.animatorSet = null;
                    break;
            }
        }
    }

    public interface VisibilityListener {
    }

    public HintView(Activity activity) {
        this(9, activity, null, false);
    }

    public final void createCloseButton() {
        this.textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        this.hasCloseButton = true;
        ImageView imageView = new ImageView(getContext());
        this.imageView = imageView;
        imageView.setImageResource(R.drawable.msg_mini_close_tooltip);
        this.imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.imageView.setColorFilter(new PorterDuffColorFilter(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chat_gifSaveHintText, this.resourcesProvider), 125), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.imageView;
        boolean z = this.isTopArrow;
        addView(imageView2, LayoutHelper.createFrame(34, 34.0f, 21, 0.0f, z ? 3.0f : 0.0f, 0.0f, z ? 0.0f : 3.0f));
        setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 29));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getBaseTranslationY() {
        return this.translationY;
    }

    public ChatMessageCell getMessageCell() {
        return this.messageCell;
    }

    public final void hide(boolean z) {
        int i = 2;
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.hideRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.hideRunnable = null;
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.animatorSet = null;
        }
        if (!z) {
            setVisibility(4);
            this.currentView = null;
            this.messageCell = null;
            this.animatorSet = null;
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.animatorSet = animatorSet2;
        boolean z2 = this.useScale;
        Property property = View.ALPHA;
        if (z2) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<HintView, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, (Property<HintView, Float>) View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, (Property<HintView, Float>) View.SCALE_X, 1.0f, 0.5f));
            this.animatorSet.setDuration(150L);
            this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<HintView, Float>) property, 0.0f));
            this.animatorSet.setDuration(300L);
        }
        this.animatorSet.addListener(new AnonymousClass1(this, i));
        this.animatorSet.start();
    }

    public int offsetCx() {
        return 0;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void setBackgroundColor() {
        ArticleViewer.AnonymousClass9 anonymousClass9 = this.textView;
        anonymousClass9.setTextColor(-1);
        this.arrowImageView.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i = this.currentType;
        anonymousClass9.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp((i == 7 || i == 8) ? 6.0f : 3.0f), -366530760));
    }

    public void setBottomOffset(int i) {
        this.bottomOffset = i;
    }

    public void setExtraTranslationY(float f) {
        this.extraTranslationY = f;
        setTranslationY(f + this.translationY);
    }

    public void setOverrideText(String str) {
        this.overrideText = str;
        this.textView.setText(str);
        ChatMessageCell chatMessageCell = this.messageCell;
        if (chatMessageCell != null) {
            this.messageCell = null;
            showForMessageCell(chatMessageCell, null, 0, 0, false);
        }
    }

    public void setShowingDuration(long j) {
        this.showingDuration = j;
    }

    public void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public void setUseScale(boolean z) {
        this.useScale = z;
    }

    public void setVisibleListener(VisibilityListener visibilityListener) {
    }

    public final boolean showForMessageCell(ChatMessageCell chatMessageCell, Integer num, int i, int i2, boolean z) {
        float f;
        int imageY;
        int iDp;
        int forwardNameCenterX;
        int measuredWidth;
        int left;
        int iDp2;
        ImageView imageView;
        float measuredWidth2;
        AnimatorSet animatorSet;
        int i3 = 0;
        int i4 = this.currentType;
        if ((i4 != 5 || i2 != this.shownY || this.messageCell != chatMessageCell) && (i4 == 5 || ((i4 != 0 || getTag() == null) && this.messageCell != chatMessageCell))) {
            Runnable runnable = this.hideRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.hideRunnable = null;
            }
            int[] iArr = new int[2];
            chatMessageCell.getLocationInWindow(iArr);
            int i5 = iArr[1];
            ((View) getParent()).getLocationInWindow(iArr);
            int i6 = i5 - iArr[1];
            View view = (View) chatMessageCell.getParent();
            boolean z2 = this.isTopArrow;
            if (i4 != 0) {
                f = 10.0f;
                ArticleViewer.AnonymousClass9 anonymousClass9 = this.textView;
                if (i4 == 5) {
                    imageY = i6 + i2;
                    this.shownY = i2;
                    MessageObject messageObject = chatMessageCell.getMessageObject();
                    if (messageObject != null && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(messageObject);
                        if (MessageObject.isVoted(tL_messageMediaPoll) && !MessageObject.isVoteResultsIsNotEmpty(tL_messageMediaPoll)) {
                            TLRPC.Poll poll = tL_messageMediaPoll.poll;
                            if (!poll.closed && poll.hide_results_until_close) {
                                anonymousClass9.setText(LocaleController.getString(R.string.PollResultsWillLater));
                            } else if (num.intValue() == -1) {
                                anonymousClass9.setText(LocaleController.getString(R.string.PollSelectOption));
                            }
                        } else if (num.intValue() == -1) {
                            anonymousClass9.setText(LocaleController.getString(R.string.PollSelectOption));
                        }
                    } else if (num.intValue() == -1) {
                        anonymousClass9.setText(LocaleController.getString(R.string.PollSelectOption));
                    }
                    measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                    forwardNameCenterX = i;
                    measuredWidth = view.getMeasuredWidth();
                    if (z2) {
                        float f2 = this.extraTranslationY;
                        float fDp = AndroidUtilities.dp(44.0f);
                        this.translationY = fDp;
                        setTranslationY(f2 + fDp);
                    } else {
                        float f3 = this.extraTranslationY;
                        float measuredHeight = imageY - getMeasuredHeight();
                        this.translationY = measuredHeight;
                        setTranslationY(f3 + measuredHeight);
                    }
                    left = chatMessageCell.getLeft() + forwardNameCenterX;
                    iDp2 = AndroidUtilities.dp(19.0f);
                    if (i4 == 5) {
                        int iM = BotFullscreenButtons$$ExternalSyntheticOutline1.m(forwardNameCenterX - (getMeasuredWidth() / 2), 19.1f, 0);
                        setTranslationX(iM);
                        iDp2 += iM;
                    } else if (left > view.getMeasuredWidth() / 2) {
                        int measuredWidth3 = (measuredWidth - getMeasuredWidth()) - AndroidUtilities.dp(38.0f);
                        setTranslationX(measuredWidth3);
                        iDp2 += measuredWidth3;
                    } else {
                        setTranslationX(0.0f);
                    }
                    int left2 = (chatMessageCell.getLeft() + forwardNameCenterX) - iDp2;
                    imageView = this.arrowImageView;
                    measuredWidth2 = left2 - (imageView.getMeasuredWidth() / 2);
                    imageView.setTranslationX(measuredWidth2);
                    if (left > view.getMeasuredWidth() / 2) {
                        if (measuredWidth2 < AndroidUtilities.dp(f)) {
                            float fDp2 = measuredWidth2 - AndroidUtilities.dp(f);
                            setTranslationX(getTranslationX() + fDp2);
                            imageView.setTranslationX(measuredWidth2 - fDp2);
                        }
                    } else if (measuredWidth2 > getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                        float measuredWidth4 = (measuredWidth2 - getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                        setTranslationX(measuredWidth4);
                        imageView.setTranslationX(measuredWidth2 - measuredWidth4);
                    } else if (measuredWidth2 < AndroidUtilities.dp(f)) {
                        float fDp3 = measuredWidth2 - AndroidUtilities.dp(f);
                        setTranslationX(getTranslationX() + fDp3);
                        imageView.setTranslationX(measuredWidth2 - fDp3);
                    }
                    this.messageCell = chatMessageCell;
                    animatorSet = this.animatorSet;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.animatorSet = null;
                    }
                    setTag(1);
                    setVisibility(0);
                    if (z) {
                        setAlpha(1.0f);
                        return true;
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.animatorSet = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<HintView, Float>) View.ALPHA, 0.0f, 1.0f));
                    this.animatorSet.addListener(new AnonymousClass1(this, i3));
                    this.animatorSet.setDuration(300L);
                    this.animatorSet.start();
                    return true;
                }
                MessageObject messageObject2 = chatMessageCell.getMessageObject();
                String str = this.overrideText;
                if (str == null) {
                    anonymousClass9.setText(LocaleController.getString(R.string.HidAccount));
                } else {
                    anonymousClass9.setText(str);
                }
                measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                TLRPC.User currentUser = chatMessageCell.getCurrentUser();
                if (currentUser == null || currentUser.id != 0) {
                    int iDp3 = AndroidUtilities.dp(22.0f) + i6;
                    if (messageObject2.isOutOwner() || !chatMessageCell.drawNameLayout || chatMessageCell.nameLayout == null) {
                        imageY = iDp3;
                    } else {
                        iDp = AndroidUtilities.dp(20.0f) + iDp3;
                    }
                    if (!z2 || imageY > AndroidUtilities.dp(10.0f) + getMeasuredHeight()) {
                        forwardNameCenterX = chatMessageCell.getForwardNameCenterX();
                        measuredWidth = view.getMeasuredWidth();
                        if (z2) {
                            float f4 = this.extraTranslationY;
                            float fDp4 = AndroidUtilities.dp(44.0f);
                            this.translationY = fDp4;
                            setTranslationY(f4 + fDp4);
                        } else {
                            float f5 = this.extraTranslationY;
                            float measuredHeight2 = imageY - getMeasuredHeight();
                            this.translationY = measuredHeight2;
                            setTranslationY(f5 + measuredHeight2);
                        }
                        left = chatMessageCell.getLeft() + forwardNameCenterX;
                        iDp2 = AndroidUtilities.dp(19.0f);
                        if (i4 == 5) {
                            int iM2 = BotFullscreenButtons$$ExternalSyntheticOutline1.m(forwardNameCenterX - (getMeasuredWidth() / 2), 19.1f, 0);
                            setTranslationX(iM2);
                            iDp2 += iM2;
                        } else if (left > view.getMeasuredWidth() / 2) {
                            int measuredWidth5 = (measuredWidth - getMeasuredWidth()) - AndroidUtilities.dp(38.0f);
                            setTranslationX(measuredWidth5);
                            iDp2 += measuredWidth5;
                        } else {
                            setTranslationX(0.0f);
                        }
                        int left3 = (chatMessageCell.getLeft() + forwardNameCenterX) - iDp2;
                        imageView = this.arrowImageView;
                        measuredWidth2 = left3 - (imageView.getMeasuredWidth() / 2);
                        imageView.setTranslationX(measuredWidth2);
                        if (left > view.getMeasuredWidth() / 2) {
                            if (measuredWidth2 < AndroidUtilities.dp(f)) {
                                float fDp5 = measuredWidth2 - AndroidUtilities.dp(f);
                                setTranslationX(getTranslationX() + fDp5);
                                imageView.setTranslationX(measuredWidth2 - fDp5);
                            }
                        } else if (measuredWidth2 > getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                            float measuredWidth6 = (measuredWidth2 - getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                            setTranslationX(measuredWidth6);
                            imageView.setTranslationX(measuredWidth2 - measuredWidth6);
                        } else if (measuredWidth2 < AndroidUtilities.dp(f)) {
                            float fDp6 = measuredWidth2 - AndroidUtilities.dp(f);
                            setTranslationX(getTranslationX() + fDp6);
                            imageView.setTranslationX(measuredWidth2 - fDp6);
                        }
                        this.messageCell = chatMessageCell;
                        animatorSet = this.animatorSet;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.animatorSet = null;
                        }
                        setTag(1);
                        setVisibility(0);
                        if (z) {
                            setAlpha(1.0f);
                            return true;
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.animatorSet = animatorSet3;
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this, (Property<HintView, Float>) View.ALPHA, 0.0f, 1.0f));
                        this.animatorSet.addListener(new AnonymousClass1(this, i3));
                        this.animatorSet.setDuration(300L);
                        this.animatorSet.start();
                        return true;
                    }
                } else {
                    iDp = zzlb.m(chatMessageCell.getMeasuredHeight() - Math.max(0, chatMessageCell.getBottom() - view.getMeasuredHeight()), 50.0f, i6);
                }
                imageY = iDp;
                if (!z2) {
                }
                forwardNameCenterX = chatMessageCell.getForwardNameCenterX();
                measuredWidth = view.getMeasuredWidth();
                if (z2) {
                    float f6 = this.extraTranslationY;
                    float fDp7 = AndroidUtilities.dp(44.0f);
                    this.translationY = fDp7;
                    setTranslationY(f6 + fDp7);
                } else {
                    float f7 = this.extraTranslationY;
                    float measuredHeight3 = imageY - getMeasuredHeight();
                    this.translationY = measuredHeight3;
                    setTranslationY(f7 + measuredHeight3);
                }
                left = chatMessageCell.getLeft() + forwardNameCenterX;
                iDp2 = AndroidUtilities.dp(19.0f);
                if (i4 == 5) {
                    int iM3 = BotFullscreenButtons$$ExternalSyntheticOutline1.m(forwardNameCenterX - (getMeasuredWidth() / 2), 19.1f, 0);
                    setTranslationX(iM3);
                    iDp2 += iM3;
                } else if (left > view.getMeasuredWidth() / 2) {
                    int measuredWidth7 = (measuredWidth - getMeasuredWidth()) - AndroidUtilities.dp(38.0f);
                    setTranslationX(measuredWidth7);
                    iDp2 += measuredWidth7;
                } else {
                    setTranslationX(0.0f);
                }
                int left4 = (chatMessageCell.getLeft() + forwardNameCenterX) - iDp2;
                imageView = this.arrowImageView;
                measuredWidth2 = left4 - (imageView.getMeasuredWidth() / 2);
                imageView.setTranslationX(measuredWidth2);
                if (left > view.getMeasuredWidth() / 2) {
                    if (measuredWidth2 < AndroidUtilities.dp(f)) {
                        float fDp8 = measuredWidth2 - AndroidUtilities.dp(f);
                        setTranslationX(getTranslationX() + fDp8);
                        imageView.setTranslationX(measuredWidth2 - fDp8);
                    }
                } else if (measuredWidth2 > getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                    float measuredWidth8 = (measuredWidth2 - getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                    setTranslationX(measuredWidth8);
                    imageView.setTranslationX(measuredWidth2 - measuredWidth8);
                } else if (measuredWidth2 < AndroidUtilities.dp(f)) {
                    float fDp9 = measuredWidth2 - AndroidUtilities.dp(f);
                    setTranslationX(getTranslationX() + fDp9);
                    imageView.setTranslationX(measuredWidth2 - fDp9);
                }
                this.messageCell = chatMessageCell;
                animatorSet = this.animatorSet;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.animatorSet = null;
                }
                setTag(1);
                setVisibility(0);
                if (z) {
                    setAlpha(1.0f);
                    return true;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.animatorSet = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, (Property<HintView, Float>) View.ALPHA, 0.0f, 1.0f));
                this.animatorSet.addListener(new AnonymousClass1(this, i3));
                this.animatorSet.setDuration(300L);
                this.animatorSet.start();
                return true;
            }
            ImageReceiver photoImage = chatMessageCell.getPhotoImage();
            imageY = (int) (photoImage.getImageY() + i6);
            int imageHeight = (int) photoImage.getImageHeight();
            int i7 = imageY + imageHeight;
            int measuredHeight4 = view.getMeasuredHeight();
            f = 10.0f;
            if (imageY > AndroidUtilities.dp(10.0f) + getMeasuredHeight() && i7 <= (imageHeight / 4) + measuredHeight4) {
                forwardNameCenterX = chatMessageCell.getNoSoundIconCenterX();
                measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                measuredWidth = view.getMeasuredWidth();
                if (z2) {
                    float f8 = this.extraTranslationY;
                    float fDp10 = AndroidUtilities.dp(44.0f);
                    this.translationY = fDp10;
                    setTranslationY(f8 + fDp10);
                } else {
                    float f9 = this.extraTranslationY;
                    float measuredHeight5 = imageY - getMeasuredHeight();
                    this.translationY = measuredHeight5;
                    setTranslationY(f9 + measuredHeight5);
                }
                left = chatMessageCell.getLeft() + forwardNameCenterX;
                iDp2 = AndroidUtilities.dp(19.0f);
                if (i4 == 5) {
                    int iM4 = BotFullscreenButtons$$ExternalSyntheticOutline1.m(forwardNameCenterX - (getMeasuredWidth() / 2), 19.1f, 0);
                    setTranslationX(iM4);
                    iDp2 += iM4;
                } else if (left > view.getMeasuredWidth() / 2) {
                    int measuredWidth9 = (measuredWidth - getMeasuredWidth()) - AndroidUtilities.dp(38.0f);
                    setTranslationX(measuredWidth9);
                    iDp2 += measuredWidth9;
                } else {
                    setTranslationX(0.0f);
                }
                int left5 = (chatMessageCell.getLeft() + forwardNameCenterX) - iDp2;
                imageView = this.arrowImageView;
                measuredWidth2 = left5 - (imageView.getMeasuredWidth() / 2);
                imageView.setTranslationX(measuredWidth2);
                if (left > view.getMeasuredWidth() / 2) {
                    if (measuredWidth2 < AndroidUtilities.dp(f)) {
                        float fDp11 = measuredWidth2 - AndroidUtilities.dp(f);
                        setTranslationX(getTranslationX() + fDp11);
                        imageView.setTranslationX(measuredWidth2 - fDp11);
                    }
                } else if (measuredWidth2 > getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                    float measuredWidth10 = (measuredWidth2 - getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                    setTranslationX(measuredWidth10);
                    imageView.setTranslationX(measuredWidth2 - measuredWidth10);
                } else if (measuredWidth2 < AndroidUtilities.dp(f)) {
                    float fDp12 = measuredWidth2 - AndroidUtilities.dp(f);
                    setTranslationX(getTranslationX() + fDp12);
                    imageView.setTranslationX(measuredWidth2 - fDp12);
                }
                this.messageCell = chatMessageCell;
                animatorSet = this.animatorSet;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.animatorSet = null;
                }
                setTag(1);
                setVisibility(0);
                if (z) {
                    setAlpha(1.0f);
                    return true;
                }
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.animatorSet = animatorSet5;
                animatorSet5.playTogether(ObjectAnimator.ofFloat(this, (Property<HintView, Float>) View.ALPHA, 0.0f, 1.0f));
                this.animatorSet.addListener(new AnonymousClass1(this, i3));
                this.animatorSet.setDuration(300L);
                this.animatorSet.start();
                return true;
            }
        }
        return false;
    }

    public final void showForView(View view, boolean z) {
        int i = 1;
        if (this.currentView == view || getTag() != null) {
            if (getTag() != null) {
                updatePosition(view);
                return;
            }
            return;
        }
        Runnable runnable = this.hideRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.hideRunnable = null;
        }
        updatePosition(view);
        this.currentView = view;
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.animatorSet = null;
        }
        setTag(1);
        setVisibility(0);
        if (!z) {
            setAlpha(1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.animatorSet = animatorSet2;
        boolean z2 = this.useScale;
        Property property = View.ALPHA;
        if (z2) {
            ImageView imageView = this.arrowImageView;
            setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
            setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
            this.animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<HintView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, (Property<HintView, Float>) View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, (Property<HintView, Float>) View.SCALE_X, 0.5f, 1.0f));
            this.animatorSet.setDuration(350L);
            this.animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<HintView, Float>) property, 0.0f, 1.0f));
            this.animatorSet.setDuration(300L);
        }
        this.animatorSet.addListener(new AnonymousClass1(this, i));
        this.animatorSet.start();
    }

    public final void updatePosition(View view) {
        int measuredWidth;
        int i;
        int i2;
        int measuredWidth2;
        measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int iDp = iArr[1] - AndroidUtilities.dp(4.0f);
        boolean z = this.isTopArrow;
        int i3 = this.currentType;
        if (i3 == 4) {
            iDp += AndroidUtilities.dp(4.0f);
        } else if (i3 == 6 && z) {
            iDp = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(getMeasuredHeight() + view.getMeasuredHeight(), 10.0f, iDp);
        } else if (i3 == 7 || (i3 == 8 && z)) {
            iDp = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(getMeasuredHeight() + view.getMeasuredHeight(), 8.0f, iDp);
        } else if (i3 == 8) {
            iDp -= AndroidUtilities.dp(10.0f);
        }
        int measuredWidth3 = 0;
        if (i3 != 8 || !z) {
            measuredWidth = i3 == 3 ? iArr[0] : (view.getMeasuredWidth() / 2) + iArr[0];
        } else if (view instanceof SimpleTextView) {
            SimpleTextView simpleTextView = (SimpleTextView) view;
            Drawable rightDrawable = simpleTextView.getRightDrawable();
            measuredWidth = (iArr[0] + (rightDrawable != null ? rightDrawable.getBounds().centerX() : simpleTextView.getTextWidth() / 2)) - AndroidUtilities.dp(8.0f);
        } else {
            measuredWidth = view instanceof TextView ? (((TextView) view).getMeasuredWidth() + iArr[0]) - AndroidUtilities.dp(16.5f) : iArr[0];
        }
        View view2 = (View) getParent();
        view2.getLocationInWindow(iArr);
        int i4 = measuredWidth - iArr[0];
        int i5 = (iDp - iArr[1]) - this.bottomOffset;
        int iOffsetCx = offsetCx() + i4;
        int measuredWidth4 = view2.getMeasuredWidth();
        if (!z || i3 == 6 || i3 == 7 || i3 == 8) {
            float f = this.extraTranslationY;
            float measuredHeight = i5 - getMeasuredHeight();
            this.translationY = measuredHeight;
            setTranslationY(f + measuredHeight);
        } else {
            float f2 = this.extraTranslationY;
            float fDp = AndroidUtilities.dp(44.0f);
            this.translationY = fDp;
            setTranslationY(f2 + fDp);
        }
        if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            i = ((ViewGroup.MarginLayoutParams) getLayoutParams()).leftMargin;
            i2 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).rightMargin;
        } else {
            i = 0;
            i2 = 0;
        }
        ImageView imageView = this.arrowImageView;
        if (i3 == 8 && !z) {
            measuredWidth3 = (((measuredWidth4 - i) - i2) - getMeasuredWidth()) / 2;
        } else if (iOffsetCx > view2.getMeasuredWidth() / 2) {
            if (i3 == 3) {
                measuredWidth2 = (int) (measuredWidth4 - (getMeasuredWidth() * 1.5f));
                if (measuredWidth2 >= 0) {
                    measuredWidth3 = measuredWidth2;
                }
            } else {
                measuredWidth3 = (measuredWidth4 - getMeasuredWidth()) - (i2 + i);
            }
        } else if (i3 == 3 && (measuredWidth2 = (iOffsetCx - (getMeasuredWidth() / 2)) - imageView.getMeasuredWidth()) >= 0) {
            measuredWidth3 = measuredWidth2;
        }
        setTranslationX(measuredWidth3);
        float measuredWidth5 = (iOffsetCx - (i + measuredWidth3)) - (imageView.getMeasuredWidth() / 2.0f);
        if (i3 == 7) {
            measuredWidth5 += AndroidUtilities.dp(2.0f);
        }
        imageView.setTranslationX(measuredWidth5);
        if (iOffsetCx > view2.getMeasuredWidth() / 2) {
            if (measuredWidth5 < AndroidUtilities.dp(10.0f)) {
                float fDp2 = measuredWidth5 - AndroidUtilities.dp(10.0f);
                setTranslationX(getTranslationX() + fDp2);
                imageView.setTranslationX(measuredWidth5 - fDp2);
                return;
            }
            return;
        }
        if (measuredWidth5 > getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
            float measuredWidth6 = (measuredWidth5 - getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
            setTranslationX(measuredWidth6);
            imageView.setTranslationX(measuredWidth5 - measuredWidth6);
        } else if (measuredWidth5 < AndroidUtilities.dp(10.0f)) {
            float fDp3 = measuredWidth5 - AndroidUtilities.dp(10.0f);
            setTranslationX(getTranslationX() + fDp3);
            imageView.setTranslationX(measuredWidth5 - fDp3);
        }
    }

    public HintView(Activity activity, Theme.ResourcesProvider resourcesProvider) {
        this(2, activity, resourcesProvider, false);
    }

    public HintView(int i, Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        this.showingDuration = 2000L;
        this.resourcesProvider = resourcesProvider;
        this.currentType = i;
        this.isTopArrow = z;
        ArticleViewer.AnonymousClass9 anonymousClass9 = new ArticleViewer.AnonymousClass9(context, 11);
        this.textView = anonymousClass9;
        int i2 = Theme.key_chat_gifSaveHintText;
        anonymousClass9.setTextColor(Theme.getColor(i2, resourcesProvider));
        anonymousClass9.setTextSize(1, 14.0f);
        anonymousClass9.setMaxLines(2);
        if (i == 7 || i == 8 || i == 9) {
            anonymousClass9.setMaxWidth(AndroidUtilities.dp(310.0f));
        } else if (i == 4) {
            anonymousClass9.setMaxWidth(AndroidUtilities.dp(280.0f));
        } else {
            anonymousClass9.setMaxWidth(AndroidUtilities.dp(250.0f));
        }
        if (i == 3) {
            anonymousClass9.setGravity(19);
            anonymousClass9.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(5.0f), Theme.getColor(Theme.key_chat_gifSaveHintBackground, resourcesProvider)));
            anonymousClass9.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            addView(anonymousClass9, LayoutHelper.createFrame(-2, 30.0f, 51, 0.0f, z ? 6.0f : 0.0f, 0.0f, z ? 0.0f : 6.0f));
        } else {
            anonymousClass9.setGravity(51);
            anonymousClass9.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), Theme.getColor(Theme.key_chat_gifSaveHintBackground, resourcesProvider)));
            anonymousClass9.setPadding(AndroidUtilities.dp(i == 0 ? 54.0f : 12.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f));
            addView(anonymousClass9, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, z ? 6.0f : 0.0f, 0.0f, z ? 0.0f : 6.0f));
        }
        if (i == 0) {
            anonymousClass9.setText(LocaleController.getString(R.string.AutoplayVideoInfo));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setImageResource(R.drawable.tooltip_sound);
            this.imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            addView(this.imageView, LayoutHelper.createFrame(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.arrowImageView = imageView2;
        imageView2.setImageResource(z ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_gifSaveHintBackground, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        addView(imageView2, LayoutHelper.createFrame(14, 6.0f, (z ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }
}
