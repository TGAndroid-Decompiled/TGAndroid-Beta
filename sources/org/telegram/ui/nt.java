package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public interface nt {
    MessageObject A();

    boolean B();

    void C(TLRPC.Document document);

    boolean D();

    boolean E(TLRPC.Document document);

    void F(TLRPC.Document document);

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

    void f(CharSequence charSequence, String str, dt dtVar);

    boolean g();

    TLRPC.PollAnswer h();

    boolean i();

    org.telegram.ui.Components.o70 j(ci.m6 m6Var);

    void k(SendMessagesHelper.ImportingSticker importingSticker);

    boolean l();

    boolean m(int i10);

    void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11);

    void o(String str);

    void p(TLRPC.Document document);

    boolean q();

    void r(TLRPC.Document document);

    void s();

    void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10);

    void u();

    void v(TLRPC.Document document);

    void w(TLRPC.StickerSet stickerSet, String str);

    void x(TLObject tLObject, Object obj);

    boolean y();

    void z(String str);
}
