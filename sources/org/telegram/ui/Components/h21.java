package org.telegram.ui.Components;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class h21 {
    public final Integer f35766a;
    public final org.telegram.messenger.fj f35767b;
    public final int f35768c;
    public final long d;
    public final long f35769e;

    public h21(Integer num, org.telegram.messenger.fj fjVar, int i7, long j3, long j10) {
        this.f35766a = num;
        this.f35767b = fjVar;
        this.f35768c = i7;
        this.d = j3;
        this.f35769e = j10;
    }

    public final void a(String str, int[] iArr, boolean z10) {
        if (z10) {
            HashMap hashMap = j21.S;
            Integer num = this.f35766a;
            hashMap.remove(num);
            j21.R.remove(num);
        }
        org.telegram.messenger.fj fjVar = this.f35767b;
        if (str == null) {
            j21.m(fjVar);
            return;
        }
        TLRPC.Message message = fjVar.f23993k;
        if (!z10) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            message.voiceTranscription = str;
            message.voiceTranscriptionWords = iArr;
            message.voiceTranscriptionLocal = true;
            message.voiceTranscriptionFinal = false;
            message.voiceTranscriptionOpen = true;
            j21.p(fjVar);
            org.telegram.messenger.ks.f(this.f35768c).k(org.telegram.messenger.ks.A1, fjVar, null, null, Boolean.TRUE, Boolean.FALSE);
            return;
        }
        org.telegram.messenger.g0.h3(new bi.p4(fjVar, message, str, iArr, this.f35768c, this.d), Math.max(0L, 350 - (SystemClock.elapsedRealtime() - this.f35769e)));
    }
}
