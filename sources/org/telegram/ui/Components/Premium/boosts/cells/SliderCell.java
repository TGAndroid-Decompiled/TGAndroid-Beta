package org.telegram.ui.Components.Premium.boosts.cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SlideChooseView;

public final class SliderCell extends FrameLayout {
    public final SlideChooseView slideChooseView;

    public SliderCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        View view = new View(context);
        addView(view, LayoutHelper.createLinear(-1, -1));
        view.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        SlideChooseView slideChooseView = new SlideChooseView(context, resourcesProvider);
        this.slideChooseView = slideChooseView;
        addView(slideChooseView, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(Theme.getThemedDrawableByKey(getContext(), R.drawable.greydivider_top, Theme.key_windowBackgroundGrayShadow));
    }

    public void setCallBack(SlideChooseView.Callback callback) {
        this.slideChooseView.setCallback(callback);
    }
}
