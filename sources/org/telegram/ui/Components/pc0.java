package org.telegram.ui.Components;
public final class pc0 extends v7.l {
    public final int f29340a;
    public final Object f29341b;

    public pc0(Object obj, int i10) {
        this.f29340a = i10;
        this.f29341b = obj;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        switch (this.f29340a) {
            case 0:
                org.telegram.messenger.f8.b("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
                ((zc0) this.f29341b).o(true);
                return;
            default:
                org.telegram.messenger.f8.b("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
                xh.n nVar = (xh.n) this.f29341b;
                rh.s6 s6Var = nVar.f53917j;
                if (s6Var != null) {
                    nVar.f53917j = null;
                    s6Var.a(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f29340a) {
            case 0:
                org.telegram.messenger.f8.b("PasscodeView onAuthenticationFailed");
                ((zc0) this.f29341b).o(true);
                return;
            default:
                org.telegram.messenger.f8.b("BotBiometry onAuthenticationFailed");
                return;
        }
    }

    @Override
    public final void c(androidx.biometric.t tVar) {
        switch (this.f29340a) {
            case 0:
                org.telegram.messenger.f8.b("PasscodeView onAuthenticationSucceeded");
                ((zc0) this.f29341b).n(true);
                return;
            default:
                org.telegram.messenger.f8.b("BotBiometry onAuthenticationSucceeded");
                xh.n nVar = (xh.n) this.f29341b;
                rh.s6 s6Var = nVar.f53917j;
                if (s6Var != null) {
                    nVar.f53917j = null;
                    s6Var.a(Boolean.TRUE, tVar);
                    return;
                }
                return;
        }
    }
}
