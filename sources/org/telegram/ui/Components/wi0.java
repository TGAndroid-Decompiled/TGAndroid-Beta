package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public class wi0 extends yi0 {
    public volatile RLottieNative U0;
    public boolean V0;
    public boolean W0;
    public volatile boolean X0;
    public boolean Y0;
    public final int Z0;
    public int f29682a1;

    public wi0(String str, int i10, int i11) {
        super(i10, i11);
        String str2;
        this.Z0 = -1;
        this.K = 1;
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
        this.f30235n0 = RLottieNative.b(str2, this.e, null, null);
    }

    @Override
    public int B(Bitmap bitmap, boolean z10) {
        RLottieNative rLottieNative;
        int i10 = this.K;
        if (i10 == 1) {
            rLottieNative = this.f30235n0;
        } else if (i10 == 2) {
            rLottieNative = this.U0;
            if (this.X0) {
                this.f30221b0 = this.f29682a1 - 1;
            }
        } else {
            rLottieNative = this.f30235n0;
        }
        if (rLottieNative.c(this.f30221b0, bitmap, z10) < 0) {
            return 2;
        }
        return 1;
    }

    @Override
    public void C(boolean z10) {
        this.f30233l0 = false;
        this.m0 = true;
        n();
        l();
        if (!this.Y0 && !this.V0) {
            if (this.Q == null && !this.f30252z0) {
                D(z10);
                yf.e eVar = this.D0;
                if (eVar != null) {
                    RandomAccessFile randomAccessFile = eVar.f46834s;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        eVar.f46834s = null;
                    }
                    eVar.f46833r = true;
                    this.D0 = null;
                }
                E();
                return;
            }
            this.W = true;
            return;
        }
        this.W0 = true;
    }

    @Override
    public final void D(boolean z10) {
        RLottieNative rLottieNative = this.f30235n0;
        RLottieNative rLottieNative2 = this.U0;
        this.f30235n0 = null;
        this.U0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        ny nyVar = new ny(22, rLottieNative, rLottieNative2);
        if (z10) {
            DispatchQueuePoolBackground.execute(nyVar);
        } else {
            Utilities.globalQueue.postRunnable(nyVar);
        }
    }

    @Override
    public void i() {
        int i10 = this.K;
        if (i10 == 1) {
            int i11 = this.f30221b0 + 1;
            int i12 = this.Z0;
            if (i12 == -1) {
                i12 = this.e[0];
            }
            if (i11 < i12) {
                this.f30221b0 = i11;
                return;
            }
            this.f30221b0 = 0;
            this.O = false;
            if (this.U0 != null) {
                this.K = 2;
            }
            if (this.f30250y) {
                this.f30248x = null;
                this.f30250y = false;
            }
        } else if (i10 == 2) {
            int i13 = this.f30221b0 + 1;
            if (i13 < this.f29682a1) {
                this.f30221b0 = i13;
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
        if (this.f30235n0 == null || (this.K == 2 && this.U0 == null)) {
            return 2;
        }
        return 1;
    }

    @Override
    public void p() {
        if (this.W) {
            n();
            if (this.Q == null && this.f30235n0 != null) {
                D(true);
            }
        }
        if (this.f30235n0 == null && this.U0 == null && this.D0 == null) {
            E();
            return;
        }
        this.U = true;
        if (!v()) {
            stop();
        }
        if (this.f30233l0) {
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
