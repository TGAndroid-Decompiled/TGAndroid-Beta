package org.telegram.ui.Components;

import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public class dj0 extends gj0 {
    public volatile RLottieNative R0;
    public boolean S0;
    public boolean T0;
    public volatile boolean U0;
    public boolean V0;
    public final int W0;
    public int X0;

    public dj0(String str, int i10, int i11) {
        super(i10, i11);
        String str2;
        this.W0 = -1;
        this.H = 1;
        if ("🎲".equals(str)) {
            str2 = AndroidUtilities.readRes(R.raw.diceloop);
            this.W0 = 60;
        } else if ("🎯".equals(str)) {
            str2 = AndroidUtilities.readRes(R.raw.dartloop);
        } else {
            str2 = null;
        }
        getPaint().setFlags(2);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f25166k0 = RLottieNative.b(str2, this.e, null, null);
    }

    @Override
    public void A(boolean z4) {
        this.f25164i0 = false;
        this.f25165j0 = true;
        l();
        j();
        if (!this.V0 && !this.S0) {
            if (this.N == null && !this.f25181w0) {
                B(z4);
                kf.g gVar = this.A0;
                if (gVar != null) {
                    RandomAccessFile randomAccessFile = gVar.f10444s;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        gVar.f10444s = null;
                    }
                    gVar.f10443r = true;
                    this.A0 = null;
                }
                C();
                return;
            }
            this.T = true;
            return;
        }
        this.T0 = true;
    }

    @Override
    public final void B(boolean z4) {
        RLottieNative rLottieNative = this.f25166k0;
        RLottieNative rLottieNative2 = this.R0;
        this.f25166k0 = null;
        this.R0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        z80 z80Var = new z80(9, rLottieNative, rLottieNative2);
        if (z4) {
            DispatchQueuePoolBackground.execute(z80Var);
        } else {
            Utilities.globalQueue.postRunnable(z80Var);
        }
    }

    @Override
    public void n() {
        if (this.T) {
            l();
            if (this.N == null && this.f25166k0 != null) {
                B(true);
            }
        }
        if (this.f25166k0 == null && this.R0 == null && this.A0 == null) {
            C();
            return;
        }
        this.R = true;
        if (!t()) {
            stop();
        }
        if (this.f25164i0) {
            G();
        }
    }

    @Override
    public final boolean u() {
        return this.V0;
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public int z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dj0.z():int");
    }
}
