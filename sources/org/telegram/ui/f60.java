package org.telegram.ui;
public final class f60 implements Runnable {
    public final int f45500a;
    public final LanguageSelectActivity f45501b;

    public f60(LanguageSelectActivity languageSelectActivity, int i7) {
        this.f45500a = i7;
        this.f45501b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f45500a) {
            case 0:
                LanguageSelectActivity.d0(this.f45501b);
                return;
            case 1:
                LanguageSelectActivity.b0(this.f45501b);
                return;
            default:
                this.f45501b.f41219a.f();
                return;
        }
    }
}
