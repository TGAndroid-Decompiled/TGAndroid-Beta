package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class hf0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f26770a;
    public final Utilities.Callback f26771b;
    public final NotificationCenter.NotificationCenterDelegate[] f26772c;

    public hf0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f26770a = i10;
        this.f26771b = callback;
        this.f26772c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f26770a) {
                Utilities.Callback callback = this.f26771b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f26772c[0], i12);
            }
        }
    }
}
