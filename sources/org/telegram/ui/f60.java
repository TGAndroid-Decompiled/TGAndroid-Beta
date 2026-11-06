package org.telegram.ui;
public final class f60 implements Runnable {
    public final int f45504a;
    public final LanguageSelectActivity f45505b;

    public f60(LanguageSelectActivity languageSelectActivity, int i7) {
        this.f45504a = i7;
        this.f45505b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f45504a) {
            case 0:
                LanguageSelectActivity.d0(this.f45505b);
                return;
            case 1:
                LanguageSelectActivity.b0(this.f45505b);
                return;
            default:
                this.f45505b.f41243a.f();
                return;
        }
    }
}
