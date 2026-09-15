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
import org.telegram.ui.ze1;
public final class x21 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, le.d {
    public static final int f29868f0 = 0;
    public final ImageView E;
    public final FrameLayout F;
    public final n21 G;
    public long H;
    public long I;
    public final le.b J;
    public ch.d K;
    public ch.d L;
    public float M;
    public float N;
    public org.telegram.ui.le O;
    public boolean P;
    public boolean Q;
    public float R;
    public boolean S;
    public Boolean T;
    public ValueAnimator U;
    public long V;
    public boolean W;
    public final le.b f29869a;
    public Utilities.Callback2 f29870a0;
    public final int f29871b;
    public Runnable f29872b0;
    public final long f29873c;
    public Utilities.Callback2 f29874c0;
    public final org.telegram.ui.ActionBar.e6 d;
    public boolean f29875d0;
    public final boolean e;
    public final HashSet f29876e0;
    public final boolean f29877f;
    public final org.telegram.ui.bo h;
    public final boolean f29878n;
    public final FrameLayout f29879r;
    public final l21 f29880s;
    public final w21 v;
    public final ImageView f29881w;
    public final ImageView f29882x;
    public final ImageView f29883y;

    public x21(Activity activity, org.telegram.ui.bo boVar, int i10, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        FrameLayout frameLayout;
        float f7;
        int i11;
        boolean z10;
        qr qrVar = qr.h;
        this.f29869a = new le.b(0, this, qrVar, 380L, true);
        this.J = new le.b(0, new c21(this), qrVar, 320L, false);
        this.R = 0.0f;
        this.f29876e0 = new HashSet();
        this.h = boVar;
        this.f29871b = i10;
        this.f29873c = j3;
        this.d = e6Var;
        long j10 = -j3;
        this.e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j10)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j3)));
        this.f29877f = isBotForumWithEditableTopics;
        this.f29878n = !org.telegram.messenger.w1.v("topics_end_reached_", j10, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.f29879r = frameLayout2;
        addView(frameLayout2, w7.x5.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.F = frameLayout3;
        addView(frameLayout3, w7.x5.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        l21 l21Var = new l21(this, activity, i10, new Utilities.Callback2(this) {
            public final x21 f25532b;

            {
                this.f25532b = this;
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
                x21 x21Var = this.f25532b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        w51 w51Var = (w51) obj2;
                        boolean z18 = x21Var.f29877f;
                        int i14 = x21Var.f29871b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = x21Var.f29873c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z19 = x21Var.e;
                        int i15 = r21.f27525a;
                        i51 J = i51.J(r21.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f24899q = z19;
                        if (x21Var.V == 0) {
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
                                    if (tL_forumTopic2.f18164id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (x21Var.f29876e0.contains(Integer.valueOf(tL_forumTopic2.f18164id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((i51) hg.k0.h(1, arrayList)).f24906y |= 8;
                                        }
                                        w51Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        w51Var.M();
                                        z20 = true;
                                    }
                                    i51 J2 = i51.J(r21.class);
                                    J2.f24905x = j16;
                                    J2.d = tL_forumTopic2.f18164id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j18 = x21Var.V;
                                    if (z19) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.f18164id;
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
                            w51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && x21Var.f29878n) {
                            i51 J3 = i51.J(r21.class);
                            J3.d = -2;
                            J3.f24900r = true;
                            arrayList.add(J3);
                            i51 J4 = i51.J(r21.class);
                            J4.d = -3;
                            J4.f24900r = true;
                            arrayList.add(J4);
                            i51 J5 = i51.J(r21.class);
                            J5.d = -4;
                            J5.f24900r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                i51 J6 = i51.J(r21.class);
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
                        x21.b(x21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        w51 w51Var2 = (w51) obj2;
                        boolean z22 = x21Var.e;
                        int i19 = x21Var.f29871b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = x21Var.f29873c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z23 = x21Var.f29877f;
                        if (!z23) {
                            int i20 = v21.f28575a;
                            i51 J7 = i51.J(v21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f24899q = z22;
                            J7.f24906y = z23 ? 1 : 0;
                            if (x21Var.V == 0) {
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
                                    if (tL_forumTopic4.f18164id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (x21Var.f29876e0.contains(Integer.valueOf(tL_forumTopic4.f18164id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        w51Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        w51Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = v21.f28575a;
                                    i51 J8 = i51.J(v21.class);
                                    J8.f24905x = j19;
                                    J8.d = tL_forumTopic4.f18164id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = x21Var.V;
                                    if (z22) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.f18164id;
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
                            w51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && x21Var.f29878n) {
                            int i24 = v21.f28575a;
                            i51 J9 = i51.J(v21.class);
                            J9.d = -2;
                            J9.f24900r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            i51 J10 = i51.J(v21.class);
                            J10.d = -3;
                            J10.f24900r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            i51 J11 = i51.J(v21.class);
                            J11.d = -4;
                            J11.f24900r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = v21.f28575a;
                                i51 J12 = i51.J(v21.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f24899q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new c21(this), new c21(this), e6Var);
        this.f29880s = l21Var;
        l21Var.B1(new Utilities.Callback2(this) {
            public final x21 f25532b;

            {
                this.f25532b = this;
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
                x21 x21Var = this.f25532b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        w51 w51Var = (w51) obj2;
                        boolean z18 = x21Var.f29877f;
                        int i14 = x21Var.f29871b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = x21Var.f29873c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z19 = x21Var.e;
                        int i15 = r21.f27525a;
                        i51 J = i51.J(r21.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f24899q = z19;
                        if (x21Var.V == 0) {
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
                                    if (tL_forumTopic2.f18164id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (x21Var.f29876e0.contains(Integer.valueOf(tL_forumTopic2.f18164id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((i51) hg.k0.h(1, arrayList)).f24906y |= 8;
                                        }
                                        w51Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        w51Var.M();
                                        z20 = true;
                                    }
                                    i51 J2 = i51.J(r21.class);
                                    J2.f24905x = j16;
                                    J2.d = tL_forumTopic2.f18164id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j18 = x21Var.V;
                                    if (z19) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.f18164id;
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
                            w51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && x21Var.f29878n) {
                            i51 J3 = i51.J(r21.class);
                            J3.d = -2;
                            J3.f24900r = true;
                            arrayList.add(J3);
                            i51 J4 = i51.J(r21.class);
                            J4.d = -3;
                            J4.f24900r = true;
                            arrayList.add(J4);
                            i51 J5 = i51.J(r21.class);
                            J5.d = -4;
                            J5.f24900r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                i51 J6 = i51.J(r21.class);
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
                        x21.b(x21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        w51 w51Var2 = (w51) obj2;
                        boolean z22 = x21Var.e;
                        int i19 = x21Var.f29871b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = x21Var.f29873c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z23 = x21Var.f29877f;
                        if (!z23) {
                            int i20 = v21.f28575a;
                            i51 J7 = i51.J(v21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f24899q = z22;
                            J7.f24906y = z23 ? 1 : 0;
                            if (x21Var.V == 0) {
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
                                    if (tL_forumTopic4.f18164id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (x21Var.f29876e0.contains(Integer.valueOf(tL_forumTopic4.f18164id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        w51Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        w51Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = v21.f28575a;
                                    i51 J8 = i51.J(v21.class);
                                    J8.f24905x = j19;
                                    J8.d = tL_forumTopic4.f18164id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = x21Var.V;
                                    if (z22) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.f18164id;
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
                            w51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && x21Var.f29878n) {
                            int i24 = v21.f28575a;
                            i51 J9 = i51.J(v21.class);
                            J9.d = -2;
                            J9.f24900r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            i51 J10 = i51.J(v21.class);
                            J10.d = -3;
                            J10.f24900r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            i51 J11 = i51.J(v21.class);
                            J11.d = -4;
                            J11.f24900r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = v21.f28575a;
                                i51 J12 = i51.J(v21.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f24899q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        l21Var.setWillNotDraw(false);
        l21Var.Y2.f29613r = false;
        l21Var.getContext();
        gg.j0 j0Var = new gg.j0((ViewGroup) l21Var, 5);
        l21Var.X2 = j0Var;
        l21Var.setLayoutManager(j0Var);
        frameLayout2.addView(l21Var, w7.x5.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        l21Var.j(new m21(this, 0));
        if (isBotForumWithEditableTopics) {
            w21 w21Var = new w21(activity, i10, e6Var);
            this.v = w21Var;
            if (this.V == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w21Var.c(true, false, z10);
            w21Var.setOnClickListener(new View.OnClickListener(this) {
                public final x21 f24174b;

                {
                    this.f24174b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            x21 x21Var = this.f24174b;
                            Boolean bool = x21Var.T;
                            boolean z11 = false;
                            if (bool == null ? !x21Var.Q : !bool.booleanValue()) {
                                z11 = true;
                            }
                            x21Var.d(z11);
                            return;
                        case 1:
                            x21 x21Var2 = this.f24174b;
                            n21 n21Var = x21Var2.G;
                            n21Var.w1(false);
                            l21 l21Var2 = x21Var2.f29880s;
                            l21Var2.w1(false);
                            x21Var2.J.a(false, true);
                            AndroidUtilities.updateVisibleRows(n21Var);
                            AndroidUtilities.updateVisibleRows(l21Var2);
                            return;
                        default:
                            this.f24174b.f29870a0.run(0, Boolean.FALSE);
                            return;
                    }
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(w21Var, w7.x5.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            frameLayout = frameLayout3;
            this.v = null;
        }
        ViewGroup viewGroup = frameLayout;
        n21 n21Var = new n21(activity, i10, new Utilities.Callback2(this) {
            public final x21 f25532b;

            {
                this.f25532b = this;
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
                x21 x21Var = this.f25532b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        w51 w51Var = (w51) obj2;
                        boolean z18 = x21Var.f29877f;
                        int i14 = x21Var.f29871b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = x21Var.f29873c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z19 = x21Var.e;
                        int i15 = r21.f27525a;
                        i51 J = i51.J(r21.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f24899q = z19;
                        if (x21Var.V == 0) {
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
                                    if (tL_forumTopic2.f18164id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (x21Var.f29876e0.contains(Integer.valueOf(tL_forumTopic2.f18164id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((i51) hg.k0.h(1, arrayList)).f24906y |= 8;
                                        }
                                        w51Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        w51Var.M();
                                        z20 = true;
                                    }
                                    i51 J2 = i51.J(r21.class);
                                    J2.f24905x = j16;
                                    J2.d = tL_forumTopic2.f18164id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j18 = x21Var.V;
                                    if (z19) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.f18164id;
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
                            w51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && x21Var.f29878n) {
                            i51 J3 = i51.J(r21.class);
                            J3.d = -2;
                            J3.f24900r = true;
                            arrayList.add(J3);
                            i51 J4 = i51.J(r21.class);
                            J4.d = -3;
                            J4.f24900r = true;
                            arrayList.add(J4);
                            i51 J5 = i51.J(r21.class);
                            J5.d = -4;
                            J5.f24900r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                i51 J6 = i51.J(r21.class);
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
                        x21.b(x21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        w51 w51Var2 = (w51) obj2;
                        boolean z22 = x21Var.e;
                        int i19 = x21Var.f29871b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = x21Var.f29873c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z23 = x21Var.f29877f;
                        if (!z23) {
                            int i20 = v21.f28575a;
                            i51 J7 = i51.J(v21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f24899q = z22;
                            J7.f24906y = z23 ? 1 : 0;
                            if (x21Var.V == 0) {
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
                                    if (tL_forumTopic4.f18164id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (x21Var.f29876e0.contains(Integer.valueOf(tL_forumTopic4.f18164id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        w51Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        w51Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = v21.f28575a;
                                    i51 J8 = i51.J(v21.class);
                                    J8.f24905x = j19;
                                    J8.d = tL_forumTopic4.f18164id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = x21Var.V;
                                    if (z22) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.f18164id;
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
                            w51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && x21Var.f29878n) {
                            int i24 = v21.f28575a;
                            i51 J9 = i51.J(v21.class);
                            J9.d = -2;
                            J9.f24900r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            i51 J10 = i51.J(v21.class);
                            J10.d = -3;
                            J10.f24900r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            i51 J11 = i51.J(v21.class);
                            J11.d = -4;
                            J11.f24900r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = v21.f28575a;
                                i51 J12 = i51.J(v21.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f24899q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new c21(this), new c21(this), e6Var);
        this.G = n21Var;
        n21Var.B1(new Utilities.Callback2(this) {
            public final x21 f25532b;

            {
                this.f25532b = this;
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
                x21 x21Var = this.f25532b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        w51 w51Var = (w51) obj2;
                        boolean z18 = x21Var.f29877f;
                        int i14 = x21Var.f29871b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = x21Var.f29873c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z19 = x21Var.e;
                        int i15 = r21.f27525a;
                        i51 J = i51.J(r21.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f24899q = z19;
                        if (x21Var.V == 0) {
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
                                    if (tL_forumTopic2.f18164id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (x21Var.f29876e0.contains(Integer.valueOf(tL_forumTopic2.f18164id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((i51) hg.k0.h(1, arrayList)).f24906y |= 8;
                                        }
                                        w51Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        w51Var.M();
                                        z20 = true;
                                    }
                                    i51 J2 = i51.J(r21.class);
                                    J2.f24905x = j16;
                                    J2.d = tL_forumTopic2.f18164id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j18 = x21Var.V;
                                    if (z19) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.f18164id;
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
                            w51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && x21Var.f29878n) {
                            i51 J3 = i51.J(r21.class);
                            J3.d = -2;
                            J3.f24900r = true;
                            arrayList.add(J3);
                            i51 J4 = i51.J(r21.class);
                            J4.d = -3;
                            J4.f24900r = true;
                            arrayList.add(J4);
                            i51 J5 = i51.J(r21.class);
                            J5.d = -4;
                            J5.f24900r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                i51 J6 = i51.J(r21.class);
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
                        x21.b(x21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        w51 w51Var2 = (w51) obj2;
                        boolean z22 = x21Var.e;
                        int i19 = x21Var.f29871b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = x21Var.f29873c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z23 = x21Var.f29877f;
                        if (!z23) {
                            int i20 = v21.f28575a;
                            i51 J7 = i51.J(v21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f24899q = z22;
                            J7.f24906y = z23 ? 1 : 0;
                            if (x21Var.V == 0) {
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
                                    if (tL_forumTopic4.f18164id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (x21Var.f29876e0.contains(Integer.valueOf(tL_forumTopic4.f18164id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        w51Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        w51Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = v21.f28575a;
                                    i51 J8 = i51.J(v21.class);
                                    J8.f24905x = j19;
                                    J8.d = tL_forumTopic4.f18164id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = x21Var.V;
                                    if (z22) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.f18164id;
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
                            w51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && x21Var.f29878n) {
                            int i24 = v21.f28575a;
                            i51 J9 = i51.J(v21.class);
                            J9.d = -2;
                            J9.f24900r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            i51 J10 = i51.J(v21.class);
                            J10.d = -3;
                            J10.f24900r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            i51 J11 = i51.J(v21.class);
                            J11.d = -4;
                            J11.f24900r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = v21.f28575a;
                                i51 J12 = i51.J(v21.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f24899q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        n21Var.Y2.f29613r = false;
        n21Var.setClipToPadding(false);
        n21Var.setClipChildren(false);
        if (isBotForumWithEditableTopics) {
            f7 = 90.0f;
        } else {
            f7 = 48.0f;
        }
        viewGroup.addView(n21Var, w7.x5.d(-1, -1.0f, 119, 0.0f, f7, 0.0f, 0.0f));
        n21Var.j(new m21(this, 1));
        ImageView i12 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final x21 f24174b;

            {
                this.f24174b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        x21 x21Var = this.f24174b;
                        Boolean bool = x21Var.T;
                        boolean z11 = false;
                        if (bool == null ? !x21Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        x21Var.d(z11);
                        return;
                    case 1:
                        x21 x21Var2 = this.f24174b;
                        n21 n21Var2 = x21Var2.G;
                        n21Var2.w1(false);
                        l21 l21Var2 = x21Var2.f29880s;
                        l21Var2.w1(false);
                        x21Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(n21Var2);
                        AndroidUtilities.updateVisibleRows(l21Var2);
                        return;
                    default:
                        this.f24174b.f29870a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f29883y = i12;
        ImageView i13 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final x21 f24174b;

            {
                this.f24174b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        x21 x21Var = this.f24174b;
                        Boolean bool = x21Var.T;
                        boolean z11 = false;
                        if (bool == null ? !x21Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        x21Var.d(z11);
                        return;
                    case 1:
                        x21 x21Var2 = this.f24174b;
                        n21 n21Var2 = x21Var2.G;
                        n21Var2.w1(false);
                        l21 l21Var2 = x21Var2.f29880s;
                        l21Var2.w1(false);
                        x21Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(n21Var2);
                        AndroidUtilities.updateVisibleRows(l21Var2);
                        return;
                    default:
                        this.f24174b.f29870a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.E = i13;
        frameLayout2.addView(i12, w7.x5.e(44, 36, 51));
        viewGroup.addView(i13, w7.x5.e(64, 48, 51));
        ImageView i14 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final x21 f24174b;

            {
                this.f24174b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        x21 x21Var = this.f24174b;
                        Boolean bool = x21Var.T;
                        boolean z11 = false;
                        if (bool == null ? !x21Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        x21Var.d(z11);
                        return;
                    case 1:
                        x21 x21Var2 = this.f24174b;
                        n21 n21Var2 = x21Var2.G;
                        n21Var2.w1(false);
                        l21 l21Var2 = x21Var2.f29880s;
                        l21Var2.w1(false);
                        x21Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(n21Var2);
                        AndroidUtilities.updateVisibleRows(l21Var2);
                        return;
                    default:
                        this.f24174b.f29870a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f29881w = i14;
        ImageView i15 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final x21 f24174b;

            {
                this.f24174b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        x21 x21Var = this.f24174b;
                        Boolean bool = x21Var.T;
                        boolean z11 = false;
                        if (bool == null ? !x21Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        x21Var.d(z11);
                        return;
                    case 1:
                        x21 x21Var2 = this.f24174b;
                        n21 n21Var2 = x21Var2.G;
                        n21Var2.w1(false);
                        l21 l21Var2 = x21Var2.f29880s;
                        l21Var2.w1(false);
                        x21Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(n21Var2);
                        AndroidUtilities.updateVisibleRows(l21Var2);
                        return;
                    default:
                        this.f24174b.f29870a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f29882x = i15;
        frameLayout2.addView(i14, w7.x5.e(44, 36, 51));
        viewGroup.addView(i15, w7.x5.e(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j10, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.w1.v("topicssidetabs", j3, mainSettings, false)) {
            this.R = 1.0f;
            this.Q = true;
        }
        boolean v = org.telegram.messenger.w1.v("topicssidetabsb", j3, mainSettings, false);
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

    public static void a(x21 x21Var, i51 i51Var) {
        if (x21Var.e) {
            Utilities.Callback2 callback2 = x21Var.f29874c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(i51Var.B), Boolean.FALSE);
            }
        } else if (i51Var.B == -2) {
            Runnable runnable = x21Var.f29872b0;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            Utilities.Callback2 callback22 = x21Var.f29870a0;
            if (callback22 != null) {
                callback22.run(Integer.valueOf(i51Var.d), Boolean.FALSE);
            }
        }
    }

    public static void b(x21 x21Var, ArrayList arrayList) {
        long j3 = x21Var.f29873c;
        TopicsController topicsController = MessagesController.getInstance(x21Var.f29871b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = com.google.android.gms.internal.vision.e2.e(((i51) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j10 = -j3;
        topicsController.reorderPinnedTopics(j10, arrayList2);
        topicsController.sortTopics(j10, false);
    }

    public static boolean c(final x21 x21Var, i51 i51Var, View view) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i12;
        int i13;
        int i14;
        int i15;
        byte b10;
        final n70 n70Var;
        boolean z10;
        int i16;
        int i17;
        ?? r62;
        n70 n70Var2;
        org.telegram.ui.ActionBar.e6 e6Var2 = x21Var.d;
        org.telegram.ui.bo boVar = x21Var.h;
        long j3 = x21Var.f29873c;
        int i18 = x21Var.f29871b;
        if (x21Var.G.f23560c3 || x21Var.f29880s.f23560c3) {
            return false;
        }
        Object obj = i51Var.G;
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
        final n70 I = n70.I(boVar, view);
        if (ChatObject.isMonoForum(chat)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i18, chat)) {
                return false;
            }
            TLRPC.Chat chat2 = chat;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new ai.p8(x21Var, I, peerDialogId, chat2, 29), false);
            long j10 = chat2.f18112id;
            if (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(i18, chat2)) {
                long j11 = chat2.linked_monoforum_id;
                if (j11 != 0) {
                    j10 = j11;
                }
            }
            TLRPC.Chat chat3 = MessagesController.getInstance(i18).getChat(Long.valueOf(j10));
            TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(peerDialogId));
            if (user2 != null && ChatObject.canBlockUsers(chat3)) {
                I.c(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), null, false);
                org.telegram.ui.ActionBar.f1 y3 = I.y();
                i14 = 8;
                y3.setVisibility(8);
                n70Var2 = I;
                MessagesController.getInstance(i18).checkIsInChat(true, chat3, user2, new d21(x21Var, y3, I, j10, user2, chat3));
            } else {
                n70Var2 = I;
                i14 = 8;
            }
            n70Var = n70Var2;
            e6Var = e6Var2;
            r62 = 1;
            i15 = 2;
            b10 = 0;
        } else {
            TLRPC.Chat chat4 = chat;
            if (ChatObject.canManageTopics(chat4) || UserObject.isBotForumWithEditableTopics(user)) {
                boolean z11 = tL_forumTopic.pinned;
                if (z11) {
                    i10 = R.drawable.msg_unpin;
                } else {
                    i10 = R.drawable.msg_pin;
                }
                int i20 = i10;
                if (z11) {
                    i11 = R.string.DialogUnpin;
                } else {
                    i11 = R.string.DialogPin;
                }
                I.c(i20, LocaleController.getString(i11), new jn0(x21Var, I, messagesController, tL_forumTopic), false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new e21(x21Var, 0), false);
                }
            }
            if (ChatObject.canManageTopics(chat4) || UserObject.isBotForumWithEditableTopics(user)) {
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(x21Var) {
                    public final x21 f23788b;

                    {
                        this.f23788b = x21Var;
                    }

                    @Override
                    public final void run() {
                        AlertDialog$Builder alertDialog$Builder;
                        int i21 = r4;
                        x21 x21Var2 = this.f23788b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        n70 n70Var3 = I;
                        switch (i21) {
                            case 0:
                                n70Var3.u();
                                x21Var2.h.presentFragment(ze1.a0(-x21Var2.f29873c, tL_forumTopic2.f18164id));
                                return;
                            case 1:
                                x21Var2.getClass();
                                n70Var3.u();
                                MessagesController.getInstance(x21Var2.f29871b).getTopicsController().toggleCloseTopic(-x21Var2.f29873c, tL_forumTopic2.f18164id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                n70Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f18164id));
                                sh shVar = new sh(11);
                                x21 x21Var3 = this.f23788b;
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(x21Var3.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f18437a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j12 = x21Var3.V;
                                if (hashSet.size() == 1) {
                                    alertDialog$Builder = alertDialog$Builder2;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(x21Var3.f29871b).getTopicsController().findTopic(-x21Var3.f29873c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    alertDialog$Builder = alertDialog$Builder2;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                AlertDialog$Builder alertDialog$Builder3 = alertDialog$Builder;
                                alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.we(x21Var3, arrayList, j12, hashSet, shVar));
                                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new an0(11));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19074q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            long j12 = x21Var.f29873c;
            long j13 = tL_forumTopic.f18164id;
            int currentAccount = boVar.getCurrentAccount();
            org.telegram.ui.ActionBar.e6 resourceProvider = boVar.getResourceProvider();
            ko koVar = new ko(I, currentAccount, j12, j13, boVar, resourceProvider);
            n70 J = I.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.mu0(I, 25), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.he(I, currentAccount, j12, j13, J, boVar, resourceProvider), false);
            org.telegram.ui.ActionBar.f1 y10 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new ai.c9(I, resourceProvider, currentAccount, koVar, 17), false);
            e6Var = e6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new org.telegram.messenger.t2(I, j12, j13, boVar, resourceProvider, 7), false);
            J.c(0, "", new ai.p0(I, currentAccount, j12, j13, boVar, resourceProvider), false);
            new org.telegram.messenger.o9(currentAccount, j12, j13, J.y(), y10).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j3, tL_forumTopic.f18164id);
            if (isDialogMuted) {
                i12 = R.drawable.msg_unmute;
            } else {
                i12 = R.drawable.msg_mute;
            }
            int i21 = i12;
            if (isDialogMuted) {
                i13 = R.string.Unmute;
            } else {
                i13 = R.string.Mute;
            }
            i14 = 8;
            i15 = 2;
            b10 = 0;
            n70Var = I;
            n70Var.c(i21, LocaleController.getString(i13), new ai.m3(x21Var, messagesController, tL_forumTopic, I, J, 25), false);
            if (ChatObject.canManageTopic(i18, chat4, tL_forumTopic) && !UserObject.isBotForum(user)) {
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
                z10 = true;
                n70Var.c(i16, LocaleController.getString(i17), new Runnable(x21Var) {
                    public final x21 f23788b;

                    {
                        this.f23788b = x21Var;
                    }

                    @Override
                    public final void run() {
                        AlertDialog$Builder alertDialog$Builder;
                        int i212 = r4;
                        x21 x21Var2 = this.f23788b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        n70 n70Var3 = n70Var;
                        switch (i212) {
                            case 0:
                                n70Var3.u();
                                x21Var2.h.presentFragment(ze1.a0(-x21Var2.f29873c, tL_forumTopic2.f18164id));
                                return;
                            case 1:
                                x21Var2.getClass();
                                n70Var3.u();
                                MessagesController.getInstance(x21Var2.f29871b).getTopicsController().toggleCloseTopic(-x21Var2.f29873c, tL_forumTopic2.f18164id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                n70Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f18164id));
                                sh shVar = new sh(11);
                                x21 x21Var3 = this.f23788b;
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(x21Var3.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f18437a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = x21Var3.V;
                                if (hashSet.size() == 1) {
                                    alertDialog$Builder = alertDialog$Builder2;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(x21Var3.f29871b).getTopicsController().findTopic(-x21Var3.f29873c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    alertDialog$Builder = alertDialog$Builder2;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                AlertDialog$Builder alertDialog$Builder3 = alertDialog$Builder;
                                alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.we(x21Var3, arrayList, j122, hashSet, shVar));
                                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new an0(11));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19074q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            } else {
                z10 = true;
            }
            r62 = z10;
            if (ChatObject.canDeleteTopic(i18, chat4, tL_forumTopic)) {
                n70Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", z10 ? 1 : 0), new Runnable(x21Var) {
                    public final x21 f23788b;

                    {
                        this.f23788b = x21Var;
                    }

                    @Override
                    public final void run() {
                        AlertDialog$Builder alertDialog$Builder;
                        int i212 = r4;
                        x21 x21Var2 = this.f23788b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        n70 n70Var3 = n70Var;
                        switch (i212) {
                            case 0:
                                n70Var3.u();
                                x21Var2.h.presentFragment(ze1.a0(-x21Var2.f29873c, tL_forumTopic2.f18164id));
                                return;
                            case 1:
                                x21Var2.getClass();
                                n70Var3.u();
                                MessagesController.getInstance(x21Var2.f29871b).getTopicsController().toggleCloseTopic(-x21Var2.f29873c, tL_forumTopic2.f18164id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                n70Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f18164id));
                                sh shVar = new sh(11);
                                x21 x21Var3 = this.f23788b;
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(x21Var3.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f18437a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = x21Var3.V;
                                if (hashSet.size() == 1) {
                                    alertDialog$Builder = alertDialog$Builder2;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(x21Var3.f29871b).getTopicsController().findTopic(-x21Var3.f29873c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    alertDialog$Builder = alertDialog$Builder2;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                AlertDialog$Builder alertDialog$Builder3 = alertDialog$Builder;
                                alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.we(x21Var3, arrayList, j122, hashSet, shVar));
                                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new an0(11));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19074q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                r62 = z10;
            }
        }
        if (view instanceof s21) {
            bw bwVar = new bw(i15, b10);
            Paint paint = new Paint((int) r62);
            bwVar.f22877c = paint;
            bwVar.f22876b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, e6Var));
            n70Var.W(bwVar);
            n70Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18836d6, e6Var);
            float f7 = b10;
            float f10 = dp;
            float f11 = dp2;
            float[] fArr = new float[i14];
            fArr[b10] = f7;
            fArr[r62] = f7;
            fArr[i15] = f10;
            fArr[3] = f10;
            fArr[4] = f11;
            fArr[5] = f11;
            fArr[6] = f7;
            fArr[7] = f7;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(v02);
            n70Var.W(shapeDrawable);
        }
        n70Var.Z();
        return r62;
    }

    public static ImageView i(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        w7.z5.a(imageView);
        return imageView;
    }

    private void setAttached(boolean z10) {
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        long j3 = this.f29873c;
        int i10 = this.f29871b;
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
    public final void D(int i10, float f7, float f10, le.e eVar) {
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
        ofFloat.addUpdateListener(new h70(this, 28));
        this.U.addListener(new o21(this, z10));
        this.U.setInterpolator(ji.n.V);
        this.U.setDuration(250L);
        this.U.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.topicsDidLoaded;
        long j3 = this.f29873c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == (-j3)) {
                o();
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
            MessagesController.getInstance(this.f29871b).getTopicsController().sortTopics(-j3, false);
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
        FrameLayout frameLayout2 = this.f29879r;
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
            canvas.clipPath(this.K.f4283j.f4272k);
        }
        if (view == this.f29879r) {
            canvas.clipPath(this.L.f4283j.f4272k);
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
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f29871b).getTopicsController().getTopics(-this.f29873c);
        if (topics != null && !topics.isEmpty() && !this.f29875d0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29869a.a(z11, z10);
    }

    public final void g() {
        int i10;
        int i11;
        int i12;
        le.b bVar = this.J;
        float f7 = bVar.e;
        ImageView imageView = this.f29881w;
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
        ImageView imageView2 = this.f29882x;
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
        ImageView imageView3 = this.f29883y;
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

    public t21 getCurrentTabsPosition() {
        if (this.Q) {
            return t21.f28043b;
        }
        if (this.P) {
            return t21.f28044c;
        }
        return t21.f28042a;
    }

    public float getSideMenuT() {
        return this.R * this.f29869a.e;
    }

    public final void h() {
        int i10;
        float lerp = AndroidUtilities.lerp(1.0f, 0.0f, this.R);
        FrameLayout frameLayout = this.f29879r;
        frameLayout.setAlpha(lerp);
        if ((1.0f - this.R) * this.f29869a.e > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        if (this.P) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.M) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, j(t21.f28044c)));
        } else {
            frameLayout.setTranslationY(this.N + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, j(t21.f28042a)));
        }
    }

    public final float j(t21 t21Var) {
        float f7;
        float f10 = this.f29869a.e;
        if (t21Var == t21.f28043b) {
            f7 = this.R;
        } else if ((t21Var == t21.f28042a && !this.P) || (t21Var == t21.f28044c && this.P)) {
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
                n21 n21Var = this.G;
                if (i10 >= n21Var.getChildCount()) {
                    break;
                }
                i51 G = n21Var.Y2.G(RecyclerView.R(n21Var.getChildAt(i10)));
                if (G == null || !G.f24900r) {
                    i10++;
                } else {
                    return true;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                l21 l21Var = this.f29880s;
                if (i11 >= l21Var.getChildCount()) {
                    break;
                }
                i51 G2 = l21Var.Y2.G(RecyclerView.R(l21Var.getChildAt(i11)));
                if (G2 != null && G2.f24900r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void l() {
        TopicsController topicsController = MessagesController.getInstance(this.f29871b).getTopicsController();
        long j3 = this.f29873c;
        if (!topicsController.endIsReached(-j3)) {
            topicsController.loadTopics(-j3);
        }
    }

    public final void m(long j3, boolean z10) {
        if (this.e) {
            Utilities.Callback2 callback2 = this.f29874c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j3), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.f29870a0;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j3), Boolean.valueOf(z10));
        }
    }

    public final void n() {
        org.telegram.ui.le leVar = this.O;
        if (leVar != null) {
            leVar.run();
        }
        h();
        float j3 = j(t21.f28043b);
        int i10 = 0;
        FrameLayout frameLayout = this.F;
        frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, j3));
        if (j3 <= 0.0f) {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        int i11 = org.telegram.ui.ActionBar.i6.f19237z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i11, e6Var);
        int i12 = org.telegram.ui.ActionBar.i6.Oh;
        int d = i0.a.d(1.0f - this.R, v02, org.telegram.ui.ActionBar.i6.v0(i12, e6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f29883y.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.E.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.R, org.telegram.ui.ActionBar.i6.v0(i11, e6Var), org.telegram.ui.ActionBar.i6.v0(i12, e6Var)), mode));
        this.f29881w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i12, e6Var), mode));
        this.f29882x.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i12, e6Var), mode));
        invalidate();
    }

    public final void o() {
        f(true);
        l21 l21Var = this.f29880s;
        boolean canScrollHorizontally = l21Var.canScrollHorizontally(-1);
        l21Var.Y2.N(true);
        if (!canScrollHorizontally) {
            l21Var.u0(0);
        }
        n21 n21Var = this.G;
        boolean canScrollVertically = n21Var.canScrollVertically(-1);
        n21Var.Y2.N(true);
        if (!canScrollVertically) {
            n21Var.u0(0);
        }
        AndroidUtilities.runOnUIThread(new e21(this, 1));
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
        if (this.f29875d0 != z10) {
            this.f29875d0 = z10;
            f(true);
        }
    }

    public void setCurrentTopic(long j3) {
        boolean z10;
        this.V = j3;
        l21 l21Var = this.f29880s;
        l21Var.Y2.N(true);
        l21Var.invalidate();
        this.G.Y2.N(true);
        w21 w21Var = this.v;
        if (w21Var != null) {
            if (j3 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w21Var.c(true, false, z10);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.f29874c0 = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.f29872b0 = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.f29870a0 = callback2;
    }

    public void setSideMenuBackgroundDrawable(ch.d dVar) {
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

    public void setTopMenuBackgroundDrawable(ch.d dVar) {
        this.L = dVar;
        dVar.q(AndroidUtilities.dp(18.0f));
        this.L.p(AndroidUtilities.dp(7.0f));
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
