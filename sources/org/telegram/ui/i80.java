package org.telegram.ui;
public final class i80 implements Runnable {
    public final int f37572a;
    public final LanguageSelectActivity f37573b;

    public i80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f37572a = i10;
        this.f37573b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f37572a) {
            case 0:
                LanguageSelectActivity.Y(this.f37573b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f37573b);
                return;
            default:
                this.f37573b.f34127a.l();
                return;
        }
    }
}
