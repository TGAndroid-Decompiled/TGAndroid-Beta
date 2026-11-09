package org.telegram.ui.Components;

import android.view.View;
public final class x5 implements te.f, we.a {
    public final View f40296a;
    public boolean f40297b;
    public boolean f40298c;
    public int d;
    public int f40299e;

    public x5(View view) {
        this.f40296a = view;
    }

    @Override
    public final void a() {
        if (!this.f40297b) {
            this.f40296a.setVisibility(8);
        }
        this.f40298c = false;
    }

    @Override
    public final int b(boolean z9) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x5) {
            return this.f40296a.equals(((x5) obj).f40296a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f40296a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f40296a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f40296a.hashCode();
    }
}
