package org.telegram.ui;
public final class e80 implements Runnable {
    public final int f38778a;
    public final LanguageSelectActivity f38779b;

    public e80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f38778a = i10;
        this.f38779b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f38778a) {
            case 0:
                LanguageSelectActivity.Z(this.f38779b);
                return;
            case 1:
                LanguageSelectActivity.X(this.f38779b);
                return;
            default:
                this.f38779b.f35541a.l();
                return;
        }
    }
}
