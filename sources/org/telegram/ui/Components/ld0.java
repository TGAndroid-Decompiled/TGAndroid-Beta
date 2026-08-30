package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class ld0 extends com.google.android.gms.internal.play_billing.s1 {
    public final vd0 f26621a;

    public ld0(vd0 vd0Var) {
        this.f26621a = vd0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f26621a.m(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f26621a.m(true);
    }

    @Override
    public final void c(androidx.biometric.v vVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f26621a.k(true);
    }
}
