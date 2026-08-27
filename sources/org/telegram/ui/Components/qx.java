package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class qx extends m2.a implements mc0 {

    public final yy f31990c;

    public qx(yy yyVar) {
        this.f31990c = yyVar;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f31990c.f34990e.size();
    }

    @Override
    public final CharSequence d(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.Emoji);
        }
        if (i10 == 1) {
            return LocaleController.getString(R.string.AccDescrGIFs);
        }
        if (i10 != 2) {
            return null;
        }
        return LocaleController.getString(R.string.AccDescrStickers);
    }

    @Override
    public final Object e(m2.g gVar, int i10) {
        FrameLayout frameLayout = ((uy) this.f31990c.f34990e.get(i10)).f33223b;
        gVar.addView(frameLayout);
        return frameLayout;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
