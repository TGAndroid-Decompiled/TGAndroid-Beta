package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class ee0 extends v7.l {
    public final ne0 f26026a;

    public ee0(ne0 ne0Var) {
        this.f26026a = ne0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f26026a.o(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f26026a.o(true);
    }

    @Override
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f26026a.n(true);
    }
}
