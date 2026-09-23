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
public class c70 extends n61 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.i T;
    public final b70 U;
    public final org.telegram.ui.ActionBar.v1 V;
    public final y60 W;
    public int X;
    public int Y;
    public int Z;
    public int f22951a0;
    public int f22952b0;
    public int f22953c0;
    public AnimatorSet f22954d0;
    public final ArrayList f22955e0;
    public final a0.i f22956f0;
    public boolean f22957g0;
    public float f22958h0;
    public ValueAnimator f22959i0;
    public n30 f22960j0;
    public int f22961k0;
    public org.telegram.ui.w60 f22962l0;
    public org.telegram.ui.eu m0;
    public ArrayList f22963n0;
    public int f22964o0;
    public final float f22965p0;
    public final org.telegram.ui.ActionBar.n2 f22966q0;
    public final androidx.mediarouter.app.x f22967r0;
    public int f22968s0;
    public final z10 f22969t0;
    public int f22970u0;
    public final long f22971v0;
    public boolean f22972w0;
    public float f22973x0;
    public boolean f22974y0;
    public TLRPC.TL_chatInviteExported f22975z0;

    public c70(Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f22955e0 = new ArrayList();
        this.f22956f0 = new a0.i();
        this.f22958h0 = 0.0f;
        this.f22967r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = iVar;
        this.G = false;
        this.f22966q0 = n2Var;
        this.f22971v0 = j3;
        fixNavigationBar();
        this.f26360w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f22965p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        y60 y60Var = new y60(this);
        this.W = y60Var;
        this.e = y60Var;
        ai.w0 w0Var = this.d;
        w60 w60Var = new w60(this);
        this.f26356f = w60Var;
        w0Var.setAdapter(w60Var);
        this.f26359s.e(false, false);
        this.f26359s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f22955e0.add(user);
            }
        }
        b70 b70Var = new b70(this, context);
        this.U = b70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.vb(this, j3, n2Var, iVar, context));
        ai.w0 w0Var2 = this.d;
        s4.j jVar = new s4.j();
        jVar.f42684o = rr.f27701f;
        jVar.e = 150L;
        jVar.f42708c = 150L;
        jVar.d = 150L;
        setShowWithoutAnimation(false);
        w0Var2.setItemAnimator(jVar);
        b0();
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 1);
        this.V = v1Var;
        v1Var.setVisibility(8);
        v1Var.setClipChildren(false);
        v1Var.addView(b70Var);
        this.containerView.addView(v1Var);
        z10 z10Var = new z10(context, d6Var, false);
        this.f22969t0 = z10Var;
        z10Var.setImageResource(R.drawable.floating_check);
        z10Var.setOnClickListener(new org.telegram.ui.co(this, context, j3, 3));
        z10Var.e(false, false);
        z10Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(z10Var, z10.b());
        ((ViewGroup.MarginLayoutParams) this.f26359s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f26359s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f26359s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void M(org.telegram.ui.Components.c70 r4, long r5, org.telegram.ui.ActionBar.n2 r7, a0.i r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c70.M(org.telegram.ui.Components.c70, long, org.telegram.ui.ActionBar.n2, a0.i, android.content.Context, int):void");
    }

    public static void N(c70 c70Var, Context context, long j3) {
        Activity findActivity;
        a0.i iVar = c70Var.f22956f0;
        if ((c70Var.m0 == null && iVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (c70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iVar.m(); i10++) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
            org.telegram.ui.az azVar = (org.telegram.ui.az) c70Var.m0.f33021b;
            ArrayList arrayList2 = azVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            azVar.Z();
            org.telegram.ui.zy zyVar = azVar.f31904f;
            if (zyVar != null) {
                zyVar.a();
            }
            c70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", iVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
        b2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(c70Var.currentAccount).getUser(Long.valueOf(iVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(c70Var.currentAccount).getChat(Long.valueOf(j3));
        if (iVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", iVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(iVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            b2Var.T = spannableStringBuilder;
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new mv(c70Var, 6));
        hg.c.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void O(c70 c70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            c70Var.f22975z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(c70Var.currentAccount).getChatFull(c70Var.f22971v0);
            if (chatFull != null) {
                chatFull.exported_invite = c70Var.f22975z0;
            }
            if (c70Var.f22975z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", c70Var.f22975z0.link));
            xc.j(c70Var.f22966q0).j();
            c70Var.dismiss();
        }
        c70Var.f22974y0 = false;
    }

    public static void P(c70 c70Var, ValueAnimator valueAnimator) {
        c70Var.f22958h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c70Var.containerView.invalidate();
    }

    public static void Q(c70 c70Var) {
        a0.i iVar = c70Var.f22956f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(c70Var.currentAccount).getUser(Long.valueOf(iVar.j(i10))));
        }
        org.telegram.ui.w60 w60Var = c70Var.f22962l0;
        if (w60Var != null) {
            w60Var.j(0, arrayList);
        }
        c70Var.dismiss();
    }

    public static ViewGroup U(c70 c70Var) {
        return c70Var.containerView;
    }

    public static ViewGroup W(c70 c70Var) {
        return c70Var.containerView;
    }

    @Override
    public final l61 B(Context context) {
        return new t60(this, context);
    }

    @Override
    public final void E(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f22973x0 = this.f26362y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f26362y - this.f22973x0) < this.f22965p0 && !this.f22972w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.xn) {
                boolean P9 = ((org.telegram.ui.xn) n2Var).P9();
                this.f22972w0 = true;
                oy oyVar = new oy(11, this, h2Var);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(oyVar, j3);
                return;
            }
            this.f22972w0 = true;
            setFocusable(true);
            h2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new q1(2, h2Var));
        }
    }

    @Override
    public final void G(String str) {
        y60 y60Var = this.W;
        if (y60Var.h != null) {
            Utilities.searchQueue.cancelRunnable(y60Var.h);
            y60Var.h = null;
        }
        y60Var.f30168c.clear();
        y60Var.d.clear();
        y60Var.e.f(null, null);
        y60Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        y60Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.h0 adapter = y60Var.f30170n.d.getAdapter();
            c70 c70Var = y60Var.f30170n;
            ll0 ll0Var = c70Var.e;
            if (adapter != ll0Var) {
                c70Var.d.setAdapter(ll0Var);
            }
            y60Var.f30170n.f26359s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            x60 x60Var = new x60(y60Var, str, 0);
            y60Var.h = x60Var;
            dispatchQueue.postRunnable(x60Var, 300L);
            return;
        }
        s4.h0 adapter2 = y60Var.f30170n.d.getAdapter();
        c70 c70Var2 = y60Var.f30170n;
        ll0 ll0Var2 = c70Var2.f26356f;
        if (adapter2 != ll0Var2) {
            c70Var2.d.setAdapter(ll0Var2);
        }
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.eu euVar) {
        this.m0 = euVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f22963n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Z(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c70.Z(java.util.ArrayList):void");
    }

    public final void a0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f22956f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f22957g0 != z11) {
            ValueAnimator valueAnimator = this.f22959i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f22959i0.cancel();
            }
            this.f22957g0 = z11;
            org.telegram.ui.ActionBar.v1 v1Var = this.V;
            if (z11) {
                v1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f22958h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f22959i0 = ofFloat;
                ofFloat.addUpdateListener(new k6(this, 27));
                this.f22959i0.addListener(new ca(13, this, z11));
                this.f22959i0.setDuration(150L);
                this.f22959i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f22958h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    v1Var.setVisibility(8);
                }
            }
            if (!this.f22957g0 && this.m0 == null) {
                z12 = false;
            }
            this.f22969t0.e(z12, z10);
        }
    }

    public final void b0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f22951a0 = -1;
        boolean z10 = true;
        this.f22953c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j3 = this.f22971v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = X();
            }
            if (z10) {
                int i10 = this.f22953c0;
                this.f22953c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f22955e0;
            if (arrayList.size() != 0) {
                int i11 = this.f22953c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f22953c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f22953c0;
                this.f22953c0 = i12 + 1;
                this.f22951a0 = i12;
            }
        } else if (this.f22963n0.size() != 0) {
            int i13 = this.f22953c0;
            this.Y = i13;
            int size2 = this.f22963n0.size() + i13;
            this.f22953c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f22953c0;
            this.f22953c0 = i14 + 1;
            this.f22951a0 = i14;
        }
        int i15 = this.f22953c0;
        this.f22953c0 = i15 + 1;
        this.f22952b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f22963n0.isEmpty()) {
            this.f22963n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f26356f.l();
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
        if (this.f22972w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (n2Var instanceof org.telegram.ui.xn) {
                    ((org.telegram.ui.xn) n2Var).T9(true, true);
                }
            }
        }
    }
}
