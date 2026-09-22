package org.telegram.ui;
public final class q80 implements Runnable {
    public final int f36815a;
    public final LanguageSelectActivity f36816b;

    public q80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f36815a = i10;
        this.f36816b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f36815a) {
            case 0:
                LanguageSelectActivity.Y(this.f36816b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f36816b);
                return;
            default:
                this.f36816b.f31113a.l();
                return;
        }
    }
}
