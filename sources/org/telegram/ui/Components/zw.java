package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class zw extends c5.a {
    public final gy f41097c;

    public zw(gy gyVar) {
        this.f41097c = gyVar;
    }

    @Override
    public final void a(c5.k kVar, Object obj) {
        kVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f41097c.f34080e.size();
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
        return org.telegram.messenger.hd.M0(2131751197, null);
    }

    @Override
    public final Object e(c5.k kVar, int i7) {
        FrameLayout frameLayout = ((cy) this.f41097c.f34080e.get(i7)).f32694b;
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
