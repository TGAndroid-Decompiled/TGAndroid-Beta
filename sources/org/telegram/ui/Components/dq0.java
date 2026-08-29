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
public class dq0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int W0 = 0;
    public final jl0 A;
    public ArrayList A0;
    public final dp0 B;
    public TL_stories.StoryItem B0;
    public final dp0 C;
    public i0.b C0;
    public final f2.w D;
    public int D0;
    public final f2.w E;
    public boolean E0;
    public final jz F;
    public org.telegram.ui.ActionBar.o1 F0;
    public final up0 G;
    public int G0;
    public final aq0 H;
    public boolean H0;
    public final zp0 I;
    public boolean I0;
    public final ArrayList J;
    public int J0;
    public final String[] K;
    public final lg.e K0;
    public final int L;
    public final qg.d L0;
    public final qw0 M;
    public final qg.d M0;
    public final Drawable N;
    public final lg.a N0;
    public final View[] O;
    public final lg.a O0;
    public final AnimatorSet[] P;
    public final lg.a P0;
    public final a0.h Q;
    public final lg.k Q0;
    public final HashMap R;
    public final ng.d R0;
    public final op0 S;
    public final lg.b S0;
    public int T;
    public final ng.d T0;
    public boolean U;
    public final ArrayList U0;
    public final boolean V;
    public final RectF V0;
    public boolean W;
    public final int X;
    public final FrameLayout Y;
    public final LinearLayout Z;
    public final hp f27827a0;
    public final FrameLayout f27828b;
    public final org.telegram.ui.tn f27829b0;
    public final fp0 f27830c;
    public final Activity f27831c0;
    public final gp0 d;
    public final boolean f27832d0;
    public final hp0 f27833e;
    public boolean f27834e0;
    public final fp0 f27835f;
    public final TextPaint f27836f0;
    public TLRPC.TL_exportedMessageLink f27837g0;
    public final FrameLayout h;
    public boolean f27838h0;
    public boolean f27839i0;
    public final boolean f27840j0;
    public final String[] f27841k0;
    public int f27842l0;
    public int m0;
    public final cg.h0 f27843n;
    public boolean f27844n0;
    public rp0 f27845o0;
    public float f27846p0;
    public float f27847q0;
    public final FrameLayout f27848r;
    public float f27849r0;
    public final org.telegram.ui.ActionBar.h5 f27850s;
    public ValueAnimator f27851s0;
    public final pk0 f27852t0;
    public final x10 f27853u0;
    public final FrameLayout v;
    public final org.telegram.ui.ActionBar.l f27854v0;
    public final FrameLayout f27855w;
    public boolean f27856w0;
    public final LinearLayout f27857x;
    public o1.k f27858x0;
    public AnimatorSet f27859y;
    public TLRPC.Dialog f27860y0;
    public final np0 f27861z0;

    public dq0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, c6Var);
    }

    public static void A0(dq0 dq0Var) {
        float f9;
        RectF rectF = dq0Var.V0;
        lg.e eVar = dq0Var.K0;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            rectF.set(0.0f, 0.0f, dq0Var.containerView.getMeasuredWidth(), dq0Var.containerView.getMeasuredHeight());
            if (LiteMode.isEnabled(262144)) {
                f9 = 0.0f;
            } else {
                f9 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f9);
            eVar.g(1, dq0Var.U0);
            eVar.e(dq0Var.Q0, dq0Var.containerView.getMeasuredWidth(), dq0Var.containerView.getMeasuredHeight());
        }
    }

    public static int F0(dq0 dq0Var) {
        dp0 dp0Var = dq0Var.B;
        if (dp0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = dp0Var.getChildAt(0);
            vk0 vk0Var = (vk0) dp0Var.G(childAt);
            if (vk0Var != null) {
                int paddingTop = dp0Var.getPaddingTop();
                if (vk0Var.c() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    public static dq0 N0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        ArrayList arrayList;
        if (messageObject != null) {
            arrayList = org.telegram.messenger.x3.n(messageObject);
        } else {
            arrayList = null;
        }
        return new dq0(context, arrayList, str, null, z10, str2, null, false);
    }

    public static void m(dq0 dq0Var, AtomicReference atomicReference, jp0 jp0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        jp0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, dq0Var.currentAccount, Long.valueOf(-dialog.f22396id));
    }

    public static boolean n(final dq0 dq0Var) {
        int measuredHeight;
        org.telegram.ui.tn tnVar;
        hp0 hp0Var = dq0Var.f27833e;
        boolean z10 = dq0Var.f27832d0;
        Activity activity = dq0Var.f27831c0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(dq0Var.getContext());
        linearLayout.setOrientation(1);
        if (dq0Var.J != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, dq0Var.resourcesProvider);
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23108fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new kp0(dq0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new vo0(dq0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, dq0Var.getContext(), dq0Var.resourcesProvider, true, false);
            if (z10) {
                g1Var.setTextColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23251ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, i7.f6.n(-1, 48));
            g1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            dq0Var.E0 = true;
            g1Var.setChecked(true);
            final org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(1, dq0Var.getContext(), dq0Var.resourcesProvider, false, true);
            if (z10) {
                g1Var2.setTextColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23251ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, i7.f6.n(-1, 48));
            g1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            g1Var2.setChecked(!dq0Var.E0);
            g1Var.setOnClickListener(new View.OnClickListener(dq0Var) {
                public final dq0 f35381b;

                {
                    this.f35381b = dq0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            dq0 dq0Var2 = this.f35381b;
                            dq0Var2.E0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!dq0Var2.E0);
                            return;
                        default:
                            dq0 dq0Var3 = this.f35381b;
                            dq0Var3.E0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!dq0Var3.E0);
                            return;
                    }
                }
            });
            g1Var2.setOnClickListener(new View.OnClickListener(dq0Var) {
                public final dq0 f35381b;

                {
                    this.f35381b = dq0Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            dq0 dq0Var2 = this.f35381b;
                            dq0Var2.E0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!dq0Var2.E0);
                            return;
                        default:
                            dq0 dq0Var3 = this.f35381b;
                            dq0Var3.E0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!dq0Var3.E0);
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, i7.f6.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, dq0Var.resourcesProvider);
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23108fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new kp0(dq0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new vo0(dq0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, dq0Var.getContext(), dq0Var.resourcesProvider, true, true);
        if (z10) {
            g1Var3.setTextColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23251ng));
            g1Var3.setIconColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.H6));
        }
        g1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        g1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var3, i7.f6.n(-1, 48));
        g1Var3.setOnClickListener(new uo0(dq0Var, 1));
        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, dq0Var.getContext(), dq0Var.resourcesProvider, true, true);
        if (z10) {
            g1Var4.setTextColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23251ng));
            g1Var4.setIconColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.H6));
        }
        g1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        g1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var4, i7.f6.n(-1, 48));
        g1Var4.setOnClickListener(new uo0(dq0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, i7.f6.n(-1, -2));
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(linearLayout, -2, -2);
        dq0Var.F0 = o1Var;
        o1Var.f23710b = false;
        o1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        dq0Var.F0.setOutsideTouchable(true);
        dq0Var.F0.setClippingEnabled(true);
        dq0Var.F0.setInputMethodMode(2);
        dq0Var.F0.setSoftInputMode(0);
        dq0Var.F0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        dq0Var.F0.setFocusable(true);
        int[] iArr = new int[2];
        hp0Var.getLocationInWindow(iArr);
        if (dq0Var.keyboardVisible && (tnVar = dq0Var.f27829b0) != null && tnVar.T0.getMeasuredHeight() > AndroidUtilities.dp(58.0f)) {
            measuredHeight = hp0Var.getMeasuredHeight() + iArr[1];
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
        }
        dq0Var.F0.showAtLocation(hp0Var, 51, AndroidUtilities.dp(8.0f) + ((hp0Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
        dq0Var.F0.b();
        try {
            hp0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void o(dq0 dq0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
        int i11;
        int i12;
        boolean z11;
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
        fp0 fp0Var;
        long j13;
        long j14;
        Long l13;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue4;
        String charSequence3;
        long longValue5;
        String[] strArr2 = dq0Var.K;
        gp0 gp0Var = dq0Var.d;
        fp0 fp0Var2 = dq0Var.f27830c;
        HashMap hashMap2 = dq0Var.R;
        Long l14 = 0L;
        a0.h hVar = dq0Var.Q;
        ArrayList arrayList3 = dq0Var.J;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i14 = 0;
            boolean z12 = false;
            while (true) {
                if (i14 < hVar.m()) {
                    long j15 = hVar.j(i14);
                    boolean isMonoForum = MessagesController.getInstance(dq0Var.currentAccount).isMonoForum(j15);
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
                        fp0Var = fp0Var2;
                        j13 = j15;
                        j14 = DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    } else {
                        fp0Var = fp0Var2;
                        j13 = j15;
                        j14 = 0;
                    }
                    if (tL_forumTopic3 != null && !isMonoForum) {
                        l13 = l14;
                        messageObject3 = new MessageObject(dq0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    } else {
                        l13 = l14;
                        messageObject3 = null;
                    }
                    if (messageObject3 != null) {
                        messageObject3.isTopicMainMessage = true;
                    }
                    if (fp0Var.getTag() != null && gp0Var.f26882a.length() > 0) {
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
                        SendMessagesHelper.getInstance(dq0Var.currentAccount).sendMessage(of3);
                    } else {
                        messageObject4 = messageObject3;
                        arrayList2 = arrayList3;
                    }
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(dq0Var.currentAccount);
                    ArrayList<MessageObject> arrayList5 = dq0Var.J;
                    boolean z13 = !dq0Var.E0;
                    if (l12 == null) {
                        longValue4 = 0;
                    } else {
                        longValue4 = l12.longValue();
                    }
                    long j16 = j13;
                    int sendMessage = sendMessagesHelper.sendMessage(arrayList5, j16, z13, false, z10, 0, 0, messageObject4, i10, longValue4, j14, null);
                    if (sendMessage != 0) {
                        arrayList4.add(Long.valueOf(j16));
                    }
                    if (hVar.m() == 1) {
                        tL_forumTopic = null;
                        c5.t0(sendMessage, dq0Var.f27829b0, null);
                        if (sendMessage != 0) {
                            break;
                        }
                    }
                    i14++;
                    arrayList3 = arrayList2;
                    fp0Var2 = fp0Var;
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
                dq0Var.R0(hVar, size2, tL_forumTopic2, !z12);
            }
        } else {
            op0 op0Var = dq0Var.S;
            if (op0Var != null) {
                i11 = op0Var.d;
            } else {
                i11 = 0;
            }
            if (dq0Var.B0 != null) {
                int i16 = 0;
                boolean z14 = false;
                while (i16 < hVar.m()) {
                    long j17 = hVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(dq0Var.currentAccount).isMonoForum(j17);
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
                        i13 = i11;
                        j12 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                    } else {
                        i13 = i11;
                        j12 = 0;
                    }
                    if (tL_forumTopic4 != null && !isMonoForum2) {
                        strArr = strArr2;
                        messageObject2 = new MessageObject(dq0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                    } else {
                        strArr = strArr2;
                        messageObject2 = null;
                    }
                    if (dq0Var.B0 == null) {
                        if (fp0Var2.getTag() != null && gp0Var.f26882a.length() > 0) {
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
                        if (fp0Var2.getTag() != null && gp0Var.f26882a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(dq0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j17, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j17, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = dq0Var.B0;
                    }
                    if (l11 == null) {
                        longValue3 = 0;
                    } else {
                        longValue3 = l11.longValue();
                    }
                    of2.payStars = longValue3;
                    of2.monoForumPeer = j12;
                    SendMessagesHelper.getInstance(dq0Var.currentAccount).sendMessage(of2);
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
                        boolean isMonoForum3 = MessagesController.getInstance(dq0Var.currentAccount).isMonoForum(j18);
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
                            c3 = 0;
                            messageObject = new MessageObject(dq0Var.currentAccount, tL_forumTopic5.topicStartMessage, false, false);
                        } else {
                            c3 = 0;
                            messageObject = null;
                        }
                        if (fp0Var2.getTag() != null && gp0Var.f26882a.length() > 0) {
                            CharSequence charSequence6 = charSequenceArr[c3];
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
                            SendMessagesHelper.getInstance(dq0Var.currentAccount).sendMessage(of4);
                        } else {
                            j11 = j18;
                        }
                        SendMessagesHelper.SendMessageParams of5 = SendMessagesHelper.SendMessageParams.of(strArr2[i17], j11, messageObject, messageObject, null, true, null, null, null, z10, 0, 0, null, false);
                        if (l10 == null) {
                            longValue = 0;
                        } else {
                            longValue = l10.longValue();
                        }
                        of5.payStars = longValue;
                        of5.monoForumPeer = j10;
                        SendMessagesHelper.getInstance(dq0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z15;
                } else {
                    i12 = 0;
                    z11 = false;
                    dq0Var.R0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i12)), !z11);
                }
            }
            i12 = 0;
            dq0Var.R0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i12)), !z11);
        }
        rp0 rp0Var = dq0Var.f27845o0;
        if (rp0Var != null) {
            rp0Var.M();
        }
        dq0Var.dismiss();
    }

    public static void p(dq0 dq0Var, int i10) {
        TLRPC.Dialog dialog;
        x10 x10Var = dq0Var.f27853u0;
        HashMap hashMap = dq0Var.R;
        a0.h hVar = dq0Var.Q;
        up0 up0Var = dq0Var.G;
        aq0 aq0Var = dq0Var.H;
        if (aq0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = dq0Var.f27860y0;
            if (dialog2 != null) {
                hVar.k(dialog2, dialog2.f22396id);
                hashMap.remove(dialog2);
                dq0Var.a1(2);
                if (dq0Var.H0 || dq0Var.I0) {
                    if (((TLRPC.Dialog) up0Var.f33289e.f(dialog2.f22396id)) == null) {
                        up0Var.f33289e.k(dialog2, dialog2.f22396id);
                        ArrayList arrayList = up0Var.d;
                        arrayList.add(!arrayList.isEmpty(), dialog2);
                    }
                    up0Var.l();
                    dq0Var.f27856w0 = false;
                    x10Var.f34546r.setText("");
                    dq0Var.K0(false);
                }
                for (int i11 = 0; i11 < dq0Var.P0().getChildCount(); i11++) {
                    View childAt = dq0Var.P0().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.c7) {
                        org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) childAt;
                        if (c7Var.getCurrentDialog() == dq0Var.f27860y0.f22396id) {
                            c7Var.d(null, false, true);
                            c7Var.b(true, true);
                        }
                    }
                }
                dq0Var.L0();
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic E = aq0Var.E(i10);
        if (E != null && (dialog = dq0Var.f27860y0) != null) {
            long j10 = dialog.f22396id;
            boolean isMonoForum = MessagesController.getInstance(dq0Var.currentAccount).isMonoForum(j10);
            TLRPC.Dialog dialog3 = dq0Var.f27860y0;
            hVar.k(dialog3, j10);
            hashMap.put(dialog3, E);
            dq0Var.a1(2);
            if (dq0Var.H0 || dq0Var.I0) {
                if (((TLRPC.Dialog) up0Var.f33289e.f(dialog3.f22396id)) == null) {
                    up0Var.f33289e.k(dialog3, dialog3.f22396id);
                    ArrayList arrayList2 = up0Var.d;
                    arrayList2.add(!arrayList2.isEmpty(), dialog3);
                }
                up0Var.l();
                dq0Var.f27856w0 = false;
                x10Var.f34546r.setText("");
                dq0Var.K0(false);
            }
            for (int i12 = 0; i12 < dq0Var.P0().getChildCount(); i12++) {
                View childAt2 = dq0Var.P0().getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.c7) {
                    org.telegram.ui.Cells.c7 c7Var2 = (org.telegram.ui.Cells.c7) childAt2;
                    if (c7Var2.getCurrentDialog() == dq0Var.f27860y0.f22396id) {
                        c7Var2.d(E, isMonoForum, true);
                        c7Var2.b(true, true);
                    }
                }
            }
            dq0Var.L0();
        }
    }

    public static void s0(dq0 dq0Var) {
        dp0 dp0Var;
        int i10;
        int i11;
        dp0 dp0Var2 = dq0Var.B;
        dp0 dp0Var3 = dq0Var.C;
        jl0 jl0Var = dq0Var.A;
        if (!dq0Var.f27844n0) {
            if (dq0Var.H0) {
                dp0Var = dp0Var3;
            } else {
                dp0Var = dp0Var2;
            }
            if (dp0Var.getChildCount() > 0) {
                View childAt = dp0Var.getChildAt(0);
                for (int i12 = 0; i12 < dp0Var.getChildCount(); i12++) {
                    if (dp0Var.getChildAt(i12).getTop() < childAt.getTop()) {
                        childAt = dp0Var.getChildAt(i12);
                    }
                }
                vk0 vk0Var = (vk0) dp0Var.G(childAt);
                int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
                if (top > 0 && vk0Var != null && vk0Var.b() == 0) {
                    i10 = top;
                } else {
                    i10 = 0;
                }
                if (top >= 0 && vk0Var != null && vk0Var.b() == 0) {
                    dq0Var.G0 = childAt.getTop();
                    dq0Var.T0(false);
                } else {
                    dq0Var.G0 = Integer.MAX_VALUE;
                    dq0Var.T0(true);
                    top = i10;
                }
                if (jl0Var.getVisibility() == 0) {
                    if (jl0Var.getChildCount() > 0) {
                        View childAt2 = jl0Var.getChildAt(0);
                        for (int i13 = 0; i13 < jl0Var.getChildCount(); i13++) {
                            if (jl0Var.getChildAt(i13).getTop() < childAt2.getTop()) {
                                childAt2 = jl0Var.getChildAt(i13);
                            }
                        }
                        vk0 vk0Var2 = (vk0) jl0Var.G(childAt2);
                        int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
                        if (top2 > 0 && vk0Var2 != null && vk0Var2.b() == 0) {
                            i11 = top2;
                        } else {
                            i11 = 0;
                        }
                        if (top2 >= 0 && vk0Var2 != null && vk0Var2.b() == 0) {
                            dq0Var.G0 = childAt2.getTop();
                            dq0Var.T0(false);
                        } else {
                            dq0Var.G0 = Integer.MAX_VALUE;
                            dq0Var.T0(true);
                            top2 = i11;
                        }
                        top = AndroidUtilities.lerp(top, top2, jl0Var.getAlpha());
                    } else {
                        return;
                    }
                }
                int i14 = dq0Var.f27842l0;
                if (i14 != top) {
                    dq0Var.m0 = i14;
                    float f9 = top;
                    int i15 = (int) (dq0Var.f27846p0 + f9);
                    dq0Var.f27842l0 = i15;
                    dp0Var2.setTopGlowOffset(i15);
                    int i16 = (int) (dq0Var.f27846p0 + f9);
                    dq0Var.f27842l0 = i16;
                    dp0Var3.setTopGlowOffset(i16);
                    int i17 = (int) (f9 + dq0Var.f27846p0);
                    dq0Var.f27842l0 = i17;
                    jl0Var.setTopGlowOffset(i17);
                    dq0Var.f27828b.setTranslationY(dq0Var.f27842l0 + dq0Var.f27846p0);
                    dq0Var.M.setTranslationY(dq0Var.f27842l0 + dq0Var.f27846p0);
                    dq0Var.containerView.invalidate();
                }
            }
        }
    }

    public final void K0(boolean z10) {
        x10 x10Var = this.f27853u0;
        ig.f fVar = x10Var.f34546r;
        ig.f fVar2 = x10Var.f34546r;
        boolean isEmpty = TextUtils.isEmpty(fVar.getText());
        dp0 dp0Var = this.B;
        dp0 dp0Var2 = this.C;
        boolean z11 = true;
        if (isEmpty && ((!this.keyboardVisible || !fVar2.hasFocus()) && !this.I0)) {
            if (this.f27860y0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(dp0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(dp0Var2, false);
            }
            z11 = false;
        } else {
            this.f27856w0 = true;
            if (this.f27860y0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(dp0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(dp0Var2, true);
            }
        }
        if (this.H0 == z11 && !z10) {
            return;
        }
        this.H0 = z11;
        zp0 zp0Var = this.I;
        zp0Var.l();
        this.G.l();
        if (this.H0) {
            if (this.G0 == Integer.MAX_VALUE) {
                ((f2.j0) dp0Var2.getLayoutManager()).h1(0, -dp0Var2.getPaddingTop());
            } else {
                ((f2.j0) dp0Var2.getLayoutManager()).h1(0, this.G0 - dp0Var2.getPaddingTop());
            }
            zp0Var.E(fVar2.getText().toString());
            return;
        }
        int i10 = this.G0;
        f2.w wVar = this.D;
        if (i10 == Integer.MAX_VALUE) {
            wVar.h1(0, 0);
        } else {
            wVar.h1(0, 0);
        }
    }

    public final void L0() {
        float f9;
        TLRPC.Dialog dialog = this.f27860y0;
        if (dialog != null) {
            org.telegram.ui.Cells.c7 c7Var = null;
            this.f27860y0 = null;
            for (int i10 = 0; i10 < P0().getChildCount(); i10++) {
                View childAt = P0().getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.c7) && ((org.telegram.ui.Cells.c7) childAt).getCurrentDialog() == dialog.f22396id) {
                    c7Var = childAt;
                }
            }
            if (c7Var == null) {
                return;
            }
            o1.k kVar = this.f27858x0;
            if (kVar != null) {
                kVar.c();
            }
            P0().setVisibility(0);
            x10 x10Var = this.f27853u0;
            x10Var.setVisibility(0);
            ig.f fVar = x10Var.f34546r;
            if (this.H0 || this.I0) {
                this.f27861z0.D.v = true;
                fVar.requestFocus();
                AndroidUtilities.showKeyboard(fVar);
            }
            int[] iArr = new int[2];
            o1.k kVar2 = new o1.k(new ib.a(1000.0f));
            o1.l lVar = new o1.l(0.0f);
            org.telegram.ui.tn tnVar = this.f27829b0;
            if (tnVar != null && tnVar.f42749b) {
                f9 = 10.0f;
            } else {
                f9 = 800.0f;
            }
            lVar.b(f9);
            lVar.a(1.0f);
            kVar2.f19045u = lVar;
            this.f27858x0 = kVar2;
            kVar2.b(new to0(this, c7Var, iArr, 0));
            this.f27858x0.a(new db(this, 4));
            this.f27858x0.f();
        }
    }

    public final void M0() {
        boolean z10 = false;
        if (this.f27837g0 != null || this.f27841k0[0] != null) {
            try {
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
                rp0 rp0Var = this.f27845o0;
                if (rp0Var != null) {
                    rp0Var.r0();
                } else if (this.f27831c0 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f27837g0;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z10 = true;
                    }
                    ((LaunchActivity) this.f27831c0).D0(new j3.t(2, z10));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final String O0() {
        String str;
        String str2;
        String[] strArr = this.f27841k0;
        op0 op0Var = this.S;
        if (op0Var != null) {
            str2 = strArr[op0Var.d];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f27837g0;
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
        hp hpVar = this.f27827a0;
        if (hpVar != null && hpVar.f29211a.f26324q) {
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

    public final jl0 P0() {
        if (!this.H0 && !this.I0) {
            return this.B;
        }
        return this.C;
    }

    public final void Q0(View view, int[] iArr, float f9) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        jl0 jl0Var = this.A;
        jl0Var.setPivotX(width);
        jl0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f9;
        float f11 = 0.75f + f10;
        jl0Var.setScaleX(f11);
        jl0Var.setScaleY(f11);
        jl0Var.setAlpha(f9);
        jl0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        P0.setScaleX(f12);
        P0.setScaleY(f12);
        float f13 = 1.0f - f9;
        P0.setAlpha(f13);
        x10 x10Var = this.f27853u0;
        x10Var.setPivotX(x10Var.getWidth() / 2.0f);
        x10Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        x10Var.setScaleX(f14);
        x10Var.setScaleY(f14);
        x10Var.setAlpha(f13);
        org.telegram.ui.ActionBar.l lVar = this.f27854v0;
        lVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        lVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        lVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        lVar.setAlpha(f9);
        jl0Var.getLocationInWindow(iArr);
        float interpolation = jr.f29801g.getInterpolation(f9);
        for (int i10 = 0; i10 < P0.getChildCount(); i10++) {
            View childAt = P0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.c7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f9, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f13);
                }
            }
        }
        for (int i11 = 0; i11 < jl0Var.getChildCount(); i11++) {
            View childAt2 = jl0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.d7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y8 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((jl0Var.getTranslationY() + y8) - view.getY()))));
            }
        }
        this.containerView.requestLayout();
        P0.invalidate();
    }

    public final void T0(boolean z10) {
        Integer num;
        float f9;
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
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f9));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].addListener(new lp0(this, z10, 0));
            animatorSetArr[0].start();
        }
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        dq0 dq0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        yp0 yp0Var;
        if (dialog instanceof tp0) {
            S0(view);
        } else if (((view instanceof org.telegram.ui.Cells.c7) && ((org.telegram.ui.Cells.c7) view).B) || ((view instanceof org.telegram.ui.Cells.f6) && ((org.telegram.ui.Cells.f6) view).f24329j0)) {
            X0(dialog.f22396id, view);
        } else {
            jl0 jl0Var = this.A;
            if (jl0Var.getVisibility() == 8 && (activity = this.f27831c0) != null) {
                boolean isChatDialog = DialogObject.isChatDialog(dialog.f22396id);
                int i10 = this.L;
                if (isChatDialog) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f22396id));
                    if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.f22396id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        String string = LocaleController.getString(R.string.SendMessageTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        c2Var.N = string;
                        if (i10 == 3) {
                            if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                c2Var.P = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                            } else {
                                c2Var.P = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                            }
                        } else if (i10 == 2) {
                            if (this.f27840j0) {
                                c2Var.P = LocaleController.getString(R.string.PublicPollCantForward);
                            } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                                c2Var.P = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                            } else {
                                c2Var.P = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                            }
                        } else {
                            c2Var.P = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        j7.l1.u(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                } else if (DialogObject.isEncryptedDialog(dialog.f22396id) && i10 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String string2 = LocaleController.getString(R.string.SendMessageTitle);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                    c2Var2.N = string2;
                    if (i10 == 3) {
                        c2Var2.P = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i10 != 0) {
                        c2Var2.P = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        c2Var2.P = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    j7.l1.u(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
                long j10 = dialog.f22396id;
                a0.h hVar = this.Q;
                if (hVar.h(j10) >= 0) {
                    hVar.l(dialog.f22396id);
                    this.R.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.f6) {
                        ((org.telegram.ui.Cells.f6) view).s(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.c7) {
                        ((org.telegram.ui.Cells.c7) view).b(false, true);
                    }
                    a1(1);
                    dq0Var = this;
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.f22396id));
                    TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.f22396id));
                    if ((!UserObject.isBotForum(user) || (((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f22539id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f22539id))) && (!DialogObject.isChatDialog(dialog.f22396id) || (!ChatObject.isForum(chat2) && (!ChatObject.isMonoForum(chat2) || !ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                        dq0Var = this;
                        hVar.k(dialog, dialog.f22396id);
                        if (view instanceof org.telegram.ui.Cells.f6) {
                            ((org.telegram.ui.Cells.f6) view).s(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.c7) {
                            ((org.telegram.ui.Cells.c7) view).b(true, true);
                        }
                        a1(2);
                        long j11 = UserConfig.getInstance(dq0Var.currentAccount).clientUserId;
                        if (dq0Var.H0) {
                            up0 up0Var = dq0Var.G;
                            a0.h hVar2 = up0Var.f33289e;
                            ArrayList arrayList = up0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.f22396id);
                            if (dialog2 == null) {
                                up0Var.f33289e.k(dialog, dialog.f22396id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f22396id != j11) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            up0Var.l();
                            dq0Var.f27856w0 = false;
                            x10 x10Var = dq0Var.f27853u0;
                            x10Var.f34546r.setText("");
                            K0(false);
                            AndroidUtilities.hideKeyboard(x10Var.f34546r);
                        }
                    } else {
                        this.f27860y0 = dialog;
                        this.E.h1(0, this.f27842l0 - jl0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        jp0 jp0Var = new jp0(this, dialog, atomicReference, view);
                        atomicReference.set(new org.telegram.ui.gg(this, atomicReference, jp0Var, dialog, 24));
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                        int i11 = NotificationCenter.topicsDidLoaded;
                        notificationCenter.addObserver(jp0Var, i11);
                        if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.f22396id) != null) {
                            jp0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.f22396id));
                            return;
                        }
                        MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.f22396id);
                        AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                zp0 zp0Var = dq0Var.I;
                if (zp0Var != null && (yp0Var = zp0Var.D) != null) {
                    yp0Var.q(0, yp0Var.h());
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
            a0.h hVar = this.Q;
            int m10 = hVar.m();
            fp0 fp0Var = this.f27830c;
            gp0 gp0Var = this.d;
            boolean z11 = true;
            if (i13 < m10) {
                if (c5.h(getContext(), this.currentAccount, hVar.j(i13), (fp0Var.getTag() == null || gp0Var.f26882a.length() <= 0) ? false : false)) {
                    return;
                }
                i13++;
            } else {
                Editable text = gp0Var.getText();
                vt vtVar = gp0Var.f26882a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                hp hpVar = this.f27827a0;
                if (hpVar != null && hpVar.f29211a.f26324q) {
                    i10 = this.X;
                } else {
                    i10 = -1;
                }
                ArrayList arrayList = new ArrayList();
                if (this.J != null) {
                    i12 = 0;
                    for (int i14 = 0; i14 < hVar.m(); i14++) {
                        long j10 = hVar.j(i14);
                        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j10);
                        if (sendPaidMessagesStars <= 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j10));
                        }
                        if (fp0Var.getTag() != null && vtVar.length() > 0 && sendPaidMessagesStars > 0) {
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
                    op0 op0Var = this.S;
                    if (op0Var != null) {
                        i11 = op0Var.d;
                    } else {
                        i11 = 0;
                    }
                    if (this.B0 != null) {
                        int i16 = 0;
                        for (int i17 = 0; i17 < hVar.m(); i17++) {
                            long j11 = hVar.j(i17);
                            long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
                            if (sendPaidMessagesStars2 <= 0) {
                                sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
                            }
                            if (this.B0 != null && fp0Var.getTag() != null && vtVar.length() > 0 && charSequenceArr[0] != null && sendPaidMessagesStars2 > 0) {
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
                        if (this.K[i11] != null) {
                            for (int i20 = 0; i20 < hVar.m(); i20++) {
                                long j12 = hVar.j(i20);
                                long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j12);
                                if (sendPaidMessagesStars3 <= 0) {
                                    sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j12));
                                }
                                if (fp0Var.getTag() != null && vtVar.length() > 0 && sendPaidMessagesStars3 > 0) {
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
                c5.c0(this.currentAccount, arrayList, i12, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        dq0.o(dq0.this, charSequenceArr, entities, z10, i22, (HashMap) obj);
                    }
                });
                return;
            }
        }
    }

    public final void W0(boolean z10) {
        boolean z11;
        Integer num;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        fp0 fp0Var = this.f27830c;
        if (fp0Var.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.f27859y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        fp0Var.setTag(num);
        gp0 gp0Var = this.d;
        if (gp0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(gp0Var.getEditText());
        }
        gp0Var.k(true);
        FrameLayout frameLayout = this.Y;
        fp0 fp0Var2 = this.f27835f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            fp0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            fp0Var2.setVisibility(0);
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
            WeakHashMap weakHashMap = r0.j0.f46829a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.f27857x;
        if (linearLayout != null) {
            if (!z10) {
                i11 = 1;
            }
            WeakHashMap weakHashMap2 = r0.j0.f46829a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.f27859y = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f14 = 0.0f;
        float f15 = 1.0f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(fp0Var, property, f9));
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
        arrayList.add(ObjectAnimator.ofFloat(fp0Var2, property2, f10));
        Property property3 = View.SCALE_Y;
        if (z10) {
            f16 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(fp0Var2, property3, f16));
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(fp0Var2, property, f11));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.O[1];
            if (!z10) {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
        }
        FrameLayout frameLayout3 = this.f27848r;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.f27832d0 && z10) {
                if (this.Z != null) {
                    f12 = 5.0f;
                } else {
                    f12 = 16.0f;
                }
                f14 = AndroidUtilities.dp(f12);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, f14));
        }
        this.f27859y.playTogether(arrayList);
        this.f27859y.setInterpolator(new DecelerateInterpolator());
        this.f27859y.setDuration(180L);
        this.f27859y.addListener(new lp0(this, z10, 1));
        this.f27859y.start();
    }

    public final void X0(long j10, View view) {
        String str;
        mc J;
        int i10 = -this.D0;
        this.D0 = i10;
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
            J = new tc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = new tc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new wo0(this, 1));
        }
        J.j();
    }

    public final void Y0() {
        org.telegram.ui.ActionBar.q1 q1Var;
        fp0 fp0Var = this.f27830c;
        if (fp0Var == null) {
            return;
        }
        gp0 gp0Var = this.d;
        if (gp0Var != null && gp0Var.m()) {
            gp0Var.getEmojiPaddingShown();
        } else {
            np0 np0Var = this.f27861z0;
            if (np0Var != null && (q1Var = np0Var.D) != null && !q1Var.f23740f) {
                AndroidUtilities.dp(20.0f);
            }
        }
        float f9 = 0.0f;
        FrameLayout frameLayout = this.Y;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f9 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            float f10 = -f9;
            frameLayout2.setTranslationY(f10);
            LinearLayout linearLayout = this.f27857x;
            if (linearLayout != null) {
                linearLayout.setTranslationY(f10);
            }
        }
        float f11 = -f9;
        fp0Var.setTranslationY(f11);
        this.f27835f.setTranslationY(f11);
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.h5 h5Var = this.f27850s;
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

    public final void a1(int i10) {
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
        Object tag = this.f27830c.getTag();
        gp0 gp0Var = this.d;
        if (tag != null && gp0Var.f26882a.length() > 0) {
            size++;
        }
        long j10 = 0;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            long j11 = ((TLRPC.Dialog) hVar.n(i11)).f22396id;
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
        hp0 hp0Var = this.f27833e;
        hp0Var.g(max, z10);
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        hp0Var.i(size, j10, z11);
        W0(true);
        gp0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), hp0Var.l()), 0);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            up0 up0Var = this.G;
            if (up0Var != null) {
                up0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override
    public final void dismiss() {
        gp0 gp0Var = this.d;
        if (gp0Var != null) {
            AndroidUtilities.hideKeyboard(gp0Var.getEditText());
        }
        this.U = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        gp0 gp0Var = this.d;
        if (gp0Var != null) {
            gp0Var.o();
        }
    }

    @Override
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.T;
    }

    @Override
    public final void onBackPressed() {
        if (this.f27860y0 != null) {
            L0();
            return;
        }
        gp0 gp0Var = this.d;
        if (gp0Var != null && gp0Var.f26885e) {
            gp0Var.k(true);
        } else {
            super.onBackPressed();
        }
    }

    public dq0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    public dq0(android.content.Context r39, org.telegram.ui.tn r40, java.util.ArrayList r41, java.lang.String r42, java.lang.String r43, boolean r44, java.lang.String r45, java.lang.String r46, boolean r47, boolean r48, boolean r49, java.lang.Integer r50, org.telegram.ui.ActionBar.c6 r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dq0.<init>(android.content.Context, org.telegram.ui.tn, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.c6):void");
    }

    public void S0(View view) {
    }

    public void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
