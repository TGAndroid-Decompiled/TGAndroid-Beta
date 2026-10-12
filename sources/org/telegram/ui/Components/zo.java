package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class zo implements View.OnClickListener {
    public final int f31910a;
    public final Context f31911b;
    public final int f31912c;
    public final Object d;
    public final Object e;
    public final Object f31913f;

    public zo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f31910a = i11;
        this.d = obj;
        this.f31911b = context;
        this.e = obj2;
        this.f31912c = i10;
        this.f31913f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31910a) {
            case 0:
                ((cp) this.d).a();
                i2.r rVar = new i2.r(this.f31912c, (bp) this.f31913f, 7);
                g5.F(this.f31911b, (org.telegram.ui.ActionBar.c6) this.e, rVar);
                return;
            default:
                aq aqVar = (aq) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f31913f;
                ((org.telegram.ui.ActionBar.e3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f31911b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", aqVar.f23604a.f23092q).apply();
                    org.telegram.ui.Components.voip.d2.g(findActivity, this.f31912c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
