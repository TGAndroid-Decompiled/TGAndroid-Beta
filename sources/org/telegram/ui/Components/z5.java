package org.telegram.ui.Components;

import android.view.View;

public final class z5 implements ud.f, xd.a {

    public final View f35151a;

    public boolean f35152b;

    public boolean f35153c;
    public int d;

    public int f35154e;

    public z5(View view) {
        this.f35151a = view;
    }

    @Override
    public final void a() {
        if (!this.f35152b) {
            this.f35151a.setVisibility(8);
        }
        this.f35153c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z5)) {
            return false;
        }
        return this.f35151a.equals(((z5) obj).f35151a);
    }

    @Override
    public final int getHeight() {
        return this.f35151a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f35151a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f35151a.hashCode();
    }
}
