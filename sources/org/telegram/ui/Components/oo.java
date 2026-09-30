package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class oo implements View.OnClickListener {
    public final int f27126a;
    public final Context f27127b;
    public final int f27128c;
    public final Object d;
    public final Object e;
    public final Object f27129f;

    public oo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f27126a = i11;
        this.d = obj;
        this.f27127b = context;
        this.e = obj2;
        this.f27128c = i10;
        this.f27129f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27126a) {
            case 0:
                ((ro) this.d).a();
                i2.s sVar = new i2.s(this.f27128c, (qo) this.f27129f, 7);
                e5.G(this.f27127b, (org.telegram.ui.ActionBar.d6) this.e, sVar);
                return;
            default:
                pp ppVar = (pp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f27129f;
                ((org.telegram.ui.ActionBar.e3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f27127b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", ppVar.f27393a.f22196q).apply();
                    org.telegram.ui.Components.voip.g2.g(findActivity, this.f27128c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
