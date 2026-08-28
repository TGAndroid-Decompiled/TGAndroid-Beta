package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class an extends View {
    public final int f26871a;

    public an(Context context, int i9) {
        super(context);
        this.f26871a = i9;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float dp;
        int i9;
        float dp2;
        int i10;
        float dp3;
        int i11;
        float dp4;
        int i12;
        float dp5;
        int i13;
        switch (this.f26871a) {
            case 2:
                if (getAlpha() != 0.0f) {
                    AndroidUtilities.rectTmp.set(0.0f, 0.0f, getWidth(), getHeight());
                    invalidate();
                    return;
                }
                return;
            case 10:
                super.onDraw(canvas);
                canvas.drawLine(0.0f, AndroidUtilities.dp(14.0f), 2.0f, getMeasuredHeight() - AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.f6.f23121k0);
                return;
            case 17:
                if (LocaleController.isRTL) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (LocaleController.isRTL) {
                    i9 = AndroidUtilities.dp(20.0f);
                } else {
                    i9 = 0;
                }
                canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
                return;
            case 18:
                if (LocaleController.isRTL) {
                    dp2 = 0.0f;
                } else {
                    dp2 = AndroidUtilities.dp(20.0f);
                }
                float measuredHeight2 = getMeasuredHeight() - 1;
                int measuredWidth2 = getMeasuredWidth();
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(20.0f);
                } else {
                    i10 = 0;
                }
                canvas.drawLine(dp2, measuredHeight2, measuredWidth2 - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
                return;
            case 19:
                if (LocaleController.isRTL) {
                    dp3 = 0.0f;
                } else {
                    dp3 = AndroidUtilities.dp(20.0f);
                }
                float measuredHeight3 = getMeasuredHeight() - 1;
                int measuredWidth3 = getMeasuredWidth();
                if (LocaleController.isRTL) {
                    i11 = AndroidUtilities.dp(20.0f);
                } else {
                    i11 = 0;
                }
                canvas.drawLine(dp3, measuredHeight3, measuredWidth3 - i11, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
                return;
            case 20:
                if (LocaleController.isRTL) {
                    dp4 = 0.0f;
                } else {
                    dp4 = AndroidUtilities.dp(20.0f);
                }
                float measuredHeight4 = getMeasuredHeight() - 1;
                int measuredWidth4 = getMeasuredWidth();
                if (LocaleController.isRTL) {
                    i12 = AndroidUtilities.dp(20.0f);
                } else {
                    i12 = 0;
                }
                canvas.drawLine(dp4, measuredHeight4, measuredWidth4 - i12, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
                return;
            case 28:
                if (LocaleController.isRTL) {
                    dp5 = 0.0f;
                } else {
                    dp5 = AndroidUtilities.dp(20.0f);
                }
                float measuredHeight5 = getMeasuredHeight() - 1;
                int measuredWidth5 = getMeasuredWidth();
                if (LocaleController.isRTL) {
                    i13 = AndroidUtilities.dp(20.0f);
                } else {
                    i13 = 0;
                }
                canvas.drawLine(dp5, measuredHeight5, measuredWidth5 - i13, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        boolean z10;
        float f10;
        float f11;
        switch (this.f26871a) {
            case 1:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
                return;
            case 2:
            case 10:
            case 17:
            case 18:
            case 19:
            case 20:
            case 28:
            default:
                super.onMeasure(i9, i10);
                return;
            case 3:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                return;
            case 4:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                return;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
                return;
            case 6:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), 1073741824));
                return;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(8.0f), 1073741824));
                return;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
                return;
            case 9:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.4f), 1073741824));
                return;
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), 1073741824));
                return;
            case 12:
                Point point = AndroidUtilities.displaySize;
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
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) (f12 * f10), 1073741824));
                return;
            case 13:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(5.0f), 1073741824));
                return;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.4f), 1073741824));
                return;
            case 15:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(4.0f), 1073741824));
                return;
            case 16:
                if (org.telegram.ui.o50.B3) {
                    f11 = 0.0f;
                } else {
                    f11 = 8.0f;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), 1073741824));
                return;
            case 21:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                return;
            case 22:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
                return;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(7.33f), 1073741824));
                return;
            case 24:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
                return;
            case 25:
                super.onMeasure(i9, i10);
                setPivotX(getMeasuredWidth() / 2);
                setPivotY(getMeasuredHeight());
                return;
            case 26:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
                return;
            case 27:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(4.0f), 1073741824));
                return;
            case 29:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(6.0f), 1073741824));
                return;
        }
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.f26871a) {
            case 2:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
        }
    }
}
