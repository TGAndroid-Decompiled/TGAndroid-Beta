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
import org.telegram.ui.sd1;

public final class d21 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ud.b {

    public static final int f27622b0 = 0;
    public final ImageView A;
    public final FrameLayout B;
    public final t11 C;
    public long D;
    public long E;
    public final ud.a F;
    public lg.d G;
    public lg.d H;
    public float I;
    public float J;
    public org.telegram.ui.ge K;
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

    public final ud.a f27623a;

    public final HashSet f27624a0;

    public final int f27625b;

    public final long f27626c;
    public final org.telegram.ui.ActionBar.c6 d;

    public final boolean f27627e;

    public final boolean f27628f;
    public final org.telegram.ui.rn h;

    public final boolean f27629n;

    public final FrameLayout f27630r;

    public final r11 f27631s;
    public final c21 v;

    public final ImageView f27632w;

    public final ImageView f27633x;

    public final ImageView f27634y;

    public d21(Activity activity, org.telegram.ui.rn rnVar, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        ViewGroup viewGroup;
        super(activity);
        er erVar = er.h;
        this.f27623a = new ud.a(0, this, erVar, 380L, true);
        this.F = new ud.a(0, new k11(this), erVar, 320L, false);
        this.N = 0.0f;
        this.f27624a0 = new HashSet();
        this.h = rnVar;
        this.f27625b = i10;
        this.f27626c = j10;
        this.d = c6Var;
        long j11 = -j10;
        this.f27627e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)));
        boolean zIsBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        this.f27628f = zIsBotForumWithEditableTopics;
        this.f27629n = !org.telegram.messenger.y1.w("topics_end_reached_", j11, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f27630r = frameLayout;
        addView(frameLayout, h7.z5.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.B = frameLayout2;
        addView(frameLayout2, h7.z5.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        final int i11 = 0;
        r11 r11Var = new r11(this, activity, i10, new Utilities.Callback2(this) {

            public final d21 f31761b;

            {
                this.f31761b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i12;
                boolean z11;
                TLRPC.User user;
                int i13 = i11;
                d21 d21Var = this.f31761b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b51 b51Var = (b51) obj2;
                        boolean z12 = d21Var.f27628f;
                        int i14 = d21Var.f27625b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j12 = d21Var.f27626c;
                        long j13 = -j12;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j13));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j12));
                        TopicsController topicsController = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j13);
                        boolean z13 = d21Var.f27627e;
                        int i15 = x11.f34440a;
                        n41 n41VarJ = n41.J(x11.class);
                        n41VarJ.d = 0;
                        n41VarJ.B = 0L;
                        n41VarJ.G = null;
                        n41VarJ.f30849q = z13;
                        n41VarJ.K(d21Var.R == 0);
                        arrayList.add(n41VarJ);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z14 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                size = size;
                                if (z12) {
                                    i12 = i17;
                                    if (tL_forumTopic2.f22432id == 1) {
                                    }
                                    i16 = i12;
                                } else {
                                    i12 = i17;
                                }
                                if (d21Var.f27624a0.contains(Integer.valueOf(tL_forumTopic2.f22432id))) {
                                    i16 = i12;
                                } else {
                                    boolean z15 = tL_forumTopic2.pinned;
                                    if (!z15 && z14) {
                                        if (!arrayList.isEmpty()) {
                                            ((n41) i0.a.i(1, arrayList)).f30856y |= 8;
                                        }
                                        b51Var.L();
                                        z14 = false;
                                    } else if (z15 && !z14) {
                                        b51Var.M();
                                        z14 = true;
                                    }
                                    n41 n41VarJ2 = n41.J(x11.class);
                                    n41VarJ2.f30855x = j12;
                                    n41VarJ2.d = tL_forumTopic2.f22432id;
                                    n41VarJ2.G = tL_forumTopic2;
                                    if (z13) {
                                        n41VarJ2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        n41VarJ2.I = false;
                                    }
                                    n41VarJ2.K(d21Var.R == (z13 ? DialogObject.getPeerDialogId(tL_forumTopic2.from_id) : (long) tL_forumTopic2.f22432id));
                                    arrayList.add(n41VarJ2);
                                    i16 = i12;
                                    z14 = z14;
                                }
                            }
                            z10 = z14;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            b51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController.endIsReached(j13) && d21Var.f27629n) {
                            n41 n41VarJ3 = n41.J(x11.class);
                            n41VarJ3.d = -2;
                            n41VarJ3.f30850r = true;
                            arrayList.add(n41VarJ3);
                            n41 n41VarJ4 = n41.J(x11.class);
                            n41VarJ4.d = -3;
                            n41VarJ4.f30850r = true;
                            arrayList.add(n41VarJ4);
                            n41 n41VarJ5 = n41.J(x11.class);
                            n41VarJ5.d = -4;
                            n41VarJ5.f30850r = true;
                            arrayList.add(n41VarJ5);
                        }
                        if (!z12 && !z13) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                n41 n41VarJ6 = n41.J(x11.class);
                                n41VarJ6.d = -2;
                                n41VarJ6.B = -2L;
                                n41VarJ6.G = null;
                                arrayList.add(n41VarJ6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        d21.b(d21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        b51 b51Var2 = (b51) obj2;
                        boolean z16 = d21Var.f27627e;
                        int i18 = d21Var.f27625b;
                        MessagesController messagesController2 = MessagesController.getInstance(i18);
                        long j14 = d21Var.f27626c;
                        long j15 = -j14;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j15));
                        TLRPC.User user3 = MessagesController.getInstance(i18).getUser(Long.valueOf(j14));
                        TopicsController topicsController2 = MessagesController.getInstance(i18).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController2.getTopics(j15);
                        boolean z17 = d21Var.f27628f;
                        if (!z17) {
                            int i19 = b21.f26896a;
                            n41 n41VarJ7 = n41.J(b21.class);
                            n41VarJ7.d = 0;
                            n41VarJ7.B = 0L;
                            n41VarJ7.G = null;
                            n41VarJ7.f30849q = z16;
                            n41VarJ7.f30856y = z17 ? 1 : 0;
                            n41VarJ7.K(d21Var.R == 0);
                            arrayList2.add(n41VarJ7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z11 = false;
                            int i20 = 0;
                            while (i20 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i20);
                                i20++;
                                size2 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                chat2 = chat2;
                                if (z17) {
                                    user = user3;
                                    if (tL_forumTopic4.f22432id == 1) {
                                    }
                                    user3 = user;
                                } else {
                                    user = user3;
                                }
                                if (d21Var.f27624a0.contains(Integer.valueOf(tL_forumTopic4.f22432id))) {
                                    user3 = user;
                                } else {
                                    boolean z18 = tL_forumTopic4.pinned;
                                    if (!z18 && z11) {
                                        b51Var2.L();
                                        z11 = false;
                                    } else if (z18 && !z11) {
                                        b51Var2.M();
                                        z11 = true;
                                    }
                                    int i21 = b21.f26896a;
                                    n41 n41VarJ8 = n41.J(b21.class);
                                    n41VarJ8.f30855x = j14;
                                    n41VarJ8.d = tL_forumTopic4.f22432id;
                                    n41VarJ8.G = tL_forumTopic4;
                                    if (z16) {
                                        n41VarJ8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        n41VarJ8.I = false;
                                    }
                                    n41VarJ8.K(d21Var.R == (z16 ? DialogObject.getPeerDialogId(tL_forumTopic4.from_id) : (long) tL_forumTopic4.f22432id));
                                    arrayList2.add(n41VarJ8);
                                    user3 = user;
                                    j14 = j14;
                                }
                            }
                        } else {
                            z11 = false;
                        }
                        TLRPC.Chat chat3 = chat2;
                        TLRPC.User user4 = user3;
                        if (z11) {
                            b51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController2.endIsReached(j15) && d21Var.f27629n) {
                            int i22 = b21.f26896a;
                            n41 n41VarJ9 = n41.J(b21.class);
                            n41VarJ9.d = -2;
                            n41VarJ9.f30850r = true;
                            n41VarJ9.f30838e = false;
                            arrayList2.add(n41VarJ9);
                            n41 n41VarJ10 = n41.J(b21.class);
                            n41VarJ10.d = -3;
                            n41VarJ10.f30850r = true;
                            n41VarJ10.f30838e = false;
                            arrayList2.add(n41VarJ10);
                            n41 n41VarJ11 = n41.J(b21.class);
                            n41VarJ11.d = -4;
                            n41VarJ11.f30850r = true;
                            n41VarJ11.f30838e = false;
                            arrayList2.add(n41VarJ11);
                        }
                        if (!z17 && !z16) {
                            if ((chat3 != null && ChatObject.canCreateTopic(chat3)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i23 = b21.f26896a;
                                n41 n41VarJ12 = n41.J(b21.class);
                                n41VarJ12.d = -2;
                                n41VarJ12.B = -2L;
                                n41VarJ12.G = null;
                                n41VarJ12.f30849q = false;
                                arrayList2.add(n41VarJ12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, new k11(this), new k11(this), c6Var);
        this.f27631s = r11Var;
        final int i12 = 1;
        r11Var.B1(new Utilities.Callback2(this) {

            public final d21 f31761b;

            {
                this.f31761b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i13;
                boolean z11;
                TLRPC.User user;
                int i14 = i12;
                d21 d21Var = this.f31761b;
                switch (i14) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b51 b51Var = (b51) obj2;
                        boolean z12 = d21Var.f27628f;
                        int i15 = d21Var.f27625b;
                        MessagesController messagesController = MessagesController.getInstance(i15);
                        long j12 = d21Var.f27626c;
                        long j13 = -j12;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j13));
                        TLRPC.User user2 = MessagesController.getInstance(i15).getUser(Long.valueOf(j12));
                        TopicsController topicsController = MessagesController.getInstance(i15).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j13);
                        boolean z13 = d21Var.f27627e;
                        int i16 = x11.f34440a;
                        n41 n41VarJ = n41.J(x11.class);
                        n41VarJ.d = 0;
                        n41VarJ.B = 0L;
                        n41VarJ.G = null;
                        n41VarJ.f30849q = z13;
                        n41VarJ.K(d21Var.R == 0);
                        arrayList.add(n41VarJ);
                        if (topics != null) {
                            int size = topics.size();
                            int i17 = 0;
                            boolean z14 = false;
                            while (i17 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i17);
                                int i18 = i17 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                size = size;
                                if (z12) {
                                    i13 = i18;
                                    if (tL_forumTopic2.f22432id == 1) {
                                    }
                                    i17 = i13;
                                } else {
                                    i13 = i18;
                                }
                                if (d21Var.f27624a0.contains(Integer.valueOf(tL_forumTopic2.f22432id))) {
                                    i17 = i13;
                                } else {
                                    boolean z15 = tL_forumTopic2.pinned;
                                    if (!z15 && z14) {
                                        if (!arrayList.isEmpty()) {
                                            ((n41) i0.a.i(1, arrayList)).f30856y |= 8;
                                        }
                                        b51Var.L();
                                        z14 = false;
                                    } else if (z15 && !z14) {
                                        b51Var.M();
                                        z14 = true;
                                    }
                                    n41 n41VarJ2 = n41.J(x11.class);
                                    n41VarJ2.f30855x = j12;
                                    n41VarJ2.d = tL_forumTopic2.f22432id;
                                    n41VarJ2.G = tL_forumTopic2;
                                    if (z13) {
                                        n41VarJ2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        n41VarJ2.I = false;
                                    }
                                    n41VarJ2.K(d21Var.R == (z13 ? DialogObject.getPeerDialogId(tL_forumTopic2.from_id) : (long) tL_forumTopic2.f22432id));
                                    arrayList.add(n41VarJ2);
                                    i17 = i13;
                                    z14 = z14;
                                }
                            }
                            z10 = z14;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            b51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController.endIsReached(j13) && d21Var.f27629n) {
                            n41 n41VarJ3 = n41.J(x11.class);
                            n41VarJ3.d = -2;
                            n41VarJ3.f30850r = true;
                            arrayList.add(n41VarJ3);
                            n41 n41VarJ4 = n41.J(x11.class);
                            n41VarJ4.d = -3;
                            n41VarJ4.f30850r = true;
                            arrayList.add(n41VarJ4);
                            n41 n41VarJ5 = n41.J(x11.class);
                            n41VarJ5.d = -4;
                            n41VarJ5.f30850r = true;
                            arrayList.add(n41VarJ5);
                        }
                        if (!z12 && !z13) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                n41 n41VarJ6 = n41.J(x11.class);
                                n41VarJ6.d = -2;
                                n41VarJ6.B = -2L;
                                n41VarJ6.G = null;
                                arrayList.add(n41VarJ6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        d21.b(d21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        b51 b51Var2 = (b51) obj2;
                        boolean z16 = d21Var.f27627e;
                        int i19 = d21Var.f27625b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j14 = d21Var.f27626c;
                        long j15 = -j14;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j15));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j14));
                        TopicsController topicsController2 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController2.getTopics(j15);
                        boolean z17 = d21Var.f27628f;
                        if (!z17) {
                            int i110 = b21.f26896a;
                            n41 n41VarJ7 = n41.J(b21.class);
                            n41VarJ7.d = 0;
                            n41VarJ7.B = 0L;
                            n41VarJ7.G = null;
                            n41VarJ7.f30849q = z16;
                            n41VarJ7.f30856y = z17 ? 1 : 0;
                            n41VarJ7.K(d21Var.R == 0);
                            arrayList2.add(n41VarJ7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z11 = false;
                            int i20 = 0;
                            while (i20 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i20);
                                i20++;
                                size2 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                chat2 = chat2;
                                if (z17) {
                                    user = user3;
                                    if (tL_forumTopic4.f22432id == 1) {
                                    }
                                    user3 = user;
                                } else {
                                    user = user3;
                                }
                                if (d21Var.f27624a0.contains(Integer.valueOf(tL_forumTopic4.f22432id))) {
                                    user3 = user;
                                } else {
                                    boolean z18 = tL_forumTopic4.pinned;
                                    if (!z18 && z11) {
                                        b51Var2.L();
                                        z11 = false;
                                    } else if (z18 && !z11) {
                                        b51Var2.M();
                                        z11 = true;
                                    }
                                    int i21 = b21.f26896a;
                                    n41 n41VarJ8 = n41.J(b21.class);
                                    n41VarJ8.f30855x = j14;
                                    n41VarJ8.d = tL_forumTopic4.f22432id;
                                    n41VarJ8.G = tL_forumTopic4;
                                    if (z16) {
                                        n41VarJ8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        n41VarJ8.I = false;
                                    }
                                    n41VarJ8.K(d21Var.R == (z16 ? DialogObject.getPeerDialogId(tL_forumTopic4.from_id) : (long) tL_forumTopic4.f22432id));
                                    arrayList2.add(n41VarJ8);
                                    user3 = user;
                                    j14 = j14;
                                }
                            }
                        } else {
                            z11 = false;
                        }
                        TLRPC.Chat chat3 = chat2;
                        TLRPC.User user4 = user3;
                        if (z11) {
                            b51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController2.endIsReached(j15) && d21Var.f27629n) {
                            int i22 = b21.f26896a;
                            n41 n41VarJ9 = n41.J(b21.class);
                            n41VarJ9.d = -2;
                            n41VarJ9.f30850r = true;
                            n41VarJ9.f30838e = false;
                            arrayList2.add(n41VarJ9);
                            n41 n41VarJ10 = n41.J(b21.class);
                            n41VarJ10.d = -3;
                            n41VarJ10.f30850r = true;
                            n41VarJ10.f30838e = false;
                            arrayList2.add(n41VarJ10);
                            n41 n41VarJ11 = n41.J(b21.class);
                            n41VarJ11.d = -4;
                            n41VarJ11.f30850r = true;
                            n41VarJ11.f30838e = false;
                            arrayList2.add(n41VarJ11);
                        }
                        if (!z17 && !z16) {
                            if ((chat3 != null && ChatObject.canCreateTopic(chat3)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i23 = b21.f26896a;
                                n41 n41VarJ12 = n41.J(b21.class);
                                n41VarJ12.d = -2;
                                n41VarJ12.B = -2L;
                                n41VarJ12.G = null;
                                n41VarJ12.f30849q = false;
                                arrayList2.add(n41VarJ12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, false);
        r11Var.setWillNotDraw(false);
        r11Var.U2.f26942r = false;
        r11Var.getContext();
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq((ViewGroup) r11Var, 4);
        r11Var.T2 = vqVar;
        r11Var.setLayoutManager(vqVar);
        frameLayout.addView(r11Var, h7.z5.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        r11Var.j(new s11(this, 0));
        if (zIsBotForumWithEditableTopics) {
            c21 c21Var = new c21(activity, i10, c6Var);
            this.v = c21Var;
            c21Var.c(true, false, this.R == 0);
            final int i13 = 2;
            c21Var.setOnClickListener(new View.OnClickListener(this) {

                public final d21 f31140b;

                {
                    this.f31140b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            d21 d21Var = this.f31140b;
                            Boolean bool = d21Var.P;
                            boolean z10 = false;
                            if (bool == null ? !d21Var.M : !bool.booleanValue()) {
                                z10 = true;
                            }
                            d21Var.d(z10);
                            break;
                        case 1:
                            d21 d21Var2 = this.f31140b;
                            t11 t11Var = d21Var2.C;
                            t11Var.w1(false);
                            r11 r11Var2 = d21Var2.f27631s;
                            r11Var2.w1(false);
                            d21Var2.F.a(false, true);
                            AndroidUtilities.updateVisibleRows(t11Var);
                            AndroidUtilities.updateVisibleRows(r11Var2);
                            break;
                        default:
                            this.f31140b.T.run(0, Boolean.FALSE);
                            break;
                    }
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(c21Var, h7.z5.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            viewGroup = frameLayout2;
            this.v = null;
        }
        final int i14 = 2;
        ViewGroup viewGroup2 = viewGroup;
        t11 t11Var = new t11(activity, i10, new Utilities.Callback2(this) {

            public final d21 f31761b;

            {
                this.f31761b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i15;
                boolean z11;
                TLRPC.User user;
                int i16 = i14;
                d21 d21Var = this.f31761b;
                switch (i16) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b51 b51Var = (b51) obj2;
                        boolean z12 = d21Var.f27628f;
                        int i17 = d21Var.f27625b;
                        MessagesController messagesController = MessagesController.getInstance(i17);
                        long j12 = d21Var.f27626c;
                        long j13 = -j12;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j13));
                        TLRPC.User user2 = MessagesController.getInstance(i17).getUser(Long.valueOf(j12));
                        TopicsController topicsController = MessagesController.getInstance(i17).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j13);
                        boolean z13 = d21Var.f27627e;
                        int i18 = x11.f34440a;
                        n41 n41VarJ = n41.J(x11.class);
                        n41VarJ.d = 0;
                        n41VarJ.B = 0L;
                        n41VarJ.G = null;
                        n41VarJ.f30849q = z13;
                        n41VarJ.K(d21Var.R == 0);
                        arrayList.add(n41VarJ);
                        if (topics != null) {
                            int size = topics.size();
                            int i19 = 0;
                            boolean z14 = false;
                            while (i19 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i19);
                                int i110 = i19 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                size = size;
                                if (z12) {
                                    i15 = i110;
                                    if (tL_forumTopic2.f22432id == 1) {
                                    }
                                    i19 = i15;
                                } else {
                                    i15 = i110;
                                }
                                if (d21Var.f27624a0.contains(Integer.valueOf(tL_forumTopic2.f22432id))) {
                                    i19 = i15;
                                } else {
                                    boolean z15 = tL_forumTopic2.pinned;
                                    if (!z15 && z14) {
                                        if (!arrayList.isEmpty()) {
                                            ((n41) i0.a.i(1, arrayList)).f30856y |= 8;
                                        }
                                        b51Var.L();
                                        z14 = false;
                                    } else if (z15 && !z14) {
                                        b51Var.M();
                                        z14 = true;
                                    }
                                    n41 n41VarJ2 = n41.J(x11.class);
                                    n41VarJ2.f30855x = j12;
                                    n41VarJ2.d = tL_forumTopic2.f22432id;
                                    n41VarJ2.G = tL_forumTopic2;
                                    if (z13) {
                                        n41VarJ2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        n41VarJ2.I = false;
                                    }
                                    n41VarJ2.K(d21Var.R == (z13 ? DialogObject.getPeerDialogId(tL_forumTopic2.from_id) : (long) tL_forumTopic2.f22432id));
                                    arrayList.add(n41VarJ2);
                                    i19 = i15;
                                    z14 = z14;
                                }
                            }
                            z10 = z14;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            b51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController.endIsReached(j13) && d21Var.f27629n) {
                            n41 n41VarJ3 = n41.J(x11.class);
                            n41VarJ3.d = -2;
                            n41VarJ3.f30850r = true;
                            arrayList.add(n41VarJ3);
                            n41 n41VarJ4 = n41.J(x11.class);
                            n41VarJ4.d = -3;
                            n41VarJ4.f30850r = true;
                            arrayList.add(n41VarJ4);
                            n41 n41VarJ5 = n41.J(x11.class);
                            n41VarJ5.d = -4;
                            n41VarJ5.f30850r = true;
                            arrayList.add(n41VarJ5);
                        }
                        if (!z12 && !z13) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                n41 n41VarJ6 = n41.J(x11.class);
                                n41VarJ6.d = -2;
                                n41VarJ6.B = -2L;
                                n41VarJ6.G = null;
                                arrayList.add(n41VarJ6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        d21.b(d21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        b51 b51Var2 = (b51) obj2;
                        boolean z16 = d21Var.f27627e;
                        int i111 = d21Var.f27625b;
                        MessagesController messagesController2 = MessagesController.getInstance(i111);
                        long j14 = d21Var.f27626c;
                        long j15 = -j14;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j15));
                        TLRPC.User user3 = MessagesController.getInstance(i111).getUser(Long.valueOf(j14));
                        TopicsController topicsController2 = MessagesController.getInstance(i111).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController2.getTopics(j15);
                        boolean z17 = d21Var.f27628f;
                        if (!z17) {
                            int i112 = b21.f26896a;
                            n41 n41VarJ7 = n41.J(b21.class);
                            n41VarJ7.d = 0;
                            n41VarJ7.B = 0L;
                            n41VarJ7.G = null;
                            n41VarJ7.f30849q = z16;
                            n41VarJ7.f30856y = z17 ? 1 : 0;
                            n41VarJ7.K(d21Var.R == 0);
                            arrayList2.add(n41VarJ7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z11 = false;
                            int i20 = 0;
                            while (i20 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i20);
                                i20++;
                                size2 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                chat2 = chat2;
                                if (z17) {
                                    user = user3;
                                    if (tL_forumTopic4.f22432id == 1) {
                                    }
                                    user3 = user;
                                } else {
                                    user = user3;
                                }
                                if (d21Var.f27624a0.contains(Integer.valueOf(tL_forumTopic4.f22432id))) {
                                    user3 = user;
                                } else {
                                    boolean z18 = tL_forumTopic4.pinned;
                                    if (!z18 && z11) {
                                        b51Var2.L();
                                        z11 = false;
                                    } else if (z18 && !z11) {
                                        b51Var2.M();
                                        z11 = true;
                                    }
                                    int i21 = b21.f26896a;
                                    n41 n41VarJ8 = n41.J(b21.class);
                                    n41VarJ8.f30855x = j14;
                                    n41VarJ8.d = tL_forumTopic4.f22432id;
                                    n41VarJ8.G = tL_forumTopic4;
                                    if (z16) {
                                        n41VarJ8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        n41VarJ8.I = false;
                                    }
                                    n41VarJ8.K(d21Var.R == (z16 ? DialogObject.getPeerDialogId(tL_forumTopic4.from_id) : (long) tL_forumTopic4.f22432id));
                                    arrayList2.add(n41VarJ8);
                                    user3 = user;
                                    j14 = j14;
                                }
                            }
                        } else {
                            z11 = false;
                        }
                        TLRPC.Chat chat3 = chat2;
                        TLRPC.User user4 = user3;
                        if (z11) {
                            b51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController2.endIsReached(j15) && d21Var.f27629n) {
                            int i22 = b21.f26896a;
                            n41 n41VarJ9 = n41.J(b21.class);
                            n41VarJ9.d = -2;
                            n41VarJ9.f30850r = true;
                            n41VarJ9.f30838e = false;
                            arrayList2.add(n41VarJ9);
                            n41 n41VarJ10 = n41.J(b21.class);
                            n41VarJ10.d = -3;
                            n41VarJ10.f30850r = true;
                            n41VarJ10.f30838e = false;
                            arrayList2.add(n41VarJ10);
                            n41 n41VarJ11 = n41.J(b21.class);
                            n41VarJ11.d = -4;
                            n41VarJ11.f30850r = true;
                            n41VarJ11.f30838e = false;
                            arrayList2.add(n41VarJ11);
                        }
                        if (!z17 && !z16) {
                            if ((chat3 != null && ChatObject.canCreateTopic(chat3)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i23 = b21.f26896a;
                                n41 n41VarJ12 = n41.J(b21.class);
                                n41VarJ12.d = -2;
                                n41VarJ12.B = -2L;
                                n41VarJ12.G = null;
                                n41VarJ12.f30849q = false;
                                arrayList2.add(n41VarJ12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, new k11(this), new k11(this), c6Var);
        this.C = t11Var;
        final int i15 = 1;
        t11Var.B1(new Utilities.Callback2(this) {

            public final d21 f31761b;

            {
                this.f31761b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i16;
                boolean z11;
                TLRPC.User user;
                int i17 = i15;
                d21 d21Var = this.f31761b;
                switch (i17) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b51 b51Var = (b51) obj2;
                        boolean z12 = d21Var.f27628f;
                        int i18 = d21Var.f27625b;
                        MessagesController messagesController = MessagesController.getInstance(i18);
                        long j12 = d21Var.f27626c;
                        long j13 = -j12;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j13));
                        TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(j12));
                        TopicsController topicsController = MessagesController.getInstance(i18).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j13);
                        boolean z13 = d21Var.f27627e;
                        int i19 = x11.f34440a;
                        n41 n41VarJ = n41.J(x11.class);
                        n41VarJ.d = 0;
                        n41VarJ.B = 0L;
                        n41VarJ.G = null;
                        n41VarJ.f30849q = z13;
                        n41VarJ.K(d21Var.R == 0);
                        arrayList.add(n41VarJ);
                        if (topics != null) {
                            int size = topics.size();
                            int i110 = 0;
                            boolean z14 = false;
                            while (i110 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i110);
                                int i111 = i110 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                size = size;
                                if (z12) {
                                    i16 = i111;
                                    if (tL_forumTopic2.f22432id == 1) {
                                    }
                                    i110 = i16;
                                } else {
                                    i16 = i111;
                                }
                                if (d21Var.f27624a0.contains(Integer.valueOf(tL_forumTopic2.f22432id))) {
                                    i110 = i16;
                                } else {
                                    boolean z15 = tL_forumTopic2.pinned;
                                    if (!z15 && z14) {
                                        if (!arrayList.isEmpty()) {
                                            ((n41) i0.a.i(1, arrayList)).f30856y |= 8;
                                        }
                                        b51Var.L();
                                        z14 = false;
                                    } else if (z15 && !z14) {
                                        b51Var.M();
                                        z14 = true;
                                    }
                                    n41 n41VarJ2 = n41.J(x11.class);
                                    n41VarJ2.f30855x = j12;
                                    n41VarJ2.d = tL_forumTopic2.f22432id;
                                    n41VarJ2.G = tL_forumTopic2;
                                    if (z13) {
                                        n41VarJ2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        n41VarJ2.I = false;
                                    }
                                    n41VarJ2.K(d21Var.R == (z13 ? DialogObject.getPeerDialogId(tL_forumTopic2.from_id) : (long) tL_forumTopic2.f22432id));
                                    arrayList.add(n41VarJ2);
                                    i110 = i16;
                                    z14 = z14;
                                }
                            }
                            z10 = z14;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            b51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController.endIsReached(j13) && d21Var.f27629n) {
                            n41 n41VarJ3 = n41.J(x11.class);
                            n41VarJ3.d = -2;
                            n41VarJ3.f30850r = true;
                            arrayList.add(n41VarJ3);
                            n41 n41VarJ4 = n41.J(x11.class);
                            n41VarJ4.d = -3;
                            n41VarJ4.f30850r = true;
                            arrayList.add(n41VarJ4);
                            n41 n41VarJ5 = n41.J(x11.class);
                            n41VarJ5.d = -4;
                            n41VarJ5.f30850r = true;
                            arrayList.add(n41VarJ5);
                        }
                        if (!z12 && !z13) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                n41 n41VarJ6 = n41.J(x11.class);
                                n41VarJ6.d = -2;
                                n41VarJ6.B = -2L;
                                n41VarJ6.G = null;
                                arrayList.add(n41VarJ6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        d21.b(d21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        b51 b51Var2 = (b51) obj2;
                        boolean z16 = d21Var.f27627e;
                        int i112 = d21Var.f27625b;
                        MessagesController messagesController2 = MessagesController.getInstance(i112);
                        long j14 = d21Var.f27626c;
                        long j15 = -j14;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j15));
                        TLRPC.User user3 = MessagesController.getInstance(i112).getUser(Long.valueOf(j14));
                        TopicsController topicsController2 = MessagesController.getInstance(i112).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController2.getTopics(j15);
                        boolean z17 = d21Var.f27628f;
                        if (!z17) {
                            int i113 = b21.f26896a;
                            n41 n41VarJ7 = n41.J(b21.class);
                            n41VarJ7.d = 0;
                            n41VarJ7.B = 0L;
                            n41VarJ7.G = null;
                            n41VarJ7.f30849q = z16;
                            n41VarJ7.f30856y = z17 ? 1 : 0;
                            n41VarJ7.K(d21Var.R == 0);
                            arrayList2.add(n41VarJ7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z11 = false;
                            int i20 = 0;
                            while (i20 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i20);
                                i20++;
                                size2 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                chat2 = chat2;
                                if (z17) {
                                    user = user3;
                                    if (tL_forumTopic4.f22432id == 1) {
                                    }
                                    user3 = user;
                                } else {
                                    user = user3;
                                }
                                if (d21Var.f27624a0.contains(Integer.valueOf(tL_forumTopic4.f22432id))) {
                                    user3 = user;
                                } else {
                                    boolean z18 = tL_forumTopic4.pinned;
                                    if (!z18 && z11) {
                                        b51Var2.L();
                                        z11 = false;
                                    } else if (z18 && !z11) {
                                        b51Var2.M();
                                        z11 = true;
                                    }
                                    int i21 = b21.f26896a;
                                    n41 n41VarJ8 = n41.J(b21.class);
                                    n41VarJ8.f30855x = j14;
                                    n41VarJ8.d = tL_forumTopic4.f22432id;
                                    n41VarJ8.G = tL_forumTopic4;
                                    if (z16) {
                                        n41VarJ8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        n41VarJ8.I = false;
                                    }
                                    n41VarJ8.K(d21Var.R == (z16 ? DialogObject.getPeerDialogId(tL_forumTopic4.from_id) : (long) tL_forumTopic4.f22432id));
                                    arrayList2.add(n41VarJ8);
                                    user3 = user;
                                    j14 = j14;
                                }
                            }
                        } else {
                            z11 = false;
                        }
                        TLRPC.Chat chat3 = chat2;
                        TLRPC.User user4 = user3;
                        if (z11) {
                            b51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController2.endIsReached(j15) && d21Var.f27629n) {
                            int i22 = b21.f26896a;
                            n41 n41VarJ9 = n41.J(b21.class);
                            n41VarJ9.d = -2;
                            n41VarJ9.f30850r = true;
                            n41VarJ9.f30838e = false;
                            arrayList2.add(n41VarJ9);
                            n41 n41VarJ10 = n41.J(b21.class);
                            n41VarJ10.d = -3;
                            n41VarJ10.f30850r = true;
                            n41VarJ10.f30838e = false;
                            arrayList2.add(n41VarJ10);
                            n41 n41VarJ11 = n41.J(b21.class);
                            n41VarJ11.d = -4;
                            n41VarJ11.f30850r = true;
                            n41VarJ11.f30838e = false;
                            arrayList2.add(n41VarJ11);
                        }
                        if (!z17 && !z16) {
                            if ((chat3 != null && ChatObject.canCreateTopic(chat3)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i23 = b21.f26896a;
                                n41 n41VarJ12 = n41.J(b21.class);
                                n41VarJ12.d = -2;
                                n41VarJ12.B = -2L;
                                n41VarJ12.G = null;
                                n41VarJ12.f30849q = false;
                                arrayList2.add(n41VarJ12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, false);
        t11Var.U2.f26942r = false;
        t11Var.setClipToPadding(false);
        t11Var.setClipChildren(false);
        viewGroup2.addView(t11Var, h7.z5.d(-1, -1.0f, 119, 0.0f, zIsBotForumWithEditableTopics ? 90.0f : 48.0f, 0.0f, 0.0f));
        t11Var.j(new s11(this, 1));
        final int i16 = 0;
        ImageView imageViewI = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {

            public final d21 f31140b;

            {
                this.f31140b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        d21 d21Var = this.f31140b;
                        Boolean bool = d21Var.P;
                        boolean z10 = false;
                        if (bool == null ? !d21Var.M : !bool.booleanValue()) {
                            z10 = true;
                        }
                        d21Var.d(z10);
                        break;
                    case 1:
                        d21 d21Var2 = this.f31140b;
                        t11 t11Var2 = d21Var2.C;
                        t11Var2.w1(false);
                        r11 r11Var2 = d21Var2.f27631s;
                        r11Var2.w1(false);
                        d21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(t11Var2);
                        AndroidUtilities.updateVisibleRows(r11Var2);
                        break;
                    default:
                        this.f31140b.T.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.f27634y = imageViewI;
        final int i17 = 0;
        ImageView imageViewI2 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {

            public final d21 f31140b;

            {
                this.f31140b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        d21 d21Var = this.f31140b;
                        Boolean bool = d21Var.P;
                        boolean z10 = false;
                        if (bool == null ? !d21Var.M : !bool.booleanValue()) {
                            z10 = true;
                        }
                        d21Var.d(z10);
                        break;
                    case 1:
                        d21 d21Var2 = this.f31140b;
                        t11 t11Var2 = d21Var2.C;
                        t11Var2.w1(false);
                        r11 r11Var2 = d21Var2.f27631s;
                        r11Var2.w1(false);
                        d21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(t11Var2);
                        AndroidUtilities.updateVisibleRows(r11Var2);
                        break;
                    default:
                        this.f31140b.T.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.A = imageViewI2;
        frameLayout.addView(imageViewI, h7.z5.e(44, 36, 51));
        viewGroup2.addView(imageViewI2, h7.z5.e(64, 48, 51));
        final int i18 = 1;
        ImageView imageViewI3 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {

            public final d21 f31140b;

            {
                this.f31140b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        d21 d21Var = this.f31140b;
                        Boolean bool = d21Var.P;
                        boolean z10 = false;
                        if (bool == null ? !d21Var.M : !bool.booleanValue()) {
                            z10 = true;
                        }
                        d21Var.d(z10);
                        break;
                    case 1:
                        d21 d21Var2 = this.f31140b;
                        t11 t11Var2 = d21Var2.C;
                        t11Var2.w1(false);
                        r11 r11Var2 = d21Var2.f27631s;
                        r11Var2.w1(false);
                        d21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(t11Var2);
                        AndroidUtilities.updateVisibleRows(r11Var2);
                        break;
                    default:
                        this.f31140b.T.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.f27632w = imageViewI3;
        final int i19 = 1;
        ImageView imageViewI4 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {

            public final d21 f31140b;

            {
                this.f31140b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        d21 d21Var = this.f31140b;
                        Boolean bool = d21Var.P;
                        boolean z10 = false;
                        if (bool == null ? !d21Var.M : !bool.booleanValue()) {
                            z10 = true;
                        }
                        d21Var.d(z10);
                        break;
                    case 1:
                        d21 d21Var2 = this.f31140b;
                        t11 t11Var2 = d21Var2.C;
                        t11Var2.w1(false);
                        r11 r11Var2 = d21Var2.f27631s;
                        r11Var2.w1(false);
                        d21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(t11Var2);
                        AndroidUtilities.updateVisibleRows(r11Var2);
                        break;
                    default:
                        this.f31140b.T.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.f27633x = imageViewI4;
        frameLayout.addView(imageViewI3, h7.z5.e(44, 36, 51));
        viewGroup2.addView(imageViewI4, h7.z5.e(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j11, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.y1.w("topicssidetabs", j10, mainSettings, false)) {
            this.N = 1.0f;
            this.M = true;
        }
        boolean zW = org.telegram.messenger.y1.w("topicssidetabsb", j10, mainSettings, false);
        this.L = zW;
        imageViewI2.setImageResource(zW ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
        f(false);
        g();
        n();
        p();
    }

    public static void a(d21 d21Var, n41 n41Var) {
        if (d21Var.f27627e) {
            Utilities.Callback2 callback2 = d21Var.V;
            if (callback2 != null) {
                callback2.run(Long.valueOf(n41Var.B), Boolean.FALSE);
                return;
            }
            return;
        }
        if (n41Var.B == -2) {
            Runnable runnable = d21Var.U;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Utilities.Callback2 callback3 = d21Var.T;
        if (callback3 != null) {
            callback3.run(Integer.valueOf(n41Var.d), Boolean.FALSE);
        }
    }

    public static void b(d21 d21Var, ArrayList arrayList) {
        long j10 = d21Var.f27626c;
        TopicsController topicsController = MessagesController.getInstance(d21Var.f27625b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int iF = 0;
        while (iF < arrayList.size()) {
            iF = i0.a.f(((n41) arrayList.get(iF)).d, iF, 1, arrayList2);
        }
        long j11 = -j10;
        topicsController.reorderPinnedTopics(j11, arrayList2);
        topicsController.sortTopics(j11, false);
    }

    public static boolean c(final d21 d21Var, n41 n41Var, View view) {
        TLRPC.Chat chat;
        final d21 d21Var2;
        org.telegram.ui.ActionBar.c6 c6Var;
        final int i10;
        ?? r11;
        byte b10;
        int i11;
        final b70 b70Var;
        b70 b70Var2;
        org.telegram.ui.ActionBar.c6 c6Var2 = d21Var.d;
        org.telegram.ui.rn rnVar = d21Var.h;
        long j10 = d21Var.f27626c;
        int i12 = d21Var.f27625b;
        if (d21Var.C.Y2 || d21Var.f27631s.Y2) {
            return false;
        }
        Object obj = n41Var.G;
        if (!(obj instanceof TLRPC.TL_forumTopic)) {
            return false;
        }
        final TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
        MessagesController messagesController = MessagesController.getInstance(i12);
        TLRPC.Chat chat2 = j10 < 0 ? messagesController.getChat(Long.valueOf(-j10)) : null;
        TLRPC.User user = j10 > 0 ? messagesController.getUser(Long.valueOf(j10)) : null;
        final b70 b70VarI = b70.I(rnVar, view);
        if (ChatObject.isMonoForum(chat2)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i12, chat2)) {
                return false;
            }
            TLRPC.Chat chat3 = chat2;
            b70VarI.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new org.telegram.messenger.pg(d21Var, b70VarI, peerDialogId, chat2, 5), false);
            long j11 = chat3.f22380id;
            if (ChatObject.isMonoForum(chat3) && ChatObject.canManageMonoForum(i12, chat3)) {
                long j12 = chat3.linked_monoforum_id;
                if (j12 != 0) {
                    j11 = j12;
                }
            }
            TLRPC.Chat chat4 = MessagesController.getInstance(i12).getChat(Long.valueOf(j11));
            TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
            if (user2 == null || !ChatObject.canBlockUsers(chat4)) {
                b70Var2 = b70VarI;
                i11 = 8;
            } else {
                b70VarI.c(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), null, false);
                org.telegram.ui.ActionBar.f1 f1VarY = b70VarI.y();
                i11 = 8;
                f1VarY.setVisibility(8);
                MessagesController messagesController2 = MessagesController.getInstance(i12);
                hh.q2 q2Var = new hh.q2(d21Var, f1VarY, b70VarI, j11, user2, chat4);
                b70Var2 = b70VarI;
                messagesController2.checkIsInChat(true, chat4, user2, q2Var);
            }
            b70Var = b70Var2;
            c6Var = c6Var2;
            i10 = 2;
            r11 = 1;
            b10 = 0;
        } else {
            TLRPC.Chat chat5 = chat2;
            if (ChatObject.canManageTopics(chat5) || UserObject.isBotForumWithEditableTopics(user)) {
                boolean z10 = tL_forumTopic.pinned;
                int i13 = z10 ? R.drawable.msg_unpin : R.drawable.msg_pin;
                String string = LocaleController.getString(z10 ? R.string.DialogUnpin : R.string.DialogPin);
                int i14 = i13;
                chat = chat5;
                d21Var2 = d21Var;
                l11 l11Var = new l11(d21Var2, b70VarI, messagesController, tL_forumTopic, 0);
                b70VarI = b70VarI;
                messagesController = messagesController;
                tL_forumTopic = tL_forumTopic;
                int i15 = 0;
                b70VarI.c(i14, string, l11Var, false);
                if (tL_forumTopic.pinned) {
                    b70VarI.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new m11(d21Var2, i15), false);
                }
            } else {
                d21Var2 = d21Var;
                chat = chat5;
            }
            if (ChatObject.canManageTopics(chat) || UserObject.isBotForumWithEditableTopics(user)) {
                final int i16 = 0;
                b70VarI.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(d21Var2) {

                    public final d21 f30814b;

                    {
                        this.f30814b = d21Var2;
                    }

                    @Override
                    public final void run() {
                        boolean z11;
                        int i17 = i16;
                        d21 d21Var3 = this.f30814b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        b70 b70Var3 = b70VarI;
                        switch (i17) {
                            case 0:
                                b70Var3.u();
                                d21Var3.h.presentFragment(sd1.a0(-d21Var3.f27626c, tL_forumTopic2.f22432id));
                                break;
                            case 1:
                                d21Var3.getClass();
                                b70Var3.u();
                                MessagesController.getInstance(d21Var3.f27625b).getTopicsController().toggleCloseTopic(-d21Var3.f27626c, tL_forumTopic2.f22432id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                b70Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f22432id));
                                gc gcVar = new gc(15);
                                d21 d21Var4 = this.f30814b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                b2Var.N = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = d21Var4.R;
                                if (hashSet.size() == 1) {
                                    z11 = false;
                                    b2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(d21Var4.f27625b).getTopicsController().findTopic(-d21Var4.f27626c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z11 = false;
                                    b2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hh.c3(d21Var4, arrayList, j13, hashSet, gcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pc0(18));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, z11));
                                }
                                break;
                        }
                    }
                }, false);
            }
            long j13 = d21Var2.f27626c;
            long j14 = tL_forumTopic.f22432id;
            int currentAccount = rnVar.getCurrentAccount();
            org.telegram.ui.ActionBar.c6 resourceProvider = rnVar.getResourceProvider();
            b70 b70Var3 = b70VarI;
            xn xnVar = new xn(b70Var3, currentAccount, j13, j14, rnVar, resourceProvider);
            b70 b70VarJ = b70Var3.J();
            b70VarJ.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.lt0(b70Var3, 25), false);
            b70VarJ.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.ge(b70Var3, currentAccount, j13, j14, b70VarJ, rnVar, resourceProvider), false);
            org.telegram.ui.ActionBar.f1 f1VarY2 = b70VarJ.y();
            b70VarJ.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new ag.k0(b70Var3, resourceProvider, currentAccount, xnVar, 16), false);
            c6Var = c6Var2;
            b70VarJ.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new cg.t0(b70Var3, j13, j14, rnVar, resourceProvider, 8), false);
            b70VarJ.c(0, "", new hh.v7(b70Var3, currentAccount, j13, j14, rnVar, resourceProvider), false);
            new org.telegram.messenger.q9(currentAccount, j13, j14, b70VarJ.y(), f1VarY2).run();
            boolean zIsDialogMuted = messagesController.isDialogMuted(j10, tL_forumTopic.f22432id);
            int i17 = zIsDialogMuted ? R.drawable.msg_unmute : R.drawable.msg_mute;
            String string2 = LocaleController.getString(zIsDialogMuted ? R.string.Unmute : R.string.Mute);
            i10 = 2;
            r11 = 1;
            r11 = 1;
            b10 = 0;
            i11 = 8;
            l20 l20Var = new l20(d21Var, messagesController, tL_forumTopic, b70Var3, b70VarJ, 3);
            b70Var = b70Var3;
            b70Var.c(i17, string2, l20Var, false);
            TLRPC.Chat chat6 = chat;
            if (ChatObject.canManageTopic(i12, chat6, tL_forumTopic) && !UserObject.isBotForum(user)) {
                boolean z11 = tL_forumTopic.closed;
                int i18 = z11 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close;
                String string3 = LocaleController.getString(z11 ? R.string.RestartTopic : R.string.CloseTopic);
                final int i19 = r11 == true ? 1 : 0;
                b70Var.c(i18, string3, new Runnable(d21Var) {

                    public final d21 f30814b;

                    {
                        this.f30814b = d21Var;
                    }

                    @Override
                    public final void run() {
                        boolean z12;
                        int i110 = i19;
                        d21 d21Var3 = this.f30814b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        b70 b70Var4 = b70Var;
                        switch (i110) {
                            case 0:
                                b70Var4.u();
                                d21Var3.h.presentFragment(sd1.a0(-d21Var3.f27626c, tL_forumTopic2.f22432id));
                                break;
                            case 1:
                                d21Var3.getClass();
                                b70Var4.u();
                                MessagesController.getInstance(d21Var3.f27625b).getTopicsController().toggleCloseTopic(-d21Var3.f27626c, tL_forumTopic2.f22432id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                b70Var4.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f22432id));
                                gc gcVar = new gc(15);
                                d21 d21Var4 = this.f30814b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                b2Var.N = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j15 = d21Var4.R;
                                if (hashSet.size() == 1) {
                                    z12 = false;
                                    b2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(d21Var4.f27625b).getTopicsController().findTopic(-d21Var4.f27626c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z12 = false;
                                    b2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hh.c3(d21Var4, arrayList, j15, hashSet, gcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pc0(18));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, z12));
                                }
                                break;
                        }
                    }
                }, false);
            }
            if (ChatObject.canDeleteTopic(i12, chat6, tL_forumTopic)) {
                b70Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1), new Runnable(d21Var) {

                    public final d21 f30814b;

                    {
                        this.f30814b = d21Var;
                    }

                    @Override
                    public final void run() {
                        boolean z12;
                        int i110 = i10;
                        d21 d21Var3 = this.f30814b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        b70 b70Var4 = b70Var;
                        switch (i110) {
                            case 0:
                                b70Var4.u();
                                d21Var3.h.presentFragment(sd1.a0(-d21Var3.f27626c, tL_forumTopic2.f22432id));
                                break;
                            case 1:
                                d21Var3.getClass();
                                b70Var4.u();
                                MessagesController.getInstance(d21Var3.f27625b).getTopicsController().toggleCloseTopic(-d21Var3.f27626c, tL_forumTopic2.f22432id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                b70Var4.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f22432id));
                                gc gcVar = new gc(15);
                                d21 d21Var4 = this.f30814b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                b2Var.N = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j15 = d21Var4.R;
                                if (hashSet.size() == 1) {
                                    z12 = false;
                                    b2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(d21Var4.f27625b).getTopicsController().findTopic(-d21Var4.f27626c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z12 = false;
                                    b2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hh.c3(d21Var4, arrayList, j15, hashSet, gcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pc0(18));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, z12));
                                }
                                break;
                        }
                    }
                }, false);
            }
        }
        if (view instanceof y11) {
            lv lvVar = new lv(i10, b10);
            Paint paint = new Paint((int) r11);
            lvVar.f30473c = paint;
            lvVar.f30472b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
            b70Var.W(lvVar);
            b70Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int iDp = AndroidUtilities.dp(5.0f);
            int iDp2 = AndroidUtilities.dp(5.0f);
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var);
            float f10 = b10;
            float f11 = iDp;
            float f12 = iDp2;
            float[] fArr = new float[i11];
            fArr[b10] = f10;
            fArr[r11] = f10;
            fArr[i10] = f11;
            fArr[3] = f11;
            fArr[4] = f12;
            fArr[5] = f12;
            fArr[6] = f10;
            fArr[7] = f10;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(iV0);
            b70Var.W(shapeDrawable);
        }
        b70Var.Z();
        return r11;
    }

    public static ImageView i(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        h7.b6.a(imageView);
        return imageView;
    }

    private void setAttached(boolean z10) {
        if (this.S == z10) {
            return;
        }
        this.S = z10;
        long j10 = this.f27626c;
        int i10 = this.f27625b;
        if (z10) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
            MessagesController.getInstance(i10).getTopicsController().onTopicFragmentResume(-j10);
        } else {
            MessagesController.getInstance(i10).getTopicsController().onTopicFragmentPause(-j10);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        }
    }

    public final void d(boolean z10) {
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
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.N, z10 ? 1.0f : 0.0f);
        this.Q = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new v60(this, 28));
        this.Q.addListener(new u11(this, z10));
        this.Q.setInterpolator(sh.m.V);
        this.Q.setDuration(250L);
        this.Q.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.topicsDidLoaded;
        long j10 = this.f27626c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() != (-j10)) {
                return;
            }
            p();
        } else {
            if (i10 != NotificationCenter.updateInterfaces || (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) <= 0) {
                return;
            }
            MessagesController.getInstance(this.f27625b).getTopicsController().sortTopics(-j10, false);
            p();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.B;
        if (frameLayout.getVisibility() == 0) {
            this.G.setBounds((int) frameLayout.getTranslationX(), (int) this.J, (int) (frameLayout.getTranslationX() + AndroidUtilities.dp(78.0f)), (int) (getMeasuredHeight() - this.I));
            this.G.draw(canvas);
        }
        FrameLayout frameLayout2 = this.f27630r;
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
            canvas.clipPath(this.G.h.f15588k);
        }
        if (view == this.f27630r) {
            canvas.clipPath(this.H.h.f15588k);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }

    public final void e() {
        FrameLayout frameLayout = this.B;
        int paddingBottom = frameLayout.getPaddingBottom();
        int iRound = Math.round(this.I + this.J);
        if (paddingBottom == iRound) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, iRound);
    }

    public final void f(boolean z10) {
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f27625b).getTopicsController().getTopics(-this.f27626c);
        this.f27623a.a((topics == null || topics.isEmpty() || this.W) ? false : true, z10);
    }

    public final void g() {
        ud.a aVar = this.F;
        float f10 = aVar.f48497e;
        ImageView imageView = this.f27632w;
        imageView.setAlpha(f10);
        imageView.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView.setVisibility(f10 > 0.0f ? 0 : 8);
        ImageView imageView2 = this.f27633x;
        imageView2.setAlpha(f10);
        imageView2.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView2.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView2.setVisibility(f10 > 0.0f ? 0 : 8);
        float f11 = 1.0f - aVar.f48497e;
        ImageView imageView3 = this.f27634y;
        imageView3.setAlpha(f11);
        imageView3.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        imageView3.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        imageView3.setVisibility(f11 > 0.0f ? 0 : 8);
        ImageView imageView4 = this.A;
        imageView4.setAlpha(f11);
        imageView4.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        imageView4.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        imageView4.setVisibility(f11 > 0.0f ? 0 : 8);
    }

    public z11 getCurrentTabsPosition() {
        if (this.M) {
            return z11.f35131b;
        }
        return this.L ? z11.f35132c : z11.f35130a;
    }

    public float getSideMenuT() {
        return this.N * this.f27623a.f48497e;
    }

    public final void h() {
        float fLerp = AndroidUtilities.lerp(1.0f, 0.0f, this.N);
        FrameLayout frameLayout = this.f27630r;
        frameLayout.setAlpha(fLerp);
        frameLayout.setVisibility((1.0f - this.N) * this.f27623a.f48497e > 0.0f ? 0 : 8);
        if (this.L) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.I) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, j(z11.f35132c)));
        } else {
            frameLayout.setTranslationY(this.J + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, j(z11.f35130a)));
        }
    }

    public final float j(z11 z11Var) {
        float f10;
        float f11 = this.f27623a.f48497e;
        if (z11Var == z11.f35131b) {
            f10 = this.N;
        } else {
            if ((z11Var != z11.f35130a || this.L) && !(z11Var == z11.f35132c && this.L)) {
                return 0.0f;
            }
            f10 = 1.0f - this.N;
        }
        return f10 * f11;
    }

    public final boolean k() {
        if (this.N > 0.5f) {
            int i10 = 0;
            while (true) {
                t11 t11Var = this.C;
                if (i10 >= t11Var.getChildCount()) {
                    break;
                }
                n41 n41VarG = t11Var.U2.G(RecyclerView.R(t11Var.getChildAt(i10)));
                if (n41VarG != null && n41VarG.f30850r) {
                    return true;
                }
                i10++;
            }
        } else {
            int i11 = 0;
            while (true) {
                r11 r11Var = this.f27631s;
                if (i11 < r11Var.getChildCount()) {
                    n41 n41VarG2 = r11Var.U2.G(RecyclerView.R(r11Var.getChildAt(i11)));
                    if (n41VarG2 != null && n41VarG2.f30850r) {
                        return true;
                    }
                    i11++;
                }
            }
        }
        return false;
    }

    public final void l() {
        TopicsController topicsController = MessagesController.getInstance(this.f27625b).getTopicsController();
        long j10 = this.f27626c;
        if (topicsController.endIsReached(-j10)) {
            return;
        }
        topicsController.loadTopics(-j10);
    }

    public final void m(long j10, boolean z10) {
        if (this.f27627e) {
            Utilities.Callback2 callback2 = this.V;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        Utilities.Callback2 callback3 = this.T;
        if (callback3 != null) {
            callback3.run(Integer.valueOf((int) j10), Boolean.valueOf(z10));
        }
    }

    public final void n() {
        org.telegram.ui.ge geVar = this.K;
        if (geVar != null) {
            geVar.run();
        }
        h();
        float fJ = j(z11.f35131b);
        float fLerp = AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, fJ);
        FrameLayout frameLayout = this.B;
        frameLayout.setTranslationX(fLerp);
        frameLayout.setVisibility(fJ <= 0.0f ? 8 : 0);
        int i10 = org.telegram.ui.ActionBar.g6.f23441z6;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        int iD = i0.b.d(1.0f - this.N, iV0, org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f27634y.setColorFilter(new PorterDuffColorFilter(iD, mode));
        this.A.setColorFilter(new PorterDuffColorFilter(i0.b.d(this.N, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)), mode));
        this.f27632w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), mode));
        this.f27633x.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), mode));
        invalidate();
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        n();
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

    public final void p() {
        f(true);
        r11 r11Var = this.f27631s;
        boolean zCanScrollHorizontally = r11Var.canScrollHorizontally(-1);
        r11Var.U2.N(true);
        if (!zCanScrollHorizontally) {
            r11Var.u0(0);
        }
        t11 t11Var = this.C;
        boolean zCanScrollVertically = t11Var.canScrollVertically(-1);
        t11Var.U2.N(true);
        if (!zCanScrollVertically) {
            t11Var.u0(0);
        }
        AndroidUtilities.runOnUIThread(new m11(this, 1));
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            f(true);
        }
    }

    public void setCurrentTopic(long j10) {
        this.R = j10;
        r11 r11Var = this.f27631s;
        r11Var.U2.N(true);
        r11Var.invalidate();
        this.C.U2.N(true);
        c21 c21Var = this.v;
        if (c21Var != null) {
            c21Var.c(true, false, j10 == 0);
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

    public void setSideMenuBackgroundDrawable(lg.d dVar) {
        this.G = dVar;
        dVar.p(AndroidUtilities.dp(16.0f));
        this.G.o(AndroidUtilities.dp(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f10) {
        this.I = f10;
        h();
        e();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f10) {
        this.J = f10;
        this.B.setTranslationY(f10);
        h();
        e();
        invalidate();
    }

    public void setTopMenuBackgroundDrawable(lg.d dVar) {
        this.H = dVar;
        dVar.p(AndroidUtilities.dp(18.0f));
        this.H.o(AndroidUtilities.dp(7.0f));
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
