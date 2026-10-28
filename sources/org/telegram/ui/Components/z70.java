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
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public class z70 extends c81 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.h T;
    public final y70 U;
    public final org.telegram.ui.ActionBar.w1 V;
    public final v70 W;
    public int X;
    public int Y;
    public int Z;
    public int f35261a0;
    public int f35262b0;
    public int f35263c0;
    public AnimatorSet f35264d0;
    public final ArrayList f35265e0;
    public final a0.h f35266f0;
    public boolean f35267g0;
    public float f35268h0;
    public ValueAnimator f35269i0;
    public x30 f35270j0;
    public int f35271k0;
    public org.telegram.ui.o60 f35272l0;
    public org.telegram.ui.st m0;
    public ArrayList f35273n0;
    public int f35274o0;
    public final float f35275p0;
    public final org.telegram.ui.ActionBar.r2 f35276q0;
    public final androidx.mediarouter.app.x f35277r0;
    public int f35278s0;
    public final j20 f35279t0;
    public int f35280u0;
    public final long f35281v0;
    public boolean f35282w0;
    public float f35283x0;
    public boolean f35284y0;
    public TLRPC.TL_chatInviteExported f35285z0;

    public z70(Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, u6Var);
        this.f35265e0 = new ArrayList();
        this.f35266f0 = new a0.h();
        this.f35268h0 = 0.0f;
        this.f35277r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = hVar;
        this.G = false;
        this.f35276q0 = r2Var;
        this.f35281v0 = j10;
        fixNavigationBar();
        this.f27097w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f35275p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        v70 v70Var = new v70(this);
        this.W = v70Var;
        this.e = v70Var;
        bi.r1 r1Var = this.d;
        t70 t70Var = new t70(this);
        this.f27093f = t70Var;
        r1Var.setAdapter(t70Var);
        this.f27096s.e(false, false);
        this.f27096s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f35265e0.add(user);
            }
        }
        y70 y70Var = new y70(this, context);
        this.U = y70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.xb(this, j10, r2Var, hVar, context));
        bi.r1 r1Var2 = this.d;
        s4.l lVar = new s4.l();
        lVar.f47822o = ds.f27530f;
        lVar.e = 150L;
        lVar.f47838c = 150L;
        lVar.d = 150L;
        setShowWithoutAnimation(false);
        r1Var2.setItemAnimator(lVar);
        b0();
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(this, context, 1);
        this.V = w1Var;
        w1Var.setVisibility(8);
        w1Var.setClipChildren(false);
        w1Var.addView(y70Var);
        this.containerView.addView(w1Var);
        j20 j20Var = new j20(context, u6Var, false);
        this.f35279t0 = j20Var;
        j20Var.setImageResource(R.drawable.floating_check);
        j20Var.setOnClickListener(new bi.p3(this, context, j10, 4));
        j20Var.e(false, false);
        j20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(j20Var, j20.b());
        ((ViewGroup.MarginLayoutParams) this.f27096s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f27096s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f27096s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void M(org.telegram.ui.Components.z70 r4, long r5, org.telegram.ui.ActionBar.r2 r7, a0.h r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z70.M(org.telegram.ui.Components.z70, long, org.telegram.ui.ActionBar.r2, a0.h, android.content.Context, int):void");
    }

    public static void N(z70 z70Var, Context context, long j10) {
        Activity findActivity;
        a0.h hVar = z70Var.f35266f0;
        if ((z70Var.m0 == null && hVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (z70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
            org.telegram.ui.ny nyVar = (org.telegram.ui.ny) z70Var.m0.f43402b;
            ArrayList arrayList2 = nyVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            nyVar.a0();
            org.telegram.ui.my myVar = nyVar.f41919f;
            if (myVar != null) {
                myVar.a();
            }
            z70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", hVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(z70Var.currentAccount).getUser(Long.valueOf(hVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(z70Var.currentAccount).getChat(Long.valueOf(j10));
        if (hVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", hVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(hVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new r61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            e2Var.T = spannableStringBuilder;
        } else {
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new tv(z70Var, 7));
        ic.a.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void O(z70 z70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            z70Var.f35285z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(z70Var.currentAccount).getChatFull(z70Var.f35281v0);
            if (chatFull != null) {
                chatFull.exported_invite = z70Var.f35285z0;
            }
            if (z70Var.f35285z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", z70Var.f35285z0.link));
            wc.j(z70Var.f35276q0).j();
            z70Var.dismiss();
        }
        z70Var.f35284y0 = false;
    }

    public static void P(z70 z70Var, ValueAnimator valueAnimator) {
        z70Var.f35268h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        z70Var.containerView.invalidate();
    }

    public static void Q(z70 z70Var) {
        a0.h hVar = z70Var.f35266f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(z70Var.currentAccount).getUser(Long.valueOf(hVar.j(i10))));
        }
        org.telegram.ui.o60 o60Var = z70Var.f35272l0;
        if (o60Var != null) {
            o60Var.f(0, arrayList);
        }
        z70Var.dismiss();
    }

    public static ViewGroup T(z70 z70Var) {
        return z70Var.containerView;
    }

    public static ViewGroup U(z70 z70Var) {
        return z70Var.containerView;
    }

    public static ViewGroup W(z70 z70Var) {
        return z70Var.containerView;
    }

    @Override
    public final a81 C(Context context) {
        return new q70(this, context);
    }

    @Override
    public final void D(MotionEvent motionEvent, fi.c2 c2Var) {
        org.telegram.ui.ActionBar.r2 r2Var;
        long j10;
        if (motionEvent.getAction() == 0) {
            this.f35283x0 = this.f27099y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f27099y - this.f35283x0) < this.f35275p0 && !this.f35282w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                r2Var = (org.telegram.ui.ActionBar.r2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                r2Var = null;
            }
            if (r2Var instanceof org.telegram.ui.wn) {
                boolean ca2 = ((org.telegram.ui.wn) r2Var).ca();
                this.f35282w0 = true;
                so soVar = new so(28, this, c2Var);
                if (ca2) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(soVar, j10);
                return;
            }
            this.f35282w0 = true;
            setFocusable(true);
            c2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new p70(c2Var, 0));
        }
    }

    @Override
    public final void G(String str) {
        v70 v70Var = this.W;
        if (v70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(v70Var.h);
            v70Var.h = null;
        }
        v70Var.f33580c.clear();
        v70Var.d.clear();
        v70Var.e.f(null, null);
        v70Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        v70Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.h0 adapter = v70Var.f33582n.d.getAdapter();
            z70 z70Var = v70Var.f33582n;
            mm0 mm0Var = z70Var.e;
            if (adapter != mm0Var) {
                z70Var.d.setAdapter(mm0Var);
            }
            v70Var.f33582n.f27096s.e(true, false);
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            u70 u70Var = new u70(v70Var, str, 0);
            v70Var.h = u70Var;
            dispatchQueue2.postRunnable(u70Var, 300L);
            return;
        }
        s4.h0 adapter2 = v70Var.f33582n.d.getAdapter();
        z70 z70Var2 = v70Var.f33582n;
        mm0 mm0Var2 = z70Var2.f27093f;
        if (adapter2 != mm0Var2) {
            z70Var2.d.setAdapter(mm0Var2);
        }
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.st stVar) {
        this.m0 = stVar;
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.dialogsNeedReload);
        this.f35273n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Z(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z70.Z(java.util.ArrayList):void");
    }

    public final void a0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f35266f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f35267g0 != z11) {
            ValueAnimator valueAnimator = this.f35269i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f35269i0.cancel();
            }
            this.f35267g0 = z11;
            org.telegram.ui.ActionBar.w1 w1Var = this.V;
            if (z11) {
                w1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f35268h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f35269i0 = ofFloat;
                ofFloat.addUpdateListener(new n6(this, 28));
                this.f35269i0.addListener(new org.telegram.ui.lo(14, this, z11));
                this.f35269i0.setDuration(150L);
                this.f35269i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f35268h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    w1Var.setVisibility(8);
                }
            }
            if (!this.f35267g0 && this.m0 == null) {
                z12 = false;
            }
            this.f35279t0.e(z12, z10);
        }
    }

    public final void b0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f35261a0 = -1;
        boolean z10 = true;
        this.f35263c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j10 = this.f35281v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = X();
            }
            if (z10) {
                int i10 = this.f35263c0;
                this.f35263c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f35265e0;
            if (arrayList.size() != 0) {
                int i11 = this.f35263c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f35263c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f35263c0;
                this.f35263c0 = i12 + 1;
                this.f35261a0 = i12;
            }
        } else if (this.f35273n0.size() != 0) {
            int i13 = this.f35263c0;
            this.Y = i13;
            int size2 = this.f35273n0.size() + i13;
            this.f35263c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f35263c0;
            this.f35263c0 = i14 + 1;
            this.f35261a0 = i14;
        }
        int i15 = this.f35263c0;
        this.f35263c0 = i15 + 1;
        this.f35262b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f35273n0.isEmpty()) {
            this.f35273n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f27093f.l();
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
        if (this.f35282w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (r2Var instanceof org.telegram.ui.wn) {
                    ((org.telegram.ui.wn) r2Var).ga(true, true);
                }
            }
        }
    }
}
