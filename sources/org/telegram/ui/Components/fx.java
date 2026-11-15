package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class fx extends c5.a {
    public final ly f34713c;

    public fx(ly lyVar) {
        this.f34713c = lyVar;
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        lVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f34713c.f36942e.size();
    }

    @Override
    public final CharSequence d(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return null;
                }
                return org.telegram.messenger.hd.M0(2131754756, null);
            }
            return org.telegram.messenger.hd.M0(2131754879, null);
        }
        return org.telegram.messenger.hd.M0(2131751196, null);
    }

    @Override
    public final Object e(c5.l lVar, int i7) {
        FrameLayout frameLayout = ((hy) this.f34713c.f36942e.get(i7)).f35369b;
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
