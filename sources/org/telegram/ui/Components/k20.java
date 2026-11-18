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
public final class k20 extends c5.a {
    public final int f36642c;
    public final Object d;

    public k20(Object obj, int i7) {
        this.f36642c = i7;
        this.d = obj;
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        switch (this.f36642c) {
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
        switch (this.f36642c) {
            case 0:
                return ((org.telegram.ui.g30) this.d).f36986p1.length;
            case 1:
                return ((org.telegram.ui.Components.voip.w0) this.d).f41283f.length;
            case 2:
                return ((org.telegram.ui.v50) this.d).G.length;
            case 3:
                if (((org.telegram.ui.x71) this.d).f53674b != 0) {
                    return 1;
                }
                return 2;
            default:
                return ((ug.z0) this.d).f58959o1.size();
        }
    }

    @Override
    public int c(Object obj) {
        switch (this.f36642c) {
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
        int i11 = this.f36642c;
        int i12 = 2;
        Bitmap bitmap = null;
        int i13 = 0;
        Object obj = this.d;
        switch (i11) {
            case 0:
                j20 j20Var = new j20(this, ((org.telegram.ui.g30) obj).getContext(), i7, 0);
                j20Var.setOnClickListener(new ci.q(this, i7, 15));
                j20Var.setFocusable(true);
                j20Var.setTag(Integer.valueOf(i7));
                j20Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                j20Var.setScaleType(ImageView.ScaleType.FIT_XY);
                j20Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(200.0f), -1));
                if (i7 == 0) {
                    j20Var.setContentDescription(org.telegram.messenger.gd.M0(2131743015, null));
                } else if (i7 == 1) {
                    j20Var.setContentDescription(org.telegram.messenger.gd.M0(2131743013, null));
                } else {
                    j20Var.setContentDescription(org.telegram.messenger.gd.M0(2131743014, null));
                }
                if (i7 == 0) {
                    i10 = 2131624176;
                } else if (i7 == 1) {
                    i10 = 2131624178;
                } else {
                    i10 = 2131624177;
                }
                org.telegram.messenger.lz i14 = org.telegram.messenger.mz.i(org.telegram.messenger.g0.y2(null, i10));
                i14.f25499s = false;
                j20Var.setImageDrawable(i14);
                if (j20Var.getParent() != null) {
                    ((ViewGroup) j20Var.getParent()).removeView(j20Var);
                }
                lVar.addView(j20Var, 0);
                return j20Var;
            case 1:
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) obj;
                boolean z11 = w0Var.E;
                if (z11 && i7 == 0) {
                    ?? frameLayout = new FrameLayout(w0Var.getContext());
                    frameLayout.setBackground(new bb0(true, -14602694, -13935795, -14395293, -14203560));
                    ImageView imageView2 = new ImageView(w0Var.getContext());
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    imageView2.setImageResource(2131232681);
                    frameLayout.addView(imageView2, c8.ma.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
                    TextView textView = new TextView(w0Var.getContext());
                    textView.setText(org.telegram.messenger.gd.M0(2131742986, null));
                    textView.setGravity(17);
                    textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    textView.setTextColor(-1);
                    textView.setTextSize(1, 15.0f);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
                    imageView = frameLayout;
                } else {
                    ImageView imageView3 = new ImageView(w0Var.getContext());
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
                org.telegram.ui.v50 v50Var = (org.telegram.ui.v50) obj;
                textView2.setTag(v50Var.f52675a);
                TextView textView3 = new TextView(lVar.getContext());
                textView3.setTag(v50Var.f52676b);
                ai.k0 k0Var = new ai.k0(lVar.getContext(), textView2, textView3);
                int i15 = org.telegram.ui.ActionBar.n6.G6;
                org.telegram.messenger.f3.l(textView2, i15, null, 1, 26.0f);
                textView2.setGravity(17);
                k0Var.addView(textView2, c8.ma.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                org.telegram.ui.ActionBar.u6.U(textView3, i15, null);
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(org.telegram.messenger.g0.N(2.33f), 1.0f);
                textView3.setGravity(17);
                k0Var.addView(textView3, c8.ma.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                lVar.addView(k0Var, 0);
                textView2.setText(v50Var.G[i7]);
                textView3.setText(org.telegram.messenger.g0.W2(v50Var.H[i7]));
                return k0Var;
            case 3:
                org.telegram.ui.x71 x71Var = (org.telegram.ui.x71) obj;
                if (i7 == 0) {
                    view = x71Var.f53728v0;
                } else {
                    view = x71Var.f53712o0;
                }
                lVar.addView(view);
                return view;
            default:
                ug.z0 z0Var = (ug.z0) obj;
                ug.y0 y0Var = new ug.y0(z0Var, z0Var.getContext(), i7);
                lVar.addView(y0Var);
                y0Var.f58950a = i7;
                org.telegram.ui.ws0 ws0Var = (org.telegram.ui.ws0) z0Var.f58959o1.get(i7);
                int i16 = ws0Var.f53469a;
                String str = ws0Var.d;
                CharSequence charSequence = ws0Var.f53471c;
                TextView textView4 = y0Var.f58951b;
                k80 k80Var = y0Var.f58952c;
                if (i16 != 0 && i16 != 14 && i16 != 28) {
                    if (z0Var.f58970z1) {
                        int i17 = z0Var.f58969y1;
                        if (i17 == 4) {
                            textView4.setText(org.telegram.messenger.gd.M0(2131754351, null));
                            k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131754350, null)));
                        } else if (i17 == 3) {
                            textView4.setText(org.telegram.messenger.gd.M0(2131746799, null));
                            k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746797, null)));
                        } else if (i17 == 24) {
                            textView4.setText(org.telegram.messenger.gd.M0(2131746779, null));
                            k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746777, null)));
                        } else if (i17 == 10) {
                            textView4.setText(org.telegram.messenger.gd.M0(2131746827, null));
                            k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746825, null)));
                        } else if (i17 == 2) {
                            textView4.setText(org.telegram.messenger.gd.M0(2131746819, null));
                            k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746817, null)));
                        } else if (i17 == 9) {
                            textView4.setText(org.telegram.messenger.gd.M0(2131746832, null));
                            k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746830, null)));
                        } else if (i17 == 8) {
                            textView4.setText(org.telegram.messenger.gd.M0(2131746769, null));
                            k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746767, null)));
                        } else if (i17 == 13) {
                            textView4.setText(org.telegram.messenger.gd.M0(2131746773, null));
                            k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746772, null)));
                        } else if (i17 == 38) {
                            textView4.setText(org.telegram.messenger.gd.M0(2131746816, null));
                            k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746815, null)));
                        } else if (i17 == 22) {
                            textView4.setText(org.telegram.messenger.gd.M0(2131746766, null));
                            k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746765, null)));
                        } else if (i17 == 23) {
                            textView4.setText(org.telegram.messenger.gd.M0(2131746792, null));
                            k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746791, null)));
                        } else if (i17 == 41) {
                            textView4.setText(org.telegram.messenger.gd.M0(2131746785, null));
                            k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746784, null)));
                        } else {
                            textView4.setText(charSequence);
                            k80Var.setText(org.telegram.messenger.g0.W2(str));
                        }
                        y0Var.h = false;
                    } else {
                        textView4.setText(charSequence);
                        k80Var.setText(org.telegram.messenger.g0.W2(str));
                        y0Var.h = false;
                    }
                } else {
                    textView4.setText("");
                    k80Var.setText("");
                    y0Var.h = true;
                }
                k80Var.setMaxWidth(hi.m3.a(k80Var.getText(), k80Var.getPaint()));
                y0Var.requestLayout();
                if (ws0Var.f53469a == 40) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && y0Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(y0Var.getContext());
                    y0Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = y0Var.getContext();
                    int i18 = ug.z0.J1;
                    ki.j jVar = new ki.j(context, z0Var.J0, true);
                    jVar.a(2131231822, org.telegram.messenger.gd.M0(2131749399, null), org.telegram.messenger.gd.M0(2131749400, null));
                    y0Var.d.addView(r2[0], c8.ma.o(-1, -2));
                    ki.j jVar2 = new ki.j(y0Var.getContext(), z0Var.J0, true);
                    jVar2.a(2131231818, org.telegram.messenger.gd.M0(2131749397, null), org.telegram.messenger.gd.M0(2131749398, null));
                    y0Var.d.addView(r2[1], c8.ma.o(-1, -2));
                    ki.j jVar3 = new ki.j(y0Var.getContext(), z0Var.J0, true);
                    ki.j[] jVarArr = {jVar, jVar2, jVar3};
                    jVar3.a(2131231925, org.telegram.messenger.gd.M0(2131749395, null), org.telegram.messenger.gd.M0(2131749396, null));
                    y0Var.d.addView(jVarArr[2], c8.ma.o(-1, -2));
                    y0Var.addView(y0Var.d, c8.ma.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = y0Var.d;
                if (linearLayout2 != null) {
                    if (!z10) {
                        i13 = 8;
                    }
                    linearLayout2.setVisibility(i13);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) k80Var.getLayoutParams();
                if (z10) {
                    f10 = 6.0f;
                } else {
                    f10 = 10.0f;
                }
                marginLayoutParams.topMargin = org.telegram.messenger.g0.L(f10);
                return y0Var;
        }
    }

    @Override
    public final boolean f(View view, Object obj) {
        switch (this.f36642c) {
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
        switch (this.f36642c) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.v50 v50Var = (org.telegram.ui.v50) this.d;
                v50Var.f52678e.setCurrentPage(i7);
                v50Var.I = i7;
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
