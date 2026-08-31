package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class df0 implements NotificationCenter.NotificationCenterDelegate {
    public final ef0 f36215a;

    public df0(ef0 ef0Var) {
        this.f36215a = ef0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ef0 ef0Var = this.f36215a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                ef0Var.f36583y = (GoogleSignInAccount) k7.z.b(intent).getResult(com.google.android.gms.common.api.f.class);
                ef0Var.h(null);
            } catch (com.google.android.gms.common.api.f e6) {
                FileLog.e(e6);
            }
        }
    }
}
