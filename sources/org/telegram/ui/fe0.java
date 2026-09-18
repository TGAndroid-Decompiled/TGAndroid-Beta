package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class fe0 implements NotificationCenter.NotificationCenterDelegate {
    public final he0 f33521a;

    public fe0(he0 he0Var) {
        this.f33521a = he0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        he0 he0Var = this.f33521a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                he0Var.F = (GoogleSignInAccount) w7.e9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                he0Var.h(null);
            } catch (com.google.android.gms.common.api.f e) {
                FileLog.e(e);
            }
        }
    }
}
