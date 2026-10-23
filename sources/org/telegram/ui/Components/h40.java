package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
public final class h40 extends xv0 {
    public final k40 f26785i2;

    public h40(k40 k40Var, Context context, pv0 pv0Var, k40 k40Var2, g40 g40Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0L, pv0Var, 0, null, null, null, 8, 0, k40Var2, g40Var, 0, g6Var, null);
        this.f26785i2 = k40Var;
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f26785i2.f27857b;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f26785i2.f27858c;
    }

    @Override
    public final boolean w0() {
        return true;
    }

    @Override
    public final void G0(SparseArray sparseArray) {
    }

    @Override
    public final void N0(boolean z10) {
    }

    @Override
    public final void P0(float f7) {
    }

    @Override
    public final void Q0(boolean z10) {
    }

    @Override
    public final void e1(boolean z10) {
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void Q(Canvas canvas, float f7, Rect rect, Paint paint) {
    }
}
