package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class kx extends c5.a {
    public final qy f36919c;

    public kx(qy qyVar) {
        this.f36919c = qyVar;
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        lVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f36919c.f39048e.size();
    }

    @Override
    public final CharSequence d(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return null;
                }
                return org.telegram.messenger.gd.N0(2131754755, null);
            }
            return org.telegram.messenger.gd.N0(2131754879, null);
        }
        return org.telegram.messenger.gd.N0(2131751184, null);
    }

    @Override
    public final Object e(c5.l lVar, int i7) {
        FrameLayout frameLayout = ((my) this.f36919c.f39048e.get(i7)).f37568b;
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
