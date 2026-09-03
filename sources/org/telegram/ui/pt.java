package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public interface pt {
    void A(CharSequence charSequence, String str, org.telegram.ui.Components.vk vkVar);

    boolean B();

    void C(TLRPC.Document document);

    boolean D();

    boolean E(TLRPC.Document document);

    void F(TLRPC.Document document);

    String G(boolean z4);

    void H(TLRPC.Document document);

    boolean I();

    boolean J();

    void K();

    void L();

    void M(TLRPC.InputStickerSet inputStickerSet, boolean z4);

    boolean N(TLRPC.Document document);

    void O(String str);

    Boolean P(TLRPC.Document document);

    boolean Q();

    long a();

    boolean b();

    boolean c();

    org.telegram.ui.Components.p70 d(ah.e eVar);

    TLRPC.TL_messageMediaPoll e();

    boolean f(TLRPC.Document document);

    boolean g();

    TLRPC.PollAnswer h();

    boolean i();

    void j(SendMessagesHelper.ImportingSticker importingSticker);

    boolean k();

    boolean l(int i10);

    void m(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11);

    void n(String str);

    void o(TLRPC.Document document);

    boolean p();

    void q(TLRPC.Document document);

    void r();

    void s(int i10, int i11, Object obj, TLObject tLObject, boolean z4);

    void t();

    void u(TLRPC.Document document);

    void v(TLRPC.StickerSet stickerSet, String str);

    void w(TLObject tLObject, Object obj);

    boolean x();

    void y(String str);

    MessageObject z();
}
