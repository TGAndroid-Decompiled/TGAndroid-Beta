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
public final class cc extends FrameLayout {
    public final ac B;
    public final org.telegram.ui.Components.rl0 C;
    public ng.k D;
    public boolean E;
    public final LinearLayout F;
    public final TLRPC.Chat G;
    public String H;
    public String I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final long f33070a;
    public final int f33071b;
    public final oa1 f33072c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.f6 e;
    public ScrollSlidingTextTabStrip f33073f;
    public final ArrayList h;
    public final ArrayList f33074n;
    public boolean f33075r;
    public int f33076s;
    public boolean v;
    public int f33077w;
    public final ArrayList f33078x;
    public int f33079y;

    public cc(oa1 oa1Var, long j10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(oa1Var.getParentActivity());
        int i10 = UserConfig.selectedAccount;
        this.f33071b = i10;
        this.h = new ArrayList();
        this.f33074n = new ArrayList();
        this.f33078x = new ArrayList();
        this.f33079y = 0;
        ac acVar = new ac(this);
        this.B = acVar;
        this.H = "";
        this.I = "";
        this.J = 5;
        this.K = 5;
        this.f33072c = oa1Var;
        Activity parentActivity = oa1Var.getParentActivity();
        this.e = f6Var;
        this.f33070a = j10;
        this.G = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(parentActivity, null);
        this.C = rl0Var;
        rl0Var.setSections(true);
        rl0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19827a7, f6Var));
        rl0Var.setLayoutManager(new f2.i0());
        f2.l lVar = new f2.l();
        lVar.f5807m = false;
        lVar.C = false;
        rl0Var.setItemAnimator(lVar);
        rl0Var.setClipToPadding(false);
        rl0Var.setOnItemClickListener(new vb(this, parentActivity, j10, f6Var, oa1Var));
        addView(rl0Var);
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j10, new xb(this, 0));
        rl0Var.setAdapter(acVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.F = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.statistic_preload, 120, 120, null);
        imageView.d();
        TextView g10 = org.telegram.messenger.y3.g(context, 1, 20.0f);
        g10.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.Oi;
        g10.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        g10.setTag(Integer.valueOf(i11));
        g10.setText(LocaleController.getString(R.string.LoadingStats));
        g10.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.j6.Pi;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        org.telegram.messenger.y3.r(R.string.LoadingStatsDescription, textView, 1);
        this.F.addView((View) imageView, k7.b6.t(120, 120, 1, 0, 0, 0, 20));
        this.F.addView(g10, k7.b6.t(-2, -2, 1, 0, 0, 0, 10));
        this.F.addView(textView, k7.b6.q(-2, -2, 1));
        addView(this.F, k7.b6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.F.setAlpha(0.0f);
        this.F.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        lh.t7.y(i10, false).v();
    }

    public final void a(CountDownLatch countDownLatch, yb ybVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.K;
        tL_premium_getBoostsList.offset = this.H;
        int i10 = this.f33071b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.f33070a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new zb(this, countDownLatch, ybVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, yb ybVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.J;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.I;
        int i10 = this.f33071b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.f33070a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new zb(this, countDownLatch, ybVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.E) {
            return;
        }
        this.E = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new yb(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new yb(this, 1));
        } else {
            a(null, new yb(this, 2));
        }
    }

    public final void d(boolean z4) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        ArrayList arrayList = this.f33078x;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new bg.b(4, false));
            arrayList.add(new bc(1, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new bg.b(0, false));
            arrayList.add(new bg.b(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new bc(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                for (int i14 = 0; i14 < this.d.prepaid_giveaways.size(); i14++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i14);
                    if (i14 == this.d.prepaid_giveaways.size() - 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ?? bVar = new bg.b(11, true);
                    bVar.e = prepaidGiveaway;
                    bVar.f32834f = z12;
                    arrayList.add(bVar);
                }
                arrayList.add(new bc(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new bc(13, LocaleController.getString(R.string.Boosters)));
            int i15 = this.f33079y;
            TLRPC.Chat chat = this.G;
            if (i15 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new bg.b(8, false));
                    arrayList.add(new bg.b(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i16);
                        if (i16 == arrayList3.size() - 1 && !this.f33075r) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new bc(boost, z11, this.f33079y));
                    }
                    if (this.f33075r) {
                        arrayList.add(new bg.b(9, true));
                    } else {
                        arrayList.add(new bg.b(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i13 = R.string.BoostersInfoDescription;
                    } else {
                        i13 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new bc(6, LocaleController.getString(i13)));
                }
            } else {
                ArrayList arrayList4 = this.f33074n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new bg.b(8, false));
                    arrayList.add(new bg.b(2, false));
                } else {
                    for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i17);
                        if (i17 == arrayList4.size() - 1 && !this.v) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        arrayList.add(new bc(boost2, z10, this.f33079y));
                    }
                    if (this.v) {
                        arrayList.add(new bg.b(9, true));
                    } else {
                        arrayList.add(new bg.b(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i10 = R.string.BoostersInfoDescription;
                    } else {
                        i10 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new bc(6, LocaleController.getString(i10)));
                }
            }
            arrayList.add(new bc(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new bc(3, this.d.boost_url));
            if (MessagesController.getInstance(this.f33071b).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i11 = R.string.BoostingShareThisLink;
                } else {
                    i11 = R.string.BoostingShareThisLinkGroup;
                }
                arrayList.add(new bc(6, LocaleController.getString(i11)));
                arrayList.add(new bg.b(10, true));
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i12 = R.string.BoostingGetMoreBoosts2;
                } else {
                    i12 = R.string.BoostingGetMoreBoostsGroup;
                }
                arrayList.add(new bc(6, LocaleController.getString(i12)));
            }
        }
        ac acVar = this.B;
        if (z4) {
            acVar.E(arrayList2, arrayList);
        } else {
            acVar.l();
        }
    }
}
