package org.telegram.ui.Components;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Utilities;
public final class ku0 extends lh0 {
    public int f36885c1;
    public int f36886d1;
    public int f36887e1;
    public Bitmap f36888f1;
    public final RLottieNative[] f36889g1;
    public final int[] f36890h1;
    public final int[] f36891i1;
    public final RLottieNative[] f36892j1;
    public final int[] f36893k1;
    public final int[] l1;
    public boolean f36894m1;

    public ku0(String str, int i7, int i10) {
        super(str, i7, i10);
        this.f36889g1 = new RLottieNative[5];
        this.f36890h1 = new int[5];
        this.f36891i1 = new int[5];
        this.f36892j1 = new RLottieNative[3];
        this.f36893k1 = new int[3];
        this.l1 = new int[3];
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
    public final int B(Bitmap bitmap, boolean z10) {
        Runnable runnable;
        boolean z11;
        if (this.f36888f1 == null) {
            try {
                this.f36888f1 = Bitmap.createBitmap(this.f37800b, this.f37802c, Bitmap.Config.ARGB_8888);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
                return 2;
            }
        }
        int i7 = -1;
        if (this.K == 1) {
            int i10 = 0;
            while (true) {
                RLottieNative[] rLottieNativeArr = this.f36889g1;
                if (i10 >= rLottieNativeArr.length) {
                    break;
                }
                RLottieNative rLottieNative = rLottieNativeArr[i10];
                int i11 = this.f36891i1[i10];
                Bitmap bitmap2 = this.f36888f1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i7 = rLottieNative.c(i11, bitmap2, z11);
                if (i10 != 0) {
                    int[] iArr = this.f36891i1;
                    int i12 = iArr[i10] + 1;
                    if (i12 < this.f36890h1[i10]) {
                        iArr[i10] = i12;
                    } else if (i10 != 4) {
                        iArr[i10] = 0;
                        this.O = false;
                        if (this.V0 != null) {
                            this.K = 2;
                        }
                    }
                }
                i10++;
            }
        } else {
            if (this.Y0) {
                int i13 = 0;
                while (true) {
                    int[] iArr2 = this.l1;
                    if (i13 >= iArr2.length) {
                        break;
                    }
                    iArr2[i13] = this.f36893k1[i13] - 1;
                    i13++;
                }
            }
            if (this.f36894m1) {
                int[] iArr3 = this.f36891i1;
                int i14 = iArr3[0] + 1;
                if (i14 < this.f36890h1[0]) {
                    iArr3[0] = i14;
                } else {
                    iArr3[0] = -1;
                }
            }
            this.f36889g1[0].c(Math.max(this.f36891i1[0], 0), this.f36888f1, true);
            int i15 = 0;
            while (true) {
                RLottieNative[] rLottieNativeArr2 = this.f36892j1;
                if (i15 >= rLottieNativeArr2.length) {
                    break;
                }
                RLottieNative rLottieNative2 = rLottieNativeArr2[i15];
                int i16 = this.l1[i15];
                if (i16 < 0) {
                    i16 = this.f36893k1[i15] - 1;
                }
                rLottieNative2.c(i16, this.f36888f1, false);
                if (!this.O) {
                    int[] iArr4 = this.l1;
                    int i17 = iArr4[i15] + 1;
                    if (i17 < this.f36893k1[i15]) {
                        iArr4[i15] = i17;
                    } else {
                        iArr4[i15] = -1;
                    }
                }
                i15++;
            }
            int c10 = this.f36889g1[4].c(this.f36891i1[4], this.f36888f1, false);
            int[] iArr5 = this.f36891i1;
            int i18 = iArr5[4] + 1;
            if (i18 < this.f36890h1[4]) {
                iArr5[4] = i18;
            }
            int[] iArr6 = this.l1;
            if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                this.O = true;
                this.N++;
            }
            int i19 = this.f36885c1;
            int i20 = this.f36887e1;
            if (i19 == i20 && i20 == this.f36886d1) {
                if (this.l1[0] == this.f36893k1[0] - 100) {
                    this.f36894m1 = true;
                    if (i19 == 5) {
                        WeakReference weakReference = this.I;
                        if (weakReference == null) {
                            runnable = null;
                        } else {
                            runnable = (Runnable) weakReference.get();
                        }
                        if (runnable != null) {
                            org.telegram.messenger.g0.g3(runnable);
                        }
                    }
                }
            } else {
                this.f36891i1[0] = -1;
            }
            i7 = c10;
        }
        if (i7 < 0) {
            return 2;
        }
        Utilities.copyBitmaps(this.f36888f1, bitmap);
        return 1;
    }

    @Override
    public final void C(boolean z10) {
        this.f37814l0 = false;
        this.m0 = true;
        n();
        l();
        if (!this.Z0 && !this.W0) {
            if (this.Q == null) {
                W(true);
                E();
                return;
            }
            this.W = true;
            return;
        }
        this.X0 = true;
    }

    public final void W(boolean z10) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.f36889g1;
            if (i10 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i10];
            if (rLottieNative != null) {
                if (z10 && rLottieNative == this.f37816n0) {
                    this.f37816n0 = null;
                }
                this.f36889g1[i10].d();
                this.f36889g1[i10] = null;
            }
            i10++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.f36892j1;
            if (i7 < rLottieNativeArr2.length) {
                RLottieNative rLottieNative2 = rLottieNativeArr2[i7];
                if (rLottieNative2 != null) {
                    if (z10 && rLottieNative2 == this.V0) {
                        this.V0 = null;
                    }
                    this.f36892j1[i7].d();
                    this.f36892j1[i7] = null;
                }
                i7++;
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
        if (this.f37816n0 == null || (this.K == 2 && this.V0 == null)) {
            return 2;
        }
        return 1;
    }

    @Override
    public final void p() {
        if (this.W) {
            n();
            if (this.Q == null) {
                W(false);
            }
        }
        if (this.f37816n0 == null && this.V0 == null) {
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
