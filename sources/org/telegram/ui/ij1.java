package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class ij1 implements OnFailureListener {
    public final int f34542a;
    public final ci.d f34543b;

    public ij1(ci.d dVar, int i10) {
        this.f34542a = i10;
        this.f34543b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f34542a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f34543b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f34543b.setLoading(false);
                return;
        }
    }
}
