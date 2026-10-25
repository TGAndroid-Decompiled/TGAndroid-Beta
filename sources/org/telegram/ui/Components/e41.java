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
import org.telegram.ui.wd1;
public final class e41 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, oe.d, org.telegram.ui.ActionBar.p6 {
    public static final int f27722i0 = 0;
    public final ImageView E;
    public final FrameLayout F;
    public final u31 G;
    public long H;
    public long I;
    public final oe.b J;
    public eh.d K;
    public eh.d L;
    public float M;
    public float N;
    public org.telegram.ui.le O;
    public boolean P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public Boolean W;
    public final oe.b f27723a;
    public ValueAnimator f27724a0;
    public final int f27725b;
    public long f27726b0;
    public final long f27727c;
    public boolean f27728c0;
    public final org.telegram.ui.ActionBar.u6 d;
    public Utilities.Callback2 f27729d0;
    public final boolean e;
    public Runnable f27730e0;
    public final boolean f27731f;
    public Utilities.Callback2 f27732f0;
    public boolean f27733g0;
    public final org.telegram.ui.un h;
    public final HashSet f27734h0;
    public final boolean f27735n;
    public final FrameLayout f27736r;
    public final s31 f27737s;
    public final d41 v;
    public final ImageView f27738w;
    public final ImageView f27739x;
    public final ImageView f27740y;

