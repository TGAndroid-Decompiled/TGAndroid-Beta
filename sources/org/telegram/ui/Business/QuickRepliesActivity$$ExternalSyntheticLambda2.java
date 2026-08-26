package org.telegram.ui.Business;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.UItem;

public final class QuickRepliesActivity$$ExternalSyntheticLambda2 implements Utilities.Callback5, Utilities.Callback5Return {
    public final QuickRepliesActivity f$0;

    public QuickRepliesActivity$$ExternalSyntheticLambda2(QuickRepliesActivity quickRepliesActivity) {
        this.f$0 = quickRepliesActivity;
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f$0.onClick$5((UItem) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        UItem uItem = (UItem) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        QuickRepliesActivity quickRepliesActivity = this.f$0;
        boolean z = false;
        if (uItem.viewType == 16) {
            Object obj6 = uItem.object;
            if (!(obj6 instanceof QuickRepliesController.QuickReply) || !((QuickRepliesController.QuickReply) obj6).local) {
                quickRepliesActivity.updateSelect(uItem, view);
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
