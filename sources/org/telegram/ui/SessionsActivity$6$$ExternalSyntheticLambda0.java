package org.telegram.ui;

import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AlertsCreator;

public final class SessionsActivity$6$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final SessionsActivity.AnonymousClass6 f$0;

    public SessionsActivity$6$$ExternalSyntheticLambda0(SessionsActivity.AnonymousClass6 anonymousClass6, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass6;
    }

    @Override
    public final void run() {
        String string;
        switch (this.$r8$classId) {
            case 0:
                SessionsActivity.AnonymousClass6 anonymousClass6 = this.f$0;
                String str = anonymousClass6.error.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb = new StringBuilder();
                    zzlf.m(R.string.ErrorOccurred, "\n", sb);
                    sb.append(anonymousClass6.error.text);
                    string = sb.toString();
                } else {
                    string = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                }
                AlertsCreator.showSimpleAlert(SessionsActivity.this, LocaleController.getString(R.string.AuthAnotherClient), string, null);
                break;
            default:
                SessionsActivity.AnonymousClass6 anonymousClass7 = this.f$0;
                anonymousClass7.getClass();
                AlertsCreator.showSimpleAlert(SessionsActivity.this, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                break;
        }
    }
}
