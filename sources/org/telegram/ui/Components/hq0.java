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
public class hq0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f26786a1 = 0;
    public boolean A0;
    public o1.k B0;
    public TLRPC.Dialog C0;
    public final sp0 D0;
    public final ll0 E;
    public ArrayList E0;
    public final jp0 F;
    public TL_stories.StoryItem F0;
    public final jp0 G;
    public i0.c G0;
    public final s4.s H;
    public int H0;
    public final s4.s I;
    public boolean I0;
    public final oz J;
    public org.telegram.ui.ActionBar.n1 J0;
    public final zp0 K;
    public int K0;
    public final eq0 L;
    public boolean L0;
    public final dq0 M;
    public boolean M0;
    public final ArrayList N;
    public int N0;
    public final String[] O;
    public final bh.f O0;
    public final int P;
    public final gh.d P0;
    public final xw0 Q;
    public final gh.d Q0;
    public final Drawable R;
    public final bh.b R0;
    public final View[] S;
    public final bh.b S0;
    public final AnimatorSet[] T;
    public final bh.b T0;
    public final a0.i U;
    public final bh.l U0;
    public final HashMap V;
    public final dh.d V0;
    public final tp0 W;
    public final bh.c W0;
    public int X;
    public final dh.d X0;
    public boolean Y;
    public final ArrayList Y0;
    public final boolean Z;
    public final RectF Z0;
    public boolean f26787a0;
    public final FrameLayout f26788b;
    public final int f26789b0;
    public final lp0 f26790c;
    public final FrameLayout f26791c0;
    public final mp0 d;
    public final LinearLayout f26792d0;
    public final ji.x1 f26793e;
    public final mp f26794e0;
    public final lp0 f26795f;
    public final org.telegram.ui.co f26796f0;
    public final Activity f26797g0;
    public final FrameLayout h;
    public final boolean f26798h0;
    public boolean f26799i0;
    public final TextPaint f26800j0;
    public TLRPC.TL_exportedMessageLink f26801k0;
    public boolean f26802l0;
    public boolean m0;
    public final di.eb f26803n;
    public final boolean f26804n0;
    public final String[] f26805o0;
    public int f26806p0;
    public int f26807q0;
    public final FrameLayout f26808r;
    public boolean f26809r0;
    public final org.telegram.ui.ActionBar.j5 f26810s;
    public wp0 f26811s0;
    public float f26812t0;
    public float f26813u0;
    public final FrameLayout v;
    public float f26814v0;
    public final FrameLayout f26815w;
    public ValueAnimator f26816w0;
    public final LinearLayout f26817x;
    public final qk0 f26818x0;
    public AnimatorSet f26819y;
    public final b20 f26820y0;
    public final org.telegram.ui.ActionBar.k f26821z0;

    public hq0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, f6Var);
    }

    public static void A0(hq0 hq0Var) {
        float f7;
        RectF rectF = hq0Var.Z0;
        bh.f fVar = hq0Var.O0;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            rectF.set(0.0f, 0.0f, hq0Var.containerView.getMeasuredWidth(), hq0Var.containerView.getMeasuredHeight());
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            fVar.g(1, hq0Var.Y0);
            fVar.e(hq0Var.U0, hq0Var.containerView.getMeasuredWidth(), hq0Var.containerView.getMeasuredHeight());
        }
    }

    public static int F0(hq0 hq0Var) {
        jp0 jp0Var = hq0Var.F;
        if (jp0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = jp0Var.getChildAt(0);
            vk0 vk0Var = (vk0) jp0Var.G(childAt);
            if (vk0Var != null) {
                int paddingTop = jp0Var.getPaddingTop();
                if (vk0Var.c() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    public static hq0 N0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        ArrayList arrayList;
        if (messageObject != null) {
            arrayList = org.telegram.messenger.w1.l(messageObject);
        } else {
            arrayList = null;
        }
        return new hq0(context, arrayList, str, null, z10, str2, null, false);
    }

    public static void m(hq0 hq0Var, AtomicReference atomicReference, op0 op0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        op0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, hq0Var.currentAccount, Long.valueOf(-dialog.f19873id));
    }

    public static boolean n(final hq0 hq0Var) {
        int measuredHeight;
        org.telegram.ui.co coVar;
        ji.x1 x1Var = hq0Var.f26793e;
        boolean z10 = hq0Var.f26798h0;
        Activity activity = hq0Var.f26797g0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(hq0Var.getContext());
        linearLayout.setOrientation(1);
        if (hq0Var.N != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, hq0Var.resourcesProvider);
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20708fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new pp0(hq0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new cp0(hq0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, hq0Var.getContext(), hq0Var.resourcesProvider, true, false);
            if (z10) {
                f1Var.setTextColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20853ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var, w7.x5.n(-1, 48));
            f1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            hq0Var.I0 = true;
            f1Var.setChecked(true);
            final org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(1, hq0Var.getContext(), hq0Var.resourcesProvider, false, true);
            if (z10) {
                f1Var2.setTextColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20853ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, w7.x5.n(-1, 48));
            f1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            f1Var2.setChecked(!hq0Var.I0);
            f1Var.setOnClickListener(new View.OnClickListener(hq0Var) {
                public final hq0 f26162b;

                {
                    this.f26162b = hq0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            hq0 hq0Var2 = this.f26162b;
                            hq0Var2.I0 = true;
                            f1Var.setChecked(true);
                            f1Var2.setChecked(!hq0Var2.I0);
                            return;
                        default:
                            hq0 hq0Var3 = this.f26162b;
                            hq0Var3.I0 = false;
                            f1Var.setChecked(false);
                            f1Var2.setChecked(!hq0Var3.I0);
                            return;
                    }
                }
            });
            f1Var2.setOnClickListener(new View.OnClickListener(hq0Var) {
                public final hq0 f26162b;

                {
                    this.f26162b = hq0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            hq0 hq0Var2 = this.f26162b;
                            hq0Var2.I0 = true;
                            f1Var.setChecked(true);
                            f1Var2.setChecked(!hq0Var2.I0);
                            return;
                        default:
                            hq0 hq0Var3 = this.f26162b;
                            hq0Var3.I0 = false;
                            f1Var.setChecked(false);
                            f1Var2.setChecked(!hq0Var3.I0);
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.x5.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, hq0Var.resourcesProvider);
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20708fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new pp0(hq0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new cp0(hq0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, hq0Var.getContext(), hq0Var.resourcesProvider, true, true);
        if (z10) {
            f1Var3.setTextColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20853ng));
            f1Var3.setIconColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        }
        f1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        f1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(f1Var3, w7.x5.n(-1, 48));
        f1Var3.setOnClickListener(new bp0(hq0Var, 1));
        org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(0, hq0Var.getContext(), hq0Var.resourcesProvider, true, true);
        if (z10) {
            f1Var4.setTextColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20853ng));
            f1Var4.setIconColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        }
        f1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        f1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(f1Var4, w7.x5.n(-1, 48));
        f1Var4.setOnClickListener(new bp0(hq0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.x5.n(-1, -2));
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(linearLayout, -2, -2);
        hq0Var.J0 = n1Var;
        n1Var.f21209b = false;
        n1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        hq0Var.J0.setOutsideTouchable(true);
        hq0Var.J0.setClippingEnabled(true);
        hq0Var.J0.setInputMethodMode(2);
        hq0Var.J0.setSoftInputMode(0);
        hq0Var.J0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        hq0Var.J0.setFocusable(true);
        int[] iArr = new int[2];
        x1Var.getLocationInWindow(iArr);
        if (hq0Var.keyboardVisible && (coVar = hq0Var.f26796f0) != null && coVar.X0.getMeasuredHeight() > AndroidUtilities.dp(58.0f)) {
            measuredHeight = x1Var.getMeasuredHeight() + iArr[1];
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
        }
        hq0Var.J0.showAtLocation(x1Var, 51, AndroidUtilities.dp(8.0f) + ((x1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
        hq0Var.J0.b();
        try {
            x1Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void o(hq0 hq0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
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
        lp0 lp0Var;
        long j12;
        long j13;
        Long l12;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue4;
        String charSequence3;
        long longValue5;
        String[] strArr2 = hq0Var.O;
        mp0 mp0Var = hq0Var.d;
        lp0 lp0Var2 = hq0Var.f26790c;
        HashMap hashMap2 = hq0Var.V;
        Long l13 = 0L;
        a0.i iVar = hq0Var.U;
        ArrayList arrayList3 = hq0Var.N;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i14 = 0;
            boolean z12 = false;
            while (true) {
                if (i14 < iVar.m()) {
                    long j14 = iVar.j(i14);
                    boolean isMonoForum = MessagesController.getInstance(hq0Var.currentAccount).isMonoForum(j14);
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
                        lp0Var = lp0Var2;
                        j12 = j14;
                        j13 = DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    } else {
                        lp0Var = lp0Var2;
                        j12 = j14;
                        j13 = 0;
                    }
                    if (tL_forumTopic3 != null && !isMonoForum) {
                        l12 = l13;
                        messageObject3 = new MessageObject(hq0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    } else {
                        l12 = l13;
                        messageObject3 = null;
                    }
                    if (messageObject3 != null) {
                        messageObject3.isTopicMainMessage = true;
                    }
                    if (lp0Var.getTag() != null && mp0Var.f26847a.length() > 0) {
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
                        SendMessagesHelper.getInstance(hq0Var.currentAccount).sendMessage(of3);
                    } else {
                        messageObject4 = messageObject3;
                        arrayList2 = arrayList3;
                    }
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(hq0Var.currentAccount);
                    ArrayList<MessageObject> arrayList5 = hq0Var.N;
                    boolean z13 = !hq0Var.I0;
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
                        e5.t0(sendMessage, hq0Var.f26796f0, null);
                        if (sendMessage != 0) {
                            break;
                        }
                    }
                    i14++;
                    arrayList3 = arrayList2;
                    lp0Var2 = lp0Var;
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
                hq0Var.R0(iVar, size2, tL_forumTopic2, !z12);
            }
        } else {
            tp0 tp0Var = hq0Var.W;
            if (tp0Var != null) {
                i11 = tp0Var.d;
            } else {
                i11 = 0;
            }
            if (hq0Var.F0 != null) {
                int i16 = 0;
                boolean z14 = false;
                while (i16 < iVar.m()) {
                    long j16 = iVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(hq0Var.currentAccount).isMonoForum(j16);
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
                        messageObject2 = new MessageObject(hq0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                    } else {
                        strArr = strArr2;
                        messageObject2 = null;
                    }
                    if (hq0Var.F0 == null) {
                        if (lp0Var2.getTag() != null && mp0Var.f26847a.length() > 0) {
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
                        if (lp0Var2.getTag() != null && mp0Var.f26847a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(hq0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j16, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = hq0Var.F0;
                    }
                    if (l10 == null) {
                        longValue3 = 0;
                    } else {
                        longValue3 = l10.longValue();
                    }
                    of2.payStars = longValue3;
                    of2.monoForumPeer = j11;
                    SendMessagesHelper.getInstance(hq0Var.currentAccount).sendMessage(of2);
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
                        boolean isMonoForum3 = MessagesController.getInstance(hq0Var.currentAccount).isMonoForum(j17);
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
                            messageObject = new MessageObject(hq0Var.currentAccount, tL_forumTopic5.topicStartMessage, false, false);
                        } else {
                            c10 = 0;
                            messageObject = null;
                        }
                        if (lp0Var2.getTag() != null && mp0Var.f26847a.length() > 0) {
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
                            SendMessagesHelper.getInstance(hq0Var.currentAccount).sendMessage(of4);
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
                        SendMessagesHelper.getInstance(hq0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z15;
                } else {
                    i12 = 0;
                    z11 = false;
                    hq0Var.R0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i12)), !z11);
                }
            }
            i12 = 0;
            hq0Var.R0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i12)), !z11);
        }
        wp0 wp0Var = hq0Var.f26811s0;
        if (wp0Var != null) {
            wp0Var.U();
        }
        hq0Var.dismiss();
    }

    public static void p(hq0 hq0Var, int i10) {
        TLRPC.Dialog dialog;
        b20 b20Var = hq0Var.f26820y0;
        HashMap hashMap = hq0Var.V;
        a0.i iVar = hq0Var.U;
        zp0 zp0Var = hq0Var.K;
        eq0 eq0Var = hq0Var.L;
        if (eq0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = hq0Var.C0;
            if (dialog2 != null) {
                iVar.k(dialog2, dialog2.f19873id);
                hashMap.remove(dialog2);
                hq0Var.a1(2);
                if (hq0Var.L0 || hq0Var.M0) {
                    if (((TLRPC.Dialog) zp0Var.f33202e.f(dialog2.f19873id)) == null) {
                        zp0Var.f33202e.k(dialog2, dialog2.f19873id);
                        ArrayList arrayList = zp0Var.d;
                        arrayList.add(!arrayList.isEmpty(), dialog2);
                    }
                    zp0Var.l();
                    hq0Var.A0 = false;
                    b20Var.f24522r.setText("");
                    hq0Var.K0(false);
                }
                for (int i11 = 0; i11 < hq0Var.P0().getChildCount(); i11++) {
                    View childAt = hq0Var.P0().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.f7) {
                        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                        if (f7Var.getCurrentDialog() == hq0Var.C0.f19873id) {
                            f7Var.d(null, false, true);
                            f7Var.b(true, true);
                        }
                    }
                }
                hq0Var.L0();
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic E = eq0Var.E(i10);
        if (E != null && (dialog = hq0Var.C0) != null) {
            long j3 = dialog.f19873id;
            boolean isMonoForum = MessagesController.getInstance(hq0Var.currentAccount).isMonoForum(j3);
            TLRPC.Dialog dialog3 = hq0Var.C0;
            iVar.k(dialog3, j3);
            hashMap.put(dialog3, E);
            hq0Var.a1(2);
            if (hq0Var.L0 || hq0Var.M0) {
                if (((TLRPC.Dialog) zp0Var.f33202e.f(dialog3.f19873id)) == null) {
                    zp0Var.f33202e.k(dialog3, dialog3.f19873id);
                    ArrayList arrayList2 = zp0Var.d;
                    arrayList2.add(!arrayList2.isEmpty(), dialog3);
                }
                zp0Var.l();
                hq0Var.A0 = false;
                b20Var.f24522r.setText("");
                hq0Var.K0(false);
            }
            for (int i12 = 0; i12 < hq0Var.P0().getChildCount(); i12++) {
                View childAt2 = hq0Var.P0().getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.f7) {
                    org.telegram.ui.Cells.f7 f7Var2 = (org.telegram.ui.Cells.f7) childAt2;
                    if (f7Var2.getCurrentDialog() == hq0Var.C0.f19873id) {
                        f7Var2.d(E, isMonoForum, true);
                        f7Var2.b(true, true);
                    }
                }
            }
            hq0Var.L0();
        }
    }

    public static void s0(hq0 hq0Var) {
        jp0 jp0Var;
        int i10;
        int i11;
        jp0 jp0Var2 = hq0Var.F;
        jp0 jp0Var3 = hq0Var.G;
        ll0 ll0Var = hq0Var.E;
        if (!hq0Var.f26809r0) {
            if (hq0Var.L0) {
                jp0Var = jp0Var3;
            } else {
                jp0Var = jp0Var2;
            }
            if (jp0Var.getChildCount() > 0) {
                View childAt = jp0Var.getChildAt(0);
                for (int i12 = 0; i12 < jp0Var.getChildCount(); i12++) {
                    if (jp0Var.getChildAt(i12).getTop() < childAt.getTop()) {
                        childAt = jp0Var.getChildAt(i12);
                    }
                }
                vk0 vk0Var = (vk0) jp0Var.G(childAt);
                int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
                if (top > 0 && vk0Var != null && vk0Var.b() == 0) {
                    i10 = top;
                } else {
                    i10 = 0;
                }
                if (top >= 0 && vk0Var != null && vk0Var.b() == 0) {
                    hq0Var.K0 = childAt.getTop();
                    hq0Var.T0(false);
                } else {
                    hq0Var.K0 = Integer.MAX_VALUE;
                    hq0Var.T0(true);
                    top = i10;
                }
                if (ll0Var.getVisibility() == 0) {
                    if (ll0Var.getChildCount() > 0) {
                        View childAt2 = ll0Var.getChildAt(0);
                        for (int i13 = 0; i13 < ll0Var.getChildCount(); i13++) {
                            if (ll0Var.getChildAt(i13).getTop() < childAt2.getTop()) {
                                childAt2 = ll0Var.getChildAt(i13);
                            }
                        }
                        vk0 vk0Var2 = (vk0) ll0Var.G(childAt2);
                        int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
                        if (top2 > 0 && vk0Var2 != null && vk0Var2.b() == 0) {
                            i11 = top2;
                        } else {
                            i11 = 0;
                        }
                        if (top2 >= 0 && vk0Var2 != null && vk0Var2.b() == 0) {
                            hq0Var.K0 = childAt2.getTop();
                            hq0Var.T0(false);
                        } else {
                            hq0Var.K0 = Integer.MAX_VALUE;
                            hq0Var.T0(true);
                            top2 = i11;
                        }
                        top = AndroidUtilities.lerp(top, top2, ll0Var.getAlpha());
                    } else {
                        return;
                    }
                }
                int i14 = hq0Var.f26806p0;
                if (i14 != top) {
                    hq0Var.f26807q0 = i14;
                    float f7 = top;
                    int i15 = (int) (hq0Var.f26812t0 + f7);
                    hq0Var.f26806p0 = i15;
                    jp0Var2.setTopGlowOffset(i15);
                    int i16 = (int) (hq0Var.f26812t0 + f7);
                    hq0Var.f26806p0 = i16;
                    jp0Var3.setTopGlowOffset(i16);
                    int i17 = (int) (f7 + hq0Var.f26812t0);
                    hq0Var.f26806p0 = i17;
                    ll0Var.setTopGlowOffset(i17);
                    hq0Var.f26788b.setTranslationY(hq0Var.f26806p0 + hq0Var.f26812t0);
                    hq0Var.Q.setTranslationY(hq0Var.f26806p0 + hq0Var.f26812t0);
                    hq0Var.containerView.invalidate();
                }
            }
        }
    }

    public final void K0(boolean z10) {
        b20 b20Var = this.f26820y0;
        di.h2 h2Var = b20Var.f24522r;
        di.h2 h2Var2 = b20Var.f24522r;
        boolean isEmpty = TextUtils.isEmpty(h2Var.getText());
        jp0 jp0Var = this.F;
        jp0 jp0Var2 = this.G;
        boolean z11 = true;
        if (isEmpty && ((!this.keyboardVisible || !h2Var2.hasFocus()) && !this.M0)) {
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(jp0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(jp0Var2, false);
            }
            z11 = false;
        } else {
            this.A0 = true;
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(jp0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(jp0Var2, true);
            }
        }
        if (this.L0 == z11 && !z10) {
            return;
        }
        this.L0 = z11;
        dq0 dq0Var = this.M;
        dq0Var.l();
        this.K.l();
        if (this.L0) {
            if (this.K0 == Integer.MAX_VALUE) {
                ((s4.c0) jp0Var2.getLayoutManager()).h1(0, -jp0Var2.getPaddingTop());
            } else {
                ((s4.c0) jp0Var2.getLayoutManager()).h1(0, this.K0 - jp0Var2.getPaddingTop());
            }
            dq0Var.E(h2Var2.getText().toString());
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
                if ((childAt instanceof org.telegram.ui.Cells.f7) && ((org.telegram.ui.Cells.f7) childAt).getCurrentDialog() == dialog.f19873id) {
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
            b20 b20Var = this.f26820y0;
            b20Var.setVisibility(0);
            di.h2 h2Var = b20Var.f24522r;
            if (this.L0 || this.M0) {
                this.D0.H.v = true;
                h2Var.requestFocus();
                AndroidUtilities.showKeyboard(h2Var);
            }
            int[] iArr = new int[2];
            o1.k kVar2 = new o1.k(new o1.j(1000.0f));
            o1.l lVar = new o1.l(0.0f);
            org.telegram.ui.co coVar = this.f26796f0;
            if (coVar != null && coVar.f35197b) {
                f7 = 10.0f;
            } else {
                f7 = 800.0f;
            }
            lVar.b(f7);
            lVar.a(1.0f);
            kVar2.f16825u = lVar;
            this.B0 = kVar2;
            kVar2.b(new ap0(this, f7Var, iArr, 0));
            this.B0.a(new hb(this, 4));
            this.B0.f();
        }
    }

    public final void M0() {
        boolean z10 = false;
        if (this.f26801k0 != null || this.f26805o0[0] != null) {
            try {
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
                wp0 wp0Var = this.f26811s0;
                if (wp0Var != null) {
                    wp0Var.z0();
                } else if (this.f26797g0 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f26801k0;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z10 = true;
                    }
                    ((LaunchActivity) this.f26797g0).D0(new i2.y(2, z10));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final String O0() {
        String str;
        String str2;
        String[] strArr = this.f26805o0;
        tp0 tp0Var = this.W;
        if (tp0Var != null) {
            str2 = strArr[tp0Var.d];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f26801k0;
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
        mp mpVar = this.f26794e0;
        if (mpVar != null && mpVar.f28477a.f23907q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.f26789b0)).build().toString();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final ll0 P0() {
        if (!this.L0 && !this.M0) {
            return this.F;
        }
        return this.G;
    }

    public final void Q0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        ll0 ll0Var = this.E;
        ll0Var.setPivotX(width);
        ll0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        ll0Var.setScaleX(f11);
        ll0Var.setScaleY(f11);
        ll0Var.setAlpha(f7);
        ll0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        P0.setScaleX(f12);
        P0.setScaleY(f12);
        float f13 = 1.0f - f7;
        P0.setAlpha(f13);
        b20 b20Var = this.f26820y0;
        b20Var.setPivotX(b20Var.getWidth() / 2.0f);
        b20Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        b20Var.setScaleX(f14);
        b20Var.setScaleY(f14);
        b20Var.setAlpha(f13);
        org.telegram.ui.ActionBar.k kVar = this.f26821z0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.setAlpha(f7);
        ll0Var.getLocationInWindow(iArr);
        float interpolation = pr.f29467g.getInterpolation(f7);
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
        for (int i11 = 0; i11 < ll0Var.getChildCount(); i11++) {
            View childAt2 = ll0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.g7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y3 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((ll0Var.getTranslationY() + y3) - view.getY()))));
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
            animatorSetArr[0].addListener(new qp0(this, z10, 0));
            animatorSetArr[0].start();
        }
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        hq0 hq0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        cq0 cq0Var;
        if (dialog instanceof yp0) {
            S0(view);
        } else if (((view instanceof org.telegram.ui.Cells.f7) && ((org.telegram.ui.Cells.f7) view).F) || ((view instanceof org.telegram.ui.Cells.h6) && ((org.telegram.ui.Cells.h6) view).f22042n0)) {
            X0(dialog.f19873id, view);
        } else {
            ll0 ll0Var = this.E;
            if (ll0Var.getVisibility() == 8 && (activity = this.f26797g0) != null) {
                boolean isChatDialog = DialogObject.isChatDialog(dialog.f19873id);
                int i10 = this.P;
                if (isChatDialog) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f19873id));
                    if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.f19873id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        String string = LocaleController.getString(R.string.SendMessageTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                        b2Var.R = string;
                        if (i10 == 3) {
                            if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                            } else {
                                b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                            }
                        } else if (i10 == 2) {
                            if (this.f26804n0) {
                                b2Var.T = LocaleController.getString(R.string.PublicPollCantForward);
                            } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                            } else {
                                b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                            }
                        } else {
                            b2Var.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        i2.g.r(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                } else if (DialogObject.isEncryptedDialog(dialog.f19873id) && i10 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String string2 = LocaleController.getString(R.string.SendMessageTitle);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20198a;
                    b2Var2.R = string2;
                    if (i10 == 3) {
                        b2Var2.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i10 != 0) {
                        b2Var2.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        b2Var2.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    i2.g.r(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
                long j3 = dialog.f19873id;
                a0.i iVar = this.U;
                if (iVar.h(j3) >= 0) {
                    iVar.l(dialog.f19873id);
                    this.V.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.h6) {
                        ((org.telegram.ui.Cells.h6) view).s(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) view).b(false, true);
                    }
                    a1(1);
                    hq0Var = this;
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.f19873id));
                    TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f19873id));
                    if ((!UserObject.isBotForum(user) || (((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f20016id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f20016id))) && (!DialogObject.isChatDialog(dialog.f19873id) || (!ChatObject.isForum(chat2) && (!ChatObject.isMonoForum(chat2) || !ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                        hq0Var = this;
                        iVar.k(dialog, dialog.f19873id);
                        if (view instanceof org.telegram.ui.Cells.h6) {
                            ((org.telegram.ui.Cells.h6) view).s(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.f7) {
                            ((org.telegram.ui.Cells.f7) view).b(true, true);
                        }
                        a1(2);
                        long j10 = UserConfig.getInstance(hq0Var.currentAccount).clientUserId;
                        if (hq0Var.L0) {
                            zp0 zp0Var = hq0Var.K;
                            a0.i iVar2 = zp0Var.f33202e;
                            ArrayList arrayList = zp0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) iVar2.f(dialog.f19873id);
                            if (dialog2 == null) {
                                zp0Var.f33202e.k(dialog, dialog.f19873id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f19873id != j10) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            zp0Var.l();
                            hq0Var.A0 = false;
                            b20 b20Var = hq0Var.f26820y0;
                            b20Var.f24522r.setText("");
                            K0(false);
                            AndroidUtilities.hideKeyboard(b20Var.f24522r);
                        }
                    } else {
                        this.C0 = dialog;
                        this.I.h1(0, this.f26806p0 - ll0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        op0 op0Var = new op0(this, dialog, atomicReference, view);
                        atomicReference.set(new in0(this, atomicReference, op0Var, dialog, 1));
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                        int i11 = NotificationCenter.topicsDidLoaded;
                        notificationCenter.addObserver(op0Var, i11);
                        if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.f19873id) != null) {
                            op0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.f19873id));
                            return;
                        }
                        MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.f19873id);
                        AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                dq0 dq0Var = hq0Var.M;
                if (dq0Var != null && (cq0Var = dq0Var.H) != null) {
                    cq0Var.q(0, cq0Var.h());
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
            lp0 lp0Var = this.f26790c;
            mp0 mp0Var = this.d;
            boolean z11 = true;
            if (i13 < m10) {
                if (e5.h(getContext(), this.currentAccount, iVar.j(i13), (lp0Var.getTag() == null || mp0Var.f26847a.length() <= 0) ? false : false)) {
                    return;
                }
                i13++;
            } else {
                Editable text = mp0Var.getText();
                cu cuVar = mp0Var.f26847a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                mp mpVar = this.f26794e0;
                if (mpVar != null && mpVar.f28477a.f23907q) {
                    i10 = this.f26789b0;
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
                        if (lp0Var.getTag() != null && cuVar.length() > 0 && sendPaidMessagesStars > 0) {
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
                    tp0 tp0Var = this.W;
                    if (tp0Var != null) {
                        i11 = tp0Var.d;
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
                            if (this.F0 != null && lp0Var.getTag() != null && cuVar.length() > 0 && charSequenceArr[0] != null && sendPaidMessagesStars2 > 0) {
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
                                if (lp0Var.getTag() != null && cuVar.length() > 0 && sendPaidMessagesStars3 > 0) {
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
                        hq0.o(hq0.this, charSequenceArr, entities, z10, i22, (HashMap) obj);
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
        lp0 lp0Var = this.f26790c;
        if (lp0Var.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.f26819y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        lp0Var.setTag(num);
        mp0 mp0Var = this.d;
        if (mp0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(mp0Var.getEditText());
        }
        mp0Var.k(true);
        FrameLayout frameLayout = this.f26791c0;
        lp0 lp0Var2 = this.f26795f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            lp0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            lp0Var2.setVisibility(0);
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
            WeakHashMap weakHashMap = r0.i0.f44697a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.f26817x;
        if (linearLayout != null) {
            if (!z10) {
                i11 = 1;
            }
            WeakHashMap weakHashMap2 = r0.i0.f44697a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.f26819y = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f14 = 0.0f;
        float f15 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(lp0Var, property, f7));
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
        arrayList.add(ObjectAnimator.ofFloat(lp0Var2, property2, f10));
        Property property3 = View.SCALE_Y;
        if (z10) {
            f16 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(lp0Var2, property3, f16));
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(lp0Var2, property, f11));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.S[1];
            if (!z10) {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
        }
        FrameLayout frameLayout3 = this.f26808r;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.f26798h0 && z10) {
                if (this.f26792d0 != null) {
                    f12 = 5.0f;
                } else {
                    f12 = 16.0f;
                }
                f14 = AndroidUtilities.dp(f12);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, f14));
        }
        this.f26819y.playTogether(arrayList);
        this.f26819y.setInterpolator(new DecelerateInterpolator());
        this.f26819y.setDuration(180L);
        this.f26819y.addListener(new qp0(this, z10, 1));
        this.f26819y.start();
    }

    public final void X0(long j3, View view) {
        String str;
        qc J;
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
            J = new yc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new dp0(this, 1));
        }
        J.j();
    }

    public final void Y0() {
        org.telegram.ui.ActionBar.p1 p1Var;
        lp0 lp0Var = this.f26790c;
        if (lp0Var == null) {
            return;
        }
        mp0 mp0Var = this.d;
        if (mp0Var != null && mp0Var.m()) {
            mp0Var.getEmojiPaddingShown();
        } else {
            sp0 sp0Var = this.D0;
            if (sp0Var != null && (p1Var = sp0Var.H) != null && !p1Var.f21280f) {
                AndroidUtilities.dp(20.0f);
            }
        }
        float f7 = 0.0f;
        FrameLayout frameLayout = this.f26791c0;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f7 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            float f10 = -f7;
            frameLayout2.setTranslationY(f10);
            LinearLayout linearLayout = this.f26817x;
            if (linearLayout != null) {
                linearLayout.setTranslationY(f10);
            }
        }
        float f11 = -f7;
        lp0Var.setTranslationY(f11);
        this.f26795f.setTranslationY(f11);
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.j5 j5Var = this.f26810s;
        if (j5Var != null) {
            String O0 = O0();
            if (O0.startsWith("https://")) {
                O0 = O0.substring(8);
            } else if (O0.startsWith("http://")) {
                O0 = O0.substring(7);
            }
            j5Var.k(O0);
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
        Object tag = this.f26790c.getTag();
        mp0 mp0Var = this.d;
        if (tag != null && mp0Var.f26847a.length() > 0) {
            size++;
        }
        long j3 = 0;
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            long j10 = ((TLRPC.Dialog) iVar.n(i11)).f19873id;
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
        ji.x1 x1Var = this.f26793e;
        x1Var.g(max, z10);
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        x1Var.i(size, j3, z11);
        W0(true);
        mp0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), x1Var.l()), 0);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            zp0 zp0Var = this.K;
            if (zp0Var != null) {
                zp0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override
    public final void dismiss() {
        mp0 mp0Var = this.d;
        if (mp0Var != null) {
            AndroidUtilities.hideKeyboard(mp0Var.getEditText());
        }
        this.Y = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        mp0 mp0Var = this.d;
        if (mp0Var != null) {
            mp0Var.o();
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
        mp0 mp0Var = this.d;
        if (mp0Var != null && mp0Var.f26850e) {
            mp0Var.k(true);
        } else {
            super.onBackPressed();
        }
    }

    public hq0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    public hq0(android.content.Context r37, org.telegram.ui.co r38, java.util.ArrayList r39, java.lang.String r40, java.lang.String r41, boolean r42, java.lang.String r43, java.lang.String r44, boolean r45, boolean r46, boolean r47, java.lang.Integer r48, org.telegram.ui.ActionBar.f6 r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hq0.<init>(android.content.Context, org.telegram.ui.co, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.f6):void");
    }

    public void S0(View view) {
    }

    public void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
