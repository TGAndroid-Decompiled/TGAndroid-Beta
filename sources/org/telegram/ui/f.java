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
public final class f extends org.telegram.ui.ActionBar.k2 {
    public pa0 D;
    public final int[] E;
    public int F;
    public boolean G;
    public org.telegram.ui.Components.fi0 f36931a;
    public GradientDrawable f36932b;
    public bi.j6 f36933c;
    public TextView d;
    public TextView e;
    public TextView f36934f;
    public LinearLayout h;
    public final TextView[] f36935n;
    public TextView f36936r;
    public int[] f36937s;
    public final int f36938w;
    public boolean f36939x;
    public qv f36940y;

    public f(int i10) {
        super(null);
        this.f36935n = new TextView[6];
        this.E = new int[2];
        this.f36938w = i10;
    }

    @Override
    public final View createView(Context context) {
        float f7;
        float f10;
        float f11;
        int i10;
        float f12;
        int i11;
        String str;
        int i12;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i13 = 3;
        if (lVar != null) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, lVar, null);
            this.actionBar.setBackButtonImage(2131231241);
            org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, org.telegram.ui.ActionBar.t6.f21262v8, null);
            org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.f21226t8, null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new ag.e(this, 10));
        }
        jf.g gVar = new jf.g(this, context, 1);
        this.fragmentView = gVar;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, gVar, null);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        viewGroup.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        if (lVar2 != null) {
            viewGroup.addView(lVar2);
        }
        ?? imageView = new ImageView(context);
        this.f36931a = imageView;
        viewGroup.addView(imageView);
        TextView textView = new TextView(context);
        this.e = textView;
        int i14 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i14, null);
        this.e.setGravity(1);
        this.e.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
        this.e.setTextSize(1, 24.0f);
        viewGroup.addView(this.e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i15 = this.f36938w;
        if (i15 == 3) {
            i14 = org.telegram.ui.ActionBar.t6.Ci;
        }
        org.telegram.ui.ActionBar.a7.V(textView2, i14, null);
        this.d.setGravity(1);
        float f13 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f36934f = textView3;
        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.D6, null);
        this.f36934f.setGravity(1);
        this.f36934f.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        this.f36934f.setTextSize(1, 15.0f);
        if (i15 == 6 || i15 == 3) {
            f7 = 32.0f;
            f10 = 24.0f;
            this.f36934f.setPadding(org.telegram.messenger.i0.L(48.0f), 0, org.telegram.messenger.i0.L(48.0f), 0);
        } else {
            f7 = 32.0f;
            f10 = 24.0f;
            this.f36934f.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
        }
        viewGroup.addView(this.f36934f);
        int i16 = 2;
        int i17 = 5;
        if (i15 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            f11 = 2.0f;
            this.h.setPadding(org.telegram.messenger.i0.L(f10), 0, org.telegram.messenger.i0.L(f10), 0);
            LinearLayout linearLayout2 = this.h;
            if (org.telegram.messenger.dd.X) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            linearLayout2.setGravity(i10);
            viewGroup.addView(this.h);
            int i18 = 0;
            while (i18 < i13) {
                LinearLayout f14 = org.telegram.messenger.m5.f(context, 0);
                LinearLayout linearLayout3 = this.h;
                if (i18 != i16) {
                    f12 = 7.0f;
                } else {
                    f12 = 0.0f;
                }
                linearLayout3.addView(f14, w7.b6.k(0.0f, 0.0f, 0.0f, f12, -2, -2));
                int i19 = i18 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.f36935n;
                textViewArr[i19] = textView4;
                int i20 = org.telegram.ui.ActionBar.t6.G6;
                org.telegram.ui.ActionBar.a7.V(textView4, i20, null);
                TextView textView5 = textViewArr[i19];
                if (org.telegram.messenger.dd.X) {
                    i11 = i17;
                } else {
                    i11 = 3;
                }
                textView5.setGravity(i11);
                textViewArr[i19].setTextSize(1, f13);
                TextView textView6 = textViewArr[i19];
                if (org.telegram.messenger.dd.X) {
                    str = ".%d";
                } else {
                    str = "%d.";
                }
                int i21 = i18 + 1;
                textView6.setText(String.format(str, Integer.valueOf(i21)));
                textViewArr[i19].setTypeface(org.telegram.messenger.i0.o());
                int i22 = i19 + 1;
                TextView textView7 = new TextView(context);
                textViewArr[i22] = textView7;
                org.telegram.ui.ActionBar.a7.V(textView7, i20, null);
                TextView textView8 = textViewArr[i22];
                if (org.telegram.messenger.dd.X) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView8.setGravity(i12);
                textViewArr[i22].setTextSize(1, f13);
                if (i18 == 0) {
                    org.telegram.ui.ActionBar.a7.H(textViewArr[i22], org.telegram.ui.ActionBar.t6.J6, null);
                    org.telegram.ui.ActionBar.a7.D(textViewArr[i22], org.telegram.ui.ActionBar.t6.K6, null);
                    String L0 = org.telegram.messenger.dd.L0(2131753892, null);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L0);
                    int indexOf = L0.indexOf(42);
                    int lastIndexOf = L0.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i22].setMovementMethod(new org.telegram.messenger.e0(false));
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.f51(org.telegram.messenger.dd.L0(2131753893, null), (org.telegram.ui.Components.zz0) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i22].setText(spannableStringBuilder);
                } else if (i18 == 1) {
                    textViewArr[i22].setText(org.telegram.messenger.dd.L0(2131753891, null));
                } else {
                    textViewArr[i22].setText(org.telegram.messenger.dd.L0(2131753890, null));
                }
                if (org.telegram.messenger.dd.X) {
                    f14.setGravity(5);
                    f14.addView(textViewArr[i22], w7.b6.l(1.0f, 0, -2));
                    f14.addView(textViewArr[i19], w7.b6.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f14.addView(textViewArr[i19], w7.b6.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    f14.addView(textViewArr[i22], w7.b6.o(-2, -2));
                }
                i18 = i21;
                i13 = 3;
                f13 = 15.0f;
                i16 = 2;
                i17 = 5;
            }
            this.f36934f.setVisibility(8);
        } else {
            f11 = 2.0f;
        }
        TextView textView9 = new TextView(context);
        this.f36936r = textView9;
        org.telegram.ui.ActionBar.a7.V(textView9, org.telegram.ui.ActionBar.t6.D6, null);
        this.f36936r.setGravity(1);
        this.f36936r.setLineSpacing(org.telegram.messenger.i0.L(f11), 1.0f);
        this.f36936r.setTextSize(1, 13.0f);
        this.f36936r.setVisibility(8);
        this.f36936r.setPadding(org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(f7), 0);
        viewGroup.addView(this.f36936r);
        this.f36932b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        bi.j6 j6Var = new bi.j6(this, context);
        this.f36933c = j6Var;
        w7.e6.b(j6Var, 0.02f, 1.2f);
        this.f36933c.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        this.f36933c.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(this.f36933c, org.telegram.ui.ActionBar.t6.Gi, null);
        this.f36933c.setTextSize(1, 14.0f);
        this.f36933c.setTypeface(org.telegram.messenger.i0.o());
        bi.j6 j6Var2 = this.f36933c;
        int L = org.telegram.messenger.i0.L(f10);
        int i23 = org.telegram.ui.ActionBar.t6.Ei;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i23, false);
        org.telegram.ui.ActionBar.a7.R(j6Var2, org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, x02, x02), null, org.telegram.ui.ActionBar.a7.N(i23), null);
        viewGroup.addView(this.f36933c);
        this.f36933c.setOnClickListener(new View.OnClickListener(this) {
            public final f f36454b;

            {
                this.f36454b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f fVar = this.f36454b;
                        if (fVar.getParentActivity() != null) {
                            int i24 = fVar.f36938w;
                            if (i24 != 0) {
                                if (i24 != 3) {
                                    if (i24 != 5) {
                                        if (i24 == 6) {
                                            fVar.presentFragment(new PasscodeActivity(1), true);
                                            pa0 pa0Var = fVar.D;
                                            if (pa0Var != null) {
                                                org.telegram.messenger.i0.g3(pa0Var);
                                                fVar.D = null;
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (fVar.getParentActivity() != null) {
                                        if (fVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                            fVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            return;
                                        }
                                        u9.j0(fVar.getParentActivity(), 1, new e(fVar, 0));
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fVar.getParentActivity());
                                alertDialog$Builder.f20135a.R = org.telegram.messenger.dd.L0(2131747303, null);
                                alertDialog$Builder.f20135a.T = org.telegram.messenger.dd.L0(2131747305, null);
                                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752552, null), new c(fVar, 1));
                                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                fVar.showDialog(alertDialog$Builder.f20135a);
                                return;
                            }
                            fVar.presentFragment(new kd(org.telegram.ui.Cells.f1.i(0, "step")), true);
                            return;
                        }
                        return;
                    case 1:
                        f fVar2 = this.f36454b;
                        if (!fVar2.f36931a.getAnimatedDrawable().f25144k0) {
                            fVar2.f36931a.getAnimatedDrawable().N(0, false, false);
                            fVar2.f36931a.d();
                            return;
                        }
                        return;
                    case 2:
                        f fVar3 = this.f36454b;
                        if (!fVar3.f36931a.getAnimatedDrawable().f25144k0) {
                            fVar3.f36931a.getAnimatedDrawable().N(0, false, false);
                            fVar3.f36931a.d();
                            return;
                        }
                        return;
                    default:
                        ((ActionBarLayout) this.f36454b.getParentLayout()).l(true, false);
                        return;
                }
            }
        });
        if (i15 != 0) {
            if (i15 != 3) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        this.f36931a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f36931a.f(2131624322, 200, 200, null);
                        this.f36931a.setFocusable(false);
                        this.f36931a.setOnClickListener(new View.OnClickListener(this) {
                            public final f f36454b;

                            {
                                this.f36454b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (r2) {
                                    case 0:
                                        f fVar = this.f36454b;
                                        if (fVar.getParentActivity() != null) {
                                            int i24 = fVar.f36938w;
                                            if (i24 != 0) {
                                                if (i24 != 3) {
                                                    if (i24 != 5) {
                                                        if (i24 == 6) {
                                                            fVar.presentFragment(new PasscodeActivity(1), true);
                                                            pa0 pa0Var = fVar.D;
                                                            if (pa0Var != null) {
                                                                org.telegram.messenger.i0.g3(pa0Var);
                                                                fVar.D = null;
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    } else if (fVar.getParentActivity() != null) {
                                                        if (fVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                            fVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                                            return;
                                                        }
                                                        u9.j0(fVar.getParentActivity(), 1, new e(fVar, 0));
                                                        return;
                                                    } else {
                                                        return;
                                                    }
                                                }
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fVar.getParentActivity());
                                                alertDialog$Builder.f20135a.R = org.telegram.messenger.dd.L0(2131747303, null);
                                                alertDialog$Builder.f20135a.T = org.telegram.messenger.dd.L0(2131747305, null);
                                                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752552, null), new c(fVar, 1));
                                                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                                fVar.showDialog(alertDialog$Builder.f20135a);
                                                return;
                                            }
                                            fVar.presentFragment(new kd(org.telegram.ui.Cells.f1.i(0, "step")), true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        f fVar2 = this.f36454b;
                                        if (!fVar2.f36931a.getAnimatedDrawable().f25144k0) {
                                            fVar2.f36931a.getAnimatedDrawable().N(0, false, false);
                                            fVar2.f36931a.d();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        f fVar3 = this.f36454b;
                                        if (!fVar3.f36931a.getAnimatedDrawable().f25144k0) {
                                            fVar3.f36931a.getAnimatedDrawable().N(0, false, false);
                                            fVar3.f36931a.d();
                                            return;
                                        }
                                        return;
                                    default:
                                        ((ActionBarLayout) this.f36454b.getParentLayout()).l(true, false);
                                        return;
                                }
                            }
                        });
                        this.e.setText(org.telegram.messenger.dd.L0(2131747673, null));
                        this.f36934f.setText(org.telegram.messenger.dd.L0(2131752542, null));
                        this.f36933c.setText(org.telegram.messenger.dd.L0(2131751156, null));
                        this.f36931a.d();
                        this.f36939x = true;
                    }
                } else {
                    int[] iArr = new int[8];
                    this.f36937s = iArr;
                    this.f36931a.f(2131624167, 334, 334, iArr);
                    this.f36931a.setScaleType(ImageView.ScaleType.CENTER);
                    this.e.setText(org.telegram.messenger.dd.L0(2131753894, null));
                    this.f36933c.setText(org.telegram.messenger.dd.L0(2131753885, null));
                    this.f36931a.d();
                }
            } else {
                this.d.setVisibility(0);
                this.f36931a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f36931a.f(2131624315, 200, 200, null);
                this.f36931a.setOnClickListener(new View.OnClickListener(this) {
                    public final f f36454b;

                    {
                        this.f36454b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                f fVar = this.f36454b;
                                if (fVar.getParentActivity() != null) {
                                    int i24 = fVar.f36938w;
                                    if (i24 != 0) {
                                        if (i24 != 3) {
                                            if (i24 != 5) {
                                                if (i24 == 6) {
                                                    fVar.presentFragment(new PasscodeActivity(1), true);
                                                    pa0 pa0Var = fVar.D;
                                                    if (pa0Var != null) {
                                                        org.telegram.messenger.i0.g3(pa0Var);
                                                        fVar.D = null;
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            } else if (fVar.getParentActivity() != null) {
                                                if (fVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                    fVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                                    return;
                                                }
                                                u9.j0(fVar.getParentActivity(), 1, new e(fVar, 0));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fVar.getParentActivity());
                                        alertDialog$Builder.f20135a.R = org.telegram.messenger.dd.L0(2131747303, null);
                                        alertDialog$Builder.f20135a.T = org.telegram.messenger.dd.L0(2131747305, null);
                                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752552, null), new c(fVar, 1));
                                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                        fVar.showDialog(alertDialog$Builder.f20135a);
                                        return;
                                    }
                                    fVar.presentFragment(new kd(org.telegram.ui.Cells.f1.i(0, "step")), true);
                                    return;
                                }
                                return;
                            case 1:
                                f fVar2 = this.f36454b;
                                if (!fVar2.f36931a.getAnimatedDrawable().f25144k0) {
                                    fVar2.f36931a.getAnimatedDrawable().N(0, false, false);
                                    fVar2.f36931a.d();
                                    return;
                                }
                                return;
                            case 2:
                                f fVar3 = this.f36454b;
                                if (!fVar3.f36931a.getAnimatedDrawable().f25144k0) {
                                    fVar3.f36931a.getAnimatedDrawable().N(0, false, false);
                                    fVar3.f36931a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f36454b.getParentLayout()).l(true, false);
                                return;
                        }
                    }
                });
                org.telegram.messenger.e20 userConfig = getUserConfig();
                TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(userConfig.f15524n));
                if (Z1 == null) {
                    Z1 = userConfig.f();
                }
                if (Z1 != null) {
                    this.d.setText(org.telegram.messenger.dd.a0("PhoneNumberKeepButton", null, 2131747300, org.telegram.messenger.m5.h(new StringBuilder("+"), Z1.phone, af.b.c())));
                }
                this.d.setOnClickListener(new View.OnClickListener(this) {
                    public final f f36454b;

                    {
                        this.f36454b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                f fVar = this.f36454b;
                                if (fVar.getParentActivity() != null) {
                                    int i24 = fVar.f36938w;
                                    if (i24 != 0) {
                                        if (i24 != 3) {
                                            if (i24 != 5) {
                                                if (i24 == 6) {
                                                    fVar.presentFragment(new PasscodeActivity(1), true);
                                                    pa0 pa0Var = fVar.D;
                                                    if (pa0Var != null) {
                                                        org.telegram.messenger.i0.g3(pa0Var);
                                                        fVar.D = null;
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            } else if (fVar.getParentActivity() != null) {
                                                if (fVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                    fVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                                    return;
                                                }
                                                u9.j0(fVar.getParentActivity(), 1, new e(fVar, 0));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fVar.getParentActivity());
                                        alertDialog$Builder.f20135a.R = org.telegram.messenger.dd.L0(2131747303, null);
                                        alertDialog$Builder.f20135a.T = org.telegram.messenger.dd.L0(2131747305, null);
                                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752552, null), new c(fVar, 1));
                                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                        fVar.showDialog(alertDialog$Builder.f20135a);
                                        return;
                                    }
                                    fVar.presentFragment(new kd(org.telegram.ui.Cells.f1.i(0, "step")), true);
                                    return;
                                }
                                return;
                            case 1:
                                f fVar2 = this.f36454b;
                                if (!fVar2.f36931a.getAnimatedDrawable().f25144k0) {
                                    fVar2.f36931a.getAnimatedDrawable().N(0, false, false);
                                    fVar2.f36931a.d();
                                    return;
                                }
                                return;
                            case 2:
                                f fVar3 = this.f36454b;
                                if (!fVar3.f36931a.getAnimatedDrawable().f25144k0) {
                                    fVar3.f36931a.getAnimatedDrawable().N(0, false, false);
                                    fVar3.f36931a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f36454b.getParentLayout()).l(true, false);
                                return;
                        }
                    }
                });
                this.e.setText(org.telegram.messenger.dd.L0(2131747304, null));
                this.f36934f.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131747301, null)));
                this.f36933c.setText(org.telegram.messenger.dd.L0(2131747304, null));
                this.f36931a.d();
                this.f36939x = true;
            }
        } else {
            this.f36931a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f36931a.f(2131623973, 200, 200, null);
            this.e.setText(org.telegram.messenger.dd.L0(2131752468, null));
            this.f36934f.setText(org.telegram.messenger.dd.L0(2131752469, null));
            this.f36933c.setText(org.telegram.messenger.dd.L0(2131752470, null));
            this.f36931a.d();
            this.f36939x = true;
        }
        if (this.f36939x) {
            this.f36933c.setPadding(org.telegram.messenger.i0.L(34.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(34.0f), org.telegram.messenger.i0.L(8.0f));
            this.f36933c.setTextSize(1, 15.0f);
        }
        g0();
        return this.fragmentView;
    }

    public final void e0(Runnable runnable) {
        this.D = (pa0) runnable;
    }

    public final void f0(qv qvVar) {
        this.f36940y = qvVar;
    }

    public final void g0() {
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.t6.Di);
        boolean z10 = this.G;
        int[] iArr = this.E;
        if (!z10 || iArr[0] != themedColor || iArr[1] != themedColor2) {
            iArr[0] = themedColor;
            iArr[1] = themedColor2;
            this.G = true;
            this.f36932b.setColors(iArr);
        }
        this.f36933c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
        if (this.f36933c.getBackground() == null) {
            bi.j6 j6Var = this.f36933c;
            int L = org.telegram.messenger.i0.L(24.0f);
            j6Var.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, x02, x02));
        } else if (x02 != this.F) {
            org.telegram.ui.ActionBar.t6.H1(this.f36933c.getBackground(), x02, true);
        }
        this.F = x02;
        int[] iArr2 = this.f36937s;
        if (iArr2 != null && this.f36931a != null) {
            iArr2[0] = 3355443;
            iArr2[1] = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
            int[] iArr3 = this.f36937s;
            iArr3[2] = 16777215;
            int i11 = org.telegram.ui.ActionBar.t6.f20930d6;
            iArr3[3] = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            int[] iArr4 = this.f36937s;
            iArr4[4] = 5285866;
            iArr4[5] = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            int[] iArr5 = this.f36937s;
            iArr5[6] = 2170912;
            iArr5[7] = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            org.telegram.ui.Components.fi0 fi0Var = this.f36931a;
            int[] iArr6 = this.f36937s;
            org.telegram.ui.Components.ci0 ci0Var = fi0Var.f26172b;
            if (ci0Var != null) {
                ci0Var.f25146n = iArr6;
                ci0Var.G();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        TextView[] textViewArr = this.f36935n;
        TextView textView = textViewArr[0];
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(textView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(textViewArr[1], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(textViewArr[1], 2, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(textViewArr[2], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(textViewArr[3], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(textViewArr[4], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(textViewArr[5], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                u9.j0(getParentActivity(), 1, new e(this, 0));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20135a.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131746518, null));
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747316, null), new c(this, 0));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131751772, null), null);
            int i11 = org.telegram.ui.ActionBar.t6.L5;
            alertDialog$Builder.m(2131624114, 72, org.telegram.ui.ActionBar.t6.x0(null, i11, false), null);
            alertDialog$Builder.n(i11, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        g0();
    }
}
