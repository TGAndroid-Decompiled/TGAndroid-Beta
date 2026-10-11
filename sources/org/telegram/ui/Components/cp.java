package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class cp implements View.OnClickListener {
    public final int f25414a;
    public final Context f25415b;
    public final int f25416c;
    public final Object d;
    public final Object f25417e;
    public final Object f25418f;

    public cp(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f25414a = i11;
        this.d = obj;
        this.f25415b = context;
        this.f25417e = obj2;
        this.f25416c = i10;
        this.f25418f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25414a) {
            case 0:
                ((fp) this.d).a();
                i2.s sVar = new i2.s(this.f25416c, (ep) this.f25418f, 7);
                g5.F(this.f25415b, (org.telegram.ui.ActionBar.d6) this.f25417e, sVar);
                return;
            default:
                dq dqVar = (dq) this.f25417e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f25418f;
                ((org.telegram.ui.ActionBar.e3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f25415b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", dqVar.f25859a.f24125q).apply();
                    org.telegram.ui.Components.voip.g2.g(findActivity, this.f25416c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
