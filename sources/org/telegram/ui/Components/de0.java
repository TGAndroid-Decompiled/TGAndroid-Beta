package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class de0 extends v7.l {
    public final le0 f25551a;

    public de0(le0 le0Var) {
        this.f25551a = le0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f25551a.n(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f25551a.n(true);
    }

    @Override
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f25551a.m(true);
    }
}
