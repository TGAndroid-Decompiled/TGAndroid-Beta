package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class be0 implements NotificationCenter.NotificationCenterDelegate {
    public final de0 f32341a;

    public be0(de0 de0Var) {
        this.f32341a = de0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        de0 de0Var = this.f32341a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                de0Var.F = (GoogleSignInAccount) w7.e9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                de0Var.h(null);
            } catch (com.google.android.gms.common.api.f e) {
                FileLog.e(e);
            }
        }
    }
}
