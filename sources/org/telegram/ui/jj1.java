package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class jj1 implements OnFailureListener {
    public final int f34941a;
    public final ci.d f34942b;

    public jj1(ci.d dVar, int i10) {
        this.f34941a = i10;
        this.f34942b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f34941a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f34942b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f34942b.setLoading(false);
                return;
        }
    }
}
