package org.telegram.ui;
public final class p80 implements Runnable {
    public final int f39367a;
    public final LanguageSelectActivity f39368b;

    public p80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f39367a = i10;
        this.f39368b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f39367a) {
            case 0:
                LanguageSelectActivity.X(this.f39368b);
                return;
            case 1:
                LanguageSelectActivity.U(this.f39368b);
                return;
            default:
                this.f39368b.f33761a.l();
                return;
        }
    }
}
