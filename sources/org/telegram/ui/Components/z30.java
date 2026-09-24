package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
public final class z30 extends jv0 {
    public final c40 f30768f2;

    public z30(c40 c40Var, Context context, bv0 bv0Var, c40 c40Var2, y30 y30Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, bv0Var, 0, null, null, null, 8, 0, c40Var2, y30Var, 0, d6Var, null);
        this.f30768f2 = c40Var;
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f30768f2.f23153b;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f30768f2.f23154c;
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
    public final void M0(float f7) {
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
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
    }
}
