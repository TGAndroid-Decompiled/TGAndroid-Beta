package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
public final class a40 extends kv0 {
    public final d40 f22531f2;

    public a40(d40 d40Var, Context context, cv0 cv0Var, d40 d40Var2, z30 z30Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, cv0Var, 0, null, null, null, 8, 0, d40Var2, z30Var, 0, d6Var, null);
        this.f22531f2 = d40Var;
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f22531f2.f23492b;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f22531f2.f23493c;
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
