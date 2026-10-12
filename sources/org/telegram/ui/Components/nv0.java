package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class nv0 extends pu0 {
    public final HashSet f27720d3;
    public final ArrayList f27721e3;
    public final ArrayList f27722f3;
    public final ArrayList f27723g3;
    public TextPaint f27724h3;
    public StaticLayout f27725i3;
    public float f27726j3;
    public float f27727k3;
    public bi.ac f27728l3;
    public int f27729m3;
    public final ArrayList f27730n3;

    public nv0(Context context) {
        super(context, null);
        this.f27720d3 = new HashSet();
        this.f27721e3 = new ArrayList();
        this.f27722f3 = new ArrayList();
        this.f27723g3 = new ArrayList();
        this.f27730n3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nv0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ul0 movingAdapter = getMovingAdapter();
        if (C1() && getAdapter() == movingAdapter && A1() && (view instanceof org.telegram.ui.Cells.t7)) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public int getAnimateToColumnsCount() {
        return 3;
    }

    public float getChangeColumnsProgress() {
        return 0.0f;
    }

    public int getColumnsCount() {
        return 3;
    }

    public SparseArray<Float> getMessageAlphaEnter() {
        return null;
    }

    public ul0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public ul0 getSupportingAdapter() {
        return null;
    }

    public pu0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.t7 t7Var) {
    }
}
