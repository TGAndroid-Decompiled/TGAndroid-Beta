package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class a6 extends n20 implements NotificationCenter.NotificationCenterDelegate {
    public final long M;
    public final int N;
    public TL_stories.TL_premium_boostsStatus O;
    public ChannelBoostsController.CanApplyBoost P;
    public ScrollSlidingTextTabStrip Q;
    public final ArrayList R;
    public final ArrayList S;
    public boolean T;
    public int U;
    public boolean V;
    public int W;
    public final ArrayList X;
    public int Y;
    public LimitPreviewView Z;
    public final t5 f32467a0;
    public boolean f32468b0;
    public LinearLayout f32469c0;
    public final TLRPC.Chat f32470d0;
    public String f32471e0;
    public String f32472f0;
    public int f32473g0;
    public int f32474h0;
    public int f32475i0;
    public int f32476j0;

    public a6(long j10) {
        int i10 = UserConfig.selectedAccount;
        this.N = i10;
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.X = new ArrayList();
        this.Y = 0;
        this.f32467a0 = new t5(this);
        this.f32471e0 = "";
        this.f32472f0 = "";
        this.f32473g0 = 5;
        this.f32474h0 = 5;
        this.M = j10;
        this.f32470d0 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
    }

    public static void x0(a6 a6Var, Context context, View view, int i10) {
        long j10 = a6Var.M;
        boolean z4 = false;
        if (view instanceof lg.b) {
            lg.b bVar = (lg.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z10 = boost.giveaway;
            if (z10 && boost.stars > 0) {
                lh.ja.e1(context, a6Var.N, a6Var.M, boost, a6Var.getResourceProvider());
            } else {
                boolean z11 = boost.gift;
                if (((!z11 && !z10) || boost.user_id < 0) && !boost.unclaimed) {
                    if (z10 && boost.user_id == -1) {
                        org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(a6Var.getParentActivity(), a6Var.getResourceProvider());
                        qbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                        qbVar.f28137b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                        qbVar.f28137b.setSingleLine(false);
                        qbVar.f28137b.setMaxLines(2);
                        org.telegram.ui.Components.ic.g(a6Var, qbVar, 2750).j();
                    } else if (!z11 && !z10) {
                        a6Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                    }
                } else {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-a6Var.f32470d0.f19159id);
                    int i11 = boost.date;
                    tL_payments_checkedGiftCode.date = i11;
                    tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                    int i12 = boost.expires - i11;
                    tL_payments_checkedGiftCode.days = i12 / 86400;
                    tL_payments_checkedGiftCode.months = (i12 / 30) / 86400;
                    if (boost.unclaimed) {
                        tL_payments_checkedGiftCode.to_id = -1L;
                        tL_payments_checkedGiftCode.flags = -1;
                    } else {
                        tL_payments_checkedGiftCode.boost = boost;
                    }
                    new gg.e1(a6Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                }
            }
        }
        if (view instanceof org.telegram.ui.Cells.n8) {
            gg.x.m(a6Var, a6Var.resourceProvider, j10, null);
        }
        if (view instanceof lg.c) {
            gg.x.m(a6Var, a6Var.resourceProvider, j10, ((lg.c) view).getPrepaidGiveaway());
        }
        if (((z5) a6Var.X.get(i10)).f1830a == 9) {
            if (a6Var.Y == 1) {
                z4 = true;
            }
            a6Var.E0(Boolean.valueOf(z4));
        }
    }

    public final void C0(CountDownLatch countDownLatch, q5 q5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.f32474h0;
        tL_premium_getBoostsList.offset = this.f32471e0;
        int i10 = this.N;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.M);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new o5(this, countDownLatch, q5Var, 0), 2);
    }

    public final void D0(CountDownLatch countDownLatch, q5 q5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.f32473g0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.f32472f0;
        int i10 = this.N;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.M);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new o5(this, countDownLatch, q5Var, 1), 2);
    }

    public final void E0(Boolean bool) {
        if (this.f32468b0) {
            return;
        }
        this.f32468b0 = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new q5(this, 1));
        } else if (bool.booleanValue()) {
            D0(null, new q5(this, 2));
        } else {
            C0(null, new q5(this, 3));
        }
    }

    public final void F0(boolean z4) {
        int i10;
        int i11;
        View view;
        float f10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.Z == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), R.drawable.filled_limit_boost, 0, this.resourceProvider, 0);
            this.Z = limitPreviewView;
            limitPreviewView.W = true;
            limitPreviewView.setDarkGradientProvider(new c1(this, 5));
        }
        if (this.Z.getParent() != null) {
            ((ViewGroup) this.Z.getParent()).removeView(this.Z);
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.O;
        if (tL_premium_boostsStatus != null) {
            this.Z.e(tL_premium_boostsStatus, false);
            if (z4) {
                this.Z.setAlpha(0.0f);
                this.Z.animate().alpha(1.0f).start();
            }
        }
        TLRPC.Chat chat = this.f32470d0;
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingBoostForChannels;
        } else {
            i10 = R.string.BoostingBoostForGroups;
        }
        String string = LocaleController.getString(i10);
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i11 = R.string.BoostingBoostForChannelsInfo;
        } else {
            i11 = R.string.BoostingBoostForGroupsInfo;
        }
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i11));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        if (this.O != null) {
            view = this.Z;
        } else {
            view = new View(frameLayout.getContext());
        }
        if (this.O != null) {
            f10 = -2.0f;
        } else {
            f10 = 110.0f;
        }
        frameLayout.addView(view, k7.b6.d(-1, f10, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        m0(string, replaceTags, frameLayout, new y5(this, getParentActivity()));
    }

    public final void G0(boolean z4) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        ArrayList arrayList = this.X;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new bg.b(14, false));
        if (this.O != null) {
            arrayList.add(new z5(16, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new bg.b(0, false));
            arrayList.add(new bg.b(2, false));
            if (this.O.prepaid_giveaways.size() > 0) {
                arrayList.add(new z5(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                for (int i14 = 0; i14 < this.O.prepaid_giveaways.size(); i14++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.O.prepaid_giveaways.get(i14);
                    if (i14 == this.O.prepaid_giveaways.size() - 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ?? bVar = new bg.b(11, true);
                    bVar.e = prepaidGiveaway;
                    bVar.f40398f = z12;
                    arrayList.add(bVar);
                }
                arrayList.add(new z5(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new z5(13, LocaleController.getString(R.string.Boosters)));
            int i15 = this.Y;
            TLRPC.Chat chat = this.f32470d0;
            if (i15 == 0) {
                ArrayList arrayList3 = this.R;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new bg.b(8, false));
                    arrayList.add(new bg.b(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i16);
                        if (i16 == arrayList3.size() - 1 && !this.T) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new z5(boost, z11, this.Y));
                    }
                    if (this.T) {
                        arrayList.add(new bg.b(9, true));
                    } else {
                        arrayList.add(new bg.b(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i13 = R.string.BoostersInfoDescription;
                    } else {
                        i13 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new z5(6, LocaleController.getString(i13)));
                }
            } else {
                ArrayList arrayList4 = this.S;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new bg.b(8, false));
                    arrayList.add(new bg.b(2, false));
                } else {
                    for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i17);
                        if (i17 == arrayList4.size() - 1 && !this.V) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        arrayList.add(new z5(boost2, z10, this.Y));
                    }
                    if (this.V) {
                        arrayList.add(new bg.b(9, true));
                    } else {
                        arrayList.add(new bg.b(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i10 = R.string.BoostersInfoDescription;
                    } else {
                        i10 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new z5(6, LocaleController.getString(i10)));
                }
            }
            arrayList.add(new z5(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new z5(3, this.O.boost_url));
            if (MessagesController.getInstance(this.N).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i11 = R.string.BoostingShareThisLink;
                } else {
                    i11 = R.string.BoostingShareThisLinkGroup;
                }
                arrayList.add(new z5(6, LocaleController.getString(i11)));
                arrayList.add(new bg.b(10, true));
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i12 = R.string.BoostingGetMoreBoosts2;
                } else {
                    i12 = R.string.BoostingGetMoreBoostsGroup;
                }
                arrayList.add(new z5(6, LocaleController.getString(i12)));
            } else {
                arrayList.add(new z5(6, ""));
            }
            arrayList.add(new bg.b(15, false));
        }
        t5 t5Var = this.f32467a0;
        if (z4) {
            t5Var.E(arrayList2, arrayList);
        } else {
            t5Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        F0(false);
        f2.l lVar = new f2.l();
        lVar.f5807m = false;
        lVar.C = false;
        this.f36318c.setItemAnimator(lVar);
        this.f36318c.setOnItemClickListener(new gg.v0(4, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f32469c0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f32469c0.addView(new nh.n1(parentActivity), k7.b6.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.f32469c0, k7.b6.e(-1, -2, 17));
        this.f32469c0.setAlpha(0.0f);
        if (this.O == null) {
            this.f32469c0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().getBoostsController().getBoostsStats(this.M, new r5(this, 1));
        } else {
            this.f32469c0.setVisibility(8);
            E0(null);
        }
        G0(false);
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.p2 p2Var;
        org.telegram.ui.ActionBar.p2 p2Var2;
        if (i10 == NotificationCenter.boostByChannelCreated) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.p2 p2Var3 = null;
            if (fragmentStack.size() >= 2) {
                p2Var = (org.telegram.ui.ActionBar.p2) ai.j(2, fragmentStack);
            } else {
                p2Var = null;
            }
            if (p2Var instanceof ro) {
                ((ActionBarLayout) getParentLayout()).a0(p2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            if (fragmentStack2.size() >= 2) {
                p2Var2 = (org.telegram.ui.ActionBar.p2) ai.j(2, fragmentStack2);
            } else {
                p2Var2 = null;
            }
            if (booleanValue) {
                if (fragmentStack2.size() >= 3) {
                    p2Var3 = (org.telegram.ui.ActionBar.p2) ai.j(3, fragmentStack2);
                }
                if (p2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) getParentLayout()).a0(p2Var2, false);
                }
                finishFragment();
                if (p2Var3 instanceof zn) {
                    gg.r.f(p2Var3, chat, true);
                }
                if (p2Var2 instanceof zn) {
                    gg.r.f(p2Var2, chat, true);
                    return;
                }
                return;
            }
            finishFragment();
            if ((p2Var2 instanceof ProfileActivity) || (p2Var2 instanceof zn)) {
                gg.r.f(p2Var2, chat, false);
            }
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (this.M == ((Long) objArr[2]).longValue()) {
                this.O = (TL_stories.TL_premium_boostsStatus) objArr[0];
                this.P = (ChannelBoostsController.CanApplyBoost) objArr[1];
            }
        }
    }

    @Override
    public final f2.o0 n0() {
        return this.f32467a0;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        super.onFragmentDestroy();
    }
}
