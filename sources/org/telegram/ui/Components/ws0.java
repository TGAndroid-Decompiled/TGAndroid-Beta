package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class ws0 extends as0 {
    public final HashSet f41775k3;
    public final ArrayList f41776l3;
    public final ArrayList f41777m3;
    public final ArrayList f41778n3;
    public TextPaint f41779o3;
    public StaticLayout f41780p3;
    public float f41781q3;
    public float f41782r3;
    public fi.n9 f41783s3;
    public int f41784t3;
    public final ArrayList f41785u3;

    public ws0(Context context) {
        super(context, null);
        this.f41775k3 = new HashSet();
        this.f41776l3 = new ArrayList();
        this.f41777m3 = new ArrayList();
        this.f41778n3 = new ArrayList();
        this.f41785u3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ws0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ij0 movingAdapter = getMovingAdapter();
        if (C1() && getAdapter() == movingAdapter && A1() && (view instanceof org.telegram.ui.Cells.p7)) {
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

    public ij0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public ij0 getSupportingAdapter() {
        return null;
    }

    public as0 getSupportingListView() {
        return null;
    }

    public ws0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f41775k3 = new HashSet();
        this.f41776l3 = new ArrayList();
        this.f41777m3 = new ArrayList();
        this.f41778n3 = new ArrayList();
        this.f41785u3 = new ArrayList();
    }

    public void z1(org.telegram.ui.Cells.p7 p7Var) {
    }
}
