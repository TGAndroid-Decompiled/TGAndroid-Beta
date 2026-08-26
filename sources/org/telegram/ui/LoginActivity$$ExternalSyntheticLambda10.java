package org.telegram.ui;

import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.SizeNotifierFrameLayout;

public final class LoginActivity$$ExternalSyntheticLambda10 implements SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate {
    public final int $r8$classId;
    public final BaseFragment f$0;

    public LoginActivity$$ExternalSyntheticLambda10(BaseFragment baseFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
    }

    @Override
    public final void onSizeChanged(int i, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                ((LoginActivity) this.f$0).lambda$createView$0(i, z);
                break;
            default:
                ((PasscodeActivity) this.f$0).lambda$createView$1(i, z);
                break;
        }
    }
}
