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
public class x70 extends s71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.h T;
    public final w70 U;
    public final org.telegram.ui.ActionBar.u1 V;
    public final t70 W;
    public int X;
    public int Y;
    public int Z;
    public int f32451a0;
    public int f32452b0;
    public int f32453c0;
    public AnimatorSet f32454d0;
    public final ArrayList f32455e0;
    public final a0.h f32456f0;
    public boolean f32457g0;
    public float f32458h0;
    public ValueAnimator f32459i0;
    public v30 f32460j0;
    public int f32461k0;
    public org.telegram.ui.k60 f32462l0;
    public org.telegram.ui.xt m0;
    public ArrayList f32463n0;
    public int f32464o0;
    public final float f32465p0;
    public final org.telegram.ui.ActionBar.o2 f32466q0;
    public final androidx.mediarouter.app.w f32467r0;
    public int f32468s0;
    public final h20 f32469t0;
    public int f32470u0;
    public final long f32471v0;
    public boolean f32472w0;
    public float f32473x0;
    public boolean f32474y0;
    public TLRPC.TL_chatInviteExported f32475z0;

    public x70(Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, g6Var);
        this.f32455e0 = new ArrayList();
        this.f32456f0 = new a0.h();
        this.f32458h0 = 0.0f;
        this.f32467r0 = new androidx.mediarouter.app.w(this, 9);
        this.T = hVar;
        this.G = false;
        this.f32466q0 = o2Var;
        this.f32471v0 = j10;
        fixNavigationBar();
        this.f30408w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f32465p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        t70 t70Var = new t70(this);
        this.W = t70Var;
        this.e = t70Var;
        ai.u1 u1Var = this.d;
        r70 r70Var = new r70(this);
        this.f30404f = r70Var;
        u1Var.setAdapter(r70Var);
        this.f30407s.e(false, false);
        this.f30407s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f32455e0.add(user);
            }
        }
        w70 w70Var = new w70(this, context);
        this.U = w70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.wb(this, j10, o2Var, hVar, context));
        ai.u1 u1Var2 = this.d;
        s4.k kVar = new s4.k();
        kVar.f46406o = bs.f25133f;
        kVar.e = 150L;
        kVar.f46422c = 150L;
        kVar.d = 150L;
        setShowWithoutAnimation(false);
        u1Var2.setItemAnimator(kVar);
        b0();
        org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(this, context, 1);
        this.V = u1Var3;
        u1Var3.setVisibility(8);
        u1Var3.setClipChildren(false);
        u1Var3.addView(w70Var);
        this.containerView.addView(u1Var3);
        h20 h20Var = new h20(context, g6Var, false);
        this.f32469t0 = h20Var;
        h20Var.setImageResource(R.drawable.floating_check);
        h20Var.setOnClickListener(new ai.t3(this, context, j10, 4));
        h20Var.e(false, false);
        h20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(h20Var, h20.b());
        ((ViewGroup.MarginLayoutParams) this.f30407s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f30407s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f30407s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void M(org.telegram.ui.Components.x70 r4, long r5, org.telegram.ui.ActionBar.o2 r7, a0.h r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x70.M(org.telegram.ui.Components.x70, long, org.telegram.ui.ActionBar.o2, a0.h, android.content.Context, int):void");
    }

    public static void N(x70 x70Var, Context context, long j10) {
        Activity findActivity;
        a0.h hVar = x70Var.f32456f0;
        if ((x70Var.m0 == null && hVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (x70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
            org.telegram.ui.ny nyVar = (org.telegram.ui.ny) x70Var.m0.f43642b;
            ArrayList arrayList2 = nyVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            nyVar.Z();
            org.telegram.ui.my myVar = nyVar.f40007f;
            if (myVar != null) {
                myVar.a();
            }
            x70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", hVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        c2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(x70Var.currentAccount).getUser(Long.valueOf(hVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(x70Var.currentAccount).getChat(Long.valueOf(j10));
        if (hVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", hVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(hVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new j61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            c2Var.T = spannableStringBuilder;
        } else {
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new tv(x70Var, 7));
        i2.o1.s(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void O(x70 x70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            x70Var.f32475z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(x70Var.currentAccount).getChatFull(x70Var.f32471v0);
            if (chatFull != null) {
                chatFull.exported_invite = x70Var.f32475z0;
            }
            if (x70Var.f32475z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", x70Var.f32475z0.link));
            xc.j(x70Var.f32466q0).j();
            x70Var.dismiss();
        }
        x70Var.f32474y0 = false;
    }

    public static void P(x70 x70Var, ValueAnimator valueAnimator) {
        x70Var.f32458h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x70Var.containerView.invalidate();
    }

    public static void Q(x70 x70Var) {
        a0.h hVar = x70Var.f32456f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(x70Var.currentAccount).getUser(Long.valueOf(hVar.j(i10))));
        }
        org.telegram.ui.k60 k60Var = x70Var.f32462l0;
        if (k60Var != null) {
            k60Var.i(0, arrayList);
        }
        x70Var.dismiss();
    }

    public static ViewGroup T(x70 x70Var) {
        return x70Var.containerView;
    }

    public static ViewGroup U(x70 x70Var) {
        return x70Var.containerView;
    }

    public static ViewGroup W(x70 x70Var) {
        return x70Var.containerView;
    }

    @Override
    public final q71 C(Context context) {
        return new o70(this, context);
    }

    @Override
    public final void D(MotionEvent motionEvent, ei.e2 e2Var) {
        org.telegram.ui.ActionBar.o2 o2Var;
        long j10;
        if (motionEvent.getAction() == 0) {
            this.f32473x0 = this.f30410y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f30410y - this.f32473x0) < this.f32465p0 && !this.f32472w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                o2Var = (org.telegram.ui.ActionBar.o2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                o2Var = null;
            }
            if (o2Var instanceof org.telegram.ui.sn) {
                boolean U9 = ((org.telegram.ui.sn) o2Var).U9();
                this.f32472w0 = true;
                yt ytVar = new yt(this, e2Var, 18);
                if (U9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(ytVar, j10);
                return;
            }
            this.f32472w0 = true;
            setFocusable(true);
            e2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new n70(e2Var, 0));
        }
    }

    @Override
    public final void F(String str) {
        t70 t70Var = this.W;
        if (t70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(t70Var.h);
            t70Var.h = null;
        }
        t70Var.f30660c.clear();
        t70Var.d.clear();
        t70Var.e.f(null, null);
        t70Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        t70Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.g0 adapter = t70Var.f30662n.d.getAdapter();
            x70 x70Var = t70Var.f30662n;
            lm0 lm0Var = x70Var.e;
            if (adapter != lm0Var) {
                x70Var.d.setAdapter(lm0Var);
            }
            t70Var.f30662n.f30407s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            s70 s70Var = new s70(t70Var, str, 0);
            t70Var.h = s70Var;
            dispatchQueue.postRunnable(s70Var, 300L);
            return;
        }
        s4.g0 adapter2 = t70Var.f30662n.d.getAdapter();
        x70 x70Var2 = t70Var.f30662n;
        lm0 lm0Var2 = x70Var2.f30404f;
        if (adapter2 != lm0Var2) {
            x70Var2.d.setAdapter(lm0Var2);
        }
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.xt xtVar) {
        this.m0 = xtVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f32463n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Z(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x70.Z(java.util.ArrayList):void");
    }

    public final void a0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f32456f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f32457g0 != z11) {
            ValueAnimator valueAnimator = this.f32459i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f32459i0.cancel();
            }
            this.f32457g0 = z11;
            org.telegram.ui.ActionBar.u1 u1Var = this.V;
            if (z11) {
                u1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f32458h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f32459i0 = ofFloat;
                ofFloat.addUpdateListener(new l6(this, 28));
                this.f32459i0.addListener(new org.telegram.ui.ho(14, this, z11));
                this.f32459i0.setDuration(150L);
                this.f32459i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f32458h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    u1Var.setVisibility(8);
                }
            }
            if (!this.f32457g0 && this.m0 == null) {
                z12 = false;
            }
            this.f32469t0.e(z12, z10);
        }
    }

    public final void b0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f32451a0 = -1;
        boolean z10 = true;
        this.f32453c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j10 = this.f32471v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = X();
            }
            if (z10) {
                int i10 = this.f32453c0;
                this.f32453c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f32455e0;
            if (arrayList.size() != 0) {
                int i11 = this.f32453c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f32453c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f32453c0;
                this.f32453c0 = i12 + 1;
                this.f32451a0 = i12;
            }
        } else if (this.f32463n0.size() != 0) {
            int i13 = this.f32453c0;
            this.Y = i13;
            int size2 = this.f32463n0.size() + i13;
            this.f32453c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f32453c0;
            this.f32453c0 = i14 + 1;
            this.f32451a0 = i14;
        }
        int i15 = this.f32453c0;
        this.f32453c0 = i15 + 1;
        this.f32452b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f32463n0.isEmpty()) {
            this.f32463n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f30404f.l();
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
        if (this.f32472w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (o2Var instanceof org.telegram.ui.sn) {
                    ((org.telegram.ui.sn) o2Var).Y9(true, true);
                }
            }
        }
    }
}
