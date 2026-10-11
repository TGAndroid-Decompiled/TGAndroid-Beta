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
import org.telegram.ui.af1;
public final class e41 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, me.d {
    public static final int f25839f0 = 0;
    public final ImageView E;
    public final FrameLayout F;
    public final u31 G;
    public long H;
    public long I;
    public final me.b J;
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
    public final me.b f25840a;
    public Utilities.Callback2 f25841a0;
    public final int f25842b;
    public Runnable f25843b0;
    public final long f25844c;
    public Utilities.Callback2 f25845c0;
    public final org.telegram.ui.ActionBar.d6 d;
    public boolean f25846d0;
    public final boolean f25847e;
    public final HashSet f25848e0;
    public final boolean f25849f;
    public final org.telegram.ui.zn h;
    public final boolean f25850n;
    public final FrameLayout f25851r;
    public final s31 f25852s;
    public final d41 v;
    public final ImageView f25853w;
    public final ImageView f25854x;
    public final ImageView f25855y;

    public e41(Activity activity, org.telegram.ui.zn znVar, int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        FrameLayout frameLayout;
        float f7;
        int i11;
        boolean z10;
        is isVar = is.h;
        this.f25840a = new me.b(0, this, isVar, 380L, true);
        this.J = new me.b(0, new j31(this), isVar, 320L, false);
        this.R = 0.0f;
        this.f25848e0 = new HashSet();
        this.h = znVar;
        this.f25842b = i10;
        this.f25844c = j3;
        this.d = d6Var;
        long j10 = -j3;
        this.f25847e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j10)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j3)));
        this.f25849f = isBotForumWithEditableTopics;
        this.f25850n = !org.telegram.messenger.q.w("topics_end_reached_", j10, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.f25851r = frameLayout2;
        addView(frameLayout2, w7.x5.a(36.0f, 7.0f, 7.0f, 7.0f, 7.0f, -1, 55));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.F = frameLayout3;
        addView(frameLayout3, w7.x5.a(-1.0f, 7.0f, 7.0f, 7.0f, 7.0f, 64, 115));
        s31 s31Var = new s31(this, activity, i10, new Utilities.Callback2(this) {
            public final e41 f30334b;

            {
                this.f30334b = this;
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
                e41 e41Var = this.f30334b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        e71 e71Var = (e71) obj2;
                        boolean z18 = e41Var.f25849f;
                        int i14 = e41Var.f25842b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = e41Var.f25844c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z19 = e41Var.f25847e;
                        int i15 = y31.f33084a;
                        r61 J = r61.J(y31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f30366q = z19;
                        if (e41Var.V == 0) {
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
                                    if (tL_forumTopic2.f20084id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (e41Var.f25848e0.contains(Integer.valueOf(tL_forumTopic2.f20084id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((r61) hg.c.g(1, arrayList)).f30373y |= 8;
                                        }
                                        e71Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        e71Var.M();
                                        z20 = true;
                                    }
                                    r61 J2 = r61.J(y31.class);
                                    J2.f30372x = j16;
                                    J2.d = tL_forumTopic2.f20084id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j18 = e41Var.V;
                                    if (z19) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.f20084id;
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
                            e71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && e41Var.f25850n) {
                            r61 J3 = r61.J(y31.class);
                            J3.d = -2;
                            J3.f30367r = true;
                            arrayList.add(J3);
                            r61 J4 = r61.J(y31.class);
                            J4.d = -3;
                            J4.f30367r = true;
                            arrayList.add(J4);
                            r61 J5 = r61.J(y31.class);
                            J5.d = -4;
                            J5.f30367r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                r61 J6 = r61.J(y31.class);
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
                        e41.b(e41Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        e71 e71Var2 = (e71) obj2;
                        boolean z22 = e41Var.f25847e;
                        int i19 = e41Var.f25842b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = e41Var.f25844c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z23 = e41Var.f25849f;
                        if (!z23) {
                            int i20 = c41.f25118a;
                            r61 J7 = r61.J(c41.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f30366q = z22;
                            J7.f30373y = z23 ? 1 : 0;
                            if (e41Var.V == 0) {
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
                                    if (tL_forumTopic4.f20084id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (e41Var.f25848e0.contains(Integer.valueOf(tL_forumTopic4.f20084id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        e71Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        e71Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = c41.f25118a;
                                    r61 J8 = r61.J(c41.class);
                                    J8.f30372x = j19;
                                    J8.d = tL_forumTopic4.f20084id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = e41Var.V;
                                    if (z22) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.f20084id;
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
                            e71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && e41Var.f25850n) {
                            int i24 = c41.f25118a;
                            r61 J9 = r61.J(c41.class);
                            J9.d = -2;
                            J9.f30367r = true;
                            J9.f30355e = false;
                            arrayList2.add(J9);
                            r61 J10 = r61.J(c41.class);
                            J10.d = -3;
                            J10.f30367r = true;
                            J10.f30355e = false;
                            arrayList2.add(J10);
                            r61 J11 = r61.J(c41.class);
                            J11.d = -4;
                            J11.f30367r = true;
                            J11.f30355e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = c41.f25118a;
                                r61 J12 = r61.J(c41.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f30366q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new j31(this), new j31(this), d6Var);
        this.f25852s = s31Var;
        s31Var.C1(new Utilities.Callback2(this) {
            public final e41 f30334b;

            {
                this.f30334b = this;
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
                e41 e41Var = this.f30334b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        e71 e71Var = (e71) obj2;
                        boolean z18 = e41Var.f25849f;
                        int i14 = e41Var.f25842b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = e41Var.f25844c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z19 = e41Var.f25847e;
                        int i15 = y31.f33084a;
                        r61 J = r61.J(y31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f30366q = z19;
                        if (e41Var.V == 0) {
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
                                    if (tL_forumTopic2.f20084id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (e41Var.f25848e0.contains(Integer.valueOf(tL_forumTopic2.f20084id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((r61) hg.c.g(1, arrayList)).f30373y |= 8;
                                        }
                                        e71Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        e71Var.M();
                                        z20 = true;
                                    }
                                    r61 J2 = r61.J(y31.class);
                                    J2.f30372x = j16;
                                    J2.d = tL_forumTopic2.f20084id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j18 = e41Var.V;
                                    if (z19) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.f20084id;
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
                            e71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && e41Var.f25850n) {
                            r61 J3 = r61.J(y31.class);
                            J3.d = -2;
                            J3.f30367r = true;
                            arrayList.add(J3);
                            r61 J4 = r61.J(y31.class);
                            J4.d = -3;
                            J4.f30367r = true;
                            arrayList.add(J4);
                            r61 J5 = r61.J(y31.class);
                            J5.d = -4;
                            J5.f30367r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                r61 J6 = r61.J(y31.class);
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
                        e41.b(e41Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        e71 e71Var2 = (e71) obj2;
                        boolean z22 = e41Var.f25847e;
                        int i19 = e41Var.f25842b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = e41Var.f25844c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z23 = e41Var.f25849f;
                        if (!z23) {
                            int i20 = c41.f25118a;
                            r61 J7 = r61.J(c41.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f30366q = z22;
                            J7.f30373y = z23 ? 1 : 0;
                            if (e41Var.V == 0) {
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
                                    if (tL_forumTopic4.f20084id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (e41Var.f25848e0.contains(Integer.valueOf(tL_forumTopic4.f20084id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        e71Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        e71Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = c41.f25118a;
                                    r61 J8 = r61.J(c41.class);
                                    J8.f30372x = j19;
                                    J8.d = tL_forumTopic4.f20084id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = e41Var.V;
                                    if (z22) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.f20084id;
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
                            e71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && e41Var.f25850n) {
                            int i24 = c41.f25118a;
                            r61 J9 = r61.J(c41.class);
                            J9.d = -2;
                            J9.f30367r = true;
                            J9.f30355e = false;
                            arrayList2.add(J9);
                            r61 J10 = r61.J(c41.class);
                            J10.d = -3;
                            J10.f30367r = true;
                            J10.f30355e = false;
                            arrayList2.add(J10);
                            r61 J11 = r61.J(c41.class);
                            J11.d = -4;
                            J11.f30367r = true;
                            J11.f30355e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = c41.f25118a;
                                r61 J12 = r61.J(c41.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f30366q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        s31Var.setWillNotDraw(false);
        s31Var.W2.f25890r = false;
        s31Var.getContext();
        gg.i0 i0Var = new gg.i0((ViewGroup) s31Var, 5);
        s31Var.V2 = i0Var;
        s31Var.setLayoutManager(i0Var);
        frameLayout2.addView(s31Var, w7.x5.a(-1.0f, 41.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        s31Var.j(new t31(this, 0));
        if (isBotForumWithEditableTopics) {
            d41 d41Var = new d41(activity, i10, d6Var);
            this.v = d41Var;
            if (this.V == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            d41Var.c(true, false, z10);
            d41Var.setOnClickListener(new View.OnClickListener(this) {
                public final e41 f28927b;

                {
                    this.f28927b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            e41 e41Var = this.f28927b;
                            Boolean bool = e41Var.T;
                            boolean z11 = false;
                            if (bool == null ? !e41Var.Q : !bool.booleanValue()) {
                                z11 = true;
                            }
                            e41Var.d(z11);
                            return;
                        case 1:
                            e41 e41Var2 = this.f28927b;
                            u31 u31Var = e41Var2.G;
                            u31Var.x1(false);
                            s31 s31Var2 = e41Var2.f25852s;
                            s31Var2.x1(false);
                            e41Var2.J.a(false, true);
                            AndroidUtilities.updateVisibleRows(u31Var);
                            AndroidUtilities.updateVisibleRows(s31Var2);
                            return;
                        default:
                            this.f28927b.f25841a0.run(0, Boolean.FALSE);
                            return;
                    }
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(d41Var, w7.x5.a(42.0f, 0.0f, 48.0f, 0.0f, 0.0f, 64, 51));
        } else {
            frameLayout = frameLayout3;
            this.v = null;
        }
        ViewGroup viewGroup = frameLayout;
        u31 u31Var = new u31(activity, i10, new Utilities.Callback2(this) {
            public final e41 f30334b;

            {
                this.f30334b = this;
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
                e41 e41Var = this.f30334b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        e71 e71Var = (e71) obj2;
                        boolean z18 = e41Var.f25849f;
                        int i14 = e41Var.f25842b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = e41Var.f25844c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z19 = e41Var.f25847e;
                        int i15 = y31.f33084a;
                        r61 J = r61.J(y31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f30366q = z19;
                        if (e41Var.V == 0) {
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
                                    if (tL_forumTopic2.f20084id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (e41Var.f25848e0.contains(Integer.valueOf(tL_forumTopic2.f20084id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((r61) hg.c.g(1, arrayList)).f30373y |= 8;
                                        }
                                        e71Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        e71Var.M();
                                        z20 = true;
                                    }
                                    r61 J2 = r61.J(y31.class);
                                    J2.f30372x = j16;
                                    J2.d = tL_forumTopic2.f20084id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j18 = e41Var.V;
                                    if (z19) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.f20084id;
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
                            e71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && e41Var.f25850n) {
                            r61 J3 = r61.J(y31.class);
                            J3.d = -2;
                            J3.f30367r = true;
                            arrayList.add(J3);
                            r61 J4 = r61.J(y31.class);
                            J4.d = -3;
                            J4.f30367r = true;
                            arrayList.add(J4);
                            r61 J5 = r61.J(y31.class);
                            J5.d = -4;
                            J5.f30367r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                r61 J6 = r61.J(y31.class);
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
                        e41.b(e41Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        e71 e71Var2 = (e71) obj2;
                        boolean z22 = e41Var.f25847e;
                        int i19 = e41Var.f25842b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = e41Var.f25844c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z23 = e41Var.f25849f;
                        if (!z23) {
                            int i20 = c41.f25118a;
                            r61 J7 = r61.J(c41.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f30366q = z22;
                            J7.f30373y = z23 ? 1 : 0;
                            if (e41Var.V == 0) {
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
                                    if (tL_forumTopic4.f20084id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (e41Var.f25848e0.contains(Integer.valueOf(tL_forumTopic4.f20084id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        e71Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        e71Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = c41.f25118a;
                                    r61 J8 = r61.J(c41.class);
                                    J8.f30372x = j19;
                                    J8.d = tL_forumTopic4.f20084id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = e41Var.V;
                                    if (z22) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.f20084id;
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
                            e71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && e41Var.f25850n) {
                            int i24 = c41.f25118a;
                            r61 J9 = r61.J(c41.class);
                            J9.d = -2;
                            J9.f30367r = true;
                            J9.f30355e = false;
                            arrayList2.add(J9);
                            r61 J10 = r61.J(c41.class);
                            J10.d = -3;
                            J10.f30367r = true;
                            J10.f30355e = false;
                            arrayList2.add(J10);
                            r61 J11 = r61.J(c41.class);
                            J11.d = -4;
                            J11.f30367r = true;
                            J11.f30355e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = c41.f25118a;
                                r61 J12 = r61.J(c41.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f30366q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new j31(this), new j31(this), d6Var);
        this.G = u31Var;
        u31Var.C1(new Utilities.Callback2(this) {
            public final e41 f30334b;

            {
                this.f30334b = this;
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
                e41 e41Var = this.f30334b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        e71 e71Var = (e71) obj2;
                        boolean z18 = e41Var.f25849f;
                        int i14 = e41Var.f25842b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = e41Var.f25844c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z19 = e41Var.f25847e;
                        int i15 = y31.f33084a;
                        r61 J = r61.J(y31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.f30366q = z19;
                        if (e41Var.V == 0) {
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
                                    if (tL_forumTopic2.f20084id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (e41Var.f25848e0.contains(Integer.valueOf(tL_forumTopic2.f20084id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((r61) hg.c.g(1, arrayList)).f30373y |= 8;
                                        }
                                        e71Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        e71Var.M();
                                        z20 = true;
                                    }
                                    r61 J2 = r61.J(y31.class);
                                    J2.f30372x = j16;
                                    J2.d = tL_forumTopic2.f20084id;
                                    J2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j18 = e41Var.V;
                                    if (z19) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.f20084id;
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
                            e71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && e41Var.f25850n) {
                            r61 J3 = r61.J(y31.class);
                            J3.d = -2;
                            J3.f30367r = true;
                            arrayList.add(J3);
                            r61 J4 = r61.J(y31.class);
                            J4.d = -3;
                            J4.f30367r = true;
                            arrayList.add(J4);
                            r61 J5 = r61.J(y31.class);
                            J5.d = -4;
                            J5.f30367r = true;
                            arrayList.add(J5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                r61 J6 = r61.J(y31.class);
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
                        e41.b(e41Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        e71 e71Var2 = (e71) obj2;
                        boolean z22 = e41Var.f25847e;
                        int i19 = e41Var.f25842b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = e41Var.f25844c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z23 = e41Var.f25849f;
                        if (!z23) {
                            int i20 = c41.f25118a;
                            r61 J7 = r61.J(c41.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.f30366q = z22;
                            J7.f30373y = z23 ? 1 : 0;
                            if (e41Var.V == 0) {
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
                                    if (tL_forumTopic4.f20084id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (e41Var.f25848e0.contains(Integer.valueOf(tL_forumTopic4.f20084id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        e71Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        e71Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = c41.f25118a;
                                    r61 J8 = r61.J(c41.class);
                                    J8.f30372x = j19;
                                    J8.d = tL_forumTopic4.f20084id;
                                    J8.G = tL_forumTopic4;
                                    if (z22) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = e41Var.V;
                                    if (z22) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.f20084id;
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
                            e71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && e41Var.f25850n) {
                            int i24 = c41.f25118a;
                            r61 J9 = r61.J(c41.class);
                            J9.d = -2;
                            J9.f30367r = true;
                            J9.f30355e = false;
                            arrayList2.add(J9);
                            r61 J10 = r61.J(c41.class);
                            J10.d = -3;
                            J10.f30367r = true;
                            J10.f30355e = false;
                            arrayList2.add(J10);
                            r61 J11 = r61.J(c41.class);
                            J11.d = -4;
                            J11.f30367r = true;
                            J11.f30355e = false;
                            arrayList2.add(J11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = c41.f25118a;
                                r61 J12 = r61.J(c41.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.f30366q = false;
                                arrayList2.add(J12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        u31Var.W2.f25890r = false;
        u31Var.setClipToPadding(false);
        u31Var.setClipChildren(false);
        if (isBotForumWithEditableTopics) {
            f7 = 90.0f;
        } else {
            f7 = 48.0f;
        }
        viewGroup.addView(u31Var, w7.x5.a(-1.0f, 0.0f, f7, 0.0f, 0.0f, -1, 119));
        u31Var.j(new t31(this, 1));
        ImageView i12 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final e41 f28927b;

            {
                this.f28927b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e41 e41Var = this.f28927b;
                        Boolean bool = e41Var.T;
                        boolean z11 = false;
                        if (bool == null ? !e41Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        e41Var.d(z11);
                        return;
                    case 1:
                        e41 e41Var2 = this.f28927b;
                        u31 u31Var2 = e41Var2.G;
                        u31Var2.x1(false);
                        s31 s31Var2 = e41Var2.f25852s;
                        s31Var2.x1(false);
                        e41Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(u31Var2);
                        AndroidUtilities.updateVisibleRows(s31Var2);
                        return;
                    default:
                        this.f28927b.f25841a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f25855y = i12;
        ImageView i13 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final e41 f28927b;

            {
                this.f28927b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e41 e41Var = this.f28927b;
                        Boolean bool = e41Var.T;
                        boolean z11 = false;
                        if (bool == null ? !e41Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        e41Var.d(z11);
                        return;
                    case 1:
                        e41 e41Var2 = this.f28927b;
                        u31 u31Var2 = e41Var2.G;
                        u31Var2.x1(false);
                        s31 s31Var2 = e41Var2.f25852s;
                        s31Var2.x1(false);
                        e41Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(u31Var2);
                        AndroidUtilities.updateVisibleRows(s31Var2);
                        return;
                    default:
                        this.f28927b.f25841a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.E = i13;
        frameLayout2.addView(i12, w7.x5.e(44, 36, 51));
        viewGroup.addView(i13, w7.x5.e(64, 48, 51));
        ImageView i14 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final e41 f28927b;

            {
                this.f28927b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e41 e41Var = this.f28927b;
                        Boolean bool = e41Var.T;
                        boolean z11 = false;
                        if (bool == null ? !e41Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        e41Var.d(z11);
                        return;
                    case 1:
                        e41 e41Var2 = this.f28927b;
                        u31 u31Var2 = e41Var2.G;
                        u31Var2.x1(false);
                        s31 s31Var2 = e41Var2.f25852s;
                        s31Var2.x1(false);
                        e41Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(u31Var2);
                        AndroidUtilities.updateVisibleRows(s31Var2);
                        return;
                    default:
                        this.f28927b.f25841a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f25853w = i14;
        ImageView i15 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final e41 f28927b;

            {
                this.f28927b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e41 e41Var = this.f28927b;
                        Boolean bool = e41Var.T;
                        boolean z11 = false;
                        if (bool == null ? !e41Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        e41Var.d(z11);
                        return;
                    case 1:
                        e41 e41Var2 = this.f28927b;
                        u31 u31Var2 = e41Var2.G;
                        u31Var2.x1(false);
                        s31 s31Var2 = e41Var2.f25852s;
                        s31Var2.x1(false);
                        e41Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(u31Var2);
                        AndroidUtilities.updateVisibleRows(s31Var2);
                        return;
                    default:
                        this.f28927b.f25841a0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f25854x = i15;
        frameLayout2.addView(i14, w7.x5.e(44, 36, 51));
        viewGroup.addView(i15, w7.x5.e(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j10, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.q.w("topicssidetabs", j3, mainSettings, false)) {
            this.R = 1.0f;
            this.Q = true;
        }
        boolean w10 = org.telegram.messenger.q.w("topicssidetabsb", j3, mainSettings, false);
        this.P = w10;
        if (w10) {
            i11 = R.drawable.menu_sidebar_top;
        } else {
            i11 = R.drawable.menu_sidebar_bottom;
        }
        i13.setImageResource(i11);
        f(false);
        g();
        o();
        p();
    }

    public static void a(e41 e41Var, r61 r61Var) {
        if (e41Var.f25847e) {
            Utilities.Callback2 callback2 = e41Var.f25845c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(r61Var.B), Boolean.FALSE);
            }
        } else if (r61Var.B == -2) {
            Runnable runnable = e41Var.f25843b0;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            Utilities.Callback2 callback22 = e41Var.f25841a0;
            if (callback22 != null) {
                callback22.run(Integer.valueOf(r61Var.d), Boolean.FALSE);
            }
        }
    }

    public static void b(e41 e41Var, ArrayList arrayList) {
        long j3 = e41Var.f25844c;
        TopicsController topicsController = MessagesController.getInstance(e41Var.f25842b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = com.google.android.gms.internal.vision.e2.e(((r61) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j10 = -j3;
        topicsController.reorderPinnedTopics(j10, arrayList2);
        topicsController.sortTopics(j10, false);
    }

    public static boolean c(final e41 e41Var, r61 r61Var, View view) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i12;
        int i13;
        byte b10;
        int i14;
        int i15;
        final q80 q80Var;
        boolean z10;
        int i16;
        int i17;
        ?? r62;
        q80 q80Var2;
        int i18;
        org.telegram.ui.ActionBar.d6 d6Var2 = e41Var.d;
        org.telegram.ui.zn znVar = e41Var.h;
        long j3 = e41Var.f25844c;
        int i19 = e41Var.f25842b;
        if (!e41Var.G.f28583a3 && !e41Var.f25852s.f28583a3) {
            Object obj = r61Var.G;
            if (obj instanceof TLRPC.TL_forumTopic) {
                final TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
                MessagesController messagesController = MessagesController.getInstance(i19);
                int i20 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                if (i20 < 0) {
                    chat = messagesController.getChat(Long.valueOf(-j3));
                } else {
                    chat = null;
                }
                if (i20 > 0) {
                    user = messagesController.getUser(Long.valueOf(j3));
                } else {
                    user = null;
                }
                final q80 I = q80.I(znVar, view);
                if (ChatObject.isMonoForum(chat)) {
                    long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
                    if (peerDialogId != 0 && ChatObject.canManageMonoForum(i19, chat)) {
                        TLRPC.Chat chat2 = chat;
                        I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new ai.r8(e41Var, I, peerDialogId, chat2, 29), false);
                        long j10 = chat2.f20032id;
                        if (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(i19, chat2)) {
                            long j11 = chat2.linked_monoforum_id;
                            if (j11 != 0) {
                                j10 = j11;
                            }
                        }
                        TLRPC.Chat chat3 = MessagesController.getInstance(i19).getChat(Long.valueOf(j10));
                        TLRPC.User user2 = MessagesController.getInstance(i19).getUser(Long.valueOf(peerDialogId));
                        if (user2 != null && ChatObject.canBlockUsers(chat3)) {
                            I.c(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), null, false);
                            org.telegram.ui.ActionBar.e1 y3 = I.y();
                            i18 = 8;
                            y3.setVisibility(8);
                            q80Var2 = I;
                            MessagesController.getInstance(i19).checkIsInChat(true, chat3, user2, new k31(e41Var, y3, I, j10, user2, chat3));
                        } else {
                            q80Var2 = I;
                            i18 = 8;
                        }
                        q80Var = q80Var2;
                        d6Var = d6Var2;
                        b10 = 0;
                        i14 = i18;
                        r62 = 1;
                        i15 = 2;
                    }
                } else {
                    TLRPC.Chat chat4 = chat;
                    if (ChatObject.canManageTopics(chat4) || UserObject.isBotForumWithEditableTopics(user)) {
                        boolean z11 = tL_forumTopic.pinned;
                        if (z11) {
                            i10 = R.drawable.msg_unpin;
                        } else {
                            i10 = R.drawable.msg_pin;
                        }
                        int i21 = i10;
                        if (z11) {
                            i11 = R.string.DialogUnpin;
                        } else {
                            i11 = R.string.DialogPin;
                        }
                        I.c(i21, LocaleController.getString(i11), new qo0(e41Var, I, messagesController, tL_forumTopic), false);
                        if (tL_forumTopic.pinned) {
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new l31(e41Var, 0), false);
                        }
                    }
                    if (ChatObject.canManageTopics(chat4) || UserObject.isBotForumWithEditableTopics(user)) {
                        I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(e41Var) {
                            public final e41 f28523b;

                            {
                                this.f28523b = e41Var;
                            }

                            @Override
                            public final void run() {
                                boolean z12;
                                int i22 = r4;
                                e41 e41Var2 = this.f28523b;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                q80 q80Var3 = I;
                                switch (i22) {
                                    case 0:
                                        q80Var3.u();
                                        e41Var2.h.presentFragment(af1.a0(-e41Var2.f25844c, tL_forumTopic2.f20084id));
                                        return;
                                    case 1:
                                        e41Var2.getClass();
                                        q80Var3.u();
                                        MessagesController.getInstance(e41Var2.f25842b).getTopicsController().toggleCloseTopic(-e41Var2.f25844c, tL_forumTopic2.f20084id, true ^ tL_forumTopic2.closed);
                                        return;
                                    default:
                                        q80Var3.u();
                                        HashSet hashSet = new HashSet();
                                        hashSet.add(Integer.valueOf(tL_forumTopic2.f20084id));
                                        vh vhVar = new vh(13);
                                        e41 e41Var3 = this.f28523b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e41Var3.getContext());
                                        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                                        a2Var.R = pluralString;
                                        ArrayList arrayList = new ArrayList(hashSet);
                                        long j12 = e41Var3.V;
                                        if (hashSet.size() == 1) {
                                            z12 = false;
                                            a2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(e41Var3.f25842b).getTopicsController().findTopic(-e41Var3.f25844c, ((Integer) arrayList.get(0)).intValue()).title);
                                        } else {
                                            z12 = false;
                                            a2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                        }
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.we(e41Var3, arrayList, j12, hashSet, vhVar));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ae0(20));
                                        a2Var.show();
                                        TextView textView = (TextView) a2Var.d(-1);
                                        if (textView != null) {
                                            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21026q7, z12));
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                    }
                    long j12 = e41Var.f25844c;
                    long j13 = tL_forumTopic.f20084id;
                    int currentAccount = znVar.getCurrentAccount();
                    org.telegram.ui.ActionBar.d6 resourceProvider = znVar.getResourceProvider();
                    ap apVar = new ap(I, currentAccount, j12, j13, znVar, resourceProvider);
                    q80 J = I.J();
                    J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.mu0(I, 26), false);
                    J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.fc(I, currentAccount, j12, j13, J, znVar, resourceProvider), false);
                    org.telegram.ui.ActionBar.e1 y10 = J.y();
                    J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new ai.d9(I, resourceProvider, currentAccount, apVar, 17), false);
                    d6Var = d6Var2;
                    J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new org.telegram.messenger.t2(I, j12, j13, znVar, resourceProvider, 7), false);
                    J.c(0, "", new ai.p0(I, currentAccount, j12, j13, znVar, resourceProvider), false);
                    new org.telegram.messenger.n9(currentAccount, j12, j13, J.y(), y10).run();
                    boolean isDialogMuted = messagesController.isDialogMuted(j3, tL_forumTopic.f20084id);
                    if (isDialogMuted) {
                        i12 = R.drawable.msg_unmute;
                    } else {
                        i12 = R.drawable.msg_mute;
                    }
                    int i22 = i12;
                    if (isDialogMuted) {
                        i13 = R.string.Unmute;
                    } else {
                        i13 = R.string.Mute;
                    }
                    b10 = 0;
                    i14 = 8;
                    i15 = 2;
                    q80Var = I;
                    q80Var.c(i22, LocaleController.getString(i13), new ai.n3(e41Var, messagesController, tL_forumTopic, I, J, 25), false);
                    if (ChatObject.canManageTopic(i19, chat4, tL_forumTopic) && !UserObject.isBotForum(user)) {
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
                        q80Var.c(i16, LocaleController.getString(i17), new Runnable(e41Var) {
                            public final e41 f28523b;

                            {
                                this.f28523b = e41Var;
                            }

                            @Override
                            public final void run() {
                                boolean z122;
                                int i222 = r4;
                                e41 e41Var2 = this.f28523b;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                q80 q80Var3 = q80Var;
                                switch (i222) {
                                    case 0:
                                        q80Var3.u();
                                        e41Var2.h.presentFragment(af1.a0(-e41Var2.f25844c, tL_forumTopic2.f20084id));
                                        return;
                                    case 1:
                                        e41Var2.getClass();
                                        q80Var3.u();
                                        MessagesController.getInstance(e41Var2.f25842b).getTopicsController().toggleCloseTopic(-e41Var2.f25844c, tL_forumTopic2.f20084id, true ^ tL_forumTopic2.closed);
                                        return;
                                    default:
                                        q80Var3.u();
                                        HashSet hashSet = new HashSet();
                                        hashSet.add(Integer.valueOf(tL_forumTopic2.f20084id));
                                        vh vhVar = new vh(13);
                                        e41 e41Var3 = this.f28523b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e41Var3.getContext());
                                        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                                        a2Var.R = pluralString;
                                        ArrayList arrayList = new ArrayList(hashSet);
                                        long j122 = e41Var3.V;
                                        if (hashSet.size() == 1) {
                                            z122 = false;
                                            a2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(e41Var3.f25842b).getTopicsController().findTopic(-e41Var3.f25844c, ((Integer) arrayList.get(0)).intValue()).title);
                                        } else {
                                            z122 = false;
                                            a2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                        }
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.we(e41Var3, arrayList, j122, hashSet, vhVar));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ae0(20));
                                        a2Var.show();
                                        TextView textView = (TextView) a2Var.d(-1);
                                        if (textView != null) {
                                            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21026q7, z122));
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
                    if (ChatObject.canDeleteTopic(i19, chat4, tL_forumTopic)) {
                        q80Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", z10 ? 1 : 0), new Runnable(e41Var) {
                            public final e41 f28523b;

                            {
                                this.f28523b = e41Var;
                            }

                            @Override
                            public final void run() {
                                boolean z122;
                                int i222 = r4;
                                e41 e41Var2 = this.f28523b;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                q80 q80Var3 = q80Var;
                                switch (i222) {
                                    case 0:
                                        q80Var3.u();
                                        e41Var2.h.presentFragment(af1.a0(-e41Var2.f25844c, tL_forumTopic2.f20084id));
                                        return;
                                    case 1:
                                        e41Var2.getClass();
                                        q80Var3.u();
                                        MessagesController.getInstance(e41Var2.f25842b).getTopicsController().toggleCloseTopic(-e41Var2.f25844c, tL_forumTopic2.f20084id, true ^ tL_forumTopic2.closed);
                                        return;
                                    default:
                                        q80Var3.u();
                                        HashSet hashSet = new HashSet();
                                        hashSet.add(Integer.valueOf(tL_forumTopic2.f20084id));
                                        vh vhVar = new vh(13);
                                        e41 e41Var3 = this.f28523b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e41Var3.getContext());
                                        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                                        a2Var.R = pluralString;
                                        ArrayList arrayList = new ArrayList(hashSet);
                                        long j122 = e41Var3.V;
                                        if (hashSet.size() == 1) {
                                            z122 = false;
                                            a2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(e41Var3.f25842b).getTopicsController().findTopic(-e41Var3.f25844c, ((Integer) arrayList.get(0)).intValue()).title);
                                        } else {
                                            z122 = false;
                                            a2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                        }
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.we(e41Var3, arrayList, j122, hashSet, vhVar));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ae0(20));
                                        a2Var.show();
                                        TextView textView = (TextView) a2Var.d(-1);
                                        if (textView != null) {
                                            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21026q7, z122));
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        r62 = z10;
                    }
                }
                if (view instanceof z31) {
                    sw swVar = new sw(i15, b10);
                    Paint paint = new Paint((int) r62);
                    swVar.f30890c = paint;
                    swVar.f30889b = new RectF();
                    paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, d6Var));
                    q80Var.W(swVar);
                    q80Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
                } else {
                    int dp = AndroidUtilities.dp(5.0f);
                    int dp2 = AndroidUtilities.dp(5.0f);
                    int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20786d6, d6Var);
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
                    shapeDrawable.getPaint().setColor(w02);
                    q80Var.W(shapeDrawable);
                }
                q80Var.Z();
                return r62;
            }
        }
        return false;
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
        long j3 = this.f25844c;
        int i10 = this.f25842b;
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
        ofFloat.addUpdateListener(new k80(this, 29));
        this.U.addListener(new v31(this, z10));
        this.U.setInterpolator(ji.n.V);
        this.U.setDuration(250L);
        this.U.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.topicsDidLoaded;
        long j3 = this.f25844c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == (-j3)) {
                p();
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
            MessagesController.getInstance(this.f25842b).getTopicsController().sortTopics(-j3, false);
            p();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.F;
        if (frameLayout.getVisibility() == 0) {
            this.K.setBounds((int) frameLayout.getTranslationX(), (int) this.N, (int) (frameLayout.getTranslationX() + AndroidUtilities.dp(78.0f)), (int) (getMeasuredHeight() - this.M));
            this.K.draw(canvas);
        }
        FrameLayout frameLayout2 = this.f25851r;
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
            canvas.clipPath(this.K.f4684j.f4672k);
        }
        if (view == this.f25851r) {
            canvas.clipPath(this.L.f4684j.f4672k);
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
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f25842b).getTopicsController().getTopics(-this.f25844c);
        if (topics != null && !topics.isEmpty() && !this.f25846d0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f25840a.a(z11, z10);
    }

    public final void g() {
        int i10;
        int i11;
        int i12;
        me.b bVar = this.J;
        float f7 = bVar.f16365e;
        ImageView imageView = this.f25853w;
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
        ImageView imageView2 = this.f25854x;
        imageView2.setAlpha(f7);
        imageView2.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        imageView2.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        if (i13 > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView2.setVisibility(i11);
        float f10 = 1.0f - bVar.f16365e;
        ImageView imageView3 = this.f25855y;
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

    public a41 getCurrentTabsPosition() {
        if (this.Q) {
            return a41.f24433b;
        }
        if (this.P) {
            return a41.f24434c;
        }
        return a41.f24432a;
    }

    public float getSideMenuT() {
        return this.R * this.f25840a.f16365e;
    }

    public final void h() {
        int i10;
        float lerp = AndroidUtilities.lerp(1.0f, 0.0f, this.R);
        FrameLayout frameLayout = this.f25851r;
        frameLayout.setAlpha(lerp);
        if ((1.0f - this.R) * this.f25840a.f16365e > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        if (this.P) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.M) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, j(a41.f24434c)));
        } else {
            frameLayout.setTranslationY(this.N + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, j(a41.f24432a)));
        }
    }

    public final float j(a41 a41Var) {
        float f7;
        float f10 = this.f25840a.f16365e;
        if (a41Var == a41.f24433b) {
            f7 = this.R;
        } else if ((a41Var == a41.f24432a && !this.P) || (a41Var == a41.f24434c && this.P)) {
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
                u31 u31Var = this.G;
                if (i10 >= u31Var.getChildCount()) {
                    break;
                }
                r61 G = u31Var.W2.G(RecyclerView.R(u31Var.getChildAt(i10)));
                if (G == null || !G.f30367r) {
                    i10++;
                } else {
                    return true;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                s31 s31Var = this.f25852s;
                if (i11 >= s31Var.getChildCount()) {
                    break;
                }
                r61 G2 = s31Var.W2.G(RecyclerView.R(s31Var.getChildAt(i11)));
                if (G2 != null && G2.f30367r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void l() {
        TopicsController topicsController = MessagesController.getInstance(this.f25842b).getTopicsController();
        long j3 = this.f25844c;
        if (!topicsController.endIsReached(-j3)) {
            topicsController.loadTopics(-j3);
        }
    }

    public final void m(long j3, boolean z10) {
        if (this.f25847e) {
            Utilities.Callback2 callback2 = this.f25845c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j3), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.f25841a0;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j3), Boolean.valueOf(z10));
        }
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        o();
    }

    public final void o() {
        org.telegram.ui.le leVar = this.O;
        if (leVar != null) {
            leVar.run();
        }
        h();
        float j3 = j(a41.f24433b);
        int i10 = 0;
        FrameLayout frameLayout = this.F;
        frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, j3));
        if (j3 <= 0.0f) {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        int i11 = org.telegram.ui.ActionBar.h6.f21189z6;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        int d = i0.a.d(1.0f - this.R, w02, org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f25855y.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.E.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.R, org.telegram.ui.ActionBar.h6.w0(i11, d6Var), org.telegram.ui.ActionBar.h6.w0(i12, d6Var)), mode));
        this.f25853w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), mode));
        this.f25854x.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), mode));
        invalidate();
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
        s31 s31Var = this.f25852s;
        boolean canScrollHorizontally = s31Var.canScrollHorizontally(-1);
        s31Var.W2.N(true);
        if (!canScrollHorizontally) {
            s31Var.u0(0);
        }
        u31 u31Var = this.G;
        boolean canScrollVertically = u31Var.canScrollVertically(-1);
        u31Var.W2.N(true);
        if (!canScrollVertically) {
            u31Var.u0(0);
        }
        AndroidUtilities.runOnUIThread(new l31(this, 1));
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.f25846d0 != z10) {
            this.f25846d0 = z10;
            f(true);
        }
    }

    public void setCurrentTopic(long j3) {
        boolean z10;
        this.V = j3;
        s31 s31Var = this.f25852s;
        s31Var.W2.N(true);
        s31Var.invalidate();
        this.G.W2.N(true);
        d41 d41Var = this.v;
        if (d41Var != null) {
            if (j3 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            d41Var.c(true, false, z10);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.f25845c0 = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.f25843b0 = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.f25841a0 = callback2;
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
    public final void A(float f7, int i10) {
    }
}
