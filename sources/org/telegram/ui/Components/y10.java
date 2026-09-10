package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class y10 implements Runnable {
    public final FragmentContextView f29220a;

    public y10(FragmentContextView fragmentContextView) {
        this.f29220a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f29220a;
        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
        if (fragmentContextView.f21127f0 != null && (p2Var instanceof org.telegram.ui.eo)) {
            ChatObject.Call groupCall = fragmentContextView.f21134n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - p2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                n6 n6Var = fragmentContextView.f21130i0;
                if (!fragmentContextView.f21129h0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                n6Var.q(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.f21133l0, 1000L);
                fragmentContextView.f21139r.invalidate();
                return;
            }
            fragmentContextView.f21128g0 = false;
            fragmentContextView.f21132k0 = false;
            return;
        }
        fragmentContextView.f21132k0 = false;
    }
}
