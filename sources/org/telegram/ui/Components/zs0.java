package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class zs0 extends cs0 {
    public final HashSet f42979k3;
    public final ArrayList f42980l3;
    public final ArrayList f42981m3;
    public final ArrayList f42982n3;
    public TextPaint f42983o3;
    public StaticLayout f42984p3;
    public float f42985q3;
    public float f42986r3;
    public fi.n9 f42987s3;
    public int f42988t3;
    public final ArrayList f42989u3;

    public zs0(Context context) {
        super(context, null);
        this.f42979k3 = new HashSet();
        this.f42980l3 = new ArrayList();
        this.f42981m3 = new ArrayList();
        this.f42982n3 = new ArrayList();
        this.f42989u3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zs0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        kj0 movingAdapter = getMovingAdapter();
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

    public zs0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f42979k3 = new HashSet();
        this.f42980l3 = new ArrayList();
        this.f42981m3 = new ArrayList();
        this.f42982n3 = new ArrayList();
        this.f42989u3 = new ArrayList();
    }

    public void z1(org.telegram.ui.Cells.p7 p7Var) {
    }
}
