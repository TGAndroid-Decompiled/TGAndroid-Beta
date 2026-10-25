package org.telegram.ui;
public final class c80 implements Runnable {
    public final int f38367a;
    public final LanguageSelectActivity f38368b;

    public c80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f38367a = i10;
        this.f38368b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f38367a) {
            case 0:
                LanguageSelectActivity.Z(this.f38368b);
                return;
            case 1:
                LanguageSelectActivity.X(this.f38368b);
                return;
            default:
                this.f38368b.f35514a.l();
                return;
        }
    }
}
