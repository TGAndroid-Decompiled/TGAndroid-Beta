package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class mo implements View.OnClickListener {
    public final int f26464a;
    public final Context f26465b;
    public final int f26466c;
    public final Object d;
    public final Object e;
    public final Object f26467f;

    public mo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f26464a = i11;
        this.d = obj;
        this.f26465b = context;
        this.e = obj2;
        this.f26466c = i10;
        this.f26467f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26464a) {
            case 0:
                ((po) this.d).a();
                i2.s sVar = new i2.s(this.f26466c, (oo) this.f26467f, 6);
                e5.G(this.f26465b, (org.telegram.ui.ActionBar.e6) this.e, sVar);
                return;
            default:
                np npVar = (np) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f26467f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f26465b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", npVar.f26739a.f22158q).apply();
                    org.telegram.ui.Components.voip.f2.g(findActivity, this.f26466c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
