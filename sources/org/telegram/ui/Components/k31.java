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
import org.telegram.ui.ef1;
public final class k31 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, le.d {
    public static final int f24585f0 = 0;
    public final ImageView E;
    public final FrameLayout F;
    public final a31 G;
    public long H;
    public long I;
    public final le.b J;
    public bh.d K;
    public bh.d L;
    public float M;
    public float N;
    public org.telegram.ui.ne O;
    public boolean P;
    public boolean Q;
    public float R;
    public boolean S;
    public Boolean T;
    public ValueAnimator U;
    public long V;
    public boolean W;
    public final le.b f24586a;
    public Utilities.Callback2 f24587a0;
    public final int f24588b;
    public Runnable f24589b0;
    public final long f24590c;
    public Utilities.Callback2 f24591c0;
    public final org.telegram.ui.ActionBar.f6 d;
    public boolean f24592d0;
    public final boolean e;
    public final HashSet f24593e0;
    public final boolean f24594f;
    public final org.telegram.ui.eo h;
    public final boolean f24595n;
    public final FrameLayout f24596r;
    public final y21 f24597s;
    public final j31 v;
    public final ImageView f24598w;
    public final ImageView f24599x;
    public final ImageView f24600y;

    public k31(Activity activity, org.telegram.ui.eo eoVar, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        FrameLayout frameLayout;
        float f7;
        int i11;
        boolean z10;
        wr wrVar = wr.h;
        this.f24586a = new le.b(0, this, wrVar, 380L, true);
        this.J = new le.b(0, new q21(this), wrVar, 320L, false);
        this.R = 0.0f;
        this.f24593e0 = new HashSet();
        this.h = eoVar;
        this.f24588b = i10;
        this.f24590c = j3;
        this.d = f6Var;
        long j10 = -j3;
        this.e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j10)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j3)));
        this.f24594f = isBotForumWithEditableTopics;
        this.f24595n = !org.telegram.messenger.a2.v("topics_end_reached_", j10, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.f24596r = frameLayout2;
        addView(frameLayout2, w7.a6.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.F = frameLayout3;
        addView(frameLayout3, w7.a6.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        y21 y21Var = new y21(this, activity, i10, new Utilities.Callback2(this) {
            public final k31 f28924b;

            {
                this.f28924b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z11;
                boolean z12;
                int i12;
                boolean z13;
                long j11;
                long j12;
                boolean z14;
                TopicsController topicsController;
                boolean z15;
                TLRPC.User user;
                long j13;
                long j14;
                long j15;
                boolean z16;
                boolean z17;
                int i13 = r2;
                k31 k31Var = this.f28924b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        j61 j61Var = (j61) obj2;
                        boolean z18 = k31Var.f24594f;
                        int i14 = k31Var.f24588b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = k31Var.f24590c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z19 = k31Var.e;
                        int i15 = e31.f22548a;
                        v51 J = v51.J(e31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f27834q = z19;
                        if (k31Var.V == 0) {
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
                                    if (tL_forumTopic2.f17247id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (k31Var.f24593e0.contains(Integer.valueOf(tL_forumTopic2.f17247id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((v51) hc.b.i(1, arrayList)).f27841y |= 8;
                                        }
                                        j61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        j61Var.M();
                                        z20 = true;
                                    }
                                    v51 J2 = v51.J(e31.class);
                                    J2.f27840x = j16;
                                    J2.d = tL_forumTopic2.f17247id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j18 = k31Var.V;
                                    if (z19) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.f17247id;
                                    }
                                    if (j11 == j12) {
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
                            j61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && k31Var.f24595n) {
                            v51 J3 = v51.J(e31.class);
                            J3.d = -2;
                            J3.f27835r = true;
                            arrayList.add(J3);
                            v51 J4 = v51.J(e31.class);
                            J4.d = -3;
                            J4.f27835r = true;
                            arrayList.add(J4);
                            v51 J5 = v51.J(e31.class);
                            J5.d = -4;
                            J5.f27835r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                v51 J6 = v51.J(e31.class);
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
                        k31.b(k31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        j61 j61Var2 = (j61) obj2;
                        boolean z22 = k31Var.e;
                        int i19 = k31Var.f24588b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = k31Var.f24590c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z23 = k31Var.f24594f;
                        if (!z23) {
                            int i20 = i31.f23889a;
                            v51 J7 = v51.J(i31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f27834q = z22;
                            J7.f27841y = z23 ? 1 : 0;
                            if (k31Var.V == 0) {
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
                                    if (tL_forumTopic4.f17247id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (k31Var.f24593e0.contains(Integer.valueOf(tL_forumTopic4.f17247id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        j61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        j61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = i31.f23889a;
                                    v51 J8 = v51.J(i31.class);
                                    J8.f27840x = j19;
                                    J8.d = tL_forumTopic4.f17247id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = k31Var.V;
                                    if (z22) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.f17247id;
                                    }
                                    if (j14 == j15) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    J8.K(z16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j19 = j13;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z15) {
                            j61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && k31Var.f24595n) {
                            int i24 = i31.f23889a;
                            v51 J9 = v51.J(i31.class);
                            J9.d = -2;
                            J9.f27835r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            v51 J10 = v51.J(i31.class);
                            J10.d = -3;
                            J10.f27835r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            v51 J11 = v51.J(i31.class);
                            J11.d = -4;
                            J11.f27835r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = i31.f23889a;
                                v51 J12 = v51.J(i31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f27834q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new q21(this), new q21(this), f6Var);
        this.f24597s = y21Var;
        y21Var.A1(new Utilities.Callback2(this) {
            public final k31 f28924b;

            {
                this.f28924b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z11;
                boolean z12;
                int i12;
                boolean z13;
                long j11;
                long j12;
                boolean z14;
                TopicsController topicsController;
                boolean z15;
                TLRPC.User user;
                long j13;
                long j14;
                long j15;
                boolean z16;
                boolean z17;
                int i13 = r2;
                k31 k31Var = this.f28924b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        j61 j61Var = (j61) obj2;
                        boolean z18 = k31Var.f24594f;
                        int i14 = k31Var.f24588b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = k31Var.f24590c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z19 = k31Var.e;
                        int i15 = e31.f22548a;
                        v51 J = v51.J(e31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f27834q = z19;
                        if (k31Var.V == 0) {
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
                                    if (tL_forumTopic2.f17247id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (k31Var.f24593e0.contains(Integer.valueOf(tL_forumTopic2.f17247id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((v51) hc.b.i(1, arrayList)).f27841y |= 8;
                                        }
                                        j61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        j61Var.M();
                                        z20 = true;
                                    }
                                    v51 J2 = v51.J(e31.class);
                                    J2.f27840x = j16;
                                    J2.d = tL_forumTopic2.f17247id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j18 = k31Var.V;
                                    if (z19) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.f17247id;
                                    }
                                    if (j11 == j12) {
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
                            j61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && k31Var.f24595n) {
                            v51 J3 = v51.J(e31.class);
                            J3.d = -2;
                            J3.f27835r = true;
                            arrayList.add(J3);
                            v51 J4 = v51.J(e31.class);
                            J4.d = -3;
                            J4.f27835r = true;
                            arrayList.add(J4);
                            v51 J5 = v51.J(e31.class);
                            J5.d = -4;
                            J5.f27835r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                v51 J6 = v51.J(e31.class);
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
                        k31.b(k31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        j61 j61Var2 = (j61) obj2;
                        boolean z22 = k31Var.e;
                        int i19 = k31Var.f24588b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = k31Var.f24590c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z23 = k31Var.f24594f;
                        if (!z23) {
                            int i20 = i31.f23889a;
                            v51 J7 = v51.J(i31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f27834q = z22;
                            J7.f27841y = z23 ? 1 : 0;
                            if (k31Var.V == 0) {
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
                                    if (tL_forumTopic4.f17247id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (k31Var.f24593e0.contains(Integer.valueOf(tL_forumTopic4.f17247id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        j61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        j61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = i31.f23889a;
                                    v51 J8 = v51.J(i31.class);
                                    J8.f27840x = j19;
                                    J8.d = tL_forumTopic4.f17247id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = k31Var.V;
                                    if (z22) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.f17247id;
                                    }
                                    if (j14 == j15) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    J8.K(z16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j19 = j13;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z15) {
                            j61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && k31Var.f24595n) {
                            int i24 = i31.f23889a;
                            v51 J9 = v51.J(i31.class);
                            J9.d = -2;
                            J9.f27835r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            v51 J10 = v51.J(i31.class);
                            J10.d = -3;
                            J10.f27835r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            v51 J11 = v51.J(i31.class);
                            J11.d = -4;
                            J11.f27835r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = i31.f23889a;
                                v51 J12 = v51.J(i31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f27834q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        y21Var.setWillNotDraw(false);
        y21Var.Y2.f24250r = false;
        y21Var.getContext();
        fg.i0 i0Var = new fg.i0((ViewGroup) y21Var, 5);
        y21Var.X2 = i0Var;
        y21Var.setLayoutManager(i0Var);
        frameLayout2.addView(y21Var, w7.a6.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        y21Var.j(new z21(this, 0));
        if (isBotForumWithEditableTopics) {
            j31 j31Var = new j31(activity, i10, f6Var);
            this.v = j31Var;
            if (this.V == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            j31Var.c(true, false, z10);
            j31Var.setOnClickListener(new View.OnClickListener(this) {
                public final k31 f27556b;

                {
                    this.f27556b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            k31 k31Var = this.f27556b;
                            Boolean bool = k31Var.T;
                            boolean z11 = false;
                            if (bool == null ? !k31Var.Q : !bool.booleanValue()) {
                                z11 = true;
                            }
                            k31Var.d(z11);
                            return;
                        case 1:
                            k31 k31Var2 = this.f27556b;
                            a31 a31Var = k31Var2.G;
                            a31Var.v1(false);
                            y21 y21Var2 = k31Var2.f24597s;
                            y21Var2.v1(false);
                            k31Var2.J.a(false, true);
                            AndroidUtilities.updateVisibleRows(a31Var);
                            AndroidUtilities.updateVisibleRows(y21Var2);
                            return;
                        default:
                            this.f27556b.f24587a0.run(0, Boolean.FALSE);
                            return;
                    }
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(j31Var, w7.a6.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            frameLayout = frameLayout3;
            this.v = null;
        }
        ViewGroup viewGroup = frameLayout;
        a31 a31Var = new a31(activity, i10, new Utilities.Callback2(this) {
            public final k31 f28924b;

            {
                this.f28924b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z11;
                boolean z12;
                int i12;
                boolean z13;
                long j11;
                long j12;
                boolean z14;
                TopicsController topicsController;
                boolean z15;
                TLRPC.User user;
                long j13;
                long j14;
                long j15;
                boolean z16;
                boolean z17;
                int i13 = r2;
                k31 k31Var = this.f28924b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        j61 j61Var = (j61) obj2;
                        boolean z18 = k31Var.f24594f;
                        int i14 = k31Var.f24588b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = k31Var.f24590c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z19 = k31Var.e;
                        int i15 = e31.f22548a;
                        v51 J = v51.J(e31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f27834q = z19;
                        if (k31Var.V == 0) {
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
                                    if (tL_forumTopic2.f17247id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (k31Var.f24593e0.contains(Integer.valueOf(tL_forumTopic2.f17247id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((v51) hc.b.i(1, arrayList)).f27841y |= 8;
                                        }
                                        j61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        j61Var.M();
                                        z20 = true;
                                    }
                                    v51 J2 = v51.J(e31.class);
                                    J2.f27840x = j16;
                                    J2.d = tL_forumTopic2.f17247id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j18 = k31Var.V;
                                    if (z19) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.f17247id;
                                    }
                                    if (j11 == j12) {
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
                            j61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && k31Var.f24595n) {
                            v51 J3 = v51.J(e31.class);
                            J3.d = -2;
                            J3.f27835r = true;
                            arrayList.add(J3);
                            v51 J4 = v51.J(e31.class);
                            J4.d = -3;
                            J4.f27835r = true;
                            arrayList.add(J4);
                            v51 J5 = v51.J(e31.class);
                            J5.d = -4;
                            J5.f27835r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                v51 J6 = v51.J(e31.class);
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
                        k31.b(k31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        j61 j61Var2 = (j61) obj2;
                        boolean z22 = k31Var.e;
                        int i19 = k31Var.f24588b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = k31Var.f24590c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z23 = k31Var.f24594f;
                        if (!z23) {
                            int i20 = i31.f23889a;
                            v51 J7 = v51.J(i31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f27834q = z22;
                            J7.f27841y = z23 ? 1 : 0;
                            if (k31Var.V == 0) {
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
                                    if (tL_forumTopic4.f17247id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (k31Var.f24593e0.contains(Integer.valueOf(tL_forumTopic4.f17247id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        j61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        j61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = i31.f23889a;
                                    v51 J8 = v51.J(i31.class);
                                    J8.f27840x = j19;
                                    J8.d = tL_forumTopic4.f17247id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = k31Var.V;
                                    if (z22) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.f17247id;
                                    }
                                    if (j14 == j15) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    J8.K(z16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j19 = j13;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z15) {
                            j61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && k31Var.f24595n) {
                            int i24 = i31.f23889a;
                            v51 J9 = v51.J(i31.class);
                            J9.d = -2;
                            J9.f27835r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            v51 J10 = v51.J(i31.class);
                            J10.d = -3;
                            J10.f27835r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            v51 J11 = v51.J(i31.class);
                            J11.d = -4;
                            J11.f27835r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = i31.f23889a;
                                v51 J12 = v51.J(i31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f27834q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new q21(this), new q21(this), f6Var);
        this.G = a31Var;
        a31Var.A1(new Utilities.Callback2(this) {
            public final k31 f28924b;

            {
                this.f28924b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z11;
                boolean z12;
                int i12;
                boolean z13;
                long j11;
                long j12;
                boolean z14;
                TopicsController topicsController;
                boolean z15;
                TLRPC.User user;
                long j13;
                long j14;
                long j15;
                boolean z16;
                boolean z17;
                int i13 = r2;
                k31 k31Var = this.f28924b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        j61 j61Var = (j61) obj2;
                        boolean z18 = k31Var.f24594f;
                        int i14 = k31Var.f24588b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = k31Var.f24590c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z19 = k31Var.e;
                        int i15 = e31.f22548a;
                        v51 J = v51.J(e31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f27834q = z19;
                        if (k31Var.V == 0) {
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
                                    if (tL_forumTopic2.f17247id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (k31Var.f24593e0.contains(Integer.valueOf(tL_forumTopic2.f17247id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((v51) hc.b.i(1, arrayList)).f27841y |= 8;
                                        }
                                        j61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        j61Var.M();
                                        z20 = true;
                                    }
                                    v51 J2 = v51.J(e31.class);
                                    J2.f27840x = j16;
                                    J2.d = tL_forumTopic2.f17247id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j18 = k31Var.V;
                                    if (z19) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.f17247id;
                                    }
                                    if (j11 == j12) {
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
                            j61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && k31Var.f24595n) {
                            v51 J3 = v51.J(e31.class);
                            J3.d = -2;
                            J3.f27835r = true;
                            arrayList.add(J3);
                            v51 J4 = v51.J(e31.class);
                            J4.d = -3;
                            J4.f27835r = true;
                            arrayList.add(J4);
                            v51 J5 = v51.J(e31.class);
                            J5.d = -4;
                            J5.f27835r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                v51 J6 = v51.J(e31.class);
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
                        k31.b(k31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        j61 j61Var2 = (j61) obj2;
                        boolean z22 = k31Var.e;
                        int i19 = k31Var.f24588b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = k31Var.f24590c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z23 = k31Var.f24594f;
                        if (!z23) {
                            int i20 = i31.f23889a;
                            v51 J7 = v51.J(i31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f27834q = z22;
                            J7.f27841y = z23 ? 1 : 0;
                            if (k31Var.V == 0) {
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
                                    if (tL_forumTopic4.f17247id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (k31Var.f24593e0.contains(Integer.valueOf(tL_forumTopic4.f17247id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        j61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        j61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = i31.f23889a;
                                    v51 J8 = v51.J(i31.class);
                                    J8.f27840x = j19;
                                    J8.d = tL_forumTopic4.f17247id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = k31Var.V;
                                    if (z22) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.f17247id;
                                    }
                                    if (j14 == j15) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    J8.K(z16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j19 = j13;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z15) {
                            j61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && k31Var.f24595n) {
                            int i24 = i31.f23889a;
                            v51 J9 = v51.J(i31.class);
                            J9.d = -2;
                            J9.f27835r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            v51 J10 = v51.J(i31.class);
                            J10.d = -3;
                            J10.f27835r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            v51 J11 = v51.J(i31.class);
                            J11.d = -4;
                            J11.f27835r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = i31.f23889a;
                                v51 J12 = v51.J(i31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f27834q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        a31Var.Y2.f24250r = false;
        a31Var.setClipToPadding(false);
        a31Var.setClipChildren(false);
        if (isBotForumWithEditableTopics) {
            f7 = 90.0f;
        } else {
            f7 = 48.0f;
        }
        viewGroup.addView(a31Var, w7.a6.d(-1, -1.0f, 119, 0.0f, f7, 0.0f, 0.0f));
        a31Var.j(new z21(this, 1));
        ImageView i12 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final k31 f27556b;

            {
                this.f27556b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k31 k31Var = this.f27556b;
                        Boolean bool = k31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !k31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        k31Var.d(z11);
                        return;
                    case 1:
                        k31 k31Var2 = this.f27556b;
                        a31 a31Var2 = k31Var2.G;
                        a31Var2.v1(false);
                        y21 y21Var2 = k31Var2.f24597s;
                        y21Var2.v1(false);
                        k31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(a31Var2);
                        AndroidUtilities.updateVisibleRows(y21Var2);
                        return;
                    default:
                        this.f27556b.f24587a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f24600y = i12;
        ImageView i13 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final k31 f27556b;

            {
                this.f27556b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k31 k31Var = this.f27556b;
                        Boolean bool = k31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !k31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        k31Var.d(z11);
                        return;
                    case 1:
                        k31 k31Var2 = this.f27556b;
                        a31 a31Var2 = k31Var2.G;
                        a31Var2.v1(false);
                        y21 y21Var2 = k31Var2.f24597s;
                        y21Var2.v1(false);
                        k31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(a31Var2);
                        AndroidUtilities.updateVisibleRows(y21Var2);
                        return;
                    default:
                        this.f27556b.f24587a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.E = i13;
        frameLayout2.addView(i12, w7.a6.e(44, 36, 51));
        viewGroup.addView(i13, w7.a6.e(64, 48, 51));
        ImageView i14 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final k31 f27556b;

            {
                this.f27556b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k31 k31Var = this.f27556b;
                        Boolean bool = k31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !k31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        k31Var.d(z11);
                        return;
                    case 1:
                        k31 k31Var2 = this.f27556b;
                        a31 a31Var2 = k31Var2.G;
                        a31Var2.v1(false);
                        y21 y21Var2 = k31Var2.f24597s;
                        y21Var2.v1(false);
                        k31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(a31Var2);
                        AndroidUtilities.updateVisibleRows(y21Var2);
                        return;
                    default:
                        this.f27556b.f24587a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f24598w = i14;
        ImageView i15 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final k31 f27556b;

            {
                this.f27556b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k31 k31Var = this.f27556b;
                        Boolean bool = k31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !k31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        k31Var.d(z11);
                        return;
                    case 1:
                        k31 k31Var2 = this.f27556b;
                        a31 a31Var2 = k31Var2.G;
                        a31Var2.v1(false);
                        y21 y21Var2 = k31Var2.f24597s;
                        y21Var2.v1(false);
                        k31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(a31Var2);
                        AndroidUtilities.updateVisibleRows(y21Var2);
                        return;
                    default:
                        this.f27556b.f24587a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f24599x = i15;
        frameLayout2.addView(i14, w7.a6.e(44, 36, 51));
        viewGroup.addView(i15, w7.a6.e(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j10, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.a2.v("topicssidetabs", j3, mainSettings, false)) {
            this.R = 1.0f;
            this.Q = true;
        }
        boolean v = org.telegram.messenger.a2.v("topicssidetabsb", j3, mainSettings, false);
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

    public static void a(k31 k31Var, v51 v51Var) {
        if (k31Var.e) {
            Utilities.Callback2 callback2 = k31Var.f24591c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(v51Var.B), Boolean.FALSE);
            }
        } else if (v51Var.B == -2) {
            Runnable runnable = k31Var.f24589b0;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            Utilities.Callback2 callback22 = k31Var.f24587a0;
            if (callback22 != null) {
                callback22.run(Integer.valueOf(v51Var.d), Boolean.FALSE);
            }
        }
    }

    public static void b(k31 k31Var, ArrayList arrayList) {
        long j3 = k31Var.f24590c;
        TopicsController topicsController = MessagesController.getInstance(k31Var.f24588b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = com.google.android.gms.internal.vision.e2.d(((v51) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j10 = -j3;
        topicsController.reorderPinnedTopics(j10, arrayList2);
        topicsController.sortTopics(j10, false);
    }

    public static boolean c(final k31 k31Var, v51 v51Var, View view) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10;
        int i11;
        TLRPC.Chat chat2;
        final k31 k31Var2;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i12;
        int i13;
        int i14;
        ?? r11;
        byte b10;
        int i15;
        final w70 w70Var;
        int i16;
        int i17;
        w70 w70Var2;
        org.telegram.ui.ActionBar.f6 f6Var2 = k31Var.d;
        org.telegram.ui.eo eoVar = k31Var.h;
        long j3 = k31Var.f24590c;
        int i18 = k31Var.f24588b;
        if (k31Var.G.f26606c3 || k31Var.f24597s.f26606c3) {
            return false;
        }
        Object obj = v51Var.G;
        if (!(obj instanceof TLRPC.TL_forumTopic)) {
            return false;
        }
        final TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
        MessagesController messagesController = MessagesController.getInstance(i18);
        int i19 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i19 < 0) {
            chat = messagesController.getChat(Long.valueOf(-j3));
        } else {
            chat = null;
        }
        if (i19 > 0) {
            user = messagesController.getUser(Long.valueOf(j3));
        } else {
            user = null;
        }
        final w70 I = w70.I(eoVar, view);
        if (ChatObject.isMonoForum(chat)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i18, chat)) {
                return false;
            }
            TLRPC.Chat chat3 = chat;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new bi.ua(k31Var, I, peerDialogId, chat, 25), false);
            long j10 = chat3.f17195id;
            if (ChatObject.isMonoForum(chat3) && ChatObject.canManageMonoForum(i18, chat3)) {
                long j11 = chat3.linked_monoforum_id;
                if (j11 != 0) {
                    j10 = j11;
                }
            }
            TLRPC.Chat chat4 = MessagesController.getInstance(i18).getChat(Long.valueOf(j10));
            TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(peerDialogId));
            if (user2 != null && ChatObject.canBlockUsers(chat4)) {
                I.c(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), null, false);
                org.telegram.ui.ActionBar.g1 y3 = I.y();
                i15 = 8;
                y3.setVisibility(8);
                MessagesController messagesController2 = MessagesController.getInstance(i18);
                r21 r21Var = new r21(k31Var, y3, I, j10, user2, chat4);
                w70Var2 = I;
                messagesController2.checkIsInChat(true, chat4, user2, r21Var);
            } else {
                w70Var2 = I;
                i15 = 8;
            }
            w70Var = w70Var2;
            f6Var = f6Var2;
            i14 = 2;
            r11 = 1;
            b10 = 0;
        } else {
            TLRPC.Chat chat5 = chat;
            if (!ChatObject.canManageTopics(chat5) && !UserObject.isBotForumWithEditableTopics(user)) {
                k31Var2 = k31Var;
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
                k31Var2 = k31Var;
                Runnable q01Var = new q01(k31Var2, I, messagesController, tL_forumTopic, 1);
                I = I;
                messagesController = messagesController;
                tL_forumTopic = tL_forumTopic;
                I.c(i10, string, q01Var, false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new s21(k31Var2, 0), false);
                }
            }
            if (ChatObject.canManageTopics(chat2) || UserObject.isBotForumWithEditableTopics(user)) {
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(k31Var2) {
                    public final k31 f27299b;

                    {
                        this.f27299b = k31Var2;
                    }

                    @Override
                    public final void run() {
                        boolean z11;
                        int i20 = r4;
                        k31 k31Var3 = this.f27299b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        w70 w70Var3 = I;
                        switch (i20) {
                            case 0:
                                w70Var3.u();
                                k31Var3.h.presentFragment(ef1.a0(-k31Var3.f24590c, tL_forumTopic2.f17247id));
                                return;
                            case 1:
                                k31Var3.getClass();
                                w70Var3.u();
                                MessagesController.getInstance(k31Var3.f24588b).getTopicsController().toggleCloseTopic(-k31Var3.f24590c, tL_forumTopic2.f17247id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                w70Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f17247id));
                                c30 c30Var = new c30(6);
                                k31 k31Var4 = this.f27299b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                                d2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j12 = k31Var4.V;
                                if (hashSet.size() == 1) {
                                    z11 = false;
                                    d2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(k31Var4.f24588b).getTopicsController().findTopic(-k31Var4.f24590c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z11 = false;
                                    d2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ze(k31Var4, arrayList, j12, hashSet, c30Var));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new gp0(9));
                                d2Var.show();
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, z11));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            long j12 = k31Var2.f24590c;
            long j13 = tL_forumTopic.f17247id;
            int currentAccount = eoVar.getCurrentAccount();
            org.telegram.ui.ActionBar.f6 resourceProvider = eoVar.getResourceProvider();
            w70 w70Var3 = I;
            po poVar = new po(w70Var3, currentAccount, j12, j13, eoVar, resourceProvider);
            w70 J = w70Var3.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.mu0(w70Var3, 25), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.pe(w70Var3, currentAccount, j12, j13, J, eoVar, resourceProvider), false);
            org.telegram.ui.ActionBar.g1 y10 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new di.q(w70Var3, resourceProvider, currentAccount, poVar, 17), false);
            f6Var = f6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new org.telegram.messenger.x2(w70Var3, j12, j13, eoVar, resourceProvider, 7), false);
            J.c(0, "", new org.telegram.messenger.uc(w70Var3, currentAccount, j12, j13, eoVar, resourceProvider), false);
            new org.telegram.messenger.v9(currentAccount, j12, j13, J.y(), y10).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j3, tL_forumTopic.f17247id);
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
            Runnable yaVar = new bi.ya(k31Var, messagesController, tL_forumTopic, w70Var3, J, 21);
            w70Var = w70Var3;
            w70Var.c(i20, string2, yaVar, false);
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
                w70Var.c(i16, LocaleController.getString(i17), new Runnable(k31Var) {
                    public final k31 f27299b;

                    {
                        this.f27299b = k31Var;
                    }

                    @Override
                    public final void run() {
                        boolean z112;
                        int i202 = r4;
                        k31 k31Var3 = this.f27299b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        w70 w70Var32 = w70Var;
                        switch (i202) {
                            case 0:
                                w70Var32.u();
                                k31Var3.h.presentFragment(ef1.a0(-k31Var3.f24590c, tL_forumTopic2.f17247id));
                                return;
                            case 1:
                                k31Var3.getClass();
                                w70Var32.u();
                                MessagesController.getInstance(k31Var3.f24588b).getTopicsController().toggleCloseTopic(-k31Var3.f24590c, tL_forumTopic2.f17247id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                w70Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f17247id));
                                c30 c30Var = new c30(6);
                                k31 k31Var4 = this.f27299b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                                d2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = k31Var4.V;
                                if (hashSet.size() == 1) {
                                    z112 = false;
                                    d2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(k31Var4.f24588b).getTopicsController().findTopic(-k31Var4.f24590c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z112 = false;
                                    d2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ze(k31Var4, arrayList, j122, hashSet, c30Var));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new gp0(9));
                                d2Var.show();
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, z112));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            if (ChatObject.canDeleteTopic(i18, chat6, tL_forumTopic)) {
                w70Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1), new Runnable(k31Var) {
                    public final k31 f27299b;

                    {
                        this.f27299b = k31Var;
                    }

                    @Override
                    public final void run() {
                        boolean z112;
                        int i202 = r4;
                        k31 k31Var3 = this.f27299b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        w70 w70Var32 = w70Var;
                        switch (i202) {
                            case 0:
                                w70Var32.u();
                                k31Var3.h.presentFragment(ef1.a0(-k31Var3.f24590c, tL_forumTopic2.f17247id));
                                return;
                            case 1:
                                k31Var3.getClass();
                                w70Var32.u();
                                MessagesController.getInstance(k31Var3.f24588b).getTopicsController().toggleCloseTopic(-k31Var3.f24590c, tL_forumTopic2.f17247id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                w70Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f17247id));
                                c30 c30Var = new c30(6);
                                k31 k31Var4 = this.f27299b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                                d2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = k31Var4.V;
                                if (hashSet.size() == 1) {
                                    z112 = false;
                                    d2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(k31Var4.f24588b).getTopicsController().findTopic(-k31Var4.f24590c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z112 = false;
                                    d2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ze(k31Var4, arrayList, j122, hashSet, c30Var));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new gp0(9));
                                d2Var.show();
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, z112));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
        }
        if (view instanceof f31) {
            fw fwVar = new fw(i14, b10);
            Paint paint = new Paint((int) r11);
            fwVar.f23095c = paint;
            fwVar.f23094b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
            w70Var.W(fwVar);
            w70Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var);
            float f7 = b10;
            float f10 = dp;
            float f11 = dp2;
            float[] fArr = new float[i15];
            fArr[b10] = f7;
            fArr[r11] = f7;
            fArr[i14] = f10;
            fArr[3] = f10;
            fArr[4] = f11;
            fArr[5] = f11;
            fArr[6] = f7;
            fArr[7] = f7;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(v02);
            w70Var.W(shapeDrawable);
        }
        w70Var.Z();
        return r11;
    }

    public static ImageView i(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        w7.c6.a(imageView);
        return imageView;
    }

    private void setAttached(boolean z10) {
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        long j3 = this.f24590c;
        int i10 = this.f24588b;
        if (z10) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
            MessagesController.getInstance(i10).getTopicsController().onTopicFragmentResume(-j3);
            return;
        }
        MessagesController.getInstance(i10).getTopicsController().onTopicFragmentPause(-j3);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        n();
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
        ofFloat.addUpdateListener(new q70(this, 28));
        this.U.addListener(new b31(this, z10));
        this.U.setInterpolator(ii.n.V);
        this.U.setDuration(250L);
        this.U.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.topicsDidLoaded;
        long j3 = this.f24590c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == (-j3)) {
                o();
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
            MessagesController.getInstance(this.f24588b).getTopicsController().sortTopics(-j3, false);
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
        FrameLayout frameLayout2 = this.f24596r;
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        canvas.save();
        if (view == this.F) {
            canvas.clipPath(this.K.h.f2264k);
        }
        if (view == this.f24596r) {
            canvas.clipPath(this.L.h.f2264k);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
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
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f24588b).getTopicsController().getTopics(-this.f24590c);
        if (topics != null && !topics.isEmpty() && !this.f24592d0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f24586a.a(z11, z10);
    }

    public final void g() {
        int i10;
        int i11;
        int i12;
        le.b bVar = this.J;
        float f7 = bVar.e;
        ImageView imageView = this.f24598w;
        imageView.setAlpha(f7);
        imageView.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        imageView.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        int i13 = 8;
        int i14 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = this.f24599x;
        imageView2.setAlpha(f7);
        imageView2.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        imageView2.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        if (i14 > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView2.setVisibility(i11);
        float f10 = 1.0f - bVar.e;
        ImageView imageView3 = this.f24600y;
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
            i13 = 0;
        }
        imageView4.setVisibility(i13);
    }

    public g31 getCurrentTabsPosition() {
        if (this.Q) {
            return g31.f23230b;
        }
        if (this.P) {
            return g31.f23231c;
        }
        return g31.f23229a;
    }

    public float getSideMenuT() {
        return this.R * this.f24586a.e;
    }

    public final void h() {
        int i10;
        float lerp = AndroidUtilities.lerp(1.0f, 0.0f, this.R);
        FrameLayout frameLayout = this.f24596r;
        frameLayout.setAlpha(lerp);
        if ((1.0f - this.R) * this.f24586a.e > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        if (this.P) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.M) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, j(g31.f23231c)));
        } else {
            frameLayout.setTranslationY(this.N + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, j(g31.f23229a)));
        }
    }

    public final float j(g31 g31Var) {
        float f7;
        float f10 = this.f24586a.e;
        if (g31Var == g31.f23230b) {
            f7 = this.R;
        } else if ((g31Var == g31.f23229a && !this.P) || (g31Var == g31.f23231c && this.P)) {
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
                a31 a31Var = this.G;
                if (i10 >= a31Var.getChildCount()) {
                    break;
                }
                v51 G = a31Var.Y2.G(RecyclerView.R(a31Var.getChildAt(i10)));
                if (G == null || !G.f27835r) {
                    i10++;
                } else {
                    return true;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                y21 y21Var = this.f24597s;
                if (i11 >= y21Var.getChildCount()) {
                    break;
                }
                v51 G2 = y21Var.Y2.G(RecyclerView.R(y21Var.getChildAt(i11)));
                if (G2 != null && G2.f27835r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void l() {
        TopicsController topicsController = MessagesController.getInstance(this.f24588b).getTopicsController();
        long j3 = this.f24590c;
        if (!topicsController.endIsReached(-j3)) {
            topicsController.loadTopics(-j3);
        }
    }

    public final void m(long j3, boolean z10) {
        if (this.e) {
            Utilities.Callback2 callback2 = this.f24591c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j3), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.f24587a0;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j3), Boolean.valueOf(z10));
        }
    }

    public final void n() {
        org.telegram.ui.ne neVar = this.O;
        if (neVar != null) {
            neVar.run();
        }
        h();
        float j3 = j(g31.f23230b);
        int i10 = 0;
        FrameLayout frameLayout = this.F;
        frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, j3));
        if (j3 <= 0.0f) {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        int i11 = org.telegram.ui.ActionBar.j6.f18325z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        int d = i0.a.d(1.0f - this.R, v02, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f24600y.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.E.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.R, org.telegram.ui.ActionBar.j6.v0(i11, f6Var), org.telegram.ui.ActionBar.j6.v0(i12, f6Var)), mode));
        this.f24598w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), mode));
        this.f24599x.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), mode));
        invalidate();
    }

    public final void o() {
        f(true);
        y21 y21Var = this.f24597s;
        boolean canScrollHorizontally = y21Var.canScrollHorizontally(-1);
        y21Var.Y2.N(true);
        if (!canScrollHorizontally) {
            y21Var.u0(0);
        }
        a31 a31Var = this.G;
        boolean canScrollVertically = a31Var.canScrollVertically(-1);
        a31Var.Y2.N(true);
        if (!canScrollVertically) {
            a31Var.u0(0);
        }
        AndroidUtilities.runOnUIThread(new s21(this, 1));
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
        if (this.f24592d0 != z10) {
            this.f24592d0 = z10;
            f(true);
        }
    }

    public void setCurrentTopic(long j3) {
        boolean z10;
        this.V = j3;
        y21 y21Var = this.f24597s;
        y21Var.Y2.N(true);
        y21Var.invalidate();
        this.G.Y2.N(true);
        j31 j31Var = this.v;
        if (j31Var != null) {
            if (j3 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            j31Var.c(true, false, z10);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.f24591c0 = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.f24589b0 = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.f24587a0 = callback2;
    }

    public void setSideMenuBackgroundDrawable(bh.d dVar) {
        this.K = dVar;
        dVar.p(AndroidUtilities.dp(16.0f));
        this.K.o(AndroidUtilities.dp(7.0f));
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

    public void setTopMenuBackgroundDrawable(bh.d dVar) {
        this.L = dVar;
        dVar.p(AndroidUtilities.dp(18.0f));
        this.L.o(AndroidUtilities.dp(7.0f));
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
