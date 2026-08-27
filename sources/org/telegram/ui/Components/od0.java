package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;

public final class od0 implements NotificationCenter.NotificationCenterDelegate {

    public final int f31263a;

    public final Utilities.Callback f31264b;

    public final NotificationCenter.NotificationCenterDelegate[] f31265c;

    public od0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f31263a = i10;
        this.f31264b = callback;
        this.f31265c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            int[] iArr = (int[]) objArr[2];
            if (iIntValue == this.f31263a) {
                Utilities.Callback callback = this.f31264b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f31265c[0], i12);
            }
        }
    }
}
