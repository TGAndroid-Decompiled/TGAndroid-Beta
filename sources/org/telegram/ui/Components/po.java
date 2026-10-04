package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class po implements View.OnClickListener {
    public final int f29674a;
    public final Context f29675b;
    public final int f29676c;
    public final Object d;
    public final Object f29677e;
    public final Object f29678f;

    public po(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f29674a = i11;
        this.d = obj;
        this.f29675b = context;
        this.f29677e = obj2;
        this.f29676c = i10;
        this.f29678f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29674a) {
            case 0:
                ((so) this.d).a();
                i2.s sVar = new i2.s(this.f29676c, (ro) this.f29678f, 7);
                e5.G(this.f29675b, (org.telegram.ui.ActionBar.d6) this.f29677e, sVar);
                return;
            default:
                qp qpVar = (qp) this.f29677e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f29678f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f29675b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", qpVar.f30141a.f24094q).apply();
                    org.telegram.ui.Components.voip.g2.g(findActivity, this.f29676c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
