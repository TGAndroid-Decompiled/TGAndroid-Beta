package org.telegram.ui;
public final class n80 implements Runnable {
    public final int f35451a;
    public final LanguageSelectActivity f35452b;

    public n80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f35451a = i10;
        this.f35452b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f35451a) {
            case 0:
                LanguageSelectActivity.Y(this.f35452b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f35452b);
                return;
            default:
                this.f35452b.f30779a.l();
                return;
        }
    }
}
