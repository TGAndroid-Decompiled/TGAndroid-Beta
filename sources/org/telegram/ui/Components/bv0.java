package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class bv0 extends du0 {
    public final HashSet f23101f3;
    public final ArrayList f23102g3;
    public final ArrayList f23103h3;
    public final ArrayList f23104i3;
    public TextPaint j3;
    public StaticLayout f23105k3;
    public float f23106l3;
    public float f23107m3;
    public ai.rc f23108n3;
    public int f23109o3;
    public final ArrayList f23110p3;

    public bv0(Context context) {
        super(context, null);
        this.f23101f3 = new HashSet();
        this.f23102g3 = new ArrayList();
        this.f23103h3 = new ArrayList();
        this.f23104i3 = new ArrayList();
        this.f23110p3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bv0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        gl0 movingAdapter = getMovingAdapter();
        if (C1() && getAdapter() == movingAdapter && A1() && (view instanceof org.telegram.ui.Cells.u7)) {
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

    public gl0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public gl0 getSupportingAdapter() {
        return null;
    }

    public du0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.u7 u7Var) {
    }
}
