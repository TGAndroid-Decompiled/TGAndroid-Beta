package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class jj1 implements OnFailureListener {
    public final int f34901a;
    public final ci.d f34902b;

    public jj1(ci.d dVar, int i10) {
        this.f34901a = i10;
        this.f34902b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f34901a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f34902b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f34902b.setLoading(false);
                return;
        }
    }
}
