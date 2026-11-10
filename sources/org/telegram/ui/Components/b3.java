package org.telegram.ui.Components;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class b3 implements View.OnClickListener {
    public final int f32093a = 1;
    public final int[] f32094b;
    public final Object f32095c;
    public final Object d;
    public final KeyEvent.Callback f32096e;
    public final ViewGroup f32097f;
    public final Object h;
    public final Object f32098n;
    public final Object f32099r;

    public b3(FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.w2 w2Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.m6 m6Var) {
        this.f32095c = frameLayout;
        this.d = h6Var;
        this.f32096e = w2Var;
        this.f32097f = frameLayout2;
        this.f32094b = iArr;
        this.h = strArr;
        this.f32098n = iArr2;
        this.f32099r = m6Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f32093a;
        Object obj = this.f32099r;
        Object obj2 = this.f32098n;
        Object obj3 = this.h;
        int[] iArr = this.f32094b;
        ViewGroup viewGroup = this.f32097f;
        KeyEvent.Callback callback = this.f32096e;
        Object obj4 = this.d;
        Object obj5 = this.f32095c;
        switch (i7) {
            case 0:
                bi.r0 r0Var = (bi.r0) obj2;
                h9.f1 f1Var = (h9.f1) obj;
                ((boolean[]) obj5)[0] = false;
                int c10 = (int) (u4.c(null, (hb0) obj4, (hb0) callback, (hb0) viewGroup, (hb0) obj3) / 1000);
                int i10 = iArr[0];
                ys ysVar = (ys) r0Var.f4603c;
                int i11 = r0Var.f4601a;
                int i12 = r0Var.f4602b;
                Editable text = ysVar.getText();
                ?? obj6 = new Object();
                obj6.f38777a |= 128;
                obj6.f38778b = i11;
                obj6.f38779c = i12;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.date = c10;
                tL_messageEntityFormattedDate.flags = i10;
                tL_messageEntityFormattedDate.applyFlags();
                try {
                    text.setSpan(new zz(text.subSequence(i11, i12).toString(), obj6, tL_messageEntityFormattedDate), i11, i12, 33);
                } catch (Exception unused) {
                }
                ws wsVar = ysVar.N1;
                if (wsVar != null) {
                    wsVar.m();
                }
                ((org.telegram.ui.ActionBar.w2) f1Var.f14325b).f28711x0.run();
                return;
            default:
                FrameLayout frameLayout = (FrameLayout) obj5;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) callback;
                FrameLayout frameLayout2 = (FrameLayout) viewGroup;
                String[] strArr = (String[]) obj3;
                int[] iArr2 = (int[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0).q()) {
                    new gc(frameLayout, h6Var).Q(2131624216, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(2131748497, null), new org.telegram.messenger.rc(17))).j();
                    return;
                }
                k60 F = k60.F(w2Var.f28675c, h6Var, frameLayout2);
                for (int i13 = 0; i13 < iArr.length; i13++) {
                    F.c(0, strArr[i13], new v2(iArr2, iArr[i13], runnable), false);
                }
                F.f35201i = 1;
                F.Z();
                return;
        }
    }

    public b3(boolean[] zArr, hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3, hb0 hb0Var4, bi.r0 r0Var, int[] iArr, h9.f1 f1Var) {
        this.f32095c = zArr;
        this.d = hb0Var;
        this.f32096e = hb0Var2;
        this.f32097f = hb0Var3;
        this.h = hb0Var4;
        this.f32098n = r0Var;
        this.f32094b = iArr;
        this.f32099r = f1Var;
    }
}
