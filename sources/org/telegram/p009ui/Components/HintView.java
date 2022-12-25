package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Cells.ChatMessageCell;
import org.telegram.p009ui.Components.HintView;
import org.telegram.tgnet.TLRPC$User;

public class HintView extends FrameLayout {
    private AnimatorSet animatorSet;
    private ImageView arrowImageView;
    private int bottomOffset;
    private int currentType;
    private View currentView;
    private float extraTranslationY;
    private Runnable hideRunnable;
    private ImageView imageView;
    private boolean isTopArrow;
    private ChatMessageCell messageCell;
    private String overrideText;
    private final Theme.ResourcesProvider resourcesProvider;
    private long showingDuration;
    private int shownY;
    public TextView textView;
    private float translationY;

    public HintView(Context context, int i) {
        this(context, i, false, null);
    }

    public HintView(Context context, int i, boolean z) {
        this(context, i, z, null);
    }

    public HintView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        this(context, i, false, resourcesProvider);
    }

    public HintView(Context context, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.showingDuration = 2000L;
        this.resourcesProvider = resourcesProvider;
        this.currentType = i;
        this.isTopArrow = z;
        CorrectlyMeasuringTextView correctlyMeasuringTextView = new CorrectlyMeasuringTextView(context);
        this.textView = correctlyMeasuringTextView;
        correctlyMeasuringTextView.setTextColor(getThemedColor("chat_gifSaveHintText"));
        this.textView.setTextSize(1, 14.0f);
        this.textView.setMaxLines(2);
        if (i == 7 || i == 8 || i == 9) {
            this.textView.setMaxWidth(AndroidUtilities.m35dp(310.0f));
        } else if (i == 4) {
            this.textView.setMaxWidth(AndroidUtilities.m35dp(280.0f));
        } else {
            this.textView.setMaxWidth(AndroidUtilities.m35dp(250.0f));
        }
        if (this.currentType == 3) {
            this.textView.setGravity(19);
            this.textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.m35dp(5.0f), getThemedColor("chat_gifSaveHintBackground")));
            this.textView.setPadding(AndroidUtilities.m35dp(10.0f), 0, AndroidUtilities.m35dp(10.0f), 0);
            addView(this.textView, LayoutHelper.createFrame(-2, 30.0f, 51, 0.0f, z ? 6.0f : 0.0f, 0.0f, z ? 0.0f : 6.0f));
        } else {
            this.textView.setGravity(51);
            this.textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.m35dp(6.0f), getThemedColor("chat_gifSaveHintBackground")));
            this.textView.setPadding(AndroidUtilities.m35dp(this.currentType == 0 ? 54.0f : 8.0f), AndroidUtilities.m35dp(7.0f), AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f));
            addView(this.textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, z ? 6.0f : 0.0f, 0.0f, z ? 0.0f : 6.0f));
        }
        if (i == 0) {
            this.textView.setText(LocaleController.getString("AutoplayVideoInfo", C1072R.string.AutoplayVideoInfo));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setImageResource(C1072R.C1073drawable.tooltip_sound);
            this.imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor("chat_gifSaveHintText"), PorterDuff.Mode.MULTIPLY));
            addView(this.imageView, LayoutHelper.createFrame(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.arrowImageView = imageView2;
        imageView2.setImageResource(z ? C1072R.C1073drawable.tooltip_arrow_up : C1072R.C1073drawable.tooltip_arrow);
        this.arrowImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor("chat_gifSaveHintBackground"), PorterDuff.Mode.MULTIPLY));
        addView(this.arrowImageView, LayoutHelper.createFrame(14, 6.0f, (z ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setBackgroundColor(int i, int i2) {
        this.textView.setTextColor(i2);
        this.arrowImageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        TextView textView = this.textView;
        int i3 = this.currentType;
        textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.m35dp((i3 == 7 || i3 == 8) ? 6.0f : 3.0f), i));
    }

    public void setOverrideText(String str) {
        this.overrideText = str;
        this.textView.setText(str);
        ChatMessageCell chatMessageCell = this.messageCell;
        if (chatMessageCell != null) {
            this.messageCell = null;
            showForMessageCell(chatMessageCell, false);
        }
    }

    public void setExtraTranslationY(float f) {
        this.extraTranslationY = f;
        setTranslationY(f + this.translationY);
    }

    public float getBaseTranslationY() {
        return this.translationY;
    }

    public boolean showForMessageCell(ChatMessageCell chatMessageCell, boolean z) {
        return showForMessageCell(chatMessageCell, null, 0, 0, z);
    }

    public boolean showForMessageCell(ChatMessageCell chatMessageCell, Object obj, int i, int i2, boolean z) {
        int m35dp;
        int forwardNameCenterX;
        int i3 = this.currentType;
        if (!(i3 == 5 && i2 == this.shownY && this.messageCell == chatMessageCell) && (i3 == 5 || ((i3 != 0 || getTag() == null) && this.messageCell != chatMessageCell))) {
            Runnable runnable = this.hideRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.hideRunnable = null;
            }
            int[] iArr = new int[2];
            chatMessageCell.getLocationInWindow(iArr);
            int i4 = iArr[1];
            ((View) getParent()).getLocationInWindow(iArr);
            int i5 = i4 - iArr[1];
            View view = (View) chatMessageCell.getParent();
            int i6 = this.currentType;
            if (i6 == 0) {
                ImageReceiver photoImage = chatMessageCell.getPhotoImage();
                m35dp = (int) (i5 + photoImage.getImageY());
                int imageHeight = (int) photoImage.getImageHeight();
                int i7 = m35dp + imageHeight;
                int measuredHeight = view.getMeasuredHeight();
                if (m35dp <= getMeasuredHeight() + AndroidUtilities.m35dp(10.0f) || i7 > measuredHeight + (imageHeight / 4)) {
                    return false;
                }
                forwardNameCenterX = chatMessageCell.getNoSoundIconCenterX();
            } else if (i6 == 5) {
                Integer num = (Integer) obj;
                m35dp = i5 + i2;
                this.shownY = i2;
                if (num.intValue() == -1) {
                    this.textView.setText(LocaleController.getString("PollSelectOption", C1072R.string.PollSelectOption));
                } else if (chatMessageCell.getMessageObject().isQuiz()) {
                    if (num.intValue() == 0) {
                        this.textView.setText(LocaleController.getString("NoVotesQuiz", C1072R.string.NoVotesQuiz));
                    } else {
                        this.textView.setText(LocaleController.formatPluralString("Answer", num.intValue(), new Object[0]));
                    }
                } else if (num.intValue() == 0) {
                    this.textView.setText(LocaleController.getString("NoVotes", C1072R.string.NoVotes));
                } else {
                    this.textView.setText(LocaleController.formatPluralString("Vote", num.intValue(), new Object[0]));
                }
                measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                forwardNameCenterX = i;
            } else {
                MessageObject messageObject = chatMessageCell.getMessageObject();
                String str = this.overrideText;
                if (str == null) {
                    this.textView.setText(LocaleController.getString("HidAccount", C1072R.string.HidAccount));
                } else {
                    this.textView.setText(str);
                }
                measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                TLRPC$User currentUser = chatMessageCell.getCurrentUser();
                if (currentUser != null && currentUser.f995id == 0) {
                    m35dp = i5 + ((chatMessageCell.getMeasuredHeight() - Math.max(0, chatMessageCell.getBottom() - view.getMeasuredHeight())) - AndroidUtilities.m35dp(50.0f));
                } else {
                    m35dp = i5 + AndroidUtilities.m35dp(22.0f);
                    if (!messageObject.isOutOwner() && chatMessageCell.isDrawNameLayout()) {
                        m35dp += AndroidUtilities.m35dp(20.0f);
                    }
                    if (!messageObject.shouldDrawWithoutBackground() && chatMessageCell.isDrawTopic()) {
                        m35dp = (int) (m35dp + AndroidUtilities.m35dp(5.0f) + chatMessageCell.getDrawTopicHeight());
                    }
                }
                if (!this.isTopArrow && m35dp <= getMeasuredHeight() + AndroidUtilities.m35dp(10.0f)) {
                    return false;
                }
                forwardNameCenterX = chatMessageCell.getForwardNameCenterX();
            }
            int measuredWidth = view.getMeasuredWidth();
            if (this.isTopArrow) {
                float f = this.extraTranslationY;
                float m35dp2 = AndroidUtilities.m35dp(44.0f);
                this.translationY = m35dp2;
                setTranslationY(f + m35dp2);
            } else {
                float f2 = this.extraTranslationY;
                float measuredHeight2 = m35dp - getMeasuredHeight();
                this.translationY = measuredHeight2;
                setTranslationY(f2 + measuredHeight2);
            }
            int left = chatMessageCell.getLeft() + forwardNameCenterX;
            int m35dp3 = AndroidUtilities.m35dp(19.0f);
            if (this.currentType == 5) {
                int max = Math.max(0, (forwardNameCenterX - (getMeasuredWidth() / 2)) - AndroidUtilities.m35dp(19.1f));
                setTranslationX(max);
                m35dp3 += max;
            } else if (left > view.getMeasuredWidth() / 2) {
                int measuredWidth2 = (measuredWidth - getMeasuredWidth()) - AndroidUtilities.m35dp(38.0f);
                setTranslationX(measuredWidth2);
                m35dp3 += measuredWidth2;
            } else {
                setTranslationX(0.0f);
            }
            float left2 = ((chatMessageCell.getLeft() + forwardNameCenterX) - m35dp3) - (this.arrowImageView.getMeasuredWidth() / 2);
            this.arrowImageView.setTranslationX(left2);
            if (left > view.getMeasuredWidth() / 2) {
                if (left2 < AndroidUtilities.m35dp(10.0f)) {
                    float m35dp4 = left2 - AndroidUtilities.m35dp(10.0f);
                    setTranslationX(getTranslationX() + m35dp4);
                    this.arrowImageView.setTranslationX(left2 - m35dp4);
                }
            } else if (left2 > getMeasuredWidth() - AndroidUtilities.m35dp(24.0f)) {
                float measuredWidth3 = (left2 - getMeasuredWidth()) + AndroidUtilities.m35dp(24.0f);
                setTranslationX(measuredWidth3);
                this.arrowImageView.setTranslationX(left2 - measuredWidth3);
            } else if (left2 < AndroidUtilities.m35dp(10.0f)) {
                float m35dp5 = left2 - AndroidUtilities.m35dp(10.0f);
                setTranslationX(getTranslationX() + m35dp5);
                this.arrowImageView.setTranslationX(left2 - m35dp5);
            }
            this.messageCell = chatMessageCell;
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.animatorSet = null;
            }
            setTag(1);
            setVisibility(0);
            if (z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.animatorSet = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f, 1.0f));
                this.animatorSet.addListener(new C23711());
                this.animatorSet.setDuration(300L);
                this.animatorSet.start();
            } else {
                setAlpha(1.0f);
            }
            return true;
        }
        return false;
    }

    public class C23711 extends AnimatorListenerAdapter {
        C23711() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            HintView.this.animatorSet = null;
            AndroidUtilities.runOnUIThread(HintView.this.hideRunnable = new Runnable() {
                @Override
                public final void run() {
                    HintView.C23711.this.lambda$onAnimationEnd$0();
                }
            }, HintView.this.currentType == 0 ? 10000L : 2000L);
        }

        public void lambda$onAnimationEnd$0() {
            HintView.this.hide();
        }
    }

    public boolean showForView(View view, boolean z) {
        if (this.currentView == view || getTag() != null) {
            if (getTag() != null) {
                updatePosition(view);
            }
            return false;
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
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animatorSet = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f, 1.0f));
            this.animatorSet.addListener(new C23722());
            this.animatorSet.setDuration(300L);
            this.animatorSet.start();
        } else {
            setAlpha(1.0f);
        }
        return true;
    }

    public class C23722 extends AnimatorListenerAdapter {
        C23722() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            HintView.this.animatorSet = null;
            AndroidUtilities.runOnUIThread(HintView.this.hideRunnable = new Runnable() {
                @Override
                public final void run() {
                    HintView.C23722.this.lambda$onAnimationEnd$0();
                }
            }, HintView.this.showingDuration);
        }

        public void lambda$onAnimationEnd$0() {
            HintView.this.hide();
        }
    }

    private void updatePosition(android.view.View r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.HintView.updatePosition(android.view.View):void");
    }

    public void hide() {
        hide(true);
    }

    public void hide(boolean z) {
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
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animatorSet = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f));
            this.animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    HintView.this.setVisibility(4);
                    HintView.this.currentView = null;
                    HintView.this.messageCell = null;
                    HintView.this.animatorSet = null;
                }
            });
            this.animatorSet.setDuration(300L);
            this.animatorSet.start();
            return;
        }
        setVisibility(4);
        this.currentView = null;
        this.messageCell = null;
        this.animatorSet = null;
    }

    public void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public ChatMessageCell getMessageCell() {
        return this.messageCell;
    }

    public void setShowingDuration(long j) {
        this.showingDuration = j;
    }

    public void setBottomOffset(int i) {
        this.bottomOffset = i;
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
