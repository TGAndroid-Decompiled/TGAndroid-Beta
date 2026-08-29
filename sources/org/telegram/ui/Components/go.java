package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class go implements View.OnClickListener {
    public final int f28923a;
    public final Context f28924b;
    public final int f28925c;
    public final Object d;
    public final Object f28926e;
    public final Object f28927f;

    public go(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f28923a = i11;
        this.d = obj;
        this.f28924b = context;
        this.f28926e = obj2;
        this.f28925c = i10;
        this.f28927f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28923a) {
            case 0:
                ((jo) this.d).a();
                eg.n2 n2Var = new eg.n2(this.f28925c, (io) this.f28927f, 5);
                c5.G(this.f28924b, (org.telegram.ui.ActionBar.c6) this.f28926e, n2Var);
                return;
            default:
                hp hpVar = (hp) this.f28926e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f28927f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f28924b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", hpVar.f29211a.f26324q).apply();
                    org.telegram.ui.Components.voip.h2.h(findActivity, this.f28925c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
