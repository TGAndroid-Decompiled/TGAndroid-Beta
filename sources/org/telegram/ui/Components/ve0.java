package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class ve0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f31259a;
    public final Utilities.Callback f31260b;
    public final NotificationCenter.NotificationCenterDelegate[] f31261c;

    public ve0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f31259a = i10;
        this.f31260b = callback;
        this.f31261c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f31259a) {
                Utilities.Callback callback = this.f31260b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f31261c[0], i12);
            }
        }
    }
}
