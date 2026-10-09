package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class rv0 extends tu0 {
    public final HashSet f30517d3;
    public final ArrayList f30518e3;
    public final ArrayList f30519f3;
    public final ArrayList f30520g3;
    public TextPaint f30521h3;
    public StaticLayout f30522i3;
    public float j3;
    public float f30523k3;
    public ai.sc f30524l3;
    public int f30525m3;
    public final ArrayList f30526n3;

    public rv0(Context context) {
        super(context, null);
        this.f30517d3 = new HashSet();
        this.f30518e3 = new ArrayList();
        this.f30519f3 = new ArrayList();
        this.f30520g3 = new ArrayList();
        this.f30526n3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rv0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        yl0 movingAdapter = getMovingAdapter();
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

    public yl0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public yl0 getSupportingAdapter() {
        return null;
    }

    public tu0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.t7 t7Var) {
    }
}
