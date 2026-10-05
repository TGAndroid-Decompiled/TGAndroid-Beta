package org.telegram.ui;
public final class p80 implements Runnable {
    public final int f39386a;
    public final LanguageSelectActivity f39387b;

    public p80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f39386a = i10;
        this.f39387b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f39386a) {
            case 0:
                LanguageSelectActivity.X(this.f39387b);
                return;
            case 1:
                LanguageSelectActivity.U(this.f39387b);
                return;
            default:
                this.f39387b.f33780a.l();
                return;
        }
    }
}
