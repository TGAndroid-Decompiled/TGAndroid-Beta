package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q10 implements Runnable {
    public final FragmentContextView f30246a;

    public q10(FragmentContextView fragmentContextView) {
        this.f30246a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f30246a;
        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
        if (fragmentContextView.f24876c0 != null && (p2Var instanceof org.telegram.ui.xn)) {
            ChatObject.Call groupCall = fragmentContextView.f24888n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - p2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                j6 j6Var = fragmentContextView.f24881f0;
                if (!fragmentContextView.f24879e0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                j6Var.q(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.f24884i0, 1000L);
                fragmentContextView.f24893r.invalidate();
                return;
            }
            fragmentContextView.f24877d0 = false;
            fragmentContextView.f24883h0 = false;
            return;
        }
        fragmentContextView.f24883h0 = false;
    }
}
