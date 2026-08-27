package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

public final class pd0 implements NotificationCenter.NotificationCenterDelegate {

    public final sd0 f41331a;

    public pd0(sd0 sd0Var) {
        this.f41331a = sd0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        sd0 sd0Var = this.f41331a;
        int iIntValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (iIntValue == 200) {
            try {
                sd0Var.B = (GoogleSignInAccount) g7.m8.b(intent).getResult(com.google.android.gms.common.api.f.class);
                sd0Var.h(null);
            } catch (com.google.android.gms.common.api.f e9) {
                FileLog.e(e9);
            }
        }
    }
}
