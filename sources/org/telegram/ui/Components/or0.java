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
public class or0 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f29474a1 = 0;
    public boolean A0;
    public o1.k B0;
    public TLRPC.Dialog C0;
    public final zq0 D0;
    public final sm0 E;
    public ArrayList E0;
    public final qq0 F;
    public TL_stories.StoryItem F0;
    public final qq0 G;
    public i0.b G0;
    public final s4.s H;
    public int H0;
    public final s4.s I;
    public boolean I0;
    public final f00 J;
    public org.telegram.ui.ActionBar.m1 J0;
    public final gr0 K;
    public int K0;
    public final lr0 L;
    public boolean L0;
    public final kr0 M;
    public boolean M0;
    public final ArrayList N;
    public int N0;
    public final String[] O;
    public final ah.h O0;
    public final int P;
    public final fh.d P0;
    public final cy0 Q;
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
    public final ar0 W;
    public final ah.d W0;
    public int X;
    public final ch.d X0;
    public boolean Y;
    public final ArrayList Y0;
    public final boolean Z;
    public final RectF Z0;
    public boolean f29475a0;
    public final FrameLayout f29476b;
    public final int f29477b0;
    public final sq0 f29478c;
    public final FrameLayout f29479c0;
    public final tq0 d;
    public final LinearLayout f29480d0;
    public final ii.z1 f29481e;
    public final dq f29482e0;
    public final sq0 f29483f;
    public final org.telegram.ui.zn f29484f0;
    public final Activity f29485g0;
    public final FrameLayout h;
    public final boolean f29486h0;
    public boolean f29487i0;
    public final TextPaint f29488j0;
    public TLRPC.TL_exportedMessageLink f29489k0;
    public boolean f29490l0;
    public boolean m0;
    public final ci.bb f29491n;
    public final boolean f29492n0;
    public final String[] f29493o0;
    public int f29494p0;
    public int f29495q0;
    public final FrameLayout f29496r;
    public boolean f29497r0;
    public final org.telegram.ui.ActionBar.h5 f29498s;
    public dr0 f29499s0;
    public float f29500t0;
    public float f29501u0;
    public final FrameLayout v;
    public float f29502v0;
    public final FrameLayout f29503w;
    public ValueAnimator f29504w0;
    public final LinearLayout f29505x;
    public final xl0 f29506x0;
    public AnimatorSet f29507y;
    public final t20 f29508y0;
    public final org.telegram.ui.ActionBar.k f29509z0;

    public or0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, d6Var);
    }

    public static void B0(or0 or0Var) {
        float f7;
        RectF rectF = or0Var.Z0;
        ah.h hVar = or0Var.O0;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
            rectF.set(0.0f, 0.0f, or0Var.containerView.getMeasuredWidth(), or0Var.containerView.getMeasuredHeight());
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            hVar.g(1, or0Var.Y0);
            hVar.e(or0Var.U0, or0Var.containerView.getMeasuredWidth(), or0Var.containerView.getMeasuredHeight());
        }
    }

    public static int G0(or0 or0Var) {
        qq0 qq0Var = or0Var.F;
        if (qq0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = qq0Var.getChildAt(0);
            cm0 cm0Var = (cm0) qq0Var.G(childAt);
            if (cm0Var != null) {
                int paddingTop = qq0Var.getPaddingTop();
                if (cm0Var.c() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    public static or0 O0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        ArrayList arrayList;
        if (messageObject != null) {
            arrayList = org.telegram.messenger.q.k(messageObject);
        } else {
            arrayList = null;
        }
        return new or0(context, arrayList, str, null, z10, str2, null, false);
    }

    public static void o(or0 or0Var, AtomicReference atomicReference, vq0 vq0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        vq0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, or0Var.currentAccount, Long.valueOf(-dialog.f20036id));
    }

    public static boolean p(final or0 or0Var) {
        int measuredHeight;
        org.telegram.ui.zn znVar;
        ii.z1 z1Var = or0Var.f29481e;
        boolean z10 = or0Var.f29486h0;
        Activity activity = or0Var.f29485g0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(or0Var.getContext());
        linearLayout.setOrientation(1);
        if (or0Var.N != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, or0Var.resourcesProvider);
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(or0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20832fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new wq0(or0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new iq0(or0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, or0Var.getContext(), or0Var.resourcesProvider, true, false);
            if (z10) {
                e1Var.setTextColor(or0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20979ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.x5.n(-1, 48));
            e1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            or0Var.I0 = true;
            e1Var.setChecked(true);
            final org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(1, or0Var.getContext(), or0Var.resourcesProvider, false, true);
            if (z10) {
                e1Var2.setTextColor(or0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20979ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.x5.n(-1, 48));
            e1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            e1Var2.setChecked(!or0Var.I0);
            e1Var.setOnClickListener(new View.OnClickListener(or0Var) {
                public final or0 f28839b;

                {
                    this.f28839b = or0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            or0 or0Var2 = this.f28839b;
                            or0Var2.I0 = true;
                            e1Var.setChecked(true);
                            e1Var2.setChecked(!or0Var2.I0);
                            return;
                        default:
                            or0 or0Var3 = this.f28839b;
                            or0Var3.I0 = false;
                            e1Var.setChecked(false);
                            e1Var2.setChecked(!or0Var3.I0);
                            return;
                    }
                }
            });
            e1Var2.setOnClickListener(new View.OnClickListener(or0Var) {
                public final or0 f28839b;

                {
                    this.f28839b = or0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            or0 or0Var2 = this.f28839b;
                            or0Var2.I0 = true;
                            e1Var.setChecked(true);
                            e1Var2.setChecked(!or0Var2.I0);
                            return;
                        default:
                            or0 or0Var3 = this.f28839b;
                            or0Var3.I0 = false;
                            e1Var.setChecked(false);
                            e1Var2.setChecked(!or0Var3.I0);
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(or0Var.getThemedColor(org.telegram.ui.ActionBar.h6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.x5.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, or0Var.resourcesProvider);
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20832fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new wq0(or0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new iq0(or0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, or0Var.getContext(), or0Var.resourcesProvider, true, true);
        if (z10) {
            e1Var3.setTextColor(or0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20979ng));
            e1Var3.setIconColor(or0Var.getThemedColor(org.telegram.ui.ActionBar.h6.H6));
        }
        e1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        e1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(e1Var3, w7.x5.n(-1, 48));
        e1Var3.setOnClickListener(new hq0(or0Var, 1));
        org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(0, or0Var.getContext(), or0Var.resourcesProvider, true, true);
        if (z10) {
            e1Var4.setTextColor(or0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20979ng));
            e1Var4.setIconColor(or0Var.getThemedColor(org.telegram.ui.ActionBar.h6.H6));
        }
        e1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        e1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(e1Var4, w7.x5.n(-1, 48));
        e1Var4.setOnClickListener(new hq0(or0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(or0Var.getThemedColor(org.telegram.ui.ActionBar.h6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.x5.n(-1, -2));
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        or0Var.J0 = m1Var;
        m1Var.f21370b = false;
        m1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        or0Var.J0.setOutsideTouchable(true);
        or0Var.J0.setClippingEnabled(true);
        or0Var.J0.setInputMethodMode(2);
        or0Var.J0.setSoftInputMode(0);
        or0Var.J0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        or0Var.J0.setFocusable(true);
        int[] iArr = new int[2];
        z1Var.getLocationInWindow(iArr);
        if (or0Var.keyboardVisible && (znVar = or0Var.f29484f0) != null && znVar.X0.getMeasuredHeight() > AndroidUtilities.dp(58.0f)) {
            measuredHeight = z1Var.getMeasuredHeight() + iArr[1];
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
        }
        or0Var.J0.showAtLocation(z1Var, 51, AndroidUtilities.dp(8.0f) + ((z1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
        or0Var.J0.b();
        try {
            z1Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void q(or0 or0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
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
        sq0 sq0Var;
        long j12;
        long j13;
        Long l12;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue4;
        String charSequence3;
        long longValue5;
        String[] strArr2 = or0Var.O;
        tq0 tq0Var = or0Var.d;
        sq0 sq0Var2 = or0Var.f29478c;
        HashMap hashMap2 = or0Var.V;
        Long l13 = 0L;
        a0.i iVar = or0Var.U;
        ArrayList arrayList3 = or0Var.N;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i14 = 0;
            boolean z12 = false;
            while (true) {
                if (i14 < iVar.m()) {
                    long j14 = iVar.j(i14);
                    boolean isMonoForum = MessagesController.getInstance(or0Var.currentAccount).isMonoForum(j14);
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
                        sq0Var = sq0Var2;
                        j12 = j14;
                        j13 = DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    } else {
                        sq0Var = sq0Var2;
                        j12 = j14;
                        j13 = 0;
                    }
                    if (tL_forumTopic3 != null && !isMonoForum) {
                        l12 = l13;
                        messageObject3 = new MessageObject(or0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    } else {
                        l12 = l13;
                        messageObject3 = null;
                    }
                    if (messageObject3 != null) {
                        messageObject3.isTopicMainMessage = true;
                    }
                    if (sq0Var.getTag() != null && tq0Var.f24589a.length() > 0) {
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
                        SendMessagesHelper.getInstance(or0Var.currentAccount).sendMessage(of3);
                    } else {
                        messageObject4 = messageObject3;
                        arrayList2 = arrayList3;
                    }
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(or0Var.currentAccount);
                    ArrayList<MessageObject> arrayList5 = or0Var.N;
                    boolean z13 = !or0Var.I0;
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
                        g5.s0(sendMessage, or0Var.f29484f0, null);
                        if (sendMessage != 0) {
                            break;
                        }
                    }
                    i14++;
                    arrayList3 = arrayList2;
                    sq0Var2 = sq0Var;
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
                or0Var.S0(iVar, size2, tL_forumTopic2, !z12);
            }
        } else {
            ar0 ar0Var = or0Var.W;
            if (ar0Var != null) {
                i11 = ar0Var.f29129e;
            } else {
                i11 = 0;
            }
            if (or0Var.F0 != null) {
                int i16 = 0;
                boolean z14 = false;
                while (i16 < iVar.m()) {
                    long j16 = iVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(or0Var.currentAccount).isMonoForum(j16);
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
                        messageObject2 = new MessageObject(or0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                    } else {
                        strArr = strArr2;
                        messageObject2 = null;
                    }
                    if (or0Var.F0 == null) {
                        if (sq0Var2.getTag() != null && tq0Var.f24589a.length() > 0) {
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
                        if (sq0Var2.getTag() != null && tq0Var.f24589a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(or0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j16, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = or0Var.F0;
                    }
                    if (l10 == null) {
                        longValue3 = 0;
                    } else {
                        longValue3 = l10.longValue();
                    }
                    of2.payStars = longValue3;
                    of2.monoForumPeer = j11;
                    SendMessagesHelper.getInstance(or0Var.currentAccount).sendMessage(of2);
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
                        boolean isMonoForum3 = MessagesController.getInstance(or0Var.currentAccount).isMonoForum(j17);
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
                            messageObject = new MessageObject(or0Var.currentAccount, tL_forumTopic5.topicStartMessage, false, false);
                        } else {
                            c10 = 0;
                            messageObject = null;
                        }
                        if (sq0Var2.getTag() != null && tq0Var.f24589a.length() > 0) {
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
                            SendMessagesHelper.getInstance(or0Var.currentAccount).sendMessage(of4);
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
                        SendMessagesHelper.getInstance(or0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z15;
                } else {
                    i12 = 0;
                    z11 = false;
                    or0Var.S0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i12)), !z11);
                }
            }
            i12 = 0;
            or0Var.S0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i12)), !z11);
        }
        dr0 dr0Var = or0Var.f29499s0;
        if (dr0Var != null) {
            dr0Var.P();
        }
        or0Var.dismiss();
    }

    public static void r(or0 or0Var, int i10) {
        TLRPC.Dialog dialog;
        ArrayList arrayList;
        ArrayList arrayList2;
        t20 t20Var = or0Var.f29508y0;
        HashMap hashMap = or0Var.V;
        a0.i iVar = or0Var.U;
        gr0 gr0Var = or0Var.K;
        lr0 lr0Var = or0Var.L;
        if (lr0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = or0Var.C0;
            if (dialog2 != null) {
                iVar.k(dialog2, dialog2.f20036id);
                hashMap.remove(dialog2);
                or0Var.b1(2);
                if (or0Var.L0 || or0Var.M0) {
                    if (((TLRPC.Dialog) gr0Var.f26812e.f(dialog2.f20036id)) == null) {
                        gr0Var.f26812e.k(dialog2, dialog2.f20036id);
                        gr0Var.d.add(!arrayList2.isEmpty(), dialog2);
                    }
                    gr0Var.l();
                    or0Var.A0 = false;
                    t20Var.f30964r.setText("");
                    or0Var.L0(false);
                }
                for (int i11 = 0; i11 < or0Var.Q0().getChildCount(); i11++) {
                    View childAt = or0Var.Q0().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.g7) {
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                        if (g7Var.getCurrentDialog() == or0Var.C0.f20036id) {
                            g7Var.d(null, false, true);
                            g7Var.b(true, true);
                        }
                    }
                }
                or0Var.M0();
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic E = lr0Var.E(i10);
        if (E != null && (dialog = or0Var.C0) != null) {
            long j3 = dialog.f20036id;
            boolean isMonoForum = MessagesController.getInstance(or0Var.currentAccount).isMonoForum(j3);
            TLRPC.Dialog dialog3 = or0Var.C0;
            iVar.k(dialog3, j3);
            hashMap.put(dialog3, E);
            or0Var.b1(2);
            if (or0Var.L0 || or0Var.M0) {
                if (((TLRPC.Dialog) gr0Var.f26812e.f(dialog3.f20036id)) == null) {
                    gr0Var.f26812e.k(dialog3, dialog3.f20036id);
                    gr0Var.d.add(!arrayList.isEmpty(), dialog3);
                }
                gr0Var.l();
                or0Var.A0 = false;
                t20Var.f30964r.setText("");
                or0Var.L0(false);
            }
            for (int i12 = 0; i12 < or0Var.Q0().getChildCount(); i12++) {
                View childAt2 = or0Var.Q0().getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) childAt2;
                    if (g7Var2.getCurrentDialog() == or0Var.C0.f20036id) {
                        g7Var2.d(E, isMonoForum, true);
                        g7Var2.b(true, true);
                    }
                }
            }
            or0Var.M0();
        }
    }

    public static void t0(or0 or0Var) {
        qq0 qq0Var;
        int i10;
        int i11;
        qq0 qq0Var2 = or0Var.F;
        qq0 qq0Var3 = or0Var.G;
        sm0 sm0Var = or0Var.E;
        if (!or0Var.f29497r0) {
            if (or0Var.L0) {
                qq0Var = qq0Var3;
            } else {
                qq0Var = qq0Var2;
            }
            if (qq0Var.getChildCount() > 0) {
                View childAt = qq0Var.getChildAt(0);
                for (int i12 = 0; i12 < qq0Var.getChildCount(); i12++) {
                    if (qq0Var.getChildAt(i12).getTop() < childAt.getTop()) {
                        childAt = qq0Var.getChildAt(i12);
                    }
                }
                cm0 cm0Var = (cm0) qq0Var.G(childAt);
                int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
                if (top > 0 && cm0Var != null && cm0Var.b() == 0) {
                    i10 = top;
                } else {
                    i10 = 0;
                }
                if (top >= 0 && cm0Var != null && cm0Var.b() == 0) {
                    or0Var.K0 = childAt.getTop();
                    or0Var.U0(false);
                } else {
                    or0Var.K0 = Integer.MAX_VALUE;
                    or0Var.U0(true);
                    top = i10;
                }
                if (sm0Var.getVisibility() == 0) {
                    if (sm0Var.getChildCount() > 0) {
                        View childAt2 = sm0Var.getChildAt(0);
                        for (int i13 = 0; i13 < sm0Var.getChildCount(); i13++) {
                            if (sm0Var.getChildAt(i13).getTop() < childAt2.getTop()) {
                                childAt2 = sm0Var.getChildAt(i13);
                            }
                        }
                        cm0 cm0Var2 = (cm0) sm0Var.G(childAt2);
                        int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
                        if (top2 > 0 && cm0Var2 != null && cm0Var2.b() == 0) {
                            i11 = top2;
                        } else {
                            i11 = 0;
                        }
                        if (top2 >= 0 && cm0Var2 != null && cm0Var2.b() == 0) {
                            or0Var.K0 = childAt2.getTop();
                            or0Var.U0(false);
                        } else {
                            or0Var.K0 = Integer.MAX_VALUE;
                            or0Var.U0(true);
                            top2 = i11;
                        }
                        top = AndroidUtilities.lerp(top, top2, sm0Var.getAlpha());
                    } else {
                        return;
                    }
                }
                int i14 = or0Var.f29494p0;
                if (i14 != top) {
                    or0Var.f29495q0 = i14;
                    float f7 = top;
                    int i15 = (int) (or0Var.f29500t0 + f7);
                    or0Var.f29494p0 = i15;
                    qq0Var2.setTopGlowOffset(i15);
                    int i16 = (int) (or0Var.f29500t0 + f7);
                    or0Var.f29494p0 = i16;
                    qq0Var3.setTopGlowOffset(i16);
                    int i17 = (int) (f7 + or0Var.f29500t0);
                    or0Var.f29494p0 = i17;
                    sm0Var.setTopGlowOffset(i17);
                    or0Var.f29476b.setTranslationY(or0Var.f29494p0 + or0Var.f29500t0);
                    or0Var.Q.setTranslationY(or0Var.f29494p0 + or0Var.f29500t0);
                    or0Var.containerView.invalidate();
                }
            }
        }
    }

    public final void L0(boolean z10) {
        t20 t20Var = this.f29508y0;
        ci.g2 g2Var = t20Var.f30964r;
        ci.g2 g2Var2 = t20Var.f30964r;
        boolean isEmpty = TextUtils.isEmpty(g2Var.getText());
        qq0 qq0Var = this.F;
        qq0 qq0Var2 = this.G;
        boolean z11 = true;
        if (isEmpty && ((!this.keyboardVisible || !g2Var2.hasFocus()) && !this.M0)) {
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(qq0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(qq0Var2, false);
            }
            z11 = false;
        } else {
            this.A0 = true;
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(qq0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(qq0Var2, true);
            }
        }
        if (this.L0 == z11 && !z10) {
            return;
        }
        this.L0 = z11;
        kr0 kr0Var = this.M;
        kr0Var.l();
        this.K.l();
        if (this.L0) {
            if (this.K0 == Integer.MAX_VALUE) {
                ((s4.d0) qq0Var2.getLayoutManager()).h1(0, -qq0Var2.getPaddingTop());
            } else {
                ((s4.d0) qq0Var2.getLayoutManager()).h1(0, this.K0 - qq0Var2.getPaddingTop());
            }
            kr0Var.E(g2Var2.getText().toString());
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
                if ((childAt instanceof org.telegram.ui.Cells.g7) && ((org.telegram.ui.Cells.g7) childAt).getCurrentDialog() == dialog.f20036id) {
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
            t20 t20Var = this.f29508y0;
            t20Var.setVisibility(0);
            ci.g2 g2Var = t20Var.f30964r;
            if (this.L0 || this.M0) {
                this.D0.H.v = true;
                g2Var.requestFocus();
                AndroidUtilities.showKeyboard(g2Var);
            }
            int[] iArr = new int[2];
            o1.k kVar2 = new o1.k(new o1.j(1000.0f));
            o1.l lVar = new o1.l(0.0f);
            org.telegram.ui.zn znVar = this.f29484f0;
            if (znVar != null && znVar.f44712b) {
                f7 = 10.0f;
            } else {
                f7 = 800.0f;
            }
            lVar.b(f7);
            lVar.a(1.0f);
            kVar2.f16988u = lVar;
            this.B0 = kVar2;
            kVar2.b(new gq0(this, g7Var, iArr, 0));
            this.B0.a(new jb(this, 5));
            this.B0.h();
        }
    }

    public final void N0() {
        boolean z10 = false;
        if (this.f29489k0 != null || this.f29493o0[0] != null) {
            try {
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", P0()));
                dr0 dr0Var = this.f29499s0;
                if (dr0Var != null) {
                    dr0Var.q0();
                } else if (this.f29485g0 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f29489k0;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z10 = true;
                    }
                    ((LaunchActivity) this.f29485g0).D0(new i2.y(5, z10));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final String P0() {
        String str;
        String str2;
        String[] strArr = this.f29493o0;
        ar0 ar0Var = this.W;
        if (ar0Var != null) {
            str2 = strArr[ar0Var.f29129e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f29489k0;
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
        dq dqVar = this.f29482e0;
        if (dqVar != null && dqVar.f25656a.f24089q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.f29477b0)).build().toString();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final sm0 Q0() {
        if (!this.L0 && !this.M0) {
            return this.F;
        }
        return this.G;
    }

    public final void R0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        sm0 sm0Var = this.E;
        sm0Var.setPivotX(width);
        sm0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        sm0Var.setScaleX(f11);
        sm0Var.setScaleY(f11);
        sm0Var.setAlpha(f7);
        sm0 Q0 = Q0();
        Q0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        Q0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        Q0.setScaleX(f12);
        Q0.setScaleY(f12);
        float f13 = 1.0f - f7;
        Q0.setAlpha(f13);
        t20 t20Var = this.f29508y0;
        t20Var.setPivotX(t20Var.getWidth() / 2.0f);
        t20Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        t20Var.setScaleX(f14);
        t20Var.setScaleY(f14);
        t20Var.setAlpha(f13);
        org.telegram.ui.ActionBar.k kVar = this.f29509z0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.setAlpha(f7);
        sm0Var.getLocationInWindow(iArr);
        float interpolation = is.f27452g.getInterpolation(f7);
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
        for (int i11 = 0; i11 < sm0Var.getChildCount(); i11++) {
            View childAt2 = sm0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.h7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y3 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((sm0Var.getTranslationY() + y3) - view.getY()))));
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
            animatorSetArr[0].addListener(new xq0(this, z10, 0));
            animatorSetArr[0].start();
        }
    }

    public final void V0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        or0 or0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        jr0 jr0Var;
        if (dialog instanceof fr0) {
            T0(view);
        } else if (((view instanceof org.telegram.ui.Cells.g7) && ((org.telegram.ui.Cells.g7) view).F) || ((view instanceof org.telegram.ui.Cells.i6) && ((org.telegram.ui.Cells.i6) view).f22249n0)) {
            Y0(dialog.f20036id, view);
        } else {
            sm0 sm0Var = this.E;
            if (sm0Var.getVisibility() == 8 && (activity = this.f29485g0) != null) {
                boolean isChatDialog = DialogObject.isChatDialog(dialog.f20036id);
                int i10 = this.P;
                if (isChatDialog) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f20036id));
                    if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.f20036id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        String string = LocaleController.getString(R.string.SendMessageTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                        a2Var.R = string;
                        if (i10 == 3) {
                            if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                a2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                            } else {
                                a2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                            }
                        } else if (i10 == 2) {
                            if (this.f29492n0) {
                                a2Var.T = LocaleController.getString(R.string.PublicPollCantForward);
                            } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                a2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                            } else {
                                a2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                            }
                        } else {
                            a2Var.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        hg.c.p(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                } else if (DialogObject.isEncryptedDialog(dialog.f20036id) && i10 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String string2 = LocaleController.getString(R.string.SendMessageTitle);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20368a;
                    a2Var2.R = string2;
                    if (i10 == 3) {
                        a2Var2.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i10 != 0) {
                        a2Var2.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        a2Var2.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    hg.c.p(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
                long j3 = dialog.f20036id;
                a0.i iVar = this.U;
                if (iVar.h(j3) >= 0) {
                    iVar.l(dialog.f20036id);
                    this.V.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.i6) {
                        ((org.telegram.ui.Cells.i6) view).t(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).b(false, true);
                    }
                    b1(1);
                    or0Var = this;
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.f20036id));
                    TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f20036id));
                    if ((!UserObject.isBotForum(user) || (((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f20179id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f20179id))) && (!DialogObject.isChatDialog(dialog.f20036id) || (!ChatObject.isForum(chat2) && (!ChatObject.isMonoForum(chat2) || !ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                        or0Var = this;
                        iVar.k(dialog, dialog.f20036id);
                        if (view instanceof org.telegram.ui.Cells.i6) {
                            ((org.telegram.ui.Cells.i6) view).t(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.g7) {
                            ((org.telegram.ui.Cells.g7) view).b(true, true);
                        }
                        b1(2);
                        long j10 = UserConfig.getInstance(or0Var.currentAccount).clientUserId;
                        if (or0Var.L0) {
                            gr0 gr0Var = or0Var.K;
                            a0.i iVar2 = gr0Var.f26812e;
                            ArrayList arrayList = gr0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) iVar2.f(dialog.f20036id);
                            if (dialog2 == null) {
                                gr0Var.f26812e.k(dialog, dialog.f20036id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f20036id != j10) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            gr0Var.l();
                            or0Var.A0 = false;
                            t20 t20Var = or0Var.f29508y0;
                            t20Var.f30964r.setText("");
                            L0(false);
                            AndroidUtilities.hideKeyboard(t20Var.f30964r);
                        }
                    } else {
                        this.C0 = dialog;
                        this.I.h1(0, this.f29494p0 - sm0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        vq0 vq0Var = new vq0(this, dialog, atomicReference, view);
                        atomicReference.set(new qo0(this, atomicReference, vq0Var, dialog, 1));
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                        int i11 = NotificationCenter.topicsDidLoaded;
                        notificationCenter.addObserver(vq0Var, i11);
                        if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.f20036id) != null) {
                            vq0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.f20036id));
                            return;
                        }
                        MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.f20036id);
                        AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                kr0 kr0Var = or0Var.M;
                if (kr0Var != null && (jr0Var = kr0Var.H) != null) {
                    jr0Var.q(0, jr0Var.h());
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
            sq0 sq0Var = this.f29478c;
            tq0 tq0Var = this.d;
            boolean z11 = true;
            if (i14 < m10) {
                long j3 = iVar.j(i14);
                if (g5.g(getContext(), this.currentAccount, j3, (sq0Var.getTag() == null || tq0Var.f24589a.length() <= 0) ? false : false)) {
                    return;
                }
                i14++;
            } else {
                Editable text = tq0Var.getText();
                vu vuVar = tq0Var.f24589a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                dq dqVar = this.f29482e0;
                if (dqVar != null && dqVar.f25656a.f24089q) {
                    i10 = this.f29477b0;
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
                        if (sq0Var.getTag() != null && vuVar.length() > 0 && sendPaidMessagesStars > 0) {
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
                    ar0 ar0Var = this.W;
                    if (ar0Var != null) {
                        i11 = ar0Var.f29129e;
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
                            if (this.F0 != null && sq0Var.getTag() != null && vuVar.length() > 0 && charSequenceArr[i18] != null && sendPaidMessagesStars2 > 0) {
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
                                if (sq0Var.getTag() != null && vuVar.length() > 0 && sendPaidMessagesStars3 > 0) {
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
                        or0.q(or0.this, charSequenceArr, entities, z10, i23, (HashMap) obj);
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
        sq0 sq0Var = this.f29478c;
        if (sq0Var.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.f29507y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        sq0Var.setTag(num);
        tq0 tq0Var = this.d;
        if (tq0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(tq0Var.getEditText());
        }
        tq0Var.k(true);
        FrameLayout frameLayout = this.f29479c0;
        sq0 sq0Var2 = this.f29483f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            sq0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            sq0Var2.setVisibility(0);
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
            WeakHashMap weakHashMap = r0.i0.f46856a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.f29505x;
        if (linearLayout != null) {
            if (!z10) {
                i11 = 1;
            }
            WeakHashMap weakHashMap2 = r0.i0.f46856a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.f29507y = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f14 = 0.0f;
        float f15 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(sq0Var, property, f7));
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
        arrayList.add(ObjectAnimator.ofFloat(sq0Var2, property2, f10));
        Property property3 = View.SCALE_Y;
        if (z10) {
            f16 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(sq0Var2, property3, f16));
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(sq0Var2, property, f11));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.S[1];
            if (!z10) {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
        }
        FrameLayout frameLayout3 = this.f29496r;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.f29486h0 && z10) {
                if (this.f29480d0 != null) {
                    f12 = 5.0f;
                } else {
                    f12 = 16.0f;
                }
                f14 = AndroidUtilities.dp(f12);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, f14));
        }
        this.f29507y.playTogether(arrayList);
        this.f29507y.setInterpolator(new DecelerateInterpolator());
        this.f29507y.setDuration(180L);
        this.f29507y.addListener(new xq0(this, z10, 1));
        this.f29507y.start();
    }

    public final void Y0(long j3, View view) {
        String str;
        sc J;
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
            J = new ad(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new jq0(this, 1));
        }
        J.j();
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.o1 o1Var;
        sq0 sq0Var = this.f29478c;
        if (sq0Var == null) {
            return;
        }
        tq0 tq0Var = this.d;
        if (tq0Var != null && tq0Var.m()) {
            tq0Var.getEmojiPaddingShown();
        } else {
            zq0 zq0Var = this.D0;
            if (zq0Var != null && (o1Var = zq0Var.H) != null && !o1Var.f21412f) {
                AndroidUtilities.dp(20.0f);
            }
        }
        float f7 = 0.0f;
        FrameLayout frameLayout = this.f29479c0;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f7 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            float f10 = -f7;
            frameLayout2.setTranslationY(f10);
            LinearLayout linearLayout = this.f29505x;
            if (linearLayout != null) {
                linearLayout.setTranslationY(f10);
            }
        }
        float f11 = -f7;
        sq0Var.setTranslationY(f11);
        this.f29483f.setTranslationY(f11);
    }

    public final void a1() {
        org.telegram.ui.ActionBar.h5 h5Var = this.f29498s;
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
        Object tag = this.f29478c.getTag();
        tq0 tq0Var = this.d;
        if (tag != null && tq0Var.f24589a.length() > 0) {
            size++;
        }
        long j3 = 0;
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            long j10 = ((TLRPC.Dialog) iVar.n(i11)).f20036id;
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
        ii.z1 z1Var = this.f29481e;
        z1Var.g(max, z10);
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        z1Var.i(size, j3, z11);
        X0(true);
        tq0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), z1Var.l()), 0);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            gr0 gr0Var = this.K;
            if (gr0Var != null) {
                gr0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override
    public final void dismiss() {
        tq0 tq0Var = this.d;
        if (tq0Var != null) {
            AndroidUtilities.hideKeyboard(tq0Var.getEditText());
        }
        this.Y = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        tq0 tq0Var = this.d;
        if (tq0Var != null) {
            tq0Var.o();
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
        tq0 tq0Var = this.d;
        if (tq0Var != null && tq0Var.f24592e) {
            tq0Var.k(true);
        } else {
            super.onBackPressed();
        }
    }

    public or0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    public or0(android.content.Context r36, org.telegram.ui.zn r37, java.util.ArrayList r38, java.lang.String r39, java.lang.String r40, boolean r41, java.lang.String r42, java.lang.String r43, boolean r44, boolean r45, boolean r46, java.lang.Integer r47, org.telegram.ui.ActionBar.d6 r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.or0.<init>(android.content.Context, org.telegram.ui.zn, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.d6):void");
    }

    public void T0(View view) {
    }

    public void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
