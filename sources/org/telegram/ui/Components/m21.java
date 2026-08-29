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
import org.telegram.ui.td1;
public final class m21 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, vd.b {
    public static final int f30549b0 = 0;
    public final ImageView A;
    public final FrameLayout B;
    public final c21 C;
    public long D;
    public long E;
    public final vd.a F;
    public ng.d G;
    public ng.d H;
    public float I;
    public float J;
    public org.telegram.ui.ee K;
    public boolean L;
    public boolean M;
    public float N;
    public boolean O;
    public Boolean P;
    public ValueAnimator Q;
    public long R;
    public boolean S;
    public Utilities.Callback2 T;
    public Runnable U;
    public Utilities.Callback2 V;
    public boolean W;
    public final vd.a f30550a;
    public final HashSet f30551a0;
    public final int f30552b;
    public final long f30553c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final boolean f30554e;
    public final boolean f30555f;
    public final org.telegram.ui.tn h;
    public final boolean f30556n;
    public final FrameLayout f30557r;
    public final a21 f30558s;
    public final l21 v;
    public final ImageView f30559w;
    public final ImageView f30560x;
    public final ImageView f30561y;

    public m21(Activity activity, org.telegram.ui.tn tnVar, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        FrameLayout frameLayout;
        float f9;
        int i11;
        boolean z10;
        jr jrVar = jr.h;
        this.f30550a = new vd.a(0, this, jrVar, 380L, true);
        this.F = new vd.a(0, new u11(this), jrVar, 320L, false);
        this.N = 0.0f;
        this.f30551a0 = new HashSet();
        this.h = tnVar;
        this.f30552b = i10;
        this.f30553c = j10;
        this.d = c6Var;
        long j11 = -j10;
        this.f30554e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        this.f30555f = isBotForumWithEditableTopics;
        this.f30556n = !org.telegram.messenger.x3.v("topics_end_reached_", j11, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.f30557r = frameLayout2;
        addView(frameLayout2, i7.f6.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.B = frameLayout3;
        addView(frameLayout3, i7.f6.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        a21 a21Var = new a21(this, activity, i10, new Utilities.Callback2(this) {
            public final m21 f35182b;

            {
                this.f35182b = this;
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
                m21 m21Var = this.f35182b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        k51 k51Var = (k51) obj2;
                        boolean z18 = m21Var.f30555f;
                        int i14 = m21Var.f30552b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = m21Var.f30553c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = m21Var.f30554e;
                        int i15 = g21.f28738a;
                        w41 J = w41.J(g21.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f34305q = z19;
                        if (m21Var.R == 0) {
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
                                    if (tL_forumTopic2.f22444id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (m21Var.f30551a0.contains(Integer.valueOf(tL_forumTopic2.f22444id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((w41) j7.l1.i(1, arrayList)).f34312y |= 8;
                                        }
                                        k51Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        k51Var.M();
                                        z20 = true;
                                    }
                                    w41 J2 = w41.J(g21.class);
                                    J2.f34311x = j17;
                                    J2.d = tL_forumTopic2.f22444id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = m21Var.R;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f22444id;
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
                            k51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && m21Var.f30556n) {
                            w41 J3 = w41.J(g21.class);
                            J3.d = -2;
                            J3.f34306r = true;
                            arrayList.add(J3);
                            w41 J4 = w41.J(g21.class);
                            J4.d = -3;
                            J4.f34306r = true;
                            arrayList.add(J4);
                            w41 J5 = w41.J(g21.class);
                            J5.d = -4;
                            J5.f34306r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                w41 J6 = w41.J(g21.class);
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
                        m21.b(m21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        k51 k51Var2 = (k51) obj2;
                        boolean z22 = m21Var.f30554e;
                        int i19 = m21Var.f30552b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = m21Var.f30553c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = m21Var.f30555f;
                        if (!z23) {
                            int i20 = k21.f29902a;
                            w41 J7 = w41.J(k21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f34305q = z22;
                            J7.f34312y = z23 ? 1 : 0;
                            if (m21Var.R == 0) {
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
                                    if (tL_forumTopic4.f22444id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (m21Var.f30551a0.contains(Integer.valueOf(tL_forumTopic4.f22444id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        k51Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        k51Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = k21.f29902a;
                                    w41 J8 = w41.J(k21.class);
                                    J8.f34311x = j20;
                                    J8.d = tL_forumTopic4.f22444id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = m21Var.R;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f22444id;
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
                            k51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && m21Var.f30556n) {
                            int i24 = k21.f29902a;
                            w41 J9 = w41.J(k21.class);
                            J9.d = -2;
                            J9.f34306r = true;
                            J9.f34294e = false;
                            arrayList2.add(J9);
                            w41 J10 = w41.J(k21.class);
                            J10.d = -3;
                            J10.f34306r = true;
                            J10.f34294e = false;
                            arrayList2.add(J10);
                            w41 J11 = w41.J(k21.class);
                            J11.d = -4;
                            J11.f34306r = true;
                            J11.f34294e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = k21.f29902a;
                                w41 J12 = w41.J(k21.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f34305q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new u11(this), new u11(this), c6Var);
        this.f30558s = a21Var;
        a21Var.B1(new Utilities.Callback2(this) {
            public final m21 f35182b;

            {
                this.f35182b = this;
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
                m21 m21Var = this.f35182b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        k51 k51Var = (k51) obj2;
                        boolean z18 = m21Var.f30555f;
                        int i14 = m21Var.f30552b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = m21Var.f30553c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = m21Var.f30554e;
                        int i15 = g21.f28738a;
                        w41 J = w41.J(g21.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f34305q = z19;
                        if (m21Var.R == 0) {
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
                                    if (tL_forumTopic2.f22444id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (m21Var.f30551a0.contains(Integer.valueOf(tL_forumTopic2.f22444id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((w41) j7.l1.i(1, arrayList)).f34312y |= 8;
                                        }
                                        k51Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        k51Var.M();
                                        z20 = true;
                                    }
                                    w41 J2 = w41.J(g21.class);
                                    J2.f34311x = j17;
                                    J2.d = tL_forumTopic2.f22444id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = m21Var.R;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f22444id;
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
                            k51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && m21Var.f30556n) {
                            w41 J3 = w41.J(g21.class);
                            J3.d = -2;
                            J3.f34306r = true;
                            arrayList.add(J3);
                            w41 J4 = w41.J(g21.class);
                            J4.d = -3;
                            J4.f34306r = true;
                            arrayList.add(J4);
                            w41 J5 = w41.J(g21.class);
                            J5.d = -4;
                            J5.f34306r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                w41 J6 = w41.J(g21.class);
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
                        m21.b(m21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        k51 k51Var2 = (k51) obj2;
                        boolean z22 = m21Var.f30554e;
                        int i19 = m21Var.f30552b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = m21Var.f30553c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = m21Var.f30555f;
                        if (!z23) {
                            int i20 = k21.f29902a;
                            w41 J7 = w41.J(k21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f34305q = z22;
                            J7.f34312y = z23 ? 1 : 0;
                            if (m21Var.R == 0) {
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
                                    if (tL_forumTopic4.f22444id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (m21Var.f30551a0.contains(Integer.valueOf(tL_forumTopic4.f22444id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        k51Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        k51Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = k21.f29902a;
                                    w41 J8 = w41.J(k21.class);
                                    J8.f34311x = j20;
                                    J8.d = tL_forumTopic4.f22444id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = m21Var.R;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f22444id;
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
                            k51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && m21Var.f30556n) {
                            int i24 = k21.f29902a;
                            w41 J9 = w41.J(k21.class);
                            J9.d = -2;
                            J9.f34306r = true;
                            J9.f34294e = false;
                            arrayList2.add(J9);
                            w41 J10 = w41.J(k21.class);
                            J10.d = -3;
                            J10.f34306r = true;
                            J10.f34294e = false;
                            arrayList2.add(J10);
                            w41 J11 = w41.J(k21.class);
                            J11.d = -4;
                            J11.f34306r = true;
                            J11.f34294e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = k21.f29902a;
                                w41 J12 = w41.J(k21.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f34305q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        a21Var.setWillNotDraw(false);
        a21Var.U2.f29939r = false;
        a21Var.getContext();
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq((ViewGroup) a21Var, 4);
        a21Var.T2 = vqVar;
        a21Var.setLayoutManager(vqVar);
        frameLayout2.addView(a21Var, i7.f6.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        a21Var.j(new b21(this, 0));
        if (isBotForumWithEditableTopics) {
            l21 l21Var = new l21(activity, i10, c6Var);
            this.v = l21Var;
            if (this.R == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            l21Var.c(true, false, z10);
            l21Var.setOnClickListener(new View.OnClickListener(this) {
                public final m21 f34552b;

                {
                    this.f34552b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            m21 m21Var = this.f34552b;
                            Boolean bool = m21Var.P;
                            boolean z11 = false;
                            if (bool == null ? !m21Var.M : !bool.booleanValue()) {
                                z11 = true;
                            }
                            m21Var.d(z11);
                            return;
                        case 1:
                            m21 m21Var2 = this.f34552b;
                            c21 c21Var = m21Var2.C;
                            c21Var.w1(false);
                            a21 a21Var2 = m21Var2.f30558s;
                            a21Var2.w1(false);
                            m21Var2.F.a(false, true);
                            AndroidUtilities.updateVisibleRows(c21Var);
                            AndroidUtilities.updateVisibleRows(a21Var2);
                            return;
                        default:
                            this.f34552b.T.run(0, Boolean.FALSE);
                            return;
                    }
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(l21Var, i7.f6.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            frameLayout = frameLayout3;
            this.v = null;
        }
        ViewGroup viewGroup = frameLayout;
        c21 c21Var = new c21(activity, i10, new Utilities.Callback2(this) {
            public final m21 f35182b;

            {
                this.f35182b = this;
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
                m21 m21Var = this.f35182b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        k51 k51Var = (k51) obj2;
                        boolean z18 = m21Var.f30555f;
                        int i14 = m21Var.f30552b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = m21Var.f30553c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = m21Var.f30554e;
                        int i15 = g21.f28738a;
                        w41 J = w41.J(g21.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f34305q = z19;
                        if (m21Var.R == 0) {
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
                                    if (tL_forumTopic2.f22444id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (m21Var.f30551a0.contains(Integer.valueOf(tL_forumTopic2.f22444id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((w41) j7.l1.i(1, arrayList)).f34312y |= 8;
                                        }
                                        k51Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        k51Var.M();
                                        z20 = true;
                                    }
                                    w41 J2 = w41.J(g21.class);
                                    J2.f34311x = j17;
                                    J2.d = tL_forumTopic2.f22444id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = m21Var.R;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f22444id;
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
                            k51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && m21Var.f30556n) {
                            w41 J3 = w41.J(g21.class);
                            J3.d = -2;
                            J3.f34306r = true;
                            arrayList.add(J3);
                            w41 J4 = w41.J(g21.class);
                            J4.d = -3;
                            J4.f34306r = true;
                            arrayList.add(J4);
                            w41 J5 = w41.J(g21.class);
                            J5.d = -4;
                            J5.f34306r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                w41 J6 = w41.J(g21.class);
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
                        m21.b(m21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        k51 k51Var2 = (k51) obj2;
                        boolean z22 = m21Var.f30554e;
                        int i19 = m21Var.f30552b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = m21Var.f30553c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = m21Var.f30555f;
                        if (!z23) {
                            int i20 = k21.f29902a;
                            w41 J7 = w41.J(k21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f34305q = z22;
                            J7.f34312y = z23 ? 1 : 0;
                            if (m21Var.R == 0) {
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
                                    if (tL_forumTopic4.f22444id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (m21Var.f30551a0.contains(Integer.valueOf(tL_forumTopic4.f22444id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        k51Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        k51Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = k21.f29902a;
                                    w41 J8 = w41.J(k21.class);
                                    J8.f34311x = j20;
                                    J8.d = tL_forumTopic4.f22444id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = m21Var.R;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f22444id;
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
                            k51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && m21Var.f30556n) {
                            int i24 = k21.f29902a;
                            w41 J9 = w41.J(k21.class);
                            J9.d = -2;
                            J9.f34306r = true;
                            J9.f34294e = false;
                            arrayList2.add(J9);
                            w41 J10 = w41.J(k21.class);
                            J10.d = -3;
                            J10.f34306r = true;
                            J10.f34294e = false;
                            arrayList2.add(J10);
                            w41 J11 = w41.J(k21.class);
                            J11.d = -4;
                            J11.f34306r = true;
                            J11.f34294e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = k21.f29902a;
                                w41 J12 = w41.J(k21.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f34305q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new u11(this), new u11(this), c6Var);
        this.C = c21Var;
        c21Var.B1(new Utilities.Callback2(this) {
            public final m21 f35182b;

            {
                this.f35182b = this;
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
                m21 m21Var = this.f35182b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        k51 k51Var = (k51) obj2;
                        boolean z18 = m21Var.f30555f;
                        int i14 = m21Var.f30552b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = m21Var.f30553c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = m21Var.f30554e;
                        int i15 = g21.f28738a;
                        w41 J = w41.J(g21.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f34305q = z19;
                        if (m21Var.R == 0) {
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
                                    if (tL_forumTopic2.f22444id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (m21Var.f30551a0.contains(Integer.valueOf(tL_forumTopic2.f22444id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((w41) j7.l1.i(1, arrayList)).f34312y |= 8;
                                        }
                                        k51Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        k51Var.M();
                                        z20 = true;
                                    }
                                    w41 J2 = w41.J(g21.class);
                                    J2.f34311x = j17;
                                    J2.d = tL_forumTopic2.f22444id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = m21Var.R;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f22444id;
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
                            k51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && m21Var.f30556n) {
                            w41 J3 = w41.J(g21.class);
                            J3.d = -2;
                            J3.f34306r = true;
                            arrayList.add(J3);
                            w41 J4 = w41.J(g21.class);
                            J4.d = -3;
                            J4.f34306r = true;
                            arrayList.add(J4);
                            w41 J5 = w41.J(g21.class);
                            J5.d = -4;
                            J5.f34306r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                w41 J6 = w41.J(g21.class);
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
                        m21.b(m21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        k51 k51Var2 = (k51) obj2;
                        boolean z22 = m21Var.f30554e;
                        int i19 = m21Var.f30552b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = m21Var.f30553c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = m21Var.f30555f;
                        if (!z23) {
                            int i20 = k21.f29902a;
                            w41 J7 = w41.J(k21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f34305q = z22;
                            J7.f34312y = z23 ? 1 : 0;
                            if (m21Var.R == 0) {
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
                                    if (tL_forumTopic4.f22444id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (m21Var.f30551a0.contains(Integer.valueOf(tL_forumTopic4.f22444id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        k51Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        k51Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = k21.f29902a;
                                    w41 J8 = w41.J(k21.class);
                                    J8.f34311x = j20;
                                    J8.d = tL_forumTopic4.f22444id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = m21Var.R;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f22444id;
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
                            k51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && m21Var.f30556n) {
                            int i24 = k21.f29902a;
                            w41 J9 = w41.J(k21.class);
                            J9.d = -2;
                            J9.f34306r = true;
                            J9.f34294e = false;
                            arrayList2.add(J9);
                            w41 J10 = w41.J(k21.class);
                            J10.d = -3;
                            J10.f34306r = true;
                            J10.f34294e = false;
                            arrayList2.add(J10);
                            w41 J11 = w41.J(k21.class);
                            J11.d = -4;
                            J11.f34306r = true;
                            J11.f34294e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = k21.f29902a;
                                w41 J12 = w41.J(k21.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f34305q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        c21Var.U2.f29939r = false;
        c21Var.setClipToPadding(false);
        c21Var.setClipChildren(false);
        if (isBotForumWithEditableTopics) {
            f9 = 90.0f;
        } else {
            f9 = 48.0f;
        }
        viewGroup.addView(c21Var, i7.f6.d(-1, -1.0f, 119, 0.0f, f9, 0.0f, 0.0f));
        c21Var.j(new b21(this, 1));
        ImageView i12 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final m21 f34552b;

            {
                this.f34552b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m21 m21Var = this.f34552b;
                        Boolean bool = m21Var.P;
                        boolean z11 = false;
                        if (bool == null ? !m21Var.M : !bool.booleanValue()) {
                            z11 = true;
                        }
                        m21Var.d(z11);
                        return;
                    case 1:
                        m21 m21Var2 = this.f34552b;
                        c21 c21Var2 = m21Var2.C;
                        c21Var2.w1(false);
                        a21 a21Var2 = m21Var2.f30558s;
                        a21Var2.w1(false);
                        m21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(c21Var2);
                        AndroidUtilities.updateVisibleRows(a21Var2);
                        return;
                    default:
                        this.f34552b.T.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f30561y = i12;
        ImageView i13 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final m21 f34552b;

            {
                this.f34552b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m21 m21Var = this.f34552b;
                        Boolean bool = m21Var.P;
                        boolean z11 = false;
                        if (bool == null ? !m21Var.M : !bool.booleanValue()) {
                            z11 = true;
                        }
                        m21Var.d(z11);
                        return;
                    case 1:
                        m21 m21Var2 = this.f34552b;
                        c21 c21Var2 = m21Var2.C;
                        c21Var2.w1(false);
                        a21 a21Var2 = m21Var2.f30558s;
                        a21Var2.w1(false);
                        m21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(c21Var2);
                        AndroidUtilities.updateVisibleRows(a21Var2);
                        return;
                    default:
                        this.f34552b.T.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.A = i13;
        frameLayout2.addView(i12, i7.f6.e(44, 36, 51));
        viewGroup.addView(i13, i7.f6.e(64, 48, 51));
        ImageView i14 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final m21 f34552b;

            {
                this.f34552b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m21 m21Var = this.f34552b;
                        Boolean bool = m21Var.P;
                        boolean z11 = false;
                        if (bool == null ? !m21Var.M : !bool.booleanValue()) {
                            z11 = true;
                        }
                        m21Var.d(z11);
                        return;
                    case 1:
                        m21 m21Var2 = this.f34552b;
                        c21 c21Var2 = m21Var2.C;
                        c21Var2.w1(false);
                        a21 a21Var2 = m21Var2.f30558s;
                        a21Var2.w1(false);
                        m21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(c21Var2);
                        AndroidUtilities.updateVisibleRows(a21Var2);
                        return;
                    default:
                        this.f34552b.T.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f30559w = i14;
        ImageView i15 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final m21 f34552b;

            {
                this.f34552b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m21 m21Var = this.f34552b;
                        Boolean bool = m21Var.P;
                        boolean z11 = false;
                        if (bool == null ? !m21Var.M : !bool.booleanValue()) {
                            z11 = true;
                        }
                        m21Var.d(z11);
                        return;
                    case 1:
                        m21 m21Var2 = this.f34552b;
                        c21 c21Var2 = m21Var2.C;
                        c21Var2.w1(false);
                        a21 a21Var2 = m21Var2.f30558s;
                        a21Var2.w1(false);
                        m21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(c21Var2);
                        AndroidUtilities.updateVisibleRows(a21Var2);
                        return;
                    default:
                        this.f34552b.T.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f30560x = i15;
        frameLayout2.addView(i14, i7.f6.e(44, 36, 51));
        viewGroup.addView(i15, i7.f6.e(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j11, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.x3.v("topicssidetabs", j10, mainSettings, false)) {
            this.N = 1.0f;
            this.M = true;
        }
        boolean v = org.telegram.messenger.x3.v("topicssidetabsb", j10, mainSettings, false);
        this.L = v;
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

    public static void a(m21 m21Var, w41 w41Var) {
        if (m21Var.f30554e) {
            Utilities.Callback2 callback2 = m21Var.V;
            if (callback2 != null) {
                callback2.run(Long.valueOf(w41Var.B), Boolean.FALSE);
            }
        } else if (w41Var.B == -2) {
            Runnable runnable = m21Var.U;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            Utilities.Callback2 callback22 = m21Var.T;
            if (callback22 != null) {
                callback22.run(Integer.valueOf(w41Var.d), Boolean.FALSE);
            }
        }
    }

    public static void b(m21 m21Var, ArrayList arrayList) {
        long j10 = m21Var.f30553c;
        TopicsController topicsController = MessagesController.getInstance(m21Var.f30552b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = org.telegram.ui.th.d(((w41) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j11 = -j10;
        topicsController.reorderPinnedTopics(j11, arrayList2);
        topicsController.sortTopics(j11, false);
    }

    public static boolean c(final m21 m21Var, w41 w41Var, View view) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10;
        int i11;
        TLRPC.Chat chat2;
        final m21 m21Var2;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i12;
        int i13;
        int i14;
        ?? r11;
        byte b10;
        int i15;
        final j70 j70Var;
        int i16;
        int i17;
        j70 j70Var2;
        org.telegram.ui.ActionBar.c6 c6Var2 = m21Var.d;
        org.telegram.ui.tn tnVar = m21Var.h;
        long j10 = m21Var.f30553c;
        int i18 = m21Var.f30552b;
        if (m21Var.C.Y2 || m21Var.f30558s.Y2) {
            return false;
        }
        Object obj = w41Var.G;
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
        final j70 I = j70.I(tnVar, view);
        if (ChatObject.isMonoForum(chat)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i18, chat)) {
                return false;
            }
            TLRPC.Chat chat3 = chat;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new org.telegram.messenger.sg(m21Var, I, peerDialogId, chat, 5), false);
            long j11 = chat3.f22392id;
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
                org.telegram.ui.ActionBar.g1 y8 = I.y();
                i15 = 8;
                y8.setVisibility(8);
                MessagesController messagesController2 = MessagesController.getInstance(i18);
                jh.o2 o2Var = new jh.o2(m21Var, y8, I, j11, user2, chat4);
                j70Var2 = I;
                messagesController2.checkIsInChat(true, chat4, user2, o2Var);
            } else {
                j70Var2 = I;
                i15 = 8;
            }
            j70Var = j70Var2;
            c6Var = c6Var2;
            i14 = 2;
            r11 = 1;
            b10 = 0;
        } else {
            TLRPC.Chat chat5 = chat;
            if (!ChatObject.canManageTopics(chat5) && !UserObject.isBotForumWithEditableTopics(user)) {
                m21Var2 = m21Var;
                chat2 = chat5;
            } else {
                boolean z10 = tL_forumTopic.pinned;
                if (z10) {
                    i10 = R.drawable.msg_unpin;
                } else {
                    i10 = R.drawable.msg_pin;
                }
                if (z10) {
                    i11 = R.string.DialogUnpin;
                } else {
                    i11 = R.string.DialogPin;
                }
                CharSequence string = LocaleController.getString(i11);
                chat2 = chat5;
                m21Var2 = m21Var;
                Runnable ggVar = new org.telegram.ui.gg(m21Var2, I, messagesController, tL_forumTopic, 28);
                I = I;
                messagesController = messagesController;
                tL_forumTopic = tL_forumTopic;
                I.c(i10, string, ggVar, false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new v11(m21Var2, 0), false);
                }
            }
            if (ChatObject.canManageTopics(chat2) || UserObject.isBotForumWithEditableTopics(user)) {
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(m21Var2) {
                    public final m21 f34267b;

                    {
                        this.f34267b = m21Var2;
                    }

                    @Override
                    public final void run() {
                        boolean z11;
                        int i20 = r4;
                        m21 m21Var3 = this.f34267b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        j70 j70Var3 = I;
                        switch (i20) {
                            case 0:
                                j70Var3.u();
                                m21Var3.h.presentFragment(td1.a0(-m21Var3.f30553c, tL_forumTopic2.f22444id));
                                return;
                            case 1:
                                m21Var3.getClass();
                                j70Var3.u();
                                MessagesController.getInstance(m21Var3.f30552b).getTopicsController().toggleCloseTopic(-m21Var3.f30553c, tL_forumTopic2.f22444id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                j70Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f22444id));
                                g5 g5Var = new g5(18);
                                m21 m21Var4 = this.f34267b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                                c2Var.N = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = m21Var4.R;
                                if (hashSet.size() == 1) {
                                    z11 = false;
                                    c2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(m21Var4.f30552b).getTopicsController().findTopic(-m21Var4.f30553c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z11 = false;
                                    c2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jh.b3(m21Var4, arrayList, j13, hashSet, g5Var));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xo0(7));
                                c2Var.show();
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, z11));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            long j13 = m21Var2.f30553c;
            long j14 = tL_forumTopic.f22444id;
            int currentAccount = tnVar.getCurrentAccount();
            org.telegram.ui.ActionBar.c6 resourceProvider = tnVar.getResourceProvider();
            j70 j70Var3 = I;
            eo eoVar = new eo(j70Var3, currentAccount, j13, j14, tnVar, resourceProvider);
            j70 J = j70Var3.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.it0(j70Var3, 25), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.je(j70Var3, currentAccount, j13, j14, J, tnVar, resourceProvider), false);
            org.telegram.ui.ActionBar.g1 y10 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new ag.z1(j70Var3, resourceProvider, currentAccount, eoVar, 16), false);
            c6Var = c6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new eg.t0(j70Var3, j13, j14, tnVar, resourceProvider, 8), false);
            J.c(0, "", new jh.t7(j70Var3, currentAccount, j13, j14, tnVar, resourceProvider), false);
            new org.telegram.messenger.s9(currentAccount, j13, j14, J.y(), y10).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j10, tL_forumTopic.f22444id);
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
            i14 = 2;
            r11 = 1;
            r11 = 1;
            b10 = 0;
            i15 = 8;
            Runnable u20Var = new u20(m21Var, messagesController, tL_forumTopic, j70Var3, J, 3);
            j70Var = j70Var3;
            j70Var.c(i20, string2, u20Var, false);
            TLRPC.Chat chat6 = chat2;
            if (ChatObject.canManageTopic(i18, chat6, tL_forumTopic) && !UserObject.isBotForum(user)) {
                boolean z11 = tL_forumTopic.closed;
                if (z11) {
                    i16 = R.drawable.msg_topic_restart;
                } else {
                    i16 = R.drawable.msg_topic_close;
                }
                if (z11) {
                    i17 = R.string.RestartTopic;
                } else {
                    i17 = R.string.CloseTopic;
                }
                j70Var.c(i16, LocaleController.getString(i17), new Runnable(m21Var) {
                    public final m21 f34267b;

                    {
                        this.f34267b = m21Var;
                    }

                    @Override
                    public final void run() {
                        boolean z112;
                        int i202 = r4;
                        m21 m21Var3 = this.f34267b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        j70 j70Var32 = j70Var;
                        switch (i202) {
                            case 0:
                                j70Var32.u();
                                m21Var3.h.presentFragment(td1.a0(-m21Var3.f30553c, tL_forumTopic2.f22444id));
                                return;
                            case 1:
                                m21Var3.getClass();
                                j70Var32.u();
                                MessagesController.getInstance(m21Var3.f30552b).getTopicsController().toggleCloseTopic(-m21Var3.f30553c, tL_forumTopic2.f22444id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                j70Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f22444id));
                                g5 g5Var = new g5(18);
                                m21 m21Var4 = this.f34267b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                                c2Var.N = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = m21Var4.R;
                                if (hashSet.size() == 1) {
                                    z112 = false;
                                    c2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(m21Var4.f30552b).getTopicsController().findTopic(-m21Var4.f30553c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z112 = false;
                                    c2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jh.b3(m21Var4, arrayList, j132, hashSet, g5Var));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xo0(7));
                                c2Var.show();
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, z112));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            if (ChatObject.canDeleteTopic(i18, chat6, tL_forumTopic)) {
                j70Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1), new Runnable(m21Var) {
                    public final m21 f34267b;

                    {
                        this.f34267b = m21Var;
                    }

                    @Override
                    public final void run() {
                        boolean z112;
                        int i202 = r4;
                        m21 m21Var3 = this.f34267b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        j70 j70Var32 = j70Var;
                        switch (i202) {
                            case 0:
                                j70Var32.u();
                                m21Var3.h.presentFragment(td1.a0(-m21Var3.f30553c, tL_forumTopic2.f22444id));
                                return;
                            case 1:
                                m21Var3.getClass();
                                j70Var32.u();
                                MessagesController.getInstance(m21Var3.f30552b).getTopicsController().toggleCloseTopic(-m21Var3.f30553c, tL_forumTopic2.f22444id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                j70Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f22444id));
                                g5 g5Var = new g5(18);
                                m21 m21Var4 = this.f34267b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                                c2Var.N = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = m21Var4.R;
                                if (hashSet.size() == 1) {
                                    z112 = false;
                                    c2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(m21Var4.f30552b).getTopicsController().findTopic(-m21Var4.f30553c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z112 = false;
                                    c2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jh.b3(m21Var4, arrayList, j132, hashSet, g5Var));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xo0(7));
                                c2Var.show();
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, z112));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
        }
        if (view instanceof h21) {
            sv svVar = new sv(i14, b10);
            Paint paint = new Paint((int) r11);
            svVar.f32723c = paint;
            svVar.f32722b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
            j70Var.W(svVar);
            j70Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var);
            float f9 = b10;
            float f10 = dp;
            float f11 = dp2;
            float[] fArr = new float[i15];
            fArr[b10] = f9;
            fArr[r11] = f9;
            fArr[i14] = f10;
            fArr[3] = f10;
            fArr[4] = f11;
            fArr[5] = f11;
            fArr[6] = f9;
            fArr[7] = f9;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(v02);
            j70Var.W(shapeDrawable);
        }
        j70Var.Z();
        return r11;
    }

    public static ImageView i(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        i7.h6.a(imageView);
        return imageView;
    }

    private void setAttached(boolean z10) {
        if (this.S == z10) {
            return;
        }
        this.S = z10;
        long j10 = this.f30553c;
        int i10 = this.f30552b;
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

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        n();
    }

    public final void d(boolean z10) {
        float f9;
        if (this.M == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.O) {
                this.P = Boolean.valueOf(z10);
                return;
            }
        }
        if (!z10) {
            this.L = !this.L;
        }
        this.M = z10;
        this.O = true;
        float f10 = this.N;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.Q = ofFloat;
        ofFloat.addUpdateListener(new d70(this, 28));
        this.Q.addListener(new d21(this, z10));
        this.Q.setInterpolator(uh.m.V);
        this.Q.setDuration(250L);
        this.Q.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.topicsDidLoaded;
        long j10 = this.f30553c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == (-j10)) {
                o();
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
            MessagesController.getInstance(this.f30552b).getTopicsController().sortTopics(-j10, false);
            o();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.B;
        if (frameLayout.getVisibility() == 0) {
            this.G.setBounds((int) frameLayout.getTranslationX(), (int) this.J, (int) (frameLayout.getTranslationX() + AndroidUtilities.dp(78.0f)), (int) (getMeasuredHeight() - this.I));
            this.G.draw(canvas);
        }
        FrameLayout frameLayout2 = this.f30557r;
        if (frameLayout2.getVisibility() == 0) {
            this.H.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.H.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + AndroidUtilities.dp(50.0f)));
            this.H.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        canvas.save();
        if (view == this.B) {
            canvas.clipPath(this.G.h.f17334k);
        }
        if (view == this.f30557r) {
            canvas.clipPath(this.H.h.f17334k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        FrameLayout frameLayout = this.B;
        int paddingBottom = frameLayout.getPaddingBottom();
        int round = Math.round(this.I + this.J);
        if (paddingBottom == round) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, round);
    }

    public final void f(boolean z10) {
        boolean z11;
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f30552b).getTopicsController().getTopics(-this.f30553c);
        if (topics != null && !topics.isEmpty() && !this.W) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f30550a.a(z11, z10);
    }

    public final void g() {
        int i10;
        int i11;
        int i12;
        vd.a aVar = this.F;
        float f9 = aVar.f49505e;
        ImageView imageView = this.f30559w;
        imageView.setAlpha(f9);
        imageView.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f9));
        imageView.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f9));
        int i13 = 8;
        int i14 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = this.f30560x;
        imageView2.setAlpha(f9);
        imageView2.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f9));
        imageView2.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f9));
        if (i14 > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView2.setVisibility(i11);
        float f10 = 1.0f - aVar.f49505e;
        ImageView imageView3 = this.f30561y;
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
        ImageView imageView4 = this.A;
        imageView4.setAlpha(f10);
        imageView4.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView4.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        if (i15 > 0) {
            i13 = 0;
        }
        imageView4.setVisibility(i13);
    }

    public i21 getCurrentTabsPosition() {
        if (this.M) {
            return i21.f29304b;
        }
        if (this.L) {
            return i21.f29305c;
        }
        return i21.f29303a;
    }

    public float getSideMenuT() {
        return this.N * this.f30550a.f49505e;
    }

    public final void h() {
        int i10;
        float lerp = AndroidUtilities.lerp(1.0f, 0.0f, this.N);
        FrameLayout frameLayout = this.f30557r;
        frameLayout.setAlpha(lerp);
        if ((1.0f - this.N) * this.f30550a.f49505e > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        if (this.L) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.I) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, j(i21.f29305c)));
        } else {
            frameLayout.setTranslationY(this.J + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, j(i21.f29303a)));
        }
    }

    public final float j(i21 i21Var) {
        float f9;
        float f10 = this.f30550a.f49505e;
        if (i21Var == i21.f29304b) {
            f9 = this.N;
        } else if ((i21Var == i21.f29303a && !this.L) || (i21Var == i21.f29305c && this.L)) {
            f9 = 1.0f - this.N;
        } else {
            return 0.0f;
        }
        return f9 * f10;
    }

    public final boolean k() {
        if (this.N > 0.5f) {
            int i10 = 0;
            while (true) {
                c21 c21Var = this.C;
                if (i10 >= c21Var.getChildCount()) {
                    break;
                }
                w41 G = c21Var.U2.G(RecyclerView.R(c21Var.getChildAt(i10)));
                if (G == null || !G.f34306r) {
                    i10++;
                } else {
                    return true;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                a21 a21Var = this.f30558s;
                if (i11 >= a21Var.getChildCount()) {
                    break;
                }
                w41 G2 = a21Var.U2.G(RecyclerView.R(a21Var.getChildAt(i11)));
                if (G2 != null && G2.f34306r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void l() {
        TopicsController topicsController = MessagesController.getInstance(this.f30552b).getTopicsController();
        long j10 = this.f30553c;
        if (!topicsController.endIsReached(-j10)) {
            topicsController.loadTopics(-j10);
        }
    }

    public final void m(long j10, boolean z10) {
        if (this.f30554e) {
            Utilities.Callback2 callback2 = this.V;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.T;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j10), Boolean.valueOf(z10));
        }
    }

    public final void n() {
        org.telegram.ui.ee eeVar = this.K;
        if (eeVar != null) {
            eeVar.run();
        }
        h();
        float j10 = j(i21.f29304b);
        int i10 = 0;
        FrameLayout frameLayout = this.B;
        frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, j10));
        if (j10 <= 0.0f) {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        int i11 = org.telegram.ui.ActionBar.g6.f23450z6;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        int d = i0.a.d(1.0f - this.N, v02, org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f30561y.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.A.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.N, org.telegram.ui.ActionBar.g6.v0(i11, c6Var), org.telegram.ui.ActionBar.g6.v0(i12, c6Var)), mode));
        this.f30559w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), mode));
        this.f30560x.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), mode));
        invalidate();
    }

    public final void o() {
        f(true);
        a21 a21Var = this.f30558s;
        boolean canScrollHorizontally = a21Var.canScrollHorizontally(-1);
        a21Var.U2.N(true);
        if (!canScrollHorizontally) {
            a21Var.u0(0);
        }
        c21 c21Var = this.C;
        boolean canScrollVertically = c21Var.canScrollVertically(-1);
        c21Var.U2.N(true);
        if (!canScrollVertically) {
            c21Var.u0(0);
        }
        AndroidUtilities.runOnUIThread(new v11(this, 1));
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

    public void setAllTopicsHidden(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            f(true);
        }
    }

    public void setCurrentTopic(long j10) {
        boolean z10;
        this.R = j10;
        a21 a21Var = this.f30558s;
        a21Var.U2.N(true);
        a21Var.invalidate();
        this.C.U2.N(true);
        l21 l21Var = this.v;
        if (l21Var != null) {
            if (j10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            l21Var.c(true, false, z10);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.V = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.U = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.T = callback2;
    }

    public void setSideMenuBackgroundDrawable(ng.d dVar) {
        this.G = dVar;
        dVar.p(AndroidUtilities.dp(16.0f));
        this.G.o(AndroidUtilities.dp(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f9) {
        this.I = f9;
        h();
        e();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f9) {
        this.J = f9;
        this.B.setTranslationY(f9);
        h();
        e();
        invalidate();
    }

    public void setTopMenuBackgroundDrawable(ng.d dVar) {
        this.H = dVar;
        dVar.p(AndroidUtilities.dp(18.0f));
        this.H.o(AndroidUtilities.dp(7.0f));
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
