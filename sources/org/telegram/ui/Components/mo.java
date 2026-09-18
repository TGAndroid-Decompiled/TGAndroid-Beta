package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class mo implements View.OnClickListener {
    public final int f26218a;
    public final Context f26219b;
    public final int f26220c;
    public final Object d;
    public final Object e;
    public final Object f26221f;

    public mo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f26218a = i11;
        this.d = obj;
        this.f26219b = context;
        this.e = obj2;
        this.f26220c = i10;
        this.f26221f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26218a) {
            case 0:
                ((po) this.d).a();
                i2.s sVar = new i2.s(this.f26220c, (oo) this.f26221f, 6);
                c5.G(this.f26219b, (org.telegram.ui.ActionBar.f6) this.e, sVar);
                return;
            default:
                np npVar = (np) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f26221f;
                ((org.telegram.ui.ActionBar.g3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f26219b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", npVar.f26511a.f21985q).apply();
                    org.telegram.ui.Components.voip.f2.g(findActivity, this.f26220c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
