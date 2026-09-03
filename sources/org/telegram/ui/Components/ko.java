package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ko implements View.OnClickListener {
    public final int f28448a;
    public final Context f28449b;
    public final int f28450c;
    public final Object d;
    public final Object f28451e;
    public final Object f28452f;

    public ko(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f28448a = i11;
        this.d = obj;
        this.f28449b = context;
        this.f28451e = obj2;
        this.f28450c = i10;
        this.f28452f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28448a) {
            case 0:
                ((no) this.d).a();
                hg.m2 m2Var = new hg.m2(this.f28450c, (mo) this.f28452f, 6);
                z4.G(this.f28449b, (org.telegram.ui.ActionBar.g6) this.f28451e, m2Var);
                return;
            default:
                np npVar = (np) this.f28451e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f28452f;
                ((org.telegram.ui.ActionBar.h3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f28449b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", npVar.f29560a.f24811q).apply();
                    org.telegram.ui.Components.voip.g2.g(findActivity, this.f28450c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
