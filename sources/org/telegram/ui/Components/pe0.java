package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class pe0 extends v7.l {
    public final xe0 f29490a;

    public pe0(xe0 xe0Var) {
        this.f29490a = xe0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f29490a.n(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f29490a.n(true);
    }

    @Override
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f29490a.m(true);
    }
}
