package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class qv0 extends su0 {
    public final HashSet f32039k3;
    public final ArrayList f32040l3;
    public final ArrayList f32041m3;
    public final ArrayList f32042n3;
    public TextPaint f32043o3;
    public StaticLayout f32044p3;
    public float f32045q3;
    public float f32046r3;
    public di.ga f32047s3;
    public int f32048t3;
    public final ArrayList f32049u3;

    public qv0(Context context) {
        super(context, null);
        this.f32039k3 = new HashSet();
        this.f32040l3 = new ArrayList();
        this.f32041m3 = new ArrayList();
        this.f32042n3 = new ArrayList();
        this.f32049u3 = new ArrayList();
    }

    public abstract boolean D1();

    public abstract boolean E1();

    public boolean F1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qv0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        tl0 movingAdapter = getMovingAdapter();
        if (F1() && getAdapter() == movingAdapter && D1() && (view instanceof org.telegram.ui.Cells.w7)) {
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

    public tl0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public tl0 getSupportingAdapter() {
        return null;
    }

    public su0 getSupportingListView() {
        return null;
    }

    public void C1(org.telegram.ui.Cells.w7 w7Var) {
    }
}
