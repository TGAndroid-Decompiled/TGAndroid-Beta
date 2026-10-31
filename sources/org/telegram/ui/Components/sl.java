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
    public final ChatAttachAlertPhotoLayout f30262b;

    public sl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f30262b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        bi biVar = this.f30262b.f30947b;
        if (biVar != null && biVar.T1) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23845q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30262b;
        chatAttachAlertPhotoLayout.n0();
        org.telegram.messenger.i0.h3(new tf(this, 25), 150L);
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f23847s1.size());
    }

    @Override
    public final org.telegram.ui.gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ct ctVar;
        org.telegram.ui.gs0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30262b;
        bi biVar = chatAttachAlertPhotoLayout.f30947b;
        if (z11 && (ctVar = biVar.L2) != null && (closeIntoObject = ((a40) ctVar.f25157b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.v5 N = ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout, i10);
        if (N != null) {
            int[] iArr = new int[2];
            N.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - biVar.T();
            }
            org.telegram.ui.gs0 gs0Var = new org.telegram.ui.gs0();
            gs0Var.f37628b = iArr[0];
            gs0Var.f37629c = iArr[1];
            gs0Var.d = chatAttachAlertPhotoLayout.E;
            ImageReceiver imageReceiver = N.getImageView().getImageReceiver();
            gs0Var.f37627a = imageReceiver;
            gs0Var.e = imageReceiver.p();
            gs0Var.f37634k = N.getScale();
            gs0Var.f37632i = (int) biVar.Y0();
            N.g(false);
            return gs0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30262b;
        bi biVar = chatAttachAlertPhotoLayout.f30947b;
        if (biVar != null && biVar.T1 != z10) {
            biVar.u1(z10, true);
            chatAttachAlertPhotoLayout.f23857d1.a(!chatAttachAlertPhotoLayout.f30947b.T1, true);
        }
    }

    @Override
    public final void G() {
        pl plVar = this.f30262b.E;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30262b;
        org.telegram.ui.Cells.v5 N = ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout, i10);
        if (N != null) {
            N.getImageView().r();
            org.telegram.messenger.ef c02 = chatAttachAlertPhotoLayout.c0(i10);
            if (c02 != null) {
                int i11 = c02.C;
                String str = c02.I;
                if (c02.f19510g != null) {
                    N.getImageView().h(c02.f19510g, null, org.telegram.ui.ActionBar.t6.R4);
                } else if (c02.f19508c != null) {
                    N.getImageView().h(c02.f19508c, null, org.telegram.ui.ActionBar.t6.R4);
                } else if (str != null) {
                    N.getImageView().s(c02.J, c02.K, true);
                    if (c02.f19507b) {
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
        org.telegram.ui.ActionBar.k2 k2Var = this.f30262b.f30947b.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            return ((org.telegram.ui.un) k2Var).a();
        }
        return 0L;
    }

    @Override
    public final void a0(int i10) {
        org.telegram.ui.Cells.v5 N = ChatAttachAlertPhotoLayout.N(this.f30262b, i10);
        if (N != null) {
            N.g(true);
        }
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23845q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30262b;
        chatAttachAlertPhotoLayout.l0();
        chatAttachAlertPhotoLayout.q0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f23847s1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f23848t1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                    charSequence2 = efVar.f19506a;
                    arrayList = efVar.f19516n;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    charSequence2 = hfVar.I;
                    arrayList = hfVar.f19516n;
                }
                ArrayList arrayList3 = arrayList;
                if (charSequence2 != null && arrayList3 != null) {
                    if (!(charSequence2 instanceof Spannable)) {
                        spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                    } else {
                        spannableStringBuilder = charSequence2;
                    }
                    org.telegram.messenger.jj.b(spannableStringBuilder, arrayList3, false, false, false, false, 0);
                    charSequence2 = spannableStringBuilder;
                }
                this.f30262b.f30947b.Z0().setText(o5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23845q1;
    }

    @Override
    public final org.telegram.messenger.kc j(int i10) {
        org.telegram.ui.Cells.v5 N = ChatAttachAlertPhotoLayout.N(this.f30262b, i10);
        if (N != null) {
            return N.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final boolean l() {
        bi biVar = this.f30262b.f30947b;
        if (biVar != null && (biVar.W1 instanceof org.telegram.ui.un)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30262b;
        bi biVar = chatAttachAlertPhotoLayout.f30947b;
        biVar.f24711p4 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f23845q1;
        org.telegram.messenger.ef c02 = chatAttachAlertPhotoLayout.c0(i10);
        if (c02 != null) {
            c02.f19521s = x20Var;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f23847s1;
        if (hashMap.isEmpty() && c02 != null) {
            chatAttachAlertPhotoLayout.R(c02, -1);
        }
        if (!biVar.O0(biVar.Z0().getText())) {
            biVar.M0();
            if (PhotoViewer.v1().f33572p7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f23848t1;
                if (!hashMap.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        Object obj = hashMap.get(arrayList.get(i13));
                        if (obj instanceof org.telegram.messenger.ef) {
                            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                            if (i13 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.v1().f33580q7};
                                efVar.f19516n = org.telegram.messenger.ui.b0(org.telegram.messenger.d20.f15147s0).W(charSequenceArr, false, true);
                                CharSequence charSequence = charSequenceArr[0];
                                efVar.f19506a = charSequence;
                                if (biVar.O0(charSequence)) {
                                    return;
                                }
                            } else {
                                efVar.f19506a = null;
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
            PhotoViewer.v1().f33613u2 = false;
            s4.Z(biVar.D3, biVar.W0() + ChatAttachAlertPhotoLayout.f23847s1.size(), biVar.a1(), new kl(this, z10, i11, z11));
        }
    }

    @Override
    public final boolean q() {
        bi biVar = this.f30262b.f30947b;
        if (biVar != null && biVar.B3 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23845q1;
        this.f30262b.q0(-1, false);
    }

    @Override
    public final boolean w() {
        org.telegram.messenger.jj jjVar;
        bi biVar = this.f30262b.f30947b;
        if (biVar != null && (jjVar = biVar.B3) != null && jjVar.p5()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        bi biVar = this.f30262b.f30947b;
        if (!biVar.f24736w1 && !biVar.f24744y1) {
            return true;
        }
        return false;
    }
}
