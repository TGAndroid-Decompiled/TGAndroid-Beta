package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
public final class y30 extends xu0 {
    public final b40 f32838f2;

    public y30(b40 b40Var, Context context, pu0 pu0Var, b40 b40Var2, x30 x30Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0L, pu0Var, 0, null, null, null, 8, 0, b40Var2, x30Var, 0, f6Var, null);
        this.f32838f2 = b40Var;
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f32838f2.f24536b;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f32838f2.f24537c;
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
