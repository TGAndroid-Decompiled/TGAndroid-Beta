package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ag implements View.OnLongClickListener {
    public final int f34209a;
    public final fo f34210b;

    public ag(fo foVar, int i10) {
        this.f34209a = i10;
        this.f34210b = foVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f34209a) {
            case 0:
                fo foVar = this.f34210b;
                MessageObject messageObject3 = foVar.f35916d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(foVar.getParentActivity()), foVar.f35932ea).k(false).j();
                }
                return true;
            case 1:
                return fo.W(this.f34210b);
            default:
                fo foVar2 = this.f34210b;
                int i10 = foVar2.ob;
                if (i10 == 1 && (messageObject2 = foVar2.p5) != null) {
                    foVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                } else if (foVar2.f35941f5 != null && i10 == 2 && (messageObject = foVar2.f36038n5) != null) {
                    foVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
