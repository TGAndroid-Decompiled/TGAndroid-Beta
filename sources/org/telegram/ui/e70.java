package org.telegram.ui;
public final class e70 implements Runnable {
    public final int f36968a;
    public final LanguageSelectActivity f36969b;

    public e70(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f36968a = i10;
        this.f36969b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f36968a) {
            case 0:
                LanguageSelectActivity.c0(this.f36969b);
                return;
            case 1:
                LanguageSelectActivity.a0(this.f36969b);
                return;
            default:
                this.f36969b.f33341a.f();
                return;
        }
    }
}
