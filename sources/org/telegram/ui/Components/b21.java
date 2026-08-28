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
import org.telegram.ui.rd1;
public final class b21 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, td.b {
    public static final int f26998b0 = 0;
    public final ImageView A;
    public final FrameLayout B;
    public final q11 C;
    public long D;
    public long E;
    public final td.a F;
    public kg.d G;
    public kg.d H;
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
    public final td.a f26999a;
    public final HashSet f27000a0;
    public final int f27001b;
    public final long f27002c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final boolean f27003e;
    public final boolean f27004f;
    public final org.telegram.ui.qn h;
    public final boolean f27005n;
    public final FrameLayout f27006r;
    public final o11 f27007s;
    public final a21 v;
    public final ImageView f27008w;
    public final ImageView f27009x;
    public final ImageView f27010y;

    public b21(Activity activity, org.telegram.ui.qn qnVar, int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity);
        FrameLayout frameLayout;
        float f10;
        int i10;
        boolean z10;
        gr grVar = gr.h;
        this.f26999a = new td.a(0, this, grVar, 380L, true);
        this.F = new td.a(0, new i11(this), grVar, 320L, false);
        this.N = 0.0f;
        this.f27000a0 = new HashSet();
        this.h = qnVar;
        this.f27001b = i9;
        this.f27002c = j10;
        this.d = b6Var;
        long j11 = -j10;
        this.f27003e = ChatObject.isMonoForum(MessagesController.getInstance(i9).getChat(Long.valueOf(j11)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i9).getUser(Long.valueOf(j10)));
        this.f27004f = isBotForumWithEditableTopics;
        this.f27005n = !org.telegram.messenger.l0.v("topics_end_reached_", j11, UserConfig.getInstance(i9).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.f27006r = frameLayout2;
        addView(frameLayout2, g7.e6.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.B = frameLayout3;
        addView(frameLayout3, g7.e6.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        o11 o11Var = new o11(this, activity, i9, new Utilities.Callback2(this) {
            public final b21 f30992b;

            {
                this.f30992b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z11;
                boolean z12;
                int i11;
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
                int i12 = r2;
                b21 b21Var = this.f30992b;
                switch (i12) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        z41 z41Var = (z41) obj2;
                        boolean z18 = b21Var.f27004f;
                        int i13 = b21Var.f27001b;
                        MessagesController messagesController = MessagesController.getInstance(i13);
                        long j17 = b21Var.f27002c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i13).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = b21Var.f27003e;
                        int i14 = u11.f32901a;
                        l41 J = l41.J(u11.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f30344q = z19;
                        if (b21Var.R == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        J.K(z11);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i15 = 0;
                            boolean z20 = false;
                            while (i15 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i15);
                                int i16 = i15 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i17 = size;
                                if (z18) {
                                    i11 = i16;
                                    if (tL_forumTopic2.f22432id == 1) {
                                        size = i17;
                                        i15 = i11;
                                    }
                                } else {
                                    i11 = i16;
                                }
                                if (b21Var.f27000a0.contains(Integer.valueOf(tL_forumTopic2.f22432id))) {
                                    size = i17;
                                    i15 = i11;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((l41) j3.r0.j(1, arrayList)).f30351y |= 8;
                                        }
                                        z41Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        z41Var.M();
                                        z20 = true;
                                    }
                                    l41 J2 = l41.J(u11.class);
                                    J2.f30350x = j17;
                                    J2.d = tL_forumTopic2.f22432id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = b21Var.R;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f22432id;
                                    }
                                    if (j12 == j13) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    J2.K(z14);
                                    arrayList.add(J2);
                                    size = i17;
                                    i15 = i11;
                                    z20 = z13;
                                }
                            }
                            z12 = z20;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            z41Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && b21Var.f27005n) {
                            l41 J3 = l41.J(u11.class);
                            J3.d = -2;
                            J3.f30345r = true;
                            arrayList.add(J3);
                            l41 J4 = l41.J(u11.class);
                            J4.d = -3;
                            J4.f30345r = true;
                            arrayList.add(J4);
                            l41 J5 = l41.J(u11.class);
                            J5.d = -4;
                            J5.f30345r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                l41 J6 = l41.J(u11.class);
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
                        b21.b(b21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        z41 z41Var2 = (z41) obj2;
                        boolean z22 = b21Var.f27003e;
                        int i18 = b21Var.f27001b;
                        MessagesController messagesController2 = MessagesController.getInstance(i18);
                        long j20 = b21Var.f27002c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i18).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i18).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = b21Var.f27004f;
                        if (!z23) {
                            int i19 = z11.f35164a;
                            l41 J7 = l41.J(z11.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f30344q = z22;
                            J7.f30351y = z23 ? 1 : 0;
                            if (b21Var.R == 0) {
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
                            int i20 = 0;
                            while (i20 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i20);
                                i20++;
                                int i21 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z23) {
                                    user = user3;
                                    if (tL_forumTopic4.f22432id == 1) {
                                        chat2 = chat3;
                                        size2 = i21;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (b21Var.f27000a0.contains(Integer.valueOf(tL_forumTopic4.f22432id))) {
                                    chat2 = chat3;
                                    size2 = i21;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        z41Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        z41Var2.M();
                                        z15 = true;
                                    }
                                    int i22 = z11.f35164a;
                                    l41 J8 = l41.J(z11.class);
                                    J8.f30350x = j20;
                                    J8.d = tL_forumTopic4.f22432id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = b21Var.R;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f22432id;
                                    }
                                    if (j15 == j16) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    J8.K(z16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i21;
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
                            z41Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && b21Var.f27005n) {
                            int i23 = z11.f35164a;
                            l41 J9 = l41.J(z11.class);
                            J9.d = -2;
                            J9.f30345r = true;
                            J9.f30333e = false;
                            arrayList2.add(J9);
                            l41 J10 = l41.J(z11.class);
                            J10.d = -3;
                            J10.f30345r = true;
                            J10.f30333e = false;
                            arrayList2.add(J10);
                            l41 J11 = l41.J(z11.class);
                            J11.d = -4;
                            J11.f30345r = true;
                            J11.f30333e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i24 = z11.f35164a;
                                l41 J12 = l41.J(z11.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f30344q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new i11(this), new i11(this), b6Var);
        this.f27007s = o11Var;
        o11Var.B1(new Utilities.Callback2(this) {
            public final b21 f30992b;

            {
                this.f30992b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z11;
                boolean z12;
                int i11;
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
                int i12 = r2;
                b21 b21Var = this.f30992b;
                switch (i12) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        z41 z41Var = (z41) obj2;
                        boolean z18 = b21Var.f27004f;
                        int i13 = b21Var.f27001b;
                        MessagesController messagesController = MessagesController.getInstance(i13);
                        long j17 = b21Var.f27002c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i13).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = b21Var.f27003e;
                        int i14 = u11.f32901a;
                        l41 J = l41.J(u11.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f30344q = z19;
                        if (b21Var.R == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        J.K(z11);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i15 = 0;
                            boolean z20 = false;
                            while (i15 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i15);
                                int i16 = i15 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i17 = size;
                                if (z18) {
                                    i11 = i16;
                                    if (tL_forumTopic2.f22432id == 1) {
                                        size = i17;
                                        i15 = i11;
                                    }
                                } else {
                                    i11 = i16;
                                }
                                if (b21Var.f27000a0.contains(Integer.valueOf(tL_forumTopic2.f22432id))) {
                                    size = i17;
                                    i15 = i11;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((l41) j3.r0.j(1, arrayList)).f30351y |= 8;
                                        }
                                        z41Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        z41Var.M();
                                        z20 = true;
                                    }
                                    l41 J2 = l41.J(u11.class);
                                    J2.f30350x = j17;
                                    J2.d = tL_forumTopic2.f22432id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = b21Var.R;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f22432id;
                                    }
                                    if (j12 == j13) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    J2.K(z14);
                                    arrayList.add(J2);
                                    size = i17;
                                    i15 = i11;
                                    z20 = z13;
                                }
                            }
                            z12 = z20;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            z41Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && b21Var.f27005n) {
                            l41 J3 = l41.J(u11.class);
                            J3.d = -2;
                            J3.f30345r = true;
                            arrayList.add(J3);
                            l41 J4 = l41.J(u11.class);
                            J4.d = -3;
                            J4.f30345r = true;
                            arrayList.add(J4);
                            l41 J5 = l41.J(u11.class);
                            J5.d = -4;
                            J5.f30345r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                l41 J6 = l41.J(u11.class);
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
                        b21.b(b21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        z41 z41Var2 = (z41) obj2;
                        boolean z22 = b21Var.f27003e;
                        int i18 = b21Var.f27001b;
                        MessagesController messagesController2 = MessagesController.getInstance(i18);
                        long j20 = b21Var.f27002c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i18).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i18).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = b21Var.f27004f;
                        if (!z23) {
                            int i19 = z11.f35164a;
                            l41 J7 = l41.J(z11.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f30344q = z22;
                            J7.f30351y = z23 ? 1 : 0;
                            if (b21Var.R == 0) {
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
                            int i20 = 0;
                            while (i20 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i20);
                                i20++;
                                int i21 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z23) {
                                    user = user3;
                                    if (tL_forumTopic4.f22432id == 1) {
                                        chat2 = chat3;
                                        size2 = i21;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (b21Var.f27000a0.contains(Integer.valueOf(tL_forumTopic4.f22432id))) {
                                    chat2 = chat3;
                                    size2 = i21;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        z41Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        z41Var2.M();
                                        z15 = true;
                                    }
                                    int i22 = z11.f35164a;
                                    l41 J8 = l41.J(z11.class);
                                    J8.f30350x = j20;
                                    J8.d = tL_forumTopic4.f22432id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = b21Var.R;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f22432id;
                                    }
                                    if (j15 == j16) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    J8.K(z16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i21;
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
                            z41Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && b21Var.f27005n) {
                            int i23 = z11.f35164a;
                            l41 J9 = l41.J(z11.class);
                            J9.d = -2;
                            J9.f30345r = true;
                            J9.f30333e = false;
                            arrayList2.add(J9);
                            l41 J10 = l41.J(z11.class);
                            J10.d = -3;
                            J10.f30345r = true;
                            J10.f30333e = false;
                            arrayList2.add(J10);
                            l41 J11 = l41.J(z11.class);
                            J11.d = -4;
                            J11.f30345r = true;
                            J11.f30333e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i24 = z11.f35164a;
                                l41 J12 = l41.J(z11.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f30344q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        o11Var.setWillNotDraw(false);
        o11Var.U2.f35188r = false;
        o11Var.getContext();
        of.g0 g0Var = new of.g0((ViewGroup) o11Var, 5);
        o11Var.T2 = g0Var;
        o11Var.setLayoutManager(g0Var);
        frameLayout2.addView(o11Var, g7.e6.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        o11Var.j(new p11(this, 0));
        if (isBotForumWithEditableTopics) {
            a21 a21Var = new a21(activity, i9, b6Var);
            this.v = a21Var;
            if (this.R == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            a21Var.c(true, false, z10);
            a21Var.setOnClickListener(new View.OnClickListener(this) {
                public final b21 f30302b;

                {
                    this.f30302b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            b21 b21Var = this.f30302b;
                            Boolean bool = b21Var.P;
                            boolean z11 = false;
                            if (bool == null ? !b21Var.M : !bool.booleanValue()) {
                                z11 = true;
                            }
                            b21Var.d(z11);
                            return;
                        case 1:
                            b21 b21Var2 = this.f30302b;
                            q11 q11Var = b21Var2.C;
                            q11Var.w1(false);
                            o11 o11Var2 = b21Var2.f27007s;
                            o11Var2.w1(false);
                            b21Var2.F.a(false, true);
                            AndroidUtilities.updateVisibleRows(q11Var);
                            AndroidUtilities.updateVisibleRows(o11Var2);
                            return;
                        default:
                            this.f30302b.T.run(0, Boolean.FALSE);
                            return;
                    }
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(a21Var, g7.e6.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            frameLayout = frameLayout3;
            this.v = null;
        }
        ViewGroup viewGroup = frameLayout;
        q11 q11Var = new q11(activity, i9, new Utilities.Callback2(this) {
            public final b21 f30992b;

            {
                this.f30992b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z11;
                boolean z12;
                int i11;
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
                int i12 = r2;
                b21 b21Var = this.f30992b;
                switch (i12) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        z41 z41Var = (z41) obj2;
                        boolean z18 = b21Var.f27004f;
                        int i13 = b21Var.f27001b;
                        MessagesController messagesController = MessagesController.getInstance(i13);
                        long j17 = b21Var.f27002c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i13).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = b21Var.f27003e;
                        int i14 = u11.f32901a;
                        l41 J = l41.J(u11.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f30344q = z19;
                        if (b21Var.R == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        J.K(z11);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i15 = 0;
                            boolean z20 = false;
                            while (i15 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i15);
                                int i16 = i15 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i17 = size;
                                if (z18) {
                                    i11 = i16;
                                    if (tL_forumTopic2.f22432id == 1) {
                                        size = i17;
                                        i15 = i11;
                                    }
                                } else {
                                    i11 = i16;
                                }
                                if (b21Var.f27000a0.contains(Integer.valueOf(tL_forumTopic2.f22432id))) {
                                    size = i17;
                                    i15 = i11;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((l41) j3.r0.j(1, arrayList)).f30351y |= 8;
                                        }
                                        z41Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        z41Var.M();
                                        z20 = true;
                                    }
                                    l41 J2 = l41.J(u11.class);
                                    J2.f30350x = j17;
                                    J2.d = tL_forumTopic2.f22432id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = b21Var.R;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f22432id;
                                    }
                                    if (j12 == j13) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    J2.K(z14);
                                    arrayList.add(J2);
                                    size = i17;
                                    i15 = i11;
                                    z20 = z13;
                                }
                            }
                            z12 = z20;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            z41Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && b21Var.f27005n) {
                            l41 J3 = l41.J(u11.class);
                            J3.d = -2;
                            J3.f30345r = true;
                            arrayList.add(J3);
                            l41 J4 = l41.J(u11.class);
                            J4.d = -3;
                            J4.f30345r = true;
                            arrayList.add(J4);
                            l41 J5 = l41.J(u11.class);
                            J5.d = -4;
                            J5.f30345r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                l41 J6 = l41.J(u11.class);
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
                        b21.b(b21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        z41 z41Var2 = (z41) obj2;
                        boolean z22 = b21Var.f27003e;
                        int i18 = b21Var.f27001b;
                        MessagesController messagesController2 = MessagesController.getInstance(i18);
                        long j20 = b21Var.f27002c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i18).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i18).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = b21Var.f27004f;
                        if (!z23) {
                            int i19 = z11.f35164a;
                            l41 J7 = l41.J(z11.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f30344q = z22;
                            J7.f30351y = z23 ? 1 : 0;
                            if (b21Var.R == 0) {
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
                            int i20 = 0;
                            while (i20 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i20);
                                i20++;
                                int i21 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z23) {
                                    user = user3;
                                    if (tL_forumTopic4.f22432id == 1) {
                                        chat2 = chat3;
                                        size2 = i21;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (b21Var.f27000a0.contains(Integer.valueOf(tL_forumTopic4.f22432id))) {
                                    chat2 = chat3;
                                    size2 = i21;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        z41Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        z41Var2.M();
                                        z15 = true;
                                    }
                                    int i22 = z11.f35164a;
                                    l41 J8 = l41.J(z11.class);
                                    J8.f30350x = j20;
                                    J8.d = tL_forumTopic4.f22432id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = b21Var.R;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f22432id;
                                    }
                                    if (j15 == j16) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    J8.K(z16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i21;
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
                            z41Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && b21Var.f27005n) {
                            int i23 = z11.f35164a;
                            l41 J9 = l41.J(z11.class);
                            J9.d = -2;
                            J9.f30345r = true;
                            J9.f30333e = false;
                            arrayList2.add(J9);
                            l41 J10 = l41.J(z11.class);
                            J10.d = -3;
                            J10.f30345r = true;
                            J10.f30333e = false;
                            arrayList2.add(J10);
                            l41 J11 = l41.J(z11.class);
                            J11.d = -4;
                            J11.f30345r = true;
                            J11.f30333e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i24 = z11.f35164a;
                                l41 J12 = l41.J(z11.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f30344q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new i11(this), new i11(this), b6Var);
        this.C = q11Var;
        q11Var.B1(new Utilities.Callback2(this) {
            public final b21 f30992b;

            {
                this.f30992b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z11;
                boolean z12;
                int i11;
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
                int i12 = r2;
                b21 b21Var = this.f30992b;
                switch (i12) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        z41 z41Var = (z41) obj2;
                        boolean z18 = b21Var.f27004f;
                        int i13 = b21Var.f27001b;
                        MessagesController messagesController = MessagesController.getInstance(i13);
                        long j17 = b21Var.f27002c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i13).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = b21Var.f27003e;
                        int i14 = u11.f32901a;
                        l41 J = l41.J(u11.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f30344q = z19;
                        if (b21Var.R == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        J.K(z11);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i15 = 0;
                            boolean z20 = false;
                            while (i15 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i15);
                                int i16 = i15 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i17 = size;
                                if (z18) {
                                    i11 = i16;
                                    if (tL_forumTopic2.f22432id == 1) {
                                        size = i17;
                                        i15 = i11;
                                    }
                                } else {
                                    i11 = i16;
                                }
                                if (b21Var.f27000a0.contains(Integer.valueOf(tL_forumTopic2.f22432id))) {
                                    size = i17;
                                    i15 = i11;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((l41) j3.r0.j(1, arrayList)).f30351y |= 8;
                                        }
                                        z41Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        z41Var.M();
                                        z20 = true;
                                    }
                                    l41 J2 = l41.J(u11.class);
                                    J2.f30350x = j17;
                                    J2.d = tL_forumTopic2.f22432id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = b21Var.R;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f22432id;
                                    }
                                    if (j12 == j13) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    J2.K(z14);
                                    arrayList.add(J2);
                                    size = i17;
                                    i15 = i11;
                                    z20 = z13;
                                }
                            }
                            z12 = z20;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            z41Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && b21Var.f27005n) {
                            l41 J3 = l41.J(u11.class);
                            J3.d = -2;
                            J3.f30345r = true;
                            arrayList.add(J3);
                            l41 J4 = l41.J(u11.class);
                            J4.d = -3;
                            J4.f30345r = true;
                            arrayList.add(J4);
                            l41 J5 = l41.J(u11.class);
                            J5.d = -4;
                            J5.f30345r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                l41 J6 = l41.J(u11.class);
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
                        b21.b(b21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        z41 z41Var2 = (z41) obj2;
                        boolean z22 = b21Var.f27003e;
                        int i18 = b21Var.f27001b;
                        MessagesController messagesController2 = MessagesController.getInstance(i18);
                        long j20 = b21Var.f27002c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i18).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i18).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = b21Var.f27004f;
                        if (!z23) {
                            int i19 = z11.f35164a;
                            l41 J7 = l41.J(z11.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f30344q = z22;
                            J7.f30351y = z23 ? 1 : 0;
                            if (b21Var.R == 0) {
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
                            int i20 = 0;
                            while (i20 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i20);
                                i20++;
                                int i21 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z23) {
                                    user = user3;
                                    if (tL_forumTopic4.f22432id == 1) {
                                        chat2 = chat3;
                                        size2 = i21;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (b21Var.f27000a0.contains(Integer.valueOf(tL_forumTopic4.f22432id))) {
                                    chat2 = chat3;
                                    size2 = i21;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        z41Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        z41Var2.M();
                                        z15 = true;
                                    }
                                    int i22 = z11.f35164a;
                                    l41 J8 = l41.J(z11.class);
                                    J8.f30350x = j20;
                                    J8.d = tL_forumTopic4.f22432id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = b21Var.R;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f22432id;
                                    }
                                    if (j15 == j16) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    J8.K(z16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i21;
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
                            z41Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && b21Var.f27005n) {
                            int i23 = z11.f35164a;
                            l41 J9 = l41.J(z11.class);
                            J9.d = -2;
                            J9.f30345r = true;
                            J9.f30333e = false;
                            arrayList2.add(J9);
                            l41 J10 = l41.J(z11.class);
                            J10.d = -3;
                            J10.f30345r = true;
                            J10.f30333e = false;
                            arrayList2.add(J10);
                            l41 J11 = l41.J(z11.class);
                            J11.d = -4;
                            J11.f30345r = true;
                            J11.f30333e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i24 = z11.f35164a;
                                l41 J12 = l41.J(z11.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f30344q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        q11Var.U2.f35188r = false;
        q11Var.setClipToPadding(false);
        q11Var.setClipChildren(false);
        if (isBotForumWithEditableTopics) {
            f10 = 90.0f;
        } else {
            f10 = 48.0f;
        }
        viewGroup.addView(q11Var, g7.e6.d(-1, -1.0f, 119, 0.0f, f10, 0.0f, 0.0f));
        q11Var.j(new p11(this, 1));
        ImageView i11 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final b21 f30302b;

            {
                this.f30302b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b21 b21Var = this.f30302b;
                        Boolean bool = b21Var.P;
                        boolean z11 = false;
                        if (bool == null ? !b21Var.M : !bool.booleanValue()) {
                            z11 = true;
                        }
                        b21Var.d(z11);
                        return;
                    case 1:
                        b21 b21Var2 = this.f30302b;
                        q11 q11Var2 = b21Var2.C;
                        q11Var2.w1(false);
                        o11 o11Var2 = b21Var2.f27007s;
                        o11Var2.w1(false);
                        b21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(q11Var2);
                        AndroidUtilities.updateVisibleRows(o11Var2);
                        return;
                    default:
                        this.f30302b.T.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f27010y = i11;
        ImageView i12 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final b21 f30302b;

            {
                this.f30302b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b21 b21Var = this.f30302b;
                        Boolean bool = b21Var.P;
                        boolean z11 = false;
                        if (bool == null ? !b21Var.M : !bool.booleanValue()) {
                            z11 = true;
                        }
                        b21Var.d(z11);
                        return;
                    case 1:
                        b21 b21Var2 = this.f30302b;
                        q11 q11Var2 = b21Var2.C;
                        q11Var2.w1(false);
                        o11 o11Var2 = b21Var2.f27007s;
                        o11Var2.w1(false);
                        b21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(q11Var2);
                        AndroidUtilities.updateVisibleRows(o11Var2);
                        return;
                    default:
                        this.f30302b.T.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.A = i12;
        frameLayout2.addView(i11, g7.e6.e(44, 36, 51));
        viewGroup.addView(i12, g7.e6.e(64, 48, 51));
        ImageView i13 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final b21 f30302b;

            {
                this.f30302b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b21 b21Var = this.f30302b;
                        Boolean bool = b21Var.P;
                        boolean z11 = false;
                        if (bool == null ? !b21Var.M : !bool.booleanValue()) {
                            z11 = true;
                        }
                        b21Var.d(z11);
                        return;
                    case 1:
                        b21 b21Var2 = this.f30302b;
                        q11 q11Var2 = b21Var2.C;
                        q11Var2.w1(false);
                        o11 o11Var2 = b21Var2.f27007s;
                        o11Var2.w1(false);
                        b21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(q11Var2);
                        AndroidUtilities.updateVisibleRows(o11Var2);
                        return;
                    default:
                        this.f30302b.T.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f27008w = i13;
        ImageView i14 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final b21 f30302b;

            {
                this.f30302b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b21 b21Var = this.f30302b;
                        Boolean bool = b21Var.P;
                        boolean z11 = false;
                        if (bool == null ? !b21Var.M : !bool.booleanValue()) {
                            z11 = true;
                        }
                        b21Var.d(z11);
                        return;
                    case 1:
                        b21 b21Var2 = this.f30302b;
                        q11 q11Var2 = b21Var2.C;
                        q11Var2.w1(false);
                        o11 o11Var2 = b21Var2.f27007s;
                        o11Var2.w1(false);
                        b21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(q11Var2);
                        AndroidUtilities.updateVisibleRows(o11Var2);
                        return;
                    default:
                        this.f30302b.T.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f27009x = i14;
        frameLayout2.addView(i13, g7.e6.e(44, 36, 51));
        viewGroup.addView(i14, g7.e6.e(64, 48, 51));
        MessagesController.getInstance(i9).getTopicsController().loadTopics(j11, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i9).getMainSettings();
        if (org.telegram.messenger.l0.v("topicssidetabs", j10, mainSettings, false)) {
            this.N = 1.0f;
            this.M = true;
        }
        boolean v = org.telegram.messenger.l0.v("topicssidetabsb", j10, mainSettings, false);
        this.L = v;
        if (v) {
            i10 = R.drawable.menu_sidebar_top;
        } else {
            i10 = R.drawable.menu_sidebar_bottom;
        }
        i12.setImageResource(i10);
        f(false);
        g();
        n();
        o();
    }

    public static void a(b21 b21Var, l41 l41Var) {
        if (b21Var.f27003e) {
            Utilities.Callback2 callback2 = b21Var.V;
            if (callback2 != null) {
                callback2.run(Long.valueOf(l41Var.B), Boolean.FALSE);
            }
        } else if (l41Var.B == -2) {
            Runnable runnable = b21Var.U;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            Utilities.Callback2 callback22 = b21Var.T;
            if (callback22 != null) {
                callback22.run(Integer.valueOf(l41Var.d), Boolean.FALSE);
            }
        }
    }

    public static void b(b21 b21Var, ArrayList arrayList) {
        long j10 = b21Var.f27002c;
        TopicsController topicsController = MessagesController.getInstance(b21Var.f27001b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i9 = 0;
        while (i9 < arrayList.size()) {
            i9 = j3.r0.e(((l41) arrayList.get(i9)).d, i9, 1, arrayList2);
        }
        long j11 = -j10;
        topicsController.reorderPinnedTopics(j11, arrayList2);
        topicsController.sortTopics(j11, false);
    }

    public static boolean c(final b21 b21Var, l41 l41Var, View view) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i9;
        int i10;
        TLRPC.Chat chat2;
        final b21 b21Var2;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i11;
        int i12;
        int i13;
        ?? r11;
        byte b10;
        int i14;
        final x60 x60Var;
        int i15;
        int i16;
        x60 x60Var2;
        org.telegram.ui.ActionBar.b6 b6Var2 = b21Var.d;
        org.telegram.ui.qn qnVar = b21Var.h;
        long j10 = b21Var.f27002c;
        int i17 = b21Var.f27001b;
        if (b21Var.C.Y2 || b21Var.f27007s.Y2) {
            return false;
        }
        Object obj = l41Var.G;
        if (!(obj instanceof TLRPC.TL_forumTopic)) {
            return false;
        }
        final TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
        MessagesController messagesController = MessagesController.getInstance(i17);
        int i18 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i18 < 0) {
            chat = messagesController.getChat(Long.valueOf(-j10));
        } else {
            chat = null;
        }
        if (i18 > 0) {
            user = messagesController.getUser(Long.valueOf(j10));
        } else {
            user = null;
        }
        final x60 I = x60.I(qnVar, view);
        if (ChatObject.isMonoForum(chat)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i17, chat)) {
                return false;
            }
            TLRPC.Chat chat3 = chat;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new org.telegram.messenger.lg(b21Var, I, peerDialogId, chat, 5), false);
            long j11 = chat3.f22380id;
            if (ChatObject.isMonoForum(chat3) && ChatObject.canManageMonoForum(i17, chat3)) {
                long j12 = chat3.linked_monoforum_id;
                if (j12 != 0) {
                    j11 = j12;
                }
            }
            TLRPC.Chat chat4 = MessagesController.getInstance(i17).getChat(Long.valueOf(j11));
            TLRPC.User user2 = MessagesController.getInstance(i17).getUser(Long.valueOf(peerDialogId));
            if (user2 != null && ChatObject.canBlockUsers(chat4)) {
                I.c(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), null, false);
                org.telegram.ui.ActionBar.g1 y10 = I.y();
                i14 = 8;
                y10.setVisibility(8);
                MessagesController messagesController2 = MessagesController.getInstance(i17);
                gh.q2 q2Var = new gh.q2(b21Var, y10, I, j11, user2, chat4);
                x60Var2 = I;
                messagesController2.checkIsInChat(true, chat4, user2, q2Var);
            } else {
                x60Var2 = I;
                i14 = 8;
            }
            x60Var = x60Var2;
            b6Var = b6Var2;
            i13 = 2;
            r11 = 1;
            b10 = 0;
        } else {
            TLRPC.Chat chat5 = chat;
            if (!ChatObject.canManageTopics(chat5) && !UserObject.isBotForumWithEditableTopics(user)) {
                b21Var2 = b21Var;
                chat2 = chat5;
            } else {
                boolean z10 = tL_forumTopic.pinned;
                if (z10) {
                    i9 = R.drawable.msg_unpin;
                } else {
                    i9 = R.drawable.msg_pin;
                }
                if (z10) {
                    i10 = R.string.DialogUnpin;
                } else {
                    i10 = R.string.DialogPin;
                }
                CharSequence string = LocaleController.getString(i10);
                chat2 = chat5;
                b21Var2 = b21Var;
                Runnable no0Var = new no0(b21Var2, I, messagesController, tL_forumTopic, 4);
                I = I;
                messagesController = messagesController;
                tL_forumTopic = tL_forumTopic;
                I.c(i9, string, no0Var, false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new j11(b21Var2, 0), false);
                }
            }
            if (ChatObject.canManageTopics(chat2) || UserObject.isBotForumWithEditableTopics(user)) {
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(b21Var2) {
                    public final b21 f29909b;

                    {
                        this.f29909b = b21Var2;
                    }

                    @Override
                    public final void run() {
                        boolean z11;
                        int i19 = r4;
                        b21 b21Var3 = this.f29909b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        x60 x60Var3 = I;
                        switch (i19) {
                            case 0:
                                x60Var3.u();
                                b21Var3.h.presentFragment(rd1.Z(-b21Var3.f27002c, tL_forumTopic2.f22432id));
                                return;
                            case 1:
                                b21Var3.getClass();
                                x60Var3.u();
                                MessagesController.getInstance(b21Var3.f27001b).getTopicsController().toggleCloseTopic(-b21Var3.f27002c, tL_forumTopic2.f22432id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                x60Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f22432id));
                                hc hcVar = new hc(16);
                                b21 b21Var4 = this.f29909b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                                c2Var.N = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = b21Var4.R;
                                if (hashSet.size() == 1) {
                                    z11 = false;
                                    c2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(b21Var4.f27001b).getTopicsController().findTopic(-b21Var4.f27002c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z11 = false;
                                    c2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gh.c3(b21Var4, arrayList, j13, hashSet, hcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new if0(13));
                                c2Var.show();
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, z11));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            long j13 = b21Var2.f27002c;
            long j14 = tL_forumTopic.f22432id;
            int currentAccount = qnVar.getCurrentAccount();
            org.telegram.ui.ActionBar.b6 resourceProvider = qnVar.getResourceProvider();
            x60 x60Var3 = I;
            zn znVar = new zn(x60Var3, currentAccount, j13, j14, qnVar, resourceProvider);
            x60 J = x60Var3.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.kt0(x60Var3, 25), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.ce(x60Var3, currentAccount, j13, j14, J, qnVar, resourceProvider), false);
            org.telegram.ui.ActionBar.g1 y11 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new c3.d(x60Var3, resourceProvider, currentAccount, znVar, 17), false);
            b6Var = b6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new bg.x0(x60Var3, j13, j14, qnVar, resourceProvider, 8), false);
            J.c(0, "", new gh.w7(x60Var3, currentAccount, j13, j14, qnVar, resourceProvider), false);
            new org.telegram.messenger.m9(currentAccount, j13, j14, J.y(), y11).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j10, tL_forumTopic.f22432id);
            if (isDialogMuted) {
                i11 = R.drawable.msg_unmute;
            } else {
                i11 = R.drawable.msg_mute;
            }
            int i19 = i11;
            if (isDialogMuted) {
                i12 = R.string.Unmute;
            } else {
                i12 = R.string.Mute;
            }
            CharSequence string2 = LocaleController.getString(i12);
            i13 = 2;
            r11 = 1;
            r11 = 1;
            b10 = 0;
            i14 = 8;
            Runnable hrVar = new org.telegram.ui.hr(b21Var, messagesController, tL_forumTopic, x60Var3, J, 4);
            x60Var = x60Var3;
            x60Var.c(i19, string2, hrVar, false);
            TLRPC.Chat chat6 = chat2;
            if (ChatObject.canManageTopic(i17, chat6, tL_forumTopic) && !UserObject.isBotForum(user)) {
                boolean z11 = tL_forumTopic.closed;
                if (z11) {
                    i15 = R.drawable.msg_topic_restart;
                } else {
                    i15 = R.drawable.msg_topic_close;
                }
                if (z11) {
                    i16 = R.string.RestartTopic;
                } else {
                    i16 = R.string.CloseTopic;
                }
                x60Var.c(i15, LocaleController.getString(i16), new Runnable(b21Var) {
                    public final b21 f29909b;

                    {
                        this.f29909b = b21Var;
                    }

                    @Override
                    public final void run() {
                        boolean z112;
                        int i192 = r4;
                        b21 b21Var3 = this.f29909b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        x60 x60Var32 = x60Var;
                        switch (i192) {
                            case 0:
                                x60Var32.u();
                                b21Var3.h.presentFragment(rd1.Z(-b21Var3.f27002c, tL_forumTopic2.f22432id));
                                return;
                            case 1:
                                b21Var3.getClass();
                                x60Var32.u();
                                MessagesController.getInstance(b21Var3.f27001b).getTopicsController().toggleCloseTopic(-b21Var3.f27002c, tL_forumTopic2.f22432id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                x60Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f22432id));
                                hc hcVar = new hc(16);
                                b21 b21Var4 = this.f29909b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                                c2Var.N = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = b21Var4.R;
                                if (hashSet.size() == 1) {
                                    z112 = false;
                                    c2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(b21Var4.f27001b).getTopicsController().findTopic(-b21Var4.f27002c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z112 = false;
                                    c2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gh.c3(b21Var4, arrayList, j132, hashSet, hcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new if0(13));
                                c2Var.show();
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, z112));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            if (ChatObject.canDeleteTopic(i17, chat6, tL_forumTopic)) {
                x60Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1), new Runnable(b21Var) {
                    public final b21 f29909b;

                    {
                        this.f29909b = b21Var;
                    }

                    @Override
                    public final void run() {
                        boolean z112;
                        int i192 = r4;
                        b21 b21Var3 = this.f29909b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        x60 x60Var32 = x60Var;
                        switch (i192) {
                            case 0:
                                x60Var32.u();
                                b21Var3.h.presentFragment(rd1.Z(-b21Var3.f27002c, tL_forumTopic2.f22432id));
                                return;
                            case 1:
                                b21Var3.getClass();
                                x60Var32.u();
                                MessagesController.getInstance(b21Var3.f27001b).getTopicsController().toggleCloseTopic(-b21Var3.f27002c, tL_forumTopic2.f22432id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                x60Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f22432id));
                                hc hcVar = new hc(16);
                                b21 b21Var4 = this.f29909b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                                c2Var.N = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = b21Var4.R;
                                if (hashSet.size() == 1) {
                                    z112 = false;
                                    c2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(b21Var4.f27001b).getTopicsController().findTopic(-b21Var4.f27002c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z112 = false;
                                    c2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gh.c3(b21Var4, arrayList, j132, hashSet, hcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new if0(13));
                                c2Var.show();
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, z112));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
        }
        if (view instanceof v11) {
            mv mvVar = new mv(i13, b10);
            Paint paint = new Paint((int) r11);
            mvVar.f30927c = paint;
            mvVar.f30926b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, b6Var));
            x60Var.W(mvVar);
            x60Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var);
            float f10 = b10;
            float f11 = dp;
            float f12 = dp2;
            float[] fArr = new float[i14];
            fArr[b10] = f10;
            fArr[r11] = f10;
            fArr[i13] = f11;
            fArr[3] = f11;
            fArr[4] = f12;
            fArr[5] = f12;
            fArr[6] = f10;
            fArr[7] = f10;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(v02);
            x60Var.W(shapeDrawable);
        }
        x60Var.Z();
        return r11;
    }

    public static ImageView i(Context context, int i9, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i9);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        g7.g6.a(imageView);
        return imageView;
    }

    private void setAttached(boolean z10) {
        if (this.S == z10) {
            return;
        }
        this.S = z10;
        long j10 = this.f27002c;
        int i9 = this.f27001b;
        if (z10) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.updateInterfaces);
            MessagesController.getInstance(i9).getTopicsController().onTopicFragmentResume(-j10);
            return;
        }
        MessagesController.getInstance(i9).getTopicsController().onTopicFragmentPause(-j10);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.updateInterfaces);
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        n();
    }

    public final void d(boolean z10) {
        float f10;
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
        float f11 = this.N;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.Q = ofFloat;
        ofFloat.addUpdateListener(new q60(this, 28));
        this.Q.addListener(new r11(this, z10));
        this.Q.setInterpolator(rh.m.V);
        this.Q.setDuration(250L);
        this.Q.start();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.topicsDidLoaded;
        long j10 = this.f27002c;
        if (i9 == i11) {
            if (((Long) objArr[0]).longValue() == (-j10)) {
                o();
            }
        } else if (i9 == NotificationCenter.updateInterfaces && (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
            MessagesController.getInstance(this.f27001b).getTopicsController().sortTopics(-j10, false);
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
        FrameLayout frameLayout2 = this.f27006r;
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
            canvas.clipPath(this.G.h.f14810k);
        }
        if (view == this.f27006r) {
            canvas.clipPath(this.H.h.f14810k);
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
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f27001b).getTopicsController().getTopics(-this.f27002c);
        if (topics != null && !topics.isEmpty() && !this.W) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f26999a.a(z11, z10);
    }

    public final void g() {
        int i9;
        int i10;
        int i11;
        td.a aVar = this.F;
        float f10 = aVar.f47775e;
        ImageView imageView = this.f27008w;
        imageView.setAlpha(f10);
        imageView.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        int i12 = 8;
        int i13 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i13 > 0) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        imageView.setVisibility(i9);
        ImageView imageView2 = this.f27009x;
        imageView2.setAlpha(f10);
        imageView2.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView2.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        if (i13 > 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView2.setVisibility(i10);
        float f11 = 1.0f - aVar.f47775e;
        ImageView imageView3 = this.f27010y;
        imageView3.setAlpha(f11);
        imageView3.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        imageView3.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        int i14 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView3.setVisibility(i11);
        ImageView imageView4 = this.A;
        imageView4.setAlpha(f11);
        imageView4.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        imageView4.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        if (i14 > 0) {
            i12 = 0;
        }
        imageView4.setVisibility(i12);
    }

    public w11 getCurrentTabsPosition() {
        if (this.M) {
            return w11.f34072b;
        }
        if (this.L) {
            return w11.f34073c;
        }
        return w11.f34071a;
    }

    public float getSideMenuT() {
        return this.N * this.f26999a.f47775e;
    }

    public final void h() {
        int i9;
        float lerp = AndroidUtilities.lerp(1.0f, 0.0f, this.N);
        FrameLayout frameLayout = this.f27006r;
        frameLayout.setAlpha(lerp);
        if ((1.0f - this.N) * this.f26999a.f47775e > 0.0f) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        frameLayout.setVisibility(i9);
        if (this.L) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.I) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, j(w11.f34073c)));
        } else {
            frameLayout.setTranslationY(this.J + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, j(w11.f34071a)));
        }
    }

    public final float j(w11 w11Var) {
        float f10;
        float f11 = this.f26999a.f47775e;
        if (w11Var == w11.f34072b) {
            f10 = this.N;
        } else if ((w11Var == w11.f34071a && !this.L) || (w11Var == w11.f34073c && this.L)) {
            f10 = 1.0f - this.N;
        } else {
            return 0.0f;
        }
        return f10 * f11;
    }

    public final boolean k() {
        if (this.N > 0.5f) {
            int i9 = 0;
            while (true) {
                q11 q11Var = this.C;
                if (i9 >= q11Var.getChildCount()) {
                    break;
                }
                l41 G = q11Var.U2.G(RecyclerView.R(q11Var.getChildAt(i9)));
                if (G == null || !G.f30345r) {
                    i9++;
                } else {
                    return true;
                }
            }
        } else {
            int i10 = 0;
            while (true) {
                o11 o11Var = this.f27007s;
                if (i10 >= o11Var.getChildCount()) {
                    break;
                }
                l41 G2 = o11Var.U2.G(RecyclerView.R(o11Var.getChildAt(i10)));
                if (G2 != null && G2.f30345r) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    public final void l() {
        TopicsController topicsController = MessagesController.getInstance(this.f27001b).getTopicsController();
        long j10 = this.f27002c;
        if (!topicsController.endIsReached(-j10)) {
            topicsController.loadTopics(-j10);
        }
    }

    public final void m(long j10, boolean z10) {
        if (this.f27003e) {
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
        org.telegram.ui.ge geVar = this.K;
        if (geVar != null) {
            geVar.run();
        }
        h();
        float j10 = j(w11.f34072b);
        int i9 = 0;
        FrameLayout frameLayout = this.B;
        frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, j10));
        if (j10 <= 0.0f) {
            i9 = 8;
        }
        frameLayout.setVisibility(i9);
        int i10 = org.telegram.ui.ActionBar.f6.f23386z6;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        int i11 = org.telegram.ui.ActionBar.f6.Oh;
        int d = i0.a.d(1.0f - this.N, v02, org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f27010y.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.A.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.N, org.telegram.ui.ActionBar.f6.v0(i10, b6Var), org.telegram.ui.ActionBar.f6.v0(i11, b6Var)), mode));
        this.f27008w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), mode));
        this.f27009x.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), mode));
        invalidate();
    }

    public final void o() {
        f(true);
        o11 o11Var = this.f27007s;
        boolean canScrollHorizontally = o11Var.canScrollHorizontally(-1);
        o11Var.U2.N(true);
        if (!canScrollHorizontally) {
            o11Var.u0(0);
        }
        q11 q11Var = this.C;
        boolean canScrollVertically = q11Var.canScrollVertically(-1);
        q11Var.U2.N(true);
        if (!canScrollVertically) {
            q11Var.u0(0);
        }
        AndroidUtilities.runOnUIThread(new j11(this, 1));
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
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
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
        o11 o11Var = this.f27007s;
        o11Var.U2.N(true);
        o11Var.invalidate();
        this.C.U2.N(true);
        a21 a21Var = this.v;
        if (a21Var != null) {
            if (j10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            a21Var.c(true, false, z10);
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

    public void setSideMenuBackgroundDrawable(kg.d dVar) {
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

    public void setTopMenuBackgroundDrawable(kg.d dVar) {
        this.H = dVar;
        dVar.p(AndroidUtilities.dp(18.0f));
        this.H.o(AndroidUtilities.dp(7.0f));
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
