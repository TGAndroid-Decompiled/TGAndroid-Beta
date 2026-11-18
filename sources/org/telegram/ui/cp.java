package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class cp extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public org.telegram.ui.Cells.i6 E;
    public final ArrayList F;
    public TLRPC.Chat f46597a;
    public TLRPC.ChatFull f46598b;
    public final long f46599c;
    public ArrayList d;
    public FrameLayout f46600e;
    public org.telegram.ui.Components.ck0 f46601f;
    public bp h;
    public final ArrayList f46602n;
    public LinearLayout f46603r;
    public int f46604s;
    public int f46605w;
    public org.telegram.ui.Cells.i6 f46606x;
    public org.telegram.ui.Cells.i6 f46607y;

    public cp(Bundle bundle) {
        super(bundle);
        this.d = new ArrayList();
        this.f46602n = new ArrayList();
        this.f46604s = -1;
        this.F = new ArrayList();
        this.f46599c = bundle.getLong("chat_id", 0L);
    }

    public final void a0(int i7, boolean z10) {
        if (this.f46604s != i7) {
            this.f46604s = i7;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.F;
                boolean z11 = true;
                if (i10 >= arrayList.size()) {
                    break;
                }
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) arrayList.get(i10);
                if (i7 != i10) {
                    z11 = false;
                }
                i6Var.a(z11, z10);
                i10++;
            }
            ArrayList arrayList2 = this.f46602n;
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
                bp bpVar = this.h;
                if (bpVar != null && z10) {
                    bpVar.o(2, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                bp bpVar2 = this.h;
                if (bpVar2 != null && z10) {
                    bpVar2.p(2, arrayList2.size() + 1);
                }
            }
            bp bpVar3 = this.h;
            if (bpVar3 != null && z10) {
                bpVar3.g(1);
            }
            bp bpVar4 = this.h;
            if (bpVar4 != null && !z10) {
                bpVar4.f();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131746192, null));
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, 10));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46602n.addAll(getMediaDataController().f26627n);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        n4Var.setText(org.telegram.messenger.gd.M0(2131753757, null));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46603r = linearLayout;
        linearLayout.setOrientation(1);
        this.f46603r.setClickable(true);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
        this.f46606x = i6Var;
        i6Var.c(org.telegram.messenger.gd.M0(2131754289, null), false, true);
        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, null);
        this.f46607y = i6Var2;
        i6Var2.c(org.telegram.messenger.gd.M0(2131745097, null), false, true);
        org.telegram.ui.Cells.i6 i6Var3 = new org.telegram.ui.Cells.i6(context, null);
        this.E = i6Var3;
        i6Var3.c(org.telegram.messenger.gd.M0(2131747983, null), false, false);
        this.f46603r.addView(n4Var, c8.ma.o(-1, -2));
        this.f46603r.addView(this.f46606x, c8.ma.o(-1, -2));
        this.f46603r.addView(this.f46607y, c8.ma.o(-1, -2));
        this.f46603r.addView(this.E, c8.ma.o(-1, -2));
        ArrayList arrayList = this.F;
        arrayList.clear();
        arrayList.add(this.f46606x);
        arrayList.add(this.f46607y);
        arrayList.add(this.E);
        this.f46606x.setOnClickListener(new View.OnClickListener(this) {
            public final cp f54561b;

            {
                this.f54561b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final cp cpVar = this.f54561b;
                        org.telegram.messenger.g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        cpVar.a0(2, true);
                                        return;
                                    case 1:
                                        cpVar.a0(1, true);
                                        return;
                                    default:
                                        cpVar.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final cp cpVar2 = this.f54561b;
                        org.telegram.messenger.g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        cpVar2.a0(2, true);
                                        return;
                                    case 1:
                                        cpVar2.a0(1, true);
                                        return;
                                    default:
                                        cpVar2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final cp cpVar3 = this.f54561b;
                        org.telegram.messenger.g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        cpVar3.a0(2, true);
                                        return;
                                    case 1:
                                        cpVar3.a0(1, true);
                                        return;
                                    default:
                                        cpVar3.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f46607y.setOnClickListener(new View.OnClickListener(this) {
            public final cp f54561b;

            {
                this.f54561b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final cp cpVar = this.f54561b;
                        org.telegram.messenger.g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        cpVar.a0(2, true);
                                        return;
                                    case 1:
                                        cpVar.a0(1, true);
                                        return;
                                    default:
                                        cpVar.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final cp cpVar2 = this.f54561b;
                        org.telegram.messenger.g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        cpVar2.a0(2, true);
                                        return;
                                    case 1:
                                        cpVar2.a0(1, true);
                                        return;
                                    default:
                                        cpVar2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final cp cpVar3 = this.f54561b;
                        org.telegram.messenger.g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        cpVar3.a0(2, true);
                                        return;
                                    case 1:
                                        cpVar3.a0(1, true);
                                        return;
                                    default:
                                        cpVar3.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final cp f54561b;

            {
                this.f54561b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final cp cpVar = this.f54561b;
                        org.telegram.messenger.g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        cpVar.a0(2, true);
                                        return;
                                    case 1:
                                        cpVar.a0(1, true);
                                        return;
                                    default:
                                        cpVar.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final cp cpVar2 = this.f54561b;
                        org.telegram.messenger.g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        cpVar2.a0(2, true);
                                        return;
                                    case 1:
                                        cpVar2.a0(1, true);
                                        return;
                                    default:
                                        cpVar2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final cp cpVar3 = this.f54561b;
                        org.telegram.messenger.g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        cpVar3.a0(2, true);
                                        return;
                                    case 1:
                                        cpVar3.a0(1, true);
                                        return;
                                    default:
                                        cpVar3.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        org.telegram.ui.Cells.i6 i6Var4 = this.f46606x;
        int i7 = org.telegram.ui.ActionBar.n6.f29396d6;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.n6.f29488i6;
        org.telegram.ui.ActionBar.u6.Q(i6Var4, org.telegram.ui.ActionBar.n6.i0(x02, org.telegram.ui.ActionBar.n6.x0(null, i10, false)), org.telegram.ui.ActionBar.u6.M(i7), org.telegram.ui.ActionBar.u6.M(i10), null);
        org.telegram.ui.ActionBar.u6.Q(this.f46607y, org.telegram.ui.ActionBar.n6.i0(org.telegram.ui.ActionBar.n6.x0(null, i7, false), org.telegram.ui.ActionBar.n6.x0(null, i10, false)), org.telegram.ui.ActionBar.u6.M(i7), org.telegram.ui.ActionBar.u6.M(i10), null);
        org.telegram.ui.ActionBar.u6.Q(this.E, org.telegram.ui.ActionBar.n6.i0(org.telegram.ui.ActionBar.n6.x0(null, i7, false), org.telegram.ui.ActionBar.n6.x0(null, i10, false)), org.telegram.ui.ActionBar.u6.M(i7), org.telegram.ui.ActionBar.u6.M(i10), null);
        a0(this.f46605w, false);
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f46601f = ck0Var;
        ck0Var.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ck0 ck0Var2 = this.f46601f;
        bp bpVar = new bp(this, context);
        this.h = bpVar;
        ck0Var2.setAdapter(bpVar);
        this.f46601f.setOnItemClickListener(new h(this, 5));
        frameLayout.addView(this.f46601f, c8.ma.g());
        this.f46601f.r1();
        this.f46601f.setSectionsDrawBackground(true);
        this.f46600e = frameLayout;
        this.fragmentView = frameLayout;
        this.h.f();
        return this.f46600e;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i7 == org.telegram.messenger.ks.X4) {
                ArrayList arrayList = this.f46602n;
                arrayList.clear();
                arrayList.addAll(getMediaDataController().f26627n);
                this.h.f();
            } else if (i7 == org.telegram.messenger.ks.f25228y1 && ((Long) objArr[0]).longValue() == (-this.f46599c)) {
                org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
                if (s4Var != null && s4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f46601f;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.sa.a(new f6(3, this), org.telegram.ui.ActionBar.n6.f29396d6, org.telegram.ui.ActionBar.n6.G6, org.telegram.ui.ActionBar.n6.f29807z6, org.telegram.ui.ActionBar.n6.f29488i6, org.telegram.ui.ActionBar.n6.f29339a7, org.telegram.ui.ActionBar.n6.B6, org.telegram.ui.ActionBar.n6.f29617p7, org.telegram.ui.ActionBar.n6.f29434f6, org.telegram.ui.ActionBar.n6.f29451g6, org.telegram.ui.ActionBar.n6.O6, org.telegram.ui.ActionBar.n6.P6, org.telegram.ui.ActionBar.n6.Q6, org.telegram.ui.ActionBar.n6.R6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.f46599c;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        this.f46597a = O0;
        if (O0 == null) {
            TLRPC.Chat P = org.telegram.messenger.tr.a0(this.currentAccount).P(j3);
            this.f46597a = P;
            if (P != null) {
                getMessagesController().X3(this.f46597a, true);
                if (this.f46598b == null) {
                    TLRPC.ChatFull F0 = org.telegram.messenger.tr.a0(this.currentAccount).F0(this.f46599c, org.telegram.messenger.v3.T(this.f46597a), new CountDownLatch(1), false, false, 0);
                    this.f46598b = F0;
                    if (F0 == null) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        getNotificationCenter().c(this, org.telegram.messenger.ks.X4);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25228y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.mp messagesController = getMessagesController();
        int i7 = this.f46604s;
        ArrayList arrayList = this.d;
        messagesController.getClass();
        TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        long j3 = this.f46599c;
        tL_messages_setChatAvailableReactions.peer = messagesController.l1(-j3);
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
        messagesController.getConnectionsManager().sendRequest(tL_messages_setChatAvailableReactions, new org.telegram.messenger.go(messagesController, j3, tL_messages_setChatAvailableReactions, 4));
        getNotificationCenter().n(this, org.telegram.messenger.ks.X4);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25228y1);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
