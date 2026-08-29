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
public class x60 extends f61 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.h P;
    public final w60 Q;
    public final org.telegram.ui.ActionBar.w1 R;
    public final t60 S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public AnimatorSet Z;
    public final ArrayList f34604a0;
    public final a0.h f34605b0;
    public boolean f34606c0;
    public float f34607d0;
    public ValueAnimator f34608e0;
    public j30 f34609f0;
    public int f34610g0;
    public org.telegram.ui.h60 f34611h0;
    public org.telegram.ui.xt f34612i0;
    public ArrayList f34613j0;
    public int f34614k0;
    public final float f34615l0;
    public final org.telegram.ui.ActionBar.o2 m0;
    public final androidx.mediarouter.app.v f34616n0;
    public int f34617o0;
    public final u10 f34618p0;
    public int f34619q0;
    public final long f34620r0;
    public boolean f34621s0;
    public float f34622t0;
    public boolean f34623u0;
    public TLRPC.TL_chatInviteExported f34624v0;

    public x60(Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f34604a0 = new ArrayList();
        this.f34605b0 = new a0.h();
        this.f34607d0 = 0.0f;
        this.f34616n0 = new androidx.mediarouter.app.v(this, 9);
        this.P = hVar;
        this.C = false;
        this.m0 = o2Var;
        this.f34620r0 = j10;
        fixNavigationBar();
        this.f28335w.F.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f34615l0 = ViewConfiguration.get(context).getScaledTouchSlop();
        t60 t60Var = new t60(this);
        this.S = t60Var;
        this.f28330e = t60Var;
        jh.e1 e1Var = this.d;
        r60 r60Var = new r60(this);
        this.f28331f = r60Var;
        e1Var.setAdapter(r60Var);
        this.f28334s.e(false, false);
        this.f28334s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f34604a0.add(user);
            }
        }
        w60 w60Var = new w60(this, context);
        this.Q = w60Var;
        this.d.setOnItemClickListener(new org.telegram.ui.pb(this, j10, o2Var, hVar, context));
        jh.e1 e1Var2 = this.d;
        f2.l lVar = new f2.l();
        lVar.f6404o = jr.f29800f;
        lVar.f6487e = 150L;
        lVar.f6486c = 150L;
        lVar.d = 150L;
        setShowWithoutAnimation(false);
        e1Var2.setItemAnimator(lVar);
        b0();
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(this, context, 1);
        this.R = w1Var;
        w1Var.setVisibility(8);
        w1Var.setClipChildren(false);
        w1Var.addView(w60Var);
        this.containerView.addView(w1Var);
        u10 u10Var = new u10(context, c6Var, false);
        this.f34618p0 = u10Var;
        u10Var.setImageResource(R.drawable.floating_check);
        u10Var.setOnClickListener(new jh.q2(this, context, j10, 4));
        u10Var.e(false, false);
        u10Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(u10Var, u10.b());
        ((ViewGroup.MarginLayoutParams) this.f28334s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f28334s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f28334s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void L(org.telegram.ui.Components.x60 r4, long r5, org.telegram.ui.ActionBar.o2 r7, a0.h r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x60.L(org.telegram.ui.Components.x60, long, org.telegram.ui.ActionBar.o2, a0.h, android.content.Context, int):void");
    }

    public static void M(x60 x60Var, Context context, long j10) {
        Activity findActivity;
        a0.h hVar = x60Var.f34605b0;
        if ((x60Var.f34612i0 == null && hVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (x60Var.f34612i0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
            org.telegram.ui.oy oyVar = (org.telegram.ui.oy) x60Var.f34612i0.f44653b;
            ArrayList arrayList2 = oyVar.f41240e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            oyVar.Z();
            org.telegram.ui.ny nyVar = oyVar.f41241f;
            if (nyVar != null) {
                nyVar.a();
            }
            x60Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", hVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(x60Var.currentAccount).getUser(Long.valueOf(hVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(x60Var.currentAccount).getChat(Long.valueOf(j10));
        if (hVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", hVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(hVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            c2Var.P = spannableStringBuilder;
        } else {
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new cv(x60Var, 6));
        j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void O(x60 x60Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            x60Var.f34624v0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(x60Var.currentAccount).getChatFull(x60Var.f34620r0);
            if (chatFull != null) {
                chatFull.exported_invite = x60Var.f34624v0;
            }
            if (x60Var.f34624v0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", x60Var.f34624v0.link));
            tc.j(x60Var.m0).j();
            x60Var.dismiss();
        }
        x60Var.f34623u0 = false;
    }

    public static void P(x60 x60Var, ValueAnimator valueAnimator) {
        x60Var.f34607d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x60Var.containerView.invalidate();
    }

    public static void Q(x60 x60Var) {
        a0.h hVar = x60Var.f34605b0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(x60Var.currentAccount).getUser(Long.valueOf(hVar.j(i10))));
        }
        org.telegram.ui.h60 h60Var = x60Var.f34611h0;
        if (h60Var != null) {
            h60Var.j(0, arrayList);
        }
        x60Var.dismiss();
    }

    public static ViewGroup U(x60 x60Var) {
        return x60Var.containerView;
    }

    public static ViewGroup W(x60 x60Var) {
        return x60Var.containerView;
    }

    @Override
    public final d61 C(Context context) {
        return new o60(this, context);
    }

    @Override
    public final void D(MotionEvent motionEvent, ig.f fVar) {
        org.telegram.ui.ActionBar.o2 o2Var;
        long j10;
        if (motionEvent.getAction() == 0) {
            this.f34622t0 = this.f28337y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f28337y - this.f34622t0) < this.f34615l0 && !this.f34621s0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                o2Var = (org.telegram.ui.ActionBar.o2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                o2Var = null;
            }
            if (o2Var instanceof org.telegram.ui.tn) {
                boolean P9 = ((org.telegram.ui.tn) o2Var).P9();
                this.f34621s0 = true;
                gt gtVar = new gt(20, this, fVar);
                if (P9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(gtVar, j10);
                return;
            }
            this.f34621s0 = true;
            setFocusable(true);
            fVar.requestFocus();
            AndroidUtilities.runOnUIThread(new s1(2, fVar));
        }
    }

    @Override
    public final void F(String str) {
        t60 t60Var = this.S;
        if (t60Var.h != null) {
            Utilities.searchQueue.cancelRunnable(t60Var.h);
            t60Var.h = null;
        }
        t60Var.f32879c.clear();
        t60Var.d.clear();
        t60Var.f32880e.f(null, null);
        t60Var.f32880e.g(null, true, false, false, false, 0L, false, 0, 0);
        t60Var.l();
        if (!TextUtils.isEmpty(str)) {
            f2.p0 adapter = t60Var.f32882n.d.getAdapter();
            x60 x60Var = t60Var.f32882n;
            il0 il0Var = x60Var.f28330e;
            if (adapter != il0Var) {
                x60Var.d.setAdapter(il0Var);
            }
            t60Var.f32882n.f28334s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            s60 s60Var = new s60(t60Var, str, 0);
            t60Var.h = s60Var;
            dispatchQueue.postRunnable(s60Var, 300L);
            return;
        }
        f2.p0 adapter2 = t60Var.f32882n.d.getAdapter();
        x60 x60Var2 = t60Var.f32882n;
        il0 il0Var2 = x60Var2.f28331f;
        if (adapter2 != il0Var2) {
            x60Var2.d.setAdapter(il0Var2);
        }
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.xt xtVar) {
        this.f34612i0 = xtVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f34613j0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Z(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x60.Z(java.util.ArrayList):void");
    }

    public final void a0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f34605b0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f34606c0 != z11) {
            ValueAnimator valueAnimator = this.f34608e0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f34608e0.cancel();
            }
            this.f34606c0 = z11;
            org.telegram.ui.ActionBar.w1 w1Var = this.R;
            if (z11) {
                w1Var.setVisibility(0);
            }
            float f9 = 0.0f;
            if (z10) {
                float f10 = this.f34607d0;
                if (z11) {
                    f9 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
                this.f34608e0 = ofFloat;
                ofFloat.addUpdateListener(new j6(this, 27));
                this.f34608e0.addListener(new z9(13, this, z11));
                this.f34608e0.setDuration(150L);
                this.f34608e0.start();
            } else {
                if (z11) {
                    f9 = 1.0f;
                }
                this.f34607d0 = f9;
                this.containerView.invalidate();
                if (!z11) {
                    w1Var.setVisibility(8);
                }
            }
            if (!this.f34606c0 && this.f34612i0 == null) {
                z12 = false;
            }
            this.f34618p0.e(z12, z10);
        }
    }

    public final void b0() {
        this.U = -1;
        this.V = -1;
        this.T = -1;
        this.W = -1;
        boolean z10 = true;
        this.Y = 1;
        if (this.f34612i0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j10 = this.f34620r0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = X();
            }
            if (z10) {
                int i10 = this.Y;
                this.Y = i10 + 1;
                this.T = i10;
            }
            ArrayList arrayList = this.f34604a0;
            if (arrayList.size() != 0) {
                int i11 = this.Y;
                this.U = i11;
                int size = arrayList.size() + i11;
                this.Y = size;
                this.V = size;
            } else {
                int i12 = this.Y;
                this.Y = i12 + 1;
                this.W = i12;
            }
        } else if (this.f34613j0.size() != 0) {
            int i13 = this.Y;
            this.U = i13;
            int size2 = this.f34613j0.size() + i13;
            this.Y = size2;
            this.V = size2;
        } else {
            int i14 = this.Y;
            this.Y = i14 + 1;
            this.W = i14;
        }
        int i15 = this.Y;
        this.Y = i15 + 1;
        this.X = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.f34612i0 != null && this.f34613j0.isEmpty()) {
            this.f34613j0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f28331f.l();
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
        if (this.f34621s0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (o2Var instanceof org.telegram.ui.tn) {
                    ((org.telegram.ui.tn) o2Var).T9(true, true);
                }
            }
        }
    }
}
