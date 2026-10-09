package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class de0 implements NotificationCenter.NotificationCenterDelegate {
    public final fe0 f36939a;

    public de0(fe0 fe0Var) {
        this.f36939a = fe0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        fe0 fe0Var = this.f36939a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                fe0Var.F = (GoogleSignInAccount) w7.d9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                fe0Var.h(null);
            } catch (com.google.android.gms.common.api.f e7) {
                FileLog.e(e7);
            }
        }
    }
}
