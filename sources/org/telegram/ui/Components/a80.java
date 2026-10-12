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
public class a80 extends q71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.h T;
    public final z70 U;
    public final org.telegram.ui.ActionBar.u1 V;
    public final w70 W;
    public int X;
    public int Y;
    public int Z;
    public int f23466a0;
    public int f23467b0;
    public int f23468c0;
    public AnimatorSet f23469d0;
    public final ArrayList f23470e0;
    public final a0.h f23471f0;
    public boolean f23472g0;
    public float f23473h0;
    public ValueAnimator f23474i0;
    public z30 f23475j0;
    public int f23476k0;
    public org.telegram.ui.e70 f23477l0;
    public org.telegram.ui.mu m0;
    public ArrayList f23478n0;
    public int f23479o0;
    public final float f23480p0;
    public final org.telegram.ui.ActionBar.m2 f23481q0;
    public final androidx.mediarouter.app.w f23482r0;
    public int f23483s0;
    public final l20 f23484t0;
    public int f23485u0;
    public final long f23486v0;
    public boolean f23487w0;
    public float f23488x0;
    public boolean f23489y0;
    public TLRPC.TL_chatInviteExported f23490z0;

    public a80(Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f23470e0 = new ArrayList();
        this.f23471f0 = new a0.h();
        this.f23473h0 = 0.0f;
        this.f23482r0 = new androidx.mediarouter.app.w(this, 9);
        this.T = hVar;
        this.G = false;
        this.f23481q0 = m2Var;
        this.f23486v0 = j10;
        fixNavigationBar();
        this.f28542w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f23480p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        w70 w70Var = new w70(this);
        this.W = w70Var;
        this.e = w70Var;
        bi.o0 o0Var = this.d;
        t70 t70Var = new t70(this);
        this.f28538f = t70Var;
        o0Var.setAdapter(t70Var);
        this.f28541s.e(false, false);
        this.f28541s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f23470e0.add(user);
            }
        }
        z70 z70Var = new z70(this, context);
        this.U = z70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.bc(this, j10, m2Var, hVar, context));
        bi.o0 o0Var2 = this.d;
        s4.k kVar = new s4.k();
        kVar.f44901o = es.f24771f;
        kVar.e = 150L;
        kVar.f44917c = 150L;
        kVar.d = 150L;
        setShowWithoutAnimation(false);
        o0Var2.setItemAnimator(kVar);
        c0();
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(this, context, 1);
        this.V = u1Var;
        u1Var.setVisibility(8);
        u1Var.setClipChildren(false);
        u1Var.addView(z70Var);
        this.containerView.addView(u1Var);
        l20 l20Var = new l20(context, c6Var, false);
        this.f23484t0 = l20Var;
        l20Var.setImageResource(R.drawable.floating_check);
        l20Var.setOnClickListener(new org.telegram.ui.ko(this, context, j10, 3));
        l20Var.e(false, false);
        l20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(l20Var, l20.b());
        ((ViewGroup.MarginLayoutParams) this.f28541s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f28541s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f28541s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void N(org.telegram.ui.Components.a80 r4, long r5, org.telegram.ui.ActionBar.m2 r7, a0.h r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a80.N(org.telegram.ui.Components.a80, long, org.telegram.ui.ActionBar.m2, a0.h, android.content.Context, int):void");
    }

    public static void O(a80 a80Var, Context context, long j10) {
        Activity findActivity;
        a0.h hVar = a80Var.f23471f0;
        if ((a80Var.m0 == null && hVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (a80Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
            org.telegram.ui.hz hzVar = (org.telegram.ui.hz) a80Var.m0.f38348b;
            ArrayList arrayList2 = hzVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            hzVar.Z();
            org.telegram.ui.gz gzVar = hzVar.f36987f;
            if (gzVar != null) {
                gzVar.a();
            }
            a80Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", hVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
        a2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(a80Var.currentAccount).getUser(Long.valueOf(hVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(a80Var.currentAccount).getChat(Long.valueOf(j10));
        if (hVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", hVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(hVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new i61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            a2Var.T = spannableStringBuilder;
        } else {
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new xv(a80Var, 7));
        org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void P(a80 a80Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            a80Var.f23490z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(a80Var.currentAccount).getChatFull(a80Var.f23486v0);
            if (chatFull != null) {
                chatFull.exported_invite = a80Var.f23490z0;
            }
            if (a80Var.f23490z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", a80Var.f23490z0.link));
            zc.j(a80Var.f23481q0).j();
            a80Var.dismiss();
        }
        a80Var.f23489y0 = false;
    }

    public static void Q(a80 a80Var, ValueAnimator valueAnimator) {
        a80Var.f23473h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        a80Var.containerView.invalidate();
    }

    public static void R(a80 a80Var) {
        a0.h hVar = a80Var.f23471f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(a80Var.currentAccount).getUser(Long.valueOf(hVar.j(i10))));
        }
        org.telegram.ui.e70 e70Var = a80Var.f23477l0;
        if (e70Var != null) {
            e70Var.i(0, arrayList);
        }
        a80Var.dismiss();
    }

    public static ViewGroup V(a80 a80Var) {
        return a80Var.containerView;
    }

    public static ViewGroup X(a80 a80Var) {
        return a80Var.containerView;
    }

    @Override
    public final o71 E(Context context) {
        return new q70(this, context);
    }

    @Override
    public final void F(MotionEvent motionEvent, di.g2 g2Var) {
        org.telegram.ui.ActionBar.m2 m2Var;
        long j10;
        if (motionEvent.getAction() == 0) {
            this.f23488x0 = this.f28544y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f28544y - this.f23488x0) < this.f23480p0 && !this.f23487w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                m2Var = null;
            }
            if (m2Var instanceof org.telegram.ui.fo) {
                boolean U9 = ((org.telegram.ui.fo) m2Var).U9();
                this.f23487w0 = true;
                f60 f60Var = new f60(4, this, g2Var);
                if (U9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(f60Var, j10);
                return;
            }
            this.f23487w0 = true;
            setFocusable(true);
            g2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new r1(1, g2Var));
        }
    }

    @Override
    public final void H(String str) {
        w70 w70Var = this.W;
        if (w70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(w70Var.h);
            w70Var.h = null;
        }
        w70Var.f30811c.clear();
        w70Var.d.clear();
        w70Var.e.f(null, null);
        w70Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        w70Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.g0 adapter = w70Var.f30813n.d.getAdapter();
            a80 a80Var = w70Var.f30813n;
            lm0 lm0Var = a80Var.e;
            if (adapter != lm0Var) {
                a80Var.d.setAdapter(lm0Var);
            }
            w70Var.f30813n.f28541s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            u70 u70Var = new u70(w70Var, str, 0);
            w70Var.h = u70Var;
            dispatchQueue.postRunnable(u70Var, 300L);
            return;
        }
        s4.g0 adapter2 = w70Var.f30813n.d.getAdapter();
        a80 a80Var2 = w70Var.f30813n;
        lm0 lm0Var2 = a80Var2.f28538f;
        if (adapter2 != lm0Var2) {
            a80Var2.d.setAdapter(lm0Var2);
        }
    }

    public boolean Y() {
        return true;
    }

    public final void Z(org.telegram.ui.mu muVar) {
        this.m0 = muVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f23478n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        c0();
    }

    public final void a0(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a80.a0(java.util.ArrayList):void");
    }

    public final void b0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f23471f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f23472g0 != z11) {
            ValueAnimator valueAnimator = this.f23474i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f23474i0.cancel();
            }
            this.f23472g0 = z11;
            org.telegram.ui.ActionBar.u1 u1Var = this.V;
            if (z11) {
                u1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f23473h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f23474i0 = ofFloat;
                ofFloat.addUpdateListener(new n6(this, 28));
                this.f23474i0.addListener(new org.telegram.ui.vo(14, this, z11));
                this.f23474i0.setDuration(150L);
                this.f23474i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f23473h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    u1Var.setVisibility(8);
                }
            }
            if (!this.f23472g0 && this.m0 == null) {
                z12 = false;
            }
            this.f23484t0.e(z12, z10);
        }
    }

    public final void c0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f23466a0 = -1;
        boolean z10 = true;
        this.f23468c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j10 = this.f23486v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = Y();
            }
            if (z10) {
                int i10 = this.f23468c0;
                this.f23468c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f23470e0;
            if (arrayList.size() != 0) {
                int i11 = this.f23468c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f23468c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f23468c0;
                this.f23468c0 = i12 + 1;
                this.f23466a0 = i12;
            }
        } else if (this.f23478n0.size() != 0) {
            int i13 = this.f23468c0;
            this.Y = i13;
            int size2 = this.f23478n0.size() + i13;
            this.f23468c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f23468c0;
            this.f23468c0 = i14 + 1;
            this.f23466a0 = i14;
        }
        int i15 = this.f23468c0;
        this.f23468c0 = i15 + 1;
        this.f23467b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f23478n0.isEmpty()) {
            this.f23478n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f28538f.l();
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
        if (this.f23487w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (m2Var instanceof org.telegram.ui.fo) {
                    ((org.telegram.ui.fo) m2Var).Y9(true, true);
                }
            }
        }
    }
}
