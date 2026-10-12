package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b20 implements Runnable {
    public final FragmentContextView f23676a;

    public b20(FragmentContextView fragmentContextView) {
        this.f23676a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f23676a;
        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
        if (fragmentContextView.f23163g0 != null && (m2Var instanceof org.telegram.ui.fo)) {
            ChatObject.Call groupCall = fragmentContextView.f23169n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - m2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                r6 r6Var = fragmentContextView.f23166j0;
                if (!fragmentContextView.f23165i0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                r6Var.t(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.m0, 1000L);
                fragmentContextView.f23176s.invalidate();
                return;
            }
            fragmentContextView.f23164h0 = false;
            fragmentContextView.f23168l0 = false;
            return;
        }
        fragmentContextView.f23168l0 = false;
    }
}
