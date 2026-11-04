package org.telegram.ui;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k7 extends g7 {
    public final ArrayList f46788f;
    public final u7 h;

    public k7(u7 u7Var) {
        super(0);
        this.h = u7Var;
        this.f46788f = new ArrayList();
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f46788f;
        arrayList.clear();
        ArrayList arrayList2 = this.f45561e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        u7 u7Var = this.h;
        if (u7Var.h != null) {
            for (int i3 = 0; i3 < u7Var.h.f9187b.size(); i3++) {
                ?? aVar = new sg.a(1, true);
                aVar.f47906c = (t6) u7Var.h.f9187b.get(i3);
                arrayList2.add(aVar);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        String H;
        float f10;
        boolean z11;
        if (d1Var.f55544f == 1) {
            y6 y6Var = (y6) d1Var.f55540a;
            ArrayList arrayList = this.f45561e;
            t6 t6Var = ((n7) arrayList.get(i3)).f47906c;
            u7 u7Var = this.h;
            TLObject e22 = u7Var.f49999e.getMessagesController().e2(t6Var.f49713a);
            t6 t6Var2 = y6Var.f52205a;
            if (t6Var2 != null && t6Var2.f49713a == t6Var.f49713a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (t6Var.f49713a == Long.MAX_VALUE) {
                H = org.telegram.messenger.bd.M0(2131752647, null);
                y6Var.getImageView().getAvatarDrawable().g(14);
                y6Var.getImageView().e(null, y6Var.getImageView().getAvatarDrawable());
            } else {
                org.telegram.ui.Components.k9 imageView = y6Var.getImageView();
                if (imageView != null) {
                    H = org.telegram.messenger.m5.H(imageView.getImageReceiver(), imageView.getAvatarDrawable(), e22);
                } else {
                    H = org.telegram.messenger.m5.H(null, null, e22);
                }
            }
            y6Var.f52205a = t6Var;
            org.telegram.ui.Components.k9 imageView2 = y6Var.getImageView();
            if ((e22 instanceof TLRPC.Chat) && ((TLRPC.Chat) e22).forum) {
                f10 = 12.0f;
            } else {
                f10 = 19.0f;
            }
            imageView2.setRoundRadius(org.telegram.messenger.g0.L(f10));
            String i02 = org.telegram.messenger.g0.i0(t6Var.f49715c, false, false);
            if (i3 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.h6 h6Var = y6Var.d;
            TextView textView = y6Var.f52207c;
            textView.setText(org.telegram.messenger.i6.m(H, textView.getPaint().getFontMetricsInt(), false, null, 0));
            h6Var.c(i02, false, true);
            h6Var.setVisibility(0);
            y6Var.f52209f = z11;
            y6Var.setWillNotDraw(!z11);
            y6Var.requestLayout();
            boolean contains = u7Var.h.f9195l.contains(Long.valueOf(t6Var.f49713a));
            org.telegram.ui.Components.wo woVar = y6Var.f52210n;
            if (woVar == null && !contains) {
                return;
            }
            if (woVar == null) {
                org.telegram.ui.Components.wo woVar2 = new org.telegram.ui.Components.wo(21, y6Var.getContext(), y6Var.f52206b);
                y6Var.f52210n = woVar2;
                woVar2.b(-1, org.telegram.ui.ActionBar.k6.f27878d6, org.telegram.ui.ActionBar.k6.f28008k7);
                y6Var.f52210n.setDrawUnchecked(false);
                int i10 = 3;
                y6Var.f52210n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.wo woVar3 = y6Var.f52210n;
                if (org.telegram.messenger.bd.f21784a0) {
                    i10 = 5;
                }
                y6Var.addView(woVar3, b8.mf.d(24, 24.0f, i10 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            y6Var.f52210n.a(contains, z10);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        y6 y6Var = null;
        if (i3 == 1) {
            y6Var = new y6(this.h.getContext(), null);
        }
        return new u4.d1(y6Var);
    }
}
