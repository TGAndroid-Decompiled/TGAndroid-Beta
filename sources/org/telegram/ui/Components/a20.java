package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import org.telegram.ui.u71;
public final class a20 extends c5.a {
    public final int f31656c;
    public final Object d;

    public a20(Object obj, int i7) {
        this.f31656c = i7;
        this.d = obj;
    }

    @Override
    public final void a(c5.k kVar, Object obj) {
        switch (this.f31656c) {
            case 0:
                kVar.removeView((View) obj);
                return;
            case 1:
                kVar.removeView((View) obj);
                return;
            case 2:
                kVar.removeView((View) obj);
                return;
            case 3:
                kVar.removeView((View) obj);
                return;
            default:
                kVar.removeView((View) obj);
                return;
        }
    }

    @Override
    public final int b() {
        switch (this.f31656c) {
            case 0:
                return ((org.telegram.ui.c30) this.d).l1.length;
            case 1:
                return ((org.telegram.ui.Components.voip.t0) this.d).f39478f.length;
            case 2:
                return ((org.telegram.ui.u50) this.d).F.length;
            case 3:
                if (((u71) this.d).f50270b != 0) {
                    return 1;
                }
                return 2;
            default:
                return ((ug.w0) this.d).f56754k1.size();
        }
    }

    @Override
    public int c(Object obj) {
        switch (this.f31656c) {
            case 3:
                return -1;
            default:
                return super.c(obj);
        }
    }

