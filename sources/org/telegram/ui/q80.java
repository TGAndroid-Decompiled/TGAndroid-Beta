package org.telegram.ui;
public final class q80 implements Runnable {
    public final int f41041a;
    public final LanguageSelectActivity f41042b;

    public q80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f41041a = i10;
        this.f41042b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f41041a) {
            case 0:
                LanguageSelectActivity.Y(this.f41042b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f41042b);
                return;
            default:
                this.f41042b.f33770a.l();
                return;
        }
    }
}
