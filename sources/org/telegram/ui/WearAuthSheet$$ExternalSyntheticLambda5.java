package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class WearAuthSheet$$ExternalSyntheticLambda5 implements OnFailureListener {
    public final int $r8$classId;
    public final ButtonWithCounterView f$0;

    public WearAuthSheet$$ExternalSyntheticLambda5(ButtonWithCounterView buttonWithCounterView, int i) {
        this.$r8$classId = i;
        this.f$0 = buttonWithCounterView;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.$r8$classId) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f$0.setLoading(false);
                break;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f$0.setLoading(false);
                break;
        }
    }
}
