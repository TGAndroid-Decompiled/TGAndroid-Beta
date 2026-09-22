package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class ou0 extends qt0 {
    public final HashSet f26886f3;
    public final ArrayList f26887g3;
    public final ArrayList f26888h3;
    public final ArrayList f26889i3;
    public TextPaint j3;
    public StaticLayout f26890k3;
    public float f26891l3;
    public float f26892m3;
    public ai.rc f26893n3;
    public int f26894o3;
    public final ArrayList f26895p3;

    public ou0(Context context) {
        super(context, null);
        this.f26886f3 = new HashSet();
        this.f26887g3 = new ArrayList();
        this.f26888h3 = new ArrayList();
        this.f26889i3 = new ArrayList();
        this.f26895p3 = new ArrayList();
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        tk0 movingAdapter = getMovingAdapter();
        if (B1() && getAdapter() == movingAdapter && z1() && (view instanceof org.telegram.ui.Cells.t7)) {
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

    public tk0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public tk0 getSupportingAdapter() {
        return null;
    }

    public qt0 getSupportingListView() {
        return null;
    }

    public abstract boolean z1();

    public void y1(org.telegram.ui.Cells.t7 t7Var) {
    }
}
