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
import org.telegram.ui.l71;
public final class w10 extends b5.a {
    public final int f39859c;
    public final Object d;

    public w10(Object obj, int i3) {
        this.f39859c = i3;
        this.d = obj;
    }

    @Override
    public final void a(b5.l lVar, Object obj) {
        switch (this.f39859c) {
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
        switch (this.f39859c) {
            case 0:
                return ((org.telegram.ui.x20) this.d).m1.length;
            case 1:
                return ((org.telegram.ui.Components.voip.f0) this.d).f39329f.length;
            case 2:
                return ((org.telegram.ui.o50) this.d).G.length;
            case 3:
                if (((l71) this.d).f47145b != 0) {
                    return 1;
                }
                return 2;
            default:
                return ((vg.v0) this.d).f56875l1.size();
        }
    }

    @Override
    public int c(Object obj) {
        switch (this.f39859c) {
            case 3:
                return -1;
            default:
                return super.c(obj);
        }
    }

    @Override
    public final Object e(b5.l lVar, int i3) {
        int i10;
        ImageView imageView;
        View view;
        boolean z10;
        float f10;
        int i11 = this.f39859c;
        int i12 = 2;
        Bitmap bitmap = null;
        int i13 = 0;
        Object obj = this.d;
        switch (i11) {
            case 0:
                v10 v10Var = new v10(this, ((org.telegram.ui.x20) obj).getContext(), i3, 0);
                v10Var.setOnClickListener(new bi.q(this, i3, 13));
                v10Var.setFocusable(true);
                v10Var.setTag(Integer.valueOf(i3));
                v10Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                v10Var.setScaleType(ImageView.ScaleType.FIT_XY);
                v10Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(200.0f), -1));
                if (i3 == 0) {
                    v10Var.setContentDescription(org.telegram.messenger.bd.M0(2131743262, null));
                } else if (i3 == 1) {
                    v10Var.setContentDescription(org.telegram.messenger.bd.M0(2131743260, null));
                } else {
                    v10Var.setContentDescription(org.telegram.messenger.bd.M0(2131743261, null));
                }
                if (i3 == 0) {
                    i10 = 2131624175;
                } else if (i3 == 1) {
                    i10 = 2131624177;
                } else {
                    i10 = 2131624176;
                }
                org.telegram.messenger.jz i14 = org.telegram.messenger.kz.i(org.telegram.messenger.g0.y2(null, i10));
                i14.f23776s = false;
                v10Var.setImageDrawable(i14);
                if (v10Var.getParent() != null) {
                    ((ViewGroup) v10Var.getParent()).removeView(v10Var);
                }
                lVar.addView(v10Var, 0);
                return v10Var;
            case 1:
                org.telegram.ui.Components.voip.f0 f0Var = (org.telegram.ui.Components.voip.f0) obj;
                boolean z11 = f0Var.E;
                if (z11 && i3 == 0) {
                    ?? frameLayout = new FrameLayout(f0Var.getContext());
                    frameLayout.setBackground(new la0(true, -14602694, -13935795, -14395293, -14203560));
                    ImageView imageView2 = new ImageView(f0Var.getContext());
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    imageView2.setImageResource(2131232677);
                    frameLayout.addView(imageView2, b8.mf.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
                    TextView textView = new TextView(f0Var.getContext());
                    textView.setText(org.telegram.messenger.bd.M0(2131743233, null));
                    textView.setGravity(17);
                    textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    textView.setTextColor(-1);
                    textView.setTextSize(1, 15.0f);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    frameLayout.addView(textView, b8.mf.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
                    imageView = frameLayout;
                } else {
                    ImageView imageView3 = new ImageView(f0Var.getContext());
                    imageView3.setTag(Integer.valueOf(i3));
                    try {
                        File h = org.telegram.messenger.t0.h();
                        StringBuilder sb2 = new StringBuilder("cthumb");
                        if (i3 == 0 || (i3 == 1 && z11)) {
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
                org.telegram.ui.o50 o50Var = (org.telegram.ui.o50) obj;
                textView2.setTag(o50Var.f48188a);
                TextView textView3 = new TextView(lVar.getContext());
                textView3.setTag(o50Var.f48189b);
                ai.c0 c0Var = new ai.c0(lVar.getContext(), textView2, textView3);
                int i15 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.messenger.k5.n(textView2, i15, null, 1, 26.0f);
                textView2.setGravity(17);
                c0Var.addView(textView2, b8.mf.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                org.telegram.ui.ActionBar.r6.V(textView3, i15, null);
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(org.telegram.messenger.g0.N(2.33f), 1.0f);
                textView3.setGravity(17);
                c0Var.addView(textView3, b8.mf.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                lVar.addView(c0Var, 0);
                textView2.setText(o50Var.G[i3]);
                textView3.setText(org.telegram.messenger.g0.X2(o50Var.H[i3]));
                return c0Var;
            case 3:
                l71 l71Var = (l71) obj;
                if (i3 == 0) {
                    view = l71Var.f47199v0;
                } else {
                    view = l71Var.f47183o0;
                }
                lVar.addView(view);
                return view;
            default:
                vg.v0 v0Var = (vg.v0) obj;
                vg.u0 u0Var = new vg.u0(v0Var, v0Var.getContext(), i3);
                lVar.addView(u0Var);
                u0Var.f56865a = i3;
                org.telegram.ui.ls0 ls0Var = (org.telegram.ui.ls0) v0Var.f56875l1.get(i3);
                int i16 = ls0Var.f47430a;
                String str = ls0Var.d;
                CharSequence charSequence = ls0Var.f47432c;
                TextView textView4 = u0Var.f56866b;
                s70 s70Var = u0Var.f56867c;
                if (i16 != 0 && i16 != 14 && i16 != 28) {
                    if (v0Var.f56885w1) {
                        int i17 = v0Var.f56884v1;
                        if (i17 == 4) {
                            textView4.setText(org.telegram.messenger.bd.M0(2131754353, null));
                            s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131754352, null)));
                        } else if (i17 == 3) {
                            textView4.setText(org.telegram.messenger.bd.M0(2131747000, null));
                            s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131746998, null)));
                        } else if (i17 == 24) {
                            textView4.setText(org.telegram.messenger.bd.M0(2131746980, null));
                            s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131746978, null)));
                        } else if (i17 == 10) {
                            textView4.setText(org.telegram.messenger.bd.M0(2131747028, null));
                            s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747026, null)));
                        } else if (i17 == 2) {
                            textView4.setText(org.telegram.messenger.bd.M0(2131747020, null));
                            s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747018, null)));
                        } else if (i17 == 9) {
                            textView4.setText(org.telegram.messenger.bd.M0(2131747033, null));
                            s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747031, null)));
                        } else if (i17 == 8) {
                            textView4.setText(org.telegram.messenger.bd.M0(2131746970, null));
                            s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131746968, null)));
                        } else if (i17 == 13) {
                            textView4.setText(org.telegram.messenger.bd.M0(2131746974, null));
                            s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131746973, null)));
                        } else if (i17 == 38) {
                            textView4.setText(org.telegram.messenger.bd.M0(2131747017, null));
                            s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747016, null)));
                        } else if (i17 == 22) {
                            textView4.setText(org.telegram.messenger.bd.M0(2131746967, null));
                            s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131746966, null)));
                        } else if (i17 == 23) {
                            textView4.setText(org.telegram.messenger.bd.M0(2131746993, null));
                            s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131746992, null)));
                        } else if (i17 == 41) {
                            textView4.setText(org.telegram.messenger.bd.M0(2131746986, null));
                            s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131746985, null)));
                        } else {
                            textView4.setText(charSequence);
                            s70Var.setText(org.telegram.messenger.g0.X2(str));
                        }
                        u0Var.h = false;
                    } else {
                        textView4.setText(charSequence);
                        s70Var.setText(org.telegram.messenger.g0.X2(str));
                        u0Var.h = false;
                    }
                } else {
                    textView4.setText("");
                    s70Var.setText("");
                    u0Var.h = true;
                }
                s70Var.setMaxWidth(gi.l3.a(s70Var.getText(), s70Var.getPaint()));
                u0Var.requestLayout();
                if (ls0Var.f47430a == 40) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && u0Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(u0Var.getContext());
                    u0Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = u0Var.getContext();
                    int i18 = vg.v0.G1;
                    ii.j jVar = new ii.j(context, v0Var.J0, true);
                    jVar.a(2131231821, org.telegram.messenger.bd.M0(2131749582, null), org.telegram.messenger.bd.M0(2131749583, null));
                    u0Var.d.addView(r2[0], b8.mf.o(-1, -2));
                    ii.j jVar2 = new ii.j(u0Var.getContext(), v0Var.J0, true);
                    jVar2.a(2131231817, org.telegram.messenger.bd.M0(2131749580, null), org.telegram.messenger.bd.M0(2131749581, null));
                    u0Var.d.addView(r2[1], b8.mf.o(-1, -2));
                    ii.j jVar3 = new ii.j(u0Var.getContext(), v0Var.J0, true);
                    ii.j[] jVarArr = {jVar, jVar2, jVar3};
                    jVar3.a(2131231924, org.telegram.messenger.bd.M0(2131749578, null), org.telegram.messenger.bd.M0(2131749579, null));
                    u0Var.d.addView(jVarArr[2], b8.mf.o(-1, -2));
                    u0Var.addView(u0Var.d, b8.mf.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = u0Var.d;
                if (linearLayout2 != null) {
                    if (!z10) {
                        i13 = 8;
                    }
                    linearLayout2.setVisibility(i13);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) s70Var.getLayoutParams();
                if (z10) {
                    f10 = 6.0f;
                } else {
                    f10 = 10.0f;
                }
                marginLayoutParams.topMargin = org.telegram.messenger.g0.L(f10);
                return u0Var;
        }
    }

    @Override
    public final boolean f(View view, Object obj) {
        switch (this.f39859c) {
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
    public void h(int i3) {
        switch (this.f39859c) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.o50 o50Var = (org.telegram.ui.o50) this.d;
                o50Var.f48191e.setCurrentPage(i3);
                o50Var.I = i3;
                return;
            default:
                return;
        }
    }

    private final void j(int i3) {
    }

    private final void k(int i3) {
    }
}
