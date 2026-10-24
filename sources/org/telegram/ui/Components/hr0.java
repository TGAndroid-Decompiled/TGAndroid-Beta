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
public class hr0 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f27117d1 = 0;
    public final org.telegram.ui.ActionBar.k A0;
    public boolean B0;
    public o1.k C0;
    public TLRPC.Dialog D0;
    public AnimatorSet E;
    public final sq0 E0;
    public final lm0 F;
    public ArrayList F0;
    public final kq0 G;
    public TL_stories.StoryItem G0;
    public final kq0 H;
    public i0.b H0;
    public final s4.s I;
    public int I0;
    public final s4.s J;
    public boolean J0;
    public final vz K;
    public org.telegram.ui.ActionBar.m1 K0;
    public final zq0 L;
    public int L0;
    public final er0 M;
    public boolean M0;
    public final dr0 N;
    public boolean N0;
    public final ArrayList O;
    public int O0;
    public final String[] P;
    public final bh.f P0;
    public final int Q;
    public final gh.d Q0;
    public final vx0 R;
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
    public final tq0 X;
    public final dh.d X0;
    public int Y;
    public final bh.c Y0;
    public boolean Z;
    public final dh.d Z0;
    public final boolean f27118a0;
    public final ArrayList f27119a1;
    public final FrameLayout f27120b;
    public boolean f27121b0;
    public final RectF f27122b1;
    public final lq0 f27123c;
    public final int f27124c0;
    public boolean f27125c1;
    public final mq0 d;
    public final FrameLayout f27126d0;
    public final ki.y1 e;
    public final LinearLayout f27127e0;
    public final lq0 f27128f;
    public final vp f27129f0;
    public final org.telegram.ui.sn f27130g0;
    public final FrameLayout h;
    public final Activity f27131h0;
    public final boolean f27132i0;
    public boolean f27133j0;
    public final TextPaint f27134k0;
    public TLRPC.TL_exportedMessageLink f27135l0;
    public boolean m0;
    public float f27136n;
    public boolean f27137n0;
    public final boolean f27138o0;
    public final String[] f27139p0;
    public int f27140q0;
    public final ai.jc f27141r;
    public int f27142r0;
    public final FrameLayout f27143s;
    public boolean f27144s0;
    public wq0 f27145t0;
    public float f27146u0;
    public final org.telegram.ui.ActionBar.n5 v;
    public float f27147v0;
    public final FrameLayout f27148w;
    public float f27149w0;
    public final FrameLayout f27150x;
    public ValueAnimator f27151x0;
    public final LinearLayout f27152y;
    public final ql0 f27153y0;
    public final i20 f27154z0;

    public hr0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, g6Var);
    }

    public static void J0(hr0 hr0Var) {
        float f7;
        RectF rectF = hr0Var.f27122b1;
        bh.f fVar = hr0Var.P0;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            rectF.set(0.0f, 0.0f, hr0Var.containerView.getMeasuredWidth(), hr0Var.containerView.getMeasuredHeight());
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            fVar.g(1, hr0Var.f27119a1);
            fVar.e(hr0Var.W0, hr0Var.containerView.getMeasuredWidth(), hr0Var.containerView.getMeasuredHeight());
        }
    }

    public static int O0(hr0 hr0Var) {
        kq0 kq0Var = hr0Var.G;
        if (kq0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = kq0Var.getChildAt(0);
            vl0 vl0Var = (vl0) kq0Var.G(childAt);
            if (vl0Var != null) {
                int paddingTop = kq0Var.getPaddingTop();
                if (vl0Var.c() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    public static hr0 S0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        ArrayList arrayList;
        if (messageObject != null) {
            arrayList = org.telegram.messenger.v0.k(messageObject);
        } else {
            arrayList = null;
        }
        return new hr0(context, arrayList, str, null, z10, str2, null, false);
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

    public static void m(hr0 hr0Var, AtomicReference atomicReference, oq0 oq0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        oq0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, hr0Var.currentAccount, Long.valueOf(-dialog.f20348id));
    }

    public static boolean n(final hr0 hr0Var) {
        int measuredHeight;
        org.telegram.ui.sn snVar;
        ki.y1 y1Var = hr0Var.e;
        boolean z10 = hr0Var.f27132i0;
        Activity activity = hr0Var.f27131h0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(hr0Var.getContext());
        linearLayout.setOrientation(1);
        if (hr0Var.O != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, hr0Var.resourcesProvider);
            if (z10) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.fg, actionBarPopupWindow$ActionBarPopupWindowLayout, hr0Var.resourcesProvider);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new pq0(hr0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new bq0(hr0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, hr0Var.getContext(), hr0Var.resourcesProvider, true, false);
            if (z10) {
                e1Var.setTextColor(hr0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21377ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.z5.n(-1, 48));
            e1Var.j(LocaleController.getString(R.string.ShowSendersName), 0, null);
            hr0Var.J0 = true;
            e1Var.setChecked(true);
            final org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(1, hr0Var.getContext(), hr0Var.resourcesProvider, false, true);
            if (z10) {
                e1Var2.setTextColor(hr0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21377ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.z5.n(-1, 48));
            e1Var2.j(LocaleController.getString(R.string.HideSendersName), 0, null);
            e1Var2.setChecked(!hr0Var.J0);
            e1Var.setOnClickListener(new View.OnClickListener(hr0Var) {
                public final hr0 f26407b;

                {
                    this.f26407b = hr0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            hr0 hr0Var2 = this.f26407b;
                            hr0Var2.J0 = true;
                            e1Var.setChecked(true);
                            e1Var2.setChecked(!hr0Var2.J0);
                            return;
                        default:
                            hr0 hr0Var3 = this.f26407b;
                            hr0Var3.J0 = false;
                            e1Var.setChecked(false);
                            e1Var2.setChecked(!hr0Var3.J0);
                            return;
                    }
                }
            });
            e1Var2.setOnClickListener(new View.OnClickListener(hr0Var) {
                public final hr0 f26407b;

                {
                    this.f26407b = hr0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            hr0 hr0Var2 = this.f26407b;
                            hr0Var2.J0 = true;
                            e1Var.setChecked(true);
                            e1Var2.setChecked(!hr0Var2.J0);
                            return;
                        default:
                            hr0 hr0Var3 = this.f26407b;
                            hr0Var3.J0 = false;
                            e1Var.setChecked(false);
                            e1Var2.setChecked(!hr0Var3.J0);
                            return;
                    }
                }
            });
            b1(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.k6.I5, hr0Var.resourcesProvider);
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.z5.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, hr0Var.resourcesProvider);
        if (z10) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.fg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new pq0(hr0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new bq0(hr0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, hr0Var.getContext(), hr0Var.resourcesProvider, true, true);
        if (z10) {
            e1Var3.setTextColor(hr0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21377ng));
            e1Var3.setIconColor(hr0Var.getThemedColor(org.telegram.ui.ActionBar.k6.H6));
        }
        e1Var3.j(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        e1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(e1Var3, w7.z5.n(-1, 48));
        e1Var3.setOnClickListener(new aq0(hr0Var, 1));
        org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(0, hr0Var.getContext(), hr0Var.resourcesProvider, true, true);
        if (z10) {
            e1Var4.setTextColor(hr0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21377ng));
            e1Var4.setIconColor(hr0Var.getThemedColor(org.telegram.ui.ActionBar.k6.H6));
        }
        e1Var4.j(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        e1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(e1Var4, w7.z5.n(-1, 48));
        e1Var4.setOnClickListener(new aq0(hr0Var, 2));
        b1(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.k6.I5, hr0Var.resourcesProvider);
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.z5.n(-1, -2));
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        hr0Var.K0 = m1Var;
        m1Var.f21631b = false;
        m1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        hr0Var.K0.setOutsideTouchable(true);
        hr0Var.K0.setClippingEnabled(true);
        hr0Var.K0.setInputMethodMode(2);
        hr0Var.K0.setSoftInputMode(0);
        hr0Var.K0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        hr0Var.K0.setFocusable(true);
        int[] iArr = new int[2];
        y1Var.getLocationInWindow(iArr);
        if (hr0Var.keyboardVisible && (snVar = hr0Var.f27130g0) != null && snVar.f41558j1.getMeasuredHeight() > AndroidUtilities.dp(58.0f)) {
            measuredHeight = y1Var.getMeasuredHeight() + iArr[1];
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
        }
        hr0Var.K0.showAtLocation(y1Var, 51, AndroidUtilities.dp(8.0f) + ((y1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
        hr0Var.K0.b();
        try {
            y1Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void p(hr0 hr0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
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
        lq0 lq0Var;
        long j13;
        long j14;
        Long l12;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue4;
        String charSequence3;
        long longValue5;
        String[] strArr2 = hr0Var.P;
        mq0 mq0Var = hr0Var.d;
        lq0 lq0Var2 = hr0Var.f27123c;
        HashMap hashMap2 = hr0Var.W;
        Long l13 = 0L;
        a0.h hVar = hr0Var.V;
        ArrayList arrayList3 = hr0Var.O;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i14 = 0;
            boolean z12 = false;
            while (true) {
                if (i14 < hVar.m()) {
                    long j15 = hVar.j(i14);
                    boolean isMonoForum = MessagesController.getInstance(hr0Var.currentAccount).isMonoForum(j15);
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
                        lq0Var = lq0Var2;
                        j13 = j15;
                        j14 = DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    } else {
                        lq0Var = lq0Var2;
                        j13 = j15;
                        j14 = 0;
                    }
                    if (tL_forumTopic3 != null && !isMonoForum) {
                        l12 = l13;
                        messageObject3 = new MessageObject(hr0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    } else {
                        l12 = l13;
                        messageObject3 = null;
                    }
                    if (messageObject3 != null) {
                        messageObject3.isTopicMainMessage = true;
                    }
                    if (lq0Var.getTag() != null && mq0Var.f29381a.length() > 0) {
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
                        SendMessagesHelper.getInstance(hr0Var.currentAccount).sendMessage(of3);
                    } else {
                        messageObject4 = messageObject3;
                        arrayList2 = arrayList3;
                    }
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(hr0Var.currentAccount);
                    ArrayList<MessageObject> arrayList5 = hr0Var.O;
                    boolean z13 = !hr0Var.J0;
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
                        d5.s0(sendMessage, hr0Var.f27130g0, null);
                        if (sendMessage != 0) {
                            break;
                        }
                    }
                    i14++;
                    arrayList3 = arrayList2;
                    lq0Var2 = lq0Var;
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
                hr0Var.W0(hVar, size2, tL_forumTopic2, !z12);
            }
        } else {
            tq0 tq0Var = hr0Var.X;
            if (tq0Var != null) {
                i11 = tq0Var.e;
            } else {
                i11 = 0;
            }
            if (hr0Var.G0 != null) {
                int i16 = 0;
                boolean z14 = false;
                while (i16 < hVar.m()) {
                    long j17 = hVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(hr0Var.currentAccount).isMonoForum(j17);
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
                        messageObject2 = new MessageObject(hr0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                    } else {
                        strArr = strArr2;
                        messageObject2 = null;
                    }
                    if (hr0Var.G0 == null) {
                        if (lq0Var2.getTag() != null && mq0Var.f29381a.length() > 0) {
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
                        if (lq0Var2.getTag() != null && mq0Var.f29381a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(hr0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j17, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j17, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = hr0Var.G0;
                    }
                    if (l10 == null) {
                        longValue3 = 0;
                    } else {
                        longValue3 = l10.longValue();
                    }
                    of2.payStars = longValue3;
                    of2.monoForumPeer = j12;
                    SendMessagesHelper.getInstance(hr0Var.currentAccount).sendMessage(of2);
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
                        boolean isMonoForum3 = MessagesController.getInstance(hr0Var.currentAccount).isMonoForum(j18);
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
                            messageObject = new MessageObject(hr0Var.currentAccount, tL_forumTopic5.topicStartMessage, false, false);
                        } else {
                            c10 = 0;
                            messageObject = null;
                        }
                        if (lq0Var2.getTag() != null && mq0Var.f29381a.length() > 0) {
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
                            SendMessagesHelper.getInstance(hr0Var.currentAccount).sendMessage(of4);
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
                        SendMessagesHelper.getInstance(hr0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z15;
                } else {
                    i12 = 0;
                    z11 = false;
                    hr0Var.W0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i12)), !z11);
                }
            }
            i12 = 0;
            hr0Var.W0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i12)), !z11);
        }
        wq0 wq0Var = hr0Var.f27145t0;
        if (wq0Var != null) {
            wq0Var.H();
        }
        hr0Var.dismiss();
    }

    public static void q(hr0 hr0Var, int i10) {
        TLRPC.Dialog dialog;
        ArrayList arrayList;
        ArrayList arrayList2;
        i20 i20Var = hr0Var.f27154z0;
        HashMap hashMap = hr0Var.W;
        a0.h hVar = hr0Var.V;
        zq0 zq0Var = hr0Var.L;
        er0 er0Var = hr0Var.M;
        if (er0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = hr0Var.D0;
            if (dialog2 != null) {
                hVar.k(dialog2, dialog2.f20348id);
                hashMap.remove(dialog2);
                hr0Var.g1(2);
                if (hr0Var.M0 || hr0Var.N0) {
                    if (((TLRPC.Dialog) zq0Var.e.f(dialog2.f20348id)) == null) {
                        zq0Var.e.k(dialog2, dialog2.f20348id);
                        zq0Var.d.add(!arrayList2.isEmpty(), dialog2);
                    }
                    zq0Var.l();
                    hr0Var.B0 = false;
                    i20Var.f27258r.setText("");
                    hr0Var.P0(false);
                }
                for (int i11 = 0; i11 < hr0Var.U0().getChildCount(); i11++) {
                    View childAt = hr0Var.U0().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.g7) {
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                        if (g7Var.getCurrentDialog() == hr0Var.D0.f20348id) {
                            g7Var.d(null, false, true);
                            g7Var.b(true, true);
                        }
                    }
                }
                hr0Var.Q0();
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic E = er0Var.E(i10);
        if (E != null && (dialog = hr0Var.D0) != null) {
            long j10 = dialog.f20348id;
            boolean isMonoForum = MessagesController.getInstance(hr0Var.currentAccount).isMonoForum(j10);
            TLRPC.Dialog dialog3 = hr0Var.D0;
            hVar.k(dialog3, j10);
            hashMap.put(dialog3, E);
            hr0Var.g1(2);
            if (hr0Var.M0 || hr0Var.N0) {
                if (((TLRPC.Dialog) zq0Var.e.f(dialog3.f20348id)) == null) {
                    zq0Var.e.k(dialog3, dialog3.f20348id);
                    zq0Var.d.add(!arrayList.isEmpty(), dialog3);
                }
                zq0Var.l();
                hr0Var.B0 = false;
                i20Var.f27258r.setText("");
                hr0Var.P0(false);
            }
            for (int i12 = 0; i12 < hr0Var.U0().getChildCount(); i12++) {
                View childAt2 = hr0Var.U0().getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) childAt2;
                    if (g7Var2.getCurrentDialog() == hr0Var.D0.f20348id) {
                        g7Var2.d(E, isMonoForum, true);
                        g7Var2.b(true, true);
                    }
                }
            }
            hr0Var.Q0();
        }
    }

    public static void z0(hr0 hr0Var) {
        kq0 kq0Var;
        int i10;
        int i11;
        kq0 kq0Var2 = hr0Var.G;
        kq0 kq0Var3 = hr0Var.H;
        lm0 lm0Var = hr0Var.F;
        if (!hr0Var.f27144s0) {
            if (hr0Var.M0) {
                kq0Var = kq0Var3;
            } else {
                kq0Var = kq0Var2;
            }
            if (kq0Var.getChildCount() > 0) {
                View childAt = kq0Var.getChildAt(0);
                for (int i12 = 0; i12 < kq0Var.getChildCount(); i12++) {
                    if (kq0Var.getChildAt(i12).getTop() < childAt.getTop()) {
                        childAt = kq0Var.getChildAt(i12);
                    }
                }
                vl0 vl0Var = (vl0) kq0Var.G(childAt);
                int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
                if (top > 0 && vl0Var != null && vl0Var.b() == 0) {
                    i10 = top;
                } else {
                    i10 = 0;
                }
                if (top >= 0 && vl0Var != null && vl0Var.b() == 0) {
                    hr0Var.L0 = childAt.getTop();
                    hr0Var.Y0(false);
                } else {
                    hr0Var.L0 = Integer.MAX_VALUE;
                    hr0Var.Y0(true);
                    top = i10;
                }
                if (lm0Var.getVisibility() == 0) {
                    if (lm0Var.getChildCount() > 0) {
                        View childAt2 = lm0Var.getChildAt(0);
                        for (int i13 = 0; i13 < lm0Var.getChildCount(); i13++) {
                            if (lm0Var.getChildAt(i13).getTop() < childAt2.getTop()) {
                                childAt2 = lm0Var.getChildAt(i13);
                            }
                        }
                        vl0 vl0Var2 = (vl0) lm0Var.G(childAt2);
                        int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
                        if (top2 > 0 && vl0Var2 != null && vl0Var2.b() == 0) {
                            i11 = top2;
                        } else {
                            i11 = 0;
                        }
                        if (top2 >= 0 && vl0Var2 != null && vl0Var2.b() == 0) {
                            hr0Var.L0 = childAt2.getTop();
                            hr0Var.Y0(false);
                        } else {
                            hr0Var.L0 = Integer.MAX_VALUE;
                            hr0Var.Y0(true);
                            top2 = i11;
                        }
                        top = AndroidUtilities.lerp(top, top2, lm0Var.getAlpha());
                    } else {
                        return;
                    }
                }
                int i14 = hr0Var.f27140q0;
                if (i14 != top) {
                    hr0Var.f27142r0 = i14;
                    float f7 = top;
                    int i15 = (int) (hr0Var.f27146u0 + f7);
                    hr0Var.f27140q0 = i15;
                    kq0Var2.setTopGlowOffset(i15);
                    int i16 = (int) (hr0Var.f27146u0 + f7);
                    hr0Var.f27140q0 = i16;
                    kq0Var3.setTopGlowOffset(i16);
                    int i17 = (int) (f7 + hr0Var.f27146u0);
                    hr0Var.f27140q0 = i17;
                    lm0Var.setTopGlowOffset(i17);
                    hr0Var.f27120b.setTranslationY(hr0Var.f27140q0 + hr0Var.f27146u0);
                    hr0Var.R.setTranslationY(hr0Var.f27140q0 + hr0Var.f27146u0);
                    hr0Var.containerView.invalidate();
                }
            }
        }
    }

    public final void P0(boolean z10) {
        i20 i20Var = this.f27154z0;
        ei.e2 e2Var = i20Var.f27258r;
        ei.e2 e2Var2 = i20Var.f27258r;
        boolean isEmpty = TextUtils.isEmpty(e2Var.getText());
        kq0 kq0Var = this.G;
        kq0 kq0Var2 = this.H;
        boolean z11 = true;
        if (isEmpty && ((!this.keyboardVisible || !e2Var2.hasFocus()) && !this.N0)) {
            if (this.D0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(kq0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(kq0Var2, false);
            }
            z11 = false;
        } else {
            this.B0 = true;
            if (this.D0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(kq0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(kq0Var2, true);
            }
        }
        if (this.M0 == z11 && !z10) {
            return;
        }
        this.M0 = z11;
        dr0 dr0Var = this.N;
        dr0Var.l();
        this.L.l();
        if (this.M0) {
            if (this.L0 == Integer.MAX_VALUE) {
                ((s4.b0) kq0Var2.getLayoutManager()).h1(0, -kq0Var2.getPaddingTop());
            } else {
                ((s4.b0) kq0Var2.getLayoutManager()).h1(0, this.L0 - kq0Var2.getPaddingTop());
            }
            dr0Var.E(e2Var2.getText().toString());
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
                if ((childAt instanceof org.telegram.ui.Cells.g7) && ((org.telegram.ui.Cells.g7) childAt).getCurrentDialog() == dialog.f20348id) {
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
            i20 i20Var = this.f27154z0;
            i20Var.setVisibility(0);
            ei.e2 e2Var = i20Var.f27258r;
            if (this.M0 || this.N0) {
                this.E0.H.v = true;
                e2Var.requestFocus();
                AndroidUtilities.showKeyboard(e2Var);
            }
            int[] iArr = new int[2];
            o1.k kVar2 = new o1.k(new o1.j(1000.0f));
            o1.l lVar = new o1.l(0.0f);
            org.telegram.ui.sn snVar = this.f27130g0;
            if (snVar != null && snVar.f41457b) {
                f7 = 10.0f;
            } else {
                f7 = 800.0f;
            }
            lVar.b(f7);
            lVar.a(1.0f);
            kVar2.f17622u = lVar;
            this.C0 = kVar2;
            kVar2.b(new zp0(this, g7Var, iArr, 0));
            this.C0.a(new fb(this, 5));
            this.C0.h();
        }
    }

    public final void R0() {
        boolean z10 = false;
        if (this.f27135l0 != null || this.f27139p0[0] != null) {
            try {
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", T0()));
                wq0 wq0Var = this.f27145t0;
                if (wq0Var != null) {
                    wq0Var.g0();
                } else if (this.f27131h0 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f27135l0;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z10 = true;
                    }
                    ((LaunchActivity) this.f27131h0).I0(new i2.x(5, z10));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final String T0() {
        String str;
        String str2;
        String[] strArr = this.f27139p0;
        tq0 tq0Var = this.X;
        if (tq0Var != null) {
            str2 = strArr[tq0Var.e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f27135l0;
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
        vp vpVar = this.f27129f0;
        if (vpVar != null && vpVar.f32005a.f24297q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.f27124c0)).build().toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final lm0 U0() {
        if (!this.M0 && !this.N0) {
            return this.G;
        }
        return this.H;
    }

    public final void V0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        lm0 lm0Var = this.F;
        lm0Var.setPivotX(width);
        lm0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        lm0Var.setScaleX(f11);
        lm0Var.setScaleY(f11);
        lm0Var.setAlpha(f7);
        lm0 U0 = U0();
        U0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        U0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        U0.setScaleX(f12);
        U0.setScaleY(f12);
        float f13 = 1.0f - f7;
        U0.setAlpha(f13);
        i20 i20Var = this.f27154z0;
        i20Var.setPivotX(i20Var.getWidth() / 2.0f);
        i20Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        i20Var.setScaleX(f14);
        i20Var.setScaleY(f14);
        i20Var.setAlpha(f13);
        org.telegram.ui.ActionBar.k kVar = this.A0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.setAlpha(f7);
        lm0Var.getLocationInWindow(iArr);
        float interpolation = zr.f33338g.getInterpolation(f7);
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
        for (int i11 = 0; i11 < lm0Var.getChildCount(); i11++) {
            View childAt2 = lm0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.h7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y3 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((lm0Var.getTranslationY() + y3) - view.getY()))));
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
            animatorSetArr[0].addListener(new qq0(this, z10, 0));
            animatorSetArr[0].start();
        }
    }

    public final void Z0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        hr0 hr0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        cr0 cr0Var;
        if (dialog instanceof yq0) {
            X0(view);
        } else if (((view instanceof org.telegram.ui.Cells.g7) && ((org.telegram.ui.Cells.g7) view).F) || ((view instanceof org.telegram.ui.Cells.i6) && ((org.telegram.ui.Cells.i6) view).f22522n0)) {
            d1(dialog.f20348id, view);
        } else {
            lm0 lm0Var = this.F;
            if (lm0Var.getVisibility() == 8 && (activity = this.f27131h0) != null) {
                boolean isChatDialog = DialogObject.isChatDialog(dialog.f20348id);
                int i10 = this.Q;
                if (isChatDialog) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f20348id));
                    if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.f20348id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        String string = LocaleController.getString(R.string.SendMessageTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                        c2Var.R = string;
                        if (i10 == 3) {
                            if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                c2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                            } else {
                                c2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                            }
                        } else if (i10 == 2) {
                            if (this.f27138o0) {
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
                } else if (DialogObject.isEncryptedDialog(dialog.f20348id) && i10 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String string2 = LocaleController.getString(R.string.SendMessageTitle);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20679a;
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
                long j10 = dialog.f20348id;
                a0.h hVar = this.V;
                if (hVar.h(j10) >= 0) {
                    hVar.l(dialog.f20348id);
                    this.W.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.i6) {
                        ((org.telegram.ui.Cells.i6) view).s(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).b(false, true);
                    }
                    g1(1);
                    hr0Var = this;
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.f20348id));
                    TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f20348id));
                    if ((!UserObject.isBotForum(user) || (((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f20491id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f20491id))) && (!DialogObject.isChatDialog(dialog.f20348id) || (!ChatObject.isForum(chat2) && (!ChatObject.isMonoForum(chat2) || !ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                        hr0Var = this;
                        hVar.k(dialog, dialog.f20348id);
                        if (view instanceof org.telegram.ui.Cells.i6) {
                            ((org.telegram.ui.Cells.i6) view).s(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.g7) {
                            ((org.telegram.ui.Cells.g7) view).b(true, true);
                        }
                        g1(2);
                        long j11 = UserConfig.getInstance(hr0Var.currentAccount).clientUserId;
                        if (hr0Var.M0) {
                            zq0 zq0Var = hr0Var.L;
                            a0.h hVar2 = zq0Var.e;
                            ArrayList arrayList = zq0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.f20348id);
                            if (dialog2 == null) {
                                zq0Var.e.k(dialog, dialog.f20348id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f20348id != j11) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            zq0Var.l();
                            hr0Var.B0 = false;
                            i20 i20Var = hr0Var.f27154z0;
                            i20Var.f27258r.setText("");
                            P0(false);
                            AndroidUtilities.hideKeyboard(i20Var.f27258r);
                        }
                    } else {
                        this.D0 = dialog;
                        this.J.h1(0, this.f27140q0 - lm0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        oq0 oq0Var = new oq0(this, dialog, atomicReference, view);
                        atomicReference.set(new h90(this, atomicReference, oq0Var, dialog, 5));
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                        int i11 = NotificationCenter.topicsDidLoaded;
                        notificationCenter.addObserver(oq0Var, i11);
                        if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.f20348id) != null) {
                            oq0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.f20348id));
                            return;
                        }
                        MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.f20348id);
                        AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                dr0 dr0Var = hr0Var.N;
                if (dr0Var != null && (cr0Var = dr0Var.H) != null) {
                    cr0Var.q(0, cr0Var.h());
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
            lq0 lq0Var = this.f27123c;
            mq0 mq0Var = this.d;
            boolean z11 = true;
            if (i14 < m10) {
                long j10 = hVar.j(i14);
                if (d5.h(getContext(), this.currentAccount, j10, (lq0Var.getTag() == null || mq0Var.f29381a.length() <= 0) ? false : false)) {
                    return;
                }
                i14++;
            } else {
                Editable text = mq0Var.getText();
                ju juVar = mq0Var.f29381a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                vp vpVar = this.f27129f0;
                if (vpVar != null && vpVar.f32005a.f24297q) {
                    i10 = this.f27124c0;
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
                        if (lq0Var.getTag() != null && juVar.length() > 0 && sendPaidMessagesStars > 0) {
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
                    tq0 tq0Var = this.X;
                    if (tq0Var != null) {
                        i11 = tq0Var.e;
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
                            if (this.G0 != null && lq0Var.getTag() != null && juVar.length() > 0 && charSequenceArr[i18] != null && sendPaidMessagesStars2 > 0) {
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
                                if (lq0Var.getTag() != null && juVar.length() > 0 && sendPaidMessagesStars3 > 0) {
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
                d5.b0(this.currentAccount, arrayList, i12, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        hr0.p(hr0.this, charSequenceArr, entities, z10, i23, (HashMap) obj);
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
        lq0 lq0Var = this.f27123c;
        if (lq0Var.getTag() != null) {
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
        lq0Var.setTag(num);
        mq0 mq0Var = this.d;
        if (mq0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(mq0Var.getEditText());
        }
        mq0Var.k(true);
        FrameLayout frameLayout = this.f27126d0;
        lq0 lq0Var2 = this.f27128f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            lq0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            lq0Var2.setVisibility(0);
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
            WeakHashMap weakHashMap = r0.i0.f45241a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.f27152y;
        if (linearLayout != null) {
            if (!z10) {
                i11 = 1;
            }
            WeakHashMap weakHashMap2 = r0.i0.f45241a;
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
        arrayList.add(ObjectAnimator.ofFloat(lq0Var, property, f7));
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
        arrayList.add(ObjectAnimator.ofFloat(lq0Var2, property2, f10));
        Property property3 = View.SCALE_Y;
        if (z10) {
            f16 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(lq0Var2, property3, f16));
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(lq0Var2, property, f11));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.T[1];
            if (!z10) {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
        }
        FrameLayout frameLayout3 = this.f27143s;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.f27132i0 && z10) {
                if (this.f27127e0 != null) {
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
        this.E.addListener(new qq0(this, z10, 1));
        this.E.start();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void d1(long j10, View view) {
        String str;
        oc J;
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
        FrameLayout frameLayout = this.f27148w;
        if (premiumFeaturesBlocked) {
            J = new vc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = new vc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new cq0(this, 1));
        }
        J.j();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            zq0 zq0Var = this.L;
            if (zq0Var != null) {
                zq0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override
    public final void dismiss() {
        mq0 mq0Var = this.d;
        if (mq0Var != null) {
            AndroidUtilities.hideKeyboard(mq0Var.getEditText());
        }
        this.Z = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        mq0 mq0Var = this.d;
        if (mq0Var != null) {
            mq0Var.o();
        }
    }

    public final void e1() {
        org.telegram.ui.ActionBar.o1 o1Var;
        lq0 lq0Var = this.f27123c;
        if (lq0Var == null) {
            return;
        }
        mq0 mq0Var = this.d;
        if (mq0Var != null && mq0Var.m()) {
            mq0Var.getEmojiPaddingShown();
        } else {
            sq0 sq0Var = this.E0;
            if (sq0Var != null && (o1Var = sq0Var.H) != null && !o1Var.f21722f) {
                AndroidUtilities.dp(20.0f);
            }
        }
        float f7 = 0.0f;
        FrameLayout frameLayout = this.f27126d0;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f7 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f7);
        }
        float f10 = -f7;
        lq0Var.setTranslationY(f10);
        this.f27128f.setTranslationY(f10);
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
        Object tag = this.f27123c.getTag();
        mq0 mq0Var = this.d;
        if (tag != null && mq0Var.f29381a.length() > 0) {
            size++;
        }
        long j10 = 0;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            long j11 = ((TLRPC.Dialog) hVar.n(i11)).f20348id;
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
        mq0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), y1Var.l()), 0);
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
        mq0 mq0Var = this.d;
        if (mq0Var != null && mq0Var.e) {
            mq0Var.k(true);
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
                cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
            }
            if (this.container != null) {
                if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5)) > 0.721f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != this.f27125c1) {
                    this.f27125c1 = z10;
                    AndroidUtilities.setLightNavigationBar(this.container, z10);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public hr0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    public hr0(android.content.Context r38, org.telegram.ui.sn r39, java.util.ArrayList r40, java.lang.String r41, java.lang.String r42, boolean r43, java.lang.String r44, java.lang.String r45, boolean r46, boolean r47, boolean r48, java.lang.Integer r49, org.telegram.ui.ActionBar.g6 r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hr0.<init>(android.content.Context, org.telegram.ui.sn, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.g6):void");
    }

    public void X0(View view) {
    }

    public void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
