package org.telegram.ui.Components;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class ll extends ol {
    public final ChatAttachAlertPhotoLayout f35690b;

    public ll(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f35690b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        ci ciVar = this.f35690b.f38656b;
        if (ciVar != null && ciVar.W1) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z9 = ChatAttachAlertPhotoLayout.f31204q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35690b;
        chatAttachAlertPhotoLayout.p0();
        org.telegram.messenger.g0.i3(new wf(this, 24), 150L);
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f31206s1.size());
    }

    @Override
    public final org.telegram.ui.zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ps psVar;
        org.telegram.ui.zq0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35690b;
        ci ciVar = chatAttachAlertPhotoLayout.f38656b;
        if (z10 && (psVar = ciVar.O2) != null && (closeIntoObject = ((i30) psVar.f37070b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(chatAttachAlertPhotoLayout, i7);
        if (O != null) {
            int[] iArr = new int[2];
            O.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - ciVar.S();
            }
            org.telegram.ui.zq0 zq0Var = new org.telegram.ui.zq0();
            zq0Var.f52504b = iArr[0];
            zq0Var.f52505c = iArr[1];
            zq0Var.d = chatAttachAlertPhotoLayout.E;
            ImageReceiver imageReceiver = O.getImageView().getImageReceiver();
            zq0Var.f52503a = imageReceiver;
            zq0Var.f52506e = imageReceiver.p();
            zq0Var.f52511k = O.getScale();
            zq0Var.f52509i = (int) ciVar.Z0();
            O.g(false);
            return zq0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z9) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35690b;
        ci ciVar = chatAttachAlertPhotoLayout.f38656b;
        if (ciVar != null && ciVar.W1 != z9) {
            ciVar.v1(z9, true);
            chatAttachAlertPhotoLayout.f31216d1.a(!chatAttachAlertPhotoLayout.f38656b.W1, true);
        }
    }

    @Override
    public final void G() {
        il ilVar = this.f35690b.E;
        int childCount = ilVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = ilVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override
    public final void X(int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35690b;
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(chatAttachAlertPhotoLayout, i7);
        if (O != null) {
            O.getImageView().r();
            org.telegram.messenger.gf e02 = chatAttachAlertPhotoLayout.e0(i7);
            if (e02 != null) {
                int i10 = e02.C;
                String str = e02.I;
                if (e02.f26853g != null) {
                    O.getImageView().h(e02.f26853g, null, org.telegram.ui.ActionBar.m6.R4);
                } else if (e02.f26850c != null) {
                    O.getImageView().h(e02.f26850c, null, org.telegram.ui.ActionBar.m6.R4);
                } else if (str != null) {
                    O.getImageView().s(e02.J, e02.K, true);
                    if (e02.f26849b) {
                        k9 imageView = O.getImageView();
                        imageView.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.m6.R4);
                        return;
                    }
                    k9 imageView2 = O.getImageView();
                    imageView2.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.m6.R4);
                } else {
                    O.getImageView().setImageDrawable(org.telegram.ui.ActionBar.m6.R4);
                }
            }
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.f2 f2Var = this.f35690b.f38656b.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            return ((org.telegram.ui.cn) f2Var).a();
        }
        return 0L;
    }

    @Override
    public final void a0(int i7) {
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(this.f35690b, i7);
        if (O != null) {
            O.g(true);
        }
    }

    @Override
    public final void d() {
        boolean z9 = ChatAttachAlertPhotoLayout.f31204q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35690b;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.s0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f31206s1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f31207t1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof org.telegram.messenger.gf) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                    charSequence2 = gfVar.f26848a;
                    arrayList = gfVar.f26859n;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof org.telegram.messenger.kf) {
                    org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                    charSequence2 = kfVar.I;
                    arrayList = kfVar.f26859n;
                }
                ArrayList arrayList3 = arrayList;
                if (charSequence2 != null && arrayList3 != null) {
                    if (!(charSequence2 instanceof Spannable)) {
                        spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                    } else {
                        spannableStringBuilder = charSequence2;
                    }
                    org.telegram.messenger.ij.b(spannableStringBuilder, arrayList3, false, false, false, false, 0);
                    charSequence2 = spannableStringBuilder;
                }
                this.f35690b.f38656b.a1().setText(q5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z9 = ChatAttachAlertPhotoLayout.f31204q1;
    }

    @Override
    public final org.telegram.messenger.jc j(int i7) {
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(this.f35690b, i7);
        if (O != null) {
            return O.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final boolean l() {
        ci ciVar = this.f35690b.f38656b;
        if (ciVar != null && (ciVar.Z1 instanceof org.telegram.ui.cn)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35690b;
        ci ciVar = chatAttachAlertPhotoLayout.f38656b;
        ciVar.f32650s4 = true;
        boolean z11 = ChatAttachAlertPhotoLayout.f31204q1;
        org.telegram.messenger.gf e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 != null) {
            e02.f26864s = j20Var;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f31206s1;
        if (hashMap.isEmpty() && e02 != null) {
            chatAttachAlertPhotoLayout.S(e02, -1);
        }
        if (!ciVar.O0(ciVar.a1().getText())) {
            ciVar.M0();
            if (PhotoViewer.p1().f41474o7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f31207t1;
                if (!hashMap.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        Object obj = hashMap.get(arrayList.get(i12));
                        if (obj instanceof org.telegram.messenger.gf) {
                            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                            if (i12 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.p1().f41483p7};
                                gfVar.f26859n = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24474s0).W(charSequenceArr, false, true);
                                CharSequence charSequence = charSequenceArr[0];
                                gfVar.f26848a = charSequence;
                                if (ciVar.O0(charSequence)) {
                                    return;
                                }
                            } else {
                                gfVar.f26848a = null;
                            }
                        }
                    }
                }
            }
            if (ciVar != null) {
                ciVar.F3 = false;
            }
            PhotoViewer.p1();
            PhotoViewer.p1().O = false;
            PhotoViewer.p1().f41523u2 = false;
            u4.X(ciVar.G3, ciVar.X0() + ChatAttachAlertPhotoLayout.f31206s1.size(), ciVar.b1(), new el(this, z9, i10, z10));
        }
    }

    @Override
    public final boolean q() {
        ci ciVar = this.f35690b.f38656b;
        if (ciVar != null && ciVar.E3 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z9 = ChatAttachAlertPhotoLayout.f31204q1;
        this.f35690b.s0(-1, false);
    }

    @Override
    public final boolean w() {
        org.telegram.messenger.ij ijVar;
        ci ciVar = this.f35690b.f38656b;
        if (ciVar != null && (ijVar = ciVar.E3) != null && ijVar.p5()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        ci ciVar = this.f35690b.f38656b;
        if (!ciVar.f32675z1 && !ciVar.B1) {
            return true;
        }
        return false;
    }
}
