package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class sg0 implements Runnable {

    public final int f32438a;

    public final tg0 f32439b;

    public sg0(tg0 tg0Var, int i10) {
        this.f32438a = i10;
        this.f32439b = tg0Var;
    }

    @Override
    public final void run() {
        int i10;
        hh0[] hh0VarArr;
        int i11;
        hh0[] hh0VarArr2;
        switch (this.f32438a) {
            case 0:
                tg0 tg0Var = this.f32439b;
                synchronized (tg0Var.f32771b) {
                    hh0[] hh0VarArr3 = tg0Var.f32772c;
                    hh0 hh0Var = hh0VarArr3[0];
                    hh0[] hh0VarArr4 = tg0Var.d;
                    i10 = 2;
                    hh0VarArr = new hh0[]{hh0Var, hh0VarArr4[0], hh0VarArr3[1], hh0VarArr4[1], hh0VarArr3[2], hh0VarArr4[2]};
                    break;
                }
                boolean z10 = false;
                for (int i12 = 0; i12 < 6; i12 += 2) {
                    hh0 hh0Var2 = hh0VarArr[i12];
                    hh0 hh0Var3 = hh0VarArr[i12 + 1];
                    if (hh0Var2 != null && !hh0Var2.f29021c && hh0Var2.f29023f) {
                        hh0Var2.f29022e = true;
                        if (hh0Var3 != null) {
                            Bitmap bitmap = hh0Var3.f29020b;
                            if (hh0Var3.d || bitmap.getWidth() != hh0Var2.f29020b.getWidth() || bitmap.getHeight() != hh0Var2.f29020b.getHeight()) {
                                if (hh0Var3 != null) {
                                    hh0Var3.a();
                                }
                                hh0Var3 = new hh0();
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(hh0Var2.f29020b.getWidth(), hh0Var2.f29020b.getHeight(), Bitmap.Config.ARGB_8888);
                                hh0Var3.f29020b = bitmapCreateBitmap;
                                hh0Var3.f29019a = new Canvas(bitmapCreateBitmap);
                                synchronized (tg0Var.f32771b) {
                                    hh0[] hh0VarArr5 = tg0Var.d;
                                    i11 = 0;
                                    while (true) {
                                        hh0VarArr2 = tg0Var.f32772c;
                                        if (i11 < hh0VarArr2.length) {
                                            i11 = 0;
                                        } else if (hh0VarArr2[i11] == hh0Var2) {
                                            i11++;
                                        }
                                    }
                                    hh0VarArr5[i11] = hh0Var3;
                                }
                            }
                        } else {
                            if (hh0Var3 != null) {
                                hh0Var3.a();
                            }
                            hh0Var3 = new hh0();
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(hh0Var2.f29020b.getWidth(), hh0Var2.f29020b.getHeight(), Bitmap.Config.ARGB_8888);
                            hh0Var3.f29020b = bitmapCreateBitmap2;
                            hh0Var3.f29019a = new Canvas(bitmapCreateBitmap2);
                            synchronized (tg0Var.f32771b) {
                                hh0[] hh0VarArr6 = tg0Var.d;
                                i11 = 0;
                                while (true) {
                                    hh0VarArr2 = tg0Var.f32772c;
                                    if (i11 < hh0VarArr2.length) {
                                        i11 = 0;
                                    } else if (hh0VarArr2[i11] == hh0Var2) {
                                        i11++;
                                    }
                                }
                                hh0VarArr6[i11] = hh0Var3;
                            }
                        }
                        Bitmap bitmap2 = hh0Var2.f29020b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / 180));
                        synchronized (tg0Var.f32771b) {
                            if (!hh0Var3.d) {
                                hh0Var3.f29023f = false;
                                hh0Var3.f29020b.eraseColor(0);
                            }
                            hh0Var3.f29019a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            hh0Var3.f29023f = true;
                            Bitmap bitmap3 = hh0Var3.f29020b;
                            int i13 = 0;
                            while (true) {
                                hh0[] hh0VarArr7 = tg0Var.f32772c;
                                if (i13 >= hh0VarArr7.length) {
                                    i13 = 0;
                                } else if (hh0VarArr7[i13] != hh0Var2) {
                                    i13++;
                                }
                            }
                            tg0Var.b(bitmap3, i13);
                        }
                        if (!hh0Var2.d) {
                            hh0Var2.f29023f = false;
                            hh0Var2.f29020b.eraseColor(0);
                        }
                        hh0Var2.f29022e = false;
                        if (!hh0Var2.d && hh0Var2.f29021c) {
                            hh0Var2.d = true;
                            hh0Var2.f29020b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && tg0Var.f32773e && tg0Var.h != null) {
                    tg0Var.postInvalidateOnAnimation();
                }
                if (tg0Var.f32773e && (tg0Var.B || tg0Var.D)) {
                    AndroidUtilities.runOnUIThread(new sg0(tg0Var, i10));
                    return;
                } else {
                    tg0Var.f32773e = false;
                    return;
                }
            case 1:
                tg0 tg0Var2 = this.f32439b;
                tg0Var2.D = true;
                tg0Var2.postInvalidateOnAnimation();
                return;
            default:
                tg0 tg0Var3 = this.f32439b;
                tg0Var3.d();
                ih0.f29367a.postRunnable(tg0Var3.f32777s);
                return;
        }
    }
}
