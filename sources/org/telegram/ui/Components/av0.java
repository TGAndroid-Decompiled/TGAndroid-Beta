package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class av0 extends cu0 {
    public final HashSet f22737f3;
    public final ArrayList f22738g3;
    public final ArrayList f22739h3;
    public final ArrayList f22740i3;
    public TextPaint j3;
    public StaticLayout f22741k3;
    public float f22742l3;
    public float f22743m3;
    public ai.rc f22744n3;
    public int f22745o3;
    public final ArrayList f22746p3;

    public av0(Context context) {
        super(context, null);
        this.f22737f3 = new HashSet();
        this.f22738g3 = new ArrayList();
        this.f22739h3 = new ArrayList();
        this.f22740i3 = new ArrayList();
        this.f22746p3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.av0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        el0 movingAdapter = getMovingAdapter();
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

    public el0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public el0 getSupportingAdapter() {
        return null;
    }

    public cu0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.t7 t7Var) {
    }
}
