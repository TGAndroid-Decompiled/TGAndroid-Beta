package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class vd0 extends v7.p {
    public final de0 f29065a;

    public vd0(de0 de0Var) {
        this.f29065a = de0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f29065a.m(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f29065a.m(true);
    }

    @Override
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f29065a.k(true);
    }
}
