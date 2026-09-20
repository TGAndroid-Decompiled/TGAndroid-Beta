package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class ge0 implements NotificationCenter.NotificationCenterDelegate {
    public final ie0 f33874a;

    public ge0(ie0 ie0Var) {
        this.f33874a = ie0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ie0 ie0Var = this.f33874a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                ie0Var.F = (GoogleSignInAccount) w7.f9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                ie0Var.h(null);
            } catch (com.google.android.gms.common.api.f e) {
                FileLog.e(e);
            }
        }
    }
}
