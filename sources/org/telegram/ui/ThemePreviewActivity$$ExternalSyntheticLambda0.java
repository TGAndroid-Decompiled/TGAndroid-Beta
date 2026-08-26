package org.telegram.ui;

public final class ThemePreviewActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ThemePreviewActivity f$0;

    public ThemePreviewActivity$$ExternalSyntheticLambda0(ThemePreviewActivity themePreviewActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = themePreviewActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$applyWallpaperBackground$19();
                break;
            case 1:
                this.f$0.lambda$new$0();
                break;
            case 2:
                this.f$0.lambda$toggleTheme$36();
                break;
            default:
                this.f$0.lambda$createView$2();
                break;
        }
    }
}
