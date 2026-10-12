package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class xv0 extends zu0 {
    public final HashSet f32877d3;
    public final ArrayList f32878e3;
    public final ArrayList f32879f3;
    public final ArrayList f32880g3;
    public TextPaint f32881h3;
    public StaticLayout f32882i3;
    public float j3;
    public float f32883k3;
    public ai.sc f32884l3;
    public int f32885m3;
    public final ArrayList f32886n3;

    public xv0(Context context) {
        super(context, null);
        this.f32877d3 = new HashSet();
        this.f32878e3 = new ArrayList();
        this.f32879f3 = new ArrayList();
        this.f32880g3 = new ArrayList();
        this.f32886n3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xv0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        em0 movingAdapter = getMovingAdapter();
        if (C1() && getAdapter() == movingAdapter && A1() && (view instanceof org.telegram.ui.Cells.t7)) {
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

    public em0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public em0 getSupportingAdapter() {
        return null;
    }

    public zu0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.t7 t7Var) {
    }
}
