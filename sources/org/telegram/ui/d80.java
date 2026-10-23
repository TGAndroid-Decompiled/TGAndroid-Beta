package org.telegram.ui;
public final class d80 implements Runnable {
    public final int f36532a;
    public final LanguageSelectActivity f36533b;

    public d80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f36532a = i10;
        this.f36533b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f36532a) {
            case 0:
                LanguageSelectActivity.Y(this.f36533b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f36533b);
                return;
            default:
                this.f36533b.f33451a.l();
                return;
        }
    }
}
