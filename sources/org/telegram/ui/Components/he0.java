package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class he0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f27474a;
    public final Utilities.Callback f27475b;
    public final NotificationCenter.NotificationCenterDelegate[] f27476c;

    public he0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f27474a = i10;
        this.f27475b = callback;
        this.f27476c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f27474a) {
                Utilities.Callback callback = this.f27475b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f27476c[0], i12);
            }
        }
    }
}
