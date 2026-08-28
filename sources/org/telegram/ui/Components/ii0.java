package org.telegram.ui.Components;

import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public class ii0 extends mi0 {
    public volatile RLottieNative Q0;
    public boolean R0;
    public boolean S0;
    public volatile boolean T0;
    public boolean U0;
    public final int V0;
    public int W0;

    public ii0(String str, int i9, int i10) {
        super(i9, i10);
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
        this.f30854j0 = RLottieNative.b(str2, "dice", this.f30847e, null, null);
    }

    @Override
    public void A(boolean z10) {
        this.f30852h0 = false;
        this.f30853i0 = true;
        l();
        j();
        if (!this.U0 && !this.R0) {
            if (this.M == null && !this.f30868v0) {
                B(z10);
                ff.h hVar = this.f30875z0;
                if (hVar != null) {
                    RandomAccessFile randomAccessFile = hVar.f6196s;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                        hVar.f6196s = null;
                    }
                    hVar.f6195r = true;
                    this.f30875z0 = null;
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
        RLottieNative rLottieNative = this.f30854j0;
        RLottieNative rLottieNative2 = this.Q0;
        this.f30854j0 = null;
        this.Q0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        jg0 jg0Var = new jg0(4, rLottieNative, rLottieNative2);
        if (z10) {
            DispatchQueuePoolBackground.execute(jg0Var);
        } else {
            Utilities.globalQueue.postRunnable(jg0Var);
        }
    }

    @Override
    public void n() {
        if (this.S) {
            l();
            if (this.M == null && this.f30854j0 != null) {
                B(true);
            }
        }
        if (this.f30854j0 == null && this.Q0 == null && this.f30875z0 == null) {
            C();
            return;
        }
        this.Q = true;
        if (!t()) {
            stop();
        }
        if (this.f30852h0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ii0.z():int");
    }
}
