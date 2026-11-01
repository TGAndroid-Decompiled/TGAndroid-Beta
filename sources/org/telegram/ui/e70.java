package org.telegram.ui;
public final class e70 implements Runnable {
    public final int f36762a;
    public final LanguageSelectActivity f36763b;

    public e70(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f36762a = i10;
        this.f36763b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f36762a) {
            case 0:
                LanguageSelectActivity.d0(this.f36763b);
                return;
            case 1:
                LanguageSelectActivity.b0(this.f36763b);
                return;
            default:
                this.f36763b.f33348a.f();
                return;
        }
    }
}
