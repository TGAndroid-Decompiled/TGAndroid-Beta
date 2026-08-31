package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class pu0 extends qt0 {
    public final HashSet c3;
    public final ArrayList f30205d3;
    public final ArrayList f30206e3;
    public final ArrayList f30207f3;
    public TextPaint f30208g3;
    public StaticLayout f30209h3;
    public float f30210i3;
    public float f30211j3;
    public oh.q9 f30212k3;
    public int f30213l3;
    public final ArrayList f30214m3;

    public pu0(Context context) {
        super(context, null);
        this.c3 = new HashSet();
        this.f30205d3 = new ArrayList();
        this.f30206e3 = new ArrayList();
        this.f30207f3 = new ArrayList();
        this.f30214m3 = new ArrayList();
    }

    public abstract boolean A1();

    public boolean B1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pu0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        dl0 movingAdapter = getMovingAdapter();
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

    public dl0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public dl0 getSupportingAdapter() {
        return null;
    }

    public qt0 getSupportingListView() {
        return null;
    }

    public abstract boolean z1();

    public void y1(org.telegram.ui.Cells.r7 r7Var) {
    }
}
