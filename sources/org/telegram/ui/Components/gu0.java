package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class gu0 extends ht0 {
    public final HashSet f28989b3;
    public final ArrayList c3;
    public final ArrayList f28990d3;
    public final ArrayList f28991e3;
    public TextPaint f28992f3;
    public StaticLayout f28993g3;
    public float f28994h3;
    public float f28995i3;
    public lh.q9 f28996j3;
    public int f28997k3;
    public final ArrayList f28998l3;

    public gu0(Context context) {
        super(context, null);
        this.f28989b3 = new HashSet();
        this.c3 = new ArrayList();
        this.f28990d3 = new ArrayList();
        this.f28991e3 = new ArrayList();
        this.f28998l3 = new ArrayList();
    }

    public abstract boolean A1();

    public boolean B1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gu0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        tk0 movingAdapter = getMovingAdapter();
        if (B1() && getAdapter() == movingAdapter && z1() && (view instanceof org.telegram.ui.Cells.p7)) {
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

    public tk0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public tk0 getSupportingAdapter() {
        return null;
    }

    public ht0 getSupportingListView() {
        return null;
    }

    public abstract boolean z1();

    public void y1(org.telegram.ui.Cells.p7 p7Var) {
    }
}
