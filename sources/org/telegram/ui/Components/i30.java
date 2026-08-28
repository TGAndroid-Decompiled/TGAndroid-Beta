package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
public final class i30 extends eu0 {
    public final l30 f29307b2;

    public i30(l30 l30Var, Context context, wt0 wt0Var, l30 l30Var2, h30 h30Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, 0L, wt0Var, 0, null, null, null, 8, 0, l30Var2, h30Var, 0, b6Var, null);
        this.f29307b2 = l30Var;
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f29307b2.f30309b;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f29307b2.f30310c;
    }

    @Override
    public final boolean t0() {
        return true;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
    }

    @Override
    public final void K0(boolean z10) {
    }

    @Override
    public final void M0(float f10) {
    }

    @Override
    public final void N0(boolean z10) {
    }

    @Override
    public final void b1(boolean z10) {
    }

    @Override
    public final void o0() {
    }

    @Override
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
    }
}
