package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class mv0 extends ou0 {
    public final HashSet f28702g3;
    public final ArrayList f28703h3;
    public final ArrayList f28704i3;
    public final ArrayList f28705j3;
    public TextPaint f28706k3;
    public StaticLayout f28707l3;
    public float f28708m3;
    public float f28709n3;
    public ci.ha f28710o3;
    public int f28711p3;
    public final ArrayList f28712q3;

    public mv0(Context context) {
        super(context, null);
        this.f28702g3 = new HashSet();
        this.f28703h3 = new ArrayList();
        this.f28704i3 = new ArrayList();
        this.f28705j3 = new ArrayList();
        this.f28712q3 = new ArrayList();
    }

    public abstract boolean F1();

    public abstract boolean G1();

    public boolean H1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mv0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        tl0 movingAdapter = getMovingAdapter();
        if (H1() && getAdapter() == movingAdapter && F1() && (view instanceof org.telegram.ui.Cells.s7)) {
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

    public ou0 getSupportingListView() {
        return null;
    }

    public void E1(org.telegram.ui.Cells.s7 s7Var) {
    }
}
