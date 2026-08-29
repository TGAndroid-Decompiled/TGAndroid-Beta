package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l10 implements Runnable {
    public final FragmentContextView f30189a;

    public l10(FragmentContextView fragmentContextView) {
        this.f30189a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f30189a;
        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
        if (fragmentContextView.f26388b0 != null && (o2Var instanceof org.telegram.ui.tn)) {
            ChatObject.Call groupCall = fragmentContextView.f26402n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - o2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                n6 n6Var = fragmentContextView.f26393e0;
                if (!fragmentContextView.f26391d0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                n6Var.q(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.f26397h0, 1000L);
                fragmentContextView.f26407r.invalidate();
                return;
            }
            fragmentContextView.f26390c0 = false;
            fragmentContextView.f26396g0 = false;
            return;
        }
        fragmentContextView.f26396g0 = false;
    }
}
