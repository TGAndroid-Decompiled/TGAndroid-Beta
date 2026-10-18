package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class iv0 extends ku0 {
    public final HashSet f27356d3;
    public final ArrayList f27357e3;
    public final ArrayList f27358f3;
    public final ArrayList f27359g3;
    public TextPaint f27360h3;
    public StaticLayout f27361i3;
    public float f27362j3;
    public float f27363k3;
    public ci.ha f27364l3;
    public int f27365m3;
    public final ArrayList f27366n3;

    public iv0(Context context) {
        super(context, null);
        this.f27356d3 = new HashSet();
        this.f27357e3 = new ArrayList();
        this.f27358f3 = new ArrayList();
        this.f27359g3 = new ArrayList();
        this.f27366n3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iv0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ql0 movingAdapter = getMovingAdapter();
        if (C1() && getAdapter() == movingAdapter && A1() && (view instanceof org.telegram.ui.Cells.s7)) {
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

    public ql0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public ql0 getSupportingAdapter() {
        return null;
    }

    public ku0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.s7 s7Var) {
    }
}
