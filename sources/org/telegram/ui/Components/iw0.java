package org.telegram.ui.Components;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class iw0 extends fj0 {
    public int f24145b1;
    public int f24146c1;
    public int f24147d1;
    public Bitmap f24148e1;
    public final RLottieNative[] f24149f1;
    public final int[] f24150g1;
    public final int[] f24151h1;
    public final RLottieNative[] f24152i1;
    public final int[] f24153j1;
    public final int[] f24154k1;
    public boolean l1;

    public iw0(String str, int i10, int i11) {
        super(str, i10, i11);
        this.f24149f1 = new RLottieNative[5];
        this.f24150g1 = new int[5];
        this.f24151h1 = new int[5];
        this.f24152i1 = new RLottieNative[3];
        this.f24153j1 = new int[3];
        this.f24154k1 = new int[3];
    }

    public static int W(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return 4;
        }
        return 3;
    }

    @Override
    public final int B(Bitmap bitmap, boolean z10) {
        Runnable runnable;
        boolean z11;
        if (this.f24148e1 == null) {
            try {
                this.f24148e1 = Bitmap.createBitmap(this.f23647b, this.f23649c, Bitmap.Config.ARGB_8888);
            } catch (Throwable th2) {
                FileLog.e(th2);
                return 2;
            }
        }
        int i10 = -1;
        if (this.K == 1) {
            int i11 = 0;
            while (true) {
                RLottieNative[] rLottieNativeArr = this.f24149f1;
                if (i11 >= rLottieNativeArr.length) {
                    break;
                }
                RLottieNative rLottieNative = rLottieNativeArr[i11];
                int i12 = this.f24151h1[i11];
                Bitmap bitmap2 = this.f24148e1;
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i10 = rLottieNative.c(i12, bitmap2, z11);
                if (i11 != 0) {
                    int[] iArr = this.f24151h1;
                    int i13 = iArr[i11] + 1;
                    if (i13 < this.f24150g1[i11]) {
                        iArr[i11] = i13;
                    } else if (i11 != 4) {
                        iArr[i11] = 0;
                        this.O = false;
                        if (this.U0 != null) {
                            this.K = 2;
                        }
                    }
                }
                i11++;
            }
        } else {
            if (this.X0) {
                int i14 = 0;
                while (true) {
                    int[] iArr2 = this.f24154k1;
                    if (i14 >= iArr2.length) {
                        break;
                    }
                    iArr2[i14] = this.f24153j1[i14] - 1;
                    i14++;
                }
            }
            if (this.l1) {
                int[] iArr3 = this.f24151h1;
                int i15 = iArr3[0] + 1;
                if (i15 < this.f24150g1[0]) {
                    iArr3[0] = i15;
                } else {
                    iArr3[0] = -1;
                }
            }
            this.f24149f1[0].c(Math.max(this.f24151h1[0], 0), this.f24148e1, true);
            int i16 = 0;
            while (true) {
                RLottieNative[] rLottieNativeArr2 = this.f24152i1;
                if (i16 >= rLottieNativeArr2.length) {
                    break;
                }
                RLottieNative rLottieNative2 = rLottieNativeArr2[i16];
                int i17 = this.f24154k1[i16];
                if (i17 < 0) {
                    i17 = this.f24153j1[i16] - 1;
                }
                rLottieNative2.c(i17, this.f24148e1, false);
                if (!this.O) {
                    int[] iArr4 = this.f24154k1;
                    int i18 = iArr4[i16] + 1;
                    if (i18 < this.f24153j1[i16]) {
                        iArr4[i16] = i18;
                    } else {
                        iArr4[i16] = -1;
                    }
                }
                i16++;
            }
            int c10 = this.f24149f1[4].c(this.f24151h1[4], this.f24148e1, false);
            int[] iArr5 = this.f24151h1;
            int i19 = iArr5[4] + 1;
            if (i19 < this.f24150g1[4]) {
                iArr5[4] = i19;
            }
            int[] iArr6 = this.f24154k1;
            if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                this.O = true;
                this.N++;
            }
            int i20 = this.f24145b1;
            int i21 = this.f24147d1;
            if (i20 == i21 && i21 == this.f24146c1) {
                if (this.f24154k1[0] == this.f24153j1[0] - 100) {
                    this.l1 = true;
                    if (i20 == 5) {
                        WeakReference weakReference = this.H;
                        if (weakReference == null) {
                            runnable = null;
                        } else {
                            runnable = (Runnable) weakReference.get();
                        }
                        if (runnable != null) {
                            AndroidUtilities.runOnUIThread(runnable);
                        }
                    }
                }
            } else {
                this.f24151h1[0] = -1;
            }
            i10 = c10;
        }
        if (i10 < 0) {
            return 2;
        }
        Utilities.copyBitmaps(this.f24148e1, bitmap);
        return 1;
    }

    @Override
    public final void C(boolean z10) {
        this.f23660l0 = false;
        this.m0 = true;
        n();
        l();
        if (!this.Y0 && !this.V0) {
            if (this.Q == null) {
                V(true);
                E();
                return;
            }
            this.W = true;
            return;
        }
        this.W0 = true;
    }

    public final void V(boolean z10) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.f24149f1;
            if (i11 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i11];
            if (rLottieNative != null) {
                if (z10 && rLottieNative == this.f23662n0) {
                    this.f23662n0 = null;
                }
                this.f24149f1[i11].d();
                this.f24149f1[i11] = null;
            }
            i11++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.f24152i1;
            if (i10 < rLottieNativeArr2.length) {
                RLottieNative rLottieNative2 = rLottieNativeArr2[i10];
                if (rLottieNative2 != null) {
                    if (z10 && rLottieNative2 == this.U0) {
                        this.U0 = null;
                    }
                    this.f24152i1[i10].d();
                    this.f24152i1[i10] = null;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final int j() {
        if (this.m0) {
            return 3;
        }
        if (this.f23662n0 == null || (this.K == 2 && this.U0 == null)) {
            return 2;
        }
        return 1;
    }

    @Override
    public final void p() {
        if (this.W) {
            n();
            if (this.Q == null) {
                V(false);
            }
        }
        if (this.f23662n0 == null && this.U0 == null) {
            E();
            return;
        }
        this.U = true;
        if (!v()) {
            stop();
        }
        I();
    }

    @Override
    public final void i() {
    }
}
