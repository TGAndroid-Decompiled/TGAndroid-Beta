package org.telegram.ui;
public final class q80 implements Runnable {
    public final int f39780a;
    public final LanguageSelectActivity f39781b;

    public q80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f39780a = i10;
        this.f39781b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f39780a) {
            case 0:
                LanguageSelectActivity.Y(this.f39781b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f39781b);
                return;
            default:
                this.f39781b.f33444a.l();
                return;
        }
    }
}
