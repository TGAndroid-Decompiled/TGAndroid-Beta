package org.telegram.ui.Components;

import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public class ti0 extends xi0 {
    public volatile RLottieNative Q0;
    public boolean R0;
    public boolean S0;
    public volatile boolean T0;
    public boolean U0;
    public final int V0;
    public int W0;

    public ti0(String str, int i10, int i11) {
        super(i10, i11);
        String str2;
        this.V0 = -1;
        this.G = 1;
        if ("🎲".equals(str)) {
            str2 = AndroidUtilities.readRes(R.raw.diceloop);
            this.V0 = 60;
        } else if ("🎯".equals(str)) {
            str2 = AndroidUtilities.readRes(R.raw.dartloop);
        } else {
            str2 = null;
        }
        getPaint().setFlags(2);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f34744j0 = RLottieNative.b(str2, "dice", this.f34737e, null, null);
    }

    @Override
    public void A(boolean z10) {
        this.f34742h0 = false;
        this.f34743i0 = true;
        l();
        j();
        if (!this.U0 && !this.R0) {
            if (this.M == null && !this.f34758v0) {
                B(z10);
                jf.g gVar = this.f34765z0;
                if (gVar != null) {
                    RandomAccessFile randomAccessFile = gVar.f11610s;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                        gVar.f11610s = null;
                    }
                    gVar.f11609r = true;
                    this.f34765z0 = null;
                }
                C();
                return;
            }
            this.S = true;
            return;
        }
        this.S0 = true;
    }

    @Override
    public final void B(boolean z10) {
        RLottieNative rLottieNative = this.f34744j0;
        RLottieNative rLottieNative2 = this.Q0;
        this.f34744j0 = null;
        this.Q0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        ii0 ii0Var = new ii0(1, rLottieNative, rLottieNative2);
        if (z10) {
            DispatchQueuePoolBackground.execute(ii0Var);
        } else {
            Utilities.globalQueue.postRunnable(ii0Var);
        }
    }

    @Override
    public void n() {
        if (this.S) {
            l();
            if (this.M == null && this.f34744j0 != null) {
                B(true);
            }
        }
        if (this.f34744j0 == null && this.Q0 == null && this.f34765z0 == null) {
            C();
            return;
        }
        this.Q = true;
        if (!t()) {
            stop();
        }
        if (this.f34742h0) {
            G();
        }
    }

    @Override
    public final boolean u() {
        return this.U0;
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public int z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti0.z():int");
    }
}
