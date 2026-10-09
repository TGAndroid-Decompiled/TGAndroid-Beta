package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f20 implements Runnable {
    public final FragmentContextView f26217a;

    public f20(FragmentContextView fragmentContextView) {
        this.f26217a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f26217a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (fragmentContextView.f24173g0 != null && (n2Var instanceof org.telegram.ui.zn)) {
            ChatObject.Call groupCall = fragmentContextView.f24179n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - n2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                q6 q6Var = fragmentContextView.f24176j0;
                if (!fragmentContextView.f24175i0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                q6Var.t(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.m0, 1000L);
                fragmentContextView.f24186s.invalidate();
                return;
            }
            fragmentContextView.f24174h0 = false;
            fragmentContextView.f24178l0 = false;
            return;
        }
        fragmentContextView.f24178l0 = false;
    }
}
