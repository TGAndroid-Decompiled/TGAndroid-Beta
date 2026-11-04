package org.telegram.ui.Components;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class b3 implements View.OnClickListener {
    public final int f32069a = 1;
    public final int[] f32070b;
    public final Object f32071c;
    public final Object d;
    public final KeyEvent.Callback f32072e;
    public final ViewGroup f32073f;
    public final Object h;
    public final Object f32074n;
    public final Object f32075r;

    public b3(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.t2 t2Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, o4.b1 b1Var) {
        this.f32071c = frameLayout;
        this.d = e6Var;
        this.f32072e = t2Var;
        this.f32073f = frameLayout2;
        this.f32070b = iArr;
        this.h = strArr;
        this.f32074n = iArr2;
        this.f32075r = b1Var;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f32069a;
        Object obj = this.f32075r;
        Object obj2 = this.f32074n;
        Object obj3 = this.h;
        int[] iArr = this.f32070b;
        ViewGroup viewGroup = this.f32073f;
        KeyEvent.Callback callback = this.f32072e;
        Object obj4 = this.d;
        Object obj5 = this.f32071c;
        switch (i3) {
            case 0:
                ci.m0 m0Var = (ci.m0) obj2;
                hi.d dVar = (hi.d) obj;
                ((boolean[]) obj5)[0] = false;
                int c2 = (int) (t4.c(null, (cb0) obj4, (cb0) callback, (cb0) viewGroup, (cb0) obj3) / 1000);
                int i10 = iArr[0];
                xs xsVar = (xs) m0Var.f5530c;
                int i11 = m0Var.f5528a;
                int i12 = m0Var.f5529b;
                Editable text = xsVar.getText();
                ?? obj6 = new Object();
                obj6.f38578a |= 128;
                obj6.f38579b = i11;
                obj6.f38580c = i12;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.date = c2;
                tL_messageEntityFormattedDate.flags = i10;
                tL_messageEntityFormattedDate.applyFlags();
                try {
                    text.setSpan(new vz(text.subSequence(i11, i12).toString(), obj6, tL_messageEntityFormattedDate), i11, i12, 33);
                } catch (Exception unused) {
                }
                vs vsVar = xsVar.O1;
                if (vsVar != null) {
                    vsVar.m();
                }
                ((org.telegram.ui.ActionBar.t2) dVar.f14429b).f28625y0.run();
                return;
            default:
                FrameLayout frameLayout = (FrameLayout) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) callback;
                FrameLayout frameLayout2 = (FrameLayout) viewGroup;
                String[] strArr = (String[]) obj3;
                int[] iArr2 = (int[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q()) {
                    new fc(frameLayout, e6Var).Q(2131624216, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.bd.M0(2131748505, null), new org.telegram.messenger.hc(19))).j();
                    return;
                }
                f60 F = f60.F(t2Var.f28589c, e6Var, frameLayout2);
                for (int i13 = 0; i13 < iArr.length; i13++) {
                    F.c(0, strArr[i13], new u2(iArr2, iArr[i13], runnable), false);
                }
                F.f33729i = 1;
                F.Z();
                return;
        }
    }

    public b3(boolean[] zArr, cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3, cb0 cb0Var4, ci.m0 m0Var, int[] iArr, hi.d dVar) {
        this.f32071c = zArr;
        this.d = cb0Var;
        this.f32072e = cb0Var2;
        this.f32073f = cb0Var3;
        this.h = cb0Var4;
        this.f32074n = m0Var;
        this.f32070b = iArr;
        this.f32075r = dVar;
    }
}
