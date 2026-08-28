package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class ci1 implements OnFailureListener {
    public final int f37220a;
    public final kh.d f37221b;

    public ci1(kh.d dVar, int i9) {
        this.f37220a = i9;
        this.f37221b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f37220a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f37221b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f37221b.setLoading(false);
                return;
        }
    }
}
