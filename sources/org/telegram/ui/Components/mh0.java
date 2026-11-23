package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.Utilities;
public class mh0 extends oh0 {
    public volatile RLottieNative V0;
    public boolean W0;
    public boolean X0;
    public volatile boolean Y0;
    public boolean Z0;
    public final int f37517a1;
    public int f37518b1;

    public mh0(String str, int i7, int i10) {
        super(i7, i10);
        String str2;
        this.f37517a1 = -1;
        this.K = 1;
        if ("🎲".equals(str)) {
            str2 = org.telegram.messenger.g0.y2(null, 2131623999);
            this.f37517a1 = 60;
        } else if ("🎯".equals(str)) {
            str2 = org.telegram.messenger.g0.y2(null, 2131623996);
        } else {
            str2 = null;
        }
        getPaint().setFlags(2);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f38222n0 = RLottieNative.b(str2, this.f38211e, null, null);
    }

    @Override
    public int B(Bitmap bitmap, boolean z10) {
        RLottieNative rLottieNative;
        int i7 = this.K;
        if (i7 == 1) {
            rLottieNative = this.f38222n0;
        } else if (i7 == 2) {
            rLottieNative = this.V0;
            if (this.Y0) {
                this.f38207b0 = this.f37518b1 - 1;
            }
        } else {
            rLottieNative = this.f38222n0;
        }
        if (rLottieNative.c(this.f38207b0, bitmap, z10) < 0) {
            return 2;
        }
        return 1;
    }

    @Override
    public void C(boolean z10) {
        this.f38220l0 = false;
        this.m0 = true;
        n();
        l();
        if (!this.Z0 && !this.W0) {
            if (this.Q == null && !this.f38238y0) {
                D(z10);
                bg.i iVar = this.C0;
                if (iVar != null) {
                    RandomAccessFile randomAccessFile = iVar.f3284s;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                        iVar.f3284s = null;
                    }
                    iVar.f3283r = true;
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
        RLottieNative rLottieNative = this.f38222n0;
        RLottieNative rLottieNative2 = this.V0;
        this.f38222n0 = null;
        this.V0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        ou ouVar = new ou(27, rLottieNative, rLottieNative2);
        if (z10) {
            org.telegram.messenger.s5.a(ouVar);
        } else {
            Utilities.f22810e.c(ouVar);
        }
    }

    @Override
    public void i() {
        int i7 = this.K;
        if (i7 == 1) {
            int i10 = this.f38207b0 + 1;
            int i11 = this.f37517a1;
            if (i11 == -1) {
                i11 = this.f38211e[0];
            }
            if (i10 < i11) {
                this.f38207b0 = i10;
                return;
            }
            this.f38207b0 = 0;
            this.O = false;
            if (this.V0 != null) {
                this.K = 2;
            }
            if (this.E) {
                this.f38237y = null;
                this.E = false;
            }
        } else if (i7 == 2) {
            int i12 = this.f38207b0 + 1;
            if (i12 < this.f37518b1) {
                this.f38207b0 = i12;
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
        if (this.f38222n0 == null || (this.K == 2 && this.V0 == null)) {
            return 2;
        }
        return 1;
    }

    @Override
    public void p() {
        if (this.W) {
            n();
            if (this.Q == null && this.f38222n0 != null) {
                D(true);
            }
        }
        if (this.f38222n0 == null && this.V0 == null && this.C0 == null) {
            E();
            return;
        }
        this.U = true;
        if (!v()) {
            stop();
        }
        if (this.f38220l0) {
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
