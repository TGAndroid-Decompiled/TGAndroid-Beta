package org.telegram.ui;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j7 extends f7 {
    public final ArrayList f48999f;
    public final t7 h;

    public j7(t7 t7Var) {
        super(0);
        this.h = t7Var;
        this.f48999f = new ArrayList();
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f48999f;
        arrayList.clear();
        ArrayList arrayList2 = this.f47709e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        t7 t7Var = this.h;
        if (t7Var.h != null) {
            for (int i7 = 0; i7 < t7Var.h.f10963b.size(); i7++) {
                ?? aVar = new rg.a(1, true);
                aVar.f49973c = (s6) t7Var.h.f10963b.get(i7);
                arrayList2.add(aVar);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        String H;
        float f10;
        boolean z11;
        if (f1Var.f59249f == 1) {
            x6 x6Var = (x6) f1Var.f59245a;
            ArrayList arrayList = this.f47709e;
            s6 s6Var = ((m7) arrayList.get(i7)).f49973c;
            t7 t7Var = this.h;
            TLObject g22 = t7Var.f52277e.getMessagesController().g2(s6Var.f51980a);
            s6 s6Var2 = x6Var.f53864a;
            if (s6Var2 != null && s6Var2.f51980a == s6Var.f51980a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (s6Var.f51980a == Long.MAX_VALUE) {
                H = org.telegram.messenger.gd.N0(2131752635, null);
                x6Var.getImageView().getAvatarDrawable().g(14);
                x6Var.getImageView().f(null, x6Var.getImageView().getAvatarDrawable());
            } else {
                org.telegram.ui.Components.p9 imageView = x6Var.getImageView();
                if (imageView != null) {
                    H = org.telegram.messenger.n5.H(imageView.getImageReceiver(), imageView.getAvatarDrawable(), g22);
                } else {
                    H = org.telegram.messenger.n5.H(null, null, g22);
                }
            }
            x6Var.f53864a = s6Var;
            org.telegram.ui.Components.p9 imageView2 = x6Var.getImageView();
            if ((g22 instanceof TLRPC.Chat) && ((TLRPC.Chat) g22).forum) {
                f10 = 12.0f;
            } else {
                f10 = 19.0f;
            }
            imageView2.setRoundRadius(org.telegram.messenger.g0.L(f10));
            String i02 = org.telegram.messenger.g0.i0(s6Var.f51982c, false, false);
            if (i7 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.n6 n6Var = x6Var.d;
            TextView textView = x6Var.f53866c;
            textView.setText(org.telegram.messenger.j6.m(H, textView.getPaint().getFontMetricsInt(), false, null, 0));
            n6Var.c(i02, false, true);
            n6Var.setVisibility(0);
            x6Var.f53868f = z11;
            x6Var.setWillNotDraw(!z11);
            x6Var.requestLayout();
            boolean contains = t7Var.h.f10971l.contains(Long.valueOf(s6Var.f51980a));
            org.telegram.ui.Components.lp lpVar = x6Var.f53869n;
            if (lpVar == null && !contains) {
                return;
            }
            if (lpVar == null) {
                org.telegram.ui.Components.lp lpVar2 = new org.telegram.ui.Components.lp(21, x6Var.getContext(), x6Var.f53865b);
                x6Var.f53869n = lpVar2;
                lpVar2.b(-1, org.telegram.ui.ActionBar.n6.f29451d6, org.telegram.ui.ActionBar.n6.f29581k7);
                x6Var.f53869n.setDrawUnchecked(false);
                int i10 = 3;
                x6Var.f53869n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.lp lpVar3 = x6Var.f53869n;
                if (org.telegram.messenger.gd.f24314a0) {
                    i10 = 5;
                }
                x6Var.addView(lpVar3, c8.na.d(24, 24.0f, i10 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            x6Var.f53869n.a(contains, z10);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        x6 x6Var = null;
        if (i7 == 1) {
            x6Var = new x6(this.h.getContext(), null);
        }
        return new v4.f1(x6Var);
    }
}
