package org.telegram.ui;
public final class l80 implements Runnable {
    public final int f35238a;
    public final LanguageSelectActivity f35239b;

    public l80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f35238a = i10;
        this.f35239b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f35238a) {
            case 0:
                LanguageSelectActivity.Y(this.f35239b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f35239b);
                return;
            default:
                this.f35239b.f31093a.l();
                return;
        }
    }
}
