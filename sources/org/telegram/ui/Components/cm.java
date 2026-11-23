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
public final class cm extends fm {
    public final ChatAttachAlertPhotoLayout f34217b;

    public cm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f34217b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        ui uiVar = this.f34217b.f37520b;
        if (uiVar != null && uiVar.X1) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32798r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34217b;
        chatAttachAlertPhotoLayout.p0();
        org.telegram.messenger.g0.h3(new og(this, 26), 150L);
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.f32800t1.size());
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ft ftVar;
        org.telegram.ui.wq0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34217b;
        ui uiVar = chatAttachAlertPhotoLayout.f37520b;
        if (z11 && (ftVar = uiVar.P2) != null && (closeIntoObject = ((w30) ftVar.f35315b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.s5 P = ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout, i7);
        if (P != null) {
            int[] iArr = new int[2];
            P.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - uiVar.T();
            }
            org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0();
            wq0Var.f53498b = iArr[0];
            wq0Var.f53499c = iArr[1];
            wq0Var.d = chatAttachAlertPhotoLayout.F;
            ImageReceiver imageReceiver = P.getImageView().getImageReceiver();
            wq0Var.f53497a = imageReceiver;
            wq0Var.f53500e = imageReceiver.p();
            wq0Var.f53505k = P.getScale();
            wq0Var.f53503i = (int) uiVar.a1();
            P.g(false);
            return wq0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34217b;
        ui uiVar = chatAttachAlertPhotoLayout.f37520b;
        if (uiVar != null && uiVar.X1 != z10) {
            uiVar.w1(z10, true);
            chatAttachAlertPhotoLayout.f32812e1.a(!chatAttachAlertPhotoLayout.f37520b.X1, true);
        }
    }

    @Override
    public final void G() {
        zl zlVar = this.f34217b.F;
        int childCount = zlVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = zlVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                ((org.telegram.ui.Cells.s5) childAt).g(true);
            }
        }
    }

    @Override
    public final void X(int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34217b;
        org.telegram.ui.Cells.s5 P = ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout, i7);
        if (P != null) {
            P.getImageView().r();
            org.telegram.messenger.ff e02 = chatAttachAlertPhotoLayout.e0(i7);
            if (e02 != null) {
                int i10 = e02.C;
                String str = e02.I;
                if (e02.f28063g != null) {
                    P.getImageView().h(e02.f28063g, null, org.telegram.ui.ActionBar.m6.R4);
                } else if (e02.f28060c != null) {
                    P.getImageView().h(e02.f28060c, null, org.telegram.ui.ActionBar.m6.R4);
                } else if (str != null) {
                    P.getImageView().s(e02.J, e02.K, true);
                    if (e02.f28059b) {
                        q9 imageView = P.getImageView();
                        imageView.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.m6.R4);
                        return;
                    }
                    q9 imageView2 = P.getImageView();
                    imageView2.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.m6.R4);
                } else {
                    P.getImageView().setImageDrawable(org.telegram.ui.ActionBar.m6.R4);
                }
            }
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.g2 g2Var = this.f34217b.f37520b.f40368a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) g2Var).a();
        }
        return 0L;
    }

    @Override
    public final void a0(int i7) {
        org.telegram.ui.Cells.s5 P = ChatAttachAlertPhotoLayout.P(this.f34217b, i7);
        if (P != null) {
            P.g(true);
        }
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32798r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34217b;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.s0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f32800t1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f32801u1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof org.telegram.messenger.ff) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                    charSequence2 = ffVar.f28058a;
                    arrayList = ffVar.f28069n;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof org.telegram.messenger.jf) {
                    org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                    charSequence2 = jfVar.I;
                    arrayList = jfVar.f28069n;
                }
                ArrayList arrayList3 = arrayList;
                if (charSequence2 != null && arrayList3 != null) {
                    if (!(charSequence2 instanceof Spannable)) {
                        spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                    } else {
                        spannableStringBuilder = charSequence2;
                    }
                    org.telegram.messenger.gj.b(spannableStringBuilder, arrayList3, false, false, false, false, 0);
                    charSequence2 = spannableStringBuilder;
                }
                this.f34217b.f37520b.b1().setText(y5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32798r1;
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        org.telegram.ui.Cells.s5 P = ChatAttachAlertPhotoLayout.P(this.f34217b, i7);
        if (P != null) {
            return P.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final boolean l() {
        ui uiVar = this.f34217b.f37520b;
        if (uiVar != null && (uiVar.f40368a2 instanceof org.telegram.ui.bn)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34217b;
        ui uiVar = chatAttachAlertPhotoLayout.f37520b;
        uiVar.f40431t4 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f32798r1;
        org.telegram.messenger.ff e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 != null) {
            e02.f28074s = f20Var;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f32800t1;
        if (hashMap.isEmpty() && e02 != null) {
            chatAttachAlertPhotoLayout.T(e02, -1);
        }
        if (!uiVar.P0(uiVar.b1().getText())) {
            uiVar.N0();
            if (PhotoViewer.p1().f43344p7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f32801u1;
                if (!hashMap.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        Object obj = hashMap.get(arrayList.get(i12));
                        if (obj instanceof org.telegram.messenger.ff) {
                            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                            if (i12 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.p1().f43353q7};
                                ffVar.f28069n = org.telegram.messenger.si.d0(org.telegram.messenger.k10.f24968t0).Y(charSequenceArr, false, true);
                                CharSequence charSequence = charSequenceArr[0];
                                ffVar.f28058a = charSequence;
                                if (uiVar.P0(charSequence)) {
                                    return;
                                }
                            } else {
                                ffVar.f28058a = null;
                            }
                        }
                    }
                }
            }
            if (uiVar != null) {
                uiVar.G3 = false;
            }
            PhotoViewer.p1();
            PhotoViewer.p1().P = false;
            PhotoViewer.p1().f43393v2 = false;
            c5.X(uiVar.H3, uiVar.Y0() + ChatAttachAlertPhotoLayout.f32800t1.size(), uiVar.c1(), new vl(this, z10, i10, z11));
        }
    }

    @Override
    public final boolean q() {
        ui uiVar = this.f34217b.f37520b;
        if (uiVar != null && uiVar.F3 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32798r1;
        this.f34217b.s0(-1, false);
    }

    @Override
    public final boolean w() {
        org.telegram.messenger.gj gjVar;
        ui uiVar = this.f34217b.f37520b;
        if (uiVar != null && (gjVar = uiVar.F3) != null && gjVar.p5()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        ui uiVar = this.f34217b.f37520b;
        if (!uiVar.A1 && !uiVar.C1) {
            return true;
        }
        return false;
    }
}
