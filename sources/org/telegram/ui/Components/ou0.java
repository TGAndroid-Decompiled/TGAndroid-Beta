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
    public final ArrayList f27667d3;
    public final ArrayList f27668e3;
    public final ArrayList f27669f3;
    public TextPaint f27670g3;
    public StaticLayout f27671h3;
    public float f27672i3;
    public float f27673j3;
    public nh.q9 f27674k3;
    public int f27675l3;
    public final ArrayList f27676m3;

    public ou0(Context context) {
        super(context, null);
        this.c3 = new HashSet();
        this.f27667d3 = new ArrayList();
        this.f27668e3 = new ArrayList();
        this.f27669f3 = new ArrayList();
        this.f27676m3 = new ArrayList();
    }

    public abstract boolean A1();

    public boolean B1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ou0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        cl0 movingAdapter = getMovingAdapter();
        if (B1() && getAdapter() == movingAdapter && z1() && (view instanceof org.telegram.ui.Cells.r7)) {
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

    public cl0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public cl0 getSupportingAdapter() {
        return null;
    }

    public pt0 getSupportingListView() {
        return null;
    }

    public abstract boolean z1();

    public void y1(org.telegram.ui.Cells.r7 r7Var) {
    }
}
