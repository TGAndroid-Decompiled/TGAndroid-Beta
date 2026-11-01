package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
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
public class j80 extends LinearLayout {
    public boolean D;
    public g80 E;
    public boolean F;
    public boolean G;
    public final boolean H;
    public final float[] I;
    public String J;
    public boolean K;
    public String L;
    public final TextView f27301a;
    public String f27302b;
    public final org.telegram.ui.ActionBar.k2 f27303c;
    public final ImageView d;
    public final TextView e;
    public final TextView f27304f;
    public final TextView h;
    public final FrameLayout f27305n;
    public i80 f27306r;
    public org.telegram.ui.ActionBar.k1 f27307s;
    public final jg.a3 f27308w;
    public int f27309x;
    public boolean f27310y;

    public j80(Context context, final org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.z2 z2Var, boolean z10, boolean z11) {
        super(context);
        this.G = true;
        this.I = new float[2];
        this.f27303c = k2Var;
        this.f27310y = z10;
        this.H = z11;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27305n = frameLayout;
        TextView textView = new TextView(context);
        this.f27301a = textView;
        textView.setPadding(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(13.0f));
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setSingleLine(true);
        frameLayout.addView(textView);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageDrawable(context.getDrawable(2131231245));
        imageView.setContentDescription(org.telegram.messenger.dd.L0(2131754839, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, w7.b6.e(40, 48, 21));
        addView(frameLayout, w7.b6.t(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        w7.e6.b(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new dq(0, context.getDrawable(2131232103)), 0, 1, 0);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.t2(org.telegram.messenger.i0.L(6.0f)), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(2131748936, null));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(org.telegram.messenger.dd.L0(2131748936, null));
        textView2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setSingleLine(true);
        TextView f7 = org.telegram.messenger.a30.f(linearLayout, textView2, w7.b6.q(0, 42, 1.0f, 0, 4, 0, 4, 0), context);
        this.f27304f = f7;
        w7.e6.b(f7, 0.025f, 1.2f);
        f7.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new dq(0, context.getDrawable(2131232363)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.t2(org.telegram.messenger.i0.L(6.0f)), 1, 2, 0);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.dd.L0(2131748935, null));
        f7.setText(spannableStringBuilder2);
        f7.setContentDescription(org.telegram.messenger.dd.L0(2131748935, null));
        f7.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        f7.setTextSize(1, 14.0f);
        f7.setTypeface(org.telegram.messenger.i0.o());
        f7.setSingleLine(true);
        TextView f10 = org.telegram.messenger.a30.f(linearLayout, f7, w7.b6.m(1.0f, 0, 42, 4, 4, 0), context);
        this.h = f10;
        w7.e6.b(f10, 0.025f, 1.2f);
        f10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new dq(0, context.getDrawable(2131232109)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.t2(org.telegram.messenger.i0.L(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) org.telegram.messenger.dd.L0(2131751535, null));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new org.telegram.ui.Cells.t2(org.telegram.messenger.i0.L(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        f10.setText(spannableStringBuilder3);
        f10.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        f10.setTextSize(1, 14.0f);
        f10.setTypeface(org.telegram.messenger.i0.o());
        f10.setSingleLine(true);
        linearLayout.addView(f10, w7.b6.m(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        f10.setVisibility(8);
        addView(linearLayout, w7.b6.k(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        jg.a3 a3Var = new jg.a3(this, context);
        this.f27308w = a3Var;
        ((h80) a3Var.d).setAvatarsTextSize(org.telegram.messenger.i0.L(18.0f));
        addView(a3Var, w7.b6.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new ag.i(this, z2Var, k2Var, 17));
        if (z10) {
            a3Var.setOnClickListener(new c80(this, 0));
        }
        f7.setOnClickListener(new View.OnClickListener(this) {
            public final j80 f25438b;

            {
                this.f25438b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10 = r3;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        j80 j80Var = this.f25438b;
                        try {
                            if (j80Var.f27302b != null) {
                                Context context2 = j80Var.getContext();
                                String str = j80Var.f27302b;
                                k2Var2.showDialog(new e80(j80Var, context2, str, str, k2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    default:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var2.getParentActivity());
                        String L0 = org.telegram.messenger.dd.L0(2131751535, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.dd.L0(2131751534, null);
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new b80(this.f25438b, 0));
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        k2Var2.showDialog(x1Var);
                        return;
                }
            }
        });
        f10.setOnClickListener(new View.OnClickListener(this) {
            public final j80 f25438b;

            {
                this.f25438b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10 = r3;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        j80 j80Var = this.f25438b;
                        try {
                            if (j80Var.f27302b != null) {
                                Context context2 = j80Var.getContext();
                                String str = j80Var.f27302b;
                                k2Var2.showDialog(new e80(j80Var, context2, str, str, k2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    default:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var2.getParentActivity());
                        String L0 = org.telegram.messenger.dd.L0(2131751535, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.dd.L0(2131751534, null);
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new b80(this.f25438b, 0));
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        k2Var2.showDialog(x1Var);
                        return;
                }
            }
        });
        imageView.setOnClickListener(new org.telegram.messenger.video.h((KeyEvent.Callback) this, context, (KeyEvent.Callback) z2Var, (Object) k2Var, 9));
        frameLayout.setOnClickListener(new androidx.mediarouter.app.w(this, 12));
        f();
    }

    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f7 = 0.0f;
        float f10 = 0.0f;
        FrameLayout frameLayout3 = frameLayout;
        while (frameLayout3 != frameLayout2) {
            float y3 = frameLayout3.getY() + f7;
            f10 += frameLayout3.getX();
            if (frameLayout3 instanceof ScrollView) {
                y3 -= frameLayout3.getScrollY();
            }
            f7 = y3;
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
        fArr[0] = f10 - frameLayout2.getPaddingLeft();
        fArr[1] = f7 - frameLayout2.getPaddingTop();
    }

    public final void b(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            ImageView imageView = this.d;
            imageView.setVisibility(0);
            imageView.setImageDrawable(imageView.getContext().getDrawable(2131231245));
        }
    }

    public final void c(TLRPC.TL_chatInviteExported tL_chatInviteExported, long j10) {
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
                tL_messages_getChatInviteImporters.peer = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).i1(-j10);
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                tL_messages_getChatInviteImporters.limit = Math.min(tL_chatInviteExported.usage, 3);
                this.D = true;
                ConnectionsManager.getInstance(org.telegram.messenger.e20.f15506s0).sendRequest(tL_messages_getChatInviteImporters, new t20(1, this, tL_chatInviteExported));
            }
        }
    }

    public final void d(int i10, ArrayList arrayList, boolean z10) {
        this.f27309x = i10;
        jg.a3 a3Var = this.f27308w;
        if (i10 == 0) {
            a3Var.setVisibility(8);
            setPadding(org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(18.0f));
        } else {
            a3Var.setVisibility(0);
            setPadding(org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(10.0f));
            ((TextView) a3Var.f9892c).setText(org.telegram.messenger.dd.G(i10, "PeopleJoined", new Object[0]));
            a3Var.requestLayout();
        }
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).U3((TLRPC.User) arrayList.get(i11), false, false);
            }
            int min = Math.min(3, Math.min(i10, arrayList.size()));
            ((h80) a3Var.d).setCount(min);
            for (int i12 = 0; i12 < min; i12++) {
                ((h80) a3Var.d).b(i12, org.telegram.messenger.e20.f15506s0, (TLObject) arrayList.get(i12));
            }
        } else {
            ((h80) a3Var.d).setCount(0);
        }
        ((h80) a3Var.d).a(z10);
    }

    public void e(SpannableStringBuilder spannableStringBuilder) {
        wb Q = cc.a0(this.f27303c).Q(2131624027, 36, spannableStringBuilder);
        Q.f32209r = false;
        Q.k(true);
    }

    public final void f() {
        boolean z10 = this.K;
        ImageView imageView = this.d;
        TextView textView = this.f27301a;
        FrameLayout frameLayout = this.f27305n;
        TextView textView2 = this.h;
        TextView textView3 = this.f27304f;
        TextView textView4 = this.e;
        jg.a3 a3Var = this.f27308w;
        if (z10) {
            org.telegram.ui.ActionBar.a7.b0(textView4);
            org.telegram.ui.ActionBar.a7.b0(textView3);
            org.telegram.ui.ActionBar.a7.b0(textView2);
            org.telegram.ui.ActionBar.a7.b0(frameLayout);
            org.telegram.ui.ActionBar.a7.b0(textView);
            org.telegram.ui.ActionBar.a7.b0(imageView);
            org.telegram.ui.ActionBar.a7.b0((TextView) a3Var.f9892c);
            org.telegram.ui.ActionBar.a7.b0(a3Var);
            g80 g80Var = this.E;
            if (g80Var != null) {
                g80Var.updateColors();
                return;
            }
            return;
        }
        this.K = true;
        int i10 = org.telegram.ui.ActionBar.t6.Gi;
        org.telegram.ui.ActionBar.a7.V(textView4, i10, null);
        org.telegram.ui.ActionBar.a7.V(textView3, i10, null);
        org.telegram.ui.ActionBar.a7.V(textView2, i10, null);
        int L = org.telegram.messenger.i0.L(21.0f);
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.t6.Ei;
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, i12, false);
        org.telegram.ui.ActionBar.a7.R(textView4, org.telegram.ui.ActionBar.t6.k0(L, L, L, L, x02, x03, x03), org.telegram.ui.ActionBar.a7.N(i11), org.telegram.ui.ActionBar.a7.N(i12), null);
        int L2 = org.telegram.messenger.i0.L(21.0f);
        int x04 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        int x05 = org.telegram.ui.ActionBar.t6.x0(null, i12, false);
        org.telegram.ui.ActionBar.a7.R(textView3, org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, x04, x05, x05), org.telegram.ui.ActionBar.a7.N(i11), org.telegram.ui.ActionBar.a7.N(i12), null);
        int L3 = org.telegram.messenger.i0.L(21.0f);
        int i13 = org.telegram.ui.ActionBar.t6.f21063ka;
        int x06 = org.telegram.ui.ActionBar.t6.x0(null, i13, false);
        int i14 = org.telegram.ui.ActionBar.t6.f20930d6;
        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i14, false), 120);
        org.telegram.ui.ActionBar.a7.R(textView2, org.telegram.ui.ActionBar.t6.k0(L3, L3, L3, L3, x06, o10, o10), org.telegram.ui.ActionBar.a7.N(i13), org.telegram.ui.ActionBar.a7.h(i14, 120), null);
        int L4 = org.telegram.messenger.i0.L(21.0f);
        int i15 = org.telegram.ui.ActionBar.t6.e7;
        int x07 = org.telegram.ui.ActionBar.t6.x0(null, i15, false);
        int i16 = org.telegram.ui.ActionBar.t6.f21021i6;
        int o11 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i16, false), 76);
        org.telegram.ui.ActionBar.a7.R(frameLayout, org.telegram.ui.ActionBar.t6.k0(L4, L4, L4, L4, x07, o11, o11), org.telegram.ui.ActionBar.a7.N(i15), org.telegram.ui.ActionBar.a7.h(i16, 76), null);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.f21186r5, null, PorterDuff.Mode.SRC_ATOP);
        int i17 = org.telegram.ui.ActionBar.t6.f21116n6;
        org.telegram.ui.ActionBar.a7.V((TextView) a3Var.f9892c, i17, null);
        int L5 = org.telegram.messenger.i0.L(6.0f);
        int o12 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i17, false), 76);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L5, L5, L5, L5, 0, o12, o12);
        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i17, 76);
        a3Var.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(a3Var, k02, null, h, null);
        g80 g80Var2 = this.E;
        if (g80Var2 != null) {
            g80Var2.updateColors();
        }
    }

    public void setCanEdit(boolean z10) {
        this.G = z10;
    }

    public void setDelegate(i80 i80Var) {
        this.f27306r = i80Var;
    }

    public void setLink(String str) {
        this.f27302b = str;
        TextView textView = this.f27301a;
        if (str == null) {
            textView.setText(org.telegram.messenger.dd.L0(2131748789, null));
        } else if (str.startsWith("https://")) {
            textView.setText(str.substring(8));
        } else {
            textView.setText(str);
        }
    }

    public void setPermanent(boolean z10) {
        this.f27310y = z10;
    }

    public void setQrText(String str) {
        this.J = str;
    }

    public void setRevoke(boolean z10) {
        TextView textView = this.h;
        TextView textView2 = this.e;
        TextView textView3 = this.f27304f;
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
