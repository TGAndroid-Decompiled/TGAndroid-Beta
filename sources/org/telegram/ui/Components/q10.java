package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q10 implements Runnable {
    public final FragmentContextView f27204a;

    public q10(FragmentContextView fragmentContextView) {
        this.f27204a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f27204a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (fragmentContextView.f22013f0 != null && (n2Var instanceof org.telegram.ui.xn)) {
            ChatObject.Call groupCall = fragmentContextView.f22020n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - n2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                o6 o6Var = fragmentContextView.f22016i0;
                if (!fragmentContextView.f22015h0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                o6Var.q(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.f22019l0, 1000L);
                fragmentContextView.f22025r.invalidate();
                return;
            }
            fragmentContextView.f22014g0 = false;
            fragmentContextView.f22018k0 = false;
            return;
        }
        fragmentContextView.f22018k0 = false;
    }
}
