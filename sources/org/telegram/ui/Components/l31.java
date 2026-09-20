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
import org.telegram.ui.bf1;
public final class l31 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, le.d {
    public static final int f26009f0 = 0;
    public final ImageView E;
    public final FrameLayout F;
    public final b31 G;
    public long H;
    public long I;
    public final le.b J;
    public ch.d K;
    public ch.d L;
    public float M;
    public float N;
    public org.telegram.ui.me O;
    public boolean P;
    public boolean Q;
    public float R;
    public boolean S;
    public Boolean T;
    public ValueAnimator U;
    public long V;
    public boolean W;
    public final le.b f26010a;
    public Utilities.Callback2 f26011a0;
    public final int f26012b;
    public Runnable f26013b0;
    public final long f26014c;
    public Utilities.Callback2 f26015c0;
    public final org.telegram.ui.ActionBar.f6 d;
    public boolean f26016d0;
    public final boolean e;
    public final HashSet f26017e0;
    public final boolean f26018f;
    public final org.telegram.ui.zn h;
    public final boolean f26019n;
    public final FrameLayout f26020r;
    public final z21 f26021s;
    public final k31 v;
    public final ImageView f26022w;
    public final ImageView f26023x;
    public final ImageView f26024y;

    public l31(Activity activity, org.telegram.ui.zn znVar, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        FrameLayout frameLayout;
        float f7;
        int i11;
        boolean z10;
        qr qrVar = qr.h;
        this.f26010a = new le.b(0, this, qrVar, 380L, true);
        this.J = new le.b(0, new q21(this), qrVar, 320L, false);
        this.R = 0.0f;
        this.f26017e0 = new HashSet();
        this.h = znVar;
        this.f26012b = i10;
        this.f26014c = j3;
        this.d = f6Var;
        long j10 = -j3;
        this.e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j10)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j3)));
        this.f26018f = isBotForumWithEditableTopics;
        this.f26019n = !org.telegram.messenger.l0.u("topics_end_reached_", j10, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.f26020r = frameLayout2;
        addView(frameLayout2, w7.y5.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.F = frameLayout3;
        addView(frameLayout3, w7.y5.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        z21 z21Var = new z21(this, activity, i10, new Utilities.Callback2(this) {
            public final l31 f30447b;

            {
                this.f30447b = this;
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
                l31 l31Var = this.f30447b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        k61 k61Var = (k61) obj2;
                        boolean z18 = l31Var.f26018f;
                        int i14 = l31Var.f26012b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = l31Var.f26014c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z19 = l31Var.e;
                        int i15 = f31.f23995a;
                        w51 J = w51.J(f31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f29953q = z19;
                        if (l31Var.V == 0) {
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
                                    if (tL_forumTopic2.f18380id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (l31Var.f26017e0.contains(Integer.valueOf(tL_forumTopic2.f18380id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((w51) hg.k0.g(1, arrayList)).f29960y |= 8;
                                        }
                                        k61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        k61Var.M();
                                        z20 = true;
                                    }
                                    w51 J2 = w51.J(f31.class);
                                    J2.f29959x = j16;
                                    J2.d = tL_forumTopic2.f18380id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j18 = l31Var.V;
                                    if (z19) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.f18380id;
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
                            k61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && l31Var.f26019n) {
                            w51 J3 = w51.J(f31.class);
                            J3.d = -2;
                            J3.f29954r = true;
                            arrayList.add(J3);
                            w51 J4 = w51.J(f31.class);
                            J4.d = -3;
                            J4.f29954r = true;
                            arrayList.add(J4);
                            w51 J5 = w51.J(f31.class);
                            J5.d = -4;
                            J5.f29954r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                w51 J6 = w51.J(f31.class);
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
                        l31.b(l31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        k61 k61Var2 = (k61) obj2;
                        boolean z22 = l31Var.e;
                        int i19 = l31Var.f26012b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = l31Var.f26014c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z23 = l31Var.f26018f;
                        if (!z23) {
                            int i20 = j31.f25215a;
                            w51 J7 = w51.J(j31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f29953q = z22;
                            J7.f29960y = z23 ? 1 : 0;
                            if (l31Var.V == 0) {
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
                                    if (tL_forumTopic4.f18380id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (l31Var.f26017e0.contains(Integer.valueOf(tL_forumTopic4.f18380id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        k61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        k61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = j31.f25215a;
                                    w51 J8 = w51.J(j31.class);
                                    J8.f29959x = j19;
                                    J8.d = tL_forumTopic4.f18380id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = l31Var.V;
                                    if (z22) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.f18380id;
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
                            k61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && l31Var.f26019n) {
                            int i24 = j31.f25215a;
                            w51 J9 = w51.J(j31.class);
                            J9.d = -2;
                            J9.f29954r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            w51 J10 = w51.J(j31.class);
                            J10.d = -3;
                            J10.f29954r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            w51 J11 = w51.J(j31.class);
                            J11.d = -4;
                            J11.f29954r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = j31.f25215a;
                                w51 J12 = w51.J(j31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f29953q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new q21(this), new q21(this), f6Var);
        this.f26021s = z21Var;
        z21Var.C1(new Utilities.Callback2(this) {
            public final l31 f30447b;

            {
                this.f30447b = this;
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
                l31 l31Var = this.f30447b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        k61 k61Var = (k61) obj2;
                        boolean z18 = l31Var.f26018f;
                        int i14 = l31Var.f26012b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = l31Var.f26014c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z19 = l31Var.e;
                        int i15 = f31.f23995a;
                        w51 J = w51.J(f31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f29953q = z19;
                        if (l31Var.V == 0) {
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
                                    if (tL_forumTopic2.f18380id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (l31Var.f26017e0.contains(Integer.valueOf(tL_forumTopic2.f18380id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((w51) hg.k0.g(1, arrayList)).f29960y |= 8;
                                        }
                                        k61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        k61Var.M();
                                        z20 = true;
                                    }
                                    w51 J2 = w51.J(f31.class);
                                    J2.f29959x = j16;
                                    J2.d = tL_forumTopic2.f18380id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j18 = l31Var.V;
                                    if (z19) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.f18380id;
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
                            k61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && l31Var.f26019n) {
                            w51 J3 = w51.J(f31.class);
                            J3.d = -2;
                            J3.f29954r = true;
                            arrayList.add(J3);
                            w51 J4 = w51.J(f31.class);
                            J4.d = -3;
                            J4.f29954r = true;
                            arrayList.add(J4);
                            w51 J5 = w51.J(f31.class);
                            J5.d = -4;
                            J5.f29954r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                w51 J6 = w51.J(f31.class);
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
                        l31.b(l31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        k61 k61Var2 = (k61) obj2;
                        boolean z22 = l31Var.e;
                        int i19 = l31Var.f26012b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = l31Var.f26014c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z23 = l31Var.f26018f;
                        if (!z23) {
                            int i20 = j31.f25215a;
                            w51 J7 = w51.J(j31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f29953q = z22;
                            J7.f29960y = z23 ? 1 : 0;
                            if (l31Var.V == 0) {
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
                                    if (tL_forumTopic4.f18380id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (l31Var.f26017e0.contains(Integer.valueOf(tL_forumTopic4.f18380id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        k61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        k61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = j31.f25215a;
                                    w51 J8 = w51.J(j31.class);
                                    J8.f29959x = j19;
                                    J8.d = tL_forumTopic4.f18380id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = l31Var.V;
                                    if (z22) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.f18380id;
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
                            k61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && l31Var.f26019n) {
                            int i24 = j31.f25215a;
                            w51 J9 = w51.J(j31.class);
                            J9.d = -2;
                            J9.f29954r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            w51 J10 = w51.J(j31.class);
                            J10.d = -3;
                            J10.f29954r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            w51 J11 = w51.J(j31.class);
                            J11.d = -4;
                            J11.f29954r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = j31.f25215a;
                                w51 J12 = w51.J(j31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f29953q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        z21Var.setWillNotDraw(false);
        z21Var.Y2.f25678r = false;
        z21Var.getContext();
        gg.j0 j0Var = new gg.j0((ViewGroup) z21Var, 6);
        z21Var.X2 = j0Var;
        z21Var.setLayoutManager(j0Var);
        frameLayout2.addView(z21Var, w7.y5.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        z21Var.j(new a31(this, 0));
        if (isBotForumWithEditableTopics) {
            k31 k31Var = new k31(activity, i10, f6Var);
            this.v = k31Var;
            if (this.V == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            k31Var.c(true, false, z10);
            k31Var.setOnClickListener(new View.OnClickListener(this) {
                public final l31 f28527b;

                {
                    this.f28527b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            l31 l31Var = this.f28527b;
                            Boolean bool = l31Var.T;
                            boolean z11 = false;
                            if (bool == null ? !l31Var.Q : !bool.booleanValue()) {
                                z11 = true;
                            }
                            l31Var.d(z11);
                            return;
                        case 1:
                            l31 l31Var2 = this.f28527b;
                            b31 b31Var = l31Var2.G;
                            b31Var.x1(false);
                            z21 z21Var2 = l31Var2.f26021s;
                            z21Var2.x1(false);
                            l31Var2.J.a(false, true);
                            AndroidUtilities.updateVisibleRows(b31Var);
                            AndroidUtilities.updateVisibleRows(z21Var2);
                            return;
                        default:
                            this.f28527b.f26011a0.run(0, Boolean.FALSE);
                            return;
                    }
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(k31Var, w7.y5.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            frameLayout = frameLayout3;
            this.v = null;
        }
        ViewGroup viewGroup = frameLayout;
        b31 b31Var = new b31(activity, i10, new Utilities.Callback2(this) {
            public final l31 f30447b;

            {
                this.f30447b = this;
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
                l31 l31Var = this.f30447b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        k61 k61Var = (k61) obj2;
                        boolean z18 = l31Var.f26018f;
                        int i14 = l31Var.f26012b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = l31Var.f26014c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z19 = l31Var.e;
                        int i15 = f31.f23995a;
                        w51 J = w51.J(f31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f29953q = z19;
                        if (l31Var.V == 0) {
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
                                    if (tL_forumTopic2.f18380id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (l31Var.f26017e0.contains(Integer.valueOf(tL_forumTopic2.f18380id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((w51) hg.k0.g(1, arrayList)).f29960y |= 8;
                                        }
                                        k61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        k61Var.M();
                                        z20 = true;
                                    }
                                    w51 J2 = w51.J(f31.class);
                                    J2.f29959x = j16;
                                    J2.d = tL_forumTopic2.f18380id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j18 = l31Var.V;
                                    if (z19) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.f18380id;
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
                            k61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && l31Var.f26019n) {
                            w51 J3 = w51.J(f31.class);
                            J3.d = -2;
                            J3.f29954r = true;
                            arrayList.add(J3);
                            w51 J4 = w51.J(f31.class);
                            J4.d = -3;
                            J4.f29954r = true;
                            arrayList.add(J4);
                            w51 J5 = w51.J(f31.class);
                            J5.d = -4;
                            J5.f29954r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                w51 J6 = w51.J(f31.class);
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
                        l31.b(l31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        k61 k61Var2 = (k61) obj2;
                        boolean z22 = l31Var.e;
                        int i19 = l31Var.f26012b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = l31Var.f26014c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z23 = l31Var.f26018f;
                        if (!z23) {
                            int i20 = j31.f25215a;
                            w51 J7 = w51.J(j31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f29953q = z22;
                            J7.f29960y = z23 ? 1 : 0;
                            if (l31Var.V == 0) {
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
                                    if (tL_forumTopic4.f18380id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (l31Var.f26017e0.contains(Integer.valueOf(tL_forumTopic4.f18380id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        k61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        k61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = j31.f25215a;
                                    w51 J8 = w51.J(j31.class);
                                    J8.f29959x = j19;
                                    J8.d = tL_forumTopic4.f18380id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = l31Var.V;
                                    if (z22) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.f18380id;
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
                            k61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && l31Var.f26019n) {
                            int i24 = j31.f25215a;
                            w51 J9 = w51.J(j31.class);
                            J9.d = -2;
                            J9.f29954r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            w51 J10 = w51.J(j31.class);
                            J10.d = -3;
                            J10.f29954r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            w51 J11 = w51.J(j31.class);
                            J11.d = -4;
                            J11.f29954r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = j31.f25215a;
                                w51 J12 = w51.J(j31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f29953q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new q21(this), new q21(this), f6Var);
        this.G = b31Var;
        b31Var.C1(new Utilities.Callback2(this) {
            public final l31 f30447b;

            {
                this.f30447b = this;
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
                l31 l31Var = this.f30447b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        k61 k61Var = (k61) obj2;
                        boolean z18 = l31Var.f26018f;
                        int i14 = l31Var.f26012b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = l31Var.f26014c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z19 = l31Var.e;
                        int i15 = f31.f23995a;
                        w51 J = w51.J(f31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f29953q = z19;
                        if (l31Var.V == 0) {
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
                                    if (tL_forumTopic2.f18380id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (l31Var.f26017e0.contains(Integer.valueOf(tL_forumTopic2.f18380id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((w51) hg.k0.g(1, arrayList)).f29960y |= 8;
                                        }
                                        k61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        k61Var.M();
                                        z20 = true;
                                    }
                                    w51 J2 = w51.J(f31.class);
                                    J2.f29959x = j16;
                                    J2.d = tL_forumTopic2.f18380id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j18 = l31Var.V;
                                    if (z19) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.f18380id;
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
                            k61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && l31Var.f26019n) {
                            w51 J3 = w51.J(f31.class);
                            J3.d = -2;
                            J3.f29954r = true;
                            arrayList.add(J3);
                            w51 J4 = w51.J(f31.class);
                            J4.d = -3;
                            J4.f29954r = true;
                            arrayList.add(J4);
                            w51 J5 = w51.J(f31.class);
                            J5.d = -4;
                            J5.f29954r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                w51 J6 = w51.J(f31.class);
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
                        l31.b(l31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        k61 k61Var2 = (k61) obj2;
                        boolean z22 = l31Var.e;
                        int i19 = l31Var.f26012b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = l31Var.f26014c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z23 = l31Var.f26018f;
                        if (!z23) {
                            int i20 = j31.f25215a;
                            w51 J7 = w51.J(j31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f29953q = z22;
                            J7.f29960y = z23 ? 1 : 0;
                            if (l31Var.V == 0) {
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
                                    if (tL_forumTopic4.f18380id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (l31Var.f26017e0.contains(Integer.valueOf(tL_forumTopic4.f18380id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        k61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        k61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = j31.f25215a;
                                    w51 J8 = w51.J(j31.class);
                                    J8.f29959x = j19;
                                    J8.d = tL_forumTopic4.f18380id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = l31Var.V;
                                    if (z22) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.f18380id;
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
                            k61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && l31Var.f26019n) {
                            int i24 = j31.f25215a;
                            w51 J9 = w51.J(j31.class);
                            J9.d = -2;
                            J9.f29954r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            w51 J10 = w51.J(j31.class);
                            J10.d = -3;
                            J10.f29954r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            w51 J11 = w51.J(j31.class);
                            J11.d = -4;
                            J11.f29954r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = j31.f25215a;
                                w51 J12 = w51.J(j31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f29953q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        b31Var.Y2.f25678r = false;
        b31Var.setClipToPadding(false);
        b31Var.setClipChildren(false);
        if (isBotForumWithEditableTopics) {
            f7 = 90.0f;
        } else {
            f7 = 48.0f;
        }
        viewGroup.addView(b31Var, w7.y5.d(-1, -1.0f, 119, 0.0f, f7, 0.0f, 0.0f));
        b31Var.j(new a31(this, 1));
        ImageView i12 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final l31 f28527b;

            {
                this.f28527b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l31 l31Var = this.f28527b;
                        Boolean bool = l31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !l31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        l31Var.d(z11);
                        return;
                    case 1:
                        l31 l31Var2 = this.f28527b;
                        b31 b31Var2 = l31Var2.G;
                        b31Var2.x1(false);
                        z21 z21Var2 = l31Var2.f26021s;
                        z21Var2.x1(false);
                        l31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(b31Var2);
                        AndroidUtilities.updateVisibleRows(z21Var2);
                        return;
                    default:
                        this.f28527b.f26011a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f26024y = i12;
        ImageView i13 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final l31 f28527b;

            {
                this.f28527b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l31 l31Var = this.f28527b;
                        Boolean bool = l31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !l31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        l31Var.d(z11);
                        return;
                    case 1:
                        l31 l31Var2 = this.f28527b;
                        b31 b31Var2 = l31Var2.G;
                        b31Var2.x1(false);
                        z21 z21Var2 = l31Var2.f26021s;
                        z21Var2.x1(false);
                        l31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(b31Var2);
                        AndroidUtilities.updateVisibleRows(z21Var2);
                        return;
                    default:
                        this.f28527b.f26011a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.E = i13;
        frameLayout2.addView(i12, w7.y5.e(44, 36, 51));
        viewGroup.addView(i13, w7.y5.e(64, 48, 51));
        ImageView i14 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final l31 f28527b;

            {
                this.f28527b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l31 l31Var = this.f28527b;
                        Boolean bool = l31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !l31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        l31Var.d(z11);
                        return;
                    case 1:
                        l31 l31Var2 = this.f28527b;
                        b31 b31Var2 = l31Var2.G;
                        b31Var2.x1(false);
                        z21 z21Var2 = l31Var2.f26021s;
                        z21Var2.x1(false);
                        l31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(b31Var2);
                        AndroidUtilities.updateVisibleRows(z21Var2);
                        return;
                    default:
                        this.f28527b.f26011a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f26022w = i14;
        ImageView i15 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final l31 f28527b;

            {
                this.f28527b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l31 l31Var = this.f28527b;
                        Boolean bool = l31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !l31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        l31Var.d(z11);
                        return;
                    case 1:
                        l31 l31Var2 = this.f28527b;
                        b31 b31Var2 = l31Var2.G;
                        b31Var2.x1(false);
                        z21 z21Var2 = l31Var2.f26021s;
                        z21Var2.x1(false);
                        l31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(b31Var2);
                        AndroidUtilities.updateVisibleRows(z21Var2);
                        return;
                    default:
                        this.f28527b.f26011a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f26023x = i15;
        frameLayout2.addView(i14, w7.y5.e(44, 36, 51));
        viewGroup.addView(i15, w7.y5.e(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j10, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.l0.u("topicssidetabs", j3, mainSettings, false)) {
            this.R = 1.0f;
            this.Q = true;
        }
        boolean u10 = org.telegram.messenger.l0.u("topicssidetabsb", j3, mainSettings, false);
        this.P = u10;
        if (u10) {
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

    public static void a(l31 l31Var, w51 w51Var) {
        if (l31Var.e) {
            Utilities.Callback2 callback2 = l31Var.f26015c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(w51Var.B), Boolean.FALSE);
            }
        } else if (w51Var.B == -2) {
            Runnable runnable = l31Var.f26013b0;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            Utilities.Callback2 callback22 = l31Var.f26011a0;
            if (callback22 != null) {
                callback22.run(Integer.valueOf(w51Var.d), Boolean.FALSE);
            }
        }
    }

    public static void b(l31 l31Var, ArrayList arrayList) {
        long j3 = l31Var.f26014c;
        TopicsController topicsController = MessagesController.getInstance(l31Var.f26012b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = com.google.android.gms.internal.vision.e2.e(((w51) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j10 = -j3;
        topicsController.reorderPinnedTopics(j10, arrayList2);
        topicsController.sortTopics(j10, false);
    }

    public static boolean c(final l31 l31Var, w51 w51Var, View view) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i12;
        int i13;
        int i14;
        int i15;
        byte b10;
        final v70 v70Var;
        boolean z10;
        int i16;
        int i17;
        ?? r62;
        v70 v70Var2;
        org.telegram.ui.ActionBar.f6 f6Var2 = l31Var.d;
        org.telegram.ui.zn znVar = l31Var.h;
        long j3 = l31Var.f26014c;
        int i18 = l31Var.f26012b;
        if (l31Var.G.f28065c3 || l31Var.f26021s.f28065c3) {
            return false;
        }
        Object obj = w51Var.G;
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
        final v70 I = v70.I(znVar, view);
        if (ChatObject.isMonoForum(chat)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i18, chat)) {
                return false;
            }
            TLRPC.Chat chat2 = chat;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new ai.p8(l31Var, I, peerDialogId, chat2, 29), false);
            long j10 = chat2.f18328id;
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
                v70Var2 = I;
                MessagesController.getInstance(i18).checkIsInChat(true, chat3, user2, new r21(l31Var, y3, I, j10, user2, chat3));
            } else {
                v70Var2 = I;
                i14 = 8;
            }
            v70Var = v70Var2;
            f6Var = f6Var2;
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
                I.c(i20, LocaleController.getString(i11), new vn0(l31Var, I, messagesController, tL_forumTopic), false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new s21(l31Var, 0), false);
                }
            }
            if (ChatObject.canManageTopics(chat4) || UserObject.isBotForumWithEditableTopics(user)) {
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(l31Var) {
                    public final l31 f28275b;

                    {
                        this.f28275b = l31Var;
                    }

                    @Override
                    public final void run() {
                        boolean z12;
                        int i21 = r4;
                        l31 l31Var2 = this.f28275b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        v70 v70Var3 = I;
                        switch (i21) {
                            case 0:
                                v70Var3.u();
                                l31Var2.h.presentFragment(bf1.a0(-l31Var2.f26014c, tL_forumTopic2.f18380id));
                                return;
                            case 1:
                                l31Var2.getClass();
                                v70Var3.u();
                                MessagesController.getInstance(l31Var2.f26012b).getTopicsController().toggleCloseTopic(-l31Var2.f26014c, tL_forumTopic2.f18380id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                v70Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f18380id));
                                sh shVar = new sh(13);
                                l31 l31Var3 = this.f28275b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l31Var3.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j12 = l31Var3.V;
                                if (hashSet.size() == 1) {
                                    z12 = false;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(l31Var3.f26012b).getTopicsController().findTopic(-l31Var3.f26014c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z12 = false;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.xe(l31Var3, arrayList, j12, hashSet, shVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ig0(15));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19333q7, z12));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            long j12 = l31Var.f26014c;
            long j13 = tL_forumTopic.f18380id;
            int currentAccount = znVar.getCurrentAccount();
            org.telegram.ui.ActionBar.f6 resourceProvider = znVar.getResourceProvider();
            ko koVar = new ko(I, currentAccount, j12, j13, znVar, resourceProvider);
            v70 J = I.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.mu0(I, 25), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.he(I, currentAccount, j12, j13, J, znVar, resourceProvider), false);
            org.telegram.ui.ActionBar.f1 y10 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new ai.c9(I, resourceProvider, currentAccount, koVar, 17), false);
            f6Var = f6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new org.telegram.messenger.t2(I, j12, j13, znVar, resourceProvider, 7), false);
            J.c(0, "", new ai.p0(I, currentAccount, j12, j13, znVar, resourceProvider), false);
            new org.telegram.messenger.o9(currentAccount, j12, j13, J.y(), y10).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j3, tL_forumTopic.f18380id);
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
            v70Var = I;
            v70Var.c(i21, LocaleController.getString(i13), new ai.m3(l31Var, messagesController, tL_forumTopic, I, J, 25), false);
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
                v70Var.c(i16, LocaleController.getString(i17), new Runnable(l31Var) {
                    public final l31 f28275b;

                    {
                        this.f28275b = l31Var;
                    }

                    @Override
                    public final void run() {
                        boolean z122;
                        int i212 = r4;
                        l31 l31Var2 = this.f28275b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        v70 v70Var3 = v70Var;
                        switch (i212) {
                            case 0:
                                v70Var3.u();
                                l31Var2.h.presentFragment(bf1.a0(-l31Var2.f26014c, tL_forumTopic2.f18380id));
                                return;
                            case 1:
                                l31Var2.getClass();
                                v70Var3.u();
                                MessagesController.getInstance(l31Var2.f26012b).getTopicsController().toggleCloseTopic(-l31Var2.f26014c, tL_forumTopic2.f18380id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                v70Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f18380id));
                                sh shVar = new sh(13);
                                l31 l31Var3 = this.f28275b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l31Var3.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = l31Var3.V;
                                if (hashSet.size() == 1) {
                                    z122 = false;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(l31Var3.f26012b).getTopicsController().findTopic(-l31Var3.f26014c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z122 = false;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.xe(l31Var3, arrayList, j122, hashSet, shVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ig0(15));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19333q7, z122));
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
                v70Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", z10 ? 1 : 0), new Runnable(l31Var) {
                    public final l31 f28275b;

                    {
                        this.f28275b = l31Var;
                    }

                    @Override
                    public final void run() {
                        boolean z122;
                        int i212 = r4;
                        l31 l31Var2 = this.f28275b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        v70 v70Var3 = v70Var;
                        switch (i212) {
                            case 0:
                                v70Var3.u();
                                l31Var2.h.presentFragment(bf1.a0(-l31Var2.f26014c, tL_forumTopic2.f18380id));
                                return;
                            case 1:
                                l31Var2.getClass();
                                v70Var3.u();
                                MessagesController.getInstance(l31Var2.f26012b).getTopicsController().toggleCloseTopic(-l31Var2.f26014c, tL_forumTopic2.f18380id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                v70Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f18380id));
                                sh shVar = new sh(13);
                                l31 l31Var3 = this.f28275b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l31Var3.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = l31Var3.V;
                                if (hashSet.size() == 1) {
                                    z122 = false;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(l31Var3.f26012b).getTopicsController().findTopic(-l31Var3.f26014c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z122 = false;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.xe(l31Var3, arrayList, j122, hashSet, shVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ig0(15));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19333q7, z122));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                r62 = z10;
            }
        }
        if (view instanceof g31) {
            cw cwVar = new cw(i15, b10);
            Paint paint = new Paint((int) r62);
            cwVar.f23415c = paint;
            cwVar.f23414b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
            v70Var.W(cwVar);
            v70Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19094d6, f6Var);
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
            v70Var.W(shapeDrawable);
        }
        v70Var.Z();
        return r62;
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
        long j3 = this.f26014c;
        int i10 = this.f26012b;
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
        ofFloat.addUpdateListener(new p70(this, 28));
        this.U.addListener(new c31(this, z10));
        this.U.setInterpolator(ji.n.V);
        this.U.setDuration(250L);
        this.U.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.topicsDidLoaded;
        long j3 = this.f26014c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == (-j3)) {
                o();
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
            MessagesController.getInstance(this.f26012b).getTopicsController().sortTopics(-j3, false);
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
        FrameLayout frameLayout2 = this.f26020r;
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
            canvas.clipPath(this.K.f4289j.f4278k);
        }
        if (view == this.f26020r) {
            canvas.clipPath(this.L.f4289j.f4278k);
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
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f26012b).getTopicsController().getTopics(-this.f26014c);
        if (topics != null && !topics.isEmpty() && !this.f26016d0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f26010a.a(z11, z10);
    }

    public final void g() {
        int i10;
        int i11;
        int i12;
        le.b bVar = this.J;
        float f7 = bVar.e;
        ImageView imageView = this.f26022w;
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
        ImageView imageView2 = this.f26023x;
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
        ImageView imageView3 = this.f26024y;
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

    public h31 getCurrentTabsPosition() {
        if (this.Q) {
            return h31.f24537b;
        }
        if (this.P) {
            return h31.f24538c;
        }
        return h31.f24536a;
    }

    public float getSideMenuT() {
        return this.R * this.f26010a.e;
    }

    public final void h() {
        int i10;
        float lerp = AndroidUtilities.lerp(1.0f, 0.0f, this.R);
        FrameLayout frameLayout = this.f26020r;
        frameLayout.setAlpha(lerp);
        if ((1.0f - this.R) * this.f26010a.e > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        if (this.P) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.M) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, j(h31.f24538c)));
        } else {
            frameLayout.setTranslationY(this.N + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, j(h31.f24536a)));
        }
    }

    public final float j(h31 h31Var) {
        float f7;
        float f10 = this.f26010a.e;
        if (h31Var == h31.f24537b) {
            f7 = this.R;
        } else if ((h31Var == h31.f24536a && !this.P) || (h31Var == h31.f24538c && this.P)) {
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
                b31 b31Var = this.G;
                if (i10 >= b31Var.getChildCount()) {
                    break;
                }
                w51 G = b31Var.Y2.G(RecyclerView.S(b31Var.getChildAt(i10)));
                if (G == null || !G.f29954r) {
                    i10++;
                } else {
                    return true;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                z21 z21Var = this.f26021s;
                if (i11 >= z21Var.getChildCount()) {
                    break;
                }
                w51 G2 = z21Var.Y2.G(RecyclerView.S(z21Var.getChildAt(i11)));
                if (G2 != null && G2.f29954r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void l() {
        TopicsController topicsController = MessagesController.getInstance(this.f26012b).getTopicsController();
        long j3 = this.f26014c;
        if (!topicsController.endIsReached(-j3)) {
            topicsController.loadTopics(-j3);
        }
    }

    public final void m(long j3, boolean z10) {
        if (this.e) {
            Utilities.Callback2 callback2 = this.f26015c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j3), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.f26011a0;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j3), Boolean.valueOf(z10));
        }
    }

    public final void n() {
        org.telegram.ui.me meVar = this.O;
        if (meVar != null) {
            meVar.run();
        }
        h();
        float j3 = j(h31.f24537b);
        int i10 = 0;
        FrameLayout frameLayout = this.F;
        frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, j3));
        if (j3 <= 0.0f) {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        int i11 = org.telegram.ui.ActionBar.j6.f19496z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        int d = i0.a.d(1.0f - this.R, v02, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f26024y.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.E.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.R, org.telegram.ui.ActionBar.j6.v0(i11, f6Var), org.telegram.ui.ActionBar.j6.v0(i12, f6Var)), mode));
        this.f26022w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), mode));
        this.f26023x.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), mode));
        invalidate();
    }

    public final void o() {
        f(true);
        z21 z21Var = this.f26021s;
        boolean canScrollHorizontally = z21Var.canScrollHorizontally(-1);
        z21Var.Y2.N(true);
        if (!canScrollHorizontally) {
            z21Var.v0(0);
        }
        b31 b31Var = this.G;
        boolean canScrollVertically = b31Var.canScrollVertically(-1);
        b31Var.Y2.N(true);
        if (!canScrollVertically) {
            b31Var.v0(0);
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
        if (this.f26016d0 != z10) {
            this.f26016d0 = z10;
            f(true);
        }
    }

    public void setCurrentTopic(long j3) {
        boolean z10;
        this.V = j3;
        z21 z21Var = this.f26021s;
        z21Var.Y2.N(true);
        z21Var.invalidate();
        this.G.Y2.N(true);
        k31 k31Var = this.v;
        if (k31Var != null) {
            if (j3 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            k31Var.c(true, false, z10);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.f26015c0 = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.f26013b0 = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.f26011a0 = callback2;
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
