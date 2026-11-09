package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class ps0 extends tr0 {
    public final HashSet j3;
    public final ArrayList f37078k3;
    public final ArrayList f37079l3;
    public final ArrayList f37080m3;
    public TextPaint f37081n3;
    public StaticLayout f37082o3;
    public float f37083p3;
    public float f37084q3;
    public di.y9 f37085r3;
    public int f37086s3;
    public final ArrayList f37087t3;

    public ps0(Context context) {
        super(context, null);
        this.j3 = new HashSet();
        this.f37078k3 = new ArrayList();
        this.f37079l3 = new ArrayList();
        this.f37080m3 = new ArrayList();
        this.f37087t3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ps0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        wi0 movingAdapter = getMovingAdapter();
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

    public wi0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public wi0 getSupportingAdapter() {
        return null;
    }

    public tr0 getSupportingListView() {
        return null;
    }

    public ps0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.j3 = new HashSet();
        this.f37078k3 = new ArrayList();
        this.f37079l3 = new ArrayList();
        this.f37080m3 = new ArrayList();
        this.f37087t3 = new ArrayList();
    }

    public void z1(org.telegram.ui.Cells.o7 o7Var) {
    }
}
