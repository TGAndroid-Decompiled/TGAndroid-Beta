package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class po implements View.OnClickListener {
    public final int f29673a;
    public final Context f29674b;
    public final int f29675c;
    public final Object d;
    public final Object f29676e;
    public final Object f29677f;

    public po(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f29673a = i11;
        this.d = obj;
        this.f29674b = context;
        this.f29676e = obj2;
        this.f29675c = i10;
        this.f29677f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29673a) {
            case 0:
                ((so) this.d).a();
                i2.s sVar = new i2.s(this.f29675c, (ro) this.f29677f, 7);
                e5.G(this.f29674b, (org.telegram.ui.ActionBar.d6) this.f29676e, sVar);
                return;
            default:
                qp qpVar = (qp) this.f29676e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f29677f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f29674b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", qpVar.f30140a.f24093q).apply();
                    org.telegram.ui.Components.voip.g2.g(findActivity, this.f29675c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
