package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class sd0 extends v7.n {
    public final ae0 f28097a;

    public sd0(ae0 ae0Var) {
        this.f28097a = ae0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f28097a.m(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f28097a.m(true);
    }

    @Override
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f28097a.k(true);
    }
}
