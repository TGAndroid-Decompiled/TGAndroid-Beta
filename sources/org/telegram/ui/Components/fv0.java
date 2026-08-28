package org.telegram.ui.Components;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class fv0 extends ii0 {
    public int X0;
    public int Y0;
    public int Z0;
    public Bitmap f28578a1;
    public final RLottieNative[] f28579b1;
    public final int[] f28580c1;
    public final int[] f28581d1;
    public final RLottieNative[] f28582e1;
    public final int[] f28583f1;
    public final int[] f28584g1;
    public boolean f28585h1;

    public fv0(String str, int i9, int i10) {
        super(str, i9, i10);
        this.f28579b1 = new RLottieNative[5];
        this.f28580c1 = new int[5];
        this.f28581d1 = new int[5];
        this.f28582e1 = new RLottieNative[3];
        this.f28583f1 = new int[3];
        this.f28584g1 = new int[3];
    }

    public static int U(int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == 1) {
            return 2;
        }
        if (i9 != 2) {
            return 4;
        }
        return 3;
    }

    @Override
    public final void A(boolean z10) {
        this.f30852h0 = false;
        this.f30853i0 = true;
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
        int i9 = 0;
        int i10 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.f28579b1;
            if (i10 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i10];
            if (rLottieNative != null) {
                if (z10 && rLottieNative == this.f30854j0) {
                    this.f30854j0 = null;
                }
                this.f28579b1[i10].d();
                this.f28579b1[i10] = null;
            }
            i10++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.f28582e1;
            if (i9 < rLottieNativeArr2.length) {
                RLottieNative rLottieNative2 = rLottieNativeArr2[i9];
                if (rLottieNative2 != null) {
                    if (z10 && rLottieNative2 == this.Q0) {
                        this.Q0 = null;
                    }
                    this.f28582e1[i9].d();
                    this.f28582e1[i9] = null;
                }
                i9++;
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
        if (this.f30854j0 == null && this.Q0 == null) {
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
        if (this.f30853i0) {
            return 3;
        }
        if (this.f30854j0 != null && (this.G != 2 || this.Q0 != null)) {
            if (this.f28578a1 == null) {
                try {
                    this.f28578a1 = Bitmap.createBitmap(this.f30842b, this.f30844c, Bitmap.Config.ARGB_8888);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (this.P == null) {
                try {
                    this.P = Bitmap.createBitmap(this.f30842b, this.f30844c, Bitmap.Config.ARGB_8888);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.P != null && this.f28578a1 != null) {
                try {
                    int i9 = -1;
                    if (this.G == 1) {
                        int i10 = 0;
                        while (true) {
                            RLottieNative[] rLottieNativeArr = this.f28579b1;
                            if (i10 >= rLottieNativeArr.length) {
                                break;
                            }
                            RLottieNative rLottieNative = rLottieNativeArr[i10];
                            int i11 = this.f28581d1[i10];
                            Bitmap bitmap = this.f28578a1;
                            if (i10 == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            i9 = rLottieNative.c(i11, bitmap, z10);
                            if (i10 != 0) {
                                int[] iArr = this.f28581d1;
                                int i12 = iArr[i10] + 1;
                                if (i12 < this.f28580c1[i10]) {
                                    iArr[i10] = i12;
                                } else if (i10 != 4) {
                                    iArr[i10] = 0;
                                    this.K = false;
                                    if (this.Q0 != null) {
                                        this.G = 2;
                                    }
                                }
                            }
                            i10++;
                        }
                    } else {
                        if (this.T0) {
                            int i13 = 0;
                            while (true) {
                                int[] iArr2 = this.f28584g1;
                                if (i13 >= iArr2.length) {
                                    break;
                                }
                                iArr2[i13] = this.f28583f1[i13] - 1;
                                i13++;
                            }
                        }
                        if (this.f28585h1) {
                            int[] iArr3 = this.f28581d1;
                            int i14 = iArr3[0] + 1;
                            if (i14 < this.f28580c1[0]) {
                                iArr3[0] = i14;
                            } else {
                                iArr3[0] = -1;
                            }
                        }
                        this.f28579b1[0].c(Math.max(this.f28581d1[0], 0), this.f28578a1, true);
                        int i15 = 0;
                        while (true) {
                            RLottieNative[] rLottieNativeArr2 = this.f28582e1;
                            if (i15 >= rLottieNativeArr2.length) {
                                break;
                            }
                            RLottieNative rLottieNative2 = rLottieNativeArr2[i15];
                            int i16 = this.f28584g1[i15];
                            if (i16 < 0) {
                                i16 = this.f28583f1[i15] - 1;
                            }
                            rLottieNative2.c(i16, this.f28578a1, false);
                            if (!this.K) {
                                int[] iArr4 = this.f28584g1;
                                int i17 = iArr4[i15] + 1;
                                if (i17 < this.f28583f1[i15]) {
                                    iArr4[i15] = i17;
                                } else {
                                    iArr4[i15] = -1;
                                }
                            }
                            i15++;
                        }
                        int c10 = this.f28579b1[4].c(this.f28581d1[4], this.f28578a1, false);
                        int[] iArr5 = this.f28581d1;
                        int i18 = iArr5[4] + 1;
                        if (i18 < this.f28580c1[4]) {
                            iArr5[4] = i18;
                        }
                        int[] iArr6 = this.f28584g1;
                        if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                            this.K = true;
                            this.J++;
                        }
                        int i19 = this.X0;
                        int i20 = this.Z0;
                        if (i19 == i20 && i20 == this.Y0) {
                            if (this.f28584g1[0] == this.f28583f1[0] - 100) {
                                this.f28585h1 = true;
                                if (i19 == 5) {
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
                            this.f28581d1[0] = -1;
                        }
                        i9 = c10;
                    }
                    if (i9 >= 0) {
                        Utilities.copyBitmaps(this.f28578a1, this.P);
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
