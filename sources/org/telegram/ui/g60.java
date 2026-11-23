package org.telegram.ui;
public final class g60 implements Runnable {
    public final int f48116a;
    public final LanguageSelectActivity f48117b;

    public g60(LanguageSelectActivity languageSelectActivity, int i7) {
        this.f48116a = i7;
        this.f48117b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f48116a) {
            case 0:
                LanguageSelectActivity.d0(this.f48117b);
                return;
            case 1:
                LanguageSelectActivity.b0(this.f48117b);
                return;
            default:
                this.f48117b.f43180a.f();
                return;
        }
    }
}
