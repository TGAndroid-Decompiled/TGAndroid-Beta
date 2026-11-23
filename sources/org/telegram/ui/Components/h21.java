package org.telegram.ui.Components;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class h21 {
    public final Integer f35759a;
    public final org.telegram.messenger.gj f35760b;
    public final org.telegram.ui.Cells.m1 f35761c;
    public final int d;
    public final long f35762e;
    public final long f35763f;

    public h21(Integer num, org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.m1 m1Var, int i7, long j3, long j10) {
        this.f35759a = num;
        this.f35760b = gjVar;
        this.f35761c = m1Var;
        this.d = i7;
        this.f35762e = j3;
        this.f35763f = j10;
    }

    public final void a(String str, int[] iArr, boolean z10) {
        if (z10) {
            HashMap hashMap = j21.S;
            Integer num = this.f35759a;
            hashMap.remove(num);
            j21.R.remove(num);
        }
        org.telegram.messenger.gj gjVar = this.f35760b;
        if (str == null) {
            j21.n(gjVar);
            return;
        }
        TLRPC.Message message = gjVar.f24213k;
        if (!z10) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            message.voiceTranscription = str;
            message.voiceTranscriptionWords = iArr;
            message.voiceTranscriptionLocal = true;
            message.voiceTranscriptionFinal = false;
            message.voiceTranscriptionOpen = true;
            j21.q(gjVar);
            org.telegram.messenger.ls.f(this.d).k(org.telegram.messenger.ls.A1, gjVar, null, null, Boolean.TRUE, Boolean.FALSE);
            return;
        }
        org.telegram.messenger.g0.h3(new bi.p4(gjVar, message, str, iArr, this.d, this.f35762e), Math.max(0L, 350 - (SystemClock.elapsedRealtime() - this.f35763f)));
    }
}
