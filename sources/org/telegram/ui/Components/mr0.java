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
public class mr0 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int Z0 = 0;
    public final org.telegram.ui.ActionBar.k A0;
    public boolean B0;
    public o1.j C0;
    public TLRPC.Dialog D0;
    public AnimatorSet E;
    public final xq0 E0;
    public final mm0 F;
    public ArrayList F0;
    public final nq0 G;
    public TL_stories.StoryItem G0;
    public final nq0 H;
    public i0.b H0;
    public final s4.t I;
    public int I0;
    public final s4.t J;
    public boolean J0;
    public final xz K;
    public org.telegram.ui.ActionBar.o1 K0;
    public final er0 L;
    public int L0;
    public final jr0 M;
    public boolean M0;
    public final ir0 N;
    public boolean N0;
    public final ArrayList O;
    public int O0;
    public final String[] P;
    public final ch.f P0;
    public final int Q;
    public final hh.c Q0;
    public final ey0 R;
    public final ch.b R0;
    public final Drawable S;
    public final ch.b S0;
    public final View[] T;
    public final ch.b T0;
    public final AnimatorSet[] U;
    public final kh U0;
    public final a0.h V;
    public final eh.d V0;
    public final HashMap W;
    public final ch.c W0;
    public final yq0 X;
    public final eh.d X0;
    public int Y;
    public boolean Y0;
    public boolean Z;
    public final boolean f30699a0;
    public final FrameLayout f30700b;
    public boolean f30701b0;
    public final qq0 f30702c;
    public final int f30703c0;
    public final rq0 d;
    public final FrameLayout f30704d0;
    public final li.w1 e;
    public final LinearLayout f30705e0;
    public final qq0 f30706f;
    public final zp f30707f0;
    public final org.telegram.ui.un f30708g0;
    public final FrameLayout h;
    public final Activity f30709h0;
    public final boolean f30710i0;
    public boolean f30711j0;
    public final TextPaint f30712k0;
    public TLRPC.TL_exportedMessageLink f30713l0;
    public boolean m0;
    public float f30714n;
    public boolean f30715n0;
    public final boolean f30716o0;
    public final String[] f30717p0;
    public int f30718q0;
    public final bi.cc f30719r;
    public int f30720r0;
    public final FrameLayout f30721s;
    public boolean f30722s0;
    public br0 f30723t0;
    public float f30724u0;
    public final org.telegram.ui.ActionBar.b6 v;
    public float f30725v0;
    public final FrameLayout f30726w;
    public float f30727w0;
    public final FrameLayout f30728x;
    public ValueAnimator f30729x0;
    public final LinearLayout f30730y;
    public final ql0 f30731y0;
    public final m20 f30732z0;

    public mr0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.u6 u6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, u6Var);
    }

    public static int C0(mr0 mr0Var) {
        nq0 nq0Var = mr0Var.G;
        if (nq0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = nq0Var.getChildAt(0);
            vl0 vl0Var = (vl0) nq0Var.G(childAt);
            if (vl0Var != null) {
                int paddingTop = nq0Var.getPaddingTop();
                if (vl0Var.c() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    public static mr0 P0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        ArrayList arrayList;
        if (messageObject != null) {
            arrayList = org.telegram.messenger.t.l(messageObject);
        } else {
            arrayList = null;
        }
        return new mr0(context, arrayList, str, null, z10, str2, null, false);
    }

    public static void Y0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        int i11;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        for (int i12 = 0; i12 < itemsCount; i12++) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12);
            int i13 = 6;
            if (i12 == 0) {
                i11 = 6;
            } else {
                i11 = 0;
            }
            if (i12 != itemsCount - 1) {
                i13 = 0;
            }
            org.telegram.ui.ActionBar.f7.R(childAt, org.telegram.ui.ActionBar.y6.Z(w02, i11, i13), null, org.telegram.ui.ActionBar.f7.N(i10), u6Var);
        }
    }

    public static void m(mr0 mr0Var, int i10) {
        ch.f fVar = mr0Var.P0;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (a8.pf.a(i10, 4)) {
                fVar.h(mr0Var.glassEngine.e());
            }
            fVar.e(mr0Var.U0, mr0Var.containerView.getWidth(), mr0Var.containerView.getHeight());
        }
    }

    public static void n(mr0 mr0Var, Canvas canvas, RectF rectF) {
        nq0 nq0Var = mr0Var.G;
        ih.d.a(nq0Var, canvas, rectF, nq0Var, mr0Var.containerView);
    }

    public static void o(mr0 mr0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
        int i11;
        int i12;
        boolean z11;
        Long l4;
        long j10;
        char c10;
        MessageObject messageObject;
        long j11;
        long longValue;
        String charSequence;
        long longValue2;
        Long l10;
        int i13;
        long j12;
        String[] strArr;
        MessageObject messageObject2;
        SendMessagesHelper.SendMessageParams of2;
        long longValue3;
        String charSequence2;
        ArrayList arrayList2;
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.TL_forumTopic tL_forumTopic2;
        Long l11;
        qq0 qq0Var;
        long j13;
        long j14;
        Long l12;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue4;
        String charSequence3;
        long longValue5;
        String[] strArr2 = mr0Var.P;
        rq0 rq0Var = mr0Var.d;
        qq0 qq0Var2 = mr0Var.f30702c;
        HashMap hashMap2 = mr0Var.W;
        Long l13 = 0L;
        a0.h hVar = mr0Var.V;
        ArrayList arrayList3 = mr0Var.O;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i14 = 0;
            boolean z12 = false;
            while (true) {
                if (i14 < hVar.m()) {
                    long j15 = hVar.j(i14);
                    boolean isMonoForum = MessagesController.getInstance(mr0Var.currentAccount).isMonoForum(j15);
                    if (hashMap == null) {
                        l11 = l13;
                    } else {
                        l11 = (Long) hashMap.get(Long.valueOf(j15));
                    }
                    if (l11 != null && l11.longValue() > 0) {
                        z12 = true;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j15));
                    if (tL_forumTopic3 != null && isMonoForum) {
                        qq0Var = qq0Var2;
                        j13 = j15;
                        j14 = DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    } else {
                        qq0Var = qq0Var2;
                        j13 = j15;
                        j14 = 0;
                    }
                    if (tL_forumTopic3 != null && !isMonoForum) {
                        l12 = l13;
                        messageObject3 = new MessageObject(mr0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    } else {
                        l12 = l13;
                        messageObject3 = null;
                    }
                    if (messageObject3 != null) {
                        messageObject3.isTopicMainMessage = true;
                    }
                    if (qq0Var.getTag() != null && rq0Var.f32325a.length() > 0) {
                        CharSequence charSequence4 = charSequenceArr[0];
                        if (charSequence4 == null) {
                            charSequence3 = null;
                        } else {
                            charSequence3 = charSequence4.toString();
                        }
                        MessageObject messageObject5 = messageObject3;
                        SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(charSequence3, j13, messageObject5, messageObject3, null, true, arrayList, null, null, z10, 0, 0, null, false);
                        messageObject4 = messageObject5;
                        if (l11 == null) {
                            arrayList2 = arrayList3;
                            longValue5 = 0;
                        } else {
                            arrayList2 = arrayList3;
                            longValue5 = l11.longValue();
                        }
                        of3.payStars = longValue5;
                        of3.monoForumPeer = j14;
                        SendMessagesHelper.getInstance(mr0Var.currentAccount).sendMessage(of3);
                    } else {
                        messageObject4 = messageObject3;
                        arrayList2 = arrayList3;
                    }
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(mr0Var.currentAccount);
                    ArrayList<MessageObject> arrayList5 = mr0Var.O;
                    boolean z13 = !mr0Var.J0;
                    if (l11 == null) {
                        longValue4 = 0;
                    } else {
                        longValue4 = l11.longValue();
                    }
                    long j16 = j13;
                    int sendMessage = sendMessagesHelper.sendMessage(arrayList5, j16, z13, false, z10, 0, 0, messageObject4, i10, longValue4, j14, null);
                    if (sendMessage != 0) {
                        arrayList4.add(Long.valueOf(j16));
                    }
                    if (hVar.m() == 1) {
                        tL_forumTopic = null;
                        g5.s0(sendMessage, mr0Var.f30708g0, null);
                        if (sendMessage != 0) {
                            break;
                        }
                    }
                    i14++;
                    arrayList3 = arrayList2;
                    qq0Var2 = qq0Var;
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
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(longValue6);
                hVar.l(longValue6);
                if (dialog != null) {
                    hashMap2.remove(dialog);
                }
            }
            if (!hVar.i()) {
                int size2 = arrayList2.size();
                if (hVar.m() == 1) {
                    tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(0));
                } else {
                    tL_forumTopic2 = tL_forumTopic;
                }
                mr0Var.T0(hVar, size2, tL_forumTopic2, !z12);
            }
        } else {
            yq0 yq0Var = mr0Var.X;
            if (yq0Var != null) {
                i11 = yq0Var.e;
            } else {
                i11 = 0;
            }
            if (mr0Var.G0 != null) {
                int i16 = 0;
                boolean z14 = false;
                while (i16 < hVar.m()) {
                    long j17 = hVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(mr0Var.currentAccount).isMonoForum(j17);
                    if (hashMap == null) {
                        l10 = l13;
                    } else {
                        l10 = (Long) hashMap.get(Long.valueOf(j17));
                    }
                    if (l10 != null && l10.longValue() > 0) {
                        z14 = true;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j17));
                    if (tL_forumTopic4 != null && isMonoForum2) {
                        i13 = i11;
                        j12 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                    } else {
                        i13 = i11;
                        j12 = 0;
                    }
                    if (tL_forumTopic4 != null && !isMonoForum2) {
                        strArr = strArr2;
                        messageObject2 = new MessageObject(mr0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                    } else {
                        strArr = strArr2;
                        messageObject2 = null;
                    }
                    if (mr0Var.G0 == null) {
                        if (qq0Var2.getTag() != null && rq0Var.f32325a.length() > 0) {
                            CharSequence charSequence5 = charSequenceArr[0];
                            if (charSequence5 == null) {
                                charSequence2 = null;
                            } else {
                                charSequence2 = charSequence5.toString();
                            }
                            of2 = SendMessagesHelper.SendMessageParams.of(charSequence2, j17, messageObject2, messageObject2, null, true, arrayList, null, null, z10, 0, 0, null, false);
                        } else {
                            of2 = SendMessagesHelper.SendMessageParams.of(strArr[i13], j17, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        }
                    } else {
                        if (qq0Var2.getTag() != null && rq0Var.f32325a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(mr0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j17, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j17, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = mr0Var.G0;
                    }
                    if (l10 == null) {
                        longValue3 = 0;
                    } else {
                        longValue3 = l10.longValue();
                    }
                    of2.payStars = longValue3;
                    of2.monoForumPeer = j12;
                    SendMessagesHelper.getInstance(mr0Var.currentAccount).sendMessage(of2);
                    i16++;
                    i11 = i13;
                    strArr2 = strArr;
                }
                z11 = z14;
            } else {
                int i17 = i11;
                if (strArr2[i17] != null) {
                    boolean z15 = false;
                    for (int i18 = 0; i18 < hVar.m(); i18++) {
                        long j18 = hVar.j(i18);
                        boolean isMonoForum3 = MessagesController.getInstance(mr0Var.currentAccount).isMonoForum(j18);
                        if (hashMap == null) {
                            l4 = l13;
                        } else {
                            l4 = (Long) hashMap.get(Long.valueOf(j18));
                        }
                        if (l4 != null && l4.longValue() > 0) {
                            z15 = true;
                        }
                        TLRPC.TL_forumTopic tL_forumTopic5 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j18));
                        if (tL_forumTopic5 != null && isMonoForum3) {
                            j10 = DialogObject.getPeerDialogId(tL_forumTopic5.from_id);
                        } else {
                            j10 = 0;
                        }
                        if (tL_forumTopic5 != null && !isMonoForum3) {
                            c10 = 0;
                            messageObject = new MessageObject(mr0Var.currentAccount, tL_forumTopic5.topicStartMessage, false, false);
                        } else {
                            c10 = 0;
                            messageObject = null;
                        }
                        if (qq0Var2.getTag() != null && rq0Var.f32325a.length() > 0) {
                            CharSequence charSequence6 = charSequenceArr[c10];
                            if (charSequence6 == null) {
                                charSequence = null;
                            } else {
                                charSequence = charSequence6.toString();
                            }
                            SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(charSequence, j18, messageObject, messageObject, null, true, arrayList, null, null, z10, 0, 0, null, false);
                            j11 = j18;
                            if (l4 == null) {
                                longValue2 = 0;
                            } else {
                                longValue2 = l4.longValue();
                            }
                            of4.payStars = longValue2;
                            of4.monoForumPeer = j10;
                            SendMessagesHelper.getInstance(mr0Var.currentAccount).sendMessage(of4);
                        } else {
                            j11 = j18;
                        }
                        SendMessagesHelper.SendMessageParams of5 = SendMessagesHelper.SendMessageParams.of(strArr2[i17], j11, messageObject, messageObject, null, true, null, null, null, z10, 0, 0, null, false);
                        if (l4 == null) {
                            longValue = 0;
                        } else {
                            longValue = l4.longValue();
                        }
                        of5.payStars = longValue;
                        of5.monoForumPeer = j10;
                        SendMessagesHelper.getInstance(mr0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z15;
                } else {
                    i12 = 0;
                    z11 = false;
                    mr0Var.T0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i12)), !z11);
                }
            }
            i12 = 0;
            mr0Var.T0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i12)), !z11);
        }
        br0 br0Var = mr0Var.f30723t0;
        if (br0Var != null) {
            br0Var.R();
        }
        mr0Var.dismiss();
    }

    public static void p(mr0 mr0Var, int i10) {
        TLRPC.Dialog dialog;
        ArrayList arrayList;
        ArrayList arrayList2;
        m20 m20Var = mr0Var.f30732z0;
        HashMap hashMap = mr0Var.W;
        a0.h hVar = mr0Var.V;
        er0 er0Var = mr0Var.L;
        jr0 jr0Var = mr0Var.M;
        if (jr0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = mr0Var.D0;
            if (dialog2 != null) {
                hVar.k(dialog2, dialog2.f22031id);
                hashMap.remove(dialog2);
                mr0Var.d1(2);
                if (mr0Var.M0 || mr0Var.N0) {
                    if (((TLRPC.Dialog) er0Var.e.f(dialog2.f22031id)) == null) {
                        er0Var.e.k(dialog2, dialog2.f22031id);
                        er0Var.d.add(!arrayList2.isEmpty(), dialog2);
                    }
                    er0Var.l();
                    mr0Var.B0 = false;
                    m20Var.f30367r.setText("");
                    mr0Var.M0(false);
                }
                for (int i11 = 0; i11 < mr0Var.R0().getChildCount(); i11++) {
                    View childAt = mr0Var.R0().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.k7) {
                        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                        if (k7Var.getCurrentDialog() == mr0Var.D0.f22031id) {
                            k7Var.d(null, false, true);
                            k7Var.b(true, true);
                        }
                    }
                }
                mr0Var.N0();
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic E = jr0Var.E(i10);
        if (E != null && (dialog = mr0Var.D0) != null) {
            long j10 = dialog.f22031id;
            boolean isMonoForum = MessagesController.getInstance(mr0Var.currentAccount).isMonoForum(j10);
            TLRPC.Dialog dialog3 = mr0Var.D0;
            hVar.k(dialog3, j10);
            hashMap.put(dialog3, E);
            mr0Var.d1(2);
            if (mr0Var.M0 || mr0Var.N0) {
                if (((TLRPC.Dialog) er0Var.e.f(dialog3.f22031id)) == null) {
                    er0Var.e.k(dialog3, dialog3.f22031id);
                    er0Var.d.add(!arrayList.isEmpty(), dialog3);
                }
                er0Var.l();
                mr0Var.B0 = false;
                m20Var.f30367r.setText("");
                mr0Var.M0(false);
            }
            for (int i12 = 0; i12 < mr0Var.R0().getChildCount(); i12++) {
                View childAt2 = mr0Var.R0().getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.k7) {
                    org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) childAt2;
                    if (k7Var2.getCurrentDialog() == mr0Var.D0.f22031id) {
                        k7Var2.d(E, isMonoForum, true);
                        k7Var2.b(true, true);
                    }
                }
            }
            mr0Var.N0();
        }
    }

    public static boolean q(final mr0 mr0Var) {
        int measuredHeight;
        org.telegram.ui.un unVar;
        li.w1 w1Var = mr0Var.e;
        boolean z10 = mr0Var.f30710i0;
        Activity activity = mr0Var.f30709h0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(mr0Var.getContext());
        linearLayout.setOrientation(1);
        if (mr0Var.O != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, mr0Var.resourcesProvider);
            if (z10) {
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23402fg, actionBarPopupWindow$ActionBarPopupWindowLayout, mr0Var.resourcesProvider);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new uq0(mr0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new hq0(mr0Var, 2));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, mr0Var.getContext(), mr0Var.resourcesProvider, true, false);
            if (z10) {
                g1Var.setTextColor(mr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23550ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, gb1.r(-1, 48));
            g1Var.j(LocaleController.getString(R.string.ShowSendersName), 0, null);
            mr0Var.J0 = true;
            g1Var.setChecked(true);
            final org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(1, mr0Var.getContext(), mr0Var.resourcesProvider, false, true);
            if (z10) {
                g1Var2.setTextColor(mr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23550ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, gb1.r(-1, 48));
            g1Var2.j(LocaleController.getString(R.string.HideSendersName), 0, null);
            g1Var2.setChecked(!mr0Var.J0);
            g1Var.setOnClickListener(new View.OnClickListener(mr0Var) {
                public final mr0 f29957b;

                {
                    this.f29957b = mr0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            mr0 mr0Var2 = this.f29957b;
                            mr0Var2.J0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!mr0Var2.J0);
                            return;
                        default:
                            mr0 mr0Var3 = this.f29957b;
                            mr0Var3.J0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!mr0Var3.J0);
                            return;
                    }
                }
            });
            g1Var2.setOnClickListener(new View.OnClickListener(mr0Var) {
                public final mr0 f29957b;

                {
                    this.f29957b = mr0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            mr0 mr0Var2 = this.f29957b;
                            mr0Var2.J0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!mr0Var2.J0);
                            return;
                        default:
                            mr0 mr0Var3 = this.f29957b;
                            mr0Var3.J0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!mr0Var3.J0);
                            return;
                    }
                }
            });
            Y0(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.y6.I5, mr0Var.resourcesProvider);
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, gb1.o(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, mr0Var.resourcesProvider);
        if (z10) {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23402fg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new uq0(mr0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new hq0(mr0Var, 3));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, mr0Var.getContext(), mr0Var.resourcesProvider, true, true);
        if (z10) {
            g1Var3.setTextColor(mr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23550ng));
            g1Var3.setIconColor(mr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.H6));
        }
        g1Var3.j(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        g1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var3, gb1.r(-1, 48));
        g1Var3.setOnClickListener(new gq0(mr0Var, 2));
        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, mr0Var.getContext(), mr0Var.resourcesProvider, true, true);
        if (z10) {
            g1Var4.setTextColor(mr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23550ng));
            g1Var4.setIconColor(mr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.H6));
        }
        g1Var4.j(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        g1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var4, gb1.r(-1, 48));
        g1Var4.setOnClickListener(new gq0(mr0Var, 3));
        Y0(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.y6.I5, mr0Var.resourcesProvider);
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, gb1.r(-1, -2));
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(linearLayout, -2, -2);
        mr0Var.K0 = o1Var;
        o1Var.f22908b = false;
        o1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        mr0Var.K0.setOutsideTouchable(true);
        mr0Var.K0.setClippingEnabled(true);
        mr0Var.K0.setInputMethodMode(2);
        mr0Var.K0.setSoftInputMode(0);
        mr0Var.K0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        mr0Var.K0.setFocusable(true);
        int[] iArr = new int[2];
        w1Var.getLocationInWindow(iArr);
        if (mr0Var.keyboardVisible && (unVar = mr0Var.f30708g0) != null && unVar.f44295j1.getMeasuredHeight() > AndroidUtilities.dp(58.0f)) {
            measuredHeight = w1Var.getMeasuredHeight() + iArr[1];
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
        }
        mr0Var.K0.showAtLocation(w1Var, 51, AndroidUtilities.dp(8.0f) + ((w1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
        mr0Var.K0.b();
        try {
            w1Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void r(mr0 mr0Var, AtomicReference atomicReference, tq0 tq0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        tq0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, mr0Var.currentAccount, Long.valueOf(-dialog.f22031id));
    }

    public static void r0(mr0 mr0Var) {
        nq0 nq0Var;
        int i10;
        int i11;
        nq0 nq0Var2 = mr0Var.G;
        nq0 nq0Var3 = mr0Var.H;
        mm0 mm0Var = mr0Var.F;
        if (!mr0Var.f30722s0) {
            if (mr0Var.M0) {
                nq0Var = nq0Var3;
            } else {
                nq0Var = nq0Var2;
            }
            if (nq0Var.getChildCount() > 0) {
                View childAt = nq0Var.getChildAt(0);
                for (int i12 = 0; i12 < nq0Var.getChildCount(); i12++) {
                    if (nq0Var.getChildAt(i12).getTop() < childAt.getTop()) {
                        childAt = nq0Var.getChildAt(i12);
                    }
                }
                vl0 vl0Var = (vl0) nq0Var.G(childAt);
                int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
                if (top > 0 && vl0Var != null && vl0Var.b() == 0) {
                    i10 = top;
                } else {
                    i10 = 0;
                }
                if (top >= 0 && vl0Var != null && vl0Var.b() == 0) {
                    mr0Var.L0 = childAt.getTop();
                    mr0Var.V0(false);
                } else {
                    mr0Var.L0 = Integer.MAX_VALUE;
                    mr0Var.V0(true);
                    top = i10;
                }
                if (mm0Var.getVisibility() == 0) {
                    if (mm0Var.getChildCount() > 0) {
                        View childAt2 = mm0Var.getChildAt(0);
                        for (int i13 = 0; i13 < mm0Var.getChildCount(); i13++) {
                            if (mm0Var.getChildAt(i13).getTop() < childAt2.getTop()) {
                                childAt2 = mm0Var.getChildAt(i13);
                            }
                        }
                        vl0 vl0Var2 = (vl0) mm0Var.G(childAt2);
                        int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
                        if (top2 > 0 && vl0Var2 != null && vl0Var2.b() == 0) {
                            i11 = top2;
                        } else {
                            i11 = 0;
                        }
                        if (top2 >= 0 && vl0Var2 != null && vl0Var2.b() == 0) {
                            mr0Var.L0 = childAt2.getTop();
                            mr0Var.V0(false);
                        } else {
                            mr0Var.L0 = Integer.MAX_VALUE;
                            mr0Var.V0(true);
                            top2 = i11;
                        }
                        top = AndroidUtilities.lerp(top, top2, mm0Var.getAlpha());
                    } else {
                        return;
                    }
                }
                int i14 = mr0Var.f30718q0;
                if (i14 != top) {
                    mr0Var.f30720r0 = i14;
                    float f7 = top;
                    int i15 = (int) (mr0Var.f30724u0 + f7);
                    mr0Var.f30718q0 = i15;
                    nq0Var2.setTopGlowOffset(i15);
                    int i16 = (int) (mr0Var.f30724u0 + f7);
                    mr0Var.f30718q0 = i16;
                    nq0Var3.setTopGlowOffset(i16);
                    int i17 = (int) (f7 + mr0Var.f30724u0);
                    mr0Var.f30718q0 = i17;
                    mm0Var.setTopGlowOffset(i17);
                    mr0Var.f30700b.setTranslationY(mr0Var.f30718q0 + mr0Var.f30724u0);
                    mr0Var.R.setTranslationY(mr0Var.f30718q0 + mr0Var.f30724u0);
                    mr0Var.containerView.invalidate();
                }
            }
        }
    }

    public final void M0(boolean z10) {
        m20 m20Var = this.f30732z0;
        fi.c2 c2Var = m20Var.f30367r;
        fi.c2 c2Var2 = m20Var.f30367r;
        boolean isEmpty = TextUtils.isEmpty(c2Var.getText());
        nq0 nq0Var = this.G;
        nq0 nq0Var2 = this.H;
        boolean z11 = true;
        if (isEmpty && ((!this.keyboardVisible || !c2Var2.hasFocus()) && !this.N0)) {
            if (this.D0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(nq0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(nq0Var2, false);
            }
            z11 = false;
        } else {
            this.B0 = true;
            if (this.D0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(nq0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(nq0Var2, true);
            }
        }
        if (this.M0 == z11 && !z10) {
            return;
        }
        this.M0 = z11;
        ir0 ir0Var = this.N;
        ir0Var.l();
        this.L.l();
        if (this.M0) {
            if (this.L0 == Integer.MAX_VALUE) {
                ((s4.c0) nq0Var2.getLayoutManager()).h1(0, -nq0Var2.getPaddingTop());
            } else {
                ((s4.c0) nq0Var2.getLayoutManager()).h1(0, this.L0 - nq0Var2.getPaddingTop());
            }
            ir0Var.E(c2Var2.getText().toString());
            return;
        }
        int i10 = this.L0;
        s4.t tVar = this.I;
        if (i10 == Integer.MAX_VALUE) {
            tVar.h1(0, 0);
        } else {
            tVar.h1(0, 0);
        }
    }

    public final void N0() {
        float f7;
        TLRPC.Dialog dialog = this.D0;
        if (dialog != null) {
            org.telegram.ui.Cells.k7 k7Var = null;
            this.D0 = null;
            for (int i10 = 0; i10 < R0().getChildCount(); i10++) {
                View childAt = R0().getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.k7) && ((org.telegram.ui.Cells.k7) childAt).getCurrentDialog() == dialog.f22031id) {
                    k7Var = childAt;
                }
            }
            if (k7Var == null) {
                return;
            }
            o1.j jVar = this.C0;
            if (jVar != null) {
                jVar.c();
            }
            R0().setVisibility(0);
            m20 m20Var = this.f30732z0;
            m20Var.setVisibility(0);
            fi.c2 c2Var = m20Var.f30367r;
            if (this.M0 || this.N0) {
                this.E0.H.v = true;
                c2Var.requestFocus();
                AndroidUtilities.showKeyboard(c2Var);
            }
            int[] iArr = new int[2];
            o1.j jVar2 = new o1.j(new ac.a(1000.0f));
            o1.k kVar = new o1.k(0.0f);
            org.telegram.ui.un unVar = this.f30708g0;
            if (unVar != null && unVar.f44192b) {
                f7 = 10.0f;
            } else {
                f7 = 800.0f;
            }
            kVar.b(f7);
            kVar.a(1.0f);
            jVar2.f18969u = kVar;
            this.C0 = jVar2;
            jVar2.b(new fq0(this, k7Var, iArr, 0));
            this.C0.a(new hb(this, 5));
            this.C0.h();
        }
    }

    public final void O0() {
        boolean z10 = false;
        if (this.f30713l0 != null || this.f30717p0[0] != null) {
            try {
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", Q0()));
                br0 br0Var = this.f30723t0;
                if (br0Var != null) {
                    br0Var.v0();
                } else if (this.f30709h0 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f30713l0;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z10 = true;
                    }
                    ((LaunchActivity) this.f30709h0).I0(new i2.y(5, z10));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final String Q0() {
        String str;
        String str2;
        String[] strArr = this.f30717p0;
        yq0 yq0Var = this.X;
        if (yq0Var != null) {
            str2 = strArr[yq0Var.e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f30713l0;
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
        zp zpVar = this.f30707f0;
        if (zpVar != null && zpVar.f35382a.f26089q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.f30703c0)).build().toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final mm0 R0() {
        if (!this.M0 && !this.N0) {
            return this.G;
        }
        return this.H;
    }

    public final void S0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        mm0 mm0Var = this.F;
        mm0Var.setPivotX(width);
        mm0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        mm0Var.setScaleX(f11);
        mm0Var.setScaleY(f11);
        mm0Var.setAlpha(f7);
        mm0 R0 = R0();
        R0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        R0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        R0.setScaleX(f12);
        R0.setScaleY(f12);
        float f13 = 1.0f - f7;
        R0.setAlpha(f13);
        m20 m20Var = this.f30732z0;
        m20Var.setPivotX(m20Var.getWidth() / 2.0f);
        m20Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        m20Var.setScaleX(f14);
        m20Var.setScaleY(f14);
        m20Var.setAlpha(f13);
        org.telegram.ui.ActionBar.k kVar = this.A0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.setAlpha(f7);
        mm0Var.getLocationInWindow(iArr);
        float interpolation = ds.f27587g.getInterpolation(f7);
        for (int i10 = 0; i10 < R0.getChildCount(); i10++) {
            View childAt = R0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.k7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f7, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f13);
                }
            }
        }
        for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
            View childAt2 = mm0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.l7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y3 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((mm0Var.getTranslationY() + y3) - view.getY()))));
            }
        }
        this.containerView.requestLayout();
        R0.invalidate();
    }

    public final void V0(boolean z10) {
        Integer num;
        float f7;
        View[] viewArr = this.T;
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
            AnimatorSet[] animatorSetArr = this.U;
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
            animatorSetArr[0].addListener(new vq0(this, z10, 0));
            animatorSetArr[0].start();
        }
    }

    public final void W0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        mr0 mr0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        hr0 hr0Var;
        if (dialog instanceof dr0) {
            U0(view);
        } else if (((view instanceof org.telegram.ui.Cells.k7) && ((org.telegram.ui.Cells.k7) view).F) || ((view instanceof org.telegram.ui.Cells.m6) && ((org.telegram.ui.Cells.m6) view).f24466n0)) {
            a1(dialog.f22031id, view);
        } else {
            mm0 mm0Var = this.F;
            if (mm0Var.getVisibility() == 8 && (activity = this.f30709h0) != null) {
                boolean isChatDialog = DialogObject.isChatDialog(dialog.f22031id);
                int i10 = this.Q;
                if (isChatDialog) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f22031id));
                    if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.f22031id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        String string = LocaleController.getString(R.string.SendMessageTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                        e2Var.R = string;
                        if (i10 == 3) {
                            if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                e2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                            } else {
                                e2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                            }
                        } else if (i10 == 2) {
                            if (this.f30716o0) {
                                e2Var.T = LocaleController.getString(R.string.PublicPollCantForward);
                            } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                e2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                            } else {
                                e2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                            }
                        } else {
                            e2Var.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        ic.a.r(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                } else if (DialogObject.isEncryptedDialog(dialog.f22031id) && i10 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String string2 = LocaleController.getString(R.string.SendMessageTitle);
                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22368a;
                    e2Var2.R = string2;
                    if (i10 == 3) {
                        e2Var2.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i10 != 0) {
                        e2Var2.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        e2Var2.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    ic.a.r(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
                long j10 = dialog.f22031id;
                a0.h hVar = this.V;
                if (hVar.h(j10) >= 0) {
                    hVar.l(dialog.f22031id);
                    this.W.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.m6) {
                        ((org.telegram.ui.Cells.m6) view).r(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).b(false, true);
                    }
                    d1(1);
                    mr0Var = this;
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.f22031id));
                    TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f22031id));
                    if ((!UserObject.isBotForum(user) || (((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f22176id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f22176id))) && (!DialogObject.isChatDialog(dialog.f22031id) || (!ChatObject.isForum(chat2) && (!ChatObject.isMonoForum(chat2) || !ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                        mr0Var = this;
                        hVar.k(dialog, dialog.f22031id);
                        if (view instanceof org.telegram.ui.Cells.m6) {
                            ((org.telegram.ui.Cells.m6) view).r(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.k7) {
                            ((org.telegram.ui.Cells.k7) view).b(true, true);
                        }
                        d1(2);
                        long j11 = UserConfig.getInstance(mr0Var.currentAccount).clientUserId;
                        if (mr0Var.M0) {
                            er0 er0Var = mr0Var.L;
                            a0.h hVar2 = er0Var.e;
                            ArrayList arrayList = er0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.f22031id);
                            if (dialog2 == null) {
                                er0Var.e.k(dialog, dialog.f22031id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f22031id != j11) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            er0Var.l();
                            mr0Var.B0 = false;
                            m20 m20Var = mr0Var.f30732z0;
                            m20Var.f30367r.setText("");
                            M0(false);
                            AndroidUtilities.hideKeyboard(m20Var.f30367r);
                        }
                    } else {
                        this.D0 = dialog;
                        this.J.h1(0, this.f30718q0 - mm0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        tq0 tq0Var = new tq0(this, dialog, atomicReference, view);
                        atomicReference.set(new e10(this, atomicReference, tq0Var, dialog, 8));
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                        int i11 = NotificationCenter.topicsDidLoaded;
                        notificationCenter.addObserver(tq0Var, i11);
                        if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.f22031id) != null) {
                            tq0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.f22031id));
                            return;
                        }
                        MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.f22031id);
                        AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                ir0 ir0Var = mr0Var.N;
                if (ir0Var != null && (hr0Var = ir0Var.H) != null) {
                    hr0Var.q(0, hr0Var.h());
                }
            }
        }
    }

    public final void X0(final boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            a0.h hVar = this.V;
            int m10 = hVar.m();
            qq0 qq0Var = this.f30702c;
            rq0 rq0Var = this.d;
            boolean z11 = true;
            if (i14 < m10) {
                long j10 = hVar.j(i14);
                if (g5.h(getContext(), this.currentAccount, j10, (qq0Var.getTag() == null || rq0Var.f32325a.length() <= 0) ? false : false)) {
                    return;
                }
                i14++;
            } else {
                Editable text = rq0Var.getText();
                mu muVar = rq0Var.f32325a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                zp zpVar = this.f30707f0;
                if (zpVar != null && zpVar.f35382a.f26089q) {
                    i10 = this.f30703c0;
                } else {
                    i10 = -1;
                }
                ArrayList arrayList = new ArrayList();
                if (this.O != null) {
                    i12 = 0;
                    while (i13 < hVar.m()) {
                        long j11 = hVar.j(i13);
                        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
                        if (sendPaidMessagesStars <= 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
                        }
                        if (qq0Var.getTag() != null && muVar.length() > 0 && sendPaidMessagesStars > 0) {
                            i12++;
                        }
                        int i15 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
                        if (i15 > 0) {
                            i12++;
                        }
                        if (i15 > 0 && !arrayList.contains(Long.valueOf(j11))) {
                            arrayList.add(Long.valueOf(j11));
                        }
                        i13++;
                    }
                } else {
                    yq0 yq0Var = this.X;
                    if (yq0Var != null) {
                        i11 = yq0Var.e;
                    } else {
                        i11 = 0;
                    }
                    if (this.G0 != null) {
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < hVar.m()) {
                            long j12 = hVar.j(i16);
                            long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j12);
                            if (sendPaidMessagesStars2 <= 0) {
                                sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j12));
                            }
                            int i18 = i13;
                            if (this.G0 != null && qq0Var.getTag() != null && muVar.length() > 0 && charSequenceArr[i18] != null && sendPaidMessagesStars2 > 0) {
                                i17++;
                            }
                            int i19 = (sendPaidMessagesStars2 > 0L ? 1 : (sendPaidMessagesStars2 == 0L ? 0 : -1));
                            if (i19 > 0) {
                                i17++;
                            }
                            if (i19 > 0 && !arrayList.contains(Long.valueOf(j12))) {
                                arrayList.add(Long.valueOf(j12));
                            }
                            i16++;
                            i13 = i18;
                        }
                        i12 = i17;
                    } else {
                        int i20 = 0;
                        if (this.P[i11] != null) {
                            for (int i21 = 0; i21 < hVar.m(); i21++) {
                                long j13 = hVar.j(i21);
                                long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j13);
                                if (sendPaidMessagesStars3 <= 0) {
                                    sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j13));
                                }
                                if (qq0Var.getTag() != null && muVar.length() > 0 && sendPaidMessagesStars3 > 0) {
                                    i20++;
                                }
                                int i22 = (sendPaidMessagesStars3 > 0L ? 1 : (sendPaidMessagesStars3 == 0L ? 0 : -1));
                                if (i22 > 0) {
                                    i20++;
                                }
                                if (i22 > 0 && !arrayList.contains(Long.valueOf(j13))) {
                                    arrayList.add(Long.valueOf(j13));
                                }
                            }
                        }
                        i12 = i20;
                    }
                }
                final int i23 = i10;
                g5.b0(this.currentAccount, arrayList, i12, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        mr0.o(mr0.this, charSequenceArr, entities, z10, i23, (HashMap) obj);
                    }
                });
                return;
            }
        }
    }

    public final void Z0(boolean z10) {
        boolean z11;
        Integer num;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        qq0 qq0Var = this.f30702c;
        if (qq0Var.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        qq0Var.setTag(num);
        rq0 rq0Var = this.d;
        if (rq0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(rq0Var.getEditText());
        }
        rq0Var.k(true);
        FrameLayout frameLayout = this.f30704d0;
        qq0 qq0Var2 = this.f30706f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            qq0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            qq0Var2.setVisibility(0);
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
            WeakHashMap weakHashMap = r0.i0.f47108a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.f30730y;
        if (linearLayout != null) {
            if (!z10) {
                i11 = 1;
            }
            WeakHashMap weakHashMap2 = r0.i0.f47108a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.E = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f14 = 0.0f;
        float f15 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(qq0Var, property, f7));
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
        arrayList.add(ObjectAnimator.ofFloat(qq0Var2, property2, f10));
        Property property3 = View.SCALE_Y;
        if (z10) {
            f16 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(qq0Var2, property3, f16));
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(qq0Var2, property, f11));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.T[1];
            if (!z10) {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
        }
        FrameLayout frameLayout3 = this.f30721s;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.f30710i0 && z10) {
                if (this.f30705e0 != null) {
                    f12 = 5.0f;
                } else {
                    f12 = 16.0f;
                }
                f14 = AndroidUtilities.dp(f12);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, f14));
        }
        this.E.playTogether(arrayList);
        this.E.setInterpolator(new DecelerateInterpolator());
        this.E.setDuration(180L);
        this.E.addListener(new vq0(this, z10, 1));
        this.E.start();
    }

    public final void a1(long j10, View view) {
        String str;
        qc J;
        int i10 = -this.I0;
        this.I0 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j10 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)));
        } else {
            str = "";
        }
        boolean premiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
        FrameLayout frameLayout = this.f30726w;
        if (premiumFeaturesBlocked) {
            J = new wc(frameLayout, this.resourcesProvider).R(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = new wc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new iq0(this, 1));
        }
        J.j();
    }

    public final void b1() {
        org.telegram.ui.ActionBar.q1 q1Var;
        qq0 qq0Var = this.f30702c;
        if (qq0Var == null) {
            return;
        }
        rq0 rq0Var = this.d;
        if (rq0Var != null && rq0Var.m()) {
            rq0Var.getEmojiPaddingShown();
        } else {
            xq0 xq0Var = this.E0;
            if (xq0Var != null && (q1Var = xq0Var.H) != null && !q1Var.f22967f) {
                AndroidUtilities.dp(20.0f);
            }
        }
        float f7 = 0.0f;
        FrameLayout frameLayout = this.f30704d0;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f7 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f7);
        }
        float f10 = -f7;
        qq0Var.setTranslationY(f10);
        this.f30706f.setTranslationY(f10);
    }

    public final void c1() {
        org.telegram.ui.ActionBar.b6 b6Var = this.v;
        if (b6Var != null) {
            String Q0 = Q0();
            if (Q0.startsWith("https://")) {
                Q0 = Q0.substring(8);
            } else if (Q0.startsWith("http://")) {
                Q0 = Q0.substring(7);
            }
            b6Var.l(Q0, false);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void d1(int i10) {
        int size;
        boolean z10;
        boolean z11;
        a0.h hVar = this.V;
        if (hVar.m() == 0) {
            Z0(false);
            return;
        }
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        Object tag = this.f30702c.getTag();
        rq0 rq0Var = this.d;
        if (tag != null && rq0Var.f32325a.length() > 0) {
            size++;
        }
        long j10 = 0;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            long j11 = ((TLRPC.Dialog) hVar.n(i11)).f22031id;
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
            }
            j10 += sendPaidMessagesStars;
        }
        int max = Math.max(1, hVar.m());
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        li.w1 w1Var = this.e;
        w1Var.g(max, z10);
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        w1Var.i(size, j10, z11);
        Z0(true);
        rq0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), w1Var.l()), 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            er0 er0Var = this.L;
            if (er0Var != null) {
                er0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override
    public final void dismiss() {
        rq0 rq0Var = this.d;
        if (rq0Var != null) {
            AndroidUtilities.hideKeyboard(rq0Var.getEditText());
        }
        this.Z = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        rq0 rq0Var = this.d;
        if (rq0Var != null) {
            rq0Var.o();
        }
    }

    @Override
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.Y;
    }

    @Override
    public final void onBackPressed() {
        if (this.D0 != null) {
            N0();
            return;
        }
        rq0 rq0Var = this.d;
        if (rq0Var != null && rq0Var.e) {
            rq0Var.k(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z10;
        try {
            super.onThemeColorsChanged();
            hh.c cVar = this.Q0;
            if (cVar != null) {
                cVar.a(getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
            }
            if (this.container != null) {
                if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.y6.f23427h5)) > 0.721f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != this.Y0) {
                    this.Y0 = z10;
                    AndroidUtilities.setLightNavigationBar(this.container, z10);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public mr0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    public mr0(android.content.Context r35, org.telegram.ui.un r36, java.util.ArrayList r37, java.lang.String r38, java.lang.String r39, boolean r40, java.lang.String r41, java.lang.String r42, boolean r43, boolean r44, boolean r45, java.lang.Integer r46, org.telegram.ui.ActionBar.u6 r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mr0.<init>(android.content.Context, org.telegram.ui.un, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.u6):void");
    }

    public void U0(View view) {
    }

    public void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
