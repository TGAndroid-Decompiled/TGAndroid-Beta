package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class mo implements View.OnClickListener {
    public final int f26185a;
    public final Context f26186b;
    public final int f26187c;
    public final Object d;
    public final Object e;
    public final Object f26188f;

    public mo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f26185a = i11;
        this.d = obj;
        this.f26186b = context;
        this.e = obj2;
        this.f26187c = i10;
        this.f26188f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26185a) {
            case 0:
                ((po) this.d).a();
                i2.s sVar = new i2.s(this.f26187c, (oo) this.f26188f, 6);
                c5.G(this.f26186b, (org.telegram.ui.ActionBar.e6) this.e, sVar);
                return;
            default:
                np npVar = (np) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f26188f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f26186b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", npVar.f26546a.f21969q).apply();
                    org.telegram.ui.Components.voip.f2.g(findActivity, this.f26187c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
