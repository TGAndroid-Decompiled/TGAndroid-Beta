package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class wo implements View.OnClickListener {
    public final int f32157a;
    public final Context f32158b;
    public final int f32159c;
    public final Object d;
    public final Object e;
    public final Object f32160f;

    public wo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f32157a = i11;
        this.d = obj;
        this.f32158b = context;
        this.e = obj2;
        this.f32159c = i10;
        this.f32160f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32157a) {
            case 0:
                ((zo) this.d).a();
                i2.s sVar = new i2.s(this.f32159c, (yo) this.f32160f, 7);
                f5.F(this.f32158b, (org.telegram.ui.ActionBar.d6) this.e, sVar);
                return;
            default:
                xp xpVar = (xp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f32160f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f32158b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", xpVar.f32430a.f24148q).apply();
                    org.telegram.ui.Components.voip.d2.g(findActivity, this.f32159c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
