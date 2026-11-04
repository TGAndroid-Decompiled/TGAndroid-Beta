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
    public final ChatAttachAlertPhotoLayout f35787b;

    public ll(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f35787b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        bi biVar = this.f35787b.f38416b;
        if (biVar != null && biVar.U1) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f31258r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35787b;
        chatAttachAlertPhotoLayout.p0();
        org.telegram.messenger.g0.i3(new vf(this, 24), 150L);
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f31260t1.size());
    }

    @Override
    public final org.telegram.ui.mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        qs qsVar;
        org.telegram.ui.mq0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35787b;
        bi biVar = chatAttachAlertPhotoLayout.f38416b;
        if (z11 && (qsVar = biVar.M2) != null && (closeIntoObject = ((e30) qsVar.f37520b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(chatAttachAlertPhotoLayout, i3);
        if (O != null) {
            int[] iArr = new int[2];
            O.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - biVar.S();
            }
            org.telegram.ui.mq0 mq0Var = new org.telegram.ui.mq0();
            mq0Var.f47752b = iArr[0];
            mq0Var.f47753c = iArr[1];
            mq0Var.d = chatAttachAlertPhotoLayout.F;
            ImageReceiver imageReceiver = O.getImageView().getImageReceiver();
            mq0Var.f47751a = imageReceiver;
            mq0Var.f47754e = imageReceiver.p();
            mq0Var.f47759k = O.getScale();
            mq0Var.f47757i = (int) biVar.Z0();
            O.g(false);
            return mq0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35787b;
        bi biVar = chatAttachAlertPhotoLayout.f38416b;
        if (biVar != null && biVar.U1 != z10) {
            biVar.v1(z10, true);
            chatAttachAlertPhotoLayout.f31272e1.a(!chatAttachAlertPhotoLayout.f38416b.U1, true);
        }
    }

    @Override
    public final void G() {
        il ilVar = this.f35787b.F;
        int childCount = ilVar.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = ilVar.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override
    public final void X(int i3) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35787b;
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(chatAttachAlertPhotoLayout, i3);
        if (O != null) {
            O.getImageView().r();
            org.telegram.messenger.ye e02 = chatAttachAlertPhotoLayout.e0(i3);
            if (e02 != null) {
                int i10 = e02.C;
                String str = e02.I;
                if (e02.f25314g != null) {
                    O.getImageView().h(e02.f25314g, null, org.telegram.ui.ActionBar.k6.R4);
                } else if (e02.f25311c != null) {
                    O.getImageView().h(e02.f25311c, null, org.telegram.ui.ActionBar.k6.R4);
                } else if (str != null) {
                    O.getImageView().s(e02.J, e02.K, true);
                    if (e02.f25310b) {
                        k9 imageView = O.getImageView();
                        imageView.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.k6.R4);
                        return;
                    }
                    k9 imageView2 = O.getImageView();
                    imageView2.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.k6.R4);
                } else {
                    O.getImageView().setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
                }
            }
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.d2 d2Var = this.f35787b.f38416b.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            return ((org.telegram.ui.wm) d2Var).a();
        }
        return 0L;
    }

    @Override
    public final void a0(int i3) {
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(this.f35787b, i3);
        if (O != null) {
            O.g(true);
        }
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f31258r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35787b;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.s0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f31260t1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f31261u1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof org.telegram.messenger.ye) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                    charSequence2 = yeVar.f25309a;
                    arrayList = yeVar.f25320n;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof org.telegram.messenger.bf) {
                    org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj;
                    charSequence2 = bfVar.I;
                    arrayList = bfVar.f25320n;
                }
                ArrayList arrayList3 = arrayList;
                if (charSequence2 != null && arrayList3 != null) {
                    if (!(charSequence2 instanceof Spannable)) {
                        spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                    } else {
                        spannableStringBuilder = charSequence2;
                    }
                    org.telegram.messenger.zi.b(spannableStringBuilder, arrayList3, false, false, false, false, 0);
                    charSequence2 = spannableStringBuilder;
                }
                this.f35787b.f38416b.a1().setText(p5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f31258r1;
    }

    @Override
    public final org.telegram.messenger.cc j(int i3) {
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(this.f35787b, i3);
        if (O != null) {
            return O.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final boolean l() {
        bi biVar = this.f35787b.f38416b;
        if (biVar != null && (biVar.X1 instanceof org.telegram.ui.wm)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35787b;
        bi biVar = chatAttachAlertPhotoLayout.f38416b;
        biVar.f32265q4 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f31258r1;
        org.telegram.messenger.ye e02 = chatAttachAlertPhotoLayout.e0(i3);
        if (e02 != null) {
            e02.f25325s = b20Var;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f31260t1;
        if (hashMap.isEmpty() && e02 != null) {
            chatAttachAlertPhotoLayout.S(e02, -1);
        }
        if (!biVar.O0(biVar.a1().getText())) {
            biVar.M0();
            if (PhotoViewer.v1().f41520q7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f31261u1;
                if (!hashMap.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        Object obj = hashMap.get(arrayList.get(i12));
                        if (obj instanceof org.telegram.messenger.ye) {
                            org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                            if (i12 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.v1().f41529r7};
                                yeVar.f25320n = org.telegram.messenger.li.b0(org.telegram.messenger.h10.f22829t0).W(charSequenceArr, false, true);
                                CharSequence charSequence = charSequenceArr[0];
                                yeVar.f25309a = charSequence;
                                if (biVar.O0(charSequence)) {
                                    return;
                                }
                            } else {
                                yeVar.f25309a = null;
                            }
                        }
                    }
                }
            }
            if (biVar != null) {
                biVar.D3 = false;
            }
            PhotoViewer.v1();
            PhotoViewer.v1().P = false;
            PhotoViewer.v1().f41560v2 = false;
            t4.Z(biVar.E3, biVar.X0() + ChatAttachAlertPhotoLayout.f31260t1.size(), biVar.b1(), new el(this, z10, i10, z11));
        }
    }

    @Override
    public final boolean q() {
        bi biVar = this.f35787b.f38416b;
        if (biVar != null && biVar.C3 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f31258r1;
        this.f35787b.s0(-1, false);
    }

    @Override
    public final boolean w() {
        org.telegram.messenger.zi ziVar;
        bi biVar = this.f35787b.f38416b;
        if (biVar != null && (ziVar = biVar.C3) != null && ziVar.q5()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        bi biVar = this.f35787b.f38416b;
        if (!biVar.f32290x1 && !biVar.f32298z1) {
            return true;
        }
        return false;
    }
}
