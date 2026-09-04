package org.telegram.ui;
public final class q80 implements Runnable {
    public final int f39752a;
    public final LanguageSelectActivity f39753b;

    public q80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f39752a = i10;
        this.f39753b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f39752a) {
            case 0:
                LanguageSelectActivity.Y(this.f39753b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f39753b);
                return;
            default:
                this.f39753b.f33416a.l();
                return;
        }
    }
}
