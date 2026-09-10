package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class yu0 extends zt0 {
    public final HashSet f29500f3;
    public final ArrayList f29501g3;
    public final ArrayList f29502h3;
    public final ArrayList f29503i3;
    public TextPaint j3;
    public StaticLayout f29504k3;
    public float f29505l3;
    public float f29506m3;
    public zh.c8 f29507n3;
    public int f29508o3;
    public final ArrayList f29509p3;

    public yu0(Context context) {
        super(context, null);
        this.f29500f3 = new HashSet();
        this.f29501g3 = new ArrayList();
        this.f29502h3 = new ArrayList();
        this.f29503i3 = new ArrayList();
        this.f29509p3 = new ArrayList();
    }

    public boolean A1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yu0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        dl0 movingAdapter = getMovingAdapter();
        if (A1() && getAdapter() == movingAdapter && y1() && (view instanceof org.telegram.ui.Cells.u7)) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
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

    public dl0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public dl0 getSupportingAdapter() {
        return null;
    }

    public zt0 getSupportingListView() {
        return null;
    }

    public abstract boolean y1();

    public abstract boolean z1();

    public void x1(org.telegram.ui.Cells.u7 u7Var) {
    }
}
