package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class nu0 extends pt0 {
    public final HashSet f28869f3;
    public final ArrayList f28870g3;
    public final ArrayList f28871h3;
    public final ArrayList f28872i3;
    public TextPaint j3;
    public StaticLayout f28873k3;
    public float f28874l3;
    public float f28875m3;
    public bi.xb f28876n3;
    public int f28877o3;
    public final ArrayList f28878p3;

    public nu0(Context context) {
        super(context, null);
        this.f28869f3 = new HashSet();
        this.f28870g3 = new ArrayList();
        this.f28871h3 = new ArrayList();
        this.f28872i3 = new ArrayList();
        this.f28878p3 = new ArrayList();
    }

    public boolean A1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nu0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        tk0 movingAdapter = getMovingAdapter();
        if (A1() && getAdapter() == movingAdapter && y1() && (view instanceof org.telegram.ui.Cells.t7)) {
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

    public tk0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public tk0 getSupportingAdapter() {
        return null;
    }

    public pt0 getSupportingListView() {
        return null;
    }

    public abstract boolean y1();

    public abstract boolean z1();

    public void x1(org.telegram.ui.Cells.t7 t7Var) {
    }
}
