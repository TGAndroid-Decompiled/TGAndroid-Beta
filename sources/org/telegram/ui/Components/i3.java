package org.telegram.ui.Components;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class i3 implements View.OnClickListener {
    public final int f35893a = 1;
    public final int[] f35894b;
    public final Object f35895c;
    public final Object d;
    public final KeyEvent.Callback f35896e;
    public final ViewGroup f35897f;
    public final Object h;
    public final Object f35898n;
    public final Object f35899r;

    public i3(FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.w2 w2Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, oi.h hVar) {
        this.f35895c = frameLayout;
        this.d = i6Var;
        this.f35896e = w2Var;
        this.f35897f = frameLayout2;
        this.f35894b = iArr;
        this.h = strArr;
        this.f35898n = iArr2;
        this.f35899r = hVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f35893a;
        Object obj = this.f35899r;
        Object obj2 = this.f35898n;
        Object obj3 = this.h;
        int[] iArr = this.f35894b;
        ViewGroup viewGroup = this.f35897f;
        KeyEvent.Callback callback = this.f35896e;
        Object obj4 = this.d;
        Object obj5 = this.f35895c;
        switch (i7) {
            case 0:
                di.i0 i0Var = (di.i0) obj2;
                h6.o oVar = (h6.o) obj;
                ((boolean[]) obj5)[0] = false;
                int c10 = (int) (b5.c(null, (qb0) obj4, (qb0) callback, (qb0) viewGroup, (qb0) obj3) / 1000);
                int i10 = iArr[0];
                mt mtVar = (mt) i0Var.f8988c;
                int i11 = i0Var.f8986a;
                int i12 = i0Var.f8987b;
                Editable text = mtVar.getText();
                ?? obj6 = new Object();
                obj6.f34924a |= 128;
                obj6.f34925b = i11;
                obj6.f34926c = i12;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.date = c10;
                tL_messageEntityFormattedDate.flags = i10;
                tL_messageEntityFormattedDate.applyFlags();
                try {
                    text.setSpan(new k00(text.subSequence(i11, i12).toString(), obj6, tL_messageEntityFormattedDate), i11, i12, 33);
                } catch (Exception unused) {
                }
                kt ktVar = mtVar.T1;
                if (ktVar != null) {
                    ktVar.u();
                }
                ((org.telegram.ui.ActionBar.w2) oVar.f13936b).f30268y0.run();
                return;
            default:
                FrameLayout frameLayout = (FrameLayout) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) callback;
                FrameLayout frameLayout2 = (FrameLayout) viewGroup;
                String[] strArr = (String[]) obj3;
                int[] iArr2 = (int[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).q()) {
                    new kc(frameLayout, i6Var).Q(2131624217, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.gd.N0(2131748304, null), new org.telegram.messenger.j2(23))).j();
                    return;
                }
                x60 G = x60.G(w2Var.f30229c, i6Var, frameLayout2);
                for (int i13 = 0; i13 < iArr.length; i13++) {
                    G.c(0, strArr[i13], new c3(iArr2, iArr[i13], runnable), false);
                }
                G.f41873i = 1;
                G.a0();
                return;
        }
    }

    public i3(boolean[] zArr, qb0 qb0Var, qb0 qb0Var2, qb0 qb0Var3, qb0 qb0Var4, di.i0 i0Var, int[] iArr, h6.o oVar) {
        this.f35895c = zArr;
        this.d = qb0Var;
        this.f35896e = qb0Var2;
        this.f35897f = qb0Var3;
        this.h = qb0Var4;
        this.f35898n = i0Var;
        this.f35894b = iArr;
        this.f35899r = oVar;
    }
}
