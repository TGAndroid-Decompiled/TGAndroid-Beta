package org.telegram.ui.Business;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.UItem;

public final class ChatbotsActivity$$ExternalSyntheticLambda0 implements AlertDialog.OnButtonClickListener, Utilities.Callback5 {
    public final int $r8$classId;
    public final ChatbotsActivity f$0;

    public ChatbotsActivity$$ExternalSyntheticLambda0(ChatbotsActivity chatbotsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatbotsActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.processDone$14();
                break;
            case 1:
                this.f$0.lambda$onBackPressed$23(alertDialog, i);
                break;
            default:
                this.f$0.processDone$14();
                break;
        }
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f$0.onClick$16((UItem) obj, (View) obj2);
    }
}
