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
public class p70 extends n71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.i T;
    public final o70 U;
    public final org.telegram.ui.ActionBar.v1 V;
    public final l70 W;
    public int X;
    public int Y;
    public int Z;
    public int f29530a0;
    public int f29531b0;
    public int f29532c0;
    public AnimatorSet f29533d0;
    public final ArrayList f29534e0;
    public final a0.i f29535f0;
    public boolean f29536g0;
    public float f29537h0;
    public ValueAnimator f29538i0;
    public q30 f29539j0;
    public int f29540k0;
    public org.telegram.ui.y60 f29541l0;
    public org.telegram.ui.bu m0;
    public ArrayList f29542n0;
    public int f29543o0;
    public final float f29544p0;
    public final org.telegram.ui.ActionBar.n2 f29545q0;
    public final androidx.mediarouter.app.x f29546r0;
    public int f29547s0;
    public final c20 f29548t0;
    public int f29549u0;
    public final long f29550v0;
    public boolean f29551w0;
    public float f29552x0;
    public boolean f29553y0;
    public TLRPC.TL_chatInviteExported f29554z0;

    public p70(Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f29534e0 = new ArrayList();
        this.f29535f0 = new a0.i();
        this.f29537h0 = 0.0f;
        this.f29546r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = iVar;
        this.G = false;
        this.f29545q0 = n2Var;
        this.f29550v0 = j3;
        fixNavigationBar();
        this.f28895w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f29544p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        l70 l70Var = new l70(this);
        this.W = l70Var;
        this.f28890e = l70Var;
        ai.w0 w0Var = this.d;
        j70 j70Var = new j70(this);
        this.f28891f = j70Var;
        w0Var.setAdapter(j70Var);
        this.f28894s.e(false, false);
        this.f28894s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f29534e0.add(user);
            }
        }
        o70 o70Var = new o70(this, context);
        this.U = o70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.xb(this, j3, n2Var, iVar, context));
        ai.w0 w0Var2 = this.d;
        s4.j jVar = new s4.j();
        jVar.f46589o = tr.f31141f;
        jVar.f46615e = 150L;
        jVar.f46614c = 150L;
        jVar.d = 150L;
        setShowWithoutAnimation(false);
        w0Var2.setItemAnimator(jVar);
        b0();
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 1);
        this.V = v1Var;
        v1Var.setVisibility(8);
        v1Var.setClipChildren(false);
        v1Var.addView(o70Var);
        this.containerView.addView(v1Var);
        c20 c20Var = new c20(context, d6Var, false);
        this.f29548t0 = c20Var;
        c20Var.setImageResource(R.drawable.floating_check);
        c20Var.setOnClickListener(new org.telegram.ui.eo(this, context, j3, 3));
        c20Var.e(false, false);
        c20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(c20Var, c20.b());
        ((ViewGroup.MarginLayoutParams) this.f28894s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f28894s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f28894s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void K(org.telegram.ui.Components.p70 r4, long r5, org.telegram.ui.ActionBar.n2 r7, a0.i r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p70.K(org.telegram.ui.Components.p70, long, org.telegram.ui.ActionBar.n2, a0.i, android.content.Context, int):void");
    }

    public static void L(p70 p70Var, Context context, long j3) {
        Activity findActivity;
        a0.i iVar = p70Var.f29535f0;
        if ((p70Var.m0 == null && iVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (p70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iVar.m(); i10++) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
            org.telegram.ui.dz dzVar = (org.telegram.ui.dz) p70Var.m0.f35193b;
            ArrayList arrayList2 = dzVar.f35865e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            dzVar.Y();
            org.telegram.ui.cz czVar = dzVar.f35866f;
            if (czVar != null) {
                czVar.a();
            }
            p70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", iVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20368a;
        b2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(p70Var.currentAccount).getUser(Long.valueOf(iVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(p70Var.currentAccount).getChat(Long.valueOf(j3));
        if (iVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", iVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(iVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new d61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            b2Var.T = spannableStringBuilder;
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new pv(p70Var, 7));
        hg.k0.o(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void M(p70 p70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            p70Var.f29554z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(p70Var.currentAccount).getChatFull(p70Var.f29550v0);
            if (chatFull != null) {
                chatFull.exported_invite = p70Var.f29554z0;
            }
            if (p70Var.f29554z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", p70Var.f29554z0.link));
            yc.j(p70Var.f29545q0).j();
            p70Var.dismiss();
        }
        p70Var.f29553y0 = false;
    }

    public static void N(p70 p70Var, ValueAnimator valueAnimator) {
        p70Var.f29537h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        p70Var.containerView.invalidate();
    }

    public static void O(p70 p70Var) {
        a0.i iVar = p70Var.f29535f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(p70Var.currentAccount).getUser(Long.valueOf(iVar.j(i10))));
        }
        org.telegram.ui.y60 y60Var = p70Var.f29541l0;
        if (y60Var != null) {
            y60Var.i(0, arrayList);
        }
        p70Var.dismiss();
    }

    public static ViewGroup S(p70 p70Var) {
        return p70Var.containerView;
    }

    public static ViewGroup U(p70 p70Var) {
        return p70Var.containerView;
    }

    @Override
    public final l71 B(Context context) {
        return new g70(this, context);
    }

    @Override
    public final void C(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f29552x0 = this.f28897y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f28897y - this.f29552x0) < this.f29544p0 && !this.f29551w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.yn) {
                boolean O9 = ((org.telegram.ui.yn) n2Var).O9();
                this.f29551w0 = true;
                yw ywVar = new yw(15, this, h2Var);
                if (O9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(ywVar, j3);
                return;
            }
            this.f29551w0 = true;
            setFocusable(true);
            h2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new q1(2, h2Var));
        }
    }

    @Override
    public final void E(String str) {
        l70 l70Var = this.W;
        if (l70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(l70Var.h);
            l70Var.h = null;
        }
        l70Var.f28294c.clear();
        l70Var.d.clear();
        l70Var.f28295e.f(null, null);
        l70Var.f28295e.g(null, true, false, false, false, 0L, false, 0, 0);
        l70Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.h0 adapter = l70Var.f28297n.d.getAdapter();
            p70 p70Var = l70Var.f28297n;
            yl0 yl0Var = p70Var.f28890e;
            if (adapter != yl0Var) {
                p70Var.d.setAdapter(yl0Var);
            }
            l70Var.f28297n.f28894s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            k70 k70Var = new k70(l70Var, str, 0);
            l70Var.h = k70Var;
            dispatchQueue.postRunnable(k70Var, 300L);
            return;
        }
        s4.h0 adapter2 = l70Var.f28297n.d.getAdapter();
        p70 p70Var2 = l70Var.f28297n;
        yl0 yl0Var2 = p70Var2.f28891f;
        if (adapter2 != yl0Var2) {
            p70Var2.d.setAdapter(yl0Var2);
        }
    }

    public boolean W() {
        return true;
    }

    public final void X(org.telegram.ui.bu buVar) {
        this.m0 = buVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f29542n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Y(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p70.Y(java.util.ArrayList):void");
    }

    public final void Z(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f29535f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f29536g0 != z11) {
            ValueAnimator valueAnimator = this.f29538i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f29538i0.cancel();
            }
            this.f29536g0 = z11;
            org.telegram.ui.ActionBar.v1 v1Var = this.V;
            if (z11) {
                v1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f29537h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f29538i0 = ofFloat;
                ofFloat.addUpdateListener(new k6(this, 27));
                this.f29538i0.addListener(new da(13, this, z11));
                this.f29538i0.setDuration(150L);
                this.f29538i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f29537h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    v1Var.setVisibility(8);
                }
            }
            if (!this.f29536g0 && this.m0 == null) {
                z12 = false;
            }
            this.f29548t0.e(z12, z10);
        }
    }

    public final void b0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f29530a0 = -1;
        boolean z10 = true;
        this.f29532c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j3 = this.f29550v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = W();
            }
            if (z10) {
                int i10 = this.f29532c0;
                this.f29532c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f29534e0;
            if (arrayList.size() != 0) {
                int i11 = this.f29532c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f29532c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f29532c0;
                this.f29532c0 = i12 + 1;
                this.f29530a0 = i12;
            }
        } else if (this.f29542n0.size() != 0) {
            int i13 = this.f29532c0;
            this.Y = i13;
            int size2 = this.f29542n0.size() + i13;
            this.f29532c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f29532c0;
            this.f29532c0 = i14 + 1;
            this.f29530a0 = i14;
        }
        int i15 = this.f29532c0;
        this.f29532c0 = i15 + 1;
        this.f29531b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f29542n0.isEmpty()) {
            this.f29542n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f28891f.l();
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
        if (this.f29551w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (n2Var instanceof org.telegram.ui.yn) {
                    ((org.telegram.ui.yn) n2Var).S9(true, true);
                }
            }
        }
    }
}
