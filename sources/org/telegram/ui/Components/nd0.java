package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class nd0 extends ee.b {
    public final xd0 f29459a;

    public nd0(xd0 xd0Var) {
        this.f29459a = xd0Var;
    }

    @Override
    public final void b(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f29459a.m(true);
    }

    @Override
    public final void c() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f29459a.m(true);
    }

    @Override
    public final void d(androidx.biometric.v vVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f29459a.k(true);
    }
}
