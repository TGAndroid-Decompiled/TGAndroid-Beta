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
public class jr0 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f26456a1 = 0;
    public boolean A0;
    public o1.k B0;
    public TLRPC.Dialog C0;
    public final uq0 D0;
    public final mm0 E;
    public ArrayList E0;
    public final lq0 F;
    public TL_stories.StoryItem F0;
    public final lq0 G;
    public i0.b G0;
    public final s4.s H;
    public int H0;
    public final s4.s I;
    public boolean I0;
    public final a00 J;
    public org.telegram.ui.ActionBar.m1 J0;
    public final br0 K;
    public int K0;
    public final gr0 L;
    public boolean L0;
    public final fr0 M;
    public boolean M0;
    public final ArrayList N;
    public int N0;
    public final String[] O;
    public final bh.f O0;
    public final int P;
    public final gh.d P0;
    public final wx0 Q;
    public final gh.d Q0;
    public final Drawable R;
    public final bh.b R0;
    public final View[] S;
    public final bh.b S0;
    public final AnimatorSet[] T;
    public final bh.b T0;
    public final a0.h U;
    public final bh.l U0;
    public final HashMap V;
    public final dh.d V0;
    public final vq0 W;
    public final bh.c W0;
    public int X;
    public final dh.d X0;
    public boolean Y;
    public final ArrayList Y0;
    public final boolean Z;
    public final RectF Z0;
    public boolean f26457a0;
    public final FrameLayout f26458b;
    public final int f26459b0;
    public final nq0 f26460c;
    public final FrameLayout f26461c0;
    public final oq0 d;
    public final LinearLayout f26462d0;
    public final ji.y1 e;
    public final aq f26463e0;
    public final nq0 f26464f;
    public final org.telegram.ui.fo f26465f0;
    public final Activity f26466g0;
    public final FrameLayout h;
    public final boolean f26467h0;
    public boolean f26468i0;
    public final TextPaint f26469j0;
    public TLRPC.TL_exportedMessageLink f26470k0;
    public boolean f26471l0;
    public boolean m0;
    public final di.ab f26472n;
    public final boolean f26473n0;
    public final String[] f26474o0;
    public int f26475p0;
    public int f26476q0;
    public final FrameLayout f26477r;
    public boolean f26478r0;
    public final org.telegram.ui.ActionBar.h5 f26479s;
    public yq0 f26480s0;
    public float f26481t0;
    public float f26482u0;
    public final FrameLayout v;
    public float f26483v0;
    public final FrameLayout f26484w;
    public ValueAnimator f26485w0;
    public final LinearLayout f26486x;
    public final rl0 f26487x0;
    public AnimatorSet f26488y;
    public final o20 f26489y0;
    public final org.telegram.ui.ActionBar.k f26490z0;

    public jr0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, c6Var);
    }

    public static void B0(jr0 jr0Var) {
        float f7;
        RectF rectF = jr0Var.Z0;
        bh.f fVar = jr0Var.O0;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            rectF.set(0.0f, 0.0f, jr0Var.containerView.getMeasuredWidth(), jr0Var.containerView.getMeasuredHeight());
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            fVar.g(1, jr0Var.Y0);
            fVar.e(jr0Var.U0, jr0Var.containerView.getMeasuredWidth(), jr0Var.containerView.getMeasuredHeight());
        }
    }

    public static int G0(jr0 jr0Var) {
        lq0 lq0Var = jr0Var.F;
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

    public static jr0 O0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        ArrayList arrayList;
        if (messageObject != null) {
            arrayList = org.telegram.messenger.q.l(messageObject);
        } else {
            arrayList = null;
        }
        return new jr0(context, arrayList, str, null, z10, str2, null, false);
    }

    public static void n(jr0 jr0Var, AtomicReference atomicReference, qq0 qq0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        qq0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, jr0Var.currentAccount, Long.valueOf(-dialog.f19220id));
    }

    public static boolean o(final jr0 jr0Var) {
        int measuredHeight;
        org.telegram.ui.fo foVar;
        ji.y1 y1Var = jr0Var.e;
        boolean z10 = jr0Var.f26467h0;
        Activity activity = jr0Var.f26466g0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(jr0Var.getContext());
        linearLayout.setOrientation(1);
        if (jr0Var.N != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, jr0Var.resourcesProvider);
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(jr0Var.getThemedColor(org.telegram.ui.ActionBar.g6.fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new rq0(jr0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new cq0(jr0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, jr0Var.getContext(), jr0Var.resourcesProvider, true, false);
            if (z10) {
                e1Var.setTextColor(jr0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20094ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.a6.n(-1, 48));
            e1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            jr0Var.I0 = true;
            e1Var.setChecked(true);
            final org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(1, jr0Var.getContext(), jr0Var.resourcesProvider, false, true);
            if (z10) {
                e1Var2.setTextColor(jr0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20094ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.a6.n(-1, 48));
            e1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            e1Var2.setChecked(!jr0Var.I0);
            e1Var.setOnClickListener(new View.OnClickListener(jr0Var) {
                public final jr0 f25729b;

                {
                    this.f25729b = jr0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            jr0 jr0Var2 = this.f25729b;
                            jr0Var2.I0 = true;
                            e1Var.setChecked(true);
                            e1Var2.setChecked(!jr0Var2.I0);
                            return;
                        default:
                            jr0 jr0Var3 = this.f25729b;
                            jr0Var3.I0 = false;
                            e1Var.setChecked(false);
                            e1Var2.setChecked(!jr0Var3.I0);
                            return;
                    }
                }
            });
            e1Var2.setOnClickListener(new View.OnClickListener(jr0Var) {
                public final jr0 f25729b;

                {
                    this.f25729b = jr0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            jr0 jr0Var2 = this.f25729b;
                            jr0Var2.I0 = true;
                            e1Var.setChecked(true);
                            e1Var2.setChecked(!jr0Var2.I0);
                            return;
                        default:
                            jr0 jr0Var3 = this.f25729b;
                            jr0Var3.I0 = false;
                            e1Var.setChecked(false);
                            e1Var2.setChecked(!jr0Var3.I0);
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(jr0Var.getThemedColor(org.telegram.ui.ActionBar.g6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.a6.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, jr0Var.resourcesProvider);
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new rq0(jr0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new cq0(jr0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, jr0Var.getContext(), jr0Var.resourcesProvider, true, true);
        if (z10) {
            e1Var3.setTextColor(jr0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20094ng));
            e1Var3.setIconColor(jr0Var.getThemedColor(org.telegram.ui.ActionBar.g6.H6));
        }
        e1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        e1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(e1Var3, w7.a6.n(-1, 48));
        e1Var3.setOnClickListener(new bq0(jr0Var, 1));
        org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(0, jr0Var.getContext(), jr0Var.resourcesProvider, true, true);
        if (z10) {
            e1Var4.setTextColor(jr0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20094ng));
            e1Var4.setIconColor(jr0Var.getThemedColor(org.telegram.ui.ActionBar.g6.H6));
        }
        e1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        e1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(e1Var4, w7.a6.n(-1, 48));
        e1Var4.setOnClickListener(new bq0(jr0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(jr0Var.getThemedColor(org.telegram.ui.ActionBar.g6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.a6.n(-1, -2));
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        jr0Var.J0 = m1Var;
        m1Var.f20520b = false;
        m1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        jr0Var.J0.setOutsideTouchable(true);
        jr0Var.J0.setClippingEnabled(true);
        jr0Var.J0.setInputMethodMode(2);
        jr0Var.J0.setSoftInputMode(0);
        jr0Var.J0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        jr0Var.J0.setFocusable(true);
        int[] iArr = new int[2];
        y1Var.getLocationInWindow(iArr);
        if (jr0Var.keyboardVisible && (foVar = jr0Var.f26465f0) != null && foVar.X0.getMeasuredHeight() > AndroidUtilities.dp(58.0f)) {
            measuredHeight = y1Var.getMeasuredHeight() + iArr[1];
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
        }
        jr0Var.J0.showAtLocation(y1Var, 51, AndroidUtilities.dp(8.0f) + ((y1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
        jr0Var.J0.b();
        try {
            y1Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void q(jr0 jr0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
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
        nq0 nq0Var;
        long j13;
        long j14;
        Long l12;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue4;
        String charSequence3;
        long longValue5;
        String[] strArr2 = jr0Var.O;
        oq0 oq0Var = jr0Var.d;
        nq0 nq0Var2 = jr0Var.f26460c;
        HashMap hashMap2 = jr0Var.V;
        Long l13 = 0L;
        a0.h hVar = jr0Var.U;
        ArrayList arrayList3 = jr0Var.N;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i14 = 0;
            boolean z12 = false;
            while (true) {
                if (i14 < hVar.m()) {
                    long j15 = hVar.j(i14);
                    boolean isMonoForum = MessagesController.getInstance(jr0Var.currentAccount).isMonoForum(j15);
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
                        nq0Var = nq0Var2;
                        j13 = j15;
                        j14 = DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    } else {
                        nq0Var = nq0Var2;
                        j13 = j15;
                        j14 = 0;
                    }
                    if (tL_forumTopic3 != null && !isMonoForum) {
                        l12 = l13;
                        messageObject3 = new MessageObject(jr0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    } else {
                        l12 = l13;
                        messageObject3 = null;
                    }
                    if (messageObject3 != null) {
                        messageObject3.isTopicMainMessage = true;
                    }
                    if (nq0Var.getTag() != null && oq0Var.f30649a.length() > 0) {
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
                        SendMessagesHelper.getInstance(jr0Var.currentAccount).sendMessage(of3);
                    } else {
                        messageObject4 = messageObject3;
                        arrayList2 = arrayList3;
                    }
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(jr0Var.currentAccount);
                    ArrayList<MessageObject> arrayList5 = jr0Var.N;
                    boolean z13 = !jr0Var.I0;
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
                        g5.s0(sendMessage, jr0Var.f26465f0, null);
                        if (sendMessage != 0) {
                            break;
                        }
                    }
                    i14++;
                    arrayList3 = arrayList2;
                    nq0Var2 = nq0Var;
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
                jr0Var.S0(hVar, size2, tL_forumTopic2, !z12);
            }
        } else {
            vq0 vq0Var = jr0Var.W;
            if (vq0Var != null) {
                i11 = vq0Var.e;
            } else {
                i11 = 0;
            }
            if (jr0Var.F0 != null) {
                int i16 = 0;
                boolean z14 = false;
                while (i16 < hVar.m()) {
                    long j17 = hVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(jr0Var.currentAccount).isMonoForum(j17);
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
                        messageObject2 = new MessageObject(jr0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                    } else {
                        strArr = strArr2;
                        messageObject2 = null;
                    }
                    if (jr0Var.F0 == null) {
                        if (nq0Var2.getTag() != null && oq0Var.f30649a.length() > 0) {
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
                        if (nq0Var2.getTag() != null && oq0Var.f30649a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(jr0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j17, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j17, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = jr0Var.F0;
                    }
                    if (l10 == null) {
                        longValue3 = 0;
                    } else {
                        longValue3 = l10.longValue();
                    }
                    of2.payStars = longValue3;
                    of2.monoForumPeer = j12;
                    SendMessagesHelper.getInstance(jr0Var.currentAccount).sendMessage(of2);
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
                        boolean isMonoForum3 = MessagesController.getInstance(jr0Var.currentAccount).isMonoForum(j18);
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
                            messageObject = new MessageObject(jr0Var.currentAccount, tL_forumTopic5.topicStartMessage, false, false);
                        } else {
                            c10 = 0;
                            messageObject = null;
                        }
                        if (nq0Var2.getTag() != null && oq0Var.f30649a.length() > 0) {
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
                            SendMessagesHelper.getInstance(jr0Var.currentAccount).sendMessage(of4);
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
                        SendMessagesHelper.getInstance(jr0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z15;
                } else {
                    i12 = 0;
                    z11 = false;
                    jr0Var.S0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i12)), !z11);
                }
            }
            i12 = 0;
            jr0Var.S0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i12)), !z11);
        }
        yq0 yq0Var = jr0Var.f26480s0;
        if (yq0Var != null) {
            yq0Var.U();
        }
        jr0Var.dismiss();
    }

    public static void r(jr0 jr0Var, int i10) {
        TLRPC.Dialog dialog;
        ArrayList arrayList;
        ArrayList arrayList2;
        o20 o20Var = jr0Var.f26489y0;
        HashMap hashMap = jr0Var.V;
        a0.h hVar = jr0Var.U;
        br0 br0Var = jr0Var.K;
        gr0 gr0Var = jr0Var.L;
        if (gr0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = jr0Var.C0;
            if (dialog2 != null) {
                hVar.k(dialog2, dialog2.f19220id);
                hashMap.remove(dialog2);
                jr0Var.b1(2);
                if (jr0Var.L0 || jr0Var.M0) {
                    if (((TLRPC.Dialog) br0Var.e.f(dialog2.f19220id)) == null) {
                        br0Var.e.k(dialog2, dialog2.f19220id);
                        br0Var.d.add(!arrayList2.isEmpty(), dialog2);
                    }
                    br0Var.l();
                    jr0Var.A0 = false;
                    o20Var.f27815r.setText("");
                    jr0Var.L0(false);
                }
                for (int i11 = 0; i11 < jr0Var.Q0().getChildCount(); i11++) {
                    View childAt = jr0Var.Q0().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.g7) {
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                        if (g7Var.getCurrentDialog() == jr0Var.C0.f19220id) {
                            g7Var.d(null, false, true);
                            g7Var.b(true, true);
                        }
                    }
                }
                jr0Var.M0();
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic E = gr0Var.E(i10);
        if (E != null && (dialog = jr0Var.C0) != null) {
            long j10 = dialog.f19220id;
            boolean isMonoForum = MessagesController.getInstance(jr0Var.currentAccount).isMonoForum(j10);
            TLRPC.Dialog dialog3 = jr0Var.C0;
            hVar.k(dialog3, j10);
            hashMap.put(dialog3, E);
            jr0Var.b1(2);
            if (jr0Var.L0 || jr0Var.M0) {
                if (((TLRPC.Dialog) br0Var.e.f(dialog3.f19220id)) == null) {
                    br0Var.e.k(dialog3, dialog3.f19220id);
                    br0Var.d.add(!arrayList.isEmpty(), dialog3);
                }
                br0Var.l();
                jr0Var.A0 = false;
                o20Var.f27815r.setText("");
                jr0Var.L0(false);
            }
            for (int i12 = 0; i12 < jr0Var.Q0().getChildCount(); i12++) {
                View childAt2 = jr0Var.Q0().getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) childAt2;
                    if (g7Var2.getCurrentDialog() == jr0Var.C0.f19220id) {
                        g7Var2.d(E, isMonoForum, true);
                        g7Var2.b(true, true);
                    }
                }
            }
            jr0Var.M0();
        }
    }

    public static void t0(jr0 jr0Var) {
        lq0 lq0Var;
        int i10;
        int i11;
        lq0 lq0Var2 = jr0Var.F;
        lq0 lq0Var3 = jr0Var.G;
        mm0 mm0Var = jr0Var.E;
        if (!jr0Var.f26478r0) {
            if (jr0Var.L0) {
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
                    jr0Var.K0 = childAt.getTop();
                    jr0Var.U0(false);
                } else {
                    jr0Var.K0 = Integer.MAX_VALUE;
                    jr0Var.U0(true);
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
                            jr0Var.K0 = childAt2.getTop();
                            jr0Var.U0(false);
                        } else {
                            jr0Var.K0 = Integer.MAX_VALUE;
                            jr0Var.U0(true);
                            top2 = i11;
                        }
                        top = AndroidUtilities.lerp(top, top2, mm0Var.getAlpha());
                    } else {
                        return;
                    }
                }
                int i14 = jr0Var.f26475p0;
                if (i14 != top) {
                    jr0Var.f26476q0 = i14;
                    float f7 = top;
                    int i15 = (int) (jr0Var.f26481t0 + f7);
                    jr0Var.f26475p0 = i15;
                    lq0Var2.setTopGlowOffset(i15);
                    int i16 = (int) (jr0Var.f26481t0 + f7);
                    jr0Var.f26475p0 = i16;
                    lq0Var3.setTopGlowOffset(i16);
                    int i17 = (int) (f7 + jr0Var.f26481t0);
                    jr0Var.f26475p0 = i17;
                    mm0Var.setTopGlowOffset(i17);
                    jr0Var.f26458b.setTranslationY(jr0Var.f26475p0 + jr0Var.f26481t0);
                    jr0Var.Q.setTranslationY(jr0Var.f26475p0 + jr0Var.f26481t0);
                    jr0Var.containerView.invalidate();
                }
            }
        }
    }

    public final void L0(boolean z10) {
        o20 o20Var = this.f26489y0;
        di.g2 g2Var = o20Var.f27815r;
        di.g2 g2Var2 = o20Var.f27815r;
        boolean isEmpty = TextUtils.isEmpty(g2Var.getText());
        lq0 lq0Var = this.F;
        lq0 lq0Var2 = this.G;
        boolean z11 = true;
        if (isEmpty && ((!this.keyboardVisible || !g2Var2.hasFocus()) && !this.M0)) {
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(lq0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(lq0Var2, false);
            }
            z11 = false;
        } else {
            this.A0 = true;
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(lq0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(lq0Var2, true);
            }
        }
        if (this.L0 == z11 && !z10) {
            return;
        }
        this.L0 = z11;
        fr0 fr0Var = this.M;
        fr0Var.l();
        this.K.l();
        if (this.L0) {
            if (this.K0 == Integer.MAX_VALUE) {
                ((s4.b0) lq0Var2.getLayoutManager()).h1(0, -lq0Var2.getPaddingTop());
            } else {
                ((s4.b0) lq0Var2.getLayoutManager()).h1(0, this.K0 - lq0Var2.getPaddingTop());
            }
            fr0Var.E(g2Var2.getText().toString());
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
                if ((childAt instanceof org.telegram.ui.Cells.g7) && ((org.telegram.ui.Cells.g7) childAt).getCurrentDialog() == dialog.f19220id) {
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
            o20 o20Var = this.f26489y0;
            o20Var.setVisibility(0);
            di.g2 g2Var = o20Var.f27815r;
            if (this.L0 || this.M0) {
                this.D0.H.v = true;
                g2Var.requestFocus();
                AndroidUtilities.showKeyboard(g2Var);
            }
            int[] iArr = new int[2];
            o1.k kVar2 = new o1.k(new o1.j(1000.0f));
            o1.l lVar = new o1.l(0.0f);
            org.telegram.ui.fo foVar = this.f26465f0;
            if (foVar != null && foVar.f35883b) {
                f7 = 10.0f;
            } else {
                f7 = 800.0f;
            }
            lVar.b(f7);
            lVar.a(1.0f);
            kVar2.f16468u = lVar;
            this.B0 = kVar2;
            kVar2.b(new aq0(this, g7Var, iArr, 0));
            this.B0.a(new jb(this, 5));
            this.B0.h();
        }
    }

    public final void N0() {
        boolean z10 = false;
        if (this.f26470k0 != null || this.f26474o0[0] != null) {
            try {
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", P0()));
                yq0 yq0Var = this.f26480s0;
                if (yq0Var != null) {
                    yq0Var.s0();
                } else if (this.f26466g0 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f26470k0;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z10 = true;
                    }
                    ((LaunchActivity) this.f26466g0).D0(new i2.x(5, z10));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final String P0() {
        String str;
        String str2;
        String[] strArr = this.f26474o0;
        vq0 vq0Var = this.W;
        if (vq0Var != null) {
            str2 = strArr[vq0Var.e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f26470k0;
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
        aq aqVar = this.f26463e0;
        if (aqVar != null && aqVar.f23604a.f23092q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.f26459b0)).build().toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final mm0 Q0() {
        if (!this.L0 && !this.M0) {
            return this.F;
        }
        return this.G;
    }

    public final void R0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        mm0 mm0Var = this.E;
        mm0Var.setPivotX(width);
        mm0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        mm0Var.setScaleX(f11);
        mm0Var.setScaleY(f11);
        mm0Var.setAlpha(f7);
        mm0 Q0 = Q0();
        Q0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        Q0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        Q0.setScaleX(f12);
        Q0.setScaleY(f12);
        float f13 = 1.0f - f7;
        Q0.setAlpha(f13);
        o20 o20Var = this.f26489y0;
        o20Var.setPivotX(o20Var.getWidth() / 2.0f);
        o20Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        o20Var.setScaleX(f14);
        o20Var.setScaleY(f14);
        o20Var.setAlpha(f13);
        org.telegram.ui.ActionBar.k kVar = this.f26490z0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.setAlpha(f7);
        mm0Var.getLocationInWindow(iArr);
        float interpolation = es.f24772g.getInterpolation(f7);
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
            animatorSetArr[0].addListener(new sq0(this, z10, 0));
            animatorSetArr[0].start();
        }
    }

    public final void V0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        jr0 jr0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        er0 er0Var;
        if (dialog instanceof ar0) {
            T0(view);
        } else if (((view instanceof org.telegram.ui.Cells.g7) && ((org.telegram.ui.Cells.g7) view).F) || ((view instanceof org.telegram.ui.Cells.i6) && ((org.telegram.ui.Cells.i6) view).f21329n0)) {
            Y0(dialog.f19220id, view);
        } else {
            mm0 mm0Var = this.E;
            if (mm0Var.getVisibility() == 8 && (activity = this.f26466g0) != null) {
                boolean isChatDialog = DialogObject.isChatDialog(dialog.f19220id);
                int i10 = this.P;
                if (isChatDialog) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f19220id));
                    if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.f19220id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        String string = LocaleController.getString(R.string.SendMessageTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                        a2Var.R = string;
                        if (i10 == 3) {
                            if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                a2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                            } else {
                                a2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                            }
                        } else if (i10 == 2) {
                            if (this.f26473n0) {
                                a2Var.T = LocaleController.getString(R.string.PublicPollCantForward);
                            } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                a2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                            } else {
                                a2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                            }
                        } else {
                            a2Var.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        org.telegram.messenger.q.q(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                } else if (DialogObject.isEncryptedDialog(dialog.f19220id) && i10 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String string2 = LocaleController.getString(R.string.SendMessageTitle);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19548a;
                    a2Var2.R = string2;
                    if (i10 == 3) {
                        a2Var2.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i10 != 0) {
                        a2Var2.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        a2Var2.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    org.telegram.messenger.q.q(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
                long j10 = dialog.f19220id;
                a0.h hVar = this.U;
                if (hVar.h(j10) >= 0) {
                    hVar.l(dialog.f19220id);
                    this.V.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.i6) {
                        ((org.telegram.ui.Cells.i6) view).t(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).b(false, true);
                    }
                    b1(1);
                    jr0Var = this;
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.f19220id));
                    TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f19220id));
                    if ((!UserObject.isBotForum(user) || (((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f19363id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f19363id))) && (!DialogObject.isChatDialog(dialog.f19220id) || (!ChatObject.isForum(chat2) && (!ChatObject.isMonoForum(chat2) || !ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                        jr0Var = this;
                        hVar.k(dialog, dialog.f19220id);
                        if (view instanceof org.telegram.ui.Cells.i6) {
                            ((org.telegram.ui.Cells.i6) view).t(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.g7) {
                            ((org.telegram.ui.Cells.g7) view).b(true, true);
                        }
                        b1(2);
                        long j11 = UserConfig.getInstance(jr0Var.currentAccount).clientUserId;
                        if (jr0Var.L0) {
                            br0 br0Var = jr0Var.K;
                            a0.h hVar2 = br0Var.e;
                            ArrayList arrayList = br0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.f19220id);
                            if (dialog2 == null) {
                                br0Var.e.k(dialog, dialog.f19220id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f19220id != j11) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            br0Var.l();
                            jr0Var.A0 = false;
                            o20 o20Var = jr0Var.f26489y0;
                            o20Var.f27815r.setText("");
                            L0(false);
                            AndroidUtilities.hideKeyboard(o20Var.f27815r);
                        }
                    } else {
                        this.C0 = dialog;
                        this.I.h1(0, this.f26475p0 - mm0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        qq0 qq0Var = new qq0(this, dialog, atomicReference, view);
                        atomicReference.set(new gq0(this, atomicReference, qq0Var, dialog, 0));
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                        int i11 = NotificationCenter.topicsDidLoaded;
                        notificationCenter.addObserver(qq0Var, i11);
                        if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.f19220id) != null) {
                            qq0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.f19220id));
                            return;
                        }
                        MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.f19220id);
                        AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                fr0 fr0Var = jr0Var.M;
                if (fr0Var != null && (er0Var = fr0Var.H) != null) {
                    er0Var.q(0, er0Var.h());
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
            a0.h hVar = this.U;
            int m10 = hVar.m();
            nq0 nq0Var = this.f26460c;
            oq0 oq0Var = this.d;
            boolean z11 = true;
            if (i14 < m10) {
                long j10 = hVar.j(i14);
                if (g5.g(getContext(), this.currentAccount, j10, (nq0Var.getTag() == null || oq0Var.f30649a.length() <= 0) ? false : false)) {
                    return;
                }
                i14++;
            } else {
                Editable text = oq0Var.getText();
                qu quVar = oq0Var.f30649a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                aq aqVar = this.f26463e0;
                if (aqVar != null && aqVar.f23604a.f23092q) {
                    i10 = this.f26459b0;
                } else {
                    i10 = -1;
                }
                ArrayList arrayList = new ArrayList();
                if (this.N != null) {
                    i12 = 0;
                    while (i13 < hVar.m()) {
                        long j11 = hVar.j(i13);
                        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
                        if (sendPaidMessagesStars <= 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
                        }
                        if (nq0Var.getTag() != null && quVar.length() > 0 && sendPaidMessagesStars > 0) {
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
                    vq0 vq0Var = this.W;
                    if (vq0Var != null) {
                        i11 = vq0Var.e;
                    } else {
                        i11 = 0;
                    }
                    if (this.F0 != null) {
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < hVar.m()) {
                            long j12 = hVar.j(i16);
                            long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j12);
                            if (sendPaidMessagesStars2 <= 0) {
                                sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j12));
                            }
                            int i18 = i13;
                            if (this.F0 != null && nq0Var.getTag() != null && quVar.length() > 0 && charSequenceArr[i18] != null && sendPaidMessagesStars2 > 0) {
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
                        if (this.O[i11] != null) {
                            for (int i21 = 0; i21 < hVar.m(); i21++) {
                                long j13 = hVar.j(i21);
                                long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j13);
                                if (sendPaidMessagesStars3 <= 0) {
                                    sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j13));
                                }
                                if (nq0Var.getTag() != null && quVar.length() > 0 && sendPaidMessagesStars3 > 0) {
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
                        jr0.q(jr0.this, charSequenceArr, entities, z10, i23, (HashMap) obj);
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
        nq0 nq0Var = this.f26460c;
        if (nq0Var.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.f26488y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        nq0Var.setTag(num);
        oq0 oq0Var = this.d;
        if (oq0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(oq0Var.getEditText());
        }
        oq0Var.k(true);
        FrameLayout frameLayout = this.f26461c0;
        nq0 nq0Var2 = this.f26464f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            nq0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            nq0Var2.setVisibility(0);
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
            WeakHashMap weakHashMap = r0.j0.f43732a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.f26486x;
        if (linearLayout != null) {
            if (!z10) {
                i11 = 1;
            }
            WeakHashMap weakHashMap2 = r0.j0.f43732a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.f26488y = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f14 = 0.0f;
        float f15 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(nq0Var, property, f7));
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
        arrayList.add(ObjectAnimator.ofFloat(nq0Var2, property2, f10));
        Property property3 = View.SCALE_Y;
        if (z10) {
            f16 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(nq0Var2, property3, f16));
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(nq0Var2, property, f11));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.S[1];
            if (!z10) {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
        }
        FrameLayout frameLayout3 = this.f26477r;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.f26467h0 && z10) {
                if (this.f26462d0 != null) {
                    f12 = 5.0f;
                } else {
                    f12 = 16.0f;
                }
                f14 = AndroidUtilities.dp(f12);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, f14));
        }
        this.f26488y.playTogether(arrayList);
        this.f26488y.setInterpolator(new DecelerateInterpolator());
        this.f26488y.setDuration(180L);
        this.f26488y.addListener(new sq0(this, z10, 1));
        this.f26488y.start();
    }

    public final void Y0(long j10, View view) {
        String str;
        sc J;
        int i10 = -this.H0;
        this.H0 = i10;
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
            J = new zc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = new zc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new dq0(this, 1));
        }
        J.j();
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.o1 o1Var;
        nq0 nq0Var = this.f26460c;
        if (nq0Var == null) {
            return;
        }
        oq0 oq0Var = this.d;
        if (oq0Var != null && oq0Var.m()) {
            oq0Var.getEmojiPaddingShown();
        } else {
            uq0 uq0Var = this.D0;
            if (uq0Var != null && (o1Var = uq0Var.H) != null && !o1Var.f20558f) {
                AndroidUtilities.dp(20.0f);
            }
        }
        float f7 = 0.0f;
        FrameLayout frameLayout = this.f26461c0;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f7 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            float f10 = -f7;
            frameLayout2.setTranslationY(f10);
            LinearLayout linearLayout = this.f26486x;
            if (linearLayout != null) {
                linearLayout.setTranslationY(f10);
            }
        }
        float f11 = -f7;
        nq0Var.setTranslationY(f11);
        this.f26464f.setTranslationY(f11);
    }

    public final void a1() {
        org.telegram.ui.ActionBar.h5 h5Var = this.f26479s;
        if (h5Var != null) {
            String P0 = P0();
            if (P0.startsWith("https://")) {
                P0 = P0.substring(8);
            } else if (P0.startsWith("http://")) {
                P0 = P0.substring(7);
            }
            h5Var.k(P0);
        }
    }

    public final void b1(int i10) {
        int size;
        boolean z10;
        boolean z11;
        a0.h hVar = this.U;
        if (hVar.m() == 0) {
            X0(false);
            return;
        }
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        Object tag = this.f26460c.getTag();
        oq0 oq0Var = this.d;
        if (tag != null && oq0Var.f30649a.length() > 0) {
            size++;
        }
        long j10 = 0;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            long j11 = ((TLRPC.Dialog) hVar.n(i11)).f19220id;
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
        ji.y1 y1Var = this.e;
        y1Var.g(max, z10);
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        y1Var.i(size, j10, z11);
        X0(true);
        oq0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), y1Var.l()), 0);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            br0 br0Var = this.K;
            if (br0Var != null) {
                br0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override
    public final void dismiss() {
        oq0 oq0Var = this.d;
        if (oq0Var != null) {
            AndroidUtilities.hideKeyboard(oq0Var.getEditText());
        }
        this.Y = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        oq0 oq0Var = this.d;
        if (oq0Var != null) {
            oq0Var.o();
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
        oq0 oq0Var = this.d;
        if (oq0Var != null && oq0Var.e) {
            oq0Var.k(true);
        } else {
            super.onBackPressed();
        }
    }

    public jr0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    public jr0(android.content.Context r37, org.telegram.ui.fo r38, java.util.ArrayList r39, java.lang.String r40, java.lang.String r41, boolean r42, java.lang.String r43, java.lang.String r44, boolean r45, boolean r46, boolean r47, java.lang.Integer r48, org.telegram.ui.ActionBar.c6 r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jr0.<init>(android.content.Context, org.telegram.ui.fo, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.c6):void");
    }

    public void T0(View view) {
    }

    public void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
