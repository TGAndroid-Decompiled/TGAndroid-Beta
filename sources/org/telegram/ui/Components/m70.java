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
public class m70 extends e71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.i T;
    public final l70 U;
    public final org.telegram.ui.ActionBar.v1 V;
    public final i70 W;
    public int X;
    public int Y;
    public int Z;
    public int f26350a0;
    public int f26351b0;
    public int f26352c0;
    public AnimatorSet f26353d0;
    public final ArrayList f26354e0;
    public final a0.i f26355f0;
    public boolean f26356g0;
    public float f26357h0;
    public ValueAnimator f26358i0;
    public m30 f26359j0;
    public int f26360k0;
    public org.telegram.ui.z60 f26361l0;
    public org.telegram.ui.fu m0;
    public ArrayList f26362n0;
    public int f26363o0;
    public final float f26364p0;
    public final org.telegram.ui.ActionBar.n2 f26365q0;
    public final androidx.mediarouter.app.x f26366r0;
    public int f26367s0;
    public final y10 f26368t0;
    public int f26369u0;
    public final long f26370v0;
    public boolean f26371w0;
    public float f26372x0;
    public boolean f26373y0;
    public TLRPC.TL_chatInviteExported f26374z0;

    public m70(Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f26354e0 = new ArrayList();
        this.f26355f0 = new a0.i();
        this.f26357h0 = 0.0f;
        this.f26366r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = iVar;
        this.G = false;
        this.f26365q0 = n2Var;
        this.f26370v0 = j3;
        fixNavigationBar();
        this.f23880w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f26364p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        i70 i70Var = new i70(this);
        this.W = i70Var;
        this.e = i70Var;
        ai.w0 w0Var = this.d;
        g70 g70Var = new g70(this);
        this.f23876f = g70Var;
        w0Var.setAdapter(g70Var);
        this.f23879s.e(false, false);
        this.f23879s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f26354e0.add(user);
            }
        }
        l70 l70Var = new l70(this, context);
        this.U = l70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.wb(this, j3, n2Var, iVar, context));
        ai.w0 w0Var2 = this.d;
        s4.j jVar = new s4.j();
        jVar.f43052o = qr.f27653f;
        jVar.e = 150L;
        jVar.f43076c = 150L;
        jVar.d = 150L;
        setShowWithoutAnimation(false);
        w0Var2.setItemAnimator(jVar);
        b0();
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 1);
        this.V = v1Var;
        v1Var.setVisibility(8);
        v1Var.setClipChildren(false);
        v1Var.addView(l70Var);
        this.containerView.addView(v1Var);
        y10 y10Var = new y10(context, f6Var, false);
        this.f26368t0 = y10Var;
        y10Var.setImageResource(R.drawable.floating_check);
        y10Var.setOnClickListener(new org.telegram.ui.fo(this, context, j3, 3));
        y10Var.e(false, false);
        y10Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(y10Var, y10.b());
        ((ViewGroup.MarginLayoutParams) this.f23879s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f23879s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f23879s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void M(org.telegram.ui.Components.m70 r4, long r5, org.telegram.ui.ActionBar.n2 r7, a0.i r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m70.M(org.telegram.ui.Components.m70, long, org.telegram.ui.ActionBar.n2, a0.i, android.content.Context, int):void");
    }

    public static void N(m70 m70Var, Context context, long j3) {
        Activity findActivity;
        a0.i iVar = m70Var.f26355f0;
        if ((m70Var.m0 == null && iVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (m70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iVar.m(); i10++) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
            org.telegram.ui.dz dzVar = (org.telegram.ui.dz) m70Var.m0.f33750b;
            ArrayList arrayList2 = dzVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            dzVar.Z();
            org.telegram.ui.cz czVar = dzVar.f33197f;
            if (czVar != null) {
                czVar.a();
            }
            m70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", iVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
        b2Var.R = formatPluralString;
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
                spannableStringBuilder.setSpan(new v51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            b2Var.T = spannableStringBuilder;
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new mv(m70Var, 7));
        hg.k0.p(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void O(m70 m70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            m70Var.f26374z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(m70Var.currentAccount).getChatFull(m70Var.f26370v0);
            if (chatFull != null) {
                chatFull.exported_invite = m70Var.f26374z0;
            }
            if (m70Var.f26374z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", m70Var.f26374z0.link));
            xc.j(m70Var.f26365q0).j();
            m70Var.dismiss();
        }
        m70Var.f26373y0 = false;
    }

    public static void P(m70 m70Var, ValueAnimator valueAnimator) {
        m70Var.f26357h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m70Var.containerView.invalidate();
    }

    public static void Q(m70 m70Var) {
        a0.i iVar = m70Var.f26355f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(m70Var.currentAccount).getUser(Long.valueOf(iVar.j(i10))));
        }
        org.telegram.ui.z60 z60Var = m70Var.f26361l0;
        if (z60Var != null) {
            z60Var.i(0, arrayList);
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
    public final c71 B(Context context) {
        return new d70(this, context);
    }

    @Override
    public final void D(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f26372x0 = this.f23882y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f23882y - this.f26372x0) < this.f26364p0 && !this.f26371w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.zn) {
                boolean P9 = ((org.telegram.ui.zn) n2Var).P9();
                this.f26371w0 = true;
                bv bvVar = new bv(17, this, h2Var);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(bvVar, j3);
                return;
            }
            this.f26371w0 = true;
            setFocusable(true);
            h2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new q1(2, h2Var));
        }
    }

    @Override
    public final void F(String str) {
        i70 i70Var = this.W;
        if (i70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(i70Var.h);
            i70Var.h = null;
        }
        i70Var.f24989c.clear();
        i70Var.d.clear();
        i70Var.e.f(null, null);
        i70Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        i70Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.h0 adapter = i70Var.f24991n.d.getAdapter();
            m70 m70Var = i70Var.f24991n;
            xl0 xl0Var = m70Var.e;
            if (adapter != xl0Var) {
                m70Var.d.setAdapter(xl0Var);
            }
            i70Var.f24991n.f23879s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            h70 h70Var = new h70(i70Var, str, 0);
            i70Var.h = h70Var;
            dispatchQueue.postRunnable(h70Var, 300L);
            return;
        }
        s4.h0 adapter2 = i70Var.f24991n.d.getAdapter();
        m70 m70Var2 = i70Var.f24991n;
        xl0 xl0Var2 = m70Var2.f23876f;
        if (adapter2 != xl0Var2) {
            m70Var2.d.setAdapter(xl0Var2);
        }
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.fu fuVar) {
        this.m0 = fuVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f26362n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Z(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m70.Z(java.util.ArrayList):void");
    }

    public final void a0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f26355f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f26356g0 != z11) {
            ValueAnimator valueAnimator = this.f26358i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f26358i0.cancel();
            }
            this.f26356g0 = z11;
            org.telegram.ui.ActionBar.v1 v1Var = this.V;
            if (z11) {
                v1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f26357h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f26358i0 = ofFloat;
                ofFloat.addUpdateListener(new j6(this, 27));
                this.f26358i0.addListener(new ba(13, this, z11));
                this.f26358i0.setDuration(150L);
                this.f26358i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f26357h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    v1Var.setVisibility(8);
                }
            }
            if (!this.f26356g0 && this.m0 == null) {
                z12 = false;
            }
            this.f26368t0.e(z12, z10);
        }
    }

    public final void b0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f26350a0 = -1;
        boolean z10 = true;
        this.f26352c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j3 = this.f26370v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = X();
            }
            if (z10) {
                int i10 = this.f26352c0;
                this.f26352c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f26354e0;
            if (arrayList.size() != 0) {
                int i11 = this.f26352c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f26352c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f26352c0;
                this.f26352c0 = i12 + 1;
                this.f26350a0 = i12;
            }
        } else if (this.f26362n0.size() != 0) {
            int i13 = this.f26352c0;
            this.Y = i13;
            int size2 = this.f26362n0.size() + i13;
            this.f26352c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f26352c0;
            this.f26352c0 = i14 + 1;
            this.f26350a0 = i14;
        }
        int i15 = this.f26352c0;
        this.f26352c0 = i15 + 1;
        this.f26351b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f26362n0.isEmpty()) {
            this.f26362n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f23876f.l();
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
        if (this.f26371w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (n2Var instanceof org.telegram.ui.zn) {
                    ((org.telegram.ui.zn) n2Var).T9(true, true);
                }
            }
        }
    }
}
