package org.telegram.ui;
public final class q80 implements Runnable {
    public final int f36723a;
    public final LanguageSelectActivity f36724b;

    public q80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f36723a = i10;
        this.f36724b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f36723a) {
            case 0:
                LanguageSelectActivity.Y(this.f36724b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f36724b);
                return;
            default:
                this.f36724b.f31052a.l();
                return;
        }
    }
}
