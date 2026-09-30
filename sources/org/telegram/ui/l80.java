package org.telegram.ui;
public final class l80 implements Runnable {
    public final int f35222a;
    public final LanguageSelectActivity f35223b;

    public l80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f35222a = i10;
        this.f35223b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f35222a) {
            case 0:
                LanguageSelectActivity.Y(this.f35223b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f35223b);
                return;
            default:
                this.f35223b.f31096a.l();
                return;
        }
    }
}
