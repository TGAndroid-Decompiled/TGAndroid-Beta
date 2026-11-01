package org.telegram.ui.Components;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class b3 implements View.OnClickListener {
    public final int f24609a = 1;
    public final int[] f24610b;
    public final Object f24611c;
    public final Object d;
    public final KeyEvent.Callback e;
    public final ViewGroup f24612f;
    public final Object h;
    public final Object f24613n;
    public final Object f24614r;

    public b3(FrameLayout frameLayout, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.ActionBar.z2 z2Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.fp fpVar) {
        this.f24611c = frameLayout;
        this.d = p6Var;
        this.e = z2Var;
        this.f24612f = frameLayout2;
        this.f24610b = iArr;
        this.h = strArr;
        this.f24613n = iArr2;
        this.f24614r = fpVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f24609a;
        Object obj = this.f24614r;
        Object obj2 = this.f24613n;
        Object obj3 = this.h;
        int[] iArr = this.f24610b;
        ViewGroup viewGroup = this.f24612f;
        KeyEvent.Callback callback = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f24611c;
        switch (i10) {
            case 0:
                ht htVar = (ht) obj2;
                l2.f fVar = (l2.f) obj;
                ((boolean[]) obj5)[0] = false;
                int c10 = (int) (s4.c(null, (ac0) obj4, (ac0) callback, (ac0) viewGroup, (ac0) obj3) / 1000);
                int i11 = iArr[0];
                mt mtVar = (mt) htVar.f26914c;
                int i12 = htVar.f26912a;
                int i13 = htVar.f26913b;
                Editable text = mtVar.getText();
                ?? obj6 = new Object();
                obj6.f33282a |= 128;
                obj6.f33283b = i12;
                obj6.f33284c = i13;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.date = c10;
                tL_messageEntityFormattedDate.flags = i11;
                tL_messageEntityFormattedDate.applyFlags();
                try {
                    text.setSpan(new n00(text.subSequence(i12, i13).toString(), obj6, tL_messageEntityFormattedDate), i12, i13, 33);
                } catch (Exception unused) {
                }
                kt ktVar = mtVar.N1;
                if (ktVar != null) {
                    ktVar.m();
                }
                ((org.telegram.ui.ActionBar.z2) fVar.f11588b).f21622x0.run();
                return;
            default:
                FrameLayout frameLayout = (FrameLayout) obj5;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj4;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) callback;
                FrameLayout frameLayout2 = (FrameLayout) viewGroup;
                String[] strArr = (String[]) obj3;
                int[] iArr2 = (int[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).q()) {
                    new cc(frameLayout, p6Var).Q(2131624214, 36, org.telegram.messenger.i0.x2(org.telegram.messenger.dd.L0(2131748512, null), new org.telegram.messenger.sz(6))).j();
                    return;
                }
                z60 F = z60.F(z2Var.f21590c, p6Var, frameLayout2);
                for (int i14 = 0; i14 < iArr.length; i14++) {
                    F.c(0, strArr[i14], new w2(iArr2, iArr[i14], runnable), false);
                }
                F.f33026i = 1;
                F.Z();
                return;
        }
    }

    public b3(boolean[] zArr, ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3, ac0 ac0Var4, ht htVar, int[] iArr, l2.f fVar) {
        this.f24611c = zArr;
        this.d = ac0Var;
        this.e = ac0Var2;
        this.f24612f = ac0Var3;
        this.h = ac0Var4;
        this.f24613n = htVar;
        this.f24610b = iArr;
        this.f24614r = fVar;
    }
}
