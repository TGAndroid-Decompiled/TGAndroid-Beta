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
    public final ChatAttachAlertPhotoLayout f36106b;

    public ml(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f36106b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        di diVar = this.f36106b.f39071b;
        if (diVar != null && diVar.T1) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z9 = ChatAttachAlertPhotoLayout.f31193q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36106b;
        chatAttachAlertPhotoLayout.p0();
        org.telegram.messenger.g0.i3(new xf(this, 24), 150L);
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f31195s1.size());
    }

    @Override
    public final org.telegram.ui.yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        qs qsVar;
        org.telegram.ui.yq0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36106b;
        di diVar = chatAttachAlertPhotoLayout.f39071b;
        if (z10 && (qsVar = diVar.L2) != null && (closeIntoObject = ((j30) qsVar.f37472b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(chatAttachAlertPhotoLayout, i7);
        if (O != null) {
            int[] iArr = new int[2];
            O.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - diVar.S();
            }
            org.telegram.ui.yq0 yq0Var = new org.telegram.ui.yq0();
            yq0Var.f52160b = iArr[0];
            yq0Var.f52161c = iArr[1];
            yq0Var.d = chatAttachAlertPhotoLayout.E;
            ImageReceiver imageReceiver = O.getImageView().getImageReceiver();
            yq0Var.f52159a = imageReceiver;
            yq0Var.f52162e = imageReceiver.p();
            yq0Var.f52167k = O.getScale();
            yq0Var.f52165i = (int) diVar.Z0();
            O.g(false);
            return yq0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z9) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36106b;
        di diVar = chatAttachAlertPhotoLayout.f39071b;
        if (diVar != null && diVar.T1 != z9) {
            diVar.v1(z9, true);
            chatAttachAlertPhotoLayout.f31205d1.a(!chatAttachAlertPhotoLayout.f39071b.T1, true);
        }
    }

    @Override
    public final void G() {
        jl jlVar = this.f36106b.E;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36106b;
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(chatAttachAlertPhotoLayout, i7);
        if (O != null) {
            O.getImageView().r();
            org.telegram.messenger.gf e02 = chatAttachAlertPhotoLayout.e0(i7);
            if (e02 != null) {
                int i10 = e02.C;
                String str = e02.I;
                if (e02.f26849g != null) {
                    O.getImageView().h(e02.f26849g, null, org.telegram.ui.ActionBar.l6.R4);
                } else if (e02.f26846c != null) {
                    O.getImageView().h(e02.f26846c, null, org.telegram.ui.ActionBar.l6.R4);
                } else if (str != null) {
                    O.getImageView().s(e02.J, e02.K, true);
                    if (e02.f26845b) {
                        l9 imageView = O.getImageView();
                        imageView.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.l6.R4);
                        return;
                    }
                    l9 imageView2 = O.getImageView();
                    imageView2.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.l6.R4);
                } else {
                    O.getImageView().setImageDrawable(org.telegram.ui.ActionBar.l6.R4);
                }
            }
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.f2 f2Var = this.f36106b.f39071b.W1;
        if (f2Var instanceof org.telegram.ui.cn) {
            return ((org.telegram.ui.cn) f2Var).a();
        }
        return 0L;
    }

    @Override
    public final void a0(int i7) {
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(this.f36106b, i7);
        if (O != null) {
            O.g(true);
        }
    }

    @Override
    public final void d() {
        boolean z9 = ChatAttachAlertPhotoLayout.f31193q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36106b;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.s0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f31195s1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f31196t1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof org.telegram.messenger.gf) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                    charSequence2 = gfVar.f26844a;
                    arrayList = gfVar.f26855n;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof org.telegram.messenger.kf) {
                    org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                    charSequence2 = kfVar.I;
                    arrayList = kfVar.f26855n;
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
                this.f36106b.f39071b.a1().setText(r5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z9 = ChatAttachAlertPhotoLayout.f31193q1;
    }

    @Override
    public final org.telegram.messenger.jc j(int i7) {
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(this.f36106b, i7);
        if (O != null) {
            return O.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final boolean l() {
        di diVar = this.f36106b.f39071b;
        if (diVar != null && (diVar.W1 instanceof org.telegram.ui.cn)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36106b;
        di diVar = chatAttachAlertPhotoLayout.f39071b;
        diVar.f33037p4 = true;
        boolean z11 = ChatAttachAlertPhotoLayout.f31193q1;
        org.telegram.messenger.gf e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 != null) {
            e02.f26860s = j20Var;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f31195s1;
        if (hashMap.isEmpty() && e02 != null) {
            chatAttachAlertPhotoLayout.S(e02, -1);
        }
        if (!diVar.O0(diVar.a1().getText())) {
            diVar.M0();
            if (PhotoViewer.p1().f41483o7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f31196t1;
                if (!hashMap.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        Object obj = hashMap.get(arrayList.get(i12));
                        if (obj instanceof org.telegram.messenger.gf) {
                            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                            if (i12 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.p1().f41492p7};
                                gfVar.f26855n = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24470s0).W(charSequenceArr, false, true);
                                CharSequence charSequence = charSequenceArr[0];
                                gfVar.f26844a = charSequence;
                                if (diVar.O0(charSequence)) {
                                    return;
                                }
                            } else {
                                gfVar.f26844a = null;
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
            PhotoViewer.p1().f41532u2 = false;
            v4.X(diVar.D3, diVar.X0() + ChatAttachAlertPhotoLayout.f31195s1.size(), diVar.b1(), new fl(this, z9, i10, z10));
        }
    }

    @Override
    public final boolean q() {
        di diVar = this.f36106b.f39071b;
        if (diVar != null && diVar.B3 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z9 = ChatAttachAlertPhotoLayout.f31193q1;
        this.f36106b.s0(-1, false);
    }

    @Override
    public final boolean w() {
        org.telegram.messenger.ij ijVar;
        di diVar = this.f36106b.f39071b;
        if (diVar != null && (ijVar = diVar.B3) != null && ijVar.p5()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        di diVar = this.f36106b.f39071b;
        if (!diVar.f33062w1 && !diVar.f33070y1) {
            return true;
        }
        return false;
    }
}
