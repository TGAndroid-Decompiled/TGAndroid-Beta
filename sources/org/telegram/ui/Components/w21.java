package org.telegram.ui.Components;
public final class w21 implements org.telegram.messenger.qc, org.telegram.messenger.pc {
    public final String f31973a;
    public final String f31974b;
    public final org.telegram.messenger.j20 f31975c;

    public w21(String str, String str2, org.telegram.messenger.j20 j20Var) {
        this.f31973a = str;
        this.f31974b = str2;
        this.f31975c = j20Var;
    }

    @Override
    public void a(String str) {
        m31.J0(this.f31973a, str, this.f31974b, this.f31975c);
    }

    @Override
    public void q(Exception exc) {
        m31.J0(this.f31973a, "en", this.f31974b, this.f31975c);
    }
}
