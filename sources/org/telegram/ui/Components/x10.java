package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x10 implements Runnable {
    public final FragmentContextView f32259a;

    public x10(FragmentContextView fragmentContextView) {
        this.f32259a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f32259a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (fragmentContextView.f24221g0 != null && (n2Var instanceof org.telegram.ui.qn)) {
            ChatObject.Call groupCall = fragmentContextView.f24227n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - n2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                p6 p6Var = fragmentContextView.f24224j0;
                if (!fragmentContextView.f24223i0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                p6Var.t(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.m0, 1000L);
                fragmentContextView.f24234s.invalidate();
                return;
            }
            fragmentContextView.f24222h0 = false;
            fragmentContextView.f24226l0 = false;
            return;
        }
        fragmentContextView.f24226l0 = false;
    }
}
