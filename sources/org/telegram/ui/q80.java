package org.telegram.ui;
public final class q80 implements Runnable {
    public final int f36800a;
    public final LanguageSelectActivity f36801b;

    public q80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f36800a = i10;
        this.f36801b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f36800a) {
            case 0:
                LanguageSelectActivity.Y(this.f36801b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f36801b);
                return;
            default:
                this.f36801b.f30808a.l();
                return;
        }
    }
}
