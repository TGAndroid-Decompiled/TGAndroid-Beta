package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v10 implements Runnable {
    public final FragmentContextView f31253a;

    public v10(FragmentContextView fragmentContextView) {
        this.f31253a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f31253a;
        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
        if (fragmentContextView.f24368g0 != null && (o2Var instanceof org.telegram.ui.sn)) {
            ChatObject.Call groupCall = fragmentContextView.f24374n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - o2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                n6 n6Var = fragmentContextView.f24371j0;
                if (!fragmentContextView.f24370i0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                n6Var.t(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.m0, 1000L);
                fragmentContextView.f24381s.invalidate();
                return;
            }
            fragmentContextView.f24369h0 = false;
            fragmentContextView.f24373l0 = false;
            return;
        }
        fragmentContextView.f24373l0 = false;
    }
}
