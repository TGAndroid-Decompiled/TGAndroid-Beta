package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class oo implements View.OnClickListener {
    public final int f27155a;
    public final Context f27156b;
    public final int f27157c;
    public final Object d;
    public final Object e;
    public final Object f27158f;

    public oo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f27155a = i11;
        this.d = obj;
        this.f27156b = context;
        this.e = obj2;
        this.f27157c = i10;
        this.f27158f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27155a) {
            case 0:
                ((ro) this.d).a();
                i2.s sVar = new i2.s(this.f27157c, (qo) this.f27158f, 7);
                e5.G(this.f27156b, (org.telegram.ui.ActionBar.e6) this.e, sVar);
                return;
            default:
                pp ppVar = (pp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f27158f;
                ((org.telegram.ui.ActionBar.g3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f27156b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", ppVar.f27437a.f22197q).apply();
                    org.telegram.ui.Components.voip.g2.g(findActivity, this.f27157c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
