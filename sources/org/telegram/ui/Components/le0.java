package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class le0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f24969a;
    public final Utilities.Callback f24970b;
    public final NotificationCenter.NotificationCenterDelegate[] f24971c;

    public le0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f24969a = i10;
        this.f24970b = callback;
        this.f24971c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f24969a) {
                Utilities.Callback callback = this.f24970b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f24971c[0], i12);
            }
        }
    }
}
