package org.telegram.ui;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.ui.ActionBar.AlertDialog;

public final class SecretVoicePlayer$$ExternalSyntheticLambda2 implements OnApplyWindowInsetsListener, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final SecretVoicePlayer f$0;

    public SecretVoicePlayer$$ExternalSyntheticLambda2(SecretVoicePlayer secretVoicePlayer, int i) {
        this.$r8$classId = i;
        this.f$0 = secretVoicePlayer;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f$0.lambda$new$1(view, windowInsetsCompat);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.lambda$onBackPressed$4(alertDialog, i);
                break;
            default:
                this.f$0.lambda$onBackPressed$5(alertDialog, i);
                break;
        }
    }
}
