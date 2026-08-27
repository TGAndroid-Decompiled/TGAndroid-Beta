package org.telegram.ui.ActionBar;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.StateSet;
import org.telegram.messenger.AndroidUtilities;

public abstract class w5 {

    public static final int f23936a = g6.f23053d6;

    public static float[] f23937b;

    public static float[] a(float... fArr) {
        if (fArr.length == 0) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        if (fArr.length == 1) {
            return new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0])};
        }
        if (fArr.length == 2) {
            return new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1])};
        }
        if (fArr.length == 3) {
            return new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2])};
        }
        return fArr.length < 8 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[3]), AndroidUtilities.dp(fArr[3])} : new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[3]), AndroidUtilities.dp(fArr[4]), AndroidUtilities.dp(fArr[5]), AndroidUtilities.dp(fArr[6]), AndroidUtilities.dp(fArr[7])};
    }

    public static int b(int i10) {
        if (f23937b == null) {
            f23937b = new float[3];
        }
        Color.colorToHSV(i10, f23937b);
        float[] fArr = f23937b;
        float f10 = fArr[1];
        if (f10 > 0.01f) {
            fArr[1] = Math.min(1.0f, Math.max(0.0f, f10 + (g6.I.q() ? 0.25f : -0.25f)));
            float[] fArr2 = f23937b;
            fArr2[2] = Math.min(1.0f, Math.max(0.0f, fArr2[2] + (g6.I.q() ? 0.05f : -0.05f)));
        } else {
            fArr[2] = Math.min(1.0f, Math.max(0.0f, fArr[2] + (g6.I.q() ? 0.1f : -0.1f)));
        }
        return Color.HSVToColor(127, f23937b);
    }

    public static org.telegram.ui.Cells.z c(v5 v5Var, int i10) {
        ColorStateList colorStateList = new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10});
        v5 v5Var2 = new v5();
        v5Var2.f23918b = -1.0f;
        if (v5.f23916c == null) {
            Paint paint = new Paint(1);
            v5.f23916c = paint;
            paint.setColor(-1);
        }
        v5Var2.f23917a = v5.f23916c;
        return new org.telegram.ui.Cells.z(colorStateList, v5Var, v5Var2);
    }

    public static org.telegram.ui.Cells.z d(float[] fArr, int i10, int i11) {
        Drawable colorDrawable;
        ShapeDrawable shapeDrawable;
        if (i10 != 0) {
            int i12 = 0;
            while (true) {
                if (i12 >= Math.min(8, fArr.length)) {
                    colorDrawable = new ColorDrawable(i10);
                    break;
                }
                if (fArr[i12] > 0.0f) {
                    ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(a(fArr), null, null));
                    shapeDrawable2.getPaint().setColor(i10);
                    colorDrawable = shapeDrawable2;
                    break;
                }
                i12++;
            }
        } else {
            colorDrawable = null;
        }
        for (int i13 = 0; i13 < Math.min(8, fArr.length); i13++) {
            if (fArr[i13] > 0.0f) {
                shapeDrawable = new ShapeDrawable(new RoundRectShape(a(fArr), null, null));
                shapeDrawable.getPaint().setColor(-1);
                return new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), colorDrawable, shapeDrawable);
            }
        }
        shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(-1);
        return new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), colorDrawable, shapeDrawable);
    }

    public static org.telegram.ui.Cells.z e(float[] fArr, int i10) {
        return d(fArr, i10, b(i10));
    }

    public static org.telegram.ui.Cells.z f(float[] fArr, int i10) {
        return e(fArr, g6.w0(null, i10, false));
    }
}
