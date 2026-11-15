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
    public final HashSet f38065k3;
    public final ArrayList f38066l3;
    public final ArrayList f38067m3;
    public final ArrayList f38068n3;
    public TextPaint f38069o3;
    public StaticLayout f38070p3;
    public float f38071q3;
    public float f38072r3;
    public fi.q9 f38073s3;
    public int f38074t3;
    public final ArrayList f38075u3;

    public os0(Context context) {
        super(context, null);
        this.f38065k3 = new HashSet();
        this.f38066l3 = new ArrayList();
        this.f38067m3 = new ArrayList();
        this.f38068n3 = new ArrayList();
        this.f38075u3 = new ArrayList();
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
        aj0 movingAdapter = getMovingAdapter();
        if (C1() && getAdapter() == movingAdapter && A1() && (view instanceof org.telegram.ui.Cells.n7)) {
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

    public aj0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public aj0 getSupportingAdapter() {
        return null;
    }

    public sr0 getSupportingListView() {
        return null;
    }

    public os0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f38065k3 = new HashSet();
        this.f38066l3 = new ArrayList();
        this.f38067m3 = new ArrayList();
        this.f38068n3 = new ArrayList();
        this.f38075u3 = new ArrayList();
    }

    public void z1(org.telegram.ui.Cells.n7 n7Var) {
    }
}
