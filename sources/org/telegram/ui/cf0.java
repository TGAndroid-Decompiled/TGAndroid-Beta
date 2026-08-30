package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class cf0 implements NotificationCenter.NotificationCenterDelegate {
    public final df0 f33362a;

    public cf0(df0 df0Var) {
        this.f33362a = df0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        df0 df0Var = this.f33362a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                df0Var.f33629y = (GoogleSignInAccount) k7.y.b(intent).getResult(com.google.android.gms.common.api.f.class);
                df0Var.h(null);
            } catch (com.google.android.gms.common.api.f e) {
                FileLog.e(e);
            }
        }
    }
}
