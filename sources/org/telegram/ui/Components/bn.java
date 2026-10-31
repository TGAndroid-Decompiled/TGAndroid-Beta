package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
public final class bn extends View {
    public final int f24841a;

    public bn(Context context, int i10) {
        super(context);
        this.f24841a = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float L;
        int i10;
        float L2;
        int i11;
        float L3;
        int i12;
        float L4;
        int i13;
        float L5;
        int i14;
        switch (this.f24841a) {
            case 5:
                super.onDraw(canvas);
                canvas.drawLine(0.0f, org.telegram.messenger.i0.L(14.0f), 2.0f, getMeasuredHeight() - org.telegram.messenger.i0.L(14.0f), org.telegram.ui.ActionBar.t6.f21052k0);
                return;
            case 12:
                if (org.telegram.messenger.cd.X) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.i0.L(20.0f);
                }
                float f7 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (org.telegram.messenger.cd.X) {
                    i10 = org.telegram.messenger.i0.L(20.0f);
                } else {
                    i10 = 0;
                }
                canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
                return;
            case 13:
                if (org.telegram.messenger.cd.X) {
                    L2 = 0.0f;
                } else {
                    L2 = org.telegram.messenger.i0.L(20.0f);
                }
                float f10 = L2;
                float measuredHeight2 = getMeasuredHeight() - 1;
                int measuredWidth2 = getMeasuredWidth();
                if (org.telegram.messenger.cd.X) {
                    i11 = org.telegram.messenger.i0.L(20.0f);
                } else {
                    i11 = 0;
                }
                canvas.drawLine(f10, measuredHeight2, measuredWidth2 - i11, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
                return;
            case 14:
                if (org.telegram.messenger.cd.X) {
                    L3 = 0.0f;
                } else {
                    L3 = org.telegram.messenger.i0.L(20.0f);
                }
                float f11 = L3;
                float measuredHeight3 = getMeasuredHeight() - 1;
                int measuredWidth3 = getMeasuredWidth();
                if (org.telegram.messenger.cd.X) {
                    i12 = org.telegram.messenger.i0.L(20.0f);
                } else {
                    i12 = 0;
                }
                canvas.drawLine(f11, measuredHeight3, measuredWidth3 - i12, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
                return;
            case 15:
                if (org.telegram.messenger.cd.X) {
                    L4 = 0.0f;
                } else {
                    L4 = org.telegram.messenger.i0.L(20.0f);
                }
                float f12 = L4;
                float measuredHeight4 = getMeasuredHeight() - 1;
                int measuredWidth4 = getMeasuredWidth();
                if (org.telegram.messenger.cd.X) {
                    i13 = org.telegram.messenger.i0.L(20.0f);
                } else {
                    i13 = 0;
                }
                canvas.drawLine(f12, measuredHeight4, measuredWidth4 - i13, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
                return;
            case 23:
                if (org.telegram.messenger.cd.X) {
                    L5 = 0.0f;
                } else {
                    L5 = org.telegram.messenger.i0.L(20.0f);
                }
                float f13 = L5;
                float measuredHeight5 = getMeasuredHeight() - 1;
                int measuredWidth5 = getMeasuredWidth();
                if (org.telegram.messenger.cd.X) {
                    i14 = org.telegram.messenger.i0.L(20.0f);
                } else {
                    i14 = 0;
                }
                canvas.drawLine(f13, measuredHeight5, measuredWidth5 - i14, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
                return;
            case 25:
                if (getAlpha() != 0.0f) {
                    org.telegram.messenger.i0.P.set(0.0f, 0.0f, getWidth(), getHeight());
                    invalidate();
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        float f10;
        switch (this.f24841a) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(16.0f), 1073741824));
                return;
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(68.0f), 1073741824));
                return;
            case 3:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(52.0f), 1073741824));
                return;
            case 4:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.i0.f16026q.y * 0.4f), 1073741824));
                return;
            case 5:
            case 12:
            case 13:
            case 14:
            case 15:
            case 23:
            case 25:
            default:
                super.onMeasure(i10, i11);
                return;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(300.0f), 1073741824));
                return;
            case 7:
                Point point = org.telegram.messenger.i0.f16026q;
                int i12 = point.x;
                int i13 = point.y;
                if (i12 < i13) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float f11 = i13;
                if (z10) {
                    f7 = 0.56f;
                } else {
                    f7 = 0.3f;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (f11 * f7), 1073741824));
                return;
            case 8:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(5.0f), 1073741824));
                return;
            case 9:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.i0.f16026q.y * 0.4f), 1073741824));
                return;
            case 10:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(4.0f), 1073741824));
                return;
            case 11:
                if (org.telegram.ui.b50.f35991w5) {
                    f10 = 0.0f;
                } else {
                    f10 = 8.0f;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f10), 1073741824));
                return;
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(12.0f), 1073741824));
                return;
            case 17:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(36.0f));
                return;
            case 18:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(7.33f), 1073741824));
                return;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(16.0f), 1073741824));
                return;
            case 20:
                super.onMeasure(i10, i11);
                setPivotX(getMeasuredWidth() / 2);
                setPivotY(getMeasuredHeight());
                return;
            case 21:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(52.0f), 1073741824));
                return;
            case 22:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(4.0f), 1073741824));
                return;
            case 24:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(6.0f), 1073741824));
                return;
            case 26:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), 1073741824));
                return;
            case 27:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), 1073741824));
                return;
            case 28:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(52.0f), 1073741824));
                return;
            case 29:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(81.0f), 1073741824));
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f24841a) {
            case 25:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
