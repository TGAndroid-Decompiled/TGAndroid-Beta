package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r10 implements Runnable {
    public final FragmentContextView f27876a;

    public r10(FragmentContextView fragmentContextView) {
        this.f27876a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f27876a;
        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
        if (fragmentContextView.f22266f0 != null && (m2Var instanceof org.telegram.ui.wn)) {
            ChatObject.Call groupCall = fragmentContextView.f22273n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - m2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                o6 o6Var = fragmentContextView.f22269i0;
                if (!fragmentContextView.f22268h0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                o6Var.q(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.f22272l0, 1000L);
                fragmentContextView.f22278r.invalidate();
                return;
            }
            fragmentContextView.f22267g0 = false;
            fragmentContextView.f22271k0 = false;
            return;
        }
        fragmentContextView.f22271k0 = false;
    }
}
