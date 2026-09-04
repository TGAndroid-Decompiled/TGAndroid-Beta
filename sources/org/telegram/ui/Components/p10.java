package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p10 implements Runnable {
    public final FragmentContextView f29261a;

    public p10(FragmentContextView fragmentContextView) {
        this.f29261a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f29261a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (fragmentContextView.f23982f0 != null && (n2Var instanceof org.telegram.ui.co)) {
            ChatObject.Call groupCall = fragmentContextView.f23989n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - n2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                p6 p6Var = fragmentContextView.f23985i0;
                if (!fragmentContextView.f23984h0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                p6Var.q(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.f23988l0, 1000L);
                fragmentContextView.f23994r.invalidate();
                return;
            }
            fragmentContextView.f23983g0 = false;
            fragmentContextView.f23987k0 = false;
            return;
        }
        fragmentContextView.f23987k0 = false;
    }
}
