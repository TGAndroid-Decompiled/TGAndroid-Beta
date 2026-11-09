package org.telegram.ui;
public final class h60 implements Runnable {
    public final int f46172a;
    public final LanguageSelectActivity f46173b;

    public h60(LanguageSelectActivity languageSelectActivity, int i7) {
        this.f46172a = i7;
        this.f46173b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f46172a) {
            case 0:
                LanguageSelectActivity.d0(this.f46173b);
                return;
            case 1:
                LanguageSelectActivity.b0(this.f46173b);
                return;
            default:
                this.f46173b.f41254a.f();
                return;
        }
    }
}
