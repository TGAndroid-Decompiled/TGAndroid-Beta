package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class td0 extends v7.n {
    public final be0 f27394a;

    public td0(be0 be0Var) {
        this.f27394a = be0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f27394a.m(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f27394a.m(true);
    }

    @Override
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f27394a.k(true);
    }
}
