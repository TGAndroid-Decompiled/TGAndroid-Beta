package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class a31 extends FrameLayout implements org.telegram.ui.ActionBar.c6, org.telegram.messenger.fs {
    public final org.telegram.ui.Components.q9 f45443a;
    public final org.telegram.ui.ActionBar.o2 f45444b;
    public final org.telegram.ui.Components.voip.n f45445c;
    public int d;
    public int f45446e;
    public final SessionsActivity f45447f;

    public a31(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.f45447f = sessionsActivity;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f45445c = nVar;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f45443a = q9Var;
        addView(q9Var, c8.ma.d(120, 120.0f, 1, 0.0f, 16.0f, 0.0f, 0.0f));
        nVar.f41053j = false;
        nVar.f41057n = 1.2f;
        q9Var.setOnClickListener(new a8(this, 2));
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.n6.f29396d6;
        org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.n6.x0(null, i11, false);
        org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        org.telegram.ui.Components.k80 k80Var = new org.telegram.ui.Components.k80(context, null);
        addView(k80Var, c8.ma.d(-1, -2.0f, 0, 36.0f, 152.0f, 36.0f, 0.0f));
        k80Var.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(k80Var, i7, null);
        k80Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.J6, null);
        org.telegram.ui.ActionBar.u6.C(k80Var, org.telegram.ui.ActionBar.n6.K6, null);
        String M0 = org.telegram.messenger.gd.M0(2131753887, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf(42);
        int i12 = indexOf + 1;
        int indexOf2 = M0.indexOf(42, i12);
        if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
            k80Var.setMovementMethod(new org.telegram.messenger.c0(false));
            spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, i12, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p41(org.telegram.messenger.gd.M0(2131753891, null), (org.telegram.ui.Components.dz0) null), indexOf, indexOf2 - 1, 33);
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf3 = spannableStringBuilder2.indexOf(42);
        int i13 = indexOf3 + 1;
        int indexOf4 = spannableStringBuilder2.indexOf(42, i13);
        if (indexOf3 != -1 && indexOf4 != -1 && indexOf3 != indexOf4) {
            k80Var.setMovementMethod(new org.telegram.messenger.c0(false));
            spannableStringBuilder.replace(indexOf4, indexOf4 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf3, i13, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p41(org.telegram.messenger.gd.M0(2131753881, null), (org.telegram.ui.Components.dz0) null), indexOf3, indexOf4 - 1, 33);
        }
        k80Var.setText(spannableStringBuilder);
        org.telegram.ui.ActionBar.o2 o2Var = new org.telegram.ui.ActionBar.o2(6, context, this);
        this.f45444b = o2Var;
        o2Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        o2Var.setGravity(17);
        o2Var.setTextSize(1, 14.0f);
        o2Var.setTypeface(org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) ".  ").append((CharSequence) org.telegram.messenger.gd.M0(2131748725, null));
        spannableStringBuilder3.setSpan(new org.telegram.ui.Components.lq(0, getContext().getDrawable(2131232248)), 0, 1, 0);
        o2Var.setText(spannableStringBuilder3);
        org.telegram.ui.ActionBar.u6.U(o2Var, org.telegram.ui.ActionBar.n6.Ji, null);
        int L = org.telegram.messenger.g0.L(24.0f);
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i11, false);
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
        o2Var.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, x02, x03, x03));
        o2Var.setOnClickListener(new oy0(this, 6));
        addView(o2Var, c8.ma.d(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
        a();
    }

    public final void a() {
        int i7;
        TLRPC.Document document;
        int i10;
        boolean z10;
        int i11;
        SessionsActivity sessionsActivity = this.f45447f;
        i7 = ((org.telegram.ui.ActionBar.h2) sessionsActivity).currentAccount;
        TLRPC.TL_messages_stickerSet r02 = org.telegram.messenger.ri.d0(i7).r0("tg_placeholders_android");
        if (r02 == null) {
            i11 = ((org.telegram.ui.ActionBar.h2) sessionsActivity).currentAccount;
            r02 = org.telegram.messenger.ri.d0(i11).p0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = r02;
        org.telegram.messenger.lz lzVar = null;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() > 6) {
            document = tL_messages_stickerSet.documents.get(6);
        } else {
            document = null;
        }
        if (document != null) {
            lzVar = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.n6.f29379c7, 0.2f, false);
        }
        org.telegram.messenger.lz lzVar2 = lzVar;
        if (lzVar2 != null) {
            lzVar2.f25488e = 512;
            lzVar2.f25489f = 512;
        }
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.h2) sessionsActivity).currentAccount;
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i10);
            if (tL_messages_stickerSet == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            d02.f1("tg_placeholders_android", false, z10);
            return;
        }
        org.telegram.messenger.fc b10 = org.telegram.messenger.fc.b(document);
        org.telegram.ui.Components.q9 q9Var = this.f45443a;
        q9Var.k(b10, "130_130", "tgs", lzVar2, tL_messages_stickerSet);
        q9Var.getImageReceiver().W(2);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25227y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        super.onAttachedToWindow();
        a();
        i7 = ((org.telegram.ui.ActionBar.h2) this.f45447f).currentAccount;
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.f25227y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i7;
        super.onDetachedFromWindow();
        i7 = ((org.telegram.ui.ActionBar.h2) this.f45447f).currentAccount;
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.f25227y0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(276.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
            org.telegram.ui.ActionBar.o2 o2Var = this.f45444b;
            if (o2Var != null) {
                if (x02 == this.d) {
                    if (x03 != this.f45446e) {
                    }
                }
                this.d = x02;
                this.f45446e = x03;
                int L = org.telegram.messenger.g0.L(24.0f);
                o2Var.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, x02, x03, x03));
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
