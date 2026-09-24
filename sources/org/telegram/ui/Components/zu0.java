package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class zu0 extends bu0 {
    public final HashSet f30983f3;
    public final ArrayList f30984g3;
    public final ArrayList f30985h3;
    public final ArrayList f30986i3;
    public TextPaint j3;
    public StaticLayout f30987k3;
    public float f30988l3;
    public float f30989m3;
    public ai.rc f30990n3;
    public int f30991o3;
    public final ArrayList f30992p3;

    public zu0(Context context) {
        super(context, null);
        this.f30983f3 = new HashSet();
        this.f30984g3 = new ArrayList();
        this.f30985h3 = new ArrayList();
        this.f30986i3 = new ArrayList();
        this.f30992p3 = new ArrayList();
    }

    public abstract boolean A1();

    public boolean B1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zu0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        el0 movingAdapter = getMovingAdapter();
        if (B1() && getAdapter() == movingAdapter && z1() && (view instanceof org.telegram.ui.Cells.t7)) {
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

    public bu0 getSupportingListView() {
        return null;
    }

    public abstract boolean z1();

    public void y1(org.telegram.ui.Cells.t7 t7Var) {
    }
}
