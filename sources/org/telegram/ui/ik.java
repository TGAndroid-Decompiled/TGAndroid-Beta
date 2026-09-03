package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ik extends org.telegram.ui.Components.c81 {
    public final Context f34991a;
    public final zn f34992b;

    public ik(zn znVar, Context context) {
        this.f34992b = znVar;
        this.f34991a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof bo) {
            ((bo) view).f32924a.Jc(this.f34992b.f40727r3);
        }
        WeakHashMap weakHashMap = r0.j0.f43142a;
        r0.z.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f34991a;
        zn znVar = this.f34992b;
        if (i10 == 0) {
            return new nn(znVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", znVar.f40727r3);
        hk hkVar = new hk(context, znVar.getParentLayout(), bundle, 0);
        hkVar.h = false;
        ao aoVar = hkVar.f32924a;
        aoVar.I.f44382a = znVar.I;
        aoVar.Z9 = znVar.f40534ba;
        aoVar.f40520aa = znVar;
        aoVar.S8 = new h(this, 13);
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
