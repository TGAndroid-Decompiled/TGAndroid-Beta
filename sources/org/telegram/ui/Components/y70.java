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
public class y70 extends b81 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.h T;
    public final x70 U;
    public final org.telegram.ui.ActionBar.w1 V;
    public final u70 W;
    public int X;
    public int Y;
    public int Z;
    public int f34944a0;
    public int f34945b0;
    public int f34946c0;
    public AnimatorSet f34947d0;
    public final ArrayList f34948e0;
    public final a0.h f34949f0;
    public boolean f34950g0;
    public float f34951h0;
    public ValueAnimator f34952i0;
    public x30 f34953j0;
    public int f34954k0;
    public org.telegram.ui.m60 f34955l0;
    public org.telegram.ui.qt m0;
    public ArrayList f34956n0;
    public int f34957o0;
    public final float f34958p0;
    public final org.telegram.ui.ActionBar.r2 f34959q0;
    public final androidx.mediarouter.app.x f34960r0;
    public int f34961s0;
    public final j20 f34962t0;
    public int f34963u0;
    public final long f34964v0;
    public boolean f34965w0;
    public float f34966x0;
    public boolean f34967y0;
    public TLRPC.TL_chatInviteExported f34968z0;

    public y70(Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, u6Var);
        this.f34948e0 = new ArrayList();
        this.f34949f0 = new a0.h();
        this.f34951h0 = 0.0f;
        this.f34960r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = hVar;
        this.G = false;
        this.f34959q0 = r2Var;
        this.f34964v0 = j10;
        fixNavigationBar();
        this.f26784w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f34958p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        u70 u70Var = new u70(this);
        this.W = u70Var;
        this.e = u70Var;
        bi.r1 r1Var = this.d;
        s70 s70Var = new s70(this);
        this.f26780f = s70Var;
        r1Var.setAdapter(s70Var);
        this.f26783s.e(false, false);
        this.f26783s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f34948e0.add(user);
            }
        }
        x70 x70Var = new x70(this, context);
        this.U = x70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.xb(this, j10, r2Var, hVar, context));
        bi.r1 r1Var2 = this.d;
        s4.l lVar = new s4.l();
        lVar.f47787o = ds.f27586f;
        lVar.e = 150L;
        lVar.f47803c = 150L;
        lVar.d = 150L;
        setShowWithoutAnimation(false);
        r1Var2.setItemAnimator(lVar);
        b0();
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(this, context, 1);
        this.V = w1Var;
        w1Var.setVisibility(8);
        w1Var.setClipChildren(false);
        w1Var.addView(x70Var);
        this.containerView.addView(w1Var);
        j20 j20Var = new j20(context, u6Var, false);
        this.f34962t0 = j20Var;
        j20Var.setImageResource(R.drawable.floating_check);
        j20Var.setOnClickListener(new bi.p3(this, context, j10, 4));
        j20Var.e(false, false);
        j20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(j20Var, j20.b());
        ((ViewGroup.MarginLayoutParams) this.f26783s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f26783s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f26783s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void M(org.telegram.ui.Components.y70 r4, long r5, org.telegram.ui.ActionBar.r2 r7, a0.h r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y70.M(org.telegram.ui.Components.y70, long, org.telegram.ui.ActionBar.r2, a0.h, android.content.Context, int):void");
    }

    public static void N(y70 y70Var, Context context, long j10) {
        Activity findActivity;
        a0.h hVar = y70Var.f34949f0;
        if ((y70Var.m0 == null && hVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (y70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
            org.telegram.ui.ly lyVar = (org.telegram.ui.ly) y70Var.m0.f42915b;
            ArrayList arrayList2 = lyVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            lyVar.a0();
            org.telegram.ui.ky kyVar = lyVar.f41395f;
            if (kyVar != null) {
                kyVar.a();
            }
            y70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", hVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
        e2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(y70Var.currentAccount).getUser(Long.valueOf(hVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(y70Var.currentAccount).getChat(Long.valueOf(j10));
        if (hVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", hVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(hVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new q61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            e2Var.T = spannableStringBuilder;
        } else {
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new tv(y70Var, 7));
        ic.a.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void O(y70 y70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            y70Var.f34968z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(y70Var.currentAccount).getChatFull(y70Var.f34964v0);
            if (chatFull != null) {
                chatFull.exported_invite = y70Var.f34968z0;
            }
            if (y70Var.f34968z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", y70Var.f34968z0.link));
            wc.j(y70Var.f34959q0).j();
            y70Var.dismiss();
        }
        y70Var.f34967y0 = false;
    }

    public static void P(y70 y70Var, ValueAnimator valueAnimator) {
        y70Var.f34951h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        y70Var.containerView.invalidate();
    }

    public static void Q(y70 y70Var) {
        a0.h hVar = y70Var.f34949f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(y70Var.currentAccount).getUser(Long.valueOf(hVar.j(i10))));
        }
        org.telegram.ui.m60 m60Var = y70Var.f34955l0;
        if (m60Var != null) {
            m60Var.f(0, arrayList);
        }
        y70Var.dismiss();
    }

    public static ViewGroup T(y70 y70Var) {
        return y70Var.containerView;
    }

    public static ViewGroup U(y70 y70Var) {
        return y70Var.containerView;
    }

    public static ViewGroup W(y70 y70Var) {
        return y70Var.containerView;
    }

    @Override
    public final z71 C(Context context) {
        return new p70(this, context);
    }

    @Override
    public final void D(MotionEvent motionEvent, fi.c2 c2Var) {
        org.telegram.ui.ActionBar.r2 r2Var;
        long j10;
        if (motionEvent.getAction() == 0) {
            this.f34966x0 = this.f26786y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f26786y - this.f34966x0) < this.f34958p0 && !this.f34965w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                r2Var = (org.telegram.ui.ActionBar.r2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                r2Var = null;
            }
            if (r2Var instanceof org.telegram.ui.un) {
                boolean Z9 = ((org.telegram.ui.un) r2Var).Z9();
                this.f34965w0 = true;
                so soVar = new so(28, this, c2Var);
                if (Z9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(soVar, j10);
                return;
            }
            this.f34965w0 = true;
            setFocusable(true);
            c2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new o70(c2Var, 0));
        }
    }

    @Override
    public final void G(String str) {
        u70 u70Var = this.W;
        if (u70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(u70Var.h);
            u70Var.h = null;
        }
        u70Var.f33266c.clear();
        u70Var.d.clear();
        u70Var.e.f(null, null);
        u70Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        u70Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.h0 adapter = u70Var.f33268n.d.getAdapter();
            y70 y70Var = u70Var.f33268n;
            lm0 lm0Var = y70Var.e;
            if (adapter != lm0Var) {
                y70Var.d.setAdapter(lm0Var);
            }
            u70Var.f33268n.f26783s.e(true, false);
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            t70 t70Var = new t70(u70Var, str, 0);
            u70Var.h = t70Var;
            dispatchQueue2.postRunnable(t70Var, 300L);
            return;
        }
        s4.h0 adapter2 = u70Var.f33268n.d.getAdapter();
        y70 y70Var2 = u70Var.f33268n;
        lm0 lm0Var2 = y70Var2.f26780f;
        if (adapter2 != lm0Var2) {
            y70Var2.d.setAdapter(lm0Var2);
        }
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.qt qtVar) {
        this.m0 = qtVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f34956n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Z(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y70.Z(java.util.ArrayList):void");
    }

    public final void a0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f34949f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f34950g0 != z11) {
            ValueAnimator valueAnimator = this.f34952i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f34952i0.cancel();
            }
            this.f34950g0 = z11;
            org.telegram.ui.ActionBar.w1 w1Var = this.V;
            if (z11) {
                w1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f34951h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f34952i0 = ofFloat;
                ofFloat.addUpdateListener(new n6(this, 28));
                this.f34952i0.addListener(new org.telegram.ui.jo(14, this, z11));
                this.f34952i0.setDuration(150L);
                this.f34952i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f34951h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    w1Var.setVisibility(8);
                }
            }
            if (!this.f34950g0 && this.m0 == null) {
                z12 = false;
            }
            this.f34962t0.e(z12, z10);
        }
    }

    public final void b0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f34944a0 = -1;
        boolean z10 = true;
        this.f34946c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j10 = this.f34964v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = X();
            }
            if (z10) {
                int i10 = this.f34946c0;
                this.f34946c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f34948e0;
            if (arrayList.size() != 0) {
                int i11 = this.f34946c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f34946c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f34946c0;
                this.f34946c0 = i12 + 1;
                this.f34944a0 = i12;
            }
        } else if (this.f34956n0.size() != 0) {
            int i13 = this.f34946c0;
            this.Y = i13;
            int size2 = this.f34956n0.size() + i13;
            this.f34946c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f34946c0;
            this.f34946c0 = i14 + 1;
            this.f34944a0 = i14;
        }
        int i15 = this.f34946c0;
        this.f34946c0 = i15 + 1;
        this.f34945b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f34956n0.isEmpty()) {
            this.f34956n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f26780f.l();
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
        if (this.f34965w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (r2Var instanceof org.telegram.ui.un) {
                    ((org.telegram.ui.un) r2Var).da(true, true);
                }
            }
        }
    }
}
