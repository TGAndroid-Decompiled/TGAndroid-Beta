package org.telegram.ui;
public final class q80 implements Runnable {
    public final int f39779a;
    public final LanguageSelectActivity f39780b;

    public q80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f39779a = i10;
        this.f39780b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f39779a) {
            case 0:
                LanguageSelectActivity.Y(this.f39780b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f39780b);
                return;
            default:
                this.f39780b.f33443a.l();
                return;
        }
    }
}
