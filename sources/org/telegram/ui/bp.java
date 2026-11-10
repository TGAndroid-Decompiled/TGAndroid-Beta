package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class bp extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public org.telegram.ui.Cells.i6 D;
    public final ArrayList E;
    public TLRPC.Chat f44093a;
    public TLRPC.ChatFull f44094b;
    public final long f44095c;
    public ArrayList d;
    public FrameLayout f44096e;
    public org.telegram.ui.Components.pj0 f44097f;
    public ap h;
    public final ArrayList f44098n;
    public LinearLayout f44099r;
    public int f44100s;
    public int f44101w;
    public org.telegram.ui.Cells.i6 f44102x;
    public org.telegram.ui.Cells.i6 f44103y;

    public bp(Bundle bundle) {
        super(bundle);
        this.d = new ArrayList();
        this.f44098n = new ArrayList();
        this.f44100s = -1;
        this.E = new ArrayList();
        this.f44095c = bundle.getLong("chat_id", 0L);
    }

    public final void a0(int i7, boolean z9) {
        if (this.f44100s != i7) {
            this.f44100s = i7;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.E;
                boolean z10 = true;
                if (i10 >= arrayList.size()) {
                    break;
                }
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) arrayList.get(i10);
                if (i7 != i10) {
                    z10 = false;
                }
                i6Var.a(z10, z9);
                i10++;
            }
            ArrayList arrayList2 = this.f44098n;
            if (i7 == 1) {
                if (z9) {
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
                ap apVar = this.h;
                if (apVar != null && z9) {
                    apVar.o(2, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                ap apVar2 = this.h;
                if (apVar2 != null && z9) {
                    apVar2.p(2, arrayList2.size() + 1);
                }
            }
            ap apVar3 = this.h;
            if (apVar3 != null && z9) {
                apVar3.g(1);
            }
            ap apVar4 = this.h;
            if (apVar4 != null && !z9) {
                apVar4.f();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131746387, null));
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44098n.addAll(getMediaDataController().f25832n);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        n4Var.setText(org.telegram.messenger.id.M0(2131753759, null));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44099r = linearLayout;
        linearLayout.setOrientation(1);
        this.f44099r.setClickable(true);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
        this.f44102x = i6Var;
        i6Var.c(org.telegram.messenger.id.M0(2131754291, null), false, true);
        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, null);
        this.f44103y = i6Var2;
        i6Var2.c(org.telegram.messenger.id.M0(2131745292, null), false, true);
        org.telegram.ui.Cells.i6 i6Var3 = new org.telegram.ui.Cells.i6(context, null);
        this.D = i6Var3;
        i6Var3.c(org.telegram.messenger.id.M0(2131748175, null), false, false);
        this.f44099r.addView(n4Var, c8.ha.o(-1, -2));
        this.f44099r.addView(this.f44102x, c8.ha.o(-1, -2));
        this.f44099r.addView(this.f44103y, c8.ha.o(-1, -2));
        this.f44099r.addView(this.D, c8.ha.o(-1, -2));
        ArrayList arrayList = this.E;
        arrayList.clear();
        arrayList.add(this.f44102x);
        arrayList.add(this.f44103y);
        arrayList.add(this.D);
        this.f44102x.setOnClickListener(new View.OnClickListener(this) {
            public final bp f52076b;

            {
                this.f52076b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final bp bpVar = this.f52076b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        bpVar.a0(2, true);
                                        return;
                                    case 1:
                                        bpVar.a0(1, true);
                                        return;
                                    default:
                                        bpVar.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final bp bpVar2 = this.f52076b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        bpVar2.a0(2, true);
                                        return;
                                    case 1:
                                        bpVar2.a0(1, true);
                                        return;
                                    default:
                                        bpVar2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final bp bpVar3 = this.f52076b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        bpVar3.a0(2, true);
                                        return;
                                    case 1:
                                        bpVar3.a0(1, true);
                                        return;
                                    default:
                                        bpVar3.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f44103y.setOnClickListener(new View.OnClickListener(this) {
            public final bp f52076b;

            {
                this.f52076b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final bp bpVar = this.f52076b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        bpVar.a0(2, true);
                                        return;
                                    case 1:
                                        bpVar.a0(1, true);
                                        return;
                                    default:
                                        bpVar.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final bp bpVar2 = this.f52076b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        bpVar2.a0(2, true);
                                        return;
                                    case 1:
                                        bpVar2.a0(1, true);
                                        return;
                                    default:
                                        bpVar2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final bp bpVar3 = this.f52076b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        bpVar3.a0(2, true);
                                        return;
                                    case 1:
                                        bpVar3.a0(1, true);
                                        return;
                                    default:
                                        bpVar3.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.D.setOnClickListener(new View.OnClickListener(this) {
            public final bp f52076b;

            {
                this.f52076b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final bp bpVar = this.f52076b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        bpVar.a0(2, true);
                                        return;
                                    case 1:
                                        bpVar.a0(1, true);
                                        return;
                                    default:
                                        bpVar.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final bp bpVar2 = this.f52076b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        bpVar2.a0(2, true);
                                        return;
                                    case 1:
                                        bpVar2.a0(1, true);
                                        return;
                                    default:
                                        bpVar2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final bp bpVar3 = this.f52076b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        bpVar3.a0(2, true);
                                        return;
                                    case 1:
                                        bpVar3.a0(1, true);
                                        return;
                                    default:
                                        bpVar3.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        org.telegram.ui.Cells.i6 i6Var4 = this.f44102x;
        int i7 = org.telegram.ui.ActionBar.m6.f27890d6;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.ActionBar.t6.Q(i6Var4, org.telegram.ui.ActionBar.m6.i0(x02, org.telegram.ui.ActionBar.m6.x0(null, i10, false)), org.telegram.ui.ActionBar.t6.M(i7), org.telegram.ui.ActionBar.t6.M(i10), null);
        org.telegram.ui.ActionBar.t6.Q(this.f44103y, org.telegram.ui.ActionBar.m6.i0(org.telegram.ui.ActionBar.m6.x0(null, i7, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false)), org.telegram.ui.ActionBar.t6.M(i7), org.telegram.ui.ActionBar.t6.M(i10), null);
        org.telegram.ui.ActionBar.t6.Q(this.D, org.telegram.ui.ActionBar.m6.i0(org.telegram.ui.ActionBar.m6.x0(null, i7, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false)), org.telegram.ui.ActionBar.t6.M(i7), org.telegram.ui.ActionBar.t6.M(i10), null);
        a0(this.f44101w, false);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f44097f = pj0Var;
        pj0Var.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var2 = this.f44097f;
        ap apVar = new ap(this, context);
        this.h = apVar;
        pj0Var2.setAdapter(apVar);
        this.f44097f.setOnItemClickListener(new h(this, 5));
        frameLayout.addView(this.f44097f, c8.ha.g());
        this.f44097f.r1();
        this.f44097f.setSectionsDrawBackground(true);
        this.f44096e = frameLayout;
        this.fragmentView = frameLayout;
        this.h.f();
        return this.f44096e;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i7 == org.telegram.messenger.qs.V4) {
                ArrayList arrayList = this.f44098n;
                arrayList.clear();
                arrayList.addAll(getMediaDataController().f25832n);
                this.h.f();
            } else if (i7 == org.telegram.messenger.qs.f25116y1 && ((Long) objArr[0]).longValue() == (-this.f44095c)) {
                org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
                if (r4Var != null && r4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f44097f;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(3, this), org.telegram.ui.ActionBar.m6.f27890d6, org.telegram.ui.ActionBar.m6.G6, org.telegram.ui.ActionBar.m6.f28300z6, org.telegram.ui.ActionBar.m6.f27982i6, org.telegram.ui.ActionBar.m6.f27834a7, org.telegram.ui.ActionBar.m6.B6, org.telegram.ui.ActionBar.m6.f28111p7, org.telegram.ui.ActionBar.m6.f27928f6, org.telegram.ui.ActionBar.m6.f27945g6, org.telegram.ui.ActionBar.m6.O6, org.telegram.ui.ActionBar.m6.P6, org.telegram.ui.ActionBar.m6.Q6, org.telegram.ui.ActionBar.m6.R6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qp messagesController = getMessagesController();
        long j3 = this.f44095c;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        this.f44093a = M0;
        if (M0 == null) {
            TLRPC.Chat P = org.telegram.messenger.yr.a0(this.currentAccount).P(j3);
            this.f44093a = P;
            if (P != null) {
                getMessagesController().Q3(this.f44093a, true);
                if (this.f44094b == null) {
                    TLRPC.ChatFull F0 = org.telegram.messenger.yr.a0(this.currentAccount).F0(this.f44095c, org.telegram.messenger.t3.T(this.f44093a), new CountDownLatch(1), false, false, 0);
                    this.f44094b = F0;
                    if (F0 == null) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        getNotificationCenter().c(this, org.telegram.messenger.qs.V4);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25116y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qp messagesController = getMessagesController();
        int i7 = this.f44100s;
        ArrayList arrayList = this.d;
        messagesController.getClass();
        TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        long j3 = this.f44095c;
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
        messagesController.getConnectionsManager().sendRequest(tL_messages_setChatAvailableReactions, new org.telegram.messenger.oj(messagesController, j3, tL_messages_setChatAvailableReactions, 4));
        getNotificationCenter().n(this, org.telegram.messenger.qs.V4);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25116y1);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
