package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class ce0 extends a8.a1 {
    public final le0 f27135a;

    public ce0(le0 le0Var) {
        this.f27135a = le0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f27135a.o(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f27135a.o(true);
    }

    @Override
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f27135a.n(true);
    }
}
