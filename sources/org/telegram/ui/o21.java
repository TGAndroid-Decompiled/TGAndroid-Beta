package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class o21 implements Runnable {
    public final int f35668a;
    public final r21 f35669b;

    public o21(r21 r21Var, int i10) {
        this.f35668a = i10;
        this.f35669b = r21Var;
    }

    @Override
    public final void run() {
        long j3;
        String str;
        switch (this.f35668a) {
            case 0:
                r21 r21Var = this.f35669b;
                AndroidUtilities.cancelRunOnUIThread(r21Var.N);
                boolean z10 = r21Var.f36669r;
                if (z10) {
                    if (z10 && r21Var.F == null) {
                        org.telegram.ui.Components.yi0 yi0Var = new org.telegram.ui.Components.yi0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        r21Var.F = yi0Var;
                        yi0Var.R(r21Var);
                        r21Var.F.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        r21Var.F.K(1);
                        r21Var.F.start();
                    }
                    String str2 = "";
                    if (r21Var.J == 0 || System.currentTimeMillis() / 1000 >= r21Var.J) {
                        if (r21Var.J != 0) {
                            r21Var.I = null;
                            Utilities.themeQueue.postRunnable(new p21(r21Var, r21Var.getWidth(), r21Var.getHeight(), 2));
                            r21Var.f36670s.q("", true, true);
                        }
                        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                        if (r21Var.J == 0) {
                            j3 = 750;
                        } else {
                            j3 = 1750;
                        }
                        messagesController.requestContactToken(j3, new t3(r21Var, 22));
                    }
                    int i10 = r21Var.J;
                    if (i10 > 0 && r21Var.I != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.jo0 jo0Var = r21Var.f36670s;
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
                        jo0Var.q(sb2.toString(), true, false);
                    }
                    if (r21Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(r21Var.N, 1000L);
                        return;
                    }
                    return;
                }
                return;
            default:
                r21 r21Var2 = this.f35669b;
                r21Var2.S = false;
                Bitmap bitmap = r21Var2.h;
                if (bitmap != null) {
                    r21Var2.h = null;
                    r21Var2.f36672x.d(0.0f, true);
                    Bitmap bitmap2 = r21Var2.f36668n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    r21Var2.f36668n = bitmap;
                    r21Var2.invalidate();
                    return;
                }
                return;
        }
    }
}
