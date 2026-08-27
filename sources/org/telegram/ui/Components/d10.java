package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class d10 implements Runnable {

    public final FragmentContextView f27606a;

    public d10(FragmentContextView fragmentContextView) {
        this.f27606a = fragmentContextView;
    }

    @Override
    public final void run() {
        FragmentContextView fragmentContextView = this.f27606a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (fragmentContextView.f26373b0 == null || !(n2Var instanceof org.telegram.ui.rn)) {
            fragmentContextView.f26381g0 = false;
            return;
        }
        ChatObject.Call groupCall = fragmentContextView.f26387n.getGroupCall();
        if (groupCall == null || !groupCall.isScheduled()) {
            fragmentContextView.f26375c0 = false;
            fragmentContextView.f26381g0 = false;
            return;
        }
        int currentTime = groupCall.call.schedule_date - n2Var.getConnectionsManager().getCurrentTime();
        String pluralString = currentTime >= 86400 ? LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]) : AndroidUtilities.formatFullDuration(currentTime);
        i6 i6Var = fragmentContextView.f26378e0;
        if (!fragmentContextView.f26376d0) {
            pluralString = LocaleController.getString(R.string.VoipChatNotify);
        }
        i6Var.q(pluralString, true, true);
        AndroidUtilities.runOnUIThread(fragmentContextView.f26382h0, 1000L);
        fragmentContextView.f26392r.invalidate();
    }
}
