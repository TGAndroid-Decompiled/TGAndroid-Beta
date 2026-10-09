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
public class d80 extends t71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.i T;
    public final c80 U;
    public final org.telegram.ui.ActionBar.v1 V;
    public final z70 W;
    public int X;
    public int Y;
    public int Z;
    public int f25620a0;
    public int f25621b0;
    public int f25622c0;
    public AnimatorSet f25623d0;
    public final ArrayList f25624e0;
    public final a0.i f25625f0;
    public boolean f25626g0;
    public float f25627h0;
    public ValueAnimator f25628i0;
    public d40 f25629j0;
    public int f25630k0;
    public org.telegram.ui.x60 f25631l0;
    public org.telegram.ui.gu m0;
    public ArrayList f25632n0;
    public int f25633o0;
    public final float f25634p0;
    public final org.telegram.ui.ActionBar.n2 f25635q0;
    public final androidx.mediarouter.app.x f25636r0;
    public int f25637s0;
    public final p20 f25638t0;
    public int f25639u0;
    public final long f25640v0;
    public boolean f25641w0;
    public float f25642x0;
    public boolean f25643y0;
    public TLRPC.TL_chatInviteExported f25644z0;

    public d80(Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.f25624e0 = new ArrayList();
        this.f25625f0 = new a0.i();
        this.f25627h0 = 0.0f;
        this.f25636r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = iVar;
        this.G = false;
        this.f25635q0 = n2Var;
        this.f25640v0 = j3;
        fixNavigationBar();
        this.f31082w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f25634p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        z70 z70Var = new z70(this);
        this.W = z70Var;
        this.f31077e = z70Var;
        ai.w0 w0Var = this.d;
        x70 x70Var = new x70(this);
        this.f31078f = x70Var;
        w0Var.setAdapter(x70Var);
        this.f31081s.e(false, false);
        this.f31081s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f25624e0.add(user);
            }
        }
        c80 c80Var = new c80(this, context);
        this.U = c80Var;
        this.d.setOnItemClickListener(new org.telegram.ui.wb(this, j3, n2Var, iVar, context));
        ai.w0 w0Var2 = this.d;
        s4.j jVar = new s4.j();
        jVar.f47716o = hs.f27118f;
        jVar.f47749e = 150L;
        jVar.f47748c = 150L;
        jVar.d = 150L;
        setShowWithoutAnimation(false);
        w0Var2.setItemAnimator(jVar);
        c0();
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 1);
        this.V = v1Var;
        v1Var.setVisibility(8);
        v1Var.setClipChildren(false);
        v1Var.addView(c80Var);
        this.containerView.addView(v1Var);
        p20 p20Var = new p20(context, e6Var, false);
        this.f25638t0 = p20Var;
        p20Var.setImageResource(R.drawable.floating_check);
        p20Var.setOnClickListener(new org.telegram.ui.fo(this, context, j3, 3));
        p20Var.e(false, false);
        p20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(p20Var, p20.b());
        ((ViewGroup.MarginLayoutParams) this.f31081s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f31081s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f31081s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void N(org.telegram.ui.Components.d80 r4, long r5, org.telegram.ui.ActionBar.n2 r7, a0.i r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d80.N(org.telegram.ui.Components.d80, long, org.telegram.ui.ActionBar.n2, a0.i, android.content.Context, int):void");
    }

    public static void O(d80 d80Var, Context context, long j3) {
        Activity findActivity;
        a0.i iVar = d80Var.f25625f0;
        if ((d80Var.m0 == null && iVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (d80Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iVar.m(); i10++) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
            org.telegram.ui.cz czVar = (org.telegram.ui.cz) d80Var.m0.f38107b;
            ArrayList arrayList2 = czVar.f36754e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            czVar.Z();
            org.telegram.ui.bz bzVar = czVar.f36755f;
            if (bzVar != null) {
                bzVar.a();
            }
            d80Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", iVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
        b2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(d80Var.currentAccount).getUser(Long.valueOf(iVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(d80Var.currentAccount).getChat(Long.valueOf(j3));
        if (iVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", iVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(iVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new m61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            b2Var.T = spannableStringBuilder;
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new bw(d80Var, 7));
        hg.c.p(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void P(d80 d80Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            d80Var.f25644z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(d80Var.currentAccount).getChatFull(d80Var.f25640v0);
            if (chatFull != null) {
                chatFull.exported_invite = d80Var.f25644z0;
            }
            if (d80Var.f25644z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", d80Var.f25644z0.link));
            ad.j(d80Var.f25635q0).j();
            d80Var.dismiss();
        }
        d80Var.f25643y0 = false;
    }

    public static void Q(d80 d80Var, ValueAnimator valueAnimator) {
        d80Var.f25627h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d80Var.containerView.invalidate();
    }

    public static void R(d80 d80Var) {
        a0.i iVar = d80Var.f25625f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(d80Var.currentAccount).getUser(Long.valueOf(iVar.j(i10))));
        }
        org.telegram.ui.x60 x60Var = d80Var.f25631l0;
        if (x60Var != null) {
            x60Var.j(0, arrayList);
        }
        d80Var.dismiss();
    }

    public static ViewGroup V(d80 d80Var) {
        return d80Var.containerView;
    }

    public static ViewGroup X(d80 d80Var) {
        return d80Var.containerView;
    }

    @Override
    public final r71 E(Context context) {
        return new u70(this, context);
    }

    @Override
    public final void F(MotionEvent motionEvent, ci.g2 g2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f25642x0 = this.f31084y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f31084y - this.f25642x0) < this.f25634p0 && !this.f25641w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.zn) {
                boolean U9 = ((org.telegram.ui.zn) n2Var).U9();
                this.f25641w0 = true;
                zr zrVar = new zr(23, this, g2Var);
                if (U9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(zrVar, j3);
                return;
            }
            this.f25641w0 = true;
            setFocusable(true);
            g2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new r1(1, g2Var));
        }
    }

    @Override
    public final void H(String str) {
        z70 z70Var = this.W;
        if (z70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(z70Var.h);
            z70Var.h = null;
        }
        z70Var.f33486c.clear();
        z70Var.d.clear();
        z70Var.f33487e.f(null, null);
        z70Var.f33487e.g(null, true, false, false, false, 0L, false, 0, 0);
        z70Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.i0 adapter = z70Var.f33489n.d.getAdapter();
            d80 d80Var = z70Var.f33489n;
            pm0 pm0Var = d80Var.f31077e;
            if (adapter != pm0Var) {
                d80Var.d.setAdapter(pm0Var);
            }
            z70Var.f33489n.f31081s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            y70 y70Var = new y70(z70Var, str, 0);
            z70Var.h = y70Var;
            dispatchQueue.postRunnable(y70Var, 300L);
            return;
        }
        s4.i0 adapter2 = z70Var.f33489n.d.getAdapter();
        d80 d80Var2 = z70Var.f33489n;
        pm0 pm0Var2 = d80Var2.f31078f;
        if (adapter2 != pm0Var2) {
            d80Var2.d.setAdapter(pm0Var2);
        }
    }

    public boolean Y() {
        return true;
    }

    public final void Z(org.telegram.ui.gu guVar) {
        this.m0 = guVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f25632n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        c0();
    }

    public final void a0(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d80.a0(java.util.ArrayList):void");
    }

    public final void b0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f25625f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f25626g0 != z11) {
            ValueAnimator valueAnimator = this.f25628i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f25628i0.cancel();
            }
            this.f25626g0 = z11;
            org.telegram.ui.ActionBar.v1 v1Var = this.V;
            if (z11) {
                v1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f25627h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f25628i0 = ofFloat;
                ofFloat.addUpdateListener(new m6(this, 28));
                this.f25628i0.addListener(new fa(13, this, z11));
                this.f25628i0.setDuration(150L);
                this.f25628i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f25627h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    v1Var.setVisibility(8);
                }
            }
            if (!this.f25626g0 && this.m0 == null) {
                z12 = false;
            }
            this.f25638t0.e(z12, z10);
        }
    }

    public final void c0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f25620a0 = -1;
        boolean z10 = true;
        this.f25622c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j3 = this.f25640v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = Y();
            }
            if (z10) {
                int i10 = this.f25622c0;
                this.f25622c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f25624e0;
            if (arrayList.size() != 0) {
                int i11 = this.f25622c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f25622c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f25622c0;
                this.f25622c0 = i12 + 1;
                this.f25620a0 = i12;
            }
        } else if (this.f25632n0.size() != 0) {
            int i13 = this.f25622c0;
            this.Y = i13;
            int size2 = this.f25632n0.size() + i13;
            this.f25622c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f25622c0;
            this.f25622c0 = i14 + 1;
            this.f25620a0 = i14;
        }
        int i15 = this.f25622c0;
        this.f25622c0 = i15 + 1;
        this.f25621b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f25632n0.isEmpty()) {
            this.f25632n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f31078f.l();
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
        if (this.f25641w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (n2Var instanceof org.telegram.ui.zn) {
                    ((org.telegram.ui.zn) n2Var).Y9(true, true);
                }
            }
        }
    }
}
