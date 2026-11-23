package org.telegram.ui.Components;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class g21 implements ai.p {
    public final Integer f35294a;
    public final org.telegram.messenger.fj f35295b;
    public final int f35296c;
    public final long d;
    public final long f35297e;

    public g21(Integer num, org.telegram.messenger.fj fjVar, int i7, long j3, long j10) {
        this.f35294a = num;
        this.f35295b = fjVar;
        this.f35296c = i7;
        this.d = j3;
        this.f35297e = j10;
    }

    @Override
    public final void a(String str, int[] iArr, boolean z10) {
        if (z10) {
            HashMap hashMap = i21.S;
            Integer num = this.f35294a;
            hashMap.remove(num);
            i21.R.remove(num);
        }
        org.telegram.messenger.fj fjVar = this.f35295b;
        if (str == null) {
            i21.n(fjVar);
            return;
        }
        TLRPC.Message message = fjVar.f24073k;
        if (!z10) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            message.voiceTranscription = str;
            message.voiceTranscriptionWords = iArr;
            message.voiceTranscriptionLocal = true;
            message.voiceTranscriptionFinal = false;
            message.voiceTranscriptionOpen = true;
            i21.q(fjVar);
            org.telegram.messenger.ks.f(this.f35296c).k(org.telegram.messenger.ks.A1, fjVar, null, null, Boolean.TRUE, Boolean.FALSE);
            return;
        }
        org.telegram.messenger.g0.h3(new bi.s4(fjVar, message, str, iArr, this.f35296c, this.d), Math.max(0L, 350 - (SystemClock.elapsedRealtime() - this.f35297e)));
    }
}