    public e41(Activity activity, org.telegram.ui.un unVar, int i10, long j10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity);
        FrameLayout frameLayout;
        float f7;
        int i11;
        boolean z10;
        ds dsVar = ds.h;
        this.f27723a = new oe.b(0, this, dsVar, 380L, true);
        this.J = new oe.b(0, new m31(this), dsVar, 320L, false);
        this.R = 0.0f;
        this.f27734h0 = new HashSet();
        this.h = unVar;
        this.f27725b = i10;
        this.f27727c = j10;
        this.d = u6Var;
        long j11 = -j10;
        this.e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        this.f27731f = isBotForumWithEditableTopics;
        this.f27735n = !org.telegram.messenger.t.x("topics_end_reached_", j11, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.f27736r = frameLayout2;
        addView(frameLayout2, gb1.h(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.F = frameLayout3;
        addView(frameLayout3, gb1.h(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        s31 s31Var = new s31(this, activity, i10, new Utilities.Callback2(this) {
            public final e41 f32088b;

            {
                this.f32088b = this;
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
                e41 e41Var = this.f32088b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        j71 j71Var = (j71) obj2;
                        boolean z18 = e41Var.f27731f;
                        int i14 = e41Var.f27725b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = e41Var.f27727c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = e41Var.e;
                        int i15 = y31.f34918a;
                        t61 K = t61.K(y31.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f32877q = z19;
                        if (e41Var.f27726b0 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        K.L(z11);
                        arrayList.add(K);
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
                                    if (tL_forumTopic2.f22079id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (e41Var.f27734h0.contains(Integer.valueOf(tL_forumTopic2.f22079id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((t61) ic.a.g(1, arrayList)).f32884y |= 8;
                                        }
                                        j71Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        j71Var.M();
                                        z20 = true;
                                    }
                                    t61 K2 = t61.K(y31.class);
                                    K2.f32883x = j17;
                                    K2.d = tL_forumTopic2.f22079id;
                                    K2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        K2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        K2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = e41Var.f27726b0;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f22079id;
                                    }
                                    if (j12 == j13) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    K2.L(z14);
                                    arrayList.add(K2);
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
                            j71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && e41Var.f27735n) {
                            t61 K3 = t61.K(y31.class);
                            K3.d = -2;
                            K3.f32878r = true;
                            arrayList.add(K3);
                            t61 K4 = t61.K(y31.class);
                            K4.d = -3;
                            K4.f32878r = true;
                            arrayList.add(K4);
                            t61 K5 = t61.K(y31.class);
                            K5.d = -4;
                            K5.f32878r = true;
                            arrayList.add(K5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                t61 K6 = t61.K(y31.class);
                                K6.d = -2;
                                K6.B = -2L;
                                K6.G = null;
                                arrayList.add(K6);
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
                        j71 j71Var2 = (j71) obj2;
                        boolean z22 = e41Var.e;
                        int i19 = e41Var.f27725b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = e41Var.f27727c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = e41Var.f27731f;
                        if (!z23) {
                            int i20 = c41.f27072a;
                            t61 K7 = t61.K(c41.class);
                            K7.d = 0;
                            topicsController = topicsController3;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f32877q = z22;
                            K7.f32884y = z23 ? 1 : 0;
                            if (e41Var.f27726b0 == 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            K7.L(z17);
                            arrayList2.add(K7);
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
                                    if (tL_forumTopic4.f22079id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (e41Var.f27734h0.contains(Integer.valueOf(tL_forumTopic4.f22079id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        j71Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        j71Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = c41.f27072a;
                                    t61 K8 = t61.K(c41.class);
                                    K8.f32883x = j20;
                                    K8.d = tL_forumTopic4.f22079id;
                                    K8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        K8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        K8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = e41Var.f27726b0;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f22079id;
                                    }
                                    if (j15 == j16) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    K8.L(z16);
                                    arrayList2.add(K8);
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
                            j71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && e41Var.f27735n) {
                            int i24 = c41.f27072a;
                            t61 K9 = t61.K(c41.class);
                            K9.d = -2;
                            K9.f32878r = true;
                            K9.e = false;
                            arrayList2.add(K9);
                            t61 K10 = t61.K(c41.class);
                            K10.d = -3;
                            K10.f32878r = true;
                            K10.e = false;
                            arrayList2.add(K10);
                            t61 K11 = t61.K(c41.class);
                            K11.d = -4;
                            K11.f32878r = true;
                            K11.e = false;
                            arrayList2.add(K11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = c41.f27072a;
                                t61 K12 = t61.K(c41.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f32877q = false;
                                arrayList2.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new m31(this), new m31(this), u6Var);
        this.f27737s = s31Var;
        s31Var.H1(new Utilities.Callback2(this) {
            public final e41 f32088b;

            {
                this.f32088b = this;
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
                e41 e41Var = this.f32088b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        j71 j71Var = (j71) obj2;
                        boolean z18 = e41Var.f27731f;
                        int i14 = e41Var.f27725b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = e41Var.f27727c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = e41Var.e;
                        int i15 = y31.f34918a;
                        t61 K = t61.K(y31.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f32877q = z19;
                        if (e41Var.f27726b0 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        K.L(z11);
                        arrayList.add(K);
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
                                    if (tL_forumTopic2.f22079id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (e41Var.f27734h0.contains(Integer.valueOf(tL_forumTopic2.f22079id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((t61) ic.a.g(1, arrayList)).f32884y |= 8;
                                        }
                                        j71Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        j71Var.M();
                                        z20 = true;
                                    }
                                    t61 K2 = t61.K(y31.class);
                                    K2.f32883x = j17;
                                    K2.d = tL_forumTopic2.f22079id;
                                    K2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        K2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        K2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = e41Var.f27726b0;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f22079id;
                                    }
                                    if (j12 == j13) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    K2.L(z14);
                                    arrayList.add(K2);
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
                            j71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && e41Var.f27735n) {
                            t61 K3 = t61.K(y31.class);
                            K3.d = -2;
                            K3.f32878r = true;
                            arrayList.add(K3);
                            t61 K4 = t61.K(y31.class);
                            K4.d = -3;
                            K4.f32878r = true;
                            arrayList.add(K4);
                            t61 K5 = t61.K(y31.class);
                            K5.d = -4;
                            K5.f32878r = true;
                            arrayList.add(K5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                t61 K6 = t61.K(y31.class);
                                K6.d = -2;
                                K6.B = -2L;
                                K6.G = null;
                                arrayList.add(K6);
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
                        j71 j71Var2 = (j71) obj2;
                        boolean z22 = e41Var.e;
                        int i19 = e41Var.f27725b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = e41Var.f27727c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = e41Var.f27731f;
                        if (!z23) {
                            int i20 = c41.f27072a;
                            t61 K7 = t61.K(c41.class);
                            K7.d = 0;
                            topicsController = topicsController3;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f32877q = z22;
                            K7.f32884y = z23 ? 1 : 0;
                            if (e41Var.f27726b0 == 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            K7.L(z17);
                            arrayList2.add(K7);
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
                                    if (tL_forumTopic4.f22079id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (e41Var.f27734h0.contains(Integer.valueOf(tL_forumTopic4.f22079id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        j71Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        j71Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = c41.f27072a;
                                    t61 K8 = t61.K(c41.class);
                                    K8.f32883x = j20;
                                    K8.d = tL_forumTopic4.f22079id;
                                    K8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        K8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        K8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = e41Var.f27726b0;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f22079id;
                                    }
                                    if (j15 == j16) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    K8.L(z16);
                                    arrayList2.add(K8);
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
                            j71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && e41Var.f27735n) {
                            int i24 = c41.f27072a;
                            t61 K9 = t61.K(c41.class);
                            K9.d = -2;
                            K9.f32878r = true;
                            K9.e = false;
                            arrayList2.add(K9);
                            t61 K10 = t61.K(c41.class);
                            K10.d = -3;
                            K10.f32878r = true;
                            K10.e = false;
                            arrayList2.add(K10);
                            t61 K11 = t61.K(c41.class);
                            K11.d = -4;
                            K11.f32878r = true;
                            K11.e = false;
                            arrayList2.add(K11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = c41.f27072a;
                                t61 K12 = t61.K(c41.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f32877q = false;
                                arrayList2.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        s31Var.setWillNotDraw(false);
        s31Var.f32150g3.f29505r = false;
        s31Var.getContext();
        ig.j0 j0Var = new ig.j0((ViewGroup) s31Var, 6);
        s31Var.f32149f3 = j0Var;
        s31Var.setLayoutManager(j0Var);
        frameLayout2.addView(s31Var, gb1.h(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        s31Var.j(new t31(this, 0));
        if (isBotForumWithEditableTopics) {
            d41 d41Var = new d41(activity, i10, u6Var);
            this.v = d41Var;
            if (this.f27726b0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            d41Var.c(true, false, z10);
            d41Var.setOnClickListener(new View.OnClickListener(this) {
                public final e41 f31437b;

                {
                    this.f31437b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            e41 e41Var = this.f31437b;
                            Boolean bool = e41Var.W;
                            boolean z11 = false;
                            if (bool == null ? !e41Var.Q : !bool.booleanValue()) {
                                z11 = true;
                            }
                            e41Var.d(z11);
                            return;
                        case 1:
                            e41 e41Var2 = this.f31437b;
                            u31 u31Var = e41Var2.G;
                            u31Var.C1(false);
                            s31 s31Var2 = e41Var2.f27737s;
                            s31Var2.C1(false);
                            e41Var2.J.a(false, true);
                            AndroidUtilities.updateVisibleRows(u31Var);
                            AndroidUtilities.updateVisibleRows(s31Var2);
                            return;
                        default:
                            this.f31437b.f27729d0.run(0, Boolean.FALSE);
                            return;
                    }
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(d41Var, gb1.h(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            frameLayout = frameLayout3;
            this.v = null;
        }
        ViewGroup viewGroup = frameLayout;
        u31 u31Var = new u31(activity, i10, new Utilities.Callback2(this) {
            public final e41 f32088b;

            {
                this.f32088b = this;
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
                e41 e41Var = this.f32088b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        j71 j71Var = (j71) obj2;
                        boolean z18 = e41Var.f27731f;
                        int i14 = e41Var.f27725b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = e41Var.f27727c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = e41Var.e;
                        int i15 = y31.f34918a;
                        t61 K = t61.K(y31.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f32877q = z19;
                        if (e41Var.f27726b0 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        K.L(z11);
                        arrayList.add(K);
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
                                    if (tL_forumTopic2.f22079id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (e41Var.f27734h0.contains(Integer.valueOf(tL_forumTopic2.f22079id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((t61) ic.a.g(1, arrayList)).f32884y |= 8;
                                        }
                                        j71Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        j71Var.M();
                                        z20 = true;
                                    }
                                    t61 K2 = t61.K(y31.class);
                                    K2.f32883x = j17;
                                    K2.d = tL_forumTopic2.f22079id;
                                    K2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        K2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        K2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = e41Var.f27726b0;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f22079id;
                                    }
                                    if (j12 == j13) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    K2.L(z14);
                                    arrayList.add(K2);
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
                            j71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && e41Var.f27735n) {
                            t61 K3 = t61.K(y31.class);
                            K3.d = -2;
                            K3.f32878r = true;
                            arrayList.add(K3);
                            t61 K4 = t61.K(y31.class);
                            K4.d = -3;
                            K4.f32878r = true;
                            arrayList.add(K4);
                            t61 K5 = t61.K(y31.class);
                            K5.d = -4;
                            K5.f32878r = true;
                            arrayList.add(K5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                t61 K6 = t61.K(y31.class);
                                K6.d = -2;
                                K6.B = -2L;
                                K6.G = null;
                                arrayList.add(K6);
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
                        j71 j71Var2 = (j71) obj2;
                        boolean z22 = e41Var.e;
                        int i19 = e41Var.f27725b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = e41Var.f27727c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = e41Var.f27731f;
                        if (!z23) {
                            int i20 = c41.f27072a;
                            t61 K7 = t61.K(c41.class);
                            K7.d = 0;
                            topicsController = topicsController3;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f32877q = z22;
                            K7.f32884y = z23 ? 1 : 0;
                            if (e41Var.f27726b0 == 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            K7.L(z17);
                            arrayList2.add(K7);
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
                                    if (tL_forumTopic4.f22079id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (e41Var.f27734h0.contains(Integer.valueOf(tL_forumTopic4.f22079id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        j71Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        j71Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = c41.f27072a;
                                    t61 K8 = t61.K(c41.class);
                                    K8.f32883x = j20;
                                    K8.d = tL_forumTopic4.f22079id;
                                    K8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        K8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        K8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = e41Var.f27726b0;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f22079id;
                                    }
                                    if (j15 == j16) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    K8.L(z16);
                                    arrayList2.add(K8);
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
                            j71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && e41Var.f27735n) {
                            int i24 = c41.f27072a;
                            t61 K9 = t61.K(c41.class);
                            K9.d = -2;
                            K9.f32878r = true;
                            K9.e = false;
                            arrayList2.add(K9);
                            t61 K10 = t61.K(c41.class);
                            K10.d = -3;
                            K10.f32878r = true;
                            K10.e = false;
                            arrayList2.add(K10);
                            t61 K11 = t61.K(c41.class);
                            K11.d = -4;
                            K11.f32878r = true;
                            K11.e = false;
                            arrayList2.add(K11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = c41.f27072a;
                                t61 K12 = t61.K(c41.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f32877q = false;
                                arrayList2.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new m31(this), new m31(this), u6Var);
        this.G = u31Var;
        u31Var.H1(new Utilities.Callback2(this) {
            public final e41 f32088b;

            {
                this.f32088b = this;
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
                e41 e41Var = this.f32088b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        j71 j71Var = (j71) obj2;
                        boolean z18 = e41Var.f27731f;
                        int i14 = e41Var.f27725b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = e41Var.f27727c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z19 = e41Var.e;
                        int i15 = y31.f34918a;
                        t61 K = t61.K(y31.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f32877q = z19;
                        if (e41Var.f27726b0 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        K.L(z11);
                        arrayList.add(K);
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
                                    if (tL_forumTopic2.f22079id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (e41Var.f27734h0.contains(Integer.valueOf(tL_forumTopic2.f22079id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z20) {
                                        if (!arrayList.isEmpty()) {
                                            ((t61) ic.a.g(1, arrayList)).f32884y |= 8;
                                        }
                                        j71Var.L();
                                        z20 = false;
                                    } else if (z21 && !z20) {
                                        j71Var.M();
                                        z20 = true;
                                    }
                                    t61 K2 = t61.K(y31.class);
                                    K2.f32883x = j17;
                                    K2.d = tL_forumTopic2.f22079id;
                                    K2.G = tL_forumTopic2;
                                    if (z19) {
                                        z13 = z20;
                                        K2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        K2.I = false;
                                    } else {
                                        z13 = z20;
                                    }
                                    long j19 = e41Var.f27726b0;
                                    if (z19) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.f22079id;
                                    }
                                    if (j12 == j13) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    K2.L(z14);
                                    arrayList.add(K2);
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
                            j71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && e41Var.f27735n) {
                            t61 K3 = t61.K(y31.class);
                            K3.d = -2;
                            K3.f32878r = true;
                            arrayList.add(K3);
                            t61 K4 = t61.K(y31.class);
                            K4.d = -3;
                            K4.f32878r = true;
                            arrayList.add(K4);
                            t61 K5 = t61.K(y31.class);
                            K5.d = -4;
                            K5.f32878r = true;
                            arrayList.add(K5);
                        }
                        if (!z18 && !z19) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                t61 K6 = t61.K(y31.class);
                                K6.d = -2;
                                K6.B = -2L;
                                K6.G = null;
                                arrayList.add(K6);
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
                        j71 j71Var2 = (j71) obj2;
                        boolean z22 = e41Var.e;
                        int i19 = e41Var.f27725b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = e41Var.f27727c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z23 = e41Var.f27731f;
                        if (!z23) {
                            int i20 = c41.f27072a;
                            t61 K7 = t61.K(c41.class);
                            K7.d = 0;
                            topicsController = topicsController3;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f32877q = z22;
                            K7.f32884y = z23 ? 1 : 0;
                            if (e41Var.f27726b0 == 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            K7.L(z17);
                            arrayList2.add(K7);
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
                                    if (tL_forumTopic4.f22079id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (e41Var.f27734h0.contains(Integer.valueOf(tL_forumTopic4.f22079id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z24 = tL_forumTopic4.pinned;
                                    if (!z24 && z15) {
                                        j71Var2.L();
                                        z15 = false;
                                    } else if (z24 && !z15) {
                                        j71Var2.M();
                                        z15 = true;
                                    }
                                    int i23 = c41.f27072a;
                                    t61 K8 = t61.K(c41.class);
                                    K8.f32883x = j20;
                                    K8.d = tL_forumTopic4.f22079id;
                                    K8.G = tL_forumTopic4;
                                    if (z22) {
                                        j14 = j20;
                                        K8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        K8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = e41Var.f27726b0;
                                    if (z22) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.f22079id;
                                    }
                                    if (j15 == j16) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    K8.L(z16);
                                    arrayList2.add(K8);
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
                            j71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && e41Var.f27735n) {
                            int i24 = c41.f27072a;
                            t61 K9 = t61.K(c41.class);
                            K9.d = -2;
                            K9.f32878r = true;
                            K9.e = false;
                            arrayList2.add(K9);
                            t61 K10 = t61.K(c41.class);
                            K10.d = -3;
                            K10.f32878r = true;
                            K10.e = false;
                            arrayList2.add(K10);
                            t61 K11 = t61.K(c41.class);
                            K11.d = -4;
                            K11.f32878r = true;
                            K11.e = false;
                            arrayList2.add(K11);
                        }
                        if (!z23 && !z22) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = c41.f27072a;
                                t61 K12 = t61.K(c41.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f32877q = false;
                                arrayList2.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        u31Var.f32150g3.f29505r = false;
        u31Var.setClipToPadding(false);
        u31Var.setClipChildren(false);
        if (isBotForumWithEditableTopics) {
            f7 = 90.0f;
        } else {
            f7 = 48.0f;
        }
        viewGroup.addView(u31Var, gb1.h(-1, -1.0f, 119, 0.0f, f7, 0.0f, 0.0f));
        u31Var.j(new t31(this, 1));
        ImageView j12 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final e41 f31437b;

            {
                this.f31437b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e41 e41Var = this.f31437b;
                        Boolean bool = e41Var.W;
                        boolean z11 = false;
                        if (bool == null ? !e41Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        e41Var.d(z11);
                        return;
                    case 1:
                        e41 e41Var2 = this.f31437b;
                        u31 u31Var2 = e41Var2.G;
                        u31Var2.C1(false);
                        s31 s31Var2 = e41Var2.f27737s;
                        s31Var2.C1(false);
                        e41Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(u31Var2);
                        AndroidUtilities.updateVisibleRows(s31Var2);
                        return;
                    default:
                        this.f31437b.f27729d0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f27740y = j12;
        ImageView j13 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) {
            public final e41 f31437b;

            {
                this.f31437b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e41 e41Var = this.f31437b;
                        Boolean bool = e41Var.W;
                        boolean z11 = false;
                        if (bool == null ? !e41Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        e41Var.d(z11);
                        return;
                    case 1:
                        e41 e41Var2 = this.f31437b;
                        u31 u31Var2 = e41Var2.G;
                        u31Var2.C1(false);
                        s31 s31Var2 = e41Var2.f27737s;
                        s31Var2.C1(false);
                        e41Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(u31Var2);
                        AndroidUtilities.updateVisibleRows(s31Var2);
                        return;
                    default:
                        this.f31437b.f27729d0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.E = j13;
        frameLayout2.addView(j12, gb1.i(44, 36, 51));
        viewGroup.addView(j13, gb1.i(64, 48, 51));
        ImageView j14 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final e41 f31437b;

            {
                this.f31437b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e41 e41Var = this.f31437b;
                        Boolean bool = e41Var.W;
                        boolean z11 = false;
                        if (bool == null ? !e41Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        e41Var.d(z11);
                        return;
                    case 1:
                        e41 e41Var2 = this.f31437b;
                        u31 u31Var2 = e41Var2.G;
                        u31Var2.C1(false);
                        s31 s31Var2 = e41Var2.f27737s;
                        s31Var2.C1(false);
                        e41Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(u31Var2);
                        AndroidUtilities.updateVisibleRows(s31Var2);
                        return;
                    default:
                        this.f31437b.f27729d0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f27738w = j14;
        ImageView j15 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) {
            public final e41 f31437b;

            {
                this.f31437b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e41 e41Var = this.f31437b;
                        Boolean bool = e41Var.W;
                        boolean z11 = false;
                        if (bool == null ? !e41Var.Q : !bool.booleanValue()) {
                            z11 = true;
                        }
                        e41Var.d(z11);
                        return;
                    case 1:
                        e41 e41Var2 = this.f31437b;
                        u31 u31Var2 = e41Var2.G;
                        u31Var2.C1(false);
                        s31 s31Var2 = e41Var2.f27737s;
                        s31Var2.C1(false);
                        e41Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(u31Var2);
                        AndroidUtilities.updateVisibleRows(s31Var2);
                        return;
                    default:
                        this.f31437b.f27729d0.run(0, Boolean.FALSE);
                        return;
                }
            }
        });
        this.f27739x = j15;
        frameLayout2.addView(j14, gb1.i(44, 36, 51));
        viewGroup.addView(j15, gb1.i(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j11, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.t.x("topicssidetabs", j10, mainSettings, false)) {
            this.R = 1.0f;
            this.Q = true;
        }
        boolean x9 = org.telegram.messenger.t.x("topicssidetabsb", j10, mainSettings, false);
        this.P = x9;
        if (x9) {
            i11 = R.drawable.menu_sidebar_top;
        } else {
            i11 = R.drawable.menu_sidebar_bottom;
        }
        j13.setImageResource(i11);
        g(false);
        h();
        o();
        p();
    }

    public static void a(e41 e41Var, t61 t61Var) {
        if (e41Var.e) {
            Utilities.Callback2 callback2 = e41Var.f27732f0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(t61Var.B), Boolean.FALSE);
            }
        } else if (t61Var.B == -2) {
            Runnable runnable = e41Var.f27730e0;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            Utilities.Callback2 callback22 = e41Var.f27729d0;
            if (callback22 != null) {
                callback22.run(Integer.valueOf(t61Var.d), Boolean.FALSE);
            }
        }
    }

    public static void b(e41 e41Var, ArrayList arrayList) {
        long j10 = e41Var.f27727c;
        TopicsController topicsController = MessagesController.getInstance(e41Var.f27725b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = c3.h0.i(((t61) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j11 = -j10;
        topicsController.reorderPinnedTopics(j11, arrayList2);
        topicsController.sortTopics(j11, false);
    }

    public static boolean c(final e41 e41Var, t61 t61Var, View view) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10;
        int i11;
        TLRPC.Chat chat2;
        final e41 e41Var2;
        boolean z10;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i12;
        int i13;
        int i14;
        byte b10;
        int i15;
        ?? r11;
        final k80 k80Var;
        int i16;
        int i17;
        k80 k80Var2;
        org.telegram.ui.ActionBar.u6 u6Var2 = e41Var.d;
        org.telegram.ui.un unVar = e41Var.h;
        long j10 = e41Var.f27727c;
        int i18 = e41Var.f27725b;
        if (e41Var.G.f32154k3 || e41Var.f27737s.f32154k3) {
            return false;
        }
        Object obj = t61Var.G;
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
        final k80 I = k80.I(unVar, view);
        if (ChatObject.isMonoForum(chat)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i18, chat)) {
                return false;
            }
            TLRPC.Chat chat3 = chat;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new bi.y2(e41Var, I, peerDialogId, chat, 17), false);
            long j11 = chat3.f22027id;
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
                org.telegram.ui.ActionBar.g1 y3 = I.y();
                i14 = 8;
                y3.setVisibility(8);
                MessagesController messagesController2 = MessagesController.getInstance(i18);
                bi.x3 x3Var = new bi.x3(e41Var, y3, I, j11, user2, chat4);
                k80Var2 = I;
                messagesController2.checkIsInChat(true, chat4, user2, x3Var);
            } else {
                k80Var2 = I;
                i14 = 8;
            }
            k80Var = k80Var2;
            u6Var = u6Var2;
            r11 = 1;
            i15 = 2;
            b10 = 0;
        } else {
            TLRPC.Chat chat5 = chat;
            if (!ChatObject.canManageTopics(chat5) && !UserObject.isBotForumWithEditableTopics(user)) {
                e41Var2 = e41Var;
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
                e41Var2 = e41Var;
                Runnable e10Var = new e10(e41Var2, I, messagesController, tL_forumTopic, 12);
                I = I;
                messagesController = messagesController;
                tL_forumTopic = tL_forumTopic;
                I.c(i10, string, e10Var, false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new n31(e41Var2, 0), false);
                }
            }
            if (!ChatObject.canManageTopics(chat2) && !UserObject.isBotForumWithEditableTopics(user)) {
                z10 = false;
            } else {
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(e41Var2) {
                    public final e41 f31147b;

                    {
                        this.f31147b = e41Var2;
                    }

                    @Override
                    public final void run() {
                        int i20 = r4;
                        e41 e41Var3 = this.f31147b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        k80 k80Var3 = I;
                        switch (i20) {
                            case 0:
                                k80Var3.u();
                                e41Var3.h.presentFragment(wd1.b0(-e41Var3.f27727c, tL_forumTopic2.f22079id));
                                return;
                            case 1:
                                e41Var3.getClass();
                                k80Var3.u();
                                MessagesController.getInstance(e41Var3.f27725b).getTopicsController().toggleCloseTopic(-e41Var3.f27727c, tL_forumTopic2.f22079id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                k80Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f22079id));
                                k5 k5Var = new k5(20);
                                e41 e41Var4 = this.f31147b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e41Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                                e2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = e41Var4.f27726b0;
                                if (hashSet.size() == 1) {
                                    e2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(e41Var4.f27725b).getTopicsController().findTopic(-e41Var4.f27727c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    e2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bi.m4(e41Var4, arrayList, j13, hashSet, k5Var));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new qd0(25));
                                e2Var.show();
                                TextView textView = (TextView) e2Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23596q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                z10 = false;
            }
            long j13 = e41Var2.f27727c;
            long j14 = tL_forumTopic.f22079id;
            int currentAccount = unVar.getCurrentAccount();
            org.telegram.ui.ActionBar.u6 resourceProvider = unVar.getResourceProvider();
            k80 k80Var3 = I;
            wo woVar = new wo(k80Var3, currentAccount, j13, j14, unVar, resourceProvider);
            k80 J = k80Var3.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.zt0(k80Var3, 26), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.ua(k80Var3, currentAccount, j13, j14, J, unVar, resourceProvider), false);
            org.telegram.ui.ActionBar.g1 y10 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new ai.h1(k80Var3, resourceProvider, currentAccount, woVar, 21), false);
            u6Var = u6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new org.telegram.messenger.y2(k80Var3, j13, j14, unVar, resourceProvider, 7), false);
            J.c(0, "", new bi.ka(k80Var3, currentAccount, j13, j14, unVar, resourceProvider), false);
            new org.telegram.messenger.t9(currentAccount, j13, j14, J.y(), y10).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j10, tL_forumTopic.f22079id);
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
            Runnable i30Var = new i30(e41Var, messagesController, tL_forumTopic, k80Var3, J, 3);
            k80Var = k80Var3;
            k80Var.c(i20, string2, i30Var, false);
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
                k80Var.c(i16, LocaleController.getString(i17), new Runnable(e41Var) {
                    public final e41 f31147b;

                    {
                        this.f31147b = e41Var;
                    }

                    @Override
                    public final void run() {
                        int i202 = r4;
                        e41 e41Var3 = this.f31147b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        k80 k80Var32 = k80Var;
                        switch (i202) {
                            case 0:
                                k80Var32.u();
                                e41Var3.h.presentFragment(wd1.b0(-e41Var3.f27727c, tL_forumTopic2.f22079id));
                                return;
                            case 1:
                                e41Var3.getClass();
                                k80Var32.u();
                                MessagesController.getInstance(e41Var3.f27725b).getTopicsController().toggleCloseTopic(-e41Var3.f27727c, tL_forumTopic2.f22079id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                k80Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f22079id));
                                k5 k5Var = new k5(20);
                                e41 e41Var4 = this.f31147b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e41Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                                e2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = e41Var4.f27726b0;
                                if (hashSet.size() == 1) {
                                    e2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(e41Var4.f27725b).getTopicsController().findTopic(-e41Var4.f27727c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    e2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bi.m4(e41Var4, arrayList, j132, hashSet, k5Var));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new qd0(25));
                                e2Var.show();
                                TextView textView = (TextView) e2Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23596q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            if (ChatObject.canDeleteTopic(i18, chat6, tL_forumTopic)) {
                k80Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1), new Runnable(e41Var) {
                    public final e41 f31147b;

                    {
                        this.f31147b = e41Var;
                    }

                    @Override
                    public final void run() {
                        int i202 = r4;
                        e41 e41Var3 = this.f31147b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        k80 k80Var32 = k80Var;
                        switch (i202) {
                            case 0:
                                k80Var32.u();
                                e41Var3.h.presentFragment(wd1.b0(-e41Var3.f27727c, tL_forumTopic2.f22079id));
                                return;
                            case 1:
                                e41Var3.getClass();
                                k80Var32.u();
                                MessagesController.getInstance(e41Var3.f27725b).getTopicsController().toggleCloseTopic(-e41Var3.f27727c, tL_forumTopic2.f22079id, true ^ tL_forumTopic2.closed);
                                return;
                            default:
                                k80Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.f22079id));
                                k5 k5Var = new k5(20);
                                e41 e41Var4 = this.f31147b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e41Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                                e2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = e41Var4.f27726b0;
                                if (hashSet.size() == 1) {
                                    e2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(e41Var4.f27725b).getTopicsController().findTopic(-e41Var4.f27727c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    e2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bi.m4(e41Var4, arrayList, j132, hashSet, k5Var));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new qd0(25));
                                e2Var.show();
                                TextView textView = (TextView) e2Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23596q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
        }
        if (view instanceof z31) {
            jw jwVar = new jw(i15, b10);
            Paint paint = new Paint((int) r11);
            jwVar.f29727c = paint;
            jwVar.f29726b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, u6Var));
            k80Var.W(jwVar);
            k80Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23354d6, u6Var);
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
            k80Var.W(shapeDrawable);
        }
        k80Var.Z();
        return r11;
    }

    public static ImageView j(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        gb1.b(imageView);
        return imageView;
    }

    private void setAttached(boolean z10) {
        if (this.f27728c0 == z10) {
            return;
        }
        this.f27728c0 = z10;
        long j10 = this.f27727c;
        int i10 = this.f27725b;
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
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        o();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23765z6));
    }

    public final void d(boolean z10) {
        float f7;
        if (this.Q == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f27724a0;
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
        this.f27724a0 = ofFloat;
        ofFloat.addUpdateListener(new e80(this, 28));
        this.f27724a0.addListener(new v31(this, z10));
        this.f27724a0.setInterpolator(mi.m.V);
        this.f27724a0.setDuration(250L);
        this.f27724a0.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.topicsDidLoaded;
        long j10 = this.f27727c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == (-j10)) {
                p();
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
            MessagesController.getInstance(this.f27725b).getTopicsController().sortTopics(-j10, false);
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
        FrameLayout frameLayout2 = this.f27736r;
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
            canvas.clipPath(this.K.f9966x.f9956k);
        }
        if (view == this.f27736r) {
            canvas.clipPath(this.L.f9966x.f9956k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.y6.f23765z6;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var);
        int f7 = i0.a.f(1.0f - this.R, w02, w03);
        int f10 = i0.a.f(this.R, w02, w03);
        boolean z10 = this.T;
        this.T = true;
        ImageView imageView = this.f27740y;
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
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f27725b).getTopicsController().getTopics(-this.f27727c);
        if (topics != null && !topics.isEmpty() && !this.f27733g0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27723a.a(z11, z10);
    }

    public a41 getCurrentTabsPosition() {
        if (this.Q) {
            return a41.f26407b;
        }
        if (this.P) {
            return a41.f26408c;
        }
        return a41.f26406a;
    }

    public float getSideMenuT() {
        return this.R * this.f27723a.e;
    }

    public final void h() {
        int i10;
        int i11;
        int i12;
        oe.b bVar = this.J;
        float f7 = bVar.e;
        ImageView imageView = this.f27738w;
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
        ImageView imageView2 = this.f27739x;
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
        ImageView imageView3 = this.f27740y;
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
        FrameLayout frameLayout = this.f27736r;
        frameLayout.setAlpha(lerp);
        if ((1.0f - this.R) * this.f27723a.e > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        if (this.P) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.M) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, k(a41.f26408c)));
        } else {
            frameLayout.setTranslationY(this.N + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, k(a41.f26406a)));
        }
    }

    public final float k(a41 a41Var) {
        float f7;
        float f10 = this.f27723a.e;
        if (a41Var == a41.f26407b) {
            f7 = this.R;
        } else if ((a41Var == a41.f26406a && !this.P) || (a41Var == a41.f26408c && this.P)) {
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
                u31 u31Var = this.G;
                if (i10 >= u31Var.getChildCount()) {
                    break;
                }
                t61 G = u31Var.f32150g3.G(RecyclerView.R(u31Var.getChildAt(i10)));
                if (G == null || !G.f32878r) {
                    i10++;
                } else {
                    return true;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                s31 s31Var = this.f27737s;
                if (i11 >= s31Var.getChildCount()) {
                    break;
                }
                t61 G2 = s31Var.f32150g3.G(RecyclerView.R(s31Var.getChildAt(i11)));
                if (G2 != null && G2.f32878r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void m() {
        TopicsController topicsController = MessagesController.getInstance(this.f27725b).getTopicsController();
        long j10 = this.f27727c;
        if (!topicsController.endIsReached(-j10)) {
            topicsController.loadTopics(-j10);
        }
    }

    public final void n(long j10, boolean z10) {
        if (this.e) {
            Utilities.Callback2 callback2 = this.f27732f0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.f27729d0;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j10), Boolean.valueOf(z10));
        }
    }

    public final void o() {
        org.telegram.ui.le leVar = this.O;
        if (leVar != null) {
            leVar.run();
        }
        i();
        float k10 = k(a41.f26407b);
        int i10 = 0;
        FrameLayout frameLayout = this.F;
        frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, k10));
        if (k10 <= 0.0f) {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        e();
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.f27738w;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, mode);
        org.telegram.ui.ActionBar.f7.t(this.f27739x, i11, u6Var, mode);
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
        i();
    }

    public final void p() {
        g(true);
        s31 s31Var = this.f27737s;
        boolean canScrollHorizontally = s31Var.canScrollHorizontally(-1);
        s31Var.f32150g3.O(true);
        if (!canScrollHorizontally) {
            s31Var.v0(0);
        }
        u31 u31Var = this.G;
        boolean canScrollVertically = u31Var.canScrollVertically(-1);
        u31Var.f32150g3.O(true);
        if (!canScrollVertically) {
            u31Var.v0(0);
        }
        AndroidUtilities.runOnUIThread(new n31(this, 1));
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.f27733g0 != z10) {
            this.f27733g0 = z10;
            g(true);
        }
    }

    public void setCurrentTopic(long j10) {
        boolean z10;
        this.f27726b0 = j10;
        s31 s31Var = this.f27737s;
        s31Var.f32150g3.O(true);
        s31Var.invalidate();
        this.G.f32150g3.O(true);
        d41 d41Var = this.v;
        if (d41Var != null) {
            if (j10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            d41Var.c(true, false, z10);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.f27732f0 = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.f27730e0 = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.f27729d0 = callback2;
    }

    public void setSideMenuBackgroundDrawable(eh.d dVar) {
        this.K = dVar;
        dVar.x(AndroidUtilities.dp(16.0f));
        this.K.w(AndroidUtilities.dp(7.0f));
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

    public void setTopMenuBackgroundDrawable(eh.d dVar) {
        this.L = dVar;
        dVar.x(AndroidUtilities.dp(18.0f));
        this.L.w(AndroidUtilities.dp(7.0f));
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
    public final void z(float f7, int i10) {
    }
}
