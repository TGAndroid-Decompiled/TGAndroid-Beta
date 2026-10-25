package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class yo implements View.OnClickListener {
    public final int f35082a;
    public final Context f35083b;
    public final int f35084c;
    public final Object d;
    public final Object e;
    public final Object f35085f;

    public yo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f35082a = i11;
        this.d = obj;
        this.f35083b = context;
        this.e = obj2;
        this.f35084c = i10;
        this.f35085f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35082a) {
            case 0:
                ((bp) this.d).a();
                i2.r rVar = new i2.r(this.f35084c, (ap) this.f35085f, 7);
                g5.F(this.f35083b, (org.telegram.ui.ActionBar.u6) this.e, rVar);
                return;
            default:
                zp zpVar = (zp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f35085f;
                ((org.telegram.ui.ActionBar.k3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f35083b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", zpVar.f35379a.f26087q).apply();
                    org.telegram.ui.Components.voip.g2.g(findActivity, this.f35084c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
