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
public class c70 extends q61 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.h Q;
    public final b70 R;
    public final org.telegram.ui.ActionBar.x1 S;
    public final y60 T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public AnimatorSet f23863a0;
    public final ArrayList f23864b0;
    public final a0.h f23865c0;
    public boolean f23866d0;
    public float f23867e0;
    public ValueAnimator f23868f0;
    public n30 f23869g0;
    public int f23870h0;
    public org.telegram.ui.t60 f23871i0;
    public org.telegram.ui.fu f23872j0;
    public ArrayList f23873k0;
    public int f23874l0;
    public final float m0;
    public final org.telegram.ui.ActionBar.p2 f23875n0;
    public final androidx.mediarouter.app.y f23876o0;
    public int f23877p0;
    public final z10 f23878q0;
    public int f23879r0;
    public final long f23880s0;
    public boolean f23881t0;
    public float f23882u0;
    public boolean f23883v0;
    public TLRPC.TL_chatInviteExported f23884w0;

    public c70(Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f23864b0 = new ArrayList();
        this.f23865c0 = new a0.h();
        this.f23867e0 = 0.0f;
        this.f23876o0 = new androidx.mediarouter.app.y(this, 9);
        this.Q = hVar;
        this.D = false;
        this.f23875n0 = p2Var;
        this.f23880s0 = j10;
        fixNavigationBar();
        this.f28072w.G.setHint(LocaleController.getString(R.string.SearchForChats));
        this.m0 = ViewConfiguration.get(context).getScaledTouchSlop();
        y60 y60Var = new y60(this);
        this.T = y60Var;
        this.e = y60Var;
        lh.e1 e1Var = this.d;
        w60 w60Var = new w60(this);
        this.f28068f = w60Var;
        e1Var.setAdapter(w60Var);
        this.f28071s.e(false, false);
        this.f28071s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f23864b0.add(user);
            }
        }
        b70 b70Var = new b70(this, context);
        this.R = b70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.tb(this, j10, p2Var, hVar, context));
        lh.e1 e1Var2 = this.d;
        f2.l lVar = new f2.l();
        lVar.f5773o = nr.f27346f;
        lVar.e = 150L;
        lVar.f5837c = 150L;
        lVar.d = 150L;
        setShowWithoutAnimation(false);
        e1Var2.setItemAnimator(lVar);
        b0();
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(this, context, 1);
        this.S = x1Var;
        x1Var.setVisibility(8);
        x1Var.setClipChildren(false);
        x1Var.addView(b70Var);
        this.containerView.addView(x1Var);
        z10 z10Var = new z10(context, f6Var, false);
        this.f23878q0 = z10Var;
        z10Var.setImageResource(R.drawable.floating_check);
        z10Var.setOnClickListener(new lh.r2(this, context, j10, 4));
        z10Var.e(false, false);
        z10Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(z10Var, z10.b());
        ((ViewGroup.MarginLayoutParams) this.f28071s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f28071s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f28071s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void M(org.telegram.ui.Components.c70 r4, long r5, org.telegram.ui.ActionBar.p2 r7, a0.h r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c70.M(org.telegram.ui.Components.c70, long, org.telegram.ui.ActionBar.p2, a0.h, android.content.Context, int):void");
    }

    public static void N(c70 c70Var, Context context, long j10) {
        Activity findActivity;
        a0.h hVar = c70Var.f23865c0;
        if ((c70Var.f23872j0 == null && hVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (c70Var.f23872j0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
            org.telegram.ui.xy xyVar = (org.telegram.ui.xy) c70Var.f23872j0.f34355b;
            ArrayList arrayList2 = xyVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            xyVar.Z();
            org.telegram.ui.wy wyVar = xyVar.f40329f;
            if (wyVar != null) {
                wyVar.a();
            }
            c70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", hVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
        d2Var.O = formatPluralString;
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(c70Var.currentAccount).getUser(Long.valueOf(hVar.j(i11)));
            if (user != null) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("**");
                sb.append(ContactsController.formatName(user.first_name, user.last_name));
                sb.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(c70Var.currentAccount).getChat(Long.valueOf(j10));
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
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new fv(c70Var, 6));
        kh.a2.u(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void O(c70 c70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            c70Var.f23884w0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(c70Var.currentAccount).getChatFull(c70Var.f23880s0);
            if (chatFull != null) {
                chatFull.exported_invite = c70Var.f23884w0;
            }
            if (c70Var.f23884w0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", c70Var.f23884w0.link));
            qc.j(c70Var.f23875n0).j();
            c70Var.dismiss();
        }
        c70Var.f23883v0 = false;
    }

    public static void P(c70 c70Var, ValueAnimator valueAnimator) {
        c70Var.f23867e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c70Var.containerView.invalidate();
    }

    public static void Q(c70 c70Var) {
        a0.h hVar = c70Var.f23865c0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(c70Var.currentAccount).getUser(Long.valueOf(hVar.j(i10))));
        }
        org.telegram.ui.t60 t60Var = c70Var.f23871i0;
        if (t60Var != null) {
            t60Var.j(0, arrayList);
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
    public final o61 C(Context context) {
        return new t60(this, context);
    }

    @Override
    public final void D(MotionEvent motionEvent, kg.f fVar) {
        org.telegram.ui.ActionBar.p2 p2Var;
        long j10;
        if (motionEvent.getAction() == 0) {
            this.f23882u0 = this.f28074y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f28074y - this.f23882u0) < this.m0 && !this.f23881t0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                p2Var = (org.telegram.ui.ActionBar.p2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                p2Var = null;
            }
            if (p2Var instanceof org.telegram.ui.xn) {
                boolean P9 = ((org.telegram.ui.xn) p2Var).P9();
                this.f23881t0 = true;
                il ilVar = new il(29, this, fVar);
                if (P9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(ilVar, j10);
                return;
            }
            this.f23881t0 = true;
            setFocusable(true);
            fVar.requestFocus();
            AndroidUtilities.runOnUIThread(new q1(2, fVar));
        }
    }

    @Override
    public final void F(String str) {
        y60 y60Var = this.T;
        if (y60Var.h != null) {
            Utilities.searchQueue.cancelRunnable(y60Var.h);
            y60Var.h = null;
        }
        y60Var.f30889c.clear();
        y60Var.d.clear();
        y60Var.e.f(null, null);
        y60Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        y60Var.l();
        if (!TextUtils.isEmpty(str)) {
            f2.o0 adapter = y60Var.f30891n.d.getAdapter();
            c70 c70Var = y60Var.f30891n;
            rl0 rl0Var = c70Var.e;
            if (adapter != rl0Var) {
                c70Var.d.setAdapter(rl0Var);
            }
            y60Var.f30891n.f28071s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            x60 x60Var = new x60(y60Var, str, 0);
            y60Var.h = x60Var;
            dispatchQueue.postRunnable(x60Var, 300L);
            return;
        }
        f2.o0 adapter2 = y60Var.f30891n.d.getAdapter();
        c70 c70Var2 = y60Var.f30891n;
        rl0 rl0Var2 = c70Var2.f28068f;
        if (adapter2 != rl0Var2) {
            c70Var2.d.setAdapter(rl0Var2);
        }
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.fu fuVar) {
        this.f23872j0 = fuVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f23873k0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Z(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c70.Z(java.util.ArrayList):void");
    }

    public final void a0(boolean z4) {
        boolean z10;
        boolean z11 = true;
        if (this.f23865c0.m() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f23866d0 != z10) {
            ValueAnimator valueAnimator = this.f23868f0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f23868f0.cancel();
            }
            this.f23866d0 = z10;
            org.telegram.ui.ActionBar.x1 x1Var = this.S;
            if (z10) {
                x1Var.setVisibility(0);
            }
            float f10 = 0.0f;
            if (z4) {
                float f11 = this.f23867e0;
                if (z10) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f23868f0 = ofFloat;
                ofFloat.addUpdateListener(new f6(this, 27));
                this.f23868f0.addListener(new l00(5, this, z10));
                this.f23868f0.setDuration(150L);
                this.f23868f0.start();
            } else {
                if (z10) {
                    f10 = 1.0f;
                }
                this.f23867e0 = f10;
                this.containerView.invalidate();
                if (!z10) {
                    x1Var.setVisibility(8);
                }
            }
            if (!this.f23866d0 && this.f23872j0 == null) {
                z11 = false;
            }
            this.f23878q0.e(z11, z4);
        }
    }

    public final void b0() {
        this.V = -1;
        this.W = -1;
        this.U = -1;
        this.X = -1;
        boolean z4 = true;
        this.Z = 1;
        if (this.f23872j0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j10 = this.f23880s0;
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
            ArrayList arrayList = this.f23864b0;
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
        } else if (this.f23873k0.size() != 0) {
            int i13 = this.Z;
            this.V = i13;
            int size2 = this.f23873k0.size() + i13;
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
        if (i10 == NotificationCenter.dialogsNeedReload && this.f23872j0 != null && this.f23873k0.isEmpty()) {
            this.f23873k0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f28068f.l();
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
        if (this.f23881t0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (p2Var instanceof org.telegram.ui.xn) {
                    ((org.telegram.ui.xn) p2Var).T9(true, true);
                }
            }
        }
    }
}
