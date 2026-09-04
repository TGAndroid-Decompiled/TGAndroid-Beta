package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class lo implements View.OnClickListener {
    public final int f28249a;
    public final Context f28250b;
    public final int f28251c;
    public final Object d;
    public final Object f28252e;
    public final Object f28253f;

    public lo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f28249a = i11;
        this.d = obj;
        this.f28250b = context;
        this.f28252e = obj2;
        this.f28251c = i10;
        this.f28253f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28249a) {
            case 0:
                ((oo) this.d).a();
                i2.t tVar = new i2.t(this.f28251c, (no) this.f28253f, 6);
                e5.G(this.f28250b, (org.telegram.ui.ActionBar.f6) this.f28252e, tVar);
                return;
            default:
                mp mpVar = (mp) this.f28252e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f28253f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f28250b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", mpVar.f28477a.f23907q).apply();
                    org.telegram.ui.Components.voip.d2.g(findActivity, this.f28251c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
