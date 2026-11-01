package org.telegram.ui;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j7 extends f7 {
    public final ArrayList f38295f;
    public final t7 h;

    public j7(t7 t7Var) {
        super(0);
        this.h = t7Var;
        this.f38295f = new ArrayList();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f38295f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        t7 t7Var = this.h;
        if (t7Var.h != null) {
            for (int i10 = 0; i10 < t7Var.h.f48509b.size(); i10++) {
                ?? bVar = new hg.b(1, true);
                bVar.f39449c = (s6) t7Var.h.f48509b.get(i10);
                arrayList2.add(bVar);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        String H;
        float f7;
        boolean z11;
        if (c1Var.f47912f == 1) {
            x6 x6Var = (x6) c1Var.f47909a;
            ArrayList arrayList = this.e;
            s6 s6Var = ((m7) arrayList.get(i10)).f39449c;
            t7 t7Var = this.h;
            TLObject d22 = t7Var.e.getMessagesController().d2(s6Var.f41231a);
            s6 s6Var2 = x6Var.f43259a;
            if (s6Var2 != null && s6Var2.f41231a == s6Var.f41231a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (s6Var.f41231a == Long.MAX_VALUE) {
                H = org.telegram.messenger.dd.L0(2131752647, null);
                x6Var.getImageView().getAvatarDrawable().g(14);
                x6Var.getImageView().e(null, x6Var.getImageView().getAvatarDrawable());
            } else {
                org.telegram.ui.Components.g9 imageView = x6Var.getImageView();
                if (imageView != null) {
                    H = org.telegram.messenger.o5.H(imageView.getImageReceiver(), imageView.getAvatarDrawable(), d22);
                } else {
                    H = org.telegram.messenger.o5.H(null, null, d22);
                }
            }
            x6Var.f43259a = s6Var;
            org.telegram.ui.Components.g9 imageView2 = x6Var.getImageView();
            if ((d22 instanceof TLRPC.Chat) && ((TLRPC.Chat) d22).forum) {
                f7 = 12.0f;
            } else {
                f7 = 19.0f;
            }
            imageView2.setRoundRadius(org.telegram.messenger.i0.L(f7));
            String i02 = org.telegram.messenger.i0.i0(s6Var.f41233c, false, false);
            if (i10 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.f6 f6Var = x6Var.d;
            TextView textView = x6Var.f43261c;
            textView.setText(org.telegram.messenger.k6.m(H, textView.getPaint().getFontMetricsInt(), false, null, 0));
            f6Var.c(i02, false, true);
            f6Var.setVisibility(0);
            x6Var.f43262f = z11;
            x6Var.setWillNotDraw(!z11);
            x6Var.requestLayout();
            boolean contains = t7Var.h.f48516l.contains(Long.valueOf(s6Var.f41231a));
            org.telegram.ui.Components.ep epVar = x6Var.f43263n;
            if (epVar == null && !contains) {
                return;
            }
            if (epVar == null) {
                org.telegram.ui.Components.ep epVar2 = new org.telegram.ui.Components.ep(21, x6Var.getContext(), x6Var.f43260b);
                x6Var.f43263n = epVar2;
                epVar2.b(-1, org.telegram.ui.ActionBar.t6.f20930d6, org.telegram.ui.ActionBar.t6.f21060k7);
                x6Var.f43263n.setDrawUnchecked(false);
                int i11 = 3;
                x6Var.f43263n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.ep epVar3 = x6Var.f43263n;
                if (org.telegram.messenger.dd.X) {
                    i11 = 5;
                }
                x6Var.addView(epVar3, w7.b6.d(24, 24.0f, i11 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            x6Var.f43263n.a(contains, z10);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        x6 x6Var = null;
        if (i10 == 1) {
            x6Var = new x6(this.h.getContext(), null);
        }
        return new s4.c1(x6Var);
    }
}
