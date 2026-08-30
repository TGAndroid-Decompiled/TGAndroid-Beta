package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ym implements org.telegram.ui.nt {
    public final int f31050a;
    public final qn f31051b;

    public ym(qn qnVar, int i10) {
        this.f31051b = qnVar;
        this.f31050a = i10;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean E(TLRPC.Document document) {
        return false;
    }

    @Override
    public final String G(boolean z4) {
        return null;
    }

    @Override
    public final boolean I() {
        return false;
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
    public final o70 d(ah.d dVar) {
        o70 F = o70.F(dVar, null, new View(this.f31051b.getContext()));
        F.f27489s = 0;
        F.f27490t = false;
        int i10 = R.drawable.msg_replace;
        String string = LocaleController.getString(R.string.ReplaceAttachedPollMedia);
        final int i11 = this.f31050a;
        F.c(i10, string, new Runnable(this) {
            public final ym f30698b;

            {
                this.f30698b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f30698b.f31051b.b0(i11);
                        return;
                    default:
                        this.f30698b.f31051b.e0(i11, null);
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) {
            public final ym f30698b;

            {
                this.f30698b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f30698b.f31051b.b0(i11);
                        return;
                    default:
                        this.f30698b.f31051b.e0(i11, null);
                        return;
                }
            }
        }, true);
        return F;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll e() {
        return null;
    }

    @Override
    public final boolean f(TLRPC.Document document) {
        return false;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final TLRPC.PollAnswer h() {
        return null;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        return false;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final boolean x() {
        return true;
    }

    @Override
    public final MessageObject z() {
        return null;
    }

    @Override
    public final void C(TLRPC.Document document) {
    }

    @Override
    public final void F(TLRPC.Document document) {
    }

    @Override
    public final void H(TLRPC.Document document) {
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
    public final void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void n(String str) {
    }

    @Override
    public final void o(TLRPC.Document document) {
    }

    @Override
    public final void q(TLRPC.Document document) {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void u(TLRPC.Document document) {
    }

    @Override
    public final void y(String str) {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
    }

    @Override
    public final void A(CharSequence charSequence, String str, vk vkVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
    }
}
