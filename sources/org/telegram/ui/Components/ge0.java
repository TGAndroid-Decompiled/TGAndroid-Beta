package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class ge0 extends v7.l {
    public final pe0 f26600a;

    public ge0(pe0 pe0Var) {
        this.f26600a = pe0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f26600a.o(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f26600a.o(true);
    }

    @Override
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f26600a.n(true);
    }
}
