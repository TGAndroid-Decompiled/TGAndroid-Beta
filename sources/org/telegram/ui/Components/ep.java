package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ep implements View.OnClickListener {
    public final int f25736a;
    public final Context f25737b;
    public final int f25738c;
    public final Object d;
    public final Object f25739e;
    public final Object f25740f;

    public ep(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f25736a = i11;
        this.d = obj;
        this.f25737b = context;
        this.f25739e = obj2;
        this.f25738c = i10;
        this.f25740f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25736a) {
            case 0:
                ((hp) this.d).a();
                i2.s sVar = new i2.s(this.f25738c, (gp) this.f25740f, 7);
                g5.F(this.f25737b, (org.telegram.ui.ActionBar.c6) this.f25739e, sVar);
                return;
            default:
                fq fqVar = (fq) this.f25739e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f25740f;
                ((org.telegram.ui.ActionBar.e3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f25737b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", fqVar.f26150a.f23874q).apply();
                    org.telegram.ui.Components.voip.g2.g(findActivity, this.f25738c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
