package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p10 implements Runnable {
    public final FragmentContextView f26913a;

    public p10(FragmentContextView fragmentContextView) {
        this.f26913a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f26913a;
        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
        if (fragmentContextView.f22055f0 != null && (o2Var instanceof org.telegram.ui.bo)) {
            ChatObject.Call groupCall = fragmentContextView.f22062n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - o2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                m6 m6Var = fragmentContextView.f22058i0;
                if (!fragmentContextView.f22057h0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                m6Var.q(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.f22061l0, 1000L);
                fragmentContextView.f22067r.invalidate();
                return;
            }
            fragmentContextView.f22056g0 = false;
            fragmentContextView.f22060k0 = false;
            return;
        }
        fragmentContextView.f22060k0 = false;
    }
}
