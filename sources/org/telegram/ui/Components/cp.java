package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class cp implements View.OnClickListener {
    public final int f25253a;
    public final Context f25254b;
    public final int f25255c;
    public final Object d;
    public final Object f25256e;
    public final Object f25257f;

    public cp(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f25253a = i11;
        this.d = obj;
        this.f25254b = context;
        this.f25256e = obj2;
        this.f25255c = i10;
        this.f25257f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25253a) {
            case 0:
                ((fp) this.d).a();
                i2.s sVar = new i2.s(this.f25255c, (ep) this.f25257f, 7);
                g5.F(this.f25254b, (org.telegram.ui.ActionBar.d6) this.f25256e, sVar);
                return;
            default:
                dq dqVar = (dq) this.f25256e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f25257f;
                ((org.telegram.ui.ActionBar.e3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f25254b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", dqVar.f25656a.f24089q).apply();
                    org.telegram.ui.Components.voip.g2.g(findActivity, this.f25255c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
