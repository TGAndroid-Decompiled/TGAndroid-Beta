package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class bo implements View.OnClickListener {
    public final int f27255a;
    public final Context f27256b;
    public final int f27257c;
    public final Object d;
    public final Object f27258e;
    public final Object f27259f;

    public bo(Object obj, Context context, Object obj2, int i9, Object obj3, int i10) {
        this.f27255a = i10;
        this.d = obj;
        this.f27256b = context;
        this.f27258e = obj2;
        this.f27257c = i9;
        this.f27259f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27255a) {
            case 0:
                ((fo) this.d).a();
                bg.x2 x2Var = new bg.x2(this.f27257c, (eo) this.f27259f, 5);
                y4.G(this.f27256b, (org.telegram.ui.ActionBar.b6) this.f27258e, x2Var);
                return;
            default:
                dp dpVar = (dp) this.f27258e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f27259f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f27256b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", dpVar.f27781a.f26313q).apply();
                    org.telegram.ui.Components.voip.e2.h(findActivity, this.f27257c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
