package org.telegram.ui.Components;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class h21 {
    public final Integer f35712a;
    public final org.telegram.messenger.gj f35713b;
    public final int f35714c;
    public final long d;
    public final long f35715e;

    public h21(Integer num, org.telegram.messenger.gj gjVar, int i7, long j3, long j10) {
        this.f35712a = num;
        this.f35713b = gjVar;
        this.f35714c = i7;
        this.d = j3;
        this.f35715e = j10;
    }

    public final void a(String str, int[] iArr, boolean z10) {
        if (z10) {
            HashMap hashMap = j21.S;
            Integer num = this.f35712a;
            hashMap.remove(num);
            j21.R.remove(num);
        }
        org.telegram.messenger.gj gjVar = this.f35713b;
        if (str == null) {
            j21.n(gjVar);
            return;
        }
        TLRPC.Message message = gjVar.f24177k;
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
            org.telegram.messenger.ls.f(this.f35714c).k(org.telegram.messenger.ls.A1, gjVar, null, null, Boolean.TRUE, Boolean.FALSE);
            return;
        }
        org.telegram.messenger.g0.h3(new bi.s4(gjVar, message, str, iArr, this.f35714c, this.d), Math.max(0L, 350 - (SystemClock.elapsedRealtime() - this.f35715e)));
    }
}
