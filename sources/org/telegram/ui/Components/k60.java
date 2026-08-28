package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public class k60 extends s51 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.h P;
    public final j60 Q;
    public final org.telegram.ui.ActionBar.w1 R;
    public final g60 S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public AnimatorSet Z;
    public final ArrayList f29974a0;
    public final a0.h f29975b0;
    public boolean f29976c0;
    public float f29977d0;
    public ValueAnimator f29978e0;
    public w20 f29979f0;
    public int f29980g0;
    public org.telegram.ui.f60 f29981h0;
    public org.telegram.ui.wt f29982i0;
    public ArrayList f29983j0;
    public int f29984k0;
    public final float f29985l0;
    public final org.telegram.ui.ActionBar.o2 m0;
    public final androidx.mediarouter.app.y f29986n0;
    public int f29987o0;
    public final j10 f29988p0;
    public int f29989q0;
    public final long f29990r0;
    public boolean f29991s0;
    public float f29992t0;
    public boolean f29993u0;
    public TLRPC.TL_chatInviteExported f29994v0;

    public k60(Context context, int i9, a0.h hVar, long j10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, b6Var);
        this.f29974a0 = new ArrayList();
        this.f29975b0 = new a0.h();
        this.f29977d0 = 0.0f;
        this.f29986n0 = new androidx.mediarouter.app.y(this, 9);
        this.P = hVar;
        this.C = false;
        this.m0 = o2Var;
        this.f29990r0 = j10;
        fixNavigationBar();
        this.f32376w.F.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f29985l0 = ViewConfiguration.get(context).getScaledTouchSlop();
        g60 g60Var = new g60(this);
        this.S = g60Var;
        this.f32371e = g60Var;
        gh.f1 f1Var = this.d;
        e60 e60Var = new e60(this);
        this.f32372f = e60Var;
        f1Var.setAdapter(e60Var);
        this.f32375s.e(false, false);
        this.f32375s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i9).contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f29974a0.add(user);
            }
        }
        j60 j60Var = new j60(this, context);
        this.Q = j60Var;
        this.d.setOnItemClickListener(new org.telegram.ui.qb(this, j10, o2Var, hVar, context));
        gh.f1 f1Var2 = this.d;
        f2.n nVar = new f2.n();
        nVar.f5449o = gr.f28844f;
        nVar.f5549e = 150L;
        nVar.f5548c = 150L;
        nVar.d = 150L;
        setShowWithoutAnimation(false);
        f1Var2.setItemAnimator(nVar);
        a0();
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(this, context, 1);
        this.R = w1Var;
        w1Var.setVisibility(8);
        w1Var.setClipChildren(false);
        w1Var.addView(j60Var);
        this.containerView.addView(w1Var);
        j10 j10Var = new j10(context, b6Var, false);
        this.f29988p0 = j10Var;
        j10Var.setImageResource(R.drawable.floating_check);
        j10Var.setOnClickListener(new gh.s2(this, context, j10, 4));
        j10Var.e(false, false);
        j10Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(j10Var, j10.b());
        ((ViewGroup.MarginLayoutParams) this.f32375s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f32375s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f32375s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void L(org.telegram.ui.Components.k60 r4, long r5, org.telegram.ui.ActionBar.o2 r7, a0.h r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k60.L(org.telegram.ui.Components.k60, long, org.telegram.ui.ActionBar.o2, a0.h, android.content.Context, int):void");
    }

    public static void M(k60 k60Var, Context context, long j10) {
        Activity findActivity;
        a0.h hVar = k60Var.f29975b0;
        if ((k60Var.f29982i0 == null && hVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (k60Var.f29982i0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < hVar.m(); i9++) {
                arrayList.add(Long.valueOf(hVar.j(i9)));
            }
            org.telegram.ui.my myVar = (org.telegram.ui.my) k60Var.f29982i0.f44257b;
            ArrayList arrayList2 = myVar.f40549e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            myVar.Y();
            org.telegram.ui.ly lyVar = myVar.f40550f;
            if (lyVar != null) {
                lyVar.a();
            }
            k60Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", hVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            TLRPC.User user = MessagesController.getInstance(k60Var.currentAccount).getUser(Long.valueOf(hVar.j(i10)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(k60Var.currentAccount).getChat(Long.valueOf(j10));
        if (hVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", hVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(hVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            c2Var.P = spannableStringBuilder;
        } else {
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new wu(k60Var, 6));
        j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void N(k60 k60Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            k60Var.f29994v0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(k60Var.currentAccount).getChatFull(k60Var.f29990r0);
            if (chatFull != null) {
                chatFull.exported_invite = k60Var.f29994v0;
            }
            if (k60Var.f29994v0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", k60Var.f29994v0.link));
            oc.j(k60Var.m0).j();
            k60Var.dismiss();
        }
        k60Var.f29993u0 = false;
    }

    public static void O(k60 k60Var, ValueAnimator valueAnimator) {
        k60Var.f29977d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        k60Var.containerView.invalidate();
    }

    public static void P(k60 k60Var) {
        a0.h hVar = k60Var.f29975b0;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < hVar.m(); i9++) {
            arrayList.add(MessagesController.getInstance(k60Var.currentAccount).getUser(Long.valueOf(hVar.j(i9))));
        }
        org.telegram.ui.f60 f60Var = k60Var.f29981h0;
        if (f60Var != null) {
            f60Var.j(0, arrayList);
        }
        k60Var.dismiss();
    }

    public static ViewGroup T(k60 k60Var) {
        return k60Var.containerView;
    }

    public static ViewGroup V(k60 k60Var) {
        return k60Var.containerView;
    }

    @Override
    public final q51 C(Context context) {
        return new b60(this, context);
    }

    @Override
    public final void D(MotionEvent motionEvent, fg.g gVar) {
        org.telegram.ui.ActionBar.o2 o2Var;
        long j10;
        if (motionEvent.getAction() == 0) {
            this.f29992t0 = this.f32378y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f32378y - this.f29992t0) < this.f29985l0 && !this.f29991s0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                o2Var = (org.telegram.ui.ActionBar.o2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                o2Var = null;
            }
            if (o2Var instanceof org.telegram.ui.qn) {
                boolean P9 = ((org.telegram.ui.qn) o2Var).P9();
                this.f29991s0 = true;
                zq zqVar = new zq(23, this, gVar);
                if (P9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(zqVar, j10);
                return;
            }
            this.f29991s0 = true;
            setFocusable(true);
            gVar.requestFocus();
            AndroidUtilities.runOnUIThread(new p1(2, gVar));
        }
    }

    @Override
    public final void F(String str) {
        g60 g60Var = this.S;
        if (g60Var.h != null) {
            Utilities.searchQueue.cancelRunnable(g60Var.h);
            g60Var.h = null;
        }
        g60Var.f28656c.clear();
        g60Var.d.clear();
        g60Var.f28657e.f(null, null);
        g60Var.f28657e.g(null, true, false, false, false, 0L, false, 0, 0);
        g60Var.l();
        if (!TextUtils.isEmpty(str)) {
            f2.r0 adapter = g60Var.f28659n.d.getAdapter();
            k60 k60Var = g60Var.f28659n;
            vk0 vk0Var = k60Var.f32371e;
            if (adapter != vk0Var) {
                k60Var.d.setAdapter(vk0Var);
            }
            g60Var.f28659n.f32375s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            f60 f60Var = new f60(g60Var, str, 0);
            g60Var.h = f60Var;
            dispatchQueue.postRunnable(f60Var, 300L);
            return;
        }
        f2.r0 adapter2 = g60Var.f28659n.d.getAdapter();
        k60 k60Var2 = g60Var.f28659n;
        vk0 vk0Var2 = k60Var2.f32372f;
        if (adapter2 != vk0Var2) {
            k60Var2.d.setAdapter(vk0Var2);
        }
    }

    public boolean W() {
        return true;
    }

    public final void X(org.telegram.ui.wt wtVar) {
        this.f29982i0 = wtVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f29983j0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        a0();
    }

    public final void Y(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k60.Y(java.util.ArrayList):void");
    }

    public final void Z(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f29975b0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f29976c0 != z11) {
            ValueAnimator valueAnimator = this.f29978e0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f29978e0.cancel();
            }
            this.f29976c0 = z11;
            org.telegram.ui.ActionBar.w1 w1Var = this.R;
            if (z11) {
                w1Var.setVisibility(0);
            }
            float f10 = 0.0f;
            if (z10) {
                float f11 = this.f29977d0;
                if (z11) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f29978e0 = ofFloat;
                ofFloat.addUpdateListener(new e6(this, 27));
                this.f29978e0.addListener(new u9(13, this, z11));
                this.f29978e0.setDuration(150L);
                this.f29978e0.start();
            } else {
                if (z11) {
                    f10 = 1.0f;
                }
                this.f29977d0 = f10;
                this.containerView.invalidate();
                if (!z11) {
                    w1Var.setVisibility(8);
                }
            }
            if (!this.f29976c0 && this.f29982i0 == null) {
                z12 = false;
            }
            this.f29988p0.e(z12, z10);
        }
    }

    public final void a0() {
        this.U = -1;
        this.V = -1;
        this.T = -1;
        this.W = -1;
        boolean z10 = true;
        this.Y = 1;
        if (this.f29982i0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j10 = this.f29990r0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = W();
            }
            if (z10) {
                int i9 = this.Y;
                this.Y = i9 + 1;
                this.T = i9;
            }
            ArrayList arrayList = this.f29974a0;
            if (arrayList.size() != 0) {
                int i10 = this.Y;
                this.U = i10;
                int size = arrayList.size() + i10;
                this.Y = size;
                this.V = size;
            } else {
                int i11 = this.Y;
                this.Y = i11 + 1;
                this.W = i11;
            }
        } else if (this.f29983j0.size() != 0) {
            int i12 = this.Y;
            this.U = i12;
            int size2 = this.f29983j0.size() + i12;
            this.Y = size2;
            this.V = size2;
        } else {
            int i13 = this.Y;
            this.Y = i13 + 1;
            this.W = i13;
        }
        int i14 = this.Y;
        this.Y = i14 + 1;
        this.X = i14;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.dialogsNeedReload && this.f29982i0 != null && this.f29983j0.isEmpty()) {
            this.f29983j0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f32372f.l();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f29991s0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (o2Var instanceof org.telegram.ui.qn) {
                    ((org.telegram.ui.qn) o2Var).T9(true, true);
                }
            }
        }
    }
}
