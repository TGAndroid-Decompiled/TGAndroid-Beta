package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class tv0 extends vu0 {
    public final HashSet f31157d3;
    public final ArrayList f31158e3;
    public final ArrayList f31159f3;
    public final ArrayList f31160g3;
    public TextPaint f31161h3;
    public StaticLayout f31162i3;
    public float j3;
    public float f31163k3;
    public ai.sc f31164l3;
    public int f31165m3;
    public final ArrayList f31166n3;

    public tv0(Context context) {
        super(context, null);
        this.f31157d3 = new HashSet();
        this.f31158e3 = new ArrayList();
        this.f31159f3 = new ArrayList();
        this.f31160g3 = new ArrayList();
        this.f31166n3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tv0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        am0 movingAdapter = getMovingAdapter();
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

    public am0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public am0 getSupportingAdapter() {
        return null;
    }

    public vu0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.t7 t7Var) {
    }
}
