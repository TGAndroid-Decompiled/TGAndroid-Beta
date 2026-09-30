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
public class o70 extends d71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.i T;
    public final n70 U;
    public final org.telegram.ui.ActionBar.u1 V;
    public final k70 W;
    public int X;
    public int Y;
    public int Z;
    public int f26976a0;
    public int f26977b0;
    public int f26978c0;
    public AnimatorSet f26979d0;
    public final ArrayList f26980e0;
    public final a0.i f26981f0;
    public boolean f26982g0;
    public float f26983h0;
    public ValueAnimator f26984i0;
    public p30 f26985j0;
    public int f26986k0;
    public org.telegram.ui.u60 f26987l0;
    public org.telegram.ui.du m0;
    public ArrayList f26988n0;
    public int f26989o0;
    public final float f26990p0;
    public final org.telegram.ui.ActionBar.m2 f26991q0;
    public final androidx.mediarouter.app.x f26992r0;
    public int f26993s0;
    public final b20 f26994t0;
    public int f26995u0;
    public final long f26996v0;
    public boolean f26997w0;
    public float f26998x0;
    public boolean f26999y0;
    public TLRPC.TL_chatInviteExported f27000z0;

    public o70(Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f26980e0 = new ArrayList();
        this.f26981f0 = new a0.i();
        this.f26983h0 = 0.0f;
        this.f26992r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = iVar;
        this.G = false;
        this.f26991q0 = m2Var;
        this.f26996v0 = j3;
        fixNavigationBar();
        this.f23574w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f26990p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        k70 k70Var = new k70(this);
        this.W = k70Var;
        this.e = k70Var;
        ai.w0 w0Var = this.d;
        i70 i70Var = new i70(this);
        this.f23570f = i70Var;
        w0Var.setAdapter(i70Var);
        this.f23573s.e(false, false);
        this.f23573s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f26980e0.add(user);
            }
        }
        n70 n70Var = new n70(this, context);
        this.U = n70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.vb(this, j3, m2Var, iVar, context));
        ai.w0 w0Var2 = this.d;
        s4.j jVar = new s4.j();
        jVar.f43019o = sr.f28346f;
        jVar.e = 150L;
        jVar.f43043c = 150L;
        jVar.d = 150L;
        setShowWithoutAnimation(false);
        w0Var2.setItemAnimator(jVar);
        b0();
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(this, context, 1);
        this.V = u1Var;
        u1Var.setVisibility(8);
        u1Var.setClipChildren(false);
        u1Var.addView(n70Var);
        this.containerView.addView(u1Var);
        b20 b20Var = new b20(context, d6Var, false);
        this.f26994t0 = b20Var;
        b20Var.setImageResource(R.drawable.floating_check);
        b20Var.setOnClickListener(new org.telegram.ui.bo(this, context, j3, 3));
        b20Var.e(false, false);
        b20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(b20Var, b20.b());
        ((ViewGroup.MarginLayoutParams) this.f23573s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f23573s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f23573s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void M(org.telegram.ui.Components.o70 r4, long r5, org.telegram.ui.ActionBar.m2 r7, a0.i r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o70.M(org.telegram.ui.Components.o70, long, org.telegram.ui.ActionBar.m2, a0.i, android.content.Context, int):void");
    }

    public static void N(o70 o70Var, Context context, long j3) {
        Activity findActivity;
        a0.i iVar = o70Var.f26981f0;
        if ((o70Var.m0 == null && iVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (o70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iVar.m(); i10++) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
            org.telegram.ui.zy zyVar = (org.telegram.ui.zy) o70Var.m0.f33183b;
            ArrayList arrayList2 = zyVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            zyVar.Z();
            org.telegram.ui.yy yyVar = zyVar.f40599f;
            if (yyVar != null) {
                yyVar.a();
            }
            o70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", iVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18663a;
        a2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(o70Var.currentAccount).getUser(Long.valueOf(iVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(o70Var.currentAccount).getChat(Long.valueOf(j3));
        if (iVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", iVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(iVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new u51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            a2Var.T = spannableStringBuilder;
        } else {
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new ov(o70Var, 7));
        hg.c.p(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void O(o70 o70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            o70Var.f27000z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(o70Var.currentAccount).getChatFull(o70Var.f26996v0);
            if (chatFull != null) {
                chatFull.exported_invite = o70Var.f27000z0;
            }
            if (o70Var.f27000z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", o70Var.f27000z0.link));
            yc.j(o70Var.f26991q0).j();
            o70Var.dismiss();
        }
        o70Var.f26999y0 = false;
    }

    public static void P(o70 o70Var, ValueAnimator valueAnimator) {
        o70Var.f26983h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        o70Var.containerView.invalidate();
    }

    public static void Q(o70 o70Var) {
        a0.i iVar = o70Var.f26981f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(o70Var.currentAccount).getUser(Long.valueOf(iVar.j(i10))));
        }
        org.telegram.ui.u60 u60Var = o70Var.f26987l0;
        if (u60Var != null) {
            u60Var.i(0, arrayList);
        }
        o70Var.dismiss();
    }

    public static ViewGroup U(o70 o70Var) {
        return o70Var.containerView;
    }

    public static ViewGroup W(o70 o70Var) {
        return o70Var.containerView;
    }

    @Override
    public final b71 B(Context context) {
        return new f70(this, context);
    }

    @Override
    public final void E(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.ActionBar.m2 m2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f26998x0 = this.f23576y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f23576y - this.f26998x0) < this.f26990p0 && !this.f26997w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                m2Var = null;
            }
            if (m2Var instanceof org.telegram.ui.wn) {
                boolean P9 = ((org.telegram.ui.wn) m2Var).P9();
                this.f26997w0 = true;
                dv dvVar = new dv(17, this, h2Var);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(dvVar, j3);
                return;
            }
            this.f26997w0 = true;
            setFocusable(true);
            h2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new q1(2, h2Var));
        }
    }

    @Override
    public final void G(String str) {
        k70 k70Var = this.W;
        if (k70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(k70Var.h);
            k70Var.h = null;
        }
        k70Var.f25614c.clear();
        k70Var.d.clear();
        k70Var.e.f(null, null);
        k70Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        k70Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.h0 adapter = k70Var.f25616n.d.getAdapter();
            o70 o70Var = k70Var.f25616n;
            xl0 xl0Var = o70Var.e;
            if (adapter != xl0Var) {
                o70Var.d.setAdapter(xl0Var);
            }
            k70Var.f25616n.f23573s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            j70 j70Var = new j70(k70Var, str, 0);
            k70Var.h = j70Var;
            dispatchQueue.postRunnable(j70Var, 300L);
            return;
        }
        s4.h0 adapter2 = k70Var.f25616n.d.getAdapter();
        o70 o70Var2 = k70Var.f25616n;
        xl0 xl0Var2 = o70Var2.f23570f;
        if (adapter2 != xl0Var2) {
            o70Var2.d.setAdapter(xl0Var2);
        }
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.du duVar) {
        this.m0 = duVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f26988n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Z(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o70.Z(java.util.ArrayList):void");
    }

    public final void a0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f26981f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f26982g0 != z11) {
            ValueAnimator valueAnimator = this.f26984i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f26984i0.cancel();
            }
            this.f26982g0 = z11;
            org.telegram.ui.ActionBar.u1 u1Var = this.V;
            if (z11) {
                u1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f26983h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f26984i0 = ofFloat;
                ofFloat.addUpdateListener(new k6(this, 27));
                this.f26984i0.addListener(new ca(13, this, z11));
                this.f26984i0.setDuration(150L);
                this.f26984i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f26983h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    u1Var.setVisibility(8);
                }
            }
            if (!this.f26982g0 && this.m0 == null) {
                z12 = false;
            }
            this.f26994t0.e(z12, z10);
        }
    }

    public final void b0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f26976a0 = -1;
        boolean z10 = true;
        this.f26978c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j3 = this.f26996v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = X();
            }
            if (z10) {
                int i10 = this.f26978c0;
                this.f26978c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f26980e0;
            if (arrayList.size() != 0) {
                int i11 = this.f26978c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f26978c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f26978c0;
                this.f26978c0 = i12 + 1;
                this.f26976a0 = i12;
            }
        } else if (this.f26988n0.size() != 0) {
            int i13 = this.f26978c0;
            this.Y = i13;
            int size2 = this.f26988n0.size() + i13;
            this.f26978c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f26978c0;
            this.f26978c0 = i14 + 1;
            this.f26976a0 = i14;
        }
        int i15 = this.f26978c0;
        this.f26978c0 = i15 + 1;
        this.f26977b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f26988n0.isEmpty()) {
            this.f26988n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f23570f.l();
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
        if (this.f26997w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (m2Var instanceof org.telegram.ui.wn) {
                    ((org.telegram.ui.wn) m2Var).T9(true, true);
                }
            }
        }
    }
}
