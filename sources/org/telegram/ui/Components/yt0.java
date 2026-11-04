package org.telegram.ui.Components;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Utilities;
public final class yt0 extends ah0 {
    public int f40825c1;
    public int f40826d1;
    public int f40827e1;
    public Bitmap f40828f1;
    public final RLottieNative[] f40829g1;
    public final int[] f40830h1;
    public final int[] f40831i1;
    public final RLottieNative[] f40832j1;
    public final int[] k1;
    public final int[] f40833l1;
    public boolean m1;

    public yt0(String str, int i3, int i10) {
        super(str, i3, i10);
        this.f40829g1 = new RLottieNative[5];
        this.f40830h1 = new int[5];
        this.f40831i1 = new int[5];
        this.f40832j1 = new RLottieNative[3];
        this.k1 = new int[3];
        this.f40833l1 = new int[3];
    }

    public static int X(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return 2;
        }
        if (i3 != 2) {
            return 4;
        }
        return 3;
    }

    @Override
    public final int B(Bitmap bitmap, boolean z10) {
        Runnable runnable;
        boolean z11;
        if (this.f40828f1 == null) {
            try {
                this.f40828f1 = Bitmap.createBitmap(this.f32720b, this.f32722c, Bitmap.Config.ARGB_8888);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
                return 2;
            }
        }
        int i3 = -1;
        if (this.K == 1) {
            int i10 = 0;
            while (true) {
                RLottieNative[] rLottieNativeArr = this.f40829g1;
                if (i10 >= rLottieNativeArr.length) {
                    break;
                }
                RLottieNative rLottieNative = rLottieNativeArr[i10];
                int i11 = this.f40831i1[i10];
                Bitmap bitmap2 = this.f40828f1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i3 = rLottieNative.c(i11, bitmap2, z11);
                if (i10 != 0) {
                    int[] iArr = this.f40831i1;
                    int i12 = iArr[i10] + 1;
                    if (i12 < this.f40830h1[i10]) {
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
                    int[] iArr2 = this.f40833l1;
                    if (i13 >= iArr2.length) {
                        break;
                    }
                    iArr2[i13] = this.k1[i13] - 1;
                    i13++;
                }
            }
            if (this.m1) {
                int[] iArr3 = this.f40831i1;
                int i14 = iArr3[0] + 1;
                if (i14 < this.f40830h1[0]) {
                    iArr3[0] = i14;
                } else {
                    iArr3[0] = -1;
                }
            }
            this.f40829g1[0].c(Math.max(this.f40831i1[0], 0), this.f40828f1, true);
            int i15 = 0;
            while (true) {
                RLottieNative[] rLottieNativeArr2 = this.f40832j1;
                if (i15 >= rLottieNativeArr2.length) {
                    break;
                }
                RLottieNative rLottieNative2 = rLottieNativeArr2[i15];
                int i16 = this.f40833l1[i15];
                if (i16 < 0) {
                    i16 = this.k1[i15] - 1;
                }
                rLottieNative2.c(i16, this.f40828f1, false);
                if (!this.O) {
                    int[] iArr4 = this.f40833l1;
                    int i17 = iArr4[i15] + 1;
                    if (i17 < this.k1[i15]) {
                        iArr4[i15] = i17;
                    } else {
                        iArr4[i15] = -1;
                    }
                }
                i15++;
            }
            int c2 = this.f40829g1[4].c(this.f40831i1[4], this.f40828f1, false);
            int[] iArr5 = this.f40831i1;
            int i18 = iArr5[4] + 1;
            if (i18 < this.f40830h1[4]) {
                iArr5[4] = i18;
            }
            int[] iArr6 = this.f40833l1;
            if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                this.O = true;
                this.N++;
            }
            int i19 = this.f40825c1;
            int i20 = this.f40827e1;
            if (i19 == i20 && i20 == this.f40826d1) {
                if (this.f40833l1[0] == this.k1[0] - 100) {
                    this.m1 = true;
                    if (i19 == 5) {
                        WeakReference weakReference = this.I;
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
                this.f40831i1[0] = -1;
            }
            i3 = c2;
        }
        if (i3 < 0) {
            return 2;
        }
        Utilities.copyBitmaps(this.f40828f1, bitmap);
        return 1;
    }

    @Override
    public final void C(boolean z10) {
        this.f32734l0 = false;
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
        int i3 = 0;
        int i10 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.f40829g1;
            if (i10 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i10];
            if (rLottieNative != null) {
                if (z10 && rLottieNative == this.f32736n0) {
                    this.f32736n0 = null;
                }
                this.f40829g1[i10].d();
                this.f40829g1[i10] = null;
            }
            i10++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.f40832j1;
            if (i3 < rLottieNativeArr2.length) {
                RLottieNative rLottieNative2 = rLottieNativeArr2[i3];
                if (rLottieNative2 != null) {
                    if (z10 && rLottieNative2 == this.V0) {
                        this.V0 = null;
                    }
                    this.f40832j1[i3].d();
                    this.f40832j1[i3] = null;
                }
                i3++;
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
        if (this.f32736n0 == null || (this.K == 2 && this.V0 == null)) {
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
        if (this.f32736n0 == null && this.V0 == null) {
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
