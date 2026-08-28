package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public interface ft {
    boolean A();

    void B(TLRPC.Document document);

    boolean C();

    boolean D(TLRPC.Document document);

    void E(TLRPC.Document document);

    void F(CharSequence charSequence, String str, df dfVar);

    String G(boolean z10);

    void H(TLRPC.Document document);

    boolean I();

    boolean J();

    void K();

    void L();

    void M(TLRPC.InputStickerSet inputStickerSet, boolean z10);

    boolean N(TLRPC.Document document);

    void O(String str);

    Boolean P(TLRPC.Document document);

    boolean Q();

    long a();

    boolean b();

    boolean c();

    TLRPC.TL_messageMediaPoll d();

    boolean e(TLRPC.Document document);

    boolean f();

    TLRPC.PollAnswer g();

    boolean h();

    void i(SendMessagesHelper.ImportingSticker importingSticker);

    boolean j();

    boolean k(int i9);

    void l(TLRPC.Document document, String str, Object obj, boolean z10, int i9, int i10);

    void m(String str);

    void n(TLRPC.Document document);

    boolean o();

    void p(TLRPC.Document document);

    void q();

    org.telegram.ui.Components.x60 r(fh.v vVar);

    void s(int i9, int i10, Object obj, TLObject tLObject, boolean z10);

    void t();

    void u(TLRPC.Document document);

    void v(TLRPC.StickerSet stickerSet, String str);

    void w(TLObject tLObject, Object obj);

    boolean x();

    void y(String str);

    MessageObject z();
}
