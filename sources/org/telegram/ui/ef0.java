package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class ef0 implements NotificationCenter.NotificationCenterDelegate {
    public final ff0 f33801a;

    public ef0(ff0 ff0Var) {
        this.f33801a = ff0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ff0 ff0Var = this.f33801a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                ff0Var.f34073y = (GoogleSignInAccount) k7.y.b(intent).getResult(com.google.android.gms.common.api.f.class);
                ff0Var.h(null);
            } catch (com.google.android.gms.common.api.f e) {
                FileLog.e(e);
            }
        }
    }
}
