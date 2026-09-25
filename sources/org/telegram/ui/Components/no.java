package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class no implements View.OnClickListener {
    public final int f26748a;
    public final Context f26749b;
    public final int f26750c;
    public final Object d;
    public final Object e;
    public final Object f26751f;

    public no(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f26748a = i11;
        this.d = obj;
        this.f26749b = context;
        this.e = obj2;
        this.f26750c = i10;
        this.f26751f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26748a) {
            case 0:
                ((qo) this.d).a();
                i2.s sVar = new i2.s(this.f26750c, (po) this.f26751f, 7);
                e5.G(this.f26749b, (org.telegram.ui.ActionBar.d6) this.e, sVar);
                return;
            default:
                op opVar = (op) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f26751f;
                ((org.telegram.ui.ActionBar.e3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f26749b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", opVar.f27168a.f22195q).apply();
                    org.telegram.ui.Components.voip.g2.g(findActivity, this.f26750c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
