package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
public final class p40 extends bw0 {
    public final s40 f29712f2;

    public p40(s40 s40Var, Context context, tv0 tv0Var, s40 s40Var2, o40 o40Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 0L, tv0Var, 0, null, null, null, 8, 0, s40Var2, o40Var, 0, e6Var, null);
        this.f29712f2 = s40Var;
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f29712f2.f30628b;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f29712f2.f30629c;
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
