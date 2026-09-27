package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class hf0 implements NotificationCenter.NotificationCenterDelegate {
    public final if0 f34212a;

    public hf0(if0 if0Var) {
        this.f34212a = if0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if0 if0Var = this.f34212a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                if0Var.f34471y = (GoogleSignInAccount) w7.e9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                if0Var.h(null);
            } catch (com.google.android.gms.common.api.f e) {
                FileLog.e(e);
            }
        }
    }
}
