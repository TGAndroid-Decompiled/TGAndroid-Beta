package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class ge0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f25131a;
    public final Utilities.Callback f25132b;
    public final NotificationCenter.NotificationCenterDelegate[] f25133c;

    public ge0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f25131a = i10;
        this.f25132b = callback;
        this.f25133c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f25131a) {
                Utilities.Callback callback = this.f25132b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f25133c[0], i12);
            }
        }
    }
}
