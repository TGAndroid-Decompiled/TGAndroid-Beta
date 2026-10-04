package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class cj1 implements OnFailureListener {
    public final int f35492a;
    public final ci.d f35493b;

    public cj1(ci.d dVar, int i10) {
        this.f35492a = i10;
        this.f35493b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f35492a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f35493b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f35493b.setLoading(false);
                return;
        }
    }
}
