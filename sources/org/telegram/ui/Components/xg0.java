package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.Utilities;
public class xg0 extends zg0 {
    public volatile RLottieNative U0;
    public boolean V0;
    public boolean W0;
    public volatile boolean X0;
    public boolean Y0;
    public final int Z0;
    public int f40314a1;

    public xg0(String str, int i7, int i10) {
        super(i7, i10);
        String str2;
        this.Z0 = -1;
        this.J = 1;
        if ("🎲".equals(str)) {
            str2 = org.telegram.messenger.g0.y2(null, 2131623998);
            this.Z0 = 60;
        } else if ("🎯".equals(str)) {
            str2 = org.telegram.messenger.g0.y2(null, 2131623995);
        } else {
            str2 = null;
        }
        getPaint().setFlags(2);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.m0 = RLottieNative.b(str2, this.f40995e, null, null);
    }

    @Override
    public int B(Bitmap bitmap, boolean z9) {
        RLottieNative rLottieNative;
        int i7 = this.J;
        if (i7 == 1) {
            rLottieNative = this.m0;
        } else if (i7 == 2) {
            rLottieNative = this.U0;
            if (this.X0) {
                this.f40989a0 = this.f40314a1 - 1;
            }
        } else {
            rLottieNative = this.m0;
        }
        if (rLottieNative.c(this.f40989a0, bitmap, z9) < 0) {
            return 2;
        }
        return 1;
    }

    @Override
    public void C(boolean z9) {
        this.f41003k0 = false;
        this.f41004l0 = true;
        n();
        l();
        if (!this.Y0 && !this.V0) {
            if (this.P == null && !this.f41020x0) {
                D(z9);
                bg.i iVar = this.B0;
                if (iVar != null) {
                    RandomAccessFile randomAccessFile = iVar.f3316s;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                        iVar.f3316s = null;
                    }
                    iVar.f3315r = true;
                    this.B0 = null;
                }
                E();
                return;
            }
            this.V = true;
            return;
        }
        this.W0 = true;
    }

    @Override
    public final void D(boolean z9) {
        RLottieNative rLottieNative = this.m0;
        RLottieNative rLottieNative2 = this.U0;
        this.m0 = null;
        this.U0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        v80 v80Var = new v80(5, rLottieNative, rLottieNative2);
        if (z9) {
            org.telegram.messenger.r5.a(v80Var);
        } else {
            Utilities.f21336e.c(v80Var);
        }
    }

    @Override
    public void i() {
        int i7 = this.J;
        if (i7 == 1) {
            int i10 = this.f40989a0 + 1;
            int i11 = this.Z0;
            if (i11 == -1) {
                i11 = this.f40995e[0];
            }
            if (i10 < i11) {
                this.f40989a0 = i10;
                return;
            }
            this.f40989a0 = 0;
            this.N = false;
            if (this.U0 != null) {
                this.J = 2;
            }
            if (this.D) {
                this.f41021y = null;
                this.D = false;
            }
        } else if (i7 == 2) {
            int i12 = this.f40989a0 + 1;
            if (i12 < this.f40314a1) {
                this.f40989a0 = i12;
                return;
            }
            this.N = true;
            this.M++;
        }
    }

    @Override
    public int j() {
        if (this.f41004l0) {
            return 3;
        }
        if (this.m0 == null || (this.J == 2 && this.U0 == null)) {
            return 2;
        }
        return 1;
    }

    @Override
    public void p() {
        if (this.V) {
            n();
            if (this.P == null && this.m0 != null) {
                D(true);
            }
        }
        if (this.m0 == null && this.U0 == null && this.B0 == null) {
            E();
            return;
        }
        this.T = true;
        if (!v()) {
            stop();
        }
        if (this.f41003k0) {
            I();
        }
    }

    @Override
    public final boolean w() {
        return this.Y0;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
