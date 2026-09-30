package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class cv0 extends eu0 {
    public final HashSet f23431m3;
    public final ArrayList f23432n3;
    public final ArrayList f23433o3;
    public final ArrayList f23434p3;
    public TextPaint f23435q3;
    public StaticLayout f23436r3;
    public float f23437s3;
    public float f23438t3;
    public ai.rc f23439u3;
    public int f23440v3;
    public final ArrayList f23441w3;

    public cv0(Context context) {
        super(context, null);
        this.f23431m3 = new HashSet();
        this.f23432n3 = new ArrayList();
        this.f23433o3 = new ArrayList();
        this.f23434p3 = new ArrayList();
        this.f23441w3 = new ArrayList();
    }

    public abstract boolean B1();

    public abstract boolean C1();

    public boolean D1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cv0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        hl0 movingAdapter = getMovingAdapter();
        if (D1() && getAdapter() == movingAdapter && B1() && (view instanceof org.telegram.ui.Cells.t7)) {
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

    public hl0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public hl0 getSupportingAdapter() {
        return null;
    }

    public eu0 getSupportingListView() {
        return null;
    }

    public void A1(org.telegram.ui.Cells.t7 t7Var) {
    }
}
