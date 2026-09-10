package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
public final class i40 extends iv0 {
    public final l40 f23893f2;

    public i40(l40 l40Var, Context context, av0 av0Var, l40 l40Var2, h40 h40Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0L, av0Var, 0, null, null, null, 8, 0, l40Var2, h40Var, 0, f6Var, null);
        this.f23893f2 = l40Var;
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f23893f2.f24865b;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f23893f2.f24866c;
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
