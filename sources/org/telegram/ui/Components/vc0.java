package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

public final class vc0 extends e7.t {

    public final dd0 f33371b;

    public vc0(dd0 dd0Var) {
        this.f33371b = dd0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f33371b.m(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f33371b.m(true);
    }

    @Override
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f33371b.k(true);
    }
}
