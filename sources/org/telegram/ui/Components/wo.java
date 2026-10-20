package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class wo implements View.OnClickListener {
    public final int f32173a;
    public final Context f32174b;
    public final int f32175c;
    public final Object d;
    public final Object e;
    public final Object f32176f;

    public wo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f32173a = i11;
        this.d = obj;
        this.f32174b = context;
        this.e = obj2;
        this.f32175c = i10;
        this.f32176f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32173a) {
            case 0:
                ((zo) this.d).a();
                i2.s sVar = new i2.s(this.f32175c, (yo) this.f32176f, 7);
                f5.F(this.f32174b, (org.telegram.ui.ActionBar.d6) this.e, sVar);
                return;
            default:
                xp xpVar = (xp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f32176f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f32174b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", xpVar.f32458a.f24151q).apply();
                    org.telegram.ui.Components.voip.d2.g(findActivity, this.f32175c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
