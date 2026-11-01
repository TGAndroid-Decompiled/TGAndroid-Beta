package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class qt0 extends ss0 {
    public final HashSet f29796j3;
    public final ArrayList f29797k3;
    public final ArrayList f29798l3;
    public final ArrayList f29799m3;
    public TextPaint f29800n3;
    public StaticLayout f29801o3;
    public float f29802p3;
    public float f29803q3;
    public th.w7 f29804r3;
    public int f29805s3;
    public final ArrayList f29806t3;

    public qt0(Context context) {
        super(context, null);
        this.f29796j3 = new HashSet();
        this.f29797k3 = new ArrayList();
        this.f29798l3 = new ArrayList();
        this.f29799m3 = new ArrayList();
        this.f29806t3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qt0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        bk0 movingAdapter = getMovingAdapter();
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

    public bk0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public bk0 getSupportingAdapter() {
        return null;
    }

    public ss0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.s7 s7Var) {
    }
}
