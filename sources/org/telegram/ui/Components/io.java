package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class io implements View.OnClickListener {
    public final int f25760a;
    public final Context f25761b;
    public final int f25762c;
    public final Object d;
    public final Object e;
    public final Object f25763f;

    public io(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f25760a = i11;
        this.d = obj;
        this.f25761b = context;
        this.e = obj2;
        this.f25762c = i10;
        this.f25763f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25760a) {
            case 0:
                ((lo) this.d).a();
                gg.m2 m2Var = new gg.m2(this.f25762c, (ko) this.f25763f, 6);
                z4.G(this.f25761b, (org.telegram.ui.ActionBar.f6) this.e, m2Var);
                return;
            default:
                lp lpVar = (lp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f25763f;
                ((org.telegram.ui.ActionBar.g3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f25761b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", lpVar.f26837a.f22965q).apply();
                    org.telegram.ui.Components.voip.f2.h(findActivity, this.f25762c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
