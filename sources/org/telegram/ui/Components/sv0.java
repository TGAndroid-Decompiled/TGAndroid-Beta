package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class sv0 extends uu0 {
    public final HashSet f30949d3;
    public final ArrayList f30950e3;
    public final ArrayList f30951f3;
    public final ArrayList f30952g3;
    public TextPaint f30953h3;
    public StaticLayout f30954i3;
    public float j3;
    public float f30955k3;
    public ai.sc f30956l3;
    public int f30957m3;
    public final ArrayList f30958n3;

    public sv0(Context context) {
        super(context, null);
        this.f30949d3 = new HashSet();
        this.f30950e3 = new ArrayList();
        this.f30951f3 = new ArrayList();
        this.f30952g3 = new ArrayList();
        this.f30958n3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sv0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        zl0 movingAdapter = getMovingAdapter();
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

    public zl0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public zl0 getSupportingAdapter() {
        return null;
    }

    public uu0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.t7 t7Var) {
    }
}
