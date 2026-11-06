package org.telegram.ui.Components;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Utilities;
public final class zt0 extends xg0 {
    public int f41081b1;
    public int f41082c1;
    public int f41083d1;
    public Bitmap f41084e1;
    public final RLottieNative[] f41085f1;
    public final int[] f41086g1;
    public final int[] f41087h1;
    public final RLottieNative[] f41088i1;
    public final int[] f41089j1;
    public final int[] f41090k1;
    public boolean l1;

    public zt0(String str, int i7, int i10) {
        super(str, i7, i10);
        this.f41085f1 = new RLottieNative[5];
        this.f41086g1 = new int[5];
        this.f41087h1 = new int[5];
        this.f41088i1 = new RLottieNative[3];
        this.f41089j1 = new int[3];
        this.f41090k1 = new int[3];
    }

    public static int X(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        if (i7 != 2) {
            return 4;
        }
        return 3;
    }

    @Override
    public final int B(Bitmap bitmap, boolean z9) {
        Runnable runnable;
        boolean z10;
        if (this.f41084e1 == null) {
            try {
                this.f41084e1 = Bitmap.createBitmap(this.f40926b, this.f40928c, Bitmap.Config.ARGB_8888);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
                return 2;
            }
        }
        int i7 = -1;
        if (this.J == 1) {
            int i10 = 0;
            while (true) {
                RLottieNative[] rLottieNativeArr = this.f41085f1;
                if (i10 >= rLottieNativeArr.length) {
                    break;
                }
                RLottieNative rLottieNative = rLottieNativeArr[i10];
                int i11 = this.f41087h1[i10];
                Bitmap bitmap2 = this.f41084e1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i7 = rLottieNative.c(i11, bitmap2, z10);
                if (i10 != 0) {
                    int[] iArr = this.f41087h1;
                    int i12 = iArr[i10] + 1;
                    if (i12 < this.f41086g1[i10]) {
                        iArr[i10] = i12;
                    } else if (i10 != 4) {
                        iArr[i10] = 0;
                        this.N = false;
                        if (this.U0 != null) {
                            this.J = 2;
                        }
                    }
                }
                i10++;
            }
        } else {
            if (this.X0) {
                int i13 = 0;
                while (true) {
                    int[] iArr2 = this.f41090k1;
                    if (i13 >= iArr2.length) {
                        break;
                    }
                    iArr2[i13] = this.f41089j1[i13] - 1;
                    i13++;
                }
            }
            if (this.l1) {
                int[] iArr3 = this.f41087h1;
                int i14 = iArr3[0] + 1;
                if (i14 < this.f41086g1[0]) {
                    iArr3[0] = i14;
                } else {
                    iArr3[0] = -1;
                }
            }
            this.f41085f1[0].c(Math.max(this.f41087h1[0], 0), this.f41084e1, true);
            int i15 = 0;
            while (true) {
                RLottieNative[] rLottieNativeArr2 = this.f41088i1;
                if (i15 >= rLottieNativeArr2.length) {
                    break;
                }
                RLottieNative rLottieNative2 = rLottieNativeArr2[i15];
                int i16 = this.f41090k1[i15];
                if (i16 < 0) {
                    i16 = this.f41089j1[i15] - 1;
                }
                rLottieNative2.c(i16, this.f41084e1, false);
                if (!this.N) {
                    int[] iArr4 = this.f41090k1;
                    int i17 = iArr4[i15] + 1;
                    if (i17 < this.f41089j1[i15]) {
                        iArr4[i15] = i17;
                    } else {
                        iArr4[i15] = -1;
                    }
                }
                i15++;
            }
            int c10 = this.f41085f1[4].c(this.f41087h1[4], this.f41084e1, false);
            int[] iArr5 = this.f41087h1;
            int i18 = iArr5[4] + 1;
            if (i18 < this.f41086g1[4]) {
                iArr5[4] = i18;
            }
            int[] iArr6 = this.f41090k1;
            if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                this.N = true;
                this.M++;
            }
            int i19 = this.f41081b1;
            int i20 = this.f41083d1;
            if (i19 == i20 && i20 == this.f41082c1) {
                if (this.f41090k1[0] == this.f41089j1[0] - 100) {
                    this.l1 = true;
                    if (i19 == 5) {
                        WeakReference weakReference = this.H;
                        if (weakReference == null) {
                            runnable = null;
                        } else {
                            runnable = (Runnable) weakReference.get();
                        }
                        if (runnable != null) {
                            org.telegram.messenger.g0.h3(runnable);
                        }
                    }
                }
            } else {
                this.f41087h1[0] = -1;
            }
            i7 = c10;
        }
        if (i7 < 0) {
            return 2;
        }
        Utilities.copyBitmaps(this.f41084e1, bitmap);
        return 1;
    }

    @Override
    public final void C(boolean z9) {
        this.f40939k0 = false;
        this.f40940l0 = true;
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

    public final void W(boolean z9) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.f41085f1;
            if (i10 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i10];
            if (rLottieNative != null) {
                if (z9 && rLottieNative == this.m0) {
                    this.m0 = null;
                }
                this.f41085f1[i10].d();
                this.f41085f1[i10] = null;
            }
            i10++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.f41088i1;
            if (i7 < rLottieNativeArr2.length) {
                RLottieNative rLottieNative2 = rLottieNativeArr2[i7];
                if (rLottieNative2 != null) {
                    if (z9 && rLottieNative2 == this.U0) {
                        this.U0 = null;
                    }
                    this.f41088i1[i7].d();
                    this.f41088i1[i7] = null;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final int j() {
        if (this.f40940l0) {
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
