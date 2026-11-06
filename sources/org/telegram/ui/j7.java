package org.telegram.ui;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j7 extends f7 {
    public final ArrayList f46854f;
    public final t7 h;

    public j7(t7 t7Var) {
        super(0);
        this.h = t7Var;
        this.f46854f = new ArrayList();
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f46854f;
        arrayList.clear();
        ArrayList arrayList2 = this.f45509e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        t7 t7Var = this.h;
        if (t7Var.h != null) {
            for (int i7 = 0; i7 < t7Var.h.f6424b.size(); i7++) {
                ?? aVar = new rg.a(1, true);
                aVar.f47691c = (s6) t7Var.h.f6424b.get(i7);
                arrayList2.add(aVar);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        String H;
        float f10;
        boolean z10;
        if (d1Var.f56956f == 1) {
            x6 x6Var = (x6) d1Var.f56952a;
            ArrayList arrayList = this.f45509e;
            s6 s6Var = ((m7) arrayList.get(i7)).f47691c;
            t7 t7Var = this.h;
            TLObject e22 = t7Var.f49967e.getMessagesController().e2(s6Var.f49661a);
            s6 s6Var2 = x6Var.f51775a;
            if (s6Var2 != null && s6Var2.f49661a == s6Var.f49661a) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (s6Var.f49661a == Long.MAX_VALUE) {
                H = org.telegram.messenger.hd.M0(2131752647, null);
                x6Var.getImageView().getAvatarDrawable().g(14);
                x6Var.getImageView().e(null, x6Var.getImageView().getAvatarDrawable());
            } else {
                org.telegram.ui.Components.l9 imageView = x6Var.getImageView();
                if (imageView != null) {
                    H = org.telegram.messenger.m5.H(imageView.getImageReceiver(), imageView.getAvatarDrawable(), e22);
                } else {
                    H = org.telegram.messenger.m5.H(null, null, e22);
                }
            }
            x6Var.f51775a = s6Var;
            org.telegram.ui.Components.l9 imageView2 = x6Var.getImageView();
            if ((e22 instanceof TLRPC.Chat) && ((TLRPC.Chat) e22).forum) {
                f10 = 12.0f;
            } else {
                f10 = 19.0f;
            }
            imageView2.setRoundRadius(org.telegram.messenger.g0.L(f10));
            String i02 = org.telegram.messenger.g0.i0(s6Var.f49663c, false, false);
            if (i7 < arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.j6 j6Var = x6Var.d;
            TextView textView = x6Var.f51777c;
            textView.setText(org.telegram.messenger.i6.m(H, textView.getPaint().getFontMetricsInt(), false, null, 0));
            j6Var.c(i02, false, true);
            j6Var.setVisibility(0);
            x6Var.f51779f = z10;
            x6Var.setWillNotDraw(!z10);
            x6Var.requestLayout();
            boolean contains = t7Var.h.f6432l.contains(Long.valueOf(s6Var.f49661a));
            org.telegram.ui.Components.wo woVar = x6Var.f51780n;
            if (woVar == null && !contains) {
                return;
            }
            if (woVar == null) {
                org.telegram.ui.Components.wo woVar2 = new org.telegram.ui.Components.wo(21, x6Var.getContext(), x6Var.f51776b);
                x6Var.f51780n = woVar2;
                woVar2.b(-1, org.telegram.ui.ActionBar.k6.f27848d6, org.telegram.ui.ActionBar.k6.f27978k7);
                x6Var.f51780n.setDrawUnchecked(false);
                int i10 = 3;
                x6Var.f51780n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.wo woVar3 = x6Var.f51780n;
                if (org.telegram.messenger.hd.f22871a0) {
                    i10 = 5;
                }
                x6Var.addView(woVar3, c8.ha.d(24, 24.0f, i10 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            x6Var.f51780n.a(contains, z9);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        x6 x6Var = null;
        if (i7 == 1) {
            x6Var = new x6(this.h.getContext(), null);
        }
        return new v4.d1(x6Var);
    }
}
