package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class yo implements View.OnClickListener {
    public final int f35120a;
    public final Context f35121b;
    public final int f35122c;
    public final Object d;
    public final Object e;
    public final Object f35123f;

    public yo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f35120a = i11;
        this.d = obj;
        this.f35121b = context;
        this.e = obj2;
        this.f35122c = i10;
        this.f35123f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35120a) {
            case 0:
                ((bp) this.d).a();
                i2.r rVar = new i2.r(this.f35122c, (ap) this.f35123f, 7);
                g5.F(this.f35121b, (org.telegram.ui.ActionBar.u6) this.e, rVar);
                return;
            default:
                aq aqVar = (aq) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f35123f;
                ((org.telegram.ui.ActionBar.k3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f35121b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", aqVar.f26634a.f26091q).apply();
                    org.telegram.ui.Components.voip.g2.g(findActivity, this.f35122c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
