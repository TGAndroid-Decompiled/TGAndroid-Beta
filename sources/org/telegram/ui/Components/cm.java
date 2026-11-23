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
    public final ChatAttachAlertPhotoLayout f34185b;

    public cm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f34185b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        ui uiVar = this.f34185b.f37477b;
        if (uiVar != null && uiVar.X1) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32764r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34185b;
        chatAttachAlertPhotoLayout.p0();
        org.telegram.messenger.g0.h3(new ng(this, 26), 150L);
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.f32766t1.size());
    }

    @Override
    public final org.telegram.ui.xq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ft ftVar;
        org.telegram.ui.xq0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34185b;
        ui uiVar = chatAttachAlertPhotoLayout.f37477b;
        if (z11 && (ftVar = uiVar.P2) != null && (closeIntoObject = ((w30) ftVar.f35271b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.s5 P = ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout, i7);
        if (P != null) {
            int[] iArr = new int[2];
            P.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - uiVar.T();
            }
            org.telegram.ui.xq0 xq0Var = new org.telegram.ui.xq0();
            xq0Var.f53899b = iArr[0];
            xq0Var.f53900c = iArr[1];
            xq0Var.d = chatAttachAlertPhotoLayout.F;
            ImageReceiver imageReceiver = P.getImageView().getImageReceiver();
            xq0Var.f53898a = imageReceiver;
            xq0Var.f53901e = imageReceiver.p();
            xq0Var.f53906k = P.getScale();
            xq0Var.f53904i = (int) uiVar.a1();
            P.g(false);
            return xq0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34185b;
        ui uiVar = chatAttachAlertPhotoLayout.f37477b;
        if (uiVar != null && uiVar.X1 != z10) {
            uiVar.w1(z10, true);
            chatAttachAlertPhotoLayout.f32778e1.a(!chatAttachAlertPhotoLayout.f37477b.X1, true);
        }
    }

    @Override
    public final void G() {
        zl zlVar = this.f34185b.F;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34185b;
        org.telegram.ui.Cells.s5 P = ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout, i7);
        if (P != null) {
            P.getImageView().r();
            org.telegram.messenger.ff e02 = chatAttachAlertPhotoLayout.e0(i7);
            if (e02 != null) {
                int i10 = e02.C;
                String str = e02.I;
                if (e02.f28027g != null) {
                    P.getImageView().h(e02.f28027g, null, org.telegram.ui.ActionBar.m6.R4);
                } else if (e02.f28024c != null) {
                    P.getImageView().h(e02.f28024c, null, org.telegram.ui.ActionBar.m6.R4);
                } else if (str != null) {
                    P.getImageView().s(e02.J, e02.K, true);
                    if (e02.f28023b) {
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
        org.telegram.ui.ActionBar.g2 g2Var = this.f34185b.f37477b.f40352a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) g2Var).a();
        }
        return 0L;
    }

    @Override
    public final void a0(int i7) {
        org.telegram.ui.Cells.s5 P = ChatAttachAlertPhotoLayout.P(this.f34185b, i7);
        if (P != null) {
            P.g(true);
        }
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32764r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34185b;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.s0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f32766t1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f32767u1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof org.telegram.messenger.ff) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                    charSequence2 = ffVar.f28022a;
                    arrayList = ffVar.f28033n;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof org.telegram.messenger.jf) {
                    org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                    charSequence2 = jfVar.I;
                    arrayList = jfVar.f28033n;
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
                this.f34185b.f37477b.b1().setText(y5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32764r1;
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        org.telegram.ui.Cells.s5 P = ChatAttachAlertPhotoLayout.P(this.f34185b, i7);
        if (P != null) {
            return P.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final boolean l() {
        ui uiVar = this.f34185b.f37477b;
        if (uiVar != null && (uiVar.f40352a2 instanceof org.telegram.ui.bn)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34185b;
        ui uiVar = chatAttachAlertPhotoLayout.f37477b;
        uiVar.f40415t4 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f32764r1;
        org.telegram.messenger.ff e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 != null) {
            e02.f28038s = f20Var;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f32766t1;
        if (hashMap.isEmpty() && e02 != null) {
            chatAttachAlertPhotoLayout.T(e02, -1);
        }
        if (!uiVar.P0(uiVar.b1().getText())) {
            uiVar.N0();
            if (PhotoViewer.p1().f43309p7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f32767u1;
                if (!hashMap.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        Object obj = hashMap.get(arrayList.get(i12));
                        if (obj instanceof org.telegram.messenger.ff) {
                            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                            if (i12 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.p1().f43318q7};
                                ffVar.f28033n = org.telegram.messenger.si.d0(org.telegram.messenger.k10.f24932t0).Y(charSequenceArr, false, true);
                                CharSequence charSequence = charSequenceArr[0];
                                ffVar.f28022a = charSequence;
                                if (uiVar.P0(charSequence)) {
                                    return;
                                }
                            } else {
                                ffVar.f28022a = null;
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
            PhotoViewer.p1().f43358v2 = false;
            c5.X(uiVar.H3, uiVar.Y0() + ChatAttachAlertPhotoLayout.f32766t1.size(), uiVar.c1(), new vl(this, z10, i10, z11));
        }
    }

    @Override
    public final boolean q() {
        ui uiVar = this.f34185b.f37477b;
        if (uiVar != null && uiVar.F3 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32764r1;
        this.f34185b.s0(-1, false);
    }

    @Override
    public final boolean w() {
        org.telegram.messenger.gj gjVar;
        ui uiVar = this.f34185b.f37477b;
        if (uiVar != null && (gjVar = uiVar.F3) != null && gjVar.p5()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        ui uiVar = this.f34185b.f37477b;
        if (!uiVar.A1 && !uiVar.C1) {
            return true;
        }
        return false;
    }
}
