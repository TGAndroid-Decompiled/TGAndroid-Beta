package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class wd0 extends v7.p {
    public final ee0 f29898a;

    public wd0(ee0 ee0Var) {
        this.f29898a = ee0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f29898a.m(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f29898a.m(true);
    }

    @Override
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f29898a.k(true);
    }
}
