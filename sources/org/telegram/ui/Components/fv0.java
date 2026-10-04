package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class fv0 extends hu0 {
    public final HashSet f26576m3;
    public final ArrayList f26577n3;
    public final ArrayList f26578o3;
    public final ArrayList f26579p3;
    public TextPaint f26580q3;
    public StaticLayout f26581r3;
    public float f26582s3;
    public float f26583t3;
    public ai.rc f26584u3;
    public int f26585v3;
    public final ArrayList f26586w3;

    public fv0(Context context) {
        super(context, null);
        this.f26576m3 = new HashSet();
        this.f26577n3 = new ArrayList();
        this.f26578o3 = new ArrayList();
        this.f26579p3 = new ArrayList();
        this.f26586w3 = new ArrayList();
    }

    public abstract boolean B1();

    public abstract boolean C1();

    public boolean D1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fv0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        gl0 movingAdapter = getMovingAdapter();
        if (D1() && getAdapter() == movingAdapter && B1() && (view instanceof org.telegram.ui.Cells.t7)) {
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

    public gl0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public gl0 getSupportingAdapter() {
        return null;
    }

    public hu0 getSupportingListView() {
        return null;
    }

    public void A1(org.telegram.ui.Cells.t7 t7Var) {
    }
}
