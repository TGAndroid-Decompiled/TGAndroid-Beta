package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
public class GroupCreateCheckBox extends View implements org.telegram.ui.ActionBar.z5 {
    public float f31484a;

    public float getProgress() {
        return this.f31484a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateColors();
        throw null;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0 || this.f31484a == 0.0f) {
            return;
        }
        getMeasuredWidth();
        getMeasuredHeight();
        org.telegram.messenger.g0.L(30.0f);
        throw null;
    }

    public void setProgress(float f10) {
        if (this.f31484a == f10) {
            return;
        }
        this.f31484a = f10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.k6.v0(0);
        throw null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCheckScale(float f10) {
    }

    public void setInnerRadDiff(int i3) {
    }
}
