package org.telegram.ui.Components.FloatingDebug;

import org.telegram.ui.Components.AnimationProperties;

public final class FloatingDebugController$DebugItem {
    public final Runnable action;
    public final AnimationProperties.IntProperty floatProperty;
    public final float from;
    public final String title;
    public final float to;
    public final int type = 2;

    public FloatingDebugController$DebugItem(String str, Runnable runnable) {
        this.title = str;
        this.action = runnable;
    }

    public FloatingDebugController$DebugItem(String str) {
        this.title = str;
    }

    public FloatingDebugController$DebugItem(String str, float f, float f2, AnimationProperties.IntProperty intProperty) {
        this.title = str;
        this.from = f;
        this.to = f2;
        this.floatProperty = intProperty;
    }
}
