package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r10 implements Runnable {
    public final FragmentContextView f27877a;

    public r10(FragmentContextView fragmentContextView) {
        this.f27877a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f27877a;
        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
        if (fragmentContextView.f22267f0 != null && (o2Var instanceof org.telegram.ui.xn)) {
            ChatObject.Call groupCall = fragmentContextView.f22274n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - o2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                o6 o6Var = fragmentContextView.f22270i0;
                if (!fragmentContextView.f22269h0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                o6Var.q(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.f22273l0, 1000L);
                fragmentContextView.f22279r.invalidate();
                return;
            }
            fragmentContextView.f22268g0 = false;
            fragmentContextView.f22272k0 = false;
            return;
        }
        fragmentContextView.f22272k0 = false;
    }
}
