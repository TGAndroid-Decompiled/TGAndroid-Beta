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
public class g80 extends y71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.i T;
    public final f80 U;
    public final org.telegram.ui.ActionBar.u1 V;
    public final c80 W;
    public int X;
    public int Y;
    public int Z;
    public int f26321a0;
    public int f26322b0;
    public int f26323c0;
    public AnimatorSet f26324d0;
    public final ArrayList f26325e0;
    public final a0.i f26326f0;
    public boolean f26327g0;
    public float f26328h0;
    public ValueAnimator f26329i0;
    public g40 f26330j0;
    public int f26331k0;
    public org.telegram.ui.z60 f26332l0;
    public org.telegram.ui.ju m0;
    public ArrayList f26333n0;
    public int f26334o0;
    public final float f26335p0;
    public final org.telegram.ui.ActionBar.m2 f26336q0;
    public final androidx.mediarouter.app.x f26337r0;
    public int f26338s0;
    public final s20 f26339t0;
    public int f26340u0;
    public final long f26341v0;
    public boolean f26342w0;
    public float f26343x0;
    public boolean f26344y0;
    public TLRPC.TL_chatInviteExported f26345z0;

    public g80(Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f26325e0 = new ArrayList();
        this.f26326f0 = new a0.i();
        this.f26328h0 = 0.0f;
        this.f26337r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = iVar;
        this.G = false;
        this.f26336q0 = m2Var;
        this.f26341v0 = j3;
        fixNavigationBar();
        this.f32969w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f26335p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        c80 c80Var = new c80(this);
        this.W = c80Var;
        this.f32964e = c80Var;
        ai.w0 w0Var = this.d;
        a80 a80Var = new a80(this);
        this.f32965f = a80Var;
        w0Var.setAdapter(a80Var);
        this.f32968s.e(false, false);
        this.f32968s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f26325e0.add(user);
            }
        }
        f80 f80Var = new f80(this, context);
        this.U = f80Var;
        this.d.setOnItemClickListener(new org.telegram.ui.zb(this, j3, m2Var, iVar, context));
        ai.w0 w0Var2 = this.d;
        s4.j jVar = new s4.j();
        jVar.f47957o = js.f27634f;
        jVar.f47990e = 150L;
        jVar.f47989c = 150L;
        jVar.d = 150L;
        setShowWithoutAnimation(false);
        w0Var2.setItemAnimator(jVar);
        c0();
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(this, context, 1);
        this.V = u1Var;
        u1Var.setVisibility(8);
        u1Var.setClipChildren(false);
        u1Var.addView(f80Var);
        this.containerView.addView(u1Var);
        s20 s20Var = new s20(context, c6Var, false);
        this.f26339t0 = s20Var;
        s20Var.setImageResource(R.drawable.floating_check);
        s20Var.setOnClickListener(new org.telegram.ui.jo(this, context, j3, 3));
        s20Var.e(false, false);
        s20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(s20Var, s20.b());
        ((ViewGroup.MarginLayoutParams) this.f32968s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f32968s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f32968s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void N(org.telegram.ui.Components.g80 r4, long r5, org.telegram.ui.ActionBar.m2 r7, a0.i r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g80.N(org.telegram.ui.Components.g80, long, org.telegram.ui.ActionBar.m2, a0.i, android.content.Context, int):void");
    }

    public static void O(g80 g80Var, Context context, long j3) {
        Activity findActivity;
        a0.i iVar = g80Var.f26326f0;
        if ((g80Var.m0 == null && iVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (g80Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iVar.m(); i10++) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
            org.telegram.ui.ez ezVar = (org.telegram.ui.ez) g80Var.m0.f39286b;
            ArrayList arrayList2 = ezVar.f37573e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            ezVar.Z();
            org.telegram.ui.dz dzVar = ezVar.f37574f;
            if (dzVar != null) {
                dzVar.a();
            }
            g80Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", iVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
        a2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(g80Var.currentAccount).getUser(Long.valueOf(iVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(g80Var.currentAccount).getChat(Long.valueOf(j3));
        if (iVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", iVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(iVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new r61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            a2Var.T = spannableStringBuilder;
        } else {
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new ew(g80Var, 7));
        hg.c.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void P(g80 g80Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            g80Var.f26345z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(g80Var.currentAccount).getChatFull(g80Var.f26341v0);
            if (chatFull != null) {
                chatFull.exported_invite = g80Var.f26345z0;
            }
            if (g80Var.f26345z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", g80Var.f26345z0.link));
            zc.j(g80Var.f26336q0).j();
            g80Var.dismiss();
        }
        g80Var.f26344y0 = false;
    }

    public static void Q(g80 g80Var, ValueAnimator valueAnimator) {
        g80Var.f26328h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g80Var.containerView.invalidate();
    }

    public static void R(g80 g80Var) {
        a0.i iVar = g80Var.f26326f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(g80Var.currentAccount).getUser(Long.valueOf(iVar.j(i10))));
        }
        org.telegram.ui.z60 z60Var = g80Var.f26332l0;
        if (z60Var != null) {
            z60Var.j(0, arrayList);
        }
        g80Var.dismiss();
    }

    public static ViewGroup V(g80 g80Var) {
        return g80Var.containerView;
    }

    public static ViewGroup X(g80 g80Var) {
        return g80Var.containerView;
    }

    @Override
    public final w71 E(Context context) {
        return new x70(this, context);
    }

    @Override
    public final void F(MotionEvent motionEvent, ci.g2 g2Var) {
        org.telegram.ui.ActionBar.m2 m2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f26343x0 = this.f32971y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f32971y - this.f26343x0) < this.f26335p0 && !this.f26342w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                m2Var = null;
            }
            if (m2Var instanceof org.telegram.ui.eo) {
                boolean U9 = ((org.telegram.ui.eo) m2Var).U9();
                this.f26342w0 = true;
                jt jtVar = new jt(21, this, g2Var);
                if (U9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(jtVar, j3);
                return;
            }
            this.f26342w0 = true;
            setFocusable(true);
            g2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new r1(1, g2Var));
        }
    }

    @Override
    public final void H(String str) {
        c80 c80Var = this.W;
        if (c80Var.h != null) {
            Utilities.searchQueue.cancelRunnable(c80Var.h);
            c80Var.h = null;
        }
        c80Var.f24844c.clear();
        c80Var.d.clear();
        c80Var.f24845e.f(null, null);
        c80Var.f24845e.g(null, true, false, false, false, 0L, false, 0, 0);
        c80Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.i0 adapter = c80Var.f24847n.d.getAdapter();
            g80 g80Var = c80Var.f24847n;
            vm0 vm0Var = g80Var.f32964e;
            if (adapter != vm0Var) {
                g80Var.d.setAdapter(vm0Var);
            }
            c80Var.f24847n.f32968s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            b80 b80Var = new b80(c80Var, str, 0);
            c80Var.h = b80Var;
            dispatchQueue.postRunnable(b80Var, 300L);
            return;
        }
        s4.i0 adapter2 = c80Var.f24847n.d.getAdapter();
        g80 g80Var2 = c80Var.f24847n;
        vm0 vm0Var2 = g80Var2.f32965f;
        if (adapter2 != vm0Var2) {
            g80Var2.d.setAdapter(vm0Var2);
        }
    }

    public boolean Y() {
        return true;
    }

    public final void Z(org.telegram.ui.ju juVar) {
        this.m0 = juVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f26333n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        c0();
    }

    public final void a0(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g80.a0(java.util.ArrayList):void");
    }

    public final void b0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f26326f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f26327g0 != z11) {
            ValueAnimator valueAnimator = this.f26329i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f26329i0.cancel();
            }
            this.f26327g0 = z11;
            org.telegram.ui.ActionBar.u1 u1Var = this.V;
            if (z11) {
                u1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f26328h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f26329i0 = ofFloat;
                ofFloat.addUpdateListener(new m6(this, 28));
                this.f26329i0.addListener(new ea(13, this, z11));
                this.f26329i0.setDuration(150L);
                this.f26329i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f26328h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    u1Var.setVisibility(8);
                }
            }
            if (!this.f26327g0 && this.m0 == null) {
                z12 = false;
            }
            this.f26339t0.e(z12, z10);
        }
    }

    public final void c0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f26321a0 = -1;
        boolean z10 = true;
        this.f26323c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j3 = this.f26341v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = Y();
            }
            if (z10) {
                int i10 = this.f26323c0;
                this.f26323c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f26325e0;
            if (arrayList.size() != 0) {
                int i11 = this.f26323c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f26323c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f26323c0;
                this.f26323c0 = i12 + 1;
                this.f26321a0 = i12;
            }
        } else if (this.f26333n0.size() != 0) {
            int i13 = this.f26323c0;
            this.Y = i13;
            int size2 = this.f26333n0.size() + i13;
            this.f26323c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f26323c0;
            this.f26323c0 = i14 + 1;
            this.f26321a0 = i14;
        }
        int i15 = this.f26323c0;
        this.f26323c0 = i15 + 1;
        this.f26322b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f26333n0.isEmpty()) {
            this.f26333n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f32965f.l();
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
        if (this.f26342w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (m2Var instanceof org.telegram.ui.eo) {
                    ((org.telegram.ui.eo) m2Var).Y9(true, true);
                }
            }
        }
    }
}
