package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class de0 extends a8.a1 {
    public final me0 f27427a;

    public de0(me0 me0Var) {
        this.f27427a = me0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f27427a.o(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f27427a.o(true);
    }

    @Override
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f27427a.n(true);
    }
}
