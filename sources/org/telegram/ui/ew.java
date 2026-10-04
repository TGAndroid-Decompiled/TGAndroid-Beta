package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ew implements Runnable {
    public final int f36103a = 1;
    public final TLObject f36104b;
    public final long f36105c;
    public final Object d;
    public final Object f36106e;
    public final Object f36107f;
    public final Object h;
    public final Object f36108n;
    public final Object f36109r;

    public ew(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, org.telegram.messenger.video.d dVar) {
        this.f36104b = tLObject;
        this.d = context;
        this.f36106e = a1Var;
        this.f36105c = j3;
        this.f36107f = bArr;
        this.h = aVar;
        this.f36108n = ycVar;
        this.f36109r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f36103a) {
            case 0:
                uy.n0((uy) this.d, (org.telegram.ui.ActionBar.b2) this.f36106e, this.f36104b, (TLRPC.User) this.f36107f, (TLRPC.Chat) this.h, this.f36105c, (TLRPC.TL_error) this.f36108n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f36109r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.f36106e;
                byte[] bArr = (byte[]) this.f36107f;
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) this.f36108n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f36109r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f36104b;
                v31 v31Var = new v31(context, a1Var, this.f36105c, bArr);
                v31Var.M(tL_channels_sponsoredMessageReportResultChooseOption);
                v31Var.f41555s = new o31((org.telegram.messenger.video.a) this.h, ycVar, context, a1Var, dVar);
                v31Var.show();
                return;
            default:
                yh.x3.C0((yh.x3) this.d, (nf.e) this.f36107f, (org.telegram.ui.ActionBar.b2) this.f36106e, this.f36104b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f36108n, this.f36105c, (CharSequence) this.f36109r);
                return;
        }
    }

    public ew(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.f36106e = b2Var;
        this.f36104b = tLObject;
        this.f36107f = user;
        this.h = chat;
        this.f36105c = j3;
        this.f36108n = tL_error;
        this.f36109r = tL_messages_checkHistoryImportPeer;
    }

    public ew(yh.x3 x3Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = x3Var;
        this.f36107f = eVar;
        this.f36106e = b2Var;
        this.f36104b = tLObject;
        this.h = tL_starGiftUnique;
        this.f36108n = tL_error;
        this.f36105c = j3;
        this.f36109r = charSequence;
    }
}
