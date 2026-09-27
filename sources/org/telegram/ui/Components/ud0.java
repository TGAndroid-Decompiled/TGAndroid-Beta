package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class ud0 extends v7.o {
    public final ce0 f28865a;

    public ud0(ce0 ce0Var) {
        this.f28865a = ce0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f28865a.m(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f28865a.m(true);
    }

    @Override
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f28865a.k(true);
    }
}
