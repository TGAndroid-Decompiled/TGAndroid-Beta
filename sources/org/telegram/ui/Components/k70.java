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
public class k70 extends b71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.i T;
    public final j70 U;
    public final org.telegram.ui.ActionBar.x1 V;
    public final g70 W;
    public int X;
    public int Y;
    public int Z;
    public int f24626a0;
    public int f24627b0;
    public int f24628c0;
    public AnimatorSet f24629d0;
    public final ArrayList f24630e0;
    public final a0.i f24631f0;
    public boolean f24632g0;
    public float f24633h0;
    public ValueAnimator f24634i0;
    public w30 f24635j0;
    public int f24636k0;
    public org.telegram.ui.z60 f24637l0;
    public org.telegram.ui.iu m0;
    public ArrayList f24638n0;
    public int f24639o0;
    public final float f24640p0;
    public final org.telegram.ui.ActionBar.p2 f24641q0;
    public final androidx.mediarouter.app.x f24642r0;
    public int f24643s0;
    public final h20 f24644t0;
    public int f24645u0;
    public final long f24646v0;
    public boolean f24647w0;
    public float f24648x0;
    public boolean f24649y0;
    public TLRPC.TL_chatInviteExported f24650z0;

    public k70(Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f24630e0 = new ArrayList();
        this.f24631f0 = new a0.i();
        this.f24633h0 = 0.0f;
        this.f24642r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = iVar;
        this.G = false;
        this.f24641q0 = p2Var;
        this.f24646v0 = j3;
        fixNavigationBar();
        this.f21750w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f24640p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        g70 g70Var = new g70(this);
        this.W = g70Var;
        this.e = g70Var;
        bi.y1 y1Var = this.d;
        e70 e70Var = new e70(this);
        this.f21746f = e70Var;
        y1Var.setAdapter(e70Var);
        this.f21749s.e(false, false);
        this.f21749s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f24630e0.add(user);
            }
        }
        j70 j70Var = new j70(this, context);
        this.U = j70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.xb(this, j3, p2Var, iVar, context));
        bi.y1 y1Var2 = this.d;
        s4.j jVar = new s4.j();
        jVar.f41667o = wr.f28819f;
        jVar.e = 150L;
        jVar.f41691c = 150L;
        jVar.d = 150L;
        setShowWithoutAnimation(false);
        y1Var2.setItemAnimator(jVar);
        b0();
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(this, context, 1);
        this.V = x1Var;
        x1Var.setVisibility(8);
        x1Var.setClipChildren(false);
        x1Var.addView(j70Var);
        this.containerView.addView(x1Var);
        h20 h20Var = new h20(context, f6Var, false);
        this.f24644t0 = h20Var;
        h20Var.setImageResource(R.drawable.floating_check);
        h20Var.setOnClickListener(new org.telegram.ui.jo(this, context, j3, 3));
        h20Var.e(false, false);
        h20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(h20Var, h20.b());
        ((ViewGroup.MarginLayoutParams) this.f21749s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f21749s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f21749s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void M(org.telegram.ui.Components.k70 r4, long r5, org.telegram.ui.ActionBar.p2 r7, a0.i r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k70.M(org.telegram.ui.Components.k70, long, org.telegram.ui.ActionBar.p2, a0.i, android.content.Context, int):void");
    }

    public static void N(k70 k70Var, Context context, long j3) {
        Activity findActivity;
        a0.i iVar = k70Var.f24631f0;
        if ((k70Var.m0 == null && iVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (k70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iVar.m(); i10++) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
            org.telegram.ui.fz fzVar = (org.telegram.ui.fz) k70Var.m0.f33798b;
            ArrayList arrayList2 = fzVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            fzVar.Z();
            org.telegram.ui.ez ezVar = fzVar.f32939f;
            if (ezVar != null) {
                ezVar.a();
            }
            k70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", iVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(k70Var.currentAccount).getUser(Long.valueOf(iVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(k70Var.currentAccount).getChat(Long.valueOf(j3));
        if (iVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", iVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(iVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            d2Var.T = spannableStringBuilder;
        } else {
            d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new pv(k70Var, 6));
        hc.b.s(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void O(k70 k70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            k70Var.f24650z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(k70Var.currentAccount).getChatFull(k70Var.f24646v0);
            if (chatFull != null) {
                chatFull.exported_invite = k70Var.f24650z0;
            }
            if (k70Var.f24650z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", k70Var.f24650z0.link));
            wc.j(k70Var.f24641q0).j();
            k70Var.dismiss();
        }
        k70Var.f24649y0 = false;
    }

    public static void P(k70 k70Var, ValueAnimator valueAnimator) {
        k70Var.f24633h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        k70Var.containerView.invalidate();
    }

    public static void Q(k70 k70Var) {
        a0.i iVar = k70Var.f24631f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(k70Var.currentAccount).getUser(Long.valueOf(iVar.j(i10))));
        }
        org.telegram.ui.z60 z60Var = k70Var.f24637l0;
        if (z60Var != null) {
            z60Var.k(0, arrayList);
        }
        k70Var.dismiss();
    }

    public static ViewGroup U(k70 k70Var) {
        return k70Var.containerView;
    }

    public static ViewGroup W(k70 k70Var) {
        return k70Var.containerView;
    }

    @Override
    public final z61 C(Context context) {
        return new b70(this, context);
    }

    @Override
    public final void D(MotionEvent motionEvent, bi.t2 t2Var) {
        org.telegram.ui.ActionBar.p2 p2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f24648x0 = this.f21752y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f21752y - this.f24648x0) < this.f24640p0 && !this.f24647w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                p2Var = (org.telegram.ui.ActionBar.p2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                p2Var = null;
            }
            if (p2Var instanceof org.telegram.ui.eo) {
                boolean P9 = ((org.telegram.ui.eo) p2Var).P9();
                this.f24647w0 = true;
                hy hyVar = new hy(14, this, t2Var);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(hyVar, j3);
                return;
            }
            this.f24647w0 = true;
            setFocusable(true);
            t2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new s1(2, t2Var));
        }
    }

    @Override
    public final void F(String str) {
        g70 g70Var = this.W;
        if (g70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(g70Var.h);
            g70Var.h = null;
        }
        g70Var.f23261c.clear();
        g70Var.d.clear();
        g70Var.e.f(null, null);
        g70Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        g70Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.h0 adapter = g70Var.f23263n.d.getAdapter();
            k70 k70Var = g70Var.f23263n;
            ul0 ul0Var = k70Var.e;
            if (adapter != ul0Var) {
                k70Var.d.setAdapter(ul0Var);
            }
            g70Var.f23263n.f21749s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            f70 f70Var = new f70(g70Var, str, 0);
            g70Var.h = f70Var;
            dispatchQueue.postRunnable(f70Var, 300L);
            return;
        }
        s4.h0 adapter2 = g70Var.f23263n.d.getAdapter();
        k70 k70Var2 = g70Var.f23263n;
        ul0 ul0Var2 = k70Var2.f21746f;
        if (adapter2 != ul0Var2) {
            k70Var2.d.setAdapter(ul0Var2);
        }
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.iu iuVar) {
        this.m0 = iuVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f24638n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Z(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k70.Z(java.util.ArrayList):void");
    }

    public final void a0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f24631f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f24632g0 != z11) {
            ValueAnimator valueAnimator = this.f24634i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f24634i0.cancel();
            }
            this.f24632g0 = z11;
            org.telegram.ui.ActionBar.x1 x1Var = this.V;
            if (z11) {
                x1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f24633h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f24634i0 = ofFloat;
                ofFloat.addUpdateListener(new j6(this, 27));
                this.f24634i0.addListener(new yo(9, this, z11));
                this.f24634i0.setDuration(150L);
                this.f24634i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f24633h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    x1Var.setVisibility(8);
                }
            }
            if (!this.f24632g0 && this.m0 == null) {
                z12 = false;
            }
            this.f24644t0.e(z12, z10);
        }
    }

    public final void b0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f24626a0 = -1;
        boolean z10 = true;
        this.f24628c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j3 = this.f24646v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = X();
            }
            if (z10) {
                int i10 = this.f24628c0;
                this.f24628c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f24630e0;
            if (arrayList.size() != 0) {
                int i11 = this.f24628c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f24628c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f24628c0;
                this.f24628c0 = i12 + 1;
                this.f24626a0 = i12;
            }
        } else if (this.f24638n0.size() != 0) {
            int i13 = this.f24628c0;
            this.Y = i13;
            int size2 = this.f24638n0.size() + i13;
            this.f24628c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f24628c0;
            this.f24628c0 = i14 + 1;
            this.f24626a0 = i14;
        }
        int i15 = this.f24628c0;
        this.f24628c0 = i15 + 1;
        this.f24627b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f24638n0.isEmpty()) {
            this.f24638n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f21746f.l();
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
        if (this.f24647w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (p2Var instanceof org.telegram.ui.eo) {
                    ((org.telegram.ui.eo) p2Var).T9(true, true);
                }
            }
        }
    }
}
