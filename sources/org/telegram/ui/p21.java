package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class p21 extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.cs {
    public final org.telegram.ui.Components.k9 f48425a;
    public final org.telegram.ui.ActionBar.k2 f48426b;
    public final org.telegram.ui.Components.voip.g f48427c;
    public int d;
    public int f48428e;
    public final SessionsActivity f48429f;

    public p21(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.f48429f = sessionsActivity;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.f48427c = gVar;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f48425a = k9Var;
        addView(k9Var, b8.mf.d(120, 120.0f, 1, 0.0f, 16.0f, 0.0f, 0.0f));
        gVar.f39352j = false;
        gVar.f39356n = 1.2f;
        k9Var.setOnClickListener(new a8(this, 2));
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
        org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(context, null);
        addView(s70Var, b8.mf.d(-1, -2.0f, 0, 36.0f, 152.0f, 36.0f, 0.0f));
        s70Var.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(s70Var, i3, null);
        s70Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.J6, null);
        org.telegram.ui.ActionBar.r6.D(s70Var, org.telegram.ui.ActionBar.k6.K6, null);
        String M0 = org.telegram.messenger.bd.M0(2131753889, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf(42);
        int i12 = indexOf + 1;
        int indexOf2 = M0.indexOf(42, i12);
        if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
            s70Var.setMovementMethod(new org.telegram.messenger.c0(false));
            spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, i12, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.v31(org.telegram.messenger.bd.M0(2131753893, null), (org.telegram.ui.Components.ty0) null), indexOf, indexOf2 - 1, 33);
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf3 = spannableStringBuilder2.indexOf(42);
        int i13 = indexOf3 + 1;
        int indexOf4 = spannableStringBuilder2.indexOf(42, i13);
        if (indexOf3 != -1 && indexOf4 != -1 && indexOf3 != indexOf4) {
            s70Var.setMovementMethod(new org.telegram.messenger.c0(false));
            spannableStringBuilder.replace(indexOf4, indexOf4 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf3, i13, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.v31(org.telegram.messenger.bd.M0(2131753883, null), (org.telegram.ui.Components.ty0) null), indexOf3, indexOf4 - 1, 33);
        }
        s70Var.setText(spannableStringBuilder);
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2(6, context, this);
        this.f48426b = k2Var;
        k2Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        k2Var.setGravity(17);
        k2Var.setTextSize(1, 14.0f);
        k2Var.setTypeface(org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) ".  ").append((CharSequence) org.telegram.messenger.bd.M0(2131748925, null));
        spannableStringBuilder3.setSpan(new org.telegram.ui.Components.wp(0, getContext().getDrawable(2131232246)), 0, 1, 0);
        k2Var.setText(spannableStringBuilder3);
        org.telegram.ui.ActionBar.r6.V(k2Var, org.telegram.ui.ActionBar.k6.Gi, null);
        int L = org.telegram.messenger.g0.L(24.0f);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
        k2Var.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x02, x03, x03));
        k2Var.setOnClickListener(new cy0(this, 6));
        addView(k2Var, b8.mf.d(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
        a();
    }

    public final void a() {
        int i3;
        TLRPC.Document document;
        int i10;
        boolean z10;
        int i11;
        SessionsActivity sessionsActivity = this.f48429f;
        i3 = ((org.telegram.ui.ActionBar.d2) sessionsActivity).currentAccount;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.li.b0(i3).p0("tg_placeholders_android");
        if (p02 == null) {
            i11 = ((org.telegram.ui.ActionBar.d2) sessionsActivity).currentAccount;
            p02 = org.telegram.messenger.li.b0(i11).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        org.telegram.messenger.jz jzVar = null;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() > 6) {
            document = tL_messages_stickerSet.documents.get(6);
        } else {
            document = null;
        }
        if (document != null) {
            jzVar = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.f27862c7, 0.2f, false);
        }
        org.telegram.messenger.jz jzVar2 = jzVar;
        if (jzVar2 != null) {
            jzVar2.f23763e = 512;
            jzVar2.f23764f = 512;
        }
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.d2) sessionsActivity).currentAccount;
            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i10);
            if (tL_messages_stickerSet == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            b02.c1("tg_placeholders_android", false, z10);
            return;
        }
        org.telegram.messenger.ac b10 = org.telegram.messenger.ac.b(document);
        org.telegram.ui.Components.k9 k9Var = this.f48425a;
        k9Var.k(b10, "130_130", "tgs", jzVar2, tL_messages_stickerSet);
        k9Var.getImageReceiver().W(2);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23340y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i3;
        super.onAttachedToWindow();
        a();
        i3 = ((org.telegram.ui.ActionBar.d2) this.f48429f).currentAccount;
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23340y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i3;
        super.onDetachedFromWindow();
        i3 = ((org.telegram.ui.ActionBar.d2) this.f48429f).currentAccount;
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23340y0);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(276.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
            org.telegram.ui.ActionBar.k2 k2Var = this.f48426b;
            if (k2Var != null) {
                if (x02 == this.d) {
                    if (x03 != this.f48428e) {
                    }
                }
                this.d = x02;
                this.f48428e = x03;
                int L = org.telegram.messenger.g0.L(24.0f);
                k2Var.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x02, x03, x03));
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
