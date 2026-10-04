package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class wd0 extends v7.o {
    public final ee0 f32524a;

    public wd0(ee0 ee0Var) {
        this.f32524a = ee0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f32524a.m(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f32524a.m(true);
    }

    @Override
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f32524a.k(true);
    }
}
