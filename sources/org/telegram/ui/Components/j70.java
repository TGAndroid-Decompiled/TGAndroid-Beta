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
public class j70 extends c71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.i T;
    public final i70 U;
    public final org.telegram.ui.ActionBar.v1 V;
    public final f70 W;
    public int X;
    public int Y;
    public int Z;
    public int f25249a0;
    public int f25250b0;
    public int f25251c0;
    public AnimatorSet f25252d0;
    public final ArrayList f25253e0;
    public final a0.i f25254f0;
    public boolean f25255g0;
    public float f25256h0;
    public ValueAnimator f25257i0;
    public m30 f25258j0;
    public int f25259k0;
    public org.telegram.ui.z60 f25260l0;
    public org.telegram.ui.fu m0;
    public ArrayList f25261n0;
    public int f25262o0;
    public final float f25263p0;
    public final org.telegram.ui.ActionBar.n2 f25264q0;
    public final androidx.mediarouter.app.x f25265r0;
    public int f25266s0;
    public final y10 f25267t0;
    public int f25268u0;
    public final long f25269v0;
    public boolean f25270w0;
    public float f25271x0;
    public boolean f25272y0;
    public TLRPC.TL_chatInviteExported f25273z0;

    public j70(Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f25253e0 = new ArrayList();
        this.f25254f0 = new a0.i();
        this.f25256h0 = 0.0f;
        this.f25265r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = iVar;
        this.G = false;
        this.f25264q0 = n2Var;
        this.f25269v0 = j3;
        fixNavigationBar();
        this.f23190w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f25263p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        f70 f70Var = new f70(this);
        this.W = f70Var;
        this.e = f70Var;
        ai.w0 w0Var = this.d;
        d70 d70Var = new d70(this);
        this.f23186f = d70Var;
        w0Var.setAdapter(d70Var);
        this.f23189s.e(false, false);
        this.f23189s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f25253e0.add(user);
            }
        }
        i70 i70Var = new i70(this, context);
        this.U = i70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.wb(this, j3, n2Var, iVar, context));
        ai.w0 w0Var2 = this.d;
        s4.j jVar = new s4.j();
        jVar.f43031o = qr.f27642f;
        jVar.e = 150L;
        jVar.f43055c = 150L;
        jVar.d = 150L;
        setShowWithoutAnimation(false);
        w0Var2.setItemAnimator(jVar);
        b0();
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 1);
        this.V = v1Var;
        v1Var.setVisibility(8);
        v1Var.setClipChildren(false);
        v1Var.addView(i70Var);
        this.containerView.addView(v1Var);
        y10 y10Var = new y10(context, f6Var, false);
        this.f25267t0 = y10Var;
        y10Var.setImageResource(R.drawable.floating_check);
        y10Var.setOnClickListener(new org.telegram.ui.fo(this, context, j3, 3));
        y10Var.e(false, false);
        y10Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(y10Var, y10.b());
        ((ViewGroup.MarginLayoutParams) this.f23189s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f23189s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f23189s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void M(org.telegram.ui.Components.j70 r4, long r5, org.telegram.ui.ActionBar.n2 r7, a0.i r8, android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j70.M(org.telegram.ui.Components.j70, long, org.telegram.ui.ActionBar.n2, a0.i, android.content.Context, int):void");
    }

    public static void N(j70 j70Var, Context context, long j3) {
        Activity findActivity;
        a0.i iVar = j70Var.f25254f0;
        if ((j70Var.m0 == null && iVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (j70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iVar.m(); i10++) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
            org.telegram.ui.dz dzVar = (org.telegram.ui.dz) j70Var.m0.f33722b;
            ArrayList arrayList2 = dzVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            dzVar.Z();
            org.telegram.ui.cz czVar = dzVar.f33177f;
            if (czVar != null) {
                czVar.a();
            }
            j70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", iVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
        b2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(j70Var.currentAccount).getUser(Long.valueOf(iVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(j70Var.currentAccount).getChat(Long.valueOf(j3));
        if (iVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", iVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(iVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new t51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            b2Var.T = spannableStringBuilder;
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new mv(j70Var, 7));
        hg.k0.p(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void O(j70 j70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            j70Var.f25273z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(j70Var.currentAccount).getChatFull(j70Var.f25269v0);
            if (chatFull != null) {
                chatFull.exported_invite = j70Var.f25273z0;
            }
            if (j70Var.f25273z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", j70Var.f25273z0.link));
            xc.j(j70Var.f25264q0).j();
            j70Var.dismiss();
        }
        j70Var.f25272y0 = false;
    }

    public static void P(j70 j70Var, ValueAnimator valueAnimator) {
        j70Var.f25256h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        j70Var.containerView.invalidate();
    }

    public static void Q(j70 j70Var) {
        a0.i iVar = j70Var.f25254f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(j70Var.currentAccount).getUser(Long.valueOf(iVar.j(i10))));
        }
        org.telegram.ui.z60 z60Var = j70Var.f25260l0;
        if (z60Var != null) {
            z60Var.i(0, arrayList);
        }
        j70Var.dismiss();
    }

    public static ViewGroup U(j70 j70Var) {
        return j70Var.containerView;
    }

    public static ViewGroup W(j70 j70Var) {
        return j70Var.containerView;
    }

    @Override
    public final a71 B(Context context) {
        return new a70(this, context);
    }

    @Override
    public final void E(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f25271x0 = this.f23192y;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f23192y - this.f25271x0) < this.f25263p0 && !this.f25270w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.zn) {
                boolean P9 = ((org.telegram.ui.zn) n2Var).P9();
                this.f25270w0 = true;
                bv bvVar = new bv(17, this, h2Var);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(bvVar, j3);
                return;
            }
            this.f25270w0 = true;
            setFocusable(true);
            h2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new q1(2, h2Var));
        }
    }

    @Override
    public final void G(String str) {
        f70 f70Var = this.W;
        if (f70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(f70Var.h);
            f70Var.h = null;
        }
        f70Var.f24018c.clear();
        f70Var.d.clear();
        f70Var.e.f(null, null);
        f70Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        f70Var.l();
        if (!TextUtils.isEmpty(str)) {
            s4.h0 adapter = f70Var.f24020n.d.getAdapter();
            j70 j70Var = f70Var.f24020n;
            ul0 ul0Var = j70Var.e;
            if (adapter != ul0Var) {
                j70Var.d.setAdapter(ul0Var);
            }
            f70Var.f24020n.f23189s.e(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e70 e70Var = new e70(f70Var, str, 0);
            f70Var.h = e70Var;
            dispatchQueue.postRunnable(e70Var, 300L);
            return;
        }
        s4.h0 adapter2 = f70Var.f24020n.d.getAdapter();
        j70 j70Var2 = f70Var.f24020n;
        ul0 ul0Var2 = j70Var2.f23186f;
        if (adapter2 != ul0Var2) {
            j70Var2.d.setAdapter(ul0Var2);
        }
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.fu fuVar) {
        this.m0 = fuVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f25261n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Z(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j70.Z(java.util.ArrayList):void");
    }

    public final void a0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f25254f0.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f25255g0 != z11) {
            ValueAnimator valueAnimator = this.f25257i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f25257i0.cancel();
            }
            this.f25255g0 = z11;
            org.telegram.ui.ActionBar.v1 v1Var = this.V;
            if (z11) {
                v1Var.setVisibility(0);
            }
            float f7 = 0.0f;
            if (z10) {
                float f10 = this.f25256h0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f25257i0 = ofFloat;
                ofFloat.addUpdateListener(new j6(this, 27));
                this.f25257i0.addListener(new ba(13, this, z11));
                this.f25257i0.setDuration(150L);
                this.f25257i0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f25256h0 = f7;
                this.containerView.invalidate();
                if (!z11) {
                    v1Var.setVisibility(8);
                }
            }
            if (!this.f25255g0 && this.m0 == null) {
                z12 = false;
            }
            this.f25267t0.e(z12, z10);
        }
    }

    public final void b0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.f25249a0 = -1;
        boolean z10 = true;
        this.f25251c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j3 = this.f25269v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = X();
            }
            if (z10) {
                int i10 = this.f25251c0;
                this.f25251c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.f25253e0;
            if (arrayList.size() != 0) {
                int i11 = this.f25251c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.f25251c0 = size;
                this.Z = size;
            } else {
                int i12 = this.f25251c0;
                this.f25251c0 = i12 + 1;
                this.f25249a0 = i12;
            }
        } else if (this.f25261n0.size() != 0) {
            int i13 = this.f25251c0;
            this.Y = i13;
            int size2 = this.f25261n0.size() + i13;
            this.f25251c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.f25251c0;
            this.f25251c0 = i14 + 1;
            this.f25249a0 = i14;
        }
        int i15 = this.f25251c0;
        this.f25251c0 = i15 + 1;
        this.f25250b0 = i15;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.f25261n0.isEmpty()) {
            this.f25261n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f23186f.l();
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
        if (this.f25270w0) {
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
