package org.telegram.ui.Components.Premium;

import android.view.KeyEvent;
import java.util.HashMap;
import org.telegram.messenger.Utilities;

public final class StarParticlesView$$ExternalSyntheticLambda0 implements Utilities.Callback {
    public final int $r8$classId;
    public final KeyEvent.Callback f$0;

    public StarParticlesView$$ExternalSyntheticLambda0(KeyEvent.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((StarParticlesView) this.f$0).lambda$onAttachedToWindow$0((Boolean) obj);
                break;
            default:
                ((LimitReachedBottomSheet) this.f$0).sendInviteMessages((HashMap) obj);
                break;
        }
    }
}
