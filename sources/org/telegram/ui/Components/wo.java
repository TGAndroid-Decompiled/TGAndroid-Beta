package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class wo implements View.OnClickListener {
    public final int f32167a;
    public final Context f32168b;
    public final int f32169c;
    public final Object d;
    public final Object e;
    public final Object f32170f;

    public wo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f32167a = i11;
        this.d = obj;
        this.f32168b = context;
        this.e = obj2;
        this.f32169c = i10;
        this.f32170f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32167a) {
            case 0:
                ((zo) this.d).a();
                i2.r rVar = new i2.r(this.f32169c, (yo) this.f32170f, 7);
                f5.F(this.f32168b, (org.telegram.ui.ActionBar.d6) this.e, rVar);
                return;
            default:
                xp xpVar = (xp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f32170f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f32168b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", xpVar.f32435a.f24154q).apply();
                    org.telegram.ui.Components.voip.d2.g(findActivity, this.f32169c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
