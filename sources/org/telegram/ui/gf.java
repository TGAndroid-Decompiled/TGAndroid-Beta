package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class gf implements View.OnLongClickListener {
    public final int f38573a;
    public final tn f38574b;

    public gf(tn tnVar, int i10) {
        this.f38573a = i10;
        this.f38574b = tnVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f38573a) {
            case 0:
                tn tnVar = this.f38574b;
                MessageObject messageObject3 = tnVar.Z4;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.tc(org.telegram.ui.Components.hb.a(tnVar.getParentActivity()), tnVar.f42746aa).k(false).j();
                }
                return true;
            case 1:
                return tn.R0(this.f38574b);
            default:
                tn tnVar2 = this.f38574b;
                int i10 = tnVar2.f42874kb;
                if (i10 == 1 && (messageObject2 = tnVar2.f42880l5) != null) {
                    tnVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                } else if (tnVar2.f42755b5 != null && i10 == 2 && (messageObject = tnVar2.f42856j5) != null) {
                    tnVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
