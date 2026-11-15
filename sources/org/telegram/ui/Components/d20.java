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
import org.telegram.ui.t71;
public final class d20 extends c5.a {
    public final int f33818c;
    public final Object d;

    public d20(Object obj, int i7) {
        this.f33818c = i7;
        this.d = obj;
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        switch (this.f33818c) {
            case 0:
                lVar.removeView((View) obj);
                return;
            case 1:
                lVar.removeView((View) obj);
                return;
            case 2:
                lVar.removeView((View) obj);
                return;
            case 3:
                lVar.removeView((View) obj);
                return;
            default:
                lVar.removeView((View) obj);
                return;
        }
    }

    @Override
    public final int b() {
        switch (this.f33818c) {
            case 0:
                return ((org.telegram.ui.d30) this.d).f34154p1.length;
            case 1:
                return ((org.telegram.ui.Components.voip.x0) this.d).f41039f.length;
            case 2:
                return ((org.telegram.ui.t50) this.d).G.length;
            case 3:
                if (((t71) this.d).f51413b != 0) {
                    return 1;
                }
                return 2;
            default:
                return ((ug.x0) this.d).f58371o1.size();
        }
    }

    @Override
    public int c(Object obj) {
        switch (this.f33818c) {
            case 3:
                return -1;
            default:
                return super.c(obj);
        }
    }

