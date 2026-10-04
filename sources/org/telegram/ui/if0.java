package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class if0 implements NotificationCenter.NotificationCenterDelegate {
    public final jf0 f37418a;

    public if0(jf0 jf0Var) {
        this.f37418a = jf0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        jf0 jf0Var = this.f37418a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                jf0Var.f37687y = (GoogleSignInAccount) w7.h9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                jf0Var.h(null);
            } catch (com.google.android.gms.common.api.f e7) {
                FileLog.e(e7);
            }
        }
    }
}
