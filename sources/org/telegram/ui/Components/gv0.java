package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class gv0 extends iu0 {
    public final HashSet f26979m3;
    public final ArrayList f26980n3;
    public final ArrayList f26981o3;
    public final ArrayList f26982p3;
    public TextPaint f26983q3;
    public StaticLayout f26984r3;
    public float f26985s3;
    public float f26986t3;
    public ai.rc f26987u3;
    public int f26988v3;
    public final ArrayList f26989w3;

    public gv0(Context context) {
        super(context, null);
        this.f26979m3 = new HashSet();
        this.f26980n3 = new ArrayList();
        this.f26981o3 = new ArrayList();
        this.f26982p3 = new ArrayList();
        this.f26989w3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gv0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        gl0 movingAdapter = getMovingAdapter();
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

    public gl0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public gl0 getSupportingAdapter() {
        return null;
    }

    public iu0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.t7 t7Var) {
    }
}
