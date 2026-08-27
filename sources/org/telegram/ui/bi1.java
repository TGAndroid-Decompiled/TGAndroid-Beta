package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;

public final class bi1 implements OnFailureListener {

    public final int f36839a;

    public final lh.d f36840b;

    public bi1(lh.d dVar, int i10) {
        this.f36839a = i10;
        this.f36840b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f36839a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f36840b.setLoading(false);
                break;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f36840b.setLoading(false);
                break;
        }
    }
}
