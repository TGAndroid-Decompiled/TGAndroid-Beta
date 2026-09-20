package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class mo implements View.OnClickListener {
    public final int f26433a;
    public final Context f26434b;
    public final int f26435c;
    public final Object d;
    public final Object e;
    public final Object f26436f;

    public mo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f26433a = i11;
        this.d = obj;
        this.f26434b = context;
        this.e = obj2;
        this.f26435c = i10;
        this.f26436f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26433a) {
            case 0:
                ((po) this.d).a();
                i2.s sVar = new i2.s(this.f26435c, (oo) this.f26436f, 6);
                d5.G(this.f26434b, (org.telegram.ui.ActionBar.f6) this.e, sVar);
                return;
            default:
                np npVar = (np) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f26436f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f26434b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", npVar.f26710a.f22193q).apply();
                    org.telegram.ui.Components.voip.f2.g(findActivity, this.f26435c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
