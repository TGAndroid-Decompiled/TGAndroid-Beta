package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class yo implements View.OnClickListener {
    public final int f35085a;
    public final Context f35086b;
    public final int f35087c;
    public final Object d;
    public final Object e;
    public final Object f35088f;

    public yo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f35085a = i11;
        this.d = obj;
        this.f35086b = context;
        this.e = obj2;
        this.f35087c = i10;
        this.f35088f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35085a) {
            case 0:
                ((bp) this.d).a();
                i2.r rVar = new i2.r(this.f35087c, (ap) this.f35088f, 7);
                g5.F(this.f35086b, (org.telegram.ui.ActionBar.u6) this.e, rVar);
                return;
            default:
                zp zpVar = (zp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f35088f;
                ((org.telegram.ui.ActionBar.k3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f35086b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", zpVar.f35382a.f26089q).apply();
                    org.telegram.ui.Components.voip.g2.g(findActivity, this.f35087c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
