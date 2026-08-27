package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

public class ki0 extends oi0 {
    public volatile RLottieNative Q0;
    public boolean R0;
    public boolean S0;
    public volatile boolean T0;
    public boolean U0;
    public final int V0;
    public int W0;

    public ki0(String str, int i10, int i11) {
        String res;
        super(i10, i11);
        this.V0 = -1;
        this.G = 1;
        if ("🎲".equals(str)) {
            res = AndroidUtilities.readRes(R.raw.diceloop);
            this.V0 = 60;
        } else {
            res = "🎯".equals(str) ? AndroidUtilities.readRes(R.raw.dartloop) : null;
        }
        getPaint().setFlags(2);
        if (TextUtils.isEmpty(res)) {
            return;
        }
        this.f31319j0 = RLottieNative.b(res, "dice", this.f31312e, null, null);
    }

    @Override
    public void A(boolean z10) {
        this.f31317h0 = false;
        this.f31318i0 = true;
        l();
        j();
        if (this.U0 || this.R0) {
            this.S0 = true;
            return;
        }
        if (this.M != null || this.f31333v0) {
            this.S = true;
            return;
        }
        B(z10);
        gf.h hVar = this.f31340z0;
        if (hVar != null) {
            RandomAccessFile randomAccessFile = hVar.f6996s;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
                hVar.f6996s = null;
            }
            hVar.f6995r = true;
            this.f31340z0 = null;
        }
        C();
    }

    @Override
    public final void B(boolean z10) {
        RLottieNative rLottieNative = this.f31319j0;
        RLottieNative rLottieNative2 = this.Q0;
        this.f31319j0 = null;
        this.Q0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        lg0 lg0Var = new lg0(4, rLottieNative, rLottieNative2);
        if (z10) {
            DispatchQueuePoolBackground.execute(lg0Var);
        } else {
            Utilities.globalQueue.postRunnable(lg0Var);
        }
    }

    @Override
    public void n() {
        if (this.S) {
            l();
            if (this.M == null && this.f31319j0 != null) {
                B(true);
            }
        }
        if (this.f31319j0 == null && this.Q0 == null && this.f31340z0 == null) {
            C();
            return;
        }
        this.Q = true;
        if (!t()) {
            stop();
        }
        if (this.f31317h0) {
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
        boolean z10;
        RLottieNative rLottieNative;
        if (this.f31318i0) {
            return 3;
        }
        if (this.f31319j0 != null && (this.G != 2 || this.Q0 != null)) {
            if (this.P == null) {
                try {
                    this.P = Bitmap.createBitmap(this.f31307b, this.f31309c, Bitmap.Config.ARGB_8888);
                    z10 = false;
                } catch (Throwable th) {
                    FileLog.e(th);
                    z10 = true;
                }
            } else {
                z10 = true;
            }
            if (this.P != null) {
                try {
                    int i10 = this.G;
                    if (i10 != 1 && i10 == 2) {
                        rLottieNative = this.Q0;
                        if (this.T0) {
                            this.X = this.W0 - 1;
                        }
                    } else {
                        rLottieNative = this.f31319j0;
                    }
                    if (rLottieNative.c(this.X, this.P, z10) >= 0) {
                        this.O = this.P;
                        int i11 = this.G;
                        if (i11 == 1) {
                            int i12 = this.X + 1;
                            int i13 = this.V0;
                            if (i13 == -1) {
                                i13 = this.f31312e[0];
                            }
                            if (i12 < i13) {
                                this.X = i12;
                            } else {
                                this.X = 0;
                                this.K = false;
                                if (this.Q0 != null) {
                                    this.G = 2;
                                }
                                if (this.f31338y) {
                                    this.f31336x = null;
                                    this.f31338y = false;
                                }
                            }
                        } else if (i11 == 2) {
                            int i14 = this.X + 1;
                            if (i14 < this.W0) {
                                this.X = i14;
                            } else {
                                this.K = true;
                                this.J++;
                            }
                        }
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
            return 1;
        }
        return 2;
    }
}
