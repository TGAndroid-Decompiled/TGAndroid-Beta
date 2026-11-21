package org.telegram.ui;
public final class g60 implements Runnable {
    public final int f47979a;
    public final LanguageSelectActivity f47980b;

    public g60(LanguageSelectActivity languageSelectActivity, int i7) {
        this.f47979a = i7;
        this.f47980b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f47979a) {
            case 0:
                LanguageSelectActivity.d0(this.f47980b);
                return;
            case 1:
                LanguageSelectActivity.b0(this.f47980b);
                return;
            default:
                this.f47980b.f43101a.f();
                return;
        }
    }
}
