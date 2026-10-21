package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class wo implements View.OnClickListener {
    public final int f32174a;
    public final Context f32175b;
    public final int f32176c;
    public final Object d;
    public final Object e;
    public final Object f32177f;

    public wo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f32174a = i11;
        this.d = obj;
        this.f32175b = context;
        this.e = obj2;
        this.f32176c = i10;
        this.f32177f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32174a) {
            case 0:
                ((zo) this.d).a();
                i2.s sVar = new i2.s(this.f32176c, (yo) this.f32177f, 7);
                f5.F(this.f32175b, (org.telegram.ui.ActionBar.d6) this.e, sVar);
                return;
            default:
                xp xpVar = (xp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f32177f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f32175b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", xpVar.f32459a.f24151q).apply();
                    org.telegram.ui.Components.voip.d2.g(findActivity, this.f32176c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
