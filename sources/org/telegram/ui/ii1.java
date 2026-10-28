package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class ii1 implements OnFailureListener {
    public final int f40196a;
    public final fi.d f40197b;

    public ii1(fi.d dVar, int i10) {
        this.f40196a = i10;
        this.f40197b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f40196a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f40197b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f40197b.setLoading(false);
                return;
        }
    }
}
