package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class a10 implements Runnable {
    public final FragmentContextView f26618a;

    public a10(FragmentContextView fragmentContextView) {
        this.f26618a = fragmentContextView;
    }

    @Override
    public final void run() {
        String formatFullDuration;
        FragmentContextView fragmentContextView = this.f26618a;
        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
        if (fragmentContextView.f26377b0 != null && (o2Var instanceof org.telegram.ui.qn)) {
            ChatObject.Call groupCall = fragmentContextView.f26391n.getGroupCall();
            if (groupCall != null && groupCall.isScheduled()) {
                int currentTime = groupCall.call.schedule_date - o2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    formatFullDuration = LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]);
                } else {
                    formatFullDuration = AndroidUtilities.formatFullDuration(currentTime);
                }
                i6 i6Var = fragmentContextView.f26382e0;
                if (!fragmentContextView.f26380d0) {
                    formatFullDuration = LocaleController.getString(R.string.VoipChatNotify);
                }
                i6Var.q(formatFullDuration, true, true);
                AndroidUtilities.runOnUIThread(fragmentContextView.f26386h0, 1000L);
                fragmentContextView.f26396r.invalidate();
                return;
            }
            fragmentContextView.f26379c0 = false;
            fragmentContextView.f26385g0 = false;
            return;
        }
        fragmentContextView.f26385g0 = false;
    }
}
