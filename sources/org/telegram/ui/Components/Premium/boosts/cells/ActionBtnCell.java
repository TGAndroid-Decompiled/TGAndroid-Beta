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

public class ActionBtnCell extends FrameLayout {
    private final View backgroundView;
    public final ButtonWithCounterView button;
    private final Paint dividerPaint;
    private boolean drawDivider;
    private final Theme.ResourcesProvider resourcesProvider;

    public ActionBtnCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.dividerPaint = new Paint(1);
        this.resourcesProvider = resourcesProvider;
        View view = new View(context);
        this.backgroundView = view;
        addView(view, LayoutHelper.createLinear(-1, -1));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        this.button = buttonWithCounterView;
        addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.drawDivider) {
            this.dividerPaint.setColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider));
            this.dividerPaint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, this.dividerPaint);
        }
    }

    public boolean isLoading() {
        return this.button.isLoading();
    }

    public void setActivateForFreeStyle() {
        this.drawDivider = true;
        this.button.setEnabled(true);
        this.button.setText(LocaleController.getString(R.string.GiftPremiumActivateForFree), false);
        this.backgroundView.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
    }

    public void setCloseStyle() {
        this.drawDivider = false;
        this.button.setShowZero(false);
        this.button.setEnabled(true);
        this.button.setText(LocaleController.formatString("Close", R.string.Close, new Object[0]), false);
    }

    public void setCloseStyle(boolean z) {
        setCloseStyle();
        this.drawDivider = z;
    }

    public void setGiftPremiumStyle(int i, boolean z, boolean z2) {
        this.drawDivider = true;
        this.button.withCounterIcon();
        this.button.setShowZero(true);
        this.button.setEnabled(z2);
        this.button.setCount(i, z);
        this.button.setText(LocaleController.getString(R.string.GiftPremium), z);
        this.backgroundView.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
    }

    public void setOkStyle(boolean z) {
        this.drawDivider = false;
        this.button.setShowZero(false);
        this.button.setEnabled(true);
        this.button.setText(z ? LocaleController.formatString("BoostingUseLink", R.string.BoostingUseLink, new Object[0]) : LocaleController.formatString("OK", R.string.OK, new Object[0]), false);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.button.setOnClickListener(onClickListener);
    }

    public void setStartGiveAwayStyle(int i, boolean z) {
        this.drawDivider = true;
        this.button.withCounterIcon();
        this.button.setShowZero(true);
        this.button.setEnabled(true);
        this.button.setCount(i, z);
        this.button.setText(LocaleController.getString(R.string.BoostingStartGiveaway), z);
        this.backgroundView.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
    }

    public void updateCounter(int i) {
        this.button.setCount(i, true);
    }

    public void updateLoading(boolean z) {
        this.button.setLoading(z);
    }
}
