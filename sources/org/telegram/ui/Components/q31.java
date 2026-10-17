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
import org.telegram.ui.pd1;
public final class q31 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ne.d {
    public static final int f29556f0 = 0;
    public final ImageView E;
    public final FrameLayout F;
    public final f31 G;
    public long H;
    public long I;
    public final ne.b J;
    public dh.d K;
    public dh.d L;
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
    public final ne.b f29557a;
    public Utilities.Callback2 f29558a0;
    public final int f29559b;
    public Runnable f29560b0;
    public final long f29561c;
    public Utilities.Callback2 f29562c0;
    public final org.telegram.ui.ActionBar.d6 d;
    public boolean f29563d0;
    public final boolean e;
    public final HashSet f29564e0;
    public final boolean f29565f;
    public final org.telegram.ui.sn h;
    public final boolean f29566n;
    public final FrameLayout f29567r;
    public final d31 f29568s;
    public final p31 v;
    public final ImageView f29569w;
    public final ImageView f29570x;
    public final ImageView f29571y;

    public q31(Activity activity, org.telegram.ui.sn snVar, int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        FrameLayout frameLayout;
        float f7;
        int i11;
        boolean z10;
        bs bsVar = bs.h;
        this.f29557a = new ne.b(0, this, bsVar, 380L, true);
        this.J = new ne.b(0, new x21(this), bsVar, 320L, false);
        this.R = 0.0f;
        this.f29564e0 = new HashSet();
        this.h = snVar;
        this.f29559b = i10;
        this.f29561c = j10;
        this.d = d6Var;
        long j11 = -j10;
        this.e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        this.f29565f = isBotForumWithEditableTopics;
        this.f29566n = !org.telegram.messenger.q.w("topics_end_reached_", j11, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.f29567r = frameLayout2;
        addView(frameLayout2, w7.z5.a(36.0f, 7.0f, 7.0f, 7.0f, 7.0f, -1, 55));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.F = frameLayout3;
        addView(frameLayout3, w7.z5.a(-1.0f, 7.0f, 7.0f, 7.0f, 7.0f, 64, 115));
        d31 d31Var = new d31(this, activity, i10, new Utilities.Callback2(this) {
            public final q31 f25082b;

            {
                this.f25082b = this;
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
                q31 q31Var = this.f25082b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        s61 s61Var = (s61) obj2;
                        boolean z18 = q31Var.f29565f;
                        int i14 = q31Var.f29559b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = q31Var.f29561c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = q31Var.e;
                        int i15 = j31.f27405a;
                        f61 J = f61.J(j31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f26145q = z19;
                        if (q31Var.V == 0) {
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
                                    if (tL_forumTopic2.f20324id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (q31Var.f29564e0.contains(Integer.valueOf(tL_forumTopic2.f20324id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((f61) i0.a.h(1, arrayList)).f26152y |= 8;
                                        }
                                        s61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        s61Var.M();
                                        z20 = true;
                                    }
                                    f61 J2 = f61.J(j31.class);
                                    J2.f26151x = j17;
                                    J2.d = tL_forumTopic2.f20324id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = q31Var.V;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20324id;
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
                            s61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && q31Var.f29566n) {
                            f61 J3 = f61.J(j31.class);
                            J3.d = -2;
                            J3.f26146r = true;
                            arrayList.add(J3);
                            f61 J4 = f61.J(j31.class);
                            J4.d = -3;
                            J4.f26146r = true;
                            arrayList.add(J4);
                            f61 J5 = f61.J(j31.class);
                            J5.d = -4;
                            J5.f26146r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                f61 J6 = f61.J(j31.class);
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
                        q31.b(q31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        s61 s61Var2 = (s61) obj2;
                        boolean z22 = q31Var.e;
                        int i19 = q31Var.f29559b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = q31Var.f29561c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = q31Var.f29565f;
                        if (!z23) {
                            int i20 = o31.f28883a;
                            f61 J7 = f61.J(o31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f26145q = z22;
                            J7.f26152y = z23 ? 1 : 0;
                            if (q31Var.V == 0) {
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
                                    if (tL_forumTopic4.f20324id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (q31Var.f29564e0.contains(Integer.valueOf(tL_forumTopic4.f20324id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        s61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        s61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = o31.f28883a;
                                    f61 J8 = f61.J(o31.class);
                                    J8.f26151x = j20;
                                    J8.d = tL_forumTopic4.f20324id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = q31Var.V;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20324id;
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
                            s61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && q31Var.f29566n) {
                            int i24 = o31.f28883a;
                            f61 J9 = f61.J(o31.class);
                            J9.d = -2;
                            J9.f26146r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            f61 J10 = f61.J(o31.class);
                            J10.d = -3;
                            J10.f26146r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            f61 J11 = f61.J(o31.class);
                            J11.d = -4;
                            J11.f26146r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = o31.f28883a;
                                f61 J12 = f61.J(o31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f26145q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new x21(this), new x21(this), d6Var);
        this.f29568s = d31Var;
        d31Var.C1(new Utilities.Callback2(this) {
            public final q31 f25082b;

            {
                this.f25082b = this;
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
                q31 q31Var = this.f25082b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        s61 s61Var = (s61) obj2;
                        boolean z18 = q31Var.f29565f;
                        int i14 = q31Var.f29559b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = q31Var.f29561c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = q31Var.e;
                        int i15 = j31.f27405a;
                        f61 J = f61.J(j31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f26145q = z19;
                        if (q31Var.V == 0) {
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
                                    if (tL_forumTopic2.f20324id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (q31Var.f29564e0.contains(Integer.valueOf(tL_forumTopic2.f20324id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((f61) i0.a.h(1, arrayList)).f26152y |= 8;
                                        }
                                        s61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        s61Var.M();
                                        z20 = true;
                                    }
                                    f61 J2 = f61.J(j31.class);
                                    J2.f26151x = j17;
                                    J2.d = tL_forumTopic2.f20324id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = q31Var.V;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20324id;
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
                            s61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && q31Var.f29566n) {
                            f61 J3 = f61.J(j31.class);
                            J3.d = -2;
                            J3.f26146r = true;
                            arrayList.add(J3);
                            f61 J4 = f61.J(j31.class);
                            J4.d = -3;
                            J4.f26146r = true;
                            arrayList.add(J4);
                            f61 J5 = f61.J(j31.class);
                            J5.d = -4;
                            J5.f26146r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                f61 J6 = f61.J(j31.class);
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
                        q31.b(q31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        s61 s61Var2 = (s61) obj2;
                        boolean z22 = q31Var.e;
                        int i19 = q31Var.f29559b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = q31Var.f29561c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = q31Var.f29565f;
                        if (!z23) {
                            int i20 = o31.f28883a;
                            f61 J7 = f61.J(o31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f26145q = z22;
                            J7.f26152y = z23 ? 1 : 0;
                            if (q31Var.V == 0) {
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
                                    if (tL_forumTopic4.f20324id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (q31Var.f29564e0.contains(Integer.valueOf(tL_forumTopic4.f20324id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        s61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        s61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = o31.f28883a;
                                    f61 J8 = f61.J(o31.class);
                                    J8.f26151x = j20;
                                    J8.d = tL_forumTopic4.f20324id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = q31Var.V;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20324id;
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
                            s61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && q31Var.f29566n) {
                            int i24 = o31.f28883a;
                            f61 J9 = f61.J(o31.class);
                            J9.d = -2;
                            J9.f26146r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            f61 J10 = f61.J(o31.class);
                            J10.d = -3;
                            J10.f26146r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            f61 J11 = f61.J(o31.class);
                            J11.d = -4;
                            J11.f26146r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = o31.f28883a;
                                f61 J12 = f61.J(o31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f26145q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        d31Var.setWillNotDraw(false);
        d31Var.W2.f30200r = false;
        d31Var.getContext();
        hg.i0 i0Var = new hg.i0((ViewGroup) d31Var, 5);
        d31Var.V2 = i0Var;
        d31Var.setLayoutManager(i0Var);
        frameLayout2.addView(d31Var, w7.z5.a(-1.0f, 41.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        d31Var.j(new e31(this, 0));
        if (isBotForumWithEditableTopics) {
            p31 p31Var = new p31(activity, i10, d6Var);
            this.v = p31Var;
            if (this.V == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            p31Var.c(true, false, z10);
            p31Var.setOnClickListener(new View.OnClickListener(this) {
                public final q31 f24477b;

                {
                    this.f24477b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            q31 q31Var = this.f24477b;
                            Boolean bool = q31Var.T;
                            boolean z11 = false;
                            if (bool == null ? !q31Var.Q : !bool.booleanValue()) {
                                z11 = true;
                            }
                            q31Var.d(z11);
                            return;
                        case 1:
                            q31 q31Var2 = this.f24477b;
                            f31 f31Var = q31Var2.G;
                            f31Var.x1(false);
                            d31 d31Var2 = q31Var2.f29568s;
                            d31Var2.x1(false);
                            q31Var2.J.a(false, true);
                            AndroidUtilities.updateVisibleRows(f31Var);
                            AndroidUtilities.updateVisibleRows(d31Var2);
                            return;
                        default:
                            this.f24477b.f29558a0.run(0, Boolean.FALSE);
                            return;
                    }
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(p31Var, w7.z5.a(42.0f, 0.0f, 48.0f, 0.0f, 0.0f, 64, 51));
        } else {
            frameLayout = frameLayout3;
            this.v = null;
        }
        ViewGroup viewGroup = frameLayout;
        f31 f31Var = new f31(activity, i10, new Utilities.Callback2(this) {
            public final q31 f25082b;

            {
                this.f25082b = this;
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
                q31 q31Var = this.f25082b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        s61 s61Var = (s61) obj2;
                        boolean z18 = q31Var.f29565f;
                        int i14 = q31Var.f29559b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = q31Var.f29561c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = q31Var.e;
                        int i15 = j31.f27405a;
                        f61 J = f61.J(j31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f26145q = z19;
                        if (q31Var.V == 0) {
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
                                    if (tL_forumTopic2.f20324id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (q31Var.f29564e0.contains(Integer.valueOf(tL_forumTopic2.f20324id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((f61) i0.a.h(1, arrayList)).f26152y |= 8;
                                        }
                                        s61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        s61Var.M();
                                        z20 = true;
                                    }
                                    f61 J2 = f61.J(j31.class);
                                    J2.f26151x = j17;
                                    J2.d = tL_forumTopic2.f20324id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = q31Var.V;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20324id;
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
                            s61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && q31Var.f29566n) {
                            f61 J3 = f61.J(j31.class);
                            J3.d = -2;
                            J3.f26146r = true;
                            arrayList.add(J3);
                            f61 J4 = f61.J(j31.class);
                            J4.d = -3;
                            J4.f26146r = true;
                            arrayList.add(J4);
                            f61 J5 = f61.J(j31.class);
                            J5.d = -4;
                            J5.f26146r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                f61 J6 = f61.J(j31.class);
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
                        q31.b(q31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        s61 s61Var2 = (s61) obj2;
                        boolean z22 = q31Var.e;
                        int i19 = q31Var.f29559b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = q31Var.f29561c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = q31Var.f29565f;
                        if (!z23) {
                            int i20 = o31.f28883a;
                            f61 J7 = f61.J(o31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f26145q = z22;
                            J7.f26152y = z23 ? 1 : 0;
                            if (q31Var.V == 0) {
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
                                    if (tL_forumTopic4.f20324id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (q31Var.f29564e0.contains(Integer.valueOf(tL_forumTopic4.f20324id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        s61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        s61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = o31.f28883a;
                                    f61 J8 = f61.J(o31.class);
                                    J8.f26151x = j20;
                                    J8.d = tL_forumTopic4.f20324id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = q31Var.V;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20324id;
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
                            s61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && q31Var.f29566n) {
                            int i24 = o31.f28883a;
                            f61 J9 = f61.J(o31.class);
                            J9.d = -2;
                            J9.f26146r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            f61 J10 = f61.J(o31.class);
                            J10.d = -3;
                            J10.f26146r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            f61 J11 = f61.J(o31.class);
                            J11.d = -4;
                            J11.f26146r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = o31.f28883a;
                                f61 J12 = f61.J(o31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f26145q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new x21(this), new x21(this), d6Var);
        this.G = f31Var;
        f31Var.C1(new Utilities.Callback2(this) {
            public final q31 f25082b;

            {
                this.f25082b = this;
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
                q31 q31Var = this.f25082b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        s61 s61Var = (s61) obj2;
                        boolean z18 = q31Var.f29565f;
                        int i14 = q31Var.f29559b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = q31Var.f29561c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = q31Var.e;
                        int i15 = j31.f27405a;
                        f61 J = f61.J(j31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f26145q = z19;
                        if (q31Var.V == 0) {
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
                                    if (tL_forumTopic2.f20324id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (q31Var.f29564e0.contains(Integer.valueOf(tL_forumTopic2.f20324id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((f61) i0.a.h(1, arrayList)).f26152y |= 8;
                                        }
                                        s61Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        s61Var.M();
                                        z20 = true;
                                    }
                                    f61 J2 = f61.J(j31.class);
                                    J2.f26151x = j17;
                                    J2.d = tL_forumTopic2.f20324id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = q31Var.V;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f20324id;
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
                            s61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && q31Var.f29566n) {
                            f61 J3 = f61.J(j31.class);
                            J3.d = -2;
                            J3.f26146r = true;
                            arrayList.add(J3);
                            f61 J4 = f61.J(j31.class);
                            J4.d = -3;
                            J4.f26146r = true;
                            arrayList.add(J4);
                            f61 J5 = f61.J(j31.class);
                            J5.d = -4;
                            J5.f26146r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                f61 J6 = f61.J(j31.class);
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
                        q31.b(q31Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        s61 s61Var2 = (s61) obj2;
                        boolean z22 = q31Var.e;
                        int i19 = q31Var.f29559b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = q31Var.f29561c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = q31Var.f29565f;
                        if (!z23) {
                            int i20 = o31.f28883a;
                            f61 J7 = f61.J(o31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f26145q = z22;
                            J7.f26152y = z23 ? 1 : 0;
                            if (q31Var.V == 0) {
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
                                    if (tL_forumTopic4.f20324id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (q31Var.f29564e0.contains(Integer.valueOf(tL_forumTopic4.f20324id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        s61Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        s61Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = o31.f28883a;
                                    f61 J8 = f61.J(o31.class);
                                    J8.f26151x = j20;
                                    J8.d = tL_forumTopic4.f20324id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = q31Var.V;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f20324id;
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
                            s61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && q31Var.f29566n) {
                            int i24 = o31.f28883a;
                            f61 J9 = f61.J(o31.class);
                            J9.d = -2;
                            J9.f26146r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            f61 J10 = f61.J(o31.class);
                            J10.d = -3;
                            J10.f26146r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            f61 J11 = f61.J(o31.class);
                            J11.d = -4;
                            J11.f26146r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = o31.f28883a;
                                f61 J12 = f61.J(o31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f26145q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        f31Var.W2.f30200r = false;
        f31Var.setClipToPadding(false);
        f31Var.setClipChildren(false);
        if (isBotForumWithEditableTopics) {
            f7 = 90.0f;
        } else {
            f7 = 48.0f;
        }
        viewGroup.addView(f31Var, w7.z5.a(-1.0f, 0.0f, f7, 0.0f, 0.0f, -1, 119));
        f31Var.j(new e31(this, 1));
        ImageView i12 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final q31 f24477b;

            {
                this.f24477b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q31 q31Var = this.f24477b;
                        Boolean bool = q31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !q31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        q31Var.d(z11);
                        return;
                    case 1:
                        q31 q31Var2 = this.f24477b;
                        f31 f31Var2 = q31Var2.G;
                        f31Var2.x1(false);
                        d31 d31Var2 = q31Var2.f29568s;
                        d31Var2.x1(false);
                        q31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(f31Var2);
                        AndroidUtilities.updateVisibleRows(d31Var2);
                        return;
                    default:
                        this.f24477b.f29558a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f29571y = i12;
        ImageView i13 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final q31 f24477b;

            {
                this.f24477b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q31 q31Var = this.f24477b;
                        Boolean bool = q31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !q31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        q31Var.d(z11);
                        return;
                    case 1:
                        q31 q31Var2 = this.f24477b;
                        f31 f31Var2 = q31Var2.G;
                        f31Var2.x1(false);
                        d31 d31Var2 = q31Var2.f29568s;
                        d31Var2.x1(false);
                        q31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(f31Var2);
                        AndroidUtilities.updateVisibleRows(d31Var2);
                        return;
                    default:
                        this.f24477b.f29558a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.E = i13;
        frameLayout2.addView(i12, w7.z5.e(44, 36, 51));
        viewGroup.addView(i13, w7.z5.e(64, 48, 51));
        ImageView i14 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final q31 f24477b;

            {
                this.f24477b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q31 q31Var = this.f24477b;
                        Boolean bool = q31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !q31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        q31Var.d(z11);
                        return;
                    case 1:
                        q31 q31Var2 = this.f24477b;
                        f31 f31Var2 = q31Var2.G;
                        f31Var2.x1(false);
                        d31 d31Var2 = q31Var2.f29568s;
                        d31Var2.x1(false);
                        q31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(f31Var2);
                        AndroidUtilities.updateVisibleRows(d31Var2);
                        return;
                    default:
                        this.f24477b.f29558a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f29569w = i14;
        ImageView i15 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final q31 f24477b;

            {
                this.f24477b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q31 q31Var = this.f24477b;
                        Boolean bool = q31Var.T;
                        boolean z11 = false;
                        if (bool == null ? !q31Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        q31Var.d(z11);
                        return;
                    case 1:
                        q31 q31Var2 = this.f24477b;
                        f31 f31Var2 = q31Var2.G;
                        f31Var2.x1(false);
                        d31 d31Var2 = q31Var2.f29568s;
                        d31Var2.x1(false);
                        q31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(f31Var2);
                        AndroidUtilities.updateVisibleRows(d31Var2);
                        return;
                    default:
                        this.f24477b.f29558a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f29570x = i15;
        frameLayout2.addView(i14, w7.z5.e(44, 36, 51));
        viewGroup.addView(i15, w7.z5.e(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j11, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.q.w("topicssidetabs", j10, mainSettings, false)) {
            this.R = 1.0f;
            this.Q = true;
        }
        boolean w9 = org.telegram.messenger.q.w("topicssidetabsb", j10, mainSettings, false);
        this.P = w9;
        if (w9) {
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

    public static void a(q31 q31Var, f61 f61Var) {
        if (q31Var.e) {
            Utilities.Callback2 callback2 = q31Var.f29562c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(f61Var.B), Boolean.FALSE);
            }
        } else if (f61Var.B == -2) {
            Runnable runnable = q31Var.f29560b0;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            Utilities.Callback2 callback22 = q31Var.f29558a0;
            if (callback22 != null) {
                callback22.run(Integer.valueOf(f61Var.d), Boolean.FALSE);
            }
        }
    }

    public static void b(q31 q31Var, ArrayList arrayList) {
        long j10 = q31Var.f29561c;
        TopicsController topicsController = MessagesController.getInstance(q31Var.f29559b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = com.google.android.gms.internal.cast.a6.f(((f61) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j11 = -j10;
        topicsController.reorderPinnedTopics(j11, arrayList2);
        topicsController.sortTopics(j11, false);
    }

    public static boolean c(final q31 q31Var, f61 f61Var, View view) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10;
        int i11;
        TLRPC.Chat chat2;
        final q31 q31Var2;
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
        org.telegram.ui.ActionBar.d6 d6Var2 = q31Var.d;
        org.telegram.ui.sn snVar = q31Var.h;
        long j10 = q31Var.f29561c;
        int i18 = q31Var.f29559b;
        if (q31Var.G.f24513a3 || q31Var.f29568s.f24513a3) {
            return false;
        }
        Object obj = f61Var.G;
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
        final i80 I = i80.I(snVar, view);
        if (ChatObject.isMonoForum(chat)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i18, chat)) {
                return false;
            }
            TLRPC.Chat chat3 = chat;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new ai.c3(q31Var, I, peerDialogId, chat, 17), false);
            long j11 = chat3.f20272id;
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
                ai.a4 a4Var = new ai.a4(q31Var, y3, I, j11, user2, chat4);
                i80Var2 = I;
                messagesController2.checkIsInChat(true, chat4, user2, a4Var);
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
                q31Var2 = q31Var;
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
                q31Var2 = q31Var;
                Runnable i90Var = new i90(q31Var2, I, messagesController, tL_forumTopic, 9);
                I = I;
                messagesController = messagesController;
                tL_forumTopic = tL_forumTopic;
                I.c(i10, string, i90Var, false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new y21(q31Var2, 0), false);
                }
            }
            if (!ChatObject.canManageTopics(chat2) && !UserObject.isBotForumWithEditableTopics(user)) {
                z10 = false;
            } else {
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(q31Var2) {
                    public final q31 f32820b;

                    {
                        this.f32820b = q31Var2;
                    }

                    @Override
                    public final void run() {
                        boolean z12;
                        int i20 = r4;
                        q31 q31Var3 = this.f32820b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        i80 i80Var3 = I;
                        switch (i20) {
                            case 0:
                                i80Var3.u();
                                q31Var3.h.presentFragment(pd1.a0(-q31Var3.f29561c, tL_forumTopic2.f20324id));
                                return;
                            case 1:
                                q31Var3.getClass();
                                i80Var3.u();
                                MessagesController.getInstance(q31Var3.f29559b).getTopicsController().toggleCloseTopic(-q31Var3.f29561c, tL_forumTopic2.f20324id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                i80Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f20324id));
                                rc rcVar = new rc(18);
                                q31 q31Var4 = this.f32820b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = q31Var4.V;
                                if (hashSet.size() == 1) {
                                    z12 = false;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(q31Var4.f29559b).getTopicsController().findTopic(-q31Var4.f29561c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z12 = false;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ai.q4(q31Var4, arrayList, j13, hashSet, rcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(14));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21224q7, z12));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                z10 = false;
            }
            long j13 = q31Var2.f29561c;
            long j14 = tL_forumTopic.f20324id;
            int currentAccount = snVar.getCurrentAccount();
            org.telegram.ui.ActionBar.d6 resourceProvider = snVar.getResourceProvider();
            i80 i80Var3 = I;
            uo uoVar = new uo(i80Var3, currentAccount, j13, j14, snVar, resourceProvider);
            i80 J = i80Var3.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.ut0(i80Var3, 26), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.dc(i80Var3, currentAccount, j13, j14, J, snVar, resourceProvider), false);
            org.telegram.ui.ActionBar.e1 y10 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new ai.bb(i80Var3, resourceProvider, currentAccount, uoVar, 18), false);
            d6Var = d6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new org.telegram.messenger.w2(i80Var3, j13, j14, snVar, resourceProvider, 7), false);
            J.c(0, "", new ai.ha(i80Var3, currentAccount, j13, j14, snVar, resourceProvider), false);
            new org.telegram.messenger.n9(currentAccount, j13, j14, J.y(), y10).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j10, tL_forumTopic.f20324id);
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
            Runnable g30Var = new g30(q31Var, messagesController, tL_forumTopic, i80Var3, J, 3);
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
                i80Var.c(i16, LocaleController.getString(i17), new Runnable(q31Var) {
                    public final q31 f32820b;

                    {
                        this.f32820b = q31Var;
                    }

                    @Override
                    public final void run() {
                        boolean z122;
                        int i202 = r4;
                        q31 q31Var3 = this.f32820b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        i80 i80Var32 = i80Var;
                        switch (i202) {
                            case 0:
                                i80Var32.u();
                                q31Var3.h.presentFragment(pd1.a0(-q31Var3.f29561c, tL_forumTopic2.f20324id));
                                return;
                            case 1:
                                q31Var3.getClass();
                                i80Var32.u();
                                MessagesController.getInstance(q31Var3.f29559b).getTopicsController().toggleCloseTopic(-q31Var3.f29561c, tL_forumTopic2.f20324id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                i80Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f20324id));
                                rc rcVar = new rc(18);
                                q31 q31Var4 = this.f32820b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = q31Var4.V;
                                if (hashSet.size() == 1) {
                                    z122 = false;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(q31Var4.f29559b).getTopicsController().findTopic(-q31Var4.f29561c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z122 = false;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ai.q4(q31Var4, arrayList, j132, hashSet, rcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(14));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21224q7, z122));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            if (ChatObject.canDeleteTopic(i18, chat6, tL_forumTopic)) {
                i80Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1), new Runnable(q31Var) {
                    public final q31 f32820b;

                    {
                        this.f32820b = q31Var;
                    }

                    @Override
                    public final void run() {
                        boolean z122;
                        int i202 = r4;
                        q31 q31Var3 = this.f32820b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        i80 i80Var32 = i80Var;
                        switch (i202) {
                            case 0:
                                i80Var32.u();
                                q31Var3.h.presentFragment(pd1.a0(-q31Var3.f29561c, tL_forumTopic2.f20324id));
                                return;
                            case 1:
                                q31Var3.getClass();
                                i80Var32.u();
                                MessagesController.getInstance(q31Var3.f29559b).getTopicsController().toggleCloseTopic(-q31Var3.f29561c, tL_forumTopic2.f20324id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                i80Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f20324id));
                                rc rcVar = new rc(18);
                                q31 q31Var4 = this.f32820b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = q31Var4.V;
                                if (hashSet.size() == 1) {
                                    z122 = false;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(q31Var4.f29559b).getTopicsController().findTopic(-q31Var4.f29561c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z122 = false;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ai.q4(q31Var4, arrayList, j132, hashSet, rcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(14));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21224q7, z122));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
        }
        if (view instanceof k31) {
            jw jwVar = new jw(i15, b10);
            Paint paint = new Paint((int) r11);
            jwVar.f27608c = paint;
            jwVar.f27607b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, d6Var));
            i80Var.W(jwVar);
            i80Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, d6Var);
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
        long j10 = this.f29561c;
        int i10 = this.f29559b;
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
        this.U.addListener(new g31(this, z10));
        this.U.setInterpolator(li.m.V);
        this.U.setDuration(250L);
        this.U.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.topicsDidLoaded;
        long j10 = this.f29561c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == (-j10)) {
                o();
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
            MessagesController.getInstance(this.f29559b).getTopicsController().sortTopics(-j10, false);
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
        FrameLayout frameLayout2 = this.f29567r;
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
            canvas.clipPath(this.K.f8016j.f8005k);
        }
        if (view == this.f29567r) {
            canvas.clipPath(this.L.f8016j.f8005k);
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
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f29559b).getTopicsController().getTopics(-this.f29561c);
        if (topics != null && !topics.isEmpty() && !this.f29563d0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29557a.a(z11, z10);
    }

    public final void g() {
        int i10;
        int i11;
        int i12;
        ne.b bVar = this.J;
        float f7 = bVar.e;
        ImageView imageView = this.f29569w;
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
        ImageView imageView2 = this.f29570x;
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
        ImageView imageView3 = this.f29571y;
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

    public l31 getCurrentTabsPosition() {
        if (this.Q) {
            return l31.f28059b;
        }
        if (this.P) {
            return l31.f28060c;
        }
        return l31.f28058a;
    }

    public float getSideMenuT() {
        return this.R * this.f29557a.e;
    }

    public final void h() {
        int i10;
        float lerp = AndroidUtilities.lerp(1.0f, 0.0f, this.R);
        FrameLayout frameLayout = this.f29567r;
        frameLayout.setAlpha(lerp);
        if ((1.0f - this.R) * this.f29557a.e > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        if (this.P) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.M) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, j(l31.f28060c)));
        } else {
            frameLayout.setTranslationY(this.N + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, j(l31.f28058a)));
        }
    }

    public final float j(l31 l31Var) {
        float f7;
        float f10 = this.f29557a.e;
        if (l31Var == l31.f28059b) {
            f7 = this.R;
        } else if ((l31Var == l31.f28058a && !this.P) || (l31Var == l31.f28060c && this.P)) {
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
                f31 f31Var = this.G;
                if (i10 >= f31Var.getChildCount()) {
                    break;
                }
                f61 G = f31Var.W2.G(RecyclerView.R(f31Var.getChildAt(i10)));
                if (G == null || !G.f26146r) {
                    i10++;
                } else {
                    return true;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                d31 d31Var = this.f29568s;
                if (i11 >= d31Var.getChildCount()) {
                    break;
                }
                f61 G2 = d31Var.W2.G(RecyclerView.R(d31Var.getChildAt(i11)));
                if (G2 != null && G2.f26146r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void l() {
        TopicsController topicsController = MessagesController.getInstance(this.f29559b).getTopicsController();
        long j10 = this.f29561c;
        if (!topicsController.endIsReached(-j10)) {
            topicsController.loadTopics(-j10);
        }
    }

    public final void m(long j10, boolean z10) {
        if (this.e) {
            Utilities.Callback2 callback2 = this.f29562c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.f29558a0;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j10), Boolean.valueOf(z10));
        }
    }

    public final void n() {
        org.telegram.ui.me meVar = this.O;
        if (meVar != null) {
            meVar.run();
        }
        h();
        float j10 = j(l31.f28059b);
        int i10 = 0;
        FrameLayout frameLayout = this.F;
        frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, j10));
        if (j10 <= 0.0f) {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        int i11 = org.telegram.ui.ActionBar.h6.f21391z6;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        int f7 = i0.b.f(1.0f - this.R, w02, org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f29571y.setColorFilter(new PorterDuffColorFilter(f7, mode));
        this.E.setColorFilter(new PorterDuffColorFilter(i0.b.f(this.R, org.telegram.ui.ActionBar.h6.w0(i11, d6Var), org.telegram.ui.ActionBar.h6.w0(i12, d6Var)), mode));
        this.f29569w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), mode));
        this.f29570x.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), mode));
        invalidate();
    }

    public final void o() {
        f(true);
        d31 d31Var = this.f29568s;
        boolean canScrollHorizontally = d31Var.canScrollHorizontally(-1);
        d31Var.W2.N(true);
        if (!canScrollHorizontally) {
            d31Var.u0(0);
        }
        f31 f31Var = this.G;
        boolean canScrollVertically = f31Var.canScrollVertically(-1);
        f31Var.W2.N(true);
        if (!canScrollVertically) {
            f31Var.u0(0);
        }
        AndroidUtilities.runOnUIThread(new y21(this, 1));
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
        if (this.f29563d0 != z10) {
            this.f29563d0 = z10;
            f(true);
        }
    }

    public void setCurrentTopic(long j10) {
        boolean z10;
        this.V = j10;
        d31 d31Var = this.f29568s;
        d31Var.W2.N(true);
        d31Var.invalidate();
        this.G.W2.N(true);
        p31 p31Var = this.v;
        if (p31Var != null) {
            if (j10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            p31Var.c(true, false, z10);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.f29562c0 = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.f29560b0 = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.f29558a0 = callback2;
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
    public final void u(int i10, float f7, float f10, ne.e eVar) {
        n();
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
