package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

public final class kf implements View.OnLongClickListener {

    public final int f39710a;

    public final rn f39711b;

    public kf(rn rnVar, int i10) {
        this.f39710a = i10;
        this.f39711b = rnVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f39710a) {
            case 0:
                rn rnVar = this.f39711b;
                MessageObject messageObject3 = rnVar.Z4;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(rnVar.getParentActivity()), rnVar.f41983aa).k(false).j();
                }
                return true;
            case 1:
                return rn.R0(this.f39711b);
            default:
                rn rnVar2 = this.f39711b;
                int i10 = rnVar2.f42114kb;
                if (i10 == 1 && (messageObject2 = rnVar2.f42119l5) != null) {
                    rnVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                }
                if (rnVar2.f41992b5 == null || i10 != 2 || (messageObject = rnVar2.f42095j5) == null) {
                    return false;
                }
                rnVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                return true;
        }
    }
}
