package org.telegram.ui;
public final class c80 implements Runnable {
    public final int f38370a;
    public final LanguageSelectActivity f38371b;

    public c80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f38370a = i10;
        this.f38371b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f38370a) {
            case 0:
                LanguageSelectActivity.Z(this.f38371b);
                return;
            case 1:
                LanguageSelectActivity.X(this.f38371b);
                return;
            default:
                this.f38371b.f35517a.l();
                return;
        }
    }
}
