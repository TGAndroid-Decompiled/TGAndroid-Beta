package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p10 implements Runnable {
    public final FragmentContextView f26923a;

    public p10(FragmentContextView fragmentContextView) {
        this.f26923a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f26923a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (fragmentContextView.f22039f0 != null && (n2Var instanceof org.telegram.ui.bo)) {
            ChatObject.Call groupCall = fragmentContextView.f22046n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - n2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                m6 m6Var = fragmentContextView.f22042i0;
                if (!fragmentContextView.f22041h0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                m6Var.q(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.f22045l0, 1000L);
                fragmentContextView.f22051r.invalidate();
                return;
            }
            fragmentContextView.f22040g0 = false;
            fragmentContextView.f22044k0 = false;
            return;
        }
        fragmentContextView.f22044k0 = false;
    }
}
