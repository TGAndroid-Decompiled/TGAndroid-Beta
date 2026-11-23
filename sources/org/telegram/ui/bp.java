package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class bp extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public org.telegram.ui.Cells.i6 E;
    public final ArrayList F;
    public TLRPC.Chat f46467a;
    public TLRPC.ChatFull f46468b;
    public final long f46469c;
    public ArrayList d;
    public FrameLayout f46470e;
    public org.telegram.ui.Components.ek0 f46471f;
    public ap h;
    public final ArrayList f46472n;
    public LinearLayout f46473r;
    public int f46474s;
    public int f46475w;
    public org.telegram.ui.Cells.i6 f46476x;
    public org.telegram.ui.Cells.i6 f46477y;

    public bp(Bundle bundle) {
        super(bundle);
        this.d = new ArrayList();
        this.f46472n = new ArrayList();
        this.f46474s = -1;
        this.F = new ArrayList();
        this.f46469c = bundle.getLong("chat_id", 0L);
    }

    public final void a0(int i7, boolean z10) {
        if (this.f46474s != i7) {
            this.f46474s = i7;
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
            ArrayList arrayList2 = this.f46472n;
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
                ap apVar = this.h;
                if (apVar != null && z10) {
                    apVar.o(2, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                ap apVar2 = this.h;
                if (apVar2 != null && z10) {
                    apVar2.p(2, arrayList2.size() + 1);
                }
            }
            ap apVar3 = this.h;
            if (apVar3 != null && z10) {
                apVar3.g(1);
            }
            ap apVar4 = this.h;
            if (apVar4 != null && !z10) {
                apVar4.f();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746191, null));
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setActionBarMenuOnItemClick(new y7(this, 10));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46472n.addAll(getMediaDataController().f26726n);
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context);
        o4Var.setText(org.telegram.messenger.gd.N0(2131753756, null));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46473r = linearLayout;
        linearLayout.setOrientation(1);
        this.f46473r.setClickable(true);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
        this.f46476x = i6Var;
        i6Var.c(org.telegram.messenger.gd.N0(2131754288, null), false, true);
        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, null);
        this.f46477y = i6Var2;
        i6Var2.c(org.telegram.messenger.gd.N0(2131745096, null), false, true);
        org.telegram.ui.Cells.i6 i6Var3 = new org.telegram.ui.Cells.i6(context, null);
        this.E = i6Var3;
        i6Var3.c(org.telegram.messenger.gd.N0(2131747982, null), false, false);
        this.f46473r.addView(o4Var, c8.na.o(-1, -2));
        this.f46473r.addView(this.f46476x, c8.na.o(-1, -2));
        this.f46473r.addView(this.f46477y, c8.na.o(-1, -2));
        this.f46473r.addView(this.E, c8.na.o(-1, -2));
        ArrayList arrayList = this.F;
        arrayList.clear();
        arrayList.add(this.f46476x);
        arrayList.add(this.f46477y);
        arrayList.add(this.E);
        this.f46476x.setOnClickListener(new View.OnClickListener(this) {
            public final bp f54406b;

            {
                this.f54406b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final bp bpVar = this.f54406b;
                        org.telegram.messenger.g0.g3(new Runnable() {
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
                        final bp bpVar2 = this.f54406b;
                        org.telegram.messenger.g0.g3(new Runnable() {
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
                        final bp bpVar3 = this.f54406b;
                        org.telegram.messenger.g0.g3(new Runnable() {
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
        this.f46477y.setOnClickListener(new View.OnClickListener(this) {
            public final bp f54406b;

            {
                this.f54406b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final bp bpVar = this.f54406b;
                        org.telegram.messenger.g0.g3(new Runnable() {
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
                        final bp bpVar2 = this.f54406b;
                        org.telegram.messenger.g0.g3(new Runnable() {
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
                        final bp bpVar3 = this.f54406b;
                        org.telegram.messenger.g0.g3(new Runnable() {
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
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final bp f54406b;

            {
                this.f54406b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final bp bpVar = this.f54406b;
                        org.telegram.messenger.g0.g3(new Runnable() {
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
                        final bp bpVar2 = this.f54406b;
                        org.telegram.messenger.g0.g3(new Runnable() {
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
                        final bp bpVar3 = this.f54406b;
                        org.telegram.messenger.g0.g3(new Runnable() {
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
        org.telegram.ui.Cells.i6 i6Var4 = this.f46476x;
        int i7 = org.telegram.ui.ActionBar.n6.f29451d6;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.ActionBar.u6.Q(i6Var4, org.telegram.ui.ActionBar.n6.i0(x02, org.telegram.ui.ActionBar.n6.x0(null, i10, false)), org.telegram.ui.ActionBar.u6.M(i7), org.telegram.ui.ActionBar.u6.M(i10), null);
        org.telegram.ui.ActionBar.u6.Q(this.f46477y, org.telegram.ui.ActionBar.n6.i0(org.telegram.ui.ActionBar.n6.x0(null, i7, false), org.telegram.ui.ActionBar.n6.x0(null, i10, false)), org.telegram.ui.ActionBar.u6.M(i7), org.telegram.ui.ActionBar.u6.M(i10), null);
        org.telegram.ui.ActionBar.u6.Q(this.E, org.telegram.ui.ActionBar.n6.i0(org.telegram.ui.ActionBar.n6.x0(null, i7, false), org.telegram.ui.ActionBar.n6.x0(null, i10, false)), org.telegram.ui.ActionBar.u6.M(i7), org.telegram.ui.ActionBar.u6.M(i10), null);
        a0(this.f46475w, false);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f46471f = ek0Var;
        ek0Var.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ek0 ek0Var2 = this.f46471f;
        ap apVar = new ap(this, context);
        this.h = apVar;
        ek0Var2.setAdapter(apVar);
        this.f46471f.setOnItemClickListener(new h(this, 5));
        frameLayout.addView(this.f46471f, c8.na.g());
        this.f46471f.r1();
        this.f46471f.setSectionsDrawBackground(true);
        this.f46470e = frameLayout;
        this.fragmentView = frameLayout;
        this.h.f();
        return this.f46470e;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i7 == org.telegram.messenger.ks.Y4) {
                ArrayList arrayList = this.f46472n;
                arrayList.clear();
                arrayList.addAll(getMediaDataController().f26726n);
                this.h.f();
            } else if (i7 == org.telegram.messenger.ks.f25325y1 && ((Long) objArr[0]).longValue() == (-this.f46469c)) {
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
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f46471f;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.ta.a(new g6(3, this), org.telegram.ui.ActionBar.n6.f29451d6, org.telegram.ui.ActionBar.n6.G6, org.telegram.ui.ActionBar.n6.f29862z6, org.telegram.ui.ActionBar.n6.f29543i6, org.telegram.ui.ActionBar.n6.f29394a7, org.telegram.ui.ActionBar.n6.B6, org.telegram.ui.ActionBar.n6.f29672p7, org.telegram.ui.ActionBar.n6.f29489f6, org.telegram.ui.ActionBar.n6.f29506g6, org.telegram.ui.ActionBar.n6.O6, org.telegram.ui.ActionBar.n6.P6, org.telegram.ui.ActionBar.n6.Q6, org.telegram.ui.ActionBar.n6.R6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.f46469c;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        this.f46467a = O0;
        if (O0 == null) {
            TLRPC.Chat P = org.telegram.messenger.tr.a0(this.currentAccount).P(j3);
            this.f46467a = P;
            if (P != null) {
                getMessagesController().X3(this.f46467a, true);
                if (this.f46468b == null) {
                    TLRPC.ChatFull F0 = org.telegram.messenger.tr.a0(this.currentAccount).F0(this.f46469c, org.telegram.messenger.v3.T(this.f46467a), new CountDownLatch(1), false, false, 0);
                    this.f46468b = F0;
                    if (F0 == null) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        getNotificationCenter().c(this, org.telegram.messenger.ks.Y4);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25325y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.mp messagesController = getMessagesController();
        int i7 = this.f46474s;
        ArrayList arrayList = this.d;
        messagesController.getClass();
        TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        long j3 = this.f46469c;
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
        getNotificationCenter().n(this, org.telegram.messenger.ks.Y4);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25325y1);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
