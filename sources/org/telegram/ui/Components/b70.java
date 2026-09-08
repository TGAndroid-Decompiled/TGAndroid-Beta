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
    public int f24594a0;
    public int f24595b0;
    public int f24596c0;
    public AnimatorSet f24597d0;
    public final ArrayList f24598e0;
    public final a0.i f24599f0;
    public boolean f24600g0;
    public float f24601h0;
    public ValueAnimator f24602i0;
    public m30 f24603j0;
    public int f24604k0;
    public org.telegram.ui.a70 f24605l0;
    public org.telegram.ui.iu m0;
    public ArrayList f24606n0;
    public int f24607o0;
    public final float f24608p0;
    public final org.telegram.ui.ActionBar.n2 f24609q0;
    public final androidx.mediarouter.app.x f24610r0;
    public int f24611s0;
    public final y10 f24612t0;
    public int f24613u0;
    public final long f24614v0;
    public boolean f24615w0;
    public float f24616x0;
    public boolean f24617y0;
    public TLRPC.TL_chatInviteExported f24618z0;

    public b70(Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f24598e0 = new ArrayList();
        this.f24599f0 = new a0.i();
        this.f24601h0 = 0.0f;
        this.f24610r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = iVar;
        this.G = false;
        this.f24609q0 = n2Var;
        this.f24614v0 = j3;
        fixNavigationBar();
        this.f29009w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f24608p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        x60 x60Var = new x60(this);
        this.W = x60Var;
        this.f29004e = x60Var;
        bi.o0 o0Var = this.d;
        v60 v60Var = new v60(this);
        this.f29005f = v60Var;
        o0Var.setAdapter(v60Var);
        this.f29008s.e(false, false);
        this.f29008s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f24598e0.add(user);
            }
        }
        a70 a70Var = new a70(this, context);
        this.U = a70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.vb(this, j3, n2Var, iVar, context));
        bi.o0 o0Var2 = this.d;
        s4.j jVar = new s4.j();
        jVar.f45831o = pr.f29493f;
        jVar.f45857e = 150L;
        jVar.f45856c = 150L;
        jVar.d = 150L;
        setShowWithoutAnimation(false);
        o0Var2.setItemAnimator(jVar);
        b0();
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 1);
        this.V = v1Var;
        v1Var.setVisibility(8);
        v1Var.setClipChildren(false);
        v1Var.addView(a70Var);
        this.containerView.addView(v1Var);
        y10 y10Var = new y10(context, f6Var, false);
        this.f24612t0 = y10Var;
        y10Var.setImageResource(R.drawable.floating_check);
        y10Var.setOnClickListener(new org.telegram.ui.io(this, context, j3, 3));
        y10Var.e(false, false);
        y10Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(y10Var, y10.b());
        ((ViewGroup.MarginLayoutParams) this.f29008s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f29008s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f29008s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void M(org.telegram.ui.Components.b70 r4, long r5, org.telegram.ui.ActionBar.n2 r7, a0.i r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b70.M(org.telegram.ui.Components.b70, long, org.telegram.ui.ActionBar.n2, a0.i, android.content.Context, int):void");
    }

    public static void N(b70 b70Var, Context context, long j3) {
        Activity findActivity;
        a0.i iVar = b70Var.f24599f0;
        if ((b70Var.m0 == null && iVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (b70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iVar.m(); i10++) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
            org.telegram.ui.dz dzVar = (org.telegram.ui.dz) b70Var.m0.f37465b;
            ArrayList arrayList2 = dzVar.f35917e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            dzVar.Z();
            org.telegram.ui.cz czVar = dzVar.f35918f;
            if (czVar != null) {
                czVar.a();
            }
            b70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", iVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
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
                spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            b2Var.T = spannableStringBuilder;
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new kv(b70Var, 6));
        i2.g.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void O(b70 b70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            b70Var.f24618z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(b70Var.currentAccount).getChatFull(b70Var.f24614v0);
            if (chatFull != null) {
                chatFull.exported_invite = b70Var.f24618z0;
            }
            if (b70Var.f24618z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", b70Var.f24618z0.link));
            yc.j(b70Var.f24609q0).j();
            b70Var.dismiss();
        }
        b70Var.f24617y0 = false;
    }

    public static void P(b70 b70Var, ValueAnimator valueAnimator) {
        b70Var.f24601h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        b70Var.containerView.invalidate();
    }

    public static void Q(b70 b70Var) {
        a0.i iVar = b70Var.f24599f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(b70Var.currentAccount).getUser(Long.valueOf(iVar.j(i10))));
        }
        org.telegram.ui.a70 a70Var = b70Var.f24605l0;
        if (a70Var != null) {
            a70Var.j(0, arrayList);
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
    public final m61 C(Context context) {
        return new s60(this, context);
    }

    @Override
    public final void D(MotionEvent motionEvent, di.h2 h2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f24616x0 = this.f29011y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f29011y - this.f24616x0) < this.f24608p0 && !this.f24615w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.co) {
                boolean P9 = ((org.telegram.ui.co) n2Var).P9();
                this.f24615w0 = true;
                zu zuVar = new zu(17, this, h2Var);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(zuVar, j3);
                return;
            }
            this.f24615w0 = true;
            setFocusable(true);
            h2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new r1(2, h2Var));
        }
    }

    @Override
    public final void G(String str) {
        x60 x60Var = this.W;
        if (x60Var.h != null) {
            Utilities.searchQueue.cancelRunnable(x60Var.h);
            x60Var.h = null;
        }
        x60Var.f32461c.clear();
        x60Var.d.clear();
        x60Var.f32462e.f(null, null);
        x60Var.f32462e.g(null, true, false, false, false, 0L, false, 0, 0);
        x60Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.h0 adapter = x60Var.f32464n.d.getAdapter();
            b70 b70Var = x60Var.f32464n;
            kl0 kl0Var = b70Var.f29004e;
            if (adapter != kl0Var) {
                b70Var.d.setAdapter(kl0Var);
            }
            x60Var.f32464n.f29008s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            w60 w60Var = new w60(x60Var, str, 0);
            x60Var.h = w60Var;
            dispatchQueue.postRunnable(w60Var, 300L);
            return;
        }
        s4.h0 adapter2 = x60Var.f32464n.d.getAdapter();
        b70 b70Var2 = x60Var.f32464n;
        kl0 kl0Var2 = b70Var2.f29005f;
        if (adapter2 != kl0Var2) {
            b70Var2.d.setAdapter(kl0Var2);
        }
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.iu iuVar) {
        this.m0 = iuVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f24606n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Z(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b70.Z(java.util.ArrayList):void");
    }

    public final void a0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f24599f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f24600g0 != z11) {
            ValueAnimator valueAnimator = this.f24602i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f24602i0.cancel();
            }
            this.f24600g0 = z11;
            org.telegram.ui.ActionBar.v1 v1Var = this.V;
            if (z11) {
                v1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f24601h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f24602i0 = ofFloat;
                ofFloat.addUpdateListener(new l6(this, 27));
                this.f24602i0.addListener(new org.telegram.ui.to(14, this, z11));
                this.f24602i0.setDuration(150L);
                this.f24602i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f24601h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    v1Var.setVisibility(8);
                }
            }
            if (!this.f24600g0 && this.m0 == null) {
                z12 = false;
            }
            this.f24612t0.e(z12, z10);
        }
    }

    public final void b0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f24594a0 = -1;
        boolean z10 = true;
        this.f24596c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j3 = this.f24614v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = X();
            }
            if (z10) {
                int i10 = this.f24596c0;
                this.f24596c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f24598e0;
            if (arrayList.size() != 0) {
                int i11 = this.f24596c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f24596c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f24596c0;
                this.f24596c0 = i12 + 1;
                this.f24594a0 = i12;
            }
        } else if (this.f24606n0.size() != 0) {
            int i13 = this.f24596c0;
            this.Y = i13;
            int size2 = this.f24606n0.size() + i13;
            this.f24596c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f24596c0;
            this.f24596c0 = i14 + 1;
            this.f24594a0 = i14;
        }
        int i15 = this.f24596c0;
        this.f24596c0 = i15 + 1;
        this.f24595b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f24606n0.isEmpty()) {
            this.f24606n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f29005f.l();
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
        if (this.f24615w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (n2Var instanceof org.telegram.ui.co) {
                    ((org.telegram.ui.co) n2Var).T9(true, true);
                }
            }
        }
    }
}
