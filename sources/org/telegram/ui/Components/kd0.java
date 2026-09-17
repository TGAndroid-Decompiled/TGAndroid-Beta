package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class kd0 extends v7.n {
    public final sd0 f27835a;

    public kd0(sd0 sd0Var) {
        this.f27835a = sd0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f27835a.m(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f27835a.m(true);
    }

    @Override
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f27835a.k(true);
    }
}
