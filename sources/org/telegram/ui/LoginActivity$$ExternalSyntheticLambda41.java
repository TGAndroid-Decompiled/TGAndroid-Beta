package org.telegram.ui;

import android.os.Bundle;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import org.telegram.messenger.GenericProvider;

public final class LoginActivity$$ExternalSyntheticLambda41 implements ListenerSet.Event, GenericProvider {
    public final int $r8$classId;
    public final boolean f$0;

    public LoginActivity$$ExternalSyntheticLambda41(int i, boolean z) {
        this.$r8$classId = i;
        this.f$0 = z;
    }

    @Override
    public void invoke(Object obj) {
        Player.Listener listener = (Player.Listener) obj;
        switch (this.$r8$classId) {
            case 1:
                listener.onShuffleModeEnabledChanged(this.f$0);
                break;
            default:
                listener.onSkipSilenceEnabledChanged(this.f$0);
                break;
        }
    }

    @Override
    public Object provide(Object obj) {
        Bundle bundleM = zzkw.m("afterSignup", this.f$0);
        MainTabsActivity mainTabsActivity = new MainTabsActivity();
        mainTabsActivity.prepareDialogsActivity(bundleM);
        return mainTabsActivity;
    }
}
