package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class lo implements View.OnClickListener {
    public final int f28276a;
    public final Context f28277b;
    public final int f28278c;
    public final Object d;
    public final Object f28279e;
    public final Object f28280f;

    public lo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f28276a = i11;
        this.d = obj;
        this.f28277b = context;
        this.f28279e = obj2;
        this.f28278c = i10;
        this.f28280f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28276a) {
            case 0:
                ((oo) this.d).a();
                i2.t tVar = new i2.t(this.f28278c, (no) this.f28280f, 6);
                e5.G(this.f28277b, (org.telegram.ui.ActionBar.f6) this.f28279e, tVar);
                return;
            default:
                mp mpVar = (mp) this.f28279e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f28280f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f28277b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", mpVar.f28504a.f23934q).apply();
                    org.telegram.ui.Components.voip.d2.g(findActivity, this.f28278c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
