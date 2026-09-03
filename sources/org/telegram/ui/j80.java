package org.telegram.ui;
public final class j80 implements Runnable {
    public final int f35116a;
    public final LanguageSelectActivity f35117b;

    public j80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f35116a = i10;
        this.f35117b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f35116a) {
            case 0:
                LanguageSelectActivity.Y(this.f35117b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f35117b);
                return;
            default:
                this.f35117b.f31580a.l();
                return;
        }
    }
}
