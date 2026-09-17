package org.telegram.ui;
public final class q80 implements Runnable {
    public final int f39753a;
    public final LanguageSelectActivity f39754b;

    public q80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f39753a = i10;
        this.f39754b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f39753a) {
            case 0:
                LanguageSelectActivity.Y(this.f39754b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f39754b);
                return;
            default:
                this.f39754b.f33417a.l();
                return;
        }
    }
}
