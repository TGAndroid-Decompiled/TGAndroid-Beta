package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class ou0 extends qt0 {
    public final HashSet f26856f3;
    public final ArrayList f26857g3;
    public final ArrayList f26858h3;
    public final ArrayList f26859i3;
    public TextPaint j3;
    public StaticLayout f26860k3;
    public float f26861l3;
    public float f26862m3;
    public ai.rc f26863n3;
    public int f26864o3;
    public final ArrayList f26865p3;

    public ou0(Context context) {
        super(context, null);
        this.f26856f3 = new HashSet();
        this.f26857g3 = new ArrayList();
        this.f26858h3 = new ArrayList();
        this.f26859i3 = new ArrayList();
        this.f26865p3 = new ArrayList();
    }

    public abstract boolean A1();

    public boolean B1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ou0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        uk0 movingAdapter = getMovingAdapter();
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

    public uk0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public uk0 getSupportingAdapter() {
        return null;
    }

    public qt0 getSupportingListView() {
        return null;
    }

    public abstract boolean z1();

    public void y1(org.telegram.ui.Cells.t7 t7Var) {
    }
}
