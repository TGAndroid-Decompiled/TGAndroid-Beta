package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ho implements View.OnClickListener {
    public final int f25462a;
    public final Context f25463b;
    public final int f25464c;
    public final Object d;
    public final Object e;
    public final Object f25465f;

    public ho(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f25462a = i11;
        this.d = obj;
        this.f25463b = context;
        this.e = obj2;
        this.f25464c = i10;
        this.f25465f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25462a) {
            case 0:
                ((ko) this.d).a();
                gg.m2 m2Var = new gg.m2(this.f25464c, (jo) this.f25465f, 6);
                z4.G(this.f25463b, (org.telegram.ui.ActionBar.f6) this.e, m2Var);
                return;
            default:
                kp kpVar = (kp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f25465f;
                ((org.telegram.ui.ActionBar.g3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f25463b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", kpVar.f26377a.f22938q).apply();
                    org.telegram.ui.Components.voip.f2.g(findActivity, this.f25464c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
