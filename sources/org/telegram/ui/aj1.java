package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class aj1 implements OnFailureListener {
    public final int f32085a;
    public final ci.d f32086b;

    public aj1(ci.d dVar, int i10) {
        this.f32085a = i10;
        this.f32086b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f32085a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f32086b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f32086b.setLoading(false);
                return;
        }
    }
}
