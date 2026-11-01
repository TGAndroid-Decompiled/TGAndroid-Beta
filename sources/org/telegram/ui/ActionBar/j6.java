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
public abstract class j6 {
    public static final int f20447a = t6.f20930d6;
    public static float[] f20448b;

    public static float[] a(float... fArr) {
        if (fArr.length == 0) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        return fArr.length == 1 ? new float[]{org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0])} : fArr.length == 2 ? new float[]{org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[1]), org.telegram.messenger.i0.L(fArr[1]), org.telegram.messenger.i0.L(fArr[1]), org.telegram.messenger.i0.L(fArr[1])} : fArr.length == 3 ? new float[]{org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[1]), org.telegram.messenger.i0.L(fArr[1]), org.telegram.messenger.i0.L(fArr[2]), org.telegram.messenger.i0.L(fArr[2]), org.telegram.messenger.i0.L(fArr[2]), org.telegram.messenger.i0.L(fArr[2])} : fArr.length < 8 ? new float[]{org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[1]), org.telegram.messenger.i0.L(fArr[1]), org.telegram.messenger.i0.L(fArr[2]), org.telegram.messenger.i0.L(fArr[2]), org.telegram.messenger.i0.L(fArr[3]), org.telegram.messenger.i0.L(fArr[3])} : new float[]{org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[1]), org.telegram.messenger.i0.L(fArr[2]), org.telegram.messenger.i0.L(fArr[3]), org.telegram.messenger.i0.L(fArr[4]), org.telegram.messenger.i0.L(fArr[5]), org.telegram.messenger.i0.L(fArr[6]), org.telegram.messenger.i0.L(fArr[7])};
    }

    public static int b(int i10) {
        float f7;
        float f10;
        float f11;
        if (f20448b == null) {
            f20448b = new float[3];
        }
        Color.colorToHSV(i10, f20448b);
        float[] fArr = f20448b;
        float f12 = fArr[1];
        if (f12 > 0.01f) {
            if (t6.I.q()) {
                f10 = 0.25f;
            } else {
                f10 = -0.25f;
            }
            fArr[1] = Math.min(1.0f, Math.max(0.0f, f12 + f10));
            float[] fArr2 = f20448b;
            float f13 = fArr2[2];
            if (t6.I.q()) {
                f11 = 0.05f;
            } else {
                f11 = -0.05f;
            }
            fArr2[2] = Math.min(1.0f, Math.max(0.0f, f13 + f11));
        } else {
            float f14 = fArr[2];
            if (t6.I.q()) {
                f7 = 0.1f;
            } else {
                f7 = -0.1f;
            }
            fArr[2] = Math.min(1.0f, Math.max(0.0f, f14 + f7));
        }
        return Color.HSVToColor(127, f20448b);
    }

    public static org.telegram.ui.Cells.y c(i6 i6Var, int i10) {
        ColorStateList colorStateList = new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10});
        ?? drawable = new Drawable();
        drawable.f20435b = -1.0f;
        if (i6.f20433c == null) {
            Paint paint = new Paint(1);
            i6.f20433c = paint;
            paint.setColor(-1);
        }
        drawable.f20434a = i6.f20433c;
        return new RippleDrawable(colorStateList, i6Var, drawable);
    }

    public static org.telegram.ui.Cells.y d(int i10, int i11, float... fArr) {
        ShapeDrawable shapeDrawable;
        ShapeDrawable shapeDrawable2;
        if (i10 != 0) {
            int i12 = 0;
            while (true) {
                if (i12 < Math.min(8, fArr.length)) {
                    if (fArr[i12] > 0.0f) {
                        ShapeDrawable shapeDrawable3 = new ShapeDrawable(new RoundRectShape(a(fArr), null, null));
                        shapeDrawable3.getPaint().setColor(i10);
                        shapeDrawable = shapeDrawable3;
                        break;
                    }
                    i12++;
                } else {
                    shapeDrawable = new ColorDrawable(i10);
                    break;
                }
            }
        } else {
            shapeDrawable = null;
        }
        int i13 = 0;
        while (true) {
            if (i13 < Math.min(8, fArr.length)) {
                if (fArr[i13] > 0.0f) {
                    shapeDrawable2 = new ShapeDrawable(new RoundRectShape(a(fArr), null, null));
                    shapeDrawable2.getPaint().setColor(-1);
                    break;
                }
                i13++;
            } else {
                shapeDrawable2 = new ShapeDrawable(new RectShape());
                shapeDrawable2.getPaint().setColor(-1);
                break;
            }
        }
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), shapeDrawable, shapeDrawable2);
    }

    public static org.telegram.ui.Cells.y e(int i10, float... fArr) {
        return d(i10, b(i10), fArr);
    }

    public static org.telegram.ui.Cells.y f(int i10, float... fArr) {
        return e(t6.x0(null, i10, false), fArr);
    }
}
