package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class c31 extends FrameLayout implements org.telegram.ui.ActionBar.c6, org.telegram.messenger.ls {
    public final org.telegram.ui.Components.k9 f44210a;
    public final org.telegram.ui.ActionBar.n2 f44211b;
    public final org.telegram.ui.Components.voip.n f44212c;
    public int d;
    public int f44213e;
    public final SessionsActivity f44214f;

    public c31(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.f44214f = sessionsActivity;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f44212c = nVar;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f44210a = k9Var;
        addView(k9Var, c8.ha.d(120, 120.0f, 1, 0.0f, 16.0f, 0.0f, 0.0f));
        nVar.f39386j = false;
        nVar.f39390n = 1.2f;
        k9Var.setOnClickListener(new z7(this, 2));
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.m6.f27890d6;
        org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.m6.Ci;
        org.telegram.ui.ActionBar.m6.x0(null, i11, false);
        org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context, null);
        addView(w70Var, c8.ha.d(-1, -2.0f, 0, 36.0f, 152.0f, 36.0f, 0.0f));
        w70Var.setGravity(1);
        org.telegram.ui.ActionBar.t6.U(w70Var, i7, null);
        w70Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.J6, null);
        org.telegram.ui.ActionBar.t6.C(w70Var, org.telegram.ui.ActionBar.m6.K6, null);
        String M0 = org.telegram.messenger.id.M0(2131753889, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf(42);
        int i12 = indexOf + 1;
        int indexOf2 = M0.indexOf(42, i12);
        if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
            w70Var.setMovementMethod(new org.telegram.messenger.c0(false));
            spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, i12, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.b41(org.telegram.messenger.id.M0(2131753893, null), (org.telegram.ui.Components.uy0) null), indexOf, indexOf2 - 1, 33);
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf3 = spannableStringBuilder2.indexOf(42);
        int i13 = indexOf3 + 1;
        int indexOf4 = spannableStringBuilder2.indexOf(42, i13);
        if (indexOf3 != -1 && indexOf4 != -1 && indexOf3 != indexOf4) {
            w70Var.setMovementMethod(new org.telegram.messenger.c0(false));
            spannableStringBuilder.replace(indexOf4, indexOf4 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf3, i13, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.b41(org.telegram.messenger.id.M0(2131753883, null), (org.telegram.ui.Components.uy0) null), indexOf3, indexOf4 - 1, 33);
        }
        w70Var.setText(spannableStringBuilder);
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(6, context, this);
        this.f44211b = n2Var;
        n2Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        n2Var.setGravity(17);
        n2Var.setTextSize(1, 14.0f);
        n2Var.setTypeface(org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) ".  ").append((CharSequence) org.telegram.messenger.id.M0(2131748917, null));
        spannableStringBuilder3.setSpan(new org.telegram.ui.Components.wp(0, getContext().getDrawable(2131232246)), 0, 1, 0);
        n2Var.setText(spannableStringBuilder3);
        org.telegram.ui.ActionBar.t6.U(n2Var, org.telegram.ui.ActionBar.m6.Gi, null);
        int L = org.telegram.messenger.g0.L(24.0f);
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ei, false);
        n2Var.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, x02, x03, x03));
        n2Var.setOnClickListener(new qy0(this, 6));
        addView(n2Var, c8.ha.d(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
        a();
    }

    public final void a() {
        int i7;
        TLRPC.Document document;
        int i10;
        boolean z9;
        int i11;
        SessionsActivity sessionsActivity = this.f44214f;
        i7 = ((org.telegram.ui.ActionBar.f2) sessionsActivity).currentAccount;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.ui.b0(i7).p0("tg_placeholders_android");
        if (p02 == null) {
            i11 = ((org.telegram.ui.ActionBar.f2) sessionsActivity).currentAccount;
            p02 = org.telegram.messenger.ui.b0(i11).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        org.telegram.messenger.rz rzVar = null;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() > 6) {
            document = tL_messages_stickerSet.documents.get(6);
        } else {
            document = null;
        }
        if (document != null) {
            rzVar = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.m6.f27873c7, 0.2f, false);
        }
        org.telegram.messenger.rz rzVar2 = rzVar;
        if (rzVar2 != null) {
            rzVar2.f25386e = 512;
            rzVar2.f25387f = 512;
        }
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.f2) sessionsActivity).currentAccount;
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i10);
            if (tL_messages_stickerSet == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            b02.c1("tg_placeholders_android", false, z9);
            return;
        }
        org.telegram.messenger.hc b10 = org.telegram.messenger.hc.b(document);
        org.telegram.ui.Components.k9 k9Var = this.f44210a;
        k9Var.k(b10, "130_130", "tgs", rzVar2, tL_messages_stickerSet);
        k9Var.getImageReceiver().W(2);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25115y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        super.onAttachedToWindow();
        a();
        i7 = ((org.telegram.ui.ActionBar.f2) this.f44214f).currentAccount;
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f25115y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i7;
        super.onDetachedFromWindow();
        i7 = ((org.telegram.ui.ActionBar.f2) this.f44214f).currentAccount;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25115y0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(276.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ci, false);
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ei, false);
            org.telegram.ui.ActionBar.n2 n2Var = this.f44211b;
            if (n2Var != null) {
                if (x02 == this.d) {
                    if (x03 != this.f44213e) {
                    }
                }
                this.d = x02;
                this.f44213e = x03;
                int L = org.telegram.messenger.g0.L(24.0f);
                n2Var.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, x02, x03, x03));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
