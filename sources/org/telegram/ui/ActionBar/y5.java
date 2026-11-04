package org.telegram.ui.ActionBar;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.StateSet;
public abstract class y5 {
    public static final int f28879a = k6.f27878d6;
    public static float[] f28880b;

    public static float[] a(float... fArr) {
        if (fArr.length == 0) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        return fArr.length == 1 ? new float[]{org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0])} : fArr.length == 2 ? new float[]{org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[1])} : fArr.length == 3 ? new float[]{org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[2]), org.telegram.messenger.g0.L(fArr[2]), org.telegram.messenger.g0.L(fArr[2]), org.telegram.messenger.g0.L(fArr[2])} : fArr.length < 8 ? new float[]{org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[2]), org.telegram.messenger.g0.L(fArr[2]), org.telegram.messenger.g0.L(fArr[3]), org.telegram.messenger.g0.L(fArr[3])} : new float[]{org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[2]), org.telegram.messenger.g0.L(fArr[3]), org.telegram.messenger.g0.L(fArr[4]), org.telegram.messenger.g0.L(fArr[5]), org.telegram.messenger.g0.L(fArr[6]), org.telegram.messenger.g0.L(fArr[7])};
    }

    public static int b(int i3) {
        float f10;
        float f11;
        float f12;
        if (f28880b == null) {
            f28880b = new float[3];
        }
        Color.colorToHSV(i3, f28880b);
        float[] fArr = f28880b;
        float f13 = fArr[1];
        if (f13 > 0.01f) {
            if (k6.I.q()) {
                f11 = 0.25f;
            } else {
                f11 = -0.25f;
            }
            fArr[1] = Math.min(1.0f, Math.max(0.0f, f13 + f11));
            float[] fArr2 = f28880b;
            float f14 = fArr2[2];
            if (k6.I.q()) {
                f12 = 0.05f;
            } else {
                f12 = -0.05f;
            }
            fArr2[2] = Math.min(1.0f, Math.max(0.0f, f14 + f12));
        } else {
            float f15 = fArr[2];
            if (k6.I.q()) {
                f10 = 0.1f;
            } else {
                f10 = -0.1f;
            }
            fArr[2] = Math.min(1.0f, Math.max(0.0f, f15 + f10));
        }
        return Color.HSVToColor(127, f28880b);
    }

    public static org.telegram.ui.Cells.y c(x5 x5Var, int i3) {
        ColorStateList colorStateList = new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i3});
        ?? drawable = new Drawable();
        drawable.f28809b = -1.0f;
        if (x5.f28807c == null) {
            Paint paint = new Paint(1);
            x5.f28807c = paint;
            paint.setColor(-1);
        }
        drawable.f28808a = x5.f28807c;
        return new RippleDrawable(colorStateList, x5Var, drawable);
    }

    public static org.telegram.ui.Cells.y d(int i3, int i10, float... fArr) {
        ShapeDrawable shapeDrawable;
        ShapeDrawable shapeDrawable2;
        if (i3 != 0) {
            int i11 = 0;
            while (true) {
                if (i11 < Math.min(8, fArr.length)) {
                    if (fArr[i11] > 0.0f) {
                        ShapeDrawable shapeDrawable3 = new ShapeDrawable(new RoundRectShape(a(fArr), null, null));
                        shapeDrawable3.getPaint().setColor(i3);
                        shapeDrawable = shapeDrawable3;
                        break;
                    }
                    i11++;
                } else {
                    shapeDrawable = new ColorDrawable(i3);
                    break;
                }
            }
        } else {
            shapeDrawable = null;
        }
        int i12 = 0;
        while (true) {
            if (i12 < Math.min(8, fArr.length)) {
                if (fArr[i12] > 0.0f) {
                    shapeDrawable2 = new ShapeDrawable(new RoundRectShape(a(fArr), null, null));
                    shapeDrawable2.getPaint().setColor(-1);
                    break;
                }
                i12++;
            } else {
                shapeDrawable2 = new ShapeDrawable(new RectShape());
                shapeDrawable2.getPaint().setColor(-1);
                break;
            }
        }
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), shapeDrawable, shapeDrawable2);
    }

    public static org.telegram.ui.Cells.y e(int i3, float... fArr) {
        return d(i3, b(i3), fArr);
    }

    public static org.telegram.ui.Cells.y f(int i3, float... fArr) {
        return e(k6.x0(null, i3, false), fArr);
    }
}
