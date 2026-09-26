package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class oo implements View.OnClickListener {
    public final int f27062a;
    public final Context f27063b;
    public final int f27064c;
    public final Object d;
    public final Object e;
    public final Object f27065f;

    public oo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f27062a = i11;
        this.d = obj;
        this.f27063b = context;
        this.e = obj2;
        this.f27064c = i10;
        this.f27065f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27062a) {
            case 0:
                ((ro) this.d).a();
                i2.s sVar = new i2.s(this.f27064c, (qo) this.f27065f, 7);
                e5.G(this.f27063b, (org.telegram.ui.ActionBar.d6) this.e, sVar);
                return;
            default:
                pp ppVar = (pp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f27065f;
                ((org.telegram.ui.ActionBar.e3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f27063b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", ppVar.f27472a.f22194q).apply();
                    org.telegram.ui.Components.voip.g2.g(findActivity, this.f27064c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
