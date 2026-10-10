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
public class e80 extends u71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.i T;
    public final d80 U;
    public final org.telegram.ui.ActionBar.v1 V;
    public final a80 W;
    public int X;
    public int Y;
    public int Z;
    public int f25940a0;
    public int f25941b0;
    public int f25942c0;
    public AnimatorSet f25943d0;
    public final ArrayList f25944e0;
    public final a0.i f25945f0;
    public boolean f25946g0;
    public float f25947h0;
    public ValueAnimator f25948i0;
    public e40 f25949j0;
    public int f25950k0;
    public org.telegram.ui.x60 f25951l0;
    public org.telegram.ui.gu m0;
    public ArrayList f25952n0;
    public int f25953o0;
    public final float f25954p0;
    public final org.telegram.ui.ActionBar.n2 f25955q0;
    public final androidx.mediarouter.app.x f25956r0;
    public int f25957s0;
    public final q20 f25958t0;
    public int f25959u0;
    public final long f25960v0;
    public boolean f25961w0;
    public float f25962x0;
    public boolean f25963y0;
    public TLRPC.TL_chatInviteExported f25964z0;

    public e80(Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.f25944e0 = new ArrayList();
        this.f25945f0 = new a0.i();
        this.f25947h0 = 0.0f;
        this.f25956r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = iVar;
        this.G = false;
        this.f25955q0 = n2Var;
        this.f25960v0 = j3;
        fixNavigationBar();
        this.f31416w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f25954p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        a80 a80Var = new a80(this);
        this.W = a80Var;
        this.f31411e = a80Var;
        ai.w0 w0Var = this.d;
        y70 y70Var = new y70(this);
        this.f31412f = y70Var;
        w0Var.setAdapter(y70Var);
        this.f31415s.e(false, false);
        this.f31415s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f25944e0.add(user);
            }
        }
        d80 d80Var = new d80(this, context);
        this.U = d80Var;
        this.d.setOnItemClickListener(new org.telegram.ui.wb(this, j3, n2Var, iVar, context));
        ai.w0 w0Var2 = this.d;
        s4.j jVar = new s4.j();
        jVar.f47762o = is.f27443f;
        jVar.f47795e = 150L;
        jVar.f47794c = 150L;
        jVar.d = 150L;
        setShowWithoutAnimation(false);
        w0Var2.setItemAnimator(jVar);
        c0();
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 1);
        this.V = v1Var;
        v1Var.setVisibility(8);
        v1Var.setClipChildren(false);
        v1Var.addView(d80Var);
        this.containerView.addView(v1Var);
        q20 q20Var = new q20(context, e6Var, false);
        this.f25958t0 = q20Var;
        q20Var.setImageResource(R.drawable.floating_check);
        q20Var.setOnClickListener(new org.telegram.ui.fo(this, context, j3, 3));
        q20Var.e(false, false);
        q20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(q20Var, q20.b());
        ((ViewGroup.MarginLayoutParams) this.f31415s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f31415s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f31415s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void N(org.telegram.ui.Components.e80 r4, long r5, org.telegram.ui.ActionBar.n2 r7, a0.i r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e80.N(org.telegram.ui.Components.e80, long, org.telegram.ui.ActionBar.n2, a0.i, android.content.Context, int):void");
    }

    public static void O(e80 e80Var, Context context, long j3) {
        Activity findActivity;
        a0.i iVar = e80Var.f25945f0;
        if ((e80Var.m0 == null && iVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (e80Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iVar.m(); i10++) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
            org.telegram.ui.cz czVar = (org.telegram.ui.cz) e80Var.m0.f38153b;
            ArrayList arrayList2 = czVar.f36800e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            czVar.Z();
            org.telegram.ui.bz bzVar = czVar.f36801f;
            if (bzVar != null) {
                bzVar.a();
            }
            e80Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", iVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        b2Var.R = formatPluralString;
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
                spannableStringBuilder.setSpan(new n61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            b2Var.T = spannableStringBuilder;
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new cw(e80Var, 7));
        hg.c.p(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void P(e80 e80Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            e80Var.f25964z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(e80Var.currentAccount).getChatFull(e80Var.f25960v0);
            if (chatFull != null) {
                chatFull.exported_invite = e80Var.f25964z0;
            }
            if (e80Var.f25964z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", e80Var.f25964z0.link));
            ad.j(e80Var.f25955q0).j();
            e80Var.dismiss();
        }
        e80Var.f25963y0 = false;
    }

    public static void Q(e80 e80Var, ValueAnimator valueAnimator) {
        e80Var.f25947h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        e80Var.containerView.invalidate();
    }

    public static void R(e80 e80Var) {
        a0.i iVar = e80Var.f25945f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(e80Var.currentAccount).getUser(Long.valueOf(iVar.j(i10))));
        }
        org.telegram.ui.x60 x60Var = e80Var.f25951l0;
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
    public final s71 E(Context context) {
        return new v70(this, context);
    }

    @Override
    public final void F(MotionEvent motionEvent, ci.g2 g2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f25962x0 = this.f31418y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f31418y - this.f25962x0) < this.f25954p0 && !this.f25961w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.zn) {
                boolean U9 = ((org.telegram.ui.zn) n2Var).U9();
                this.f25961w0 = true;
                as asVar = new as(23, this, g2Var);
                if (U9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(asVar, j3);
                return;
            }
            this.f25961w0 = true;
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
        a80Var.f24504c.clear();
        a80Var.d.clear();
        a80Var.f24505e.f(null, null);
        a80Var.f24505e.g(null, true, false, false, false, 0L, false, 0, 0);
        a80Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.i0 adapter = a80Var.f24507n.d.getAdapter();
            e80 e80Var = a80Var.f24507n;
            qm0 qm0Var = e80Var.f31411e;
            if (adapter != qm0Var) {
                e80Var.d.setAdapter(qm0Var);
            }
            a80Var.f24507n.f31415s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            z70 z70Var = new z70(a80Var, str, 0);
            a80Var.h = z70Var;
            dispatchQueue.postRunnable(z70Var, 300L);
            return;
        }
        s4.i0 adapter2 = a80Var.f24507n.d.getAdapter();
        e80 e80Var2 = a80Var.f24507n;
        qm0 qm0Var2 = e80Var2.f31412f;
        if (adapter2 != qm0Var2) {
            e80Var2.d.setAdapter(qm0Var2);
        }
    }

    public boolean Y() {
        return true;
    }

    public final void Z(org.telegram.ui.gu guVar) {
        this.m0 = guVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f25952n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        c0();
    }

    public final void a0(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e80.a0(java.util.ArrayList):void");
    }

    public final void b0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f25945f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f25946g0 != z11) {
            ValueAnimator valueAnimator = this.f25948i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f25948i0.cancel();
            }
            this.f25946g0 = z11;
            org.telegram.ui.ActionBar.v1 v1Var = this.V;
            if (z11) {
                v1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f25947h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f25948i0 = ofFloat;
                ofFloat.addUpdateListener(new m6(this, 28));
                this.f25948i0.addListener(new fa(13, this, z11));
                this.f25948i0.setDuration(150L);
                this.f25948i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f25947h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    v1Var.setVisibility(8);
                }
            }
            if (!this.f25946g0 && this.m0 == null) {
                z12 = false;
            }
            this.f25958t0.e(z12, z10);
        }
    }

    public final void c0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f25940a0 = -1;
        boolean z10 = true;
        this.f25942c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j3 = this.f25960v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = Y();
            }
            if (z10) {
                int i10 = this.f25942c0;
                this.f25942c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f25944e0;
            if (arrayList.size() != 0) {
                int i11 = this.f25942c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f25942c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f25942c0;
                this.f25942c0 = i12 + 1;
                this.f25940a0 = i12;
            }
        } else if (this.f25952n0.size() != 0) {
            int i13 = this.f25942c0;
            this.Y = i13;
            int size2 = this.f25952n0.size() + i13;
            this.f25942c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f25942c0;
            this.f25942c0 = i14 + 1;
            this.f25940a0 = i14;
        }
        int i15 = this.f25942c0;
        this.f25942c0 = i15 + 1;
        this.f25941b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f25952n0.isEmpty()) {
            this.f25952n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f31412f.l();
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
        if (this.f25961w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (n2Var instanceof org.telegram.ui.zn) {
                    ((org.telegram.ui.zn) n2Var).Y9(true, true);
                }
            }
        }
    }
}
