package org.telegram.ui.Components;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class i3 implements View.OnClickListener {
    public final int f36034a = 1;
    public final int[] f36035b;
    public final Object f36036c;
    public final Object d;
    public final KeyEvent.Callback f36037e;
    public final ViewGroup f36038f;
    public final Object h;
    public final Object f36039n;
    public final Object f36040r;

    public i3(FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.x2 x2Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.messenger.camera.i iVar) {
        this.f36036c = frameLayout;
        this.d = i6Var;
        this.f36037e = x2Var;
        this.f36038f = frameLayout2;
        this.f36035b = iArr;
        this.h = strArr;
        this.f36039n = iArr2;
        this.f36040r = iVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f36034a;
        Object obj = this.f36040r;
        Object obj2 = this.f36039n;
        Object obj3 = this.h;
        int[] iArr = this.f36035b;
        ViewGroup viewGroup = this.f36038f;
        KeyEvent.Callback callback = this.f36037e;
        Object obj4 = this.d;
        Object obj5 = this.f36036c;
        switch (i7) {
            case 0:
                di.i0 i0Var = (di.i0) obj2;
                hi.w4 w4Var = (hi.w4) obj;
                ((boolean[]) obj5)[0] = false;
                int c10 = (int) (b5.c(null, (sb0) obj4, (sb0) callback, (sb0) viewGroup, (sb0) obj3) / 1000);
                int i10 = iArr[0];
                mt mtVar = (mt) i0Var.f8996c;
                int i11 = i0Var.f8994a;
                int i12 = i0Var.f8995b;
                Editable text = mtVar.getText();
                ?? obj6 = new Object();
                obj6.f34537a |= 128;
                obj6.f34538b = i11;
                obj6.f34539c = i12;
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
                    ktVar.g();
                }
                ((org.telegram.ui.ActionBar.x2) w4Var.f15642b).f30232y0.run();
                return;
            default:
                FrameLayout frameLayout = (FrameLayout) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) callback;
                FrameLayout frameLayout2 = (FrameLayout) viewGroup;
                String[] strArr = (String[]) obj3;
                int[] iArr2 = (int[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24770t0).q()) {
                    new lc(frameLayout, i6Var).Q(2131624217, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.gd.M0(2131748305, null), new org.telegram.messenger.j2(23))).j();
                    return;
                }
                y60 G = y60.G(x2Var.f30193c, i6Var, frameLayout2);
                for (int i13 = 0; i13 < iArr.length; i13++) {
                    G.c(0, strArr[i13], new c3(iArr2, iArr[i13], runnable), false);
                }
                G.f42356i = 1;
                G.a0();
                return;
        }
    }

    public i3(boolean[] zArr, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3, sb0 sb0Var4, di.i0 i0Var, int[] iArr, hi.w4 w4Var) {
        this.f36036c = zArr;
        this.d = sb0Var;
        this.f36037e = sb0Var2;
        this.f36038f = sb0Var3;
        this.h = sb0Var4;
        this.f36039n = i0Var;
        this.f36035b = iArr;
        this.f36040r = w4Var;
    }
}
