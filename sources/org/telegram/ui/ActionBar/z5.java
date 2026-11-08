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
public abstract class z5 {
    public static final int f28836a = k6.f27852d6;
    public static float[] f28837b;

    public static float[] a(float... fArr) {
        if (fArr.length == 0) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        return fArr.length == 1 ? new float[]{org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0])} : fArr.length == 2 ? new float[]{org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[1])} : fArr.length == 3 ? new float[]{org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[2]), org.telegram.messenger.g0.L(fArr[2]), org.telegram.messenger.g0.L(fArr[2]), org.telegram.messenger.g0.L(fArr[2])} : fArr.length < 8 ? new float[]{org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[2]), org.telegram.messenger.g0.L(fArr[2]), org.telegram.messenger.g0.L(fArr[3]), org.telegram.messenger.g0.L(fArr[3])} : new float[]{org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[2]), org.telegram.messenger.g0.L(fArr[3]), org.telegram.messenger.g0.L(fArr[4]), org.telegram.messenger.g0.L(fArr[5]), org.telegram.messenger.g0.L(fArr[6]), org.telegram.messenger.g0.L(fArr[7])};
    }

    public static int b(int i7) {
        float f10;
        float f11;
        float f12;
        if (f28837b == null) {
            f28837b = new float[3];
        }
        Color.colorToHSV(i7, f28837b);
        float[] fArr = f28837b;
        float f13 = fArr[1];
        if (f13 > 0.01f) {
            if (k6.I.q()) {
                f11 = 0.25f;
            } else {
                f11 = -0.25f;
            }
            fArr[1] = Math.min(1.0f, Math.max(0.0f, f13 + f11));
            float[] fArr2 = f28837b;
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
        return Color.HSVToColor(127, f28837b);
    }

    public static org.telegram.ui.Cells.y c(y5 y5Var, int i7) {
        ColorStateList colorStateList = new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i7});
        ?? drawable = new Drawable();
        drawable.f28811b = -1.0f;
        if (y5.f28809c == null) {
            Paint paint = new Paint(1);
            y5.f28809c = paint;
            paint.setColor(-1);
        }
        drawable.f28810a = y5.f28809c;
        return new RippleDrawable(colorStateList, y5Var, drawable);
    }

    public static org.telegram.ui.Cells.y d(int i7, int i10, float... fArr) {
        ShapeDrawable shapeDrawable;
        ShapeDrawable shapeDrawable2;
        if (i7 != 0) {
            int i11 = 0;
            while (true) {
                if (i11 < Math.min(8, fArr.length)) {
                    if (fArr[i11] > 0.0f) {
                        ShapeDrawable shapeDrawable3 = new ShapeDrawable(new RoundRectShape(a(fArr), null, null));
                        shapeDrawable3.getPaint().setColor(i7);
                        shapeDrawable = shapeDrawable3;
                        break;
                    }
                    i11++;
                } else {
                    shapeDrawable = new ColorDrawable(i7);
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

    public static org.telegram.ui.Cells.y e(int i7, float... fArr) {
        return d(i7, b(i7), fArr);
    }

    public static org.telegram.ui.Cells.y f(int i7, float... fArr) {
        return e(k6.x0(null, i7, false), fArr);
    }
}
