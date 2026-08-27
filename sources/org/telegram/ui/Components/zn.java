package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

public final class zn implements View.OnClickListener {

    public final int f35309a;

    public final Context f35310b;

    public final int f35311c;
    public final Object d;

    public final Object f35312e;

    public final Object f35313f;

    public zn(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f35309a = i11;
        this.d = obj;
        this.f35310b = context;
        this.f35312e = obj2;
        this.f35311c = i10;
        this.f35313f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35309a) {
            case 0:
                co coVar = (co) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f35312e;
                bo boVar = (bo) this.f35313f;
                coVar.a();
                y4.G(this.f35310b, c6Var, new cg.p2(this.f35311c, boVar, 5));
                break;
            default:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.d;
                bp bpVar = (bp) this.f35312e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f35313f;
                e3Var.dismiss();
                Activity activityFindActivity = AndroidUtilities.findActivity(this.f35310b);
                if (activityFindActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", bpVar.f27188a.f26309q).apply();
                    org.telegram.ui.Components.voip.e2.h(activityFindActivity, this.f35311c, tL_inputGroupCallSlug, false, null, null);
                    break;
                }
                break;
        }
    }
}
