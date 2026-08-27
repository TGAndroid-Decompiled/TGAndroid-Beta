package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

public class p60 extends u51 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.h P;
    public final o60 Q;
    public final org.telegram.ui.ActionBar.v1 R;
    public final l60 S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public AnimatorSet Z;

    public final ArrayList f31514a0;

    public final a0.h f31515b0;

    public boolean f31516c0;

    public float f31517d0;

    public ValueAnimator f31518e0;

    public a30 f31519f0;

    public int f31520g0;

    public org.telegram.ui.j60 f31521h0;

    public org.telegram.ui.zt f31522i0;

    public ArrayList f31523j0;

    public int f31524k0;

    public final float f31525l0;
    public final org.telegram.ui.ActionBar.n2 m0;

    public final g.a f31526n0;

    public int f31527o0;

    public final m10 f31528p0;

    public int f31529q0;

    public final long f31530r0;

    public boolean f31531s0;

    public float f31532t0;

    public boolean f31533u0;

    public TLRPC.TL_chatInviteExported f31534v0;

    public p60(Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f31514a0 = new ArrayList();
        this.f31515b0 = new a0.h();
        this.f31517d0 = 0.0f;
        this.f31526n0 = new g.a(this, 4);
        this.P = hVar;
        this.C = false;
        this.m0 = n2Var;
        this.f31530r0 = j10;
        fixNavigationBar();
        this.f32984w.F.setHint(LocaleController.getString(R.string.SearchForChats));
        this.f31525l0 = ViewConfiguration.get(context).getScaledTouchSlop();
        l60 l60Var = new l60(this);
        this.S = l60Var;
        this.f32979e = l60Var;
        hh.f1 f1Var = this.d;
        j60 j60Var = new j60(this);
        this.f32980f = j60Var;
        f1Var.setAdapter(j60Var);
        this.f32983s.e(false, false);
        this.f32983s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.f31514a0.add(user);
            }
        }
        o60 o60Var = new o60(this, context);
        this.Q = o60Var;
        this.d.setOnItemClickListener(new org.telegram.ui.rb(this, j10, n2Var, hVar, context));
        hh.f1 f1Var2 = this.d;
        h60 h60Var = new h60();
        h60Var.f5737o = er.f28122f;
        h60Var.f5843e = 150L;
        h60Var.f5842c = 150L;
        h60Var.d = 150L;
        setShowWithoutAnimation(false);
        f1Var2.setItemAnimator(h60Var);
        b0();
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 1);
        this.R = v1Var;
        v1Var.setVisibility(8);
        v1Var.setClipChildren(false);
        v1Var.addView(o60Var);
        this.containerView.addView(v1Var);
        m10 m10Var = new m10(context, c6Var, false);
        this.f31528p0 = m10Var;
        m10Var.setImageResource(R.drawable.floating_check);
        m10Var.setOnClickListener(new hh.s2(this, context, j10, 4));
        m10Var.e(false, false);
        m10Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(m10Var, m10.b());
        ((ViewGroup.MarginLayoutParams) this.f32983s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f32983s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f32983s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public static void M(p60 p60Var, long j10, org.telegram.ui.ActionBar.n2 n2Var, a0.h hVar, Context context, int i10) {
        String strN;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        long j11;
        f2.q0 adapter = p60Var.d.getAdapter();
        l60 l60Var = p60Var.S;
        TLObject tLObjectE = null;
        if (adapter == l60Var) {
            int size = l60Var.f30302c.size();
            int size2 = p60Var.S.f30303e.f45839e.size();
            int size3 = p60Var.S.f30303e.d.size();
            int i11 = i10 - 1;
            if (i11 >= 0 && i11 < size) {
                tLObjectE = (TLObject) p60Var.S.f30302c.get(i11);
            } else if (i11 >= size && i11 < size3 + size) {
                tLObjectE = (TLObject) p60Var.S.f30303e.d.get(i11 - size);
            } else if (i11 > size + size3 && i11 <= size2 + size + size3) {
                tLObjectE = (TLObject) p60Var.S.f30303e.f45839e.get(((i11 - size) - size3) - 1);
            }
            if (p60Var.f31522i0 != null) {
                AndroidUtilities.hideKeyboard(p60Var.f32984w.F);
            }
        } else if (i10 == p60Var.T) {
            TLRPC.Chat chat = MessagesController.getInstance(p60Var.currentAccount).getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(p60Var.currentAccount).getChatFull(j10);
            if (chat != null) {
                String publicUsername = ChatObject.getPublicUsername(chat);
                if (!TextUtils.isEmpty(publicUsername)) {
                    strN = a9.p.n(MessagesController.getInstance(p60Var.currentAccount).linkPrefix, "/", publicUsername, new StringBuilder("https://"));
                } else if (chatFull != null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
                    if (!p60Var.f31533u0) {
                        p60Var.f31533u0 = true;
                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                        tL_messages_exportChatInvite.peer = MessagesController.getInstance(p60Var.currentAccount).getInputPeer(-p60Var.f31530r0);
                        ConnectionsManager.getInstance(p60Var.currentAccount).sendRequest(tL_messages_exportChatInvite, new w1(p60Var, 7));
                    }
                    strN = null;
                } else {
                    strN = tL_chatInviteExported.link;
                }
            } else if (chatFull != null) {
                if (!p60Var.f31533u0) {
                    p60Var.f31533u0 = true;
                    TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite2 = new TLRPC.TL_messages_exportChatInvite();
                    tL_messages_exportChatInvite2.legacy_revoke_permanent = true;
                    tL_messages_exportChatInvite2.peer = MessagesController.getInstance(p60Var.currentAccount).getInputPeer(-p60Var.f31530r0);
                    ConnectionsManager.getInstance(p60Var.currentAccount).sendRequest(tL_messages_exportChatInvite2, new w1(p60Var, 7));
                }
                strN = null;
            } else {
                if (!p60Var.f31533u0) {
                    p60Var.f31533u0 = true;
                    TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite3 = new TLRPC.TL_messages_exportChatInvite();
                    tL_messages_exportChatInvite3.legacy_revoke_permanent = true;
                    tL_messages_exportChatInvite3.peer = MessagesController.getInstance(p60Var.currentAccount).getInputPeer(-p60Var.f31530r0);
                    ConnectionsManager.getInstance(p60Var.currentAccount).sendRequest(tL_messages_exportChatInvite3, new w1(p60Var, 7));
                }
                strN = null;
            }
            if (strN == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", strN));
            p60Var.dismiss();
            mc.j(n2Var).j();
        } else if (i10 >= p60Var.U && i10 < p60Var.V) {
            tLObjectE = ((j60) p60Var.f32980f).E(i10);
        }
        if (tLObjectE != null) {
            if (tLObjectE instanceof TLRPC.User) {
                j11 = ((TLRPC.User) tLObjectE).f22527id;
            } else {
                j11 = tLObjectE instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObjectE).f22380id : 0L;
            }
            if (hVar == null || hVar.h(j11) < 0) {
                if (j11 != 0) {
                    if (p60Var.f31515b0.h(j11) >= 0) {
                        a30 a30Var = (a30) p60Var.f31515b0.f(j11);
                        p60Var.f31515b0.l(j11);
                        p60Var.Q.b(a30Var);
                    } else {
                        a30 a30Var2 = new a30(context, tLObjectE);
                        a30Var2.setOnClickListener(p60Var.f31526n0);
                        p60Var.f31515b0.k(a30Var2, j11);
                        p60Var.Q.a(a30Var2, true);
                    }
                }
                p60Var.a0(true);
                AndroidUtilities.updateVisibleRows(p60Var.d);
            }
        }
    }

    public static void N(p60 p60Var, Context context, long j10) {
        Activity activityFindActivity;
        a0.h hVar = p60Var.f31515b0;
        if ((p60Var.f31522i0 == null && hVar.i()) || (activityFindActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (p60Var.f31522i0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
            org.telegram.ui.py pyVar = (org.telegram.ui.py) p60Var.f31522i0.f45251b;
            ArrayList arrayList2 = pyVar.f41445e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            pyVar.Z();
            org.telegram.ui.oy oyVar = pyVar.f41446f;
            if (oyVar != null) {
                oyVar.a();
            }
            p60Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activityFindActivity);
        String pluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", hVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = pluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(p60Var.currentAccount).getUser(Long.valueOf(hVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(p60Var.currentAccount).getChat(Long.valueOf(j10));
        if (hVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", hVar.m(), chat.title)));
            String str = String.format("%d", Integer.valueOf(hVar.m()));
            int iIndexOf = TextUtils.indexOf(spannableStringBuilder, str);
            if (iIndexOf >= 0) {
                spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), iIndexOf, str.length() + iIndexOf, 33);
            }
            b2Var.P = spannableStringBuilder;
        } else {
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new vu(p60Var, 6));
        i0.a.w(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void O(p60 p60Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            p60Var.f31534v0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(p60Var.currentAccount).getChatFull(p60Var.f31530r0);
            if (chatFull != null) {
                chatFull.exported_invite = p60Var.f31534v0;
            }
            if (p60Var.f31534v0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", p60Var.f31534v0.link));
            mc.j(p60Var.m0).j();
            p60Var.dismiss();
        }
        p60Var.f31533u0 = false;
    }

    public static void P(p60 p60Var, ValueAnimator valueAnimator) {
        p60Var.f31517d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        p60Var.containerView.invalidate();
    }

    public static void Q(p60 p60Var) {
        a0.h hVar = p60Var.f31515b0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(p60Var.currentAccount).getUser(Long.valueOf(hVar.j(i10))));
        }
        org.telegram.ui.j60 j60Var = p60Var.f31521h0;
        if (j60Var != null) {
            j60Var.j(0, arrayList);
        }
        p60Var.dismiss();
    }

    @Override
    public final s51 D(Context context) {
        return new g60(this, context);
    }

    @Override
    public final void E(MotionEvent motionEvent, gg.g gVar) {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (motionEvent.getAction() == 0) {
            this.f31532t0 = this.f32986y;
            return;
        }
        if (motionEvent.getAction() != 1 || Math.abs(this.f32986y - this.f31532t0) >= this.f31525l0 || this.f31531s0) {
            return;
        }
        Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
        if (activityFindActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) activityFindActivity;
            n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
        } else {
            n2Var = null;
        }
        if (n2Var instanceof org.telegram.ui.rn) {
            boolean zP9 = ((org.telegram.ui.rn) n2Var).P9();
            this.f31531s0 = true;
            AndroidUtilities.runOnUIThread(new xq(23, this, gVar), zP9 ? 200L : 0L);
        } else {
            this.f31531s0 = true;
            setFocusable(true);
            gVar.requestFocus();
            AndroidUtilities.runOnUIThread(new p1(2, gVar));
        }
    }

    @Override
    public final void G(String str) {
        l60 l60Var = this.S;
        if (l60Var.h != null) {
            Utilities.searchQueue.cancelRunnable(l60Var.h);
            l60Var.h = null;
        }
        l60Var.f30302c.clear();
        l60Var.d.clear();
        l60Var.f30303e.f(null, null);
        l60Var.f30303e.g(null, true, false, false, false, 0L, false, 0, 0);
        l60Var.l();
        if (TextUtils.isEmpty(str)) {
            f2.q0 adapter = l60Var.f30305n.d.getAdapter();
            p60 p60Var = l60Var.f30305n;
            yk0 yk0Var = p60Var.f32980f;
            if (adapter != yk0Var) {
                p60Var.d.setAdapter(yk0Var);
                return;
            }
            return;
        }
        f2.q0 adapter2 = l60Var.f30305n.d.getAdapter();
        p60 p60Var2 = l60Var.f30305n;
        yk0 yk0Var2 = p60Var2.f32979e;
        if (adapter2 != yk0Var2) {
            p60Var2.d.setAdapter(yk0Var2);
        }
        l60Var.f30305n.f32983s.e(true, false);
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        k60 k60Var = new k60(l60Var, str, 0);
        l60Var.h = k60Var;
        dispatchQueue.postRunnable(k60Var, 300L);
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.zt ztVar) {
        this.f31522i0 = ztVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.f31523j0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    public final void Z(ArrayList arrayList) {
        o60 o60Var;
        float fMax;
        int i10;
        int iDp;
        int iDp2;
        int i11;
        int iC;
        int iDp3;
        int iD;
        View childAt;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            o60Var = this.Q;
            if (i12 >= size) {
                break;
            }
            Long l10 = (Long) arrayList.get(i12);
            long jLongValue = l10.longValue();
            a30 a30Var = new a30(o60Var.getContext(), DialogObject.isChatDialog(jLongValue) ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-jLongValue)) : MessagesController.getInstance(this.currentAccount).getUser(l10));
            o60Var.a(a30Var, false);
            a30Var.setOnClickListener(this.f31526n0);
            i12++;
        }
        a0(false);
        int childCount = o60Var.getChildCount();
        Point point = AndroidUtilities.displaySize;
        boolean z10 = point.x < point.y;
        if (AndroidUtilities.isTablet() || z10) {
            this.f31527o0 = AndroidUtilities.dp(144.0f);
        } else {
            this.f31527o0 = AndroidUtilities.dp(56.0f);
        }
        if (!AndroidUtilities.isTablet()) {
            if (z10) {
                i10 = AndroidUtilities.displaySize.x;
            } else {
                fMax = Math.max(AndroidUtilities.displaySize.x * 0.8f, Math.min(AndroidUtilities.dp(480.0f), AndroidUtilities.displaySize.x));
            }
            iDp = i10 - AndroidUtilities.dp(26.0f);
            iDp2 = AndroidUtilities.dp(10.0f);
            iC = 0;
            for (i11 = 0; i11 < childCount; i11++) {
                childAt = o60Var.getChildAt(i11);
                if (!(childAt instanceof a30)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                    if (childAt.getMeasuredWidth() + iC > iDp) {
                        iDp2 = org.telegram.messenger.y1.C(8.0f, childAt.getMeasuredHeight(), iDp2);
                        iC = 0;
                    }
                    iC = org.telegram.messenger.y1.C(9.0f, childAt.getMeasuredWidth(), iC);
                }
            }
            iDp3 = AndroidUtilities.dp(42.0f) + iDp2;
            if (this.f31522i0 != null) {
                iD = i0.a.d(52.0f, Math.min(this.f31527o0, iDp3), 0);
            } else if (this.f31516c0) {
                iD = Math.min(this.f31527o0, iDp3);
            } else {
                iD = 0;
            }
            int i13 = this.f31529q0;
            int iDp4 = this.f31515b0.m() > 0 ? AndroidUtilities.dp(56.0f) : 0;
            this.f31529q0 = iDp4;
            if (iD == this.f31524k0 || i13 != iDp4) {
                this.f31524k0 = iD;
            }
            return;
        }
        Point point2 = AndroidUtilities.displaySize;
        fMax = Math.min(point2.x, point2.y) * 0.8f;
        i10 = (int) fMax;
        iDp = i10 - AndroidUtilities.dp(26.0f);
        iDp2 = AndroidUtilities.dp(10.0f);
        iC = 0;
        while (i11 < childCount) {
            childAt = o60Var.getChildAt(i11);
            if (!(childAt instanceof a30)) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt.getMeasuredWidth() + iC > iDp) {
                    iDp2 = org.telegram.messenger.y1.C(8.0f, childAt.getMeasuredHeight(), iDp2);
                    iC = 0;
                }
                iC = org.telegram.messenger.y1.C(9.0f, childAt.getMeasuredWidth(), iC);
            }
        }
        iDp3 = AndroidUtilities.dp(42.0f) + iDp2;
        if (this.f31522i0 != null) {
            iD = i0.a.d(52.0f, Math.min(this.f31527o0, iDp3), 0);
        } else if (this.f31516c0) {
            iD = Math.min(this.f31527o0, iDp3);
        } else {
            iD = 0;
        }
        int i14 = this.f31529q0;
        if (this.f31515b0.m() > 0) {
        }
        this.f31529q0 = iDp4;
        if (iD == this.f31524k0) {
        }
        this.f31524k0 = iD;
    }

    public final void a0(boolean z10) {
        boolean z11 = true;
        boolean z12 = this.f31515b0.m() > 0;
        if (this.f31516c0 != z12) {
            ValueAnimator valueAnimator = this.f31518e0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f31518e0.cancel();
            }
            this.f31516c0 = z12;
            org.telegram.ui.ActionBar.v1 v1Var = this.R;
            if (z12) {
                v1Var.setVisibility(0);
            }
            if (z10) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f31517d0, z12 ? 1.0f : 0.0f);
                this.f31518e0 = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new e6(this, 27));
                this.f31518e0.addListener(new org.telegram.ui.go(14, this, z12));
                this.f31518e0.setDuration(150L);
                this.f31518e0.start();
            } else {
                this.f31517d0 = z12 ? 1.0f : 0.0f;
                this.containerView.invalidate();
                if (!z12) {
                    v1Var.setVisibility(8);
                }
            }
            if (!this.f31516c0 && this.f31522i0 == null) {
                z11 = false;
            }
            this.f31528p0.e(z11, z10);
        }
    }

    public final void b0() {
        this.U = -1;
        this.V = -1;
        this.T = -1;
        this.W = -1;
        boolean zX = true;
        this.Y = 1;
        if (this.f31522i0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j10 = this.f31530r0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                zX = X();
            }
            if (zX) {
                int i10 = this.Y;
                this.Y = i10 + 1;
                this.T = i10;
            }
            ArrayList arrayList = this.f31514a0;
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
        } else if (this.f31523j0.size() != 0) {
            int i13 = this.Y;
            this.U = i13;
            int size2 = this.f31523j0.size() + i13;
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
        if (i10 == NotificationCenter.dialogsNeedReload && this.f31522i0 != null && this.f31523j0.isEmpty()) {
            this.f31523j0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f32980f.l();
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
        if (this.f31531s0) {
            Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
            if (activityFindActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activityFindActivity;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (n2Var instanceof org.telegram.ui.rn) {
                    ((org.telegram.ui.rn) n2Var).T9(true, true);
                }
            }
        }
    }
}
