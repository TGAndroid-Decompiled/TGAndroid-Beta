package org.telegram.ui;
public final class l80 implements Runnable {
    public final int f35207a;
    public final LanguageSelectActivity f35208b;

    public l80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f35207a = i10;
        this.f35208b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f35207a) {
            case 0:
                LanguageSelectActivity.Y(this.f35208b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f35208b);
                return;
            default:
                this.f35208b.f31080a.l();
                return;
        }
    }
}
