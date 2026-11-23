package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class nx extends c5.a {
    public final ty f37970c;

    public nx(ty tyVar) {
        this.f37970c = tyVar;
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        lVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f37970c.f40075e.size();
    }

    @Override
    public final CharSequence d(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return null;
                }
                return org.telegram.messenger.hd.N0(2131754755, null);
            }
            return org.telegram.messenger.hd.N0(2131754879, null);
        }
        return org.telegram.messenger.hd.N0(2131751184, null);
    }

    @Override
    public final Object e(c5.l lVar, int i7) {
        FrameLayout frameLayout = ((py) this.f37970c.f40075e.get(i7)).f38631b;
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
