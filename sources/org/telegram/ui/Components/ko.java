package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ko implements View.OnClickListener {
    public final int f28423a;
    public final Context f28424b;
    public final int f28425c;
    public final Object d;
    public final Object f28426e;
    public final Object f28427f;

    public ko(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f28423a = i11;
        this.d = obj;
        this.f28424b = context;
        this.f28426e = obj2;
        this.f28425c = i10;
        this.f28427f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28423a) {
            case 0:
                ((no) this.d).a();
                hg.m2 m2Var = new hg.m2(this.f28425c, (mo) this.f28427f, 6);
                z4.G(this.f28424b, (org.telegram.ui.ActionBar.g6) this.f28426e, m2Var);
                return;
            default:
                np npVar = (np) this.f28426e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f28427f;
                ((org.telegram.ui.ActionBar.h3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f28424b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", npVar.f29606a.f24809q).apply();
                    org.telegram.ui.Components.voip.g2.h(findActivity, this.f28425c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
