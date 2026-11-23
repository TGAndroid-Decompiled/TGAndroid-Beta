package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.Utilities;
public class lh0 extends nh0 {
    public volatile RLottieNative V0;
    public boolean W0;
    public boolean X0;
    public volatile boolean Y0;
    public boolean Z0;
    public final int f37132a1;
    public int f37133b1;

    public lh0(String str, int i7, int i10) {
        super(i7, i10);
        String str2;
        this.f37132a1 = -1;
        this.K = 1;
        if ("🎲".equals(str)) {
            str2 = org.telegram.messenger.g0.y2(null, 2131623999);
            this.f37132a1 = 60;
        } else if ("🎯".equals(str)) {
            str2 = org.telegram.messenger.g0.y2(null, 2131623996);
        } else {
            str2 = null;
        }
        getPaint().setFlags(2);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f37816n0 = RLottieNative.b(str2, this.f37805e, null, null);
    }

    @Override
    public int B(Bitmap bitmap, boolean z10) {
        RLottieNative rLottieNative;
        int i7 = this.K;
        if (i7 == 1) {
            rLottieNative = this.f37816n0;
        } else if (i7 == 2) {
            rLottieNative = this.V0;
            if (this.Y0) {
                this.f37801b0 = this.f37133b1 - 1;
            }
        } else {
            rLottieNative = this.f37816n0;
        }
        if (rLottieNative.c(this.f37801b0, bitmap, z10) < 0) {
            return 2;
        }
        return 1;
    }

    @Override
    public void C(boolean z10) {
        this.f37814l0 = false;
        this.m0 = true;
        n();
        l();
        if (!this.Z0 && !this.W0) {
            if (this.Q == null && !this.f37832y0) {
                D(z10);
                bg.i iVar = this.C0;
                if (iVar != null) {
                    RandomAccessFile randomAccessFile = iVar.f3235s;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                        iVar.f3235s = null;
                    }
                    iVar.f3234r = true;
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
        RLottieNative rLottieNative = this.f37816n0;
        RLottieNative rLottieNative2 = this.V0;
        this.f37816n0 = null;
        this.V0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        bt btVar = new bt(29, rLottieNative, rLottieNative2);
        if (z10) {
            org.telegram.messenger.s5.a(btVar);
        } else {
            Utilities.f22877e.c(btVar);
        }
    }

    @Override
    public void i() {
        int i7 = this.K;
        if (i7 == 1) {
            int i10 = this.f37801b0 + 1;
            int i11 = this.f37132a1;
            if (i11 == -1) {
                i11 = this.f37805e[0];
            }
            if (i10 < i11) {
                this.f37801b0 = i10;
                return;
            }
            this.f37801b0 = 0;
            this.O = false;
            if (this.V0 != null) {
                this.K = 2;
            }
            if (this.E) {
                this.f37831y = null;
                this.E = false;
            }
        } else if (i7 == 2) {
            int i12 = this.f37801b0 + 1;
            if (i12 < this.f37133b1) {
                this.f37801b0 = i12;
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
        if (this.f37816n0 == null || (this.K == 2 && this.V0 == null)) {
            return 2;
        }
        return 1;
    }

    @Override
    public void p() {
        if (this.W) {
            n();
            if (this.Q == null && this.f37816n0 != null) {
                D(true);
            }
        }
        if (this.f37816n0 == null && this.V0 == null && this.C0 == null) {
            E();
            return;
        }
        this.U = true;
        if (!v()) {
            stop();
        }
        if (this.f37814l0) {
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
