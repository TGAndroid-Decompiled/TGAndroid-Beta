package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gk extends org.telegram.ui.Components.z71 {
    public final Context f33583a;
    public final xn f33584b;

    public gk(xn xnVar, Context context) {
        this.f33584b = xnVar;
        this.f33583a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof zn) {
            ((zn) view).f40196a.Jc(this.f33584b.f39560u3);
        }
        WeakHashMap weakHashMap = r0.i0.f41795a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f33583a;
        xn xnVar = this.f33584b;
        if (i10 == 0) {
            return new ln(xnVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", xnVar.f39560u3);
        fk fkVar = new fk(context, xnVar.getParentLayout(), bundle, 0);
        fkVar.h = false;
        yn ynVar = fkVar.f40196a;
        ynVar.L.f9064a = xnVar.L;
        ynVar.f39346ca = xnVar.f39370ea;
        ynVar.f39358da = xnVar;
        ynVar.V8 = new g(this, 13);
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
