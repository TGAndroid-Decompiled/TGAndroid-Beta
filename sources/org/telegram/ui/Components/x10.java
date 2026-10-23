package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x10 implements Runnable {
    public final FragmentContextView f32396a;

    public x10(FragmentContextView fragmentContextView) {
        this.f32396a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f32396a;
        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
        if (fragmentContextView.f24367g0 != null && (o2Var instanceof org.telegram.ui.sn)) {
            ChatObject.Call groupCall = fragmentContextView.f24373n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - o2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                p6 p6Var = fragmentContextView.f24370j0;
                if (!fragmentContextView.f24369i0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                p6Var.t(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.m0, 1000L);
                fragmentContextView.f24380s.invalidate();
                return;
            }
            fragmentContextView.f24368h0 = false;
            fragmentContextView.f24372l0 = false;
            return;
        }
        fragmentContextView.f24372l0 = false;
    }
}
