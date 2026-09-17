package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class lo implements View.OnClickListener {
    public final int f28250a;
    public final Context f28251b;
    public final int f28252c;
    public final Object d;
    public final Object f28253e;
    public final Object f28254f;

    public lo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f28250a = i11;
        this.d = obj;
        this.f28251b = context;
        this.f28253e = obj2;
        this.f28252c = i10;
        this.f28254f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28250a) {
            case 0:
                ((oo) this.d).a();
                i2.t tVar = new i2.t(this.f28252c, (no) this.f28254f, 6);
                e5.G(this.f28251b, (org.telegram.ui.ActionBar.f6) this.f28253e, tVar);
                return;
            default:
                mp mpVar = (mp) this.f28253e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f28254f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f28251b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", mpVar.f28478a.f23908q).apply();
                    org.telegram.ui.Components.voip.d2.g(findActivity, this.f28252c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
