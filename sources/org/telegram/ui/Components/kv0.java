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
    public final HashSet f27957d3;
    public final ArrayList f27958e3;
    public final ArrayList f27959f3;
    public final ArrayList f27960g3;
    public TextPaint f27961h3;
    public StaticLayout f27962i3;
    public float f27963j3;
    public float f27964k3;
    public ci.ia f27965l3;
    public int f27966m3;
    public final ArrayList f27967n3;

    public kv0(Context context) {
        super(context, null);
        this.f27957d3 = new HashSet();
        this.f27958e3 = new ArrayList();
        this.f27959f3 = new ArrayList();
        this.f27960g3 = new ArrayList();
        this.f27967n3 = new ArrayList();
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
