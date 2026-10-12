package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i20 implements Runnable {
    public final FragmentContextView f27004a;

    public i20(FragmentContextView fragmentContextView) {
        this.f27004a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f27004a;
        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
        if (fragmentContextView.f23951g0 != null && (m2Var instanceof org.telegram.ui.eo)) {
            ChatObject.Call groupCall = fragmentContextView.f23957n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - m2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                q6 q6Var = fragmentContextView.f23954j0;
                if (!fragmentContextView.f23953i0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                q6Var.t(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.m0, 1000L);
                fragmentContextView.f23964s.invalidate();
                return;
            }
            fragmentContextView.f23952h0 = false;
            fragmentContextView.f23956l0 = false;
            return;
        }
        fragmentContextView.f23956l0 = false;
    }
}
