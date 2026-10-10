package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class mj1 implements OnFailureListener {
    public final int f39979a;
    public final ci.d f39980b;

    public mj1(ci.d dVar, int i10) {
        this.f39979a = i10;
        this.f39980b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f39979a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f39980b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f39980b.setLoading(false);
                return;
        }
    }
}
