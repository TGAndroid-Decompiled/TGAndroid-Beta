package org.telegram.ui.Components.chat.layouts;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import me.vkryl.android.AnimatorUtils;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.chat.buttons.ChatActivityBlurredRoundButton;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda0;
import org.telegram.ui.web.MHTML;

public final class ChatActivityActionsButtonsLayout extends LinearLayout {
    public static final int $r8$clinit = 0;
    public final MHTML forwardButton;
    public final MHTML replyButton;
    public final Theme.ResourcesProvider resourcesProvider;
    public float totalVisibilityFactor;

    public ChatActivityActionsButtonsLayout(Context context, Theme.ResourcesProvider resourcesProvider, BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundColorProvider blurredBackgroundColorProvider) {
        super(context);
        MHTML mhtml = new MHTML(this);
        this.replyButton = mhtml;
        MHTML mhtml2 = new MHTML(this);
        this.forwardButton = mhtml2;
        this.resourcesProvider = resourcesProvider;
        ChatActivityBlurredRoundButton chatActivityBlurredRoundButtonCreate = ChatActivityBlurredRoundButton.create(context, resourcesProvider, blurredBackgroundDrawableViewFactory, blurredBackgroundColorProvider);
        mhtml.file = chatActivityBlurredRoundButtonCreate;
        chatActivityBlurredRoundButtonCreate.setOnClickListener(new BotAdView$$ExternalSyntheticLambda0(5));
        ScaleStateListAnimator.apply((ChatActivityBlurredRoundButton) mhtml.file, 0.065f, 2.0f);
        ChatActivityBlurredRoundButton chatActivityBlurredRoundButtonCreate2 = ChatActivityBlurredRoundButton.create(context, resourcesProvider, blurredBackgroundDrawableViewFactory, blurredBackgroundColorProvider);
        mhtml2.file = chatActivityBlurredRoundButtonCreate2;
        chatActivityBlurredRoundButtonCreate2.setOnClickListener(new BotAdView$$ExternalSyntheticLambda0(5));
        ScaleStateListAnimator.apply((ChatActivityBlurredRoundButton) mhtml2.file, 0.065f, 2.0f);
        addTextView(mhtml, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        addTextView(mhtml2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((ChatActivityBlurredRoundButton) mhtml.file, LayoutHelper.createLinear(0, 56, 1.0f, 1, 0, -1, 0));
        addView((ChatActivityBlurredRoundButton) mhtml2.file, LayoutHelper.createLinear(0, 56, 1.0f, -1, 0, 1, 0));
    }

    public final void addTextView(MHTML mhtml, String str, int i, boolean z) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i2 = Theme.key_glass_defaultText;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable drawableMutate = getContext().getResources().getDrawable(i).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_glass_defaultIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        Drawable drawable = z ? drawableMutate : null;
        if (z) {
            drawableMutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, drawableMutate, (Drawable) null);
        mhtml.boundary = textView;
        ((ChatActivityBlurredRoundButton) mhtml.file).addView(textView, LayoutHelper.createFrame(-2, -2, 17));
    }

    public final void checkHolderPositionsAndVisibility(MHTML mhtml) {
        float f = this.totalVisibilityFactor * ((BoolAnimator) mhtml.entries).floatValue;
        float f2 = (1.0f - f) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - AnimatorUtils.DECELERATE_INTERPOLATOR.getInterpolation(f)) * (getMeasuredWidth() / 2.0f);
        if (mhtml == this.replyButton) {
            interpolation *= -1.0f;
        }
        ((ChatActivityBlurredRoundButton) mhtml.file).setTranslationX(interpolation);
        ((ChatActivityBlurredRoundButton) mhtml.file).setTranslationY(f2);
        ((ChatActivityBlurredRoundButton) mhtml.file).setAlpha(f);
        ((ChatActivityBlurredRoundButton) mhtml.file).setVisibility(f > 0.0f ? 0 : 4);
    }

    public View getForwardButton() {
        return (ChatActivityBlurredRoundButton) this.forwardButton.file;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        checkHolderPositionsAndVisibility(this.forwardButton);
        checkHolderPositionsAndVisibility(this.replyButton);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ChatActivityBlurredRoundButton) this.forwardButton.file).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ChatActivityBlurredRoundButton) this.replyButton.file).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f) {
        if (this.totalVisibilityFactor != f) {
            this.totalVisibilityFactor = f;
            checkHolderPositionsAndVisibility(this.forwardButton);
            checkHolderPositionsAndVisibility(this.replyButton);
        }
    }
}
