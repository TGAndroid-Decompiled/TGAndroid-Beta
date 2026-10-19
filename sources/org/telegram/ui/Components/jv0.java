package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class jv0 extends lu0 {
    public final HashSet f27605d3;
    public final ArrayList f27606e3;
    public final ArrayList f27607f3;
    public final ArrayList f27608g3;
    public TextPaint f27609h3;
    public StaticLayout f27610i3;
    public float f27611j3;
    public float f27612k3;
    public ci.ia f27613l3;
    public int f27614m3;
    public final ArrayList f27615n3;

    public jv0(Context context) {
        super(context, null);
        this.f27605d3 = new HashSet();
        this.f27606e3 = new ArrayList();
        this.f27607f3 = new ArrayList();
        this.f27608g3 = new ArrayList();
        this.f27615n3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jv0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ql0 movingAdapter = getMovingAdapter();
        if (C1() && getAdapter() == movingAdapter && A1() && (view instanceof org.telegram.ui.Cells.s7)) {
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

    public ql0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public ql0 getSupportingAdapter() {
        return null;
    }

    public lu0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.s7 s7Var) {
    }
}
