package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class ma0 implements View.OnClickListener {
    public final int f28401a;
    public final boolean f28402b;
    public final FrameLayout f28403c;
    public final Object d;
    public final Object e;
    public final Object f28404f;

    public ma0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f28401a = i10;
        this.f28403c = frameLayout;
        this.f28402b = z10;
        this.d = obj;
        this.e = obj2;
        this.f28404f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f28401a;
        Object obj = this.f28404f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.f28402b;
        FrameLayout frameLayout = this.f28403c;
        switch (i10) {
            case 0:
                ua0 ua0Var = (ua0) frameLayout;
                Context context = (Context) obj3;
                za0 za0Var = (za0) obj2;
                za0 za0Var2 = (za0) obj;
                ab0 ab0Var = ua0Var.f30881c0;
                org.telegram.messenger.nj njVar = ab0Var.d;
                if (!z10) {
                    new cc(ab0Var, ab0Var.F).Q(2131624214, 36, org.telegram.messenger.i0.R2("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", -1, 0, new ka0(ua0Var, context, 0), null)).j();
                    return;
                }
                boolean z11 = njVar.f17121k;
                njVar.f17121k = !z11;
                ab0Var.f24361y = false;
                if (z11) {
                    njVar.f17122l = false;
                    if (za0Var != null) {
                        za0Var.a(false, true);
                    }
                }
                za0Var2.a(njVar.f17121k, true);
                ua0Var.i();
                ua0Var.l(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                z60 z60Var = (z60) obj;
                vq0 vq0Var = ((ph.f2) frameLayout).f45042a;
                if (!z10) {
                    rh.u5 u5Var = vq0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    u5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    u5Var.a(i11, arrayList);
                    cc.a0(vq0Var.f45128a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131750402, rh.e4.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    vq0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    cc.a0(vq0Var.f45128a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131750046, rh.e4.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                z60Var.u();
                vq0Var.o();
                return;
        }
    }
}
