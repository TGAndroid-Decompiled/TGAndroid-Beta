package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class bp extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public org.telegram.ui.Cells.j6 E;
    public final ArrayList F;
    public TLRPC.Chat f46248a;
    public TLRPC.ChatFull f46249b;
    public final long f46250c;
    public ArrayList d;
    public FrameLayout f46251e;
    public org.telegram.ui.Components.ek0 f46252f;
    public ap h;
    public final ArrayList f46253n;
    public LinearLayout f46254r;
    public int f46255s;
    public int f46256w;
    public org.telegram.ui.Cells.j6 f46257x;
    public org.telegram.ui.Cells.j6 f46258y;

    public bp(Bundle bundle) {
        super(bundle);
        this.d = new ArrayList();
        this.f46253n = new ArrayList();
        this.f46255s = -1;
        this.F = new ArrayList();
        this.f46250c = bundle.getLong("chat_id", 0L);
    }

    public final void a0(int i7, boolean z10) {
        if (this.f46255s != i7) {
            this.f46255s = i7;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.F;
                boolean z11 = true;
                if (i10 >= arrayList.size()) {
                    break;
                }
                org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) arrayList.get(i10);
                if (i7 != i10) {
                    z11 = false;
                }
                j6Var.a(z11, z10);
                i10++;
            }
            ArrayList arrayList2 = this.f46253n;
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
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131746191, null));
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, 10));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46253n.addAll(getMediaDataController().f26803n);
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context);
        o4Var.setText(org.telegram.messenger.hd.N0(2131753756, null));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46254r = linearLayout;
        linearLayout.setOrientation(1);
        this.f46254r.setClickable(true);
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
        this.f46257x = j6Var;
        j6Var.c(org.telegram.messenger.hd.N0(2131754288, null), false, true);
        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, null);
        this.f46258y = j6Var2;
        j6Var2.c(org.telegram.messenger.hd.N0(2131745096, null), false, true);
        org.telegram.ui.Cells.j6 j6Var3 = new org.telegram.ui.Cells.j6(context, null);
        this.E = j6Var3;
        j6Var3.c(org.telegram.messenger.hd.N0(2131747982, null), false, false);
        this.f46254r.addView(o4Var, c8.na.o(-1, -2));
        this.f46254r.addView(this.f46257x, c8.na.o(-1, -2));
        this.f46254r.addView(this.f46258y, c8.na.o(-1, -2));
        this.f46254r.addView(this.E, c8.na.o(-1, -2));
        ArrayList arrayList = this.F;
        arrayList.clear();
        arrayList.add(this.f46257x);
        arrayList.add(this.f46258y);
        arrayList.add(this.E);
        this.f46257x.setOnClickListener(new View.OnClickListener(this) {
            public final bp f54216b;

            {
                this.f54216b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final bp bpVar = this.f54216b;
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
                        final bp bpVar2 = this.f54216b;
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
                        final bp bpVar3 = this.f54216b;
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
        this.f46258y.setOnClickListener(new View.OnClickListener(this) {
            public final bp f54216b;

            {
                this.f54216b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final bp bpVar = this.f54216b;
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
                        final bp bpVar2 = this.f54216b;
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
                        final bp bpVar3 = this.f54216b;
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
            public final bp f54216b;

            {
                this.f54216b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final bp bpVar = this.f54216b;
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
                        final bp bpVar2 = this.f54216b;
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
                        final bp bpVar3 = this.f54216b;
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
        org.telegram.ui.Cells.j6 j6Var4 = this.f46257x;
        int i7 = org.telegram.ui.ActionBar.m6.f29347d6;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.m6.f29439i6;
        org.telegram.ui.ActionBar.t6.Q(j6Var4, org.telegram.ui.ActionBar.m6.i0(x02, org.telegram.ui.ActionBar.m6.x0(null, i10, false)), org.telegram.ui.ActionBar.t6.M(i7), org.telegram.ui.ActionBar.t6.M(i10), null);
        org.telegram.ui.ActionBar.t6.Q(this.f46258y, org.telegram.ui.ActionBar.m6.i0(org.telegram.ui.ActionBar.m6.x0(null, i7, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false)), org.telegram.ui.ActionBar.t6.M(i7), org.telegram.ui.ActionBar.t6.M(i10), null);
        org.telegram.ui.ActionBar.t6.Q(this.E, org.telegram.ui.ActionBar.m6.i0(org.telegram.ui.ActionBar.m6.x0(null, i7, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false)), org.telegram.ui.ActionBar.t6.M(i7), org.telegram.ui.ActionBar.t6.M(i10), null);
        a0(this.f46256w, false);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f46252f = ek0Var;
        ek0Var.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.ek0 ek0Var2 = this.f46252f;
        ap apVar = new ap(this, context);
        this.h = apVar;
        ek0Var2.setAdapter(apVar);
        this.f46252f.setOnItemClickListener(new h(this, 5));
        frameLayout.addView(this.f46252f, c8.na.g());
        this.f46252f.r1();
        this.f46252f.setSectionsDrawBackground(true);
        this.f46251e = frameLayout;
        this.fragmentView = frameLayout;
        this.h.f();
        return this.f46251e;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i7 == org.telegram.messenger.ls.Y4) {
                ArrayList arrayList = this.f46253n;
                arrayList.clear();
                arrayList.addAll(getMediaDataController().f26803n);
                this.h.f();
            } else if (i7 == org.telegram.messenger.ls.f25384y1 && ((Long) objArr[0]).longValue() == (-this.f46250c)) {
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
        return this.f46252f;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.ta.a(new f6(3, this), org.telegram.ui.ActionBar.m6.f29347d6, org.telegram.ui.ActionBar.m6.G6, org.telegram.ui.ActionBar.m6.f29758z6, org.telegram.ui.ActionBar.m6.f29439i6, org.telegram.ui.ActionBar.m6.f29290a7, org.telegram.ui.ActionBar.m6.B6, org.telegram.ui.ActionBar.m6.f29568p7, org.telegram.ui.ActionBar.m6.f29385f6, org.telegram.ui.ActionBar.m6.f29402g6, org.telegram.ui.ActionBar.m6.O6, org.telegram.ui.ActionBar.m6.P6, org.telegram.ui.ActionBar.m6.Q6, org.telegram.ui.ActionBar.m6.R6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.np messagesController = getMessagesController();
        long j3 = this.f46250c;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        this.f46248a = O0;
        if (O0 == null) {
            TLRPC.Chat P = org.telegram.messenger.ur.a0(this.currentAccount).P(j3);
            this.f46248a = P;
            if (P != null) {
                getMessagesController().X3(this.f46248a, true);
                if (this.f46249b == null) {
                    TLRPC.ChatFull F0 = org.telegram.messenger.ur.a0(this.currentAccount).F0(this.f46250c, org.telegram.messenger.v3.T(this.f46248a), new CountDownLatch(1), false, false, 0);
                    this.f46249b = F0;
                    if (F0 == null) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        getNotificationCenter().c(this, org.telegram.messenger.ls.Y4);
        getNotificationCenter().c(this, org.telegram.messenger.ls.f25384y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.np messagesController = getMessagesController();
        int i7 = this.f46255s;
        ArrayList arrayList = this.d;
        messagesController.getClass();
        TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        long j3 = this.f46250c;
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
        messagesController.getConnectionsManager().sendRequest(tL_messages_setChatAvailableReactions, new org.telegram.messenger.ho(messagesController, j3, tL_messages_setChatAvailableReactions, 4));
        getNotificationCenter().n(this, org.telegram.messenger.ls.Y4);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25384y1);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
