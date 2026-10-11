package org.telegram.ui;
public final class p80 implements Runnable {
    public final int f40818a;
    public final LanguageSelectActivity f40819b;

    public p80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f40818a = i10;
        this.f40819b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f40818a) {
            case 0:
                LanguageSelectActivity.Y(this.f40819b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f40819b);
                return;
            default:
                this.f40819b.f33832a.l();
                return;
        }
    }
}
