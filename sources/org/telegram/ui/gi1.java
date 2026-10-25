package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class gi1 implements OnFailureListener {
    public final int f39703a;
    public final fi.d f39704b;

    public gi1(fi.d dVar, int i10) {
        this.f39703a = i10;
        this.f39704b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f39703a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f39704b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f39704b.setLoading(false);
                return;
        }
    }
}
