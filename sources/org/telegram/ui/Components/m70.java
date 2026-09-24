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
public class m70 extends b71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.i T;
    public final l70 U;
    public final org.telegram.ui.ActionBar.u1 V;
    public final i70 W;
    public int X;
    public int Y;
    public int Z;
    public int f26368a0;
    public int f26369b0;
    public int f26370c0;
    public AnimatorSet f26371d0;
    public final ArrayList f26372e0;
    public final a0.i f26373f0;
    public boolean f26374g0;
    public float f26375h0;
    public ValueAnimator f26376i0;
    public n30 f26377j0;
    public int f26378k0;
    public org.telegram.ui.u60 f26379l0;
    public org.telegram.ui.du m0;
    public ArrayList f26380n0;
    public int f26381o0;
    public final float f26382p0;
    public final org.telegram.ui.ActionBar.m2 f26383q0;
    public final androidx.mediarouter.app.x f26384r0;
    public int f26385s0;
    public final z10 f26386t0;
    public int f26387u0;
    public final long f26388v0;
    public boolean f26389w0;
    public float f26390x0;
    public boolean f26391y0;
    public TLRPC.TL_chatInviteExported f26392z0;

    public m70(Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f26372e0 = new ArrayList();
        this.f26373f0 = new a0.i();
        this.f26375h0 = 0.0f;
        this.f26384r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = iVar;
        this.G = false;
        this.f26383q0 = m2Var;
        this.f26388v0 = j3;
        fixNavigationBar();
        this.f22911w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f26382p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        i70 i70Var = new i70(this);
        this.W = i70Var;
        this.e = i70Var;
        ai.w0 w0Var = this.d;
        g70 g70Var = new g70(this);
        this.f22907f = g70Var;
        w0Var.setAdapter(g70Var);
        this.f22910s.e(false, false);
        this.f22910s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f26372e0.add(user);
            }
        }
        l70 l70Var = new l70(this, context);
        this.U = l70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.vb(this, j3, m2Var, iVar, context));
        ai.w0 w0Var2 = this.d;
        s4.j jVar = new s4.j();
        jVar.f43003o = rr.f28022f;
        jVar.e = 150L;
        jVar.f43027c = 150L;
        jVar.d = 150L;
        setShowWithoutAnimation(false);
        w0Var2.setItemAnimator(jVar);
        b0();
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(this, context, 1);
        this.V = u1Var;
        u1Var.setVisibility(8);
        u1Var.setClipChildren(false);
        u1Var.addView(l70Var);
        this.containerView.addView(u1Var);
        z10 z10Var = new z10(context, d6Var, false);
        this.f26386t0 = z10Var;
        z10Var.setImageResource(R.drawable.floating_check);
        z10Var.setOnClickListener(new org.telegram.ui.bo(this, context, j3, 3));
        z10Var.e(false, false);
        z10Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(z10Var, z10.b());
        ((ViewGroup.MarginLayoutParams) this.f22910s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f22910s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f22910s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void M(org.telegram.ui.Components.m70 r4, long r5, org.telegram.ui.ActionBar.m2 r7, a0.i r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m70.M(org.telegram.ui.Components.m70, long, org.telegram.ui.ActionBar.m2, a0.i, android.content.Context, int):void");
    }

    public static void N(m70 m70Var, Context context, long j3) {
        Activity findActivity;
        a0.i iVar = m70Var.f26373f0;
        if ((m70Var.m0 == null && iVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (m70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iVar.m(); i10++) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
            org.telegram.ui.zy zyVar = (org.telegram.ui.zy) m70Var.m0.f33167b;
            ArrayList arrayList2 = zyVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            zyVar.Z();
            org.telegram.ui.yy yyVar = zyVar.f40583f;
            if (yyVar != null) {
                yyVar.a();
            }
            m70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", iVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18647a;
        a2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(m70Var.currentAccount).getUser(Long.valueOf(iVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(m70Var.currentAccount).getChat(Long.valueOf(j3));
        if (iVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", iVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(iVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            a2Var.T = spannableStringBuilder;
        } else {
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new nv(m70Var, 7));
        hg.c.p(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void O(m70 m70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            m70Var.f26392z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(m70Var.currentAccount).getChatFull(m70Var.f26388v0);
            if (chatFull != null) {
                chatFull.exported_invite = m70Var.f26392z0;
            }
            if (m70Var.f26392z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", m70Var.f26392z0.link));
            yc.j(m70Var.f26383q0).j();
            m70Var.dismiss();
        }
        m70Var.f26391y0 = false;
    }

    public static void P(m70 m70Var, ValueAnimator valueAnimator) {
        m70Var.f26375h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m70Var.containerView.invalidate();
    }

    public static void Q(m70 m70Var) {
        a0.i iVar = m70Var.f26373f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(m70Var.currentAccount).getUser(Long.valueOf(iVar.j(i10))));
        }
        org.telegram.ui.u60 u60Var = m70Var.f26379l0;
        if (u60Var != null) {
            u60Var.i(0, arrayList);
        }
        m70Var.dismiss();
    }

    public static ViewGroup U(m70 m70Var) {
        return m70Var.containerView;
    }

    public static ViewGroup W(m70 m70Var) {
        return m70Var.containerView;
    }

    @Override
    public final z61 B(Context context) {
        return new d70(this, context);
    }

    @Override
    public final void E(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.ActionBar.m2 m2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f26390x0 = this.f22913y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f22913y - this.f26390x0) < this.f26382p0 && !this.f26389w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                m2Var = null;
            }
            if (m2Var instanceof org.telegram.ui.wn) {
                boolean P9 = ((org.telegram.ui.wn) m2Var).P9();
                this.f26389w0 = true;
                cv cvVar = new cv(17, this, h2Var);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(cvVar, j3);
                return;
            }
            this.f26389w0 = true;
            setFocusable(true);
            h2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new q1(2, h2Var));
        }
    }

    @Override
    public final void G(String str) {
        i70 i70Var = this.W;
        if (i70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(i70Var.h);
            i70Var.h = null;
        }
        i70Var.f24932c.clear();
        i70Var.d.clear();
        i70Var.e.f(null, null);
        i70Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        i70Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.h0 adapter = i70Var.f24934n.d.getAdapter();
            m70 m70Var = i70Var.f24934n;
            vl0 vl0Var = m70Var.e;
            if (adapter != vl0Var) {
                m70Var.d.setAdapter(vl0Var);
            }
            i70Var.f24934n.f22910s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            h70 h70Var = new h70(i70Var, str, 0);
            i70Var.h = h70Var;
            dispatchQueue.postRunnable(h70Var, 300L);
            return;
        }
        s4.h0 adapter2 = i70Var.f24934n.d.getAdapter();
        m70 m70Var2 = i70Var.f24934n;
        vl0 vl0Var2 = m70Var2.f22907f;
        if (adapter2 != vl0Var2) {
            m70Var2.d.setAdapter(vl0Var2);
        }
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.du duVar) {
        this.m0 = duVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f26380n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Z(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m70.Z(java.util.ArrayList):void");
    }

    public final void a0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f26373f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f26374g0 != z11) {
            ValueAnimator valueAnimator = this.f26376i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f26376i0.cancel();
            }
            this.f26374g0 = z11;
            org.telegram.ui.ActionBar.u1 u1Var = this.V;
            if (z11) {
                u1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f26375h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f26376i0 = ofFloat;
                ofFloat.addUpdateListener(new k6(this, 27));
                this.f26376i0.addListener(new ca(13, this, z11));
                this.f26376i0.setDuration(150L);
                this.f26376i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f26375h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    u1Var.setVisibility(8);
                }
            }
            if (!this.f26374g0 && this.m0 == null) {
                z12 = false;
            }
            this.f26386t0.e(z12, z10);
        }
    }

    public final void b0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f26368a0 = -1;
        boolean z10 = true;
        this.f26370c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j3 = this.f26388v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = X();
            }
            if (z10) {
                int i10 = this.f26370c0;
                this.f26370c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f26372e0;
            if (arrayList.size() != 0) {
                int i11 = this.f26370c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f26370c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f26370c0;
                this.f26370c0 = i12 + 1;
                this.f26368a0 = i12;
            }
        } else if (this.f26380n0.size() != 0) {
            int i13 = this.f26370c0;
            this.Y = i13;
            int size2 = this.f26380n0.size() + i13;
            this.f26370c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f26370c0;
            this.f26370c0 = i14 + 1;
            this.f26368a0 = i14;
        }
        int i15 = this.f26370c0;
        this.f26370c0 = i15 + 1;
        this.f26369b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f26380n0.isEmpty()) {
            this.f26380n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f22907f.l();
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
        if (this.f26389w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (m2Var instanceof org.telegram.ui.wn) {
                    ((org.telegram.ui.wn) m2Var).T9(true, true);
                }
            }
        }
    }
}
