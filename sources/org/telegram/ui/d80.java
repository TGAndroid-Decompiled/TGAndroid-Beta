package org.telegram.ui;
public final class d80 implements Runnable {
    public final int f36499a;
    public final LanguageSelectActivity f36500b;

    public d80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f36499a = i10;
        this.f36500b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f36499a) {
            case 0:
                LanguageSelectActivity.Y(this.f36500b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f36500b);
                return;
            default:
                this.f36500b.f33453a.l();
                return;
        }
    }
}
