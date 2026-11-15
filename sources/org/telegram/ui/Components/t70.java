package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class t70 extends LinearLayout {
    public boolean E;
    public q70 F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public final float[] J;
    public String K;
    public boolean L;
    public String M;
    public final TextView f39576a;
    public String f39577b;
    public final org.telegram.ui.ActionBar.e2 f39578c;
    public final ImageView d;
    public final TextView f39579e;
    public final TextView f39580f;
    public final TextView h;
    public final FrameLayout f39581n;
    public s70 f39582r;
    public org.telegram.ui.ActionBar.g1 f39583s;
    public final di.e1 f39584w;
    public int f39585x;
    public boolean f39586y;

    public t70(Context context, final org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.u2 u2Var, boolean z10, boolean z11) {
        super(context);
        this.H = true;
        this.J = new float[2];
        this.f39578c = e2Var;
        this.f39586y = z10;
        this.I = z11;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39581n = frameLayout;
        TextView textView = new TextView(context);
        this.f39576a = textView;
        textView.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(13.0f));
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setSingleLine(true);
        frameLayout.addView(textView);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageDrawable(context.getDrawable(2131231244));
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, c8.ja.e(40, 48, 21));
        addView(frameLayout, c8.ja.t(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.f39579e = textView2;
        c8.na.b(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new eq(0, context.getDrawable(2131232105)), 0, 1, 0);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(6.0f)), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131748926, null));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(org.telegram.messenger.hd.M0(2131748926, null));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setSingleLine(true);
        TextView f10 = org.telegram.messenger.i20.f(linearLayout, textView2, c8.ja.q(0, 42, 1.0f, 0, 4, 0, 4, 0), context);
        this.f39580f = f10;
        c8.na.b(f10, 0.025f, 1.2f);
        f10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new eq(0, context.getDrawable(2131232365)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(6.0f)), 1, 2, 0);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(2131748925, null));
        f10.setText(spannableStringBuilder2);
        f10.setContentDescription(org.telegram.messenger.hd.M0(2131748925, null));
        f10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        f10.setTextSize(1, 14.0f);
        f10.setTypeface(org.telegram.messenger.g0.o());
        f10.setSingleLine(true);
        TextView f11 = org.telegram.messenger.i20.f(linearLayout, f10, c8.ja.m(1.0f, 0, 42, 4, 4, 0), context);
        this.h = f11;
        c8.na.b(f11, 0.025f, 1.2f);
        f11.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new eq(0, context.getDrawable(2131232111)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) org.telegram.messenger.hd.M0(2131751534, null));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        f11.setText(spannableStringBuilder3);
        f11.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        f11.setTextSize(1, 14.0f);
        f11.setTypeface(org.telegram.messenger.g0.o());
        f11.setSingleLine(true);
        linearLayout.addView(f11, c8.ja.m(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        f11.setVisibility(8);
        addView(linearLayout, c8.ja.k(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        di.e1 e1Var = new di.e1(this, context);
        this.f39584w = e1Var;
        ((r70) e1Var.f8446c).setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        addView(e1Var, c8.ja.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new lt(this, u2Var, e2Var, 2));
        if (z10) {
            e1Var.setOnClickListener(new m70(this, 0));
        }
        f10.setOnClickListener(new View.OnClickListener(this) {
            public final t70 f37473b;

            {
                this.f37473b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r3;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        t70 t70Var = this.f37473b;
                        try {
                            if (t70Var.f39577b != null) {
                                Context context2 = t70Var.getContext();
                                String str = t70Var.f39577b;
                                e2Var2.showDialog(new o70(t70Var, context2, str, str, e2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    default:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e2Var2.getParentActivity());
                        String M0 = org.telegram.messenger.hd.M0(2131751534, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131751533, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new l70(this.f37473b, 0));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        e2Var2.showDialog(t1Var);
                        return;
                }
            }
        });
        f11.setOnClickListener(new View.OnClickListener(this) {
            public final t70 f37473b;

            {
                this.f37473b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r3;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        t70 t70Var = this.f37473b;
                        try {
                            if (t70Var.f39577b != null) {
                                Context context2 = t70Var.getContext();
                                String str = t70Var.f39577b;
                                e2Var2.showDialog(new o70(t70Var, context2, str, str, e2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    default:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e2Var2.getParentActivity());
                        String M0 = org.telegram.messenger.hd.M0(2131751534, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131751533, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new l70(this.f37473b, 0));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        e2Var2.showDialog(t1Var);
                        return;
                }
            }
        });
        imageView.setOnClickListener(new bi.f4(this, context, u2Var, e2Var, 14));
        frameLayout.setOnClickListener(new androidx.mediarouter.app.w(this, 12));
        f();
    }

    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        FrameLayout frameLayout3 = frameLayout;
        while (frameLayout3 != frameLayout2) {
            float y10 = frameLayout3.getY() + f10;
            f11 += frameLayout3.getX();
            if (frameLayout3 instanceof ScrollView) {
                y10 -= frameLayout3.getScrollY();
            }
            f10 = y10;
            if (!(frameLayout3.getParent() instanceof View)) {
                break;
            }
            ?? r32 = (View) frameLayout3.getParent();
            boolean z10 = r32 instanceof ViewGroup;
            frameLayout3 = r32;
            if (!z10) {
                return;
            }
        }
        fArr[0] = f11 - frameLayout2.getPaddingLeft();
        fArr[1] = f10 - frameLayout2.getPaddingTop();
    }

    public final void b(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            ImageView imageView = this.d;
            imageView.setVisibility(0);
            imageView.setImageDrawable(imageView.getContext().getDrawable(2131231244));
        }
    }

    public final void c(TLRPC.TL_chatInviteExported tL_chatInviteExported, long j3) {
        if (tL_chatInviteExported == null) {
            d(0, null, false);
        } else if (!TextUtils.equals(this.M, tL_chatInviteExported.link)) {
            d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, false);
            if (tL_chatInviteExported.usage > 0 && tL_chatInviteExported.importers == null && !this.E) {
                TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
                String str = tL_chatInviteExported.link;
                if (str != null) {
                    tL_messages_getChatInviteImporters.flags |= 2;
                    tL_messages_getChatInviteImporters.link = str;
                }
                tL_messages_getChatInviteImporters.peer = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).j1(-j3);
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                tL_messages_getChatInviteImporters.limit = Math.min(tL_chatInviteExported.usage, 3);
                this.E = true;
                ConnectionsManager.getInstance(org.telegram.messenger.m10.f24934t0).sendRequest(tL_messages_getChatInviteImporters, new org.telegram.ui.v7(19, this, tL_chatInviteExported));
            }
        }
    }

    public final void d(int i7, ArrayList arrayList, boolean z10) {
        this.f39585x = i7;
        di.e1 e1Var = this.f39584w;
        if (i7 == 0) {
            e1Var.setVisibility(8);
            setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(18.0f));
        } else {
            e1Var.setVisibility(0);
            setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(10.0f));
            ((TextView) e1Var.f8445b).setText(org.telegram.messenger.hd.G(i7, "PeopleJoined", new Object[0]));
            e1Var.requestLayout();
        }
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).X3((TLRPC.User) arrayList.get(i10), false, false);
            }
            int min = Math.min(3, Math.min(i7, arrayList.size()));
            ((r70) e1Var.f8446c).setCount(min);
            for (int i11 = 0; i11 < min; i11++) {
                ((r70) e1Var.f8446c).b(i11, org.telegram.messenger.m10.f24934t0, (TLObject) arrayList.get(i11));
            }
        } else {
            ((r70) e1Var.f8446c).setCount(0);
        }
        ((r70) e1Var.f8446c).a(z10);
    }

    public void e(SpannableStringBuilder spannableStringBuilder) {
        xb Q = cc.a0(this.f39578c).Q(2131624029, 36, spannableStringBuilder);
        Q.f41651r = false;
        Q.k(true);
    }

    public final void f() {
        boolean z10 = this.L;
        ImageView imageView = this.d;
        TextView textView = this.f39576a;
        FrameLayout frameLayout = this.f39581n;
        TextView textView2 = this.h;
        TextView textView3 = this.f39580f;
        TextView textView4 = this.f39579e;
        di.e1 e1Var = this.f39584w;
        if (z10) {
            org.telegram.ui.ActionBar.q6.a0(textView4);
            org.telegram.ui.ActionBar.q6.a0(textView3);
            org.telegram.ui.ActionBar.q6.a0(textView2);
            org.telegram.ui.ActionBar.q6.a0(frameLayout);
            org.telegram.ui.ActionBar.q6.a0(textView);
            org.telegram.ui.ActionBar.q6.a0(imageView);
            org.telegram.ui.ActionBar.q6.a0((TextView) e1Var.f8445b);
            org.telegram.ui.ActionBar.q6.a0(e1Var);
            q70 q70Var = this.F;
            if (q70Var != null) {
                q70Var.updateColors();
                return;
            }
            return;
        }
        this.L = true;
        int i7 = org.telegram.ui.ActionBar.j6.Ji;
        org.telegram.ui.ActionBar.q6.U(textView4, i7, null);
        org.telegram.ui.ActionBar.q6.U(textView3, i7, null);
        org.telegram.ui.ActionBar.q6.U(textView2, i7, null);
        int L = org.telegram.messenger.g0.L(21.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.j6.Hi;
        int x03 = org.telegram.ui.ActionBar.j6.x0(null, i11, false);
        org.telegram.ui.ActionBar.q6.Q(textView4, org.telegram.ui.ActionBar.j6.k0(L, L, L, L, x02, x03, x03), org.telegram.ui.ActionBar.q6.M(i10), org.telegram.ui.ActionBar.q6.M(i11), null);
        int L2 = org.telegram.messenger.g0.L(21.0f);
        int x04 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
        int x05 = org.telegram.ui.ActionBar.j6.x0(null, i11, false);
        org.telegram.ui.ActionBar.q6.Q(textView3, org.telegram.ui.ActionBar.j6.k0(L2, L2, L2, L2, x04, x05, x05), org.telegram.ui.ActionBar.q6.M(i10), org.telegram.ui.ActionBar.q6.M(i11), null);
        int L3 = org.telegram.messenger.g0.L(21.0f);
        int i12 = org.telegram.ui.ActionBar.j6.f28982ka;
        int x06 = org.telegram.ui.ActionBar.j6.x0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.j6.f28849d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i13, false), 120);
        org.telegram.ui.ActionBar.q6.Q(textView2, org.telegram.ui.ActionBar.j6.k0(L3, L3, L3, L3, x06, o4, o4), org.telegram.ui.ActionBar.q6.M(i12), org.telegram.ui.ActionBar.q6.g(i13, 120), null);
        int L4 = org.telegram.messenger.g0.L(21.0f);
        int i14 = org.telegram.ui.ActionBar.j6.f28869e7;
        int x07 = org.telegram.ui.ActionBar.j6.x0(null, i14, false);
        int i15 = org.telegram.ui.ActionBar.j6.f28941i6;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i15, false), 76);
        org.telegram.ui.ActionBar.q6.Q(frameLayout, org.telegram.ui.ActionBar.j6.k0(L4, L4, L4, L4, x07, o10, o10), org.telegram.ui.ActionBar.q6.M(i14), org.telegram.ui.ActionBar.q6.g(i15, 76), null);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.f29107r5, null, PorterDuff.Mode.SRC_ATOP);
        int i16 = org.telegram.ui.ActionBar.j6.f29031n6;
        org.telegram.ui.ActionBar.q6.U((TextView) e1Var.f8445b, i16, null);
        int L5 = org.telegram.messenger.g0.L(6.0f);
        int o11 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i16, false), 76);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L5, L5, L5, L5, 0, o11, o11);
        org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i16, 76);
        e1Var.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(e1Var, k02, null, g10, null);
        q70 q70Var2 = this.F;
        if (q70Var2 != null) {
            q70Var2.updateColors();
        }
    }

    public void setCanEdit(boolean z10) {
        this.H = z10;
    }

    public void setDelegate(s70 s70Var) {
        this.f39582r = s70Var;
    }

    public void setLink(String str) {
        this.f39577b = str;
        TextView textView = this.f39576a;
        if (str == null) {
            textView.setText(org.telegram.messenger.hd.M0(2131748779, null));
        } else if (str.startsWith("https://")) {
            textView.setText(str.substring(8));
        } else {
            textView.setText(str);
        }
    }

    public void setPermanent(boolean z10) {
        this.f39586y = z10;
    }

    public void setQrText(String str) {
        this.K = str;
    }

    public void setRevoke(boolean z10) {
        TextView textView = this.h;
        TextView textView2 = this.f39579e;
        TextView textView3 = this.f39580f;
        ImageView imageView = this.d;
        if (z10) {
            imageView.setVisibility(8);
            textView3.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(0);
            return;
        }
        imageView.setVisibility(0);
        textView3.setVisibility(0);
        textView2.setVisibility(0);
        textView.setVisibility(8);
    }
}
