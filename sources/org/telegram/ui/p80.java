package org.telegram.ui;
public final class p80 implements Runnable {
    public final int f40784a;
    public final LanguageSelectActivity f40785b;

    public p80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f40784a = i10;
        this.f40785b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f40784a) {
            case 0:
                LanguageSelectActivity.Y(this.f40785b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f40785b);
                return;
            default:
                this.f40785b.f33798a.l();
                return;
        }
    }
}
