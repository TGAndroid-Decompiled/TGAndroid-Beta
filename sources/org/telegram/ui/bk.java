package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bk extends org.telegram.ui.Components.v81 {
    public final Context f35659a;
    public final qn f35660b;

    public bk(qn qnVar, Context context) {
        this.f35660b = qnVar;
        this.f35659a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof sn) {
            ((sn) view).f41490a.Nc(this.f35660b.f40859u3);
        }
        WeakHashMap weakHashMap = r0.i0.f44818a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f35659a;
        qn qnVar = this.f35660b;
        if (i10 == 0) {
            return new en(qnVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", qnVar.f40859u3);
        ak akVar = new ak(context, qnVar.getParentLayout(), bundle, 0);
        akVar.h = false;
        rn rnVar = akVar.f41490a;
        rnVar.L.f11063a = qnVar.L;
        rnVar.f40643ca = qnVar.f40667ea;
        rnVar.f40656da = qnVar;
        rnVar.V8 = new g(this, 13);
        return akVar;
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
