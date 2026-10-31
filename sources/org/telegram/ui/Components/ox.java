package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class ox extends z4.a {
    public final vy f29204c;

    public ox(vy vyVar) {
        this.f29204c = vyVar;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f29204c.e.size();
    }

    @Override
    public final CharSequence d(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return org.telegram.messenger.cd.L0(2131754756, null);
            }
            return org.telegram.messenger.cd.L0(2131754879, null);
        }
        return org.telegram.messenger.cd.L0(2131751197, null);
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        FrameLayout frameLayout = ((ry) this.f29204c.e.get(i10)).f30042b;
        gVar.addView(frameLayout);
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
