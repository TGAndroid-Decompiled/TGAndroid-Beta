package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class g extends org.telegram.ui.ActionBar.e2 {
    public m90 E;
    public final int[] F;
    public int G;
    public boolean H;
    public org.telegram.ui.Components.fh0 f47237a;
    public GradientDrawable f47238b;
    public gi.j f47239c;
    public TextView d;
    public TextView f47240e;
    public TextView f47241f;
    public LinearLayout h;
    public final TextView[] f47242n;
    public TextView f47243r;
    public int[] f47244s;
    public final int f47245w;
    public boolean f47246x;
    public tr f47247y;

    public g(int i7) {
        super(null);
        this.f47242n = new TextView[6];
        this.F = new int[2];
        this.f47245w = i7;
    }

    @Override
    public final View createView(Context context) {
        float f10;
        float f11;
        int i7;
        float f12;
        int i10;
        String str;
        int i11;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = 3;
        if (kVar != null) {
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, kVar, null);
            this.actionBar.setBackButtonImage(2131231240);
            org.telegram.ui.ActionBar.q6.l(this.actionBar, 1, org.telegram.ui.ActionBar.j6.f29186v8, null);
            org.telegram.ui.ActionBar.q6.l(this.actionBar, 3, org.telegram.ui.ActionBar.j6.f29147t8, null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new bi.x4(this, 21));
        }
        e eVar = new e(0, context, this);
        this.fragmentView = eVar;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, eVar, null);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        int i13 = 2;
        viewGroup.setOnTouchListener(new gi.a(2));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            viewGroup.addView(kVar2);
        }
        ?? imageView = new ImageView(context);
        this.f47237a = imageView;
        viewGroup.addView(imageView);
        TextView textView = new TextView(context);
        this.f47240e = textView;
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i14, null);
        this.f47240e.setGravity(1);
        this.f47240e.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.f47240e.setTextSize(1, 24.0f);
        viewGroup.addView(this.f47240e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i15 = this.f47245w;
        if (i15 == 3) {
            i14 = org.telegram.ui.ActionBar.j6.Fi;
        }
        org.telegram.ui.ActionBar.q6.U(textView2, i14, null);
        this.d.setGravity(1);
        float f13 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f47241f = textView3;
        org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.D6, null);
        this.f47241f.setGravity(1);
        this.f47241f.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        this.f47241f.setTextSize(1, 15.0f);
        if (i15 == 6 || i15 == 3) {
            f10 = 24.0f;
            f11 = 2.0f;
            this.f47241f.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
        } else {
            f10 = 24.0f;
            f11 = 2.0f;
            this.f47241f.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        }
        viewGroup.addView(this.f47241f);
        int i16 = 5;
        if (i15 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            this.h.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
            LinearLayout linearLayout2 = this.h;
            if (org.telegram.messenger.hd.f24104a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            linearLayout2.setGravity(i7);
            viewGroup.addView(this.h);
            int i17 = 0;
            while (i17 < i12) {
                LinearLayout f14 = org.telegram.messenger.k5.f(context, 0);
                LinearLayout linearLayout3 = this.h;
                if (i17 != i13) {
                    f12 = 7.0f;
                } else {
                    f12 = 0.0f;
                }
                linearLayout3.addView(f14, c8.ja.k(0.0f, 0.0f, 0.0f, f12, -2, -2));
                int i18 = i17 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.f47242n;
                textViewArr[i18] = textView4;
                int i19 = org.telegram.ui.ActionBar.j6.G6;
                org.telegram.ui.ActionBar.q6.U(textView4, i19, null);
                TextView textView5 = textViewArr[i18];
                if (org.telegram.messenger.hd.f24104a0) {
                    i10 = i16;
                } else {
                    i10 = 3;
                }
                textView5.setGravity(i10);
                textViewArr[i18].setTextSize(1, f13);
                TextView textView6 = textViewArr[i18];
                if (org.telegram.messenger.hd.f24104a0) {
                    str = ".%d";
                } else {
                    str = "%d.";
                }
                int i20 = i17 + 1;
                textView6.setText(String.format(str, Integer.valueOf(i20)));
                textViewArr[i18].setTypeface(org.telegram.messenger.g0.o());
                int i21 = i18 + 1;
                TextView textView7 = new TextView(context);
                textViewArr[i21] = textView7;
                org.telegram.ui.ActionBar.q6.U(textView7, i19, null);
                TextView textView8 = textViewArr[i21];
                if (org.telegram.messenger.hd.f24104a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView8.setGravity(i11);
                textViewArr[i21].setTextSize(1, f13);
                if (i17 == 0) {
                    org.telegram.ui.ActionBar.q6.G(textViewArr[i21], org.telegram.ui.ActionBar.j6.J6, null);
                    org.telegram.ui.ActionBar.q6.C(textViewArr[i21], org.telegram.ui.ActionBar.j6.K6, null);
                    String M0 = org.telegram.messenger.hd.M0(2131753892, null);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                    int indexOf = M0.indexOf(42);
                    int lastIndexOf = M0.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i21].setMovementMethod(new org.telegram.messenger.c0(false));
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.f41(org.telegram.messenger.hd.M0(2131753893, null), (org.telegram.ui.Components.wy0) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i21].setText(spannableStringBuilder);
                } else if (i17 == 1) {
                    textViewArr[i21].setText(org.telegram.messenger.hd.M0(2131753891, null));
                } else {
                    textViewArr[i21].setText(org.telegram.messenger.hd.M0(2131753890, null));
                }
                if (org.telegram.messenger.hd.f24104a0) {
                    f14.setGravity(5);
                    f14.addView(textViewArr[i21], c8.ja.l(1.0f, 0, -2));
                    f14.addView(textViewArr[i18], c8.ja.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f14.addView(textViewArr[i18], c8.ja.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    f14.addView(textViewArr[i21], c8.ja.o(-2, -2));
                }
                i17 = i20;
                i12 = 3;
                i13 = 2;
                f13 = 15.0f;
                i16 = 5;
            }
            this.f47241f.setVisibility(8);
        }
        TextView textView9 = new TextView(context);
        this.f47243r = textView9;
        org.telegram.ui.ActionBar.q6.U(textView9, org.telegram.ui.ActionBar.j6.D6, null);
        this.f47243r.setGravity(1);
        this.f47243r.setLineSpacing(org.telegram.messenger.g0.L(f11), 1.0f);
        this.f47243r.setTextSize(1, 13.0f);
        this.f47243r.setVisibility(8);
        this.f47243r.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        viewGroup.addView(this.f47243r);
        this.f47238b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        gi.j jVar = new gi.j(this, context);
        this.f47239c = jVar;
        c8.na.b(jVar, 0.02f, 1.2f);
        this.f47239c.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        this.f47239c.setGravity(17);
        org.telegram.ui.ActionBar.q6.U(this.f47239c, org.telegram.ui.ActionBar.j6.Ji, null);
        this.f47239c.setTextSize(1, 14.0f);
        this.f47239c.setTypeface(org.telegram.messenger.g0.o());
        gi.j jVar2 = this.f47239c;
        int L = org.telegram.messenger.g0.L(f10);
        int i22 = org.telegram.ui.ActionBar.j6.Hi;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i22, false);
        org.telegram.ui.ActionBar.q6.Q(jVar2, org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 0, x02, x02), null, org.telegram.ui.ActionBar.q6.M(i22), null);
        viewGroup.addView(this.f47239c);
        this.f47239c.setOnClickListener(new View.OnClickListener(this) {
            public final g f46249b;

            {
                this.f46249b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f46249b;
                        if (gVar.getParentActivity() != null) {
                            int i23 = gVar.f47245w;
                            if (i23 != 0) {
                                if (i23 != 3) {
                                    if (i23 != 5) {
                                        if (i23 == 6) {
                                            gVar.presentFragment(new PasscodeActivity(1), true);
                                            m90 m90Var = gVar.E;
                                            if (m90Var != null) {
                                                org.telegram.messenger.g0.h3(m90Var);
                                                gVar.E = null;
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (gVar.getParentActivity() != null) {
                                        if (gVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                            gVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            return;
                                        }
                                        t9.j0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(2131747287, null);
                                alertDialog$Builder.f28392a.U = org.telegram.messenger.hd.M0(2131747289, null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752552, null), new c(gVar, 1));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                gVar.showDialog(alertDialog$Builder.f28392a);
                                return;
                            }
                            gVar.presentFragment(new ad(r.b.f(0, "step")), true);
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f46249b;
                        if (!gVar2.f47237a.getAnimatedDrawable().f33588l0) {
                            gVar2.f47237a.getAnimatedDrawable().N(0, false, false);
                            gVar2.f47237a.d();
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f46249b;
                        if (!gVar3.f47237a.getAnimatedDrawable().f33588l0) {
                            gVar3.f47237a.getAnimatedDrawable().N(0, false, false);
                            gVar3.f47237a.d();
                            return;
                        }
                        return;
                    default:
                        ((ActionBarLayout) this.f46249b.getParentLayout()).l(true, false);
                        return;
                }
            }
        });
        if (i15 != 0) {
            if (i15 != 3) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        this.f47237a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f47237a.f(2131624325, 200, 200, null);
                        this.f47237a.setFocusable(false);
                        this.f47237a.setOnClickListener(new View.OnClickListener(this) {
                            public final g f46249b;

                            {
                                this.f46249b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (r2) {
                                    case 0:
                                        g gVar = this.f46249b;
                                        if (gVar.getParentActivity() != null) {
                                            int i23 = gVar.f47245w;
                                            if (i23 != 0) {
                                                if (i23 != 3) {
                                                    if (i23 != 5) {
                                                        if (i23 == 6) {
                                                            gVar.presentFragment(new PasscodeActivity(1), true);
                                                            m90 m90Var = gVar.E;
                                                            if (m90Var != null) {
                                                                org.telegram.messenger.g0.h3(m90Var);
                                                                gVar.E = null;
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    } else if (gVar.getParentActivity() != null) {
                                                        if (gVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                            gVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                                            return;
                                                        }
                                                        t9.j0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                                        return;
                                                    } else {
                                                        return;
                                                    }
                                                }
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                                alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(2131747287, null);
                                                alertDialog$Builder.f28392a.U = org.telegram.messenger.hd.M0(2131747289, null);
                                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752552, null), new c(gVar, 1));
                                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                                gVar.showDialog(alertDialog$Builder.f28392a);
                                                return;
                                            }
                                            gVar.presentFragment(new ad(r.b.f(0, "step")), true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        g gVar2 = this.f46249b;
                                        if (!gVar2.f47237a.getAnimatedDrawable().f33588l0) {
                                            gVar2.f47237a.getAnimatedDrawable().N(0, false, false);
                                            gVar2.f47237a.d();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        g gVar3 = this.f46249b;
                                        if (!gVar3.f47237a.getAnimatedDrawable().f33588l0) {
                                            gVar3.f47237a.getAnimatedDrawable().N(0, false, false);
                                            gVar3.f47237a.d();
                                            return;
                                        }
                                        return;
                                    default:
                                        ((ActionBarLayout) this.f46249b.getParentLayout()).l(true, false);
                                        return;
                                }
                            }
                        });
                        this.f47240e.setText(org.telegram.messenger.hd.M0(2131747657, null));
                        this.f47241f.setText(org.telegram.messenger.hd.M0(2131752542, null));
                        this.f47239c.setText(org.telegram.messenger.hd.M0(2131751155, null));
                        this.f47237a.d();
                        this.f47246x = true;
                    }
                } else {
                    int[] iArr = new int[8];
                    this.f47244s = iArr;
                    this.f47237a.f(2131624170, 334, 334, iArr);
                    this.f47237a.setScaleType(ImageView.ScaleType.CENTER);
                    this.f47240e.setText(org.telegram.messenger.hd.M0(2131753894, null));
                    this.f47239c.setText(org.telegram.messenger.hd.M0(2131753885, null));
                    this.f47237a.d();
                }
            } else {
                this.d.setVisibility(0);
                this.f47237a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f47237a.f(2131624318, 200, 200, null);
                this.f47237a.setOnClickListener(new View.OnClickListener(this) {
                    public final g f46249b;

                    {
                        this.f46249b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                g gVar = this.f46249b;
                                if (gVar.getParentActivity() != null) {
                                    int i23 = gVar.f47245w;
                                    if (i23 != 0) {
                                        if (i23 != 3) {
                                            if (i23 != 5) {
                                                if (i23 == 6) {
                                                    gVar.presentFragment(new PasscodeActivity(1), true);
                                                    m90 m90Var = gVar.E;
                                                    if (m90Var != null) {
                                                        org.telegram.messenger.g0.h3(m90Var);
                                                        gVar.E = null;
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            } else if (gVar.getParentActivity() != null) {
                                                if (gVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                    gVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                                    return;
                                                }
                                                t9.j0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                        alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(2131747287, null);
                                        alertDialog$Builder.f28392a.U = org.telegram.messenger.hd.M0(2131747289, null);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752552, null), new c(gVar, 1));
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        gVar.showDialog(alertDialog$Builder.f28392a);
                                        return;
                                    }
                                    gVar.presentFragment(new ad(r.b.f(0, "step")), true);
                                    return;
                                }
                                return;
                            case 1:
                                g gVar2 = this.f46249b;
                                if (!gVar2.f47237a.getAnimatedDrawable().f33588l0) {
                                    gVar2.f47237a.getAnimatedDrawable().N(0, false, false);
                                    gVar2.f47237a.d();
                                    return;
                                }
                                return;
                            case 2:
                                g gVar3 = this.f46249b;
                                if (!gVar3.f47237a.getAnimatedDrawable().f33588l0) {
                                    gVar3.f47237a.getAnimatedDrawable().N(0, false, false);
                                    gVar3.f47237a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f46249b.getParentLayout()).l(true, false);
                                return;
                        }
                    }
                });
                org.telegram.messenger.m10 userConfig = getUserConfig();
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(userConfig.f24959n));
                if (a22 == null) {
                    a22 = userConfig.f();
                }
                if (a22 != null) {
                    this.d.setText(org.telegram.messenger.hd.a0("PhoneNumberKeepButton", null, 2131747284, org.telegram.messenger.k5.h(new StringBuilder("+"), a22.phone, pf.b.c())));
                }
                this.d.setOnClickListener(new View.OnClickListener(this) {
                    public final g f46249b;

                    {
                        this.f46249b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                g gVar = this.f46249b;
                                if (gVar.getParentActivity() != null) {
                                    int i23 = gVar.f47245w;
                                    if (i23 != 0) {
                                        if (i23 != 3) {
                                            if (i23 != 5) {
                                                if (i23 == 6) {
                                                    gVar.presentFragment(new PasscodeActivity(1), true);
                                                    m90 m90Var = gVar.E;
                                                    if (m90Var != null) {
                                                        org.telegram.messenger.g0.h3(m90Var);
                                                        gVar.E = null;
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            } else if (gVar.getParentActivity() != null) {
                                                if (gVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                    gVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                                    return;
                                                }
                                                t9.j0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                        alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(2131747287, null);
                                        alertDialog$Builder.f28392a.U = org.telegram.messenger.hd.M0(2131747289, null);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752552, null), new c(gVar, 1));
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        gVar.showDialog(alertDialog$Builder.f28392a);
                                        return;
                                    }
                                    gVar.presentFragment(new ad(r.b.f(0, "step")), true);
                                    return;
                                }
                                return;
                            case 1:
                                g gVar2 = this.f46249b;
                                if (!gVar2.f47237a.getAnimatedDrawable().f33588l0) {
                                    gVar2.f47237a.getAnimatedDrawable().N(0, false, false);
                                    gVar2.f47237a.d();
                                    return;
                                }
                                return;
                            case 2:
                                g gVar3 = this.f46249b;
                                if (!gVar3.f47237a.getAnimatedDrawable().f33588l0) {
                                    gVar3.f47237a.getAnimatedDrawable().N(0, false, false);
                                    gVar3.f47237a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f46249b.getParentLayout()).l(true, false);
                                return;
                        }
                    }
                });
                this.f47240e.setText(org.telegram.messenger.hd.M0(2131747288, null));
                this.f47241f.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747285, null)));
                this.f47239c.setText(org.telegram.messenger.hd.M0(2131747288, null));
                this.f47237a.d();
                this.f47246x = true;
            }
        } else {
            this.f47237a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f47237a.f(2131623973, 200, 200, null);
            this.f47240e.setText(org.telegram.messenger.hd.M0(2131752468, null));
            this.f47241f.setText(org.telegram.messenger.hd.M0(2131752469, null));
            this.f47239c.setText(org.telegram.messenger.hd.M0(2131752470, null));
            this.f47237a.d();
            this.f47246x = true;
        }
        if (this.f47246x) {
            this.f47239c.setPadding(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(8.0f));
            this.f47239c.setTextSize(1, 15.0f);
        }
        g0();
        return this.fragmentView;
    }

    public final void e0(Runnable runnable) {
        this.E = (m90) runnable;
    }

    public final void f0(tr trVar) {
        this.f47247y = trVar;
    }

    public final void g0() {
        int i7 = org.telegram.ui.ActionBar.j6.Fi;
        int themedColor = getThemedColor(i7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
        boolean z10 = this.H;
        int[] iArr = this.F;
        if (!z10 || iArr[0] != themedColor || iArr[1] != themedColor2) {
            iArr[0] = themedColor;
            iArr[1] = themedColor2;
            this.H = true;
            this.f47238b.setColors(iArr);
        }
        this.f47239c.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, false));
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hi, false);
        if (this.f47239c.getBackground() == null) {
            gi.j jVar = this.f47239c;
            int L = org.telegram.messenger.g0.L(24.0f);
            jVar.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 0, x02, x02));
        } else if (x02 != this.G) {
            org.telegram.ui.ActionBar.j6.H1(this.f47239c.getBackground(), x02, true);
        }
        this.G = x02;
        int[] iArr2 = this.f47244s;
        if (iArr2 != null && this.f47237a != null) {
            iArr2[0] = 3355443;
            iArr2[1] = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G6, false);
            int[] iArr3 = this.f47244s;
            iArr3[2] = 16777215;
            int i10 = org.telegram.ui.ActionBar.j6.f28849d6;
            iArr3[3] = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
            int[] iArr4 = this.f47244s;
            iArr4[4] = 5285866;
            iArr4[5] = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
            int[] iArr5 = this.f47244s;
            iArr5[6] = 2170912;
            iArr5[7] = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
            org.telegram.ui.Components.fh0 fh0Var = this.f47237a;
            int[] iArr6 = this.f47244s;
            org.telegram.ui.Components.ch0 ch0Var = fh0Var.f34611b;
            if (ch0Var != null) {
                ch0Var.f33589n = iArr6;
                ch0Var.G();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        TextView[] textViewArr = this.f47242n;
        TextView textView = textViewArr[0];
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(textView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(textViewArr[1], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(textViewArr[1], 2, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(textViewArr[2], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(textViewArr[3], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(textViewArr[4], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(textViewArr[5], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i7 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                t9.j0(getParentActivity(), 1, new f(this, 0));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f28392a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746503, null));
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747300, null), new c(this, 0));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
            int i10 = org.telegram.ui.ActionBar.j6.L5;
            alertDialog$Builder.m(2131624117, 72, org.telegram.ui.ActionBar.j6.x0(null, i10, false), null);
            alertDialog$Builder.n(i10, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        g0();
    }
}
