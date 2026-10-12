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
import org.telegram.ui.hf1;
public final class y31 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ne.d {
    public static final int f31469f0 = 0;
    public final ImageView E;
    public final FrameLayout F;
    public final o31 G;
    public long H;
    public long I;
    public final ne.b J;
    public dh.d K;
    public dh.d L;
    public float M;
    public float N;
    public org.telegram.ui.se O;
    public boolean P;
    public boolean Q;
    public float R;
    public boolean S;
    public Boolean T;
    public ValueAnimator U;
    public long V;
    public boolean W;
    public final ne.b f31470a;
    public Utilities.Callback2 f31471a0;
    public final int f31472b;
    public Runnable f31473b0;
    public final long f31474c;
    public Utilities.Callback2 f31475c0;
    public final org.telegram.ui.ActionBar.c6 d;
    public boolean f31476d0;
    public final boolean e;
    public final HashSet f31477e0;
    public final boolean f31478f;
    public final org.telegram.ui.fo h;
    public final boolean f31479n;
    public final FrameLayout f31480r;
    public final m31 f31481s;
    public final x31 v;
    public final ImageView f31482w;
    public final ImageView f31483x;
    public final ImageView f31484y;

    public y31(Activity activity, org.telegram.ui.fo foVar, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        FrameLayout frameLayout;
        float f7;
        int i11;
        boolean z10;
        es esVar = es.h;
        this.f31470a = new ne.b(0, this, esVar, 380L, true);
        this.J = new ne.b(0, new d31(this), esVar, 320L, false);
        this.R = 0.0f;
        this.f31477e0 = new HashSet();
        this.h = foVar;
        this.f31472b = i10;
        this.f31474c = j10;
        this.d = c6Var;
        long j11 = -j10;
        this.e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        this.f31478f = isBotForumWithEditableTopics;
        this.f31479n = !org.telegram.messenger.q.x("topics_end_reached_", j11, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.f31480r = frameLayout2;
        addView(frameLayout2, w7.a6.a(36.0f, 7.0f, 7.0f, 7.0f, 7.0f, -1, 55));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.F = frameLayout3;
        addView(frameLayout3, w7.a6.a(-1.0f, 7.0f, 7.0f, 7.0f, 7.0f, 64, 115));
        m31 m31Var = new m31(this, activity, i10, new Utilities.Callback2(this) {
            public final y31 f26927b;

            {
                this.f26927b = this;
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
                y31 y31Var = this.f26927b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        z61 z61Var = (z61) obj2;
                        boolean z18 = y31Var.f31478f;
                        int i14 = y31Var.f31472b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = y31Var.f31474c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = y31Var.e;
                        int i15 = s31.f29013a;
                        l61 J = l61.J(s31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f26959q = z19;
                        if (y31Var.V == 0) {
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
                                    if (tL_forumTopic2.f19268id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (y31Var.f31477e0.contains(Integer.valueOf(tL_forumTopic2.f19268id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((l61) i2.d.g(1, arrayList)).f26966y |= 8;
                                        }
                                        z61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        z61Var.M();
                                        z20 = true;
                                    }
                                    l61 J2 = l61.J(s31.class);
                                    J2.f26965x = j17;
                                    J2.d = tL_forumTopic2.f19268id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = y31Var.V;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f19268id;
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
                            z61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && y31Var.f31479n) {
                            l61 J3 = l61.J(s31.class);
                            J3.d = -2;
                            J3.f26960r = true;
                            arrayList.add(J3);
                            l61 J4 = l61.J(s31.class);
                            J4.d = -3;
                            J4.f26960r = true;
                            arrayList.add(J4);
                            l61 J5 = l61.J(s31.class);
                            J5.d = -4;
                            J5.f26960r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                l61 J6 = l61.J(s31.class);
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
                        y31.b(y31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        z61 z61Var2 = (z61) obj2;
                        boolean z22 = y31Var.e;
                        int i19 = y31Var.f31472b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = y31Var.f31474c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = y31Var.f31478f;
                        if (!z23) {
                            int i20 = w31.f30787a;
                            l61 J7 = l61.J(w31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f26959q = z22;
                            J7.f26966y = z23 ? 1 : 0;
                            if (y31Var.V == 0) {
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
                                    if (tL_forumTopic4.f19268id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (y31Var.f31477e0.contains(Integer.valueOf(tL_forumTopic4.f19268id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        z61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        z61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = w31.f30787a;
                                    l61 J8 = l61.J(w31.class);
                                    J8.f26965x = j20;
                                    J8.d = tL_forumTopic4.f19268id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = y31Var.V;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f19268id;
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
                            z61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && y31Var.f31479n) {
                            int i24 = w31.f30787a;
                            l61 J9 = l61.J(w31.class);
                            J9.d = -2;
                            J9.f26960r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            l61 J10 = l61.J(w31.class);
                            J10.d = -3;
                            J10.f26960r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            l61 J11 = l61.J(w31.class);
                            J11.d = -4;
                            J11.f26960r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = w31.f30787a;
                                l61 J12 = l61.J(w31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f26959q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new d31(this), new d31(this), c6Var);
        this.f31481s = m31Var;
        m31Var.C1(new Utilities.Callback2(this) {
            public final y31 f26927b;

            {
                this.f26927b = this;
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
                y31 y31Var = this.f26927b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        z61 z61Var = (z61) obj2;
                        boolean z18 = y31Var.f31478f;
                        int i14 = y31Var.f31472b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = y31Var.f31474c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = y31Var.e;
                        int i15 = s31.f29013a;
                        l61 J = l61.J(s31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f26959q = z19;
                        if (y31Var.V == 0) {
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
                                    if (tL_forumTopic2.f19268id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (y31Var.f31477e0.contains(Integer.valueOf(tL_forumTopic2.f19268id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((l61) i2.d.g(1, arrayList)).f26966y |= 8;
                                        }
                                        z61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        z61Var.M();
                                        z20 = true;
                                    }
                                    l61 J2 = l61.J(s31.class);
                                    J2.f26965x = j17;
                                    J2.d = tL_forumTopic2.f19268id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = y31Var.V;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f19268id;
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
                            z61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && y31Var.f31479n) {
                            l61 J3 = l61.J(s31.class);
                            J3.d = -2;
                            J3.f26960r = true;
                            arrayList.add(J3);
                            l61 J4 = l61.J(s31.class);
                            J4.d = -3;
                            J4.f26960r = true;
                            arrayList.add(J4);
                            l61 J5 = l61.J(s31.class);
                            J5.d = -4;
                            J5.f26960r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                l61 J6 = l61.J(s31.class);
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
                        y31.b(y31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        z61 z61Var2 = (z61) obj2;
                        boolean z22 = y31Var.e;
                        int i19 = y31Var.f31472b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = y31Var.f31474c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = y31Var.f31478f;
                        if (!z23) {
                            int i20 = w31.f30787a;
                            l61 J7 = l61.J(w31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f26959q = z22;
                            J7.f26966y = z23 ? 1 : 0;
                            if (y31Var.V == 0) {
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
                                    if (tL_forumTopic4.f19268id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (y31Var.f31477e0.contains(Integer.valueOf(tL_forumTopic4.f19268id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        z61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        z61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = w31.f30787a;
                                    l61 J8 = l61.J(w31.class);
                                    J8.f26965x = j20;
                                    J8.d = tL_forumTopic4.f19268id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = y31Var.V;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f19268id;
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
                            z61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && y31Var.f31479n) {
                            int i24 = w31.f30787a;
                            l61 J9 = l61.J(w31.class);
                            J9.d = -2;
                            J9.f26960r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            l61 J10 = l61.J(w31.class);
                            J10.d = -3;
                            J10.f26960r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            l61 J11 = l61.J(w31.class);
                            J11.d = -4;
                            J11.f26960r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = w31.f30787a;
                                l61 J12 = l61.J(w31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f26959q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        m31Var.setWillNotDraw(false);
        m31Var.W2.f31780r = false;
        m31Var.getContext();
        hg.i0 i0Var = new hg.i0((ViewGroup) m31Var, 5);
        m31Var.V2 = i0Var;
        m31Var.setLayoutManager(i0Var);
        frameLayout2.addView(m31Var, w7.a6.a(-1.0f, 41.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        m31Var.j(new n31(this, 0));
        if (isBotForumWithEditableTopics) {
            x31 x31Var = new x31(activity, i10, c6Var);
            this.v = x31Var;
            if (this.V == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            x31Var.c(true, false, z10);
            x31Var.setOnClickListener(new View.OnClickListener(this) {
                public final y31 f25501b;

                {
                    this.f25501b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            y31 y31Var = this.f25501b;
                            Boolean bool = y31Var.T;
                            boolean z11 = false;
                            if (bool == null ? !y31Var.Q : !bool.booleanValue()) {
                                z11 = true;
                            }
                            y31Var.d(z11);
                            return;
                        case 1:
                            y31 y31Var2 = this.f25501b;
                            o31 o31Var = y31Var2.G;
                            o31Var.x1(false);
                            m31 m31Var2 = y31Var2.f31481s;
                            m31Var2.x1(false);
                            y31Var2.J.a(false, true);
                            AndroidUtilities.updateVisibleRows(o31Var);
                            AndroidUtilities.updateVisibleRows(m31Var2);
                            return;
                        default:
                            this.f25501b.f31471a0.run(0, Boolean.FALSE);
                            return;
                    }
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(x31Var, w7.a6.a(42.0f, 0.0f, 48.0f, 0.0f, 0.0f, 64, 51));
        } else {
            frameLayout = frameLayout3;
            this.v = null;
        }
        ViewGroup viewGroup = frameLayout;
        o31 o31Var = new o31(activity, i10, new Utilities.Callback2(this) {
            public final y31 f26927b;

            {
                this.f26927b = this;
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
                y31 y31Var = this.f26927b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        z61 z61Var = (z61) obj2;
                        boolean z18 = y31Var.f31478f;
                        int i14 = y31Var.f31472b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = y31Var.f31474c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = y31Var.e;
                        int i15 = s31.f29013a;
                        l61 J = l61.J(s31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f26959q = z19;
                        if (y31Var.V == 0) {
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
                                    if (tL_forumTopic2.f19268id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (y31Var.f31477e0.contains(Integer.valueOf(tL_forumTopic2.f19268id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((l61) i2.d.g(1, arrayList)).f26966y |= 8;
                                        }
                                        z61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        z61Var.M();
                                        z20 = true;
                                    }
                                    l61 J2 = l61.J(s31.class);
                                    J2.f26965x = j17;
                                    J2.d = tL_forumTopic2.f19268id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = y31Var.V;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f19268id;
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
                            z61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && y31Var.f31479n) {
                            l61 J3 = l61.J(s31.class);
                            J3.d = -2;
                            J3.f26960r = true;
                            arrayList.add(J3);
                            l61 J4 = l61.J(s31.class);
                            J4.d = -3;
                            J4.f26960r = true;
                            arrayList.add(J4);
                            l61 J5 = l61.J(s31.class);
                            J5.d = -4;
                            J5.f26960r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                l61 J6 = l61.J(s31.class);
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
                        y31.b(y31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        z61 z61Var2 = (z61) obj2;
                        boolean z22 = y31Var.e;
                        int i19 = y31Var.f31472b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = y31Var.f31474c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = y31Var.f31478f;
                        if (!z23) {
                            int i20 = w31.f30787a;
                            l61 J7 = l61.J(w31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f26959q = z22;
                            J7.f26966y = z23 ? 1 : 0;
                            if (y31Var.V == 0) {
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
                                    if (tL_forumTopic4.f19268id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (y31Var.f31477e0.contains(Integer.valueOf(tL_forumTopic4.f19268id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        z61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        z61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = w31.f30787a;
                                    l61 J8 = l61.J(w31.class);
                                    J8.f26965x = j20;
                                    J8.d = tL_forumTopic4.f19268id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = y31Var.V;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f19268id;
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
                            z61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && y31Var.f31479n) {
                            int i24 = w31.f30787a;
                            l61 J9 = l61.J(w31.class);
                            J9.d = -2;
                            J9.f26960r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            l61 J10 = l61.J(w31.class);
                            J10.d = -3;
                            J10.f26960r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            l61 J11 = l61.J(w31.class);
                            J11.d = -4;
                            J11.f26960r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = w31.f30787a;
                                l61 J12 = l61.J(w31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f26959q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new d31(this), new d31(this), c6Var);
        this.G = o31Var;
        o31Var.C1(new Utilities.Callback2(this) {
            public final y31 f26927b;

            {
                this.f26927b = this;
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
                y31 y31Var = this.f26927b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        z61 z61Var = (z61) obj2;
                        boolean z18 = y31Var.f31478f;
                        int i14 = y31Var.f31472b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = y31Var.f31474c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = y31Var.e;
                        int i15 = s31.f29013a;
                        l61 J = l61.J(s31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f26959q = z19;
                        if (y31Var.V == 0) {
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
                                    if (tL_forumTopic2.f19268id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (y31Var.f31477e0.contains(Integer.valueOf(tL_forumTopic2.f19268id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((l61) i2.d.g(1, arrayList)).f26966y |= 8;
                                        }
                                        z61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        z61Var.M();
                                        z20 = true;
                                    }
                                    l61 J2 = l61.J(s31.class);
                                    J2.f26965x = j17;
                                    J2.d = tL_forumTopic2.f19268id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = y31Var.V;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f19268id;
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
                            z61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && y31Var.f31479n) {
                            l61 J3 = l61.J(s31.class);
                            J3.d = -2;
                            J3.f26960r = true;
                            arrayList.add(J3);
                            l61 J4 = l61.J(s31.class);
                            J4.d = -3;
                            J4.f26960r = true;
                            arrayList.add(J4);
                            l61 J5 = l61.J(s31.class);
                            J5.d = -4;
                            J5.f26960r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                l61 J6 = l61.J(s31.class);
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
                        y31.b(y31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        z61 z61Var2 = (z61) obj2;
                        boolean z22 = y31Var.e;
                        int i19 = y31Var.f31472b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = y31Var.f31474c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = y31Var.f31478f;
                        if (!z23) {
                            int i20 = w31.f30787a;
                            l61 J7 = l61.J(w31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f26959q = z22;
                            J7.f26966y = z23 ? 1 : 0;
                            if (y31Var.V == 0) {
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
                                    if (tL_forumTopic4.f19268id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (y31Var.f31477e0.contains(Integer.valueOf(tL_forumTopic4.f19268id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        z61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        z61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = w31.f30787a;
                                    l61 J8 = l61.J(w31.class);
                                    J8.f26965x = j20;
                                    J8.d = tL_forumTopic4.f19268id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = y31Var.V;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f19268id;
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
                            z61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && y31Var.f31479n) {
                            int i24 = w31.f30787a;
                            l61 J9 = l61.J(w31.class);
                            J9.d = -2;
                            J9.f26960r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            l61 J10 = l61.J(w31.class);
                            J10.d = -3;
                            J10.f26960r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            l61 J11 = l61.J(w31.class);
                            J11.d = -4;
                            J11.f26960r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = w31.f30787a;
                                l61 J12 = l61.J(w31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f26959q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        o31Var.W2.f31780r = false;
        o31Var.setClipToPadding(false);
        o31Var.setClipChildren(false);
        if (isBotForumWithEditableTopics) {
            f7 = 90.0f;
        } else {
            f7 = 48.0f;
        }
        viewGroup.addView(o31Var, w7.a6.a(-1.0f, 0.0f, f7, 0.0f, 0.0f, -1, 119));
        o31Var.j(new n31(this, 1));
        ImageView i12 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final y31 f25501b;

            {
                this.f25501b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        y31 y31Var = this.f25501b;
                        Boolean bool = y31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !y31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        y31Var.d(z11);
                        return;
                    case 1:
                        y31 y31Var2 = this.f25501b;
                        o31 o31Var2 = y31Var2.G;
                        o31Var2.x1(false);
                        m31 m31Var2 = y31Var2.f31481s;
                        m31Var2.x1(false);
                        y31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(o31Var2);
                        AndroidUtilities.updateVisibleRows(m31Var2);
                        return;
                    default:
                        this.f25501b.f31471a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f31484y = i12;
        ImageView i13 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final y31 f25501b;

            {
                this.f25501b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        y31 y31Var = this.f25501b;
                        Boolean bool = y31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !y31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        y31Var.d(z11);
                        return;
                    case 1:
                        y31 y31Var2 = this.f25501b;
                        o31 o31Var2 = y31Var2.G;
                        o31Var2.x1(false);
                        m31 m31Var2 = y31Var2.f31481s;
                        m31Var2.x1(false);
                        y31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(o31Var2);
                        AndroidUtilities.updateVisibleRows(m31Var2);
                        return;
                    default:
                        this.f25501b.f31471a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.E = i13;
        frameLayout2.addView(i12, w7.a6.e(44, 36, 51));
        viewGroup.addView(i13, w7.a6.e(64, 48, 51));
        ImageView i14 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final y31 f25501b;

            {
                this.f25501b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        y31 y31Var = this.f25501b;
                        Boolean bool = y31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !y31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        y31Var.d(z11);
                        return;
                    case 1:
                        y31 y31Var2 = this.f25501b;
                        o31 o31Var2 = y31Var2.G;
                        o31Var2.x1(false);
                        m31 m31Var2 = y31Var2.f31481s;
                        m31Var2.x1(false);
                        y31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(o31Var2);
                        AndroidUtilities.updateVisibleRows(m31Var2);
                        return;
                    default:
                        this.f25501b.f31471a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f31482w = i14;
        ImageView i15 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final y31 f25501b;

            {
                this.f25501b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        y31 y31Var = this.f25501b;
                        Boolean bool = y31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !y31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        y31Var.d(z11);
                        return;
                    case 1:
                        y31 y31Var2 = this.f25501b;
                        o31 o31Var2 = y31Var2.G;
                        o31Var2.x1(false);
                        m31 m31Var2 = y31Var2.f31481s;
                        m31Var2.x1(false);
                        y31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(o31Var2);
                        AndroidUtilities.updateVisibleRows(m31Var2);
                        return;
                    default:
                        this.f25501b.f31471a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f31483x = i15;
        frameLayout2.addView(i14, w7.a6.e(44, 36, 51));
        viewGroup.addView(i15, w7.a6.e(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j11, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.q.x("topicssidetabs", j10, mainSettings, false)) {
            this.R = 1.0f;
            this.Q = true;
        }
        boolean x10 = org.telegram.messenger.q.x("topicssidetabsb", j10, mainSettings, false);
        this.P = x10;
        if (x10) {
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

    public static void a(y31 y31Var, l61 l61Var) {
        if (y31Var.e) {
            Utilities.Callback2 callback2 = y31Var.f31475c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(l61Var.B), Boolean.FALSE);
            }
        } else if (l61Var.B == -2) {
            Runnable runnable = y31Var.f31473b0;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            Utilities.Callback2 callback22 = y31Var.f31471a0;
            if (callback22 != null) {
                callback22.run(Integer.valueOf(l61Var.d), Boolean.FALSE);
            }
        }
    }

    public static void b(y31 y31Var, ArrayList arrayList) {
        long j10 = y31Var.f31474c;
        TopicsController topicsController = MessagesController.getInstance(y31Var.f31472b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = com.google.android.gms.internal.play_billing.k3.f(((l61) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j11 = -j10;
        topicsController.reorderPinnedTopics(j11, arrayList2);
        topicsController.sortTopics(j11, false);
    }

    public static boolean c(final y31 y31Var, l61 l61Var, View view) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10;
        int i11;
        TLRPC.Chat chat2;
        final y31 y31Var2;
        boolean z10;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i12;
        int i13;
        int i14;
        byte b10;
        int i15;
        ?? r11;
        final m80 m80Var;
        int i16;
        int i17;
        m80 m80Var2;
        org.telegram.ui.ActionBar.c6 c6Var2 = y31Var.d;
        org.telegram.ui.fo foVar = y31Var.h;
        long j10 = y31Var.f31474c;
        int i18 = y31Var.f31472b;
        if (y31Var.G.f25532a3 || y31Var.f31481s.f25532a3) {
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
        final m80 I = m80.I(foVar, view);
        if (ChatObject.isMonoForum(chat)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i18, chat)) {
                return false;
            }
            TLRPC.Chat chat3 = chat;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new bi.b8(y31Var, I, peerDialogId, chat, 9), false);
            long j11 = chat3.f19216id;
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
                e31 e31Var = new e31(y31Var, y3, I, j11, user2, chat4);
                m80Var2 = I;
                messagesController2.checkIsInChat(true, chat4, user2, e31Var);
            } else {
                m80Var2 = I;
                i14 = 8;
            }
            m80Var = m80Var2;
            c6Var = c6Var2;
            r11 = 1;
            i15 = 2;
            b10 = 0;
        } else {
            TLRPC.Chat chat5 = chat;
            if (!ChatObject.canManageTopics(chat5) && !UserObject.isBotForumWithEditableTopics(user)) {
                y31Var2 = y31Var;
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
                y31Var2 = y31Var;
                Runnable gq0Var = new gq0(y31Var2, I, messagesController, tL_forumTopic, 4);
                I = I;
                messagesController = messagesController;
                tL_forumTopic = tL_forumTopic;
                I.c(i10, string, gq0Var, false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new f31(y31Var2, 0), false);
                }
            }
            if (!ChatObject.canManageTopics(chat2) && !UserObject.isBotForumWithEditableTopics(user)) {
                z10 = false;
            } else {
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(y31Var2) {
                    public final y31 f25176b;

                    {
                        this.f25176b = y31Var2;
                    }

                    @Override
                    public final void run() {
                        boolean z12;
                        int i20 = r4;
                        y31 y31Var3 = this.f25176b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        m80 m80Var3 = I;
                        switch (i20) {
                            case 0:
                                m80Var3.u();
                                y31Var3.h.presentFragment(hf1.a0(-y31Var3.f31474c, tL_forumTopic2.f19268id));
                                return;
                            case 1:
                                y31Var3.getClass();
                                m80Var3.u();
                                MessagesController.getInstance(y31Var3.f31472b).getTopicsController().toggleCloseTopic(-y31Var3.f31474c, tL_forumTopic2.f19268id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                m80Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f19268id));
                                ve veVar = new ve(14);
                                y31 y31Var4 = this.f25176b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                                a2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = y31Var4.V;
                                if (hashSet.size() == 1) {
                                    z12 = false;
                                    a2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(y31Var4.f31472b).getTopicsController().findTopic(-y31Var4.f31474c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z12 = false;
                                    a2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.df(y31Var4, arrayList, j13, hashSet, veVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new zg0(13));
                                a2Var.show();
                                TextView textView = (TextView) a2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, z12));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                z10 = false;
            }
            long j13 = y31Var2.f31474c;
            long j14 = tL_forumTopic.f19268id;
            int currentAccount = foVar.getCurrentAccount();
            org.telegram.ui.ActionBar.c6 resourceProvider = foVar.getResourceProvider();
            m80 m80Var3 = I;
            xo xoVar = new xo(m80Var3, currentAccount, j13, j14, foVar, resourceProvider);
            m80 J = m80Var3.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.tu0(m80Var3, 26), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.ic(m80Var3, currentAccount, j13, j14, J, foVar, resourceProvider), false);
            org.telegram.ui.ActionBar.e1 y10 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new bi.n8(m80Var3, resourceProvider, currentAccount, xoVar, 17), false);
            c6Var = c6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new org.telegram.messenger.w2(m80Var3, j13, j14, foVar, resourceProvider, 7), false);
            J.c(0, "", new bi.i0(m80Var3, currentAccount, j13, j14, foVar, resourceProvider), false);
            new org.telegram.messenger.q9(currentAccount, j13, j14, J.y(), y10).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j10, tL_forumTopic.f19268id);
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
            Runnable c3Var = new bi.c3(y31Var, messagesController, tL_forumTopic, m80Var3, J, 25);
            m80Var = m80Var3;
            m80Var.c(i20, string2, c3Var, false);
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
                m80Var.c(i16, LocaleController.getString(i17), new Runnable(y31Var) {
                    public final y31 f25176b;

                    {
                        this.f25176b = y31Var;
                    }

                    @Override
                    public final void run() {
                        boolean z122;
                        int i202 = r4;
                        y31 y31Var3 = this.f25176b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        m80 m80Var32 = m80Var;
                        switch (i202) {
                            case 0:
                                m80Var32.u();
                                y31Var3.h.presentFragment(hf1.a0(-y31Var3.f31474c, tL_forumTopic2.f19268id));
                                return;
                            case 1:
                                y31Var3.getClass();
                                m80Var32.u();
                                MessagesController.getInstance(y31Var3.f31472b).getTopicsController().toggleCloseTopic(-y31Var3.f31474c, tL_forumTopic2.f19268id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                m80Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f19268id));
                                ve veVar = new ve(14);
                                y31 y31Var4 = this.f25176b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                                a2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = y31Var4.V;
                                if (hashSet.size() == 1) {
                                    z122 = false;
                                    a2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(y31Var4.f31472b).getTopicsController().findTopic(-y31Var4.f31474c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z122 = false;
                                    a2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.df(y31Var4, arrayList, j132, hashSet, veVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new zg0(13));
                                a2Var.show();
                                TextView textView = (TextView) a2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, z122));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            if (ChatObject.canDeleteTopic(i18, chat6, tL_forumTopic)) {
                m80Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1), new Runnable(y31Var) {
                    public final y31 f25176b;

                    {
                        this.f25176b = y31Var;
                    }

                    @Override
                    public final void run() {
                        boolean z122;
                        int i202 = r4;
                        y31 y31Var3 = this.f25176b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        m80 m80Var32 = m80Var;
                        switch (i202) {
                            case 0:
                                m80Var32.u();
                                y31Var3.h.presentFragment(hf1.a0(-y31Var3.f31474c, tL_forumTopic2.f19268id));
                                return;
                            case 1:
                                y31Var3.getClass();
                                m80Var32.u();
                                MessagesController.getInstance(y31Var3.f31472b).getTopicsController().toggleCloseTopic(-y31Var3.f31474c, tL_forumTopic2.f19268id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                m80Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f19268id));
                                ve veVar = new ve(14);
                                y31 y31Var4 = this.f25176b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                                a2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = y31Var4.V;
                                if (hashSet.size() == 1) {
                                    z122 = false;
                                    a2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(y31Var4.f31472b).getTopicsController().findTopic(-y31Var4.f31474c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z122 = false;
                                    a2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.df(y31Var4, arrayList, j132, hashSet, veVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new zg0(13));
                                a2Var.show();
                                TextView textView = (TextView) a2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, z122));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
        }
        if (view instanceof t31) {
            nw nwVar = new nw(i15, b10);
            Paint paint = new Paint((int) r11);
            nwVar.f27733c = paint;
            nwVar.f27732b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, c6Var));
            m80Var.W(nwVar);
            m80Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, c6Var);
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
            m80Var.W(shapeDrawable);
        }
        m80Var.Z();
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
        long j10 = this.f31474c;
        int i10 = this.f31472b;
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
        ofFloat.addUpdateListener(new g80(this, 29));
        this.U.addListener(new p31(this, z10));
        this.U.setInterpolator(ki.n.V);
        this.U.setDuration(250L);
        this.U.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.topicsDidLoaded;
        long j10 = this.f31474c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == (-j10)) {
                o();
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
            MessagesController.getInstance(this.f31472b).getTopicsController().sortTopics(-j10, false);
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
        FrameLayout frameLayout2 = this.f31480r;
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
            canvas.clipPath(this.K.f6558j.f6547k);
        }
        if (view == this.f31480r) {
            canvas.clipPath(this.L.f6558j.f6547k);
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
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f31472b).getTopicsController().getTopics(-this.f31474c);
        if (topics != null && !topics.isEmpty() && !this.f31476d0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f31470a.a(z11, z10);
    }

    public final void g() {
        int i10;
        int i11;
        int i12;
        ne.b bVar = this.J;
        float f7 = bVar.e;
        ImageView imageView = this.f31482w;
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
        ImageView imageView2 = this.f31483x;
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
        ImageView imageView3 = this.f31484y;
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

    public u31 getCurrentTabsPosition() {
        if (this.Q) {
            return u31.f29577b;
        }
        if (this.P) {
            return u31.f29578c;
        }
        return u31.f29576a;
    }

    public float getSideMenuT() {
        return this.R * this.f31470a.e;
    }

    public final void h() {
        int i10;
        float lerp = AndroidUtilities.lerp(1.0f, 0.0f, this.R);
        FrameLayout frameLayout = this.f31480r;
        frameLayout.setAlpha(lerp);
        if ((1.0f - this.R) * this.f31470a.e > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        if (this.P) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.M) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, j(u31.f29578c)));
        } else {
            frameLayout.setTranslationY(this.N + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, j(u31.f29576a)));
        }
    }

    public final float j(u31 u31Var) {
        float f7;
        float f10 = this.f31470a.e;
        if (u31Var == u31.f29577b) {
            f7 = this.R;
        } else if ((u31Var == u31.f29576a && !this.P) || (u31Var == u31.f29578c && this.P)) {
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
                o31 o31Var = this.G;
                if (i10 >= o31Var.getChildCount()) {
                    break;
                }
                l61 G = o31Var.W2.G(RecyclerView.R(o31Var.getChildAt(i10)));
                if (G == null || !G.f26960r) {
                    i10++;
                } else {
                    return true;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                m31 m31Var = this.f31481s;
                if (i11 >= m31Var.getChildCount()) {
                    break;
                }
                l61 G2 = m31Var.W2.G(RecyclerView.R(m31Var.getChildAt(i11)));
                if (G2 != null && G2.f26960r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void l() {
        TopicsController topicsController = MessagesController.getInstance(this.f31472b).getTopicsController();
        long j10 = this.f31474c;
        if (!topicsController.endIsReached(-j10)) {
            topicsController.loadTopics(-j10);
        }
    }

    public final void m(long j10, boolean z10) {
        if (this.e) {
            Utilities.Callback2 callback2 = this.f31475c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.f31471a0;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j10), Boolean.valueOf(z10));
        }
    }

    public final void n() {
        org.telegram.ui.se seVar = this.O;
        if (seVar != null) {
            seVar.run();
        }
        h();
        float j10 = j(u31.f29577b);
        int i10 = 0;
        FrameLayout frameLayout = this.F;
        frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, j10));
        if (j10 <= 0.0f) {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        int i11 = org.telegram.ui.ActionBar.g6.f20305z6;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i11, c6Var);
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        int d = i0.a.d(1.0f - this.R, w02, org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f31484y.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.E.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.R, org.telegram.ui.ActionBar.g6.w0(i11, c6Var), org.telegram.ui.ActionBar.g6.w0(i12, c6Var)), mode));
        this.f31482w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i12, c6Var), mode));
        this.f31483x.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i12, c6Var), mode));
        invalidate();
    }

    public final void o() {
        f(true);
        m31 m31Var = this.f31481s;
        boolean canScrollHorizontally = m31Var.canScrollHorizontally(-1);
        m31Var.W2.N(true);
        if (!canScrollHorizontally) {
            m31Var.u0(0);
        }
        o31 o31Var = this.G;
        boolean canScrollVertically = o31Var.canScrollVertically(-1);
        o31Var.W2.N(true);
        if (!canScrollVertically) {
            o31Var.u0(0);
        }
        AndroidUtilities.runOnUIThread(new f31(this, 1));
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
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        n();
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.f31476d0 != z10) {
            this.f31476d0 = z10;
            f(true);
        }
    }

    public void setCurrentTopic(long j10) {
        boolean z10;
        this.V = j10;
        m31 m31Var = this.f31481s;
        m31Var.W2.N(true);
        m31Var.invalidate();
        this.G.W2.N(true);
        x31 x31Var = this.v;
        if (x31Var != null) {
            if (j10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            x31Var.c(true, false, z10);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.f31475c0 = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.f31473b0 = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.f31471a0 = callback2;
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
    public final void C(float f7, int i10) {
    }
}
