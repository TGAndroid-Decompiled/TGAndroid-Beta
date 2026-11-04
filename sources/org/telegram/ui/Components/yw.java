package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class yw extends b5.a {
    public final ey f40840c;

    public yw(ey eyVar) {
        this.f40840c = eyVar;
    }

    @Override
    public final void a(b5.l lVar, Object obj) {
        lVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f40840c.f33531e.size();
    }

    @Override
    public final CharSequence d(int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    return null;
                }
                return org.telegram.messenger.bd.M0(2131754756, null);
            }
            return org.telegram.messenger.bd.M0(2131754879, null);
        }
        return org.telegram.messenger.bd.M0(2131751197, null);
    }

    @Override
    public final Object e(b5.l lVar, int i3) {
        FrameLayout frameLayout = ((zx) this.f40840c.f33531e.get(i3)).f41145b;
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
