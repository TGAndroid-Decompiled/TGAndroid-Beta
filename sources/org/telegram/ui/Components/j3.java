package org.telegram.ui.Components;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class j3 implements View.OnClickListener {
    public final int f36383a = 1;
    public final int[] f36384b;
    public final Object f36385c;
    public final Object d;
    public final KeyEvent.Callback f36386e;
    public final ViewGroup f36387f;
    public final Object h;
    public final Object f36388n;
    public final Object f36389r;

    public j3(FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.w2 w2Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.messenger.camera.i iVar) {
        this.f36385c = frameLayout;
        this.d = h6Var;
        this.f36386e = w2Var;
        this.f36387f = frameLayout2;
        this.f36384b = iArr;
        this.h = strArr;
        this.f36388n = iArr2;
        this.f36389r = iVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f36383a;
        Object obj = this.f36389r;
        Object obj2 = this.f36388n;
        Object obj3 = this.h;
        int[] iArr = this.f36384b;
        ViewGroup viewGroup = this.f36387f;
        KeyEvent.Callback callback = this.f36386e;
        Object obj4 = this.d;
        Object obj5 = this.f36385c;
        switch (i7) {
            case 0:
                di.i0 i0Var = (di.i0) obj2;
                hi.w4 w4Var = (hi.w4) obj;
                ((boolean[]) obj5)[0] = false;
                int c10 = (int) (c5.c(null, (tb0) obj4, (tb0) callback, (tb0) viewGroup, (tb0) obj3) / 1000);
                int i10 = iArr[0];
                ot otVar = (ot) i0Var.f9027c;
                int i11 = i0Var.f9025a;
                int i12 = i0Var.f9026b;
                Editable text = otVar.getText();
                ?? obj6 = new Object();
                obj6.f35337a |= 128;
                obj6.f35338b = i11;
                obj6.f35339c = i12;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.date = c10;
                tL_messageEntityFormattedDate.flags = i10;
                tL_messageEntityFormattedDate.applyFlags();
                try {
                    text.setSpan(new m00(text.subSequence(i11, i12).toString(), obj6, tL_messageEntityFormattedDate), i11, i12, 33);
                } catch (Exception unused) {
                }
                mt mtVar = otVar.T1;
                if (mtVar != null) {
                    mtVar.g();
                }
                ((org.telegram.ui.ActionBar.w2) w4Var.f15708b).f30218y0.run();
                return;
            default:
                FrameLayout frameLayout = (FrameLayout) obj5;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) callback;
                FrameLayout frameLayout2 = (FrameLayout) viewGroup;
                String[] strArr = (String[]) obj3;
                int[] iArr2 = (int[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24968t0).q()) {
                    new lc(frameLayout, h6Var).Q(2131624217, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.hd.N0(2131748304, null), new org.telegram.messenger.j2(23))).j();
                    return;
                }
                a70 G = a70.G(w2Var.f30179c, h6Var, frameLayout2);
                for (int i13 = 0; i13 < iArr.length; i13++) {
                    G.c(0, strArr[i13], new d3(iArr2, iArr[i13], runnable), false);
                }
                G.f33378i = 1;
                G.a0();
                return;
        }
    }

    public j3(boolean[] zArr, tb0 tb0Var, tb0 tb0Var2, tb0 tb0Var3, tb0 tb0Var4, di.i0 i0Var, int[] iArr, hi.w4 w4Var) {
        this.f36385c = zArr;
        this.d = tb0Var;
        this.f36386e = tb0Var2;
        this.f36387f = tb0Var3;
        this.h = tb0Var4;
        this.f36388n = i0Var;
        this.f36384b = iArr;
        this.f36389r = w4Var;
    }
}
