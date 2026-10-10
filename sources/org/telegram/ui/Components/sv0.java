package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class sv0 extends uu0 {
    public final HashSet f30869d3;
    public final ArrayList f30870e3;
    public final ArrayList f30871f3;
    public final ArrayList f30872g3;
    public TextPaint f30873h3;
    public StaticLayout f30874i3;
    public float j3;
    public float f30875k3;
    public ai.sc f30876l3;
    public int f30877m3;
    public final ArrayList f30878n3;

    public sv0(Context context) {
        super(context, null);
        this.f30869d3 = new HashSet();
        this.f30870e3 = new ArrayList();
        this.f30871f3 = new ArrayList();
        this.f30872g3 = new ArrayList();
        this.f30878n3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sv0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        zl0 movingAdapter = getMovingAdapter();
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

    public zl0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public zl0 getSupportingAdapter() {
        return null;
    }

    public uu0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.t7 t7Var) {
    }
}
