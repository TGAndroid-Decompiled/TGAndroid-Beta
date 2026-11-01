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
public final class sl extends xl {
    public final ChatAttachAlertPhotoLayout f30329b;

    public sl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f30329b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        bi biVar = this.f30329b.f30964b;
        if (biVar != null && biVar.T1) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23846q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30329b;
        chatAttachAlertPhotoLayout.n0();
        org.telegram.messenger.i0.h3(new tf(this, 25), 150L);
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f23848s1.size());
    }

    @Override
    public final org.telegram.ui.fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ct ctVar;
        org.telegram.ui.fs0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30329b;
        bi biVar = chatAttachAlertPhotoLayout.f30964b;
        if (z11 && (ctVar = biVar.L2) != null && (closeIntoObject = ((a40) ctVar.f25236b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.v5 N = ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout, i10);
        if (N != null) {
            int[] iArr = new int[2];
            N.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - biVar.T();
            }
            org.telegram.ui.fs0 fs0Var = new org.telegram.ui.fs0();
            fs0Var.f37216b = iArr[0];
            fs0Var.f37217c = iArr[1];
            fs0Var.d = chatAttachAlertPhotoLayout.E;
            ImageReceiver imageReceiver = N.getImageView().getImageReceiver();
            fs0Var.f37215a = imageReceiver;
            fs0Var.e = imageReceiver.p();
            fs0Var.f37222k = N.getScale();
            fs0Var.f37220i = (int) biVar.Y0();
            N.g(false);
            return fs0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30329b;
        bi biVar = chatAttachAlertPhotoLayout.f30964b;
        if (biVar != null && biVar.T1 != z10) {
            biVar.u1(z10, true);
            chatAttachAlertPhotoLayout.f23858d1.a(!chatAttachAlertPhotoLayout.f30964b.T1, true);
        }
    }

    @Override
    public final void G() {
        pl plVar = this.f30329b.E;
        int childCount = plVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = plVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.v5) {
                ((org.telegram.ui.Cells.v5) childAt).g(true);
            }
        }
    }

    @Override
    public final void X(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30329b;
        org.telegram.ui.Cells.v5 N = ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout, i10);
        if (N != null) {
            N.getImageView().r();
            org.telegram.messenger.ff c02 = chatAttachAlertPhotoLayout.c0(i10);
            if (c02 != null) {
                int i11 = c02.C;
                String str = c02.I;
                if (c02.f14606g != null) {
                    N.getImageView().h(c02.f14606g, null, org.telegram.ui.ActionBar.t6.R4);
                } else if (c02.f14604c != null) {
                    N.getImageView().h(c02.f14604c, null, org.telegram.ui.ActionBar.t6.R4);
                } else if (str != null) {
                    N.getImageView().s(c02.J, c02.K, true);
                    if (c02.f14603b) {
                        g9 imageView = N.getImageView();
                        imageView.h("vthumb://" + i11 + ":" + str, null, org.telegram.ui.ActionBar.t6.R4);
                        return;
                    }
                    g9 imageView2 = N.getImageView();
                    imageView2.h("thumb://" + i11 + ":" + str, null, org.telegram.ui.ActionBar.t6.R4);
                } else {
                    N.getImageView().setImageDrawable(org.telegram.ui.ActionBar.t6.R4);
                }
            }
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.k2 k2Var = this.f30329b.f30964b.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            return ((org.telegram.ui.un) k2Var).a();
        }
        return 0L;
    }

    @Override
    public final void a0(int i10) {
        org.telegram.ui.Cells.v5 N = ChatAttachAlertPhotoLayout.N(this.f30329b, i10);
        if (N != null) {
            N.g(true);
        }
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23846q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30329b;
        chatAttachAlertPhotoLayout.l0();
        chatAttachAlertPhotoLayout.q0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f23848s1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f23849t1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof org.telegram.messenger.ff) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                    charSequence2 = ffVar.f14602a;
                    arrayList = ffVar.f14612n;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof org.telegram.messenger.jf) {
                    org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                    charSequence2 = jfVar.I;
                    arrayList = jfVar.f14612n;
                }
                ArrayList arrayList3 = arrayList;
                if (charSequence2 != null && arrayList3 != null) {
                    if (!(charSequence2 instanceof Spannable)) {
                        spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                    } else {
                        spannableStringBuilder = charSequence2;
                    }
                    org.telegram.messenger.kj.b(spannableStringBuilder, arrayList3, false, false, false, false, 0);
                    charSequence2 = spannableStringBuilder;
                }
                this.f30329b.f30964b.Z0().setText(o5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23846q1;
    }

    @Override
    public final org.telegram.messenger.lc j(int i10) {
        org.telegram.ui.Cells.v5 N = ChatAttachAlertPhotoLayout.N(this.f30329b, i10);
        if (N != null) {
            return N.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final boolean l() {
        bi biVar = this.f30329b.f30964b;
        if (biVar != null && (biVar.W1 instanceof org.telegram.ui.un)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30329b;
        bi biVar = chatAttachAlertPhotoLayout.f30964b;
        biVar.f24802p4 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f23846q1;
        org.telegram.messenger.ff c02 = chatAttachAlertPhotoLayout.c0(i10);
        if (c02 != null) {
            c02.f14617s = y20Var;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f23848s1;
        if (hashMap.isEmpty() && c02 != null) {
            chatAttachAlertPhotoLayout.R(c02, -1);
        }
        if (!biVar.O0(biVar.Z0().getText())) {
            biVar.M0();
            if (PhotoViewer.v1().f33579p7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f23849t1;
                if (!hashMap.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        Object obj = hashMap.get(arrayList.get(i13));
                        if (obj instanceof org.telegram.messenger.ff) {
                            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                            if (i13 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.v1().f33587q7};
                                ffVar.f14612n = org.telegram.messenger.vi.b0(org.telegram.messenger.e20.f15506s0).W(charSequenceArr, false, true);
                                CharSequence charSequence = charSequenceArr[0];
                                ffVar.f14602a = charSequence;
                                if (biVar.O0(charSequence)) {
                                    return;
                                }
                            } else {
                                ffVar.f14602a = null;
                            }
                        }
                    }
                }
            }
            if (biVar != null) {
                biVar.C3 = false;
            }
            PhotoViewer.v1();
            PhotoViewer.v1().O = false;
            PhotoViewer.v1().f33620u2 = false;
            s4.Z(biVar.D3, biVar.W0() + ChatAttachAlertPhotoLayout.f23848s1.size(), biVar.a1(), new kl(this, z10, i11, z11));
        }
    }

    @Override
    public final boolean q() {
        bi biVar = this.f30329b.f30964b;
        if (biVar != null && biVar.B3 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23846q1;
        this.f30329b.q0(-1, false);
    }

    @Override
    public final boolean w() {
        org.telegram.messenger.kj kjVar;
        bi biVar = this.f30329b.f30964b;
        if (biVar != null && (kjVar = biVar.B3) != null && kjVar.p5()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        bi biVar = this.f30329b.f30964b;
        if (!biVar.f24827w1 && !biVar.f24835y1) {
            return true;
        }
        return false;
    }
}
