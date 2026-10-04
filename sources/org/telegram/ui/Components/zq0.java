package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public class zq0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int W0 = 0;
    public boolean A0;
    public o1.k B0;
    public TLRPC.Dialog C0;
    public final kq0 D0;
    public final zl0 E;
    public ArrayList E0;
    public final aq0 F;
    public TL_stories.StoryItem F0;
    public final aq0 G;
    public i0.b G0;
    public final s4.s H;
    public int H0;
    public final s4.s I;
    public boolean I0;
    public final rz J;
    public org.telegram.ui.ActionBar.n1 J0;
    public final rq0 K;
    public int K0;
    public final wq0 L;
    public boolean L0;
    public final vq0 M;
    public boolean M0;
    public final ArrayList N;
    public int N0;
    public final String[] O;
    public final ah.i O0;
    public final int P;
    public final ah.c P0;
    public final tx0 Q;
    public final ah.c Q0;
    public final Drawable R;
    public final ah.c R0;
    public final View[] S;
    public final mh S0;
    public final AnimatorSet[] T;
    public final ch.d T0;
    public final a0.i U;
    public final ah.e U0;
    public final HashMap V;
    public final ch.d V0;
    public final lq0 W;
    public int X;
    public boolean Y;
    public final boolean Z;
    public boolean f33596a0;
    public final FrameLayout f33597b;
    public final int f33598b0;
    public final dq0 f33599c;
    public final FrameLayout f33600c0;
    public final eq0 d;
    public final LinearLayout f33601d0;
    public final ii.z1 f33602e;
    public final qp f33603e0;
    public final dq0 f33604f;
    public final org.telegram.ui.yn f33605f0;
    public final Activity f33606g0;
    public final FrameLayout h;
    public final boolean f33607h0;
    public boolean f33608i0;
    public final TextPaint f33609j0;
    public TLRPC.TL_exportedMessageLink f33610k0;
    public boolean f33611l0;
    public boolean m0;
    public final ci.ab f33612n;
    public final boolean f33613n0;
    public final String[] f33614o0;
    public int f33615p0;
    public int f33616q0;
    public final FrameLayout f33617r;
    public boolean f33618r0;
    public final org.telegram.ui.ActionBar.i5 f33619s;
    public oq0 f33620s0;
    public float f33621t0;
    public float f33622u0;
    public final FrameLayout v;
    public float f33623v0;
    public final FrameLayout f33624w;
    public ValueAnimator f33625w0;
    public final LinearLayout f33626x;
    public final dl0 f33627x0;
    public AnimatorSet f33628y;
    public final f20 f33629y0;
    public final org.telegram.ui.ActionBar.k f33630z0;

    public zq0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, d6Var);
    }

    public static zq0 K0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        ArrayList arrayList;
        if (messageObject != null) {
            arrayList = org.telegram.messenger.f0.k(messageObject);
        } else {
            arrayList = null;
        }
        return new zq0(context, arrayList, str, null, z10, str2, null, false);
    }

    public static void k0(zq0 zq0Var) {
        aq0 aq0Var;
        int i10;
        int i11;
        aq0 aq0Var2 = zq0Var.F;
        aq0 aq0Var3 = zq0Var.G;
        zl0 zl0Var = zq0Var.E;
        if (!zq0Var.f33618r0) {
            if (zq0Var.L0) {
                aq0Var = aq0Var3;
            } else {
                aq0Var = aq0Var2;
            }
            if (aq0Var.getChildCount() > 0) {
                View childAt = aq0Var.getChildAt(0);
                for (int i12 = 0; i12 < aq0Var.getChildCount(); i12++) {
                    if (aq0Var.getChildAt(i12).getTop() < childAt.getTop()) {
                        childAt = aq0Var.getChildAt(i12);
                    }
                }
                il0 il0Var = (il0) aq0Var.G(childAt);
                int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
                if (top > 0 && il0Var != null && il0Var.b() == 0) {
                    i10 = top;
                } else {
                    i10 = 0;
                }
                if (top >= 0 && il0Var != null && il0Var.b() == 0) {
                    zq0Var.K0 = childAt.getTop();
                    zq0Var.Q0(false);
                } else {
                    zq0Var.K0 = Integer.MAX_VALUE;
                    zq0Var.Q0(true);
                    top = i10;
                }
                if (zl0Var.getVisibility() == 0) {
                    if (zl0Var.getChildCount() > 0) {
                        View childAt2 = zl0Var.getChildAt(0);
                        for (int i13 = 0; i13 < zl0Var.getChildCount(); i13++) {
                            if (zl0Var.getChildAt(i13).getTop() < childAt2.getTop()) {
                                childAt2 = zl0Var.getChildAt(i13);
                            }
                        }
                        il0 il0Var2 = (il0) zl0Var.G(childAt2);
                        int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
                        if (top2 > 0 && il0Var2 != null && il0Var2.b() == 0) {
                            i11 = top2;
                        } else {
                            i11 = 0;
                        }
                        if (top2 >= 0 && il0Var2 != null && il0Var2.b() == 0) {
                            zq0Var.K0 = childAt2.getTop();
                            zq0Var.Q0(false);
                        } else {
                            zq0Var.K0 = Integer.MAX_VALUE;
                            zq0Var.Q0(true);
                            top2 = i11;
                        }
                        top = AndroidUtilities.lerp(top, top2, zl0Var.getAlpha());
                    } else {
                        return;
                    }
                }
                int i14 = zq0Var.f33615p0;
                if (i14 != top) {
                    zq0Var.f33616q0 = i14;
                    float f7 = top;
                    int i15 = (int) (zq0Var.f33621t0 + f7);
                    zq0Var.f33615p0 = i15;
                    aq0Var2.setTopGlowOffset(i15);
                    int i16 = (int) (zq0Var.f33621t0 + f7);
                    zq0Var.f33615p0 = i16;
                    aq0Var3.setTopGlowOffset(i16);
                    int i17 = (int) (f7 + zq0Var.f33621t0);
                    zq0Var.f33615p0 = i17;
                    zl0Var.setTopGlowOffset(i17);
                    zq0Var.f33597b.setTranslationY(zq0Var.f33615p0 + zq0Var.f33621t0);
                    zq0Var.Q.setTranslationY(zq0Var.f33615p0 + zq0Var.f33621t0);
                    zq0Var.containerView.invalidate();
                }
            }
        }
    }

    public static void m(zq0 zq0Var, int i10) {
        ah.i iVar = zq0Var.O0;
        if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
            if (w7.e0.a(i10, 4)) {
                iVar.h(zq0Var.glassEngine.e());
            }
            iVar.e(zq0Var.S0, zq0Var.containerView.getWidth(), zq0Var.containerView.getHeight());
        }
    }

    public static void n(zq0 zq0Var, Canvas canvas, RectF rectF) {
        aq0 aq0Var = zq0Var.F;
        gh.d.a(aq0Var, canvas, rectF, aq0Var, zq0Var.containerView);
    }

    public static void o(zq0 zq0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
        int i11;
        int i12;
        boolean z11;
        Long l4;
        long j3;
        char c10;
        MessageObject messageObject;
        long j10;
        long longValue;
        String charSequence;
        long longValue2;
        Long l10;
        int i13;
        long j11;
        String[] strArr;
        MessageObject messageObject2;
        SendMessagesHelper.SendMessageParams of2;
        long longValue3;
        String charSequence2;
        ArrayList arrayList2;
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.TL_forumTopic tL_forumTopic2;
        Long l11;
        dq0 dq0Var;
        long j12;
        long j13;
        Long l12;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue4;
        String charSequence3;
        long longValue5;
        String[] strArr2 = zq0Var.O;
        eq0 eq0Var = zq0Var.d;
        dq0 dq0Var2 = zq0Var.f33599c;
        HashMap hashMap2 = zq0Var.V;
        Long l13 = 0L;
        a0.i iVar = zq0Var.U;
        ArrayList arrayList3 = zq0Var.N;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i14 = 0;
            boolean z12 = false;
            while (true) {
                if (i14 < iVar.m()) {
                    long j14 = iVar.j(i14);
                    boolean isMonoForum = MessagesController.getInstance(zq0Var.currentAccount).isMonoForum(j14);
                    if (hashMap == null) {
                        l11 = l13;
                    } else {
                        l11 = (Long) hashMap.get(Long.valueOf(j14));
                    }
                    if (l11 != null && l11.longValue() > 0) {
                        z12 = true;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap2.get(iVar.f(j14));
                    if (tL_forumTopic3 != null && isMonoForum) {
                        dq0Var = dq0Var2;
                        j12 = j14;
                        j13 = DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    } else {
                        dq0Var = dq0Var2;
                        j12 = j14;
                        j13 = 0;
                    }
                    if (tL_forumTopic3 != null && !isMonoForum) {
                        l12 = l13;
                        messageObject3 = new MessageObject(zq0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    } else {
                        l12 = l13;
                        messageObject3 = null;
                    }
                    if (messageObject3 != null) {
                        messageObject3.isTopicMainMessage = true;
                    }
                    if (dq0Var.getTag() != null && eq0Var.f28705a.length() > 0) {
                        CharSequence charSequence4 = charSequenceArr[0];
                        if (charSequence4 == null) {
                            charSequence3 = null;
                        } else {
                            charSequence3 = charSequence4.toString();
                        }
                        MessageObject messageObject5 = messageObject3;
                        SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(charSequence3, j12, messageObject5, messageObject3, null, true, arrayList, null, null, z10, 0, 0, null, false);
                        messageObject4 = messageObject5;
                        if (l11 == null) {
                            arrayList2 = arrayList3;
                            longValue5 = 0;
                        } else {
                            arrayList2 = arrayList3;
                            longValue5 = l11.longValue();
                        }
                        of3.payStars = longValue5;
                        of3.monoForumPeer = j13;
                        SendMessagesHelper.getInstance(zq0Var.currentAccount).sendMessage(of3);
                    } else {
                        messageObject4 = messageObject3;
                        arrayList2 = arrayList3;
                    }
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(zq0Var.currentAccount);
                    ArrayList<MessageObject> arrayList5 = zq0Var.N;
                    boolean z13 = !zq0Var.I0;
                    if (l11 == null) {
                        longValue4 = 0;
                    } else {
                        longValue4 = l11.longValue();
                    }
                    long j15 = j12;
                    int sendMessage = sendMessagesHelper.sendMessage(arrayList5, j15, z13, false, z10, 0, 0, messageObject4, i10, longValue4, j13, null);
                    if (sendMessage != 0) {
                        arrayList4.add(Long.valueOf(j15));
                    }
                    if (iVar.m() == 1) {
                        tL_forumTopic = null;
                        e5.t0(sendMessage, zq0Var.f33605f0, null);
                        if (sendMessage != 0) {
                            break;
                        }
                    }
                    i14++;
                    arrayList3 = arrayList2;
                    dq0Var2 = dq0Var;
                    l13 = l12;
                } else {
                    arrayList2 = arrayList3;
                    tL_forumTopic = null;
                    break;
                }
            }
            int size = arrayList4.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList4.get(i15);
                i15++;
                long longValue6 = ((Long) obj).longValue();
                TLRPC.Dialog dialog = (TLRPC.Dialog) iVar.f(longValue6);
                iVar.l(longValue6);
                if (dialog != null) {
                    hashMap2.remove(dialog);
                }
            }
            if (!iVar.i()) {
                int size2 = arrayList2.size();
                if (iVar.m() == 1) {
                    tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(0));
                } else {
                    tL_forumTopic2 = tL_forumTopic;
                }
                zq0Var.O0(iVar, size2, tL_forumTopic2, !z12);
            }
        } else {
            lq0 lq0Var = zq0Var.W;
            if (lq0Var != null) {
                i11 = lq0Var.d;
            } else {
                i11 = 0;
            }
            if (zq0Var.F0 != null) {
                int i16 = 0;
                boolean z14 = false;
                while (i16 < iVar.m()) {
                    long j16 = iVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(zq0Var.currentAccount).isMonoForum(j16);
                    if (hashMap == null) {
                        l10 = l13;
                    } else {
                        l10 = (Long) hashMap.get(Long.valueOf(j16));
                    }
                    if (l10 != null && l10.longValue() > 0) {
                        z14 = true;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap2.get(iVar.f(j16));
                    if (tL_forumTopic4 != null && isMonoForum2) {
                        i13 = i11;
                        j11 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                    } else {
                        i13 = i11;
                        j11 = 0;
                    }
                    if (tL_forumTopic4 != null && !isMonoForum2) {
                        strArr = strArr2;
                        messageObject2 = new MessageObject(zq0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                    } else {
                        strArr = strArr2;
                        messageObject2 = null;
                    }
                    if (zq0Var.F0 == null) {
                        if (dq0Var2.getTag() != null && eq0Var.f28705a.length() > 0) {
                            CharSequence charSequence5 = charSequenceArr[0];
                            if (charSequence5 == null) {
                                charSequence2 = null;
                            } else {
                                charSequence2 = charSequence5.toString();
                            }
                            of2 = SendMessagesHelper.SendMessageParams.of(charSequence2, j16, messageObject2, messageObject2, null, true, arrayList, null, null, z10, 0, 0, null, false);
                        } else {
                            of2 = SendMessagesHelper.SendMessageParams.of(strArr[i13], j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        }
                    } else {
                        if (dq0Var2.getTag() != null && eq0Var.f28705a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(zq0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j16, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = zq0Var.F0;
                    }
                    if (l10 == null) {
                        longValue3 = 0;
                    } else {
                        longValue3 = l10.longValue();
                    }
                    of2.payStars = longValue3;
                    of2.monoForumPeer = j11;
                    SendMessagesHelper.getInstance(zq0Var.currentAccount).sendMessage(of2);
                    i16++;
                    i11 = i13;
                    strArr2 = strArr;
                }
                z11 = z14;
            } else {
                int i17 = i11;
                if (strArr2[i17] != null) {
                    boolean z15 = false;
                    for (int i18 = 0; i18 < iVar.m(); i18++) {
                        long j17 = iVar.j(i18);
                        boolean isMonoForum3 = MessagesController.getInstance(zq0Var.currentAccount).isMonoForum(j17);
                        if (hashMap == null) {
                            l4 = l13;
                        } else {
                            l4 = (Long) hashMap.get(Long.valueOf(j17));
                        }
                        if (l4 != null && l4.longValue() > 0) {
                            z15 = true;
                        }
                        TLRPC.TL_forumTopic tL_forumTopic5 = (TLRPC.TL_forumTopic) hashMap2.get(iVar.f(j17));
                        if (tL_forumTopic5 != null && isMonoForum3) {
                            j3 = DialogObject.getPeerDialogId(tL_forumTopic5.from_id);
                        } else {
                            j3 = 0;
                        }
                        if (tL_forumTopic5 != null && !isMonoForum3) {
                            c10 = 0;
                            messageObject = new MessageObject(zq0Var.currentAccount, tL_forumTopic5.topicStartMessage, false, false);
                        } else {
                            c10 = 0;
                            messageObject = null;
                        }
                        if (dq0Var2.getTag() != null && eq0Var.f28705a.length() > 0) {
                            CharSequence charSequence6 = charSequenceArr[c10];
                            if (charSequence6 == null) {
                                charSequence = null;
                            } else {
                                charSequence = charSequence6.toString();
                            }
                            SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(charSequence, j17, messageObject, messageObject, null, true, arrayList, null, null, z10, 0, 0, null, false);
                            j10 = j17;
                            if (l4 == null) {
                                longValue2 = 0;
                            } else {
                                longValue2 = l4.longValue();
                            }
                            of4.payStars = longValue2;
                            of4.monoForumPeer = j3;
                            SendMessagesHelper.getInstance(zq0Var.currentAccount).sendMessage(of4);
                        } else {
                            j10 = j17;
                        }
                        SendMessagesHelper.SendMessageParams of5 = SendMessagesHelper.SendMessageParams.of(strArr2[i17], j10, messageObject, messageObject, null, true, null, null, null, z10, 0, 0, null, false);
                        if (l4 == null) {
                            longValue = 0;
                        } else {
                            longValue = l4.longValue();
                        }
                        of5.payStars = longValue;
                        of5.monoForumPeer = j3;
                        SendMessagesHelper.getInstance(zq0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z15;
                } else {
                    i12 = 0;
                    z11 = false;
                    zq0Var.O0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i12)), !z11);
                }
            }
            i12 = 0;
            zq0Var.O0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i12)), !z11);
        }
        oq0 oq0Var = zq0Var.f33620s0;
        if (oq0Var != null) {
            oq0Var.V();
        }
        zq0Var.dismiss();
    }

    public static void p(zq0 zq0Var, int i10) {
        TLRPC.Dialog dialog;
        f20 f20Var = zq0Var.f33629y0;
        HashMap hashMap = zq0Var.V;
        a0.i iVar = zq0Var.U;
        rq0 rq0Var = zq0Var.K;
        wq0 wq0Var = zq0Var.L;
        if (wq0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = zq0Var.C0;
            if (dialog2 != null) {
                iVar.k(dialog2, dialog2.f20042id);
                hashMap.remove(dialog2);
                zq0Var.X0(2);
                if (zq0Var.L0 || zq0Var.M0) {
                    if (((TLRPC.Dialog) rq0Var.f30491e.f(dialog2.f20042id)) == null) {
                        rq0Var.f30491e.k(dialog2, dialog2.f20042id);
                        ArrayList arrayList = rq0Var.d;
                        arrayList.add(!arrayList.isEmpty(), dialog2);
                    }
                    rq0Var.l();
                    zq0Var.A0 = false;
                    f20Var.f26247r.setText("");
                    zq0Var.H0(false);
                }
                for (int i11 = 0; i11 < zq0Var.M0().getChildCount(); i11++) {
                    View childAt = zq0Var.M0().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.g7) {
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                        if (g7Var.getCurrentDialog() == zq0Var.C0.f20042id) {
                            g7Var.d(null, false, true);
                            g7Var.b(true, true);
                        }
                    }
                }
                zq0Var.I0();
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic E = wq0Var.E(i10);
        if (E != null && (dialog = zq0Var.C0) != null) {
            long j3 = dialog.f20042id;
            boolean isMonoForum = MessagesController.getInstance(zq0Var.currentAccount).isMonoForum(j3);
            TLRPC.Dialog dialog3 = zq0Var.C0;
            iVar.k(dialog3, j3);
            hashMap.put(dialog3, E);
            zq0Var.X0(2);
            if (zq0Var.L0 || zq0Var.M0) {
                if (((TLRPC.Dialog) rq0Var.f30491e.f(dialog3.f20042id)) == null) {
                    rq0Var.f30491e.k(dialog3, dialog3.f20042id);
                    ArrayList arrayList2 = rq0Var.d;
                    arrayList2.add(!arrayList2.isEmpty(), dialog3);
                }
                rq0Var.l();
                zq0Var.A0 = false;
                f20Var.f26247r.setText("");
                zq0Var.H0(false);
            }
            for (int i12 = 0; i12 < zq0Var.M0().getChildCount(); i12++) {
                View childAt2 = zq0Var.M0().getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) childAt2;
                    if (g7Var2.getCurrentDialog() == zq0Var.C0.f20042id) {
                        g7Var2.d(E, isMonoForum, true);
                        g7Var2.b(true, true);
                    }
                }
            }
            zq0Var.I0();
        }
    }

    public static boolean q(final zq0 zq0Var) {
        int measuredHeight;
        org.telegram.ui.yn ynVar;
        ii.z1 z1Var = zq0Var.f33602e;
        boolean z10 = zq0Var.f33607h0;
        Activity activity = zq0Var.f33606g0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(zq0Var.getContext());
        linearLayout.setOrientation(1);
        if (zq0Var.N != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, zq0Var.resourcesProvider);
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20863fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new hq0(zq0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new up0(zq0Var, 2));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, zq0Var.getContext(), zq0Var.resourcesProvider, true, false);
            if (z10) {
                f1Var.setTextColor(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21011ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var, w7.z5.n(-1, 48));
            f1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            zq0Var.I0 = true;
            f1Var.setChecked(true);
            final org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(1, zq0Var.getContext(), zq0Var.resourcesProvider, false, true);
            if (z10) {
                f1Var2.setTextColor(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21011ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, w7.z5.n(-1, 48));
            f1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            f1Var2.setChecked(!zq0Var.I0);
            f1Var.setOnClickListener(new View.OnClickListener(zq0Var) {
                public final zq0 f32957b;

                {
                    this.f32957b = zq0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            zq0 zq0Var2 = this.f32957b;
                            zq0Var2.I0 = true;
                            f1Var.setChecked(true);
                            f1Var2.setChecked(!zq0Var2.I0);
                            return;
                        default:
                            zq0 zq0Var3 = this.f32957b;
                            zq0Var3.I0 = false;
                            f1Var.setChecked(false);
                            f1Var2.setChecked(!zq0Var3.I0);
                            return;
                    }
                }
            });
            f1Var2.setOnClickListener(new View.OnClickListener(zq0Var) {
                public final zq0 f32957b;

                {
                    this.f32957b = zq0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            zq0 zq0Var2 = this.f32957b;
                            zq0Var2.I0 = true;
                            f1Var.setChecked(true);
                            f1Var2.setChecked(!zq0Var2.I0);
                            return;
                        default:
                            zq0 zq0Var3 = this.f32957b;
                            zq0Var3.I0 = false;
                            f1Var.setChecked(false);
                            f1Var2.setChecked(!zq0Var3.I0);
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.z5.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, zq0Var.resourcesProvider);
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20863fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new hq0(zq0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new up0(zq0Var, 3));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, zq0Var.getContext(), zq0Var.resourcesProvider, true, true);
        if (z10) {
            f1Var3.setTextColor(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21011ng));
            f1Var3.setIconColor(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.H6));
        }
        f1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        f1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(f1Var3, w7.z5.n(-1, 48));
        f1Var3.setOnClickListener(new tp0(zq0Var, 2));
        org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(0, zq0Var.getContext(), zq0Var.resourcesProvider, true, true);
        if (z10) {
            f1Var4.setTextColor(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21011ng));
            f1Var4.setIconColor(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.H6));
        }
        f1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        f1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(f1Var4, w7.z5.n(-1, 48));
        f1Var4.setOnClickListener(new tp0(zq0Var, 3));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.z5.n(-1, -2));
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(linearLayout, -2, -2);
        zq0Var.J0 = n1Var;
        n1Var.f21407b = false;
        n1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        zq0Var.J0.setOutsideTouchable(true);
        zq0Var.J0.setClippingEnabled(true);
        zq0Var.J0.setInputMethodMode(2);
        zq0Var.J0.setSoftInputMode(0);
        zq0Var.J0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        zq0Var.J0.setFocusable(true);
        int[] iArr = new int[2];
        z1Var.getLocationInWindow(iArr);
        if (zq0Var.keyboardVisible && (ynVar = zq0Var.f33605f0) != null && ynVar.V0.getMeasuredHeight() > AndroidUtilities.dp(58.0f)) {
            measuredHeight = z1Var.getMeasuredHeight() + iArr[1];
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
        }
        zq0Var.J0.showAtLocation(z1Var, 51, AndroidUtilities.dp(8.0f) + ((z1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
        zq0Var.J0.b();
        try {
            z1Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void r(zq0 zq0Var, AtomicReference atomicReference, gq0 gq0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        gq0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, zq0Var.currentAccount, Long.valueOf(-dialog.f20042id));
    }

    public static int s0(zq0 zq0Var) {
        aq0 aq0Var = zq0Var.F;
        if (aq0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = aq0Var.getChildAt(0);
            il0 il0Var = (il0) aq0Var.G(childAt);
            if (il0Var != null) {
                int paddingTop = aq0Var.getPaddingTop();
                if (il0Var.c() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    public final void H0(boolean z10) {
        f20 f20Var = this.f33629y0;
        ci.h2 h2Var = f20Var.f26247r;
        ci.h2 h2Var2 = f20Var.f26247r;
        boolean isEmpty = TextUtils.isEmpty(h2Var.getText());
        aq0 aq0Var = this.F;
        aq0 aq0Var2 = this.G;
        boolean z11 = true;
        if (isEmpty && ((!this.keyboardVisible || !h2Var2.hasFocus()) && !this.M0)) {
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(aq0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(aq0Var2, false);
            }
            z11 = false;
        } else {
            this.A0 = true;
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(aq0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(aq0Var2, true);
            }
        }
        if (this.L0 == z11 && !z10) {
            return;
        }
        this.L0 = z11;
        vq0 vq0Var = this.M;
        vq0Var.l();
        this.K.l();
        if (this.L0) {
            if (this.K0 == Integer.MAX_VALUE) {
                ((s4.c0) aq0Var2.getLayoutManager()).h1(0, -aq0Var2.getPaddingTop());
            } else {
                ((s4.c0) aq0Var2.getLayoutManager()).h1(0, this.K0 - aq0Var2.getPaddingTop());
            }
            vq0Var.E(h2Var2.getText().toString());
            return;
        }
        int i10 = this.K0;
        s4.s sVar = this.H;
        if (i10 == Integer.MAX_VALUE) {
            sVar.h1(0, 0);
        } else {
            sVar.h1(0, 0);
        }
    }

    public final void I0() {
        float f7;
        TLRPC.Dialog dialog = this.C0;
        if (dialog != null) {
            org.telegram.ui.Cells.g7 g7Var = null;
            this.C0 = null;
            for (int i10 = 0; i10 < M0().getChildCount(); i10++) {
                View childAt = M0().getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.g7) && ((org.telegram.ui.Cells.g7) childAt).getCurrentDialog() == dialog.f20042id) {
                    g7Var = childAt;
                }
            }
            if (g7Var == null) {
                return;
            }
            o1.k kVar = this.B0;
            if (kVar != null) {
                kVar.c();
            }
            M0().setVisibility(0);
            f20 f20Var = this.f33629y0;
            f20Var.setVisibility(0);
            ci.h2 h2Var = f20Var.f26247r;
            if (this.L0 || this.M0) {
                this.D0.H.v = true;
                h2Var.requestFocus();
                AndroidUtilities.showKeyboard(h2Var);
            }
            int[] iArr = new int[2];
            o1.k kVar2 = new o1.k(new o1.j(1000.0f));
            o1.l lVar = new o1.l(0.0f);
            org.telegram.ui.yn ynVar = this.f33605f0;
            if (ynVar != null && ynVar.f43275b) {
                f7 = 10.0f;
            } else {
                f7 = 800.0f;
            }
            lVar.b(f7);
            lVar.a(1.0f);
            kVar2.f16984u = lVar;
            this.B0 = kVar2;
            kVar2.b(new sp0(this, g7Var, iArr, 0));
            this.B0.a(new ib(this, 4));
            this.B0.f();
        }
    }

    public final void J0() {
        boolean z10 = false;
        if (this.f33610k0 != null || this.f33614o0[0] != null) {
            try {
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", L0()));
                oq0 oq0Var = this.f33620s0;
                if (oq0Var != null) {
                    oq0Var.x0();
                } else if (this.f33606g0 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f33610k0;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z10 = true;
                    }
                    ((LaunchActivity) this.f33606g0).D0(new i2.y(5, z10));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final String L0() {
        String str;
        String str2;
        String[] strArr = this.f33614o0;
        lq0 lq0Var = this.W;
        if (lq0Var != null) {
            str2 = strArr[lq0Var.d];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f33610k0;
            if (tL_exportedMessageLink != null) {
                str = tL_exportedMessageLink.link;
            } else {
                str = null;
            }
            if (str == null) {
                str2 = strArr[0];
            } else {
                str2 = str;
            }
        }
        qp qpVar = this.f33603e0;
        if (qpVar != null && qpVar.f30141a.f24094q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.f33598b0)).build().toString();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final zl0 M0() {
        if (!this.L0 && !this.M0) {
            return this.F;
        }
        return this.G;
    }

    public final void N0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        zl0 zl0Var = this.E;
        zl0Var.setPivotX(width);
        zl0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        zl0Var.setScaleX(f11);
        zl0Var.setScaleY(f11);
        zl0Var.setAlpha(f7);
        zl0 M0 = M0();
        M0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        M0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        M0.setScaleX(f12);
        M0.setScaleY(f12);
        float f13 = 1.0f - f7;
        M0.setAlpha(f13);
        f20 f20Var = this.f33629y0;
        f20Var.setPivotX(f20Var.getWidth() / 2.0f);
        f20Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        f20Var.setScaleX(f14);
        f20Var.setScaleY(f14);
        f20Var.setAlpha(f13);
        org.telegram.ui.ActionBar.k kVar = this.f33630z0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.setAlpha(f7);
        zl0Var.getLocationInWindow(iArr);
        float interpolation = tr.f31142g.getInterpolation(f7);
        for (int i10 = 0; i10 < M0.getChildCount(); i10++) {
            View childAt = M0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.g7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f7, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f13);
                }
            }
        }
        for (int i11 = 0; i11 < zl0Var.getChildCount(); i11++) {
            View childAt2 = zl0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.h7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y3 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((zl0Var.getTranslationY() + y3) - view.getY()))));
            }
        }
        this.containerView.requestLayout();
        M0.invalidate();
    }

    public final void Q0(boolean z10) {
        Integer num;
        float f7;
        View[] viewArr = this.S;
        if ((z10 && viewArr[0].getTag() != null) || (!z10 && viewArr[0].getTag() == null)) {
            View view = viewArr[0];
            if (z10) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            if (z10) {
                viewArr[0].setVisibility(0);
            }
            AnimatorSet[] animatorSetArr = this.T;
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            View view2 = viewArr[0];
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f7));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].addListener(new iq0(this, z10, 0));
            animatorSetArr[0].start();
        }
    }

    public final void R0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        zq0 zq0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        uq0 uq0Var;
        if (dialog instanceof qq0) {
            P0(view);
        } else if (((view instanceof org.telegram.ui.Cells.g7) && ((org.telegram.ui.Cells.g7) view).F) || ((view instanceof org.telegram.ui.Cells.i6) && ((org.telegram.ui.Cells.i6) view).f22258n0)) {
            U0(dialog.f20042id, view);
        } else {
            zl0 zl0Var = this.E;
            if (zl0Var.getVisibility() == 8 && (activity = this.f33606g0) != null) {
                boolean isChatDialog = DialogObject.isChatDialog(dialog.f20042id);
                int i10 = this.P;
                if (isChatDialog) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f20042id));
                    if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.f20042id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        String string = LocaleController.getString(R.string.SendMessageTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20368a;
                        b2Var.R = string;
                        if (i10 == 3) {
                            if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                            } else {
                                b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                            }
                        } else if (i10 == 2) {
                            if (this.f33613n0) {
                                b2Var.T = LocaleController.getString(R.string.PublicPollCantForward);
                            } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                            } else {
                                b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                            }
                        } else {
                            b2Var.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        hg.k0.o(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                } else if (DialogObject.isEncryptedDialog(dialog.f20042id) && i10 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String string2 = LocaleController.getString(R.string.SendMessageTitle);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20368a;
                    b2Var2.R = string2;
                    if (i10 == 3) {
                        b2Var2.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i10 != 0) {
                        b2Var2.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        b2Var2.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    hg.k0.o(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
                long j3 = dialog.f20042id;
                a0.i iVar = this.U;
                if (iVar.h(j3) >= 0) {
                    iVar.l(dialog.f20042id);
                    this.V.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.i6) {
                        ((org.telegram.ui.Cells.i6) view).s(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).b(false, true);
                    }
                    X0(1);
                    zq0Var = this;
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.f20042id));
                    TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f20042id));
                    if ((!UserObject.isBotForum(user) || (((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f20185id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f20185id))) && (!DialogObject.isChatDialog(dialog.f20042id) || (!ChatObject.isForum(chat2) && (!ChatObject.isMonoForum(chat2) || !ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                        zq0Var = this;
                        iVar.k(dialog, dialog.f20042id);
                        if (view instanceof org.telegram.ui.Cells.i6) {
                            ((org.telegram.ui.Cells.i6) view).s(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.g7) {
                            ((org.telegram.ui.Cells.g7) view).b(true, true);
                        }
                        X0(2);
                        long j10 = UserConfig.getInstance(zq0Var.currentAccount).clientUserId;
                        if (zq0Var.L0) {
                            rq0 rq0Var = zq0Var.K;
                            a0.i iVar2 = rq0Var.f30491e;
                            ArrayList arrayList = rq0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) iVar2.f(dialog.f20042id);
                            if (dialog2 == null) {
                                rq0Var.f30491e.k(dialog, dialog.f20042id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f20042id != j10) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            rq0Var.l();
                            zq0Var.A0 = false;
                            f20 f20Var = zq0Var.f33629y0;
                            f20Var.f26247r.setText("");
                            H0(false);
                            AndroidUtilities.hideKeyboard(f20Var.f26247r);
                        }
                    } else {
                        this.C0 = dialog;
                        this.I.h1(0, this.f33615p0 - zl0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        gq0 gq0Var = new gq0(this, dialog, atomicReference, view);
                        atomicReference.set(new bo0(this, atomicReference, gq0Var, dialog, 1));
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                        int i11 = NotificationCenter.topicsDidLoaded;
                        notificationCenter.addObserver(gq0Var, i11);
                        if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.f20042id) != null) {
                            gq0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.f20042id));
                            return;
                        }
                        MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.f20042id);
                        AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                vq0 vq0Var = zq0Var.M;
                if (vq0Var != null && (uq0Var = vq0Var.H) != null) {
                    uq0Var.q(0, uq0Var.h());
                }
            }
        }
    }

    public final void S0(final boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (true) {
            a0.i iVar = this.U;
            int m10 = iVar.m();
            dq0 dq0Var = this.f33599c;
            eq0 eq0Var = this.d;
            boolean z11 = true;
            if (i13 < m10) {
                if (e5.h(getContext(), this.currentAccount, iVar.j(i13), (dq0Var.getTag() == null || eq0Var.f28705a.length() <= 0) ? false : false)) {
                    return;
                }
                i13++;
            } else {
                Editable text = eq0Var.getText();
                hu huVar = eq0Var.f28705a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                qp qpVar = this.f33603e0;
                if (qpVar != null && qpVar.f30141a.f24094q) {
                    i10 = this.f33598b0;
                } else {
                    i10 = -1;
                }
                ArrayList arrayList = new ArrayList();
                if (this.N != null) {
                    i12 = 0;
                    for (int i14 = 0; i14 < iVar.m(); i14++) {
                        long j3 = iVar.j(i14);
                        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j3);
                        if (sendPaidMessagesStars <= 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j3));
                        }
                        if (dq0Var.getTag() != null && huVar.length() > 0 && sendPaidMessagesStars > 0) {
                            i12++;
                        }
                        int i15 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
                        if (i15 > 0) {
                            i12++;
                        }
                        if (i15 > 0 && !arrayList.contains(Long.valueOf(j3))) {
                            arrayList.add(Long.valueOf(j3));
                        }
                    }
                } else {
                    lq0 lq0Var = this.W;
                    if (lq0Var != null) {
                        i11 = lq0Var.d;
                    } else {
                        i11 = 0;
                    }
                    if (this.F0 != null) {
                        int i16 = 0;
                        for (int i17 = 0; i17 < iVar.m(); i17++) {
                            long j10 = iVar.j(i17);
                            long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j10);
                            if (sendPaidMessagesStars2 <= 0) {
                                sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j10));
                            }
                            if (this.F0 != null && dq0Var.getTag() != null && huVar.length() > 0 && charSequenceArr[0] != null && sendPaidMessagesStars2 > 0) {
                                i16++;
                            }
                            int i18 = (sendPaidMessagesStars2 > 0L ? 1 : (sendPaidMessagesStars2 == 0L ? 0 : -1));
                            if (i18 > 0) {
                                i16++;
                            }
                            if (i18 > 0 && !arrayList.contains(Long.valueOf(j10))) {
                                arrayList.add(Long.valueOf(j10));
                            }
                        }
                        i12 = i16;
                    } else {
                        int i19 = 0;
                        if (this.O[i11] != null) {
                            for (int i20 = 0; i20 < iVar.m(); i20++) {
                                long j11 = iVar.j(i20);
                                long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
                                if (sendPaidMessagesStars3 <= 0) {
                                    sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
                                }
                                if (dq0Var.getTag() != null && huVar.length() > 0 && sendPaidMessagesStars3 > 0) {
                                    i19++;
                                }
                                int i21 = (sendPaidMessagesStars3 > 0L ? 1 : (sendPaidMessagesStars3 == 0L ? 0 : -1));
                                if (i21 > 0) {
                                    i19++;
                                }
                                if (i21 > 0 && !arrayList.contains(Long.valueOf(j11))) {
                                    arrayList.add(Long.valueOf(j11));
                                }
                            }
                            i12 = i19;
                        } else {
                            i12 = 0;
                        }
                    }
                }
                final int i22 = i10;
                e5.c0(this.currentAccount, arrayList, i12, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        zq0.o(zq0.this, charSequenceArr, entities, z10, i22, (HashMap) obj);
                    }
                });
                return;
            }
        }
    }

    public final void T0(boolean z10) {
        boolean z11;
        Integer num;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        dq0 dq0Var = this.f33599c;
        if (dq0Var.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.f33628y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        dq0Var.setTag(num);
        eq0 eq0Var = this.d;
        if (eq0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(eq0Var.getEditText());
        }
        eq0Var.k(true);
        FrameLayout frameLayout = this.f33600c0;
        dq0 dq0Var2 = this.f33604f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            dq0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            dq0Var2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        int i11 = 4;
        if (frameLayout2 != null) {
            if (z10) {
                i10 = 4;
            } else {
                i10 = 1;
            }
            WeakHashMap weakHashMap = r0.i0.f45596a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.f33626x;
        if (linearLayout != null) {
            if (!z10) {
                i11 = 1;
            }
            WeakHashMap weakHashMap2 = r0.i0.f45596a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.f33628y = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f14 = 0.0f;
        float f15 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(dq0Var, property, f7));
        if (frameLayout != null && frameLayout2 == null) {
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, property, f13));
        }
        Property property2 = View.SCALE_X;
        float f16 = 0.2f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        arrayList.add(ObjectAnimator.ofFloat(dq0Var2, property2, f10));
        Property property3 = View.SCALE_Y;
        if (z10) {
            f16 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(dq0Var2, property3, f16));
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(dq0Var2, property, f11));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.S[1];
            if (!z10) {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
        }
        FrameLayout frameLayout3 = this.f33617r;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.f33607h0 && z10) {
                if (this.f33601d0 != null) {
                    f12 = 5.0f;
                } else {
                    f12 = 16.0f;
                }
                f14 = AndroidUtilities.dp(f12);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, f14));
        }
        this.f33628y.playTogether(arrayList);
        this.f33628y.setInterpolator(new DecelerateInterpolator());
        this.f33628y.setDuration(180L);
        this.f33628y.addListener(new iq0(this, z10, 1));
        this.f33628y.start();
    }

    public final void U0(long j3, View view) {
        String str;
        rc J;
        int i10 = -this.H0;
        this.H0 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j3 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)));
        } else {
            str = "";
        }
        boolean premiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
        FrameLayout frameLayout = this.v;
        if (premiumFeaturesBlocked) {
            J = new yc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = new yc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new vp0(this, 1));
        }
        J.j();
    }

    public final void V0() {
        org.telegram.ui.ActionBar.p1 p1Var;
        dq0 dq0Var = this.f33599c;
        if (dq0Var == null) {
            return;
        }
        eq0 eq0Var = this.d;
        if (eq0Var != null && eq0Var.m()) {
            eq0Var.getEmojiPaddingShown();
        } else {
            kq0 kq0Var = this.D0;
            if (kq0Var != null && (p1Var = kq0Var.H) != null && !p1Var.f21449f) {
                AndroidUtilities.dp(20.0f);
            }
        }
        float f7 = 0.0f;
        FrameLayout frameLayout = this.f33600c0;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f7 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            float f10 = -f7;
            frameLayout2.setTranslationY(f10);
            LinearLayout linearLayout = this.f33626x;
            if (linearLayout != null) {
                linearLayout.setTranslationY(f10);
            }
        }
        float f11 = -f7;
        dq0Var.setTranslationY(f11);
        this.f33604f.setTranslationY(f11);
    }

    public final void W0() {
        org.telegram.ui.ActionBar.i5 i5Var = this.f33619s;
        if (i5Var != null) {
            String L0 = L0();
            if (L0.startsWith("https://")) {
                L0 = L0.substring(8);
            } else if (L0.startsWith("http://")) {
                L0 = L0.substring(7);
            }
            i5Var.k(L0);
        }
    }

    public final void X0(int i10) {
        int size;
        boolean z10;
        boolean z11;
        a0.i iVar = this.U;
        if (iVar.m() == 0) {
            T0(false);
            return;
        }
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        Object tag = this.f33599c.getTag();
        eq0 eq0Var = this.d;
        if (tag != null && eq0Var.f28705a.length() > 0) {
            size++;
        }
        long j3 = 0;
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            long j10 = ((TLRPC.Dialog) iVar.n(i11)).f20042id;
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j10);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j10));
            }
            j3 += sendPaidMessagesStars;
        }
        int max = Math.max(1, iVar.m());
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ii.z1 z1Var = this.f33602e;
        z1Var.g(max, z10);
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        z1Var.i(size, j3, z11);
        T0(true);
        eq0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), z1Var.l()), 0);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            rq0 rq0Var = this.K;
            if (rq0Var != null) {
                rq0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override
    public final void dismiss() {
        eq0 eq0Var = this.d;
        if (eq0Var != null) {
            AndroidUtilities.hideKeyboard(eq0Var.getEditText());
        }
        this.Y = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        eq0 eq0Var = this.d;
        if (eq0Var != null) {
            eq0Var.o();
        }
    }

    @Override
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.X;
    }

    @Override
    public final void onBackPressed() {
        if (this.C0 != null) {
            I0();
            return;
        }
        eq0 eq0Var = this.d;
        if (eq0Var != null && eq0Var.f28708e) {
            eq0Var.k(true);
        } else {
            super.onBackPressed();
        }
    }

    public zq0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    public zq0(android.content.Context r37, org.telegram.ui.yn r38, java.util.ArrayList r39, java.lang.String r40, java.lang.String r41, boolean r42, java.lang.String r43, java.lang.String r44, boolean r45, boolean r46, boolean r47, java.lang.Integer r48, org.telegram.ui.ActionBar.d6 r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zq0.<init>(android.content.Context, org.telegram.ui.yn, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.d6):void");
    }

    public void P0(View view) {
    }

    public void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
