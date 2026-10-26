package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class z10 implements Runnable {
    public final FragmentContextView f35179a;

    public z10(FragmentContextView fragmentContextView) {
        this.f35179a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f35179a;
        org.telegram.ui.ActionBar.r2 r2Var = fragmentContextView.h;
        if (fragmentContextView.f26160g0 != null && (r2Var instanceof org.telegram.ui.un)) {
            ChatObject.Call groupCall = fragmentContextView.f26166n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - r2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                r6 r6Var = fragmentContextView.f26163j0;
                if (!fragmentContextView.f26162i0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                r6Var.t(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.m0, 1000L);
                fragmentContextView.f26173s.invalidate();
                return;
            }
            fragmentContextView.f26161h0 = false;
            fragmentContextView.f26165l0 = false;
            return;
        }
        fragmentContextView.f26165l0 = false;
    }
}
