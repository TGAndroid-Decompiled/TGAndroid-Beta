package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class mf0 implements NotificationCenter.NotificationCenterDelegate {
    public final nf0 f35713a;

    public mf0(nf0 nf0Var) {
        this.f35713a = nf0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        nf0 nf0Var = this.f35713a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                nf0Var.f36016y = (GoogleSignInAccount) w7.f9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                nf0Var.h(null);
            } catch (com.google.android.gms.common.api.f e) {
                FileLog.e(e);
            }
        }
    }
}
