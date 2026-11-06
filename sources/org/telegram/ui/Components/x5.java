package org.telegram.ui.Components;

import android.view.View;
public final class x5 implements te.f, we.a {
    public final View f40165a;
    public boolean f40166b;
    public boolean f40167c;
    public int d;
    public int f40168e;

    public x5(View view) {
        this.f40165a = view;
    }

    @Override
    public final void a() {
        if (!this.f40166b) {
            this.f40165a.setVisibility(8);
        }
        this.f40167c = false;
    }

    @Override
    public final int b(boolean z9) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x5) {
            return this.f40165a.equals(((x5) obj).f40165a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f40165a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f40165a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f40165a.hashCode();
    }
}
