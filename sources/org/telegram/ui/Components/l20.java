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
public final class l20 extends c5.a {
    public final int f37007c;
    public final Object d;

    public l20(Object obj, int i7) {
        this.f37007c = i7;
        this.d = obj;
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        switch (this.f37007c) {
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
        switch (this.f37007c) {
            case 0:
                return ((org.telegram.ui.f30) this.d).f37353p1.length;
            case 1:
                return ((org.telegram.ui.Components.voip.x0) this.d).f41315f.length;
            case 2:
                return ((org.telegram.ui.v50) this.d).G.length;
            case 3:
                if (((org.telegram.ui.v71) this.d).f52849b != 0) {
                    return 1;
                }
                return 2;
            default:
                return ((ug.y0) this.d).f59079o1.size();
        }
    }

    @Override
    public int c(Object obj) {
        switch (this.f37007c) {
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
        int i11 = this.f37007c;
        int i12 = 2;
        Bitmap bitmap = null;
        int i13 = 0;
        Object obj = this.d;
        switch (i11) {
            case 0:
                k20 k20Var = new k20(this, ((org.telegram.ui.f30) obj).getContext(), i7, 0);
                k20Var.setOnClickListener(new ci.q(this, i7, 15));
                k20Var.setFocusable(true);
                k20Var.setTag(Integer.valueOf(i7));
                k20Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                k20Var.setScaleType(ImageView.ScaleType.FIT_XY);
                k20Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(200.0f), -1));
                if (i7 == 0) {
                    k20Var.setContentDescription(org.telegram.messenger.gd.N0(2131743002, null));
                } else if (i7 == 1) {
                    k20Var.setContentDescription(org.telegram.messenger.gd.N0(2131743000, null));
                } else {
                    k20Var.setContentDescription(org.telegram.messenger.gd.N0(2131743001, null));
                }
                if (i7 == 0) {
                    i10 = 2131624176;
                } else if (i7 == 1) {
                    i10 = 2131624178;
                } else {
                    i10 = 2131624177;
                }
                org.telegram.messenger.kz i14 = org.telegram.messenger.lz.i(org.telegram.messenger.g0.y2(null, i10));
                i14.f25422s = false;
                k20Var.setImageDrawable(i14);
                if (k20Var.getParent() != null) {
                    ((ViewGroup) k20Var.getParent()).removeView(k20Var);
                }
                lVar.addView(k20Var, 0);
                return k20Var;
            case 1:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) obj;
                boolean z11 = x0Var.E;
                if (z11 && i7 == 0) {
                    ?? frameLayout = new FrameLayout(x0Var.getContext());
                    frameLayout.setBackground(new za0(true, -14602694, -13935795, -14395293, -14203560));
                    ImageView imageView2 = new ImageView(x0Var.getContext());
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    imageView2.setImageResource(2131232684);
                    frameLayout.addView(imageView2, c8.na.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
                    TextView textView = new TextView(x0Var.getContext());
                    textView.setText(org.telegram.messenger.gd.N0(2131742973, null));
                    textView.setGravity(17);
                    textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    textView.setTextColor(-1);
                    textView.setTextSize(1, 15.0f);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    frameLayout.addView(textView, c8.na.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
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
                        imageView3.setImageResource(2131231495);
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
                textView2.setTag(v50Var.f52810a);
                TextView textView3 = new TextView(lVar.getContext());
                textView3.setTag(v50Var.f52811b);
                ai.h0 h0Var = new ai.h0(lVar.getContext(), textView2, textView3);
                int i15 = org.telegram.ui.ActionBar.n6.G6;
                org.telegram.messenger.f3.l(textView2, i15, null, 1, 26.0f);
                textView2.setGravity(17);
                h0Var.addView(textView2, c8.na.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                org.telegram.ui.ActionBar.u6.U(textView3, i15, null);
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(org.telegram.messenger.g0.N(2.33f), 1.0f);
                textView3.setGravity(17);
                h0Var.addView(textView3, c8.na.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                lVar.addView(h0Var, 0);
                textView2.setText(v50Var.G[i7]);
                textView3.setText(org.telegram.messenger.g0.W2(v50Var.H[i7]));
                return h0Var;
            case 3:
                org.telegram.ui.v71 v71Var = (org.telegram.ui.v71) obj;
                if (i7 == 0) {
                    view = v71Var.f52903v0;
                } else {
                    view = v71Var.f52887o0;
                }
                lVar.addView(view);
                return view;
            default:
                ug.y0 y0Var = (ug.y0) obj;
                ug.x0 x0Var2 = new ug.x0(y0Var, y0Var.getContext(), i7);
                lVar.addView(x0Var2);
                x0Var2.f59058a = i7;
                org.telegram.ui.vs0 vs0Var = (org.telegram.ui.vs0) y0Var.f59079o1.get(i7);
                int i16 = vs0Var.f53023a;
                String str = vs0Var.d;
                CharSequence charSequence = vs0Var.f53025c;
                TextView textView4 = x0Var2.f59059b;
                j80 j80Var = x0Var2.f59060c;
                if (i16 != 0 && i16 != 14 && i16 != 28) {
                    if (y0Var.f59090z1) {
                        int i17 = y0Var.f59089y1;
                        if (i17 == 4) {
                            textView4.setText(org.telegram.messenger.gd.N0(2131754350, null));
                            j80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131754349, null)));
                        } else if (i17 == 3) {
                            textView4.setText(org.telegram.messenger.gd.N0(2131746798, null));
                            j80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131746796, null)));
                        } else if (i17 == 24) {
                            textView4.setText(org.telegram.messenger.gd.N0(2131746778, null));
                            j80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131746776, null)));
                        } else if (i17 == 10) {
                            textView4.setText(org.telegram.messenger.gd.N0(2131746826, null));
                            j80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131746824, null)));
                        } else if (i17 == 2) {
                            textView4.setText(org.telegram.messenger.gd.N0(2131746818, null));
                            j80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131746816, null)));
                        } else if (i17 == 9) {
                            textView4.setText(org.telegram.messenger.gd.N0(2131746831, null));
                            j80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131746829, null)));
                        } else if (i17 == 8) {
                            textView4.setText(org.telegram.messenger.gd.N0(2131746768, null));
                            j80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131746766, null)));
                        } else if (i17 == 13) {
                            textView4.setText(org.telegram.messenger.gd.N0(2131746772, null));
                            j80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131746771, null)));
                        } else if (i17 == 38) {
                            textView4.setText(org.telegram.messenger.gd.N0(2131746815, null));
                            j80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131746814, null)));
                        } else if (i17 == 22) {
                            textView4.setText(org.telegram.messenger.gd.N0(2131746765, null));
                            j80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131746764, null)));
                        } else if (i17 == 23) {
                            textView4.setText(org.telegram.messenger.gd.N0(2131746791, null));
                            j80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131746790, null)));
                        } else if (i17 == 41) {
                            textView4.setText(org.telegram.messenger.gd.N0(2131746784, null));
                            j80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131746783, null)));
                        } else {
                            textView4.setText(charSequence);
                            j80Var.setText(org.telegram.messenger.g0.W2(str));
                        }
                        x0Var2.h = false;
                    } else {
                        textView4.setText(charSequence);
                        j80Var.setText(org.telegram.messenger.g0.W2(str));
                        x0Var2.h = false;
                    }
                } else {
                    textView4.setText("");
                    j80Var.setText("");
                    x0Var2.h = true;
                }
                j80Var.setMaxWidth(hi.u3.a(j80Var.getText(), j80Var.getPaint()));
                x0Var2.requestLayout();
                if (vs0Var.f53023a == 40) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && x0Var2.d == null) {
                    LinearLayout linearLayout = new LinearLayout(x0Var2.getContext());
                    x0Var2.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = x0Var2.getContext();
                    int i18 = ug.y0.J1;
                    ki.i iVar = new ki.i(context, y0Var.J0, true);
                    iVar.a(2131231825, org.telegram.messenger.gd.N0(2131749398, null), org.telegram.messenger.gd.N0(2131749399, null));
                    x0Var2.d.addView(r2[0], c8.na.o(-1, -2));
                    ki.i iVar2 = new ki.i(x0Var2.getContext(), y0Var.J0, true);
                    iVar2.a(2131231821, org.telegram.messenger.gd.N0(2131749396, null), org.telegram.messenger.gd.N0(2131749397, null));
                    x0Var2.d.addView(r2[1], c8.na.o(-1, -2));
                    ki.i iVar3 = new ki.i(x0Var2.getContext(), y0Var.J0, true);
                    ki.i[] iVarArr = {iVar, iVar2, iVar3};
                    iVar3.a(2131231928, org.telegram.messenger.gd.N0(2131749394, null), org.telegram.messenger.gd.N0(2131749395, null));
                    x0Var2.d.addView(iVarArr[2], c8.na.o(-1, -2));
                    x0Var2.addView(x0Var2.d, c8.na.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = x0Var2.d;
                if (linearLayout2 != null) {
                    if (!z10) {
                        i13 = 8;
                    }
                    linearLayout2.setVisibility(i13);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) j80Var.getLayoutParams();
                if (z10) {
                    f10 = 6.0f;
                } else {
                    f10 = 10.0f;
                }
                marginLayoutParams.topMargin = org.telegram.messenger.g0.L(f10);
                return x0Var2;
        }
    }

    @Override
    public final boolean f(View view, Object obj) {
        switch (this.f37007c) {
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
        switch (this.f37007c) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.v50 v50Var = (org.telegram.ui.v50) this.d;
                v50Var.f52813e.setCurrentPage(i7);
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
