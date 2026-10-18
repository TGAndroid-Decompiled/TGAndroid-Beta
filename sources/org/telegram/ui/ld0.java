package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class ld0 implements NotificationCenter.NotificationCenterDelegate {
    public final od0 f38800a;

    public ld0(od0 od0Var) {
        this.f38800a = od0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        od0 od0Var = this.f38800a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                od0Var.F = (GoogleSignInAccount) w7.c9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                od0Var.h(null);
            } catch (com.google.android.gms.common.api.f e) {
                FileLog.e(e);
            }
        }
    }
}
