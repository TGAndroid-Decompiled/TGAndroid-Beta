package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class ns0 extends rr0 {
    public final HashSet j3;
    public final ArrayList f36412k3;
    public final ArrayList f36413l3;
    public final ArrayList f36414m3;
    public TextPaint f36415n3;
    public StaticLayout f36416o3;
    public float f36417p3;
    public float f36418q3;
    public di.x9 f36419r3;
    public int f36420s3;
    public final ArrayList f36421t3;

    public ns0(Context context) {
        super(context, null);
        this.j3 = new HashSet();
        this.f36412k3 = new ArrayList();
        this.f36413l3 = new ArrayList();
        this.f36414m3 = new ArrayList();
        this.f36421t3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ns0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        vi0 movingAdapter = getMovingAdapter();
        if (C1() && getAdapter() == movingAdapter && A1() && (view instanceof org.telegram.ui.Cells.o7)) {
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

    public vi0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public vi0 getSupportingAdapter() {
        return null;
    }

    public rr0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.o7 o7Var) {
    }
}
