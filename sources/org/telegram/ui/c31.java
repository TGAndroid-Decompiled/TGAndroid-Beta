package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class c31 extends c71 {
    public final e31 f35269d2;
    public final t61[] f35270e2;
    public final f31 f35271f2;

    public c31(f31 f31Var, f31 f31Var2, Activity activity, Integer num, e31 e31Var, t61[] t61VarArr) {
        super(f31Var2, activity, false, num, 2, null);
        this.f35271f2 = f31Var;
        this.f35269d2 = e31Var;
        this.f35270e2 = t61VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            f31 f31Var = this.f35271f2;
            i10 = ((org.telegram.ui.ActionBar.n2) f31Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            e31 e31Var = this.f35269d2;
            if (e31Var != null) {
                e31Var.a(true);
            }
            t61 t61Var = this.f35270e2[0];
            if (t61Var != null) {
                f31Var.f36175n = null;
                t61Var.dismiss();
            }
        }
    }

    @Override
    public final void r(l61 l61Var, zg.o0 o0Var) {
        int i10;
        f31 f31Var = this.f35271f2;
        i10 = ((org.telegram.ui.ActionBar.n2) f31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(o0Var.f53479f);
        e31 e31Var = this.f35269d2;
        if (e31Var != null) {
            e31Var.a(true);
        }
        t61 t61Var = this.f35270e2[0];
        if (t61Var != null) {
            f31Var.f36175n = null;
            t61Var.dismiss();
        }
    }
}
