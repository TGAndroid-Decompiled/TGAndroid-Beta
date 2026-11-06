package org.telegram.ui;
public final class f60 implements Runnable {
    public final int f45505a;
    public final LanguageSelectActivity f45506b;

    public f60(LanguageSelectActivity languageSelectActivity, int i7) {
        this.f45505a = i7;
        this.f45506b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f45505a) {
            case 0:
                LanguageSelectActivity.d0(this.f45506b);
                return;
            case 1:
                LanguageSelectActivity.b0(this.f45506b);
                return;
            default:
                this.f45506b.f41244a.f();
                return;
        }
    }
}
