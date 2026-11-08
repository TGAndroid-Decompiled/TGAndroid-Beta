package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class ax extends c5.a {
    public final hy f31937c;

    public ax(hy hyVar) {
        this.f31937c = hyVar;
    }

    @Override
    public final void a(c5.k kVar, Object obj) {
        kVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f31937c.f34404e.size();
    }

    @Override
    public final CharSequence d(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return null;
                }
                return org.telegram.messenger.id.M0(2131754756, null);
            }
            return org.telegram.messenger.id.M0(2131754879, null);
        }
        return org.telegram.messenger.id.M0(2131751197, null);
    }

    @Override
    public final Object e(c5.k kVar, int i7) {
        FrameLayout frameLayout = ((dy) this.f31937c.f34404e.get(i7)).f33111b;
        kVar.addView(frameLayout);
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
