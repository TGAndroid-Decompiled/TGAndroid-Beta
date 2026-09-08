package org.telegram.ui.Components;

import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public class vi0 extends xi0 {
    public volatile RLottieNative U0;
    public boolean V0;
    public boolean W0;
    public volatile boolean X0;
    public boolean Y0;
    public final int Z0;
    public int f31373a1;

    public vi0(String str, int i10, int i11) {
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
        this.f32595n0 = RLottieNative.b(str2, this.f32584e, null, null);
    }

    @Override
    public void A(boolean z10) {
        this.f32593l0 = false;
        this.m0 = true;
        l();
        j();
        if (!this.Y0 && !this.V0) {
            if (this.Q == null && !this.f32612z0) {
                B(z10);
                yf.e eVar = this.D0;
                if (eVar != null) {
                    RandomAccessFile randomAccessFile = eVar.f50114s;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                        eVar.f50114s = null;
                    }
                    eVar.f50113r = true;
                    this.D0 = null;
                }
                C();
                return;
            }
            this.W = true;
            return;
        }
        this.W0 = true;
    }

    @Override
    public final void B(boolean z10) {
        RLottieNative rLottieNative = this.f32595n0;
        RLottieNative rLottieNative2 = this.U0;
        this.f32595n0 = null;
        this.U0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        zu zuVar = new zu(28, rLottieNative, rLottieNative2);
        if (z10) {
            DispatchQueuePoolBackground.execute(zuVar);
        } else {
            Utilities.globalQueue.postRunnable(zuVar);
        }
    }

    @Override
    public void n() {
        if (this.W) {
            l();
            if (this.Q == null && this.f32595n0 != null) {
                B(true);
            }
        }
        if (this.f32595n0 == null && this.U0 == null && this.D0 == null) {
            C();
            return;
        }
        this.U = true;
        if (!t()) {
            stop();
        }
        if (this.f32593l0) {
            G();
        }
    }

    @Override
    public final boolean u() {
        return this.Y0;
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public int z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi0.z():int");
    }
}
