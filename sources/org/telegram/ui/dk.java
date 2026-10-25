package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dk extends org.telegram.ui.Components.m91 {
    public final Context f38897a;
    public final un f38898b;

    public dk(un unVar, Context context) {
        this.f38898b = unVar;
        this.f38897a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof wn) {
            ((wn) view).f45518a.Wc(this.f38898b.G3);
        }
        WeakHashMap weakHashMap = r0.i0.f47105a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f38897a;
        un unVar = this.f38898b;
        if (i10 == 0) {
            return new hn(unVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", unVar.G3);
        ck ckVar = new ck(context, unVar.getParentLayout(), bundle, 0);
        ckVar.h = false;
        vn vnVar = ckVar.f45518a;
        vnVar.L.f12845a = unVar.L;
        vnVar.f44363oa = unVar.f44385qa;
        vnVar.f44376pa = unVar;
        vnVar.f44275h9 = new f(this, 13);
        return ckVar;
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
