package org.telegram.ui.Components;

import android.graphics.drawable.GradientDrawable;
public abstract class m9 {
    public static final int[] f29013a;

    static {
        int[] iArr = new int[GradientDrawable.Orientation.values().length];
        f29013a = iArr;
        try {
            iArr[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f29013a[GradientDrawable.Orientation.TR_BL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f29013a[GradientDrawable.Orientation.RIGHT_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f29013a[GradientDrawable.Orientation.BR_TL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f29013a[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f29013a[GradientDrawable.Orientation.BL_TR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f29013a[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
