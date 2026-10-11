package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class me0 extends v7.l {
    public final ue0 f28662a;

    public me0(ue0 ue0Var) {
        this.f28662a = ue0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f28662a.n(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f28662a.n(true);
    }

    @Override
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f28662a.m(true);
    }
}
