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
public final class ml extends pl {
    public final ChatAttachAlertPhotoLayout f35953b;

    public ml(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f35953b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        di diVar = this.f35953b.f38948b;
        if (diVar != null && diVar.T1) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z9 = ChatAttachAlertPhotoLayout.f31183q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35953b;
        chatAttachAlertPhotoLayout.p0();
        org.telegram.messenger.g0.i3(new xf(this, 24), 150L);
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f31185s1.size());
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        qs qsVar;
        org.telegram.ui.wq0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35953b;
        di diVar = chatAttachAlertPhotoLayout.f38948b;
        if (z10 && (qsVar = diVar.L2) != null && (closeIntoObject = ((i30) qsVar.f37392b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(chatAttachAlertPhotoLayout, i7);
        if (O != null) {
            int[] iArr = new int[2];
            O.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - diVar.S();
            }
            org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0();
            wq0Var.f51479b = iArr[0];
            wq0Var.f51480c = iArr[1];
            wq0Var.d = chatAttachAlertPhotoLayout.E;
            ImageReceiver imageReceiver = O.getImageView().getImageReceiver();
            wq0Var.f51478a = imageReceiver;
            wq0Var.f51481e = imageReceiver.p();
            wq0Var.f51486k = O.getScale();
            wq0Var.f51484i = (int) diVar.Z0();
            O.g(false);
            return wq0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z9) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35953b;
        di diVar = chatAttachAlertPhotoLayout.f38948b;
        if (diVar != null && diVar.T1 != z9) {
            diVar.v1(z9, true);
            chatAttachAlertPhotoLayout.f31195d1.a(!chatAttachAlertPhotoLayout.f38948b.T1, true);
        }
    }

    @Override
    public final void G() {
        jl jlVar = this.f35953b.E;
        int childCount = jlVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = jlVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override
    public final void X(int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35953b;
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(chatAttachAlertPhotoLayout, i7);
        if (O != null) {
            O.getImageView().r();
            org.telegram.messenger.gf e02 = chatAttachAlertPhotoLayout.e0(i7);
            if (e02 != null) {
                int i10 = e02.C;
                String str = e02.I;
                if (e02.f26828g != null) {
                    O.getImageView().h(e02.f26828g, null, org.telegram.ui.ActionBar.k6.R4);
                } else if (e02.f26825c != null) {
                    O.getImageView().h(e02.f26825c, null, org.telegram.ui.ActionBar.k6.R4);
                } else if (str != null) {
                    O.getImageView().s(e02.J, e02.K, true);
                    if (e02.f26824b) {
                        l9 imageView = O.getImageView();
                        imageView.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.k6.R4);
                        return;
                    }
                    l9 imageView2 = O.getImageView();
                    imageView2.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.k6.R4);
                } else {
                    O.getImageView().setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
                }
            }
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.f2 f2Var = this.f35953b.f38948b.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            return ((org.telegram.ui.an) f2Var).a();
        }
        return 0L;
    }

    @Override
    public final void a0(int i7) {
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(this.f35953b, i7);
        if (O != null) {
            O.g(true);
        }
    }

    @Override
    public final void d() {
        boolean z9 = ChatAttachAlertPhotoLayout.f31183q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35953b;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.s0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f31185s1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f31186t1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof org.telegram.messenger.gf) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                    charSequence2 = gfVar.f26823a;
                    arrayList = gfVar.f26834n;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof org.telegram.messenger.kf) {
                    org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                    charSequence2 = kfVar.I;
                    arrayList = kfVar.f26834n;
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
                this.f35953b.f38948b.a1().setText(r5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z9 = ChatAttachAlertPhotoLayout.f31183q1;
    }

    @Override
    public final org.telegram.messenger.jc j(int i7) {
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(this.f35953b, i7);
        if (O != null) {
            return O.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final boolean l() {
        di diVar = this.f35953b.f38948b;
        if (diVar != null && (diVar.W1 instanceof org.telegram.ui.an)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35953b;
        di diVar = chatAttachAlertPhotoLayout.f38948b;
        diVar.f32945p4 = true;
        boolean z11 = ChatAttachAlertPhotoLayout.f31183q1;
        org.telegram.messenger.gf e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 != null) {
            e02.f26839s = j20Var;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f31185s1;
        if (hashMap.isEmpty() && e02 != null) {
            chatAttachAlertPhotoLayout.S(e02, -1);
        }
        if (!diVar.O0(diVar.a1().getText())) {
            diVar.M0();
            if (PhotoViewer.p1().f41473o7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f31186t1;
                if (!hashMap.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        Object obj = hashMap.get(arrayList.get(i12));
                        if (obj instanceof org.telegram.messenger.gf) {
                            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                            if (i12 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.p1().f41482p7};
                                gfVar.f26834n = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24459s0).W(charSequenceArr, false, true);
                                CharSequence charSequence = charSequenceArr[0];
                                gfVar.f26823a = charSequence;
                                if (diVar.O0(charSequence)) {
                                    return;
                                }
                            } else {
                                gfVar.f26823a = null;
                            }
                        }
                    }
                }
            }
            if (diVar != null) {
                diVar.C3 = false;
            }
            PhotoViewer.p1();
            PhotoViewer.p1().O = false;
            PhotoViewer.p1().f41522u2 = false;
            v4.X(diVar.D3, diVar.X0() + ChatAttachAlertPhotoLayout.f31185s1.size(), diVar.b1(), new fl(this, z9, i10, z10));
        }
    }

    @Override
    public final boolean q() {
        di diVar = this.f35953b.f38948b;
        if (diVar != null && diVar.B3 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z9 = ChatAttachAlertPhotoLayout.f31183q1;
        this.f35953b.s0(-1, false);
    }

    @Override
    public final boolean w() {
        org.telegram.messenger.ij ijVar;
        di diVar = this.f35953b.f38948b;
        if (diVar != null && (ijVar = diVar.B3) != null && ijVar.q5()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        di diVar = this.f35953b.f38948b;
        if (!diVar.f32970w1 && !diVar.f32978y1) {
            return true;
        }
        return false;
    }
}
