package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
public class GroupCreateCheckBox extends View implements org.telegram.ui.ActionBar.k6 {
    public float f24066a;

    public float getProgress() {
        return this.f24066a;
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
        if (getVisibility() != 0 || this.f24066a == 0.0f) {
            return;
        }
        getMeasuredWidth();
        getMeasuredHeight();
        org.telegram.messenger.i0.L(30.0f);
        throw null;
    }

    public void setProgress(float f7) {
        if (this.f24066a == f7) {
            return;
        }
        this.f24066a = f7;
        invalidate();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.t6.v0(0);
        throw null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCheckScale(float f7) {
    }

    public void setInnerRadDiff(int i10) {
    }
}
