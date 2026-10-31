package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
public final class au implements org.telegram.messenger.q20 {
    public final int f35744a;
    public final long f35745b;
    public final Object f35746c;
    public final Object d;

    public au(Object obj, Object obj2, long j10, int i10) {
        this.f35744a = i10;
        this.f35746c = obj;
        this.d = obj2;
        this.f35745b = j10;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        int i10;
        switch (this.f35744a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f35746c;
                Long l4 = (Long) obj;
                org.telegram.messenger.i0.r((zt) this.d);
                if (!dataSettingsActivity.V && System.currentTimeMillis() - this.f35745b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.V = z10;
                dataSettingsActivity.X = l4.longValue();
                dataSettingsActivity.W = false;
                if (dataSettingsActivity.f33311a != null && (i10 = dataSettingsActivity.f33317s) >= 0) {
                    dataSettingsActivity.r0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.x1) this.d).r(150L);
                ay ayVar = ((cx) this.f35746c).f36564b;
                Boolean bool = ayVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    ayVar.getMessagesController().m(this.f35745b, ayVar.getMessagesController().Z1(Long.valueOf(ayVar.H)), 0, null, ayVar, false, runnable, new jf(6, runnable), null);
                    return;
                }
                runnable.run();
                return;
            case 2:
                ProfileActivity.h0((ProfileActivity) this.f35746c, (Context) this.d, this.f35745b, (TL_payments.connectedBotStarRef) obj);
                return;
            default:
                rh.e4 e4Var = (rh.e4) this.f35746c;
                org.telegram.messenger.vp vpVar = (org.telegram.messenger.vp) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < vpVar.f18908t5) {
                    org.telegram.messenger.i3 G0 = vpVar.G0();
                    long j10 = this.f35745b;
                    G0.b(j10, tL_premium_boostsStatus, new ko(e4Var, tL_premium_boostsStatus, j10, vpVar));
                    return;
                }
                e4Var.f46801c2.setLoading(false);
                e4Var.t2(true);
                return;
        }
    }
}
