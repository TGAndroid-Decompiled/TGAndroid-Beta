package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s10 implements Runnable {
    public final FragmentContextView f30565a;

    public s10(FragmentContextView fragmentContextView) {
        this.f30565a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f30565a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (fragmentContextView.f24173f0 != null && (n2Var instanceof org.telegram.ui.yn)) {
            ChatObject.Call groupCall = fragmentContextView.f24180n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - n2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                o6 o6Var = fragmentContextView.f24176i0;
                if (!fragmentContextView.f24175h0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                o6Var.q(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.f24179l0, 1000L);
                fragmentContextView.f24185r.invalidate();
                return;
            }
            fragmentContextView.f24174g0 = false;
            fragmentContextView.f24178k0 = false;
            return;
        }
        fragmentContextView.f24178k0 = false;
    }
}
