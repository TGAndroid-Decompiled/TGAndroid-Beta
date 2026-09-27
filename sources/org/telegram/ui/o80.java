package org.telegram.ui;
public final class o80 implements Runnable {
    public final int f36155a;
    public final LanguageSelectActivity f36156b;

    public o80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f36155a = i10;
        this.f36156b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f36155a) {
            case 0:
                LanguageSelectActivity.Y(this.f36156b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f36156b);
                return;
            default:
                this.f36156b.f31096a.l();
                return;
        }
    }
}
