package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
public final class h40 extends sv0 {
    public final k40 f26759f2;

    public h40(k40 k40Var, Context context, kv0 kv0Var, k40 k40Var2, g40 g40Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, kv0Var, 0, null, null, null, 8, 0, k40Var2, g40Var, 0, d6Var, null);
        this.f26759f2 = k40Var;
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f26759f2.f27734b;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f26759f2.f27735c;
    }

    @Override
    public final boolean v0() {
        return true;
    }

    @Override
    public final void F0(SparseArray sparseArray) {
    }

    @Override
    public final void M0(boolean z10) {
    }

    @Override
    public final void O0(float f7) {
    }

    @Override
    public final void P0(boolean z10) {
    }

    @Override
    public final void d1(boolean z10) {
    }

    @Override
    public final void p0() {
    }

    @Override
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
    }
}
