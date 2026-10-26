package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class gi1 implements OnFailureListener {
    public final int f39706a;
    public final fi.d f39707b;

    public gi1(fi.d dVar, int i10) {
        this.f39706a = i10;
        this.f39707b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f39706a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f39707b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f39707b.setLoading(false);
                return;
        }
    }
}
