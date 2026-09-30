package org.telegram.ui;
public final class l80 implements Runnable {
    public final int f35330a;
    public final LanguageSelectActivity f35331b;

    public l80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f35330a = i10;
        this.f35331b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f35330a) {
            case 0:
                LanguageSelectActivity.Y(this.f35331b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f35331b);
                return;
            default:
                this.f35331b.f31168a.l();
                return;
        }
    }
}
