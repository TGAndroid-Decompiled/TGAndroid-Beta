package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class o41 extends FrameLayout implements org.telegram.ui.ActionBar.k6, org.telegram.messenger.vs {
    public final org.telegram.ui.Components.g9 f40040a;
    public final org.telegram.ui.ActionBar.q2 f40041b;
    public final org.telegram.ui.Components.voip.g f40042c;
    public int d;
    public int e;
    public final SessionsActivity f40043f;

    public o41(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.f40043f = sessionsActivity;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.f40042c = gVar;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f40040a = g9Var;
        addView(g9Var, w7.b6.d(120, 120.0f, 1, 0.0f, 16.0f, 0.0f, 0.0f));
        gVar.f31497j = false;
        gVar.f31501n = 1.2f;
        g9Var.setOnClickListener(new z7(this, 2));
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.t6.f20930d6;
        org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        org.telegram.ui.ActionBar.t6.x0(null, i12, false);
        org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, null);
        addView(p80Var, w7.b6.d(-1, -2.0f, 0, 36.0f, 152.0f, 36.0f, 0.0f));
        p80Var.setGravity(1);
        org.telegram.ui.ActionBar.a7.V(p80Var, i10, null);
        p80Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.J6, null);
        org.telegram.ui.ActionBar.a7.D(p80Var, org.telegram.ui.ActionBar.t6.K6, null);
        String L0 = org.telegram.messenger.dd.L0(2131753889, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L0);
        int indexOf = L0.indexOf(42);
        int i13 = indexOf + 1;
        int indexOf2 = L0.indexOf(42, i13);
        if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
            p80Var.setMovementMethod(new org.telegram.messenger.e0(false));
            spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, i13, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.f51(org.telegram.messenger.dd.L0(2131753893, null), (org.telegram.ui.Components.zz0) null), indexOf, indexOf2 - 1, 33);
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf3 = spannableStringBuilder2.indexOf(42);
        int i14 = indexOf3 + 1;
        int indexOf4 = spannableStringBuilder2.indexOf(42, i14);
        if (indexOf3 != -1 && indexOf4 != -1 && indexOf3 != indexOf4) {
            p80Var.setMovementMethod(new org.telegram.messenger.e0(false));
            spannableStringBuilder.replace(indexOf4, indexOf4 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf3, i14, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.f51(org.telegram.messenger.dd.L0(2131753883, null), (org.telegram.ui.Components.zz0) null), indexOf3, indexOf4 - 1, 33);
        }
        p80Var.setText(spannableStringBuilder);
        org.telegram.ui.ActionBar.q2 q2Var = new org.telegram.ui.ActionBar.q2(this, context, 6);
        this.f40041b = q2Var;
        q2Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        q2Var.setGravity(17);
        q2Var.setTextSize(1, 14.0f);
        q2Var.setTypeface(org.telegram.messenger.i0.o());
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) ".  ").append((CharSequence) org.telegram.messenger.dd.L0(2131748927, null));
        spannableStringBuilder3.setSpan(new org.telegram.ui.Components.dq(0, getContext().getDrawable(2131232245)), 0, 1, 0);
        q2Var.setText(spannableStringBuilder3);
        org.telegram.ui.ActionBar.a7.V(q2Var, org.telegram.ui.ActionBar.t6.Gi, null);
        int L = org.telegram.messenger.i0.L(24.0f);
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i12, false);
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
        q2Var.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, x02, x03, x03));
        q2Var.setOnClickListener(new zz0(this, 6));
        addView(q2Var, w7.b6.d(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
        a();
    }

    public final void a() {
        int i10;
        TLRPC.Document document;
        int i11;
        boolean z10;
        int i12;
        SessionsActivity sessionsActivity = this.f40043f;
        i10 = ((org.telegram.ui.ActionBar.k2) sessionsActivity).currentAccount;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.vi.b0(i10).p0("tg_placeholders_android");
        if (p02 == null) {
            i12 = ((org.telegram.ui.ActionBar.k2) sessionsActivity).currentAccount;
            p02 = org.telegram.messenger.vi.b0(i12).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        org.telegram.messenger.d00 d00Var = null;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() > 6) {
            document = tL_messages_stickerSet.documents.get(6);
        } else {
            document = null;
        }
        if (document != null) {
            d00Var = org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.f20912c7, 0.2f, false);
        }
        org.telegram.messenger.d00 d00Var2 = d00Var;
        if (d00Var2 != null) {
            d00Var2.e = 512;
            d00Var2.f15264f = 512;
        }
        if (document == null) {
            i11 = ((org.telegram.ui.ActionBar.k2) sessionsActivity).currentAccount;
            org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(i11);
            if (tL_messages_stickerSet == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            b02.c1("tg_placeholders_android", false, z10);
            return;
        }
        org.telegram.messenger.jc b10 = org.telegram.messenger.jc.b(document);
        org.telegram.ui.Components.g9 g9Var = this.f40040a;
        g9Var.k(b10, "130_130", "tgs", d00Var2, tL_messages_stickerSet);
        g9Var.getImageReceiver().W(2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14821y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        a();
        i10 = ((org.telegram.ui.ActionBar.k2) this.f40043f).currentAccount;
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.f14821y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.k2) this.f40043f).currentAccount;
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.f14821y0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(276.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
            org.telegram.ui.ActionBar.q2 q2Var = this.f40041b;
            if (q2Var != null) {
                if (x02 == this.d) {
                    if (x03 != this.e) {
                    }
                }
                this.d = x02;
                this.e = x03;
                int L = org.telegram.messenger.i0.L(24.0f);
                q2Var.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, x02, x03, x03));
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
