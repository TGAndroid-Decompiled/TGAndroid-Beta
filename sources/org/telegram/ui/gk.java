package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gk extends org.telegram.ui.Components.d81 {
    public final Context f37120a;
    public final xn f37121b;

    public gk(xn xnVar, Context context) {
        this.f37121b = xnVar;
        this.f37120a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof zn) {
            ((zn) view).f43986a.Jc(this.f37121b.f43308r3);
        }
        WeakHashMap weakHashMap = r0.j0.f46469a;
        r0.z.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f37120a;
        xn xnVar = this.f37121b;
        if (i10 == 0) {
            return new ln(xnVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", xnVar.f43308r3);
        fk fkVar = new fk(context, xnVar.getParentLayout(), bundle, 0);
        fkVar.h = false;
        yn ynVar = fkVar.f43986a;
        ynVar.I.f48131a = xnVar.I;
        ynVar.Z9 = xnVar.f43114ba;
        ynVar.f43100aa = xnVar;
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
