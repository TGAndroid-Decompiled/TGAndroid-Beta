package org.telegram.ui.Components;

import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public abstract class LayoutHelper {
    public static FrameLayout.LayoutParams createFrame(int i, float f, int i2, float f2, float f3, float f4, float f5) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getSize(i), getSize(f), i2);
        layoutParams.setMargins(AndroidUtilities.dp(f2), AndroidUtilities.dp(f3), AndroidUtilities.dp(f4), AndroidUtilities.dp(f5));
        return layoutParams;
    }

    public static FrameLayout.LayoutParams createFrameMarginPx(float f, int i, int i2, int i3, int i4, int i5) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getSize(-1), getSize(f), i);
        layoutParams.setMargins(i2, i3, i4, i5);
        return layoutParams;
    }

    public static FrameLayout.LayoutParams createFrameRelatively(float f, float f2, int i, float f3, float f4, float f5, float f6) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getSize(f), getSize(f2), Gravity.getAbsoluteGravity(i, LocaleController.isRTL ? 1 : 0));
        layoutParams.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? f5 : f3);
        layoutParams.topMargin = AndroidUtilities.dp(f4);
        if (!LocaleController.isRTL) {
            f3 = f5;
        }
        layoutParams.rightMargin = AndroidUtilities.dp(f3);
        layoutParams.bottomMargin = AndroidUtilities.dp(f6);
        return layoutParams;
    }

    public static LinearLayout.LayoutParams createLinear(int i, int i2, float f, int i3, int i4, int i5, int i6, int i7) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getSize(i), getSize(i2), f);
        layoutParams.setMargins(AndroidUtilities.dp(i4), AndroidUtilities.dp(i5), AndroidUtilities.dp(i6), AndroidUtilities.dp(i7));
        layoutParams.gravity = i3;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams createLinearRelatively(float f, float f2, int i, float f3, float f4, float f5, float f6) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getSize(f), getSize(f2), Gravity.getAbsoluteGravity(i, LocaleController.isRTL ? 1 : 0));
        layoutParams.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? f5 : f3);
        layoutParams.topMargin = AndroidUtilities.dp(f4);
        if (!LocaleController.isRTL) {
            f3 = f5;
        }
        layoutParams.rightMargin = AndroidUtilities.dp(f3);
        layoutParams.bottomMargin = AndroidUtilities.dp(f6);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams createRelative(int i, float f, int i2, float f2, int i3) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(getSize(f), getSize(f2));
        if (i3 >= 0) {
            layoutParams.addRule(i3);
        }
        layoutParams.leftMargin = AndroidUtilities.dp(i);
        float f3 = 0;
        layoutParams.topMargin = AndroidUtilities.dp(f3);
        layoutParams.rightMargin = AndroidUtilities.dp(i2);
        layoutParams.bottomMargin = AndroidUtilities.dp(f3);
        return layoutParams;
    }

    public static FrameLayout.LayoutParams createScroll(int i, int i2, int i3) {
        return new FrameLayout.LayoutParams(getSize(i), getSize(i2), i3);
    }

    public static int getAbsoluteGravityStart() {
        return LocaleController.isRTL ? 5 : 3;
    }

    public static int getSize(float f) {
        if (f >= 0.0f) {
            f = AndroidUtilities.dp(f);
        }
        return (int) f;
    }

    public static FrameLayout.LayoutParams createFrame(int i, int i2, int i3) {
        return new FrameLayout.LayoutParams(getSize(i), getSize(i2), i3);
    }

    public static FrameLayout.LayoutParams createFrame(float f, int i) {
        return new FrameLayout.LayoutParams(getSize(i), getSize(f));
    }

    public static LinearLayout.LayoutParams createLinear(float f, int i, int i2, int i3, int i4, int i5) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getSize(i), getSize(i2), f);
        layoutParams.setMargins(AndroidUtilities.dp(i3), AndroidUtilities.dp(0), AndroidUtilities.dp(i4), AndroidUtilities.dp(i5));
        return layoutParams;
    }

    public static FrameLayout.LayoutParams createFrame(float f, float f2, int i, float f3, float f4, float f5, float f6) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getSize(f), getSize(f2), i);
        layoutParams.setMargins(AndroidUtilities.dp(f3), AndroidUtilities.dp(f4), AndroidUtilities.dp(f5), AndroidUtilities.dp(f6));
        return layoutParams;
    }

    public static LinearLayout.LayoutParams createLinear(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getSize(i), getSize(i2));
        layoutParams.setMargins(AndroidUtilities.dp(i4), AndroidUtilities.dp(i5), AndroidUtilities.dp(i6), AndroidUtilities.dp(i7));
        layoutParams.gravity = i3;
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams createRelative(int i, int i2) {
        return createRelative(0, i, 0, i2, -1);
    }

    public static FrameLayout.LayoutParams createFrameRelatively(float f, float f2, int i) {
        return new FrameLayout.LayoutParams(getSize(f), getSize(f2), Gravity.getAbsoluteGravity(i, LocaleController.isRTL ? 1 : 0));
    }

    public static LinearLayout.LayoutParams createLinear(int i, int i2, int i3, float f, float f2, float f3, float f4) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getSize(i), getSize(i2));
        layoutParams.setMargins(AndroidUtilities.dp(f), AndroidUtilities.dp(f2), AndroidUtilities.dp(f3), AndroidUtilities.dp(f4));
        layoutParams.gravity = i3;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams createLinear(int i, int i2, int i3, int i4, int i5, float f, int i6) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getSize(i), getSize(f));
        layoutParams.setMargins(AndroidUtilities.dp(i3), AndroidUtilities.dp(i4), AndroidUtilities.dp(i5), AndroidUtilities.dp(i6));
        layoutParams.gravity = i2;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams createLinear(float f, float f2, float f3, float f4, int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getSize(i), getSize(i2));
        layoutParams.setMargins(AndroidUtilities.dp(f), AndroidUtilities.dp(f2), AndroidUtilities.dp(f3), AndroidUtilities.dp(f4));
        return layoutParams;
    }

    public static LinearLayout.LayoutParams createLinear(int i, int i2, float f, int i3) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getSize(i), getSize(i2), f);
        layoutParams.gravity = i3;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams createLinear(int i, int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getSize(i), getSize(i2));
        layoutParams.gravity = i3;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams createLinear(float f, int i, int i2) {
        return new LinearLayout.LayoutParams(getSize(i), getSize(i2), f);
    }

    public static LinearLayout.LayoutParams createLinear(int i, int i2) {
        return new LinearLayout.LayoutParams(getSize(i), getSize(i2));
    }
}
