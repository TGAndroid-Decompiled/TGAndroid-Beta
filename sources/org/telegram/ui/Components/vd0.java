package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class vd0 extends v7.n {
    public final de0 f29059a;

    public vd0(de0 de0Var) {
        this.f29059a = de0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f29059a.m(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f29059a.m(true);
    }

    @Override
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f29059a.k(true);
    }
}
