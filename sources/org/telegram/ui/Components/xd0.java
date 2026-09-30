package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class xd0 extends v7.p {
    public final fe0 f30234a;

    public xd0(fe0 fe0Var) {
        this.f30234a = fe0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f30234a.m(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f30234a.m(true);
    }

    @Override
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f30234a.k(true);
    }
}
