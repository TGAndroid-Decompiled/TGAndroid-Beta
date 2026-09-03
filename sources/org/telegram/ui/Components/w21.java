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
import org.telegram.ui.oe1;
public final class w21 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, xd.b {
    public static final int f32617c0 = 0;
    public final ImageView B;
    public final FrameLayout C;
    public final m21 D;
    public long E;
    public long F;
    public final xd.a G;
    public qg.b H;
    public qg.b I;
    public float J;
    public float K;
    public org.telegram.ui.le L;
    public boolean M;
    public boolean N;
    public float O;
    public boolean P;
    public Boolean Q;
    public ValueAnimator R;
    public long S;
    public boolean T;
    public Utilities.Callback2 U;
    public Runnable V;
    public Utilities.Callback2 W;
    public final xd.a f32618a;
    public boolean f32619a0;
    public final int f32620b;
    public final HashSet f32621b0;
    public final long f32622c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final boolean f32623e;
    public final boolean f32624f;
    public final org.telegram.ui.xn h;
    public final boolean f32625n;
    public final FrameLayout f32626r;
    public final k21 f32627s;
    public final v21 v;
    public final ImageView f32628w;
    public final ImageView f32629x;
    public final ImageView f32630y;

    public w21(Activity activity, org.telegram.ui.xn xnVar, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        FrameLayout frameLayout;
        float f10;
        int i11;
        boolean z4;
        pr prVar = pr.h;
        this.f32618a = new xd.a(0, this, prVar, 380L, true);
        this.G = new xd.a(0, new e21(this), prVar, 320L, false);
        this.O = 0.0f;
        this.f32621b0 = new HashSet();
        this.h = xnVar;
        this.f32620b = i10;
        this.f32622c = j10;
        this.d = g6Var;
        long j11 = -j10;
        this.f32623e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        this.f32624f = isBotForumWithEditableTopics;
        this.f32625n = !org.telegram.messenger.y3.v("topics_end_reached_", j11, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.f32626r = frameLayout2;
        addView(frameLayout2, k7.c6.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.C = frameLayout3;
        addView(frameLayout3, k7.c6.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        k21 k21Var = new k21(this, activity, i10, new Utilities.Callback2(this) {
            public final w21 f27969b;

            {
                this.f27969b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                boolean z11;
                int i12;
                boolean z12;
                long j12;
                long j13;
                boolean z13;
                TopicsController topicsController;
                boolean z14;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                boolean z15;
                boolean z16;
                int i13 = r2;
                w21 w21Var = this.f27969b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        w51 w51Var = (w51) obj2;
                        boolean z17 = w21Var.f32624f;
                        int i14 = w21Var.f32620b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = w21Var.f32622c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z18 = w21Var.f32623e;
                        int i15 = q21.f30274a;
                        h51 J = h51.J(q21.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f27380q = z18;
                        if (w21Var.S == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        J.K(z10);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z19 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z17) {
                                    i12 = i17;
                                    if (tL_forumTopic2.f20897id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (w21Var.f32621b0.contains(Integer.valueOf(tL_forumTopic2.f20897id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z20 = tL_forumTopic2.pinned;
                                    if (!z20 && z19) {
                                        if (!arrayList.isEmpty()) {
                                            ((h51) l.d.i(1, arrayList)).f27387y |= 8;
                                        }
                                        w51Var.L();
                                        z19 = false;
                                    } else if (z20 && !z19) {
                                        w51Var.M();
                                        z19 = true;
                                    }
                                    h51 J2 = h51.J(q21.class);
                                    J2.f27386x = j17;
                                    J2.d = tL_forumTopic2.f20897id;
                                    J2.G = tL_forumTopic2;
                                    if (z18) {
                                        z12 = z19;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z12 = z19;
                                    }
                                    long j19 = w21Var.S;
                                    if (z18) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20897id;
                                    }
                                    if (j12 == j13) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    J2.K(z13);
                                    arrayList.add(J2);
                                    size = i18;
                                    i16 = i12;
                                    z19 = z12;
                                }
                            }
                            z11 = z19;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            w51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && w21Var.f32625n) {
                            h51 J3 = h51.J(q21.class);
                            J3.d = -2;
                            J3.f27381r = true;
                            arrayList.add(J3);
                            h51 J4 = h51.J(q21.class);
                            J4.d = -3;
                            J4.f27381r = true;
                            arrayList.add(J4);
                            h51 J5 = h51.J(q21.class);
                            J5.d = -4;
                            J5.f27381r = true;
                            arrayList.add(J5);
                        }
                        if (!z17 && !z18) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                h51 J6 = h51.J(q21.class);
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
                        w21.b(w21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        w51 w51Var2 = (w51) obj2;
                        boolean z21 = w21Var.f32623e;
                        int i19 = w21Var.f32620b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = w21Var.f32622c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z22 = w21Var.f32624f;
                        if (!z22) {
                            int i20 = u21.f31485a;
                            h51 J7 = h51.J(u21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f27380q = z21;
                            J7.f27387y = z22 ? 1 : 0;
                            if (w21Var.S == 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            J7.K(z16);
                            arrayList2.add(J7);
                        } else {
                            topicsController = topicsController3;
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z14 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z22) {
                                    user = user3;
                                    if (tL_forumTopic4.f20897id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (w21Var.f32621b0.contains(Integer.valueOf(tL_forumTopic4.f20897id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z23 = tL_forumTopic4.pinned;
                                    if (!z23 && z14) {
                                        w51Var2.L();
                                        z14 = false;
                                    } else if (z23 && !z14) {
                                        w51Var2.M();
                                        z14 = true;
                                    }
                                    int i23 = u21.f31485a;
                                    h51 J8 = h51.J(u21.class);
                                    J8.f27386x = j20;
                                    J8.d = tL_forumTopic4.f20897id;
                                    J8.G = tL_forumTopic4;
                                    if (z21) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = w21Var.S;
                                    if (z21) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20897id;
                                    }
                                    if (j15 == j16) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    J8.K(z15);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z14 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z14) {
                            w51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && w21Var.f32625n) {
                            int i24 = u21.f31485a;
                            h51 J9 = h51.J(u21.class);
                            J9.d = -2;
                            J9.f27381r = true;
                            J9.f27369e = false;
                            arrayList2.add(J9);
                            h51 J10 = h51.J(u21.class);
                            J10.d = -3;
                            J10.f27381r = true;
                            J10.f27369e = false;
                            arrayList2.add(J10);
                            h51 J11 = h51.J(u21.class);
                            J11.d = -4;
                            J11.f27381r = true;
                            J11.f27369e = false;
                            arrayList2.add(J11);
                        }
                        if (!z22 && !z21) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = u21.f31485a;
                                h51 J12 = h51.J(u21.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f27380q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new e21(this), new e21(this), g6Var);
        this.f32627s = k21Var;
        k21Var.A1(new Utilities.Callback2(this) {
            public final w21 f27969b;

            {
                this.f27969b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                boolean z11;
                int i12;
                boolean z12;
                long j12;
                long j13;
                boolean z13;
                TopicsController topicsController;
                boolean z14;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                boolean z15;
                boolean z16;
                int i13 = r2;
                w21 w21Var = this.f27969b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        w51 w51Var = (w51) obj2;
                        boolean z17 = w21Var.f32624f;
                        int i14 = w21Var.f32620b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = w21Var.f32622c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z18 = w21Var.f32623e;
                        int i15 = q21.f30274a;
                        h51 J = h51.J(q21.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f27380q = z18;
                        if (w21Var.S == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        J.K(z10);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z19 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z17) {
                                    i12 = i17;
                                    if (tL_forumTopic2.f20897id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (w21Var.f32621b0.contains(Integer.valueOf(tL_forumTopic2.f20897id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z20 = tL_forumTopic2.pinned;
                                    if (!z20 && z19) {
                                        if (!arrayList.isEmpty()) {
                                            ((h51) l.d.i(1, arrayList)).f27387y |= 8;
                                        }
                                        w51Var.L();
                                        z19 = false;
                                    } else if (z20 && !z19) {
                                        w51Var.M();
                                        z19 = true;
                                    }
                                    h51 J2 = h51.J(q21.class);
                                    J2.f27386x = j17;
                                    J2.d = tL_forumTopic2.f20897id;
                                    J2.G = tL_forumTopic2;
                                    if (z18) {
                                        z12 = z19;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z12 = z19;
                                    }
                                    long j19 = w21Var.S;
                                    if (z18) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20897id;
                                    }
                                    if (j12 == j13) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    J2.K(z13);
                                    arrayList.add(J2);
                                    size = i18;
                                    i16 = i12;
                                    z19 = z12;
                                }
                            }
                            z11 = z19;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            w51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && w21Var.f32625n) {
                            h51 J3 = h51.J(q21.class);
                            J3.d = -2;
                            J3.f27381r = true;
                            arrayList.add(J3);
                            h51 J4 = h51.J(q21.class);
                            J4.d = -3;
                            J4.f27381r = true;
                            arrayList.add(J4);
                            h51 J5 = h51.J(q21.class);
                            J5.d = -4;
                            J5.f27381r = true;
                            arrayList.add(J5);
                        }
                        if (!z17 && !z18) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                h51 J6 = h51.J(q21.class);
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
                        w21.b(w21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        w51 w51Var2 = (w51) obj2;
                        boolean z21 = w21Var.f32623e;
                        int i19 = w21Var.f32620b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = w21Var.f32622c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z22 = w21Var.f32624f;
                        if (!z22) {
                            int i20 = u21.f31485a;
                            h51 J7 = h51.J(u21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f27380q = z21;
                            J7.f27387y = z22 ? 1 : 0;
                            if (w21Var.S == 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            J7.K(z16);
                            arrayList2.add(J7);
                        } else {
                            topicsController = topicsController3;
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z14 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z22) {
                                    user = user3;
                                    if (tL_forumTopic4.f20897id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (w21Var.f32621b0.contains(Integer.valueOf(tL_forumTopic4.f20897id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z23 = tL_forumTopic4.pinned;
                                    if (!z23 && z14) {
                                        w51Var2.L();
                                        z14 = false;
                                    } else if (z23 && !z14) {
                                        w51Var2.M();
                                        z14 = true;
                                    }
                                    int i23 = u21.f31485a;
                                    h51 J8 = h51.J(u21.class);
                                    J8.f27386x = j20;
                                    J8.d = tL_forumTopic4.f20897id;
                                    J8.G = tL_forumTopic4;
                                    if (z21) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = w21Var.S;
                                    if (z21) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20897id;
                                    }
                                    if (j15 == j16) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    J8.K(z15);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z14 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z14) {
                            w51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && w21Var.f32625n) {
                            int i24 = u21.f31485a;
                            h51 J9 = h51.J(u21.class);
                            J9.d = -2;
                            J9.f27381r = true;
                            J9.f27369e = false;
                            arrayList2.add(J9);
                            h51 J10 = h51.J(u21.class);
                            J10.d = -3;
                            J10.f27381r = true;
                            J10.f27369e = false;
                            arrayList2.add(J10);
                            h51 J11 = h51.J(u21.class);
                            J11.d = -4;
                            J11.f27381r = true;
                            J11.f27369e = false;
                            arrayList2.add(J11);
                        }
                        if (!z22 && !z21) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = u21.f31485a;
                                h51 J12 = h51.J(u21.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f27380q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        k21Var.setWillNotDraw(false);
        k21Var.V2.f32651r = false;
        k21Var.getContext();
        org.telegram.ui.cr crVar = new org.telegram.ui.cr((ViewGroup) k21Var, 4);
        k21Var.U2 = crVar;
        k21Var.setLayoutManager(crVar);
        frameLayout2.addView(k21Var, k7.c6.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        k21Var.j(new l21(this, 0));
        if (isBotForumWithEditableTopics) {
            v21 v21Var = new v21(activity, i10, g6Var);
            this.v = v21Var;
            if (this.S == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            v21Var.c(true, false, z4);
            v21Var.setOnClickListener(new View.OnClickListener(this) {
                public final w21 f27340b;

                {
                    this.f27340b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            w21 w21Var = this.f27340b;
                            Boolean bool = w21Var.Q;
                            boolean z10 = false;
                            if (bool == null ? !w21Var.N : !bool.booleanValue()) {
                                z10 = true;
                            }
                            w21Var.d(z10);
                            return;
                        case 1:
                            w21 w21Var2 = this.f27340b;
                            m21 m21Var = w21Var2.D;
                            m21Var.v1(false);
                            k21 k21Var2 = w21Var2.f32627s;
                            k21Var2.v1(false);
                            w21Var2.G.a(false, true);
                            AndroidUtilities.updateVisibleRows(m21Var);
                            AndroidUtilities.updateVisibleRows(k21Var2);
                            return;
                        default:
                            this.f27340b.U.run(0, Boolean.FALSE);
                            return;
                    }
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(v21Var, k7.c6.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            frameLayout = frameLayout3;
            this.v = null;
        }
        ViewGroup viewGroup = frameLayout;
        m21 m21Var = new m21(activity, i10, new Utilities.Callback2(this) {
            public final w21 f27969b;

            {
                this.f27969b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                boolean z11;
                int i12;
                boolean z12;
                long j12;
                long j13;
                boolean z13;
                TopicsController topicsController;
                boolean z14;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                boolean z15;
                boolean z16;
                int i13 = r2;
                w21 w21Var = this.f27969b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        w51 w51Var = (w51) obj2;
                        boolean z17 = w21Var.f32624f;
                        int i14 = w21Var.f32620b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = w21Var.f32622c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z18 = w21Var.f32623e;
                        int i15 = q21.f30274a;
                        h51 J = h51.J(q21.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f27380q = z18;
                        if (w21Var.S == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        J.K(z10);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z19 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z17) {
                                    i12 = i17;
                                    if (tL_forumTopic2.f20897id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (w21Var.f32621b0.contains(Integer.valueOf(tL_forumTopic2.f20897id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z20 = tL_forumTopic2.pinned;
                                    if (!z20 && z19) {
                                        if (!arrayList.isEmpty()) {
                                            ((h51) l.d.i(1, arrayList)).f27387y |= 8;
                                        }
                                        w51Var.L();
                                        z19 = false;
                                    } else if (z20 && !z19) {
                                        w51Var.M();
                                        z19 = true;
                                    }
                                    h51 J2 = h51.J(q21.class);
                                    J2.f27386x = j17;
                                    J2.d = tL_forumTopic2.f20897id;
                                    J2.G = tL_forumTopic2;
                                    if (z18) {
                                        z12 = z19;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z12 = z19;
                                    }
                                    long j19 = w21Var.S;
                                    if (z18) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20897id;
                                    }
                                    if (j12 == j13) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    J2.K(z13);
                                    arrayList.add(J2);
                                    size = i18;
                                    i16 = i12;
                                    z19 = z12;
                                }
                            }
                            z11 = z19;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            w51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && w21Var.f32625n) {
                            h51 J3 = h51.J(q21.class);
                            J3.d = -2;
                            J3.f27381r = true;
                            arrayList.add(J3);
                            h51 J4 = h51.J(q21.class);
                            J4.d = -3;
                            J4.f27381r = true;
                            arrayList.add(J4);
                            h51 J5 = h51.J(q21.class);
                            J5.d = -4;
                            J5.f27381r = true;
                            arrayList.add(J5);
                        }
                        if (!z17 && !z18) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                h51 J6 = h51.J(q21.class);
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
                        w21.b(w21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        w51 w51Var2 = (w51) obj2;
                        boolean z21 = w21Var.f32623e;
                        int i19 = w21Var.f32620b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = w21Var.f32622c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z22 = w21Var.f32624f;
                        if (!z22) {
                            int i20 = u21.f31485a;
                            h51 J7 = h51.J(u21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f27380q = z21;
                            J7.f27387y = z22 ? 1 : 0;
                            if (w21Var.S == 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            J7.K(z16);
                            arrayList2.add(J7);
                        } else {
                            topicsController = topicsController3;
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z14 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z22) {
                                    user = user3;
                                    if (tL_forumTopic4.f20897id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (w21Var.f32621b0.contains(Integer.valueOf(tL_forumTopic4.f20897id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z23 = tL_forumTopic4.pinned;
                                    if (!z23 && z14) {
                                        w51Var2.L();
                                        z14 = false;
                                    } else if (z23 && !z14) {
                                        w51Var2.M();
                                        z14 = true;
                                    }
                                    int i23 = u21.f31485a;
                                    h51 J8 = h51.J(u21.class);
                                    J8.f27386x = j20;
                                    J8.d = tL_forumTopic4.f20897id;
                                    J8.G = tL_forumTopic4;
                                    if (z21) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = w21Var.S;
                                    if (z21) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20897id;
                                    }
                                    if (j15 == j16) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    J8.K(z15);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z14 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z14) {
                            w51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && w21Var.f32625n) {
                            int i24 = u21.f31485a;
                            h51 J9 = h51.J(u21.class);
                            J9.d = -2;
                            J9.f27381r = true;
                            J9.f27369e = false;
                            arrayList2.add(J9);
                            h51 J10 = h51.J(u21.class);
                            J10.d = -3;
                            J10.f27381r = true;
                            J10.f27369e = false;
                            arrayList2.add(J10);
                            h51 J11 = h51.J(u21.class);
                            J11.d = -4;
                            J11.f27381r = true;
                            J11.f27369e = false;
                            arrayList2.add(J11);
                        }
                        if (!z22 && !z21) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = u21.f31485a;
                                h51 J12 = h51.J(u21.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f27380q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new e21(this), new e21(this), g6Var);
        this.D = m21Var;
        m21Var.A1(new Utilities.Callback2(this) {
            public final w21 f27969b;

            {
                this.f27969b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                boolean z11;
                int i12;
                boolean z12;
                long j12;
                long j13;
                boolean z13;
                TopicsController topicsController;
                boolean z14;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                boolean z15;
                boolean z16;
                int i13 = r2;
                w21 w21Var = this.f27969b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        w51 w51Var = (w51) obj2;
                        boolean z17 = w21Var.f32624f;
                        int i14 = w21Var.f32620b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = w21Var.f32622c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z18 = w21Var.f32623e;
                        int i15 = q21.f30274a;
                        h51 J = h51.J(q21.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f27380q = z18;
                        if (w21Var.S == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        J.K(z10);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z19 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z17) {
                                    i12 = i17;
                                    if (tL_forumTopic2.f20897id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (w21Var.f32621b0.contains(Integer.valueOf(tL_forumTopic2.f20897id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z20 = tL_forumTopic2.pinned;
                                    if (!z20 && z19) {
                                        if (!arrayList.isEmpty()) {
                                            ((h51) l.d.i(1, arrayList)).f27387y |= 8;
                                        }
                                        w51Var.L();
                                        z19 = false;
                                    } else if (z20 && !z19) {
                                        w51Var.M();
                                        z19 = true;
                                    }
                                    h51 J2 = h51.J(q21.class);
                                    J2.f27386x = j17;
                                    J2.d = tL_forumTopic2.f20897id;
                                    J2.G = tL_forumTopic2;
                                    if (z18) {
                                        z12 = z19;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z12 = z19;
                                    }
                                    long j19 = w21Var.S;
                                    if (z18) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20897id;
                                    }
                                    if (j12 == j13) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    J2.K(z13);
                                    arrayList.add(J2);
                                    size = i18;
                                    i16 = i12;
                                    z19 = z12;
                                }
                            }
                            z11 = z19;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            w51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && w21Var.f32625n) {
                            h51 J3 = h51.J(q21.class);
                            J3.d = -2;
                            J3.f27381r = true;
                            arrayList.add(J3);
                            h51 J4 = h51.J(q21.class);
                            J4.d = -3;
                            J4.f27381r = true;
                            arrayList.add(J4);
                            h51 J5 = h51.J(q21.class);
                            J5.d = -4;
                            J5.f27381r = true;
                            arrayList.add(J5);
                        }
                        if (!z17 && !z18) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                h51 J6 = h51.J(q21.class);
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
                        w21.b(w21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        w51 w51Var2 = (w51) obj2;
                        boolean z21 = w21Var.f32623e;
                        int i19 = w21Var.f32620b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = w21Var.f32622c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z22 = w21Var.f32624f;
                        if (!z22) {
                            int i20 = u21.f31485a;
                            h51 J7 = h51.J(u21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f27380q = z21;
                            J7.f27387y = z22 ? 1 : 0;
                            if (w21Var.S == 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            J7.K(z16);
                            arrayList2.add(J7);
                        } else {
                            topicsController = topicsController3;
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z14 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z22) {
                                    user = user3;
                                    if (tL_forumTopic4.f20897id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (w21Var.f32621b0.contains(Integer.valueOf(tL_forumTopic4.f20897id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z23 = tL_forumTopic4.pinned;
                                    if (!z23 && z14) {
                                        w51Var2.L();
                                        z14 = false;
                                    } else if (z23 && !z14) {
                                        w51Var2.M();
                                        z14 = true;
                                    }
                                    int i23 = u21.f31485a;
                                    h51 J8 = h51.J(u21.class);
                                    J8.f27386x = j20;
                                    J8.d = tL_forumTopic4.f20897id;
                                    J8.G = tL_forumTopic4;
                                    if (z21) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = w21Var.S;
                                    if (z21) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20897id;
                                    }
                                    if (j15 == j16) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    J8.K(z15);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z14 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z14) {
                            w51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && w21Var.f32625n) {
                            int i24 = u21.f31485a;
                            h51 J9 = h51.J(u21.class);
                            J9.d = -2;
                            J9.f27381r = true;
                            J9.f27369e = false;
                            arrayList2.add(J9);
                            h51 J10 = h51.J(u21.class);
                            J10.d = -3;
                            J10.f27381r = true;
                            J10.f27369e = false;
                            arrayList2.add(J10);
                            h51 J11 = h51.J(u21.class);
                            J11.d = -4;
                            J11.f27381r = true;
                            J11.f27369e = false;
                            arrayList2.add(J11);
                        }
                        if (!z22 && !z21) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = u21.f31485a;
                                h51 J12 = h51.J(u21.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f27380q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        m21Var.V2.f32651r = false;
        m21Var.setClipToPadding(false);
        m21Var.setClipChildren(false);
        if (isBotForumWithEditableTopics) {
            f10 = 90.0f;
        } else {
            f10 = 48.0f;
        }
        viewGroup.addView(m21Var, k7.c6.d(-1, -1.0f, 119, 0.0f, f10, 0.0f, 0.0f));
        m21Var.j(new l21(this, 1));
        ImageView i12 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final w21 f27340b;

            {
                this.f27340b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w21 w21Var = this.f27340b;
                        Boolean bool = w21Var.Q;
                        boolean z10 = false;
                        if (bool == null ? !w21Var.N : !bool.booleanValue()) {
                            z10 = true;
                        }
                        w21Var.d(z10);
                        return;
                    case 1:
                        w21 w21Var2 = this.f27340b;
                        m21 m21Var2 = w21Var2.D;
                        m21Var2.v1(false);
                        k21 k21Var2 = w21Var2.f32627s;
                        k21Var2.v1(false);
                        w21Var2.G.a(false, true);
                        AndroidUtilities.updateVisibleRows(m21Var2);
                        AndroidUtilities.updateVisibleRows(k21Var2);
                        return;
                    default:
                        this.f27340b.U.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f32630y = i12;
        ImageView i13 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final w21 f27340b;

            {
                this.f27340b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w21 w21Var = this.f27340b;
                        Boolean bool = w21Var.Q;
                        boolean z10 = false;
                        if (bool == null ? !w21Var.N : !bool.booleanValue()) {
                            z10 = true;
                        }
                        w21Var.d(z10);
                        return;
                    case 1:
                        w21 w21Var2 = this.f27340b;
                        m21 m21Var2 = w21Var2.D;
                        m21Var2.v1(false);
                        k21 k21Var2 = w21Var2.f32627s;
                        k21Var2.v1(false);
                        w21Var2.G.a(false, true);
                        AndroidUtilities.updateVisibleRows(m21Var2);
                        AndroidUtilities.updateVisibleRows(k21Var2);
                        return;
                    default:
                        this.f27340b.U.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.B = i13;
        frameLayout2.addView(i12, k7.c6.e(44, 36, 51));
        viewGroup.addView(i13, k7.c6.e(64, 48, 51));
        ImageView i14 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final w21 f27340b;

            {
                this.f27340b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w21 w21Var = this.f27340b;
                        Boolean bool = w21Var.Q;
                        boolean z10 = false;
                        if (bool == null ? !w21Var.N : !bool.booleanValue()) {
                            z10 = true;
                        }
                        w21Var.d(z10);
                        return;
                    case 1:
                        w21 w21Var2 = this.f27340b;
                        m21 m21Var2 = w21Var2.D;
                        m21Var2.v1(false);
                        k21 k21Var2 = w21Var2.f32627s;
                        k21Var2.v1(false);
                        w21Var2.G.a(false, true);
                        AndroidUtilities.updateVisibleRows(m21Var2);
                        AndroidUtilities.updateVisibleRows(k21Var2);
                        return;
                    default:
                        this.f27340b.U.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f32628w = i14;
        ImageView i15 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final w21 f27340b;

            {
                this.f27340b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w21 w21Var = this.f27340b;
                        Boolean bool = w21Var.Q;
                        boolean z10 = false;
                        if (bool == null ? !w21Var.N : !bool.booleanValue()) {
                            z10 = true;
                        }
                        w21Var.d(z10);
                        return;
                    case 1:
                        w21 w21Var2 = this.f27340b;
                        m21 m21Var2 = w21Var2.D;
                        m21Var2.v1(false);
                        k21 k21Var2 = w21Var2.f32627s;
                        k21Var2.v1(false);
                        w21Var2.G.a(false, true);
                        AndroidUtilities.updateVisibleRows(m21Var2);
                        AndroidUtilities.updateVisibleRows(k21Var2);
                        return;
                    default:
                        this.f27340b.U.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f32629x = i15;
        frameLayout2.addView(i14, k7.c6.e(44, 36, 51));
        viewGroup.addView(i15, k7.c6.e(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j11, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.y3.v("topicssidetabs", j10, mainSettings, false)) {
            this.O = 1.0f;
            this.N = true;
        }
        boolean v = org.telegram.messenger.y3.v("topicssidetabsb", j10, mainSettings, false);
        this.M = v;
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

    public static void a(w21 w21Var, h51 h51Var) {
        if (w21Var.f32623e) {
            Utilities.Callback2 callback2 = w21Var.W;
            if (callback2 != null) {
                callback2.run(Long.valueOf(h51Var.B), Boolean.FALSE);
            }
        } else if (h51Var.B == -2) {
            Runnable runnable = w21Var.V;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            Utilities.Callback2 callback22 = w21Var.U;
            if (callback22 != null) {
                callback22.run(Integer.valueOf(h51Var.d), Boolean.FALSE);
            }
        }
    }

    public static void b(w21 w21Var, ArrayList arrayList) {
        long j10 = w21Var.f32622c;
        TopicsController topicsController = MessagesController.getInstance(w21Var.f32620b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = org.telegram.ui.yh.d(((h51) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j11 = -j10;
        topicsController.reorderPinnedTopics(j11, arrayList2);
        topicsController.sortTopics(j11, false);
    }

    public static boolean c(final w21 w21Var, h51 h51Var, View view) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10;
        int i11;
        TLRPC.Chat chat2;
        final w21 w21Var2;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i12;
        int i13;
        int i14;
        ?? r11;
        byte b10;
        int i15;
        final q70 q70Var;
        int i16;
        int i17;
        q70 q70Var2;
        org.telegram.ui.ActionBar.g6 g6Var2 = w21Var.d;
        org.telegram.ui.xn xnVar = w21Var.h;
        long j10 = w21Var.f32622c;
        int i18 = w21Var.f32620b;
        if (w21Var.D.Z2 || w21Var.f32627s.Z2) {
            return false;
        }
        Object obj = h51Var.G;
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
        final q70 I = q70.I(xnVar, view);
        if (ChatObject.isMonoForum(chat)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i18, chat)) {
                return false;
            }
            TLRPC.Chat chat3 = chat;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new org.telegram.messenger.di(w21Var, I, peerDialogId, chat, 4), false);
            long j11 = chat3.f20845id;
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
                org.telegram.ui.ActionBar.g1 y10 = I.y();
                i15 = 8;
                y10.setVisibility(8);
                MessagesController messagesController2 = MessagesController.getInstance(i18);
                mh.o2 o2Var = new mh.o2(w21Var, y10, I, j11, user2, chat4);
                q70Var2 = I;
                messagesController2.checkIsInChat(true, chat4, user2, o2Var);
            } else {
                q70Var2 = I;
                i15 = 8;
            }
            q70Var = q70Var2;
            g6Var = g6Var2;
            i14 = 2;
            r11 = 1;
            b10 = 0;
        } else {
            TLRPC.Chat chat5 = chat;
            if (!ChatObject.canManageTopics(chat5) && !UserObject.isBotForumWithEditableTopics(user)) {
                w21Var2 = w21Var;
                chat2 = chat5;
            } else {
                boolean z4 = tL_forumTopic.pinned;
                if (z4) {
                    i10 = R.drawable.msg_unpin;
                } else {
                    i10 = R.drawable.msg_pin;
                }
                if (z4) {
                    i11 = R.string.DialogUnpin;
                } else {
                    i11 = R.string.DialogPin;
                }
                CharSequence string = LocaleController.getString(i11);
                chat2 = chat5;
                w21Var2 = w21Var;
                Runnable ihVar = new org.telegram.ui.ih(w21Var2, I, messagesController, tL_forumTopic, 26);
                I = I;
                messagesController = messagesController;
                tL_forumTopic = tL_forumTopic;
                I.c(i10, string, ihVar, false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new f21(w21Var2, 0), false);
                }
            }
            if (ChatObject.canManageTopics(chat2) || UserObject.isBotForumWithEditableTopics(user)) {
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(w21Var2) {
                    public final w21 f27072b;

                    {
                        this.f27072b = w21Var2;
                    }

                    @Override
                    public final void run() {
                        boolean z10;
                        int i20 = r4;
                        w21 w21Var3 = this.f27072b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        q70 q70Var3 = I;
                        switch (i20) {
                            case 0:
                                q70Var3.u();
                                w21Var3.h.presentFragment(oe1.a0(-w21Var3.f32622c, tL_forumTopic2.f20897id));
                                return;
                            case 1:
                                w21Var3.getClass();
                                q70Var3.u();
                                MessagesController.getInstance(w21Var3.f32620b).getTopicsController().toggleCloseTopic(-w21Var3.f32622c, tL_forumTopic2.f20897id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                q70Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f20897id));
                                jc jcVar = new jc(16);
                                w21 w21Var4 = this.f27072b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                                d2Var.O = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = w21Var4.S;
                                if (hashSet.size() == 1) {
                                    z10 = false;
                                    d2Var.Q = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(w21Var4.f32620b).getTopicsController().findTopic(-w21Var4.f32622c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z10 = false;
                                    d2Var.Q = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mh.a3(w21Var4, arrayList, j13, hashSet, jcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh0(12));
                                d2Var.show();
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, z10));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            long j13 = w21Var2.f32622c;
            long j14 = tL_forumTopic.f20897id;
            int currentAccount = xnVar.getCurrentAccount();
            org.telegram.ui.ActionBar.g6 resourceProvider = xnVar.getResourceProvider();
            q70 q70Var3 = I;
            io ioVar = new io(q70Var3, currentAccount, j13, j14, xnVar, resourceProvider);
            q70 J = q70Var3.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.yt0(q70Var3, 25), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.le(q70Var3, currentAccount, j13, j14, J, xnVar, resourceProvider), false);
            org.telegram.ui.ActionBar.g1 y11 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new dg.u1(q70Var3, resourceProvider, currentAccount, ioVar, 16), false);
            g6Var = g6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new hg.s0(q70Var3, j13, j14, xnVar, resourceProvider, 8), false);
            J.c(0, "", new mh.u7(q70Var3, currentAccount, j13, j14, xnVar, resourceProvider), false);
            new org.telegram.messenger.t9(currentAccount, j13, j14, J.y(), y11).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j10, tL_forumTopic.f20897id);
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
            Runnable jy0Var = new jy0(w21Var, messagesController, tL_forumTopic, q70Var3, J, 1);
            q70Var = q70Var3;
            q70Var.c(i20, string2, jy0Var, false);
            TLRPC.Chat chat6 = chat2;
            if (ChatObject.canManageTopic(i18, chat6, tL_forumTopic) && !UserObject.isBotForum(user)) {
                boolean z10 = tL_forumTopic.closed;
                if (z10) {
                    i16 = R.drawable.msg_topic_restart;
                } else {
                    i16 = R.drawable.msg_topic_close;
                }
                if (z10) {
                    i17 = R.string.RestartTopic;
                } else {
                    i17 = R.string.CloseTopic;
                }
                q70Var.c(i16, LocaleController.getString(i17), new Runnable(w21Var) {
                    public final w21 f27072b;

                    {
                        this.f27072b = w21Var;
                    }

                    @Override
                    public final void run() {
                        boolean z102;
                        int i202 = r4;
                        w21 w21Var3 = this.f27072b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        q70 q70Var32 = q70Var;
                        switch (i202) {
                            case 0:
                                q70Var32.u();
                                w21Var3.h.presentFragment(oe1.a0(-w21Var3.f32622c, tL_forumTopic2.f20897id));
                                return;
                            case 1:
                                w21Var3.getClass();
                                q70Var32.u();
                                MessagesController.getInstance(w21Var3.f32620b).getTopicsController().toggleCloseTopic(-w21Var3.f32622c, tL_forumTopic2.f20897id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                q70Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f20897id));
                                jc jcVar = new jc(16);
                                w21 w21Var4 = this.f27072b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                                d2Var.O = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = w21Var4.S;
                                if (hashSet.size() == 1) {
                                    z102 = false;
                                    d2Var.Q = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(w21Var4.f32620b).getTopicsController().findTopic(-w21Var4.f32622c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z102 = false;
                                    d2Var.Q = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mh.a3(w21Var4, arrayList, j132, hashSet, jcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh0(12));
                                d2Var.show();
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, z102));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            if (ChatObject.canDeleteTopic(i18, chat6, tL_forumTopic)) {
                q70Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1), new Runnable(w21Var) {
                    public final w21 f27072b;

                    {
                        this.f27072b = w21Var;
                    }

                    @Override
                    public final void run() {
                        boolean z102;
                        int i202 = r4;
                        w21 w21Var3 = this.f27072b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        q70 q70Var32 = q70Var;
                        switch (i202) {
                            case 0:
                                q70Var32.u();
                                w21Var3.h.presentFragment(oe1.a0(-w21Var3.f32622c, tL_forumTopic2.f20897id));
                                return;
                            case 1:
                                w21Var3.getClass();
                                q70Var32.u();
                                MessagesController.getInstance(w21Var3.f32620b).getTopicsController().toggleCloseTopic(-w21Var3.f32622c, tL_forumTopic2.f20897id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                q70Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f20897id));
                                jc jcVar = new jc(16);
                                w21 w21Var4 = this.f27072b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                                d2Var.O = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = w21Var4.S;
                                if (hashSet.size() == 1) {
                                    z102 = false;
                                    d2Var.Q = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(w21Var4.f32620b).getTopicsController().findTopic(-w21Var4.f32622c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z102 = false;
                                    d2Var.Q = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mh.a3(w21Var4, arrayList, j132, hashSet, jcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh0(12));
                                d2Var.show();
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, z102));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
        }
        if (view instanceof r21) {
            yv yvVar = new yv(i14, b10);
            Paint paint = new Paint((int) r11);
            yvVar.f33669c = paint;
            yvVar.f33668b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, g6Var));
            q70Var.W(yvVar);
            q70Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21661d6, g6Var);
            float f10 = b10;
            float f11 = dp;
            float f12 = dp2;
            float[] fArr = new float[i15];
            fArr[b10] = f10;
            fArr[r11] = f10;
            fArr[i14] = f11;
            fArr[3] = f11;
            fArr[4] = f12;
            fArr[5] = f12;
            fArr[6] = f10;
            fArr[7] = f10;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(v02);
            q70Var.W(shapeDrawable);
        }
        q70Var.Z();
        return r11;
    }

    public static ImageView i(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        k7.e6.a(imageView);
        return imageView;
    }

    private void setAttached(boolean z4) {
        if (this.T == z4) {
            return;
        }
        this.T = z4;
        long j10 = this.f32622c;
        int i10 = this.f32620b;
        if (z4) {
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
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        n();
    }

    public final void d(boolean z4) {
        float f10;
        if (this.N == z4) {
            return;
        }
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.P) {
                this.Q = Boolean.valueOf(z4);
                return;
            }
        }
        if (!z4) {
            this.M = !this.M;
        }
        this.N = z4;
        this.P = true;
        float f11 = this.O;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.R = ofFloat;
        ofFloat.addUpdateListener(new k70(this, 28));
        this.R.addListener(new n21(this, z4));
        this.R.setInterpolator(xh.n.V);
        this.R.setDuration(250L);
        this.R.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.topicsDidLoaded;
        long j10 = this.f32622c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == (-j10)) {
                o();
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
            MessagesController.getInstance(this.f32620b).getTopicsController().sortTopics(-j10, false);
            o();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.C;
        if (frameLayout.getVisibility() == 0) {
            this.H.setBounds((int) frameLayout.getTranslationX(), (int) this.K, (int) (frameLayout.getTranslationX() + AndroidUtilities.dp(78.0f)), (int) (getMeasuredHeight() - this.J));
            this.H.draw(canvas);
        }
        FrameLayout frameLayout2 = this.f32626r;
        if (frameLayout2.getVisibility() == 0) {
            this.I.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.I.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + AndroidUtilities.dp(50.0f)));
            this.I.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        canvas.save();
        if (view == this.C) {
            canvas.clipPath(this.H.h.f44875k);
        }
        if (view == this.f32626r) {
            canvas.clipPath(this.I.h.f44875k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        FrameLayout frameLayout = this.C;
        int paddingBottom = frameLayout.getPaddingBottom();
        int round = Math.round(this.J + this.K);
        if (paddingBottom == round) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, round);
    }

    public final void f(boolean z4) {
        boolean z10;
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f32620b).getTopicsController().getTopics(-this.f32622c);
        if (topics != null && !topics.isEmpty() && !this.f32619a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32618a.a(z10, z4);
    }

    public final void g() {
        int i10;
        int i11;
        int i12;
        xd.a aVar = this.G;
        float f10 = aVar.f50541e;
        ImageView imageView = this.f32628w;
        imageView.setAlpha(f10);
        imageView.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        int i13 = 8;
        int i14 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = this.f32629x;
        imageView2.setAlpha(f10);
        imageView2.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView2.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        if (i14 > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView2.setVisibility(i11);
        float f11 = 1.0f - aVar.f50541e;
        ImageView imageView3 = this.f32630y;
        imageView3.setAlpha(f11);
        imageView3.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        imageView3.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        int i15 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i15 > 0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView3.setVisibility(i12);
        ImageView imageView4 = this.B;
        imageView4.setAlpha(f11);
        imageView4.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        imageView4.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        if (i15 > 0) {
            i13 = 0;
        }
        imageView4.setVisibility(i13);
    }

    public s21 getCurrentTabsPosition() {
        if (this.N) {
            return s21.f30976b;
        }
        if (this.M) {
            return s21.f30977c;
        }
        return s21.f30975a;
    }

    public float getSideMenuT() {
        return this.O * this.f32618a.f50541e;
    }

    public final void h() {
        int i10;
        float lerp = AndroidUtilities.lerp(1.0f, 0.0f, this.O);
        FrameLayout frameLayout = this.f32626r;
        frameLayout.setAlpha(lerp);
        if ((1.0f - this.O) * this.f32618a.f50541e > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        if (this.M) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.J) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, j(s21.f30977c)));
        } else {
            frameLayout.setTranslationY(this.K + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, j(s21.f30975a)));
        }
    }

    public final float j(s21 s21Var) {
        float f10;
        float f11 = this.f32618a.f50541e;
        if (s21Var == s21.f30976b) {
            f10 = this.O;
        } else if ((s21Var == s21.f30975a && !this.M) || (s21Var == s21.f30977c && this.M)) {
            f10 = 1.0f - this.O;
        } else {
            return 0.0f;
        }
        return f10 * f11;
    }

    public final boolean k() {
        if (this.O > 0.5f) {
            int i10 = 0;
            while (true) {
                m21 m21Var = this.D;
                if (i10 >= m21Var.getChildCount()) {
                    break;
                }
                h51 G = m21Var.V2.G(RecyclerView.R(m21Var.getChildAt(i10)));
                if (G == null || !G.f27381r) {
                    i10++;
                } else {
                    return true;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                k21 k21Var = this.f32627s;
                if (i11 >= k21Var.getChildCount()) {
                    break;
                }
                h51 G2 = k21Var.V2.G(RecyclerView.R(k21Var.getChildAt(i11)));
                if (G2 != null && G2.f27381r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void l() {
        TopicsController topicsController = MessagesController.getInstance(this.f32620b).getTopicsController();
        long j10 = this.f32622c;
        if (!topicsController.endIsReached(-j10)) {
            topicsController.loadTopics(-j10);
        }
    }

    public final void m(long j10, boolean z4) {
        if (this.f32623e) {
            Utilities.Callback2 callback2 = this.W;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j10), Boolean.valueOf(z4));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.U;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j10), Boolean.valueOf(z4));
        }
    }

    public final void n() {
        org.telegram.ui.le leVar = this.L;
        if (leVar != null) {
            leVar.run();
        }
        h();
        float j10 = j(s21.f30976b);
        int i10 = 0;
        FrameLayout frameLayout = this.C;
        frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, j10));
        if (j10 <= 0.0f) {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        int i11 = org.telegram.ui.ActionBar.k6.f22055z6;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        int d = i0.a.d(1.0f - this.O, v02, org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f32630y.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.B.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.O, org.telegram.ui.ActionBar.k6.v0(i11, g6Var), org.telegram.ui.ActionBar.k6.v0(i12, g6Var)), mode));
        this.f32628w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i12, g6Var), mode));
        this.f32629x.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i12, g6Var), mode));
        invalidate();
    }

    public final void o() {
        f(true);
        k21 k21Var = this.f32627s;
        boolean canScrollHorizontally = k21Var.canScrollHorizontally(-1);
        k21Var.V2.N(true);
        if (!canScrollHorizontally) {
            k21Var.u0(0);
        }
        m21 m21Var = this.D;
        boolean canScrollVertically = m21Var.canScrollVertically(-1);
        m21Var.V2.N(true);
        if (!canScrollVertically) {
            m21Var.u0(0);
        }
        AndroidUtilities.runOnUIThread(new f21(this, 1));
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

    public void setAllTopicsHidden(boolean z4) {
        if (this.f32619a0 != z4) {
            this.f32619a0 = z4;
            f(true);
        }
    }

    public void setCurrentTopic(long j10) {
        boolean z4;
        this.S = j10;
        k21 k21Var = this.f32627s;
        k21Var.V2.N(true);
        k21Var.invalidate();
        this.D.V2.N(true);
        v21 v21Var = this.v;
        if (v21Var != null) {
            if (j10 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            v21Var.c(true, false, z4);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.W = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.V = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.U = callback2;
    }

    public void setSideMenuBackgroundDrawable(qg.b bVar) {
        this.H = bVar;
        bVar.p(AndroidUtilities.dp(16.0f));
        this.H.o(AndroidUtilities.dp(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f10) {
        this.J = f10;
        h();
        e();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f10) {
        this.K = f10;
        this.C.setTranslationY(f10);
        h();
        e();
        invalidate();
    }

    public void setTopMenuBackgroundDrawable(qg.b bVar) {
        this.I = bVar;
        bVar.p(AndroidUtilities.dp(18.0f));
        this.I.o(AndroidUtilities.dp(7.0f));
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
