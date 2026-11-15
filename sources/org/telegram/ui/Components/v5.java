package org.telegram.ui.Components;

import android.view.View;
public final class v5 implements te.f, we.a {
    public final View f40266a;
    public boolean f40267b;
    public boolean f40268c;
    public int d;
    public int f40269e;

    public v5(View view) {
        this.f40266a = view;
    }

    @Override
    public final void a() {
        if (!this.f40267b) {
            this.f40266a.setVisibility(8);
        }
        this.f40268c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v5) {
            return this.f40266a.equals(((v5) obj).f40266a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f40266a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f40266a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f40266a.hashCode();
    }
}
