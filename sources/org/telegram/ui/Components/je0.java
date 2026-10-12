package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class je0 extends v7.l {
    public final re0 f26345a;

    public je0(re0 re0Var) {
        this.f26345a = re0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f26345a.n(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f26345a.n(true);
    }

    @Override
    public final void c(androidx.biometric.u uVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f26345a.m(true);
    }
}
