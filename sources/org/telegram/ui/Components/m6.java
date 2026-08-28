package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;
public abstract class m6 {
    public static final OvershootInterpolator f30700a = new OvershootInterpolator(1.9f);
    public static final k6 f30701b = new k6("alpha", 0);
    public static final ch.g f30702c;
    public static final k6 d;
    public static final k6 f30703e;
    public static final ch.g f30704f;
    public static final ch.g f30705g;
    public static final ch.g h;

    static {
        new k6("color", 1);
        f30702c = new ch.g("currentAlpha", 6);
        d = new k6("alpha", 2);
        f30703e = new k6("alpha", 3);
        f30704f = new ch.g("animationProgress", 7);
        f30705g = new ch.g("animationValue", 8);
        h = new ch.g("clipProgress", 9);
    }
}
