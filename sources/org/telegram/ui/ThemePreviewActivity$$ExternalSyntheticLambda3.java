package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ThemePreviewActivity$$ExternalSyntheticLambda3 implements RequestDelegate {
    public final int $r8$classId;
    public final ThemePreviewActivity f$0;

    public ThemePreviewActivity$$ExternalSyntheticLambda3(ThemePreviewActivity themePreviewActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = themePreviewActivity;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final ThemePreviewActivity themePreviewActivity = this.f$0;
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                themePreviewActivity.lambda$didReceivedNotification$30(tLObject);
                                break;
                            default:
                                ThemePreviewActivity themePreviewActivity2 = themePreviewActivity;
                                themePreviewActivity2.getClass();
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        themePreviewActivity2.selectedPattern = tL_wallPaper;
                                        themePreviewActivity2.setCurrentImage(false);
                                        themePreviewActivity2.updateButtonState$1$1();
                                        themePreviewActivity2.patterns.add(0, themePreviewActivity2.selectedPattern);
                                        ThemePreviewActivity.PatternsAdapter patternsAdapter = themePreviewActivity2.patternsAdapter;
                                        if (patternsAdapter != null) {
                                            patternsAdapter.mObservable.notifyChanged();
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final ThemePreviewActivity themePreviewActivity2 = this.f$0;
                themePreviewActivity2.getClass();
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                themePreviewActivity2.lambda$didReceivedNotification$30(tLObject);
                                break;
                            default:
                                ThemePreviewActivity themePreviewActivity3 = themePreviewActivity2;
                                themePreviewActivity3.getClass();
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        themePreviewActivity3.selectedPattern = tL_wallPaper;
                                        themePreviewActivity3.setCurrentImage(false);
                                        themePreviewActivity3.updateButtonState$1$1();
                                        themePreviewActivity3.patterns.add(0, themePreviewActivity3.selectedPattern);
                                        ThemePreviewActivity.PatternsAdapter patternsAdapter = themePreviewActivity3.patternsAdapter;
                                        if (patternsAdapter != null) {
                                            patternsAdapter.mObservable.notifyChanged();
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
