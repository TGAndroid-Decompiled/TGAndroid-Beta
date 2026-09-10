package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class b31 implements Runnable {
    public final int f31148a;
    public final e31 f31149b;

    public b31(e31 e31Var, int i10) {
        this.f31148a = i10;
        this.f31149b = e31Var;
    }

    @Override
    public final void run() {
        long j3;
        String str;
        switch (this.f31148a) {
            case 0:
                e31 e31Var = this.f31149b;
                AndroidUtilities.cancelRunOnUIThread(e31Var.N);
                boolean z10 = e31Var.f32052r;
                if (z10) {
                    if (z10 && e31Var.F == null) {
                        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        e31Var.F = hj0Var;
                        hj0Var.f23672v0 = e31Var;
                        hj0Var.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        e31Var.F.K(1);
                        e31Var.F.start();
                    }
                    String str2 = "";
                    if (e31Var.J == 0 || System.currentTimeMillis() / 1000 >= e31Var.J) {
                        if (e31Var.J != 0) {
                            e31Var.I = null;
                            Utilities.themeQueue.postRunnable(new c31(e31Var, e31Var.getWidth(), e31Var.getHeight(), 2));
                            e31Var.f32053s.q("", true, true);
                        }
                        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                        if (e31Var.J == 0) {
                            j3 = 750;
                        } else {
                            j3 = 1750;
                        }
                        messagesController.requestContactToken(j3, new u3(e31Var, 18));
                    }
                    int i10 = e31Var.J;
                    if (i10 > 0 && e31Var.I != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.so0 so0Var = e31Var.f32053s;
                        StringBuilder sb2 = new StringBuilder();
                        if (min >= 10) {
                            str = "";
                        } else {
                            str = "0";
                        }
                        sb2.append(str);
                        sb2.append(min);
                        sb2.append(":");
                        if (i11 < 10) {
                            str2 = "0";
                        }
                        sb2.append(str2);
                        sb2.append(i11);
                        so0Var.q(sb2.toString(), true, false);
                    }
                    if (e31Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(e31Var.N, 1000L);
                        return;
                    }
                    return;
                }
                return;
            default:
                e31 e31Var2 = this.f31149b;
                e31Var2.S = false;
                Bitmap bitmap = e31Var2.h;
                if (bitmap != null) {
                    e31Var2.h = null;
                    e31Var2.f32055x.d(0.0f, true);
                    Bitmap bitmap2 = e31Var2.f32051n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    e31Var2.f32051n = bitmap;
                    e31Var2.invalidate();
                    return;
                }
                return;
        }
    }
}
