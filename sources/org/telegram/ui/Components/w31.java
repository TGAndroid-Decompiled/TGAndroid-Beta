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
import org.telegram.messenger.FileLog;
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
public final class w31 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ne.d, org.telegram.ui.ActionBar.b6 {
    public static final int f32129i0 = 0;
    public final ImageView E;
    public final FrameLayout F;
    public final l31 G;
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
    public boolean T;
    public int U;
    public int V;
    public Boolean W;
    public final ne.b f32130a;
    public ValueAnimator f32131a0;
    public final int f32132b;
    public long f32133b0;
    public final long f32134c;
    public boolean f32135c0;
    public final org.telegram.ui.ActionBar.g6 d;
    public Utilities.Callback2 f32136d0;
    public final boolean e;
    public Runnable f32137e0;
    public final boolean f32138f;
    public Utilities.Callback2 f32139f0;
    public boolean f32140g0;
    public final org.telegram.ui.sn h;
    public final HashSet f32141h0;
    public final boolean f32142n;
    public final FrameLayout f32143r;
    public final j31 f32144s;
    public final v31 v;
    public final ImageView f32145w;
    public final ImageView f32146x;
    public final ImageView f32147y;

    public w31(Activity activity, org.telegram.ui.sn snVar, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        FrameLayout frameLayout;
        float f7;
        int i11;
        boolean z10;
        bs bsVar = bs.h;
        this.f32130a = new ne.b(0, this, bsVar, 380L, true);
        this.J = new ne.b(0, new d31(this), bsVar, 320L, false);
        this.R = 0.0f;
        this.f32141h0 = new HashSet();
        this.h = snVar;
        this.f32132b = i10;
        this.f32134c = j10;
        this.d = g6Var;
        long j11 = -j10;
        this.e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        this.f32138f = isBotForumWithEditableTopics;
        this.f32142n = !org.telegram.messenger.v0.v("topics_end_reached_", j11, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.f32143r = frameLayout2;
        addView(frameLayout2, w7.z5.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.F = frameLayout3;
        addView(frameLayout3, w7.z5.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        j31 j31Var = new j31(this, activity, i10, new Utilities.Callback2(this) {
            public final w31 f27200b;

            {
                this.f27200b = this;
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
                w31 w31Var = this.f27200b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b71 b71Var = (b71) obj2;
                        boolean z18 = w31Var.f32138f;
                        int i14 = w31Var.f32132b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = w31Var.f32134c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = w31Var.e;
                        int i15 = q31.f29765a;
                        m61 J = m61.J(q31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f28564q = z19;
                        if (w31Var.f32133b0 == 0) {
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
                                    if (tL_forumTopic2.f20395id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (w31Var.f32141h0.contains(Integer.valueOf(tL_forumTopic2.f20395id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((m61) i2.o1.i(1, arrayList)).f28571y |= 8;
                                        }
                                        b71Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        b71Var.M();
                                        z20 = true;
                                    }
                                    m61 J2 = m61.J(q31.class);
                                    J2.f28570x = j17;
                                    J2.d = tL_forumTopic2.f20395id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = w31Var.f32133b0;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20395id;
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
                            b71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && w31Var.f32142n) {
                            m61 J3 = m61.J(q31.class);
                            J3.d = -2;
                            J3.f28565r = true;
                            arrayList.add(J3);
                            m61 J4 = m61.J(q31.class);
                            J4.d = -3;
                            J4.f28565r = true;
                            arrayList.add(J4);
                            m61 J5 = m61.J(q31.class);
                            J5.d = -4;
                            J5.f28565r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                m61 J6 = m61.J(q31.class);
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
                        w31.b(w31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        b71 b71Var2 = (b71) obj2;
                        boolean z22 = w31Var.e;
                        int i19 = w31Var.f32132b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = w31Var.f32134c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = w31Var.f32138f;
                        if (!z23) {
                            int i20 = u31.f31072a;
                            m61 J7 = m61.J(u31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f28564q = z22;
                            J7.f28571y = z23 ? 1 : 0;
                            if (w31Var.f32133b0 == 0) {
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
                                    if (tL_forumTopic4.f20395id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (w31Var.f32141h0.contains(Integer.valueOf(tL_forumTopic4.f20395id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        b71Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        b71Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = u31.f31072a;
                                    m61 J8 = m61.J(u31.class);
                                    J8.f28570x = j20;
                                    J8.d = tL_forumTopic4.f20395id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = w31Var.f32133b0;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20395id;
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
                            b71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && w31Var.f32142n) {
                            int i24 = u31.f31072a;
                            m61 J9 = m61.J(u31.class);
                            J9.d = -2;
                            J9.f28565r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            m61 J10 = m61.J(u31.class);
                            J10.d = -3;
                            J10.f28565r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            m61 J11 = m61.J(u31.class);
                            J11.d = -4;
                            J11.f28565r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = u31.f31072a;
                                m61 J12 = m61.J(u31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f28564q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new d31(this), new d31(this), g6Var);
        this.f32144s = j31Var;
        j31Var.H1(new Utilities.Callback2(this) {
            public final w31 f27200b;

            {
                this.f27200b = this;
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
                w31 w31Var = this.f27200b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b71 b71Var = (b71) obj2;
                        boolean z18 = w31Var.f32138f;
                        int i14 = w31Var.f32132b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = w31Var.f32134c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = w31Var.e;
                        int i15 = q31.f29765a;
                        m61 J = m61.J(q31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f28564q = z19;
                        if (w31Var.f32133b0 == 0) {
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
                                    if (tL_forumTopic2.f20395id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (w31Var.f32141h0.contains(Integer.valueOf(tL_forumTopic2.f20395id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((m61) i2.o1.i(1, arrayList)).f28571y |= 8;
                                        }
                                        b71Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        b71Var.M();
                                        z20 = true;
                                    }
                                    m61 J2 = m61.J(q31.class);
                                    J2.f28570x = j17;
                                    J2.d = tL_forumTopic2.f20395id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = w31Var.f32133b0;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20395id;
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
                            b71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && w31Var.f32142n) {
                            m61 J3 = m61.J(q31.class);
                            J3.d = -2;
                            J3.f28565r = true;
                            arrayList.add(J3);
                            m61 J4 = m61.J(q31.class);
                            J4.d = -3;
                            J4.f28565r = true;
                            arrayList.add(J4);
                            m61 J5 = m61.J(q31.class);
                            J5.d = -4;
                            J5.f28565r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                m61 J6 = m61.J(q31.class);
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
                        w31.b(w31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        b71 b71Var2 = (b71) obj2;
                        boolean z22 = w31Var.e;
                        int i19 = w31Var.f32132b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = w31Var.f32134c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = w31Var.f32138f;
                        if (!z23) {
                            int i20 = u31.f31072a;
                            m61 J7 = m61.J(u31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f28564q = z22;
                            J7.f28571y = z23 ? 1 : 0;
                            if (w31Var.f32133b0 == 0) {
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
                                    if (tL_forumTopic4.f20395id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (w31Var.f32141h0.contains(Integer.valueOf(tL_forumTopic4.f20395id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        b71Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        b71Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = u31.f31072a;
                                    m61 J8 = m61.J(u31.class);
                                    J8.f28570x = j20;
                                    J8.d = tL_forumTopic4.f20395id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = w31Var.f32133b0;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20395id;
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
                            b71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && w31Var.f32142n) {
                            int i24 = u31.f31072a;
                            m61 J9 = m61.J(u31.class);
                            J9.d = -2;
                            J9.f28565r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            m61 J10 = m61.J(u31.class);
                            J10.d = -3;
                            J10.f28565r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            m61 J11 = m61.J(u31.class);
                            J11.d = -4;
                            J11.f28565r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = u31.f31072a;
                                m61 J12 = m61.J(u31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f28564q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        j31Var.setWillNotDraw(false);
        j31Var.Z2.f24972r = false;
        j31Var.getContext();
        hg.i0 i0Var = new hg.i0((ViewGroup) j31Var, 5);
        j31Var.Y2 = i0Var;
        j31Var.setLayoutManager(i0Var);
        frameLayout2.addView(j31Var, w7.z5.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        j31Var.j(new k31(this, 0));
        if (isBotForumWithEditableTopics) {
            v31 v31Var = new v31(activity, i10, g6Var);
            this.v = v31Var;
            if (this.f32133b0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            v31Var.c(true, false, z10);
            v31Var.setOnClickListener(new View.OnClickListener(this) {
                public final w31 f26536b;

                {
                    this.f26536b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            w31 w31Var = this.f26536b;
                            Boolean bool = w31Var.W;
                            boolean z11 = false;
                            if (bool == null ? !w31Var.Q : !bool.booleanValue()) {
                                z11 = true;
                            }
                            w31Var.d(z11);
                            return;
                        case 1:
                            w31 w31Var2 = this.f26536b;
                            l31 l31Var = w31Var2.G;
                            l31Var.C1(false);
                            j31 j31Var2 = w31Var2.f32144s;
                            j31Var2.C1(false);
                            w31Var2.J.a(false, true);
                            AndroidUtilities.updateVisibleRows(l31Var);
                            AndroidUtilities.updateVisibleRows(j31Var2);
                            return;
                        default:
                            this.f26536b.f32136d0.run(0, Boolean.FALSE);
                            return;
                    }
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(v31Var, w7.z5.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            frameLayout = frameLayout3;
            this.v = null;
        }
        ViewGroup viewGroup = frameLayout;
        l31 l31Var = new l31(activity, i10, new Utilities.Callback2(this) {
            public final w31 f27200b;

            {
                this.f27200b = this;
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
                w31 w31Var = this.f27200b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b71 b71Var = (b71) obj2;
                        boolean z18 = w31Var.f32138f;
                        int i14 = w31Var.f32132b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = w31Var.f32134c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = w31Var.e;
                        int i15 = q31.f29765a;
                        m61 J = m61.J(q31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f28564q = z19;
                        if (w31Var.f32133b0 == 0) {
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
                                    if (tL_forumTopic2.f20395id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (w31Var.f32141h0.contains(Integer.valueOf(tL_forumTopic2.f20395id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((m61) i2.o1.i(1, arrayList)).f28571y |= 8;
                                        }
                                        b71Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        b71Var.M();
                                        z20 = true;
                                    }
                                    m61 J2 = m61.J(q31.class);
                                    J2.f28570x = j17;
                                    J2.d = tL_forumTopic2.f20395id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = w31Var.f32133b0;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20395id;
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
                            b71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && w31Var.f32142n) {
                            m61 J3 = m61.J(q31.class);
                            J3.d = -2;
                            J3.f28565r = true;
                            arrayList.add(J3);
                            m61 J4 = m61.J(q31.class);
                            J4.d = -3;
                            J4.f28565r = true;
                            arrayList.add(J4);
                            m61 J5 = m61.J(q31.class);
                            J5.d = -4;
                            J5.f28565r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                m61 J6 = m61.J(q31.class);
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
                        w31.b(w31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        b71 b71Var2 = (b71) obj2;
                        boolean z22 = w31Var.e;
                        int i19 = w31Var.f32132b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = w31Var.f32134c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = w31Var.f32138f;
                        if (!z23) {
                            int i20 = u31.f31072a;
                            m61 J7 = m61.J(u31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f28564q = z22;
                            J7.f28571y = z23 ? 1 : 0;
                            if (w31Var.f32133b0 == 0) {
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
                                    if (tL_forumTopic4.f20395id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (w31Var.f32141h0.contains(Integer.valueOf(tL_forumTopic4.f20395id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        b71Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        b71Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = u31.f31072a;
                                    m61 J8 = m61.J(u31.class);
                                    J8.f28570x = j20;
                                    J8.d = tL_forumTopic4.f20395id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = w31Var.f32133b0;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20395id;
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
                            b71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && w31Var.f32142n) {
                            int i24 = u31.f31072a;
                            m61 J9 = m61.J(u31.class);
                            J9.d = -2;
                            J9.f28565r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            m61 J10 = m61.J(u31.class);
                            J10.d = -3;
                            J10.f28565r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            m61 J11 = m61.J(u31.class);
                            J11.d = -4;
                            J11.f28565r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = u31.f31072a;
                                m61 J12 = m61.J(u31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f28564q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new d31(this), new d31(this), g6Var);
        this.G = l31Var;
        l31Var.H1(new Utilities.Callback2(this) {
            public final w31 f27200b;

            {
                this.f27200b = this;
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
                w31 w31Var = this.f27200b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b71 b71Var = (b71) obj2;
                        boolean z18 = w31Var.f32138f;
                        int i14 = w31Var.f32132b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = w31Var.f32134c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = w31Var.e;
                        int i15 = q31.f29765a;
                        m61 J = m61.J(q31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f28564q = z19;
                        if (w31Var.f32133b0 == 0) {
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
                                    if (tL_forumTopic2.f20395id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (w31Var.f32141h0.contains(Integer.valueOf(tL_forumTopic2.f20395id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((m61) i2.o1.i(1, arrayList)).f28571y |= 8;
                                        }
                                        b71Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        b71Var.M();
                                        z20 = true;
                                    }
                                    m61 J2 = m61.J(q31.class);
                                    J2.f28570x = j17;
                                    J2.d = tL_forumTopic2.f20395id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = w31Var.f32133b0;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20395id;
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
                            b71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && w31Var.f32142n) {
                            m61 J3 = m61.J(q31.class);
                            J3.d = -2;
                            J3.f28565r = true;
                            arrayList.add(J3);
                            m61 J4 = m61.J(q31.class);
                            J4.d = -3;
                            J4.f28565r = true;
                            arrayList.add(J4);
                            m61 J5 = m61.J(q31.class);
                            J5.d = -4;
                            J5.f28565r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                m61 J6 = m61.J(q31.class);
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
                        w31.b(w31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        b71 b71Var2 = (b71) obj2;
                        boolean z22 = w31Var.e;
                        int i19 = w31Var.f32132b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = w31Var.f32134c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = w31Var.f32138f;
                        if (!z23) {
                            int i20 = u31.f31072a;
                            m61 J7 = m61.J(u31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f28564q = z22;
                            J7.f28571y = z23 ? 1 : 0;
                            if (w31Var.f32133b0 == 0) {
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
                                    if (tL_forumTopic4.f20395id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (w31Var.f32141h0.contains(Integer.valueOf(tL_forumTopic4.f20395id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        b71Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        b71Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = u31.f31072a;
                                    m61 J8 = m61.J(u31.class);
                                    J8.f28570x = j20;
                                    J8.d = tL_forumTopic4.f20395id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = w31Var.f32133b0;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20395id;
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
                            b71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && w31Var.f32142n) {
                            int i24 = u31.f31072a;
                            m61 J9 = m61.J(u31.class);
                            J9.d = -2;
                            J9.f28565r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            m61 J10 = m61.J(u31.class);
                            J10.d = -3;
                            J10.f28565r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            m61 J11 = m61.J(u31.class);
                            J11.d = -4;
                            J11.f28565r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = u31.f31072a;
                                m61 J12 = m61.J(u31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f28564q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        l31Var.Z2.f24972r = false;
        l31Var.setClipToPadding(false);
        l31Var.setClipChildren(false);
        if (isBotForumWithEditableTopics) {
            f7 = 90.0f;
        } else {
            f7 = 48.0f;
        }
        viewGroup.addView(l31Var, w7.z5.d(-1, -1.0f, 119, 0.0f, f7, 0.0f, 0.0f));
        l31Var.j(new k31(this, 1));
        ImageView j12 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final w31 f26536b;

            {
                this.f26536b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w31 w31Var = this.f26536b;
                        Boolean bool = w31Var.W;
                        boolean z11 = false;
                        if (bool == null ? !w31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        w31Var.d(z11);
                        return;
                    case 1:
                        w31 w31Var2 = this.f26536b;
                        l31 l31Var2 = w31Var2.G;
                        l31Var2.C1(false);
                        j31 j31Var2 = w31Var2.f32144s;
                        j31Var2.C1(false);
                        w31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(l31Var2);
                        AndroidUtilities.updateVisibleRows(j31Var2);
                        return;
                    default:
                        this.f26536b.f32136d0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f32147y = j12;
        ImageView j13 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final w31 f26536b;

            {
                this.f26536b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w31 w31Var = this.f26536b;
                        Boolean bool = w31Var.W;
                        boolean z11 = false;
                        if (bool == null ? !w31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        w31Var.d(z11);
                        return;
                    case 1:
                        w31 w31Var2 = this.f26536b;
                        l31 l31Var2 = w31Var2.G;
                        l31Var2.C1(false);
                        j31 j31Var2 = w31Var2.f32144s;
                        j31Var2.C1(false);
                        w31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(l31Var2);
                        AndroidUtilities.updateVisibleRows(j31Var2);
                        return;
                    default:
                        this.f26536b.f32136d0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.E = j13;
        frameLayout2.addView(j12, w7.z5.e(44, 36, 51));
        viewGroup.addView(j13, w7.z5.e(64, 48, 51));
        ImageView j14 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final w31 f26536b;

            {
                this.f26536b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w31 w31Var = this.f26536b;
                        Boolean bool = w31Var.W;
                        boolean z11 = false;
                        if (bool == null ? !w31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        w31Var.d(z11);
                        return;
                    case 1:
                        w31 w31Var2 = this.f26536b;
                        l31 l31Var2 = w31Var2.G;
                        l31Var2.C1(false);
                        j31 j31Var2 = w31Var2.f32144s;
                        j31Var2.C1(false);
                        w31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(l31Var2);
                        AndroidUtilities.updateVisibleRows(j31Var2);
                        return;
                    default:
                        this.f26536b.f32136d0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f32145w = j14;
        ImageView j15 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final w31 f26536b;

            {
                this.f26536b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w31 w31Var = this.f26536b;
                        Boolean bool = w31Var.W;
                        boolean z11 = false;
                        if (bool == null ? !w31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        w31Var.d(z11);
                        return;
                    case 1:
                        w31 w31Var2 = this.f26536b;
                        l31 l31Var2 = w31Var2.G;
                        l31Var2.C1(false);
                        j31 j31Var2 = w31Var2.f32144s;
                        j31Var2.C1(false);
                        w31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(l31Var2);
                        AndroidUtilities.updateVisibleRows(j31Var2);
                        return;
                    default:
                        this.f26536b.f32136d0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f32146x = j15;
        frameLayout2.addView(j14, w7.z5.e(44, 36, 51));
        viewGroup.addView(j15, w7.z5.e(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j11, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.v0.v("topicssidetabs", j10, mainSettings, false)) {
            this.R = 1.0f;
            this.Q = true;
        }
        boolean v = org.telegram.messenger.v0.v("topicssidetabsb", j10, mainSettings, false);
        this.P = v;
        if (v) {
            i11 = R.drawable.menu_sidebar_top;
        } else {
            i11 = R.drawable.menu_sidebar_bottom;
        }
        j13.setImageResource(i11);
        g(false);
        h();
        p();
        q();
    }

    public static void a(w31 w31Var, m61 m61Var) {
        if (w31Var.e) {
            Utilities.Callback2 callback2 = w31Var.f32139f0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(m61Var.B), Boolean.FALSE);
            }
        } else if (m61Var.B == -2) {
            Runnable runnable = w31Var.f32137e0;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            Utilities.Callback2 callback22 = w31Var.f32136d0;
            if (callback22 != null) {
                callback22.run(Integer.valueOf(m61Var.d), Boolean.FALSE);
            }
        }
    }

    public static void b(w31 w31Var, ArrayList arrayList) {
        long j10 = w31Var.f32134c;
        TopicsController topicsController = MessagesController.getInstance(w31Var.f32132b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = com.google.android.gms.internal.play_billing.k3.f(((m61) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j11 = -j10;
        topicsController.reorderPinnedTopics(j11, arrayList2);
        topicsController.sortTopics(j11, false);
    }

    public static boolean c(final w31 w31Var, m61 m61Var, View view) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10;
        int i11;
        TLRPC.Chat chat2;
        final w31 w31Var2;
        boolean z10;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i12;
        int i13;
        int i14;
        byte b10;
        int i15;
        ?? r11;
        final j80 j80Var;
        int i16;
        int i17;
        j80 j80Var2;
        org.telegram.ui.ActionBar.g6 g6Var2 = w31Var.d;
        org.telegram.ui.sn snVar = w31Var.h;
        long j10 = w31Var.f32134c;
        int i18 = w31Var.f32132b;
        if (w31Var.G.f27543d3 || w31Var.f32144s.f27543d3) {
            return false;
        }
        Object obj = m61Var.G;
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
        final j80 I = j80.I(snVar, view);
        if (ChatObject.isMonoForum(chat)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i18, chat)) {
                return false;
            }
            TLRPC.Chat chat3 = chat;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new ai.c3(w31Var, I, peerDialogId, chat, 17), false);
            long j11 = chat3.f20343id;
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
                ai.c4 c4Var = new ai.c4(w31Var, y3, I, j11, user2, chat4);
                j80Var2 = I;
                messagesController2.checkIsInChat(true, chat4, user2, c4Var);
            } else {
                j80Var2 = I;
                i14 = 8;
            }
            j80Var = j80Var2;
            g6Var = g6Var2;
            r11 = 1;
            i15 = 2;
            b10 = 0;
        } else {
            TLRPC.Chat chat5 = chat;
            if (!ChatObject.canManageTopics(chat5) && !UserObject.isBotForumWithEditableTopics(user)) {
                w31Var2 = w31Var;
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
                w31Var2 = w31Var;
                Runnable j90Var = new j90(w31Var2, I, messagesController, tL_forumTopic, 9);
                I = I;
                messagesController = messagesController;
                tL_forumTopic = tL_forumTopic;
                I.c(i10, string, j90Var, false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new e31(w31Var2, 0), false);
                }
            }
            if (!ChatObject.canManageTopics(chat2) && !UserObject.isBotForumWithEditableTopics(user)) {
                z10 = false;
            } else {
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(w31Var2) {
                    public final w31 f26160b;

                    {
                        this.f26160b = w31Var2;
                    }

                    @Override
                    public final void run() {
                        int i20 = r4;
                        w31 w31Var3 = this.f26160b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        j80 j80Var3 = I;
                        switch (i20) {
                            case 0:
                                j80Var3.u();
                                w31Var3.h.presentFragment(td1.a0(-w31Var3.f32134c, tL_forumTopic2.f20395id));
                                return;
                            case 1:
                                w31Var3.getClass();
                                j80Var3.u();
                                MessagesController.getInstance(w31Var3.f32132b).getTopicsController().toggleCloseTopic(-w31Var3.f32134c, tL_forumTopic2.f20395id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                j80Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f20395id));
                                rc rcVar = new rc(18);
                                w31 w31Var4 = this.f26160b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                                c2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = w31Var4.f32133b0;
                                if (hashSet.size() == 1) {
                                    c2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(w31Var4.f32132b).getTopicsController().findTopic(-w31Var4.f32134c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    c2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ai.r4(w31Var4, arrayList, j13, hashSet, rcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ud0(22));
                                c2Var.show();
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                z10 = false;
            }
            long j13 = w31Var2.f32134c;
            long j14 = tL_forumTopic.f20395id;
            int currentAccount = snVar.getCurrentAccount();
            org.telegram.ui.ActionBar.g6 resourceProvider = snVar.getResourceProvider();
            j80 j80Var3 = I;
            uo uoVar = new uo(j80Var3, currentAccount, j13, j14, snVar, resourceProvider);
            j80 J = j80Var3.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.vt0(j80Var3, 26), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.hc(j80Var3, currentAccount, j13, j14, J, snVar, resourceProvider), false);
            org.telegram.ui.ActionBar.e1 y10 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new ai.db(j80Var3, resourceProvider, currentAccount, uoVar, 19), false);
            g6Var = g6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new org.telegram.messenger.x2(j80Var3, j13, j14, snVar, resourceProvider, 7), false);
            J.c(0, "", new ai.ja(j80Var3, currentAccount, j13, j14, snVar, resourceProvider), false);
            new org.telegram.messenger.r9(currentAccount, j13, j14, J.y(), y10).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j10, tL_forumTopic.f20395id);
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
            Runnable g30Var = new g30(w31Var, messagesController, tL_forumTopic, j80Var3, J, 3);
            j80Var = j80Var3;
            j80Var.c(i20, string2, g30Var, false);
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
                j80Var.c(i16, LocaleController.getString(i17), new Runnable(w31Var) {
                    public final w31 f26160b;

                    {
                        this.f26160b = w31Var;
                    }

                    @Override
                    public final void run() {
                        int i202 = r4;
                        w31 w31Var3 = this.f26160b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        j80 j80Var32 = j80Var;
                        switch (i202) {
                            case 0:
                                j80Var32.u();
                                w31Var3.h.presentFragment(td1.a0(-w31Var3.f32134c, tL_forumTopic2.f20395id));
                                return;
                            case 1:
                                w31Var3.getClass();
                                j80Var32.u();
                                MessagesController.getInstance(w31Var3.f32132b).getTopicsController().toggleCloseTopic(-w31Var3.f32134c, tL_forumTopic2.f20395id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                j80Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f20395id));
                                rc rcVar = new rc(18);
                                w31 w31Var4 = this.f26160b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                                c2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = w31Var4.f32133b0;
                                if (hashSet.size() == 1) {
                                    c2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(w31Var4.f32132b).getTopicsController().findTopic(-w31Var4.f32134c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    c2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ai.r4(w31Var4, arrayList, j132, hashSet, rcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ud0(22));
                                c2Var.show();
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            if (ChatObject.canDeleteTopic(i18, chat6, tL_forumTopic)) {
                j80Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1), new Runnable(w31Var) {
                    public final w31 f26160b;

                    {
                        this.f26160b = w31Var;
                    }

                    @Override
                    public final void run() {
                        int i202 = r4;
                        w31 w31Var3 = this.f26160b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        j80 j80Var32 = j80Var;
                        switch (i202) {
                            case 0:
                                j80Var32.u();
                                w31Var3.h.presentFragment(td1.a0(-w31Var3.f32134c, tL_forumTopic2.f20395id));
                                return;
                            case 1:
                                w31Var3.getClass();
                                j80Var32.u();
                                MessagesController.getInstance(w31Var3.f32132b).getTopicsController().toggleCloseTopic(-w31Var3.f32134c, tL_forumTopic2.f20395id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                j80Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f20395id));
                                rc rcVar = new rc(18);
                                w31 w31Var4 = this.f26160b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                                c2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = w31Var4.f32133b0;
                                if (hashSet.size() == 1) {
                                    c2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(w31Var4.f32132b).getTopicsController().findTopic(-w31Var4.f32134c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    c2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ai.r4(w31Var4, arrayList, j132, hashSet, rcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ud0(22));
                                c2Var.show();
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
        }
        if (view instanceof r31) {
            jw jwVar = new jw(i15, b10);
            Paint paint = new Paint((int) r11);
            jwVar.f27770c = paint;
            jwVar.f27769b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, g6Var));
            j80Var.W(jwVar);
            j80Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, g6Var);
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
            j80Var.W(shapeDrawable);
        }
        j80Var.Z();
        return r11;
    }

    public static ImageView j(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        w7.b6.a(imageView);
        return imageView;
    }

    private void setAttached(boolean z10) {
        if (this.f32135c0 == z10) {
            return;
        }
        this.f32135c0 = z10;
        long j10 = this.f32134c;
        int i10 = this.f32132b;
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
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21588z6));
    }

    public final void d(boolean z10) {
        float f7;
        if (this.Q == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f32131a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.S) {
                this.W = Boolean.valueOf(z10);
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
        this.f32131a0 = ofFloat;
        ofFloat.addUpdateListener(new d80(this, 29));
        this.f32131a0.addListener(new m31(this, z10));
        this.f32131a0.setInterpolator(li.m.V);
        this.f32131a0.setDuration(250L);
        this.f32131a0.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.topicsDidLoaded;
        long j10 = this.f32134c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == (-j10)) {
                q();
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
            MessagesController.getInstance(this.f32132b).getTopicsController().sortTopics(-j10, false);
            q();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.F;
        if (frameLayout.getVisibility() == 0) {
            this.K.setBounds((int) frameLayout.getTranslationX(), (int) this.N, (int) (frameLayout.getTranslationX() + AndroidUtilities.dp(78.0f)), (int) (getMeasuredHeight() - this.M));
            this.K.draw(canvas);
        }
        FrameLayout frameLayout2 = this.f32143r;
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
            canvas.clipPath(this.K.v.f8015k);
        }
        if (view == this.f32143r) {
            canvas.clipPath(this.L.v.f8015k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.k6.f21588z6;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
        int f7 = i0.a.f(1.0f - this.R, w02, w03);
        int f10 = i0.a.f(this.R, w02, w03);
        boolean z10 = this.T;
        this.T = true;
        ImageView imageView = this.f32147y;
        if (imageView != null && (!z10 || f7 != this.U)) {
            imageView.setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
        }
        this.U = f7;
        ImageView imageView2 = this.E;
        if (imageView2 != null && (!z10 || f10 != this.V)) {
            imageView2.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        }
        this.V = f10;
    }

    public final void f() {
        FrameLayout frameLayout = this.F;
        int paddingBottom = frameLayout.getPaddingBottom();
        int round = Math.round(this.M + this.N);
        if (paddingBottom == round) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, round);
    }

    public final void g(boolean z10) {
        boolean z11;
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f32132b).getTopicsController().getTopics(-this.f32134c);
        if (topics != null && !topics.isEmpty() && !this.f32140g0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32130a.a(z11, z10);
    }

    public s31 getCurrentTabsPosition() {
        if (this.Q) {
            return s31.f30370b;
        }
        if (this.P) {
            return s31.f30371c;
        }
        return s31.f30369a;
    }

    public float getSideMenuT() {
        return this.R * this.f32130a.e;
    }

    public final void h() {
        int i10;
        int i11;
        int i12;
        ne.b bVar = this.J;
        float f7 = bVar.e;
        ImageView imageView = this.f32145w;
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
        ImageView imageView2 = this.f32146x;
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
        ImageView imageView3 = this.f32147y;
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

    public final void i() {
        int i10;
        float lerp = AndroidUtilities.lerp(1.0f, 0.0f, this.R);
        FrameLayout frameLayout = this.f32143r;
        frameLayout.setAlpha(lerp);
        if ((1.0f - this.R) * this.f32130a.e > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        if (this.P) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.M) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, k(s31.f30371c)));
        } else {
            frameLayout.setTranslationY(this.N + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, k(s31.f30369a)));
        }
    }

    public final float k(s31 s31Var) {
        float f7;
        float f10 = this.f32130a.e;
        if (s31Var == s31.f30370b) {
            f7 = this.R;
        } else if ((s31Var == s31.f30369a && !this.P) || (s31Var == s31.f30371c && this.P)) {
            f7 = 1.0f - this.R;
        } else {
            return 0.0f;
        }
        return f7 * f10;
    }

    public final boolean l() {
        if (this.R > 0.5f) {
            int i10 = 0;
            while (true) {
                l31 l31Var = this.G;
                if (i10 >= l31Var.getChildCount()) {
                    break;
                }
                m61 G = l31Var.Z2.G(RecyclerView.R(l31Var.getChildAt(i10)));
                if (G == null || !G.f28565r) {
                    i10++;
                } else {
                    return true;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                j31 j31Var = this.f32144s;
                if (i11 >= j31Var.getChildCount()) {
                    break;
                }
                m61 G2 = j31Var.Z2.G(RecyclerView.R(j31Var.getChildAt(i11)));
                if (G2 != null && G2.f28565r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void m() {
        TopicsController topicsController = MessagesController.getInstance(this.f32132b).getTopicsController();
        long j10 = this.f32134c;
        if (!topicsController.endIsReached(-j10)) {
            topicsController.loadTopics(-j10);
        }
    }

    public final void n(long j10, boolean z10) {
        if (this.e) {
            Utilities.Callback2 callback2 = this.f32139f0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.f32136d0;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j10), Boolean.valueOf(z10));
        }
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        p();
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
        i();
    }

    public final void p() {
        org.telegram.ui.ke keVar = this.O;
        if (keVar != null) {
            keVar.run();
        }
        i();
        float k10 = k(s31.f30370b);
        int i10 = 0;
        FrameLayout frameLayout = this.F;
        frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, k10));
        if (k10 <= 0.0f) {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        e();
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.f32145w;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, g6Var, mode);
        org.telegram.ui.ActionBar.r6.t(this.f32146x, i11, g6Var, mode);
        invalidate();
    }

    public final void q() {
        g(true);
        j31 j31Var = this.f32144s;
        boolean canScrollHorizontally = j31Var.canScrollHorizontally(-1);
        j31Var.Z2.N(true);
        if (!canScrollHorizontally) {
            j31Var.u0(0);
        }
        l31 l31Var = this.G;
        boolean canScrollVertically = l31Var.canScrollVertically(-1);
        l31Var.Z2.N(true);
        if (!canScrollVertically) {
            l31Var.u0(0);
        }
        AndroidUtilities.runOnUIThread(new e31(this, 1));
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.f32140g0 != z10) {
            this.f32140g0 = z10;
            g(true);
        }
    }

    public void setCurrentTopic(long j10) {
        boolean z10;
        this.f32133b0 = j10;
        j31 j31Var = this.f32144s;
        j31Var.Z2.N(true);
        j31Var.invalidate();
        this.G.Z2.N(true);
        v31 v31Var = this.v;
        if (v31Var != null) {
            if (j10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            v31Var.c(true, false, z10);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.f32139f0 = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.f32137e0 = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.f32136d0 = callback2;
    }

    public void setSideMenuBackgroundDrawable(dh.d dVar) {
        this.K = dVar;
        dVar.q(AndroidUtilities.dp(16.0f));
        this.K.p(AndroidUtilities.dp(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f7) {
        this.M = f7;
        i();
        f();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f7) {
        this.N = f7;
        this.F.setTranslationY(f7);
        i();
        f();
        invalidate();
    }

    public void setTopMenuBackgroundDrawable(dh.d dVar) {
        this.L = dVar;
        dVar.q(AndroidUtilities.dp(18.0f));
        this.L.p(AndroidUtilities.dp(7.0f));
    }

    @Override
    public final void updateColors() {
        try {
            e();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
