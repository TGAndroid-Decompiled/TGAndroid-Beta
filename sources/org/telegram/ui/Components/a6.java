package org.telegram.ui.Components;

import android.view.View;
public final class a6 implements xd.f, ae.a {
    public final View f25164a;
    public boolean f25165b;
    public boolean f25166c;
    public int d;
    public int f25167e;

    public a6(View view) {
        this.f25164a = view;
    }

    @Override
    public final void a() {
        if (!this.f25165b) {
            this.f25164a.setVisibility(8);
        }
        this.f25166c = false;
    }

    @Override
    public final int b(boolean z4) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a6) {
            return this.f25164a.equals(((a6) obj).f25164a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f25164a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f25164a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f25164a.hashCode();
    }
}
