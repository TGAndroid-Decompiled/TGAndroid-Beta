package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class wo implements View.OnClickListener {
    public final int f32278a;
    public final Context f32279b;
    public final int f32280c;
    public final Object d;
    public final Object e;
    public final Object f32281f;

    public wo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f32278a = i11;
        this.d = obj;
        this.f32279b = context;
        this.e = obj2;
        this.f32280c = i10;
        this.f32281f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32278a) {
            case 0:
                ((zo) this.d).a();
                i2.r rVar = new i2.r(this.f32280c, (yo) this.f32281f, 7);
                f5.G(this.f32279b, (org.telegram.ui.ActionBar.g6) this.e, rVar);
                return;
            default:
                xp xpVar = (xp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f32281f;
                ((org.telegram.ui.ActionBar.h3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f32279b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", xpVar.f32618a.f24296q).apply();
                    org.telegram.ui.Components.voip.d2.g(findActivity, this.f32280c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
