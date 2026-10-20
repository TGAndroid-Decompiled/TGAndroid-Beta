package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class de0 extends v7.l {
    public final me0 f25461a;

    public de0(me0 me0Var) {
        this.f25461a = me0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f25461a.o(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f25461a.o(true);
    }

    @Override
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f25461a.n(true);
    }
}
