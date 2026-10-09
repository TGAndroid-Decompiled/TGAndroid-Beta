package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class cp implements View.OnClickListener {
    public final int f25453a;
    public final Context f25454b;
    public final int f25455c;
    public final Object d;
    public final Object f25456e;
    public final Object f25457f;

    public cp(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f25453a = i11;
        this.d = obj;
        this.f25454b = context;
        this.f25456e = obj2;
        this.f25455c = i10;
        this.f25457f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25453a) {
            case 0:
                ((fp) this.d).a();
                i2.s sVar = new i2.s(this.f25455c, (ep) this.f25457f, 7);
                g5.F(this.f25454b, (org.telegram.ui.ActionBar.e6) this.f25456e, sVar);
                return;
            default:
                dq dqVar = (dq) this.f25456e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f25457f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f25454b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", dqVar.f25790a.f24097q).apply();
                    org.telegram.ui.Components.voip.f2.g(findActivity, this.f25455c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
