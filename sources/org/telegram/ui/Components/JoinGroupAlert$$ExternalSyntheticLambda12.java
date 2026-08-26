package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;

public final class JoinGroupAlert$$ExternalSyntheticLambda12 implements View.OnClickListener {
    public final int $r8$classId = 0;
    public final KeyEvent.Callback f$0;
    public final long f$1;
    public final int f$2;

    public JoinGroupAlert$$ExternalSyntheticLambda12(JoinGroupAlert joinGroupAlert, long j, int i) {
        this.f$0 = joinGroupAlert;
        this.f$1 = j;
        this.f$2 = i;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((JoinGroupAlert) this.f$0).lambda$new$12(this.f$1, this.f$2, view);
                break;
            default:
                ((TranslateButton) this.f$0).lambda$new$1(this.f$2, this.f$1, view);
                break;
        }
    }

    public JoinGroupAlert$$ExternalSyntheticLambda12(TranslateButton translateButton, int i, long j) {
        this.f$0 = translateButton;
        this.f$2 = i;
        this.f$1 = j;
    }
}
