package org.telegram.ui;
public final class g60 implements Runnable {
    public final int f47930a;
    public final LanguageSelectActivity f47931b;

    public g60(LanguageSelectActivity languageSelectActivity, int i7) {
        this.f47930a = i7;
        this.f47931b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f47930a) {
            case 0:
                LanguageSelectActivity.d0(this.f47931b);
                return;
            case 1:
                LanguageSelectActivity.b0(this.f47931b);
                return;
            default:
                this.f47931b.f43070a.f();
                return;
        }
    }
}
