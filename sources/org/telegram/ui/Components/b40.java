package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
public final class b40 extends lv0 {
    public final e40 f22861f2;

    public b40(e40 e40Var, Context context, dv0 dv0Var, e40 e40Var2, a40 a40Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, dv0Var, 0, null, null, null, 8, 0, e40Var2, a40Var, 0, d6Var, null);
        this.f22861f2 = e40Var;
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f22861f2.f23852b;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f22861f2.f23853c;
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
