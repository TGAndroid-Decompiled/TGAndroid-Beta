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
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public class v70 extends r71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.h T;
    public final u70 U;
    public final org.telegram.ui.ActionBar.u1 V;
    public final r70 W;
    public int X;
    public int Y;
    public int Z;
    public int f31346a0;
    public int f31347b0;
    public int f31348c0;
    public AnimatorSet f31349d0;
    public final ArrayList f31350e0;
    public final a0.h f31351f0;
    public boolean f31352g0;
    public float f31353h0;
    public ValueAnimator f31354i0;
    public t30 f31355j0;
    public int f31356k0;
    public org.telegram.ui.k60 f31357l0;
    public org.telegram.ui.xt m0;
    public ArrayList f31358n0;
    public int f31359o0;
    public final float f31360p0;
    public final org.telegram.ui.ActionBar.o2 f31361q0;
    public final androidx.mediarouter.app.w f31362r0;
    public int f31363s0;
    public final f20 f31364t0;
    public int f31365u0;
    public final long f31366v0;
    public boolean f31367w0;
    public float f31368x0;
    public boolean f31369y0;
    public TLRPC.TL_chatInviteExported f31370z0;

    public v70(Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, g6Var);
        this.f31350e0 = new ArrayList();
        this.f31351f0 = new a0.h();
        this.f31353h0 = 0.0f;
        this.f31362r0 = new androidx.mediarouter.app.w(this, 9);
        this.T = hVar;
        this.G = false;
        this.f31361q0 = o2Var;
        this.f31366v0 = j10;
        fixNavigationBar();
        this.f30094w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f31360p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        r70 r70Var = new r70(this);
        this.W = r70Var;
        this.e = r70Var;
        ai.u1 u1Var = this.d;
        p70 p70Var = new p70(this);
        this.f30090f = p70Var;
        u1Var.setAdapter(p70Var);
        this.f30093s.e(false, false);
        this.f30093s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f31350e0.add(user);
            }
        }
        u70 u70Var = new u70(this, context);
        this.U = u70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.wb(this, j10, o2Var, hVar, context));
        ai.u1 u1Var2 = this.d;
        s4.k kVar = new s4.k();
        kVar.f46405o = zr.f33337f;
        kVar.e = 150L;
        kVar.f46421c = 150L;
        kVar.d = 150L;
        setShowWithoutAnimation(false);
        u1Var2.setItemAnimator(kVar);
        b0();
        org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(this, context, 1);
        this.V = u1Var3;
        u1Var3.setVisibility(8);
        u1Var3.setClipChildren(false);
        u1Var3.addView(u70Var);
        this.containerView.addView(u1Var3);
        f20 f20Var = new f20(context, g6Var, false);
        this.f31364t0 = f20Var;
        f20Var.setImageResource(R.drawable.floating_check);
        f20Var.setOnClickListener(new ai.t3(this, context, j10, 4));
        f20Var.e(false, false);
        f20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(f20Var, f20.b());
        ((ViewGroup.MarginLayoutParams) this.f30093s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f30093s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f30093s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void M(org.telegram.ui.Components.v70 r4, long r5, org.telegram.ui.ActionBar.o2 r7, a0.h r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v70.M(org.telegram.ui.Components.v70, long, org.telegram.ui.ActionBar.o2, a0.h, android.content.Context, int):void");
    }

    public static void N(v70 v70Var, Context context, long j10) {
        Activity findActivity;
        a0.h hVar = v70Var.f31351f0;
        if ((v70Var.m0 == null && hVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (v70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
            org.telegram.ui.ny nyVar = (org.telegram.ui.ny) v70Var.m0.f43673b;
            ArrayList arrayList2 = nyVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            nyVar.Z();
            org.telegram.ui.my myVar = nyVar.f40020f;
            if (myVar != null) {
                myVar.a();
            }
            v70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", hVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(v70Var.currentAccount).getUser(Long.valueOf(hVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(v70Var.currentAccount).getChat(Long.valueOf(j10));
        if (hVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", hVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(hVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new i61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            c2Var.T = spannableStringBuilder;
        } else {
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new rv(v70Var, 7));
        i2.o1.s(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void O(v70 v70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            v70Var.f31370z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(v70Var.currentAccount).getChatFull(v70Var.f31366v0);
            if (chatFull != null) {
                chatFull.exported_invite = v70Var.f31370z0;
            }
            if (v70Var.f31370z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", v70Var.f31370z0.link));
            vc.j(v70Var.f31361q0).j();
            v70Var.dismiss();
        }
        v70Var.f31369y0 = false;
    }

    public static void P(v70 v70Var, ValueAnimator valueAnimator) {
        v70Var.f31353h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        v70Var.containerView.invalidate();
    }

    public static void Q(v70 v70Var) {
        a0.h hVar = v70Var.f31351f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(v70Var.currentAccount).getUser(Long.valueOf(hVar.j(i10))));
        }
        org.telegram.ui.k60 k60Var = v70Var.f31357l0;
        if (k60Var != null) {
            k60Var.i(0, arrayList);
        }
        v70Var.dismiss();
    }

    public static ViewGroup T(v70 v70Var) {
        return v70Var.containerView;
    }

    public static ViewGroup U(v70 v70Var) {
        return v70Var.containerView;
    }

    public static ViewGroup W(v70 v70Var) {
        return v70Var.containerView;
    }

    @Override
    public final p71 C(Context context) {
        return new m70(this, context);
    }

    @Override
    public final void D(MotionEvent motionEvent, ei.e2 e2Var) {
        org.telegram.ui.ActionBar.o2 o2Var;
        long j10;
        if (motionEvent.getAction() == 0) {
            this.f31368x0 = this.f30096y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f30096y - this.f31368x0) < this.f31360p0 && !this.f31367w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                o2Var = (org.telegram.ui.ActionBar.o2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                o2Var = null;
            }
            if (o2Var instanceof org.telegram.ui.sn) {
                boolean U9 = ((org.telegram.ui.sn) o2Var).U9();
                this.f31367w0 = true;
                wt wtVar = new wt(this, e2Var, 18);
                if (U9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(wtVar, j10);
                return;
            }
            this.f31367w0 = true;
            setFocusable(true);
            e2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new l70(e2Var, 0));
        }
    }

    @Override
    public final void F(String str) {
        r70 r70Var = this.W;
        if (r70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(r70Var.h);
            r70Var.h = null;
        }
        r70Var.f30085c.clear();
        r70Var.d.clear();
        r70Var.e.f(null, null);
        r70Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        r70Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.g0 adapter = r70Var.f30087n.d.getAdapter();
            v70 v70Var = r70Var.f30087n;
            km0 km0Var = v70Var.e;
            if (adapter != km0Var) {
                v70Var.d.setAdapter(km0Var);
            }
            r70Var.f30087n.f30093s.e(true, false);
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            q70 q70Var = new q70(r70Var, str, 0);
            r70Var.h = q70Var;
            dispatchQueue2.postRunnable(q70Var, 300L);
            return;
        }
        s4.g0 adapter2 = r70Var.f30087n.d.getAdapter();
        v70 v70Var2 = r70Var.f30087n;
        km0 km0Var2 = v70Var2.f30090f;
        if (adapter2 != km0Var2) {
            v70Var2.d.setAdapter(km0Var2);
        }
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.xt xtVar) {
        this.m0 = xtVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f31358n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Z(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v70.Z(java.util.ArrayList):void");
    }

    public final void a0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f31351f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f31352g0 != z11) {
            ValueAnimator valueAnimator = this.f31354i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f31354i0.cancel();
            }
            this.f31352g0 = z11;
            org.telegram.ui.ActionBar.u1 u1Var = this.V;
            if (z11) {
                u1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f31353h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f31354i0 = ofFloat;
                ofFloat.addUpdateListener(new j6(this, 28));
                this.f31354i0.addListener(new org.telegram.ui.ho(14, this, z11));
                this.f31354i0.setDuration(150L);
                this.f31354i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f31353h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    u1Var.setVisibility(8);
                }
            }
            if (!this.f31352g0 && this.m0 == null) {
                z12 = false;
            }
            this.f31364t0.e(z12, z10);
        }
    }

    public final void b0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f31346a0 = -1;
        boolean z10 = true;
        this.f31348c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j10 = this.f31366v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = X();
            }
            if (z10) {
                int i10 = this.f31348c0;
                this.f31348c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f31350e0;
            if (arrayList.size() != 0) {
                int i11 = this.f31348c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f31348c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f31348c0;
                this.f31348c0 = i12 + 1;
                this.f31346a0 = i12;
            }
        } else if (this.f31358n0.size() != 0) {
            int i13 = this.f31348c0;
            this.Y = i13;
            int size2 = this.f31358n0.size() + i13;
            this.f31348c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f31348c0;
            this.f31348c0 = i14 + 1;
            this.f31346a0 = i14;
        }
        int i15 = this.f31348c0;
        this.f31348c0 = i15 + 1;
        this.f31347b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f31358n0.isEmpty()) {
            this.f31358n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f30090f.l();
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
        if (this.f31367w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (o2Var instanceof org.telegram.ui.sn) {
                    ((org.telegram.ui.sn) o2Var).Y9(true, true);
                }
            }
        }
    }
}
