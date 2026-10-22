package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class wo implements View.OnClickListener {
    public final int f32177a;
    public final Context f32178b;
    public final int f32179c;
    public final Object d;
    public final Object e;
    public final Object f32180f;

    public wo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f32177a = i11;
        this.d = obj;
        this.f32178b = context;
        this.e = obj2;
        this.f32179c = i10;
        this.f32180f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32177a) {
            case 0:
                ((zo) this.d).a();
                i2.s sVar = new i2.s(this.f32179c, (yo) this.f32180f, 7);
                f5.F(this.f32178b, (org.telegram.ui.ActionBar.d6) this.e, sVar);
                return;
            default:
                xp xpVar = (xp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f32180f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f32178b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", xpVar.f32462a.f24154q).apply();
                    org.telegram.ui.Components.voip.d2.g(findActivity, this.f32179c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
