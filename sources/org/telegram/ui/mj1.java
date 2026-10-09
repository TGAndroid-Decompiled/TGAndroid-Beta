package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class mj1 implements OnFailureListener {
    public final int f39933a;
    public final ci.d f39934b;

    public mj1(ci.d dVar, int i10) {
        this.f39933a = i10;
        this.f39934b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f39933a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f39934b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f39934b.setLoading(false);
                return;
        }
    }
}
