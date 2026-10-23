package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.nd1;
public final class s31 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ne.d {
    public static final int f30181f0 = 0;
    public final ImageView E;
    public final FrameLayout F;
    public final h31 G;
    public long H;
    public long I;
    public final ne.b J;
    public dh.d K;
    public dh.d L;
    public float M;
    public float N;
    public org.telegram.ui.ke O;
    public boolean P;
    public boolean Q;
    public float R;
    public boolean S;
    public Boolean T;
    public ValueAnimator U;
    public long V;
    public boolean W;
    public final ne.b f30182a;
    public Utilities.Callback2 f30183a0;
    public final int f30184b;
    public Runnable f30185b0;
    public final long f30186c;
    public Utilities.Callback2 f30187c0;
    public final org.telegram.ui.ActionBar.d6 d;
    public boolean f30188d0;
    public final boolean e;
    public final HashSet f30189e0;
    public final boolean f30190f;
    public final org.telegram.ui.qn h;
    public final boolean f30191n;
    public final FrameLayout f30192r;
    public final f31 f30193s;
    public final r31 v;
    public final ImageView f30194w;
    public final ImageView f30195x;
    public final ImageView f30196y;

    public s31(Activity activity, org.telegram.ui.qn qnVar, int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        FrameLayout frameLayout;
        float f7;
        int i11;
        boolean z10;
        bs bsVar = bs.h;
        this.f30182a = new ne.b(0, this, bsVar, 380L, true);
        this.J = new ne.b(0, new z21(this), bsVar, 320L, false);
        this.R = 0.0f;
        this.f30189e0 = new HashSet();
        this.h = qnVar;
        this.f30184b = i10;
        this.f30186c = j10;
        this.d = d6Var;
        long j11 = -j10;
        this.e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        this.f30190f = isBotForumWithEditableTopics;
        this.f30191n = !org.telegram.messenger.g0.v("topics_end_reached_", j11, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.f30192r = frameLayout2;
        addView(frameLayout2, w7.z5.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.F = frameLayout3;
        addView(frameLayout3, w7.z5.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        f31 f31Var = new f31(this, activity, i10, new Utilities.Callback2(this) {
            public final s31 f25710b;

            {
                this.f25710b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z11;
                boolean z12;
                int i12;
                boolean z13;
                long j12;
                long j13;
                boolean z14;
                TopicsController topicsController;
                boolean z15;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                boolean z16;
                boolean z17;
                int i13 = r2;
                s31 s31Var = this.f25710b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        u61 u61Var = (u61) obj2;
                        boolean z18 = s31Var.f30190f;
                        int i14 = s31Var.f30184b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = s31Var.f30186c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = s31Var.e;
                        int i15 = l31.f28016a;
                        h61 J = h61.J(l31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f26791q = z19;
                        if (s31Var.V == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        J.K(z11);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z20 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z18) {
                                    i12 = i17;
                                    if (tL_forumTopic2.f20332id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (s31Var.f30189e0.contains(Integer.valueOf(tL_forumTopic2.f20332id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((h61) i2.e.h(1, arrayList)).f26798y |= 8;
                                        }
                                        u61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        u61Var.M();
                                        z20 = true;
                                    }
                                    h61 J2 = h61.J(l31.class);
                                    J2.f26797x = j17;
                                    J2.d = tL_forumTopic2.f20332id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = s31Var.V;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20332id;
                                    }
                                    if (j12 == j13) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    J2.K(z14);
                                    arrayList.add(J2);
                                    size = i18;
                                    i16 = i12;
                                    z20 = z13;
                                }
                            }
                            z12 = z20;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            u61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && s31Var.f30191n) {
                            h61 J3 = h61.J(l31.class);
                            J3.d = -2;
                            J3.f26792r = true;
                            arrayList.add(J3);
                            h61 J4 = h61.J(l31.class);
                            J4.d = -3;
                            J4.f26792r = true;
                            arrayList.add(J4);
                            h61 J5 = h61.J(l31.class);
                            J5.d = -4;
                            J5.f26792r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                h61 J6 = h61.J(l31.class);
                                J6.d = -2;
                                J6.B = -2L;
                                J6.G = null;
                                arrayList.add(J6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ((Integer) obj).getClass();
                        s31.b(s31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        u61 u61Var2 = (u61) obj2;
                        boolean z22 = s31Var.e;
                        int i19 = s31Var.f30184b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = s31Var.f30186c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = s31Var.f30190f;
                        if (!z23) {
                            int i20 = q31.f29475a;
                            h61 J7 = h61.J(q31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f26791q = z22;
                            J7.f26798y = z23 ? 1 : 0;
                            if (s31Var.V == 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            J7.K(z17);
                            arrayList2.add(J7);
                        } else {
                            topicsController = topicsController3;
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z15 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z23) {
                                    user = user3;
                                    if (tL_forumTopic4.f20332id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (s31Var.f30189e0.contains(Integer.valueOf(tL_forumTopic4.f20332id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        u61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        u61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = q31.f29475a;
                                    h61 J8 = h61.J(q31.class);
                                    J8.f26797x = j20;
                                    J8.d = tL_forumTopic4.f20332id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = s31Var.V;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20332id;
                                    }
                                    if (j15 == j16) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    J8.K(z16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z15) {
                            u61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && s31Var.f30191n) {
                            int i24 = q31.f29475a;
                            h61 J9 = h61.J(q31.class);
                            J9.d = -2;
                            J9.f26792r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            h61 J10 = h61.J(q31.class);
                            J10.d = -3;
                            J10.f26792r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            h61 J11 = h61.J(q31.class);
                            J11.d = -4;
                            J11.f26792r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = q31.f29475a;
                                h61 J12 = h61.J(q31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f26791q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new z21(this), new z21(this), d6Var);
        this.f30193s = f31Var;
        f31Var.C1(new Utilities.Callback2(this) {
            public final s31 f25710b;

            {
                this.f25710b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z11;
                boolean z12;
                int i12;
                boolean z13;
                long j12;
                long j13;
                boolean z14;
                TopicsController topicsController;
                boolean z15;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                boolean z16;
                boolean z17;
                int i13 = r2;
                s31 s31Var = this.f25710b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        u61 u61Var = (u61) obj2;
                        boolean z18 = s31Var.f30190f;
                        int i14 = s31Var.f30184b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = s31Var.f30186c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = s31Var.e;
                        int i15 = l31.f28016a;
                        h61 J = h61.J(l31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f26791q = z19;
                        if (s31Var.V == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        J.K(z11);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z20 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z18) {
                                    i12 = i17;
                                    if (tL_forumTopic2.f20332id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (s31Var.f30189e0.contains(Integer.valueOf(tL_forumTopic2.f20332id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((h61) i2.e.h(1, arrayList)).f26798y |= 8;
                                        }
                                        u61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        u61Var.M();
                                        z20 = true;
                                    }
                                    h61 J2 = h61.J(l31.class);
                                    J2.f26797x = j17;
                                    J2.d = tL_forumTopic2.f20332id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = s31Var.V;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20332id;
                                    }
                                    if (j12 == j13) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    J2.K(z14);
                                    arrayList.add(J2);
                                    size = i18;
                                    i16 = i12;
                                    z20 = z13;
                                }
                            }
                            z12 = z20;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            u61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && s31Var.f30191n) {
                            h61 J3 = h61.J(l31.class);
                            J3.d = -2;
                            J3.f26792r = true;
                            arrayList.add(J3);
                            h61 J4 = h61.J(l31.class);
                            J4.d = -3;
                            J4.f26792r = true;
                            arrayList.add(J4);
                            h61 J5 = h61.J(l31.class);
                            J5.d = -4;
                            J5.f26792r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                h61 J6 = h61.J(l31.class);
                                J6.d = -2;
                                J6.B = -2L;
                                J6.G = null;
                                arrayList.add(J6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ((Integer) obj).getClass();
                        s31.b(s31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        u61 u61Var2 = (u61) obj2;
                        boolean z22 = s31Var.e;
                        int i19 = s31Var.f30184b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = s31Var.f30186c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = s31Var.f30190f;
                        if (!z23) {
                            int i20 = q31.f29475a;
                            h61 J7 = h61.J(q31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f26791q = z22;
                            J7.f26798y = z23 ? 1 : 0;
                            if (s31Var.V == 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            J7.K(z17);
                            arrayList2.add(J7);
                        } else {
                            topicsController = topicsController3;
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z15 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z23) {
                                    user = user3;
                                    if (tL_forumTopic4.f20332id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (s31Var.f30189e0.contains(Integer.valueOf(tL_forumTopic4.f20332id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        u61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        u61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = q31.f29475a;
                                    h61 J8 = h61.J(q31.class);
                                    J8.f26797x = j20;
                                    J8.d = tL_forumTopic4.f20332id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = s31Var.V;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20332id;
                                    }
                                    if (j15 == j16) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    J8.K(z16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z15) {
                            u61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && s31Var.f30191n) {
                            int i24 = q31.f29475a;
                            h61 J9 = h61.J(q31.class);
                            J9.d = -2;
                            J9.f26792r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            h61 J10 = h61.J(q31.class);
                            J10.d = -3;
                            J10.f26792r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            h61 J11 = h61.J(q31.class);
                            J11.d = -4;
                            J11.f26792r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = q31.f29475a;
                                h61 J12 = h61.J(q31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f26791q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        f31Var.setWillNotDraw(false);
        f31Var.W2.f30865r = false;
        f31Var.getContext();
        hg.i0 i0Var = new hg.i0((ViewGroup) f31Var, 5);
        f31Var.V2 = i0Var;
        f31Var.setLayoutManager(i0Var);
        frameLayout2.addView(f31Var, w7.z5.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        f31Var.j(new g31(this, 0));
        if (isBotForumWithEditableTopics) {
            r31 r31Var = new r31(activity, i10, d6Var);
            this.v = r31Var;
            if (this.V == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            r31Var.c(true, false, z10);
            r31Var.setOnClickListener(new View.OnClickListener(this) {
                public final s31 f25100b;

                {
                    this.f25100b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            s31 s31Var = this.f25100b;
                            Boolean bool = s31Var.T;
                            boolean z11 = false;
                            if (bool == null ? !s31Var.Q : !bool.booleanValue()) {
                                z11 = true;
                            }
                            s31Var.d(z11);
                            return;
                        case 1:
                            s31 s31Var2 = this.f25100b;
                            h31 h31Var = s31Var2.G;
                            h31Var.x1(false);
                            f31 f31Var2 = s31Var2.f30193s;
                            f31Var2.x1(false);
                            s31Var2.J.a(false, true);
                            AndroidUtilities.updateVisibleRows(h31Var);
                            AndroidUtilities.updateVisibleRows(f31Var2);
                            return;
                        default:
                            this.f25100b.f30183a0.run(0, Boolean.FALSE);
                            return;
                    }
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(r31Var, w7.z5.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            frameLayout = frameLayout3;
            this.v = null;
        }
        ViewGroup viewGroup = frameLayout;
        h31 h31Var = new h31(activity, i10, new Utilities.Callback2(this) {
            public final s31 f25710b;

            {
                this.f25710b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z11;
                boolean z12;
                int i12;
                boolean z13;
                long j12;
                long j13;
                boolean z14;
                TopicsController topicsController;
                boolean z15;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                boolean z16;
                boolean z17;
                int i13 = r2;
                s31 s31Var = this.f25710b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        u61 u61Var = (u61) obj2;
                        boolean z18 = s31Var.f30190f;
                        int i14 = s31Var.f30184b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = s31Var.f30186c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = s31Var.e;
                        int i15 = l31.f28016a;
                        h61 J = h61.J(l31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f26791q = z19;
                        if (s31Var.V == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        J.K(z11);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z20 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z18) {
                                    i12 = i17;
                                    if (tL_forumTopic2.f20332id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (s31Var.f30189e0.contains(Integer.valueOf(tL_forumTopic2.f20332id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((h61) i2.e.h(1, arrayList)).f26798y |= 8;
                                        }
                                        u61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        u61Var.M();
                                        z20 = true;
                                    }
                                    h61 J2 = h61.J(l31.class);
                                    J2.f26797x = j17;
                                    J2.d = tL_forumTopic2.f20332id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = s31Var.V;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20332id;
                                    }
                                    if (j12 == j13) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    J2.K(z14);
                                    arrayList.add(J2);
                                    size = i18;
                                    i16 = i12;
                                    z20 = z13;
                                }
                            }
                            z12 = z20;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            u61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && s31Var.f30191n) {
                            h61 J3 = h61.J(l31.class);
                            J3.d = -2;
                            J3.f26792r = true;
                            arrayList.add(J3);
                            h61 J4 = h61.J(l31.class);
                            J4.d = -3;
                            J4.f26792r = true;
                            arrayList.add(J4);
                            h61 J5 = h61.J(l31.class);
                            J5.d = -4;
                            J5.f26792r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                h61 J6 = h61.J(l31.class);
                                J6.d = -2;
                                J6.B = -2L;
                                J6.G = null;
                                arrayList.add(J6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ((Integer) obj).getClass();
                        s31.b(s31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        u61 u61Var2 = (u61) obj2;
                        boolean z22 = s31Var.e;
                        int i19 = s31Var.f30184b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = s31Var.f30186c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = s31Var.f30190f;
                        if (!z23) {
                            int i20 = q31.f29475a;
                            h61 J7 = h61.J(q31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f26791q = z22;
                            J7.f26798y = z23 ? 1 : 0;
                            if (s31Var.V == 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            J7.K(z17);
                            arrayList2.add(J7);
                        } else {
                            topicsController = topicsController3;
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z15 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z23) {
                                    user = user3;
                                    if (tL_forumTopic4.f20332id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (s31Var.f30189e0.contains(Integer.valueOf(tL_forumTopic4.f20332id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        u61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        u61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = q31.f29475a;
                                    h61 J8 = h61.J(q31.class);
                                    J8.f26797x = j20;
                                    J8.d = tL_forumTopic4.f20332id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = s31Var.V;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20332id;
                                    }
                                    if (j15 == j16) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    J8.K(z16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z15) {
                            u61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && s31Var.f30191n) {
                            int i24 = q31.f29475a;
                            h61 J9 = h61.J(q31.class);
                            J9.d = -2;
                            J9.f26792r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            h61 J10 = h61.J(q31.class);
                            J10.d = -3;
                            J10.f26792r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            h61 J11 = h61.J(q31.class);
                            J11.d = -4;
                            J11.f26792r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = q31.f29475a;
                                h61 J12 = h61.J(q31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f26791q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new z21(this), new z21(this), d6Var);
        this.G = h31Var;
        h31Var.C1(new Utilities.Callback2(this) {
            public final s31 f25710b;

            {
                this.f25710b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z11;
                boolean z12;
                int i12;
                boolean z13;
                long j12;
                long j13;
                boolean z14;
                TopicsController topicsController;
                boolean z15;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                boolean z16;
                boolean z17;
                int i13 = r2;
                s31 s31Var = this.f25710b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        u61 u61Var = (u61) obj2;
                        boolean z18 = s31Var.f30190f;
                        int i14 = s31Var.f30184b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = s31Var.f30186c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = s31Var.e;
                        int i15 = l31.f28016a;
                        h61 J = h61.J(l31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f26791q = z19;
                        if (s31Var.V == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        J.K(z11);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z20 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z18) {
                                    i12 = i17;
                                    if (tL_forumTopic2.f20332id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (s31Var.f30189e0.contains(Integer.valueOf(tL_forumTopic2.f20332id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((h61) i2.e.h(1, arrayList)).f26798y |= 8;
                                        }
                                        u61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        u61Var.M();
                                        z20 = true;
                                    }
                                    h61 J2 = h61.J(l31.class);
                                    J2.f26797x = j17;
                                    J2.d = tL_forumTopic2.f20332id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = s31Var.V;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20332id;
                                    }
                                    if (j12 == j13) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    J2.K(z14);
                                    arrayList.add(J2);
                                    size = i18;
                                    i16 = i12;
                                    z20 = z13;
                                }
                            }
                            z12 = z20;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            u61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && s31Var.f30191n) {
                            h61 J3 = h61.J(l31.class);
                            J3.d = -2;
                            J3.f26792r = true;
                            arrayList.add(J3);
                            h61 J4 = h61.J(l31.class);
                            J4.d = -3;
                            J4.f26792r = true;
                            arrayList.add(J4);
                            h61 J5 = h61.J(l31.class);
                            J5.d = -4;
                            J5.f26792r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                h61 J6 = h61.J(l31.class);
                                J6.d = -2;
                                J6.B = -2L;
                                J6.G = null;
                                arrayList.add(J6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ((Integer) obj).getClass();
                        s31.b(s31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        u61 u61Var2 = (u61) obj2;
                        boolean z22 = s31Var.e;
                        int i19 = s31Var.f30184b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = s31Var.f30186c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = s31Var.f30190f;
                        if (!z23) {
                            int i20 = q31.f29475a;
                            h61 J7 = h61.J(q31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f26791q = z22;
                            J7.f26798y = z23 ? 1 : 0;
                            if (s31Var.V == 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            J7.K(z17);
                            arrayList2.add(J7);
                        } else {
                            topicsController = topicsController3;
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z15 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z23) {
                                    user = user3;
                                    if (tL_forumTopic4.f20332id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (s31Var.f30189e0.contains(Integer.valueOf(tL_forumTopic4.f20332id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        u61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        u61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = q31.f29475a;
                                    h61 J8 = h61.J(q31.class);
                                    J8.f26797x = j20;
                                    J8.d = tL_forumTopic4.f20332id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = s31Var.V;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20332id;
                                    }
                                    if (j15 == j16) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    J8.K(z16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z15) {
                            u61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && s31Var.f30191n) {
                            int i24 = q31.f29475a;
                            h61 J9 = h61.J(q31.class);
                            J9.d = -2;
                            J9.f26792r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            h61 J10 = h61.J(q31.class);
                            J10.d = -3;
                            J10.f26792r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            h61 J11 = h61.J(q31.class);
                            J11.d = -4;
                            J11.f26792r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = q31.f29475a;
                                h61 J12 = h61.J(q31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f26791q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        h31Var.W2.f30865r = false;
        h31Var.setClipToPadding(false);
        h31Var.setClipChildren(false);
        if (isBotForumWithEditableTopics) {
            f7 = 90.0f;
        } else {
            f7 = 48.0f;
        }
        viewGroup.addView(h31Var, w7.z5.d(-1, -1.0f, 119, 0.0f, f7, 0.0f, 0.0f));
        h31Var.j(new g31(this, 1));
        ImageView i12 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final s31 f25100b;

            {
                this.f25100b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s31 s31Var = this.f25100b;
                        Boolean bool = s31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !s31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        s31Var.d(z11);
                        return;
                    case 1:
                        s31 s31Var2 = this.f25100b;
                        h31 h31Var2 = s31Var2.G;
                        h31Var2.x1(false);
                        f31 f31Var2 = s31Var2.f30193s;
                        f31Var2.x1(false);
                        s31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(h31Var2);
                        AndroidUtilities.updateVisibleRows(f31Var2);
                        return;
                    default:
                        this.f25100b.f30183a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f30196y = i12;
        ImageView i13 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final s31 f25100b;

            {
                this.f25100b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s31 s31Var = this.f25100b;
                        Boolean bool = s31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !s31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        s31Var.d(z11);
                        return;
                    case 1:
                        s31 s31Var2 = this.f25100b;
                        h31 h31Var2 = s31Var2.G;
                        h31Var2.x1(false);
                        f31 f31Var2 = s31Var2.f30193s;
                        f31Var2.x1(false);
                        s31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(h31Var2);
                        AndroidUtilities.updateVisibleRows(f31Var2);
                        return;
                    default:
                        this.f25100b.f30183a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.E = i13;
        frameLayout2.addView(i12, w7.z5.e(44, 36, 51));
        viewGroup.addView(i13, w7.z5.e(64, 48, 51));
        ImageView i14 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final s31 f25100b;

            {
                this.f25100b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s31 s31Var = this.f25100b;
                        Boolean bool = s31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !s31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        s31Var.d(z11);
                        return;
                    case 1:
                        s31 s31Var2 = this.f25100b;
                        h31 h31Var2 = s31Var2.G;
                        h31Var2.x1(false);
                        f31 f31Var2 = s31Var2.f30193s;
                        f31Var2.x1(false);
                        s31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(h31Var2);
                        AndroidUtilities.updateVisibleRows(f31Var2);
                        return;
                    default:
                        this.f25100b.f30183a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f30194w = i14;
        ImageView i15 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final s31 f25100b;

            {
                this.f25100b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s31 s31Var = this.f25100b;
                        Boolean bool = s31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !s31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        s31Var.d(z11);
                        return;
                    case 1:
                        s31 s31Var2 = this.f25100b;
                        h31 h31Var2 = s31Var2.G;
                        h31Var2.x1(false);
                        f31 f31Var2 = s31Var2.f30193s;
                        f31Var2.x1(false);
                        s31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(h31Var2);
                        AndroidUtilities.updateVisibleRows(f31Var2);
                        return;
                    default:
                        this.f25100b.f30183a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f30195x = i15;
        frameLayout2.addView(i14, w7.z5.e(44, 36, 51));
        viewGroup.addView(i15, w7.z5.e(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j11, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.g0.v("topicssidetabs", j10, mainSettings, false)) {
            this.R = 1.0f;
            this.Q = true;
        }
        boolean v = org.telegram.messenger.g0.v("topicssidetabsb", j10, mainSettings, false);
        this.P = v;
        if (v) {
            i11 = R.drawable.menu_sidebar_top;
        } else {
            i11 = R.drawable.menu_sidebar_bottom;
        }
        i13.setImageResource(i11);
        f(false);
        g();
        n();
        o();
    }

    public static void a(s31 s31Var, h61 h61Var) {
        if (s31Var.e) {
            Utilities.Callback2 callback2 = s31Var.f30187c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(h61Var.B), Boolean.FALSE);
            }
        } else if (h61Var.B == -2) {
            Runnable runnable = s31Var.f30185b0;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            Utilities.Callback2 callback22 = s31Var.f30183a0;
            if (callback22 != null) {
                callback22.run(Integer.valueOf(h61Var.d), Boolean.FALSE);
            }
        }
    }

    public static void b(s31 s31Var, ArrayList arrayList) {
        long j10 = s31Var.f30186c;
        TopicsController topicsController = MessagesController.getInstance(s31Var.f30184b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = com.google.android.gms.internal.play_billing.k3.f(((h61) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j11 = -j10;
        topicsController.reorderPinnedTopics(j11, arrayList2);
        topicsController.sortTopics(j11, false);
    }

    public static boolean c(final s31 s31Var, h61 h61Var, View view) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10;
        int i11;
        TLRPC.Chat chat2;
        final s31 s31Var2;
        boolean z10;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i12;
        int i13;
        int i14;
        byte b10;
        int i15;
        ?? r11;
        final i80 i80Var;
        int i16;
        int i17;
        i80 i80Var2;
        org.telegram.ui.ActionBar.d6 d6Var2 = s31Var.d;
        org.telegram.ui.qn qnVar = s31Var.h;
        long j10 = s31Var.f30186c;
        int i18 = s31Var.f30184b;
        if (s31Var.G.f25122a3 || s31Var.f30193s.f25122a3) {
            return false;
        }
        Object obj = h61Var.G;
        if (!(obj instanceof TLRPC.TL_forumTopic)) {
            return false;
        }
        final TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
        MessagesController messagesController = MessagesController.getInstance(i18);
        int i19 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i19 < 0) {
            chat = messagesController.getChat(Long.valueOf(-j10));
        } else {
            chat = null;
        }
        if (i19 > 0) {
            user = messagesController.getUser(Long.valueOf(j10));
        } else {
            user = null;
        }
        final i80 I = i80.I(qnVar, view);
        if (ChatObject.isMonoForum(chat)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i18, chat)) {
                return false;
            }
            TLRPC.Chat chat3 = chat;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new ai.c3(s31Var, I, peerDialogId, chat, 17), false);
            long j11 = chat3.f20280id;
            if (ChatObject.isMonoForum(chat3) && ChatObject.canManageMonoForum(i18, chat3)) {
                long j12 = chat3.linked_monoforum_id;
                if (j12 != 0) {
                    j11 = j12;
                }
            }
            TLRPC.Chat chat4 = MessagesController.getInstance(i18).getChat(Long.valueOf(j11));
            TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(peerDialogId));
            if (user2 != null && ChatObject.canBlockUsers(chat4)) {
                I.c(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), null, false);
                org.telegram.ui.ActionBar.e1 y3 = I.y();
                i14 = 8;
                y3.setVisibility(8);
                MessagesController messagesController2 = MessagesController.getInstance(i18);
                ai.c4 c4Var = new ai.c4(s31Var, y3, I, j11, user2, chat4);
                i80Var2 = I;
                messagesController2.checkIsInChat(true, chat4, user2, c4Var);
            } else {
                i80Var2 = I;
                i14 = 8;
            }
            i80Var = i80Var2;
            d6Var = d6Var2;
            r11 = 1;
            i15 = 2;
            b10 = 0;
        } else {
            TLRPC.Chat chat5 = chat;
            if (!ChatObject.canManageTopics(chat5) && !UserObject.isBotForumWithEditableTopics(user)) {
                s31Var2 = s31Var;
                chat2 = chat5;
            } else {
                boolean z11 = tL_forumTopic.pinned;
                if (z11) {
                    i10 = R.drawable.msg_unpin;
                } else {
                    i10 = R.drawable.msg_pin;
                }
                if (z11) {
                    i11 = R.string.DialogUnpin;
                } else {
                    i11 = R.string.DialogPin;
                }
                CharSequence string = LocaleController.getString(i11);
                chat2 = chat5;
                s31Var2 = s31Var;
                Runnable i90Var = new i90(s31Var2, I, messagesController, tL_forumTopic, 9);
                I = I;
                messagesController = messagesController;
                tL_forumTopic = tL_forumTopic;
                I.c(i10, string, i90Var, false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new a31(s31Var2, 0), false);
                }
            }
            if (!ChatObject.canManageTopics(chat2) && !UserObject.isBotForumWithEditableTopics(user)) {
                z10 = false;
            } else {
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(s31Var2) {
                    public final s31 f24798b;

                    {
                        this.f24798b = s31Var2;
                    }

                    @Override
                    public final void run() {
                        boolean z12;
                        int i20 = r4;
                        s31 s31Var3 = this.f24798b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        i80 i80Var3 = I;
                        switch (i20) {
                            case 0:
                                i80Var3.u();
                                s31Var3.h.presentFragment(nd1.a0(-s31Var3.f30186c, tL_forumTopic2.f20332id));
                                return;
                            case 1:
                                s31Var3.getClass();
                                i80Var3.u();
                                MessagesController.getInstance(s31Var3.f30184b).getTopicsController().toggleCloseTopic(-s31Var3.f30186c, tL_forumTopic2.f20332id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                i80Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f20332id));
                                rc rcVar = new rc(18);
                                s31 s31Var4 = this.f24798b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = s31Var4.V;
                                if (hashSet.size() == 1) {
                                    z12 = false;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(s31Var4.f30184b).getTopicsController().findTopic(-s31Var4.f30186c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z12 = false;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ai.r4(s31Var4, arrayList, j13, hashSet, rcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ug0(14));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21232q7, z12));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                z10 = false;
            }
            long j13 = s31Var2.f30186c;
            long j14 = tL_forumTopic.f20332id;
            int currentAccount = qnVar.getCurrentAccount();
            org.telegram.ui.ActionBar.d6 resourceProvider = qnVar.getResourceProvider();
            i80 i80Var3 = I;
            uo uoVar = new uo(i80Var3, currentAccount, j13, j14, qnVar, resourceProvider);
            i80 J = i80Var3.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.st0(i80Var3, 26), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.hc(i80Var3, currentAccount, j13, j14, J, qnVar, resourceProvider), false);
            org.telegram.ui.ActionBar.e1 y10 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new ai.cb(i80Var3, resourceProvider, currentAccount, uoVar, 18), false);
            d6Var = d6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new org.telegram.messenger.x2(i80Var3, j13, j14, qnVar, resourceProvider, 7), false);
            J.c(0, "", new ai.ia(i80Var3, currentAccount, j13, j14, qnVar, resourceProvider), false);
            new org.telegram.messenger.r9(currentAccount, j13, j14, J.y(), y10).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j10, tL_forumTopic.f20332id);
            if (isDialogMuted) {
                i12 = R.drawable.msg_unmute;
            } else {
                i12 = R.drawable.msg_mute;
            }
            int i20 = i12;
            if (isDialogMuted) {
                i13 = R.string.Unmute;
            } else {
                i13 = R.string.Mute;
            }
            CharSequence string2 = LocaleController.getString(i13);
            i14 = 8;
            b10 = 0;
            i15 = 2;
            r11 = 1;
            r11 = 1;
            Runnable g30Var = new g30(s31Var, messagesController, tL_forumTopic, i80Var3, J, 3);
            i80Var = i80Var3;
            i80Var.c(i20, string2, g30Var, false);
            TLRPC.Chat chat6 = chat2;
            if (ChatObject.canManageTopic(i18, chat6, tL_forumTopic) && !UserObject.isBotForum(user)) {
                boolean z12 = tL_forumTopic.closed;
                if (z12) {
                    i16 = R.drawable.msg_topic_restart;
                } else {
                    i16 = R.drawable.msg_topic_close;
                }
                if (z12) {
                    i17 = R.string.RestartTopic;
                } else {
                    i17 = R.string.CloseTopic;
                }
                i80Var.c(i16, LocaleController.getString(i17), new Runnable(s31Var) {
                    public final s31 f24798b;

                    {
                        this.f24798b = s31Var;
                    }

                    @Override
                    public final void run() {
                        boolean z122;
                        int i202 = r4;
                        s31 s31Var3 = this.f24798b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        i80 i80Var32 = i80Var;
                        switch (i202) {
                            case 0:
                                i80Var32.u();
                                s31Var3.h.presentFragment(nd1.a0(-s31Var3.f30186c, tL_forumTopic2.f20332id));
                                return;
                            case 1:
                                s31Var3.getClass();
                                i80Var32.u();
                                MessagesController.getInstance(s31Var3.f30184b).getTopicsController().toggleCloseTopic(-s31Var3.f30186c, tL_forumTopic2.f20332id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                i80Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f20332id));
                                rc rcVar = new rc(18);
                                s31 s31Var4 = this.f24798b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = s31Var4.V;
                                if (hashSet.size() == 1) {
                                    z122 = false;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(s31Var4.f30184b).getTopicsController().findTopic(-s31Var4.f30186c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z122 = false;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ai.r4(s31Var4, arrayList, j132, hashSet, rcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ug0(14));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21232q7, z122));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            if (ChatObject.canDeleteTopic(i18, chat6, tL_forumTopic)) {
                i80Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1), new Runnable(s31Var) {
                    public final s31 f24798b;

                    {
                        this.f24798b = s31Var;
                    }

                    @Override
                    public final void run() {
                        boolean z122;
                        int i202 = r4;
                        s31 s31Var3 = this.f24798b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        i80 i80Var32 = i80Var;
                        switch (i202) {
                            case 0:
                                i80Var32.u();
                                s31Var3.h.presentFragment(nd1.a0(-s31Var3.f30186c, tL_forumTopic2.f20332id));
                                return;
                            case 1:
                                s31Var3.getClass();
                                i80Var32.u();
                                MessagesController.getInstance(s31Var3.f30184b).getTopicsController().toggleCloseTopic(-s31Var3.f30186c, tL_forumTopic2.f20332id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                i80Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f20332id));
                                rc rcVar = new rc(18);
                                s31 s31Var4 = this.f24798b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = s31Var4.V;
                                if (hashSet.size() == 1) {
                                    z122 = false;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(s31Var4.f30184b).getTopicsController().findTopic(-s31Var4.f30186c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z122 = false;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ai.r4(s31Var4, arrayList, j132, hashSet, rcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ug0(14));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21232q7, z122));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
        }
        if (view instanceof m31) {
            jw jwVar = new jw(i15, b10);
            Paint paint = new Paint((int) r11);
            jwVar.f27667c = paint;
            jwVar.f27666b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, d6Var));
            i80Var.W(jwVar);
            i80Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20994d6, d6Var);
            float f7 = b10;
            float f10 = dp;
            float f11 = dp2;
            float[] fArr = new float[i14];
            fArr[b10] = f7;
            fArr[r11] = f7;
            fArr[i15] = f10;
            fArr[3] = f10;
            fArr[4] = f11;
            fArr[5] = f11;
            fArr[6] = f7;
            fArr[7] = f7;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(w02);
            i80Var.W(shapeDrawable);
        }
        i80Var.Z();
        return r11;
    }

    public static ImageView i(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        w7.b6.a(imageView);
        return imageView;
    }

    private void setAttached(boolean z10) {
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        long j10 = this.f30186c;
        int i10 = this.f30184b;
        if (z10) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
            MessagesController.getInstance(i10).getTopicsController().onTopicFragmentResume(-j10);
            return;
        }
        MessagesController.getInstance(i10).getTopicsController().onTopicFragmentPause(-j10);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
    }

    public final void d(boolean z10) {
        float f7;
        if (this.Q == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.S) {
                this.T = Boolean.valueOf(z10);
                return;
            }
        }
        if (!z10) {
            this.P = !this.P;
        }
        this.Q = z10;
        this.S = true;
        float f10 = this.R;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.U = ofFloat;
        ofFloat.addUpdateListener(new b80(this, 29));
        this.U.addListener(new i31(this, z10));
        this.U.setInterpolator(li.m.V);
        this.U.setDuration(250L);
        this.U.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.topicsDidLoaded;
        long j10 = this.f30186c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == (-j10)) {
                o();
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
            MessagesController.getInstance(this.f30184b).getTopicsController().sortTopics(-j10, false);
            o();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.F;
        if (frameLayout.getVisibility() == 0) {
            this.K.setBounds((int) frameLayout.getTranslationX(), (int) this.N, (int) (frameLayout.getTranslationX() + AndroidUtilities.dp(78.0f)), (int) (getMeasuredHeight() - this.M));
            this.K.draw(canvas);
        }
        FrameLayout frameLayout2 = this.f30192r;
        if (frameLayout2.getVisibility() == 0) {
            this.L.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.L.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + AndroidUtilities.dp(50.0f)));
            this.L.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        canvas.save();
        if (view == this.F) {
            canvas.clipPath(this.K.f8014j.f8003k);
        }
        if (view == this.f30192r) {
            canvas.clipPath(this.L.f8014j.f8003k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        FrameLayout frameLayout = this.F;
        int paddingBottom = frameLayout.getPaddingBottom();
        int round = Math.round(this.M + this.N);
        if (paddingBottom == round) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, round);
    }

    public final void f(boolean z10) {
        boolean z11;
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f30184b).getTopicsController().getTopics(-this.f30186c);
        if (topics != null && !topics.isEmpty() && !this.f30188d0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f30182a.a(z11, z10);
    }

    public final void g() {
        int i10;
        int i11;
        int i12;
        ne.b bVar = this.J;
        float f7 = bVar.e;
        ImageView imageView = this.f30194w;
        imageView.setAlpha(f7);
        imageView.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        imageView.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        int i13 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        int i14 = 8;
        if (i13 > 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = this.f30195x;
        imageView2.setAlpha(f7);
        imageView2.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        imageView2.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        if (i13 > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView2.setVisibility(i11);
        float f10 = 1.0f - bVar.e;
        ImageView imageView3 = this.f30196y;
        imageView3.setAlpha(f10);
        imageView3.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView3.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        int i15 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i15 > 0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView3.setVisibility(i12);
        ImageView imageView4 = this.E;
        imageView4.setAlpha(f10);
        imageView4.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView4.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        if (i15 > 0) {
            i14 = 0;
        }
        imageView4.setVisibility(i14);
    }

    public n31 getCurrentTabsPosition() {
        if (this.Q) {
            return n31.f28684b;
        }
        if (this.P) {
            return n31.f28685c;
        }
        return n31.f28683a;
    }

    public float getSideMenuT() {
        return this.R * this.f30182a.e;
    }

    public final void h() {
        int i10;
        float lerp = AndroidUtilities.lerp(1.0f, 0.0f, this.R);
        FrameLayout frameLayout = this.f30192r;
        frameLayout.setAlpha(lerp);
        if ((1.0f - this.R) * this.f30182a.e > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        if (this.P) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.M) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, j(n31.f28685c)));
        } else {
            frameLayout.setTranslationY(this.N + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, j(n31.f28683a)));
        }
    }

    public final float j(n31 n31Var) {
        float f7;
        float f10 = this.f30182a.e;
        if (n31Var == n31.f28684b) {
            f7 = this.R;
        } else if ((n31Var == n31.f28683a && !this.P) || (n31Var == n31.f28685c && this.P)) {
            f7 = 1.0f - this.R;
        } else {
            return 0.0f;
        }
        return f7 * f10;
    }

    public final boolean k() {
        if (this.R > 0.5f) {
            int i10 = 0;
            while (true) {
                h31 h31Var = this.G;
                if (i10 >= h31Var.getChildCount()) {
                    break;
                }
                h61 G = h31Var.W2.G(RecyclerView.R(h31Var.getChildAt(i10)));
                if (G == null || !G.f26792r) {
                    i10++;
                } else {
                    return true;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                f31 f31Var = this.f30193s;
                if (i11 >= f31Var.getChildCount()) {
                    break;
                }
                h61 G2 = f31Var.W2.G(RecyclerView.R(f31Var.getChildAt(i11)));
                if (G2 != null && G2.f26792r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void l() {
        TopicsController topicsController = MessagesController.getInstance(this.f30184b).getTopicsController();
        long j10 = this.f30186c;
        if (!topicsController.endIsReached(-j10)) {
            topicsController.loadTopics(-j10);
        }
    }

    public final void m(long j10, boolean z10) {
        if (this.e) {
            Utilities.Callback2 callback2 = this.f30187c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.f30183a0;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j10), Boolean.valueOf(z10));
        }
    }

    public final void n() {
        org.telegram.ui.ke keVar = this.O;
        if (keVar != null) {
            keVar.run();
        }
        h();
        float j10 = j(n31.f28684b);
        int i10 = 0;
        FrameLayout frameLayout = this.F;
        frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, j10));
        if (j10 <= 0.0f) {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        int i11 = org.telegram.ui.ActionBar.h6.f21399z6;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        int f7 = i0.a.f(1.0f - this.R, w02, org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f30196y.setColorFilter(new PorterDuffColorFilter(f7, mode));
        this.E.setColorFilter(new PorterDuffColorFilter(i0.a.f(this.R, org.telegram.ui.ActionBar.h6.w0(i11, d6Var), org.telegram.ui.ActionBar.h6.w0(i12, d6Var)), mode));
        this.f30194w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), mode));
        this.f30195x.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), mode));
        invalidate();
    }

    public final void o() {
        f(true);
        f31 f31Var = this.f30193s;
        boolean canScrollHorizontally = f31Var.canScrollHorizontally(-1);
        f31Var.W2.N(true);
        if (!canScrollHorizontally) {
            f31Var.u0(0);
        }
        h31 h31Var = this.G;
        boolean canScrollVertically = h31Var.canScrollVertically(-1);
        h31Var.W2.N(true);
        if (!canScrollVertically) {
            h31Var.u0(0);
        }
        AndroidUtilities.runOnUIThread(new a31(this, 1));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAttached(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        h();
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        n();
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.f30188d0 != z10) {
            this.f30188d0 = z10;
            f(true);
        }
    }

    public void setCurrentTopic(long j10) {
        boolean z10;
        this.V = j10;
        f31 f31Var = this.f30193s;
        f31Var.W2.N(true);
        f31Var.invalidate();
        this.G.W2.N(true);
        r31 r31Var = this.v;
        if (r31Var != null) {
            if (j10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            r31Var.c(true, false, z10);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.f30187c0 = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.f30185b0 = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.f30183a0 = callback2;
    }

    public void setSideMenuBackgroundDrawable(dh.d dVar) {
        this.K = dVar;
        dVar.q(AndroidUtilities.dp(16.0f));
        this.K.p(AndroidUtilities.dp(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f7) {
        this.M = f7;
        h();
        e();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f7) {
        this.N = f7;
        this.F.setTranslationY(f7);
        h();
        e();
        invalidate();
    }

    public void setTopMenuBackgroundDrawable(dh.d dVar) {
        this.L = dVar;
        dVar.q(AndroidUtilities.dp(18.0f));
        this.L.p(AndroidUtilities.dp(7.0f));
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
