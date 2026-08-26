package org.telegram.ui.Stars;

import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.TwoStepVerificationSetupActivity;

public final class BotStarsActivity$$ExternalSyntheticLambda8 implements AlertDialog.OnButtonClickListener, Utilities.Callback5, Utilities.Callback5Return {
    public final BotStarsActivity f$0;

    public BotStarsActivity$$ExternalSyntheticLambda8(BotStarsActivity botStarsActivity) {
        this.f$0 = botStarsActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        BotStarsActivity botStarsActivity = this.f$0;
        botStarsActivity.getClass();
        botStarsActivity.presentFragment(new TwoStepVerificationSetupActivity(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f$0.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f$0.onItemClick$1((UItem) obj);
    }
}
