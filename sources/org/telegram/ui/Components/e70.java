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
public class e70 extends r61 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.h Q;
    public final d70 R;
    public final org.telegram.ui.ActionBar.x1 S;
    public final a70 T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public AnimatorSet f26467a0;
    public final ArrayList f26468b0;
    public final a0.h f26469c0;
    public boolean f26470d0;
    public float f26471e0;
    public ValueAnimator f26472f0;
    public p30 f26473g0;
    public int f26474h0;
    public org.telegram.ui.u60 f26475i0;
    public org.telegram.ui.gu f26476j0;
    public ArrayList f26477k0;
    public int f26478l0;
    public final float m0;
    public final org.telegram.ui.ActionBar.p2 f26479n0;
    public final androidx.mediarouter.app.y f26480o0;
    public int f26481p0;
    public final a20 f26482q0;
    public int f26483r0;
    public final long f26484s0;
    public boolean f26485t0;
    public float f26486u0;
    public boolean f26487v0;
    public TLRPC.TL_chatInviteExported f26488w0;

    public e70(Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, g6Var);
        this.f26468b0 = new ArrayList();
        this.f26469c0 = new a0.h();
        this.f26471e0 = 0.0f;
        this.f26480o0 = new androidx.mediarouter.app.y(this, 9);
        this.Q = hVar;
        this.D = false;
        this.f26479n0 = p2Var;
        this.f26484s0 = j10;
        fixNavigationBar();
        this.f30671w.G.setHint(LocaleController.getString(R.string.SearchForChats));
        this.m0 = ViewConfiguration.get(context).getScaledTouchSlop();
        a70 a70Var = new a70(this);
        this.T = a70Var;
        this.f30666e = a70Var;
        mh.d1 d1Var = this.d;
        y60 y60Var = new y60(this);
        this.f30667f = y60Var;
        d1Var.setAdapter(y60Var);
        this.f30670s.e(false, false);
        this.f30670s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f26468b0.add(user);
            }
        }
        d70 d70Var = new d70(this, context);
        this.R = d70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.tb(this, j10, p2Var, hVar, context));
        mh.d1 d1Var2 = this.d;
        f2.l lVar = new f2.l();
        lVar.f5852o = pr.f30168f;
        lVar.f5931e = 150L;
        lVar.f5930c = 150L;
        lVar.d = 150L;
        setShowWithoutAnimation(false);
        d1Var2.setItemAnimator(lVar);
        b0();
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(this, context, 1);
        this.S = x1Var;
        x1Var.setVisibility(8);
        x1Var.setClipChildren(false);
        x1Var.addView(d70Var);
        this.containerView.addView(x1Var);
        a20 a20Var = new a20(context, g6Var, false);
        this.f26482q0 = a20Var;
        a20Var.setImageResource(R.drawable.floating_check);
        a20Var.setOnClickListener(new mh.q2(this, context, j10, 4));
        a20Var.e(false, false);
        a20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(a20Var, a20.b());
        ((ViewGroup.MarginLayoutParams) this.f30670s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f30670s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f30670s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void M(org.telegram.ui.Components.e70 r4, long r5, org.telegram.ui.ActionBar.p2 r7, a0.h r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e70.M(org.telegram.ui.Components.e70, long, org.telegram.ui.ActionBar.p2, a0.h, android.content.Context, int):void");
    }

    public static void N(e70 e70Var, Context context, long j10) {
        Activity findActivity;
        a0.h hVar = e70Var.f26469c0;
        if ((e70Var.f26476j0 == null && hVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (e70Var.f26476j0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
            org.telegram.ui.yy yyVar = (org.telegram.ui.yy) e70Var.f26476j0.f37164b;
            ArrayList arrayList2 = yyVar.f43732e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            yyVar.Z();
            org.telegram.ui.xy xyVar = yyVar.f43733f;
            if (xyVar != null) {
                xyVar.a();
            }
            e70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", hVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        d2Var.O = formatPluralString;
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(e70Var.currentAccount).getUser(Long.valueOf(hVar.j(i11)));
            if (user != null) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("**");
                sb.append(ContactsController.formatName(user.first_name, user.last_name));
                sb.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(e70Var.currentAccount).getChat(Long.valueOf(j10));
        if (hVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", hVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(hVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            d2Var.Q = spannableStringBuilder;
        } else {
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new hv(e70Var, 6));
        l.d.u(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void O(e70 e70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            e70Var.f26488w0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(e70Var.currentAccount).getChatFull(e70Var.f26484s0);
            if (chatFull != null) {
                chatFull.exported_invite = e70Var.f26488w0;
            }
            if (e70Var.f26488w0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", e70Var.f26488w0.link));
            qc.j(e70Var.f26479n0).j();
            e70Var.dismiss();
        }
        e70Var.f26487v0 = false;
    }

    public static void P(e70 e70Var, ValueAnimator valueAnimator) {
        e70Var.f26471e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        e70Var.containerView.invalidate();
    }

    public static void Q(e70 e70Var) {
        a0.h hVar = e70Var.f26469c0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(e70Var.currentAccount).getUser(Long.valueOf(hVar.j(i10))));
        }
        org.telegram.ui.u60 u60Var = e70Var.f26475i0;
        if (u60Var != null) {
            u60Var.i(0, arrayList);
        }
        e70Var.dismiss();
    }

    public static ViewGroup U(e70 e70Var) {
        return e70Var.containerView;
    }

    public static ViewGroup W(e70 e70Var) {
        return e70Var.containerView;
    }

    @Override
    public final p61 C(Context context) {
        return new v60(this, context);
    }

    @Override
    public final void D(MotionEvent motionEvent, lg.f fVar) {
        org.telegram.ui.ActionBar.p2 p2Var;
        long j10;
        if (motionEvent.getAction() == 0) {
            this.f26486u0 = this.f30673y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f30673y - this.f26486u0) < this.m0 && !this.f26485t0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                p2Var = (org.telegram.ui.ActionBar.p2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                p2Var = null;
            }
            if (p2Var instanceof org.telegram.ui.xn) {
                boolean P9 = ((org.telegram.ui.xn) p2Var).P9();
                this.f26485t0 = true;
                eo eoVar = new eo(27, this, fVar);
                if (P9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(eoVar, j10);
                return;
            }
            this.f26485t0 = true;
            setFocusable(true);
            fVar.requestFocus();
            AndroidUtilities.runOnUIThread(new q1(2, fVar));
        }
    }

    @Override
    public final void F(String str) {
        a70 a70Var = this.T;
        if (a70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(a70Var.h);
            a70Var.h = null;
        }
        a70Var.f25172c.clear();
        a70Var.d.clear();
        a70Var.f25173e.f(null, null);
        a70Var.f25173e.g(null, true, false, false, false, 0L, false, 0, 0);
        a70Var.l();
        if (!TextUtils.isEmpty(str)) {
            f2.p0 adapter = a70Var.f25175n.d.getAdapter();
            e70 e70Var = a70Var.f25175n;
            rl0 rl0Var = e70Var.f30666e;
            if (adapter != rl0Var) {
                e70Var.d.setAdapter(rl0Var);
            }
            a70Var.f25175n.f30670s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            z60 z60Var = new z60(a70Var, str, 0);
            a70Var.h = z60Var;
            dispatchQueue.postRunnable(z60Var, 300L);
            return;
        }
        f2.p0 adapter2 = a70Var.f25175n.d.getAdapter();
        e70 e70Var2 = a70Var.f25175n;
        rl0 rl0Var2 = e70Var2.f30667f;
        if (adapter2 != rl0Var2) {
            e70Var2.d.setAdapter(rl0Var2);
        }
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.gu guVar) {
        this.f26476j0 = guVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f26477k0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Z(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e70.Z(java.util.ArrayList):void");
    }

    public final void a0(boolean z4) {
        boolean z10;
        boolean z11 = true;
        if (this.f26469c0.m() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f26470d0 != z10) {
            ValueAnimator valueAnimator = this.f26472f0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f26472f0.cancel();
            }
            this.f26470d0 = z10;
            org.telegram.ui.ActionBar.x1 x1Var = this.S;
            if (z10) {
                x1Var.setVisibility(0);
            }
            float f10 = 0.0f;
            if (z4) {
                float f11 = this.f26471e0;
                if (z10) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f26472f0 = ofFloat;
                ofFloat.addUpdateListener(new f6(this, 27));
                this.f26472f0.addListener(new x20(3, this, z10));
                this.f26472f0.setDuration(150L);
                this.f26472f0.start();
            } else {
                if (z10) {
                    f10 = 1.0f;
                }
                this.f26471e0 = f10;
                this.containerView.invalidate();
                if (!z10) {
                    x1Var.setVisibility(8);
                }
            }
            if (!this.f26470d0 && this.f26476j0 == null) {
                z11 = false;
            }
            this.f26482q0.e(z11, z4);
        }
    }

    public final void b0() {
        this.V = -1;
        this.W = -1;
        this.U = -1;
        this.X = -1;
        boolean z4 = true;
        this.Z = 1;
        if (this.f26476j0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j10 = this.f26484s0;
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
            ArrayList arrayList = this.f26468b0;
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
        } else if (this.f26477k0.size() != 0) {
            int i13 = this.Z;
            this.V = i13;
            int size2 = this.f26477k0.size() + i13;
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
        if (i10 == NotificationCenter.dialogsNeedReload && this.f26476j0 != null && this.f26477k0.isEmpty()) {
            this.f26477k0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f30667f.l();
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
        if (this.f26485t0) {
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
