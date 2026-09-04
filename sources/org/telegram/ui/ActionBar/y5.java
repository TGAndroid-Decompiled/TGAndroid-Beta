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
import org.telegram.messenger.AndroidUtilities;
public abstract class y5 {
    public static final int f21543a = j6.f20663d6;
    public static float[] f21544b;

    public static float[] a(float... fArr) {
        if (fArr.length == 0) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        return fArr.length == 1 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0])} : fArr.length == 2 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1])} : fArr.length == 3 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2])} : fArr.length < 8 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[3]), AndroidUtilities.dp(fArr[3])} : new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[3]), AndroidUtilities.dp(fArr[4]), AndroidUtilities.dp(fArr[5]), AndroidUtilities.dp(fArr[6]), AndroidUtilities.dp(fArr[7])};
    }

    public static int b(int i10) {
        float f7;
        float f10;
        float f11;
        if (f21544b == null) {
            f21544b = new float[3];
        }
        Color.colorToHSV(i10, f21544b);
        float[] fArr = f21544b;
        float f12 = fArr[1];
        if (f12 > 0.01f) {
            if (j6.I.q()) {
                f10 = 0.25f;
            } else {
                f10 = -0.25f;
            }
            fArr[1] = Math.min(1.0f, Math.max(0.0f, f12 + f10));
            float[] fArr2 = f21544b;
            float f13 = fArr2[2];
            if (j6.I.q()) {
                f11 = 0.05f;
            } else {
                f11 = -0.05f;
            }
            fArr2[2] = Math.min(1.0f, Math.max(0.0f, f13 + f11));
        } else {
            float f14 = fArr[2];
            if (j6.I.q()) {
                f7 = 0.1f;
            } else {
                f7 = -0.1f;
            }
            fArr[2] = Math.min(1.0f, Math.max(0.0f, f14 + f7));
        }
        return Color.HSVToColor(127, f21544b);
    }

    public static org.telegram.ui.Cells.z c(x5 x5Var, int i10) {
        ColorStateList colorStateList = new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10});
        ?? drawable = new Drawable();
        drawable.f21522b = -1.0f;
        if (x5.f21520c == null) {
            Paint paint = new Paint(1);
            x5.f21520c = paint;
            paint.setColor(-1);
        }
        drawable.f21521a = x5.f21520c;
        return new RippleDrawable(colorStateList, x5Var, drawable);
    }

    public static org.telegram.ui.Cells.z d(float[] fArr, int i10, int i11) {
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

    public static org.telegram.ui.Cells.z e(float[] fArr, int i10) {
        return d(fArr, i10, b(i10));
    }

    public static org.telegram.ui.Cells.z f(float[] fArr, int i10) {
        return e(fArr, j6.w0(null, i10, false));
    }
}
