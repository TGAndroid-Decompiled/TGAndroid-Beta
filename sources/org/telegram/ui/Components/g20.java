package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g20 implements Runnable {
    public final FragmentContextView f26584a;

    public g20(FragmentContextView fragmentContextView) {
        this.f26584a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f26584a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (fragmentContextView.f24177g0 != null && (n2Var instanceof org.telegram.ui.zn)) {
            ChatObject.Call groupCall = fragmentContextView.f24183n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - n2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                q6 q6Var = fragmentContextView.f24180j0;
                if (!fragmentContextView.f24179i0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                q6Var.t(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.m0, 1000L);
                fragmentContextView.f24190s.invalidate();
                return;
            }
            fragmentContextView.f24178h0 = false;
            fragmentContextView.f24182l0 = false;
            return;
        }
        fragmentContextView.f24182l0 = false;
    }
}
