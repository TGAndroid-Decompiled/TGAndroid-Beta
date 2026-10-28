package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class rv0 extends tu0 {
    public final HashSet f32381k3;
    public final ArrayList f32382l3;
    public final ArrayList f32383m3;
    public final ArrayList f32384n3;
    public TextPaint f32385o3;
    public StaticLayout f32386p3;
    public float f32387q3;
    public float f32388r3;
    public di.ga f32389s3;
    public int f32390t3;
    public final ArrayList f32391u3;

    public rv0(Context context) {
        super(context, null);
        this.f32381k3 = new HashSet();
        this.f32382l3 = new ArrayList();
        this.f32383m3 = new ArrayList();
        this.f32384n3 = new ArrayList();
        this.f32391u3 = new ArrayList();
    }

    public abstract boolean D1();

    public abstract boolean E1();

    public boolean F1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rv0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ul0 movingAdapter = getMovingAdapter();
        if (F1() && getAdapter() == movingAdapter && D1() && (view instanceof org.telegram.ui.Cells.w7)) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
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

    public ul0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public ul0 getSupportingAdapter() {
        return null;
    }

    public tu0 getSupportingListView() {
        return null;
    }

    public void C1(org.telegram.ui.Cells.w7 w7Var) {
    }
}
