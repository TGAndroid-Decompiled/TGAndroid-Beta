package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class cp implements View.OnClickListener {
    public final int f25352a;
    public final Context f25353b;
    public final int f25354c;
    public final Object d;
    public final Object f25355e;
    public final Object f25356f;

    public cp(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f25352a = i11;
        this.d = obj;
        this.f25353b = context;
        this.f25355e = obj2;
        this.f25354c = i10;
        this.f25356f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25352a) {
            case 0:
                ((fp) this.d).a();
                i2.s sVar = new i2.s(this.f25354c, (ep) this.f25356f, 7);
                g5.F(this.f25353b, (org.telegram.ui.ActionBar.e6) this.f25355e, sVar);
                return;
            default:
                dq dqVar = (dq) this.f25355e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f25356f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f25353b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", dqVar.f25781a.f24101q).apply();
                    org.telegram.ui.Components.voip.f2.g(findActivity, this.f25354c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
