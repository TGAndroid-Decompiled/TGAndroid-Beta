package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;

public abstract class m6 {

    public static final OvershootInterpolator f30578a = new OvershootInterpolator(1.9f);

    public static final k6 f30579b = new k6("alpha", 0);

    public static final dh.g f30580c;
    public static final k6 d;

    public static final k6 f30581e;

    public static final dh.g f30582f;

    public static final dh.g f30583g;
    public static final dh.g h;

    static {
        new k6("color", 1);
        f30580c = new dh.g("currentAlpha", 6);
        d = new k6("alpha", 2);
        f30581e = new k6("alpha", 3);
        f30582f = new dh.g("animationProgress", 7);
        f30583g = new dh.g("animationValue", 8);
        h = new dh.g("clipProgress", 9);
    }
}
