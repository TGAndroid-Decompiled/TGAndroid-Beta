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
import org.telegram.ui.sd1;
public final class v31 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ne.d, org.telegram.ui.ActionBar.b6 {
    public static final int f31295i0 = 0;
    public final ImageView E;
    public final FrameLayout F;
    public final k31 G;
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
    public final ne.b f31296a;
    public ValueAnimator f31297a0;
    public final int f31298b;
    public long f31299b0;
    public final long f31300c;
    public boolean f31301c0;
    public final org.telegram.ui.ActionBar.g6 d;
    public Utilities.Callback2 f31302d0;
    public final boolean e;
    public Runnable f31303e0;
    public final boolean f31304f;
    public Utilities.Callback2 f31305f0;
    public boolean f31306g0;
    public final org.telegram.ui.sn h;
    public final HashSet f31307h0;
    public final boolean f31308n;
    public final FrameLayout f31309r;
    public final i31 f31310s;
    public final u31 v;
    public final ImageView f31311w;
    public final ImageView f31312x;
    public final ImageView f31313y;

    public v31(Activity activity, org.telegram.ui.sn snVar, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        FrameLayout frameLayout;
        float f7;
        int i11;
        boolean z10;
        zr zrVar = zr.h;
        this.f31296a = new ne.b(0, this, zrVar, 380L, true);
        this.J = new ne.b(0, new c31(this), zrVar, 320L, false);
        this.R = 0.0f;
        this.f31307h0 = new HashSet();
        this.h = snVar;
        this.f31298b = i10;
        this.f31300c = j10;
        this.d = g6Var;
        long j11 = -j10;
        this.e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        this.f31304f = isBotForumWithEditableTopics;
        this.f31308n = !org.telegram.messenger.v0.v("topics_end_reached_", j11, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.f31309r = frameLayout2;
        addView(frameLayout2, w7.z5.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.F = frameLayout3;
        addView(frameLayout3, w7.z5.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        i31 i31Var = new i31(this, activity, i10, new Utilities.Callback2(this) {
            public final v31 f26866b;

            {
                this.f26866b = this;
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
                v31 v31Var = this.f26866b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        a71 a71Var = (a71) obj2;
                        boolean z18 = v31Var.f31304f;
                        int i14 = v31Var.f31298b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = v31Var.f31300c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = v31Var.e;
                        int i15 = p31.f29460a;
                        l61 J = l61.J(p31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f28232q = z19;
                        if (v31Var.f31299b0 == 0) {
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
                                    if (tL_forumTopic2.f20396id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (v31Var.f31307h0.contains(Integer.valueOf(tL_forumTopic2.f20396id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((l61) i2.o1.i(1, arrayList)).f28239y |= 8;
                                        }
                                        a71Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        a71Var.M();
                                        z20 = true;
                                    }
                                    l61 J2 = l61.J(p31.class);
                                    J2.f28238x = j17;
                                    J2.d = tL_forumTopic2.f20396id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = v31Var.f31299b0;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20396id;
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
                            a71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && v31Var.f31308n) {
                            l61 J3 = l61.J(p31.class);
                            J3.d = -2;
                            J3.f28233r = true;
                            arrayList.add(J3);
                            l61 J4 = l61.J(p31.class);
                            J4.d = -3;
                            J4.f28233r = true;
                            arrayList.add(J4);
                            l61 J5 = l61.J(p31.class);
                            J5.d = -4;
                            J5.f28233r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                l61 J6 = l61.J(p31.class);
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
                        v31.b(v31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        a71 a71Var2 = (a71) obj2;
                        boolean z22 = v31Var.e;
                        int i19 = v31Var.f31298b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = v31Var.f31300c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = v31Var.f31304f;
                        if (!z23) {
                            int i20 = t31.f30712a;
                            l61 J7 = l61.J(t31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f28232q = z22;
                            J7.f28239y = z23 ? 1 : 0;
                            if (v31Var.f31299b0 == 0) {
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
                                    if (tL_forumTopic4.f20396id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (v31Var.f31307h0.contains(Integer.valueOf(tL_forumTopic4.f20396id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        a71Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        a71Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = t31.f30712a;
                                    l61 J8 = l61.J(t31.class);
                                    J8.f28238x = j20;
                                    J8.d = tL_forumTopic4.f20396id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = v31Var.f31299b0;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20396id;
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
                            a71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && v31Var.f31308n) {
                            int i24 = t31.f30712a;
                            l61 J9 = l61.J(t31.class);
                            J9.d = -2;
                            J9.f28233r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            l61 J10 = l61.J(t31.class);
                            J10.d = -3;
                            J10.f28233r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            l61 J11 = l61.J(t31.class);
                            J11.d = -4;
                            J11.f28233r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = t31.f30712a;
                                l61 J12 = l61.J(t31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f28232q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new c31(this), new c31(this), g6Var);
        this.f31310s = i31Var;
        i31Var.H1(new Utilities.Callback2(this) {
            public final v31 f26866b;

            {
                this.f26866b = this;
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
                v31 v31Var = this.f26866b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        a71 a71Var = (a71) obj2;
                        boolean z18 = v31Var.f31304f;
                        int i14 = v31Var.f31298b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = v31Var.f31300c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = v31Var.e;
                        int i15 = p31.f29460a;
                        l61 J = l61.J(p31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f28232q = z19;
                        if (v31Var.f31299b0 == 0) {
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
                                    if (tL_forumTopic2.f20396id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (v31Var.f31307h0.contains(Integer.valueOf(tL_forumTopic2.f20396id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((l61) i2.o1.i(1, arrayList)).f28239y |= 8;
                                        }
                                        a71Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        a71Var.M();
                                        z20 = true;
                                    }
                                    l61 J2 = l61.J(p31.class);
                                    J2.f28238x = j17;
                                    J2.d = tL_forumTopic2.f20396id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = v31Var.f31299b0;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20396id;
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
                            a71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && v31Var.f31308n) {
                            l61 J3 = l61.J(p31.class);
                            J3.d = -2;
                            J3.f28233r = true;
                            arrayList.add(J3);
                            l61 J4 = l61.J(p31.class);
                            J4.d = -3;
                            J4.f28233r = true;
                            arrayList.add(J4);
                            l61 J5 = l61.J(p31.class);
                            J5.d = -4;
                            J5.f28233r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                l61 J6 = l61.J(p31.class);
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
                        v31.b(v31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        a71 a71Var2 = (a71) obj2;
                        boolean z22 = v31Var.e;
                        int i19 = v31Var.f31298b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = v31Var.f31300c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = v31Var.f31304f;
                        if (!z23) {
                            int i20 = t31.f30712a;
                            l61 J7 = l61.J(t31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f28232q = z22;
                            J7.f28239y = z23 ? 1 : 0;
                            if (v31Var.f31299b0 == 0) {
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
                                    if (tL_forumTopic4.f20396id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (v31Var.f31307h0.contains(Integer.valueOf(tL_forumTopic4.f20396id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        a71Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        a71Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = t31.f30712a;
                                    l61 J8 = l61.J(t31.class);
                                    J8.f28238x = j20;
                                    J8.d = tL_forumTopic4.f20396id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = v31Var.f31299b0;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20396id;
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
                            a71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && v31Var.f31308n) {
                            int i24 = t31.f30712a;
                            l61 J9 = l61.J(t31.class);
                            J9.d = -2;
                            J9.f28233r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            l61 J10 = l61.J(t31.class);
                            J10.d = -3;
                            J10.f28233r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            l61 J11 = l61.J(t31.class);
                            J11.d = -4;
                            J11.f28233r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = t31.f30712a;
                                l61 J12 = l61.J(t31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f28232q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        i31Var.setWillNotDraw(false);
        i31Var.Z2.f24646r = false;
        i31Var.getContext();
        hg.i0 i0Var = new hg.i0((ViewGroup) i31Var, 5);
        i31Var.Y2 = i0Var;
        i31Var.setLayoutManager(i0Var);
        frameLayout2.addView(i31Var, w7.z5.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        i31Var.j(new j31(this, 0));
        if (isBotForumWithEditableTopics) {
            u31 u31Var = new u31(activity, i10, g6Var);
            this.v = u31Var;
            if (this.f31299b0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u31Var.c(true, false, z10);
            u31Var.setOnClickListener(new View.OnClickListener(this) {
                public final v31 f26190b;

                {
                    this.f26190b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            v31 v31Var = this.f26190b;
                            Boolean bool = v31Var.W;
                            boolean z11 = false;
                            if (bool == null ? !v31Var.Q : !bool.booleanValue()) {
                                z11 = true;
                            }
                            v31Var.d(z11);
                            return;
                        case 1:
                            v31 v31Var2 = this.f26190b;
                            k31 k31Var = v31Var2.G;
                            k31Var.C1(false);
                            i31 i31Var2 = v31Var2.f31310s;
                            i31Var2.C1(false);
                            v31Var2.J.a(false, true);
                            AndroidUtilities.updateVisibleRows(k31Var);
                            AndroidUtilities.updateVisibleRows(i31Var2);
                            return;
                        default:
                            this.f26190b.f31302d0.run(0, Boolean.FALSE);
                            return;
                    }
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(u31Var, w7.z5.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            frameLayout = frameLayout3;
            this.v = null;
        }
        ViewGroup viewGroup = frameLayout;
        k31 k31Var = new k31(activity, i10, new Utilities.Callback2(this) {
            public final v31 f26866b;

            {
                this.f26866b = this;
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
                v31 v31Var = this.f26866b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        a71 a71Var = (a71) obj2;
                        boolean z18 = v31Var.f31304f;
                        int i14 = v31Var.f31298b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = v31Var.f31300c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = v31Var.e;
                        int i15 = p31.f29460a;
                        l61 J = l61.J(p31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f28232q = z19;
                        if (v31Var.f31299b0 == 0) {
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
                                    if (tL_forumTopic2.f20396id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (v31Var.f31307h0.contains(Integer.valueOf(tL_forumTopic2.f20396id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((l61) i2.o1.i(1, arrayList)).f28239y |= 8;
                                        }
                                        a71Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        a71Var.M();
                                        z20 = true;
                                    }
                                    l61 J2 = l61.J(p31.class);
                                    J2.f28238x = j17;
                                    J2.d = tL_forumTopic2.f20396id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = v31Var.f31299b0;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20396id;
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
                            a71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && v31Var.f31308n) {
                            l61 J3 = l61.J(p31.class);
                            J3.d = -2;
                            J3.f28233r = true;
                            arrayList.add(J3);
                            l61 J4 = l61.J(p31.class);
                            J4.d = -3;
                            J4.f28233r = true;
                            arrayList.add(J4);
                            l61 J5 = l61.J(p31.class);
                            J5.d = -4;
                            J5.f28233r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                l61 J6 = l61.J(p31.class);
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
                        v31.b(v31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        a71 a71Var2 = (a71) obj2;
                        boolean z22 = v31Var.e;
                        int i19 = v31Var.f31298b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = v31Var.f31300c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = v31Var.f31304f;
                        if (!z23) {
                            int i20 = t31.f30712a;
                            l61 J7 = l61.J(t31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f28232q = z22;
                            J7.f28239y = z23 ? 1 : 0;
                            if (v31Var.f31299b0 == 0) {
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
                                    if (tL_forumTopic4.f20396id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (v31Var.f31307h0.contains(Integer.valueOf(tL_forumTopic4.f20396id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        a71Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        a71Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = t31.f30712a;
                                    l61 J8 = l61.J(t31.class);
                                    J8.f28238x = j20;
                                    J8.d = tL_forumTopic4.f20396id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = v31Var.f31299b0;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20396id;
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
                            a71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && v31Var.f31308n) {
                            int i24 = t31.f30712a;
                            l61 J9 = l61.J(t31.class);
                            J9.d = -2;
                            J9.f28233r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            l61 J10 = l61.J(t31.class);
                            J10.d = -3;
                            J10.f28233r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            l61 J11 = l61.J(t31.class);
                            J11.d = -4;
                            J11.f28233r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = t31.f30712a;
                                l61 J12 = l61.J(t31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f28232q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new c31(this), new c31(this), g6Var);
        this.G = k31Var;
        k31Var.H1(new Utilities.Callback2(this) {
            public final v31 f26866b;

            {
                this.f26866b = this;
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
                v31 v31Var = this.f26866b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        a71 a71Var = (a71) obj2;
                        boolean z18 = v31Var.f31304f;
                        int i14 = v31Var.f31298b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = v31Var.f31300c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = v31Var.e;
                        int i15 = p31.f29460a;
                        l61 J = l61.J(p31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f28232q = z19;
                        if (v31Var.f31299b0 == 0) {
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
                                    if (tL_forumTopic2.f20396id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (v31Var.f31307h0.contains(Integer.valueOf(tL_forumTopic2.f20396id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((l61) i2.o1.i(1, arrayList)).f28239y |= 8;
                                        }
                                        a71Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        a71Var.M();
                                        z20 = true;
                                    }
                                    l61 J2 = l61.J(p31.class);
                                    J2.f28238x = j17;
                                    J2.d = tL_forumTopic2.f20396id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = v31Var.f31299b0;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20396id;
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
                            a71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && v31Var.f31308n) {
                            l61 J3 = l61.J(p31.class);
                            J3.d = -2;
                            J3.f28233r = true;
                            arrayList.add(J3);
                            l61 J4 = l61.J(p31.class);
                            J4.d = -3;
                            J4.f28233r = true;
                            arrayList.add(J4);
                            l61 J5 = l61.J(p31.class);
                            J5.d = -4;
                            J5.f28233r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                l61 J6 = l61.J(p31.class);
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
                        v31.b(v31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        a71 a71Var2 = (a71) obj2;
                        boolean z22 = v31Var.e;
                        int i19 = v31Var.f31298b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = v31Var.f31300c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = v31Var.f31304f;
                        if (!z23) {
                            int i20 = t31.f30712a;
                            l61 J7 = l61.J(t31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f28232q = z22;
                            J7.f28239y = z23 ? 1 : 0;
                            if (v31Var.f31299b0 == 0) {
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
                                    if (tL_forumTopic4.f20396id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (v31Var.f31307h0.contains(Integer.valueOf(tL_forumTopic4.f20396id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        a71Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        a71Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = t31.f30712a;
                                    l61 J8 = l61.J(t31.class);
                                    J8.f28238x = j20;
                                    J8.d = tL_forumTopic4.f20396id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = v31Var.f31299b0;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20396id;
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
                            a71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && v31Var.f31308n) {
                            int i24 = t31.f30712a;
                            l61 J9 = l61.J(t31.class);
                            J9.d = -2;
                            J9.f28233r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            l61 J10 = l61.J(t31.class);
                            J10.d = -3;
                            J10.f28233r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            l61 J11 = l61.J(t31.class);
                            J11.d = -4;
                            J11.f28233r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = t31.f30712a;
                                l61 J12 = l61.J(t31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f28232q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        k31Var.Z2.f24646r = false;
        k31Var.setClipToPadding(false);
        k31Var.setClipChildren(false);
        if (isBotForumWithEditableTopics) {
            f7 = 90.0f;
        } else {
            f7 = 48.0f;
        }
        viewGroup.addView(k31Var, w7.z5.d(-1, -1.0f, 119, 0.0f, f7, 0.0f, 0.0f));
        k31Var.j(new j31(this, 1));
        ImageView j12 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final v31 f26190b;

            {
                this.f26190b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        v31 v31Var = this.f26190b;
                        Boolean bool = v31Var.W;
                        boolean z11 = false;
                        if (bool == null ? !v31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        v31Var.d(z11);
                        return;
                    case 1:
                        v31 v31Var2 = this.f26190b;
                        k31 k31Var2 = v31Var2.G;
                        k31Var2.C1(false);
                        i31 i31Var2 = v31Var2.f31310s;
                        i31Var2.C1(false);
                        v31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(k31Var2);
                        AndroidUtilities.updateVisibleRows(i31Var2);
                        return;
                    default:
                        this.f26190b.f31302d0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f31313y = j12;
        ImageView j13 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final v31 f26190b;

            {
                this.f26190b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        v31 v31Var = this.f26190b;
                        Boolean bool = v31Var.W;
                        boolean z11 = false;
                        if (bool == null ? !v31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        v31Var.d(z11);
                        return;
                    case 1:
                        v31 v31Var2 = this.f26190b;
                        k31 k31Var2 = v31Var2.G;
                        k31Var2.C1(false);
                        i31 i31Var2 = v31Var2.f31310s;
                        i31Var2.C1(false);
                        v31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(k31Var2);
                        AndroidUtilities.updateVisibleRows(i31Var2);
                        return;
                    default:
                        this.f26190b.f31302d0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.E = j13;
        frameLayout2.addView(j12, w7.z5.e(44, 36, 51));
        viewGroup.addView(j13, w7.z5.e(64, 48, 51));
        ImageView j14 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final v31 f26190b;

            {
                this.f26190b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        v31 v31Var = this.f26190b;
                        Boolean bool = v31Var.W;
                        boolean z11 = false;
                        if (bool == null ? !v31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        v31Var.d(z11);
                        return;
                    case 1:
                        v31 v31Var2 = this.f26190b;
                        k31 k31Var2 = v31Var2.G;
                        k31Var2.C1(false);
                        i31 i31Var2 = v31Var2.f31310s;
                        i31Var2.C1(false);
                        v31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(k31Var2);
                        AndroidUtilities.updateVisibleRows(i31Var2);
                        return;
                    default:
                        this.f26190b.f31302d0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f31311w = j14;
        ImageView j15 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final v31 f26190b;

            {
                this.f26190b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        v31 v31Var = this.f26190b;
                        Boolean bool = v31Var.W;
                        boolean z11 = false;
                        if (bool == null ? !v31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        v31Var.d(z11);
                        return;
                    case 1:
                        v31 v31Var2 = this.f26190b;
                        k31 k31Var2 = v31Var2.G;
                        k31Var2.C1(false);
                        i31 i31Var2 = v31Var2.f31310s;
                        i31Var2.C1(false);
                        v31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(k31Var2);
                        AndroidUtilities.updateVisibleRows(i31Var2);
                        return;
                    default:
                        this.f26190b.f31302d0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f31312x = j15;
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

    public static void a(v31 v31Var, l61 l61Var) {
        if (v31Var.e) {
            Utilities.Callback2 callback2 = v31Var.f31305f0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(l61Var.B), Boolean.FALSE);
            }
        } else if (l61Var.B == -2) {
            Runnable runnable = v31Var.f31303e0;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            Utilities.Callback2 callback22 = v31Var.f31302d0;
            if (callback22 != null) {
                callback22.run(Integer.valueOf(l61Var.d), Boolean.FALSE);
            }
        }
    }

    public static void b(v31 v31Var, ArrayList arrayList) {
        long j10 = v31Var.f31300c;
        TopicsController topicsController = MessagesController.getInstance(v31Var.f31298b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = com.google.android.gms.internal.play_billing.k3.f(((l61) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j11 = -j10;
        topicsController.reorderPinnedTopics(j11, arrayList2);
        topicsController.sortTopics(j11, false);
    }

    public static boolean c(final v31 v31Var, l61 l61Var, View view) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10;
        int i11;
        TLRPC.Chat chat2;
        final v31 v31Var2;
        boolean z10;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i12;
        int i13;
        int i14;
        byte b10;
        int i15;
        ?? r11;
        final h80 h80Var;
        int i16;
        int i17;
        h80 h80Var2;
        org.telegram.ui.ActionBar.g6 g6Var2 = v31Var.d;
        org.telegram.ui.sn snVar = v31Var.h;
        long j10 = v31Var.f31300c;
        int i18 = v31Var.f31298b;
        if (v31Var.G.f27322d3 || v31Var.f31310s.f27322d3) {
            return false;
        }
        Object obj = l61Var.G;
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
        final h80 I = h80.I(snVar, view);
        if (ChatObject.isMonoForum(chat)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i18, chat)) {
                return false;
            }
            TLRPC.Chat chat3 = chat;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new ai.c3(v31Var, I, peerDialogId, chat, 17), false);
            long j11 = chat3.f20344id;
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
                ai.c4 c4Var = new ai.c4(v31Var, y3, I, j11, user2, chat4);
                h80Var2 = I;
                messagesController2.checkIsInChat(true, chat4, user2, c4Var);
            } else {
                h80Var2 = I;
                i14 = 8;
            }
            h80Var = h80Var2;
            g6Var = g6Var2;
            r11 = 1;
            i15 = 2;
            b10 = 0;
        } else {
            TLRPC.Chat chat5 = chat;
            if (!ChatObject.canManageTopics(chat5) && !UserObject.isBotForumWithEditableTopics(user)) {
                v31Var2 = v31Var;
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
                v31Var2 = v31Var;
                Runnable h90Var = new h90(v31Var2, I, messagesController, tL_forumTopic, 9);
                I = I;
                messagesController = messagesController;
                tL_forumTopic = tL_forumTopic;
                I.c(i10, string, h90Var, false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new d31(v31Var2, 0), false);
                }
            }
            if (!ChatObject.canManageTopics(chat2) && !UserObject.isBotForumWithEditableTopics(user)) {
                z10 = false;
            } else {
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(v31Var2) {
                    public final v31 f25950b;

                    {
                        this.f25950b = v31Var2;
                    }

                    @Override
                    public final void run() {
                        int i20 = r4;
                        v31 v31Var3 = this.f25950b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        h80 h80Var3 = I;
                        switch (i20) {
                            case 0:
                                h80Var3.u();
                                v31Var3.h.presentFragment(sd1.a0(-v31Var3.f31300c, tL_forumTopic2.f20396id));
                                return;
                            case 1:
                                v31Var3.getClass();
                                h80Var3.u();
                                MessagesController.getInstance(v31Var3.f31298b).getTopicsController().toggleCloseTopic(-v31Var3.f31300c, tL_forumTopic2.f20396id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                h80Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f20396id));
                                pc pcVar = new pc(18);
                                v31 v31Var4 = this.f25950b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                                c2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = v31Var4.f31299b0;
                                if (hashSet.size() == 1) {
                                    c2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(v31Var4.f31298b).getTopicsController().findTopic(-v31Var4.f31300c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    c2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ai.r4(v31Var4, arrayList, j13, hashSet, pcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new sd0(22));
                                c2Var.show();
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                z10 = false;
            }
            long j13 = v31Var2.f31300c;
            long j14 = tL_forumTopic.f20396id;
            int currentAccount = snVar.getCurrentAccount();
            org.telegram.ui.ActionBar.g6 resourceProvider = snVar.getResourceProvider();
            h80 h80Var3 = I;
            so soVar = new so(h80Var3, currentAccount, j13, j14, snVar, resourceProvider);
            h80 J = h80Var3.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.ut0(h80Var3, 26), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.ic(h80Var3, currentAccount, j13, j14, J, snVar, resourceProvider), false);
            org.telegram.ui.ActionBar.e1 y10 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new ai.db(h80Var3, resourceProvider, currentAccount, soVar, 19), false);
            g6Var = g6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new org.telegram.messenger.x2(h80Var3, j13, j14, snVar, resourceProvider, 7), false);
            J.c(0, "", new ai.ja(h80Var3, currentAccount, j13, j14, snVar, resourceProvider), false);
            new org.telegram.messenger.s9(currentAccount, j13, j14, J.y(), y10).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j10, tL_forumTopic.f20396id);
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
            Runnable e30Var = new e30(v31Var, messagesController, tL_forumTopic, h80Var3, J, 3);
            h80Var = h80Var3;
            h80Var.c(i20, string2, e30Var, false);
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
                h80Var.c(i16, LocaleController.getString(i17), new Runnable(v31Var) {
                    public final v31 f25950b;

                    {
                        this.f25950b = v31Var;
                    }

                    @Override
                    public final void run() {
                        int i202 = r4;
                        v31 v31Var3 = this.f25950b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        h80 h80Var32 = h80Var;
                        switch (i202) {
                            case 0:
                                h80Var32.u();
                                v31Var3.h.presentFragment(sd1.a0(-v31Var3.f31300c, tL_forumTopic2.f20396id));
                                return;
                            case 1:
                                v31Var3.getClass();
                                h80Var32.u();
                                MessagesController.getInstance(v31Var3.f31298b).getTopicsController().toggleCloseTopic(-v31Var3.f31300c, tL_forumTopic2.f20396id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                h80Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f20396id));
                                pc pcVar = new pc(18);
                                v31 v31Var4 = this.f25950b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                                c2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = v31Var4.f31299b0;
                                if (hashSet.size() == 1) {
                                    c2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(v31Var4.f31298b).getTopicsController().findTopic(-v31Var4.f31300c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    c2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ai.r4(v31Var4, arrayList, j132, hashSet, pcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new sd0(22));
                                c2Var.show();
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            if (ChatObject.canDeleteTopic(i18, chat6, tL_forumTopic)) {
                h80Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1), new Runnable(v31Var) {
                    public final v31 f25950b;

                    {
                        this.f25950b = v31Var;
                    }

                    @Override
                    public final void run() {
                        int i202 = r4;
                        v31 v31Var3 = this.f25950b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        h80 h80Var32 = h80Var;
                        switch (i202) {
                            case 0:
                                h80Var32.u();
                                v31Var3.h.presentFragment(sd1.a0(-v31Var3.f31300c, tL_forumTopic2.f20396id));
                                return;
                            case 1:
                                v31Var3.getClass();
                                h80Var32.u();
                                MessagesController.getInstance(v31Var3.f31298b).getTopicsController().toggleCloseTopic(-v31Var3.f31300c, tL_forumTopic2.f20396id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                h80Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f20396id));
                                pc pcVar = new pc(18);
                                v31 v31Var4 = this.f25950b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                                c2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = v31Var4.f31299b0;
                                if (hashSet.size() == 1) {
                                    c2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(v31Var4.f31298b).getTopicsController().findTopic(-v31Var4.f31300c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    c2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ai.r4(v31Var4, arrayList, j132, hashSet, pcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new sd0(22));
                                c2Var.show();
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
        }
        if (view instanceof q31) {
            hw hwVar = new hw(i15, b10);
            Paint paint = new Paint((int) r11);
            hwVar.f27187c = paint;
            hwVar.f27186b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, g6Var));
            h80Var.W(hwVar);
            h80Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21184d6, g6Var);
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
            h80Var.W(shapeDrawable);
        }
        h80Var.Z();
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
        if (this.f31301c0 == z10) {
            return;
        }
        this.f31301c0 = z10;
        long j10 = this.f31300c;
        int i10 = this.f31298b;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21589z6));
    }

    public final void d(boolean z10) {
        float f7;
        if (this.Q == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f31297a0;
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
        this.f31297a0 = ofFloat;
        ofFloat.addUpdateListener(new b80(this, 29));
        this.f31297a0.addListener(new l31(this, z10));
        this.f31297a0.setInterpolator(li.m.V);
        this.f31297a0.setDuration(250L);
        this.f31297a0.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.topicsDidLoaded;
        long j10 = this.f31300c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == (-j10)) {
                q();
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
            MessagesController.getInstance(this.f31298b).getTopicsController().sortTopics(-j10, false);
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
        FrameLayout frameLayout2 = this.f31309r;
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
        if (view == this.f31309r) {
            canvas.clipPath(this.L.v.f8015k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.k6.f21589z6;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
        int f7 = i0.a.f(1.0f - this.R, w02, w03);
        int f10 = i0.a.f(this.R, w02, w03);
        boolean z10 = this.T;
        this.T = true;
        ImageView imageView = this.f31313y;
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
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f31298b).getTopicsController().getTopics(-this.f31300c);
        if (topics != null && !topics.isEmpty() && !this.f31306g0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f31296a.a(z11, z10);
    }

    public r31 getCurrentTabsPosition() {
        if (this.Q) {
            return r31.f30057b;
        }
        if (this.P) {
            return r31.f30058c;
        }
        return r31.f30056a;
    }

    public float getSideMenuT() {
        return this.R * this.f31296a.e;
    }

    public final void h() {
        int i10;
        int i11;
        int i12;
        ne.b bVar = this.J;
        float f7 = bVar.e;
        ImageView imageView = this.f31311w;
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
        ImageView imageView2 = this.f31312x;
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
        ImageView imageView3 = this.f31313y;
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
        FrameLayout frameLayout = this.f31309r;
        frameLayout.setAlpha(lerp);
        if ((1.0f - this.R) * this.f31296a.e > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        if (this.P) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.M) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, k(r31.f30058c)));
        } else {
            frameLayout.setTranslationY(this.N + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, k(r31.f30056a)));
        }
    }

    public final float k(r31 r31Var) {
        float f7;
        float f10 = this.f31296a.e;
        if (r31Var == r31.f30057b) {
            f7 = this.R;
        } else if ((r31Var == r31.f30056a && !this.P) || (r31Var == r31.f30058c && this.P)) {
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
                k31 k31Var = this.G;
                if (i10 >= k31Var.getChildCount()) {
                    break;
                }
                l61 G = k31Var.Z2.G(RecyclerView.R(k31Var.getChildAt(i10)));
                if (G == null || !G.f28233r) {
                    i10++;
                } else {
                    return true;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                i31 i31Var = this.f31310s;
                if (i11 >= i31Var.getChildCount()) {
                    break;
                }
                l61 G2 = i31Var.Z2.G(RecyclerView.R(i31Var.getChildAt(i11)));
                if (G2 != null && G2.f28233r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void m() {
        TopicsController topicsController = MessagesController.getInstance(this.f31298b).getTopicsController();
        long j10 = this.f31300c;
        if (!topicsController.endIsReached(-j10)) {
            topicsController.loadTopics(-j10);
        }
    }

    public final void n(long j10, boolean z10) {
        if (this.e) {
            Utilities.Callback2 callback2 = this.f31305f0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.f31302d0;
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
        float k10 = k(r31.f30057b);
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
        ImageView imageView = this.f31311w;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, g6Var, mode);
        org.telegram.ui.ActionBar.r6.t(this.f31312x, i11, g6Var, mode);
        invalidate();
    }

    public final void q() {
        g(true);
        i31 i31Var = this.f31310s;
        boolean canScrollHorizontally = i31Var.canScrollHorizontally(-1);
        i31Var.Z2.N(true);
        if (!canScrollHorizontally) {
            i31Var.u0(0);
        }
        k31 k31Var = this.G;
        boolean canScrollVertically = k31Var.canScrollVertically(-1);
        k31Var.Z2.N(true);
        if (!canScrollVertically) {
            k31Var.u0(0);
        }
        AndroidUtilities.runOnUIThread(new d31(this, 1));
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.f31306g0 != z10) {
            this.f31306g0 = z10;
            g(true);
        }
    }

    public void setCurrentTopic(long j10) {
        boolean z10;
        this.f31299b0 = j10;
        i31 i31Var = this.f31310s;
        i31Var.Z2.N(true);
        i31Var.invalidate();
        this.G.Z2.N(true);
        u31 u31Var = this.v;
        if (u31Var != null) {
            if (j10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u31Var.c(true, false, z10);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.f31305f0 = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.f31303e0 = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.f31302d0 = callback2;
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
