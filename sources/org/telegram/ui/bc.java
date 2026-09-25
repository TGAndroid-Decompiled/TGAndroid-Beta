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
public final class bc extends FrameLayout {
    public final zb E;
    public final org.telegram.ui.Components.wl0 F;
    public ah.n G;
    public boolean H;
    public final LinearLayout I;
    public final TLRPC.Chat J;
    public String K;
    public String L;
    public int M;
    public int N;
    public int O;
    public int P;
    public final long f32375a;
    public final int f32376b;
    public final sa1 f32377c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.d6 e;
    public ScrollSlidingTextTabStrip f32378f;
    public final ArrayList h;
    public final ArrayList f32379n;
    public boolean f32380r;
    public int f32381s;
    public boolean v;
    public int f32382w;
    public final ArrayList f32383x;
    public int f32384y;

    public bc(sa1 sa1Var, long j3, org.telegram.ui.ActionBar.d6 d6Var) {
        super(sa1Var.getParentActivity());
        int i10 = UserConfig.selectedAccount;
        this.f32376b = i10;
        this.h = new ArrayList();
        this.f32379n = new ArrayList();
        this.f32383x = new ArrayList();
        this.f32384y = 0;
        zb zbVar = new zb(this);
        this.E = zbVar;
        this.K = "";
        this.L = "";
        this.M = 5;
        this.N = 5;
        this.f32377c = sa1Var;
        Activity parentActivity = sa1Var.getParentActivity();
        this.e = d6Var;
        this.f32375a = j3;
        this.J = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(parentActivity, null);
        this.F = wl0Var;
        wl0Var.setSections(true);
        wl0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19004a7, d6Var));
        wl0Var.setLayoutManager(new s4.c0());
        s4.j jVar = new s4.j();
        jVar.f42996m = false;
        jVar.C = false;
        wl0Var.setItemAnimator(jVar);
        wl0Var.setClipToPadding(false);
        wl0Var.setOnItemClickListener(new vb(this, parentActivity, j3, d6Var, sa1Var));
        addView(wl0Var);
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j3, new t3(this, 1));
        wl0Var.setAdapter(zbVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.I = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.statistic_preload, 120, 120, null);
        imageView.d();
        TextView f7 = org.telegram.messenger.f0.f(context, 1, 20.0f);
        f7.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.h6.Oi;
        f7.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        f7.setTag(Integer.valueOf(i11));
        f7.setText(LocaleController.getString(R.string.LoadingStats));
        f7.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.h6.Pi;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        org.telegram.messenger.ok.l(R.string.LoadingStatsDescription, textView, 1);
        this.I.addView((View) imageView, w7.y5.t(120, 120, 1, 0, 0, 0, 20));
        this.I.addView(f7, w7.y5.t(-2, -2, 1, 0, 0, 0, 10));
        this.I.addView(textView, w7.y5.q(-2, -2, 1));
        addView(this.I, w7.y5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.I.setAlpha(0.0f);
        this.I.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        yh.s5.y(i10, false).v();
    }

    public final void a(CountDownLatch countDownLatch, xb xbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.N;
        tL_premium_getBoostsList.offset = this.K;
        int i10 = this.f32376b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.f32375a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new yb(this, countDownLatch, xbVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, xb xbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.L;
        int i10 = this.f32376b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.f32375a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new yb(this, countDownLatch, xbVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.H) {
            return;
        }
        this.H = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new xb(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new xb(this, 1));
        } else {
            a(null, new xb(this, 2));
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
        ArrayList arrayList = this.f32383x;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new og.a(4, false));
            arrayList.add(new ac(1, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new og.a(0, false));
            arrayList.add(new og.a(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new ac(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                for (int i14 = 0; i14 < this.d.prepaid_giveaways.size(); i14++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i14);
                    if (i14 == this.d.prepaid_giveaways.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ?? aVar = new og.a(11, true);
                    aVar.e = prepaidGiveaway;
                    aVar.f32096f = z13;
                    arrayList.add(aVar);
                }
                arrayList.add(new ac(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new ac(13, LocaleController.getString(R.string.Boosters)));
            int i15 = this.f32384y;
            TLRPC.Chat chat = this.J;
            if (i15 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new og.a(8, false));
                    arrayList.add(new og.a(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i16);
                        if (i16 == arrayList3.size() - 1 && !this.f32380r) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        arrayList.add(new ac(boost, z12, this.f32384y));
                    }
                    if (this.f32380r) {
                        arrayList.add(new og.a(9, true));
                    } else {
                        arrayList.add(new og.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i13 = R.string.BoostersInfoDescription;
                    } else {
                        i13 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new ac(6, LocaleController.getString(i13)));
                }
            } else {
                ArrayList arrayList4 = this.f32379n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new og.a(8, false));
                    arrayList.add(new og.a(2, false));
                } else {
                    for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i17);
                        if (i17 == arrayList4.size() - 1 && !this.v) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new ac(boost2, z11, this.f32384y));
                    }
                    if (this.v) {
                        arrayList.add(new og.a(9, true));
                    } else {
                        arrayList.add(new og.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i10 = R.string.BoostersInfoDescription;
                    } else {
                        i10 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new ac(6, LocaleController.getString(i10)));
                }
            }
            arrayList.add(new ac(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new ac(3, this.d.boost_url));
            if (MessagesController.getInstance(this.f32376b).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i11 = R.string.BoostingShareThisLink;
                } else {
                    i11 = R.string.BoostingShareThisLinkGroup;
                }
                arrayList.add(new ac(6, LocaleController.getString(i11)));
                arrayList.add(new og.a(10, true));
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i12 = R.string.BoostingGetMoreBoosts2;
                } else {
                    i12 = R.string.BoostingGetMoreBoostsGroup;
                }
                arrayList.add(new ac(6, LocaleController.getString(i12)));
            }
        }
        zb zbVar = this.E;
        if (z10) {
            zbVar.E(arrayList2, arrayList);
        } else {
            zbVar.l();
        }
    }
}
