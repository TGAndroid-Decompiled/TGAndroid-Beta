package org.telegram.ui;
public final class g60 implements Runnable {
    public final int f47983a;
    public final LanguageSelectActivity f47984b;

    public g60(LanguageSelectActivity languageSelectActivity, int i7) {
        this.f47983a = i7;
        this.f47984b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f47983a) {
            case 0:
                LanguageSelectActivity.d0(this.f47984b);
                return;
            case 1:
                LanguageSelectActivity.b0(this.f47984b);
                return;
            default:
                this.f47984b.f43105a.f();
                return;
        }
    }
}
