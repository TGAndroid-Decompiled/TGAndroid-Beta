package org.telegram.ui;

import androidx.arch.core.util.Function;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ShareAlert;

public final class LoginActivity$$ExternalSyntheticLambda32 implements ListenerSet.Event, Function, GenericProvider {
    public final int $r8$classId;
    public final boolean f$0;

    public LoginActivity$$ExternalSyntheticLambda32(boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
    }

    @Override
    public Object apply(BulletinFactory bulletinFactory) {
        return ShareAlert.lambda$copyLink$31(this.f$0, bulletinFactory);
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
        return LoginActivity.lambda$needFinishActivity$17(this.f$0, (Void) obj);
    }
}
