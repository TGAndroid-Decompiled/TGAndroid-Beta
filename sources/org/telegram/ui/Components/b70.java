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
public class b70 extends o61 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.i T;
    public final a70 U;
    public final org.telegram.ui.ActionBar.v1 V;
    public final x60 W;
    public int X;
    public int Y;
    public int Z;
    public int f22671a0;
    public int f22672b0;
    public int f22673c0;
    public AnimatorSet f22674d0;
    public final ArrayList f22675e0;
    public final a0.i f22676f0;
    public boolean f22677g0;
    public float f22678h0;
    public ValueAnimator f22679i0;
    public m30 f22680j0;
    public int f22681k0;
    public org.telegram.ui.z60 f22682l0;
    public org.telegram.ui.hu m0;
    public ArrayList f22683n0;
    public int f22684o0;
    public final float f22685p0;
    public final org.telegram.ui.ActionBar.n2 f22686q0;
    public final androidx.mediarouter.app.x f22687r0;
    public int f22688s0;
    public final y10 f22689t0;
    public int f22690u0;
    public final long f22691v0;
    public boolean f22692w0;
    public float f22693x0;
    public boolean f22694y0;
    public TLRPC.TL_chatInviteExported f22695z0;

    public b70(Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.f22675e0 = new ArrayList();
        this.f22676f0 = new a0.i();
        this.f22678h0 = 0.0f;
        this.f22687r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = iVar;
        this.G = false;
        this.f22686q0 = n2Var;
        this.f22691v0 = j3;
        fixNavigationBar();
        this.f26710w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f22685p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        x60 x60Var = new x60(this);
        this.W = x60Var;
        this.e = x60Var;
        ai.w0 w0Var = this.d;
        v60 v60Var = new v60(this);
        this.f26706f = v60Var;
        w0Var.setAdapter(v60Var);
        this.f26709s.e(false, false);
        this.f26709s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f22675e0.add(user);
            }
        }
        a70 a70Var = new a70(this, context);
        this.U = a70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.vb(this, j3, n2Var, iVar, context));
        ai.w0 w0Var2 = this.d;
        s4.j jVar = new s4.j();
        jVar.f42732o = qr.f27423f;
        jVar.e = 150L;
        jVar.f42756c = 150L;
        jVar.d = 150L;
        setShowWithoutAnimation(false);
        w0Var2.setItemAnimator(jVar);
        b0();
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 1);
        this.V = v1Var;
        v1Var.setVisibility(8);
        v1Var.setClipChildren(false);
        v1Var.addView(a70Var);
        this.containerView.addView(v1Var);
        y10 y10Var = new y10(context, e6Var, false);
        this.f22689t0 = y10Var;
        y10Var.setImageResource(R.drawable.floating_check);
        y10Var.setOnClickListener(new org.telegram.ui.ho(this, context, j3, 3));
        y10Var.e(false, false);
        y10Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(y10Var, y10.b());
        ((ViewGroup.MarginLayoutParams) this.f26709s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f26709s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f26709s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void M(org.telegram.ui.Components.b70 r4, long r5, org.telegram.ui.ActionBar.n2 r7, a0.i r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b70.M(org.telegram.ui.Components.b70, long, org.telegram.ui.ActionBar.n2, a0.i, android.content.Context, int):void");
    }

    public static void N(b70 b70Var, Context context, long j3) {
        Activity findActivity;
        a0.i iVar = b70Var.f22676f0;
        if ((b70Var.m0 == null && iVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (b70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iVar.m(); i10++) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
            org.telegram.ui.dz dzVar = (org.telegram.ui.dz) b70Var.m0.f34344b;
            ArrayList arrayList2 = dzVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            dzVar.Z();
            org.telegram.ui.cz czVar = dzVar.f33166f;
            if (czVar != null) {
                czVar.a();
            }
            b70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", iVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18437a;
        b2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(b70Var.currentAccount).getUser(Long.valueOf(iVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(b70Var.currentAccount).getChat(Long.valueOf(j3));
        if (iVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", iVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(iVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            b2Var.T = spannableStringBuilder;
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new lv(b70Var, 6));
        hg.k0.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void O(b70 b70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            b70Var.f22695z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(b70Var.currentAccount).getChatFull(b70Var.f22691v0);
            if (chatFull != null) {
                chatFull.exported_invite = b70Var.f22695z0;
            }
            if (b70Var.f22695z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", b70Var.f22695z0.link));
            vc.j(b70Var.f22686q0).j();
            b70Var.dismiss();
        }
        b70Var.f22694y0 = false;
    }

    public static void P(b70 b70Var, ValueAnimator valueAnimator) {
        b70Var.f22678h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        b70Var.containerView.invalidate();
    }

    public static void Q(b70 b70Var) {
        a0.i iVar = b70Var.f22676f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(b70Var.currentAccount).getUser(Long.valueOf(iVar.j(i10))));
        }
        org.telegram.ui.z60 z60Var = b70Var.f22682l0;
        if (z60Var != null) {
            z60Var.j(0, arrayList);
        }
        b70Var.dismiss();
    }

    public static ViewGroup U(b70 b70Var) {
        return b70Var.containerView;
    }

    public static ViewGroup W(b70 b70Var) {
        return b70Var.containerView;
    }

    @Override
    public final m61 B(Context context) {
        return new s60(this, context);
    }

    @Override
    public final void E(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f22693x0 = this.f26712y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f26712y - this.f22693x0) < this.f22685p0 && !this.f22692w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.bo) {
                boolean P9 = ((org.telegram.ui.bo) n2Var).P9();
                this.f22692w0 = true;
                ny nyVar = new ny(11, this, h2Var);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(nyVar, j3);
                return;
            }
            this.f22692w0 = true;
            setFocusable(true);
            h2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new q1(2, h2Var));
        }
    }

    @Override
    public final void G(String str) {
        x60 x60Var = this.W;
        if (x60Var.h != null) {
            Utilities.searchQueue.cancelRunnable(x60Var.h);
            x60Var.h = null;
        }
        x60Var.f29896c.clear();
        x60Var.d.clear();
        x60Var.e.f(null, null);
        x60Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        x60Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.h0 adapter = x60Var.f29898n.d.getAdapter();
            b70 b70Var = x60Var.f29898n;
            kl0 kl0Var = b70Var.e;
            if (adapter != kl0Var) {
                b70Var.d.setAdapter(kl0Var);
            }
            x60Var.f29898n.f26709s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            w60 w60Var = new w60(x60Var, str, 0);
            x60Var.h = w60Var;
            dispatchQueue.postRunnable(w60Var, 300L);
            return;
        }
        s4.h0 adapter2 = x60Var.f29898n.d.getAdapter();
        b70 b70Var2 = x60Var.f29898n;
        kl0 kl0Var2 = b70Var2.f26706f;
        if (adapter2 != kl0Var2) {
            b70Var2.d.setAdapter(kl0Var2);
        }
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.hu huVar) {
        this.m0 = huVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f22683n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Z(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b70.Z(java.util.ArrayList):void");
    }

    public final void a0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f22676f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f22677g0 != z11) {
            ValueAnimator valueAnimator = this.f22679i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f22679i0.cancel();
            }
            this.f22677g0 = z11;
            org.telegram.ui.ActionBar.v1 v1Var = this.V;
            if (z11) {
                v1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f22678h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f22679i0 = ofFloat;
                ofFloat.addUpdateListener(new i6(this, 27));
                this.f22679i0.addListener(new aa(13, this, z11));
                this.f22679i0.setDuration(150L);
                this.f22679i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f22678h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    v1Var.setVisibility(8);
                }
            }
            if (!this.f22677g0 && this.m0 == null) {
                z12 = false;
            }
            this.f22689t0.e(z12, z10);
        }
    }

    public final void b0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f22671a0 = -1;
        boolean z10 = true;
        this.f22673c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j3 = this.f22691v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = X();
            }
            if (z10) {
                int i10 = this.f22673c0;
                this.f22673c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f22675e0;
            if (arrayList.size() != 0) {
                int i11 = this.f22673c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f22673c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f22673c0;
                this.f22673c0 = i12 + 1;
                this.f22671a0 = i12;
            }
        } else if (this.f22683n0.size() != 0) {
            int i13 = this.f22673c0;
            this.Y = i13;
            int size2 = this.f22683n0.size() + i13;
            this.f22673c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f22673c0;
            this.f22673c0 = i14 + 1;
            this.f22671a0 = i14;
        }
        int i15 = this.f22673c0;
        this.f22673c0 = i15 + 1;
        this.f22672b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f22683n0.isEmpty()) {
            this.f22683n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f26706f.l();
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
        if (this.f22692w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (n2Var instanceof org.telegram.ui.bo) {
                    ((org.telegram.ui.bo) n2Var).T9(true, true);
                }
            }
        }
    }
}
