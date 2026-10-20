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
public class fr0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f26362b1 = 0;
    public final org.telegram.ui.ActionBar.k A0;
    public boolean B0;
    public o1.k C0;
    public TLRPC.Dialog D0;
    public AnimatorSet E;
    public final pq0 E0;
    public final jm0 F;
    public ArrayList F0;
    public final hq0 G;
    public TL_stories.StoryItem G0;
    public final hq0 H;
    public i0.b H0;
    public final s4.s I;
    public int I0;
    public final s4.s J;
    public boolean J0;
    public final xz K;
    public org.telegram.ui.ActionBar.m1 K0;
    public final xq0 L;
    public int L0;
    public final cr0 M;
    public boolean M0;
    public final br0 N;
    public boolean N0;
    public final ArrayList O;
    public int O0;
    public final String[] P;
    public final bh.f P0;
    public final int Q;
    public final gh.d Q0;
    public final tx0 R;
    public final gh.d R0;
    public final Drawable S;
    public final bh.b S0;
    public final View[] T;
    public final bh.b T0;
    public final AnimatorSet[] U;
    public final bh.b U0;
    public final a0.h V;
    public final bh.l V0;
    public final HashMap W;
    public final dh.d W0;
    public final rq0 X;
    public final bh.c X0;
    public int Y;
    public final dh.d Y0;
    public boolean Z;
    public final ArrayList Z0;
    public final boolean f26363a0;
    public final RectF f26364a1;
    public final FrameLayout f26365b;
    public boolean f26366b0;
    public final iq0 f26367c;
    public final int f26368c0;
    public final jq0 d;
    public final FrameLayout f26369d0;
    public final ki.y1 e;
    public final LinearLayout f26370e0;
    public final iq0 f26371f;
    public final xp f26372f0;
    public final org.telegram.ui.qn f26373g0;
    public final FrameLayout h;
    public final Activity f26374h0;
    public final boolean f26375i0;
    public boolean f26376j0;
    public final TextPaint f26377k0;
    public TLRPC.TL_exportedMessageLink f26378l0;
    public boolean m0;
    public float f26379n;
    public boolean f26380n0;
    public final boolean f26381o0;
    public final String[] f26382p0;
    public int f26383q0;
    public final ai.ic f26384r;
    public int f26385r0;
    public final FrameLayout f26386s;
    public boolean f26387s0;
    public uq0 f26388t0;
    public float f26389u0;
    public final org.telegram.ui.ActionBar.j5 v;
    public float f26390v0;
    public final FrameLayout f26391w;
    public float f26392w0;
    public final FrameLayout f26393x;
    public ValueAnimator f26394x0;
    public final LinearLayout f26395y;
    public final ol0 f26396y0;
    public final k20 f26397z0;

    public fr0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, d6Var);
    }

    public static void E0(fr0 fr0Var) {
        float f7;
        RectF rectF = fr0Var.f26364a1;
        bh.f fVar = fr0Var.P0;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            rectF.set(0.0f, 0.0f, fr0Var.containerView.getMeasuredWidth(), fr0Var.containerView.getMeasuredHeight());
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            fVar.g(1, fr0Var.Z0);
            fVar.e(fr0Var.V0, fr0Var.containerView.getMeasuredWidth(), fr0Var.containerView.getMeasuredHeight());
        }
    }

    public static int J0(fr0 fr0Var) {
        hq0 hq0Var = fr0Var.G;
        if (hq0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = hq0Var.getChildAt(0);
            tl0 tl0Var = (tl0) hq0Var.G(childAt);
            if (tl0Var != null) {
                int paddingTop = hq0Var.getPaddingTop();
                if (tl0Var.c() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    public static fr0 P0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        ArrayList arrayList;
        if (messageObject != null) {
            arrayList = org.telegram.messenger.g0.k(messageObject);
        } else {
            arrayList = null;
        }
        return new fr0(context, arrayList, str, null, z10, str2, null, false);
    }

    public static void n(fr0 fr0Var, AtomicReference atomicReference, lq0 lq0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        lq0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, fr0Var.currentAccount, Long.valueOf(-dialog.f20280id));
    }

    public static boolean o(final fr0 fr0Var) {
        int measuredHeight;
        org.telegram.ui.qn qnVar;
        ki.y1 y1Var = fr0Var.e;
        boolean z10 = fr0Var.f26375i0;
        Activity activity = fr0Var.f26374h0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(fr0Var.getContext());
        linearLayout.setOrientation(1);
        if (fr0Var.O != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, fr0Var.resourcesProvider);
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(fr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new mq0(fr0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new yp0(fr0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, fr0Var.getContext(), fr0Var.resourcesProvider, true, false);
            if (z10) {
                e1Var.setTextColor(fr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21183ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.z5.n(-1, 48));
            e1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            fr0Var.J0 = true;
            e1Var.setChecked(true);
            final org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(1, fr0Var.getContext(), fr0Var.resourcesProvider, false, true);
            if (z10) {
                e1Var2.setTextColor(fr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21183ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.z5.n(-1, 48));
            e1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            e1Var2.setChecked(!fr0Var.J0);
            e1Var.setOnClickListener(new View.OnClickListener(fr0Var) {
                public final fr0 f25244b;

                {
                    this.f25244b = fr0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            fr0 fr0Var2 = this.f25244b;
                            fr0Var2.J0 = true;
                            e1Var.setChecked(true);
                            e1Var2.setChecked(!fr0Var2.J0);
                            return;
                        default:
                            fr0 fr0Var3 = this.f25244b;
                            fr0Var3.J0 = false;
                            e1Var.setChecked(false);
                            e1Var2.setChecked(!fr0Var3.J0);
                            return;
                    }
                }
            });
            e1Var2.setOnClickListener(new View.OnClickListener(fr0Var) {
                public final fr0 f25244b;

                {
                    this.f25244b = fr0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            fr0 fr0Var2 = this.f25244b;
                            fr0Var2.J0 = true;
                            e1Var.setChecked(true);
                            e1Var2.setChecked(!fr0Var2.J0);
                            return;
                        default:
                            fr0 fr0Var3 = this.f25244b;
                            fr0Var3.J0 = false;
                            e1Var.setChecked(false);
                            e1Var2.setChecked(!fr0Var3.J0);
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(fr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.z5.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, fr0Var.resourcesProvider);
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new mq0(fr0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new yp0(fr0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, fr0Var.getContext(), fr0Var.resourcesProvider, true, true);
        if (z10) {
            e1Var3.setTextColor(fr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21183ng));
            e1Var3.setIconColor(fr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.H6));
        }
        e1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        e1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(e1Var3, w7.z5.n(-1, 48));
        e1Var3.setOnClickListener(new xp0(fr0Var, 1));
        org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(0, fr0Var.getContext(), fr0Var.resourcesProvider, true, true);
        if (z10) {
            e1Var4.setTextColor(fr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21183ng));
            e1Var4.setIconColor(fr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.H6));
        }
        e1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        e1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(e1Var4, w7.z5.n(-1, 48));
        e1Var4.setOnClickListener(new xp0(fr0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(fr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.z5.n(-1, -2));
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        fr0Var.K0 = m1Var;
        m1Var.f21576b = false;
        m1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        fr0Var.K0.setOutsideTouchable(true);
        fr0Var.K0.setClippingEnabled(true);
        fr0Var.K0.setInputMethodMode(2);
        fr0Var.K0.setSoftInputMode(0);
        fr0Var.K0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        fr0Var.K0.setFocusable(true);
        int[] iArr = new int[2];
        y1Var.getLocationInWindow(iArr);
        if (fr0Var.keyboardVisible && (qnVar = fr0Var.f26373g0) != null && qnVar.X0.getMeasuredHeight() > AndroidUtilities.dp(58.0f)) {
            measuredHeight = y1Var.getMeasuredHeight() + iArr[1];
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
        }
        fr0Var.K0.showAtLocation(y1Var, 51, AndroidUtilities.dp(8.0f) + ((y1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
        fr0Var.K0.b();
        try {
            y1Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void p(fr0 fr0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
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
        iq0 iq0Var;
        long j13;
        long j14;
        Long l12;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue4;
        String charSequence3;
        long longValue5;
        String[] strArr2 = fr0Var.P;
        jq0 jq0Var = fr0Var.d;
        iq0 iq0Var2 = fr0Var.f26367c;
        HashMap hashMap2 = fr0Var.W;
        Long l13 = 0L;
        a0.h hVar = fr0Var.V;
        ArrayList arrayList3 = fr0Var.O;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i14 = 0;
            boolean z12 = false;
            while (true) {
                if (i14 < hVar.m()) {
                    long j15 = hVar.j(i14);
                    boolean isMonoForum = MessagesController.getInstance(fr0Var.currentAccount).isMonoForum(j15);
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
                        iq0Var = iq0Var2;
                        j13 = j15;
                        j14 = DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    } else {
                        iq0Var = iq0Var2;
                        j13 = j15;
                        j14 = 0;
                    }
                    if (tL_forumTopic3 != null && !isMonoForum) {
                        l12 = l13;
                        messageObject3 = new MessageObject(fr0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    } else {
                        l12 = l13;
                        messageObject3 = null;
                    }
                    if (messageObject3 != null) {
                        messageObject3.isTopicMainMessage = true;
                    }
                    if (iq0Var.getTag() != null && jq0Var.f29709a.length() > 0) {
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
                        SendMessagesHelper.getInstance(fr0Var.currentAccount).sendMessage(of3);
                    } else {
                        messageObject4 = messageObject3;
                        arrayList2 = arrayList3;
                    }
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(fr0Var.currentAccount);
                    ArrayList<MessageObject> arrayList5 = fr0Var.O;
                    boolean z13 = !fr0Var.J0;
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
                        f5.s0(sendMessage, fr0Var.f26373g0, null);
                        if (sendMessage != 0) {
                            break;
                        }
                    }
                    i14++;
                    arrayList3 = arrayList2;
                    iq0Var2 = iq0Var;
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
                fr0Var.T0(hVar, size2, tL_forumTopic2, !z12);
            }
        } else {
            rq0 rq0Var = fr0Var.X;
            if (rq0Var != null) {
                i11 = rq0Var.e;
            } else {
                i11 = 0;
            }
            if (fr0Var.G0 != null) {
                int i16 = 0;
                boolean z14 = false;
                while (i16 < hVar.m()) {
                    long j17 = hVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(fr0Var.currentAccount).isMonoForum(j17);
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
                        messageObject2 = new MessageObject(fr0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                    } else {
                        strArr = strArr2;
                        messageObject2 = null;
                    }
                    if (fr0Var.G0 == null) {
                        if (iq0Var2.getTag() != null && jq0Var.f29709a.length() > 0) {
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
                        if (iq0Var2.getTag() != null && jq0Var.f29709a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(fr0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j17, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j17, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = fr0Var.G0;
                    }
                    if (l10 == null) {
                        longValue3 = 0;
                    } else {
                        longValue3 = l10.longValue();
                    }
                    of2.payStars = longValue3;
                    of2.monoForumPeer = j12;
                    SendMessagesHelper.getInstance(fr0Var.currentAccount).sendMessage(of2);
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
                        boolean isMonoForum3 = MessagesController.getInstance(fr0Var.currentAccount).isMonoForum(j18);
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
                            messageObject = new MessageObject(fr0Var.currentAccount, tL_forumTopic5.topicStartMessage, false, false);
                        } else {
                            c10 = 0;
                            messageObject = null;
                        }
                        if (iq0Var2.getTag() != null && jq0Var.f29709a.length() > 0) {
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
                            SendMessagesHelper.getInstance(fr0Var.currentAccount).sendMessage(of4);
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
                        SendMessagesHelper.getInstance(fr0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z15;
                } else {
                    i12 = 0;
                    z11 = false;
                    fr0Var.T0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i12)), !z11);
                }
            }
            i12 = 0;
            fr0Var.T0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i12)), !z11);
        }
        uq0 uq0Var = fr0Var.f26388t0;
        if (uq0Var != null) {
            uq0Var.H();
        }
        fr0Var.dismiss();
    }

    public static void q(fr0 fr0Var, int i10) {
        TLRPC.Dialog dialog;
        ArrayList arrayList;
        ArrayList arrayList2;
        k20 k20Var = fr0Var.f26397z0;
        HashMap hashMap = fr0Var.W;
        a0.h hVar = fr0Var.V;
        xq0 xq0Var = fr0Var.L;
        cr0 cr0Var = fr0Var.M;
        if (cr0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = fr0Var.D0;
            if (dialog2 != null) {
                hVar.k(dialog2, dialog2.f20280id);
                hashMap.remove(dialog2);
                fr0Var.c1(2);
                if (fr0Var.M0 || fr0Var.N0) {
                    if (((TLRPC.Dialog) xq0Var.e.f(dialog2.f20280id)) == null) {
                        xq0Var.e.k(dialog2, dialog2.f20280id);
                        xq0Var.d.add(!arrayList2.isEmpty(), dialog2);
                    }
                    xq0Var.l();
                    fr0Var.B0 = false;
                    k20Var.f27726r.setText("");
                    fr0Var.M0(false);
                }
                for (int i11 = 0; i11 < fr0Var.R0().getChildCount(); i11++) {
                    View childAt = fr0Var.R0().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.e7) {
                        org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) childAt;
                        if (e7Var.getCurrentDialog() == fr0Var.D0.f20280id) {
                            e7Var.d(null, false, true);
                            e7Var.b(true, true);
                        }
                    }
                }
                fr0Var.N0();
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic E = cr0Var.E(i10);
        if (E != null && (dialog = fr0Var.D0) != null) {
            long j10 = dialog.f20280id;
            boolean isMonoForum = MessagesController.getInstance(fr0Var.currentAccount).isMonoForum(j10);
            TLRPC.Dialog dialog3 = fr0Var.D0;
            hVar.k(dialog3, j10);
            hashMap.put(dialog3, E);
            fr0Var.c1(2);
            if (fr0Var.M0 || fr0Var.N0) {
                if (((TLRPC.Dialog) xq0Var.e.f(dialog3.f20280id)) == null) {
                    xq0Var.e.k(dialog3, dialog3.f20280id);
                    xq0Var.d.add(!arrayList.isEmpty(), dialog3);
                }
                xq0Var.l();
                fr0Var.B0 = false;
                k20Var.f27726r.setText("");
                fr0Var.M0(false);
            }
            for (int i12 = 0; i12 < fr0Var.R0().getChildCount(); i12++) {
                View childAt2 = fr0Var.R0().getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.e7) {
                    org.telegram.ui.Cells.e7 e7Var2 = (org.telegram.ui.Cells.e7) childAt2;
                    if (e7Var2.getCurrentDialog() == fr0Var.D0.f20280id) {
                        e7Var2.d(E, isMonoForum, true);
                        e7Var2.b(true, true);
                    }
                }
            }
            fr0Var.N0();
        }
    }

    public static void v0(fr0 fr0Var) {
        hq0 hq0Var;
        int i10;
        int i11;
        hq0 hq0Var2 = fr0Var.G;
        hq0 hq0Var3 = fr0Var.H;
        jm0 jm0Var = fr0Var.F;
        if (!fr0Var.f26387s0) {
            if (fr0Var.M0) {
                hq0Var = hq0Var3;
            } else {
                hq0Var = hq0Var2;
            }
            if (hq0Var.getChildCount() > 0) {
                View childAt = hq0Var.getChildAt(0);
                for (int i12 = 0; i12 < hq0Var.getChildCount(); i12++) {
                    if (hq0Var.getChildAt(i12).getTop() < childAt.getTop()) {
                        childAt = hq0Var.getChildAt(i12);
                    }
                }
                tl0 tl0Var = (tl0) hq0Var.G(childAt);
                int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
                if (top > 0 && tl0Var != null && tl0Var.b() == 0) {
                    i10 = top;
                } else {
                    i10 = 0;
                }
                if (top >= 0 && tl0Var != null && tl0Var.b() == 0) {
                    fr0Var.L0 = childAt.getTop();
                    fr0Var.V0(false);
                } else {
                    fr0Var.L0 = Integer.MAX_VALUE;
                    fr0Var.V0(true);
                    top = i10;
                }
                if (jm0Var.getVisibility() == 0) {
                    if (jm0Var.getChildCount() > 0) {
                        View childAt2 = jm0Var.getChildAt(0);
                        for (int i13 = 0; i13 < jm0Var.getChildCount(); i13++) {
                            if (jm0Var.getChildAt(i13).getTop() < childAt2.getTop()) {
                                childAt2 = jm0Var.getChildAt(i13);
                            }
                        }
                        tl0 tl0Var2 = (tl0) jm0Var.G(childAt2);
                        int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
                        if (top2 > 0 && tl0Var2 != null && tl0Var2.b() == 0) {
                            i11 = top2;
                        } else {
                            i11 = 0;
                        }
                        if (top2 >= 0 && tl0Var2 != null && tl0Var2.b() == 0) {
                            fr0Var.L0 = childAt2.getTop();
                            fr0Var.V0(false);
                        } else {
                            fr0Var.L0 = Integer.MAX_VALUE;
                            fr0Var.V0(true);
                            top2 = i11;
                        }
                        top = AndroidUtilities.lerp(top, top2, jm0Var.getAlpha());
                    } else {
                        return;
                    }
                }
                int i14 = fr0Var.f26383q0;
                if (i14 != top) {
                    fr0Var.f26385r0 = i14;
                    float f7 = top;
                    int i15 = (int) (fr0Var.f26389u0 + f7);
                    fr0Var.f26383q0 = i15;
                    hq0Var2.setTopGlowOffset(i15);
                    int i16 = (int) (fr0Var.f26389u0 + f7);
                    fr0Var.f26383q0 = i16;
                    hq0Var3.setTopGlowOffset(i16);
                    int i17 = (int) (f7 + fr0Var.f26389u0);
                    fr0Var.f26383q0 = i17;
                    jm0Var.setTopGlowOffset(i17);
                    fr0Var.f26365b.setTranslationY(fr0Var.f26383q0 + fr0Var.f26389u0);
                    fr0Var.R.setTranslationY(fr0Var.f26383q0 + fr0Var.f26389u0);
                    fr0Var.containerView.invalidate();
                }
            }
        }
    }

    public final void M0(boolean z10) {
        k20 k20Var = this.f26397z0;
        ei.e2 e2Var = k20Var.f27726r;
        ei.e2 e2Var2 = k20Var.f27726r;
        boolean isEmpty = TextUtils.isEmpty(e2Var.getText());
        hq0 hq0Var = this.G;
        hq0 hq0Var2 = this.H;
        boolean z11 = true;
        if (isEmpty && ((!this.keyboardVisible || !e2Var2.hasFocus()) && !this.N0)) {
            if (this.D0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(hq0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(hq0Var2, false);
            }
            z11 = false;
        } else {
            this.B0 = true;
            if (this.D0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(hq0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(hq0Var2, true);
            }
        }
        if (this.M0 == z11 && !z10) {
            return;
        }
        this.M0 = z11;
        br0 br0Var = this.N;
        br0Var.l();
        this.L.l();
        if (this.M0) {
            if (this.L0 == Integer.MAX_VALUE) {
                ((s4.b0) hq0Var2.getLayoutManager()).h1(0, -hq0Var2.getPaddingTop());
            } else {
                ((s4.b0) hq0Var2.getLayoutManager()).h1(0, this.L0 - hq0Var2.getPaddingTop());
            }
            br0Var.E(e2Var2.getText().toString());
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

    public final void N0() {
        float f7;
        TLRPC.Dialog dialog = this.D0;
        if (dialog != null) {
            org.telegram.ui.Cells.e7 e7Var = null;
            this.D0 = null;
            for (int i10 = 0; i10 < R0().getChildCount(); i10++) {
                View childAt = R0().getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.e7) && ((org.telegram.ui.Cells.e7) childAt).getCurrentDialog() == dialog.f20280id) {
                    e7Var = childAt;
                }
            }
            if (e7Var == null) {
                return;
            }
            o1.k kVar = this.C0;
            if (kVar != null) {
                kVar.c();
            }
            R0().setVisibility(0);
            k20 k20Var = this.f26397z0;
            k20Var.setVisibility(0);
            ei.e2 e2Var = k20Var.f27726r;
            if (this.M0 || this.N0) {
                this.E0.H.v = true;
                e2Var.requestFocus();
                AndroidUtilities.showKeyboard(e2Var);
            }
            int[] iArr = new int[2];
            o1.k kVar2 = new o1.k(new o1.j(1000.0f));
            o1.l lVar = new o1.l(0.0f);
            org.telegram.ui.qn qnVar = this.f26373g0;
            if (qnVar != null && qnVar.f40624b) {
                f7 = 10.0f;
            } else {
                f7 = 800.0f;
            }
            lVar.b(f7);
            lVar.a(1.0f);
            kVar2.f17559u = lVar;
            this.C0 = kVar2;
            kVar2.b(new wp0(this, e7Var, iArr, 0));
            this.C0.a(new hb(this, 5));
            this.C0.h();
        }
    }

    public final void O0() {
        boolean z10 = false;
        if (this.f26378l0 != null || this.f26382p0[0] != null) {
            try {
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", Q0()));
                uq0 uq0Var = this.f26388t0;
                if (uq0Var != null) {
                    uq0Var.g0();
                } else if (this.f26374h0 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f26378l0;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z10 = true;
                    }
                    ((LaunchActivity) this.f26374h0).H0(new i2.y(5, z10));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final String Q0() {
        String str;
        String str2;
        String[] strArr = this.f26382p0;
        rq0 rq0Var = this.X;
        if (rq0Var != null) {
            str2 = strArr[rq0Var.e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f26378l0;
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
        xp xpVar = this.f26372f0;
        if (xpVar != null && xpVar.f32458a.f24151q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.f26368c0)).build().toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final jm0 R0() {
        if (!this.M0 && !this.N0) {
            return this.G;
        }
        return this.H;
    }

    public final void S0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        jm0 jm0Var = this.F;
        jm0Var.setPivotX(width);
        jm0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        jm0Var.setScaleX(f11);
        jm0Var.setScaleY(f11);
        jm0Var.setAlpha(f7);
        jm0 R0 = R0();
        R0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        R0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        R0.setScaleX(f12);
        R0.setScaleY(f12);
        float f13 = 1.0f - f7;
        R0.setAlpha(f13);
        k20 k20Var = this.f26397z0;
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
        jm0Var.getLocationInWindow(iArr);
        float interpolation = bs.f25022g.getInterpolation(f7);
        for (int i10 = 0; i10 < R0.getChildCount(); i10++) {
            View childAt = R0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.e7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f7, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f13);
                }
            }
        }
        for (int i11 = 0; i11 < jm0Var.getChildCount(); i11++) {
            View childAt2 = jm0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.f7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y3 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((jm0Var.getTranslationY() + y3) - view.getY()))));
            }
        }
        this.containerView.requestLayout();
        R0.invalidate();
    }

    public final void V0(boolean z10) {
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
            animatorSetArr[0].addListener(new nq0(this, z10, 0));
            animatorSetArr[0].start();
        }
    }

    public final void W0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        fr0 fr0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        ar0 ar0Var;
        if (dialog instanceof wq0) {
            U0(view);
        } else if (((view instanceof org.telegram.ui.Cells.e7) && ((org.telegram.ui.Cells.e7) view).F) || ((view instanceof org.telegram.ui.Cells.h6) && ((org.telegram.ui.Cells.h6) view).f22351n0)) {
            Z0(dialog.f20280id, view);
        } else {
            jm0 jm0Var = this.F;
            if (jm0Var.getVisibility() == 8 && (activity = this.f26374h0) != null) {
                boolean isChatDialog = DialogObject.isChatDialog(dialog.f20280id);
                int i10 = this.Q;
                if (isChatDialog) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f20280id));
                    if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.f20280id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        String string = LocaleController.getString(R.string.SendMessageTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
                        b2Var.R = string;
                        if (i10 == 3) {
                            if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                            } else {
                                b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                            }
                        } else if (i10 == 2) {
                            if (this.f26381o0) {
                                b2Var.T = LocaleController.getString(R.string.PublicPollCantForward);
                            } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                            } else {
                                b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                            }
                        } else {
                            b2Var.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        i2.e.r(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                } else if (DialogObject.isEncryptedDialog(dialog.f20280id) && i10 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String string2 = LocaleController.getString(R.string.SendMessageTitle);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20605a;
                    b2Var2.R = string2;
                    if (i10 == 3) {
                        b2Var2.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i10 != 0) {
                        b2Var2.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        b2Var2.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    i2.e.r(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
                long j10 = dialog.f20280id;
                a0.h hVar = this.V;
                if (hVar.h(j10) >= 0) {
                    hVar.l(dialog.f20280id);
                    this.W.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.h6) {
                        ((org.telegram.ui.Cells.h6) view).t(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.e7) {
                        ((org.telegram.ui.Cells.e7) view).b(false, true);
                    }
                    c1(1);
                    fr0Var = this;
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.f20280id));
                    TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f20280id));
                    if ((!UserObject.isBotForum(user) || (((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f20423id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f20423id))) && (!DialogObject.isChatDialog(dialog.f20280id) || (!ChatObject.isForum(chat2) && (!ChatObject.isMonoForum(chat2) || !ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                        fr0Var = this;
                        hVar.k(dialog, dialog.f20280id);
                        if (view instanceof org.telegram.ui.Cells.h6) {
                            ((org.telegram.ui.Cells.h6) view).t(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.e7) {
                            ((org.telegram.ui.Cells.e7) view).b(true, true);
                        }
                        c1(2);
                        long j11 = UserConfig.getInstance(fr0Var.currentAccount).clientUserId;
                        if (fr0Var.M0) {
                            xq0 xq0Var = fr0Var.L;
                            a0.h hVar2 = xq0Var.e;
                            ArrayList arrayList = xq0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.f20280id);
                            if (dialog2 == null) {
                                xq0Var.e.k(dialog, dialog.f20280id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f20280id != j11) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            xq0Var.l();
                            fr0Var.B0 = false;
                            k20 k20Var = fr0Var.f26397z0;
                            k20Var.f27726r.setText("");
                            M0(false);
                            AndroidUtilities.hideKeyboard(k20Var.f27726r);
                        }
                    } else {
                        this.D0 = dialog;
                        this.J.h1(0, this.f26383q0 - jm0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        lq0 lq0Var = new lq0(this, dialog, atomicReference, view);
                        atomicReference.set(new i90(this, atomicReference, lq0Var, dialog, 5));
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                        int i11 = NotificationCenter.topicsDidLoaded;
                        notificationCenter.addObserver(lq0Var, i11);
                        if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.f20280id) != null) {
                            lq0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.f20280id));
                            return;
                        }
                        MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.f20280id);
                        AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                br0 br0Var = fr0Var.N;
                if (br0Var != null && (ar0Var = br0Var.H) != null) {
                    ar0Var.q(0, ar0Var.h());
                }
            }
        }
    }

    public final void X0(final boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            a0.h hVar = this.V;
            int m10 = hVar.m();
            iq0 iq0Var = this.f26367c;
            jq0 jq0Var = this.d;
            boolean z11 = true;
            if (i14 < m10) {
                long j10 = hVar.j(i14);
                if (f5.g(getContext(), this.currentAccount, j10, (iq0Var.getTag() == null || jq0Var.f29709a.length() <= 0) ? false : false)) {
                    return;
                }
                i14++;
            } else {
                Editable text = jq0Var.getText();
                lu luVar = jq0Var.f29709a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                xp xpVar = this.f26372f0;
                if (xpVar != null && xpVar.f32458a.f24151q) {
                    i10 = this.f26368c0;
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
                        if (iq0Var.getTag() != null && luVar.length() > 0 && sendPaidMessagesStars > 0) {
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
                    rq0 rq0Var = this.X;
                    if (rq0Var != null) {
                        i11 = rq0Var.e;
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
                            if (this.G0 != null && iq0Var.getTag() != null && luVar.length() > 0 && charSequenceArr[i18] != null && sendPaidMessagesStars2 > 0) {
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
                                if (iq0Var.getTag() != null && luVar.length() > 0 && sendPaidMessagesStars3 > 0) {
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
                f5.b0(this.currentAccount, arrayList, i12, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        fr0.p(fr0.this, charSequenceArr, entities, z10, i23, (HashMap) obj);
                    }
                });
                return;
            }
        }
    }

    public final void Y0(boolean z10) {
        boolean z11;
        Integer num;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        iq0 iq0Var = this.f26367c;
        if (iq0Var.getTag() != null) {
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
        iq0Var.setTag(num);
        jq0 jq0Var = this.d;
        if (jq0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(jq0Var.getEditText());
        }
        jq0Var.k(true);
        FrameLayout frameLayout = this.f26369d0;
        iq0 iq0Var2 = this.f26371f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            iq0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            iq0Var2.setVisibility(0);
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
            WeakHashMap weakHashMap = r0.i0.f44826a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.f26395y;
        if (linearLayout != null) {
            if (!z10) {
                i11 = 1;
            }
            WeakHashMap weakHashMap2 = r0.i0.f44826a;
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
        arrayList.add(ObjectAnimator.ofFloat(iq0Var, property, f7));
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
        arrayList.add(ObjectAnimator.ofFloat(iq0Var2, property2, f10));
        Property property3 = View.SCALE_Y;
        if (z10) {
            f16 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(iq0Var2, property3, f16));
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(iq0Var2, property, f11));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.T[1];
            if (!z10) {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
        }
        FrameLayout frameLayout3 = this.f26386s;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.f26375i0 && z10) {
                if (this.f26370e0 != null) {
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
        this.E.addListener(new nq0(this, z10, 1));
        this.E.start();
    }

    public final void Z0(long j10, View view) {
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
        FrameLayout frameLayout = this.f26391w;
        if (premiumFeaturesBlocked) {
            J = new xc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = new xc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new zp0(this, 1));
        }
        J.j();
    }

    public final void a1() {
        org.telegram.ui.ActionBar.o1 o1Var;
        iq0 iq0Var = this.f26367c;
        if (iq0Var == null) {
            return;
        }
        jq0 jq0Var = this.d;
        if (jq0Var != null && jq0Var.m()) {
            jq0Var.getEmojiPaddingShown();
        } else {
            pq0 pq0Var = this.E0;
            if (pq0Var != null && (o1Var = pq0Var.H) != null && !o1Var.f21636f) {
                AndroidUtilities.dp(20.0f);
            }
        }
        float f7 = 0.0f;
        FrameLayout frameLayout = this.f26369d0;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f7 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f7);
        }
        float f10 = -f7;
        iq0Var.setTranslationY(f10);
        this.f26371f.setTranslationY(f10);
    }

    public final void b1() {
        org.telegram.ui.ActionBar.j5 j5Var = this.v;
        if (j5Var != null) {
            String Q0 = Q0();
            if (Q0.startsWith("https://")) {
                Q0 = Q0.substring(8);
            } else if (Q0.startsWith("http://")) {
                Q0 = Q0.substring(7);
            }
            j5Var.k(Q0);
        }
    }

    public final void c1(int i10) {
        int size;
        boolean z10;
        boolean z11;
        a0.h hVar = this.V;
        if (hVar.m() == 0) {
            Y0(false);
            return;
        }
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        Object tag = this.f26367c.getTag();
        jq0 jq0Var = this.d;
        if (tag != null && jq0Var.f29709a.length() > 0) {
            size++;
        }
        long j10 = 0;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            long j11 = ((TLRPC.Dialog) hVar.n(i11)).f20280id;
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
        Y0(true);
        jq0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), y1Var.l()), 0);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            xq0 xq0Var = this.L;
            if (xq0Var != null) {
                xq0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override
    public final void dismiss() {
        jq0 jq0Var = this.d;
        if (jq0Var != null) {
            AndroidUtilities.hideKeyboard(jq0Var.getEditText());
        }
        this.Z = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        jq0 jq0Var = this.d;
        if (jq0Var != null) {
            jq0Var.o();
        }
    }

    @Override
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.Y;
    }

    @Override
    public final void onBackPressed() {
        if (this.D0 != null) {
            N0();
            return;
        }
        jq0 jq0Var = this.d;
        if (jq0Var != null && jq0Var.e) {
            jq0Var.k(true);
        } else {
            super.onBackPressed();
        }
    }

    public fr0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    public fr0(android.content.Context r37, org.telegram.ui.qn r38, java.util.ArrayList r39, java.lang.String r40, java.lang.String r41, boolean r42, java.lang.String r43, java.lang.String r44, boolean r45, boolean r46, boolean r47, java.lang.Integer r48, org.telegram.ui.ActionBar.d6 r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fr0.<init>(android.content.Context, org.telegram.ui.qn, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.d6):void");
    }

    public void U0(View view) {
    }

    public void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
