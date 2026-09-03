package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class md0 extends com.google.android.gms.internal.play_billing.s1 {
    public final wd0 f27017a;

    public md0(wd0 wd0Var) {
        this.f27017a = wd0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f27017a.m(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f27017a.m(true);
    }

    @Override
    public final void c(androidx.biometric.u uVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f27017a.k(true);
    }
}
