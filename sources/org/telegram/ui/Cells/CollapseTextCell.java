package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.ChatbotSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.LayoutHelper;

public final class CollapseTextCell extends FrameLayout {
    public final View collapsedArrow;
    public final Theme.ResourcesProvider resourcesProvider;
    public final AnimatedTextView textView;

    public CollapseTextCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        AnimatedTextView animatedTextView = new AnimatedTextView(context);
        this.textView = animatedTextView;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        animatedTextView.setTextColor(Theme.getColor(i, resourcesProvider));
        animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        animatedTextView.setImportantForAccessibility(2);
        animatedTextView.setOnWidthUpdatedListener(new ChatbotSheet$$ExternalSyntheticLambda0(this, 8));
        addView(animatedTextView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.collapsedArrow = view;
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        view.setBackground(drawableMutate);
        addView(view, LayoutHelper.createFrameRelatively(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(46.0f), 1073741824));
        updateCollapseArrowTranslation();
    }

    public void setColor(int i) {
        int color = Theme.getColor(i, this.resourcesProvider);
        this.textView.setTextColor(color);
        this.collapsedArrow.getBackground().setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
    }

    public final void updateCollapseArrowTranslation() {
        float currentWidth = this.textView.getDrawable().getCurrentWidth() + AndroidUtilities.dp(1.0f);
        boolean z = LocaleController.isRTL;
        View view = this.collapsedArrow;
        if (z) {
            view.setTranslationX(-currentWidth);
        } else {
            view.setTranslationX(currentWidth);
        }
    }
}
