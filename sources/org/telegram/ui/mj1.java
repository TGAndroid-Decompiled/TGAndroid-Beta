package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class mj1 implements OnFailureListener {
    public final int f39935a;
    public final ci.d f39936b;

    public mj1(ci.d dVar, int i10) {
        this.f39935a = i10;
        this.f39936b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f39935a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f39936b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f39936b.setLoading(false);
                return;
        }
    }
}
