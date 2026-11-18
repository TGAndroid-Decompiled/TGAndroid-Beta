package org.telegram.ui;
public final class g60 implements Runnable {
    public final int f47909a;
    public final LanguageSelectActivity f47910b;

    public g60(LanguageSelectActivity languageSelectActivity, int i7) {
        this.f47909a = i7;
        this.f47910b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f47909a) {
            case 0:
                LanguageSelectActivity.d0(this.f47910b);
                return;
            case 1:
                LanguageSelectActivity.b0(this.f47910b);
                return;
            default:
                this.f47910b.f43060a.f();
                return;
        }
    }
}
