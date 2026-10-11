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
public class d80 extends u71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.i T;
    public final c80 U;
    public final org.telegram.ui.ActionBar.u1 V;
    public final z70 W;
    public int X;
    public int Y;
    public int Z;
    public int f25655a0;
    public int f25656b0;
    public int f25657c0;
    public AnimatorSet f25658d0;
    public final ArrayList f25659e0;
    public final a0.i f25660f0;
    public boolean f25661g0;
    public float f25662h0;
    public ValueAnimator f25663i0;
    public e40 f25664j0;
    public int f25665k0;
    public org.telegram.ui.x60 f25666l0;
    public org.telegram.ui.fu m0;
    public ArrayList f25667n0;
    public int f25668o0;
    public final float f25669p0;
    public final org.telegram.ui.ActionBar.m2 f25670q0;
    public final androidx.mediarouter.app.x f25671r0;
    public int f25672s0;
    public final q20 f25673t0;
    public int f25674u0;
    public final long f25675v0;
    public boolean f25676w0;
    public float f25677x0;
    public boolean f25678y0;
    public TLRPC.TL_chatInviteExported f25679z0;

    public d80(Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f25659e0 = new ArrayList();
        this.f25660f0 = new a0.i();
        this.f25662h0 = 0.0f;
        this.f25671r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = iVar;
        this.G = false;
        this.f25670q0 = m2Var;
        this.f25675v0 = j3;
        fixNavigationBar();
        this.f31473w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f25669p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        z70 z70Var = new z70(this);
        this.W = z70Var;
        this.f31468e = z70Var;
        ai.w0 w0Var = this.d;
        x70 x70Var = new x70(this);
        this.f31469f = x70Var;
        w0Var.setAdapter(x70Var);
        this.f31472s.e(false, false);
        this.f31472s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f25659e0.add(user);
            }
        }
        c80 c80Var = new c80(this, context);
        this.U = c80Var;
        this.d.setOnItemClickListener(new org.telegram.ui.vb(this, j3, m2Var, iVar, context));
        ai.w0 w0Var2 = this.d;
        s4.j jVar = new s4.j();
        jVar.f47842o = is.f27500f;
        jVar.f47875e = 150L;
        jVar.f47874c = 150L;
        jVar.d = 150L;
        setShowWithoutAnimation(false);
        w0Var2.setItemAnimator(jVar);
        c0();
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(this, context, 1);
        this.V = u1Var;
        u1Var.setVisibility(8);
        u1Var.setClipChildren(false);
        u1Var.addView(c80Var);
        this.containerView.addView(u1Var);
        q20 q20Var = new q20(context, d6Var, false);
        this.f25673t0 = q20Var;
        q20Var.setImageResource(R.drawable.floating_check);
        q20Var.setOnClickListener(new org.telegram.ui.fo(this, context, j3, 3));
        q20Var.e(false, false);
        q20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(q20Var, q20.b());
        ((ViewGroup.MarginLayoutParams) this.f31472s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f31472s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f31472s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void N(org.telegram.ui.Components.d80 r4, long r5, org.telegram.ui.ActionBar.m2 r7, a0.i r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d80.N(org.telegram.ui.Components.d80, long, org.telegram.ui.ActionBar.m2, a0.i, android.content.Context, int):void");
    }

    public static void O(d80 d80Var, Context context, long j3) {
        Activity findActivity;
        a0.i iVar = d80Var.f25660f0;
        if ((d80Var.m0 == null && iVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (d80Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iVar.m(); i10++) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
            org.telegram.ui.bz bzVar = (org.telegram.ui.bz) d80Var.m0.f37805b;
            ArrayList arrayList2 = bzVar.f36506e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            bzVar.Z();
            org.telegram.ui.az azVar = bzVar.f36507f;
            if (azVar != null) {
                azVar.a();
            }
            d80Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", iVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
        a2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(d80Var.currentAccount).getUser(Long.valueOf(iVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(d80Var.currentAccount).getChat(Long.valueOf(j3));
        if (iVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", iVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(iVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new n61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            a2Var.T = spannableStringBuilder;
        } else {
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new cw(d80Var, 7));
        hg.c.p(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void P(d80 d80Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            d80Var.f25679z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(d80Var.currentAccount).getChatFull(d80Var.f25675v0);
            if (chatFull != null) {
                chatFull.exported_invite = d80Var.f25679z0;
            }
            if (d80Var.f25679z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", d80Var.f25679z0.link));
            ad.j(d80Var.f25670q0).j();
            d80Var.dismiss();
        }
        d80Var.f25678y0 = false;
    }

    public static void Q(d80 d80Var, ValueAnimator valueAnimator) {
        d80Var.f25662h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d80Var.containerView.invalidate();
    }

    public static void R(d80 d80Var) {
        a0.i iVar = d80Var.f25660f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(d80Var.currentAccount).getUser(Long.valueOf(iVar.j(i10))));
        }
        org.telegram.ui.x60 x60Var = d80Var.f25666l0;
        if (x60Var != null) {
            x60Var.j(0, arrayList);
        }
        d80Var.dismiss();
    }

    public static ViewGroup V(d80 d80Var) {
        return d80Var.containerView;
    }

    public static ViewGroup X(d80 d80Var) {
        return d80Var.containerView;
    }

    @Override
    public final s71 E(Context context) {
        return new u70(this, context);
    }

    @Override
    public final void F(MotionEvent motionEvent, ci.g2 g2Var) {
        org.telegram.ui.ActionBar.m2 m2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f25677x0 = this.f31475y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f31475y - this.f25677x0) < this.f25669p0 && !this.f25676w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                m2Var = null;
            }
            if (m2Var instanceof org.telegram.ui.zn) {
                boolean U9 = ((org.telegram.ui.zn) m2Var).U9();
                this.f25676w0 = true;
                bs bsVar = new bs(22, this, g2Var);
                if (U9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(bsVar, j3);
                return;
            }
            this.f25676w0 = true;
            setFocusable(true);
            g2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new r1(1, g2Var));
        }
    }

    @Override
    public final void H(String str) {
        z70 z70Var = this.W;
        if (z70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(z70Var.h);
            z70Var.h = null;
        }
        z70Var.f33568c.clear();
        z70Var.d.clear();
        z70Var.f33569e.f(null, null);
        z70Var.f33569e.g(null, true, false, false, false, 0L, false, 0, 0);
        z70Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.i0 adapter = z70Var.f33571n.d.getAdapter();
            d80 d80Var = z70Var.f33571n;
            qm0 qm0Var = d80Var.f31468e;
            if (adapter != qm0Var) {
                d80Var.d.setAdapter(qm0Var);
            }
            z70Var.f33571n.f31472s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            y70 y70Var = new y70(z70Var, str, 0);
            z70Var.h = y70Var;
            dispatchQueue.postRunnable(y70Var, 300L);
            return;
        }
        s4.i0 adapter2 = z70Var.f33571n.d.getAdapter();
        d80 d80Var2 = z70Var.f33571n;
        qm0 qm0Var2 = d80Var2.f31469f;
        if (adapter2 != qm0Var2) {
            d80Var2.d.setAdapter(qm0Var2);
        }
    }

    public boolean Y() {
        return true;
    }

    public final void Z(org.telegram.ui.fu fuVar) {
        this.m0 = fuVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f25667n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        c0();
    }

    public final void a0(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d80.a0(java.util.ArrayList):void");
    }

    public final void b0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f25660f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f25661g0 != z11) {
            ValueAnimator valueAnimator = this.f25663i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f25663i0.cancel();
            }
            this.f25661g0 = z11;
            org.telegram.ui.ActionBar.u1 u1Var = this.V;
            if (z11) {
                u1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f25662h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f25663i0 = ofFloat;
                ofFloat.addUpdateListener(new m6(this, 28));
                this.f25663i0.addListener(new ea(13, this, z11));
                this.f25663i0.setDuration(150L);
                this.f25663i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f25662h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    u1Var.setVisibility(8);
                }
            }
            if (!this.f25661g0 && this.m0 == null) {
                z12 = false;
            }
            this.f25673t0.e(z12, z10);
        }
    }

    public final void c0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f25655a0 = -1;
        boolean z10 = true;
        this.f25657c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j3 = this.f25675v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = Y();
            }
            if (z10) {
                int i10 = this.f25657c0;
                this.f25657c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f25659e0;
            if (arrayList.size() != 0) {
                int i11 = this.f25657c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f25657c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f25657c0;
                this.f25657c0 = i12 + 1;
                this.f25655a0 = i12;
            }
        } else if (this.f25667n0.size() != 0) {
            int i13 = this.f25657c0;
            this.Y = i13;
            int size2 = this.f25667n0.size() + i13;
            this.f25657c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f25657c0;
            this.f25657c0 = i14 + 1;
            this.f25655a0 = i14;
        }
        int i15 = this.f25657c0;
        this.f25657c0 = i15 + 1;
        this.f25656b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f25667n0.isEmpty()) {
            this.f25667n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f31469f.l();
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
        if (this.f25676w0) {
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
