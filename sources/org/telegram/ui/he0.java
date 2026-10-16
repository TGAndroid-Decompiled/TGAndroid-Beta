package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class he0 implements NotificationCenter.NotificationCenterDelegate {
    public final je0 f36526a;

    public he0(je0 je0Var) {
        this.f36526a = je0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        je0 je0Var = this.f36526a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                je0Var.F = (GoogleSignInAccount) w7.b9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                je0Var.h(null);
            } catch (com.google.android.gms.common.api.f e) {
                FileLog.e(e);
            }
        }
    }
}
