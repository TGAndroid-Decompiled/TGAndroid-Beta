package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public class vj0 extends xj0 {
    public volatile RLottieNative U0;
    public boolean V0;
    public boolean W0;
    public volatile boolean X0;
    public boolean Y0;
    public final int Z0;
    public int f33679a1;

    public vj0(String str, int i10, int i11) {
        super(i10, i11);
        String str2;
        this.Z0 = -1;
        this.J = 1;
        if ("🎲".equals(str)) {
            str2 = AndroidUtilities.readRes(R.raw.diceloop);
            this.Z0 = 60;
        } else if ("🎯".equals(str)) {
            str2 = AndroidUtilities.readRes(R.raw.dartloop);
        } else {
            str2 = null;
        }
        getPaint().setFlags(2);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.m0 = RLottieNative.b(str2, this.e, null, null);
    }

    @Override
    public int B(Bitmap bitmap, boolean z10) {
        RLottieNative rLottieNative;
        int i10 = this.J;
        if (i10 == 1) {
            rLottieNative = this.m0;
        } else if (i10 == 2) {
            rLottieNative = this.U0;
            if (this.X0) {
                this.f34736a0 = this.f33679a1 - 1;
            }
        } else {
            rLottieNative = this.m0;
        }
        if (rLottieNative.c(this.f34736a0, bitmap, z10) < 0) {
            return 2;
        }
        return 1;
    }

    @Override
    public void C(boolean z10) {
        this.f34749k0 = false;
        this.f34750l0 = true;
        n();
        l();
        if (!this.Y0 && !this.V0) {
            if (this.P == null && !this.f34766x0) {
                D(z10);
                ag.k kVar = this.B0;
                if (kVar != null) {
                    RandomAccessFile randomAccessFile = kVar.f1326s;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        kVar.f1326s = null;
                    }
                    kVar.f1325r = true;
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
    public final void D(boolean z10) {
        RLottieNative rLottieNative = this.m0;
        RLottieNative rLottieNative2 = this.U0;
        this.m0 = null;
        this.U0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        t90 t90Var = new t90(8, rLottieNative, rLottieNative2);
        if (z10) {
            DispatchQueuePoolBackground.execute(t90Var);
        } else {
            Utilities.globalQueue.postRunnable(t90Var);
        }
    }

    @Override
    public void i() {
        int i10 = this.J;
        if (i10 == 1) {
            int i11 = this.f34736a0 + 1;
            int i12 = this.Z0;
            if (i12 == -1) {
                i12 = this.e[0];
            }
            if (i11 < i12) {
                this.f34736a0 = i11;
                return;
            }
            this.f34736a0 = 0;
            this.N = false;
            if (this.U0 != null) {
                this.J = 2;
            }
            if (this.f34767y) {
                this.f34765x = null;
                this.f34767y = false;
            }
        } else if (i10 == 2) {
            int i13 = this.f34736a0 + 1;
            if (i13 < this.f33679a1) {
                this.f34736a0 = i13;
                return;
            }
            this.N = true;
            this.M++;
        }
    }

    @Override
    public int j() {
        if (this.f34750l0) {
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
        if (this.f34749k0) {
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
