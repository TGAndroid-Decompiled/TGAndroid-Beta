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
public class m70 extends LinearLayout {
    public boolean E;
    public j70 F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public final float[] J;
    public String K;
    public boolean L;
    public String M;
    public final TextView f36055a;
    public String f36056b;
    public final org.telegram.ui.ActionBar.d2 f36057c;
    public final ImageView d;
    public final TextView f36058e;
    public final TextView f36059f;
    public final TextView h;
    public final FrameLayout f36060n;
    public l70 f36061r;
    public org.telegram.ui.ActionBar.f1 f36062s;
    public final ci.l1 f36063w;
    public int f36064x;
    public boolean f36065y;

    public m70(Context context, final org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.t2 t2Var, boolean z10, boolean z11) {
        super(context);
        this.H = true;
        this.J = new float[2];
        this.f36057c = d2Var;
        this.f36065y = z10;
        this.I = z11;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36060n = frameLayout;
        TextView textView = new TextView(context);
        this.f36055a = textView;
        textView.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(13.0f));
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setSingleLine(true);
        frameLayout.addView(textView);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageDrawable(context.getDrawable(2131231244));
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, b8.mf.e(40, 48, 21));
        addView(frameLayout, b8.mf.t(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.f36058e = textView2;
        b8.pf.b(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new wp(0, context.getDrawable(2131232104)), 0, 1, 0);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(6.0f)), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131748934, null));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(org.telegram.messenger.bd.M0(2131748934, null));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setSingleLine(true);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView2, b8.mf.q(0, 42, 1.0f, 0, 4, 0, 4, 0), context);
        this.f36059f = f10;
        b8.pf.b(f10, 0.025f, 1.2f);
        f10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new wp(0, context.getDrawable(2131232364)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(6.0f)), 1, 2, 0);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.bd.M0(2131748933, null));
        f10.setText(spannableStringBuilder2);
        f10.setContentDescription(org.telegram.messenger.bd.M0(2131748933, null));
        f10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        f10.setTextSize(1, 14.0f);
        f10.setTypeface(org.telegram.messenger.g0.o());
        f10.setSingleLine(true);
        TextView f11 = org.telegram.messenger.camera.q.f(linearLayout, f10, b8.mf.m(1.0f, 0, 42, 4, 4, 0), context);
        this.h = f11;
        b8.pf.b(f11, 0.025f, 1.2f);
        f11.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new wp(0, context.getDrawable(2131232110)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) org.telegram.messenger.bd.M0(2131751535, null));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        f11.setText(spannableStringBuilder3);
        f11.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        f11.setTextSize(1, 14.0f);
        f11.setTypeface(org.telegram.messenger.g0.o());
        f11.setSingleLine(true);
        linearLayout.addView(f11, b8.mf.m(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        f11.setVisibility(8);
        addView(linearLayout, b8.mf.k(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        ci.l1 l1Var = new ci.l1(this, context);
        this.f36063w = l1Var;
        ((k70) l1Var.f5432c).setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        addView(l1Var, b8.mf.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new ct(this, t2Var, d2Var, 2));
        if (z10) {
            l1Var.setOnClickListener(new f70(this, 0));
        }
        f10.setOnClickListener(new View.OnClickListener(this) {
            public final m70 f34017b;

            {
                this.f34017b = this;
            }

            @Override
            public final void onClick(View view) {
                int i3 = r3;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        m70 m70Var = this.f34017b;
                        try {
                            if (m70Var.f36056b != null) {
                                Context context2 = m70Var.getContext();
                                String str = m70Var.f36056b;
                                d2Var2.showDialog(new h70(m70Var, context2, str, str, d2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    default:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d2Var2.getParentActivity());
                        String M0 = org.telegram.messenger.bd.M0(2131751535, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131751534, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new e70(this.f34017b, 0));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        d2Var2.showDialog(s1Var);
                        return;
                }
            }
        });
        f11.setOnClickListener(new View.OnClickListener(this) {
            public final m70 f34017b;

            {
                this.f34017b = this;
            }

            @Override
            public final void onClick(View view) {
                int i3 = r3;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        m70 m70Var = this.f34017b;
                        try {
                            if (m70Var.f36056b != null) {
                                Context context2 = m70Var.getContext();
                                String str = m70Var.f36056b;
                                d2Var2.showDialog(new h70(m70Var, context2, str, str, d2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    default:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d2Var2.getParentActivity());
                        String M0 = org.telegram.messenger.bd.M0(2131751535, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131751534, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new e70(this.f34017b, 0));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        d2Var2.showDialog(s1Var);
                        return;
                }
            }
        });
        imageView.setOnClickListener(new ai.r4(this, context, t2Var, d2Var, 14));
        frameLayout.setOnClickListener(new androidx.mediarouter.app.w(this, 12));
        f();
    }

    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        FrameLayout frameLayout3 = frameLayout;
        while (frameLayout3 != frameLayout2) {
            float y9 = frameLayout3.getY() + f10;
            f11 += frameLayout3.getX();
            if (frameLayout3 instanceof ScrollView) {
                y9 -= frameLayout3.getScrollY();
            }
            f10 = y9;
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

    public final void c(TLRPC.TL_chatInviteExported tL_chatInviteExported, long j10) {
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
                tL_messages_getChatInviteImporters.peer = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).j1(-j10);
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                tL_messages_getChatInviteImporters.limit = Math.min(tL_chatInviteExported.usage, 3);
                this.E = true;
                ConnectionsManager.getInstance(org.telegram.messenger.h10.f22829t0).sendRequest(tL_messages_getChatInviteImporters, new org.telegram.ui.ActionBar.h6(20, this, tL_chatInviteExported));
            }
        }
    }

    public final void d(int i3, ArrayList arrayList, boolean z10) {
        this.f36064x = i3;
        ci.l1 l1Var = this.f36063w;
        if (i3 == 0) {
            l1Var.setVisibility(8);
            setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(18.0f));
        } else {
            l1Var.setVisibility(0);
            setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(10.0f));
            ((TextView) l1Var.f5431b).setText(org.telegram.messenger.bd.G(i3, "PeopleJoined", new Object[0]));
            l1Var.requestLayout();
        }
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).X3((TLRPC.User) arrayList.get(i10), false, false);
            }
            int min = Math.min(3, Math.min(i3, arrayList.size()));
            ((k70) l1Var.f5432c).setCount(min);
            for (int i11 = 0; i11 < min; i11++) {
                ((k70) l1Var.f5432c).b(i11, org.telegram.messenger.h10.f22829t0, (TLObject) arrayList.get(i11));
            }
        } else {
            ((k70) l1Var.f5432c).setCount(0);
        }
        ((k70) l1Var.f5432c).a(z10);
    }

    public void e(SpannableStringBuilder spannableStringBuilder) {
        ac Q = fc.a0(this.f36057c).Q(2131624028, 36, spannableStringBuilder);
        Q.f31800r = false;
        Q.k(true);
    }

    public final void f() {
        boolean z10 = this.L;
        ImageView imageView = this.d;
        TextView textView = this.f36055a;
        FrameLayout frameLayout = this.f36060n;
        TextView textView2 = this.h;
        TextView textView3 = this.f36059f;
        TextView textView4 = this.f36058e;
        ci.l1 l1Var = this.f36063w;
        if (z10) {
            org.telegram.ui.ActionBar.r6.b0(textView4);
            org.telegram.ui.ActionBar.r6.b0(textView3);
            org.telegram.ui.ActionBar.r6.b0(textView2);
            org.telegram.ui.ActionBar.r6.b0(frameLayout);
            org.telegram.ui.ActionBar.r6.b0(textView);
            org.telegram.ui.ActionBar.r6.b0(imageView);
            org.telegram.ui.ActionBar.r6.b0((TextView) l1Var.f5431b);
            org.telegram.ui.ActionBar.r6.b0(l1Var);
            j70 j70Var = this.F;
            if (j70Var != null) {
                j70Var.updateColors();
                return;
            }
            return;
        }
        this.L = true;
        int i3 = org.telegram.ui.ActionBar.k6.Gi;
        org.telegram.ui.ActionBar.r6.V(textView4, i3, null);
        org.telegram.ui.ActionBar.r6.V(textView3, i3, null);
        org.telegram.ui.ActionBar.r6.V(textView2, i3, null);
        int L = org.telegram.messenger.g0.L(21.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.k6.Ei;
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        org.telegram.ui.ActionBar.r6.R(textView4, org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x02, x03, x03), org.telegram.ui.ActionBar.r6.N(i10), org.telegram.ui.ActionBar.r6.N(i11), null);
        int L2 = org.telegram.messenger.g0.L(21.0f);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        org.telegram.ui.ActionBar.r6.R(textView3, org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, x04, x05, x05), org.telegram.ui.ActionBar.r6.N(i10), org.telegram.ui.ActionBar.r6.N(i11), null);
        int L3 = org.telegram.messenger.g0.L(21.0f);
        int i12 = org.telegram.ui.ActionBar.k6.f28011ka;
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.k6.f27878d6;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i13, false), 120);
        org.telegram.ui.ActionBar.r6.R(textView2, org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, x06, o10, o10), org.telegram.ui.ActionBar.r6.N(i12), org.telegram.ui.ActionBar.r6.h(i13, 120), null);
        int L4 = org.telegram.messenger.g0.L(21.0f);
        int i14 = org.telegram.ui.ActionBar.k6.f27899e7;
        int x07 = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        int i15 = org.telegram.ui.ActionBar.k6.f27972i6;
        int o11 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i15, false), 76);
        org.telegram.ui.ActionBar.r6.R(frameLayout, org.telegram.ui.ActionBar.k6.k0(L4, L4, L4, L4, x07, o11, o11), org.telegram.ui.ActionBar.r6.N(i14), org.telegram.ui.ActionBar.r6.h(i15, 76), null);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.r5, null, PorterDuff.Mode.SRC_ATOP);
        int i16 = org.telegram.ui.ActionBar.k6.f28062n6;
        org.telegram.ui.ActionBar.r6.V((TextView) l1Var.f5431b, i16, null);
        int L5 = org.telegram.messenger.g0.L(6.0f);
        int o12 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i16, false), 76);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L5, L5, L5, L5, 0, o12, o12);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i16, 76);
        l1Var.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(l1Var, k02, null, h, null);
        j70 j70Var2 = this.F;
        if (j70Var2 != null) {
            j70Var2.updateColors();
        }
    }

    public void setCanEdit(boolean z10) {
        this.H = z10;
    }

    public void setDelegate(l70 l70Var) {
        this.f36061r = l70Var;
    }

    public void setLink(String str) {
        this.f36056b = str;
        TextView textView = this.f36055a;
        if (str == null) {
            textView.setText(org.telegram.messenger.bd.M0(2131748787, null));
        } else if (str.startsWith("https://")) {
            textView.setText(str.substring(8));
        } else {
            textView.setText(str);
        }
    }

    public void setPermanent(boolean z10) {
        this.f36065y = z10;
    }

    public void setQrText(String str) {
        this.K = str;
    }

    public void setRevoke(boolean z10) {
        TextView textView = this.h;
        TextView textView2 = this.f36058e;
        TextView textView3 = this.f36059f;
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
