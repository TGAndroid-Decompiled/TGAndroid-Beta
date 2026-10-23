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
    public final HashSet f29018g3;
    public final ArrayList f29019h3;
    public final ArrayList f29020i3;
    public final ArrayList f29021j3;
    public TextPaint f29022k3;
    public StaticLayout f29023l3;
    public float f29024m3;
    public float f29025n3;
    public ci.ha f29026o3;
    public int f29027p3;
    public final ArrayList f29028q3;

    public nv0(Context context) {
        super(context, null);
        this.f29018g3 = new HashSet();
        this.f29019h3 = new ArrayList();
        this.f29020i3 = new ArrayList();
        this.f29021j3 = new ArrayList();
        this.f29028q3 = new ArrayList();
    }

    public abstract boolean F1();

    public abstract boolean G1();

    public boolean H1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nv0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ul0 movingAdapter = getMovingAdapter();
        if (H1() && getAdapter() == movingAdapter && F1() && (view instanceof org.telegram.ui.Cells.s7)) {
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

    public void E1(org.telegram.ui.Cells.s7 s7Var) {
    }
}
