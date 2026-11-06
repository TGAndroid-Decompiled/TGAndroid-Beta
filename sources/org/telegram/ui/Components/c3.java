package org.telegram.ui.Components;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class c3 implements View.OnClickListener {
    public final int f32387a = 1;
    public final int[] f32388b;
    public final Object f32389c;
    public final Object d;
    public final KeyEvent.Callback f32390e;
    public final ViewGroup f32391f;
    public final Object h;
    public final Object f32392n;
    public final Object f32393r;

    public c3(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.v2 v2Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.m6 m6Var) {
        this.f32389c = frameLayout;
        this.d = f6Var;
        this.f32390e = v2Var;
        this.f32391f = frameLayout2;
        this.f32388b = iArr;
        this.h = strArr;
        this.f32392n = iArr2;
        this.f32393r = m6Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f32387a;
        Object obj = this.f32393r;
        Object obj2 = this.f32392n;
        Object obj3 = this.h;
        int[] iArr = this.f32388b;
        ViewGroup viewGroup = this.f32391f;
        KeyEvent.Callback callback = this.f32390e;
        Object obj4 = this.d;
        Object obj5 = this.f32389c;
        switch (i7) {
            case 0:
                bi.r0 r0Var = (bi.r0) obj2;
                h9.f1 f1Var = (h9.f1) obj;
                ((boolean[]) obj5)[0] = false;
                int c10 = (int) (v4.c(null, (hb0) obj4, (hb0) callback, (hb0) viewGroup, (hb0) obj3) / 1000);
                int i10 = iArr[0];
                ys ysVar = (ys) r0Var.f4603c;
                int i11 = r0Var.f4601a;
                int i12 = r0Var.f4602b;
                Editable text = ysVar.getText();
                ?? obj6 = new Object();
                obj6.f38442a |= 128;
                obj6.f38443b = i11;
                obj6.f38444c = i12;
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
                ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28651x0.run();
                return;
            default:
                FrameLayout frameLayout = (FrameLayout) obj5;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) callback;
                FrameLayout frameLayout2 = (FrameLayout) viewGroup;
                String[] strArr = (String[]) obj3;
                int[] iArr2 = (int[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).q()) {
                    new hc(frameLayout, f6Var).Q(2131624216, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131748496, null), new org.telegram.messenger.pd(15))).j();
                    return;
                }
                k60 F = k60.F(v2Var.f28618c, f6Var, frameLayout2);
                for (int i13 = 0; i13 < iArr.length; i13++) {
                    F.c(0, strArr[i13], new w2(iArr2, iArr[i13], runnable), false);
                }
                F.f35198i = 1;
                F.Z();
                return;
        }
    }

    public c3(boolean[] zArr, hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3, hb0 hb0Var4, bi.r0 r0Var, int[] iArr, h9.f1 f1Var) {
        this.f32389c = zArr;
        this.d = hb0Var;
        this.f32390e = hb0Var2;
        this.f32391f = hb0Var3;
        this.h = hb0Var4;
        this.f32392n = r0Var;
        this.f32388b = iArr;
        this.f32393r = f1Var;
    }
}
