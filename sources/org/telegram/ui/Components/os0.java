package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class os0 extends sr0 {
    public final HashSet j3;
    public final ArrayList f36677k3;
    public final ArrayList f36678l3;
    public final ArrayList f36679m3;
    public TextPaint f36680n3;
    public StaticLayout f36681o3;
    public float f36682p3;
    public float f36683q3;
    public di.y9 f36684r3;
    public int f36685s3;
    public final ArrayList f36686t3;

    public os0(Context context) {
        super(context, null);
        this.j3 = new HashSet();
        this.f36677k3 = new ArrayList();
        this.f36678l3 = new ArrayList();
        this.f36679m3 = new ArrayList();
        this.f36686t3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.os0.dispatchDraw(android.graphics.Canvas):void");
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

    public sr0 getSupportingListView() {
        return null;
    }

    public os0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.j3 = new HashSet();
        this.f36677k3 = new ArrayList();
        this.f36678l3 = new ArrayList();
        this.f36679m3 = new ArrayList();
        this.f36686t3 = new ArrayList();
    }

    public void z1(org.telegram.ui.Cells.o7 o7Var) {
    }
}
