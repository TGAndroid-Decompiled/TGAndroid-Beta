package org.telegram.ui.Components.Premium.boosts.cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class ActionBtnCell extends FrameLayout {
    public final View backgroundView;
    public final ButtonWithCounterView button;
    public final Paint dividerPaint;
    public boolean drawDivider;
    public final Theme.ResourcesProvider resourcesProvider;

    public ActionBtnCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.dividerPaint = new Paint(1);
        this.resourcesProvider = resourcesProvider;
        View view = new View(context);
        this.backgroundView = view;
        addView(view, LayoutHelper.createLinear(-1, -1));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
        this.button = buttonWithCounterView;
        addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.drawDivider) {
            Paint paint = this.dividerPaint;
            paint.setColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider));
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z) {
        this.drawDivider = false;
        ButtonWithCounterView buttonWithCounterView = this.button;
        buttonWithCounterView.setShowZero(false);
        buttonWithCounterView.setEnabled(true);
        buttonWithCounterView.setText(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
        this.drawDivider = z;
    }

    public void setOkStyle(boolean z) {
        this.drawDivider = false;
        ButtonWithCounterView buttonWithCounterView = this.button;
        buttonWithCounterView.setShowZero(false);
        buttonWithCounterView.setEnabled(true);
        buttonWithCounterView.setText(z ? LocaleController.formatString("BoostingUseLink", R.string.BoostingUseLink, new Object[0]) : LocaleController.formatString("OK", R.string.OK, new Object[0]), false, true);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.button.setOnClickListener(onClickListener);
    }

    public final void setStartGiveAwayStyle(int i, boolean z) {
        this.drawDivider = true;
        ButtonWithCounterView buttonWithCounterView = this.button;
        buttonWithCounterView.withCounterIcon();
        buttonWithCounterView.setShowZero(true);
        buttonWithCounterView.setEnabled(true);
        buttonWithCounterView.setCount(i, z);
        buttonWithCounterView.setText(LocaleController.getString(R.string.BoostingStartGiveaway), z, true);
        this.backgroundView.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
    }
}
