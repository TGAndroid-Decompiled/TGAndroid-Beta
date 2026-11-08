package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class t90 implements View.OnClickListener {
    public final int f38309a;
    public final boolean f38310b;
    public final FrameLayout f38311c;
    public final Object d;
    public final Object f38312e;
    public final Object f38313f;

    public t90(FrameLayout frameLayout, boolean z9, Object obj, Object obj2, Object obj3, int i7) {
        this.f38309a = i7;
        this.f38311c = frameLayout;
        this.f38310b = z9;
        this.d = obj;
        this.f38312e = obj2;
        this.f38313f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f38309a;
        Object obj = this.f38313f;
        Object obj2 = this.f38312e;
        Object obj3 = this.d;
        boolean z9 = this.f38310b;
        FrameLayout frameLayout = this.f38311c;
        switch (i7) {
            case 0:
                ca0 ca0Var = (ca0) frameLayout;
                Context context = (Context) obj3;
                ha0 ha0Var = (ha0) obj2;
                ha0 ha0Var2 = (ha0) obj;
                ia0 ia0Var = ca0Var.f32525c0;
                org.telegram.messenger.mj mjVar = ia0Var.d;
                if (!z9) {
                    new hc(ia0Var, ia0Var.F).Q(2131624216, 36, org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750584, null), new r90(ca0Var, context, 0))).j();
                    return;
                }
                boolean z10 = mjVar.f24038k;
                mjVar.f24038k = !z10;
                ia0Var.f34622y = false;
                if (z10) {
                    mjVar.f24039l = false;
                    if (ha0Var != null) {
                        ha0Var.a(false, true);
                    }
                }
                ha0Var2.a(mjVar.f24038k, true);
                ca0Var.i();
                ca0Var.l(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                k60 k60Var = (k60) obj;
                up0 up0Var = ((zh.z1) frameLayout).f60622a;
                if (!z9) {
                    bi.t9 t9Var = up0Var.f60286e;
                    int i10 = tL_starGiftCollection.collection_id;
                    t9Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    t9Var.a(i10, arrayList);
                    hc.a0(up0Var.f60283a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750394, bi.k7.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    up0Var.f60286e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    hc.a0(up0Var.f60283a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750038, bi.k7.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                k60Var.u();
                up0Var.o();
                return;
        }
    }
}
