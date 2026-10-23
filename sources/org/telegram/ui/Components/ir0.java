package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
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
import org.telegram.messenger.LiteMode;
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
public class ir0 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f27405d1 = 0;
    public final org.telegram.ui.ActionBar.k A0;
    public boolean B0;
    public o1.k C0;
    public TLRPC.Dialog D0;
    public AnimatorSet E;
    public final tq0 E0;
    public final mm0 F;
    public ArrayList F0;
    public final lq0 G;
    public TL_stories.StoryItem G0;
    public final lq0 H;
    public i0.b H0;
    public final s4.s I;
    public int I0;
    public final s4.s J;
    public boolean J0;
    public final xz K;
    public org.telegram.ui.ActionBar.m1 K0;
    public final ar0 L;
    public int L0;
    public final fr0 M;
    public boolean M0;
    public final er0 N;
    public boolean N0;
    public final ArrayList O;
    public int O0;
    public final String[] P;
    public final bh.f P0;
    public final int Q;
    public final gh.d Q0;
    public final wx0 R;
    public final gh.d R0;
    public final Drawable S;
    public final gh.c S0;
    public final View[] T;
    public final bh.b T0;
    public final AnimatorSet[] U;
    public final bh.b U0;
    public final a0.h V;
    public final bh.b V0;
    public final HashMap W;
    public final bh.l W0;
    public final uq0 X;
    public final dh.d X0;
    public int Y;
    public final bh.c Y0;
    public boolean Z;
    public final dh.d Z0;
    public final boolean f27406a0;
    public final ArrayList f27407a1;
    public final FrameLayout f27408b;
    public boolean f27409b0;
    public final RectF f27410b1;
    public final mq0 f27411c;
    public final int f27412c0;
    public boolean f27413c1;
    public final nq0 d;
    public final FrameLayout f27414d0;
    public final ki.y1 e;
    public final LinearLayout f27415e0;
    public final mq0 f27416f;
    public final xp f27417f0;
    public final org.telegram.ui.sn f27418g0;
    public final FrameLayout h;
    public final Activity f27419h0;
    public final boolean f27420i0;
    public boolean f27421j0;
    public final TextPaint f27422k0;
    public TLRPC.TL_exportedMessageLink f27423l0;
    public boolean m0;
    public float f27424n;
    public boolean f27425n0;
    public final boolean f27426o0;
    public final String[] f27427p0;
    public int f27428q0;
    public final ai.jc f27429r;
    public int f27430r0;
    public final FrameLayout f27431s;
    public boolean f27432s0;
    public xq0 f27433t0;
    public float f27434u0;
    public final org.telegram.ui.ActionBar.n5 v;
    public float f27435v0;
    public final FrameLayout f27436w;
    public float f27437w0;
    public final FrameLayout f27438x;
    public ValueAnimator f27439x0;
    public final LinearLayout f27440y;
    public final rl0 f27441y0;
    public final k20 f27442z0;

    public ir0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, g6Var);
    }

    public static void J0(ir0 ir0Var) {
        float f7;
        RectF rectF = ir0Var.f27410b1;
        bh.f fVar = ir0Var.P0;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            rectF.set(0.0f, 0.0f, ir0Var.containerView.getMeasuredWidth(), ir0Var.containerView.getMeasuredHeight());
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            fVar.g(1, ir0Var.f27407a1);
            fVar.e(ir0Var.W0, ir0Var.containerView.getMeasuredWidth(), ir0Var.containerView.getMeasuredHeight());
        }
    }

    public static int O0(ir0 ir0Var) {
        lq0 lq0Var = ir0Var.G;
        if (lq0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = lq0Var.getChildAt(0);
            wl0 wl0Var = (wl0) lq0Var.G(childAt);
            if (wl0Var != null) {
                int paddingTop = lq0Var.getPaddingTop();
                if (wl0Var.c() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    public static ir0 S0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        ArrayList arrayList;
        if (messageObject != null) {
            arrayList = org.telegram.messenger.v0.k(messageObject);
        } else {
            arrayList = null;
        }
        return new ir0(context, arrayList, str, null, z10, str2, null, false);
    }

    public static void b1(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        int i11;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
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
            org.telegram.ui.ActionBar.r6.S(childAt, org.telegram.ui.ActionBar.k6.Z(w02, i11, i13), null, org.telegram.ui.ActionBar.r6.O(i10), g6Var);
        }
    }

    public static void m(ir0 ir0Var, AtomicReference atomicReference, pq0 pq0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        pq0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, ir0Var.currentAccount, Long.valueOf(-dialog.f20347id));
    }

    public static boolean n(final ir0 ir0Var) {
        int measuredHeight;
        org.telegram.ui.sn snVar;
        ki.y1 y1Var = ir0Var.e;
        boolean z10 = ir0Var.f27420i0;
        Activity activity = ir0Var.f27419h0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(ir0Var.getContext());
        linearLayout.setOrientation(1);
        if (ir0Var.O != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, ir0Var.resourcesProvider);
            if (z10) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.fg, actionBarPopupWindow$ActionBarPopupWindowLayout, ir0Var.resourcesProvider);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new qq0(ir0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new cq0(ir0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, ir0Var.getContext(), ir0Var.resourcesProvider, true, false);
            if (z10) {
                e1Var.setTextColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21376ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.z5.n(-1, 48));
            e1Var.j(LocaleController.getString(R.string.ShowSendersName), 0, null);
            ir0Var.J0 = true;
            e1Var.setChecked(true);
            final org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(1, ir0Var.getContext(), ir0Var.resourcesProvider, false, true);
            if (z10) {
                e1Var2.setTextColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21376ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.z5.n(-1, 48));
            e1Var2.j(LocaleController.getString(R.string.HideSendersName), 0, null);
            e1Var2.setChecked(!ir0Var.J0);
            e1Var.setOnClickListener(new View.OnClickListener(ir0Var) {
                public final ir0 f26693b;

                {
                    this.f26693b = ir0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            ir0 ir0Var2 = this.f26693b;
                            ir0Var2.J0 = true;
                            e1Var.setChecked(true);
                            e1Var2.setChecked(!ir0Var2.J0);
                            return;
                        default:
                            ir0 ir0Var3 = this.f26693b;
                            ir0Var3.J0 = false;
                            e1Var.setChecked(false);
                            e1Var2.setChecked(!ir0Var3.J0);
                            return;
                    }
                }
            });
            e1Var2.setOnClickListener(new View.OnClickListener(ir0Var) {
                public final ir0 f26693b;

                {
                    this.f26693b = ir0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            ir0 ir0Var2 = this.f26693b;
                            ir0Var2.J0 = true;
                            e1Var.setChecked(true);
                            e1Var2.setChecked(!ir0Var2.J0);
                            return;
                        default:
                            ir0 ir0Var3 = this.f26693b;
                            ir0Var3.J0 = false;
                            e1Var.setChecked(false);
                            e1Var2.setChecked(!ir0Var3.J0);
                            return;
                    }
                }
            });
            b1(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.k6.I5, ir0Var.resourcesProvider);
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.z5.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, ir0Var.resourcesProvider);
        if (z10) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.fg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new qq0(ir0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new cq0(ir0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, ir0Var.getContext(), ir0Var.resourcesProvider, true, true);
        if (z10) {
            e1Var3.setTextColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21376ng));
            e1Var3.setIconColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.k6.H6));
        }
        e1Var3.j(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        e1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(e1Var3, w7.z5.n(-1, 48));
        e1Var3.setOnClickListener(new bq0(ir0Var, 1));
        org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(0, ir0Var.getContext(), ir0Var.resourcesProvider, true, true);
        if (z10) {
            e1Var4.setTextColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21376ng));
            e1Var4.setIconColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.k6.H6));
        }
        e1Var4.j(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        e1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(e1Var4, w7.z5.n(-1, 48));
        e1Var4.setOnClickListener(new bq0(ir0Var, 2));
        b1(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.k6.I5, ir0Var.resourcesProvider);
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.z5.n(-1, -2));
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        ir0Var.K0 = m1Var;
        m1Var.f21630b = false;
        m1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        ir0Var.K0.setOutsideTouchable(true);
        ir0Var.K0.setClippingEnabled(true);
        ir0Var.K0.setInputMethodMode(2);
        ir0Var.K0.setSoftInputMode(0);
        ir0Var.K0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        ir0Var.K0.setFocusable(true);
        int[] iArr = new int[2];
        y1Var.getLocationInWindow(iArr);
        if (ir0Var.keyboardVisible && (snVar = ir0Var.f27418g0) != null && snVar.f41561j1.getMeasuredHeight() > AndroidUtilities.dp(58.0f)) {
            measuredHeight = y1Var.getMeasuredHeight() + iArr[1];
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
        }
        ir0Var.K0.showAtLocation(y1Var, 51, AndroidUtilities.dp(8.0f) + ((y1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
        ir0Var.K0.b();
        try {
            y1Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void p(ir0 ir0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
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
        mq0 mq0Var;
        long j13;
        long j14;
        Long l12;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue4;
        String charSequence3;
        long longValue5;
        String[] strArr2 = ir0Var.P;
        nq0 nq0Var = ir0Var.d;
        mq0 mq0Var2 = ir0Var.f27411c;
        HashMap hashMap2 = ir0Var.W;
        Long l13 = 0L;
        a0.h hVar = ir0Var.V;
        ArrayList arrayList3 = ir0Var.O;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i14 = 0;
            boolean z12 = false;
            while (true) {
                if (i14 < hVar.m()) {
                    long j15 = hVar.j(i14);
                    boolean isMonoForum = MessagesController.getInstance(ir0Var.currentAccount).isMonoForum(j15);
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
                        mq0Var = mq0Var2;
                        j13 = j15;
                        j14 = DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    } else {
                        mq0Var = mq0Var2;
                        j13 = j15;
                        j14 = 0;
                    }
                    if (tL_forumTopic3 != null && !isMonoForum) {
                        l12 = l13;
                        messageObject3 = new MessageObject(ir0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    } else {
                        l12 = l13;
                        messageObject3 = null;
                    }
                    if (messageObject3 != null) {
                        messageObject3.isTopicMainMessage = true;
                    }
                    if (mq0Var.getTag() != null && nq0Var.f29989a.length() > 0) {
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
                        SendMessagesHelper.getInstance(ir0Var.currentAccount).sendMessage(of3);
                    } else {
                        messageObject4 = messageObject3;
                        arrayList2 = arrayList3;
                    }
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(ir0Var.currentAccount);
                    ArrayList<MessageObject> arrayList5 = ir0Var.O;
                    boolean z13 = !ir0Var.J0;
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
                        f5.t0(sendMessage, ir0Var.f27418g0, null);
                        if (sendMessage != 0) {
                            break;
                        }
                    }
                    i14++;
                    arrayList3 = arrayList2;
                    mq0Var2 = mq0Var;
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
                ir0Var.W0(hVar, size2, tL_forumTopic2, !z12);
            }
        } else {
            uq0 uq0Var = ir0Var.X;
            if (uq0Var != null) {
                i11 = uq0Var.e;
            } else {
                i11 = 0;
            }
            if (ir0Var.G0 != null) {
                int i16 = 0;
                boolean z14 = false;
                while (i16 < hVar.m()) {
                    long j17 = hVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(ir0Var.currentAccount).isMonoForum(j17);
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
                        messageObject2 = new MessageObject(ir0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                    } else {
                        strArr = strArr2;
                        messageObject2 = null;
                    }
                    if (ir0Var.G0 == null) {
                        if (mq0Var2.getTag() != null && nq0Var.f29989a.length() > 0) {
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
                        if (mq0Var2.getTag() != null && nq0Var.f29989a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(ir0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j17, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j17, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = ir0Var.G0;
                    }
                    if (l10 == null) {
                        longValue3 = 0;
                    } else {
                        longValue3 = l10.longValue();
                    }
                    of2.payStars = longValue3;
                    of2.monoForumPeer = j12;
                    SendMessagesHelper.getInstance(ir0Var.currentAccount).sendMessage(of2);
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
                        boolean isMonoForum3 = MessagesController.getInstance(ir0Var.currentAccount).isMonoForum(j18);
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
                            messageObject = new MessageObject(ir0Var.currentAccount, tL_forumTopic5.topicStartMessage, false, false);
                        } else {
                            c10 = 0;
                            messageObject = null;
                        }
                        if (mq0Var2.getTag() != null && nq0Var.f29989a.length() > 0) {
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
                            SendMessagesHelper.getInstance(ir0Var.currentAccount).sendMessage(of4);
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
                        SendMessagesHelper.getInstance(ir0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z15;
                } else {
                    i12 = 0;
                    z11 = false;
                    ir0Var.W0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i12)), !z11);
                }
            }
            i12 = 0;
            ir0Var.W0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i12)), !z11);
        }
        xq0 xq0Var = ir0Var.f27433t0;
        if (xq0Var != null) {
            xq0Var.H();
        }
        ir0Var.dismiss();
    }

    public static void q(ir0 ir0Var, int i10) {
        TLRPC.Dialog dialog;
        ArrayList arrayList;
        ArrayList arrayList2;
        k20 k20Var = ir0Var.f27442z0;
        HashMap hashMap = ir0Var.W;
        a0.h hVar = ir0Var.V;
        ar0 ar0Var = ir0Var.L;
        fr0 fr0Var = ir0Var.M;
        if (fr0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = ir0Var.D0;
            if (dialog2 != null) {
                hVar.k(dialog2, dialog2.f20347id);
                hashMap.remove(dialog2);
                ir0Var.g1(2);
                if (ir0Var.M0 || ir0Var.N0) {
                    if (((TLRPC.Dialog) ar0Var.e.f(dialog2.f20347id)) == null) {
                        ar0Var.e.k(dialog2, dialog2.f20347id);
                        ar0Var.d.add(!arrayList2.isEmpty(), dialog2);
                    }
                    ar0Var.l();
                    ir0Var.B0 = false;
                    k20Var.f27836r.setText("");
                    ir0Var.P0(false);
                }
                for (int i11 = 0; i11 < ir0Var.U0().getChildCount(); i11++) {
                    View childAt = ir0Var.U0().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.g7) {
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                        if (g7Var.getCurrentDialog() == ir0Var.D0.f20347id) {
                            g7Var.d(null, false, true);
                            g7Var.b(true, true);
                        }
                    }
                }
                ir0Var.Q0();
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic E = fr0Var.E(i10);
        if (E != null && (dialog = ir0Var.D0) != null) {
            long j10 = dialog.f20347id;
            boolean isMonoForum = MessagesController.getInstance(ir0Var.currentAccount).isMonoForum(j10);
            TLRPC.Dialog dialog3 = ir0Var.D0;
            hVar.k(dialog3, j10);
            hashMap.put(dialog3, E);
            ir0Var.g1(2);
            if (ir0Var.M0 || ir0Var.N0) {
                if (((TLRPC.Dialog) ar0Var.e.f(dialog3.f20347id)) == null) {
                    ar0Var.e.k(dialog3, dialog3.f20347id);
                    ar0Var.d.add(!arrayList.isEmpty(), dialog3);
                }
                ar0Var.l();
                ir0Var.B0 = false;
                k20Var.f27836r.setText("");
                ir0Var.P0(false);
            }
            for (int i12 = 0; i12 < ir0Var.U0().getChildCount(); i12++) {
                View childAt2 = ir0Var.U0().getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) childAt2;
                    if (g7Var2.getCurrentDialog() == ir0Var.D0.f20347id) {
                        g7Var2.d(E, isMonoForum, true);
                        g7Var2.b(true, true);
                    }
                }
            }
            ir0Var.Q0();
        }
    }

    public static void z0(ir0 ir0Var) {
        lq0 lq0Var;
        int i10;
        int i11;
        lq0 lq0Var2 = ir0Var.G;
        lq0 lq0Var3 = ir0Var.H;
        mm0 mm0Var = ir0Var.F;
        if (!ir0Var.f27432s0) {
            if (ir0Var.M0) {
                lq0Var = lq0Var3;
            } else {
                lq0Var = lq0Var2;
            }
            if (lq0Var.getChildCount() > 0) {
                View childAt = lq0Var.getChildAt(0);
                for (int i12 = 0; i12 < lq0Var.getChildCount(); i12++) {
                    if (lq0Var.getChildAt(i12).getTop() < childAt.getTop()) {
                        childAt = lq0Var.getChildAt(i12);
                    }
                }
                wl0 wl0Var = (wl0) lq0Var.G(childAt);
                int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
                if (top > 0 && wl0Var != null && wl0Var.b() == 0) {
                    i10 = top;
                } else {
                    i10 = 0;
                }
                if (top >= 0 && wl0Var != null && wl0Var.b() == 0) {
                    ir0Var.L0 = childAt.getTop();
                    ir0Var.Y0(false);
                } else {
                    ir0Var.L0 = Integer.MAX_VALUE;
                    ir0Var.Y0(true);
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
                        wl0 wl0Var2 = (wl0) mm0Var.G(childAt2);
                        int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
                        if (top2 > 0 && wl0Var2 != null && wl0Var2.b() == 0) {
                            i11 = top2;
                        } else {
                            i11 = 0;
                        }
                        if (top2 >= 0 && wl0Var2 != null && wl0Var2.b() == 0) {
                            ir0Var.L0 = childAt2.getTop();
                            ir0Var.Y0(false);
                        } else {
                            ir0Var.L0 = Integer.MAX_VALUE;
                            ir0Var.Y0(true);
                            top2 = i11;
                        }
                        top = AndroidUtilities.lerp(top, top2, mm0Var.getAlpha());
                    } else {
                        return;
                    }
                }
                int i14 = ir0Var.f27428q0;
                if (i14 != top) {
                    ir0Var.f27430r0 = i14;
                    float f7 = top;
                    int i15 = (int) (ir0Var.f27434u0 + f7);
                    ir0Var.f27428q0 = i15;
                    lq0Var2.setTopGlowOffset(i15);
                    int i16 = (int) (ir0Var.f27434u0 + f7);
                    ir0Var.f27428q0 = i16;
                    lq0Var3.setTopGlowOffset(i16);
                    int i17 = (int) (f7 + ir0Var.f27434u0);
                    ir0Var.f27428q0 = i17;
                    mm0Var.setTopGlowOffset(i17);
                    ir0Var.f27408b.setTranslationY(ir0Var.f27428q0 + ir0Var.f27434u0);
                    ir0Var.R.setTranslationY(ir0Var.f27428q0 + ir0Var.f27434u0);
                    ir0Var.containerView.invalidate();
                }
            }
        }
    }

    public final void P0(boolean z10) {
        k20 k20Var = this.f27442z0;
        ei.e2 e2Var = k20Var.f27836r;
        ei.e2 e2Var2 = k20Var.f27836r;
        boolean isEmpty = TextUtils.isEmpty(e2Var.getText());
        lq0 lq0Var = this.G;
        lq0 lq0Var2 = this.H;
        boolean z11 = true;
        if (isEmpty && ((!this.keyboardVisible || !e2Var2.hasFocus()) && !this.N0)) {
            if (this.D0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(lq0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(lq0Var2, false);
            }
            z11 = false;
        } else {
            this.B0 = true;
            if (this.D0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(lq0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(lq0Var2, true);
            }
        }
        if (this.M0 == z11 && !z10) {
            return;
        }
        this.M0 = z11;
        er0 er0Var = this.N;
        er0Var.l();
        this.L.l();
        if (this.M0) {
            if (this.L0 == Integer.MAX_VALUE) {
                ((s4.b0) lq0Var2.getLayoutManager()).h1(0, -lq0Var2.getPaddingTop());
            } else {
                ((s4.b0) lq0Var2.getLayoutManager()).h1(0, this.L0 - lq0Var2.getPaddingTop());
            }
            er0Var.E(e2Var2.getText().toString());
            return;
        }
        int i10 = this.L0;
        s4.s sVar = this.I;
        if (i10 == Integer.MAX_VALUE) {
            sVar.h1(0, 0);
        } else {
            sVar.h1(0, 0);
        }
    }

    public final void Q0() {
        float f7;
        TLRPC.Dialog dialog = this.D0;
        if (dialog != null) {
            org.telegram.ui.Cells.g7 g7Var = null;
            this.D0 = null;
            for (int i10 = 0; i10 < U0().getChildCount(); i10++) {
                View childAt = U0().getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.g7) && ((org.telegram.ui.Cells.g7) childAt).getCurrentDialog() == dialog.f20347id) {
                    g7Var = childAt;
                }
            }
            if (g7Var == null) {
                return;
            }
            o1.k kVar = this.C0;
            if (kVar != null) {
                kVar.c();
            }
            U0().setVisibility(0);
            k20 k20Var = this.f27442z0;
            k20Var.setVisibility(0);
            ei.e2 e2Var = k20Var.f27836r;
            if (this.M0 || this.N0) {
                this.E0.H.v = true;
                e2Var.requestFocus();
                AndroidUtilities.showKeyboard(e2Var);
            }
            int[] iArr = new int[2];
            o1.k kVar2 = new o1.k(new o1.j(1000.0f));
            o1.l lVar = new o1.l(0.0f);
            org.telegram.ui.sn snVar = this.f27418g0;
            if (snVar != null && snVar.f41460b) {
                f7 = 10.0f;
            } else {
                f7 = 800.0f;
            }
            lVar.b(f7);
            lVar.a(1.0f);
            kVar2.f17622u = lVar;
            this.C0 = kVar2;
            kVar2.b(new aq0(this, g7Var, iArr, 0));
            this.C0.a(new hb(this, 5));
            this.C0.h();
        }
    }

    public final void R0() {
        boolean z10 = false;
        if (this.f27423l0 != null || this.f27427p0[0] != null) {
            try {
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", T0()));
                xq0 xq0Var = this.f27433t0;
                if (xq0Var != null) {
                    xq0Var.g0();
                } else if (this.f27419h0 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f27423l0;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z10 = true;
                    }
                    ((LaunchActivity) this.f27419h0).I0(new i2.x(5, z10));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final String T0() {
        String str;
        String str2;
        String[] strArr = this.f27427p0;
        uq0 uq0Var = this.X;
        if (uq0Var != null) {
            str2 = strArr[uq0Var.e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f27423l0;
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
        xp xpVar = this.f27417f0;
        if (xpVar != null && xpVar.f32618a.f24296q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.f27412c0)).build().toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final mm0 U0() {
        if (!this.M0 && !this.N0) {
            return this.G;
        }
        return this.H;
    }

    public final void V0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        mm0 mm0Var = this.F;
        mm0Var.setPivotX(width);
        mm0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        mm0Var.setScaleX(f11);
        mm0Var.setScaleY(f11);
        mm0Var.setAlpha(f7);
        mm0 U0 = U0();
        U0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        U0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        U0.setScaleX(f12);
        U0.setScaleY(f12);
        float f13 = 1.0f - f7;
        U0.setAlpha(f13);
        k20 k20Var = this.f27442z0;
        k20Var.setPivotX(k20Var.getWidth() / 2.0f);
        k20Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        k20Var.setScaleX(f14);
        k20Var.setScaleY(f14);
        k20Var.setAlpha(f13);
        org.telegram.ui.ActionBar.k kVar = this.A0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.setAlpha(f7);
        mm0Var.getLocationInWindow(iArr);
        float interpolation = bs.f25134g.getInterpolation(f7);
        for (int i10 = 0; i10 < U0.getChildCount(); i10++) {
            View childAt = U0.getChildAt(i10);
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
        for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
            View childAt2 = mm0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.h7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y3 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((mm0Var.getTranslationY() + y3) - view.getY()))));
            }
        }
        this.containerView.requestLayout();
        U0.invalidate();
    }

    public final void Y0(boolean z10) {
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
            animatorSetArr[0].addListener(new rq0(this, z10, 0));
            animatorSetArr[0].start();
        }
    }

    public final void Z0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        ir0 ir0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        dr0 dr0Var;
        if (dialog instanceof zq0) {
            X0(view);
        } else if (((view instanceof org.telegram.ui.Cells.g7) && ((org.telegram.ui.Cells.g7) view).F) || ((view instanceof org.telegram.ui.Cells.i6) && ((org.telegram.ui.Cells.i6) view).f22521n0)) {
            d1(dialog.f20347id, view);
        } else {
            mm0 mm0Var = this.F;
            if (mm0Var.getVisibility() == 8 && (activity = this.f27419h0) != null) {
                boolean isChatDialog = DialogObject.isChatDialog(dialog.f20347id);
                int i10 = this.Q;
                if (isChatDialog) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f20347id));
                    if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.f20347id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        String string = LocaleController.getString(R.string.SendMessageTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                        c2Var.R = string;
                        if (i10 == 3) {
                            if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                c2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                            } else {
                                c2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                            }
                        } else if (i10 == 2) {
                            if (this.f27426o0) {
                                c2Var.T = LocaleController.getString(R.string.PublicPollCantForward);
                            } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                c2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                            } else {
                                c2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                            }
                        } else {
                            c2Var.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        i2.o1.s(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                } else if (DialogObject.isEncryptedDialog(dialog.f20347id) && i10 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String string2 = LocaleController.getString(R.string.SendMessageTitle);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20678a;
                    c2Var2.R = string2;
                    if (i10 == 3) {
                        c2Var2.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i10 != 0) {
                        c2Var2.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        c2Var2.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    i2.o1.s(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
                long j10 = dialog.f20347id;
                a0.h hVar = this.V;
                if (hVar.h(j10) >= 0) {
                    hVar.l(dialog.f20347id);
                    this.W.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.i6) {
                        ((org.telegram.ui.Cells.i6) view).s(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).b(false, true);
                    }
                    g1(1);
                    ir0Var = this;
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.f20347id));
                    TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f20347id));
                    if ((!UserObject.isBotForum(user) || (((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f20490id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f20490id))) && (!DialogObject.isChatDialog(dialog.f20347id) || (!ChatObject.isForum(chat2) && (!ChatObject.isMonoForum(chat2) || !ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                        ir0Var = this;
                        hVar.k(dialog, dialog.f20347id);
                        if (view instanceof org.telegram.ui.Cells.i6) {
                            ((org.telegram.ui.Cells.i6) view).s(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.g7) {
                            ((org.telegram.ui.Cells.g7) view).b(true, true);
                        }
                        g1(2);
                        long j11 = UserConfig.getInstance(ir0Var.currentAccount).clientUserId;
                        if (ir0Var.M0) {
                            ar0 ar0Var = ir0Var.L;
                            a0.h hVar2 = ar0Var.e;
                            ArrayList arrayList = ar0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.f20347id);
                            if (dialog2 == null) {
                                ar0Var.e.k(dialog, dialog.f20347id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f20347id != j11) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            ar0Var.l();
                            ir0Var.B0 = false;
                            k20 k20Var = ir0Var.f27442z0;
                            k20Var.f27836r.setText("");
                            P0(false);
                            AndroidUtilities.hideKeyboard(k20Var.f27836r);
                        }
                    } else {
                        this.D0 = dialog;
                        this.J.h1(0, this.f27428q0 - mm0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        pq0 pq0Var = new pq0(this, dialog, atomicReference, view);
                        atomicReference.set(new j90(this, atomicReference, pq0Var, dialog, 5));
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                        int i11 = NotificationCenter.topicsDidLoaded;
                        notificationCenter.addObserver(pq0Var, i11);
                        if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.f20347id) != null) {
                            pq0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.f20347id));
                            return;
                        }
                        MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.f20347id);
                        AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                er0 er0Var = ir0Var.N;
                if (er0Var != null && (dr0Var = er0Var.H) != null) {
                    dr0Var.q(0, dr0Var.h());
                }
            }
        }
    }

    public final void a1(final boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            a0.h hVar = this.V;
            int m10 = hVar.m();
            mq0 mq0Var = this.f27411c;
            nq0 nq0Var = this.d;
            boolean z11 = true;
            if (i14 < m10) {
                long j10 = hVar.j(i14);
                if (f5.h(getContext(), this.currentAccount, j10, (mq0Var.getTag() == null || nq0Var.f29989a.length() <= 0) ? false : false)) {
                    return;
                }
                i14++;
            } else {
                Editable text = nq0Var.getText();
                lu luVar = nq0Var.f29989a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                xp xpVar = this.f27417f0;
                if (xpVar != null && xpVar.f32618a.f24296q) {
                    i10 = this.f27412c0;
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
                        if (mq0Var.getTag() != null && luVar.length() > 0 && sendPaidMessagesStars > 0) {
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
                    uq0 uq0Var = this.X;
                    if (uq0Var != null) {
                        i11 = uq0Var.e;
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
                            if (this.G0 != null && mq0Var.getTag() != null && luVar.length() > 0 && charSequenceArr[i18] != null && sendPaidMessagesStars2 > 0) {
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
                                if (mq0Var.getTag() != null && luVar.length() > 0 && sendPaidMessagesStars3 > 0) {
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
                f5.c0(this.currentAccount, arrayList, i12, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        ir0.p(ir0.this, charSequenceArr, entities, z10, i23, (HashMap) obj);
                    }
                });
                return;
            }
        }
    }

    public final void c1(boolean z10) {
        boolean z11;
        Integer num;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        mq0 mq0Var = this.f27411c;
        if (mq0Var.getTag() != null) {
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
        mq0Var.setTag(num);
        nq0 nq0Var = this.d;
        if (nq0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(nq0Var.getEditText());
        }
        nq0Var.k(true);
        FrameLayout frameLayout = this.f27414d0;
        mq0 mq0Var2 = this.f27416f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            mq0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            mq0Var2.setVisibility(0);
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
            WeakHashMap weakHashMap = r0.i0.f45242a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.f27440y;
        if (linearLayout != null) {
            if (!z10) {
                i11 = 1;
            }
            WeakHashMap weakHashMap2 = r0.i0.f45242a;
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
        arrayList.add(ObjectAnimator.ofFloat(mq0Var, property, f7));
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
        arrayList.add(ObjectAnimator.ofFloat(mq0Var2, property2, f10));
        Property property3 = View.SCALE_Y;
        if (z10) {
            f16 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(mq0Var2, property3, f16));
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(mq0Var2, property, f11));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.T[1];
            if (!z10) {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
        }
        FrameLayout frameLayout3 = this.f27431s;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.f27420i0 && z10) {
                if (this.f27415e0 != null) {
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
        this.E.addListener(new rq0(this, z10, 1));
        this.E.start();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void d1(long j10, View view) {
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
        FrameLayout frameLayout = this.f27436w;
        if (premiumFeaturesBlocked) {
            J = new xc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = new xc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new dq0(this, 1));
        }
        J.j();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            ar0 ar0Var = this.L;
            if (ar0Var != null) {
                ar0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override
    public final void dismiss() {
        nq0 nq0Var = this.d;
        if (nq0Var != null) {
            AndroidUtilities.hideKeyboard(nq0Var.getEditText());
        }
        this.Z = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        nq0 nq0Var = this.d;
        if (nq0Var != null) {
            nq0Var.o();
        }
    }

    public final void e1() {
        org.telegram.ui.ActionBar.o1 o1Var;
        mq0 mq0Var = this.f27411c;
        if (mq0Var == null) {
            return;
        }
        nq0 nq0Var = this.d;
        if (nq0Var != null && nq0Var.m()) {
            nq0Var.getEmojiPaddingShown();
        } else {
            tq0 tq0Var = this.E0;
            if (tq0Var != null && (o1Var = tq0Var.H) != null && !o1Var.f21721f) {
                AndroidUtilities.dp(20.0f);
            }
        }
        float f7 = 0.0f;
        FrameLayout frameLayout = this.f27414d0;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f7 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f7);
        }
        float f10 = -f7;
        mq0Var.setTranslationY(f10);
        this.f27416f.setTranslationY(f10);
    }

    public final void f1() {
        org.telegram.ui.ActionBar.n5 n5Var = this.v;
        if (n5Var != null) {
            String T0 = T0();
            if (T0.startsWith("https://")) {
                T0 = T0.substring(8);
            } else if (T0.startsWith("http://")) {
                T0 = T0.substring(7);
            }
            n5Var.l(T0, false);
        }
    }

    public final void g1(int i10) {
        int size;
        boolean z10;
        boolean z11;
        a0.h hVar = this.V;
        if (hVar.m() == 0) {
            c1(false);
            return;
        }
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        Object tag = this.f27411c.getTag();
        nq0 nq0Var = this.d;
        if (tag != null && nq0Var.f29989a.length() > 0) {
            size++;
        }
        long j10 = 0;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            long j11 = ((TLRPC.Dialog) hVar.n(i11)).f20347id;
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
        ki.y1 y1Var = this.e;
        y1Var.g(max, z10);
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        y1Var.i(size, j10, z11);
        c1(true);
        nq0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), y1Var.l()), 0);
    }

    @Override
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.Y;
    }

    @Override
    public final void onBackPressed() {
        if (this.D0 != null) {
            Q0();
            return;
        }
        nq0 nq0Var = this.d;
        if (nq0Var != null && nq0Var.e) {
            nq0Var.k(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z10;
        try {
            super.onThemeColorsChanged();
            gh.c cVar = this.S0;
            if (cVar != null) {
                cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
            }
            if (this.container != null) {
                if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5)) > 0.721f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != this.f27413c1) {
                    this.f27413c1 = z10;
                    AndroidUtilities.setLightNavigationBar(this.container, z10);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public ir0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    public ir0(android.content.Context r38, org.telegram.ui.sn r39, java.util.ArrayList r40, java.lang.String r41, java.lang.String r42, boolean r43, java.lang.String r44, java.lang.String r45, boolean r46, boolean r47, boolean r48, java.lang.Integer r49, org.telegram.ui.ActionBar.g6 r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ir0.<init>(android.content.Context, org.telegram.ui.sn, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.g6):void");
    }

    public void X0(View view) {
    }

    public void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
