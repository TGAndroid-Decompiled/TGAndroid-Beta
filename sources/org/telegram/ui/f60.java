package org.telegram.ui;
public final class f60 implements Runnable {
    public final int f45463a;
    public final LanguageSelectActivity f45464b;

    public f60(LanguageSelectActivity languageSelectActivity, int i7) {
        this.f45463a = i7;
        this.f45464b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f45463a) {
            case 0:
                LanguageSelectActivity.d0(this.f45464b);
                return;
            case 1:
                LanguageSelectActivity.b0(this.f45464b);
                return;
            default:
                this.f45464b.f41247a.f();
                return;
        }
    }
}
