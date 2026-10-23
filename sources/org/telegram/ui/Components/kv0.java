package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class kv0 extends mu0 {
    public final HashSet f27958d3;
    public final ArrayList f27959e3;
    public final ArrayList f27960f3;
    public final ArrayList f27961g3;
    public TextPaint f27962h3;
    public StaticLayout f27963i3;
    public float f27964j3;
    public float f27965k3;
    public ci.ia f27966l3;
    public int f27967m3;
    public final ArrayList f27968n3;

    public kv0(Context context) {
        super(context, null);
        this.f27958d3 = new HashSet();
        this.f27959e3 = new ArrayList();
        this.f27960f3 = new ArrayList();
        this.f27961g3 = new ArrayList();
        this.f27968n3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kv0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        rl0 movingAdapter = getMovingAdapter();
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

    public rl0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public rl0 getSupportingAdapter() {
        return null;
    }

    public mu0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.s7 s7Var) {
    }
}
