package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class ic extends FrameLayout {
    public final gc E;
    public final org.telegram.ui.Components.mm0 F;
    public bh.l G;
    public boolean H;
    public final LinearLayout I;
    public final TLRPC.Chat J;
    public String K;
    public String L;
    public int M;
    public int N;
    public int O;
    public int P;
    public final long f37085a;
    public final int f37086b;
    public final hb1 f37087c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.c6 e;
    public ScrollSlidingTextTabStrip f37088f;
    public final ArrayList h;
    public final ArrayList f37089n;
    public boolean f37090r;
    public int f37091s;
    public boolean v;
    public int f37092w;
    public final ArrayList f37093x;
    public int f37094y;

    public ic(hb1 hb1Var, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(hb1Var.getParentActivity());
        int i10 = UserConfig.selectedAccount;
        this.f37086b = i10;
        this.h = new ArrayList();
        this.f37089n = new ArrayList();
        this.f37093x = new ArrayList();
        this.f37094y = 0;
        gc gcVar = new gc(this);
        this.E = gcVar;
        this.K = "";
        this.L = "";
        this.M = 5;
        this.N = 5;
        this.f37087c = hb1Var;
        Activity parentActivity = hb1Var.getParentActivity();
        this.e = c6Var;
        this.f37085a = j10;
        this.J = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(parentActivity, null);
        this.F = mm0Var;
        mm0Var.setSections(true);
        mm0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19843a7, c6Var));
        mm0Var.setLayoutManager(new s4.b0());
        s4.k kVar = new s4.k();
        kVar.f44872m = false;
        kVar.C = false;
        mm0Var.setItemAnimator(kVar);
        mm0Var.setClipToPadding(false);
        mm0Var.setOnItemClickListener(new bc(this, parentActivity, j10, c6Var, hb1Var));
        addView(mm0Var);
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j10, new v3(this, 1));
        mm0Var.setAdapter(gcVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.I = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.statistic_preload, 120, 120, null);
        imageView.d();
        TextView g10 = org.telegram.messenger.q.g(context, 1, 20.0f);
        g10.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.Oi;
        g10.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        g10.setTag(Integer.valueOf(i11));
        g10.setText(LocaleController.getString(R.string.LoadingStats));
        g10.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.g6.Pi;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        org.telegram.messenger.yh.l(R.string.LoadingStatsDescription, textView, 1);
        this.I.addView((View) imageView, w7.a6.t(120, 120, 1, 0, 0, 0, 20));
        this.I.addView(g10, w7.a6.t(-2, -2, 1, 0, 0, 0, 10));
        this.I.addView(textView, w7.a6.q(-2, -2, 1));
        addView(this.I, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 30.0f, 240, 17));
        this.I.setAlpha(0.0f);
        this.I.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        zh.n5.y(i10, false).v();
    }

    public final void a(CountDownLatch countDownLatch, dc dcVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.N;
        tL_premium_getBoostsList.offset = this.K;
        int i10 = this.f37086b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.f37085a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new ec(this, countDownLatch, dcVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, dc dcVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.L;
        int i10 = this.f37086b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.f37085a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new ec(this, countDownLatch, dcVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.H) {
            return;
        }
        this.H = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new dc(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new dc(this, 1));
        } else {
            a(null, new dc(this, 2));
        }
    }

    public final void d(boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        ArrayList arrayList = this.f37093x;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new pg.a(4, false));
            arrayList.add(new hc(1, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new pg.a(0, false));
            arrayList.add(new pg.a(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new hc(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                for (int i14 = 0; i14 < this.d.prepaid_giveaways.size(); i14++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i14);
                    if (i14 == this.d.prepaid_giveaways.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ?? aVar = new pg.a(11, true);
                    aVar.e = prepaidGiveaway;
                    aVar.f36722f = z13;
                    arrayList.add(aVar);
                }
                arrayList.add(new hc(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new hc(13, LocaleController.getString(R.string.Boosters)));
            int i15 = this.f37094y;
            TLRPC.Chat chat = this.J;
            if (i15 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new pg.a(8, false));
                    arrayList.add(new pg.a(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i16);
                        if (i16 == arrayList3.size() - 1 && !this.f37090r) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        arrayList.add(new hc(boost, z12, this.f37094y));
                    }
                    if (this.f37090r) {
                        arrayList.add(new pg.a(9, true));
                    } else {
                        arrayList.add(new pg.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i13 = R.string.BoostersInfoDescription;
                    } else {
                        i13 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new hc(6, LocaleController.getString(i13)));
                }
            } else {
                ArrayList arrayList4 = this.f37089n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new pg.a(8, false));
                    arrayList.add(new pg.a(2, false));
                } else {
                    for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i17);
                        if (i17 == arrayList4.size() - 1 && !this.v) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new hc(boost2, z11, this.f37094y));
                    }
                    if (this.v) {
                        arrayList.add(new pg.a(9, true));
                    } else {
                        arrayList.add(new pg.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i10 = R.string.BoostersInfoDescription;
                    } else {
                        i10 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new hc(6, LocaleController.getString(i10)));
                }
            }
            arrayList.add(new hc(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new hc(3, this.d.boost_url));
            if (MessagesController.getInstance(this.f37086b).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i11 = R.string.BoostingShareThisLink;
                } else {
                    i11 = R.string.BoostingShareThisLinkGroup;
                }
                arrayList.add(new hc(6, LocaleController.getString(i11)));
                arrayList.add(new pg.a(10, true));
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i12 = R.string.BoostingGetMoreBoosts2;
                } else {
                    i12 = R.string.BoostingGetMoreBoostsGroup;
                }
                arrayList.add(new hc(6, LocaleController.getString(i12)));
            }
        }
        gc gcVar = this.E;
        if (z10) {
            gcVar.E(arrayList2, arrayList);
        } else {
            gcVar.l();
        }
    }
}
