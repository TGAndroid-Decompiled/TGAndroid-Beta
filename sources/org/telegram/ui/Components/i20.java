package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i20 implements Runnable {
    public final FragmentContextView f27019a;

    public i20(FragmentContextView fragmentContextView) {
        this.f27019a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f27019a;
        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
        if (fragmentContextView.f23950g0 != null && (m2Var instanceof org.telegram.ui.eo)) {
            ChatObject.Call groupCall = fragmentContextView.f23956n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - m2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                q6 q6Var = fragmentContextView.f23953j0;
                if (!fragmentContextView.f23952i0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                q6Var.t(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.m0, 1000L);
                fragmentContextView.f23963s.invalidate();
                return;
            }
            fragmentContextView.f23951h0 = false;
            fragmentContextView.f23955l0 = false;
            return;
        }
        fragmentContextView.f23955l0 = false;
    }
}
