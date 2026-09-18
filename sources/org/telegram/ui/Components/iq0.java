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
public class iq0 extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f24986a1 = 0;
    public boolean A0;
    public o1.k B0;
    public TLRPC.Dialog C0;
    public final tp0 D0;
    public final ml0 E;
    public ArrayList E0;
    public final kp0 F;
    public TL_stories.StoryItem F0;
    public final kp0 G;
    public i0.b G0;
    public final s4.s H;
    public int H0;
    public final s4.s I;
    public boolean I0;
    public final oz J;
    public org.telegram.ui.ActionBar.o1 J0;
    public final aq0 K;
    public int K0;
    public final fq0 L;
    public boolean L0;
    public final eq0 M;
    public boolean M0;
    public final ArrayList N;
    public int N0;
    public final String[] O;
    public final ah.i O0;
    public final int P;
    public final fh.d P0;
    public final zw0 Q;
    public final fh.d Q0;
    public final Drawable R;
    public final ah.c R0;
    public final View[] S;
    public final ah.c S0;
    public final AnimatorSet[] T;
    public final ah.c T0;
    public final a0.i U;
    public final ah.o U0;
    public final HashMap V;
    public final ch.d V0;
    public final up0 W;
    public final ah.e W0;
    public int X;
    public final ch.d X0;
    public boolean Y;
    public final ArrayList Y0;
    public final boolean Z;
    public final RectF Z0;
    public boolean f24987a0;
    public final FrameLayout f24988b;
    public final int f24989b0;
    public final mp0 f24990c;
    public final FrameLayout f24991c0;
    public final np0 d;
    public final LinearLayout f24992d0;
    public final ii.y1 e;
    public final np f24993e0;
    public final mp0 f24994f;
    public final org.telegram.ui.bo f24995f0;
    public final Activity f24996g0;
    public final FrameLayout h;
    public final boolean f24997h0;
    public boolean f24998i0;
    public final TextPaint f24999j0;
    public TLRPC.TL_exportedMessageLink f25000k0;
    public boolean f25001l0;
    public boolean m0;
    public final ci.eb f25002n;
    public final boolean f25003n0;
    public final String[] f25004o0;
    public int f25005p0;
    public int f25006q0;
    public final FrameLayout f25007r;
    public boolean f25008r0;
    public final org.telegram.ui.ActionBar.k5 f25009s;
    public xp0 f25010s0;
    public float f25011t0;
    public float f25012u0;
    public final FrameLayout v;
    public float f25013v0;
    public final FrameLayout f25014w;
    public ValueAnimator f25015w0;
    public final LinearLayout f25016x;
    public final rk0 f25017x0;
    public AnimatorSet f25018y;
    public final b20 f25019y0;
    public final org.telegram.ui.ActionBar.k f25020z0;

    public iq0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, f6Var);
    }

    public static void A0(iq0 iq0Var) {
        float f7;
        RectF rectF = iq0Var.Z0;
        ah.i iVar = iq0Var.O0;
        if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
            rectF.set(0.0f, 0.0f, iq0Var.containerView.getMeasuredWidth(), iq0Var.containerView.getMeasuredHeight());
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            iVar.g(1, iq0Var.Y0);
            iVar.e(iq0Var.U0, iq0Var.containerView.getMeasuredWidth(), iq0Var.containerView.getMeasuredHeight());
        }
    }

    public static int F0(iq0 iq0Var) {
        kp0 kp0Var = iq0Var.F;
        if (kp0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = kp0Var.getChildAt(0);
            wk0 wk0Var = (wk0) kp0Var.H(childAt);
            if (wk0Var != null) {
                int paddingTop = kp0Var.getPaddingTop();
                if (wk0Var.c() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    public static iq0 N0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        ArrayList arrayList;
        if (messageObject != null) {
            arrayList = org.telegram.messenger.w1.l(messageObject);
        } else {
            arrayList = null;
        }
        return new iq0(context, arrayList, str, null, z10, str2, null, false);
    }

    public static void m(iq0 iq0Var, AtomicReference atomicReference, pp0 pp0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        pp0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, iq0Var.currentAccount, Long.valueOf(-dialog.f18125id));
    }

    public static boolean n(final iq0 iq0Var) {
        int measuredHeight;
        org.telegram.ui.bo boVar;
        ii.y1 y1Var = iq0Var.e;
        boolean z10 = iq0Var.f24997h0;
        Activity activity = iq0Var.f24996g0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(iq0Var.getContext());
        linearLayout.setOrientation(1);
        if (iq0Var.N != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, iq0Var.resourcesProvider);
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(iq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18907fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new qp0(iq0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new cp0(iq0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, iq0Var.getContext(), iq0Var.resourcesProvider, true, false);
            if (z10) {
                g1Var.setTextColor(iq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19055ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, w7.x5.n(-1, 48));
            g1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            iq0Var.I0 = true;
            g1Var.setChecked(true);
            final org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(1, iq0Var.getContext(), iq0Var.resourcesProvider, false, true);
            if (z10) {
                g1Var2.setTextColor(iq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19055ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, w7.x5.n(-1, 48));
            g1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            g1Var2.setChecked(!iq0Var.I0);
            g1Var.setOnClickListener(new View.OnClickListener(iq0Var) {
                public final iq0 f24380b;

                {
                    this.f24380b = iq0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            iq0 iq0Var2 = this.f24380b;
                            iq0Var2.I0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!iq0Var2.I0);
                            return;
                        default:
                            iq0 iq0Var3 = this.f24380b;
                            iq0Var3.I0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!iq0Var3.I0);
                            return;
                    }
                }
            });
            g1Var2.setOnClickListener(new View.OnClickListener(iq0Var) {
                public final iq0 f24380b;

                {
                    this.f24380b = iq0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            iq0 iq0Var2 = this.f24380b;
                            iq0Var2.I0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!iq0Var2.I0);
                            return;
                        default:
                            iq0 iq0Var3 = this.f24380b;
                            iq0Var3.I0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!iq0Var3.I0);
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(iq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.x5.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, iq0Var.resourcesProvider);
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18907fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new qp0(iq0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new cp0(iq0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, iq0Var.getContext(), iq0Var.resourcesProvider, true, true);
        if (z10) {
            g1Var3.setTextColor(iq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19055ng));
            g1Var3.setIconColor(iq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        }
        g1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        g1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var3, w7.x5.n(-1, 48));
        g1Var3.setOnClickListener(new bp0(iq0Var, 1));
        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, iq0Var.getContext(), iq0Var.resourcesProvider, true, true);
        if (z10) {
            g1Var4.setTextColor(iq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19055ng));
            g1Var4.setIconColor(iq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        }
        g1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        g1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var4, w7.x5.n(-1, 48));
        g1Var4.setOnClickListener(new bp0(iq0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(iq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.x5.n(-1, -2));
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(linearLayout, -2, -2);
        iq0Var.J0 = o1Var;
        o1Var.f19448b = false;
        o1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        iq0Var.J0.setOutsideTouchable(true);
        iq0Var.J0.setClippingEnabled(true);
        iq0Var.J0.setInputMethodMode(2);
        iq0Var.J0.setSoftInputMode(0);
        iq0Var.J0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        iq0Var.J0.setFocusable(true);
        int[] iArr = new int[2];
        y1Var.getLocationInWindow(iArr);
        if (iq0Var.keyboardVisible && (boVar = iq0Var.f24995f0) != null && boVar.X0.getMeasuredHeight() > AndroidUtilities.dp(58.0f)) {
            measuredHeight = y1Var.getMeasuredHeight() + iArr[1];
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
        }
        iq0Var.J0.showAtLocation(y1Var, 51, AndroidUtilities.dp(8.0f) + ((y1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
        iq0Var.J0.b();
        try {
            y1Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void o(iq0 iq0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
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
        mp0 mp0Var;
        long j12;
        long j13;
        Long l12;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue4;
        String charSequence3;
        long longValue5;
        String[] strArr2 = iq0Var.O;
        np0 np0Var = iq0Var.d;
        mp0 mp0Var2 = iq0Var.f24990c;
        HashMap hashMap2 = iq0Var.V;
        Long l13 = 0L;
        a0.i iVar = iq0Var.U;
        ArrayList arrayList3 = iq0Var.N;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i14 = 0;
            boolean z12 = false;
            while (true) {
                if (i14 < iVar.m()) {
                    long j14 = iVar.j(i14);
                    boolean isMonoForum = MessagesController.getInstance(iq0Var.currentAccount).isMonoForum(j14);
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
                        mp0Var = mp0Var2;
                        j12 = j14;
                        j13 = DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    } else {
                        mp0Var = mp0Var2;
                        j12 = j14;
                        j13 = 0;
                    }
                    if (tL_forumTopic3 != null && !isMonoForum) {
                        l12 = l13;
                        messageObject3 = new MessageObject(iq0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    } else {
                        l12 = l13;
                        messageObject3 = null;
                    }
                    if (messageObject3 != null) {
                        messageObject3.isTopicMainMessage = true;
                    }
                    if (mp0Var.getTag() != null && np0Var.f25433a.length() > 0) {
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
                        SendMessagesHelper.getInstance(iq0Var.currentAccount).sendMessage(of3);
                    } else {
                        messageObject4 = messageObject3;
                        arrayList2 = arrayList3;
                    }
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(iq0Var.currentAccount);
                    ArrayList<MessageObject> arrayList5 = iq0Var.N;
                    boolean z13 = !iq0Var.I0;
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
                        c5.t0(sendMessage, iq0Var.f24995f0, null);
                        if (sendMessage != 0) {
                            break;
                        }
                    }
                    i14++;
                    arrayList3 = arrayList2;
                    mp0Var2 = mp0Var;
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
                iq0Var.R0(iVar, size2, tL_forumTopic2, !z12);
            }
        } else {
            up0 up0Var = iq0Var.W;
            if (up0Var != null) {
                i11 = up0Var.d;
            } else {
                i11 = 0;
            }
            if (iq0Var.F0 != null) {
                int i16 = 0;
                boolean z14 = false;
                while (i16 < iVar.m()) {
                    long j16 = iVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(iq0Var.currentAccount).isMonoForum(j16);
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
                        messageObject2 = new MessageObject(iq0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                    } else {
                        strArr = strArr2;
                        messageObject2 = null;
                    }
                    if (iq0Var.F0 == null) {
                        if (mp0Var2.getTag() != null && np0Var.f25433a.length() > 0) {
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
                        if (mp0Var2.getTag() != null && np0Var.f25433a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(iq0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j16, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = iq0Var.F0;
                    }
                    if (l10 == null) {
                        longValue3 = 0;
                    } else {
                        longValue3 = l10.longValue();
                    }
                    of2.payStars = longValue3;
                    of2.monoForumPeer = j11;
                    SendMessagesHelper.getInstance(iq0Var.currentAccount).sendMessage(of2);
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
                        boolean isMonoForum3 = MessagesController.getInstance(iq0Var.currentAccount).isMonoForum(j17);
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
                            messageObject = new MessageObject(iq0Var.currentAccount, tL_forumTopic5.topicStartMessage, false, false);
                        } else {
                            c10 = 0;
                            messageObject = null;
                        }
                        if (mp0Var2.getTag() != null && np0Var.f25433a.length() > 0) {
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
                            SendMessagesHelper.getInstance(iq0Var.currentAccount).sendMessage(of4);
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
                        SendMessagesHelper.getInstance(iq0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z15;
                } else {
                    i12 = 0;
                    z11 = false;
                    iq0Var.R0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i12)), !z11);
                }
            }
            i12 = 0;
            iq0Var.R0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i12)), !z11);
        }
        xp0 xp0Var = iq0Var.f25010s0;
        if (xp0Var != null) {
            xp0Var.U();
        }
        iq0Var.dismiss();
    }

    public static void p(iq0 iq0Var, int i10) {
        TLRPC.Dialog dialog;
        b20 b20Var = iq0Var.f25019y0;
        HashMap hashMap = iq0Var.V;
        a0.i iVar = iq0Var.U;
        aq0 aq0Var = iq0Var.K;
        fq0 fq0Var = iq0Var.L;
        if (fq0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = iq0Var.C0;
            if (dialog2 != null) {
                iVar.k(dialog2, dialog2.f18125id);
                hashMap.remove(dialog2);
                iq0Var.a1(2);
                if (iq0Var.L0 || iq0Var.M0) {
                    if (((TLRPC.Dialog) aq0Var.e.f(dialog2.f18125id)) == null) {
                        aq0Var.e.k(dialog2, dialog2.f18125id);
                        ArrayList arrayList = aq0Var.d;
                        arrayList.add(!arrayList.isEmpty(), dialog2);
                    }
                    aq0Var.l();
                    iq0Var.A0 = false;
                    b20Var.f22546r.setText("");
                    iq0Var.K0(false);
                }
                for (int i11 = 0; i11 < iq0Var.P0().getChildCount(); i11++) {
                    View childAt = iq0Var.P0().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.f7) {
                        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                        if (f7Var.getCurrentDialog() == iq0Var.C0.f18125id) {
                            f7Var.d(null, false, true);
                            f7Var.b(true, true);
                        }
                    }
                }
                iq0Var.L0();
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic E = fq0Var.E(i10);
        if (E != null && (dialog = iq0Var.C0) != null) {
            long j3 = dialog.f18125id;
            boolean isMonoForum = MessagesController.getInstance(iq0Var.currentAccount).isMonoForum(j3);
            TLRPC.Dialog dialog3 = iq0Var.C0;
            iVar.k(dialog3, j3);
            hashMap.put(dialog3, E);
            iq0Var.a1(2);
            if (iq0Var.L0 || iq0Var.M0) {
                if (((TLRPC.Dialog) aq0Var.e.f(dialog3.f18125id)) == null) {
                    aq0Var.e.k(dialog3, dialog3.f18125id);
                    ArrayList arrayList2 = aq0Var.d;
                    arrayList2.add(!arrayList2.isEmpty(), dialog3);
                }
                aq0Var.l();
                iq0Var.A0 = false;
                b20Var.f22546r.setText("");
                iq0Var.K0(false);
            }
            for (int i12 = 0; i12 < iq0Var.P0().getChildCount(); i12++) {
                View childAt2 = iq0Var.P0().getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.f7) {
                    org.telegram.ui.Cells.f7 f7Var2 = (org.telegram.ui.Cells.f7) childAt2;
                    if (f7Var2.getCurrentDialog() == iq0Var.C0.f18125id) {
                        f7Var2.d(E, isMonoForum, true);
                        f7Var2.b(true, true);
                    }
                }
            }
            iq0Var.L0();
        }
    }

    public static void s0(iq0 iq0Var) {
        kp0 kp0Var;
        int i10;
        int i11;
        kp0 kp0Var2 = iq0Var.F;
        kp0 kp0Var3 = iq0Var.G;
        ml0 ml0Var = iq0Var.E;
        if (!iq0Var.f25008r0) {
            if (iq0Var.L0) {
                kp0Var = kp0Var3;
            } else {
                kp0Var = kp0Var2;
            }
            if (kp0Var.getChildCount() > 0) {
                View childAt = kp0Var.getChildAt(0);
                for (int i12 = 0; i12 < kp0Var.getChildCount(); i12++) {
                    if (kp0Var.getChildAt(i12).getTop() < childAt.getTop()) {
                        childAt = kp0Var.getChildAt(i12);
                    }
                }
                wk0 wk0Var = (wk0) kp0Var.H(childAt);
                int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
                if (top > 0 && wk0Var != null && wk0Var.b() == 0) {
                    i10 = top;
                } else {
                    i10 = 0;
                }
                if (top >= 0 && wk0Var != null && wk0Var.b() == 0) {
                    iq0Var.K0 = childAt.getTop();
                    iq0Var.T0(false);
                } else {
                    iq0Var.K0 = Integer.MAX_VALUE;
                    iq0Var.T0(true);
                    top = i10;
                }
                if (ml0Var.getVisibility() == 0) {
                    if (ml0Var.getChildCount() > 0) {
                        View childAt2 = ml0Var.getChildAt(0);
                        for (int i13 = 0; i13 < ml0Var.getChildCount(); i13++) {
                            if (ml0Var.getChildAt(i13).getTop() < childAt2.getTop()) {
                                childAt2 = ml0Var.getChildAt(i13);
                            }
                        }
                        wk0 wk0Var2 = (wk0) ml0Var.H(childAt2);
                        int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
                        if (top2 > 0 && wk0Var2 != null && wk0Var2.b() == 0) {
                            i11 = top2;
                        } else {
                            i11 = 0;
                        }
                        if (top2 >= 0 && wk0Var2 != null && wk0Var2.b() == 0) {
                            iq0Var.K0 = childAt2.getTop();
                            iq0Var.T0(false);
                        } else {
                            iq0Var.K0 = Integer.MAX_VALUE;
                            iq0Var.T0(true);
                            top2 = i11;
                        }
                        top = AndroidUtilities.lerp(top, top2, ml0Var.getAlpha());
                    } else {
                        return;
                    }
                }
                int i14 = iq0Var.f25005p0;
                if (i14 != top) {
                    iq0Var.f25006q0 = i14;
                    float f7 = top;
                    int i15 = (int) (iq0Var.f25011t0 + f7);
                    iq0Var.f25005p0 = i15;
                    kp0Var2.setTopGlowOffset(i15);
                    int i16 = (int) (iq0Var.f25011t0 + f7);
                    iq0Var.f25005p0 = i16;
                    kp0Var3.setTopGlowOffset(i16);
                    int i17 = (int) (f7 + iq0Var.f25011t0);
                    iq0Var.f25005p0 = i17;
                    ml0Var.setTopGlowOffset(i17);
                    iq0Var.f24988b.setTranslationY(iq0Var.f25005p0 + iq0Var.f25011t0);
                    iq0Var.Q.setTranslationY(iq0Var.f25005p0 + iq0Var.f25011t0);
                    iq0Var.containerView.invalidate();
                }
            }
        }
    }

    public final void K0(boolean z10) {
        b20 b20Var = this.f25019y0;
        ci.h2 h2Var = b20Var.f22546r;
        ci.h2 h2Var2 = b20Var.f22546r;
        boolean isEmpty = TextUtils.isEmpty(h2Var.getText());
        kp0 kp0Var = this.F;
        kp0 kp0Var2 = this.G;
        boolean z11 = true;
        if (isEmpty && ((!this.keyboardVisible || !h2Var2.hasFocus()) && !this.M0)) {
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(kp0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(kp0Var2, false);
            }
            z11 = false;
        } else {
            this.A0 = true;
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(kp0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(kp0Var2, true);
            }
        }
        if (this.L0 == z11 && !z10) {
            return;
        }
        this.L0 = z11;
        eq0 eq0Var = this.M;
        eq0Var.l();
        this.K.l();
        if (this.L0) {
            if (this.K0 == Integer.MAX_VALUE) {
                ((s4.c0) kp0Var2.getLayoutManager()).h1(0, -kp0Var2.getPaddingTop());
            } else {
                ((s4.c0) kp0Var2.getLayoutManager()).h1(0, this.K0 - kp0Var2.getPaddingTop());
            }
            eq0Var.E(h2Var2.getText().toString());
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
            org.telegram.ui.Cells.f7 f7Var = null;
            this.C0 = null;
            for (int i10 = 0; i10 < P0().getChildCount(); i10++) {
                View childAt = P0().getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.f7) && ((org.telegram.ui.Cells.f7) childAt).getCurrentDialog() == dialog.f18125id) {
                    f7Var = childAt;
                }
            }
            if (f7Var == null) {
                return;
            }
            o1.k kVar = this.B0;
            if (kVar != null) {
                kVar.c();
            }
            P0().setVisibility(0);
            b20 b20Var = this.f25019y0;
            b20Var.setVisibility(0);
            ci.h2 h2Var = b20Var.f22546r;
            if (this.L0 || this.M0) {
                this.D0.H.v = true;
                h2Var.requestFocus();
                AndroidUtilities.showKeyboard(h2Var);
            }
            int[] iArr = new int[2];
            o1.k kVar2 = new o1.k(new o1.j(1000.0f));
            o1.l lVar = new o1.l(0.0f);
            org.telegram.ui.bo boVar = this.f24995f0;
            if (boVar != null && boVar.f32230b) {
                f7 = 10.0f;
            } else {
                f7 = 800.0f;
            }
            lVar.b(f7);
            lVar.a(1.0f);
            kVar2.f15361u = lVar;
            this.B0 = kVar2;
            kVar2.b(new ap0(this, f7Var, iArr, 0));
            this.B0.a(new fb(this, 4));
            this.B0.f();
        }
    }

    public final void M0() {
        boolean z10 = false;
        if (this.f25000k0 != null || this.f25004o0[0] != null) {
            try {
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
                xp0 xp0Var = this.f25010s0;
                if (xp0Var != null) {
                    xp0Var.u0();
                } else if (this.f24996g0 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f25000k0;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z10 = true;
                    }
                    ((LaunchActivity) this.f24996g0).D0(new i2.x(2, z10));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final String O0() {
        String str;
        String str2;
        String[] strArr = this.f25004o0;
        up0 up0Var = this.W;
        if (up0Var != null) {
            str2 = strArr[up0Var.d];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f25000k0;
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
        np npVar = this.f24993e0;
        if (npVar != null && npVar.f26511a.f21985q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.f24989b0)).build().toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final ml0 P0() {
        if (!this.L0 && !this.M0) {
            return this.F;
        }
        return this.G;
    }

    public final void Q0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        ml0 ml0Var = this.E;
        ml0Var.setPivotX(width);
        ml0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        ml0Var.setScaleX(f11);
        ml0Var.setScaleY(f11);
        ml0Var.setAlpha(f7);
        ml0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        P0.setScaleX(f12);
        P0.setScaleY(f12);
        float f13 = 1.0f - f7;
        P0.setAlpha(f13);
        b20 b20Var = this.f25019y0;
        b20Var.setPivotX(b20Var.getWidth() / 2.0f);
        b20Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        b20Var.setScaleX(f14);
        b20Var.setScaleY(f14);
        b20Var.setAlpha(f13);
        org.telegram.ui.ActionBar.k kVar = this.f25020z0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.setAlpha(f7);
        ml0Var.getLocationInWindow(iArr);
        float interpolation = qr.f27384g.getInterpolation(f7);
        for (int i10 = 0; i10 < P0.getChildCount(); i10++) {
            View childAt = P0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.f7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f7, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f13);
                }
            }
        }
        for (int i11 = 0; i11 < ml0Var.getChildCount(); i11++) {
            View childAt2 = ml0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.g7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y3 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((ml0Var.getTranslationY() + y3) - view.getY()))));
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
            animatorSetArr[0].addListener(new rp0(this, z10, 0));
            animatorSetArr[0].start();
        }
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        iq0 iq0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        dq0 dq0Var;
        if (dialog instanceof zp0) {
            S0(view);
        } else if (((view instanceof org.telegram.ui.Cells.f7) && ((org.telegram.ui.Cells.f7) view).F) || ((view instanceof org.telegram.ui.Cells.h6) && ((org.telegram.ui.Cells.h6) view).f20208n0)) {
            X0(dialog.f18125id, view);
        } else {
            ml0 ml0Var = this.E;
            if (ml0Var.getVisibility() == 8 && (activity = this.f24996g0) != null) {
                boolean isChatDialog = DialogObject.isChatDialog(dialog.f18125id);
                int i10 = this.P;
                if (isChatDialog) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f18125id));
                    if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.f18125id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        String string = LocaleController.getString(R.string.SendMessageTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                        c2Var.R = string;
                        if (i10 == 3) {
                            if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                c2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                            } else {
                                c2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                            }
                        } else if (i10 == 2) {
                            if (this.f25003n0) {
                                c2Var.T = LocaleController.getString(R.string.PublicPollCantForward);
                            } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                c2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                            } else {
                                c2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                            }
                        } else {
                            c2Var.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        hg.k0.r(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                } else if (DialogObject.isEncryptedDialog(dialog.f18125id) && i10 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String string2 = LocaleController.getString(R.string.SendMessageTitle);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f18447a;
                    c2Var2.R = string2;
                    if (i10 == 3) {
                        c2Var2.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i10 != 0) {
                        c2Var2.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        c2Var2.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    hg.k0.r(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
                long j3 = dialog.f18125id;
                a0.i iVar = this.U;
                if (iVar.h(j3) >= 0) {
                    iVar.l(dialog.f18125id);
                    this.V.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.h6) {
                        ((org.telegram.ui.Cells.h6) view).s(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) view).b(false, true);
                    }
                    a1(1);
                    iq0Var = this;
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.f18125id));
                    TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f18125id));
                    if ((!UserObject.isBotForum(user) || (((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f18268id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f18268id))) && (!DialogObject.isChatDialog(dialog.f18125id) || (!ChatObject.isForum(chat2) && (!ChatObject.isMonoForum(chat2) || !ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                        iq0Var = this;
                        iVar.k(dialog, dialog.f18125id);
                        if (view instanceof org.telegram.ui.Cells.h6) {
                            ((org.telegram.ui.Cells.h6) view).s(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.f7) {
                            ((org.telegram.ui.Cells.f7) view).b(true, true);
                        }
                        a1(2);
                        long j10 = UserConfig.getInstance(iq0Var.currentAccount).clientUserId;
                        if (iq0Var.L0) {
                            aq0 aq0Var = iq0Var.K;
                            a0.i iVar2 = aq0Var.e;
                            ArrayList arrayList = aq0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) iVar2.f(dialog.f18125id);
                            if (dialog2 == null) {
                                aq0Var.e.k(dialog, dialog.f18125id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f18125id != j10) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            aq0Var.l();
                            iq0Var.A0 = false;
                            b20 b20Var = iq0Var.f25019y0;
                            b20Var.f22546r.setText("");
                            K0(false);
                            AndroidUtilities.hideKeyboard(b20Var.f22546r);
                        }
                    } else {
                        this.C0 = dialog;
                        this.I.h1(0, this.f25005p0 - ml0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        pp0 pp0Var = new pp0(this, dialog, atomicReference, view);
                        atomicReference.set(new kn0(this, atomicReference, pp0Var, dialog, 1));
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                        int i11 = NotificationCenter.topicsDidLoaded;
                        notificationCenter.addObserver(pp0Var, i11);
                        if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.f18125id) != null) {
                            pp0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.f18125id));
                            return;
                        }
                        MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.f18125id);
                        AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                eq0 eq0Var = iq0Var.M;
                if (eq0Var != null && (dq0Var = eq0Var.H) != null) {
                    dq0Var.q(0, dq0Var.h());
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
            mp0 mp0Var = this.f24990c;
            np0 np0Var = this.d;
            boolean z11 = true;
            if (i13 < m10) {
                if (c5.h(getContext(), this.currentAccount, iVar.j(i13), (mp0Var.getTag() == null || np0Var.f25433a.length() <= 0) ? false : false)) {
                    return;
                }
                i13++;
            } else {
                Editable text = np0Var.getText();
                eu euVar = np0Var.f25433a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                np npVar = this.f24993e0;
                if (npVar != null && npVar.f26511a.f21985q) {
                    i10 = this.f24989b0;
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
                        if (mp0Var.getTag() != null && euVar.length() > 0 && sendPaidMessagesStars > 0) {
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
                    up0 up0Var = this.W;
                    if (up0Var != null) {
                        i11 = up0Var.d;
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
                            if (this.F0 != null && mp0Var.getTag() != null && euVar.length() > 0 && charSequenceArr[0] != null && sendPaidMessagesStars2 > 0) {
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
                                if (mp0Var.getTag() != null && euVar.length() > 0 && sendPaidMessagesStars3 > 0) {
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
                c5.c0(this.currentAccount, arrayList, i12, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        iq0.o(iq0.this, charSequenceArr, entities, z10, i22, (HashMap) obj);
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
        mp0 mp0Var = this.f24990c;
        if (mp0Var.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.f25018y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        mp0Var.setTag(num);
        np0 np0Var = this.d;
        if (np0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(np0Var.getEditText());
        }
        np0Var.k(true);
        FrameLayout frameLayout = this.f24991c0;
        mp0 mp0Var2 = this.f24994f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            mp0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            mp0Var2.setVisibility(0);
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
            WeakHashMap weakHashMap = r0.i0.f41870a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.f25016x;
        if (linearLayout != null) {
            if (!z10) {
                i11 = 1;
            }
            WeakHashMap weakHashMap2 = r0.i0.f41870a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.f25018y = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f14 = 0.0f;
        float f15 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(mp0Var, property, f7));
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
        arrayList.add(ObjectAnimator.ofFloat(mp0Var2, property2, f10));
        Property property3 = View.SCALE_Y;
        if (z10) {
            f16 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(mp0Var2, property3, f16));
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(mp0Var2, property, f11));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.S[1];
            if (!z10) {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
        }
        FrameLayout frameLayout3 = this.f25007r;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.f24997h0 && z10) {
                if (this.f24992d0 != null) {
                    f12 = 5.0f;
                } else {
                    f12 = 16.0f;
                }
                f14 = AndroidUtilities.dp(f12);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, f14));
        }
        this.f25018y.playTogether(arrayList);
        this.f25018y.setInterpolator(new DecelerateInterpolator());
        this.f25018y.setDuration(180L);
        this.f25018y.addListener(new rp0(this, z10, 1));
        this.f25018y.start();
    }

    public final void X0(long j3, View view) {
        String str;
        oc J;
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
            J = new vc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = new vc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new dp0(this, 1));
        }
        J.j();
    }

    public final void Y0() {
        org.telegram.ui.ActionBar.q1 q1Var;
        mp0 mp0Var = this.f24990c;
        if (mp0Var == null) {
            return;
        }
        np0 np0Var = this.d;
        if (np0Var != null && np0Var.m()) {
            np0Var.getEmojiPaddingShown();
        } else {
            tp0 tp0Var = this.D0;
            if (tp0Var != null && (q1Var = tp0Var.H) != null && !q1Var.f19512f) {
                AndroidUtilities.dp(20.0f);
            }
        }
        float f7 = 0.0f;
        FrameLayout frameLayout = this.f24991c0;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f7 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            float f10 = -f7;
            frameLayout2.setTranslationY(f10);
            LinearLayout linearLayout = this.f25016x;
            if (linearLayout != null) {
                linearLayout.setTranslationY(f10);
            }
        }
        float f11 = -f7;
        mp0Var.setTranslationY(f11);
        this.f24994f.setTranslationY(f11);
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.k5 k5Var = this.f25009s;
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
        Object tag = this.f24990c.getTag();
        np0 np0Var = this.d;
        if (tag != null && np0Var.f25433a.length() > 0) {
            size++;
        }
        long j3 = 0;
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            long j10 = ((TLRPC.Dialog) iVar.n(i11)).f18125id;
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
        ii.y1 y1Var = this.e;
        y1Var.g(max, z10);
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        y1Var.i(size, j3, z11);
        W0(true);
        np0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), y1Var.l()), 0);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            aq0 aq0Var = this.K;
            if (aq0Var != null) {
                aq0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override
    public final void dismiss() {
        np0 np0Var = this.d;
        if (np0Var != null) {
            AndroidUtilities.hideKeyboard(np0Var.getEditText());
        }
        this.Y = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        np0 np0Var = this.d;
        if (np0Var != null) {
            np0Var.o();
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
        np0 np0Var = this.d;
        if (np0Var != null && np0Var.e) {
            np0Var.k(true);
        } else {
            super.onBackPressed();
        }
    }

    public iq0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    public iq0(android.content.Context r36, org.telegram.ui.bo r37, java.util.ArrayList r38, java.lang.String r39, java.lang.String r40, boolean r41, java.lang.String r42, java.lang.String r43, boolean r44, boolean r45, boolean r46, java.lang.Integer r47, org.telegram.ui.ActionBar.f6 r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iq0.<init>(android.content.Context, org.telegram.ui.bo, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.f6):void");
    }

    public void S0(View view) {
    }

    public void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
