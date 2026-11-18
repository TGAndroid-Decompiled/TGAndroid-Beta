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
public class e80 extends LinearLayout {
    public boolean E;
    public b80 F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public final float[] J;
    public String K;
    public boolean L;
    public String M;
    public final TextView f34639a;
    public String f34640b;
    public final org.telegram.ui.ActionBar.h2 f34641c;
    public final ImageView d;
    public final TextView f34642e;
    public final TextView f34643f;
    public final TextView h;
    public final FrameLayout f34644n;
    public d80 f34645r;
    public org.telegram.ui.ActionBar.h1 f34646s;
    public final di.d1 f34647w;
    public int f34648x;
    public boolean f34649y;

    public e80(Context context, final org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.x2 x2Var, boolean z10, boolean z11) {
        super(context);
        this.H = true;
        this.J = new float[2];
        this.f34641c = h2Var;
        this.f34649y = z10;
        this.I = z11;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34644n = frameLayout;
        TextView textView = new TextView(context);
        this.f34639a = textView;
        textView.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(13.0f));
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setSingleLine(true);
        frameLayout.addView(textView);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageDrawable(context.getDrawable(2131231244));
        imageView.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, c8.ma.e(40, 48, 21));
        addView(frameLayout, c8.ma.t(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.f34642e = textView2;
        c8.ra.b(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new lq(0, context.getDrawable(2131232106)), 0, 1, 0);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.s2(org.telegram.messenger.g0.L(6.0f)), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(2131748734, null));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(org.telegram.messenger.gd.M0(2131748734, null));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setSingleLine(true);
        TextView f10 = org.telegram.messenger.n10.f(linearLayout, textView2, c8.ma.q(0, 42, 1.0f, 0, 4, 0, 4, 0), context);
        this.f34643f = f10;
        c8.ra.b(f10, 0.025f, 1.2f);
        f10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new lq(0, context.getDrawable(2131232366)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.s2(org.telegram.messenger.g0.L(6.0f)), 1, 2, 0);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.gd.M0(2131748733, null));
        f10.setText(spannableStringBuilder2);
        f10.setContentDescription(org.telegram.messenger.gd.M0(2131748733, null));
        f10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        f10.setTextSize(1, 14.0f);
        f10.setTypeface(org.telegram.messenger.g0.o());
        f10.setSingleLine(true);
        TextView f11 = org.telegram.messenger.n10.f(linearLayout, f10, c8.ma.m(1.0f, 0, 42, 4, 4, 0), context);
        this.h = f11;
        c8.ra.b(f11, 0.025f, 1.2f);
        f11.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new lq(0, context.getDrawable(2131232112)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.s2(org.telegram.messenger.g0.L(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) org.telegram.messenger.gd.M0(2131751523, null));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new org.telegram.ui.Cells.s2(org.telegram.messenger.g0.L(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        f11.setText(spannableStringBuilder3);
        f11.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        f11.setTextSize(1, 14.0f);
        f11.setTypeface(org.telegram.messenger.g0.o());
        f11.setSingleLine(true);
        linearLayout.addView(f11, c8.ma.m(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        f11.setVisibility(8);
        addView(linearLayout, c8.ma.k(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        di.d1 d1Var = new di.d1(this, context);
        this.f34647w = d1Var;
        ((c80) d1Var.f8643c).setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        addView(d1Var, c8.ma.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new qt(this, x2Var, h2Var, 2));
        if (z10) {
            d1Var.setOnClickListener(new x70(this, 0));
        }
        f10.setOnClickListener(new View.OnClickListener(this) {
            public final e80 f42388b;

            {
                this.f42388b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r3;
                org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
                switch (i7) {
                    case 0:
                        e80 e80Var = this.f42388b;
                        try {
                            if (e80Var.f34640b != null) {
                                Context context2 = e80Var.getContext();
                                String str = e80Var.f34640b;
                                h2Var2.showDialog(new z70(e80Var, context2, str, str, h2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    default:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h2Var2.getParentActivity());
                        String M0 = org.telegram.messenger.gd.M0(2131751523, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                        u1Var.S = M0;
                        u1Var.U = org.telegram.messenger.gd.M0(2131751522, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new w70(this.f42388b, 0));
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        h2Var2.showDialog(u1Var);
                        return;
                }
            }
        });
        f11.setOnClickListener(new View.OnClickListener(this) {
            public final e80 f42388b;

            {
                this.f42388b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r3;
                org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
                switch (i7) {
                    case 0:
                        e80 e80Var = this.f42388b;
                        try {
                            if (e80Var.f34640b != null) {
                                Context context2 = e80Var.getContext();
                                String str = e80Var.f34640b;
                                h2Var2.showDialog(new z70(e80Var, context2, str, str, h2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    default:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h2Var2.getParentActivity());
                        String M0 = org.telegram.messenger.gd.M0(2131751523, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                        u1Var.S = M0;
                        u1Var.U = org.telegram.messenger.gd.M0(2131751522, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new w70(this.f42388b, 0));
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        h2Var2.showDialog(u1Var);
                        return;
                }
            }
        });
        imageView.setOnClickListener(new bi.m6(this, context, x2Var, h2Var, 14));
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
                tL_messages_getChatInviteImporters.peer = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).l1(-j3);
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                tL_messages_getChatInviteImporters.limit = Math.min(tL_chatInviteExported.usage, 3);
                this.E = true;
                ConnectionsManager.getInstance(org.telegram.messenger.j10.f24770t0).sendRequest(tL_messages_getChatInviteImporters, new org.telegram.ui.u7(19, this, tL_chatInviteExported));
            }
        }
    }

    public final void d(int i7, ArrayList arrayList, boolean z10) {
        this.f34648x = i7;
        di.d1 d1Var = this.f34647w;
        if (i7 == 0) {
            d1Var.setVisibility(8);
            setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(18.0f));
        } else {
            d1Var.setVisibility(0);
            setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(10.0f));
            ((TextView) d1Var.f8642b).setText(org.telegram.messenger.gd.G(i7, "PeopleJoined", new Object[0]));
            d1Var.requestLayout();
        }
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).e4((TLRPC.User) arrayList.get(i10), false, false);
            }
            int min = Math.min(3, Math.min(i7, arrayList.size()));
            ((c80) d1Var.f8643c).setCount(min);
            for (int i11 = 0; i11 < min; i11++) {
                ((c80) d1Var.f8643c).b(i11, org.telegram.messenger.j10.f24770t0, (TLObject) arrayList.get(i11));
            }
        } else {
            ((c80) d1Var.f8643c).setCount(0);
        }
        ((c80) d1Var.f8643c).a(z10);
    }

    public void e(SpannableStringBuilder spannableStringBuilder) {
        gc Q = lc.b0(this.f34641c).Q(2131624029, 36, spannableStringBuilder);
        Q.f35469r = false;
        Q.k(true);
    }

    public final void f() {
        boolean z10 = this.L;
        ImageView imageView = this.d;
        TextView textView = this.f34639a;
        FrameLayout frameLayout = this.f34644n;
        TextView textView2 = this.h;
        TextView textView3 = this.f34643f;
        TextView textView4 = this.f34642e;
        di.d1 d1Var = this.f34647w;
        if (z10) {
            org.telegram.ui.ActionBar.u6.a0(textView4);
            org.telegram.ui.ActionBar.u6.a0(textView3);
            org.telegram.ui.ActionBar.u6.a0(textView2);
            org.telegram.ui.ActionBar.u6.a0(frameLayout);
            org.telegram.ui.ActionBar.u6.a0(textView);
            org.telegram.ui.ActionBar.u6.a0(imageView);
            org.telegram.ui.ActionBar.u6.a0((TextView) d1Var.f8642b);
            org.telegram.ui.ActionBar.u6.a0(d1Var);
            b80 b80Var = this.F;
            if (b80Var != null) {
                b80Var.updateColors();
                return;
            }
            return;
        }
        this.L = true;
        int i7 = org.telegram.ui.ActionBar.n6.Ji;
        org.telegram.ui.ActionBar.u6.U(textView4, i7, null);
        org.telegram.ui.ActionBar.u6.U(textView3, i7, null);
        org.telegram.ui.ActionBar.u6.U(textView2, i7, null);
        int L = org.telegram.messenger.g0.L(21.0f);
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.n6.Hi;
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, i11, false);
        org.telegram.ui.ActionBar.u6.Q(textView4, org.telegram.ui.ActionBar.n6.k0(L, L, L, L, x02, x03, x03), org.telegram.ui.ActionBar.u6.M(i10), org.telegram.ui.ActionBar.u6.M(i11), null);
        int L2 = org.telegram.messenger.g0.L(21.0f);
        int x04 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        int x05 = org.telegram.ui.ActionBar.n6.x0(null, i11, false);
        org.telegram.ui.ActionBar.u6.Q(textView3, org.telegram.ui.ActionBar.n6.k0(L2, L2, L2, L2, x04, x05, x05), org.telegram.ui.ActionBar.u6.M(i10), org.telegram.ui.ActionBar.u6.M(i11), null);
        int L3 = org.telegram.messenger.g0.L(21.0f);
        int i12 = org.telegram.ui.ActionBar.n6.f29527ka;
        int x06 = org.telegram.ui.ActionBar.n6.x0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.n6.f29394d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i13, false), 120);
        org.telegram.ui.ActionBar.u6.Q(textView2, org.telegram.ui.ActionBar.n6.k0(L3, L3, L3, L3, x06, o4, o4), org.telegram.ui.ActionBar.u6.M(i12), org.telegram.ui.ActionBar.u6.g(i13, 120), null);
        int L4 = org.telegram.messenger.g0.L(21.0f);
        int i14 = org.telegram.ui.ActionBar.n6.f29414e7;
        int x07 = org.telegram.ui.ActionBar.n6.x0(null, i14, false);
        int i15 = org.telegram.ui.ActionBar.n6.f29486i6;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i15, false), 76);
        org.telegram.ui.ActionBar.u6.Q(frameLayout, org.telegram.ui.ActionBar.n6.k0(L4, L4, L4, L4, x07, o10, o10), org.telegram.ui.ActionBar.u6.M(i14), org.telegram.ui.ActionBar.u6.g(i15, 76), null);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.f29652r5, null, PorterDuff.Mode.SRC_ATOP);
        int i16 = org.telegram.ui.ActionBar.n6.f29576n6;
        org.telegram.ui.ActionBar.u6.U((TextView) d1Var.f8642b, i16, null);
        int L5 = org.telegram.messenger.g0.L(6.0f);
        int o11 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i16, false), 76);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L5, L5, L5, L5, 0, o11, o11);
        org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i16, 76);
        d1Var.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(d1Var, k02, null, g10, null);
        b80 b80Var2 = this.F;
        if (b80Var2 != null) {
            b80Var2.updateColors();
        }
    }

    public void setCanEdit(boolean z10) {
        this.H = z10;
    }

    public void setDelegate(d80 d80Var) {
        this.f34645r = d80Var;
    }

    public void setLink(String str) {
        this.f34640b = str;
        TextView textView = this.f34639a;
        if (str == null) {
            textView.setText(org.telegram.messenger.gd.M0(2131748587, null));
        } else if (str.startsWith("https://")) {
            textView.setText(str.substring(8));
        } else {
            textView.setText(str);
        }
    }

    public void setPermanent(boolean z10) {
        this.f34649y = z10;
    }

    public void setQrText(String str) {
        this.K = str;
    }

    public void setRevoke(boolean z10) {
        TextView textView = this.h;
        TextView textView2 = this.f34642e;
        TextView textView3 = this.f34643f;
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
