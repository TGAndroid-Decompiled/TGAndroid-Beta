package org.telegram.ui;
public final class p80 implements Runnable {
    public final int f39372a;
    public final LanguageSelectActivity f39373b;

    public p80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f39372a = i10;
        this.f39373b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f39372a) {
            case 0:
                LanguageSelectActivity.X(this.f39373b);
                return;
            case 1:
                LanguageSelectActivity.U(this.f39373b);
                return;
            default:
                this.f39373b.f33767a.l();
                return;
        }
    }
}
