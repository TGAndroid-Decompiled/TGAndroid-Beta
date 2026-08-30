package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gk extends org.telegram.ui.Components.c81 {
    public final Context f34634a;
    public final xn f34635b;

    public gk(xn xnVar, Context context) {
        this.f34635b = xnVar;
        this.f34634a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof zn) {
            ((zn) view).f40837a.Jc(this.f34635b.f40161r3);
        }
        WeakHashMap weakHashMap = r0.j0.f43118a;
        r0.z.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f34634a;
        xn xnVar = this.f34635b;
        if (i10 == 0) {
            return new ln(xnVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", xnVar.f40161r3);
        fk fkVar = new fk(context, xnVar.getParentLayout(), bundle, 0);
        fkVar.h = false;
        yn ynVar = fkVar.f40837a;
        ynVar.I.f44317a = xnVar.I;
        ynVar.Z9 = xnVar.f39968ba;
        ynVar.f39954aa = xnVar;
        ynVar.S8 = new h(this, 13);
        return fkVar;
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
