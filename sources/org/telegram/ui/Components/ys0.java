package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class ys0 extends cs0 {
    public final HashSet f42549k3;
    public final ArrayList f42550l3;
    public final ArrayList f42551m3;
    public final ArrayList f42552n3;
    public TextPaint f42553o3;
    public StaticLayout f42554p3;
    public float f42555q3;
    public float f42556r3;
    public fi.n9 f42557s3;
    public int f42558t3;
    public final ArrayList f42559u3;

    public ys0(Context context) {
        super(context, null);
        this.f42549k3 = new HashSet();
        this.f42550l3 = new ArrayList();
        this.f42551m3 = new ArrayList();
        this.f42552n3 = new ArrayList();
        this.f42559u3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ys0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        kj0 movingAdapter = getMovingAdapter();
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

    public kj0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public kj0 getSupportingAdapter() {
        return null;
    }

    public cs0 getSupportingListView() {
        return null;
    }

    public ys0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f42549k3 = new HashSet();
        this.f42550l3 = new ArrayList();
        this.f42551m3 = new ArrayList();
        this.f42552n3 = new ArrayList();
        this.f42559u3 = new ArrayList();
    }

    public void z1(org.telegram.ui.Cells.o7 o7Var) {
    }
}
