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
public final class vf implements org.telegram.ui.ou0 {
    public boolean f29466a;
    public final Object f29467b;
    public final Object f29468c;
    public final MediaController.PhotoEntry d;
    public final xf e;

    public vf(xf xfVar, Object obj, Object obj2, MediaController.PhotoEntry photoEntry) {
        this.e = xfVar;
        this.f29467b = obj;
        this.f29468c = obj2;
        this.d = photoEntry;
    }

    @Override
    public final boolean A() {
        return this.f29466a;
    }

    @Override
    public final CharSequence C(int i10) {
        return null;
    }

    @Override
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return null;
    }

    @Override
    public final void F(boolean z4) {
        this.f29466a = z4;
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
        ph.f fVar;
        bd f12 = PhotoViewer.t1().f1();
        if (f12 != null && (fVar = f12.f41842f) != null) {
            xt xtVar = fVar.f24030a;
            xtVar.requestFocus();
            AndroidUtilities.showKeyboard(xtVar);
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
        this.e.B(null, this.f29467b, null, this.f29468c, z4, i11, i12, this.d, this.f29466a);
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
