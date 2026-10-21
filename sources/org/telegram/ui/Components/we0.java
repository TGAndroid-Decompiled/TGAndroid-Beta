package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class we0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f32094a;
    public final Utilities.Callback f32095b;
    public final NotificationCenter.NotificationCenterDelegate[] f32096c;

    public we0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f32094a = i10;
        this.f32095b = callback;
        this.f32096c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f32094a) {
                Utilities.Callback callback = this.f32095b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f32096c[0], i12);
            }
        }
    }
}
