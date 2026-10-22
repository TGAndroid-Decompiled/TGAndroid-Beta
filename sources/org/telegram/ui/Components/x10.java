package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x10 implements Runnable {
    public final FragmentContextView f32309a;

    public x10(FragmentContextView fragmentContextView) {
        this.f32309a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f32309a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (fragmentContextView.f24225g0 != null && (n2Var instanceof org.telegram.ui.qn)) {
            ChatObject.Call groupCall = fragmentContextView.f24231n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - n2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                p6 p6Var = fragmentContextView.f24228j0;
                if (!fragmentContextView.f24227i0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                p6Var.t(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.m0, 1000L);
                fragmentContextView.f24238s.invalidate();
                return;
            }
            fragmentContextView.f24226h0 = false;
            fragmentContextView.f24230l0 = false;
            return;
        }
        fragmentContextView.f24230l0 = false;
    }
}
