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
public final class am extends dm {
    public final ChatAttachAlertPhotoLayout f33364b;

    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f33364b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        si siVar = this.f33364b.f36766b;
        if (siVar != null && siVar.X1) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32762r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33364b;
        chatAttachAlertPhotoLayout.p0();
        org.telegram.messenger.g0.h3(new lg(this, 26), 150L);
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.f32764t1.size());
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        dt dtVar;
        org.telegram.ui.wq0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33364b;
        si siVar = chatAttachAlertPhotoLayout.f36766b;
        if (z11 && (dtVar = siVar.P2) != null && (closeIntoObject = ((t30) dtVar.f34501b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.r5 P = ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout, i7);
        if (P != null) {
            int[] iArr = new int[2];
            P.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - siVar.T();
            }
            org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0();
            wq0Var.f53497b = iArr[0];
            wq0Var.f53498c = iArr[1];
            wq0Var.d = chatAttachAlertPhotoLayout.F;
            ImageReceiver imageReceiver = P.getImageView().getImageReceiver();
            wq0Var.f53496a = imageReceiver;
            wq0Var.f53499e = imageReceiver.p();
            wq0Var.f53504k = P.getScale();
            wq0Var.f53502i = (int) siVar.a1();
            P.g(false);
            return wq0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33364b;
        si siVar = chatAttachAlertPhotoLayout.f36766b;
        if (siVar != null && siVar.X1 != z10) {
            siVar.w1(z10, true);
            chatAttachAlertPhotoLayout.f32776e1.a(!chatAttachAlertPhotoLayout.f36766b.X1, true);
        }
    }

    @Override
    public final void G() {
        xl xlVar = this.f33364b.F;
        int childCount = xlVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = xlVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.r5) {
                ((org.telegram.ui.Cells.r5) childAt).g(true);
            }
        }
    }

    @Override
    public final void X(int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33364b;
        org.telegram.ui.Cells.r5 P = ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout, i7);
        if (P != null) {
            P.getImageView().r();
            org.telegram.messenger.ef e02 = chatAttachAlertPhotoLayout.e0(i7);
            if (e02 != null) {
                int i10 = e02.C;
                String str = e02.I;
                if (e02.f27853g != null) {
                    P.getImageView().h(e02.f27853g, null, org.telegram.ui.ActionBar.n6.R4);
                } else if (e02.f27850c != null) {
                    P.getImageView().h(e02.f27850c, null, org.telegram.ui.ActionBar.n6.R4);
                } else if (str != null) {
                    P.getImageView().s(e02.J, e02.K, true);
                    if (e02.f27849b) {
                        q9 imageView = P.getImageView();
                        imageView.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.n6.R4);
                        return;
                    }
                    q9 imageView2 = P.getImageView();
                    imageView2.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.n6.R4);
                } else {
                    P.getImageView().setImageDrawable(org.telegram.ui.ActionBar.n6.R4);
                }
            }
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.h2 h2Var = this.f33364b.f36766b.f39659a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) h2Var).a();
        }
        return 0L;
    }

    @Override
    public final void a0(int i7) {
        org.telegram.ui.Cells.r5 P = ChatAttachAlertPhotoLayout.P(this.f33364b, i7);
        if (P != null) {
            P.g(true);
        }
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32762r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33364b;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.s0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f32764t1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f32765u1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                    charSequence2 = efVar.f27848a;
                    arrayList = efVar.f27859n;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    charSequence2 = hfVar.I;
                    arrayList = hfVar.f27859n;
                }
                ArrayList arrayList3 = arrayList;
                if (charSequence2 != null && arrayList3 != null) {
                    if (!(charSequence2 instanceof Spannable)) {
                        spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                    } else {
                        spannableStringBuilder = charSequence2;
                    }
                    org.telegram.messenger.fj.b(spannableStringBuilder, arrayList3, false, false, false, false, 0);
                    charSequence2 = spannableStringBuilder;
                }
                this.f33364b.f36766b.b1().setText(x5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32762r1;
    }

    @Override
    public final org.telegram.messenger.hc j(int i7) {
        org.telegram.ui.Cells.r5 P = ChatAttachAlertPhotoLayout.P(this.f33364b, i7);
        if (P != null) {
            return P.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final boolean l() {
        si siVar = this.f33364b.f36766b;
        if (siVar != null && (siVar.f39659a2 instanceof org.telegram.ui.bn)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33364b;
        si siVar = chatAttachAlertPhotoLayout.f36766b;
        siVar.f39722t4 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f32762r1;
        org.telegram.messenger.ef e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 != null) {
            e02.f27864s = e20Var;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f32764t1;
        if (hashMap.isEmpty() && e02 != null) {
            chatAttachAlertPhotoLayout.T(e02, -1);
        }
        if (!siVar.P0(siVar.b1().getText())) {
            siVar.N0();
            if (PhotoViewer.p1().f43299p7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f32765u1;
                if (!hashMap.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        Object obj = hashMap.get(arrayList.get(i12));
                        if (obj instanceof org.telegram.messenger.ef) {
                            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                            if (i12 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.p1().f43308q7};
                                efVar.f27859n = org.telegram.messenger.ri.d0(org.telegram.messenger.j10.f24773t0).Y(charSequenceArr, false, true);
                                CharSequence charSequence = charSequenceArr[0];
                                efVar.f27848a = charSequence;
                                if (siVar.P0(charSequence)) {
                                    return;
                                }
                            } else {
                                efVar.f27848a = null;
                            }
                        }
                    }
                }
            }
            if (siVar != null) {
                siVar.G3 = false;
            }
            PhotoViewer.p1();
            PhotoViewer.p1().P = false;
            PhotoViewer.p1().f43348v2 = false;
            b5.X(siVar.H3, siVar.Y0() + ChatAttachAlertPhotoLayout.f32764t1.size(), siVar.c1(), new tl(this, z10, i10, z11));
        }
    }

    @Override
    public final boolean q() {
        si siVar = this.f33364b.f36766b;
        if (siVar != null && siVar.F3 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32762r1;
        this.f33364b.s0(-1, false);
    }

    @Override
    public final boolean w() {
        org.telegram.messenger.fj fjVar;
        si siVar = this.f33364b.f36766b;
        if (siVar != null && (fjVar = siVar.F3) != null && fjVar.p5()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        si siVar = this.f33364b.f36766b;
        if (!siVar.A1 && !siVar.C1) {
            return true;
        }
        return false;
    }
}
