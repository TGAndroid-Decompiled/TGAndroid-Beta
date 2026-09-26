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
    public final HashSet f22758f3;
    public final ArrayList f22759g3;
    public final ArrayList f22760h3;
    public final ArrayList f22761i3;
    public TextPaint j3;
    public StaticLayout f22762k3;
    public float f22763l3;
    public float f22764m3;
    public ai.rc f22765n3;
    public int f22766o3;
    public final ArrayList f22767p3;

    public av0(Context context) {
        super(context, null);
        this.f22758f3 = new HashSet();
        this.f22759g3 = new ArrayList();
        this.f22760h3 = new ArrayList();
        this.f22761i3 = new ArrayList();
        this.f22767p3 = new ArrayList();
    }

    public abstract boolean A1();

    public boolean B1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.av0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        fl0 movingAdapter = getMovingAdapter();
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

    public fl0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public fl0 getSupportingAdapter() {
        return null;
    }

    public cu0 getSupportingListView() {
        return null;
    }

    public abstract boolean z1();

    public void y1(org.telegram.ui.Cells.t7 t7Var) {
    }
}
