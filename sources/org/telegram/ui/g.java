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
public final class g extends org.telegram.ui.ActionBar.f2 {
    public l90 D;
    public final int[] E;
    public int F;
    public boolean G;
    public org.telegram.ui.Components.ch0 f45753a;
    public GradientDrawable f45754b;
    public ei.k f45755c;
    public TextView d;
    public TextView f45756e;
    public TextView f45757f;
    public LinearLayout h;
    public final TextView[] f45758n;
    public TextView f45759r;
    public int[] f45760s;
    public final int f45761w;
    public boolean f45762x;
    public pu f45763y;

    public g(int i7) {
        super(null);
        this.f45758n = new TextView[6];
        this.E = new int[2];
        this.f45761w = i7;
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
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, kVar, null);
            this.actionBar.setBackButtonImage(2131231240);
            org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.f28186v8, null);
            org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f28147t8, null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new bi.s(this, 20));
        }
        e eVar = new e(0, context, this);
        this.fragmentView = eVar;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, eVar, null);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        int i13 = 2;
        viewGroup.setOnTouchListener(new ei.b(2));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            viewGroup.addView(kVar2);
        }
        ?? imageView = new ImageView(context);
        this.f45753a = imageView;
        viewGroup.addView(imageView);
        TextView textView = new TextView(context);
        this.f45756e = textView;
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i14, null);
        this.f45756e.setGravity(1);
        this.f45756e.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.f45756e.setTextSize(1, 24.0f);
        viewGroup.addView(this.f45756e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i15 = this.f45761w;
        if (i15 == 3) {
            i14 = org.telegram.ui.ActionBar.k6.Ci;
        }
        org.telegram.ui.ActionBar.r6.V(textView2, i14, null);
        this.d.setGravity(1);
        float f13 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f45757f = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.D6, null);
        this.f45757f.setGravity(1);
        this.f45757f.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        this.f45757f.setTextSize(1, 15.0f);
        if (i15 == 6 || i15 == 3) {
            f10 = 24.0f;
            f11 = 2.0f;
            this.f45757f.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
        } else {
            f10 = 24.0f;
            f11 = 2.0f;
            this.f45757f.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        }
        viewGroup.addView(this.f45757f);
        int i16 = 5;
        if (i15 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            this.h.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
            LinearLayout linearLayout2 = this.h;
            if (org.telegram.messenger.hd.f22878a0) {
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
                linearLayout3.addView(f14, c8.ha.k(0.0f, 0.0f, 0.0f, f12, -2, -2));
                int i18 = i17 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.f45758n;
                textViewArr[i18] = textView4;
                int i19 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.ui.ActionBar.r6.V(textView4, i19, null);
                TextView textView5 = textViewArr[i18];
                if (org.telegram.messenger.hd.f22878a0) {
                    i10 = i16;
                } else {
                    i10 = 3;
                }
                textView5.setGravity(i10);
                textViewArr[i18].setTextSize(1, f13);
                TextView textView6 = textViewArr[i18];
                if (org.telegram.messenger.hd.f22878a0) {
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
                org.telegram.ui.ActionBar.r6.V(textView7, i19, null);
                TextView textView8 = textViewArr[i21];
                if (org.telegram.messenger.hd.f22878a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView8.setGravity(i11);
                textViewArr[i21].setTextSize(1, f13);
                if (i17 == 0) {
                    org.telegram.ui.ActionBar.r6.H(textViewArr[i21], org.telegram.ui.ActionBar.k6.J6, null);
                    org.telegram.ui.ActionBar.r6.D(textViewArr[i21], org.telegram.ui.ActionBar.k6.K6, null);
                    String M0 = org.telegram.messenger.hd.M0(2131753892, null);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                    int indexOf = M0.indexOf(42);
                    int lastIndexOf = M0.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i21].setMovementMethod(new org.telegram.messenger.c0(false));
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.b41(org.telegram.messenger.hd.M0(2131753893, null), (org.telegram.ui.Components.uy0) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i21].setText(spannableStringBuilder);
                } else if (i17 == 1) {
                    textViewArr[i21].setText(org.telegram.messenger.hd.M0(2131753891, null));
                } else {
                    textViewArr[i21].setText(org.telegram.messenger.hd.M0(2131753890, null));
                }
                if (org.telegram.messenger.hd.f22878a0) {
                    f14.setGravity(5);
                    f14.addView(textViewArr[i21], c8.ha.l(1.0f, 0, -2));
                    f14.addView(textViewArr[i18], c8.ha.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f14.addView(textViewArr[i18], c8.ha.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    f14.addView(textViewArr[i21], c8.ha.o(-2, -2));
                }
                i17 = i20;
                i12 = 3;
                i13 = 2;
                f13 = 15.0f;
                i16 = 5;
            }
            this.f45757f.setVisibility(8);
        }
        TextView textView9 = new TextView(context);
        this.f45759r = textView9;
        org.telegram.ui.ActionBar.r6.V(textView9, org.telegram.ui.ActionBar.k6.D6, null);
        this.f45759r.setGravity(1);
        this.f45759r.setLineSpacing(org.telegram.messenger.g0.L(f11), 1.0f);
        this.f45759r.setTextSize(1, 13.0f);
        this.f45759r.setVisibility(8);
        this.f45759r.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        viewGroup.addView(this.f45759r);
        this.f45754b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        ei.k kVar3 = new ei.k(this, context);
        this.f45755c = kVar3;
        c8.ka.b(kVar3, 0.02f, 1.2f);
        this.f45755c.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        this.f45755c.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(this.f45755c, org.telegram.ui.ActionBar.k6.Gi, null);
        this.f45755c.setTextSize(1, 14.0f);
        this.f45755c.setTypeface(org.telegram.messenger.g0.o());
        ei.k kVar4 = this.f45755c;
        int L = org.telegram.messenger.g0.L(f10);
        int i22 = org.telegram.ui.ActionBar.k6.Ei;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i22, false);
        org.telegram.ui.ActionBar.r6.R(kVar4, org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, x02, x02), null, org.telegram.ui.ActionBar.r6.N(i22), null);
        viewGroup.addView(this.f45755c);
        this.f45755c.setOnClickListener(new View.OnClickListener(this) {
            public final g f44921b;

            {
                this.f44921b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f44921b;
                        if (gVar.getParentActivity() != null) {
                            int i23 = gVar.f45761w;
                            if (i23 != 0) {
                                if (i23 != 3) {
                                    if (i23 != 5) {
                                        if (i23 == 6) {
                                            gVar.presentFragment(new PasscodeActivity(1), true);
                                            l90 l90Var = gVar.D;
                                            if (l90Var != null) {
                                                org.telegram.messenger.g0.h3(l90Var);
                                                gVar.D = null;
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
                                        s9.j0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                alertDialog$Builder.f27293a.R = org.telegram.messenger.hd.M0(2131747286, null);
                                alertDialog$Builder.f27293a.T = org.telegram.messenger.hd.M0(2131747288, null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752552, null), new c(gVar, 1));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                gVar.showDialog(alertDialog$Builder.f27293a);
                                return;
                            }
                            gVar.presentFragment(new bd(rf.b.f(0, "step")), true);
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f44921b;
                        if (!gVar2.f45753a.getAnimatedDrawable().f40984k0) {
                            gVar2.f45753a.getAnimatedDrawable().N(0, false, false);
                            gVar2.f45753a.d();
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f44921b;
                        if (!gVar3.f45753a.getAnimatedDrawable().f40984k0) {
                            gVar3.f45753a.getAnimatedDrawable().N(0, false, false);
                            gVar3.f45753a.d();
                            return;
                        }
                        return;
                    default:
                        ((ActionBarLayout) this.f44921b.getParentLayout()).l(true, false);
                        return;
                }
            }
        });
        if (i15 != 0) {
            if (i15 != 3) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        this.f45753a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f45753a.f(2131624324, 200, 200, null);
                        this.f45753a.setFocusable(false);
                        this.f45753a.setOnClickListener(new View.OnClickListener(this) {
                            public final g f44921b;

                            {
                                this.f44921b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (r2) {
                                    case 0:
                                        g gVar = this.f44921b;
                                        if (gVar.getParentActivity() != null) {
                                            int i23 = gVar.f45761w;
                                            if (i23 != 0) {
                                                if (i23 != 3) {
                                                    if (i23 != 5) {
                                                        if (i23 == 6) {
                                                            gVar.presentFragment(new PasscodeActivity(1), true);
                                                            l90 l90Var = gVar.D;
                                                            if (l90Var != null) {
                                                                org.telegram.messenger.g0.h3(l90Var);
                                                                gVar.D = null;
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
                                                        s9.j0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                                        return;
                                                    } else {
                                                        return;
                                                    }
                                                }
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                                alertDialog$Builder.f27293a.R = org.telegram.messenger.hd.M0(2131747286, null);
                                                alertDialog$Builder.f27293a.T = org.telegram.messenger.hd.M0(2131747288, null);
                                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752552, null), new c(gVar, 1));
                                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                                gVar.showDialog(alertDialog$Builder.f27293a);
                                                return;
                                            }
                                            gVar.presentFragment(new bd(rf.b.f(0, "step")), true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        g gVar2 = this.f44921b;
                                        if (!gVar2.f45753a.getAnimatedDrawable().f40984k0) {
                                            gVar2.f45753a.getAnimatedDrawable().N(0, false, false);
                                            gVar2.f45753a.d();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        g gVar3 = this.f44921b;
                                        if (!gVar3.f45753a.getAnimatedDrawable().f40984k0) {
                                            gVar3.f45753a.getAnimatedDrawable().N(0, false, false);
                                            gVar3.f45753a.d();
                                            return;
                                        }
                                        return;
                                    default:
                                        ((ActionBarLayout) this.f44921b.getParentLayout()).l(true, false);
                                        return;
                                }
                            }
                        });
                        this.f45756e.setText(org.telegram.messenger.hd.M0(2131747656, null));
                        this.f45757f.setText(org.telegram.messenger.hd.M0(2131752542, null));
                        this.f45755c.setText(org.telegram.messenger.hd.M0(2131751156, null));
                        this.f45753a.d();
                        this.f45762x = true;
                    }
                } else {
                    int[] iArr = new int[8];
                    this.f45760s = iArr;
                    this.f45753a.f(2131624169, 334, 334, iArr);
                    this.f45753a.setScaleType(ImageView.ScaleType.CENTER);
                    this.f45756e.setText(org.telegram.messenger.hd.M0(2131753894, null));
                    this.f45755c.setText(org.telegram.messenger.hd.M0(2131753885, null));
                    this.f45753a.d();
                }
            } else {
                this.d.setVisibility(0);
                this.f45753a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f45753a.f(2131624317, 200, 200, null);
                this.f45753a.setOnClickListener(new View.OnClickListener(this) {
                    public final g f44921b;

                    {
                        this.f44921b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                g gVar = this.f44921b;
                                if (gVar.getParentActivity() != null) {
                                    int i23 = gVar.f45761w;
                                    if (i23 != 0) {
                                        if (i23 != 3) {
                                            if (i23 != 5) {
                                                if (i23 == 6) {
                                                    gVar.presentFragment(new PasscodeActivity(1), true);
                                                    l90 l90Var = gVar.D;
                                                    if (l90Var != null) {
                                                        org.telegram.messenger.g0.h3(l90Var);
                                                        gVar.D = null;
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
                                                s9.j0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                        alertDialog$Builder.f27293a.R = org.telegram.messenger.hd.M0(2131747286, null);
                                        alertDialog$Builder.f27293a.T = org.telegram.messenger.hd.M0(2131747288, null);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752552, null), new c(gVar, 1));
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        gVar.showDialog(alertDialog$Builder.f27293a);
                                        return;
                                    }
                                    gVar.presentFragment(new bd(rf.b.f(0, "step")), true);
                                    return;
                                }
                                return;
                            case 1:
                                g gVar2 = this.f44921b;
                                if (!gVar2.f45753a.getAnimatedDrawable().f40984k0) {
                                    gVar2.f45753a.getAnimatedDrawable().N(0, false, false);
                                    gVar2.f45753a.d();
                                    return;
                                }
                                return;
                            case 2:
                                g gVar3 = this.f44921b;
                                if (!gVar3.f45753a.getAnimatedDrawable().f40984k0) {
                                    gVar3.f45753a.getAnimatedDrawable().N(0, false, false);
                                    gVar3.f45753a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f44921b.getParentLayout()).l(true, false);
                                return;
                        }
                    }
                });
                org.telegram.messenger.p10 userConfig = getUserConfig();
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(userConfig.f24486n));
                if (a22 == null) {
                    a22 = userConfig.f();
                }
                if (a22 != null) {
                    this.d.setText(org.telegram.messenger.hd.a0("PhoneNumberKeepButton", null, 2131747283, org.telegram.messenger.k5.i(new StringBuilder("+"), a22.phone, pf.b.c())));
                }
                this.d.setOnClickListener(new View.OnClickListener(this) {
                    public final g f44921b;

                    {
                        this.f44921b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                g gVar = this.f44921b;
                                if (gVar.getParentActivity() != null) {
                                    int i23 = gVar.f45761w;
                                    if (i23 != 0) {
                                        if (i23 != 3) {
                                            if (i23 != 5) {
                                                if (i23 == 6) {
                                                    gVar.presentFragment(new PasscodeActivity(1), true);
                                                    l90 l90Var = gVar.D;
                                                    if (l90Var != null) {
                                                        org.telegram.messenger.g0.h3(l90Var);
                                                        gVar.D = null;
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
                                                s9.j0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                        alertDialog$Builder.f27293a.R = org.telegram.messenger.hd.M0(2131747286, null);
                                        alertDialog$Builder.f27293a.T = org.telegram.messenger.hd.M0(2131747288, null);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752552, null), new c(gVar, 1));
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        gVar.showDialog(alertDialog$Builder.f27293a);
                                        return;
                                    }
                                    gVar.presentFragment(new bd(rf.b.f(0, "step")), true);
                                    return;
                                }
                                return;
                            case 1:
                                g gVar2 = this.f44921b;
                                if (!gVar2.f45753a.getAnimatedDrawable().f40984k0) {
                                    gVar2.f45753a.getAnimatedDrawable().N(0, false, false);
                                    gVar2.f45753a.d();
                                    return;
                                }
                                return;
                            case 2:
                                g gVar3 = this.f44921b;
                                if (!gVar3.f45753a.getAnimatedDrawable().f40984k0) {
                                    gVar3.f45753a.getAnimatedDrawable().N(0, false, false);
                                    gVar3.f45753a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f44921b.getParentLayout()).l(true, false);
                                return;
                        }
                    }
                });
                this.f45756e.setText(org.telegram.messenger.hd.M0(2131747287, null));
                this.f45757f.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747284, null)));
                this.f45755c.setText(org.telegram.messenger.hd.M0(2131747287, null));
                this.f45753a.d();
                this.f45762x = true;
            }
        } else {
            this.f45753a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f45753a.f(2131623973, 200, 200, null);
            this.f45756e.setText(org.telegram.messenger.hd.M0(2131752468, null));
            this.f45757f.setText(org.telegram.messenger.hd.M0(2131752469, null));
            this.f45755c.setText(org.telegram.messenger.hd.M0(2131752470, null));
            this.f45753a.d();
            this.f45762x = true;
        }
        if (this.f45762x) {
            this.f45755c.setPadding(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(8.0f));
            this.f45755c.setTextSize(1, 15.0f);
        }
        g0();
        return this.fragmentView;
    }

    public final void e0(Runnable runnable) {
        this.D = (l90) runnable;
    }

    public final void f0(pu puVar) {
        this.f45763y = puVar;
    }

    public final void g0() {
        int i7 = org.telegram.ui.ActionBar.k6.Ci;
        int themedColor = getThemedColor(i7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Di);
        boolean z9 = this.G;
        int[] iArr = this.E;
        if (!z9 || iArr[0] != themedColor || iArr[1] != themedColor2) {
            iArr[0] = themedColor;
            iArr[1] = themedColor2;
            this.G = true;
            this.f45754b.setColors(iArr);
        }
        this.f45755c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
        if (this.f45755c.getBackground() == null) {
            ei.k kVar = this.f45755c;
            int L = org.telegram.messenger.g0.L(24.0f);
            kVar.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, x02, x02));
        } else if (x02 != this.F) {
            org.telegram.ui.ActionBar.k6.H1(this.f45755c.getBackground(), x02, true);
        }
        this.F = x02;
        int[] iArr2 = this.f45760s;
        if (iArr2 != null && this.f45753a != null) {
            iArr2[0] = 3355443;
            iArr2[1] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
            int[] iArr3 = this.f45760s;
            iArr3[2] = 16777215;
            int i10 = org.telegram.ui.ActionBar.k6.f27849d6;
            iArr3[3] = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            int[] iArr4 = this.f45760s;
            iArr4[4] = 5285866;
            iArr4[5] = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
            int[] iArr5 = this.f45760s;
            iArr5[6] = 2170912;
            iArr5[7] = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            org.telegram.ui.Components.ch0 ch0Var = this.f45753a;
            int[] iArr6 = this.f45760s;
            org.telegram.ui.Components.zg0 zg0Var = ch0Var.f32561b;
            if (zg0Var != null) {
                zg0Var.f40986n = iArr6;
                zg0Var.G();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        TextView[] textViewArr = this.f45758n;
        TextView textView = textViewArr[0];
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(textView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(textViewArr[1], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(textViewArr[1], 2, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(textViewArr[2], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(textViewArr[3], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(textViewArr[4], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(textViewArr[5], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27849d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i7 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                s9.j0(getParentActivity(), 1, new f(this, 0));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f27293a.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746502, null));
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747299, null), new c(this, 0));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
            int i10 = org.telegram.ui.ActionBar.k6.L5;
            alertDialog$Builder.m(2131624116, 72, org.telegram.ui.ActionBar.k6.x0(null, i10, false), null);
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
