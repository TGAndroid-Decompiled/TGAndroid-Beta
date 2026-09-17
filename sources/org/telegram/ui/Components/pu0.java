package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class pu0 extends rt0 {
    public final HashSet f27134f3;
    public final ArrayList f27135g3;
    public final ArrayList f27136h3;
    public final ArrayList f27137i3;
    public TextPaint j3;
    public StaticLayout f27138k3;
    public float f27139l3;
    public float f27140m3;
    public ai.rc f27141n3;
    public int f27142o3;
    public final ArrayList f27143p3;

    public pu0(Context context) {
        super(context, null);
        this.f27134f3 = new HashSet();
        this.f27135g3 = new ArrayList();
        this.f27136h3 = new ArrayList();
        this.f27137i3 = new ArrayList();
        this.f27143p3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pu0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        uk0 movingAdapter = getMovingAdapter();
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

    public uk0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public uk0 getSupportingAdapter() {
        return null;
    }

    public rt0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.t7 t7Var) {
    }
}
