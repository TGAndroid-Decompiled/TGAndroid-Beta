package org.telegram.ui.Components;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

public final class hv0 extends ki0 {
    public int X0;
    public int Y0;
    public int Z0;

    public Bitmap f29166a1;

    public final RLottieNative[] f29167b1;

    public final int[] f29168c1;

    public final int[] f29169d1;

    public final RLottieNative[] f29170e1;

    public final int[] f29171f1;

    public final int[] f29172g1;

    public boolean f29173h1;

    public hv0(String str, int i10, int i11) {
        super(str, i10, i11);
        this.f29167b1 = new RLottieNative[5];
        this.f29168c1 = new int[5];
        this.f29169d1 = new int[5];
        this.f29170e1 = new RLottieNative[3];
        this.f29171f1 = new int[3];
        this.f29172g1 = new int[3];
    }

    public static int U(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 != 1) {
            return i10 != 2 ? 4 : 3;
        }
        return 2;
    }

    @Override
    public final void A(boolean z10) {
        this.f31317h0 = false;
        this.f31318i0 = true;
        l();
        j();
        if (this.U0 || this.R0) {
            this.S0 = true;
        } else if (this.M != null) {
            this.S = true;
        } else {
            T(true);
            C();
        }
    }

    public final void T(boolean z10) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.f29167b1;
            if (i11 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i11];
            if (rLottieNative != null) {
                if (z10 && rLottieNative == this.f31319j0) {
                    this.f31319j0 = null;
                }
                this.f29167b1[i11].d();
                this.f29167b1[i11] = null;
            }
            i11++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.f29170e1;
            if (i10 >= rLottieNativeArr2.length) {
                return;
            }
            RLottieNative rLottieNative2 = rLottieNativeArr2[i10];
            if (rLottieNative2 != null) {
                if (z10 && rLottieNative2 == this.Q0) {
                    this.Q0 = null;
                }
                this.f29170e1[i10].d();
                this.f29170e1[i10] = null;
            }
            i10++;
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
        if (this.f31319j0 == null && this.Q0 == null) {
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
        if (this.f31318i0) {
            return 3;
        }
        if (this.f31319j0 != null && (this.G != 2 || this.Q0 != null)) {
            if (this.f29166a1 == null) {
                try {
                    this.f29166a1 = Bitmap.createBitmap(this.f31307b, this.f31309c, Bitmap.Config.ARGB_8888);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (this.P == null) {
                try {
                    this.P = Bitmap.createBitmap(this.f31307b, this.f31309c, Bitmap.Config.ARGB_8888);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.P != null && this.f29166a1 != null) {
                try {
                    int iC = -1;
                    if (this.G == 1) {
                        int i10 = 0;
                        while (true) {
                            RLottieNative[] rLottieNativeArr = this.f29167b1;
                            if (i10 >= rLottieNativeArr.length) {
                                break;
                            }
                            iC = rLottieNativeArr[i10].c(this.f29169d1[i10], this.f29166a1, i10 == 0);
                            if (i10 != 0) {
                                int[] iArr = this.f29169d1;
                                int i11 = iArr[i10] + 1;
                                if (i11 < this.f29168c1[i10]) {
                                    iArr[i10] = i11;
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
                            int i12 = 0;
                            while (true) {
                                int[] iArr2 = this.f29172g1;
                                if (i12 >= iArr2.length) {
                                    break;
                                }
                                iArr2[i12] = this.f29171f1[i12] - 1;
                                i12++;
                            }
                        }
                        if (this.f29173h1) {
                            int[] iArr3 = this.f29169d1;
                            int i13 = iArr3[0] + 1;
                            if (i13 < this.f29168c1[0]) {
                                iArr3[0] = i13;
                            } else {
                                iArr3[0] = -1;
                            }
                        }
                        this.f29167b1[0].c(Math.max(this.f29169d1[0], 0), this.f29166a1, true);
                        int i14 = 0;
                        while (true) {
                            RLottieNative[] rLottieNativeArr2 = this.f29170e1;
                            if (i14 >= rLottieNativeArr2.length) {
                                break;
                            }
                            RLottieNative rLottieNative = rLottieNativeArr2[i14];
                            int i15 = this.f29172g1[i14];
                            if (i15 < 0) {
                                i15 = this.f29171f1[i14] - 1;
                            }
                            rLottieNative.c(i15, this.f29166a1, false);
                            if (!this.K) {
                                int[] iArr4 = this.f29172g1;
                                int i16 = iArr4[i14] + 1;
                                if (i16 < this.f29171f1[i14]) {
                                    iArr4[i14] = i16;
                                } else {
                                    iArr4[i14] = -1;
                                }
                            }
                            i14++;
                        }
                        int iC2 = this.f29167b1[4].c(this.f29169d1[4], this.f29166a1, false);
                        int[] iArr5 = this.f29169d1;
                        int i17 = iArr5[4] + 1;
                        if (i17 < this.f29168c1[4]) {
                            iArr5[4] = i17;
                        }
                        int[] iArr6 = this.f29172g1;
                        if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                            this.K = true;
                            this.J++;
                        }
                        int i18 = this.X0;
                        int i19 = this.Z0;
                        if (i18 != i19 || i19 != this.Y0) {
                            this.f29169d1[0] = -1;
                        } else if (this.f29172g1[0] == this.f29171f1[0] - 100) {
                            this.f29173h1 = true;
                            if (i18 == 5) {
                                WeakReference weakReference = this.D;
                                Runnable runnable = weakReference == null ? null : (Runnable) weakReference.get();
                                if (runnable != null) {
                                    AndroidUtilities.runOnUIThread(runnable);
                                }
                            }
                        }
                        iC = iC2;
                    }
                    if (iC >= 0) {
                        Utilities.copyBitmaps(this.f29166a1, this.P);
                        this.O = this.P;
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
            return 1;
        }
        return 2;
    }
}
