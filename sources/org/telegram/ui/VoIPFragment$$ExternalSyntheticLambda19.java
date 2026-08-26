package org.telegram.ui;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.voip.VoIPFloatingLayout;
import org.telegram.ui.Components.voip.VoIpSwitchLayout;

public final class VoIPFragment$$ExternalSyntheticLambda19 implements AlertDialog.OnButtonClickListener, VoIpSwitchLayout.VoIpButtonView.OnBtnClickedListener, OnApplyWindowInsetsListener, VoIPFloatingLayout.VoIPFloatingLayoutDelegate {
    public final int $r8$classId;
    public final VoIPFragment f$0;

    public VoIPFragment$$ExternalSyntheticLambda19(VoIPFragment voIPFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPFragment;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return VoIPFragment.lambda$show$3(this.f$0, view, windowInsetsCompat);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.lambda$requestInlinePermissions$43(alertDialog, i);
                break;
            default:
                this.f$0.lambda$updateViewState$28(alertDialog, i);
                break;
        }
    }

    @Override
    public void onClicked(VoIpSwitchLayout.VoIpButtonView voIpButtonView) {
        switch (this.$r8$classId) {
            case 2:
                this.f$0.lambda$setMicrohoneAction$36(voIpButtonView);
                break;
            default:
                this.f$0.lambda$setVideoAction$37(voIpButtonView);
                break;
        }
    }
}
