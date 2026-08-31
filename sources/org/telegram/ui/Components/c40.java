package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
public final class c40 extends zu0 {
    public final f40 f25784c2;

    public c40(f40 f40Var, Context context, ru0 ru0Var, f40 f40Var2, b40 b40Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0L, ru0Var, 0, null, null, null, 8, 0, f40Var2, b40Var, 0, g6Var, null);
        this.f25784c2 = f40Var;
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f25784c2.f26735b;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f25784c2.f26736c;
    }

    @Override
    public final boolean t0() {
        return true;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
    }

    @Override
    public final void K0(boolean z4) {
    }

    @Override
    public final void M0(float f10) {
    }

    @Override
    public final void N0(boolean z4) {
    }

    @Override
    public final void b1(boolean z4) {
    }

    @Override
    public final void o0() {
    }

    @Override
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
    }
}
