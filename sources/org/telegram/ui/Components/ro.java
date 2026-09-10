package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ro implements View.OnClickListener {
    public final int f26707a;
    public final Context f26708b;
    public final int f26709c;
    public final Object d;
    public final Object e;
    public final Object f26710f;

    public ro(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f26707a = i11;
        this.d = obj;
        this.f26708b = context;
        this.e = obj2;
        this.f26709c = i10;
        this.f26710f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26707a) {
            case 0:
                ((uo) this.d).a();
                i2.s sVar = new i2.s(this.f26709c, (to) this.f26710f, 6);
                d5.G(this.f26708b, (org.telegram.ui.ActionBar.f6) this.e, sVar);
                return;
            default:
                tp tpVar = (tp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f26710f;
                ((org.telegram.ui.ActionBar.h3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f26708b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", tpVar.f27462a.f21057q).apply();
                    org.telegram.ui.Components.voip.e2.g(findActivity, this.f26709c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
