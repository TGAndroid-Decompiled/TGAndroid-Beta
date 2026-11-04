package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
public final class sm extends View {
    public final int f38064a;

    public sm(Context context, int i3) {
        super(context);
        this.f38064a = i3;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float L;
        int i3;
        float L2;
        int i10;
        float L3;
        int i11;
        float L4;
        int i12;
        float L5;
        int i13;
        switch (this.f38064a) {
            case 1:
                if (getAlpha() != 0.0f) {
                    org.telegram.messenger.g0.P.set(0.0f, 0.0f, getWidth(), getHeight());
                    invalidate();
                    return;
                }
                return;
            case 9:
                super.onDraw(canvas);
                canvas.drawLine(0.0f, org.telegram.messenger.g0.L(14.0f), 2.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.k6.f28002k0);
                return;
            case 16:
                if (org.telegram.messenger.bd.f21784a0) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(20.0f);
                }
                float f10 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (org.telegram.messenger.bd.f21784a0) {
                    i3 = org.telegram.messenger.g0.L(20.0f);
                } else {
                    i3 = 0;
                }
                canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
                return;
            case 17:
                if (org.telegram.messenger.bd.f21784a0) {
                    L2 = 0.0f;
                } else {
                    L2 = org.telegram.messenger.g0.L(20.0f);
                }
                float f11 = L2;
                float measuredHeight2 = getMeasuredHeight() - 1;
                int measuredWidth2 = getMeasuredWidth();
                if (org.telegram.messenger.bd.f21784a0) {
                    i10 = org.telegram.messenger.g0.L(20.0f);
                } else {
                    i10 = 0;
                }
                canvas.drawLine(f11, measuredHeight2, measuredWidth2 - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
                return;
            case 18:
                if (org.telegram.messenger.bd.f21784a0) {
                    L3 = 0.0f;
                } else {
                    L3 = org.telegram.messenger.g0.L(20.0f);
                }
                float f12 = L3;
                float measuredHeight3 = getMeasuredHeight() - 1;
                int measuredWidth3 = getMeasuredWidth();
                if (org.telegram.messenger.bd.f21784a0) {
                    i11 = org.telegram.messenger.g0.L(20.0f);
                } else {
                    i11 = 0;
                }
                canvas.drawLine(f12, measuredHeight3, measuredWidth3 - i11, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
                return;
            case 19:
                if (org.telegram.messenger.bd.f21784a0) {
                    L4 = 0.0f;
                } else {
                    L4 = org.telegram.messenger.g0.L(20.0f);
                }
                float f13 = L4;
                float measuredHeight4 = getMeasuredHeight() - 1;
                int measuredWidth4 = getMeasuredWidth();
                if (org.telegram.messenger.bd.f21784a0) {
                    i12 = org.telegram.messenger.g0.L(20.0f);
                } else {
                    i12 = 0;
                }
                canvas.drawLine(f13, measuredHeight4, measuredWidth4 - i12, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
                return;
            case 27:
                if (org.telegram.messenger.bd.f21784a0) {
                    L5 = 0.0f;
                } else {
                    L5 = org.telegram.messenger.g0.L(20.0f);
                }
                float f14 = L5;
                float measuredHeight5 = getMeasuredHeight() - 1;
                int measuredWidth5 = getMeasuredWidth();
                if (org.telegram.messenger.bd.f21784a0) {
                    i13 = org.telegram.messenger.g0.L(20.0f);
                } else {
                    i13 = 0;
                }
                canvas.drawLine(f14, measuredHeight5, measuredWidth5 - i13, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        boolean z10;
        float f10;
        float f11;
        switch (this.f38064a) {
            case 2:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                return;
            case 3:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
                return;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
                return;
            case 5:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(81.0f), 1073741824));
                return;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(8.0f), 1073741824));
                return;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
                return;
            case 8:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.g0.f22608q.y * 0.4f), 1073741824));
                return;
            case 9:
            case 16:
            case 17:
            case 18:
            case 19:
            case 27:
            default:
                super.onMeasure(i3, i10);
                return;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(300.0f), 1073741824));
                return;
            case 11:
                Point point = org.telegram.messenger.g0.f22608q;
                int i11 = point.x;
                int i12 = point.y;
                if (i11 < i12) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float f12 = i12;
                if (z10) {
                    f10 = 0.56f;
                } else {
                    f10 = 0.3f;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((int) (f12 * f10), 1073741824));
                return;
            case 12:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(5.0f), 1073741824));
                return;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.g0.f22608q.y * 0.4f), 1073741824));
                return;
            case 14:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(4.0f), 1073741824));
                return;
            case 15:
                if (org.telegram.ui.x30.f51713x5) {
                    f11 = 0.0f;
                } else {
                    f11 = 8.0f;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
                return;
            case 20:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), 1073741824));
                return;
            case 21:
                setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(36.0f));
                return;
            case 22:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(7.33f), 1073741824));
                return;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824));
                return;
            case 24:
                super.onMeasure(i3, i10);
                setPivotX(getMeasuredWidth() / 2);
                setPivotY(getMeasuredHeight());
                return;
            case 25:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
                return;
            case 26:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(4.0f), 1073741824));
                return;
            case 28:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(6.0f), 1073741824));
                return;
            case 29:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824));
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f38064a) {
            case 1:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }
}
