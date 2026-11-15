package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class ap extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public org.telegram.ui.Cells.h6 E;
    public final ArrayList F;
    public TLRPC.Chat f45469a;
    public TLRPC.ChatFull f45470b;
    public final long f45471c;
    public ArrayList d;
    public FrameLayout f45472e;
    public org.telegram.ui.Components.uj0 f45473f;
    public zo h;
    public final ArrayList f45474n;
    public LinearLayout f45475r;
    public int f45476s;
    public int f45477w;
    public org.telegram.ui.Cells.h6 f45478x;
    public org.telegram.ui.Cells.h6 f45479y;

    public ap(Bundle bundle) {
        super(bundle);
        this.d = new ArrayList();
        this.f45474n = new ArrayList();
        this.f45476s = -1;
        this.F = new ArrayList();
        this.f45471c = bundle.getLong("chat_id", 0L);
    }

    public final void a0(int i7, boolean z10) {
        if (this.f45476s != i7) {
            this.f45476s = i7;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.F;
                boolean z11 = true;
                if (i10 >= arrayList.size()) {
                    break;
                }
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) arrayList.get(i10);
                if (i7 != i10) {
                    z11 = false;
                }
                h6Var.a(z11, z10);
                i10++;
            }
            ArrayList arrayList2 = this.f45474n;
            if (i7 == 1) {
                if (z10) {
                    this.d.clear();
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction.reaction.equals("👍") || tL_availableReaction.reaction.equals("👎")) {
                            this.d.add(tL_availableReaction.reaction);
                        }
                    }
                    if (this.d.isEmpty() && arrayList2.size() >= 2) {
                        this.d.add(((TLRPC.TL_availableReaction) arrayList2.get(0)).reaction);
                        this.d.add(((TLRPC.TL_availableReaction) arrayList2.get(1)).reaction);
                    }
                }
                zo zoVar = this.h;
                if (zoVar != null && z10) {
                    zoVar.o(2, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                zo zoVar2 = this.h;
                if (zoVar2 != null && z10) {
                    zoVar2.p(2, arrayList2.size() + 1);
                }
            }
            zo zoVar3 = this.h;
            if (zoVar3 != null && z10) {
                zoVar3.g(1);
            }
            zo zoVar4 = this.h;
            if (zoVar4 != null && !z10) {
                zoVar4.f();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746387, null));
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new p9(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45474n.addAll(getMediaDataController().f26487n);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        n4Var.setText(org.telegram.messenger.hd.M0(2131753759, null));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f45475r = linearLayout;
        linearLayout.setOrientation(1);
        this.f45475r.setClickable(true);
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        this.f45478x = h6Var;
        h6Var.c(org.telegram.messenger.hd.M0(2131754291, null), false, true);
        org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, null);
        this.f45479y = h6Var2;
        h6Var2.c(org.telegram.messenger.hd.M0(2131745292, null), false, true);
        org.telegram.ui.Cells.h6 h6Var3 = new org.telegram.ui.Cells.h6(context, null);
        this.E = h6Var3;
        h6Var3.c(org.telegram.messenger.hd.M0(2131748175, null), false, false);
        this.f45475r.addView(n4Var, c8.ja.o(-1, -2));
        this.f45475r.addView(this.f45478x, c8.ja.o(-1, -2));
        this.f45475r.addView(this.f45479y, c8.ja.o(-1, -2));
        this.f45475r.addView(this.E, c8.ja.o(-1, -2));
        ArrayList arrayList = this.F;
        arrayList.clear();
        arrayList.add(this.f45478x);
        arrayList.add(this.f45479y);
        arrayList.add(this.E);
        this.f45478x.setOnClickListener(new View.OnClickListener(this) {
            public final ap f53272b;

            {
                this.f53272b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final ap apVar = this.f53272b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        apVar.a0(2, true);
                                        return;
                                    case 1:
                                        apVar.a0(1, true);
                                        return;
                                    default:
                                        apVar.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final ap apVar2 = this.f53272b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        apVar2.a0(2, true);
                                        return;
                                    case 1:
                                        apVar2.a0(1, true);
                                        return;
                                    default:
                                        apVar2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final ap apVar3 = this.f53272b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        apVar3.a0(2, true);
                                        return;
                                    case 1:
                                        apVar3.a0(1, true);
                                        return;
                                    default:
                                        apVar3.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f45479y.setOnClickListener(new View.OnClickListener(this) {
            public final ap f53272b;

            {
                this.f53272b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final ap apVar = this.f53272b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        apVar.a0(2, true);
                                        return;
                                    case 1:
                                        apVar.a0(1, true);
                                        return;
                                    default:
                                        apVar.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final ap apVar2 = this.f53272b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        apVar2.a0(2, true);
                                        return;
                                    case 1:
                                        apVar2.a0(1, true);
                                        return;
                                    default:
                                        apVar2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final ap apVar3 = this.f53272b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        apVar3.a0(2, true);
                                        return;
                                    case 1:
                                        apVar3.a0(1, true);
                                        return;
                                    default:
                                        apVar3.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final ap f53272b;

            {
                this.f53272b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final ap apVar = this.f53272b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        apVar.a0(2, true);
                                        return;
                                    case 1:
                                        apVar.a0(1, true);
                                        return;
                                    default:
                                        apVar.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final ap apVar2 = this.f53272b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        apVar2.a0(2, true);
                                        return;
                                    case 1:
                                        apVar2.a0(1, true);
                                        return;
                                    default:
                                        apVar2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final ap apVar3 = this.f53272b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        apVar3.a0(2, true);
                                        return;
                                    case 1:
                                        apVar3.a0(1, true);
                                        return;
                                    default:
                                        apVar3.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        org.telegram.ui.Cells.h6 h6Var4 = this.f45478x;
        int i7 = org.telegram.ui.ActionBar.j6.f28849d6;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.ActionBar.q6.Q(h6Var4, org.telegram.ui.ActionBar.j6.i0(x02, org.telegram.ui.ActionBar.j6.x0(null, i10, false)), org.telegram.ui.ActionBar.q6.M(i7), org.telegram.ui.ActionBar.q6.M(i10), null);
        org.telegram.ui.ActionBar.q6.Q(this.f45479y, org.telegram.ui.ActionBar.j6.i0(org.telegram.ui.ActionBar.j6.x0(null, i7, false), org.telegram.ui.ActionBar.j6.x0(null, i10, false)), org.telegram.ui.ActionBar.q6.M(i7), org.telegram.ui.ActionBar.q6.M(i10), null);
        org.telegram.ui.ActionBar.q6.Q(this.E, org.telegram.ui.ActionBar.j6.i0(org.telegram.ui.ActionBar.j6.x0(null, i7, false), org.telegram.ui.ActionBar.j6.x0(null, i10, false)), org.telegram.ui.ActionBar.q6.M(i7), org.telegram.ui.ActionBar.q6.M(i10), null);
        a0(this.f45477w, false);
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f45473f = uj0Var;
        uj0Var.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.uj0 uj0Var2 = this.f45473f;
        zo zoVar = new zo(this, context);
        this.h = zoVar;
        uj0Var2.setAdapter(zoVar);
        this.f45473f.setOnItemClickListener(new h(this, 5));
        frameLayout.addView(this.f45473f, c8.ja.g());
        this.f45473f.r1();
        this.f45473f.setSectionsDrawBackground(true);
        this.f45472e = frameLayout;
        this.fragmentView = frameLayout;
        this.h.f();
        return this.f45472e;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i7 == org.telegram.messenger.ns.V4) {
                ArrayList arrayList = this.f45474n;
                arrayList.clear();
                arrayList.addAll(getMediaDataController().f26487n);
                this.h.f();
            } else if (i7 == org.telegram.messenger.ns.f25608y1 && ((Long) objArr[0]).longValue() == (-this.f45471c)) {
                org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
                if (o4Var != null && o4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f45473f;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.oa.a(new g6(3, this), org.telegram.ui.ActionBar.j6.f28849d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f29260z6, org.telegram.ui.ActionBar.j6.f28941i6, org.telegram.ui.ActionBar.j6.f28792a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f29070p7, org.telegram.ui.ActionBar.j6.f28887f6, org.telegram.ui.ActionBar.j6.f28904g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.np messagesController = getMessagesController();
        long j3 = this.f45471c;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        this.f45469a = M0;
        if (M0 == null) {
            TLRPC.Chat P = org.telegram.messenger.vr.a0(this.currentAccount).P(j3);
            this.f45469a = P;
            if (P != null) {
                getMessagesController().Q3(this.f45469a, true);
                if (this.f45470b == null) {
                    TLRPC.ChatFull F0 = org.telegram.messenger.vr.a0(this.currentAccount).F0(this.f45471c, org.telegram.messenger.t3.T(this.f45469a), new CountDownLatch(1), false, false, 0);
                    this.f45470b = F0;
                    if (F0 == null) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        getNotificationCenter().c(this, org.telegram.messenger.ns.V4);
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25608y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.np messagesController = getMessagesController();
        int i7 = this.f45476s;
        ArrayList arrayList = this.d;
        messagesController.getClass();
        TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        long j3 = this.f45471c;
        tL_messages_setChatAvailableReactions.peer = messagesController.j1(-j3);
        if (i7 == 2) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsNone();
        } else if (i7 == 0) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsAll();
        } else {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = new TLRPC.TL_chatReactionsSome();
            tL_messages_setChatAvailableReactions.available_reactions = tL_chatReactionsSome;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_reactionEmoji.emoticon = (String) arrayList.get(i10);
                tL_chatReactionsSome.reactions.add(tL_reactionEmoji);
            }
        }
        messagesController.getConnectionsManager().sendRequest(tL_messages_setChatAvailableReactions, new org.telegram.messenger.mj(messagesController, j3, tL_messages_setChatAvailableReactions, 4));
        getNotificationCenter().n(this, org.telegram.messenger.ns.V4);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25608y1);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
