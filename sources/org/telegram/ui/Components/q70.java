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
public class q70 extends LinearLayout {
    public boolean D;
    public n70 E;
    public boolean F;
    public boolean G;
    public final boolean H;
    public final float[] I;
    public String J;
    public boolean K;
    public String L;
    public final TextView f37208a;
    public String f37209b;
    public final org.telegram.ui.ActionBar.f2 f37210c;
    public final ImageView d;
    public final TextView f37211e;
    public final TextView f37212f;
    public final TextView h;
    public final FrameLayout f37213n;
    public p70 f37214r;
    public org.telegram.ui.ActionBar.g1 f37215s;
    public final bi.s1 f37216w;
    public int f37217x;
    public boolean f37218y;

    public q70(Context context, final org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.v2 v2Var, boolean z9, boolean z10) {
        super(context);
        this.G = true;
        this.I = new float[2];
        this.f37210c = f2Var;
        this.f37218y = z9;
        this.H = z10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37213n = frameLayout;
        TextView textView = new TextView(context);
        this.f37208a = textView;
        textView.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(13.0f));
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setSingleLine(true);
        frameLayout.addView(textView);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageDrawable(context.getDrawable(2131231244));
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, c8.ha.e(40, 48, 21));
        addView(frameLayout, c8.ha.t(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.f37211e = textView2;
        c8.ka.b(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new wp(0, context.getDrawable(2131232104)), 0, 1, 0);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(6.0f)), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131748927, null));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(org.telegram.messenger.id.M0(2131748927, null));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setSingleLine(true);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView2, c8.ha.q(0, 42, 1.0f, 0, 4, 0, 4, 0), context);
        this.f37212f = f10;
        c8.ka.b(f10, 0.025f, 1.2f);
        f10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new wp(0, context.getDrawable(2131232364)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(6.0f)), 1, 2, 0);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.M0(2131748926, null));
        f10.setText(spannableStringBuilder2);
        f10.setContentDescription(org.telegram.messenger.id.M0(2131748926, null));
        f10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        f10.setTextSize(1, 14.0f);
        f10.setTypeface(org.telegram.messenger.g0.o());
        f10.setSingleLine(true);
        TextView f11 = org.telegram.messenger.camera.q.f(linearLayout, f10, c8.ha.m(1.0f, 0, 42, 4, 4, 0), context);
        this.h = f11;
        c8.ka.b(f11, 0.025f, 1.2f);
        f11.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new wp(0, context.getDrawable(2131232110)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) org.telegram.messenger.id.M0(2131751535, null));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        f11.setText(spannableStringBuilder3);
        f11.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        f11.setTextSize(1, 14.0f);
        f11.setTypeface(org.telegram.messenger.g0.o());
        f11.setSingleLine(true);
        linearLayout.addView(f11, c8.ha.m(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        f11.setVisibility(8);
        addView(linearLayout, c8.ha.k(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        bi.s1 s1Var = new bi.s1(this, context);
        this.f37216w = s1Var;
        ((o70) s1Var.f4663c).setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        addView(s1Var, c8.ha.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new ah.g(this, v2Var, f2Var, 27));
        if (z9) {
            s1Var.setOnClickListener(new j70(this, 0));
        }
        f10.setOnClickListener(new View.OnClickListener(this) {
            public final q70 f35245b;

            {
                this.f35245b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r3;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        q70 q70Var = this.f35245b;
                        try {
                            if (q70Var.f37209b != null) {
                                Context context2 = q70Var.getContext();
                                String str = q70Var.f37209b;
                                f2Var2.showDialog(new l70(q70Var, context2, str, str, f2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    default:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var2.getParentActivity());
                        String M0 = org.telegram.messenger.id.M0(2131751535, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131751534, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751599, null), new i70(this.f35245b, 0));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        f2Var2.showDialog(u1Var);
                        return;
                }
            }
        });
        f11.setOnClickListener(new View.OnClickListener(this) {
            public final q70 f35245b;

            {
                this.f35245b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r3;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        q70 q70Var = this.f35245b;
                        try {
                            if (q70Var.f37209b != null) {
                                Context context2 = q70Var.getContext();
                                String str = q70Var.f37209b;
                                f2Var2.showDialog(new l70(q70Var, context2, str, str, f2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    default:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var2.getParentActivity());
                        String M0 = org.telegram.messenger.id.M0(2131751535, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131751534, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751599, null), new i70(this.f35245b, 0));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        f2Var2.showDialog(u1Var);
                        return;
                }
            }
        });
        imageView.setOnClickListener(new di.u3(this, context, v2Var, f2Var, 13));
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
            boolean z9 = r32 instanceof ViewGroup;
            frameLayout3 = r32;
            if (!z9) {
                return;
            }
        }
        fArr[0] = f11 - frameLayout2.getPaddingLeft();
        fArr[1] = f10 - frameLayout2.getPaddingTop();
    }

    public final void b(boolean z9) {
        if (this.F != z9) {
            this.F = z9;
            ImageView imageView = this.d;
            imageView.setVisibility(0);
            imageView.setImageDrawable(imageView.getContext().getDrawable(2131231244));
        }
    }

    public final void c(TLRPC.TL_chatInviteExported tL_chatInviteExported, long j3) {
        if (tL_chatInviteExported == null) {
            d(0, null, false);
        } else if (!TextUtils.equals(this.L, tL_chatInviteExported.link)) {
            d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, false);
            if (tL_chatInviteExported.usage > 0 && tL_chatInviteExported.importers == null && !this.D) {
                TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
                String str = tL_chatInviteExported.link;
                if (str != null) {
                    tL_messages_getChatInviteImporters.flags |= 2;
                    tL_messages_getChatInviteImporters.link = str;
                }
                tL_messages_getChatInviteImporters.peer = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).j1(-j3);
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                tL_messages_getChatInviteImporters.limit = Math.min(tL_chatInviteExported.usage, 3);
                this.D = true;
                ConnectionsManager.getInstance(org.telegram.messenger.p10.f24470s0).sendRequest(tL_messages_getChatInviteImporters, new org.telegram.ui.ld(17, this, tL_chatInviteExported));
            }
        }
    }

    public final void d(int i7, ArrayList arrayList, boolean z9) {
        this.f37217x = i7;
        bi.s1 s1Var = this.f37216w;
        if (i7 == 0) {
            s1Var.setVisibility(8);
            setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(18.0f));
        } else {
            s1Var.setVisibility(0);
            setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(10.0f));
            ((TextView) s1Var.f4662b).setText(org.telegram.messenger.id.G(i7, "PeopleJoined", new Object[0]));
            s1Var.requestLayout();
        }
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).X3((TLRPC.User) arrayList.get(i10), false, false);
            }
            int min = Math.min(3, Math.min(i7, arrayList.size()));
            ((o70) s1Var.f4663c).setCount(min);
            for (int i11 = 0; i11 < min; i11++) {
                ((o70) s1Var.f4663c).b(i11, org.telegram.messenger.p10.f24470s0, (TLObject) arrayList.get(i11));
            }
        } else {
            ((o70) s1Var.f4663c).setCount(0);
        }
        ((o70) s1Var.f4663c).a(z9);
    }

    public void e(SpannableStringBuilder spannableStringBuilder) {
        cc Q = hc.a0(this.f37210c).Q(2131624028, 36, spannableStringBuilder);
        Q.f32553r = false;
        Q.k(true);
    }

    public final void f() {
        boolean z9 = this.K;
        ImageView imageView = this.d;
        TextView textView = this.f37208a;
        FrameLayout frameLayout = this.f37213n;
        TextView textView2 = this.h;
        TextView textView3 = this.f37212f;
        TextView textView4 = this.f37211e;
        bi.s1 s1Var = this.f37216w;
        if (z9) {
            org.telegram.ui.ActionBar.r6.b0(textView4);
            org.telegram.ui.ActionBar.r6.b0(textView3);
            org.telegram.ui.ActionBar.r6.b0(textView2);
            org.telegram.ui.ActionBar.r6.b0(frameLayout);
            org.telegram.ui.ActionBar.r6.b0(textView);
            org.telegram.ui.ActionBar.r6.b0(imageView);
            org.telegram.ui.ActionBar.r6.b0((TextView) s1Var.f4662b);
            org.telegram.ui.ActionBar.r6.b0(s1Var);
            n70 n70Var = this.E;
            if (n70Var != null) {
                n70Var.updateColors();
                return;
            }
            return;
        }
        this.K = true;
        int i7 = org.telegram.ui.ActionBar.k6.Gi;
        org.telegram.ui.ActionBar.r6.V(textView4, i7, null);
        org.telegram.ui.ActionBar.r6.V(textView3, i7, null);
        org.telegram.ui.ActionBar.r6.V(textView2, i7, null);
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
        int i12 = org.telegram.ui.ActionBar.k6.f27985ka;
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.k6.f27852d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i13, false), 120);
        org.telegram.ui.ActionBar.r6.R(textView2, org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, x06, o4, o4), org.telegram.ui.ActionBar.r6.N(i12), org.telegram.ui.ActionBar.r6.h(i13, 120), null);
        int L4 = org.telegram.messenger.g0.L(21.0f);
        int i14 = org.telegram.ui.ActionBar.k6.f27872e7;
        int x07 = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        int i15 = org.telegram.ui.ActionBar.k6.f27944i6;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i15, false), 76);
        org.telegram.ui.ActionBar.r6.R(frameLayout, org.telegram.ui.ActionBar.k6.k0(L4, L4, L4, L4, x07, o10, o10), org.telegram.ui.ActionBar.r6.N(i14), org.telegram.ui.ActionBar.r6.h(i15, 76), null);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28110r5, null, PorterDuff.Mode.SRC_ATOP);
        int i16 = org.telegram.ui.ActionBar.k6.f28034n6;
        org.telegram.ui.ActionBar.r6.V((TextView) s1Var.f4662b, i16, null);
        int L5 = org.telegram.messenger.g0.L(6.0f);
        int o11 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i16, false), 76);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L5, L5, L5, L5, 0, o11, o11);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i16, 76);
        s1Var.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(s1Var, k02, null, h, null);
        n70 n70Var2 = this.E;
        if (n70Var2 != null) {
            n70Var2.updateColors();
        }
    }

    public void setCanEdit(boolean z9) {
        this.G = z9;
    }

    public void setDelegate(p70 p70Var) {
        this.f37214r = p70Var;
    }

    public void setLink(String str) {
        this.f37209b = str;
        TextView textView = this.f37208a;
        if (str == null) {
            textView.setText(org.telegram.messenger.id.M0(2131748780, null));
        } else if (str.startsWith("https://")) {
            textView.setText(str.substring(8));
        } else {
            textView.setText(str);
        }
    }

    public void setPermanent(boolean z9) {
        this.f37218y = z9;
    }

    public void setQrText(String str) {
        this.J = str;
    }

    public void setRevoke(boolean z9) {
        TextView textView = this.h;
        TextView textView2 = this.f37211e;
        TextView textView3 = this.f37212f;
        ImageView imageView = this.d;
        if (z9) {
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
