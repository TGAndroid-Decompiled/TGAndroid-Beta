package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class ms0 extends qr0 {
    public final HashSet f36239k3;
    public final ArrayList f36240l3;
    public final ArrayList f36241m3;
    public final ArrayList f36242n3;
    public TextPaint f36243o3;
    public StaticLayout f36244p3;
    public float f36245q3;
    public float f36246r3;
    public ei.z9 f36247s3;
    public int f36248t3;
    public final ArrayList f36249u3;

    public ms0(Context context) {
        super(context, null);
        this.f36239k3 = new HashSet();
        this.f36240l3 = new ArrayList();
        this.f36241m3 = new ArrayList();
        this.f36242n3 = new ArrayList();
        this.f36249u3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ms0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        zi0 movingAdapter = getMovingAdapter();
        if (C1() && getAdapter() == movingAdapter && A1() && (view instanceof org.telegram.ui.Cells.n7)) {
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

    public zi0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public zi0 getSupportingAdapter() {
        return null;
    }

    public qr0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.n7 n7Var) {
    }
}
