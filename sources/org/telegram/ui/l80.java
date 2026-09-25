package org.telegram.ui;
public final class l80 implements Runnable {
    public final int f35240a;
    public final LanguageSelectActivity f35241b;

    public l80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f35240a = i10;
        this.f35241b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f35240a) {
            case 0:
                LanguageSelectActivity.Y(this.f35241b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f35241b);
                return;
            default:
                this.f35241b.f31095a.l();
                return;
        }
    }
}
