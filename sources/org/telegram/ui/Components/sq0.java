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
public class sq0 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f27165a1 = 0;
    public boolean A0;
    public o1.k B0;
    public TLRPC.Dialog C0;
    public final dq0 D0;
    public final vl0 E;
    public ArrayList E0;
    public final tp0 F;
    public TL_stories.StoryItem F0;
    public final tp0 G;
    public i0.c G0;
    public final s4.s H;
    public int H0;
    public final s4.s I;
    public boolean I0;
    public final vz J;
    public org.telegram.ui.ActionBar.p1 J0;
    public final kq0 K;
    public int K0;
    public final pq0 L;
    public boolean L0;
    public final oq0 M;
    public boolean M0;
    public final ArrayList N;
    public int N0;
    public final String[] O;
    public final zg.e O0;
    public final int P;
    public final eh.d P0;
    public final jx0 Q;
    public final eh.d Q0;
    public final Drawable R;
    public final zg.a R0;
    public final View[] S;
    public final zg.a S0;
    public final AnimatorSet[] T;
    public final zg.a T0;
    public final a0.i U;
    public final zg.k U0;
    public final HashMap V;
    public final bh.d V0;
    public final eq0 W;
    public final zg.b W0;
    public int X;
    public final bh.d X0;
    public boolean Y;
    public final ArrayList Y0;
    public final boolean Z;
    public final RectF Z0;
    public boolean f27166a0;
    public final FrameLayout f27167b;
    public final int f27168b0;
    public final vp0 f27169c;
    public final FrameLayout f27170c0;
    public final wp0 d;
    public final LinearLayout f27171d0;
    public final hi.b2 e;
    public final tp f27172e0;
    public final vp0 f27173f;
    public final org.telegram.ui.eo f27174f0;
    public final Activity f27175g0;
    public final FrameLayout h;
    public final boolean f27176h0;
    public boolean f27177i0;
    public final TextPaint f27178j0;
    public TLRPC.TL_exportedMessageLink f27179k0;
    public boolean f27180l0;
    public boolean m0;
    public final bi.nc f27181n;
    public final boolean f27182n0;
    public final String[] f27183o0;
    public int f27184p0;
    public int f27185q0;
    public final FrameLayout f27186r;
    public boolean f27187r0;
    public final org.telegram.ui.ActionBar.l5 f27188s;
    public hq0 f27189s0;
    public float f27190t0;
    public float f27191u0;
    public final FrameLayout v;
    public float f27192v0;
    public final FrameLayout f27193w;
    public ValueAnimator f27194w0;
    public final LinearLayout f27195x;
    public final zk0 f27196x0;
    public AnimatorSet f27197y;
    public final k20 f27198y0;
    public final org.telegram.ui.ActionBar.l f27199z0;

    public sq0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, f6Var);
    }

    public static void A0(sq0 sq0Var) {
        float f7;
        RectF rectF = sq0Var.Z0;
        zg.e eVar = sq0Var.O0;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            rectF.set(0.0f, 0.0f, sq0Var.containerView.getMeasuredWidth(), sq0Var.containerView.getMeasuredHeight());
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            eVar.g(1, sq0Var.Y0);
            eVar.e(sq0Var.U0, sq0Var.containerView.getMeasuredWidth(), sq0Var.containerView.getMeasuredHeight());
        }
    }

    public static int F0(sq0 sq0Var) {
        tp0 tp0Var = sq0Var.F;
        if (tp0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = tp0Var.getChildAt(0);
            fl0 fl0Var = (fl0) tp0Var.G(childAt);
            if (fl0Var != null) {
                int paddingTop = tp0Var.getPaddingTop();
                if (fl0Var.c() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    public static sq0 N0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        ArrayList arrayList;
        if (messageObject != null) {
            arrayList = org.telegram.messenger.a2.l(messageObject);
        } else {
            arrayList = null;
        }
        return new sq0(context, arrayList, str, null, z10, str2, null, false);
    }

    public static void m(sq0 sq0Var, AtomicReference atomicReference, yp0 yp0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        yp0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, sq0Var.currentAccount, Long.valueOf(-dialog.f17199id));
    }

    public static boolean n(final sq0 sq0Var) {
        int measuredHeight;
        org.telegram.ui.eo eoVar;
        hi.b2 b2Var = sq0Var.e;
        boolean z10 = sq0Var.f27176h0;
        Activity activity = sq0Var.f27175g0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(sq0Var.getContext());
        linearLayout.setOrientation(1);
        if (sq0Var.N != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, sq0Var.resourcesProvider);
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17972fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new zp0(sq0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new mp0(sq0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, sq0Var.getContext(), sq0Var.resourcesProvider, true, false);
            if (z10) {
                g1Var.setTextColor(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18117ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, w7.a6.n(-1, 48));
            g1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            sq0Var.I0 = true;
            g1Var.setChecked(true);
            final org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(1, sq0Var.getContext(), sq0Var.resourcesProvider, false, true);
            if (z10) {
                g1Var2.setTextColor(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18117ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, w7.a6.n(-1, 48));
            g1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            g1Var2.setChecked(!sq0Var.I0);
            g1Var.setOnClickListener(new View.OnClickListener(sq0Var) {
                public final sq0 f26229b;

                {
                    this.f26229b = sq0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            sq0 sq0Var2 = this.f26229b;
                            sq0Var2.I0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!sq0Var2.I0);
                            return;
                        default:
                            sq0 sq0Var3 = this.f26229b;
                            sq0Var3.I0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!sq0Var3.I0);
                            return;
                    }
                }
            });
            g1Var2.setOnClickListener(new View.OnClickListener(sq0Var) {
                public final sq0 f26229b;

                {
                    this.f26229b = sq0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            sq0 sq0Var2 = this.f26229b;
                            sq0Var2.I0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!sq0Var2.I0);
                            return;
                        default:
                            sq0 sq0Var3 = this.f26229b;
                            sq0Var3.I0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!sq0Var3.I0);
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.a6.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, sq0Var.resourcesProvider);
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17972fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new zp0(sq0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new mp0(sq0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, sq0Var.getContext(), sq0Var.resourcesProvider, true, true);
        if (z10) {
            g1Var3.setTextColor(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18117ng));
            g1Var3.setIconColor(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        }
        g1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        g1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var3, w7.a6.n(-1, 48));
        g1Var3.setOnClickListener(new lp0(sq0Var, 1));
        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, sq0Var.getContext(), sq0Var.resourcesProvider, true, true);
        if (z10) {
            g1Var4.setTextColor(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18117ng));
            g1Var4.setIconColor(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        }
        g1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        g1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var4, w7.a6.n(-1, 48));
        g1Var4.setOnClickListener(new lp0(sq0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.a6.n(-1, -2));
        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(linearLayout, -2, -2);
        sq0Var.J0 = p1Var;
        p1Var.f18534b = false;
        p1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        sq0Var.J0.setOutsideTouchable(true);
        sq0Var.J0.setClippingEnabled(true);
        sq0Var.J0.setInputMethodMode(2);
        sq0Var.J0.setSoftInputMode(0);
        sq0Var.J0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        sq0Var.J0.setFocusable(true);
        int[] iArr = new int[2];
        b2Var.getLocationInWindow(iArr);
        if (sq0Var.keyboardVisible && (eoVar = sq0Var.f27174f0) != null && eoVar.X0.getMeasuredHeight() > AndroidUtilities.dp(58.0f)) {
            measuredHeight = b2Var.getMeasuredHeight() + iArr[1];
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
        }
        sq0Var.J0.showAtLocation(b2Var, 51, AndroidUtilities.dp(8.0f) + ((b2Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
        sq0Var.J0.b();
        try {
            b2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void o(sq0 sq0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
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
        vp0 vp0Var;
        long j12;
        long j13;
        Long l12;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue4;
        String charSequence3;
        long longValue5;
        String[] strArr2 = sq0Var.O;
        wp0 wp0Var = sq0Var.d;
        vp0 vp0Var2 = sq0Var.f27169c;
        HashMap hashMap2 = sq0Var.V;
        Long l13 = 0L;
        a0.i iVar = sq0Var.U;
        ArrayList arrayList3 = sq0Var.N;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i14 = 0;
            boolean z12 = false;
            while (true) {
                if (i14 < iVar.m()) {
                    long j14 = iVar.j(i14);
                    boolean isMonoForum = MessagesController.getInstance(sq0Var.currentAccount).isMonoForum(j14);
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
                        vp0Var = vp0Var2;
                        j12 = j14;
                        j13 = DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    } else {
                        vp0Var = vp0Var2;
                        j12 = j14;
                        j13 = 0;
                    }
                    if (tL_forumTopic3 != null && !isMonoForum) {
                        l12 = l13;
                        messageObject3 = new MessageObject(sq0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    } else {
                        l12 = l13;
                        messageObject3 = null;
                    }
                    if (messageObject3 != null) {
                        messageObject3.isTopicMainMessage = true;
                    }
                    if (vp0Var.getTag() != null && wp0Var.f25595a.length() > 0) {
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
                        SendMessagesHelper.getInstance(sq0Var.currentAccount).sendMessage(of3);
                    } else {
                        messageObject4 = messageObject3;
                        arrayList2 = arrayList3;
                    }
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(sq0Var.currentAccount);
                    ArrayList<MessageObject> arrayList5 = sq0Var.N;
                    boolean z13 = !sq0Var.I0;
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
                        d5.t0(sendMessage, sq0Var.f27174f0, null);
                        if (sendMessage != 0) {
                            break;
                        }
                    }
                    i14++;
                    arrayList3 = arrayList2;
                    vp0Var2 = vp0Var;
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
                sq0Var.R0(iVar, size2, tL_forumTopic2, !z12);
            }
        } else {
            eq0 eq0Var = sq0Var.W;
            if (eq0Var != null) {
                i11 = eq0Var.d;
            } else {
                i11 = 0;
            }
            if (sq0Var.F0 != null) {
                int i16 = 0;
                boolean z14 = false;
                while (i16 < iVar.m()) {
                    long j16 = iVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(sq0Var.currentAccount).isMonoForum(j16);
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
                        messageObject2 = new MessageObject(sq0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                    } else {
                        strArr = strArr2;
                        messageObject2 = null;
                    }
                    if (sq0Var.F0 == null) {
                        if (vp0Var2.getTag() != null && wp0Var.f25595a.length() > 0) {
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
                        if (vp0Var2.getTag() != null && wp0Var.f25595a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(sq0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j16, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = sq0Var.F0;
                    }
                    if (l10 == null) {
                        longValue3 = 0;
                    } else {
                        longValue3 = l10.longValue();
                    }
                    of2.payStars = longValue3;
                    of2.monoForumPeer = j11;
                    SendMessagesHelper.getInstance(sq0Var.currentAccount).sendMessage(of2);
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
                        boolean isMonoForum3 = MessagesController.getInstance(sq0Var.currentAccount).isMonoForum(j17);
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
                            messageObject = new MessageObject(sq0Var.currentAccount, tL_forumTopic5.topicStartMessage, false, false);
                        } else {
                            c10 = 0;
                            messageObject = null;
                        }
                        if (vp0Var2.getTag() != null && wp0Var.f25595a.length() > 0) {
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
                            SendMessagesHelper.getInstance(sq0Var.currentAccount).sendMessage(of4);
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
                        SendMessagesHelper.getInstance(sq0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z15;
                } else {
                    i12 = 0;
                    z11 = false;
                    sq0Var.R0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i12)), !z11);
                }
            }
            i12 = 0;
            sq0Var.R0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i12)), !z11);
        }
        hq0 hq0Var = sq0Var.f27189s0;
        if (hq0Var != null) {
            hq0Var.T();
        }
        sq0Var.dismiss();
    }

    public static void p(sq0 sq0Var, int i10) {
        TLRPC.Dialog dialog;
        k20 k20Var = sq0Var.f27198y0;
        HashMap hashMap = sq0Var.V;
        a0.i iVar = sq0Var.U;
        kq0 kq0Var = sq0Var.K;
        pq0 pq0Var = sq0Var.L;
        if (pq0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = sq0Var.C0;
            if (dialog2 != null) {
                iVar.k(dialog2, dialog2.f17199id);
                hashMap.remove(dialog2);
                sq0Var.a1(2);
                if (sq0Var.L0 || sq0Var.M0) {
                    if (((TLRPC.Dialog) kq0Var.e.f(dialog2.f17199id)) == null) {
                        kq0Var.e.k(dialog2, dialog2.f17199id);
                        ArrayList arrayList = kq0Var.d;
                        arrayList.add(!arrayList.isEmpty(), dialog2);
                    }
                    kq0Var.l();
                    sq0Var.A0 = false;
                    k20Var.f24572r.setText("");
                    sq0Var.K0(false);
                }
                for (int i11 = 0; i11 < sq0Var.P0().getChildCount(); i11++) {
                    View childAt = sq0Var.P0().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.h7) {
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                        if (h7Var.getCurrentDialog() == sq0Var.C0.f17199id) {
                            h7Var.d(null, false, true);
                            h7Var.b(true, true);
                        }
                    }
                }
                sq0Var.L0();
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic E = pq0Var.E(i10);
        if (E != null && (dialog = sq0Var.C0) != null) {
            long j3 = dialog.f17199id;
            boolean isMonoForum = MessagesController.getInstance(sq0Var.currentAccount).isMonoForum(j3);
            TLRPC.Dialog dialog3 = sq0Var.C0;
            iVar.k(dialog3, j3);
            hashMap.put(dialog3, E);
            sq0Var.a1(2);
            if (sq0Var.L0 || sq0Var.M0) {
                if (((TLRPC.Dialog) kq0Var.e.f(dialog3.f17199id)) == null) {
                    kq0Var.e.k(dialog3, dialog3.f17199id);
                    ArrayList arrayList2 = kq0Var.d;
                    arrayList2.add(!arrayList2.isEmpty(), dialog3);
                }
                kq0Var.l();
                sq0Var.A0 = false;
                k20Var.f24572r.setText("");
                sq0Var.K0(false);
            }
            for (int i12 = 0; i12 < sq0Var.P0().getChildCount(); i12++) {
                View childAt2 = sq0Var.P0().getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) childAt2;
                    if (h7Var2.getCurrentDialog() == sq0Var.C0.f17199id) {
                        h7Var2.d(E, isMonoForum, true);
                        h7Var2.b(true, true);
                    }
                }
            }
            sq0Var.L0();
        }
    }

    public static void s0(sq0 sq0Var) {
        tp0 tp0Var;
        int i10;
        int i11;
        tp0 tp0Var2 = sq0Var.F;
        tp0 tp0Var3 = sq0Var.G;
        vl0 vl0Var = sq0Var.E;
        if (!sq0Var.f27187r0) {
            if (sq0Var.L0) {
                tp0Var = tp0Var3;
            } else {
                tp0Var = tp0Var2;
            }
            if (tp0Var.getChildCount() > 0) {
                View childAt = tp0Var.getChildAt(0);
                for (int i12 = 0; i12 < tp0Var.getChildCount(); i12++) {
                    if (tp0Var.getChildAt(i12).getTop() < childAt.getTop()) {
                        childAt = tp0Var.getChildAt(i12);
                    }
                }
                fl0 fl0Var = (fl0) tp0Var.G(childAt);
                int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
                if (top > 0 && fl0Var != null && fl0Var.b() == 0) {
                    i10 = top;
                } else {
                    i10 = 0;
                }
                if (top >= 0 && fl0Var != null && fl0Var.b() == 0) {
                    sq0Var.K0 = childAt.getTop();
                    sq0Var.T0(false);
                } else {
                    sq0Var.K0 = Integer.MAX_VALUE;
                    sq0Var.T0(true);
                    top = i10;
                }
                if (vl0Var.getVisibility() == 0) {
                    if (vl0Var.getChildCount() > 0) {
                        View childAt2 = vl0Var.getChildAt(0);
                        for (int i13 = 0; i13 < vl0Var.getChildCount(); i13++) {
                            if (vl0Var.getChildAt(i13).getTop() < childAt2.getTop()) {
                                childAt2 = vl0Var.getChildAt(i13);
                            }
                        }
                        fl0 fl0Var2 = (fl0) vl0Var.G(childAt2);
                        int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
                        if (top2 > 0 && fl0Var2 != null && fl0Var2.b() == 0) {
                            i11 = top2;
                        } else {
                            i11 = 0;
                        }
                        if (top2 >= 0 && fl0Var2 != null && fl0Var2.b() == 0) {
                            sq0Var.K0 = childAt2.getTop();
                            sq0Var.T0(false);
                        } else {
                            sq0Var.K0 = Integer.MAX_VALUE;
                            sq0Var.T0(true);
                            top2 = i11;
                        }
                        top = AndroidUtilities.lerp(top, top2, vl0Var.getAlpha());
                    } else {
                        return;
                    }
                }
                int i14 = sq0Var.f27184p0;
                if (i14 != top) {
                    sq0Var.f27185q0 = i14;
                    float f7 = top;
                    int i15 = (int) (sq0Var.f27190t0 + f7);
                    sq0Var.f27184p0 = i15;
                    tp0Var2.setTopGlowOffset(i15);
                    int i16 = (int) (sq0Var.f27190t0 + f7);
                    sq0Var.f27184p0 = i16;
                    tp0Var3.setTopGlowOffset(i16);
                    int i17 = (int) (f7 + sq0Var.f27190t0);
                    sq0Var.f27184p0 = i17;
                    vl0Var.setTopGlowOffset(i17);
                    sq0Var.f27167b.setTranslationY(sq0Var.f27184p0 + sq0Var.f27190t0);
                    sq0Var.Q.setTranslationY(sq0Var.f27184p0 + sq0Var.f27190t0);
                    sq0Var.containerView.invalidate();
                }
            }
        }
    }

    public final void K0(boolean z10) {
        k20 k20Var = this.f27198y0;
        bi.t2 t2Var = k20Var.f24572r;
        bi.t2 t2Var2 = k20Var.f24572r;
        boolean isEmpty = TextUtils.isEmpty(t2Var.getText());
        tp0 tp0Var = this.F;
        tp0 tp0Var2 = this.G;
        boolean z11 = true;
        if (isEmpty && ((!this.keyboardVisible || !t2Var2.hasFocus()) && !this.M0)) {
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(tp0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(tp0Var2, false);
            }
            z11 = false;
        } else {
            this.A0 = true;
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(tp0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(tp0Var2, true);
            }
        }
        if (this.L0 == z11 && !z10) {
            return;
        }
        this.L0 = z11;
        oq0 oq0Var = this.M;
        oq0Var.l();
        this.K.l();
        if (this.L0) {
            if (this.K0 == Integer.MAX_VALUE) {
                ((s4.c0) tp0Var2.getLayoutManager()).h1(0, -tp0Var2.getPaddingTop());
            } else {
                ((s4.c0) tp0Var2.getLayoutManager()).h1(0, this.K0 - tp0Var2.getPaddingTop());
            }
            oq0Var.E(t2Var2.getText().toString());
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

    public final void L0() {
        float f7;
        TLRPC.Dialog dialog = this.C0;
        if (dialog != null) {
            org.telegram.ui.Cells.h7 h7Var = null;
            this.C0 = null;
            for (int i10 = 0; i10 < P0().getChildCount(); i10++) {
                View childAt = P0().getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.h7) && ((org.telegram.ui.Cells.h7) childAt).getCurrentDialog() == dialog.f17199id) {
                    h7Var = childAt;
                }
            }
            if (h7Var == null) {
                return;
            }
            o1.k kVar = this.B0;
            if (kVar != null) {
                kVar.c();
            }
            P0().setVisibility(0);
            k20 k20Var = this.f27198y0;
            k20Var.setVisibility(0);
            bi.t2 t2Var = k20Var.f24572r;
            if (this.L0 || this.M0) {
                this.D0.H.v = true;
                t2Var.requestFocus();
                AndroidUtilities.showKeyboard(t2Var);
            }
            int[] iArr = new int[2];
            o1.k kVar2 = new o1.k(new o1.j(1000.0f));
            o1.l lVar = new o1.l(0.0f);
            org.telegram.ui.eo eoVar = this.f27174f0;
            if (eoVar != null && eoVar.f32267b) {
                f7 = 10.0f;
            } else {
                f7 = 800.0f;
            }
            lVar.b(f7);
            lVar.a(1.0f);
            kVar2.f14134u = lVar;
            this.B0 = kVar2;
            kVar2.b(new kp0(this, h7Var, iArr, 0));
            this.B0.a(new gb(this, 4));
            this.B0.f();
        }
    }

    public final void M0() {
        boolean z10 = false;
        if (this.f27179k0 != null || this.f27183o0[0] != null) {
            try {
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
                hq0 hq0Var = this.f27189s0;
                if (hq0Var != null) {
                    hq0Var.s0();
                } else if (this.f27175g0 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f27179k0;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z10 = true;
                    }
                    ((LaunchActivity) this.f27175g0).D0(new i2.x(2, z10));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final String O0() {
        String str;
        String str2;
        String[] strArr = this.f27183o0;
        eq0 eq0Var = this.W;
        if (eq0Var != null) {
            str2 = strArr[eq0Var.d];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f27179k0;
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
        tp tpVar = this.f27172e0;
        if (tpVar != null && tpVar.f27462a.f21057q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.f27168b0)).build().toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final vl0 P0() {
        if (!this.L0 && !this.M0) {
            return this.F;
        }
        return this.G;
    }

    public final void Q0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        vl0 vl0Var = this.E;
        vl0Var.setPivotX(width);
        vl0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        vl0Var.setScaleX(f11);
        vl0Var.setScaleY(f11);
        vl0Var.setAlpha(f7);
        vl0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        P0.setScaleX(f12);
        P0.setScaleY(f12);
        float f13 = 1.0f - f7;
        P0.setAlpha(f13);
        k20 k20Var = this.f27198y0;
        k20Var.setPivotX(k20Var.getWidth() / 2.0f);
        k20Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        k20Var.setScaleX(f14);
        k20Var.setScaleY(f14);
        k20Var.setAlpha(f13);
        org.telegram.ui.ActionBar.l lVar = this.f27199z0;
        lVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        lVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        lVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        lVar.setAlpha(f7);
        vl0Var.getLocationInWindow(iArr);
        float interpolation = wr.f28820g.getInterpolation(f7);
        for (int i10 = 0; i10 < P0.getChildCount(); i10++) {
            View childAt = P0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.h7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f7, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f13);
                }
            }
        }
        for (int i11 = 0; i11 < vl0Var.getChildCount(); i11++) {
            View childAt2 = vl0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.i7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y3 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((vl0Var.getTranslationY() + y3) - view.getY()))));
            }
        }
        this.containerView.requestLayout();
        P0.invalidate();
    }

    public final void T0(boolean z10) {
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
            animatorSetArr[0].addListener(new aq0(this, z10, 0));
            animatorSetArr[0].start();
        }
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        sq0 sq0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        nq0 nq0Var;
        if (dialog instanceof jq0) {
            S0(view);
        } else if (((view instanceof org.telegram.ui.Cells.h7) && ((org.telegram.ui.Cells.h7) view).F) || ((view instanceof org.telegram.ui.Cells.j6) && ((org.telegram.ui.Cells.j6) view).f19371n0)) {
            X0(dialog.f17199id, view);
        } else {
            vl0 vl0Var = this.E;
            if (vl0Var.getVisibility() == 8 && (activity = this.f27175g0) != null) {
                boolean isChatDialog = DialogObject.isChatDialog(dialog.f17199id);
                int i10 = this.P;
                if (isChatDialog) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f17199id));
                    if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.f17199id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        String string = LocaleController.getString(R.string.SendMessageTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                        d2Var.R = string;
                        if (i10 == 3) {
                            if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                d2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                            } else {
                                d2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                            }
                        } else if (i10 == 2) {
                            if (this.f27182n0) {
                                d2Var.T = LocaleController.getString(R.string.PublicPollCantForward);
                            } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                d2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                            } else {
                                d2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                            }
                        } else {
                            d2Var.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        hc.b.s(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                } else if (DialogObject.isEncryptedDialog(dialog.f17199id) && i10 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String string2 = LocaleController.getString(R.string.SendMessageTitle);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f17528a;
                    d2Var2.R = string2;
                    if (i10 == 3) {
                        d2Var2.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i10 != 0) {
                        d2Var2.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        d2Var2.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    hc.b.s(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
                long j3 = dialog.f17199id;
                a0.i iVar = this.U;
                if (iVar.h(j3) >= 0) {
                    iVar.l(dialog.f17199id);
                    this.V.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.j6) {
                        ((org.telegram.ui.Cells.j6) view).s(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).b(false, true);
                    }
                    a1(1);
                    sq0Var = this;
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.f17199id));
                    TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f17199id));
                    if ((!UserObject.isBotForum(user) || (((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f17342id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f17342id))) && (!DialogObject.isChatDialog(dialog.f17199id) || (!ChatObject.isForum(chat2) && (!ChatObject.isMonoForum(chat2) || !ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                        sq0Var = this;
                        iVar.k(dialog, dialog.f17199id);
                        if (view instanceof org.telegram.ui.Cells.j6) {
                            ((org.telegram.ui.Cells.j6) view).s(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.h7) {
                            ((org.telegram.ui.Cells.h7) view).b(true, true);
                        }
                        a1(2);
                        long j10 = UserConfig.getInstance(sq0Var.currentAccount).clientUserId;
                        if (sq0Var.L0) {
                            kq0 kq0Var = sq0Var.K;
                            a0.i iVar2 = kq0Var.e;
                            ArrayList arrayList = kq0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) iVar2.f(dialog.f17199id);
                            if (dialog2 == null) {
                                kq0Var.e.k(dialog, dialog.f17199id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f17199id != j10) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            kq0Var.l();
                            sq0Var.A0 = false;
                            k20 k20Var = sq0Var.f27198y0;
                            k20Var.f24572r.setText("");
                            K0(false);
                            AndroidUtilities.hideKeyboard(k20Var.f24572r);
                        }
                    } else {
                        this.C0 = dialog;
                        this.I.h1(0, this.f27184p0 - vl0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        yp0 yp0Var = new yp0(this, dialog, atomicReference, view);
                        atomicReference.set(new org.telegram.ui.da(this, atomicReference, yp0Var, dialog, 27));
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                        int i11 = NotificationCenter.topicsDidLoaded;
                        notificationCenter.addObserver(yp0Var, i11);
                        if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.f17199id) != null) {
                            yp0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.f17199id));
                            return;
                        }
                        MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.f17199id);
                        AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                oq0 oq0Var = sq0Var.M;
                if (oq0Var != null && (nq0Var = oq0Var.H) != null) {
                    nq0Var.q(0, nq0Var.h());
                }
            }
        }
    }

    public final void V0(final boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (true) {
            a0.i iVar = this.U;
            int m10 = iVar.m();
            vp0 vp0Var = this.f27169c;
            wp0 wp0Var = this.d;
            boolean z11 = true;
            if (i13 < m10) {
                if (d5.h(getContext(), this.currentAccount, iVar.j(i13), (vp0Var.getTag() == null || wp0Var.f25595a.length() <= 0) ? false : false)) {
                    return;
                }
                i13++;
            } else {
                Editable text = wp0Var.getText();
                iu iuVar = wp0Var.f25595a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                tp tpVar = this.f27172e0;
                if (tpVar != null && tpVar.f27462a.f21057q) {
                    i10 = this.f27168b0;
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
                        if (vp0Var.getTag() != null && iuVar.length() > 0 && sendPaidMessagesStars > 0) {
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
                    eq0 eq0Var = this.W;
                    if (eq0Var != null) {
                        i11 = eq0Var.d;
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
                            if (this.F0 != null && vp0Var.getTag() != null && iuVar.length() > 0 && charSequenceArr[0] != null && sendPaidMessagesStars2 > 0) {
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
                                if (vp0Var.getTag() != null && iuVar.length() > 0 && sendPaidMessagesStars3 > 0) {
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
                d5.c0(this.currentAccount, arrayList, i12, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        sq0.o(sq0.this, charSequenceArr, entities, z10, i22, (HashMap) obj);
                    }
                });
                return;
            }
        }
    }

    public final void W0(boolean z10) {
        boolean z11;
        Integer num;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        vp0 vp0Var = this.f27169c;
        if (vp0Var.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.f27197y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        vp0Var.setTag(num);
        wp0 wp0Var = this.d;
        if (wp0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(wp0Var.getEditText());
        }
        wp0Var.k(true);
        FrameLayout frameLayout = this.f27170c0;
        vp0 vp0Var2 = this.f27173f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            vp0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            vp0Var2.setVisibility(0);
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
            WeakHashMap weakHashMap = r0.i0.f41062a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.f27195x;
        if (linearLayout != null) {
            if (!z10) {
                i11 = 1;
            }
            WeakHashMap weakHashMap2 = r0.i0.f41062a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.f27197y = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f14 = 0.0f;
        float f15 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(vp0Var, property, f7));
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
        arrayList.add(ObjectAnimator.ofFloat(vp0Var2, property2, f10));
        Property property3 = View.SCALE_Y;
        if (z10) {
            f16 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(vp0Var2, property3, f16));
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(vp0Var2, property, f11));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.S[1];
            if (!z10) {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
        }
        FrameLayout frameLayout3 = this.f27186r;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.f27176h0 && z10) {
                if (this.f27171d0 != null) {
                    f12 = 5.0f;
                } else {
                    f12 = 16.0f;
                }
                f14 = AndroidUtilities.dp(f12);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, f14));
        }
        this.f27197y.playTogether(arrayList);
        this.f27197y.setInterpolator(new DecelerateInterpolator());
        this.f27197y.setDuration(180L);
        this.f27197y.addListener(new aq0(this, z10, 1));
        this.f27197y.start();
    }

    public final void X0(long j3, View view) {
        String str;
        pc J;
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
            J = new wc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = new wc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new np0(this, 1));
        }
        J.j();
    }

    public final void Y0() {
        org.telegram.ui.ActionBar.r1 r1Var;
        vp0 vp0Var = this.f27169c;
        if (vp0Var == null) {
            return;
        }
        wp0 wp0Var = this.d;
        if (wp0Var != null && wp0Var.m()) {
            wp0Var.getEmojiPaddingShown();
        } else {
            dq0 dq0Var = this.D0;
            if (dq0Var != null && (r1Var = dq0Var.H) != null && !r1Var.f18596f) {
                AndroidUtilities.dp(20.0f);
            }
        }
        float f7 = 0.0f;
        FrameLayout frameLayout = this.f27170c0;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f7 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            float f10 = -f7;
            frameLayout2.setTranslationY(f10);
            LinearLayout linearLayout = this.f27195x;
            if (linearLayout != null) {
                linearLayout.setTranslationY(f10);
            }
        }
        float f11 = -f7;
        vp0Var.setTranslationY(f11);
        this.f27173f.setTranslationY(f11);
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.l5 l5Var = this.f27188s;
        if (l5Var != null) {
            String O0 = O0();
            if (O0.startsWith("https://")) {
                O0 = O0.substring(8);
            } else if (O0.startsWith("http://")) {
                O0 = O0.substring(7);
            }
            l5Var.k(O0);
        }
    }

    public final void a1(int i10) {
        int size;
        boolean z10;
        boolean z11;
        a0.i iVar = this.U;
        if (iVar.m() == 0) {
            W0(false);
            return;
        }
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        Object tag = this.f27169c.getTag();
        wp0 wp0Var = this.d;
        if (tag != null && wp0Var.f25595a.length() > 0) {
            size++;
        }
        long j3 = 0;
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            long j10 = ((TLRPC.Dialog) iVar.n(i11)).f17199id;
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
        hi.b2 b2Var = this.e;
        b2Var.g(max, z10);
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        b2Var.i(size, j3, z11);
        W0(true);
        wp0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), b2Var.l()), 0);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            kq0 kq0Var = this.K;
            if (kq0Var != null) {
                kq0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override
    public final void dismiss() {
        wp0 wp0Var = this.d;
        if (wp0Var != null) {
            AndroidUtilities.hideKeyboard(wp0Var.getEditText());
        }
        this.Y = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        wp0 wp0Var = this.d;
        if (wp0Var != null) {
            wp0Var.o();
        }
    }

    @Override
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.X;
    }

    @Override
    public final void onBackPressed() {
        if (this.C0 != null) {
            L0();
            return;
        }
        wp0 wp0Var = this.d;
        if (wp0Var != null && wp0Var.e) {
            wp0Var.k(true);
        } else {
            super.onBackPressed();
        }
    }

    public sq0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    public sq0(android.content.Context r37, org.telegram.ui.eo r38, java.util.ArrayList r39, java.lang.String r40, java.lang.String r41, boolean r42, java.lang.String r43, java.lang.String r44, boolean r45, boolean r46, boolean r47, java.lang.Integer r48, org.telegram.ui.ActionBar.f6 r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sq0.<init>(android.content.Context, org.telegram.ui.eo, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.f6):void");
    }

    public void S0(View view) {
    }

    public void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
