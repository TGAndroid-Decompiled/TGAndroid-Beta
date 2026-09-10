package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ky extends z4.a implements kd0 {
    public final rz f24826c;

    public ky(rz rzVar) {
        this.f24826c = rzVar;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f24826c.e.size();
    }

    @Override
    public final CharSequence d(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return LocaleController.getString(R.string.AccDescrStickers);
            }
            return LocaleController.getString(R.string.AccDescrGIFs);
        }
        return LocaleController.getString(R.string.Emoji);
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        FrameLayout frameLayout = ((nz) this.f24826c.e.get(i10)).f25620b;
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
