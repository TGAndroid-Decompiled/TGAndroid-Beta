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
public class e80 extends v71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.i T;
    public final d80 U;
    public final org.telegram.ui.ActionBar.u1 V;
    public final a80 W;
    public int X;
    public int Y;
    public int Z;
    public int f25898a0;
    public int f25899b0;
    public int f25900c0;
    public AnimatorSet f25901d0;
    public final ArrayList f25902e0;
    public final a0.i f25903f0;
    public boolean f25904g0;
    public float f25905h0;
    public ValueAnimator f25906i0;
    public e40 f25907j0;
    public int f25908k0;
    public org.telegram.ui.x60 f25909l0;
    public org.telegram.ui.fu m0;
    public ArrayList f25910n0;
    public int f25911o0;
    public final float f25912p0;
    public final org.telegram.ui.ActionBar.m2 f25913q0;
    public final androidx.mediarouter.app.x f25914r0;
    public int f25915s0;
    public final q20 f25916t0;
    public int f25917u0;
    public final long f25918v0;
    public boolean f25919w0;
    public float f25920x0;
    public boolean f25921y0;
    public TLRPC.TL_chatInviteExported f25922z0;

    public e80(Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f25902e0 = new ArrayList();
        this.f25903f0 = new a0.i();
        this.f25905h0 = 0.0f;
        this.f25914r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = iVar;
        this.G = false;
        this.f25913q0 = m2Var;
        this.f25918v0 = j3;
        fixNavigationBar();
        this.f31700w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f25912p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        a80 a80Var = new a80(this);
        this.W = a80Var;
        this.f31695e = a80Var;
        ai.w0 w0Var = this.d;
        y70 y70Var = new y70(this);
        this.f31696f = y70Var;
        w0Var.setAdapter(y70Var);
        this.f31699s.e(false, false);
        this.f31699s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f25902e0.add(user);
            }
        }
        d80 d80Var = new d80(this, context);
        this.U = d80Var;
        this.d.setOnItemClickListener(new org.telegram.ui.vb(this, j3, m2Var, iVar, context));
        ai.w0 w0Var2 = this.d;
        s4.j jVar = new s4.j();
        jVar.f47808o = is.f27451f;
        jVar.f47841e = 150L;
        jVar.f47840c = 150L;
        jVar.d = 150L;
        setShowWithoutAnimation(false);
        w0Var2.setItemAnimator(jVar);
        c0();
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(this, context, 1);
        this.V = u1Var;
        u1Var.setVisibility(8);
        u1Var.setClipChildren(false);
        u1Var.addView(d80Var);
        this.containerView.addView(u1Var);
        q20 q20Var = new q20(context, d6Var, false);
        this.f25916t0 = q20Var;
        q20Var.setImageResource(R.drawable.floating_check);
        q20Var.setOnClickListener(new org.telegram.ui.fo(this, context, j3, 3));
        q20Var.e(false, false);
        q20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(q20Var, q20.b());
        ((ViewGroup.MarginLayoutParams) this.f31699s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f31699s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f31699s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void N(org.telegram.ui.Components.e80 r4, long r5, org.telegram.ui.ActionBar.m2 r7, a0.i r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e80.N(org.telegram.ui.Components.e80, long, org.telegram.ui.ActionBar.m2, a0.i, android.content.Context, int):void");
    }

    public static void O(e80 e80Var, Context context, long j3) {
        Activity findActivity;
        a0.i iVar = e80Var.f25903f0;
        if ((e80Var.m0 == null && iVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (e80Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iVar.m(); i10++) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
            org.telegram.ui.bz bzVar = (org.telegram.ui.bz) e80Var.m0.f37771b;
            ArrayList arrayList2 = bzVar.f36472e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            bzVar.Z();
            org.telegram.ui.az azVar = bzVar.f36473f;
            if (azVar != null) {
                azVar.a();
            }
            e80Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", iVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
        a2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(e80Var.currentAccount).getUser(Long.valueOf(iVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(e80Var.currentAccount).getChat(Long.valueOf(j3));
        if (iVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", iVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(iVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new o61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            a2Var.T = spannableStringBuilder;
        } else {
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new cw(e80Var, 7));
        hg.c.p(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void P(e80 e80Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            e80Var.f25922z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(e80Var.currentAccount).getChatFull(e80Var.f25918v0);
            if (chatFull != null) {
                chatFull.exported_invite = e80Var.f25922z0;
            }
            if (e80Var.f25922z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", e80Var.f25922z0.link));
            ad.j(e80Var.f25913q0).j();
            e80Var.dismiss();
        }
        e80Var.f25921y0 = false;
    }

    public static void Q(e80 e80Var, ValueAnimator valueAnimator) {
        e80Var.f25905h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        e80Var.containerView.invalidate();
    }

    public static void R(e80 e80Var) {
        a0.i iVar = e80Var.f25903f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(e80Var.currentAccount).getUser(Long.valueOf(iVar.j(i10))));
        }
        org.telegram.ui.x60 x60Var = e80Var.f25909l0;
        if (x60Var != null) {
            x60Var.j(0, arrayList);
        }
        e80Var.dismiss();
    }

    public static ViewGroup U(e80 e80Var) {
        return e80Var.containerView;
    }

    public static ViewGroup V(e80 e80Var) {
        return e80Var.containerView;
    }

    public static ViewGroup X(e80 e80Var) {
        return e80Var.containerView;
    }

    @Override
    public final t71 E(Context context) {
        return new v70(this, context);
    }

    @Override
    public final void F(MotionEvent motionEvent, ci.g2 g2Var) {
        org.telegram.ui.ActionBar.m2 m2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f25920x0 = this.f31702y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f31702y - this.f25920x0) < this.f25912p0 && !this.f25919w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                m2Var = null;
            }
            if (m2Var instanceof org.telegram.ui.zn) {
                boolean U9 = ((org.telegram.ui.zn) m2Var).U9();
                this.f25919w0 = true;
                bs bsVar = new bs(22, this, g2Var);
                if (U9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(bsVar, j3);
                return;
            }
            this.f25919w0 = true;
            setFocusable(true);
            g2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new r1(1, g2Var));
        }
    }

    @Override
    public final void H(String str) {
        a80 a80Var = this.W;
        if (a80Var.h != null) {
            Utilities.searchQueue.cancelRunnable(a80Var.h);
            a80Var.h = null;
        }
        a80Var.f24461c.clear();
        a80Var.d.clear();
        a80Var.f24462e.f(null, null);
        a80Var.f24462e.g(null, true, false, false, false, 0L, false, 0, 0);
        a80Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.i0 adapter = a80Var.f24464n.d.getAdapter();
            e80 e80Var = a80Var.f24464n;
            rm0 rm0Var = e80Var.f31695e;
            if (adapter != rm0Var) {
                e80Var.d.setAdapter(rm0Var);
            }
            a80Var.f24464n.f31699s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            z70 z70Var = new z70(a80Var, str, 0);
            a80Var.h = z70Var;
            dispatchQueue.postRunnable(z70Var, 300L);
            return;
        }
        s4.i0 adapter2 = a80Var.f24464n.d.getAdapter();
        e80 e80Var2 = a80Var.f24464n;
        rm0 rm0Var2 = e80Var2.f31696f;
        if (adapter2 != rm0Var2) {
            e80Var2.d.setAdapter(rm0Var2);
        }
    }

    public boolean Y() {
        return true;
    }

    public final void Z(org.telegram.ui.fu fuVar) {
        this.m0 = fuVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f25910n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        c0();
    }

    public final void a0(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e80.a0(java.util.ArrayList):void");
    }

    public final void b0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f25903f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f25904g0 != z11) {
            ValueAnimator valueAnimator = this.f25906i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f25906i0.cancel();
            }
            this.f25904g0 = z11;
            org.telegram.ui.ActionBar.u1 u1Var = this.V;
            if (z11) {
                u1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f25905h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f25906i0 = ofFloat;
                ofFloat.addUpdateListener(new m6(this, 28));
                this.f25906i0.addListener(new ea(13, this, z11));
                this.f25906i0.setDuration(150L);
                this.f25906i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f25905h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    u1Var.setVisibility(8);
                }
            }
            if (!this.f25904g0 && this.m0 == null) {
                z12 = false;
            }
            this.f25916t0.e(z12, z10);
        }
    }

    public final void c0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f25898a0 = -1;
        boolean z10 = true;
        this.f25900c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j3 = this.f25918v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = Y();
            }
            if (z10) {
                int i10 = this.f25900c0;
                this.f25900c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f25902e0;
            if (arrayList.size() != 0) {
                int i11 = this.f25900c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f25900c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f25900c0;
                this.f25900c0 = i12 + 1;
                this.f25898a0 = i12;
            }
        } else if (this.f25910n0.size() != 0) {
            int i13 = this.f25900c0;
            this.Y = i13;
            int size2 = this.f25910n0.size() + i13;
            this.f25900c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f25900c0;
            this.f25900c0 = i14 + 1;
            this.f25898a0 = i14;
        }
        int i15 = this.f25900c0;
        this.f25900c0 = i15 + 1;
        this.f25899b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f25910n0.isEmpty()) {
            this.f25910n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f31696f.l();
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
        if (this.f25919w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (m2Var instanceof org.telegram.ui.zn) {
                    ((org.telegram.ui.zn) m2Var).Y9(true, true);
                }
            }
        }
    }
}
