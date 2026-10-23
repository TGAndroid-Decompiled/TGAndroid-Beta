package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class wo implements View.OnClickListener {
    public final int f32178a;
    public final Context f32179b;
    public final int f32180c;
    public final Object d;
    public final Object e;
    public final Object f32181f;

    public wo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f32178a = i11;
        this.d = obj;
        this.f32179b = context;
        this.e = obj2;
        this.f32180c = i10;
        this.f32181f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32178a) {
            case 0:
                ((zo) this.d).a();
                i2.s sVar = new i2.s(this.f32180c, (yo) this.f32181f, 7);
                f5.F(this.f32179b, (org.telegram.ui.ActionBar.d6) this.e, sVar);
                return;
            default:
                xp xpVar = (xp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f32181f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f32179b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", xpVar.f32463a.f24155q).apply();
                    org.telegram.ui.Components.voip.d2.g(findActivity, this.f32180c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
