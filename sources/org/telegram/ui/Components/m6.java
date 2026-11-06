package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class m6 {
    public static final OvershootInterpolator f35935a = new OvershootInterpolator(1.9f);
    public static final k6 f35936b = new k6("alpha", 0);
    public static final org.telegram.ui.Cells.o8 f35937c;
    public static final k6 d;
    public static final k6 f35938e;
    public static final org.telegram.ui.Cells.o8 f35939f;
    public static final org.telegram.ui.Cells.o8 f35940g;
    public static final org.telegram.ui.Cells.o8 h;

    static {
        new k6("color", 1);
        f35937c = new org.telegram.ui.Cells.o8("currentAlpha", 4);
        d = new k6("alpha", 2);
        f35938e = new k6("alpha", 3);
        f35939f = new org.telegram.ui.Cells.o8("animationProgress", 5);
        f35940g = new org.telegram.ui.Cells.o8("animationValue", 6);
        h = new org.telegram.ui.Cells.o8("clipProgress", 7);
    }
}
