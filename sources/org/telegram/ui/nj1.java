package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class nj1 implements OnFailureListener {
    public final int f40430a;
    public final ci.d f40431b;

    public nj1(ci.d dVar, int i10) {
        this.f40430a = i10;
        this.f40431b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f40430a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f40431b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f40431b.setLoading(false);
                return;
        }
    }
}
