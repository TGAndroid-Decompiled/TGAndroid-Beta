package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class uo implements View.OnClickListener {
    public final int f31169a;
    public final Context f31170b;
    public final int f31171c;
    public final Object d;
    public final Object e;
    public final Object f31172f;

    public uo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f31169a = i11;
        this.d = obj;
        this.f31170b = context;
        this.e = obj2;
        this.f31171c = i10;
        this.f31172f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31169a) {
            case 0:
                ((xo) this.d).a();
                i2.r rVar = new i2.r(this.f31171c, (wo) this.f31172f, 7);
                d5.F(this.f31170b, (org.telegram.ui.ActionBar.g6) this.e, rVar);
                return;
            default:
                vp vpVar = (vp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f31172f;
                ((org.telegram.ui.ActionBar.h3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f31170b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", vpVar.f32005a.f24297q).apply();
                    org.telegram.ui.Components.voip.d2.g(findActivity, this.f31171c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
