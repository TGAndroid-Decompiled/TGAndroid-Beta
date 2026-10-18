package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class ve0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f31248a;
    public final Utilities.Callback f31249b;
    public final NotificationCenter.NotificationCenterDelegate[] f31250c;

    public ve0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f31248a = i10;
        this.f31249b = callback;
        this.f31250c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f31248a) {
                Utilities.Callback callback = this.f31249b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f31250c[0], i12);
            }
        }
    }
}
