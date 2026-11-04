package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.Utilities;
public class ah0 extends ch0 {
    public volatile RLottieNative V0;
    public boolean W0;
    public boolean X0;
    public volatile boolean Y0;
    public boolean Z0;
    public final int f31846a1;
    public int f31847b1;

    public ah0(String str, int i3, int i10) {
        super(i3, i10);
        String str2;
        this.f31846a1 = -1;
        this.K = 1;
        if ("🎲".equals(str)) {
            str2 = org.telegram.messenger.g0.y2(null, 2131623998);
            this.f31846a1 = 60;
        } else if ("🎯".equals(str)) {
            str2 = org.telegram.messenger.g0.y2(null, 2131623995);
        } else {
            str2 = null;
        }
        getPaint().setFlags(2);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f32736n0 = RLottieNative.b(str2, this.f32725e, null, null);
    }

    @Override
    public int B(Bitmap bitmap, boolean z10) {
        RLottieNative rLottieNative;
        int i3 = this.K;
        if (i3 == 1) {
            rLottieNative = this.f32736n0;
        } else if (i3 == 2) {
            rLottieNative = this.V0;
            if (this.Y0) {
                this.f32721b0 = this.f31847b1 - 1;
            }
        } else {
            rLottieNative = this.f32736n0;
        }
        if (rLottieNative.c(this.f32721b0, bitmap, z10) < 0) {
            return 2;
        }
        return 1;
    }

    @Override
    public void C(boolean z10) {
        this.f32734l0 = false;
        this.m0 = true;
        n();
        l();
        if (!this.Z0 && !this.W0) {
            if (this.Q == null && !this.f32752y0) {
                D(z10);
                cg.h hVar = this.C0;
                if (hVar != null) {
                    RandomAccessFile randomAccessFile = hVar.f4681s;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                        hVar.f4681s = null;
                    }
                    hVar.f4680r = true;
                    this.C0 = null;
                }
                E();
                return;
            }
            this.W = true;
            return;
        }
        this.X0 = true;
    }

    @Override
    public final void D(boolean z10) {
        RLottieNative rLottieNative = this.f32736n0;
        RLottieNative rLottieNative2 = this.V0;
        this.f32736n0 = null;
        this.V0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        j50 j50Var = new j50(10, rLottieNative, rLottieNative2);
        if (z10) {
            org.telegram.messenger.r5.a(j50Var);
        } else {
            Utilities.f21387e.c(j50Var);
        }
    }

    @Override
    public void i() {
        int i3 = this.K;
        if (i3 == 1) {
            int i10 = this.f32721b0 + 1;
            int i11 = this.f31846a1;
            if (i11 == -1) {
                i11 = this.f32725e[0];
            }
            if (i10 < i11) {
                this.f32721b0 = i10;
                return;
            }
            this.f32721b0 = 0;
            this.O = false;
            if (this.V0 != null) {
                this.K = 2;
            }
            if (this.E) {
                this.f32751y = null;
                this.E = false;
            }
        } else if (i3 == 2) {
            int i12 = this.f32721b0 + 1;
            if (i12 < this.f31847b1) {
                this.f32721b0 = i12;
                return;
            }
            this.O = true;
            this.N++;
        }
    }

    @Override
    public int j() {
        if (this.m0) {
            return 3;
        }
        if (this.f32736n0 == null || (this.K == 2 && this.V0 == null)) {
            return 2;
        }
        return 1;
    }

    @Override
    public void p() {
        if (this.W) {
            n();
            if (this.Q == null && this.f32736n0 != null) {
                D(true);
            }
        }
        if (this.f32736n0 == null && this.V0 == null && this.C0 == null) {
            E();
            return;
        }
        this.U = true;
        if (!v()) {
            stop();
        }
        if (this.f32734l0) {
            I();
        }
    }

    @Override
    public final boolean w() {
        return this.Z0;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
