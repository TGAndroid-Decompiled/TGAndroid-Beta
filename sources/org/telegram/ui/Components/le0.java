package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class le0 extends v7.l {
    public final te0 f28373a;

    public le0(te0 te0Var) {
        this.f28373a = te0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f28373a.n(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f28373a.n(true);
    }

    @Override
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f28373a.m(true);
    }
}
