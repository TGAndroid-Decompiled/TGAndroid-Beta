package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class ce0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f23078a;
    public final Utilities.Callback f23079b;
    public final NotificationCenter.NotificationCenterDelegate[] f23080c;

    public ce0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f23078a = i10;
        this.f23079b = callback;
        this.f23080c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f23078a) {
                Utilities.Callback callback = this.f23079b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f23080c[0], i12);
            }
        }
    }
}
