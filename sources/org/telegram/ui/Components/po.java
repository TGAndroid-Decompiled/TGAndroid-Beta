package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class po implements View.OnClickListener {
    public final int f27413a;
    public final Context f27414b;
    public final int f27415c;
    public final Object d;
    public final Object e;
    public final Object f27416f;

    public po(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f27413a = i11;
        this.d = obj;
        this.f27414b = context;
        this.e = obj2;
        this.f27415c = i10;
        this.f27416f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27413a) {
            case 0:
                ((so) this.d).a();
                i2.s sVar = new i2.s(this.f27415c, (ro) this.f27416f, 7);
                e5.G(this.f27414b, (org.telegram.ui.ActionBar.d6) this.e, sVar);
                return;
            default:
                qp qpVar = (qp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f27416f;
                ((org.telegram.ui.ActionBar.e3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f27414b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", qpVar.f27697a.f22216q).apply();
                    org.telegram.ui.Components.voip.g2.g(findActivity, this.f27415c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
