package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class je0 extends v7.l {
    public final re0 f25986a;

    public je0(re0 re0Var) {
        this.f25986a = re0Var;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.f25986a.n(true);
    }

    @Override
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.f25986a.n(true);
    }

    @Override
    public final void c(androidx.biometric.u uVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.f25986a.m(true);
    }
}
