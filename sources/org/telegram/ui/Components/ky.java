package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ky extends a5.a implements vd0 {
    public final sz f30050c;

    public ky(sz szVar) {
        this.f30050c = szVar;
    }

    @Override
    public final void a(a5.m mVar, Object obj) {
        mVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f30050c.e.size();
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
    public final Object e(a5.m mVar, int i10) {
        FrameLayout frameLayout = ((oz) this.f30050c.e.get(i10)).f31402b;
        mVar.addView(frameLayout);
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
