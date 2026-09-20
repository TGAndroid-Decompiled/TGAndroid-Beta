package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ik extends org.telegram.ui.Components.o81 {
    public final Context f34604a;
    public final zn f34605b;

    public ik(zn znVar, Context context) {
        this.f34605b = znVar;
        this.f34604a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof bo) {
            ((bo) view).f32501a.Jc(this.f34605b.f40494u3);
        }
        WeakHashMap weakHashMap = r0.i0.f42142a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f34604a;
        zn znVar = this.f34605b;
        if (i10 == 0) {
            return new nn(znVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", znVar.f40494u3);
        hk hkVar = new hk(context, znVar.getParentLayout(), bundle, 0);
        hkVar.h = false;
        ao aoVar = hkVar.f32501a;
        aoVar.L.f9081a = znVar.L;
        aoVar.f40279ca = znVar.f40303ea;
        aoVar.f40291da = znVar;
        aoVar.V8 = new g(this, 13);
        return hkVar;
    }

    @Override
    public final int e() {
        return 3;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return LocaleController.getString(R.string.SearchThisChat);
            }
            return LocaleController.getString(R.string.SearchPublicPosts);
        }
        return LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }
}
