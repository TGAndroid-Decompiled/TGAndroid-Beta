package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class me0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f26471a;
    public final Utilities.Callback f26472b;
    public final NotificationCenter.NotificationCenterDelegate[] f26473c;

    public me0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f26471a = i10;
        this.f26472b = callback;
        this.f26473c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f26471a) {
                Utilities.Callback callback = this.f26472b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f26473c[0], i12);
            }
        }
    }
}
