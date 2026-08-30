package org.telegram.ui.Components;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class yv0 extends cj0 {
    public int Y0;
    public int Z0;
    public int f31164a1;
    public Bitmap f31165b1;
    public final RLottieNative[] f31166c1;
    public final int[] f31167d1;
    public final int[] f31168e1;
    public final RLottieNative[] f31169f1;
    public final int[] f31170g1;
    public final int[] f31171h1;
    public boolean f31172i1;

    public yv0(String str, int i10, int i11) {
        super(str, i10, i11);
        this.f31166c1 = new RLottieNative[5];
        this.f31167d1 = new int[5];
        this.f31168e1 = new int[5];
        this.f31169f1 = new RLottieNative[3];
        this.f31170g1 = new int[3];
        this.f31171h1 = new int[3];
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
    public final void A(boolean z4) {
        this.f25158i0 = false;
        this.f25159j0 = true;
        l();
        j();
        if (!this.V0 && !this.S0) {
            if (this.N == null) {
                T(true);
                C();
                return;
            }
            this.T = true;
            return;
        }
        this.T0 = true;
    }

    public final void T(boolean z4) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.f31166c1;
            if (i11 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i11];
            if (rLottieNative != null) {
                if (z4 && rLottieNative == this.f25160k0) {
                    this.f25160k0 = null;
                }
                this.f31166c1[i11].d();
                this.f31166c1[i11] = null;
            }
            i11++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.f31169f1;
            if (i10 < rLottieNativeArr2.length) {
                RLottieNative rLottieNative2 = rLottieNativeArr2[i10];
                if (rLottieNative2 != null) {
                    if (z4 && rLottieNative2 == this.R0) {
                        this.R0 = null;
                    }
                    this.f31169f1[i10].d();
                    this.f31169f1[i10] = null;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void n() {
        if (this.T) {
            l();
            if (this.N == null) {
                T(false);
            }
        }
        if (this.f25160k0 == null && this.R0 == null) {
            C();
            return;
        }
        this.R = true;
        if (!t()) {
            stop();
        }
        G();
    }

    @Override
    public final int z() {
        Runnable runnable;
        boolean z4;
        if (this.f25159j0) {
            return 3;
        }
        if (this.f25160k0 != null && (this.H != 2 || this.R0 != null)) {
            if (this.f31165b1 == null) {
                try {
                    this.f31165b1 = Bitmap.createBitmap(this.f25148b, this.f25150c, Bitmap.Config.ARGB_8888);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.Q == null) {
                try {
                    this.Q = Bitmap.createBitmap(this.f25148b, this.f25150c, Bitmap.Config.ARGB_8888);
                } catch (Throwable th3) {
                    FileLog.e(th3);
                }
            }
            if (this.Q != null && this.f31165b1 != null) {
                try {
                    int i10 = -1;
                    if (this.H == 1) {
                        int i11 = 0;
                        while (true) {
                            RLottieNative[] rLottieNativeArr = this.f31166c1;
                            if (i11 >= rLottieNativeArr.length) {
                                break;
                            }
                            RLottieNative rLottieNative = rLottieNativeArr[i11];
                            int i12 = this.f31168e1[i11];
                            Bitmap bitmap = this.f31165b1;
                            if (i11 == 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            i10 = rLottieNative.c(i12, bitmap, z4);
                            if (i11 != 0) {
                                int[] iArr = this.f31168e1;
                                int i13 = iArr[i11] + 1;
                                if (i13 < this.f31167d1[i11]) {
                                    iArr[i11] = i13;
                                } else if (i11 != 4) {
                                    iArr[i11] = 0;
                                    this.L = false;
                                    if (this.R0 != null) {
                                        this.H = 2;
                                    }
                                }
                            }
                            i11++;
                        }
                    } else {
                        if (this.U0) {
                            int i14 = 0;
                            while (true) {
                                int[] iArr2 = this.f31171h1;
                                if (i14 >= iArr2.length) {
                                    break;
                                }
                                iArr2[i14] = this.f31170g1[i14] - 1;
                                i14++;
                            }
                        }
                        if (this.f31172i1) {
                            int[] iArr3 = this.f31168e1;
                            int i15 = iArr3[0] + 1;
                            if (i15 < this.f31167d1[0]) {
                                iArr3[0] = i15;
                            } else {
                                iArr3[0] = -1;
                            }
                        }
                        this.f31166c1[0].c(Math.max(this.f31168e1[0], 0), this.f31165b1, true);
                        int i16 = 0;
                        while (true) {
                            RLottieNative[] rLottieNativeArr2 = this.f31169f1;
                            if (i16 >= rLottieNativeArr2.length) {
                                break;
                            }
                            RLottieNative rLottieNative2 = rLottieNativeArr2[i16];
                            int i17 = this.f31171h1[i16];
                            if (i17 < 0) {
                                i17 = this.f31170g1[i16] - 1;
                            }
                            rLottieNative2.c(i17, this.f31165b1, false);
                            if (!this.L) {
                                int[] iArr4 = this.f31171h1;
                                int i18 = iArr4[i16] + 1;
                                if (i18 < this.f31170g1[i16]) {
                                    iArr4[i16] = i18;
                                } else {
                                    iArr4[i16] = -1;
                                }
                            }
                            i16++;
                        }
                        int c3 = this.f31166c1[4].c(this.f31168e1[4], this.f31165b1, false);
                        int[] iArr5 = this.f31168e1;
                        int i19 = iArr5[4] + 1;
                        if (i19 < this.f31167d1[4]) {
                            iArr5[4] = i19;
                        }
                        int[] iArr6 = this.f31171h1;
                        if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                            this.L = true;
                            this.K++;
                        }
                        int i20 = this.Y0;
                        int i21 = this.f31164a1;
                        if (i20 == i21 && i21 == this.Z0) {
                            if (this.f31171h1[0] == this.f31170g1[0] - 100) {
                                this.f31172i1 = true;
                                if (i20 == 5) {
                                    WeakReference weakReference = this.E;
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
                            this.f31168e1[0] = -1;
                        }
                        i10 = c3;
                    }
                    if (i10 >= 0) {
                        Utilities.copyBitmaps(this.f31165b1, this.Q);
                        this.P = this.Q;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            return 1;
        }
        return 2;
    }
}
