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
public abstract class v5 {
    public static final int f23886a = f6.f23001d6;
    public static float[] f23887b;

    public static float[] a(float... fArr) {
        if (fArr.length == 0) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        return fArr.length == 1 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0])} : fArr.length == 2 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1])} : fArr.length == 3 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2])} : fArr.length < 8 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[3]), AndroidUtilities.dp(fArr[3])} : new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[3]), AndroidUtilities.dp(fArr[4]), AndroidUtilities.dp(fArr[5]), AndroidUtilities.dp(fArr[6]), AndroidUtilities.dp(fArr[7])};
    }

    public static int b(int i9) {
        float f10;
        float f11;
        float f12;
        if (f23887b == null) {
            f23887b = new float[3];
        }
        Color.colorToHSV(i9, f23887b);
        float[] fArr = f23887b;
        float f13 = fArr[1];
        if (f13 > 0.01f) {
            if (f6.I.q()) {
                f11 = 0.25f;
            } else {
                f11 = -0.25f;
            }
            fArr[1] = Math.min(1.0f, Math.max(0.0f, f13 + f11));
            float[] fArr2 = f23887b;
            float f14 = fArr2[2];
            if (f6.I.q()) {
                f12 = 0.05f;
            } else {
                f12 = -0.05f;
            }
            fArr2[2] = Math.min(1.0f, Math.max(0.0f, f14 + f12));
        } else {
            float f15 = fArr[2];
            if (f6.I.q()) {
                f10 = 0.1f;
            } else {
                f10 = -0.1f;
            }
            fArr[2] = Math.min(1.0f, Math.max(0.0f, f15 + f10));
        }
        return Color.HSVToColor(127, f23887b);
    }

    public static org.telegram.ui.Cells.z c(u5 u5Var, int i9) {
        ColorStateList colorStateList = new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i9});
        ?? drawable = new Drawable();
        drawable.f23834b = -1.0f;
        if (u5.f23832c == null) {
            Paint paint = new Paint(1);
            u5.f23832c = paint;
            paint.setColor(-1);
        }
        drawable.f23833a = u5.f23832c;
        return new RippleDrawable(colorStateList, u5Var, drawable);
    }

    public static org.telegram.ui.Cells.z d(float[] fArr, int i9, int i10) {
        ShapeDrawable shapeDrawable;
        ShapeDrawable shapeDrawable2;
        if (i9 != 0) {
            int i11 = 0;
            while (true) {
                if (i11 < Math.min(8, fArr.length)) {
                    if (fArr[i11] > 0.0f) {
                        ShapeDrawable shapeDrawable3 = new ShapeDrawable(new RoundRectShape(a(fArr), null, null));
                        shapeDrawable3.getPaint().setColor(i9);
                        shapeDrawable = shapeDrawable3;
                        break;
                    }
                    i11++;
                } else {
                    shapeDrawable = new ColorDrawable(i9);
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

    public static org.telegram.ui.Cells.z e(float[] fArr, int i9) {
        return d(fArr, i9, b(i9));
    }

    public static org.telegram.ui.Cells.z f(float[] fArr, int i9) {
        return e(fArr, f6.w0(null, i9, false));
    }
}
