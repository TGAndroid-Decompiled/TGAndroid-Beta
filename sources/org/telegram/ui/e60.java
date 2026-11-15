package org.telegram.ui;
public final class e60 implements Runnable {
    public final int f46571a;
    public final LanguageSelectActivity f46572b;

    public e60(LanguageSelectActivity languageSelectActivity, int i7) {
        this.f46571a = i7;
        this.f46572b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f46571a) {
            case 0:
                LanguageSelectActivity.d0(this.f46572b);
                return;
            case 1:
                LanguageSelectActivity.b0(this.f46572b);
                return;
            default:
                this.f46572b.f42615a.f();
                return;
        }
    }
}
