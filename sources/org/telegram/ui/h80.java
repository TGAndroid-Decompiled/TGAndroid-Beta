package org.telegram.ui;
public final class h80 implements Runnable {
    public final int f34790a;
    public final LanguageSelectActivity f34791b;

    public h80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f34790a = i10;
        this.f34791b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f34790a) {
            case 0:
                LanguageSelectActivity.Y(this.f34791b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f34791b);
                return;
            default:
                this.f34791b.f31606a.l();
                return;
        }
    }
}
