package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class kj1 implements OnFailureListener {
    public final int f35172a;
    public final ci.d f35173b;

    public kj1(ci.d dVar, int i10) {
        this.f35172a = i10;
        this.f35173b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f35172a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f35173b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f35173b.setLoading(false);
                return;
        }
    }
}
