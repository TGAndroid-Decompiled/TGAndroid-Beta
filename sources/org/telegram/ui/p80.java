package org.telegram.ui;
public final class p80 implements Runnable {
    public final int f39366a;
    public final LanguageSelectActivity f39367b;

    public p80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f39366a = i10;
        this.f39367b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f39366a) {
            case 0:
                LanguageSelectActivity.X(this.f39367b);
                return;
            case 1:
                LanguageSelectActivity.U(this.f39367b);
                return;
            default:
                this.f39367b.f33760a.l();
                return;
        }
    }
}
