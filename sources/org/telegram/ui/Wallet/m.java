package org.telegram.ui.Wallet;

import a8.af;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.r71;
public final class m implements Runnable {
    public final int f36874a;
    public final Object f36875b;

    public m(Object obj, int i10) {
        this.f36874a = i10;
        this.f36875b = obj;
    }

    private final void a() {
        b0 b0Var = (b0) this.f36875b;
        synchronized (b0Var) {
            if (b0Var.f36378a) {
                return;
            }
            b0Var.f36378a = true;
            Runnable runnable = b0Var.f36379b;
            if (runnable != null) {
                runnable.run();
                b0Var.f36379b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z10;
        switch (this.f36874a) {
            case 0:
                z zVar = (z) this.f36875b;
                synchronized (zVar) {
                    if (!zVar.f37532a) {
                        zVar.f37532a = true;
                        Runnable runnable = zVar.f37533b;
                        if (runnable != null) {
                            runnable.run();
                            zVar.f37533b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((i0) this.f36875b).close();
                return;
            case 3:
                ((boolean[]) this.f36875b)[0] = true;
                return;
            case 4:
                v0 v0Var = (v0) this.f36875b;
                v0Var.c("AUTH_CANCELED");
                v0Var.e();
                if (af.f360b == v0Var) {
                    af.f360b = null;
                    return;
                }
                return;
            case 5:
                ((i2) this.f36875b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.v0) this.f36875b).invalidate();
                return;
            case 7:
                AndroidUtilities.removeFromParent((fi.v3) this.f36875b);
                return;
            case 8:
                i5 i5Var = (i5) this.f36875b;
                l71 l71Var = i5Var.f36674c;
                if (l71Var != null && l71Var.getScrollState() == 0) {
                    r71 u02 = i5Var.f36678j.u0();
                    if ((u02 == null || u02.getScrollState() == 0) && (d = i5Var.d(i5Var.f36674c.f32151f3)) != null) {
                        s4.c0 c0Var = i5Var.f36674c.f32151f3;
                        c0Var.getClass();
                        int i10 = new int[]{0, s4.p0.z(d) - c0Var.F()}[1];
                        if (i10 != 0) {
                            i5Var.f36674c.w0(0, i10, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                di.h3 h3Var = (di.h3) this.f36875b;
                ai.h hVar = (ai.h) h3Var.f8618b;
                ai.g gVar = (ai.g) h3Var.f8619c;
                if (gVar != null) {
                    hVar.a(gVar);
                    hVar.D = 0.0f;
                    h3Var.f8619c = null;
                    h3Var.invalidate();
                    return;
                }
                return;
            case 10:
                ((WalletEngine2) this.f36875b).lambda$close$53();
                return;
            case 11:
                i8 i8Var = (i8) this.f36875b;
                boolean z11 = false;
                if (i8Var.h != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !i8Var.f36689s) {
                    i8Var.f36685c = i8Var.c();
                    i8Var.d = 0.0f;
                }
                if (z10 || i8Var.f36689s || i8Var.e > 1.001f) {
                    z11 = true;
                }
                l3 l3Var = i8Var.f36684b;
                float f7 = i8Var.f36685c;
                float f10 = i8Var.d;
                l3Var.f49895r = f7;
                l3Var.f49896s = f10;
                l3Var.v = z11;
                l3Var.f49897w = z11;
                return;
            case 12:
                p8 p8Var = (p8) this.f36875b;
                p8Var.removeSelfFromStack();
                Runnable runnable2 = p8Var.f37109f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.y3) this.f36875b).requestLayout();
                return;
            default:
                ((z9) this.f36875b).V();
                return;
        }
    }
}
