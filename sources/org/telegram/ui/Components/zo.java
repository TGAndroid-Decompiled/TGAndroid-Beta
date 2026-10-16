package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class zo implements View.OnClickListener {
    public final int f31613a;
    public final Context f31614b;
    public final int f31615c;
    public final Object d;
    public final Object e;
    public final Object f31616f;

    public zo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f31613a = i11;
        this.d = obj;
        this.f31614b = context;
        this.e = obj2;
        this.f31615c = i10;
        this.f31616f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31613a) {
            case 0:
                ((cp) this.d).a();
                i2.r rVar = new i2.r(this.f31615c, (bp) this.f31616f, 7);
                g5.F(this.f31614b, (org.telegram.ui.ActionBar.c6) this.e, rVar);
                return;
            default:
                aq aqVar = (aq) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f31616f;
                ((org.telegram.ui.ActionBar.e3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f31614b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", aqVar.f23281a.f22792q).apply();
                    org.telegram.ui.Components.voip.d2.g(findActivity, this.f31615c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
