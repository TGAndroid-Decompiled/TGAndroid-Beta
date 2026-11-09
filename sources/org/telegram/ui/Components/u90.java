package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class u90 implements View.OnClickListener {
    public final int f38657a;
    public final boolean f38658b;
    public final FrameLayout f38659c;
    public final Object d;
    public final Object f38660e;
    public final Object f38661f;

    public u90(FrameLayout frameLayout, boolean z9, Object obj, Object obj2, Object obj3, int i7) {
        this.f38657a = i7;
        this.f38659c = frameLayout;
        this.f38658b = z9;
        this.d = obj;
        this.f38660e = obj2;
        this.f38661f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f38657a;
        Object obj = this.f38661f;
        Object obj2 = this.f38660e;
        Object obj3 = this.d;
        boolean z9 = this.f38658b;
        FrameLayout frameLayout = this.f38659c;
        switch (i7) {
            case 0:
                da0 da0Var = (da0) frameLayout;
                Context context = (Context) obj3;
                ia0 ia0Var = (ia0) obj2;
                ia0 ia0Var2 = (ia0) obj;
                ja0 ja0Var = da0Var.f32920c0;
                org.telegram.messenger.mj mjVar = ja0Var.d;
                if (!z9) {
                    new hc(ja0Var, ja0Var.F).Q(2131624216, 36, org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750583, null), new s90(da0Var, context, 0))).j();
                    return;
                }
                boolean z10 = mjVar.f24038k;
                mjVar.f24038k = !z10;
                ja0Var.f34980y = false;
                if (z10) {
                    mjVar.f24039l = false;
                    if (ia0Var != null) {
                        ia0Var.a(false, true);
                    }
                }
                ia0Var2.a(mjVar.f24038k, true);
                da0Var.i();
                da0Var.l(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                l60 l60Var = (l60) obj;
                vp0 vp0Var = ((zh.z1) frameLayout).f60639a;
                if (!z9) {
                    bi.t9 t9Var = vp0Var.f60295e;
                    int i10 = tL_starGiftCollection.collection_id;
                    t9Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    t9Var.a(i10, arrayList);
                    hc.a0(vp0Var.f60292a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750393, bi.k7.z1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    vp0Var.f60295e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    hc.a0(vp0Var.f60292a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750037, bi.k7.z1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                l60Var.u();
                vp0Var.o();
                return;
        }
    }
}
