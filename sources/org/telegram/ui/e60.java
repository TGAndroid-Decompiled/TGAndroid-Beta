package org.telegram.ui;
public final class e60 implements Runnable {
    public final int f46581a;
    public final LanguageSelectActivity f46582b;

    public e60(LanguageSelectActivity languageSelectActivity, int i7) {
        this.f46581a = i7;
        this.f46582b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f46581a) {
            case 0:
                LanguageSelectActivity.d0(this.f46582b);
                return;
            case 1:
                LanguageSelectActivity.b0(this.f46582b);
                return;
            default:
                this.f46582b.f42615a.f();
                return;
        }
    }
}
