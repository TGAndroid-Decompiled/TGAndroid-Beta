package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public interface ju0 {
    boolean A();

    void B(int i10);

    CharSequence C(int i10);

    void D();

    lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10);

    void F(boolean z4);

    void G();

    int H();

    void I();

    boolean J();

    boolean K();

    void L(VideoEditedInfo videoEditedInfo);

    boolean M();

    boolean N();

    boolean O();

    boolean P();

    int Q(Object obj);

    int R(int i10);

    boolean S();

    boolean T();

    MessageObject U();

    void V();

    void W(int i10);

    void X(int i10);

    boolean Y();

    void Z(int i10);

    long a();

    String a0();

    boolean b();

    CharSequence b0(int i10);

    ArrayList c();

    void d();

    void e(CharSequence charSequence);

    void f(String str, String str2, boolean z4);

    boolean g();

    boolean h();

    void i();

    ImageReceiver.BitmapHolder j(int i10);

    int k(int i10, VideoEditedInfo videoEditedInfo);

    boolean l();

    void m();

    void n();

    void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10);

    boolean p();

    boolean q();

    boolean r();

    void s();

    boolean t();

    boolean u();

    HashMap v();

    boolean w();

    boolean x(int i10);

    int y();

    boolean z();
}
