package org.telegram.ui;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog;

public final class SecretVoicePlayer$$ExternalSyntheticLambda3 implements OnApplyWindowInsetsListener, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final SecretVoicePlayer f$0;

    public SecretVoicePlayer$$ExternalSyntheticLambda3(SecretVoicePlayer secretVoicePlayer, int i) {
        this.$r8$classId = i;
        this.f$0 = secretVoicePlayer;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        SecretVoicePlayer secretVoicePlayer = this.f$0;
        secretVoicePlayer.getClass();
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        secretVoicePlayer.insets = defaultWindowInsets;
        secretVoicePlayer.containerView.setPadding(defaultWindowInsets.left, defaultWindowInsets.top, defaultWindowInsets.right, defaultWindowInsets.bottom);
        secretVoicePlayer.windowView.requestLayout();
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                AlertDialog alertDialog2 = this.f$0.backDialog;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                break;
            default:
                SecretVoicePlayer secretVoicePlayer = this.f$0;
                AlertDialog alertDialog3 = secretVoicePlayer.backDialog;
                if (alertDialog3 != null) {
                    alertDialog3.dismiss();
                    secretVoicePlayer.backDialog = null;
                }
                secretVoicePlayer.dismiss();
                break;
        }
    }
}
