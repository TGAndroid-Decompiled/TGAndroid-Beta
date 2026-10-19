package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x10 implements Runnable {
    public final FragmentContextView f32257a;

    public x10(FragmentContextView fragmentContextView) {
        this.f32257a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f32257a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (fragmentContextView.f24219g0 != null && (n2Var instanceof org.telegram.ui.qn)) {
            ChatObject.Call groupCall = fragmentContextView.f24225n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - n2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                p6 p6Var = fragmentContextView.f24222j0;
                if (!fragmentContextView.f24221i0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                p6Var.t(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.m0, 1000L);
                fragmentContextView.f24232s.invalidate();
                return;
            }
            fragmentContextView.f24220h0 = false;
            fragmentContextView.f24224l0 = false;
            return;
        }
        fragmentContextView.f24224l0 = false;
    }
}
