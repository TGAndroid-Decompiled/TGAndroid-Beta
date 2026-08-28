package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class qc0 extends f7.n {
    public final yc0 f31883a;

    public qc0(yc0 yc0Var) {
        this.f31883a = yc0Var;
    }

    @Override
    public final void a(int i9, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i9 + " \"" + ((Object) charSequence) + "\"");
        this.f31883a.m(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f31883a.m(true);
    }

    @Override
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f31883a.k(true);
    }
}
