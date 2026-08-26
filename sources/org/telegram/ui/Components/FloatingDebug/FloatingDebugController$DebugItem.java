package org.telegram.ui.Components.FloatingDebug;

import org.telegram.ui.Components.AnimationProperties;

public final class FloatingDebugController$DebugItem {
    public final Runnable action;
    public final AnimationProperties.FloatProperty floatProperty;
    public final float from;
    public final String title;
    public final float to;
    public final int type = 1;

    public FloatingDebugController$DebugItem(Runnable runnable, String str) {
        this.title = str;
        this.action = runnable;
    }

    public FloatingDebugController$DebugItem(String str) {
        this.title = str;
    }

    public FloatingDebugController$DebugItem(String str, float f, float f2, AnimationProperties.FloatProperty floatProperty) {
        this.title = str;
        this.from = f;
        this.to = f2;
        this.floatProperty = floatProperty;
    }
}
