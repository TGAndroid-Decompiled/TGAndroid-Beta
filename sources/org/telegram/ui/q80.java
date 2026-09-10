package org.telegram.ui;
public final class q80 implements Runnable {
    public final int f35990a;
    public final LanguageSelectActivity f35991b;

    public q80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f35990a = i10;
        this.f35991b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f35990a) {
            case 0:
                LanguageSelectActivity.Y(this.f35991b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f35991b);
                return;
            default:
                this.f35991b.f29921a.l();
                return;
        }
    }
}
