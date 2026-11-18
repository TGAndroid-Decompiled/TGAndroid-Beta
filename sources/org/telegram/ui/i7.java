package org.telegram.ui;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i7 extends e7 {
    public final ArrayList f48549f;
    public final s7 h;

    public i7(s7 s7Var) {
        super(0);
        this.h = s7Var;
        this.f48549f = new ArrayList();
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f48549f;
        arrayList.clear();
        ArrayList arrayList2 = this.f47077e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        s7 s7Var = this.h;
        if (s7Var.h != null) {
            for (int i7 = 0; i7 < s7Var.h.f10970b.size(); i7++) {
                ?? aVar = new rg.a(1, true);
                aVar.f49468c = (r6) s7Var.h.f10970b.get(i7);
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
        if (f1Var.f59127f == 1) {
            w6 w6Var = (w6) f1Var.f59123a;
            ArrayList arrayList = this.f47077e;
            r6 r6Var = ((l7) arrayList.get(i7)).f49468c;
            s7 s7Var = this.h;
            TLObject g22 = s7Var.f51909e.getMessagesController().g2(r6Var.f51471a);
            r6 r6Var2 = w6Var.f52933a;
            if (r6Var2 != null && r6Var2.f51471a == r6Var.f51471a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (r6Var.f51471a == Long.MAX_VALUE) {
                H = org.telegram.messenger.gd.M0(2131752636, null);
                w6Var.getImageView().getAvatarDrawable().g(14);
                w6Var.getImageView().f(null, w6Var.getImageView().getAvatarDrawable());
            } else {
                org.telegram.ui.Components.q9 imageView = w6Var.getImageView();
                if (imageView != null) {
                    H = org.telegram.messenger.n5.H(imageView.getImageReceiver(), imageView.getAvatarDrawable(), g22);
                } else {
                    H = org.telegram.messenger.n5.H(null, null, g22);
                }
            }
            w6Var.f52933a = r6Var;
            org.telegram.ui.Components.q9 imageView2 = w6Var.getImageView();
            if ((g22 instanceof TLRPC.Chat) && ((TLRPC.Chat) g22).forum) {
                f10 = 12.0f;
            } else {
                f10 = 19.0f;
            }
            imageView2.setRoundRadius(org.telegram.messenger.g0.L(f10));
            String i02 = org.telegram.messenger.g0.i0(r6Var.f51473c, false, false);
            if (i7 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.n6 n6Var = w6Var.d;
            TextView textView = w6Var.f52935c;
            textView.setText(org.telegram.messenger.j6.m(H, textView.getPaint().getFontMetricsInt(), false, null, 0));
            n6Var.c(i02, false, true);
            n6Var.setVisibility(0);
            w6Var.f52937f = z11;
            w6Var.setWillNotDraw(!z11);
            w6Var.requestLayout();
            boolean contains = s7Var.h.f10978l.contains(Long.valueOf(r6Var.f51471a));
            org.telegram.ui.Components.mp mpVar = w6Var.f52938n;
            if (mpVar == null && !contains) {
                return;
            }
            if (mpVar == null) {
                org.telegram.ui.Components.mp mpVar2 = new org.telegram.ui.Components.mp(21, w6Var.getContext(), w6Var.f52934b);
                w6Var.f52938n = mpVar2;
                mpVar2.b(-1, org.telegram.ui.ActionBar.n6.f29394d6, org.telegram.ui.ActionBar.n6.f29524k7);
                w6Var.f52938n.setDrawUnchecked(false);
                int i10 = 3;
                w6Var.f52938n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.mp mpVar3 = w6Var.f52938n;
                if (org.telegram.messenger.gd.f24213a0) {
                    i10 = 5;
                }
                w6Var.addView(mpVar3, c8.ma.d(24, 24.0f, i10 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            w6Var.f52938n.a(contains, z10);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        w6 w6Var = null;
        if (i7 == 1) {
            w6Var = new w6(this.h.getContext(), null);
        }
        return new v4.f1(w6Var);
    }
}
