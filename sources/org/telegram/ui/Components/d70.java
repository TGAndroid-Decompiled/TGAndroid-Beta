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
public class d70 extends q61 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.h Q;
    public final c70 R;
    public final org.telegram.ui.ActionBar.x1 S;
    public final z60 T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public AnimatorSet f24188a0;
    public final ArrayList f24189b0;
    public final a0.h f24190c0;
    public boolean f24191d0;
    public float f24192e0;
    public ValueAnimator f24193f0;
    public o30 f24194g0;
    public int f24195h0;
    public org.telegram.ui.v60 f24196i0;
    public org.telegram.ui.hu f24197j0;
    public ArrayList f24198k0;
    public int f24199l0;
    public final float m0;
    public final org.telegram.ui.ActionBar.p2 f24200n0;
    public final androidx.mediarouter.app.y f24201o0;
    public int f24202p0;
    public final a20 f24203q0;
    public int f24204r0;
    public final long f24205s0;
    public boolean f24206t0;
    public float f24207u0;
    public boolean f24208v0;
    public TLRPC.TL_chatInviteExported f24209w0;

    public d70(Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f24189b0 = new ArrayList();
        this.f24190c0 = new a0.h();
        this.f24192e0 = 0.0f;
        this.f24201o0 = new androidx.mediarouter.app.y(this, 9);
        this.Q = hVar;
        this.D = false;
        this.f24200n0 = p2Var;
        this.f24205s0 = j10;
        fixNavigationBar();
        this.f28096w.G.setHint(LocaleController.getString(R.string.SearchForChats));
        this.m0 = ViewConfiguration.get(context).getScaledTouchSlop();
        z60 z60Var = new z60(this);
        this.T = z60Var;
        this.e = z60Var;
        lh.e1 e1Var = this.d;
        x60 x60Var = new x60(this);
        this.f28092f = x60Var;
        e1Var.setAdapter(x60Var);
        this.f28095s.e(false, false);
        this.f28095s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f24189b0.add(user);
            }
        }
        c70 c70Var = new c70(this, context);
        this.R = c70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.vb(this, j10, p2Var, hVar, context));
        lh.e1 e1Var2 = this.d;
        f2.l lVar = new f2.l();
        lVar.f5762o = mr.f27122f;
        lVar.e = 150L;
        lVar.f5826c = 150L;
        lVar.d = 150L;
        setShowWithoutAnimation(false);
        e1Var2.setItemAnimator(lVar);
        b0();
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(this, context, 1);
        this.S = x1Var;
        x1Var.setVisibility(8);
        x1Var.setClipChildren(false);
        x1Var.addView(c70Var);
        this.containerView.addView(x1Var);
        a20 a20Var = new a20(context, f6Var, false);
        this.f24203q0 = a20Var;
        a20Var.setImageResource(R.drawable.floating_check);
        a20Var.setOnClickListener(new lh.r2(this, context, j10, 4));
        a20Var.e(false, false);
        a20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(a20Var, a20.b());
        ((ViewGroup.MarginLayoutParams) this.f28095s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f28095s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f28095s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void M(org.telegram.ui.Components.d70 r4, long r5, org.telegram.ui.ActionBar.p2 r7, a0.h r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d70.M(org.telegram.ui.Components.d70, long, org.telegram.ui.ActionBar.p2, a0.h, android.content.Context, int):void");
    }

    public static void N(d70 d70Var, Context context, long j10) {
        Activity findActivity;
        a0.h hVar = d70Var.f24190c0;
        if ((d70Var.f24197j0 == null && hVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (d70Var.f24197j0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
            org.telegram.ui.zy zyVar = (org.telegram.ui.zy) d70Var.f24197j0.f34753b;
            ArrayList arrayList2 = zyVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            zyVar.Z();
            org.telegram.ui.yy yyVar = zyVar.f40895f;
            if (yyVar != null) {
                yyVar.a();
            }
            d70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", hVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        d2Var.O = formatPluralString;
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(d70Var.currentAccount).getUser(Long.valueOf(hVar.j(i11)));
            if (user != null) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("**");
                sb.append(ContactsController.formatName(user.first_name, user.last_name));
                sb.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(d70Var.currentAccount).getChat(Long.valueOf(j10));
        if (hVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", hVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(hVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            d2Var.Q = spannableStringBuilder;
        } else {
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new ev(d70Var, 6));
        kf.k0.u(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void O(d70 d70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            d70Var.f24209w0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(d70Var.currentAccount).getChatFull(d70Var.f24205s0);
            if (chatFull != null) {
                chatFull.exported_invite = d70Var.f24209w0;
            }
            if (d70Var.f24209w0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", d70Var.f24209w0.link));
            qc.j(d70Var.f24200n0).j();
            d70Var.dismiss();
        }
        d70Var.f24208v0 = false;
    }

    public static void P(d70 d70Var, ValueAnimator valueAnimator) {
        d70Var.f24192e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d70Var.containerView.invalidate();
    }

    public static void Q(d70 d70Var) {
        a0.h hVar = d70Var.f24190c0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(d70Var.currentAccount).getUser(Long.valueOf(hVar.j(i10))));
        }
        org.telegram.ui.v60 v60Var = d70Var.f24196i0;
        if (v60Var != null) {
            v60Var.i(0, arrayList);
        }
        d70Var.dismiss();
    }

    public static ViewGroup U(d70 d70Var) {
        return d70Var.containerView;
    }

    public static ViewGroup W(d70 d70Var) {
        return d70Var.containerView;
    }

    @Override
    public final o61 C(Context context) {
        return new u60(this, context);
    }

    @Override
    public final void D(MotionEvent motionEvent, kg.f fVar) {
        org.telegram.ui.ActionBar.p2 p2Var;
        long j10;
        if (motionEvent.getAction() == 0) {
            this.f24207u0 = this.f28098y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f28098y - this.f24207u0) < this.m0 && !this.f24206t0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                p2Var = (org.telegram.ui.ActionBar.p2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                p2Var = null;
            }
            if (p2Var instanceof org.telegram.ui.zn) {
                boolean P9 = ((org.telegram.ui.zn) p2Var).P9();
                this.f24206t0 = true;
                em emVar = new em(28, this, fVar);
                if (P9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(emVar, j10);
                return;
            }
            this.f24206t0 = true;
            setFocusable(true);
            fVar.requestFocus();
            AndroidUtilities.runOnUIThread(new q1(2, fVar));
        }
    }

    @Override
    public final void F(String str) {
        z60 z60Var = this.T;
        if (z60Var.h != null) {
            Utilities.searchQueue.cancelRunnable(z60Var.h);
            z60Var.h = null;
        }
        z60Var.f31262c.clear();
        z60Var.d.clear();
        z60Var.e.f(null, null);
        z60Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        z60Var.l();
        if (!TextUtils.isEmpty(str)) {
            f2.o0 adapter = z60Var.f31264n.d.getAdapter();
            d70 d70Var = z60Var.f31264n;
            ql0 ql0Var = d70Var.e;
            if (adapter != ql0Var) {
                d70Var.d.setAdapter(ql0Var);
            }
            z60Var.f31264n.f28095s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            y60 y60Var = new y60(z60Var, str, 0);
            z60Var.h = y60Var;
            dispatchQueue.postRunnable(y60Var, 300L);
            return;
        }
        f2.o0 adapter2 = z60Var.f31264n.d.getAdapter();
        d70 d70Var2 = z60Var.f31264n;
        ql0 ql0Var2 = d70Var2.f28092f;
        if (adapter2 != ql0Var2) {
            d70Var2.d.setAdapter(ql0Var2);
        }
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.hu huVar) {
        this.f24197j0 = huVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f24198k0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Z(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d70.Z(java.util.ArrayList):void");
    }

    public final void a0(boolean z4) {
        boolean z10;
        boolean z11 = true;
        if (this.f24190c0.m() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f24191d0 != z10) {
            ValueAnimator valueAnimator = this.f24193f0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f24193f0.cancel();
            }
            this.f24191d0 = z10;
            org.telegram.ui.ActionBar.x1 x1Var = this.S;
            if (z10) {
                x1Var.setVisibility(0);
            }
            float f10 = 0.0f;
            if (z4) {
                float f11 = this.f24192e0;
                if (z10) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f24193f0 = ofFloat;
                ofFloat.addUpdateListener(new f6(this, 27));
                this.f24193f0.addListener(new m00(5, this, z10));
                this.f24193f0.setDuration(150L);
                this.f24193f0.start();
            } else {
                if (z10) {
                    f10 = 1.0f;
                }
                this.f24192e0 = f10;
                this.containerView.invalidate();
                if (!z10) {
                    x1Var.setVisibility(8);
                }
            }
            if (!this.f24191d0 && this.f24197j0 == null) {
                z11 = false;
            }
            this.f24203q0.e(z11, z4);
        }
    }

    public final void b0() {
        this.V = -1;
        this.W = -1;
        this.U = -1;
        this.X = -1;
        boolean z4 = true;
        this.Z = 1;
        if (this.f24197j0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j10 = this.f24205s0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z4 = X();
            }
            if (z4) {
                int i10 = this.Z;
                this.Z = i10 + 1;
                this.U = i10;
            }
            ArrayList arrayList = this.f24189b0;
            if (arrayList.size() != 0) {
                int i11 = this.Z;
                this.V = i11;
                int size = arrayList.size() + i11;
                this.Z = size;
                this.W = size;
            } else {
                int i12 = this.Z;
                this.Z = i12 + 1;
                this.X = i12;
            }
        } else if (this.f24198k0.size() != 0) {
            int i13 = this.Z;
            this.V = i13;
            int size2 = this.f24198k0.size() + i13;
            this.Z = size2;
            this.W = size2;
        } else {
            int i14 = this.Z;
            this.Z = i14 + 1;
            this.X = i14;
        }
        int i15 = this.Z;
        this.Z = i15 + 1;
        this.Y = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.f24197j0 != null && this.f24198k0.isEmpty()) {
            this.f24198k0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f28092f.l();
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
        if (this.f24206t0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (p2Var instanceof org.telegram.ui.zn) {
                    ((org.telegram.ui.zn) p2Var).T9(true, true);
                }
            }
        }
    }
}
