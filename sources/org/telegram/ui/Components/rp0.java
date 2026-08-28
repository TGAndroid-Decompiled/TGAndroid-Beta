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
public class rp0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int W0 = 0;
    public final wk0 A;
    public ArrayList A0;
    public final so0 B;
    public TL_stories.StoryItem B0;
    public final so0 C;
    public i0.b C0;
    public final f2.y D;
    public int D0;
    public final f2.y E;
    public boolean E0;
    public final az F;
    public org.telegram.ui.ActionBar.o1 F0;
    public final jp0 G;
    public int G0;
    public final op0 H;
    public boolean H0;
    public final np0 I;
    public boolean I0;
    public final ArrayList J;
    public int J0;
    public final String[] K;
    public final ig.e K0;
    public final int L;
    public final ng.d L0;
    public final gw0 M;
    public final ng.d M0;
    public final Drawable N;
    public final ig.a N0;
    public final View[] O;
    public final ig.a O0;
    public final AnimatorSet[] P;
    public final ig.a P0;
    public final a0.h Q;
    public final ig.k Q0;
    public final HashMap R;
    public final kg.d R0;
    public final dp0 S;
    public final ig.b S0;
    public int T;
    public final kg.d T0;
    public boolean U;
    public final ArrayList U0;
    public final boolean V;
    public final RectF V0;
    public boolean W;
    public final int X;
    public final FrameLayout Y;
    public final LinearLayout Z;
    public final dp f32241a0;
    public final FrameLayout f32242b;
    public final org.telegram.ui.qn f32243b0;
    public final uo0 f32244c;
    public final Activity f32245c0;
    public final vo0 d;
    public final boolean f32246d0;
    public final wo0 f32247e;
    public boolean f32248e0;
    public final uo0 f32249f;
    public final TextPaint f32250f0;
    public TLRPC.TL_exportedMessageLink f32251g0;
    public final FrameLayout h;
    public boolean f32252h0;
    public boolean f32253i0;
    public final boolean f32254j0;
    public final String[] f32255k0;
    public int f32256l0;
    public int m0;
    public final fh.l2 f32257n;
    public boolean f32258n0;
    public gp0 f32259o0;
    public float f32260p0;
    public float f32261q0;
    public final FrameLayout f32262r;
    public float f32263r0;
    public final org.telegram.ui.ActionBar.h5 f32264s;
    public ValueAnimator f32265s0;
    public final dk0 f32266t0;
    public final m10 f32267u0;
    public final FrameLayout v;
    public final org.telegram.ui.ActionBar.k f32268v0;
    public final FrameLayout f32269w;
    public boolean f32270w0;
    public final LinearLayout f32271x;
    public o1.j f32272x0;
    public AnimatorSet f32273y;
    public TLRPC.Dialog f32274y0;
    public final cp0 f32275z0;

    public rp0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, b6Var);
    }

    public static int E0(rp0 rp0Var) {
        so0 so0Var = rp0Var.B;
        if (so0Var.getChildCount() != 0) {
            int i9 = 0;
            View childAt = so0Var.getChildAt(0);
            ik0 ik0Var = (ik0) so0Var.G(childAt);
            if (ik0Var != null) {
                int paddingTop = so0Var.getPaddingTop();
                if (ik0Var.c() == 0 && childAt.getTop() >= 0) {
                    i9 = childAt.getTop();
                }
                return paddingTop - i9;
            }
            return -1000;
        }
        return -1000;
    }

    public static rp0 N0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        ArrayList arrayList;
        if (messageObject != null) {
            arrayList = org.telegram.messenger.l0.k(messageObject);
        } else {
            arrayList = null;
        }
        return new rp0(context, arrayList, str, null, z10, str2, null, false);
    }

    public static void m(rp0 rp0Var, AtomicReference atomicReference, yo0 yo0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        yo0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, rp0Var.currentAccount, Long.valueOf(-dialog.f22384id));
    }

    public static boolean n(final rp0 rp0Var) {
        int measuredHeight;
        org.telegram.ui.qn qnVar;
        wo0 wo0Var = rp0Var.f32247e;
        boolean z10 = rp0Var.f32246d0;
        Activity activity = rp0Var.f32245c0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(rp0Var.getContext());
        linearLayout.setOrientation(1);
        if (rp0Var.J != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, rp0Var.resourcesProvider);
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23046fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new zo0(rp0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new ko0(rp0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, rp0Var.getContext(), rp0Var.resourcesProvider, true, false);
            if (z10) {
                g1Var.setTextColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23188ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, g7.e6.n(-1, 48));
            g1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            rp0Var.E0 = true;
            g1Var.setChecked(true);
            final org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(1, rp0Var.getContext(), rp0Var.resourcesProvider, false, true);
            if (z10) {
                g1Var2.setTextColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23188ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, g7.e6.n(-1, 48));
            g1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            g1Var2.setChecked(!rp0Var.E0);
            g1Var.setOnClickListener(new View.OnClickListener(rp0Var) {
                public final rp0 f31419b;

                {
                    this.f31419b = rp0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            rp0 rp0Var2 = this.f31419b;
                            rp0Var2.E0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!rp0Var2.E0);
                            return;
                        default:
                            rp0 rp0Var3 = this.f31419b;
                            rp0Var3.E0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!rp0Var3.E0);
                            return;
                    }
                }
            });
            g1Var2.setOnClickListener(new View.OnClickListener(rp0Var) {
                public final rp0 f31419b;

                {
                    this.f31419b = rp0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            rp0 rp0Var2 = this.f31419b;
                            rp0Var2.E0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!rp0Var2.E0);
                            return;
                        default:
                            rp0 rp0Var3 = this.f31419b;
                            rp0Var3.E0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!rp0Var3.E0);
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(rp0Var.getThemedColor(org.telegram.ui.ActionBar.f6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, g7.e6.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, rp0Var.resourcesProvider);
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23046fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new zo0(rp0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new ko0(rp0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, rp0Var.getContext(), rp0Var.resourcesProvider, true, true);
        if (z10) {
            g1Var3.setTextColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23188ng));
            g1Var3.setIconColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.f6.H6));
        }
        g1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        g1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var3, g7.e6.n(-1, 48));
        g1Var3.setOnClickListener(new jo0(rp0Var, 1));
        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, rp0Var.getContext(), rp0Var.resourcesProvider, true, true);
        if (z10) {
            g1Var4.setTextColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23188ng));
            g1Var4.setIconColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.f6.H6));
        }
        g1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        g1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var4, g7.e6.n(-1, 48));
        g1Var4.setOnClickListener(new jo0(rp0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(rp0Var.getThemedColor(org.telegram.ui.ActionBar.f6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, g7.e6.n(-1, -2));
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(linearLayout, -2, -2);
        rp0Var.F0 = o1Var;
        o1Var.f23688b = false;
        o1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        rp0Var.F0.setOutsideTouchable(true);
        rp0Var.F0.setClippingEnabled(true);
        rp0Var.F0.setInputMethodMode(2);
        rp0Var.F0.setSoftInputMode(0);
        rp0Var.F0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        rp0Var.F0.setFocusable(true);
        int[] iArr = new int[2];
        wo0Var.getLocationInWindow(iArr);
        if (rp0Var.keyboardVisible && (qnVar = rp0Var.f32243b0) != null && qnVar.T0.getMeasuredHeight() > AndroidUtilities.dp(58.0f)) {
            measuredHeight = wo0Var.getMeasuredHeight() + iArr[1];
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
        }
        rp0Var.F0.showAtLocation(wo0Var, 51, AndroidUtilities.dp(8.0f) + ((wo0Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
        rp0Var.F0.b();
        try {
            wo0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void o(rp0 rp0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i9, HashMap hashMap) {
        int i10;
        int i11;
        boolean z11;
        Long l10;
        long j10;
        char c10;
        MessageObject messageObject;
        long j11;
        long longValue;
        String charSequence;
        long longValue2;
        Long l11;
        int i12;
        long j12;
        String[] strArr;
        MessageObject messageObject2;
        SendMessagesHelper.SendMessageParams of2;
        long longValue3;
        String charSequence2;
        ArrayList arrayList2;
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.TL_forumTopic tL_forumTopic2;
        Long l12;
        uo0 uo0Var;
        long j13;
        long j14;
        Long l13;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue4;
        String charSequence3;
        long longValue5;
        String[] strArr2 = rp0Var.K;
        vo0 vo0Var = rp0Var.d;
        uo0 uo0Var2 = rp0Var.f32244c;
        HashMap hashMap2 = rp0Var.R;
        Long l14 = 0L;
        a0.h hVar = rp0Var.Q;
        ArrayList arrayList3 = rp0Var.J;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i13 = 0;
            boolean z12 = false;
            while (true) {
                if (i13 < hVar.m()) {
                    long j15 = hVar.j(i13);
                    boolean isMonoForum = MessagesController.getInstance(rp0Var.currentAccount).isMonoForum(j15);
                    if (hashMap == null) {
                        l12 = l14;
                    } else {
                        l12 = (Long) hashMap.get(Long.valueOf(j15));
                    }
                    if (l12 != null && l12.longValue() > 0) {
                        z12 = true;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j15));
                    if (tL_forumTopic3 != null && isMonoForum) {
                        uo0Var = uo0Var2;
                        j13 = j15;
                        j14 = DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    } else {
                        uo0Var = uo0Var2;
                        j13 = j15;
                        j14 = 0;
                    }
                    if (tL_forumTopic3 != null && !isMonoForum) {
                        l13 = l14;
                        messageObject3 = new MessageObject(rp0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    } else {
                        l13 = l14;
                        messageObject3 = null;
                    }
                    if (messageObject3 != null) {
                        messageObject3.isTopicMainMessage = true;
                    }
                    if (uo0Var.getTag() != null && vo0Var.f33121a.length() > 0) {
                        CharSequence charSequence4 = charSequenceArr[0];
                        if (charSequence4 == null) {
                            charSequence3 = null;
                        } else {
                            charSequence3 = charSequence4.toString();
                        }
                        MessageObject messageObject5 = messageObject3;
                        SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(charSequence3, j13, messageObject5, messageObject3, null, true, arrayList, null, null, z10, 0, 0, null, false);
                        messageObject4 = messageObject5;
                        if (l12 == null) {
                            arrayList2 = arrayList3;
                            longValue5 = 0;
                        } else {
                            arrayList2 = arrayList3;
                            longValue5 = l12.longValue();
                        }
                        of3.payStars = longValue5;
                        of3.monoForumPeer = j14;
                        SendMessagesHelper.getInstance(rp0Var.currentAccount).sendMessage(of3);
                    } else {
                        messageObject4 = messageObject3;
                        arrayList2 = arrayList3;
                    }
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(rp0Var.currentAccount);
                    ArrayList<MessageObject> arrayList5 = rp0Var.J;
                    boolean z13 = !rp0Var.E0;
                    if (l12 == null) {
                        longValue4 = 0;
                    } else {
                        longValue4 = l12.longValue();
                    }
                    long j16 = j13;
                    int sendMessage = sendMessagesHelper.sendMessage(arrayList5, j16, z13, false, z10, 0, 0, messageObject4, i9, longValue4, j14, null);
                    if (sendMessage != 0) {
                        arrayList4.add(Long.valueOf(j16));
                    }
                    if (hVar.m() == 1) {
                        tL_forumTopic = null;
                        y4.t0(sendMessage, rp0Var.f32243b0, null);
                        if (sendMessage != 0) {
                            break;
                        }
                    }
                    i13++;
                    arrayList3 = arrayList2;
                    uo0Var2 = uo0Var;
                    l14 = l13;
                } else {
                    arrayList2 = arrayList3;
                    tL_forumTopic = null;
                    break;
                }
            }
            int size = arrayList4.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList4.get(i14);
                i14++;
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
                rp0Var.R0(hVar, size2, tL_forumTopic2, !z12);
            }
        } else {
            dp0 dp0Var = rp0Var.S;
            if (dp0Var != null) {
                i10 = dp0Var.d;
            } else {
                i10 = 0;
            }
            if (rp0Var.B0 != null) {
                int i15 = 0;
                boolean z14 = false;
                while (i15 < hVar.m()) {
                    long j17 = hVar.j(i15);
                    boolean isMonoForum2 = MessagesController.getInstance(rp0Var.currentAccount).isMonoForum(j17);
                    if (hashMap == null) {
                        l11 = l14;
                    } else {
                        l11 = (Long) hashMap.get(Long.valueOf(j17));
                    }
                    if (l11 != null && l11.longValue() > 0) {
                        z14 = true;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j17));
                    if (tL_forumTopic4 != null && isMonoForum2) {
                        i12 = i10;
                        j12 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                    } else {
                        i12 = i10;
                        j12 = 0;
                    }
                    if (tL_forumTopic4 != null && !isMonoForum2) {
                        strArr = strArr2;
                        messageObject2 = new MessageObject(rp0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                    } else {
                        strArr = strArr2;
                        messageObject2 = null;
                    }
                    if (rp0Var.B0 == null) {
                        if (uo0Var2.getTag() != null && vo0Var.f33121a.length() > 0) {
                            CharSequence charSequence5 = charSequenceArr[0];
                            if (charSequence5 == null) {
                                charSequence2 = null;
                            } else {
                                charSequence2 = charSequence5.toString();
                            }
                            of2 = SendMessagesHelper.SendMessageParams.of(charSequence2, j17, messageObject2, messageObject2, null, true, arrayList, null, null, z10, 0, 0, null, false);
                        } else {
                            of2 = SendMessagesHelper.SendMessageParams.of(strArr[i12], j17, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        }
                    } else {
                        if (uo0Var2.getTag() != null && vo0Var.f33121a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(rp0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j17, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j17, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = rp0Var.B0;
                    }
                    if (l11 == null) {
                        longValue3 = 0;
                    } else {
                        longValue3 = l11.longValue();
                    }
                    of2.payStars = longValue3;
                    of2.monoForumPeer = j12;
                    SendMessagesHelper.getInstance(rp0Var.currentAccount).sendMessage(of2);
                    i15++;
                    i10 = i12;
                    strArr2 = strArr;
                }
                z11 = z14;
            } else {
                int i16 = i10;
                if (strArr2[i16] != null) {
                    boolean z15 = false;
                    for (int i17 = 0; i17 < hVar.m(); i17++) {
                        long j18 = hVar.j(i17);
                        boolean isMonoForum3 = MessagesController.getInstance(rp0Var.currentAccount).isMonoForum(j18);
                        if (hashMap == null) {
                            l10 = l14;
                        } else {
                            l10 = (Long) hashMap.get(Long.valueOf(j18));
                        }
                        if (l10 != null && l10.longValue() > 0) {
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
                            messageObject = new MessageObject(rp0Var.currentAccount, tL_forumTopic5.topicStartMessage, false, false);
                        } else {
                            c10 = 0;
                            messageObject = null;
                        }
                        if (uo0Var2.getTag() != null && vo0Var.f33121a.length() > 0) {
                            CharSequence charSequence6 = charSequenceArr[c10];
                            if (charSequence6 == null) {
                                charSequence = null;
                            } else {
                                charSequence = charSequence6.toString();
                            }
                            SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(charSequence, j18, messageObject, messageObject, null, true, arrayList, null, null, z10, 0, 0, null, false);
                            j11 = j18;
                            if (l10 == null) {
                                longValue2 = 0;
                            } else {
                                longValue2 = l10.longValue();
                            }
                            of4.payStars = longValue2;
                            of4.monoForumPeer = j10;
                            SendMessagesHelper.getInstance(rp0Var.currentAccount).sendMessage(of4);
                        } else {
                            j11 = j18;
                        }
                        SendMessagesHelper.SendMessageParams of5 = SendMessagesHelper.SendMessageParams.of(strArr2[i16], j11, messageObject, messageObject, null, true, null, null, null, z10, 0, 0, null, false);
                        if (l10 == null) {
                            longValue = 0;
                        } else {
                            longValue = l10.longValue();
                        }
                        of5.payStars = longValue;
                        of5.monoForumPeer = j10;
                        SendMessagesHelper.getInstance(rp0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z15;
                } else {
                    i11 = 0;
                    z11 = false;
                    rp0Var.R0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i11)), !z11);
                }
            }
            i11 = 0;
            rp0Var.R0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i11)), !z11);
        }
        gp0 gp0Var = rp0Var.f32259o0;
        if (gp0Var != null) {
            gp0Var.A();
        }
        rp0Var.dismiss();
    }

    public static void p(rp0 rp0Var, int i9) {
        TLRPC.Dialog dialog;
        m10 m10Var = rp0Var.f32267u0;
        HashMap hashMap = rp0Var.R;
        a0.h hVar = rp0Var.Q;
        jp0 jp0Var = rp0Var.G;
        op0 op0Var = rp0Var.H;
        if (op0Var.d && i9 == 1) {
            TLRPC.Dialog dialog2 = rp0Var.f32274y0;
            if (dialog2 != null) {
                hVar.k(dialog2, dialog2.f22384id);
                hashMap.remove(dialog2);
                rp0Var.a1(2);
                if (rp0Var.H0 || rp0Var.I0) {
                    if (((TLRPC.Dialog) jp0Var.f29817e.f(dialog2.f22384id)) == null) {
                        jp0Var.f29817e.k(dialog2, dialog2.f22384id);
                        ArrayList arrayList = jp0Var.d;
                        arrayList.add(!arrayList.isEmpty(), dialog2);
                    }
                    jp0Var.l();
                    rp0Var.f32270w0 = false;
                    m10Var.f30664r.setText("");
                    rp0Var.K0(false);
                }
                for (int i10 = 0; i10 < rp0Var.P0().getChildCount(); i10++) {
                    View childAt = rp0Var.P0().getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.e7) {
                        org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) childAt;
                        if (e7Var.getCurrentDialog() == rp0Var.f32274y0.f22384id) {
                            e7Var.d(null, false, true);
                            e7Var.b(true, true);
                        }
                    }
                }
                rp0Var.L0();
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic E = op0Var.E(i9);
        if (E != null && (dialog = rp0Var.f32274y0) != null) {
            long j10 = dialog.f22384id;
            boolean isMonoForum = MessagesController.getInstance(rp0Var.currentAccount).isMonoForum(j10);
            TLRPC.Dialog dialog3 = rp0Var.f32274y0;
            hVar.k(dialog3, j10);
            hashMap.put(dialog3, E);
            rp0Var.a1(2);
            if (rp0Var.H0 || rp0Var.I0) {
                if (((TLRPC.Dialog) jp0Var.f29817e.f(dialog3.f22384id)) == null) {
                    jp0Var.f29817e.k(dialog3, dialog3.f22384id);
                    ArrayList arrayList2 = jp0Var.d;
                    arrayList2.add(!arrayList2.isEmpty(), dialog3);
                }
                jp0Var.l();
                rp0Var.f32270w0 = false;
                m10Var.f30664r.setText("");
                rp0Var.K0(false);
            }
            for (int i11 = 0; i11 < rp0Var.P0().getChildCount(); i11++) {
                View childAt2 = rp0Var.P0().getChildAt(i11);
                if (childAt2 instanceof org.telegram.ui.Cells.e7) {
                    org.telegram.ui.Cells.e7 e7Var2 = (org.telegram.ui.Cells.e7) childAt2;
                    if (e7Var2.getCurrentDialog() == rp0Var.f32274y0.f22384id) {
                        e7Var2.d(E, isMonoForum, true);
                        e7Var2.b(true, true);
                    }
                }
            }
            rp0Var.L0();
        }
    }

    public static void r0(rp0 rp0Var) {
        so0 so0Var;
        int i9;
        int i10;
        so0 so0Var2 = rp0Var.B;
        so0 so0Var3 = rp0Var.C;
        wk0 wk0Var = rp0Var.A;
        if (!rp0Var.f32258n0) {
            if (rp0Var.H0) {
                so0Var = so0Var3;
            } else {
                so0Var = so0Var2;
            }
            if (so0Var.getChildCount() > 0) {
                View childAt = so0Var.getChildAt(0);
                for (int i11 = 0; i11 < so0Var.getChildCount(); i11++) {
                    if (so0Var.getChildAt(i11).getTop() < childAt.getTop()) {
                        childAt = so0Var.getChildAt(i11);
                    }
                }
                ik0 ik0Var = (ik0) so0Var.G(childAt);
                int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
                if (top > 0 && ik0Var != null && ik0Var.b() == 0) {
                    i9 = top;
                } else {
                    i9 = 0;
                }
                if (top >= 0 && ik0Var != null && ik0Var.b() == 0) {
                    rp0Var.G0 = childAt.getTop();
                    rp0Var.T0(false);
                } else {
                    rp0Var.G0 = Integer.MAX_VALUE;
                    rp0Var.T0(true);
                    top = i9;
                }
                if (wk0Var.getVisibility() == 0) {
                    if (wk0Var.getChildCount() > 0) {
                        View childAt2 = wk0Var.getChildAt(0);
                        for (int i12 = 0; i12 < wk0Var.getChildCount(); i12++) {
                            if (wk0Var.getChildAt(i12).getTop() < childAt2.getTop()) {
                                childAt2 = wk0Var.getChildAt(i12);
                            }
                        }
                        ik0 ik0Var2 = (ik0) wk0Var.G(childAt2);
                        int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
                        if (top2 > 0 && ik0Var2 != null && ik0Var2.b() == 0) {
                            i10 = top2;
                        } else {
                            i10 = 0;
                        }
                        if (top2 >= 0 && ik0Var2 != null && ik0Var2.b() == 0) {
                            rp0Var.G0 = childAt2.getTop();
                            rp0Var.T0(false);
                        } else {
                            rp0Var.G0 = Integer.MAX_VALUE;
                            rp0Var.T0(true);
                            top2 = i10;
                        }
                        top = AndroidUtilities.lerp(top, top2, wk0Var.getAlpha());
                    } else {
                        return;
                    }
                }
                int i13 = rp0Var.f32256l0;
                if (i13 != top) {
                    rp0Var.m0 = i13;
                    float f10 = top;
                    int i14 = (int) (rp0Var.f32260p0 + f10);
                    rp0Var.f32256l0 = i14;
                    so0Var2.setTopGlowOffset(i14);
                    int i15 = (int) (rp0Var.f32260p0 + f10);
                    rp0Var.f32256l0 = i15;
                    so0Var3.setTopGlowOffset(i15);
                    int i16 = (int) (f10 + rp0Var.f32260p0);
                    rp0Var.f32256l0 = i16;
                    wk0Var.setTopGlowOffset(i16);
                    rp0Var.f32242b.setTranslationY(rp0Var.f32256l0 + rp0Var.f32260p0);
                    rp0Var.M.setTranslationY(rp0Var.f32256l0 + rp0Var.f32260p0);
                    rp0Var.containerView.invalidate();
                }
            }
        }
    }

    public static void z0(rp0 rp0Var) {
        float f10;
        RectF rectF = rp0Var.V0;
        ig.e eVar = rp0Var.K0;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            rectF.set(0.0f, 0.0f, rp0Var.containerView.getMeasuredWidth(), rp0Var.containerView.getMeasuredHeight());
            if (LiteMode.isEnabled(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f10);
            eVar.g(1, rp0Var.U0);
            eVar.e(rp0Var.Q0, rp0Var.containerView.getMeasuredWidth(), rp0Var.containerView.getMeasuredHeight());
        }
    }

    public final void K0(boolean z10) {
        m10 m10Var = this.f32267u0;
        fg.g gVar = m10Var.f30664r;
        fg.g gVar2 = m10Var.f30664r;
        boolean isEmpty = TextUtils.isEmpty(gVar.getText());
        so0 so0Var = this.B;
        so0 so0Var2 = this.C;
        boolean z11 = true;
        if (isEmpty && ((!this.keyboardVisible || !gVar2.hasFocus()) && !this.I0)) {
            if (this.f32274y0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(so0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(so0Var2, false);
            }
            z11 = false;
        } else {
            this.f32270w0 = true;
            if (this.f32274y0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(so0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(so0Var2, true);
            }
        }
        if (this.H0 == z11 && !z10) {
            return;
        }
        this.H0 = z11;
        np0 np0Var = this.I;
        np0Var.l();
        this.G.l();
        if (this.H0) {
            if (this.G0 == Integer.MAX_VALUE) {
                ((f2.m0) so0Var2.getLayoutManager()).h1(0, -so0Var2.getPaddingTop());
            } else {
                ((f2.m0) so0Var2.getLayoutManager()).h1(0, this.G0 - so0Var2.getPaddingTop());
            }
            np0Var.E(gVar2.getText().toString());
            return;
        }
        int i9 = this.G0;
        f2.y yVar = this.D;
        if (i9 == Integer.MAX_VALUE) {
            yVar.h1(0, 0);
        } else {
            yVar.h1(0, 0);
        }
    }

    public final void L0() {
        float f10;
        TLRPC.Dialog dialog = this.f32274y0;
        if (dialog != null) {
            org.telegram.ui.Cells.e7 e7Var = null;
            this.f32274y0 = null;
            for (int i9 = 0; i9 < P0().getChildCount(); i9++) {
                View childAt = P0().getChildAt(i9);
                if ((childAt instanceof org.telegram.ui.Cells.e7) && ((org.telegram.ui.Cells.e7) childAt).getCurrentDialog() == dialog.f22384id) {
                    e7Var = childAt;
                }
            }
            if (e7Var == null) {
                return;
            }
            o1.j jVar = this.f32272x0;
            if (jVar != null) {
                jVar.c();
            }
            P0().setVisibility(0);
            m10 m10Var = this.f32267u0;
            m10Var.setVisibility(0);
            fg.g gVar = m10Var.f30664r;
            if (this.H0 || this.I0) {
                this.f32275z0.D.v = true;
                gVar.requestFocus();
                AndroidUtilities.showKeyboard(gVar);
            }
            int[] iArr = new int[2];
            o1.j jVar2 = new o1.j(new gb.a(1000.0f));
            o1.k kVar = new o1.k(0.0f);
            org.telegram.ui.qn qnVar = this.f32243b0;
            if (qnVar != null && qnVar.f41851b) {
                f10 = 10.0f;
            } else {
                f10 = 800.0f;
            }
            kVar.b(f10);
            kVar.a(1.0f);
            jVar2.f18800u = kVar;
            this.f32272x0 = jVar2;
            jVar2.b(new io0(this, e7Var, iArr, 0));
            this.f32272x0.a(new ya(this, 4));
            this.f32272x0.f();
        }
    }

    public final void M0() {
        boolean z10 = false;
        if (this.f32251g0 != null || this.f32255k0[0] != null) {
            try {
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
                gp0 gp0Var = this.f32259o0;
                if (gp0Var != null) {
                    gp0Var.h0();
                } else if (this.f32245c0 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f32251g0;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z10 = true;
                    }
                    ((LaunchActivity) this.f32245c0).D0(new h3.t(2, z10));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final String O0() {
        String str;
        String str2;
        String[] strArr = this.f32255k0;
        dp0 dp0Var = this.S;
        if (dp0Var != null) {
            str2 = strArr[dp0Var.d];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f32251g0;
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
        dp dpVar = this.f32241a0;
        if (dpVar != null && dpVar.f27781a.f26313q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.X)).build().toString();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final wk0 P0() {
        if (!this.H0 && !this.I0) {
            return this.B;
        }
        return this.C;
    }

    public final void Q0(View view, int[] iArr, float f10) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        wk0 wk0Var = this.A;
        wk0Var.setPivotX(width);
        wk0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f11 = 0.25f * f10;
        float f12 = 0.75f + f11;
        wk0Var.setScaleX(f12);
        wk0Var.setScaleY(f12);
        wk0Var.setAlpha(f10);
        wk0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f13 = f11 + 1.0f;
        P0.setScaleX(f13);
        P0.setScaleY(f13);
        float f14 = 1.0f - f10;
        P0.setAlpha(f14);
        m10 m10Var = this.f32267u0;
        m10Var.setPivotX(m10Var.getWidth() / 2.0f);
        m10Var.setPivotY(0.0f);
        float f15 = (0.1f * f14) + 0.9f;
        m10Var.setScaleX(f15);
        m10Var.setScaleY(f15);
        m10Var.setAlpha(f14);
        org.telegram.ui.ActionBar.k kVar = this.f32268v0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f14);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f14);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f14);
        kVar.setAlpha(f10);
        wk0Var.getLocationInWindow(iArr);
        float interpolation = gr.f28845g.getInterpolation(f10);
        for (int i9 = 0; i9 < P0.getChildCount(); i9++) {
            View childAt = P0.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.e7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f10, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f14);
                }
            }
        }
        for (int i10 = 0; i10 < wk0Var.getChildCount(); i10++) {
            View childAt2 = wk0Var.getChildAt(i10);
            if (childAt2 instanceof org.telegram.ui.Cells.f7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y10 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((wk0Var.getTranslationY() + y10) - view.getY()))));
            }
        }
        this.containerView.requestLayout();
        P0.invalidate();
    }

    public final void T0(boolean z10) {
        Integer num;
        float f10;
        View[] viewArr = this.O;
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
            AnimatorSet[] animatorSetArr = this.P;
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            View view2 = viewArr[0];
            Property property = View.ALPHA;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f10));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].addListener(new ap0(this, z10, 0));
            animatorSetArr[0].start();
        }
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        rp0 rp0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        mp0 mp0Var;
        if (dialog instanceof ip0) {
            S0(view);
        } else if (((view instanceof org.telegram.ui.Cells.e7) && ((org.telegram.ui.Cells.e7) view).B) || ((view instanceof org.telegram.ui.Cells.h6) && ((org.telegram.ui.Cells.h6) view).f24449j0)) {
            X0(dialog.f22384id, view);
        } else {
            wk0 wk0Var = this.A;
            if (wk0Var.getVisibility() == 8 && (activity = this.f32245c0) != null) {
                boolean isChatDialog = DialogObject.isChatDialog(dialog.f22384id);
                int i9 = this.L;
                if (isChatDialog) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f22384id));
                    if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.f22384id, this.currentAccount) || i9 == 2 || i9 == 3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        String string = LocaleController.getString(R.string.SendMessageTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.N = string;
                        if (i9 == 3) {
                            if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                c2Var.P = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                            } else {
                                c2Var.P = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                            }
                        } else if (i9 == 2) {
                            if (this.f32254j0) {
                                c2Var.P = LocaleController.getString(R.string.PublicPollCantForward);
                            } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                c2Var.P = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                            } else {
                                c2Var.P = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                            }
                        } else {
                            c2Var.P = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        j3.r0.v(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                } else if (DialogObject.isEncryptedDialog(dialog.f22384id) && i9 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String string2 = LocaleController.getString(R.string.SendMessageTitle);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                    c2Var2.N = string2;
                    if (i9 == 3) {
                        c2Var2.P = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i9 != 0) {
                        c2Var2.P = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        c2Var2.P = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    j3.r0.v(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
                long j10 = dialog.f22384id;
                a0.h hVar = this.Q;
                if (hVar.h(j10) >= 0) {
                    hVar.l(dialog.f22384id);
                    this.R.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.h6) {
                        ((org.telegram.ui.Cells.h6) view).s(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.e7) {
                        ((org.telegram.ui.Cells.e7) view).b(false, true);
                    }
                    a1(1);
                    rp0Var = this;
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.f22384id));
                    TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f22384id));
                    if ((!UserObject.isBotForum(user) || (((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f22527id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f22527id))) && (!DialogObject.isChatDialog(dialog.f22384id) || (!ChatObject.isForum(chat2) && (!ChatObject.isMonoForum(chat2) || !ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                        rp0Var = this;
                        hVar.k(dialog, dialog.f22384id);
                        if (view instanceof org.telegram.ui.Cells.h6) {
                            ((org.telegram.ui.Cells.h6) view).s(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.e7) {
                            ((org.telegram.ui.Cells.e7) view).b(true, true);
                        }
                        a1(2);
                        long j11 = UserConfig.getInstance(rp0Var.currentAccount).clientUserId;
                        if (rp0Var.H0) {
                            jp0 jp0Var = rp0Var.G;
                            a0.h hVar2 = jp0Var.f29817e;
                            ArrayList arrayList = jp0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.f22384id);
                            if (dialog2 == null) {
                                jp0Var.f29817e.k(dialog, dialog.f22384id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f22384id != j11) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            jp0Var.l();
                            rp0Var.f32270w0 = false;
                            m10 m10Var = rp0Var.f32267u0;
                            m10Var.f30664r.setText("");
                            K0(false);
                            AndroidUtilities.hideKeyboard(m10Var.f30664r);
                        }
                    } else {
                        this.f32274y0 = dialog;
                        this.E.h1(0, this.f32256l0 - wk0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        yo0 yo0Var = new yo0(this, dialog, atomicReference, view);
                        atomicReference.set(new no0(this, atomicReference, yo0Var, dialog, 0));
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                        int i10 = NotificationCenter.topicsDidLoaded;
                        notificationCenter.addObserver(yo0Var, i10);
                        if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.f22384id) != null) {
                            yo0Var.didReceivedNotification(i10, this.currentAccount, Long.valueOf(-dialog.f22384id));
                            return;
                        }
                        MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.f22384id);
                        AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                np0 np0Var = rp0Var.I;
                if (np0Var != null && (mp0Var = np0Var.D) != null) {
                    mp0Var.q(0, mp0Var.h());
                }
            }
        }
    }

    public final void V0(final boolean z10) {
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        while (true) {
            a0.h hVar = this.Q;
            int m10 = hVar.m();
            uo0 uo0Var = this.f32244c;
            vo0 vo0Var = this.d;
            boolean z11 = true;
            if (i12 < m10) {
                if (y4.h(getContext(), this.currentAccount, hVar.j(i12), (uo0Var.getTag() == null || vo0Var.f33121a.length() <= 0) ? false : false)) {
                    return;
                }
                i12++;
            } else {
                Editable text = vo0Var.getText();
                pt ptVar = vo0Var.f33121a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                dp dpVar = this.f32241a0;
                if (dpVar != null && dpVar.f27781a.f26313q) {
                    i9 = this.X;
                } else {
                    i9 = -1;
                }
                ArrayList arrayList = new ArrayList();
                if (this.J != null) {
                    i11 = 0;
                    for (int i13 = 0; i13 < hVar.m(); i13++) {
                        long j10 = hVar.j(i13);
                        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j10);
                        if (sendPaidMessagesStars <= 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j10));
                        }
                        if (uo0Var.getTag() != null && ptVar.length() > 0 && sendPaidMessagesStars > 0) {
                            i11++;
                        }
                        int i14 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
                        if (i14 > 0) {
                            i11++;
                        }
                        if (i14 > 0 && !arrayList.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                        }
                    }
                } else {
                    dp0 dp0Var = this.S;
                    if (dp0Var != null) {
                        i10 = dp0Var.d;
                    } else {
                        i10 = 0;
                    }
                    if (this.B0 != null) {
                        int i15 = 0;
                        for (int i16 = 0; i16 < hVar.m(); i16++) {
                            long j11 = hVar.j(i16);
                            long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
                            if (sendPaidMessagesStars2 <= 0) {
                                sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
                            }
                            if (this.B0 != null && uo0Var.getTag() != null && ptVar.length() > 0 && charSequenceArr[0] != null && sendPaidMessagesStars2 > 0) {
                                i15++;
                            }
                            int i17 = (sendPaidMessagesStars2 > 0L ? 1 : (sendPaidMessagesStars2 == 0L ? 0 : -1));
                            if (i17 > 0) {
                                i15++;
                            }
                            if (i17 > 0 && !arrayList.contains(Long.valueOf(j11))) {
                                arrayList.add(Long.valueOf(j11));
                            }
                        }
                        i11 = i15;
                    } else {
                        int i18 = 0;
                        if (this.K[i10] != null) {
                            for (int i19 = 0; i19 < hVar.m(); i19++) {
                                long j12 = hVar.j(i19);
                                long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j12);
                                if (sendPaidMessagesStars3 <= 0) {
                                    sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j12));
                                }
                                if (uo0Var.getTag() != null && ptVar.length() > 0 && sendPaidMessagesStars3 > 0) {
                                    i18++;
                                }
                                int i20 = (sendPaidMessagesStars3 > 0L ? 1 : (sendPaidMessagesStars3 == 0L ? 0 : -1));
                                if (i20 > 0) {
                                    i18++;
                                }
                                if (i20 > 0 && !arrayList.contains(Long.valueOf(j12))) {
                                    arrayList.add(Long.valueOf(j12));
                                }
                            }
                            i11 = i18;
                        } else {
                            i11 = 0;
                        }
                    }
                }
                final int i21 = i9;
                y4.c0(this.currentAccount, arrayList, i11, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        rp0.o(rp0.this, charSequenceArr, entities, z10, i21, (HashMap) obj);
                    }
                });
                return;
            }
        }
    }

    public final void W0(boolean z10) {
        boolean z11;
        Integer num;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i9;
        uo0 uo0Var = this.f32244c;
        if (uo0Var.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.f32273y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        uo0Var.setTag(num);
        vo0 vo0Var = this.d;
        if (vo0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(vo0Var.getEditText());
        }
        vo0Var.k(true);
        FrameLayout frameLayout = this.Y;
        uo0 uo0Var2 = this.f32249f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            uo0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            uo0Var2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        int i10 = 4;
        if (frameLayout2 != null) {
            if (z10) {
                i9 = 4;
            } else {
                i9 = 1;
            }
            WeakHashMap weakHashMap = r0.j0.f46915a;
            frameLayout2.setImportantForAccessibility(i9);
        }
        LinearLayout linearLayout = this.f32271x;
        if (linearLayout != null) {
            if (!z10) {
                i10 = 1;
            }
            WeakHashMap weakHashMap2 = r0.j0.f46915a;
            linearLayout.setImportantForAccessibility(i10);
        }
        this.f32273y = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f15 = 0.0f;
        float f16 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(uo0Var, property, f10));
        if (frameLayout != null && frameLayout2 == null) {
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, property, f14));
        }
        Property property2 = View.SCALE_X;
        float f17 = 0.2f;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.2f;
        }
        arrayList.add(ObjectAnimator.ofFloat(uo0Var2, property2, f11));
        Property property3 = View.SCALE_Y;
        if (z10) {
            f17 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(uo0Var2, property3, f17));
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(uo0Var2, property, f12));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.O[1];
            if (!z10) {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f16));
        }
        FrameLayout frameLayout3 = this.f32262r;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.f32246d0 && z10) {
                if (this.Z != null) {
                    f13 = 5.0f;
                } else {
                    f13 = 16.0f;
                }
                f15 = AndroidUtilities.dp(f13);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, f15));
        }
        this.f32273y.playTogether(arrayList);
        this.f32273y.setInterpolator(new DecelerateInterpolator());
        this.f32273y.setDuration(180L);
        this.f32273y.addListener(new ap0(this, z10, 1));
        this.f32273y.start();
    }

    public final void X0(long j10, View view) {
        String str;
        gc J;
        int i9 = -this.D0;
        this.D0 = i9;
        AndroidUtilities.shakeViewSpring(view, i9);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j10 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)));
        } else {
            str = "";
        }
        boolean premiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
        FrameLayout frameLayout = this.v;
        if (premiumFeaturesBlocked) {
            J = new oc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = new oc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new lo0(this, 1));
        }
        J.j();
    }

    public final void Y0() {
        org.telegram.ui.ActionBar.q1 q1Var;
        uo0 uo0Var = this.f32244c;
        if (uo0Var == null) {
            return;
        }
        vo0 vo0Var = this.d;
        if (vo0Var != null && vo0Var.m()) {
            vo0Var.getEmojiPaddingShown();
        } else {
            cp0 cp0Var = this.f32275z0;
            if (cp0Var != null && (q1Var = cp0Var.D) != null && !q1Var.f23718f) {
                AndroidUtilities.dp(20.0f);
            }
        }
        float f10 = 0.0f;
        FrameLayout frameLayout = this.Y;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f10 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            float f11 = -f10;
            frameLayout2.setTranslationY(f11);
            LinearLayout linearLayout = this.f32271x;
            if (linearLayout != null) {
                linearLayout.setTranslationY(f11);
            }
        }
        float f12 = -f10;
        uo0Var.setTranslationY(f12);
        this.f32249f.setTranslationY(f12);
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.h5 h5Var = this.f32264s;
        if (h5Var != null) {
            String O0 = O0();
            if (O0.startsWith("https://")) {
                O0 = O0.substring(8);
            } else if (O0.startsWith("http://")) {
                O0 = O0.substring(7);
            }
            h5Var.k(O0);
        }
    }

    public final void a1(int i9) {
        int size;
        boolean z10;
        boolean z11;
        a0.h hVar = this.Q;
        if (hVar.m() == 0) {
            W0(false);
            return;
        }
        ArrayList arrayList = this.J;
        if (arrayList == null) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        Object tag = this.f32244c.getTag();
        vo0 vo0Var = this.d;
        if (tag != null && vo0Var.f33121a.length() > 0) {
            size++;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            long j11 = ((TLRPC.Dialog) hVar.n(i10)).f22384id;
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
            }
            j10 += sendPaidMessagesStars;
        }
        int max = Math.max(1, hVar.m());
        if (i9 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        wo0 wo0Var = this.f32247e;
        wo0Var.g(max, z10);
        if (i9 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        wo0Var.i(size, j10, z11);
        W0(true);
        vo0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), wo0Var.l()), 0);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.dialogsNeedReload;
        if (i9 == i11) {
            jp0 jp0Var = this.G;
            if (jp0Var != null) {
                jp0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i11);
        }
    }

    @Override
    public final void dismiss() {
        vo0 vo0Var = this.d;
        if (vo0Var != null) {
            AndroidUtilities.hideKeyboard(vo0Var.getEditText());
        }
        this.U = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        vo0 vo0Var = this.d;
        if (vo0Var != null) {
            vo0Var.o();
        }
    }

    @Override
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.T;
    }

    @Override
    public final void onBackPressed() {
        if (this.f32274y0 != null) {
            L0();
            return;
        }
        vo0 vo0Var = this.d;
        if (vo0Var != null && vo0Var.f33124e) {
            vo0Var.k(true);
        } else {
            super.onBackPressed();
        }
    }

    public rp0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    public rp0(android.content.Context r38, org.telegram.ui.qn r39, java.util.ArrayList r40, java.lang.String r41, java.lang.String r42, boolean r43, java.lang.String r44, java.lang.String r45, boolean r46, boolean r47, boolean r48, java.lang.Integer r49, org.telegram.ui.ActionBar.b6 r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rp0.<init>(android.content.Context, org.telegram.ui.qn, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.b6):void");
    }

    public void S0(View view) {
    }

    public void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
