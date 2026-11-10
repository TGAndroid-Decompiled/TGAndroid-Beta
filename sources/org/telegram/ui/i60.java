package org.telegram.ui;
public final class i60 implements Runnable {
    public final int f46512a;
    public final LanguageSelectActivity f46513b;

    public i60(LanguageSelectActivity languageSelectActivity, int i7) {
        this.f46512a = i7;
        this.f46513b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f46512a) {
            case 0:
                LanguageSelectActivity.d0(this.f46513b);
                return;
            case 1:
                LanguageSelectActivity.b0(this.f46513b);
                return;
            default:
                this.f46513b.f41245a.f();
                return;
        }
    }
}
