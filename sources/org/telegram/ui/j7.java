package org.telegram.ui;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j7 extends f7 {
    public final ArrayList f48222f;
    public final t7 h;

    public j7(t7 t7Var) {
        super(0);
        this.h = t7Var;
        this.f48222f = new ArrayList();
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f48222f;
        arrayList.clear();
        ArrayList arrayList2 = this.f47004e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        t7 t7Var = this.h;
        if (t7Var.h != null) {
            for (int i7 = 0; i7 < t7Var.h.f10653b.size(); i7++) {
                ?? aVar = new rg.a(1, true);
                aVar.f49142c = (s6) t7Var.h.f10653b.get(i7);
                arrayList2.add(aVar);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        String H;
        float f10;
        boolean z11;
        if (e1Var.f58539f == 1) {
            x6 x6Var = (x6) e1Var.f58535a;
            ArrayList arrayList = this.f47004e;
            s6 s6Var = ((m7) arrayList.get(i7)).f49142c;
            t7 t7Var = this.h;
            TLObject e22 = t7Var.f51400e.getMessagesController().e2(s6Var.f51112a);
            s6 s6Var2 = x6Var.f53105a;
            if (s6Var2 != null && s6Var2.f51112a == s6Var.f51112a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (s6Var.f51112a == Long.MAX_VALUE) {
                H = org.telegram.messenger.hd.M0(2131752647, null);
                x6Var.getImageView().getAvatarDrawable().g(14);
                x6Var.getImageView().f(null, x6Var.getImageView().getAvatarDrawable());
            } else {
                org.telegram.ui.Components.i9 imageView = x6Var.getImageView();
                if (imageView != null) {
                    H = org.telegram.messenger.m5.H(imageView.getImageReceiver(), imageView.getAvatarDrawable(), e22);
                } else {
                    H = org.telegram.messenger.m5.H(null, null, e22);
                }
            }
            x6Var.f53105a = s6Var;
            org.telegram.ui.Components.i9 imageView2 = x6Var.getImageView();
            if ((e22 instanceof TLRPC.Chat) && ((TLRPC.Chat) e22).forum) {
                f10 = 12.0f;
            } else {
                f10 = 19.0f;
            }
            imageView2.setRoundRadius(org.telegram.messenger.g0.L(f10));
            String i02 = org.telegram.messenger.g0.i0(s6Var.f51114c, false, false);
            if (i7 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.h6 h6Var = x6Var.d;
            TextView textView = x6Var.f53107c;
            textView.setText(org.telegram.messenger.j6.m(H, textView.getPaint().getFontMetricsInt(), false, null, 0));
            h6Var.c(i02, false, true);
            h6Var.setVisibility(0);
            x6Var.f53109f = z11;
            x6Var.setWillNotDraw(!z11);
            x6Var.requestLayout();
            boolean contains = t7Var.h.f10661l.contains(Long.valueOf(s6Var.f51112a));
            org.telegram.ui.Components.fp fpVar = x6Var.f53110n;
            if (fpVar == null && !contains) {
                return;
            }
            if (fpVar == null) {
                org.telegram.ui.Components.fp fpVar2 = new org.telegram.ui.Components.fp(21, x6Var.getContext(), x6Var.f53106b);
                x6Var.f53110n = fpVar2;
                fpVar2.b(-1, org.telegram.ui.ActionBar.j6.f28849d6, org.telegram.ui.ActionBar.j6.f28979k7);
                x6Var.f53110n.setDrawUnchecked(false);
                int i10 = 3;
                x6Var.f53110n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.fp fpVar3 = x6Var.f53110n;
                if (org.telegram.messenger.hd.f24104a0) {
                    i10 = 5;
                }
                x6Var.addView(fpVar3, c8.ja.d(24, 24.0f, i10 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            x6Var.f53110n.a(contains, z10);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        x6 x6Var = null;
        if (i7 == 1) {
            x6Var = new x6(this.h.getContext(), null);
        }
        return new v4.e1(x6Var);
    }
}
