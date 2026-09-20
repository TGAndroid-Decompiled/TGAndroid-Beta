package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p10 implements Runnable {
    public final FragmentContextView f27111a;

    public p10(FragmentContextView fragmentContextView) {
        this.f27111a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f27111a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (fragmentContextView.f22263f0 != null && (n2Var instanceof org.telegram.ui.zn)) {
            ChatObject.Call groupCall = fragmentContextView.f22270n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - n2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                n6 n6Var = fragmentContextView.f22266i0;
                if (!fragmentContextView.f22265h0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                n6Var.q(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.f22269l0, 1000L);
                fragmentContextView.f22275r.invalidate();
                return;
            }
            fragmentContextView.f22264g0 = false;
            fragmentContextView.f22268k0 = false;
            return;
        }
        fragmentContextView.f22268k0 = false;
    }
}
