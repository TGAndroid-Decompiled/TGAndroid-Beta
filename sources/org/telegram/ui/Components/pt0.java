package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class pt0 extends rs0 {
    public final HashSet f29424j3;
    public final ArrayList f29425k3;
    public final ArrayList f29426l3;
    public final ArrayList f29427m3;
    public TextPaint f29428n3;
    public StaticLayout f29429o3;
    public float f29430p3;
    public float f29431q3;
    public th.w7 f29432r3;
    public int f29433s3;
    public final ArrayList f29434t3;

    public pt0(Context context) {
        super(context, null);
        this.f29424j3 = new HashSet();
        this.f29425k3 = new ArrayList();
        this.f29426l3 = new ArrayList();
        this.f29427m3 = new ArrayList();
        this.f29434t3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pt0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ak0 movingAdapter = getMovingAdapter();
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

    public ak0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public ak0 getSupportingAdapter() {
        return null;
    }

    public rs0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.s7 s7Var) {
    }
}
