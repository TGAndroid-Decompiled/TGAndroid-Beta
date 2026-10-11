package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g20 implements Runnable {
    public final FragmentContextView f26579a;

    public g20(FragmentContextView fragmentContextView) {
        this.f26579a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f26579a;
        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
        if (fragmentContextView.f24165g0 != null && (m2Var instanceof org.telegram.ui.zn)) {
            ChatObject.Call groupCall = fragmentContextView.f24171n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - m2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                q6 q6Var = fragmentContextView.f24168j0;
                if (!fragmentContextView.f24167i0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                q6Var.t(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.m0, 1000L);
                fragmentContextView.f24178s.invalidate();
                return;
            }
            fragmentContextView.f24166h0 = false;
            fragmentContextView.f24170l0 = false;
            return;
        }
        fragmentContextView.f24170l0 = false;
    }
}
