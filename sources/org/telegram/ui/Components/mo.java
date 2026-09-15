package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class mo implements View.OnClickListener {
    public final int f26186a;
    public final Context f26187b;
    public final int f26188c;
    public final Object d;
    public final Object e;
    public final Object f26189f;

    public mo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f26186a = i11;
        this.d = obj;
        this.f26187b = context;
        this.e = obj2;
        this.f26188c = i10;
        this.f26189f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26186a) {
            case 0:
                ((po) this.d).a();
                i2.s sVar = new i2.s(this.f26188c, (oo) this.f26189f, 6);
                c5.G(this.f26187b, (org.telegram.ui.ActionBar.e6) this.e, sVar);
                return;
            default:
                np npVar = (np) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f26189f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f26187b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", npVar.f26547a.f21972q).apply();
                    org.telegram.ui.Components.voip.f2.g(findActivity, this.f26188c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
