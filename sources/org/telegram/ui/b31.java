package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class b31 extends FrameLayout implements org.telegram.ui.ActionBar.b6, org.telegram.messenger.gs {
    public final org.telegram.ui.Components.q9 f45766a;
    public final org.telegram.ui.ActionBar.n2 f45767b;
    public final org.telegram.ui.Components.voip.n f45768c;
    public int d;
    public int f45769e;
    public final SessionsActivity f45770f;

    public b31(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.f45770f = sessionsActivity;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f45768c = nVar;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f45766a = q9Var;
        addView(q9Var, c8.ma.d(120, 120.0f, 1, 0.0f, 16.0f, 0.0f, 0.0f));
        nVar.f41189j = false;
        nVar.f41193n = 1.2f;
        q9Var.setOnClickListener(new a8(this, 2));
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.m6.f29381d6;
        org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.m6.Fi;
        org.telegram.ui.ActionBar.m6.x0(null, i11, false);
        org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(context, null);
        addView(m80Var, c8.ma.d(-1, -2.0f, 0, 36.0f, 152.0f, 36.0f, 0.0f));
        m80Var.setGravity(1);
        org.telegram.ui.ActionBar.t6.U(m80Var, i7, null);
        m80Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.J6, null);
        org.telegram.ui.ActionBar.t6.C(m80Var, org.telegram.ui.ActionBar.m6.K6, null);
        String N0 = org.telegram.messenger.hd.N0(2131753886, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
        int indexOf = N0.indexOf(42);
        int i12 = indexOf + 1;
        int indexOf2 = N0.indexOf(42, i12);
        if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
            m80Var.setMovementMethod(new org.telegram.messenger.c0(false));
            spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, i12, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.s41(org.telegram.messenger.hd.N0(2131753890, null), (org.telegram.ui.Components.fz0) null), indexOf, indexOf2 - 1, 33);
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf3 = spannableStringBuilder2.indexOf(42);
        int i13 = indexOf3 + 1;
        int indexOf4 = spannableStringBuilder2.indexOf(42, i13);
        if (indexOf3 != -1 && indexOf4 != -1 && indexOf3 != indexOf4) {
            m80Var.setMovementMethod(new org.telegram.messenger.c0(false));
            spannableStringBuilder.replace(indexOf4, indexOf4 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf3, i13, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.s41(org.telegram.messenger.hd.N0(2131753880, null), (org.telegram.ui.Components.fz0) null), indexOf3, indexOf4 - 1, 33);
        }
        m80Var.setText(spannableStringBuilder);
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(6, context, this);
        this.f45767b = n2Var;
        n2Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        n2Var.setGravity(17);
        n2Var.setTextSize(1, 14.0f);
        n2Var.setTypeface(org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) ".  ").append((CharSequence) org.telegram.messenger.hd.N0(2131748724, null));
        spannableStringBuilder3.setSpan(new org.telegram.ui.Components.nq(0, getContext().getDrawable(2131232248)), 0, 1, 0);
        n2Var.setText(spannableStringBuilder3);
        org.telegram.ui.ActionBar.t6.U(n2Var, org.telegram.ui.ActionBar.m6.Ji, null);
        int L = org.telegram.messenger.g0.L(24.0f);
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hi, false);
        n2Var.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, x02, x03, x03));
        n2Var.setOnClickListener(new oy0(this, 6));
        addView(n2Var, c8.ma.d(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
        a();
    }

    public final void a() {
        int i7;
        TLRPC.Document document;
        int i10;
        boolean z10;
        int i11;
        SessionsActivity sessionsActivity = this.f45770f;
        i7 = ((org.telegram.ui.ActionBar.g2) sessionsActivity).currentAccount;
        TLRPC.TL_messages_stickerSet r02 = org.telegram.messenger.si.d0(i7).r0("tg_placeholders_android");
        if (r02 == null) {
            i11 = ((org.telegram.ui.ActionBar.g2) sessionsActivity).currentAccount;
            r02 = org.telegram.messenger.si.d0(i11).p0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = r02;
        org.telegram.messenger.mz mzVar = null;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() > 6) {
            document = tL_messages_stickerSet.documents.get(6);
        } else {
            document = null;
        }
        if (document != null) {
            mzVar = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.m6.f29364c7, 0.2f, false);
        }
        org.telegram.messenger.mz mzVar2 = mzVar;
        if (mzVar2 != null) {
            mzVar2.f25692e = 512;
            mzVar2.f25693f = 512;
        }
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.g2) sessionsActivity).currentAccount;
            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i10);
            if (tL_messages_stickerSet == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            d02.f1("tg_placeholders_android", false, z10);
            return;
        }
        org.telegram.messenger.gc b10 = org.telegram.messenger.gc.b(document);
        org.telegram.ui.Components.q9 q9Var = this.f45766a;
        q9Var.k(b10, "130_130", "tgs", mzVar2, tL_messages_stickerSet);
        q9Var.getImageReceiver().W(2);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f25419y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        super.onAttachedToWindow();
        a();
        i7 = ((org.telegram.ui.ActionBar.g2) this.f45770f).currentAccount;
        org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.f25419y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i7;
        super.onDetachedFromWindow();
        i7 = ((org.telegram.ui.ActionBar.g2) this.f45770f).currentAccount;
        org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.f25419y0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(276.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false);
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hi, false);
            org.telegram.ui.ActionBar.n2 n2Var = this.f45767b;
            if (n2Var != null) {
                if (x02 == this.d) {
                    if (x03 != this.f45769e) {
                    }
                }
                this.d = x02;
                this.f45769e = x03;
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
