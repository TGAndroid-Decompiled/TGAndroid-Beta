package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class c31 extends c71 {
    public final e31 f32513d2;
    public final t61[] f32514e2;
    public final f31 f32515f2;

    public c31(f31 f31Var, f31 f31Var2, Activity activity, Integer num, e31 e31Var, t61[] t61VarArr) {
        super(f31Var2, activity, false, num, 2, null);
        this.f32515f2 = f31Var;
        this.f32513d2 = e31Var;
        this.f32514e2 = t61VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            f31 f31Var = this.f32515f2;
            i10 = ((org.telegram.ui.ActionBar.o2) f31Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            e31 e31Var = this.f32513d2;
            if (e31Var != null) {
                e31Var.a(true);
            }
            t61 t61Var = this.f32514e2[0];
            if (t61Var != null) {
                f31Var.f33405n = null;
                t61Var.dismiss();
            }
        }
    }

    @Override
    public final void r(l61 l61Var, zg.p0 p0Var) {
        int i10;
        f31 f31Var = this.f32515f2;
        i10 = ((org.telegram.ui.ActionBar.o2) f31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(p0Var.f49444f);
        e31 e31Var = this.f32513d2;
        if (e31Var != null) {
            e31Var.a(true);
        }
        t61 t61Var = this.f32514e2[0];
        if (t61Var != null) {
            f31Var.f33405n = null;
            t61Var.dismiss();
        }
    }
}
