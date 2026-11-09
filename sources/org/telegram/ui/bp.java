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
    public TLRPC.Chat f44085a;
    public TLRPC.ChatFull f44086b;
    public final long f44087c;
    public ArrayList d;
    public FrameLayout f44088e;
    public org.telegram.ui.Components.qj0 f44089f;
    public ap h;
    public final ArrayList f44090n;
    public LinearLayout f44091r;
    public int f44092s;
    public int f44093w;
    public org.telegram.ui.Cells.i6 f44094x;
    public org.telegram.ui.Cells.i6 f44095y;

    public bp(Bundle bundle) {
        super(bundle);
        this.d = new ArrayList();
        this.f44090n = new ArrayList();
        this.f44092s = -1;
        this.E = new ArrayList();
        this.f44087c = bundle.getLong("chat_id", 0L);
    }

    public final void a0(int i7, boolean z9) {
        if (this.f44092s != i7) {
            this.f44092s = i7;
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
            ArrayList arrayList2 = this.f44090n;
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
        this.f44090n.addAll(getMediaDataController().f25828n);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        n4Var.setText(org.telegram.messenger.id.M0(2131753759, null));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44091r = linearLayout;
        linearLayout.setOrientation(1);
        this.f44091r.setClickable(true);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
        this.f44094x = i6Var;
        i6Var.c(org.telegram.messenger.id.M0(2131754291, null), false, true);
        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, null);
        this.f44095y = i6Var2;
        i6Var2.c(org.telegram.messenger.id.M0(2131745292, null), false, true);
        org.telegram.ui.Cells.i6 i6Var3 = new org.telegram.ui.Cells.i6(context, null);
        this.D = i6Var3;
        i6Var3.c(org.telegram.messenger.id.M0(2131748175, null), false, false);
        this.f44091r.addView(n4Var, c8.ha.o(-1, -2));
        this.f44091r.addView(this.f44094x, c8.ha.o(-1, -2));
        this.f44091r.addView(this.f44095y, c8.ha.o(-1, -2));
        this.f44091r.addView(this.D, c8.ha.o(-1, -2));
        ArrayList arrayList = this.E;
        arrayList.clear();
        arrayList.add(this.f44094x);
        arrayList.add(this.f44095y);
        arrayList.add(this.D);
        this.f44094x.setOnClickListener(new View.OnClickListener(this) {
            public final bp f52148b;

            {
                this.f52148b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final bp bpVar = this.f52148b;
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
                        final bp bpVar2 = this.f52148b;
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
                        final bp bpVar3 = this.f52148b;
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
        this.f44095y.setOnClickListener(new View.OnClickListener(this) {
            public final bp f52148b;

            {
                this.f52148b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final bp bpVar = this.f52148b;
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
                        final bp bpVar2 = this.f52148b;
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
                        final bp bpVar3 = this.f52148b;
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
            public final bp f52148b;

            {
                this.f52148b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final bp bpVar = this.f52148b;
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
                        final bp bpVar2 = this.f52148b;
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
                        final bp bpVar3 = this.f52148b;
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
        org.telegram.ui.Cells.i6 i6Var4 = this.f44094x;
        int i7 = org.telegram.ui.ActionBar.l6.f27865d6;
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.l6.f27957i6;
        org.telegram.ui.ActionBar.s6.Q(i6Var4, org.telegram.ui.ActionBar.l6.i0(x02, org.telegram.ui.ActionBar.l6.x0(null, i10, false)), org.telegram.ui.ActionBar.s6.M(i7), org.telegram.ui.ActionBar.s6.M(i10), null);
        org.telegram.ui.ActionBar.s6.Q(this.f44095y, org.telegram.ui.ActionBar.l6.i0(org.telegram.ui.ActionBar.l6.x0(null, i7, false), org.telegram.ui.ActionBar.l6.x0(null, i10, false)), org.telegram.ui.ActionBar.s6.M(i7), org.telegram.ui.ActionBar.s6.M(i10), null);
        org.telegram.ui.ActionBar.s6.Q(this.D, org.telegram.ui.ActionBar.l6.i0(org.telegram.ui.ActionBar.l6.x0(null, i7, false), org.telegram.ui.ActionBar.l6.x0(null, i10, false)), org.telegram.ui.ActionBar.s6.M(i7), org.telegram.ui.ActionBar.s6.M(i10), null);
        a0(this.f44093w, false);
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.f44089f = qj0Var;
        qj0Var.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.qj0 qj0Var2 = this.f44089f;
        ap apVar = new ap(this, context);
        this.h = apVar;
        qj0Var2.setAdapter(apVar);
        this.f44089f.setOnItemClickListener(new h(this, 5));
        frameLayout.addView(this.f44089f, c8.ha.g());
        this.f44089f.r1();
        this.f44089f.setSectionsDrawBackground(true);
        this.f44088e = frameLayout;
        this.fragmentView = frameLayout;
        this.h.f();
        return this.f44088e;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i7 == org.telegram.messenger.qs.V4) {
                ArrayList arrayList = this.f44090n;
                arrayList.clear();
                arrayList.addAll(getMediaDataController().f25828n);
                this.h.f();
            } else if (i7 == org.telegram.messenger.qs.f25112y1 && ((Long) objArr[0]).longValue() == (-this.f44087c)) {
                org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
                if (q4Var != null && q4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f44089f;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(3, this), org.telegram.ui.ActionBar.l6.f27865d6, org.telegram.ui.ActionBar.l6.G6, org.telegram.ui.ActionBar.l6.f28275z6, org.telegram.ui.ActionBar.l6.f27957i6, org.telegram.ui.ActionBar.l6.f27809a7, org.telegram.ui.ActionBar.l6.B6, org.telegram.ui.ActionBar.l6.f28086p7, org.telegram.ui.ActionBar.l6.f27903f6, org.telegram.ui.ActionBar.l6.f27920g6, org.telegram.ui.ActionBar.l6.O6, org.telegram.ui.ActionBar.l6.P6, org.telegram.ui.ActionBar.l6.Q6, org.telegram.ui.ActionBar.l6.R6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qp messagesController = getMessagesController();
        long j3 = this.f44087c;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        this.f44085a = M0;
        if (M0 == null) {
            TLRPC.Chat P = org.telegram.messenger.yr.a0(this.currentAccount).P(j3);
            this.f44085a = P;
            if (P != null) {
                getMessagesController().Q3(this.f44085a, true);
                if (this.f44086b == null) {
                    TLRPC.ChatFull F0 = org.telegram.messenger.yr.a0(this.currentAccount).F0(this.f44087c, org.telegram.messenger.t3.T(this.f44085a), new CountDownLatch(1), false, false, 0);
                    this.f44086b = F0;
                    if (F0 == null) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        getNotificationCenter().c(this, org.telegram.messenger.qs.V4);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25112y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qp messagesController = getMessagesController();
        int i7 = this.f44092s;
        ArrayList arrayList = this.d;
        messagesController.getClass();
        TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        long j3 = this.f44087c;
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
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25112y1);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
