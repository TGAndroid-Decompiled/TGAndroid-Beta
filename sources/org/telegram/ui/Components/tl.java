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
public final class tl extends wl {
    public final ChatAttachAlertPhotoLayout f39711b;

    public tl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f39711b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        ki kiVar = this.f39711b.f33609b;
        if (kiVar != null && kiVar.X1) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32365r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39711b;
        chatAttachAlertPhotoLayout.p0();
        org.telegram.messenger.g0.i3(new dg(this, 26), 150L);
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f32367t1.size());
    }

    @Override
    public final org.telegram.ui.uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        xs xsVar;
        org.telegram.ui.uq0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39711b;
        ki kiVar = chatAttachAlertPhotoLayout.f33609b;
        if (z11 && (xsVar = kiVar.P2) != null && (closeIntoObject = ((l30) xsVar.f41749b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.q5 P = ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout, i7);
        if (P != null) {
            int[] iArr = new int[2];
            P.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - kiVar.T();
            }
            org.telegram.ui.uq0 uq0Var = new org.telegram.ui.uq0();
            uq0Var.f51998b = iArr[0];
            uq0Var.f51999c = iArr[1];
            uq0Var.d = chatAttachAlertPhotoLayout.F;
            ImageReceiver imageReceiver = P.getImageView().getImageReceiver();
            uq0Var.f51997a = imageReceiver;
            uq0Var.f52000e = imageReceiver.p();
            uq0Var.f52005k = P.getScale();
            uq0Var.f52003i = (int) kiVar.Z0();
            P.g(false);
            return uq0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39711b;
        ki kiVar = chatAttachAlertPhotoLayout.f33609b;
        if (kiVar != null && kiVar.X1 != z10) {
            kiVar.v1(z10, true);
            chatAttachAlertPhotoLayout.f32379e1.a(!chatAttachAlertPhotoLayout.f33609b.X1, true);
        }
    }

    @Override
    public final void G() {
        ql qlVar = this.f39711b.F;
        int childCount = qlVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = qlVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override
    public final void X(int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39711b;
        org.telegram.ui.Cells.q5 P = ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout, i7);
        if (P != null) {
            P.getImageView().r();
            org.telegram.messenger.ff e02 = chatAttachAlertPhotoLayout.e0(i7);
            if (e02 != null) {
                int i10 = e02.C;
                String str = e02.I;
                if (e02.f27714g != null) {
                    P.getImageView().h(e02.f27714g, null, org.telegram.ui.ActionBar.j6.R4);
                } else if (e02.f27711c != null) {
                    P.getImageView().h(e02.f27711c, null, org.telegram.ui.ActionBar.j6.R4);
                } else if (str != null) {
                    P.getImageView().s(e02.J, e02.K, true);
                    if (e02.f27710b) {
                        i9 imageView = P.getImageView();
                        imageView.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.j6.R4);
                        return;
                    }
                    i9 imageView2 = P.getImageView();
                    imageView2.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.j6.R4);
                } else {
                    P.getImageView().setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
                }
            }
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.e2 e2Var = this.f39711b.f33609b.f36424a2;
        if (e2Var instanceof org.telegram.ui.an) {
            return ((org.telegram.ui.an) e2Var).a();
        }
        return 0L;
    }

    @Override
    public final void a0(int i7) {
        org.telegram.ui.Cells.q5 P = ChatAttachAlertPhotoLayout.P(this.f39711b, i7);
        if (P != null) {
            P.g(true);
        }
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32365r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39711b;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.s0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f32367t1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f32368u1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof org.telegram.messenger.ff) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                    charSequence2 = ffVar.f27709a;
                    arrayList = ffVar.f27720n;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof org.telegram.messenger.jf) {
                    org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                    charSequence2 = jfVar.I;
                    arrayList = jfVar.f27720n;
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
                this.f39711b.f33609b.a1().setText(p5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32365r1;
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        org.telegram.ui.Cells.q5 P = ChatAttachAlertPhotoLayout.P(this.f39711b, i7);
        if (P != null) {
            return P.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final boolean l() {
        ki kiVar = this.f39711b.f33609b;
        if (kiVar != null && (kiVar.f36424a2 instanceof org.telegram.ui.an)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39711b;
        ki kiVar = chatAttachAlertPhotoLayout.f33609b;
        kiVar.f36487t4 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f32365r1;
        org.telegram.messenger.ff e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 != null) {
            e02.f27725s = g20Var;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f32367t1;
        if (hashMap.isEmpty() && e02 != null) {
            chatAttachAlertPhotoLayout.T(e02, -1);
        }
        if (!kiVar.O0(kiVar.a1().getText())) {
            kiVar.M0();
            if (PhotoViewer.p1().f42854p7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f32368u1;
                if (!hashMap.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        Object obj = hashMap.get(arrayList.get(i12));
                        if (obj instanceof org.telegram.messenger.ff) {
                            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                            if (i12 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.p1().f42863q7};
                                ffVar.f27720n = org.telegram.messenger.si.b0(org.telegram.messenger.m10.f24940t0).W(charSequenceArr, false, true);
                                CharSequence charSequence = charSequenceArr[0];
                                ffVar.f27709a = charSequence;
                                if (kiVar.O0(charSequence)) {
                                    return;
                                }
                            } else {
                                ffVar.f27709a = null;
                            }
                        }
                    }
                }
            }
            if (kiVar != null) {
                kiVar.G3 = false;
            }
            PhotoViewer.p1();
            PhotoViewer.p1().P = false;
            PhotoViewer.p1().f42903v2 = false;
            t4.X(kiVar.H3, kiVar.X0() + ChatAttachAlertPhotoLayout.f32367t1.size(), kiVar.b1(), new ml(this, z10, i10, z11));
        }
    }

    @Override
    public final boolean q() {
        ki kiVar = this.f39711b.f33609b;
        if (kiVar != null && kiVar.F3 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32365r1;
        this.f39711b.s0(-1, false);
    }

    @Override
    public final boolean w() {
        org.telegram.messenger.gj gjVar;
        ki kiVar = this.f39711b.f33609b;
        if (kiVar != null && (gjVar = kiVar.F3) != null && gjVar.p5()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        ki kiVar = this.f39711b.f33609b;
        if (!kiVar.A1 && !kiVar.C1) {
            return true;
        }
        return false;
    }
}
