package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class ou0 extends pt0 {
    public final HashSet c3;
    public final ArrayList f27660d3;
    public final ArrayList f27661e3;
    public final ArrayList f27662f3;
    public TextPaint f27663g3;
    public StaticLayout f27664h3;
    public float f27665i3;
    public float f27666j3;
    public nh.q9 f27667k3;
    public int f27668l3;
    public final ArrayList f27669m3;

    public ou0(Context context) {
        super(context, null);
        this.c3 = new HashSet();
        this.f27660d3 = new ArrayList();
        this.f27661e3 = new ArrayList();
        this.f27662f3 = new ArrayList();
        this.f27669m3 = new ArrayList();
    }

    public boolean A1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ou0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        bl0 movingAdapter = getMovingAdapter();
        if (A1() && getAdapter() == movingAdapter && y1() && (view instanceof org.telegram.ui.Cells.q7)) {
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

    public bl0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public bl0 getSupportingAdapter() {
        return null;
    }

    public pt0 getSupportingListView() {
        return null;
    }

    public abstract boolean y1();

    public abstract boolean z1();

    public void x1(org.telegram.ui.Cells.q7 q7Var) {
    }
}
