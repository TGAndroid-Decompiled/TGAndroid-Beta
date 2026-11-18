package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class lx extends c5.a {
    public final ry f37256c;

    public lx(ry ryVar) {
        this.f37256c = ryVar;
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        lVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f37256c.f39346e.size();
    }

    @Override
    public final CharSequence d(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return null;
                }
                return org.telegram.messenger.gd.M0(2131754756, null);
            }
            return org.telegram.messenger.gd.M0(2131754879, null);
        }
        return org.telegram.messenger.gd.M0(2131751185, null);
    }

    @Override
    public final Object e(c5.l lVar, int i7) {
        FrameLayout frameLayout = ((ny) this.f37256c.f39346e.get(i7)).f37874b;
        lVar.addView(frameLayout);
        return frameLayout;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
