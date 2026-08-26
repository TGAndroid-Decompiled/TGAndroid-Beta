package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.OutlineTextContainerView;

public final class DialogsActivity$$ExternalSyntheticLambda37 implements View.OnFocusChangeListener {
    public final int $r8$classId;
    public final Object f$0;

    public DialogsActivity$$ExternalSyntheticLambda37(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                ((DialogsActivity) this.f$0).lambda$createView$10(view, z);
                break;
            case 1:
                ((ChannelMonetizationLayout) this.f$0).lambda$new$7(view, z);
                break;
            case 2:
                ((LoginActivity.LoginActivityEmailCodeView) this.f$0).lambda$setParams$14(view, z);
                break;
            case 3:
                LoginActivity.LoginActivityNewPasswordView.lambda$new$0((OutlineTextContainerView) this.f$0, view, z);
                break;
            case 4:
                ((LoginActivity.LoginActivityPasswordView) this.f$0).lambda$new$0(view, z);
                break;
            case 5:
                ((LoginActivity.LoginActivityPhraseView) this.f$0).lambda$new$0(view, z);
                break;
            case 6:
                ((LoginActivity.LoginActivityRecoverView) this.f$0).lambda$new$1(view, z);
                break;
            case 7:
                ((LoginActivity.LoginActivitySetupEmail) this.f$0).lambda$new$0(view, z);
                break;
            case 8:
                ((LoginActivity.LoginActivitySmsView) this.f$0).lambda$setParams$21(view, z);
                break;
            case 9:
                ((LoginActivity.PhoneView) this.f$0).lambda$new$3(view, z);
                break;
            case 10:
                ((PasscodeActivity) this.f$0).lambda$createView$8(view, z);
                break;
            case 11:
                ((ThemeSetUrlActivity) this.f$0).lambda$createView$3(view, z);
                break;
            default:
                ((TwoStepVerificationActivity) this.f$0).lambda$createView$1(view, z);
                break;
        }
    }
}
