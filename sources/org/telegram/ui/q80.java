package org.telegram.ui;
public final class q80 implements Runnable {
    public final int f41087a;
    public final LanguageSelectActivity f41088b;

    public q80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f41087a = i10;
        this.f41088b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f41087a) {
            case 0:
                LanguageSelectActivity.Y(this.f41088b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f41088b);
                return;
            default:
                this.f41088b.f33808a.l();
                return;
        }
    }
}
