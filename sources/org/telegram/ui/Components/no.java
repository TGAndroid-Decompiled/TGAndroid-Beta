package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class no implements View.OnClickListener {
    public final int f26451a;
    public final Context f26452b;
    public final int f26453c;
    public final Object d;
    public final Object e;
    public final Object f26454f;

    public no(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f26451a = i11;
        this.d = obj;
        this.f26452b = context;
        this.e = obj2;
        this.f26453c = i10;
        this.f26454f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26451a) {
            case 0:
                ((qo) this.d).a();
                i2.s sVar = new i2.s(this.f26453c, (po) this.f26454f, 7);
                e5.G(this.f26452b, (org.telegram.ui.ActionBar.d6) this.e, sVar);
                return;
            default:
                op opVar = (op) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f26454f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f26452b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", opVar.f26827a.f21943q).apply();
                    org.telegram.ui.Components.voip.f2.g(findActivity, this.f26453c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
