package org.telegram.ui;
public final class i80 implements Runnable {
    public final int f37772a;
    public final LanguageSelectActivity f37773b;

    public i80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f37772a = i10;
        this.f37773b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f37772a) {
            case 0:
                LanguageSelectActivity.Y(this.f37773b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f37773b);
                return;
            default:
                this.f37773b.f34127a.l();
                return;
        }
    }
}
