package org.telegram.messenger;

import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class yd implements Runnable {
    public final int f19575a;
    public final int f19576b;
    public final long f19577c;
    public final int d;
    public final Object e;

    public yd(int i10, int i11, int i12, long j10, Object obj) {
        this.f19575a = i12;
        this.e = obj;
        this.f19576b = i10;
        this.f19577c = j10;
        this.d = i11;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f19575a) {
            case 0:
                MediaController mediaController = (MediaController) this.e;
                int i10 = this.f19576b;
                long j10 = this.f19577c;
                int i11 = this.d;
                mediaController.F1 = null;
                if (mediaController.G1) {
                    MediaController.j0(true);
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    mediaController.f14450e1 = tL_document;
                    tL_document.file_reference = new byte[0];
                    tL_document.dc_id = Integer.MIN_VALUE;
                    tL_document.f19800id = uz.p();
                    mediaController.f14450e1.user_id = e20.i(i10).e();
                    mediaController.f14450e1.mime_type = "audio/ogg";
                    uz.y();
                    try {
                        e0.h hVar = new e0.h(w0.f18945b, b8.z(1), new ne(mediaController));
                        mediaController.E1 = hVar;
                        if (hVar.h()) {
                            if (v2.f18578a) {
                                f8.b("AudioRecorderV2 selected: account=" + i10 + ", dialog=" + j10 + ", guid=" + i11);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Unable to start AudioRecorderV2");
                    } catch (Exception e) {
                        f8.e("AudioRecorderV2 failed", e);
                        at.f(mediaController.f14455g1).k(156, Integer.valueOf(mediaController.f14453f1));
                        mediaController.x(false);
                        return;
                    }
                }
                return;
            case 1:
                is isVar = (is) this.e;
                int i12 = this.f19576b;
                long j11 = this.f19577c;
                int i13 = this.d;
                isVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = isVar.f16333b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE OR REPLACE widget_state SET mid = " + i12 + " WHERE uid = " + j11 + " AND mid = " + i13).stepThis().dispose();
                    isVar.f16333b.executeFast("UPDATE OR REPLACE widget_heights SET mid = " + i12 + " WHERE uid = " + j11 + " AND mid = " + i13).stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    isVar.o(e7, true);
                    return;
                }
            case 2:
                ((VoIPService) this.e).lambda$createGroupInstance$76(this.f19576b, this.f19577c, this.d);
                return;
            default:
                th.s0 s0Var = (th.s0) this.e;
                int i14 = this.f19576b;
                long j12 = this.f19577c;
                int i15 = this.d;
                HashMap hashMap = s0Var.F;
                if (i14 == 0) {
                    str = a1.g.l(j12, "");
                } else {
                    str = i14 + "_" + j12 + "_" + i15;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    ConnectionsManager.getInstance(c.a(s0Var.e).f15043a).cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
        }
    }
}
