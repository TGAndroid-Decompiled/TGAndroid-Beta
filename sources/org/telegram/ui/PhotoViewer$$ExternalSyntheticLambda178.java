package org.telegram.ui;

import android.text.style.ClickableSpan;
import android.widget.TextView;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class PhotoViewer$$ExternalSyntheticLambda178 implements Utilities.Callback3 {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;

    public PhotoViewer$$ExternalSyntheticLambda178(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer) this.f$0).onLinkLongPress((ClickableSpan) obj, (TextView) obj2, (Runnable) obj3);
                break;
            case 1:
                ((LoginActivity.PhoneView) this.f$0).lambda$requestPasskey$29((Long) obj, (TLRPC.auth_Authorization) obj2, (String) obj3);
                break;
            default:
                ((SecretMediaViewer) this.f$0).onLinkLongPress((ClickableSpan) obj, (TextView) obj2, (Runnable) obj3);
                break;
        }
    }
}
