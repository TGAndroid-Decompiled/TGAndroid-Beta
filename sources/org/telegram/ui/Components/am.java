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
    public final ChatAttachAlertPhotoLayout f33495b;

    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f33495b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        ti tiVar = this.f33495b.f37135b;
        if (tiVar != null && tiVar.X1) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32862r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33495b;
        chatAttachAlertPhotoLayout.p0();
        org.telegram.messenger.g0.h3(new ng(this, 26), 150L);
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f32864t1.size());
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        dt dtVar;
        org.telegram.ui.wq0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33495b;
        ti tiVar = chatAttachAlertPhotoLayout.f37135b;
        if (z11 && (dtVar = tiVar.P2) != null && (closeIntoObject = ((t30) dtVar.f34453b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.r5 P = ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout, i7);
        if (P != null) {
            int[] iArr = new int[2];
            P.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - tiVar.T();
            }
            org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0();
            wq0Var.f53727b = iArr[0];
            wq0Var.f53728c = iArr[1];
            wq0Var.d = chatAttachAlertPhotoLayout.F;
            ImageReceiver imageReceiver = P.getImageView().getImageReceiver();
            wq0Var.f53726a = imageReceiver;
            wq0Var.f53729e = imageReceiver.p();
            wq0Var.f53734k = P.getScale();
            wq0Var.f53732i = (int) tiVar.a1();
            P.g(false);
            return wq0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33495b;
        ti tiVar = chatAttachAlertPhotoLayout.f37135b;
        if (tiVar != null && tiVar.X1 != z10) {
            tiVar.w1(z10, true);
            chatAttachAlertPhotoLayout.f32876e1.a(!chatAttachAlertPhotoLayout.f37135b.X1, true);
        }
    }

    @Override
    public final void G() {
        xl xlVar = this.f33495b.F;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33495b;
        org.telegram.ui.Cells.r5 P = ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout, i7);
        if (P != null) {
            P.getImageView().r();
            org.telegram.messenger.ef e02 = chatAttachAlertPhotoLayout.e0(i7);
            if (e02 != null) {
                int i10 = e02.C;
                String str = e02.I;
                if (e02.f27967g != null) {
                    P.getImageView().h(e02.f27967g, null, org.telegram.ui.ActionBar.n6.R4);
                } else if (e02.f27964c != null) {
                    P.getImageView().h(e02.f27964c, null, org.telegram.ui.ActionBar.n6.R4);
                } else if (str != null) {
                    P.getImageView().s(e02.J, e02.K, true);
                    if (e02.f27963b) {
                        p9 imageView = P.getImageView();
                        imageView.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.n6.R4);
                        return;
                    }
                    p9 imageView2 = P.getImageView();
                    imageView2.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.n6.R4);
                } else {
                    P.getImageView().setImageDrawable(org.telegram.ui.ActionBar.n6.R4);
                }
            }
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.g2 g2Var = this.f33495b.f37135b.f39956a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) g2Var).a();
        }
        return 0L;
    }

    @Override
    public final void a0(int i7) {
        org.telegram.ui.Cells.r5 P = ChatAttachAlertPhotoLayout.P(this.f33495b, i7);
        if (P != null) {
            P.g(true);
        }
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32862r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33495b;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.s0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f32864t1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f32865u1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                    charSequence2 = efVar.f27962a;
                    arrayList = efVar.f27973n;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    charSequence2 = hfVar.I;
                    arrayList = hfVar.f27973n;
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
                this.f33495b.f37135b.b1().setText(x5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32862r1;
    }

    @Override
    public final org.telegram.messenger.hc j(int i7) {
        org.telegram.ui.Cells.r5 P = ChatAttachAlertPhotoLayout.P(this.f33495b, i7);
        if (P != null) {
            return P.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final boolean l() {
        ti tiVar = this.f33495b.f37135b;
        if (tiVar != null && (tiVar.f39956a2 instanceof org.telegram.ui.bn)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.d20 d20Var, boolean z10, int i10, int i11, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33495b;
        ti tiVar = chatAttachAlertPhotoLayout.f37135b;
        tiVar.f40019t4 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f32862r1;
        org.telegram.messenger.ef e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 != null) {
            e02.f27978s = d20Var;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f32864t1;
        if (hashMap.isEmpty() && e02 != null) {
            chatAttachAlertPhotoLayout.T(e02, -1);
        }
        if (!tiVar.P0(tiVar.b1().getText())) {
            tiVar.N0();
            if (PhotoViewer.p1().f43479v7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f32865u1;
                if (!hashMap.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        Object obj = hashMap.get(arrayList.get(i12));
                        if (obj instanceof org.telegram.messenger.ef) {
                            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                            if (i12 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.p1().f43489w7};
                                efVar.f27973n = org.telegram.messenger.ri.d0(org.telegram.messenger.i10.f24637t0).Y(charSequenceArr, false, true);
                                CharSequence charSequence = charSequenceArr[0];
                                efVar.f27962a = charSequence;
                                if (tiVar.P0(charSequence)) {
                                    return;
                                }
                            } else {
                                efVar.f27962a = null;
                            }
                        }
                    }
                }
            }
            if (tiVar != null) {
                tiVar.G3 = false;
            }
            PhotoViewer.p1();
            PhotoViewer.p1().P = false;
            PhotoViewer.p1().f43474v2 = false;
            b5.X(tiVar.H3, tiVar.Y0() + ChatAttachAlertPhotoLayout.f32864t1.size(), tiVar.c1(), new tl(this, z10, i10, z11));
        }
    }

    @Override
    public final boolean q() {
        ti tiVar = this.f33495b.f37135b;
        if (tiVar != null && tiVar.F3 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32862r1;
        this.f33495b.s0(-1, false);
    }

    @Override
    public final boolean w() {
        org.telegram.messenger.fj fjVar;
        ti tiVar = this.f33495b.f37135b;
        if (tiVar != null && (fjVar = tiVar.F3) != null && fjVar.p5()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        ti tiVar = this.f33495b.f37135b;
        if (!tiVar.A1 && !tiVar.C1) {
            return true;
        }
        return false;
    }
}
