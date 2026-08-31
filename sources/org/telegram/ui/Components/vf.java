package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class vf implements org.telegram.ui.ju0 {
    public boolean f31897a;
    public final Object f31898b;
    public final Object f31899c;
    public final MediaController.PhotoEntry d;
    public final xf f31900e;

    public vf(xf xfVar, Object obj, Object obj2, MediaController.PhotoEntry photoEntry) {
        this.f31900e = xfVar;
        this.f31898b = obj;
        this.f31899c = obj2;
        this.d = photoEntry;
    }

    @Override
    public final boolean A() {
        return this.f31897a;
    }

    @Override
    public final CharSequence C(int i10) {
        return null;
    }

    @Override
    public final org.telegram.ui.lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return null;
    }

    @Override
    public final void F(boolean z4) {
        this.f31897a = z4;
    }

    @Override
    public final int H() {
        return 0;
    }

    @Override
    public final boolean J() {
        return false;
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final boolean N() {
        return false;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final int Q(Object obj) {
        return 0;
    }

    @Override
    public final int R(int i10) {
        return 0;
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final boolean T() {
        return true;
    }

    @Override
    public final MessageObject U() {
        return null;
    }

    @Override
    public final boolean Y() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final String a0() {
        return "";
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final CharSequence b0(int i10) {
        return null;
    }

    @Override
    public final ArrayList c() {
        return null;
    }

    @Override
    public final void d() {
        qh.f fVar;
        bd f12 = PhotoViewer.t1().f1();
        if (f12 != null && (fVar = f12.f45517f) != null) {
            au auVar = fVar.f27001a;
            auVar.requestFocus();
            AndroidUtilities.showKeyboard(auVar);
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return 0;
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        this.f31900e.B(null, this.f31898b, null, this.f31899c, z4, i11, i12, this.d, this.f31897a);
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final boolean r() {
        return false;
    }

    @Override
    public final boolean t() {
        return true;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return null;
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final boolean x(int i10) {
        return false;
    }

    @Override
    public final int y() {
        return 0;
    }

    @Override
    public final boolean z() {
        return true;
    }

    @Override
    public final void B(int i10) {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void G() {
    }

    @Override
    public final void I() {
    }

    @Override
    public final void L(VideoEditedInfo videoEditedInfo) {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void W(int i10) {
    }

    @Override
    public final void X(int i10) {
    }

    @Override
    public final void Z(int i10) {
    }

    @Override
    public final void e(CharSequence charSequence) {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void m() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void f(String str, String str2, boolean z4) {
    }
}
