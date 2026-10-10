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
public class nr0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f29189a1 = 0;
    public boolean A0;
    public o1.k B0;
    public TLRPC.Dialog C0;
    public final yq0 D0;
    public final rm0 E;
    public ArrayList E0;
    public final pq0 F;
    public TL_stories.StoryItem F0;
    public final pq0 G;
    public i0.b G0;
    public final s4.s H;
    public int H0;
    public final s4.s I;
    public boolean I0;
    public final f00 J;
    public org.telegram.ui.ActionBar.n1 J0;
    public final fr0 K;
    public int K0;
    public final kr0 L;
    public boolean L0;
    public final jr0 M;
    public boolean M0;
    public final ArrayList N;
    public int N0;
    public final String[] O;
    public final ah.h O0;
    public final int P;
    public final fh.d P0;
    public final by0 Q;
    public final fh.d Q0;
    public final Drawable R;
    public final ah.c R0;
    public final View[] S;
    public final ah.c S0;
    public final AnimatorSet[] T;
    public final ah.c T0;
    public final a0.i U;
    public final ah.n U0;
    public final HashMap V;
    public final ch.d V0;
    public final zq0 W;
    public final ah.d W0;
    public int X;
    public final ch.d X0;
    public boolean Y;
    public final ArrayList Y0;
    public final boolean Z;
    public final RectF Z0;
    public boolean f29190a0;
    public final FrameLayout f29191b;
    public final int f29192b0;
    public final rq0 f29193c;
    public final FrameLayout f29194c0;
    public final sq0 d;
    public final LinearLayout f29195d0;
    public final ii.z1 f29196e;
    public final dq f29197e0;
    public final rq0 f29198f;
    public final org.telegram.ui.zn f29199f0;
    public final Activity f29200g0;
    public final FrameLayout h;
    public final boolean f29201h0;
    public boolean f29202i0;
    public final TextPaint f29203j0;
    public TLRPC.TL_exportedMessageLink f29204k0;
    public boolean f29205l0;
    public boolean m0;
    public final ci.bb f29206n;
    public final boolean f29207n0;
    public final String[] f29208o0;
    public int f29209p0;
    public int f29210q0;
    public final FrameLayout f29211r;
    public boolean f29212r0;
    public final org.telegram.ui.ActionBar.j5 f29213s;
    public cr0 f29214s0;
    public float f29215t0;
    public float f29216u0;
    public final FrameLayout v;
    public float f29217v0;
    public final FrameLayout f29218w;
    public ValueAnimator f29219w0;
    public final LinearLayout f29220x;
    public final wl0 f29221x0;
    public AnimatorSet f29222y;
    public final t20 f29223y0;
    public final org.telegram.ui.ActionBar.k f29224z0;

    public nr0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, e6Var);
    }

    public static void B0(nr0 nr0Var) {
        float f7;
        RectF rectF = nr0Var.Z0;
        ah.h hVar = nr0Var.O0;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
            rectF.set(0.0f, 0.0f, nr0Var.containerView.getMeasuredWidth(), nr0Var.containerView.getMeasuredHeight());
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            hVar.g(1, nr0Var.Y0);
            hVar.e(nr0Var.U0, nr0Var.containerView.getMeasuredWidth(), nr0Var.containerView.getMeasuredHeight());
        }
    }

    public static int G0(nr0 nr0Var) {
        pq0 pq0Var = nr0Var.F;
        if (pq0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = pq0Var.getChildAt(0);
            bm0 bm0Var = (bm0) pq0Var.G(childAt);
            if (bm0Var != null) {
                int paddingTop = pq0Var.getPaddingTop();
                if (bm0Var.c() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    public static nr0 O0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        ArrayList arrayList;
        if (messageObject != null) {
            arrayList = org.telegram.messenger.q.k(messageObject);
        } else {
            arrayList = null;
        }
        return new nr0(context, arrayList, str, null, z10, str2, null, false);
    }

    public static void o(nr0 nr0Var, AtomicReference atomicReference, uq0 uq0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        uq0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, nr0Var.currentAccount, Long.valueOf(-dialog.f20046id));
    }

    public static boolean p(final nr0 nr0Var) {
        int measuredHeight;
        org.telegram.ui.zn znVar;
        ii.z1 z1Var = nr0Var.f29196e;
        boolean z10 = nr0Var.f29201h0;
        Activity activity = nr0Var.f29200g0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(nr0Var.getContext());
        linearLayout.setOrientation(1);
        if (nr0Var.N != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, nr0Var.resourcesProvider);
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(nr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20847fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new vq0(nr0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new hq0(nr0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, nr0Var.getContext(), nr0Var.resourcesProvider, true, false);
            if (z10) {
                f1Var.setTextColor(nr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20994ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var, w7.x5.n(-1, 48));
            f1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            nr0Var.I0 = true;
            f1Var.setChecked(true);
            final org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(1, nr0Var.getContext(), nr0Var.resourcesProvider, false, true);
            if (z10) {
                f1Var2.setTextColor(nr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20994ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, w7.x5.n(-1, 48));
            f1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            f1Var2.setChecked(!nr0Var.I0);
            f1Var.setOnClickListener(new View.OnClickListener(nr0Var) {
                public final nr0 f28504b;

                {
                    this.f28504b = nr0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            nr0 nr0Var2 = this.f28504b;
                            nr0Var2.I0 = true;
                            f1Var.setChecked(true);
                            f1Var2.setChecked(!nr0Var2.I0);
                            return;
                        default:
                            nr0 nr0Var3 = this.f28504b;
                            nr0Var3.I0 = false;
                            f1Var.setChecked(false);
                            f1Var2.setChecked(!nr0Var3.I0);
                            return;
                    }
                }
            });
            f1Var2.setOnClickListener(new View.OnClickListener(nr0Var) {
                public final nr0 f28504b;

                {
                    this.f28504b = nr0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            nr0 nr0Var2 = this.f28504b;
                            nr0Var2.I0 = true;
                            f1Var.setChecked(true);
                            f1Var2.setChecked(!nr0Var2.I0);
                            return;
                        default:
                            nr0 nr0Var3 = this.f28504b;
                            nr0Var3.I0 = false;
                            f1Var.setChecked(false);
                            f1Var2.setChecked(!nr0Var3.I0);
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(nr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.x5.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, nr0Var.resourcesProvider);
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20847fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new vq0(nr0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new hq0(nr0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, nr0Var.getContext(), nr0Var.resourcesProvider, true, true);
        if (z10) {
            f1Var3.setTextColor(nr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20994ng));
            f1Var3.setIconColor(nr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.H6));
        }
        f1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        f1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(f1Var3, w7.x5.n(-1, 48));
        f1Var3.setOnClickListener(new gq0(nr0Var, 1));
        org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(0, nr0Var.getContext(), nr0Var.resourcesProvider, true, true);
        if (z10) {
            f1Var4.setTextColor(nr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20994ng));
            f1Var4.setIconColor(nr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.H6));
        }
        f1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        f1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(f1Var4, w7.x5.n(-1, 48));
        f1Var4.setOnClickListener(new gq0(nr0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(nr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.x5.n(-1, -2));
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(linearLayout, -2, -2);
        nr0Var.J0 = n1Var;
        n1Var.f21417b = false;
        n1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        nr0Var.J0.setOutsideTouchable(true);
        nr0Var.J0.setClippingEnabled(true);
        nr0Var.J0.setInputMethodMode(2);
        nr0Var.J0.setSoftInputMode(0);
        nr0Var.J0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        nr0Var.J0.setFocusable(true);
        int[] iArr = new int[2];
        z1Var.getLocationInWindow(iArr);
        if (nr0Var.keyboardVisible && (znVar = nr0Var.f29199f0) != null && znVar.X0.getMeasuredHeight() > AndroidUtilities.dp(58.0f)) {
            measuredHeight = z1Var.getMeasuredHeight() + iArr[1];
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
        }
        nr0Var.J0.showAtLocation(z1Var, 51, AndroidUtilities.dp(8.0f) + ((z1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
        nr0Var.J0.b();
        try {
            z1Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void q(nr0 nr0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
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
        rq0 rq0Var;
        long j12;
        long j13;
        Long l12;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue4;
        String charSequence3;
        long longValue5;
        String[] strArr2 = nr0Var.O;
        sq0 sq0Var = nr0Var.d;
        rq0 rq0Var2 = nr0Var.f29193c;
        HashMap hashMap2 = nr0Var.V;
        Long l13 = 0L;
        a0.i iVar = nr0Var.U;
        ArrayList arrayList3 = nr0Var.N;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i14 = 0;
            boolean z12 = false;
            while (true) {
                if (i14 < iVar.m()) {
                    long j14 = iVar.j(i14);
                    boolean isMonoForum = MessagesController.getInstance(nr0Var.currentAccount).isMonoForum(j14);
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
                        rq0Var = rq0Var2;
                        j12 = j14;
                        j13 = DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    } else {
                        rq0Var = rq0Var2;
                        j12 = j14;
                        j13 = 0;
                    }
                    if (tL_forumTopic3 != null && !isMonoForum) {
                        l12 = l13;
                        messageObject3 = new MessageObject(nr0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    } else {
                        l12 = l13;
                        messageObject3 = null;
                    }
                    if (messageObject3 != null) {
                        messageObject3.isTopicMainMessage = true;
                    }
                    if (rq0Var.getTag() != null && sq0Var.f24637a.length() > 0) {
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
                        SendMessagesHelper.getInstance(nr0Var.currentAccount).sendMessage(of3);
                    } else {
                        messageObject4 = messageObject3;
                        arrayList2 = arrayList3;
                    }
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(nr0Var.currentAccount);
                    ArrayList<MessageObject> arrayList5 = nr0Var.N;
                    boolean z13 = !nr0Var.I0;
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
                        g5.s0(sendMessage, nr0Var.f29199f0, null);
                        if (sendMessage != 0) {
                            break;
                        }
                    }
                    i14++;
                    arrayList3 = arrayList2;
                    rq0Var2 = rq0Var;
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
                nr0Var.S0(iVar, size2, tL_forumTopic2, !z12);
            }
        } else {
            zq0 zq0Var = nr0Var.W;
            if (zq0Var != null) {
                i11 = zq0Var.f28880e;
            } else {
                i11 = 0;
            }
            if (nr0Var.F0 != null) {
                int i16 = 0;
                boolean z14 = false;
                while (i16 < iVar.m()) {
                    long j16 = iVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(nr0Var.currentAccount).isMonoForum(j16);
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
                        messageObject2 = new MessageObject(nr0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                    } else {
                        strArr = strArr2;
                        messageObject2 = null;
                    }
                    if (nr0Var.F0 == null) {
                        if (rq0Var2.getTag() != null && sq0Var.f24637a.length() > 0) {
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
                        if (rq0Var2.getTag() != null && sq0Var.f24637a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(nr0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j16, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = nr0Var.F0;
                    }
                    if (l10 == null) {
                        longValue3 = 0;
                    } else {
                        longValue3 = l10.longValue();
                    }
                    of2.payStars = longValue3;
                    of2.monoForumPeer = j11;
                    SendMessagesHelper.getInstance(nr0Var.currentAccount).sendMessage(of2);
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
                        boolean isMonoForum3 = MessagesController.getInstance(nr0Var.currentAccount).isMonoForum(j17);
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
                            messageObject = new MessageObject(nr0Var.currentAccount, tL_forumTopic5.topicStartMessage, false, false);
                        } else {
                            c10 = 0;
                            messageObject = null;
                        }
                        if (rq0Var2.getTag() != null && sq0Var.f24637a.length() > 0) {
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
                            SendMessagesHelper.getInstance(nr0Var.currentAccount).sendMessage(of4);
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
                        SendMessagesHelper.getInstance(nr0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z15;
                } else {
                    i12 = 0;
                    z11 = false;
                    nr0Var.S0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i12)), !z11);
                }
            }
            i12 = 0;
            nr0Var.S0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i12)), !z11);
        }
        cr0 cr0Var = nr0Var.f29214s0;
        if (cr0Var != null) {
            cr0Var.P();
        }
        nr0Var.dismiss();
    }

    public static void r(nr0 nr0Var, int i10) {
        TLRPC.Dialog dialog;
        ArrayList arrayList;
        ArrayList arrayList2;
        t20 t20Var = nr0Var.f29223y0;
        HashMap hashMap = nr0Var.V;
        a0.i iVar = nr0Var.U;
        fr0 fr0Var = nr0Var.K;
        kr0 kr0Var = nr0Var.L;
        if (kr0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = nr0Var.C0;
            if (dialog2 != null) {
                iVar.k(dialog2, dialog2.f20046id);
                hashMap.remove(dialog2);
                nr0Var.b1(2);
                if (nr0Var.L0 || nr0Var.M0) {
                    if (((TLRPC.Dialog) fr0Var.f26506e.f(dialog2.f20046id)) == null) {
                        fr0Var.f26506e.k(dialog2, dialog2.f20046id);
                        fr0Var.d.add(!arrayList2.isEmpty(), dialog2);
                    }
                    fr0Var.l();
                    nr0Var.A0 = false;
                    t20Var.f30958r.setText("");
                    nr0Var.L0(false);
                }
                for (int i11 = 0; i11 < nr0Var.Q0().getChildCount(); i11++) {
                    View childAt = nr0Var.Q0().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.g7) {
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                        if (g7Var.getCurrentDialog() == nr0Var.C0.f20046id) {
                            g7Var.d(null, false, true);
                            g7Var.b(true, true);
                        }
                    }
                }
                nr0Var.M0();
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic E = kr0Var.E(i10);
        if (E != null && (dialog = nr0Var.C0) != null) {
            long j3 = dialog.f20046id;
            boolean isMonoForum = MessagesController.getInstance(nr0Var.currentAccount).isMonoForum(j3);
            TLRPC.Dialog dialog3 = nr0Var.C0;
            iVar.k(dialog3, j3);
            hashMap.put(dialog3, E);
            nr0Var.b1(2);
            if (nr0Var.L0 || nr0Var.M0) {
                if (((TLRPC.Dialog) fr0Var.f26506e.f(dialog3.f20046id)) == null) {
                    fr0Var.f26506e.k(dialog3, dialog3.f20046id);
                    fr0Var.d.add(!arrayList.isEmpty(), dialog3);
                }
                fr0Var.l();
                nr0Var.A0 = false;
                t20Var.f30958r.setText("");
                nr0Var.L0(false);
            }
            for (int i12 = 0; i12 < nr0Var.Q0().getChildCount(); i12++) {
                View childAt2 = nr0Var.Q0().getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) childAt2;
                    if (g7Var2.getCurrentDialog() == nr0Var.C0.f20046id) {
                        g7Var2.d(E, isMonoForum, true);
                        g7Var2.b(true, true);
                    }
                }
            }
            nr0Var.M0();
        }
    }

    public static void t0(nr0 nr0Var) {
        pq0 pq0Var;
        int i10;
        int i11;
        pq0 pq0Var2 = nr0Var.F;
        pq0 pq0Var3 = nr0Var.G;
        rm0 rm0Var = nr0Var.E;
        if (!nr0Var.f29212r0) {
            if (nr0Var.L0) {
                pq0Var = pq0Var3;
            } else {
                pq0Var = pq0Var2;
            }
            if (pq0Var.getChildCount() > 0) {
                View childAt = pq0Var.getChildAt(0);
                for (int i12 = 0; i12 < pq0Var.getChildCount(); i12++) {
                    if (pq0Var.getChildAt(i12).getTop() < childAt.getTop()) {
                        childAt = pq0Var.getChildAt(i12);
                    }
                }
                bm0 bm0Var = (bm0) pq0Var.G(childAt);
                int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
                if (top > 0 && bm0Var != null && bm0Var.b() == 0) {
                    i10 = top;
                } else {
                    i10 = 0;
                }
                if (top >= 0 && bm0Var != null && bm0Var.b() == 0) {
                    nr0Var.K0 = childAt.getTop();
                    nr0Var.U0(false);
                } else {
                    nr0Var.K0 = Integer.MAX_VALUE;
                    nr0Var.U0(true);
                    top = i10;
                }
                if (rm0Var.getVisibility() == 0) {
                    if (rm0Var.getChildCount() > 0) {
                        View childAt2 = rm0Var.getChildAt(0);
                        for (int i13 = 0; i13 < rm0Var.getChildCount(); i13++) {
                            if (rm0Var.getChildAt(i13).getTop() < childAt2.getTop()) {
                                childAt2 = rm0Var.getChildAt(i13);
                            }
                        }
                        bm0 bm0Var2 = (bm0) rm0Var.G(childAt2);
                        int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
                        if (top2 > 0 && bm0Var2 != null && bm0Var2.b() == 0) {
                            i11 = top2;
                        } else {
                            i11 = 0;
                        }
                        if (top2 >= 0 && bm0Var2 != null && bm0Var2.b() == 0) {
                            nr0Var.K0 = childAt2.getTop();
                            nr0Var.U0(false);
                        } else {
                            nr0Var.K0 = Integer.MAX_VALUE;
                            nr0Var.U0(true);
                            top2 = i11;
                        }
                        top = AndroidUtilities.lerp(top, top2, rm0Var.getAlpha());
                    } else {
                        return;
                    }
                }
                int i14 = nr0Var.f29209p0;
                if (i14 != top) {
                    nr0Var.f29210q0 = i14;
                    float f7 = top;
                    int i15 = (int) (nr0Var.f29215t0 + f7);
                    nr0Var.f29209p0 = i15;
                    pq0Var2.setTopGlowOffset(i15);
                    int i16 = (int) (nr0Var.f29215t0 + f7);
                    nr0Var.f29209p0 = i16;
                    pq0Var3.setTopGlowOffset(i16);
                    int i17 = (int) (f7 + nr0Var.f29215t0);
                    nr0Var.f29209p0 = i17;
                    rm0Var.setTopGlowOffset(i17);
                    nr0Var.f29191b.setTranslationY(nr0Var.f29209p0 + nr0Var.f29215t0);
                    nr0Var.Q.setTranslationY(nr0Var.f29209p0 + nr0Var.f29215t0);
                    nr0Var.containerView.invalidate();
                }
            }
        }
    }

    public final void L0(boolean z10) {
        t20 t20Var = this.f29223y0;
        ci.g2 g2Var = t20Var.f30958r;
        ci.g2 g2Var2 = t20Var.f30958r;
        boolean isEmpty = TextUtils.isEmpty(g2Var.getText());
        pq0 pq0Var = this.F;
        pq0 pq0Var2 = this.G;
        boolean z11 = true;
        if (isEmpty && ((!this.keyboardVisible || !g2Var2.hasFocus()) && !this.M0)) {
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(pq0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(pq0Var2, false);
            }
            z11 = false;
        } else {
            this.A0 = true;
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(pq0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(pq0Var2, true);
            }
        }
        if (this.L0 == z11 && !z10) {
            return;
        }
        this.L0 = z11;
        jr0 jr0Var = this.M;
        jr0Var.l();
        this.K.l();
        if (this.L0) {
            if (this.K0 == Integer.MAX_VALUE) {
                ((s4.d0) pq0Var2.getLayoutManager()).h1(0, -pq0Var2.getPaddingTop());
            } else {
                ((s4.d0) pq0Var2.getLayoutManager()).h1(0, this.K0 - pq0Var2.getPaddingTop());
            }
            jr0Var.E(g2Var2.getText().toString());
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

    public final void M0() {
        float f7;
        TLRPC.Dialog dialog = this.C0;
        if (dialog != null) {
            org.telegram.ui.Cells.g7 g7Var = null;
            this.C0 = null;
            for (int i10 = 0; i10 < Q0().getChildCount(); i10++) {
                View childAt = Q0().getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.g7) && ((org.telegram.ui.Cells.g7) childAt).getCurrentDialog() == dialog.f20046id) {
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
            Q0().setVisibility(0);
            t20 t20Var = this.f29223y0;
            t20Var.setVisibility(0);
            ci.g2 g2Var = t20Var.f30958r;
            if (this.L0 || this.M0) {
                this.D0.H.v = true;
                g2Var.requestFocus();
                AndroidUtilities.showKeyboard(g2Var);
            }
            int[] iArr = new int[2];
            o1.k kVar2 = new o1.k(new o1.j(1000.0f));
            o1.l lVar = new o1.l(0.0f);
            org.telegram.ui.zn znVar = this.f29199f0;
            if (znVar != null && znVar.f44757b) {
                f7 = 10.0f;
            } else {
                f7 = 800.0f;
            }
            lVar.b(f7);
            lVar.a(1.0f);
            kVar2.f16942u = lVar;
            this.B0 = kVar2;
            kVar2.b(new fq0(this, g7Var, iArr, 0));
            this.B0.a(new kb(this, 5));
            this.B0.h();
        }
    }

    public final void N0() {
        boolean z10 = false;
        if (this.f29204k0 != null || this.f29208o0[0] != null) {
            try {
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", P0()));
                cr0 cr0Var = this.f29214s0;
                if (cr0Var != null) {
                    cr0Var.q0();
                } else if (this.f29200g0 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f29204k0;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z10 = true;
                    }
                    ((LaunchActivity) this.f29200g0).D0(new i2.y(5, z10));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final String P0() {
        String str;
        String str2;
        String[] strArr = this.f29208o0;
        zq0 zq0Var = this.W;
        if (zq0Var != null) {
            str2 = strArr[zq0Var.f28880e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f29204k0;
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
        dq dqVar = this.f29197e0;
        if (dqVar != null && dqVar.f25781a.f24101q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.f29192b0)).build().toString();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final rm0 Q0() {
        if (!this.L0 && !this.M0) {
            return this.F;
        }
        return this.G;
    }

    public final void R0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        rm0 rm0Var = this.E;
        rm0Var.setPivotX(width);
        rm0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        rm0Var.setScaleX(f11);
        rm0Var.setScaleY(f11);
        rm0Var.setAlpha(f7);
        rm0 Q0 = Q0();
        Q0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        Q0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        Q0.setScaleX(f12);
        Q0.setScaleY(f12);
        float f13 = 1.0f - f7;
        Q0.setAlpha(f13);
        t20 t20Var = this.f29223y0;
        t20Var.setPivotX(t20Var.getWidth() / 2.0f);
        t20Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        t20Var.setScaleX(f14);
        t20Var.setScaleY(f14);
        t20Var.setAlpha(f13);
        org.telegram.ui.ActionBar.k kVar = this.f29224z0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.setAlpha(f7);
        rm0Var.getLocationInWindow(iArr);
        float interpolation = is.f27444g.getInterpolation(f7);
        for (int i10 = 0; i10 < Q0.getChildCount(); i10++) {
            View childAt = Q0.getChildAt(i10);
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
        for (int i11 = 0; i11 < rm0Var.getChildCount(); i11++) {
            View childAt2 = rm0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.h7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y3 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((rm0Var.getTranslationY() + y3) - view.getY()))));
            }
        }
        this.containerView.requestLayout();
        Q0.invalidate();
    }

    public final void U0(boolean z10) {
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
            animatorSetArr[0].addListener(new wq0(this, z10, 0));
            animatorSetArr[0].start();
        }
    }

    public final void V0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        nr0 nr0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        ir0 ir0Var;
        if (dialog instanceof er0) {
            T0(view);
        } else if (((view instanceof org.telegram.ui.Cells.g7) && ((org.telegram.ui.Cells.g7) view).F) || ((view instanceof org.telegram.ui.Cells.i6) && ((org.telegram.ui.Cells.i6) view).f22261n0)) {
            Y0(dialog.f20046id, view);
        } else {
            rm0 rm0Var = this.E;
            if (rm0Var.getVisibility() == 8 && (activity = this.f29200g0) != null) {
                boolean isChatDialog = DialogObject.isChatDialog(dialog.f20046id);
                int i10 = this.P;
                if (isChatDialog) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f20046id));
                    if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.f20046id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        String string = LocaleController.getString(R.string.SendMessageTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
                        b2Var.R = string;
                        if (i10 == 3) {
                            if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                            } else {
                                b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                            }
                        } else if (i10 == 2) {
                            if (this.f29207n0) {
                                b2Var.T = LocaleController.getString(R.string.PublicPollCantForward);
                            } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                            } else {
                                b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                            }
                        } else {
                            b2Var.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        hg.c.p(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                } else if (DialogObject.isEncryptedDialog(dialog.f20046id) && i10 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String string2 = LocaleController.getString(R.string.SendMessageTitle);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20378a;
                    b2Var2.R = string2;
                    if (i10 == 3) {
                        b2Var2.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i10 != 0) {
                        b2Var2.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        b2Var2.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    hg.c.p(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
                long j3 = dialog.f20046id;
                a0.i iVar = this.U;
                if (iVar.h(j3) >= 0) {
                    iVar.l(dialog.f20046id);
                    this.V.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.i6) {
                        ((org.telegram.ui.Cells.i6) view).t(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).b(false, true);
                    }
                    b1(1);
                    nr0Var = this;
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.f20046id));
                    TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f20046id));
                    if ((!UserObject.isBotForum(user) || (((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f20189id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f20189id))) && (!DialogObject.isChatDialog(dialog.f20046id) || (!ChatObject.isForum(chat2) && (!ChatObject.isMonoForum(chat2) || !ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                        nr0Var = this;
                        iVar.k(dialog, dialog.f20046id);
                        if (view instanceof org.telegram.ui.Cells.i6) {
                            ((org.telegram.ui.Cells.i6) view).t(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.g7) {
                            ((org.telegram.ui.Cells.g7) view).b(true, true);
                        }
                        b1(2);
                        long j10 = UserConfig.getInstance(nr0Var.currentAccount).clientUserId;
                        if (nr0Var.L0) {
                            fr0 fr0Var = nr0Var.K;
                            a0.i iVar2 = fr0Var.f26506e;
                            ArrayList arrayList = fr0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) iVar2.f(dialog.f20046id);
                            if (dialog2 == null) {
                                fr0Var.f26506e.k(dialog, dialog.f20046id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f20046id != j10) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            fr0Var.l();
                            nr0Var.A0 = false;
                            t20 t20Var = nr0Var.f29223y0;
                            t20Var.f30958r.setText("");
                            L0(false);
                            AndroidUtilities.hideKeyboard(t20Var.f30958r);
                        }
                    } else {
                        this.C0 = dialog;
                        this.I.h1(0, this.f29209p0 - rm0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        uq0 uq0Var = new uq0(this, dialog, atomicReference, view);
                        atomicReference.set(new po0(this, atomicReference, uq0Var, dialog, 2));
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                        int i11 = NotificationCenter.topicsDidLoaded;
                        notificationCenter.addObserver(uq0Var, i11);
                        if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.f20046id) != null) {
                            uq0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.f20046id));
                            return;
                        }
                        MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.f20046id);
                        AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                jr0 jr0Var = nr0Var.M;
                if (jr0Var != null && (ir0Var = jr0Var.H) != null) {
                    ir0Var.q(0, ir0Var.h());
                }
            }
        }
    }

    public final void W0(final boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            a0.i iVar = this.U;
            int m10 = iVar.m();
            rq0 rq0Var = this.f29193c;
            sq0 sq0Var = this.d;
            boolean z11 = true;
            if (i14 < m10) {
                long j3 = iVar.j(i14);
                if (g5.g(getContext(), this.currentAccount, j3, (rq0Var.getTag() == null || sq0Var.f24637a.length() <= 0) ? false : false)) {
                    return;
                }
                i14++;
            } else {
                Editable text = sq0Var.getText();
                vu vuVar = sq0Var.f24637a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                dq dqVar = this.f29197e0;
                if (dqVar != null && dqVar.f25781a.f24101q) {
                    i10 = this.f29192b0;
                } else {
                    i10 = -1;
                }
                ArrayList arrayList = new ArrayList();
                if (this.N != null) {
                    i12 = 0;
                    while (i13 < iVar.m()) {
                        long j10 = iVar.j(i13);
                        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j10);
                        if (sendPaidMessagesStars <= 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j10));
                        }
                        if (rq0Var.getTag() != null && vuVar.length() > 0 && sendPaidMessagesStars > 0) {
                            i12++;
                        }
                        int i15 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
                        if (i15 > 0) {
                            i12++;
                        }
                        if (i15 > 0 && !arrayList.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                        }
                        i13++;
                    }
                } else {
                    zq0 zq0Var = this.W;
                    if (zq0Var != null) {
                        i11 = zq0Var.f28880e;
                    } else {
                        i11 = 0;
                    }
                    if (this.F0 != null) {
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < iVar.m()) {
                            long j11 = iVar.j(i16);
                            long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
                            if (sendPaidMessagesStars2 <= 0) {
                                sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
                            }
                            int i18 = i13;
                            if (this.F0 != null && rq0Var.getTag() != null && vuVar.length() > 0 && charSequenceArr[i18] != null && sendPaidMessagesStars2 > 0) {
                                i17++;
                            }
                            int i19 = (sendPaidMessagesStars2 > 0L ? 1 : (sendPaidMessagesStars2 == 0L ? 0 : -1));
                            if (i19 > 0) {
                                i17++;
                            }
                            if (i19 > 0 && !arrayList.contains(Long.valueOf(j11))) {
                                arrayList.add(Long.valueOf(j11));
                            }
                            i16++;
                            i13 = i18;
                        }
                        i12 = i17;
                    } else {
                        int i20 = 0;
                        if (this.O[i11] != null) {
                            for (int i21 = 0; i21 < iVar.m(); i21++) {
                                long j12 = iVar.j(i21);
                                long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j12);
                                if (sendPaidMessagesStars3 <= 0) {
                                    sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j12));
                                }
                                if (rq0Var.getTag() != null && vuVar.length() > 0 && sendPaidMessagesStars3 > 0) {
                                    i20++;
                                }
                                int i22 = (sendPaidMessagesStars3 > 0L ? 1 : (sendPaidMessagesStars3 == 0L ? 0 : -1));
                                if (i22 > 0) {
                                    i20++;
                                }
                                if (i22 > 0 && !arrayList.contains(Long.valueOf(j12))) {
                                    arrayList.add(Long.valueOf(j12));
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
                        nr0.q(nr0.this, charSequenceArr, entities, z10, i23, (HashMap) obj);
                    }
                });
                return;
            }
        }
    }

    public final void X0(boolean z10) {
        boolean z11;
        Integer num;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        rq0 rq0Var = this.f29193c;
        if (rq0Var.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.f29222y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        rq0Var.setTag(num);
        sq0 sq0Var = this.d;
        if (sq0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(sq0Var.getEditText());
        }
        sq0Var.k(true);
        FrameLayout frameLayout = this.f29194c0;
        rq0 rq0Var2 = this.f29198f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            rq0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            rq0Var2.setVisibility(0);
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
            WeakHashMap weakHashMap = r0.i0.f46810a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.f29220x;
        if (linearLayout != null) {
            if (!z10) {
                i11 = 1;
            }
            WeakHashMap weakHashMap2 = r0.i0.f46810a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.f29222y = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f14 = 0.0f;
        float f15 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(rq0Var, property, f7));
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
        arrayList.add(ObjectAnimator.ofFloat(rq0Var2, property2, f10));
        Property property3 = View.SCALE_Y;
        if (z10) {
            f16 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(rq0Var2, property3, f16));
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(rq0Var2, property, f11));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.S[1];
            if (!z10) {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
        }
        FrameLayout frameLayout3 = this.f29211r;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.f29201h0 && z10) {
                if (this.f29195d0 != null) {
                    f12 = 5.0f;
                } else {
                    f12 = 16.0f;
                }
                f14 = AndroidUtilities.dp(f12);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, f14));
        }
        this.f29222y.playTogether(arrayList);
        this.f29222y.setInterpolator(new DecelerateInterpolator());
        this.f29222y.setDuration(180L);
        this.f29222y.addListener(new wq0(this, z10, 1));
        this.f29222y.start();
    }

    public final void Y0(long j3, View view) {
        String str;
        tc J;
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
            J = new ad(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = new ad(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new iq0(this, 1));
        }
        J.j();
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.p1 p1Var;
        rq0 rq0Var = this.f29193c;
        if (rq0Var == null) {
            return;
        }
        sq0 sq0Var = this.d;
        if (sq0Var != null && sq0Var.m()) {
            sq0Var.getEmojiPaddingShown();
        } else {
            yq0 yq0Var = this.D0;
            if (yq0Var != null && (p1Var = yq0Var.H) != null && !p1Var.f21464f) {
                AndroidUtilities.dp(20.0f);
            }
        }
        float f7 = 0.0f;
        FrameLayout frameLayout = this.f29194c0;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f7 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            float f10 = -f7;
            frameLayout2.setTranslationY(f10);
            LinearLayout linearLayout = this.f29220x;
            if (linearLayout != null) {
                linearLayout.setTranslationY(f10);
            }
        }
        float f11 = -f7;
        rq0Var.setTranslationY(f11);
        this.f29198f.setTranslationY(f11);
    }

    public final void a1() {
        org.telegram.ui.ActionBar.j5 j5Var = this.f29213s;
        if (j5Var != null) {
            String P0 = P0();
            if (P0.startsWith("https://")) {
                P0 = P0.substring(8);
            } else if (P0.startsWith("http://")) {
                P0 = P0.substring(7);
            }
            j5Var.k(P0);
        }
    }

    public final void b1(int i10) {
        int size;
        boolean z10;
        boolean z11;
        a0.i iVar = this.U;
        if (iVar.m() == 0) {
            X0(false);
            return;
        }
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        Object tag = this.f29193c.getTag();
        sq0 sq0Var = this.d;
        if (tag != null && sq0Var.f24637a.length() > 0) {
            size++;
        }
        long j3 = 0;
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            long j10 = ((TLRPC.Dialog) iVar.n(i11)).f20046id;
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
        ii.z1 z1Var = this.f29196e;
        z1Var.g(max, z10);
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        z1Var.i(size, j3, z11);
        X0(true);
        sq0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), z1Var.l()), 0);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            fr0 fr0Var = this.K;
            if (fr0Var != null) {
                fr0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override
    public final void dismiss() {
        sq0 sq0Var = this.d;
        if (sq0Var != null) {
            AndroidUtilities.hideKeyboard(sq0Var.getEditText());
        }
        this.Y = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        sq0 sq0Var = this.d;
        if (sq0Var != null) {
            sq0Var.o();
        }
    }

    @Override
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.X;
    }

    @Override
    public final void onBackPressed() {
        if (this.C0 != null) {
            M0();
            return;
        }
        sq0 sq0Var = this.d;
        if (sq0Var != null && sq0Var.f24640e) {
            sq0Var.k(true);
        } else {
            super.onBackPressed();
        }
    }

    public nr0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    public nr0(android.content.Context r36, org.telegram.ui.zn r37, java.util.ArrayList r38, java.lang.String r39, java.lang.String r40, boolean r41, java.lang.String r42, java.lang.String r43, boolean r44, boolean r45, boolean r46, java.lang.Integer r47, org.telegram.ui.ActionBar.e6 r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nr0.<init>(android.content.Context, org.telegram.ui.zn, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.e6):void");
    }

    public void T0(View view) {
    }

    public void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
