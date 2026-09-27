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
public final class dc extends FrameLayout {
    public final bc E;
    public final org.telegram.ui.Components.yl0 F;
    public boolean G;
    public final LinearLayout H;
    public final TLRPC.Chat I;
    public String J;
    public String K;
    public int L;
    public int M;
    public int N;
    public int O;
    public final long f32923a;
    public final int f32924b;
    public final ra1 f32925c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.e6 e;
    public ScrollSlidingTextTabStrip f32926f;
    public final ArrayList h;
    public final ArrayList f32927n;
    public boolean f32928r;
    public int f32929s;
    public boolean v;
    public int f32930w;
    public final ArrayList f32931x;
    public int f32932y;

    public dc(ra1 ra1Var, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(ra1Var.getParentActivity());
        int i10 = UserConfig.selectedAccount;
        this.f32924b = i10;
        this.h = new ArrayList();
        this.f32927n = new ArrayList();
        this.f32931x = new ArrayList();
        this.f32932y = 0;
        bc bcVar = new bc(this);
        this.E = bcVar;
        this.J = "";
        this.K = "";
        this.L = 5;
        this.M = 5;
        this.f32925c = ra1Var;
        Activity parentActivity = ra1Var.getParentActivity();
        this.e = e6Var;
        this.f32923a = j3;
        this.I = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(parentActivity, null);
        this.F = yl0Var;
        yl0Var.setSections(true);
        yl0Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19001a7, e6Var));
        yl0Var.setLayoutManager(new s4.c0());
        s4.j jVar = new s4.j();
        jVar.f43040m = false;
        jVar.C = false;
        yl0Var.setItemAnimator(jVar);
        yl0Var.setClipToPadding(false);
        yl0Var.setOnItemClickListener(new xb(this, parentActivity, j3, e6Var, ra1Var));
        addView(yl0Var);
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j3, new u3(this, 1));
        yl0Var.setAdapter(bcVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.H = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.statistic_preload, 120, 120, null);
        imageView.d();
        TextView f7 = org.telegram.messenger.l0.f(context, 1, 20.0f);
        f7.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.i6.Oi;
        f7.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        f7.setTag(Integer.valueOf(i11));
        f7.setText(LocaleController.getString(R.string.LoadingStats));
        f7.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.i6.Pi;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        org.telegram.messenger.qk.l(R.string.LoadingStatsDescription, textView, 1);
        this.H.addView((View) imageView, w7.y5.t(120, 120, 1, 0, 0, 0, 20));
        this.H.addView(f7, w7.y5.t(-2, -2, 1, 0, 0, 0, 10));
        this.H.addView(textView, w7.y5.q(-2, -2, 1));
        addView(this.H, w7.y5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.H.setAlpha(0.0f);
        this.H.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        yh.s5.y(i10, false).v();
    }

    public final void a(CountDownLatch countDownLatch, zb zbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.offset = this.J;
        int i10 = this.f32924b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.f32923a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new ac(this, countDownLatch, zbVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, zb zbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.L;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.K;
        int i10 = this.f32924b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.f32923a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new ac(this, countDownLatch, zbVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.G) {
            return;
        }
        this.G = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new zb(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new zb(this, 1));
        } else {
            a(null, new zb(this, 2));
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
        ArrayList arrayList = this.f32931x;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new og.a(4, false));
            arrayList.add(new cc(1, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new og.a(0, false));
            arrayList.add(new og.a(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new cc(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                for (int i14 = 0; i14 < this.d.prepaid_giveaways.size(); i14++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i14);
                    if (i14 == this.d.prepaid_giveaways.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ?? aVar = new og.a(11, true);
                    aVar.e = prepaidGiveaway;
                    aVar.f32652f = z13;
                    arrayList.add(aVar);
                }
                arrayList.add(new cc(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new cc(13, LocaleController.getString(R.string.Boosters)));
            int i15 = this.f32932y;
            TLRPC.Chat chat = this.I;
            if (i15 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new og.a(8, false));
                    arrayList.add(new og.a(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i16);
                        if (i16 == arrayList3.size() - 1 && !this.f32928r) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        arrayList.add(new cc(boost, z12, this.f32932y));
                    }
                    if (this.f32928r) {
                        arrayList.add(new og.a(9, true));
                    } else {
                        arrayList.add(new og.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i13 = R.string.BoostersInfoDescription;
                    } else {
                        i13 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new cc(6, LocaleController.getString(i13)));
                }
            } else {
                ArrayList arrayList4 = this.f32927n;
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
                        arrayList.add(new cc(boost2, z11, this.f32932y));
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
                    arrayList.add(new cc(6, LocaleController.getString(i10)));
                }
            }
            arrayList.add(new cc(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new cc(3, this.d.boost_url));
            if (MessagesController.getInstance(this.f32924b).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i11 = R.string.BoostingShareThisLink;
                } else {
                    i11 = R.string.BoostingShareThisLinkGroup;
                }
                arrayList.add(new cc(6, LocaleController.getString(i11)));
                arrayList.add(new og.a(10, true));
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i12 = R.string.BoostingGetMoreBoosts2;
                } else {
                    i12 = R.string.BoostingGetMoreBoostsGroup;
                }
                arrayList.add(new cc(6, LocaleController.getString(i12)));
            }
        }
        bc bcVar = this.E;
        if (z10) {
            bcVar.E(arrayList2, arrayList);
        } else {
            bcVar.l();
        }
    }
}
