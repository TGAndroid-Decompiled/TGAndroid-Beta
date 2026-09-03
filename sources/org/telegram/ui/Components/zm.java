package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zm implements org.telegram.ui.ot {
    public final int f33975a;
    public final rn f33976b;

    public zm(rn rnVar, int i10) {
        this.f33976b = rnVar;
        this.f33975a = i10;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        return false;
    }

    @Override
    public final String F(boolean z4) {
        return null;
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final q70 I(ag.l lVar) {
        q70 F = q70.F(lVar, null, new View(this.f33976b.getContext()));
        F.f30333s = 0;
        F.f30334t = false;
        int i10 = R.drawable.msg_replace;
        String string = LocaleController.getString(R.string.ReplaceAttachedPollMedia);
        final int i11 = this.f33975a;
        F.c(i10, string, new Runnable(this) {
            public final zm f33563b;

            {
                this.f33563b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f33563b.f33976b.b0(i11);
                        return;
                    default:
                        this.f33563b.f33976b.e0(i11, null);
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) {
            public final zm f33563b;

            {
                this.f33563b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f33563b.f33976b.b0(i11);
                        return;
                    default:
                        this.f33563b.f33976b.e0(i11, null);
                        return;
                }
            }
        }, true);
        return F;
    }

    @Override
    public final boolean J() {
        return false;
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        return false;
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override
    public final boolean Q() {
        return true;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i10) {
        return false;
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final MessageObject y() {
        return null;
    }

    @Override
    public final void B(TLRPC.Document document) {
    }

    @Override
    public final void E(TLRPC.Document document) {
    }

    @Override
    public final void G(TLRPC.Document document) {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void O(String str) {
    }

    @Override
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void m(String str) {
    }

    @Override
    public final void n(TLRPC.Document document) {
    }

    @Override
    public final void p(TLRPC.Document document) {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t(TLRPC.Document document) {
    }

    @Override
    public final void x(String str) {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void z(CharSequence charSequence, String str, xk xkVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
    }
}
