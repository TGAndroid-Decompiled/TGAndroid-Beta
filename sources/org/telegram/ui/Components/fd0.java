package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class fd0 extends h7.v {
    public final nd0 f28385a;

    public fd0(nd0 nd0Var) {
        this.f28385a = nd0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f28385a.m(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f28385a.m(true);
    }

    @Override
    public final void c(androidx.biometric.u uVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f28385a.k(true);
    }
}
