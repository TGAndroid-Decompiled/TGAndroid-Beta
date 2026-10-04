package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class oe0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f29340a;
    public final Utilities.Callback f29341b;
    public final NotificationCenter.NotificationCenterDelegate[] f29342c;

    public oe0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f29340a = i10;
        this.f29341b = callback;
        this.f29342c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f29340a) {
                Utilities.Callback callback = this.f29341b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f29342c[0], i12);
            }
        }
    }
}
