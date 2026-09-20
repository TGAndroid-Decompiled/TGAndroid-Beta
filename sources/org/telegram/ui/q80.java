package org.telegram.ui;
public final class q80 implements Runnable {
    public final int f36792a;
    public final LanguageSelectActivity f36793b;

    public q80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f36792a = i10;
        this.f36793b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f36792a) {
            case 0:
                LanguageSelectActivity.Y(this.f36793b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f36793b);
                return;
            default:
                this.f36793b.f31092a.l();
                return;
        }
    }
}
