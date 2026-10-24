package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
public final class f40 extends wv0 {
    public final i40 f26191i2;

    public f40(i40 i40Var, Context context, ov0 ov0Var, i40 i40Var2, e40 e40Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0L, ov0Var, 0, null, null, null, 8, 0, i40Var2, e40Var, 0, g6Var, null);
        this.f26191i2 = i40Var;
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f26191i2.f27281b;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f26191i2.f27282c;
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
