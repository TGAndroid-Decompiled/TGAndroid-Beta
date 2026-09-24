package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class cj1 implements OnFailureListener {
    public final int f32722a;
    public final ci.d f32723b;

    public cj1(ci.d dVar, int i10) {
        this.f32722a = i10;
        this.f32723b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f32722a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f32723b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f32723b.setLoading(false);
                return;
        }
    }
}
