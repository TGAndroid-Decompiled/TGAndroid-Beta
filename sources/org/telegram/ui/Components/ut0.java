package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class ut0 extends ws0 {
    public final HashSet f33132b3;
    public final ArrayList f33133c3;
    public final ArrayList f33134d3;
    public final ArrayList f33135e3;
    public TextPaint f33136f3;
    public StaticLayout f33137g3;
    public float f33138h3;
    public float f33139i3;
    public ih.u9 f33140j3;
    public int f33141k3;
    public final ArrayList f33142l3;

    public ut0(Context context) {
        super(context, null);
        this.f33132b3 = new HashSet();
        this.f33133c3 = new ArrayList();
        this.f33134d3 = new ArrayList();
        this.f33135e3 = new ArrayList();
        this.f33142l3 = new ArrayList();
    }

    public abstract boolean A1();

    public boolean B1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ut0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        gk0 movingAdapter = getMovingAdapter();
        if (B1() && getAdapter() == movingAdapter && z1() && (view instanceof org.telegram.ui.Cells.r7)) {
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

    public gk0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public gk0 getSupportingAdapter() {
        return null;
    }

    public ws0 getSupportingListView() {
        return null;
    }

    public abstract boolean z1();

    public void y1(org.telegram.ui.Cells.r7 r7Var) {
    }
}
