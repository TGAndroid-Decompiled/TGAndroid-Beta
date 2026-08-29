package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class nd0 implements NotificationCenter.NotificationCenterDelegate {
    public final pd0 f40782a;

    public nd0(pd0 pd0Var) {
        this.f40782a = pd0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        pd0 pd0Var = this.f40782a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                pd0Var.B = (GoogleSignInAccount) i7.l.b(intent).getResult(com.google.android.gms.common.api.f.class);
                pd0Var.h(null);
            } catch (com.google.android.gms.common.api.f e10) {
                FileLog.e(e10);
            }
        }
    }
}
