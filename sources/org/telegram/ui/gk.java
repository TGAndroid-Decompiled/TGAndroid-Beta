package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gk extends org.telegram.ui.Components.x81 {
    public final Context f36663a;
    public final yn f36664b;

    public gk(yn ynVar, Context context) {
        this.f36664b = ynVar;
        this.f36663a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof ao) {
            ((ao) view).f34866a.Ic(this.f36664b.f43491s3);
        }
        WeakHashMap weakHashMap = r0.i0.f45596a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f36663a;
        yn ynVar = this.f36664b;
        if (i10 == 0) {
            return new mn(ynVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", ynVar.f43491s3);
        fk fkVar = new fk(context, ynVar.getParentLayout(), bundle, 0);
        fkVar.h = false;
        zn znVar = fkVar.f34866a;
        znVar.J.f9866a = ynVar.J;
        znVar.f43272aa = ynVar.f43300ca;
        znVar.f43286ba = ynVar;
        znVar.T8 = new g(this, 13);
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
