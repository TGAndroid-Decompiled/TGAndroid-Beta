package org.telegram.ui.Components.Premium.boosts.cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingSpan;
import org.telegram.ui.Components.RadioButton;

public final class StarGiveawayOptionCell extends FrameLayout {
    public final AnimatedFloat animatedStarsCount;
    public TL_stars.TL_starsGiveawayOption currentOption;
    public final SpannableString loading1;
    public final SpannableString loading2;
    public final TextView priceView;
    public final RadioButton radioButton;
    public final Theme.ResourcesProvider resourcesProvider;
    public final Drawable starDrawable;
    public final Drawable starDrawableOutline;
    public int starsCount;
    public final AnimatedTextView subtitleView;
    public final AnimatedTextView titleView;

    public StarGiveawayOptionCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.animatedStarsCount = new AnimatedFloat(this, 0L, 500L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.resourcesProvider = resourcesProvider;
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
        this.starDrawableOutline = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogBackground, resourcesProvider), PorterDuff.Mode.SRC_IN));
        this.starDrawable = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        setWillNotDraw(false);
        AnimatedTextView animatedTextView = new AnimatedTextView(context);
        this.titleView = animatedTextView;
        animatedTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        animatedTextView.setTypeface(AndroidUtilities.bold());
        animatedTextView.setTextSize(AndroidUtilities.dp(16.0f));
        addView(animatedTextView, LayoutHelper.createFrame(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.loading1 = spannableString;
        spannableString.setSpan(new LoadingSpan(animatedTextView, AndroidUtilities.dp(90.0f)), 0, 1, 33);
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context, false, true, true);
        this.subtitleView = animatedTextView2;
        int i = Theme.key_windowBackgroundWhiteGrayText2;
        animatedTextView2.setTextColor(Theme.getColor(i, resourcesProvider));
        animatedTextView2.setTextSize(AndroidUtilities.dp(13.0f));
        addView(animatedTextView2, LayoutHelper.createFrame(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.loading2 = spannableString2;
        spannableString2.setSpan(new LoadingSpan(animatedTextView2, AndroidUtilities.dp(70.0f)), 0, 1, 33);
        TextView textView = new TextView(context);
        this.priceView = textView;
        OKLCH.m(i, resourcesProvider, textView, 16.0f);
        textView.setGravity(5);
        addView(textView, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.radioButton = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.setColor(Theme.getColor(Theme.key_checkboxDisabled, resourcesProvider), Theme.getColor(Theme.key_dialogRadioBackgroundChecked, resourcesProvider));
        addView(radioButton, LayoutHelper.createFrame(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.currentOption;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.animatedStarsCount.set(this.starsCount);
        float fDp = AndroidUtilities.dp(24.0f);
        float fDp2 = AndroidUtilities.dp(24.0f);
        float fDp3 = AndroidUtilities.dp(2.5f);
        float fDp4 = AndroidUtilities.dp(64.0f);
        float fDp5 = AndroidUtilities.dp(8.0f);
        for (int iCeil = ((int) Math.ceil(f)) - 1; iCeil >= 0; iCeil--) {
            float fClamp = Utilities.clamp(f - iCeil, 1.0f, 0.0f);
            float f2 = (((iCeil - 1) - (1.0f - fClamp)) * fDp3 * 1.0f) + fDp4;
            int i = (int) f2;
            int i2 = (int) fDp5;
            int i3 = (int) (f2 + fDp);
            int i4 = (int) (fDp5 + fDp2);
            Drawable drawable = this.starDrawableOutline;
            drawable.setBounds(i, i2, i3, i4);
            int i5 = (int) (fClamp * 255.0f);
            drawable.setAlpha(i5);
            drawable.draw(canvas);
            Drawable drawable2 = this.starDrawable;
            drawable2.setBounds(i, i2, i3, i4);
            drawable2.setAlpha(i5);
            drawable2.draw(canvas);
        }
        this.titleView.setTranslationX((fDp3 * f) + AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
