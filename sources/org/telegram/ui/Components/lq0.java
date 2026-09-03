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
public class lq0 extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int X0 = 0;
    public final wp0 A0;
    public final rl0 B;
    public ArrayList B0;
    public final lp0 C;
    public TL_stories.StoryItem C0;
    public final lp0 D;
    public i0.b D0;
    public final f2.w E;
    public int E0;
    public final f2.w F;
    public boolean F0;
    public final oz G;
    public org.telegram.ui.ActionBar.p1 G0;
    public final dq0 H;
    public int H0;
    public final iq0 I;
    public boolean I0;
    public final hq0 J;
    public boolean J0;
    public final ArrayList K;
    public int K0;
    public final String[] L;
    public final ng.e L0;
    public final int M;
    public final sg.d M0;
    public final zw0 N;
    public final sg.d N0;
    public final Drawable O;
    public final ng.a O0;
    public final View[] P;
    public final ng.a P0;
    public final AnimatorSet[] Q;
    public final ng.a Q0;
    public final a0.h R;
    public final ng.k R0;
    public final HashMap S;
    public final pg.b S0;
    public final xp0 T;
    public final ng.b T0;
    public int U;
    public final pg.b U0;
    public boolean V;
    public final ArrayList V0;
    public final boolean W;
    public final RectF W0;
    public boolean X;
    public final int Y;
    public final FrameLayout Z;
    public final LinearLayout f26832a0;
    public final FrameLayout f26833b;
    public final kp f26834b0;
    public final np0 f26835c;
    public final org.telegram.ui.zn f26836c0;
    public final op0 d;
    public final Activity f26837d0;
    public final pp0 e;
    public final boolean f26838e0;
    public final np0 f26839f;
    public boolean f26840f0;
    public final TextPaint f26841g0;
    public final FrameLayout h;
    public TLRPC.TL_exportedMessageLink f26842h0;
    public boolean f26843i0;
    public boolean f26844j0;
    public final boolean f26845k0;
    public final String[] f26846l0;
    public int m0;
    public final eg.h0 f26847n;
    public int f26848n0;
    public boolean f26849o0;
    public aq0 f26850p0;
    public float f26851q0;
    public final FrameLayout f26852r;
    public float f26853r0;
    public final org.telegram.ui.ActionBar.k5 f26854s;
    public float f26855s0;
    public ValueAnimator f26856t0;
    public final yk0 f26857u0;
    public final FrameLayout v;
    public final d20 f26858v0;
    public final FrameLayout f26859w;
    public final org.telegram.ui.ActionBar.k f26860w0;
    public final LinearLayout f26861x;
    public boolean f26862x0;
    public AnimatorSet f26863y;
    public o1.j f26864y0;
    public TLRPC.Dialog f26865z0;

    public lq0(Context context, ArrayList arrayList, String str, boolean z4, String str2, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, null, arrayList, str, null, z4, str2, null, z10, false, false, null, f6Var);
    }

    public static void A0(lq0 lq0Var) {
        float f10;
        RectF rectF = lq0Var.W0;
        ng.e eVar = lq0Var.L0;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            rectF.set(0.0f, 0.0f, lq0Var.containerView.getMeasuredWidth(), lq0Var.containerView.getMeasuredHeight());
            if (LiteMode.isEnabled(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f10);
            eVar.g(1, lq0Var.V0);
            eVar.e(lq0Var.R0, lq0Var.containerView.getMeasuredWidth(), lq0Var.containerView.getMeasuredHeight());
        }
    }

    public static int F0(lq0 lq0Var) {
        lp0 lp0Var = lq0Var.C;
        if (lp0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = lp0Var.getChildAt(0);
            dl0 dl0Var = (dl0) lp0Var.G(childAt);
            if (dl0Var != null) {
                int paddingTop = lp0Var.getPaddingTop();
                if (dl0Var.c() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    public static lq0 N0(Context context, MessageObject messageObject, String str, boolean z4, String str2) {
        ArrayList arrayList;
        if (messageObject != null) {
            arrayList = org.telegram.messenger.y3.m(messageObject);
        } else {
            arrayList = null;
        }
        return new lq0(context, arrayList, str, null, z4, str2, null, false);
    }

    public static void m(lq0 lq0Var, AtomicReference atomicReference, rp0 rp0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        rp0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, lq0Var.currentAccount, Long.valueOf(-dialog.f19163id));
    }

    public static boolean n(final lq0 lq0Var) {
        int measuredHeight;
        org.telegram.ui.zn znVar;
        pp0 pp0Var = lq0Var.e;
        boolean z4 = lq0Var.f26838e0;
        Activity activity = lq0Var.f26837d0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(lq0Var.getContext());
        linearLayout.setOrientation(1);
        if (lq0Var.K != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, lq0Var.resourcesProvider);
            if (z4) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19926fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new sp0(lq0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new ep0(lq0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, lq0Var.getContext(), lq0Var.resourcesProvider, true, false);
            if (z4) {
                g1Var.setTextColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20069ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, k7.b6.n(-1, 48));
            g1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            lq0Var.F0 = true;
            g1Var.setChecked(true);
            final org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(1, lq0Var.getContext(), lq0Var.resourcesProvider, false, true);
            if (z4) {
                g1Var2.setTextColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20069ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, k7.b6.n(-1, 48));
            g1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            g1Var2.setChecked(!lq0Var.F0);
            g1Var.setOnClickListener(new View.OnClickListener(lq0Var) {
                public final lq0 f25473b;

                {
                    this.f25473b = lq0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            lq0 lq0Var2 = this.f25473b;
                            lq0Var2.F0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!lq0Var2.F0);
                            return;
                        default:
                            lq0 lq0Var3 = this.f25473b;
                            lq0Var3.F0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!lq0Var3.F0);
                            return;
                    }
                }
            });
            g1Var2.setOnClickListener(new View.OnClickListener(lq0Var) {
                public final lq0 f25473b;

                {
                    this.f25473b = lq0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            lq0 lq0Var2 = this.f25473b;
                            lq0Var2.F0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!lq0Var2.F0);
                            return;
                        default:
                            lq0 lq0Var3 = this.f25473b;
                            lq0Var3.F0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!lq0Var3.F0);
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, k7.b6.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, lq0Var.resourcesProvider);
        if (z4) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19926fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new sp0(lq0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new ep0(lq0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, lq0Var.getContext(), lq0Var.resourcesProvider, true, true);
        if (z4) {
            g1Var3.setTextColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20069ng));
            g1Var3.setIconColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        }
        g1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        g1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var3, k7.b6.n(-1, 48));
        g1Var3.setOnClickListener(new dp0(lq0Var, 1));
        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, lq0Var.getContext(), lq0Var.resourcesProvider, true, true);
        if (z4) {
            g1Var4.setTextColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20069ng));
            g1Var4.setIconColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        }
        g1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        g1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var4, k7.b6.n(-1, 48));
        g1Var4.setOnClickListener(new dp0(lq0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, k7.b6.n(-1, -2));
        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(linearLayout, -2, -2);
        lq0Var.G0 = p1Var;
        p1Var.f20491b = false;
        p1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        lq0Var.G0.setOutsideTouchable(true);
        lq0Var.G0.setClippingEnabled(true);
        lq0Var.G0.setInputMethodMode(2);
        lq0Var.G0.setSoftInputMode(0);
        lq0Var.G0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        lq0Var.G0.setFocusable(true);
        int[] iArr = new int[2];
        pp0Var.getLocationInWindow(iArr);
        if (lq0Var.keyboardVisible && (znVar = lq0Var.f26836c0) != null && znVar.U0.getMeasuredHeight() > AndroidUtilities.dp(58.0f)) {
            measuredHeight = pp0Var.getMeasuredHeight() + iArr[1];
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
        }
        lq0Var.G0.showAtLocation(pp0Var, 51, AndroidUtilities.dp(8.0f) + ((pp0Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
        lq0Var.G0.b();
        try {
            pp0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void o(lq0 lq0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z4, int i10, HashMap hashMap) {
        int i11;
        int i12;
        boolean z10;
        Long l10;
        long j10;
        char c3;
        MessageObject messageObject;
        long j11;
        long longValue;
        String charSequence;
        long longValue2;
        Long l11;
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
        Long l12;
        np0 np0Var;
        long j13;
        long j14;
        Long l13;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue4;
        String charSequence3;
        long longValue5;
        String[] strArr2 = lq0Var.L;
        op0 op0Var = lq0Var.d;
        np0 np0Var2 = lq0Var.f26835c;
        HashMap hashMap2 = lq0Var.S;
        Long l14 = 0L;
        a0.h hVar = lq0Var.R;
        ArrayList arrayList3 = lq0Var.K;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i14 = 0;
            boolean z11 = false;
            while (true) {
                if (i14 < hVar.m()) {
                    long j15 = hVar.j(i14);
                    boolean isMonoForum = MessagesController.getInstance(lq0Var.currentAccount).isMonoForum(j15);
                    if (hashMap == null) {
                        l12 = l14;
                    } else {
                        l12 = (Long) hashMap.get(Long.valueOf(j15));
                    }
                    if (l12 != null && l12.longValue() > 0) {
                        z11 = true;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j15));
                    if (tL_forumTopic3 != null && isMonoForum) {
                        np0Var = np0Var2;
                        j13 = j15;
                        j14 = DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    } else {
                        np0Var = np0Var2;
                        j13 = j15;
                        j14 = 0;
                    }
                    if (tL_forumTopic3 != null && !isMonoForum) {
                        l13 = l14;
                        messageObject3 = new MessageObject(lq0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    } else {
                        l13 = l14;
                        messageObject3 = null;
                    }
                    if (messageObject3 != null) {
                        messageObject3.isTopicMainMessage = true;
                    }
                    if (np0Var.getTag() != null && op0Var.f24030a.length() > 0) {
                        CharSequence charSequence4 = charSequenceArr[0];
                        if (charSequence4 == null) {
                            charSequence3 = null;
                        } else {
                            charSequence3 = charSequence4.toString();
                        }
                        MessageObject messageObject5 = messageObject3;
                        SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(charSequence3, j13, messageObject5, messageObject3, null, true, arrayList, null, null, z4, 0, 0, null, false);
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
                        SendMessagesHelper.getInstance(lq0Var.currentAccount).sendMessage(of3);
                    } else {
                        messageObject4 = messageObject3;
                        arrayList2 = arrayList3;
                    }
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(lq0Var.currentAccount);
                    ArrayList<MessageObject> arrayList5 = lq0Var.K;
                    boolean z12 = !lq0Var.F0;
                    if (l12 == null) {
                        longValue4 = 0;
                    } else {
                        longValue4 = l12.longValue();
                    }
                    long j16 = j13;
                    int sendMessage = sendMessagesHelper.sendMessage(arrayList5, j16, z12, false, z4, 0, 0, messageObject4, i10, longValue4, j14, null);
                    if (sendMessage != 0) {
                        arrayList4.add(Long.valueOf(j16));
                    }
                    if (hVar.m() == 1) {
                        tL_forumTopic = null;
                        z4.t0(sendMessage, lq0Var.f26836c0, null);
                        if (sendMessage != 0) {
                            break;
                        }
                    }
                    i14++;
                    arrayList3 = arrayList2;
                    np0Var2 = np0Var;
                    l14 = l13;
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
                lq0Var.R0(hVar, size2, tL_forumTopic2, !z11);
            }
        } else {
            xp0 xp0Var = lq0Var.T;
            if (xp0Var != null) {
                i11 = xp0Var.d;
            } else {
                i11 = 0;
            }
            if (lq0Var.C0 != null) {
                int i16 = 0;
                boolean z13 = false;
                while (i16 < hVar.m()) {
                    long j17 = hVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(lq0Var.currentAccount).isMonoForum(j17);
                    if (hashMap == null) {
                        l11 = l14;
                    } else {
                        l11 = (Long) hashMap.get(Long.valueOf(j17));
                    }
                    if (l11 != null && l11.longValue() > 0) {
                        z13 = true;
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
                        messageObject2 = new MessageObject(lq0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                    } else {
                        strArr = strArr2;
                        messageObject2 = null;
                    }
                    if (lq0Var.C0 == null) {
                        if (np0Var2.getTag() != null && op0Var.f24030a.length() > 0) {
                            CharSequence charSequence5 = charSequenceArr[0];
                            if (charSequence5 == null) {
                                charSequence2 = null;
                            } else {
                                charSequence2 = charSequence5.toString();
                            }
                            of2 = SendMessagesHelper.SendMessageParams.of(charSequence2, j17, messageObject2, messageObject2, null, true, arrayList, null, null, z4, 0, 0, null, false);
                        } else {
                            of2 = SendMessagesHelper.SendMessageParams.of(strArr[i13], j17, messageObject2, messageObject2, null, true, null, null, null, z4, 0, 0, null, false);
                        }
                    } else {
                        if (np0Var2.getTag() != null && op0Var.f24030a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(lq0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j17, null, messageObject6, null, true, null, null, null, z4, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j17, messageObject2, messageObject2, null, true, null, null, null, z4, 0, 0, null, false);
                        of2.sendingStory = lq0Var.C0;
                    }
                    if (l11 == null) {
                        longValue3 = 0;
                    } else {
                        longValue3 = l11.longValue();
                    }
                    of2.payStars = longValue3;
                    of2.monoForumPeer = j12;
                    SendMessagesHelper.getInstance(lq0Var.currentAccount).sendMessage(of2);
                    i16++;
                    i11 = i13;
                    strArr2 = strArr;
                }
                z10 = z13;
            } else {
                int i17 = i11;
                if (strArr2[i17] != null) {
                    boolean z14 = false;
                    for (int i18 = 0; i18 < hVar.m(); i18++) {
                        long j18 = hVar.j(i18);
                        boolean isMonoForum3 = MessagesController.getInstance(lq0Var.currentAccount).isMonoForum(j18);
                        if (hashMap == null) {
                            l10 = l14;
                        } else {
                            l10 = (Long) hashMap.get(Long.valueOf(j18));
                        }
                        if (l10 != null && l10.longValue() > 0) {
                            z14 = true;
                        }
                        TLRPC.TL_forumTopic tL_forumTopic5 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j18));
                        if (tL_forumTopic5 != null && isMonoForum3) {
                            j10 = DialogObject.getPeerDialogId(tL_forumTopic5.from_id);
                        } else {
                            j10 = 0;
                        }
                        if (tL_forumTopic5 != null && !isMonoForum3) {
                            c3 = 0;
                            messageObject = new MessageObject(lq0Var.currentAccount, tL_forumTopic5.topicStartMessage, false, false);
                        } else {
                            c3 = 0;
                            messageObject = null;
                        }
                        if (np0Var2.getTag() != null && op0Var.f24030a.length() > 0) {
                            CharSequence charSequence6 = charSequenceArr[c3];
                            if (charSequence6 == null) {
                                charSequence = null;
                            } else {
                                charSequence = charSequence6.toString();
                            }
                            SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(charSequence, j18, messageObject, messageObject, null, true, arrayList, null, null, z4, 0, 0, null, false);
                            j11 = j18;
                            if (l10 == null) {
                                longValue2 = 0;
                            } else {
                                longValue2 = l10.longValue();
                            }
                            of4.payStars = longValue2;
                            of4.monoForumPeer = j10;
                            SendMessagesHelper.getInstance(lq0Var.currentAccount).sendMessage(of4);
                        } else {
                            j11 = j18;
                        }
                        SendMessagesHelper.SendMessageParams of5 = SendMessagesHelper.SendMessageParams.of(strArr2[i17], j11, messageObject, messageObject, null, true, null, null, null, z4, 0, 0, null, false);
                        if (l10 == null) {
                            longValue = 0;
                        } else {
                            longValue = l10.longValue();
                        }
                        of5.payStars = longValue;
                        of5.monoForumPeer = j10;
                        SendMessagesHelper.getInstance(lq0Var.currentAccount).sendMessage(of5);
                    }
                    z10 = z14;
                } else {
                    i12 = 0;
                    z10 = false;
                    lq0Var.R0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i12)), !z10);
                }
            }
            i12 = 0;
            lq0Var.R0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i12)), !z10);
        }
        aq0 aq0Var = lq0Var.f26850p0;
        if (aq0Var != null) {
            aq0Var.V();
        }
        lq0Var.dismiss();
    }

    public static void p(lq0 lq0Var, int i10) {
        TLRPC.Dialog dialog;
        d20 d20Var = lq0Var.f26858v0;
        HashMap hashMap = lq0Var.S;
        a0.h hVar = lq0Var.R;
        dq0 dq0Var = lq0Var.H;
        iq0 iq0Var = lq0Var.I;
        if (iq0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = lq0Var.f26865z0;
            if (dialog2 != null) {
                hVar.k(dialog2, dialog2.f19163id);
                hashMap.remove(dialog2);
                lq0Var.a1(2);
                if (lq0Var.I0 || lq0Var.J0) {
                    if (((TLRPC.Dialog) dq0Var.e.f(dialog2.f19163id)) == null) {
                        dq0Var.e.k(dialog2, dialog2.f19163id);
                        ArrayList arrayList = dq0Var.d;
                        arrayList.add(!arrayList.isEmpty(), dialog2);
                    }
                    dq0Var.l();
                    lq0Var.f26862x0 = false;
                    d20Var.f24117r.setText("");
                    lq0Var.K0(false);
                }
                for (int i11 = 0; i11 < lq0Var.P0().getChildCount(); i11++) {
                    View childAt = lq0Var.P0().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.d7) {
                        org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) childAt;
                        if (d7Var.getCurrentDialog() == lq0Var.f26865z0.f19163id) {
                            d7Var.d(null, false, true);
                            d7Var.b(true, true);
                        }
                    }
                }
                lq0Var.L0();
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic E = iq0Var.E(i10);
        if (E != null && (dialog = lq0Var.f26865z0) != null) {
            long j10 = dialog.f19163id;
            boolean isMonoForum = MessagesController.getInstance(lq0Var.currentAccount).isMonoForum(j10);
            TLRPC.Dialog dialog3 = lq0Var.f26865z0;
            hVar.k(dialog3, j10);
            hashMap.put(dialog3, E);
            lq0Var.a1(2);
            if (lq0Var.I0 || lq0Var.J0) {
                if (((TLRPC.Dialog) dq0Var.e.f(dialog3.f19163id)) == null) {
                    dq0Var.e.k(dialog3, dialog3.f19163id);
                    ArrayList arrayList2 = dq0Var.d;
                    arrayList2.add(!arrayList2.isEmpty(), dialog3);
                }
                dq0Var.l();
                lq0Var.f26862x0 = false;
                d20Var.f24117r.setText("");
                lq0Var.K0(false);
            }
            for (int i12 = 0; i12 < lq0Var.P0().getChildCount(); i12++) {
                View childAt2 = lq0Var.P0().getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.d7) {
                    org.telegram.ui.Cells.d7 d7Var2 = (org.telegram.ui.Cells.d7) childAt2;
                    if (d7Var2.getCurrentDialog() == lq0Var.f26865z0.f19163id) {
                        d7Var2.d(E, isMonoForum, true);
                        d7Var2.b(true, true);
                    }
                }
            }
            lq0Var.L0();
        }
    }

    public static void s0(lq0 lq0Var) {
        lp0 lp0Var;
        int i10;
        int i11;
        lp0 lp0Var2 = lq0Var.C;
        lp0 lp0Var3 = lq0Var.D;
        rl0 rl0Var = lq0Var.B;
        if (!lq0Var.f26849o0) {
            if (lq0Var.I0) {
                lp0Var = lp0Var3;
            } else {
                lp0Var = lp0Var2;
            }
            if (lp0Var.getChildCount() > 0) {
                View childAt = lp0Var.getChildAt(0);
                for (int i12 = 0; i12 < lp0Var.getChildCount(); i12++) {
                    if (lp0Var.getChildAt(i12).getTop() < childAt.getTop()) {
                        childAt = lp0Var.getChildAt(i12);
                    }
                }
                dl0 dl0Var = (dl0) lp0Var.G(childAt);
                int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
                if (top > 0 && dl0Var != null && dl0Var.b() == 0) {
                    i10 = top;
                } else {
                    i10 = 0;
                }
                if (top >= 0 && dl0Var != null && dl0Var.b() == 0) {
                    lq0Var.H0 = childAt.getTop();
                    lq0Var.T0(false);
                } else {
                    lq0Var.H0 = Integer.MAX_VALUE;
                    lq0Var.T0(true);
                    top = i10;
                }
                if (rl0Var.getVisibility() == 0) {
                    if (rl0Var.getChildCount() > 0) {
                        View childAt2 = rl0Var.getChildAt(0);
                        for (int i13 = 0; i13 < rl0Var.getChildCount(); i13++) {
                            if (rl0Var.getChildAt(i13).getTop() < childAt2.getTop()) {
                                childAt2 = rl0Var.getChildAt(i13);
                            }
                        }
                        dl0 dl0Var2 = (dl0) rl0Var.G(childAt2);
                        int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
                        if (top2 > 0 && dl0Var2 != null && dl0Var2.b() == 0) {
                            i11 = top2;
                        } else {
                            i11 = 0;
                        }
                        if (top2 >= 0 && dl0Var2 != null && dl0Var2.b() == 0) {
                            lq0Var.H0 = childAt2.getTop();
                            lq0Var.T0(false);
                        } else {
                            lq0Var.H0 = Integer.MAX_VALUE;
                            lq0Var.T0(true);
                            top2 = i11;
                        }
                        top = AndroidUtilities.lerp(top, top2, rl0Var.getAlpha());
                    } else {
                        return;
                    }
                }
                int i14 = lq0Var.m0;
                if (i14 != top) {
                    lq0Var.f26848n0 = i14;
                    float f10 = top;
                    int i15 = (int) (lq0Var.f26851q0 + f10);
                    lq0Var.m0 = i15;
                    lp0Var2.setTopGlowOffset(i15);
                    int i16 = (int) (lq0Var.f26851q0 + f10);
                    lq0Var.m0 = i16;
                    lp0Var3.setTopGlowOffset(i16);
                    int i17 = (int) (f10 + lq0Var.f26851q0);
                    lq0Var.m0 = i17;
                    rl0Var.setTopGlowOffset(i17);
                    lq0Var.f26833b.setTranslationY(lq0Var.m0 + lq0Var.f26851q0);
                    lq0Var.N.setTranslationY(lq0Var.m0 + lq0Var.f26851q0);
                    lq0Var.containerView.invalidate();
                }
            }
        }
    }

    public final void K0(boolean z4) {
        d20 d20Var = this.f26858v0;
        kg.f fVar = d20Var.f24117r;
        kg.f fVar2 = d20Var.f24117r;
        boolean isEmpty = TextUtils.isEmpty(fVar.getText());
        lp0 lp0Var = this.C;
        lp0 lp0Var2 = this.D;
        boolean z10 = true;
        if (isEmpty && ((!this.keyboardVisible || !fVar2.hasFocus()) && !this.J0)) {
            if (this.f26865z0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(lp0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(lp0Var2, false);
            }
            z10 = false;
        } else {
            this.f26862x0 = true;
            if (this.f26865z0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(lp0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(lp0Var2, true);
            }
        }
        if (this.I0 == z10 && !z4) {
            return;
        }
        this.I0 = z10;
        hq0 hq0Var = this.J;
        hq0Var.l();
        this.H.l();
        if (this.I0) {
            if (this.H0 == Integer.MAX_VALUE) {
                ((f2.i0) lp0Var2.getLayoutManager()).h1(0, -lp0Var2.getPaddingTop());
            } else {
                ((f2.i0) lp0Var2.getLayoutManager()).h1(0, this.H0 - lp0Var2.getPaddingTop());
            }
            hq0Var.E(fVar2.getText().toString());
            return;
        }
        int i10 = this.H0;
        f2.w wVar = this.E;
        if (i10 == Integer.MAX_VALUE) {
            wVar.h1(0, 0);
        } else {
            wVar.h1(0, 0);
        }
    }

    public final void L0() {
        float f10;
        TLRPC.Dialog dialog = this.f26865z0;
        if (dialog != null) {
            org.telegram.ui.Cells.d7 d7Var = null;
            this.f26865z0 = null;
            for (int i10 = 0; i10 < P0().getChildCount(); i10++) {
                View childAt = P0().getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.d7) && ((org.telegram.ui.Cells.d7) childAt).getCurrentDialog() == dialog.f19163id) {
                    d7Var = childAt;
                }
            }
            if (d7Var == null) {
                return;
            }
            o1.j jVar = this.f26864y0;
            if (jVar != null) {
                jVar.c();
            }
            P0().setVisibility(0);
            d20 d20Var = this.f26858v0;
            d20Var.setVisibility(0);
            kg.f fVar = d20Var.f24117r;
            if (this.I0 || this.J0) {
                this.A0.E.v = true;
                fVar.requestFocus();
                AndroidUtilities.showKeyboard(fVar);
            }
            int[] iArr = new int[2];
            o1.j jVar2 = new o1.j(new kb.a(1000.0f));
            o1.k kVar = new o1.k(0.0f);
            org.telegram.ui.zn znVar = this.f26836c0;
            if (znVar != null && znVar.f40523b) {
                f10 = 10.0f;
            } else {
                f10 = 800.0f;
            }
            kVar.b(f10);
            kVar.a(1.0f);
            jVar2.f16178u = kVar;
            this.f26864y0 = jVar2;
            jVar2.b(new cp0(this, d7Var, iArr, 0));
            this.f26864y0.a(new ya(this, 4));
            this.f26864y0.f();
        }
    }

    public final void M0() {
        boolean z4 = false;
        if (this.f26842h0 != null || this.f26846l0[0] != null) {
            try {
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
                aq0 aq0Var = this.f26850p0;
                if (aq0Var != null) {
                    aq0Var.q0();
                } else if (this.f26837d0 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f26842h0;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z4 = true;
                    }
                    ((LaunchActivity) this.f26837d0).D0(new j3.x(2, z4));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final String O0() {
        String str;
        String str2;
        String[] strArr = this.f26846l0;
        xp0 xp0Var = this.T;
        if (xp0Var != null) {
            str2 = strArr[xp0Var.d];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f26842h0;
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
        kp kpVar = this.f26834b0;
        if (kpVar != null && kpVar.f26377a.f22938q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.Y)).build().toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final rl0 P0() {
        if (!this.I0 && !this.J0) {
            return this.C;
        }
        return this.D;
    }

    public final void Q0(View view, int[] iArr, float f10) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        rl0 rl0Var = this.B;
        rl0Var.setPivotX(width);
        rl0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f11 = 0.25f * f10;
        float f12 = 0.75f + f11;
        rl0Var.setScaleX(f12);
        rl0Var.setScaleY(f12);
        rl0Var.setAlpha(f10);
        rl0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f13 = f11 + 1.0f;
        P0.setScaleX(f13);
        P0.setScaleY(f13);
        float f14 = 1.0f - f10;
        P0.setAlpha(f14);
        d20 d20Var = this.f26858v0;
        d20Var.setPivotX(d20Var.getWidth() / 2.0f);
        d20Var.setPivotY(0.0f);
        float f15 = (0.1f * f14) + 0.9f;
        d20Var.setScaleX(f15);
        d20Var.setScaleY(f15);
        d20Var.setAlpha(f14);
        org.telegram.ui.ActionBar.k kVar = this.f26860w0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f14);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f14);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f14);
        kVar.setAlpha(f10);
        rl0Var.getLocationInWindow(iArr);
        float interpolation = mr.f27123g.getInterpolation(f10);
        for (int i10 = 0; i10 < P0.getChildCount(); i10++) {
            View childAt = P0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.d7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f10, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f14);
                }
            }
        }
        for (int i11 = 0; i11 < rl0Var.getChildCount(); i11++) {
            View childAt2 = rl0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.e7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y10 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((rl0Var.getTranslationY() + y10) - view.getY()))));
            }
        }
        this.containerView.requestLayout();
        P0.invalidate();
    }

    public final void T0(boolean z4) {
        Integer num;
        float f10;
        View[] viewArr = this.P;
        if ((z4 && viewArr[0].getTag() != null) || (!z4 && viewArr[0].getTag() == null)) {
            View view = viewArr[0];
            if (z4) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            if (z4) {
                viewArr[0].setVisibility(0);
            }
            AnimatorSet[] animatorSetArr = this.Q;
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            View view2 = viewArr[0];
            Property property = View.ALPHA;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f10));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].addListener(new up0(this, z4, 0));
            animatorSetArr[0].start();
        }
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        lq0 lq0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        gq0 gq0Var;
        if (dialog instanceof cq0) {
            S0(view);
        } else if (((view instanceof org.telegram.ui.Cells.d7) && ((org.telegram.ui.Cells.d7) view).C) || ((view instanceof org.telegram.ui.Cells.g6) && ((org.telegram.ui.Cells.g6) view).f21072k0)) {
            X0(dialog.f19163id, view);
        } else {
            rl0 rl0Var = this.B;
            if (rl0Var.getVisibility() == 8 && (activity = this.f26837d0) != null) {
                boolean isChatDialog = DialogObject.isChatDialog(dialog.f19163id);
                int i10 = this.M;
                if (isChatDialog) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f19163id));
                    if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.f19163id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        String string = LocaleController.getString(R.string.SendMessageTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                        d2Var.O = string;
                        if (i10 == 3) {
                            if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                d2Var.Q = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                            } else {
                                d2Var.Q = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                            }
                        } else if (i10 == 2) {
                            if (this.f26845k0) {
                                d2Var.Q = LocaleController.getString(R.string.PublicPollCantForward);
                            } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                d2Var.Q = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                            } else {
                                d2Var.Q = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                            }
                        } else {
                            d2Var.Q = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        kf.k0.u(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                } else if (DialogObject.isEncryptedDialog(dialog.f19163id) && i10 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String string2 = LocaleController.getString(R.string.SendMessageTitle);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19478a;
                    d2Var2.O = string2;
                    if (i10 == 3) {
                        d2Var2.Q = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i10 != 0) {
                        d2Var2.Q = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        d2Var2.Q = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    kf.k0.u(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
                long j10 = dialog.f19163id;
                a0.h hVar = this.R;
                if (hVar.h(j10) >= 0) {
                    hVar.l(dialog.f19163id);
                    this.S.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.g6) {
                        ((org.telegram.ui.Cells.g6) view).s(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.d7) {
                        ((org.telegram.ui.Cells.d7) view).b(false, true);
                    }
                    a1(1);
                    lq0Var = this;
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.f19163id));
                    TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f19163id));
                    if ((!UserObject.isBotForum(user) || (((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f19306id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f19306id))) && (!DialogObject.isChatDialog(dialog.f19163id) || (!ChatObject.isForum(chat2) && (!ChatObject.isMonoForum(chat2) || !ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                        lq0Var = this;
                        hVar.k(dialog, dialog.f19163id);
                        if (view instanceof org.telegram.ui.Cells.g6) {
                            ((org.telegram.ui.Cells.g6) view).s(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.d7) {
                            ((org.telegram.ui.Cells.d7) view).b(true, true);
                        }
                        a1(2);
                        long j11 = UserConfig.getInstance(lq0Var.currentAccount).clientUserId;
                        if (lq0Var.I0) {
                            dq0 dq0Var = lq0Var.H;
                            a0.h hVar2 = dq0Var.e;
                            ArrayList arrayList = dq0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.f19163id);
                            if (dialog2 == null) {
                                dq0Var.e.k(dialog, dialog.f19163id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f19163id != j11) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            dq0Var.l();
                            lq0Var.f26862x0 = false;
                            d20 d20Var = lq0Var.f26858v0;
                            d20Var.f24117r.setText("");
                            K0(false);
                            AndroidUtilities.hideKeyboard(d20Var.f24117r);
                        }
                    } else {
                        this.f26865z0 = dialog;
                        this.F.h1(0, this.m0 - rl0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        rp0 rp0Var = new rp0(this, dialog, atomicReference, view);
                        atomicReference.set(new org.telegram.ui.kh(this, atomicReference, rp0Var, dialog, 22));
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                        int i11 = NotificationCenter.topicsDidLoaded;
                        notificationCenter.addObserver(rp0Var, i11);
                        if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.f19163id) != null) {
                            rp0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.f19163id));
                            return;
                        }
                        MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.f19163id);
                        AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                hq0 hq0Var = lq0Var.J;
                if (hq0Var != null && (gq0Var = hq0Var.E) != null) {
                    gq0Var.q(0, gq0Var.h());
                }
            }
        }
    }

    public final void V0(final boolean z4) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (true) {
            a0.h hVar = this.R;
            int m9 = hVar.m();
            np0 np0Var = this.f26835c;
            op0 op0Var = this.d;
            boolean z10 = true;
            if (i13 < m9) {
                if (z4.h(getContext(), this.currentAccount, hVar.j(i13), (np0Var.getTag() == null || op0Var.f24030a.length() <= 0) ? false : false)) {
                    return;
                }
                i13++;
            } else {
                Editable text = op0Var.getText();
                xt xtVar = op0Var.f24030a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                kp kpVar = this.f26834b0;
                if (kpVar != null && kpVar.f26377a.f22938q) {
                    i10 = this.Y;
                } else {
                    i10 = -1;
                }
                ArrayList arrayList = new ArrayList();
                if (this.K != null) {
                    i12 = 0;
                    for (int i14 = 0; i14 < hVar.m(); i14++) {
                        long j10 = hVar.j(i14);
                        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j10);
                        if (sendPaidMessagesStars <= 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j10));
                        }
                        if (np0Var.getTag() != null && xtVar.length() > 0 && sendPaidMessagesStars > 0) {
                            i12++;
                        }
                        int i15 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
                        if (i15 > 0) {
                            i12++;
                        }
                        if (i15 > 0 && !arrayList.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                        }
                    }
                } else {
                    xp0 xp0Var = this.T;
                    if (xp0Var != null) {
                        i11 = xp0Var.d;
                    } else {
                        i11 = 0;
                    }
                    if (this.C0 != null) {
                        int i16 = 0;
                        for (int i17 = 0; i17 < hVar.m(); i17++) {
                            long j11 = hVar.j(i17);
                            long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
                            if (sendPaidMessagesStars2 <= 0) {
                                sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
                            }
                            if (this.C0 != null && np0Var.getTag() != null && xtVar.length() > 0 && charSequenceArr[0] != null && sendPaidMessagesStars2 > 0) {
                                i16++;
                            }
                            int i18 = (sendPaidMessagesStars2 > 0L ? 1 : (sendPaidMessagesStars2 == 0L ? 0 : -1));
                            if (i18 > 0) {
                                i16++;
                            }
                            if (i18 > 0 && !arrayList.contains(Long.valueOf(j11))) {
                                arrayList.add(Long.valueOf(j11));
                            }
                        }
                        i12 = i16;
                    } else {
                        int i19 = 0;
                        if (this.L[i11] != null) {
                            for (int i20 = 0; i20 < hVar.m(); i20++) {
                                long j12 = hVar.j(i20);
                                long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j12);
                                if (sendPaidMessagesStars3 <= 0) {
                                    sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j12));
                                }
                                if (np0Var.getTag() != null && xtVar.length() > 0 && sendPaidMessagesStars3 > 0) {
                                    i19++;
                                }
                                int i21 = (sendPaidMessagesStars3 > 0L ? 1 : (sendPaidMessagesStars3 == 0L ? 0 : -1));
                                if (i21 > 0) {
                                    i19++;
                                }
                                if (i21 > 0 && !arrayList.contains(Long.valueOf(j12))) {
                                    arrayList.add(Long.valueOf(j12));
                                }
                            }
                            i12 = i19;
                        } else {
                            i12 = 0;
                        }
                    }
                }
                final int i22 = i10;
                z4.c0(this.currentAccount, arrayList, i12, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        lq0.o(lq0.this, charSequenceArr, entities, z4, i22, (HashMap) obj);
                    }
                });
                return;
            }
        }
    }

    public final void W0(boolean z4) {
        boolean z10;
        Integer num;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i10;
        np0 np0Var = this.f26835c;
        if (np0Var.getTag() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z4 == z10) {
            return;
        }
        AnimatorSet animatorSet = this.f26863y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z4) {
            num = 1;
        } else {
            num = null;
        }
        np0Var.setTag(num);
        op0 op0Var = this.d;
        if (op0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(op0Var.getEditText());
        }
        op0Var.k(true);
        FrameLayout frameLayout = this.Z;
        np0 np0Var2 = this.f26839f;
        FrameLayout frameLayout2 = this.h;
        if (z4) {
            np0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            np0Var2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        int i11 = 4;
        if (frameLayout2 != null) {
            if (z4) {
                i10 = 4;
            } else {
                i10 = 1;
            }
            WeakHashMap weakHashMap = r0.j0.f43142a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.f26861x;
        if (linearLayout != null) {
            if (!z4) {
                i11 = 1;
            }
            WeakHashMap weakHashMap2 = r0.j0.f43142a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.f26863y = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f15 = 0.0f;
        float f16 = 1.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(np0Var, property, f10));
        if (frameLayout != null && frameLayout2 == null) {
            if (z4) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, property, f14));
        }
        Property property2 = View.SCALE_X;
        float f17 = 0.2f;
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.2f;
        }
        arrayList.add(ObjectAnimator.ofFloat(np0Var2, property2, f11));
        Property property3 = View.SCALE_Y;
        if (z4) {
            f17 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(np0Var2, property3, f17));
        if (z4) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(np0Var2, property, f12));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.P[1];
            if (!z4) {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f16));
        }
        FrameLayout frameLayout3 = this.f26852r;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.f26838e0 && z4) {
                if (this.f26832a0 != null) {
                    f13 = 5.0f;
                } else {
                    f13 = 16.0f;
                }
                f15 = AndroidUtilities.dp(f13);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, f15));
        }
        this.f26863y.playTogether(arrayList);
        this.f26863y.setInterpolator(new DecelerateInterpolator());
        this.f26863y.setDuration(180L);
        this.f26863y.addListener(new up0(this, z4, 1));
        this.f26863y.start();
    }

    public final void X0(long j10, View view) {
        String str;
        ic J;
        int i10 = -this.E0;
        this.E0 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j10 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)));
        } else {
            str = "";
        }
        boolean premiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
        FrameLayout frameLayout = this.v;
        if (premiumFeaturesBlocked) {
            J = new qc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = new qc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new fp0(this, 1));
        }
        J.j();
    }

    public final void Y0() {
        org.telegram.ui.ActionBar.r1 r1Var;
        np0 np0Var = this.f26835c;
        if (np0Var == null) {
            return;
        }
        op0 op0Var = this.d;
        if (op0Var != null && op0Var.m()) {
            op0Var.getEmojiPaddingShown();
        } else {
            wp0 wp0Var = this.A0;
            if (wp0Var != null && (r1Var = wp0Var.E) != null && !r1Var.f20522f) {
                AndroidUtilities.dp(20.0f);
            }
        }
        float f10 = 0.0f;
        FrameLayout frameLayout = this.Z;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f10 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            float f11 = -f10;
            frameLayout2.setTranslationY(f11);
            LinearLayout linearLayout = this.f26861x;
            if (linearLayout != null) {
                linearLayout.setTranslationY(f11);
            }
        }
        float f12 = -f10;
        np0Var.setTranslationY(f12);
        this.f26839f.setTranslationY(f12);
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.k5 k5Var = this.f26854s;
        if (k5Var != null) {
            String O0 = O0();
            if (O0.startsWith("https://")) {
                O0 = O0.substring(8);
            } else if (O0.startsWith("http://")) {
                O0 = O0.substring(7);
            }
            k5Var.k(O0);
        }
    }

    public final void a1(int i10) {
        int size;
        boolean z4;
        boolean z10;
        a0.h hVar = this.R;
        if (hVar.m() == 0) {
            W0(false);
            return;
        }
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        Object tag = this.f26835c.getTag();
        op0 op0Var = this.d;
        if (tag != null && op0Var.f24030a.length() > 0) {
            size++;
        }
        long j10 = 0;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            long j11 = ((TLRPC.Dialog) hVar.n(i11)).f19163id;
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
            }
            j10 += sendPaidMessagesStars;
        }
        int max = Math.max(1, hVar.m());
        if (i10 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        pp0 pp0Var = this.e;
        pp0Var.g(max, z4);
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        pp0Var.i(size, j10, z10);
        W0(true);
        op0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), pp0Var.l()), 0);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            dq0 dq0Var = this.H;
            if (dq0Var != null) {
                dq0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override
    public final void dismiss() {
        op0 op0Var = this.d;
        if (op0Var != null) {
            AndroidUtilities.hideKeyboard(op0Var.getEditText());
        }
        this.V = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        op0 op0Var = this.d;
        if (op0Var != null) {
            op0Var.o();
        }
    }

    @Override
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.U;
    }

    @Override
    public final void onBackPressed() {
        if (this.f26865z0 != null) {
            L0();
            return;
        }
        op0 op0Var = this.d;
        if (op0Var != null && op0Var.e) {
            op0Var.k(true);
        } else {
            super.onBackPressed();
        }
    }

    public lq0(Context context, ArrayList arrayList, String str, String str2, boolean z4, String str3, String str4, boolean z10) {
        this(context, null, arrayList, str, str2, z4, str3, str4, false, z10, false, null, null);
    }

    public lq0(android.content.Context r38, org.telegram.ui.zn r39, java.util.ArrayList r40, java.lang.String r41, java.lang.String r42, boolean r43, java.lang.String r44, java.lang.String r45, boolean r46, boolean r47, boolean r48, java.lang.Integer r49, org.telegram.ui.ActionBar.f6 r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lq0.<init>(android.content.Context, org.telegram.ui.zn, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.f6):void");
    }

    public void S0(View view) {
    }

    public void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
    }
}
