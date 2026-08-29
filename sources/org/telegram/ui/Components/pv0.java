package org.telegram.ui.Components;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class pv0 extends ti0 {
    public int X0;
    public int Y0;
    public int Z0;
    public Bitmap f31788a1;
    public final RLottieNative[] f31789b1;
    public final int[] f31790c1;
    public final int[] f31791d1;
    public final RLottieNative[] f31792e1;
    public final int[] f31793f1;
    public final int[] f31794g1;
    public boolean f31795h1;

    public pv0(String str, int i10, int i11) {
        super(str, i10, i11);
        this.f31789b1 = new RLottieNative[5];
        this.f31790c1 = new int[5];
        this.f31791d1 = new int[5];
        this.f31792e1 = new RLottieNative[3];
        this.f31793f1 = new int[3];
        this.f31794g1 = new int[3];
    }

    public static int U(int i10) {
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
    public final void A(boolean z10) {
        this.f34742h0 = false;
        this.f34743i0 = true;
        l();
        j();
        if (!this.U0 && !this.R0) {
            if (this.M == null) {
                T(true);
                C();
                return;
            }
            this.S = true;
            return;
        }
        this.S0 = true;
    }

    public final void T(boolean z10) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.f31789b1;
            if (i11 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i11];
            if (rLottieNative != null) {
                if (z10 && rLottieNative == this.f34744j0) {
                    this.f34744j0 = null;
                }
                this.f31789b1[i11].d();
                this.f31789b1[i11] = null;
            }
            i11++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.f31792e1;
            if (i10 < rLottieNativeArr2.length) {
                RLottieNative rLottieNative2 = rLottieNativeArr2[i10];
                if (rLottieNative2 != null) {
                    if (z10 && rLottieNative2 == this.Q0) {
                        this.Q0 = null;
                    }
                    this.f31792e1[i10].d();
                    this.f31792e1[i10] = null;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void n() {
        if (this.S) {
            l();
            if (this.M == null) {
                T(false);
            }
        }
        if (this.f34744j0 == null && this.Q0 == null) {
            C();
            return;
        }
        this.Q = true;
        if (!t()) {
            stop();
        }
        G();
    }

    @Override
    public final int z() {
        Runnable runnable;
        boolean z10;
        if (this.f34743i0) {
            return 3;
        }
        if (this.f34744j0 != null && (this.G != 2 || this.Q0 != null)) {
            if (this.f31788a1 == null) {
                try {
                    this.f31788a1 = Bitmap.createBitmap(this.f34732b, this.f34734c, Bitmap.Config.ARGB_8888);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.P == null) {
                try {
                    this.P = Bitmap.createBitmap(this.f34732b, this.f34734c, Bitmap.Config.ARGB_8888);
                } catch (Throwable th3) {
                    FileLog.e(th3);
                }
            }
            if (this.P != null && this.f31788a1 != null) {
                try {
                    int i10 = -1;
                    if (this.G == 1) {
                        int i11 = 0;
                        while (true) {
                            RLottieNative[] rLottieNativeArr = this.f31789b1;
                            if (i11 >= rLottieNativeArr.length) {
                                break;
                            }
                            RLottieNative rLottieNative = rLottieNativeArr[i11];
                            int i12 = this.f31791d1[i11];
                            Bitmap bitmap = this.f31788a1;
                            if (i11 == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            i10 = rLottieNative.c(i12, bitmap, z10);
                            if (i11 != 0) {
                                int[] iArr = this.f31791d1;
                                int i13 = iArr[i11] + 1;
                                if (i13 < this.f31790c1[i11]) {
                                    iArr[i11] = i13;
                                } else if (i11 != 4) {
                                    iArr[i11] = 0;
                                    this.K = false;
                                    if (this.Q0 != null) {
                                        this.G = 2;
                                    }
                                }
                            }
                            i11++;
                        }
                    } else {
                        if (this.T0) {
                            int i14 = 0;
                            while (true) {
                                int[] iArr2 = this.f31794g1;
                                if (i14 >= iArr2.length) {
                                    break;
                                }
                                iArr2[i14] = this.f31793f1[i14] - 1;
                                i14++;
                            }
                        }
                        if (this.f31795h1) {
                            int[] iArr3 = this.f31791d1;
                            int i15 = iArr3[0] + 1;
                            if (i15 < this.f31790c1[0]) {
                                iArr3[0] = i15;
                            } else {
                                iArr3[0] = -1;
                            }
                        }
                        this.f31789b1[0].c(Math.max(this.f31791d1[0], 0), this.f31788a1, true);
                        int i16 = 0;
                        while (true) {
                            RLottieNative[] rLottieNativeArr2 = this.f31792e1;
                            if (i16 >= rLottieNativeArr2.length) {
                                break;
                            }
                            RLottieNative rLottieNative2 = rLottieNativeArr2[i16];
                            int i17 = this.f31794g1[i16];
                            if (i17 < 0) {
                                i17 = this.f31793f1[i16] - 1;
                            }
                            rLottieNative2.c(i17, this.f31788a1, false);
                            if (!this.K) {
                                int[] iArr4 = this.f31794g1;
                                int i18 = iArr4[i16] + 1;
                                if (i18 < this.f31793f1[i16]) {
                                    iArr4[i16] = i18;
                                } else {
                                    iArr4[i16] = -1;
                                }
                            }
                            i16++;
                        }
                        int c3 = this.f31789b1[4].c(this.f31791d1[4], this.f31788a1, false);
                        int[] iArr5 = this.f31791d1;
                        int i19 = iArr5[4] + 1;
                        if (i19 < this.f31790c1[4]) {
                            iArr5[4] = i19;
                        }
                        int[] iArr6 = this.f31794g1;
                        if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                            this.K = true;
                            this.J++;
                        }
                        int i20 = this.X0;
                        int i21 = this.Z0;
                        if (i20 == i21 && i21 == this.Y0) {
                            if (this.f31794g1[0] == this.f31793f1[0] - 100) {
                                this.f31795h1 = true;
                                if (i20 == 5) {
                                    WeakReference weakReference = this.D;
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
                            this.f31791d1[0] = -1;
                        }
                        i10 = c3;
                    }
                    if (i10 >= 0) {
                        Utilities.copyBitmaps(this.f31788a1, this.P);
                        this.O = this.P;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            return 1;
        }
        return 2;
    }
}
