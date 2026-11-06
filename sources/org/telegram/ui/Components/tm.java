package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
public final class tm extends View {
    public final int f38380a;

    public tm(Context context, int i7) {
        super(context);
        this.f38380a = i7;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float L;
        int i7;
        float L2;
        int i10;
        float L3;
        int i11;
        float L4;
        int i12;
        float L5;
        int i13;
        switch (this.f38380a) {
            case 8:
                super.onDraw(canvas);
                canvas.drawLine(0.0f, org.telegram.messenger.g0.L(14.0f), 2.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.k6.f27971k0);
                return;
            case 15:
                if (org.telegram.messenger.hd.f22871a0) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(20.0f);
                }
                float f10 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (org.telegram.messenger.hd.f22871a0) {
                    i7 = org.telegram.messenger.g0.L(20.0f);
                } else {
                    i7 = 0;
                }
                canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27971k0);
                return;
            case 16:
                if (org.telegram.messenger.hd.f22871a0) {
                    L2 = 0.0f;
                } else {
                    L2 = org.telegram.messenger.g0.L(20.0f);
                }
                float f11 = L2;
                float measuredHeight2 = getMeasuredHeight() - 1;
                int measuredWidth2 = getMeasuredWidth();
                if (org.telegram.messenger.hd.f22871a0) {
                    i10 = org.telegram.messenger.g0.L(20.0f);
                } else {
                    i10 = 0;
                }
                canvas.drawLine(f11, measuredHeight2, measuredWidth2 - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27971k0);
                return;
            case 17:
                if (org.telegram.messenger.hd.f22871a0) {
                    L3 = 0.0f;
                } else {
                    L3 = org.telegram.messenger.g0.L(20.0f);
                }
                float f12 = L3;
                float measuredHeight3 = getMeasuredHeight() - 1;
                int measuredWidth3 = getMeasuredWidth();
                if (org.telegram.messenger.hd.f22871a0) {
                    i11 = org.telegram.messenger.g0.L(20.0f);
                } else {
                    i11 = 0;
                }
                canvas.drawLine(f12, measuredHeight3, measuredWidth3 - i11, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27971k0);
                return;
            case 18:
                if (org.telegram.messenger.hd.f22871a0) {
                    L4 = 0.0f;
                } else {
                    L4 = org.telegram.messenger.g0.L(20.0f);
                }
                float f13 = L4;
                float measuredHeight4 = getMeasuredHeight() - 1;
                int measuredWidth4 = getMeasuredWidth();
                if (org.telegram.messenger.hd.f22871a0) {
                    i12 = org.telegram.messenger.g0.L(20.0f);
                } else {
                    i12 = 0;
                }
                canvas.drawLine(f13, measuredHeight4, measuredWidth4 - i12, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27971k0);
                return;
            case 26:
                if (org.telegram.messenger.hd.f22871a0) {
                    L5 = 0.0f;
                } else {
                    L5 = org.telegram.messenger.g0.L(20.0f);
                }
                float f14 = L5;
                float measuredHeight5 = getMeasuredHeight() - 1;
                int measuredWidth5 = getMeasuredWidth();
                if (org.telegram.messenger.hd.f22871a0) {
                    i13 = org.telegram.messenger.g0.L(20.0f);
                } else {
                    i13 = 0;
                }
                canvas.drawLine(f14, measuredHeight5, measuredWidth5 - i13, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27971k0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        boolean z9;
        float f10;
        float f11;
        switch (this.f38380a) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                return;
            case 2:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
                return;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
                return;
            case 4:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(81.0f), 1073741824));
                return;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(8.0f), 1073741824));
                return;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
                return;
            case 7:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.g0.f22537q.y * 0.4f), 1073741824));
                return;
            case 8:
            case 15:
            case 16:
            case 17:
            case 18:
            case 26:
            default:
                super.onMeasure(i7, i10);
                return;
            case 9:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(300.0f), 1073741824));
                return;
            case 10:
                Point point = org.telegram.messenger.g0.f22537q;
                int i11 = point.x;
                int i12 = point.y;
                if (i11 < i12) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                float f12 = i12;
                if (z9) {
                    f10 = 0.56f;
                } else {
                    f10 = 0.3f;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (f12 * f10), 1073741824));
                return;
            case 11:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(5.0f), 1073741824));
                return;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.g0.f22537q.y * 0.4f), 1073741824));
                return;
            case 13:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(4.0f), 1073741824));
                return;
            case 14:
                if (org.telegram.ui.c40.f44521w5) {
                    f11 = 0.0f;
                } else {
                    f11 = 8.0f;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
                return;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), 1073741824));
                return;
            case 20:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(36.0f));
                return;
            case 21:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(7.33f), 1073741824));
                return;
            case 22:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824));
                return;
            case 23:
                super.onMeasure(i7, i10);
                setPivotX(getMeasuredWidth() / 2);
                setPivotY(getMeasuredHeight());
                return;
            case 24:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
                return;
            case 25:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(4.0f), 1073741824));
                return;
            case 27:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(6.0f), 1073741824));
                return;
            case 28:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824));
                return;
        }
    }
}
