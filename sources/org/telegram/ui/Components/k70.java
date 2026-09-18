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
public class k70 extends d71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.i T;
    public final j70 U;
    public final org.telegram.ui.ActionBar.v1 V;
    public final g70 W;
    public int X;
    public int Y;
    public int Z;
    public int f25600a0;
    public int f25601b0;
    public int f25602c0;
    public AnimatorSet f25603d0;
    public final ArrayList f25604e0;
    public final a0.i f25605f0;
    public boolean f25606g0;
    public float f25607h0;
    public ValueAnimator f25608i0;
    public m30 f25609j0;
    public int f25610k0;
    public org.telegram.ui.z60 f25611l0;
    public org.telegram.ui.fu m0;
    public ArrayList f25612n0;
    public int f25613o0;
    public final float f25614p0;
    public final org.telegram.ui.ActionBar.n2 f25615q0;
    public final androidx.mediarouter.app.x f25616r0;
    public int f25617s0;
    public final y10 f25618t0;
    public int f25619u0;
    public final long f25620v0;
    public boolean f25621w0;
    public float f25622x0;
    public boolean f25623y0;
    public TLRPC.TL_chatInviteExported f25624z0;

    public k70(Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.f25604e0 = new ArrayList();
        this.f25605f0 = new a0.i();
        this.f25607h0 = 0.0f;
        this.f25616r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = iVar;
        this.G = false;
        this.f25615q0 = n2Var;
        this.f25620v0 = j3;
        fixNavigationBar();
        this.f23475w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f25614p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        g70 g70Var = new g70(this);
        this.W = g70Var;
        this.e = g70Var;
        ai.w0 w0Var = this.d;
        e70 e70Var = new e70(this);
        this.f23471f = e70Var;
        w0Var.setAdapter(e70Var);
        this.f23474s.e(false, false);
        this.f23474s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f25604e0.add(user);
            }
        }
        j70 j70Var = new j70(this, context);
        this.U = j70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.wb(this, j3, n2Var, iVar, context));
        ai.w0 w0Var2 = this.d;
        s4.j jVar = new s4.j();
        jVar.f42986o = qr.f27715f;
        jVar.e = 150L;
        jVar.f43010c = 150L;
        jVar.d = 150L;
        setShowWithoutAnimation(false);
        w0Var2.setItemAnimator(jVar);
        b0();
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 1);
        this.V = v1Var;
        v1Var.setVisibility(8);
        v1Var.setClipChildren(false);
        v1Var.addView(j70Var);
        this.containerView.addView(v1Var);
        y10 y10Var = new y10(context, e6Var, false);
        this.f25618t0 = y10Var;
        y10Var.setImageResource(R.drawable.floating_check);
        y10Var.setOnClickListener(new org.telegram.ui.fo(this, context, j3, 3));
        y10Var.e(false, false);
        y10Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(y10Var, y10.b());
        ((ViewGroup.MarginLayoutParams) this.f23474s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f23474s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f23474s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void M(org.telegram.ui.Components.k70 r4, long r5, org.telegram.ui.ActionBar.n2 r7, a0.i r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k70.M(org.telegram.ui.Components.k70, long, org.telegram.ui.ActionBar.n2, a0.i, android.content.Context, int):void");
    }

    public static void N(k70 k70Var, Context context, long j3) {
        Activity findActivity;
        a0.i iVar = k70Var.f25605f0;
        if ((k70Var.m0 == null && iVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (k70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iVar.m(); i10++) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
            org.telegram.ui.dz dzVar = (org.telegram.ui.dz) k70Var.m0.f33611b;
            ArrayList arrayList2 = dzVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            dzVar.Z();
            org.telegram.ui.cz czVar = dzVar.f33126f;
            if (czVar != null) {
                czVar.a();
            }
            k70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", iVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
        b2Var.R = formatPluralString;
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
                spannableStringBuilder.setSpan(new u51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            b2Var.T = spannableStringBuilder;
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new lv(k70Var, 6));
        hg.k0.o(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void O(k70 k70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            k70Var.f25624z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(k70Var.currentAccount).getChatFull(k70Var.f25620v0);
            if (chatFull != null) {
                chatFull.exported_invite = k70Var.f25624z0;
            }
            if (k70Var.f25624z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", k70Var.f25624z0.link));
            xc.j(k70Var.f25615q0).j();
            k70Var.dismiss();
        }
        k70Var.f25623y0 = false;
    }

    public static void P(k70 k70Var, ValueAnimator valueAnimator) {
        k70Var.f25607h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        k70Var.containerView.invalidate();
    }

    public static void Q(k70 k70Var) {
        a0.i iVar = k70Var.f25605f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(k70Var.currentAccount).getUser(Long.valueOf(iVar.j(i10))));
        }
        org.telegram.ui.z60 z60Var = k70Var.f25611l0;
        if (z60Var != null) {
            z60Var.j(0, arrayList);
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
    public final b71 B(Context context) {
        return new b70(this, context);
    }

    @Override
    public final void E(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f25622x0 = this.f23477y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f23477y - this.f25622x0) < this.f25614p0 && !this.f25621w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.zn) {
                boolean P9 = ((org.telegram.ui.zn) n2Var).P9();
                this.f25621w0 = true;
                uw uwVar = new uw(15, this, h2Var);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(uwVar, j3);
                return;
            }
            this.f25621w0 = true;
            setFocusable(true);
            h2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new q1(2, h2Var));
        }
    }

    @Override
    public final void G(String str) {
        g70 g70Var = this.W;
        if (g70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(g70Var.h);
            g70Var.h = null;
        }
        g70Var.f24323c.clear();
        g70Var.d.clear();
        g70Var.e.f(null, null);
        g70Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        g70Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.h0 adapter = g70Var.f24325n.d.getAdapter();
            k70 k70Var = g70Var.f24325n;
            vl0 vl0Var = k70Var.e;
            if (adapter != vl0Var) {
                k70Var.d.setAdapter(vl0Var);
            }
            g70Var.f24325n.f23474s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            f70 f70Var = new f70(g70Var, str, 0);
            g70Var.h = f70Var;
            dispatchQueue.postRunnable(f70Var, 300L);
            return;
        }
        s4.h0 adapter2 = g70Var.f24325n.d.getAdapter();
        k70 k70Var2 = g70Var.f24325n;
        vl0 vl0Var2 = k70Var2.f23471f;
        if (adapter2 != vl0Var2) {
            k70Var2.d.setAdapter(vl0Var2);
        }
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.fu fuVar) {
        this.m0 = fuVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f25612n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Z(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k70.Z(java.util.ArrayList):void");
    }

    public final void a0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f25605f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f25606g0 != z11) {
            ValueAnimator valueAnimator = this.f25608i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f25608i0.cancel();
            }
            this.f25606g0 = z11;
            org.telegram.ui.ActionBar.v1 v1Var = this.V;
            if (z11) {
                v1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f25607h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f25608i0 = ofFloat;
                ofFloat.addUpdateListener(new k6(this, 27));
                this.f25608i0.addListener(new ca(13, this, z11));
                this.f25608i0.setDuration(150L);
                this.f25608i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f25607h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    v1Var.setVisibility(8);
                }
            }
            if (!this.f25606g0 && this.m0 == null) {
                z12 = false;
            }
            this.f25618t0.e(z12, z10);
        }
    }

    public final void b0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f25600a0 = -1;
        boolean z10 = true;
        this.f25602c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j3 = this.f25620v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = X();
            }
            if (z10) {
                int i10 = this.f25602c0;
                this.f25602c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f25604e0;
            if (arrayList.size() != 0) {
                int i11 = this.f25602c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f25602c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f25602c0;
                this.f25602c0 = i12 + 1;
                this.f25600a0 = i12;
            }
        } else if (this.f25612n0.size() != 0) {
            int i13 = this.f25602c0;
            this.Y = i13;
            int size2 = this.f25612n0.size() + i13;
            this.f25602c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f25602c0;
            this.f25602c0 = i14 + 1;
            this.f25600a0 = i14;
        }
        int i15 = this.f25602c0;
        this.f25602c0 = i15 + 1;
        this.f25601b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f25612n0.isEmpty()) {
            this.f25612n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f23471f.l();
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
        if (this.f25621w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (n2Var instanceof org.telegram.ui.zn) {
                    ((org.telegram.ui.zn) n2Var).T9(true, true);
                }
            }
        }
    }
}
