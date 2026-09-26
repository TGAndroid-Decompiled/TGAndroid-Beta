package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class me0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f26478a;
    public final Utilities.Callback f26479b;
    public final NotificationCenter.NotificationCenterDelegate[] f26480c;

    public me0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f26478a = i10;
        this.f26479b = callback;
        this.f26480c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f26478a) {
                Utilities.Callback callback = this.f26479b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f26480c[0], i12);
            }
        }
    }
}