    @Override
    public final Object e(c5.k kVar, int i7) {
        int i10;
        ImageView imageView;
        View view;
        boolean z9;
        float f10;
        int i11 = this.f31656c;
        int i12 = 2;
        Bitmap bitmap = null;
        int i13 = 0;
        Object obj = this.d;
        switch (i11) {
            case 0:
                z10 z10Var = new z10(this, ((org.telegram.ui.c30) obj).getContext(), i7, 0);
                z10Var.setOnClickListener(new ai.v(this, i7, 13));
                z10Var.setFocusable(true);
                z10Var.setTag(Integer.valueOf(i7));
                z10Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                z10Var.setScaleType(ImageView.ScaleType.FIT_XY);
                z10Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(200.0f), -1));
                if (i7 == 0) {
                    z10Var.setContentDescription(org.telegram.messenger.hd.M0(2131743253, null));
                } else if (i7 == 1) {
                    z10Var.setContentDescription(org.telegram.messenger.hd.M0(2131743251, null));
                } else {
                    z10Var.setContentDescription(org.telegram.messenger.hd.M0(2131743252, null));
                }
                if (i7 == 0) {
                    i10 = 2131624175;
                } else if (i7 == 1) {
                    i10 = 2131624177;
                } else {
                    i10 = 2131624176;
                }
                org.telegram.messenger.rz i14 = org.telegram.messenger.sz.i(org.telegram.messenger.g0.y2(null, i10));
                i14.f25391s = false;
                z10Var.setImageDrawable(i14);
                if (z10Var.getParent() != null) {
                    ((ViewGroup) z10Var.getParent()).removeView(z10Var);
                }
                kVar.addView(z10Var, 0);
                return z10Var;
            case 1:
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) obj;
                boolean z10 = t0Var.D;
                if (z10 && i7 == 0) {
                    ?? frameLayout = new FrameLayout(t0Var.getContext());
                    frameLayout.setBackground(new qa0(true, -14602694, -13935795, -14395293, -14203560));
                    ImageView imageView2 = new ImageView(t0Var.getContext());
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    imageView2.setImageResource(2131232679);
                    frameLayout.addView(imageView2, c8.ha.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
                    TextView textView = new TextView(t0Var.getContext());
                    textView.setText(org.telegram.messenger.hd.M0(2131743224, null));
                    textView.setGravity(17);
                    textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    textView.setTextColor(-1);
                    textView.setTextSize(1, 15.0f);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
                    imageView = frameLayout;
                } else {
                    ImageView imageView3 = new ImageView(t0Var.getContext());
                    imageView3.setTag(Integer.valueOf(i7));
                    try {
                        File h = org.telegram.messenger.t0.h();
                        StringBuilder sb2 = new StringBuilder("cthumb");
                        if (i7 == 0 || (i7 == 1 && z10)) {
                            i12 = 1;
                        }
                        sb2.append(i12);
                        sb2.append(".jpg");
                        bitmap = BitmapFactory.decodeFile(new File(h, sb2.toString()).getAbsolutePath());
                    } catch (Throwable unused) {
                    }
                    if (bitmap != null) {
                        imageView3.setImageBitmap(bitmap);
                    } else {
                        imageView3.setImageResource(2131231492);
                    }
                    imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
                    imageView = imageView3;
                }
                if (imageView.getParent() != null) {
                    ((ViewGroup) imageView.getParent()).removeView(imageView);
                }
                kVar.addView(imageView, 0);
                return imageView;
            case 2:
                TextView textView2 = new TextView(kVar.getContext());
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) obj;
                textView2.setTag(u50Var.f50228a);
                TextView textView3 = new TextView(kVar.getContext());
                textView3.setTag(u50Var.f50229b);
                bi.x5 x5Var = new bi.x5(kVar.getContext(), textView2, textView3);
                int i15 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.messenger.k5.n(textView2, i15, null, 1, 26.0f);
                textView2.setGravity(17);
                x5Var.addView(textView2, c8.ha.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                org.telegram.ui.ActionBar.r6.V(textView3, i15, null);
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(org.telegram.messenger.g0.N(2.33f), 1.0f);
                textView3.setGravity(17);
                x5Var.addView(textView3, c8.ha.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                kVar.addView(x5Var, 0);
                textView2.setText(u50Var.F[i7]);
                textView3.setText(org.telegram.messenger.g0.X2(u50Var.G[i7]));
                return x5Var;
            case 3:
                u71 u71Var = (u71) obj;
                if (i7 == 0) {
                    view = u71Var.f50321u0;
                } else {
                    view = u71Var.f50306n0;
                }
                kVar.addView(view);
                return view;
            default:
                ug.w0 w0Var = (ug.w0) obj;
                ug.v0 v0Var = new ug.v0(w0Var, w0Var.getContext(), i7);
                kVar.addView(v0Var);
                v0Var.f56744a = i7;
                org.telegram.ui.vs0 vs0Var = (org.telegram.ui.vs0) w0Var.f56754k1.get(i7);
                int i16 = vs0Var.f50823a;
                String str = vs0Var.d;
                CharSequence charSequence = vs0Var.f50825c;
                TextView textView4 = v0Var.f56745b;
                w70 w70Var = v0Var.f56746c;
                if (i16 != 0 && i16 != 14 && i16 != 28) {
                    if (w0Var.f56763v1) {
                        int i17 = w0Var.f56762u1;
                        if (i17 == 4) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131754353, null));
                            w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131754352, null)));
                        } else if (i17 == 3) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131746991, null));
                            w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746989, null)));
                        } else if (i17 == 24) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131746971, null));
                            w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746969, null)));
                        } else if (i17 == 10) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131747019, null));
                            w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747017, null)));
                        } else if (i17 == 2) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131747011, null));
                            w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747009, null)));
                        } else if (i17 == 9) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131747024, null));
                            w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747022, null)));
                        } else if (i17 == 8) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131746961, null));
                            w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746959, null)));
                        } else if (i17 == 13) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131746965, null));
                            w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746964, null)));
                        } else if (i17 == 38) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131747008, null));
                            w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747007, null)));
                        } else if (i17 == 22) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131746958, null));
                            w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746957, null)));
                        } else if (i17 == 23) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131746984, null));
                            w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746983, null)));
                        } else if (i17 == 41) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131746977, null));
                            w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746976, null)));
                        } else {
                            textView4.setText(charSequence);
                            w70Var.setText(org.telegram.messenger.g0.X2(str));
                        }
                        v0Var.h = false;
                    } else {
                        textView4.setText(charSequence);
                        w70Var.setText(org.telegram.messenger.g0.X2(str));
                        v0Var.h = false;
                    }
                } else {
                    textView4.setText("");
                    w70Var.setText("");
                    v0Var.h = true;
                }
                w70Var.setMaxWidth(fi.m3.a(w70Var.getText(), w70Var.getPaint()));
                v0Var.requestLayout();
                if (vs0Var.f50823a == 40) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 && v0Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(v0Var.getContext());
                    v0Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = v0Var.getContext();
                    int i18 = ug.w0.F1;
                    hi.i iVar = new hi.i(context, w0Var.I0, true);
                    iVar.a(2131231821, org.telegram.messenger.hd.M0(2131749573, null), org.telegram.messenger.hd.M0(2131749574, null));
                    v0Var.d.addView(r2[0], c8.ha.o(-1, -2));
                    hi.i iVar2 = new hi.i(v0Var.getContext(), w0Var.I0, true);
                    iVar2.a(2131231817, org.telegram.messenger.hd.M0(2131749571, null), org.telegram.messenger.hd.M0(2131749572, null));
                    v0Var.d.addView(r2[1], c8.ha.o(-1, -2));
                    hi.i iVar3 = new hi.i(v0Var.getContext(), w0Var.I0, true);
                    hi.i[] iVarArr = {iVar, iVar2, iVar3};
                    iVar3.a(2131231924, org.telegram.messenger.hd.M0(2131749569, null), org.telegram.messenger.hd.M0(2131749570, null));
                    v0Var.d.addView(iVarArr[2], c8.ha.o(-1, -2));
                    v0Var.addView(v0Var.d, c8.ha.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = v0Var.d;
                if (linearLayout2 != null) {
                    if (!z9) {
                        i13 = 8;
                    }
                    linearLayout2.setVisibility(i13);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) w70Var.getLayoutParams();
                if (z9) {
                    f10 = 6.0f;
                } else {
                    f10 = 10.0f;
                }
                marginLayoutParams.topMargin = org.telegram.messenger.g0.L(f10);
                return v0Var;
        }
    }

    @Override
    public final boolean f(View view, Object obj) {
        switch (this.f31656c) {
            case 0:
                return view.equals(obj);
            case 1:
                return view.equals(obj);
            case 2:
                return view.equals(obj);
            case 3:
                if (obj == view) {
                    return true;
                }
                return false;
            default:
                if (view == obj) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public void h(int i7) {
        switch (this.f31656c) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) this.d;
                u50Var.f50231e.setCurrentPage(i7);
                u50Var.H = i7;
                return;
            default:
                return;
        }
    }

    private final void j(int i7) {
    }

    private final void k(int i7) {
    }
}
