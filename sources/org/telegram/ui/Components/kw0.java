package org.telegram.ui.Components;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class kw0 extends ij0 {
    public int f25828b1;
    public int f25829c1;
    public int f25830d1;
    public Bitmap f25831e1;
    public final RLottieNative[] f25832f1;
    public final int[] f25833g1;
    public final int[] f25834h1;
    public final RLottieNative[] f25835i1;
    public final int[] f25836j1;
    public final int[] f25837k1;
    public boolean l1;

    public kw0(String str, int i10, int i11) {
        super(str, i10, i11);
        this.f25832f1 = new RLottieNative[5];
        this.f25833g1 = new int[5];
        this.f25834h1 = new int[5];
        this.f25835i1 = new RLottieNative[3];
        this.f25836j1 = new int[3];
        this.f25837k1 = new int[3];
    }

    public static int X(int i10) {
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
        if (this.f25831e1 == null) {
            try {
                this.f25831e1 = Bitmap.createBitmap(this.f25712b, this.f25714c, Bitmap.Config.ARGB_8888);
            } catch (Throwable th2) {
                FileLog.e(th2);
                return 2;
            }
        }
        int i10 = -1;
        if (this.J == 1) {
            int i11 = 0;
            while (true) {
                RLottieNative[] rLottieNativeArr = this.f25832f1;
                if (i11 >= rLottieNativeArr.length) {
                    break;
                }
                RLottieNative rLottieNative = rLottieNativeArr[i11];
                int i12 = this.f25834h1[i11];
                Bitmap bitmap2 = this.f25831e1;
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i10 = rLottieNative.c(i12, bitmap2, z11);
                if (i11 != 0) {
                    int[] iArr = this.f25834h1;
                    int i13 = iArr[i11] + 1;
                    if (i13 < this.f25833g1[i11]) {
                        iArr[i11] = i13;
                    } else if (i11 != 4) {
                        iArr[i11] = 0;
                        this.N = false;
                        if (this.U0 != null) {
                            this.J = 2;
                        }
                    }
                }
                i11++;
            }
        } else {
            if (this.X0) {
                int i14 = 0;
                while (true) {
                    int[] iArr2 = this.f25837k1;
                    if (i14 >= iArr2.length) {
                        break;
                    }
                    iArr2[i14] = this.f25836j1[i14] - 1;
                    i14++;
                }
            }
            if (this.l1) {
                int[] iArr3 = this.f25834h1;
                int i15 = iArr3[0] + 1;
                if (i15 < this.f25833g1[0]) {
                    iArr3[0] = i15;
                } else {
                    iArr3[0] = -1;
                }
            }
            this.f25832f1[0].c(Math.max(this.f25834h1[0], 0), this.f25831e1, true);
            int i16 = 0;
            while (true) {
                RLottieNative[] rLottieNativeArr2 = this.f25835i1;
                if (i16 >= rLottieNativeArr2.length) {
                    break;
                }
                RLottieNative rLottieNative2 = rLottieNativeArr2[i16];
                int i17 = this.f25837k1[i16];
                if (i17 < 0) {
                    i17 = this.f25836j1[i16] - 1;
                }
                rLottieNative2.c(i17, this.f25831e1, false);
                if (!this.N) {
                    int[] iArr4 = this.f25837k1;
                    int i18 = iArr4[i16] + 1;
                    if (i18 < this.f25836j1[i16]) {
                        iArr4[i16] = i18;
                    } else {
                        iArr4[i16] = -1;
                    }
                }
                i16++;
            }
            int c10 = this.f25832f1[4].c(this.f25834h1[4], this.f25831e1, false);
            int[] iArr5 = this.f25834h1;
            int i19 = iArr5[4] + 1;
            if (i19 < this.f25833g1[4]) {
                iArr5[4] = i19;
            }
            int[] iArr6 = this.f25837k1;
            if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                this.N = true;
                this.M++;
            }
            int i20 = this.f25828b1;
            int i21 = this.f25830d1;
            if (i20 == i21 && i21 == this.f25829c1) {
                if (this.f25837k1[0] == this.f25836j1[0] - 100) {
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
                this.f25834h1[0] = -1;
            }
            i10 = c10;
        }
        if (i10 < 0) {
            return 2;
        }
        Utilities.copyBitmaps(this.f25831e1, bitmap);
        return 1;
    }

    @Override
    public final void C(boolean z10) {
        this.f25724k0 = false;
        this.f25725l0 = true;
        n();
        l();
        if (!this.Y0 && !this.V0) {
            if (this.P == null) {
                W(true);
                E();
                return;
            }
            this.V = true;
            return;
        }
        this.W0 = true;
    }

    public final void W(boolean z10) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.f25832f1;
            if (i11 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i11];
            if (rLottieNative != null) {
                if (z10 && rLottieNative == this.m0) {
                    this.m0 = null;
                }
                this.f25832f1[i11].d();
                this.f25832f1[i11] = null;
            }
            i11++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.f25835i1;
            if (i10 < rLottieNativeArr2.length) {
                RLottieNative rLottieNative2 = rLottieNativeArr2[i10];
                if (rLottieNative2 != null) {
                    if (z10 && rLottieNative2 == this.U0) {
                        this.U0 = null;
                    }
                    this.f25835i1[i10].d();
                    this.f25835i1[i10] = null;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final int j() {
        if (this.f25725l0) {
            return 3;
        }
        if (this.m0 == null || (this.J == 2 && this.U0 == null)) {
            return 2;
        }
        return 1;
    }

    @Override
    public final void p() {
        if (this.V) {
            n();
            if (this.P == null) {
                W(false);
            }
        }
        if (this.m0 == null && this.U0 == null) {
            E();
            return;
        }
        this.T = true;
        if (!v()) {
            stop();
        }
        I();
    }

    @Override
    public final void i() {
    }
}
