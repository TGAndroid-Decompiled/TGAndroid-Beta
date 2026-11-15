package org.telegram.ui.Components;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class a3 implements View.OnClickListener {
    public final int f32828a = 1;
    public final int[] f32829b;
    public final Object f32830c;
    public final Object d;
    public final KeyEvent.Callback f32831e;
    public final ViewGroup f32832f;
    public final Object h;
    public final Object f32833n;
    public final Object f32834r;

    public a3(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.u2 u2Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.m5 m5Var) {
        this.f32830c = frameLayout;
        this.d = e6Var;
        this.f32831e = u2Var;
        this.f32832f = frameLayout2;
        this.f32829b = iArr;
        this.h = strArr;
        this.f32833n = iArr2;
        this.f32834r = m5Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f32828a;
        Object obj = this.f32834r;
        Object obj2 = this.f32833n;
        Object obj3 = this.h;
        int[] iArr = this.f32829b;
        ViewGroup viewGroup = this.f32832f;
        KeyEvent.Callback callback = this.f32831e;
        Object obj4 = this.d;
        Object obj5 = this.f32830c;
        switch (i7) {
            case 0:
                di.i0 i0Var = (di.i0) obj2;
                org.telegram.messenger.ou ouVar = (org.telegram.messenger.ou) obj;
                ((boolean[]) obj5)[0] = false;
                int c10 = (int) (t4.c(null, (ib0) obj4, (ib0) callback, (ib0) viewGroup, (ib0) obj3) / 1000);
                int i10 = iArr[0];
                ft ftVar = (ft) i0Var.f8763c;
                int i11 = i0Var.f8761a;
                int i12 = i0Var.f8762b;
                Editable text = ftVar.getText();
                ?? obj6 = new Object();
                obj6.f41484a |= 128;
                obj6.f41485b = i11;
                obj6.f41486c = i12;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.date = c10;
                tL_messageEntityFormattedDate.flags = i10;
                tL_messageEntityFormattedDate.applyFlags();
                try {
                    text.setSpan(new d00(text.subSequence(i11, i12).toString(), obj6, tL_messageEntityFormattedDate), i11, i12, 33);
                } catch (Exception unused) {
                }
                dt dtVar = ftVar.T1;
                if (dtVar != null) {
                    dtVar.E();
                }
                ((org.telegram.ui.ActionBar.u2) ouVar.f25804b).f29724y0.run();
                return;
            default:
                FrameLayout frameLayout = (FrameLayout) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) callback;
                FrameLayout frameLayout2 = (FrameLayout) viewGroup;
                String[] strArr = (String[]) obj3;
                int[] iArr2 = (int[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24934t0).q()) {
                    new cc(frameLayout, e6Var).Q(2131624217, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131748497, null), new org.telegram.messenger.c6(21))).j();
                    return;
                }
                m60 F = m60.F(u2Var.f29685c, e6Var, frameLayout2);
                for (int i13 = 0; i13 < iArr.length; i13++) {
                    F.c(0, strArr[i13], new u2(iArr2, iArr[i13], runnable), false);
                }
                F.f37093i = 1;
                F.Z();
                return;
        }
    }

    public a3(boolean[] zArr, ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3, ib0 ib0Var4, di.i0 i0Var, int[] iArr, org.telegram.messenger.ou ouVar) {
        this.f32830c = zArr;
        this.d = ib0Var;
        this.f32831e = ib0Var2;
        this.f32832f = ib0Var3;
        this.h = ib0Var4;
        this.f32833n = i0Var;
        this.f32829b = iArr;
        this.f32834r = ouVar;
    }
}
