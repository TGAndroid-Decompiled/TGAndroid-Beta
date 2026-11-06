package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
public final class z2 implements OnFailureListener {
    public final int f26781a;
    public final b3 f26782b;

    public z2(b3 b3Var, int i7) {
        this.f26781a = i7;
        this.f26782b = b3Var;
    }

    @Override
    public final void onFailure(Exception exc) {
        String upperCase;
        String upperCase2;
        switch (this.f26781a) {
            case 0:
                a8.e("CaptchaController: getTasksClient failure", exc);
                StringBuilder sb2 = new StringBuilder("RECAPTCHA_FAILED_GETCLIENT_EXCEPTION_");
                if (exc == null) {
                    upperCase = "NULL";
                } else if (exc.getMessage() == null) {
                    upperCase = "MSG_NULL";
                } else {
                    upperCase = exc.getMessage().replaceAll(" ", "_").toUpperCase();
                }
                sb2.append(upperCase);
                b3.a(this.f26782b, sb2.toString());
                return;
            default:
                a8.e("CaptchaController: executeTask failure", exc);
                StringBuilder sb3 = new StringBuilder("RECAPTCHA_FAILED_TASK_EXCEPTION_");
                if (exc == null) {
                    upperCase2 = "NULL";
                } else if (exc.getMessage() == null) {
                    upperCase2 = "MSG_NULL";
                } else {
                    upperCase2 = exc.getMessage().replaceAll(" ", "_").toUpperCase();
                }
                sb3.append(upperCase2);
                b3.a(this.f26782b, sb3.toString());
                return;
        }
    }
}
