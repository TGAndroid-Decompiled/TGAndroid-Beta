package org.telegram.ui;
public final class g60 implements Runnable {
    public final int f47945a;
    public final LanguageSelectActivity f47946b;

    public g60(LanguageSelectActivity languageSelectActivity, int i7) {
        this.f47945a = i7;
        this.f47946b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f47945a) {
            case 0:
                LanguageSelectActivity.d0(this.f47946b);
                return;
            case 1:
                LanguageSelectActivity.b0(this.f47946b);
                return;
            default:
                this.f47946b.f43060a.f();
                return;
        }
    }
}
