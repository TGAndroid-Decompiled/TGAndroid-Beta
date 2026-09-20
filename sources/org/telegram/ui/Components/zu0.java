package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class zu0 extends bu0 {
    public final HashSet f30930f3;
    public final ArrayList f30931g3;
    public final ArrayList f30932h3;
    public final ArrayList f30933i3;
    public TextPaint j3;
    public StaticLayout f30934k3;
    public float f30935l3;
    public float f30936m3;
    public ai.rc f30937n3;
    public int f30938o3;
    public final ArrayList f30939p3;

    public zu0(Context context) {
        super(context, null);
        this.f30930f3 = new HashSet();
        this.f30931g3 = new ArrayList();
        this.f30932h3 = new ArrayList();
        this.f30933i3 = new ArrayList();
        this.f30939p3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zu0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        dl0 movingAdapter = getMovingAdapter();
        if (C1() && getAdapter() == movingAdapter && A1() && (view instanceof org.telegram.ui.Cells.u7)) {
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

    public bu0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.u7 u7Var) {
    }
}
