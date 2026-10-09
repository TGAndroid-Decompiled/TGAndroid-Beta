package org.telegram.ui;
public final class q80 implements Runnable {
    public final int f41043a;
    public final LanguageSelectActivity f41044b;

    public q80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f41043a = i10;
        this.f41044b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f41043a) {
            case 0:
                LanguageSelectActivity.Y(this.f41044b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f41044b);
                return;
            default:
                this.f41044b.f33770a.l();
                return;
        }
    }
}
