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
public class v70 extends j71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.h T;
    public final u70 U;
    public final org.telegram.ui.ActionBar.v1 V;
    public final r70 W;
    public int X;
    public int Y;
    public int Z;
    public int f31193a0;
    public int f31194b0;
    public int f31195c0;
    public AnimatorSet f31196d0;
    public final ArrayList f31197e0;
    public final a0.h f31198f0;
    public boolean f31199g0;
    public float f31200h0;
    public ValueAnimator f31201i0;
    public v30 f31202j0;
    public int f31203k0;
    public org.telegram.ui.i60 f31204l0;
    public org.telegram.ui.wt m0;
    public ArrayList f31205n0;
    public int f31206o0;
    public final float f31207p0;
    public final org.telegram.ui.ActionBar.n2 f31208q0;
    public final androidx.mediarouter.app.w f31209r0;
    public int f31210s0;
    public final h20 f31211t0;
    public int f31212u0;
    public final long f31213v0;
    public boolean f31214w0;
    public float f31215x0;
    public boolean f31216y0;
    public TLRPC.TL_chatInviteExported f31217z0;

    public v70(Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f31197e0 = new ArrayList();
        this.f31198f0 = new a0.h();
        this.f31200h0 = 0.0f;
        this.f31209r0 = new androidx.mediarouter.app.w(this, 9);
        this.T = hVar;
        this.G = false;
        this.f31208q0 = n2Var;
        this.f31213v0 = j10;
        fixNavigationBar();
        this.f27435w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f31207p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        r70 r70Var = new r70(this);
        this.W = r70Var;
        this.e = r70Var;
        ai.u1 u1Var = this.d;
        p70 p70Var = new p70(this);
        this.f27431f = p70Var;
        u1Var.setAdapter(p70Var);
        this.f27434s.e(false, false);
        this.f27434s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f31197e0.add(user);
            }
        }
        u70 u70Var = new u70(this, context);
        this.U = u70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.yb(this, j10, n2Var, hVar, context));
        ai.u1 u1Var2 = this.d;
        s4.k kVar = new s4.k();
        kVar.f46001o = bs.f25030f;
        kVar.e = 150L;
        kVar.f46017c = 150L;
        kVar.d = 150L;
        setShowWithoutAnimation(false);
        u1Var2.setItemAnimator(kVar);
        c0();
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 1);
        this.V = v1Var;
        v1Var.setVisibility(8);
        v1Var.setClipChildren(false);
        v1Var.addView(u70Var);
        this.containerView.addView(v1Var);
        h20 h20Var = new h20(context, d6Var, false);
        this.f31211t0 = h20Var;
        h20Var.setImageResource(R.drawable.floating_check);
        h20Var.setOnClickListener(new ai.z3(this, context, j10, 4));
        h20Var.e(false, false);
        h20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(h20Var, h20.b());
        ((ViewGroup.MarginLayoutParams) this.f27434s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f27434s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f27434s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void N(org.telegram.ui.Components.v70 r4, long r5, org.telegram.ui.ActionBar.n2 r7, a0.h r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v70.N(org.telegram.ui.Components.v70, long, org.telegram.ui.ActionBar.n2, a0.h, android.content.Context, int):void");
    }

    public static void O(v70 v70Var, Context context, long j10) {
        Activity findActivity;
        a0.h hVar = v70Var.f31198f0;
        if ((v70Var.m0 == null && hVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (v70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
            org.telegram.ui.ny nyVar = (org.telegram.ui.ny) v70Var.m0.f42921b;
            ArrayList arrayList2 = nyVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            nyVar.Z();
            org.telegram.ui.my myVar = nyVar.f39579f;
            if (myVar != null) {
                myVar.a();
            }
            v70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", hVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
        b2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(v70Var.currentAccount).getUser(Long.valueOf(hVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(v70Var.currentAccount).getChat(Long.valueOf(j10));
        if (hVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", hVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(hVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new c61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            b2Var.T = spannableStringBuilder;
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new tv(v70Var, 7));
        i0.a.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void P(v70 v70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            v70Var.f31217z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(v70Var.currentAccount).getChatFull(v70Var.f31213v0);
            if (chatFull != null) {
                chatFull.exported_invite = v70Var.f31217z0;
            }
            if (v70Var.f31217z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", v70Var.f31217z0.link));
            xc.j(v70Var.f31208q0).j();
            v70Var.dismiss();
        }
        v70Var.f31216y0 = false;
    }

    public static void Q(v70 v70Var, ValueAnimator valueAnimator) {
        v70Var.f31200h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        v70Var.containerView.invalidate();
    }

    public static void R(v70 v70Var) {
        a0.h hVar = v70Var.f31198f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(v70Var.currentAccount).getUser(Long.valueOf(hVar.j(i10))));
        }
        org.telegram.ui.i60 i60Var = v70Var.f31204l0;
        if (i60Var != null) {
            i60Var.i(0, arrayList);
        }
        v70Var.dismiss();
    }

    public static ViewGroup U(v70 v70Var) {
        return v70Var.containerView;
    }

    public static ViewGroup V(v70 v70Var) {
        return v70Var.containerView;
    }

    public static ViewGroup X(v70 v70Var) {
        return v70Var.containerView;
    }

    @Override
    public final h71 D(Context context) {
        return new m70(this, context);
    }

    @Override
    public final void F(MotionEvent motionEvent, ei.e2 e2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        long j10;
        if (motionEvent.getAction() == 0) {
            this.f31215x0 = this.f27437y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f27437y - this.f31215x0) < this.f31207p0 && !this.f31214w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.sn) {
                boolean U9 = ((org.telegram.ui.sn) n2Var).U9();
                this.f31214w0 = true;
                yt ytVar = new yt(this, e2Var, 18);
                if (U9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(ytVar, j10);
                return;
            }
            this.f31214w0 = true;
            setFocusable(true);
            e2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new r1(1, e2Var));
        }
    }

    @Override
    public final void H(String str) {
        r70 r70Var = this.W;
        if (r70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(r70Var.h);
            r70Var.h = null;
        }
        r70Var.f29857c.clear();
        r70Var.d.clear();
        r70Var.e.f(null, null);
        r70Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        r70Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.g0 adapter = r70Var.f29859n.d.getAdapter();
            v70 v70Var = r70Var.f29859n;
            hm0 hm0Var = v70Var.e;
            if (adapter != hm0Var) {
                v70Var.d.setAdapter(hm0Var);
            }
            r70Var.f29859n.f27434s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            q70 q70Var = new q70(r70Var, str, 0);
            r70Var.h = q70Var;
            dispatchQueue.postRunnable(q70Var, 300L);
            return;
        }
        s4.g0 adapter2 = r70Var.f29859n.d.getAdapter();
        v70 v70Var2 = r70Var.f29859n;
        hm0 hm0Var2 = v70Var2.f27431f;
        if (adapter2 != hm0Var2) {
            v70Var2.d.setAdapter(hm0Var2);
        }
    }

    public boolean Y() {
        return true;
    }

    public final void Z(org.telegram.ui.wt wtVar) {
        this.m0 = wtVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f31205n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        c0();
    }

    public final void a0(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v70.a0(java.util.ArrayList):void");
    }

    public final void b0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f31198f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f31199g0 != z11) {
            ValueAnimator valueAnimator = this.f31201i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f31201i0.cancel();
            }
            this.f31199g0 = z11;
            org.telegram.ui.ActionBar.v1 v1Var = this.V;
            if (z11) {
                v1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f31200h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f31201i0 = ofFloat;
                ofFloat.addUpdateListener(new l6(this, 28));
                this.f31201i0.addListener(new org.telegram.ui.ho(14, this, z11));
                this.f31201i0.setDuration(150L);
                this.f31201i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f31200h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    v1Var.setVisibility(8);
                }
            }
            if (!this.f31199g0 && this.m0 == null) {
                z12 = false;
            }
            this.f31211t0.e(z12, z10);
        }
    }

    public final void c0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f31193a0 = -1;
        boolean z10 = true;
        this.f31195c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j10 = this.f31213v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = Y();
            }
            if (z10) {
                int i10 = this.f31195c0;
                this.f31195c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f31197e0;
            if (arrayList.size() != 0) {
                int i11 = this.f31195c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f31195c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f31195c0;
                this.f31195c0 = i12 + 1;
                this.f31193a0 = i12;
            }
        } else if (this.f31205n0.size() != 0) {
            int i13 = this.f31195c0;
            this.Y = i13;
            int size2 = this.f31205n0.size() + i13;
            this.f31195c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f31195c0;
            this.f31195c0 = i14 + 1;
            this.f31193a0 = i14;
        }
        int i15 = this.f31195c0;
        this.f31195c0 = i15 + 1;
        this.f31194b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f31205n0.isEmpty()) {
            this.f31205n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f27431f.l();
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
        if (this.f31214w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (n2Var instanceof org.telegram.ui.sn) {
                    ((org.telegram.ui.sn) n2Var).Y9(true, true);
                }
            }
        }
    }
}