    @Override
    public final Object e(c5.l lVar, int i7) {
        int i10;
        ImageView imageView;
        View view;
        boolean z10;
        float f10;
        int i11 = this.f33818c;
        int i12 = 2;
        Bitmap bitmap = null;
        int i13 = 0;
        Object obj = this.d;
        switch (i11) {
            case 0:
                c20 c20Var = new c20(this, ((org.telegram.ui.d30) obj).getContext(), i7, 0);
                c20Var.setOnClickListener(new ci.q(this, i7, 13));
                c20Var.setFocusable(true);
                c20Var.setTag(Integer.valueOf(i7));
                c20Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                c20Var.setScaleType(ImageView.ScaleType.FIT_XY);
                c20Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(200.0f), -1));
                if (i7 == 0) {
                    c20Var.setContentDescription(org.telegram.messenger.hd.M0(2131743252, null));
                } else if (i7 == 1) {
                    c20Var.setContentDescription(org.telegram.messenger.hd.M0(2131743250, null));
                } else {
                    c20Var.setContentDescription(org.telegram.messenger.hd.M0(2131743251, null));
                }
                if (i7 == 0) {
                    i10 = 2131624176;
                } else if (i7 == 1) {
                    i10 = 2131624178;
                } else {
                    i10 = 2131624177;
                }
                org.telegram.messenger.pz i14 = org.telegram.messenger.qz.i(org.telegram.messenger.g0.y2(null, i10));
                i14.f26042s = false;
                c20Var.setImageDrawable(i14);
                if (c20Var.getParent() != null) {
                    ((ViewGroup) c20Var.getParent()).removeView(c20Var);
                }
                lVar.addView(c20Var, 0);
                return c20Var;
            case 1:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) obj;
                boolean z11 = x0Var.E;
                if (z11 && i7 == 0) {
                    ?? frameLayout = new FrameLayout(x0Var.getContext());
                    frameLayout.setBackground(new ra0(true, -14602694, -13935795, -14395293, -14203560));
                    ImageView imageView2 = new ImageView(x0Var.getContext());
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    imageView2.setImageResource(2131232680);
                    frameLayout.addView(imageView2, c8.ja.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
                    TextView textView = new TextView(x0Var.getContext());
                    textView.setText(org.telegram.messenger.hd.M0(2131743223, null));
                    textView.setGravity(17);
                    textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    textView.setTextColor(-1);
                    textView.setTextSize(1, 15.0f);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    frameLayout.addView(textView, c8.ja.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
                    imageView = frameLayout;
                } else {
                    ImageView imageView3 = new ImageView(x0Var.getContext());
                    imageView3.setTag(Integer.valueOf(i7));
                    try {
                        File h = org.telegram.messenger.t0.h();
                        StringBuilder sb2 = new StringBuilder("cthumb");
                        if (i7 == 0 || (i7 == 1 && z11)) {
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
                lVar.addView(imageView, 0);
                return imageView;
            case 2:
                TextView textView2 = new TextView(lVar.getContext());
                org.telegram.ui.t50 t50Var = (org.telegram.ui.t50) obj;
                textView2.setTag(t50Var.f51374a);
                TextView textView3 = new TextView(lVar.getContext());
                textView3.setTag(t50Var.f51375b);
                ai.k0 k0Var = new ai.k0(lVar.getContext(), textView2, textView3);
                int i15 = org.telegram.ui.ActionBar.j6.G6;
                org.telegram.messenger.k5.m(textView2, i15, null, 1, 26.0f);
                textView2.setGravity(17);
                k0Var.addView(textView2, c8.ja.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                org.telegram.ui.ActionBar.q6.U(textView3, i15, null);
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(org.telegram.messenger.g0.N(2.33f), 1.0f);
                textView3.setGravity(17);
                k0Var.addView(textView3, c8.ja.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                lVar.addView(k0Var, 0);
                textView2.setText(t50Var.G[i7]);
                textView3.setText(org.telegram.messenger.g0.X2(t50Var.H[i7]));
                return k0Var;
            case 3:
                t71 t71Var = (t71) obj;
                if (i7 == 0) {
                    view = t71Var.f51467v0;
                } else {
                    view = t71Var.f51451o0;
                }
                lVar.addView(view);
                return view;
            default:
                ug.x0 x0Var2 = (ug.x0) obj;
                ug.w0 w0Var = new ug.w0(x0Var2, x0Var2.getContext(), i7);
                lVar.addView(w0Var);
                w0Var.f58352a = i7;
                org.telegram.ui.ss0 ss0Var = (org.telegram.ui.ss0) x0Var2.f58371o1.get(i7);
                int i16 = ss0Var.f51269a;
                String str = ss0Var.d;
                CharSequence charSequence = ss0Var.f51271c;
                TextView textView4 = w0Var.f58353b;
                z70 z70Var = w0Var.f58354c;
                if (i16 != 0 && i16 != 14 && i16 != 28) {
                    if (x0Var2.f58382z1) {
                        int i17 = x0Var2.f58381y1;
                        if (i17 == 4) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131754353, null));
                            z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131754352, null)));
                        } else if (i17 == 3) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131746992, null));
                            z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746990, null)));
                        } else if (i17 == 24) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131746972, null));
                            z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746970, null)));
                        } else if (i17 == 10) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131747020, null));
                            z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747018, null)));
                        } else if (i17 == 2) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131747012, null));
                            z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747010, null)));
                        } else if (i17 == 9) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131747025, null));
                            z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747023, null)));
                        } else if (i17 == 8) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131746962, null));
                            z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746960, null)));
                        } else if (i17 == 13) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131746966, null));
                            z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746965, null)));
                        } else if (i17 == 38) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131747009, null));
                            z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747008, null)));
                        } else if (i17 == 22) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131746959, null));
                            z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746958, null)));
                        } else if (i17 == 23) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131746985, null));
                            z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746984, null)));
                        } else if (i17 == 41) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131746978, null));
                            z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746977, null)));
                        } else {
                            textView4.setText(charSequence);
                            z70Var.setText(org.telegram.messenger.g0.X2(str));
                        }
                        w0Var.h = false;
                    } else {
                        textView4.setText(charSequence);
                        z70Var.setText(org.telegram.messenger.g0.X2(str));
                        w0Var.h = false;
                    }
                } else {
                    textView4.setText("");
                    z70Var.setText("");
                    w0Var.h = true;
                }
                z70Var.setMaxWidth(hi.l3.a(z70Var.getText(), z70Var.getPaint()));
                w0Var.requestLayout();
                if (ss0Var.f51269a == 40) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && w0Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(w0Var.getContext());
                    w0Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = w0Var.getContext();
                    int i18 = ug.x0.J1;
                    ki.j jVar = new ki.j(context, x0Var2.J0, true);
                    jVar.a(2131231821, org.telegram.messenger.hd.M0(2131749574, null), org.telegram.messenger.hd.M0(2131749575, null));
                    w0Var.d.addView(r2[0], c8.ja.o(-1, -2));
                    ki.j jVar2 = new ki.j(w0Var.getContext(), x0Var2.J0, true);
                    jVar2.a(2131231817, org.telegram.messenger.hd.M0(2131749572, null), org.telegram.messenger.hd.M0(2131749573, null));
                    w0Var.d.addView(r2[1], c8.ja.o(-1, -2));
                    ki.j jVar3 = new ki.j(w0Var.getContext(), x0Var2.J0, true);
                    ki.j[] jVarArr = {jVar, jVar2, jVar3};
                    jVar3.a(2131231924, org.telegram.messenger.hd.M0(2131749570, null), org.telegram.messenger.hd.M0(2131749571, null));
                    w0Var.d.addView(jVarArr[2], c8.ja.o(-1, -2));
                    w0Var.addView(w0Var.d, c8.ja.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = w0Var.d;
                if (linearLayout2 != null) {
                    if (!z10) {
                        i13 = 8;
                    }
                    linearLayout2.setVisibility(i13);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) z70Var.getLayoutParams();
                if (z10) {
                    f10 = 6.0f;
                } else {
                    f10 = 10.0f;
                }
                marginLayoutParams.topMargin = org.telegram.messenger.g0.L(f10);
                return w0Var;
        }
    }

    @Override
    public final boolean f(View view, Object obj) {
        switch (this.f33818c) {
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
        switch (this.f33818c) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.t50 t50Var = (org.telegram.ui.t50) this.d;
                t50Var.f51377e.setCurrentPage(i7);
                t50Var.I = i7;
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
