package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.Switch;

public final class lu extends xf.b {
    public final int d;

    public final Object f40250e;

    public lu(Object obj, int i10) {
        this.d = i10;
        this.f40250e = obj;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        switch (this.d) {
            case 0:
                iu iuVar = (iu) ((nu) this.f40250e).Y2.get(o1Var.b());
                int i10 = iuVar.f49413a;
                return i10 == 5 || (i10 == 2 && iuVar.h != -1);
            default:
                int i11 = o1Var.f5793f;
                return i11 == 4 || i11 == 3 || i11 == 5;
        }
    }

    @Override
    public final int h() {
        switch (this.d) {
            case 0:
                return ((nu) this.f40250e).Y2.size();
            default:
                return ((xb0) this.f40250e).f44379s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((iu) ((nu) this.f40250e).Y2.get(i10)).f49413a;
            default:
                xb0 xb0Var = (xb0) this.f40250e;
                if (i10 < 0 || i10 >= xb0Var.f44379s.size()) {
                    return 2;
                }
                return ((rb0) xb0Var.f44379s.get(i10)).f49413a;
        }
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        Boolean boolValueOf;
        switch (this.d) {
            case 0:
                nu nuVar = (nu) this.f40250e;
                ArrayList arrayList = nuVar.Y2;
                int iB = o1Var.b();
                View view = o1Var.f5789a;
                iu iuVar = (iu) arrayList.get(iB);
                int i11 = o1Var.f5793f;
                if (i11 == 0) {
                    org.telegram.ui.Components.sc scVar = (org.telegram.ui.Components.sc) view;
                    if (nuVar.f40931c3 != null) {
                        scVar.f(nuVar.f40934f3, nuVar.T2, nuVar.f40932d3);
                    }
                    nuVar.T2 = false;
                } else if (i11 == 1) {
                    ((qu) view).f41746a.setText(iuVar.f39164f);
                } else if (i11 == 2) {
                    gu guVar = (gu) view;
                    int i12 = iuVar.d;
                    int i13 = iuVar.f39163e;
                    int i14 = iuVar.f39162c;
                    CharSequence charSequence = iuVar.f39164f;
                    CharSequence charSequence2 = iuVar.f39165g;
                    int i15 = i10 + 1;
                    boolean z10 = i15 < h() && ((iu) arrayList.get(i15)).f49413a == i11;
                    ImageView imageView = guVar.f38475a;
                    if (i14 == 0) {
                        imageView.setVisibility(8);
                    } else {
                        imageView.setVisibility(0);
                        boolean zQ = org.telegram.ui.ActionBar.g6.I.q();
                        org.telegram.ui.Components.bb0 bb0Var = new org.telegram.ui.Components.bb0(1);
                        bb0Var.b(i12, i13);
                        bb0Var.f27060b = zQ;
                        imageView.setBackground(bb0Var);
                        imageView.setImageResource(i14);
                    }
                    guVar.f38476b.setText(charSequence);
                    guVar.d.setText(charSequence2);
                    guVar.f38478e = z10;
                    guVar.setWillNotDraw(!z10);
                    int i16 = iuVar.h;
                    if (i16 >= 0) {
                        mu[] muVarArr = nuVar.f40931c3;
                        if (i16 >= muVarArr.length || muVarArr[i16].f32127c > 0) {
                            boolValueOf = Boolean.valueOf(nuVar.f40933e3[i16]);
                        } else {
                            boolValueOf = null;
                        }
                    } else {
                        boolValueOf = null;
                    }
                    ImageView imageView2 = guVar.f38477c;
                    if (boolValueOf != null) {
                        imageView2.setVisibility(0);
                        imageView2.animate().rotation(boolValueOf.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(org.telegram.ui.Components.er.h).start();
                    } else {
                        imageView2.setVisibility(8);
                    }
                } else if (i11 == 3) {
                    ((org.telegram.ui.Cells.x8) view).setText(iuVar.f39164f);
                } else if (i11 == 4) {
                    ((org.telegram.ui.Cells.j4) view).setText(iuVar.f39164f);
                } else if (i11 == 5) {
                    ((org.telegram.ui.Cells.l8) view).i(iuVar.f39164f.toString(), false);
                } else if (i11 == 6) {
                    ((pu) view).setTop(true);
                }
                break;
            default:
                ArrayList arrayList2 = ((xb0) this.f40250e).f44379s;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    rb0 rb0Var = (rb0) arrayList2.get(i10);
                    int i17 = o1Var.f5793f;
                    View view2 = o1Var.f5789a;
                    if (i17 == 0) {
                        ((org.telegram.ui.Cells.j4) view2).setText(rb0Var.f41893c);
                    } else if (i17 == 1) {
                        ((vb0) view2).a();
                    } else if (i17 == 2) {
                        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view2;
                        CharSequence charSequence3 = rb0Var.f41893c;
                        if (TextUtils.isEmpty(charSequence3)) {
                            x8Var.setFixedSize(12);
                        } else {
                            x8Var.setFixedSize(0);
                        }
                        x8Var.setText(charSequence3);
                        x8Var.setContentDescription(charSequence3);
                        x8Var.setBackground(null);
                    } else if (i17 == 3 || i17 == 4) {
                        int i18 = i10 + 1;
                        boolean z11 = i18 < arrayList2.size() && ((rb0) arrayList2.get(i18)).f49413a != 2;
                        wb0 wb0Var = (wb0) view2;
                        Switch r10 = wb0Var.f43691f;
                        ImageView imageView3 = wb0Var.f43690e;
                        org.telegram.ui.Components.j6 j6Var = wb0Var.d;
                        ImageView imageView4 = wb0Var.f43687a;
                        org.telegram.ui.Components.bp bpVar = wb0Var.h;
                        cg.q qVar = wb0Var.f43689c;
                        int i19 = rb0Var.f49413a;
                        CharSequence charSequence4 = rb0Var.f41893c;
                        int i20 = rb0Var.f41894e;
                        if (i19 == 3) {
                            bpVar.setVisibility(8);
                            imageView4.setVisibility(0);
                            imageView4.setImageResource(rb0Var.d);
                            qVar.setText(charSequence4);
                            boolean z12 = Integer.bitCount(i20) > 1;
                            wb0Var.v = z12;
                            if (z12) {
                                wb0Var.c(rb0Var, false);
                                j6Var.setVisibility(0);
                                imageView3.setVisibility(0);
                            } else {
                                j6Var.setVisibility(8);
                                imageView3.setVisibility(8);
                            }
                            qVar.setTranslationX(0.0f);
                            r10.setVisibility(0);
                            r10.c(LiteMode.isEnabled(i20), false);
                            wb0Var.f43693r = Integer.bitCount(i20) > 1;
                        } else {
                            bpVar.setVisibility(0);
                            bpVar.a(LiteMode.isEnabled(i20), false);
                            imageView4.setVisibility(8);
                            r10.setVisibility(8);
                            j6Var.setVisibility(8);
                            imageView3.setVisibility(8);
                            qVar.setText(charSequence4);
                            qVar.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
                            wb0Var.v = false;
                            wb0Var.f43693r = false;
                        }
                        ((ViewGroup.MarginLayoutParams) wb0Var.f43688b.getLayoutParams()).rightMargin = AndroidUtilities.dp(rb0Var.f49413a == 3 ? (LocaleController.isRTL ? 64 : 75) + 4 : 8.0f);
                        wb0Var.f43692n = z11;
                        wb0Var.setWillNotDraw((z11 || wb0Var.f43693r) ? false : true);
                        wb0Var.b(LiteMode.isPowerSaverApplied(), false);
                    } else if (i17 == 5) {
                        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view2;
                        if (rb0Var.f41895f == 1) {
                            l8Var.j(rb0Var.f41893c, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View x8Var;
        int i11 = this.d;
        View wb0Var = null;
        Object obj = this.f40250e;
        switch (i11) {
            case 0:
                nu nuVar = (nu) obj;
                ru ruVar = nuVar.f40939k3;
                org.telegram.ui.ActionBar.c6 c6Var = nuVar.f35277l2;
                if (i10 == 0) {
                    Context context = nuVar.getContext();
                    int[] iArr = ru.f42335e;
                    ku kuVar = new ku(this, context, iArr.length, iArr, ru.f42336f);
                    nuVar.f40938j3 = kuVar;
                    kuVar.setInterceptTouch(false);
                    ku kuVar2 = nuVar.f40938j3;
                    kuVar2.setTag(-33024);
                    x8Var = kuVar2;
                } else if (i10 == 1) {
                    Context context2 = nuVar.getContext();
                    qu quVar = new qu(context2);
                    TextView textView = new TextView(context2);
                    quVar.f41746a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(ruVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23423y6));
                    quVar.addView(textView, h7.z5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                    quVar.setTag(-33024);
                    x8Var = quVar;
                } else if (i10 == 3) {
                    x8Var = new org.telegram.ui.Cells.x8(nuVar.getContext());
                } else if (i10 == 4) {
                    org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(nuVar.getContext());
                    j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var));
                    x8Var = j4Var;
                } else if (i10 == 5) {
                    org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(nuVar.getContext());
                    l8Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23269p7, c6Var));
                    l8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var));
                    x8Var = l8Var;
                } else if (i10 == 6) {
                    pu puVar = new pu(nuVar.getContext());
                    puVar.f41429a = new Path();
                    Paint paint = new Paint(1);
                    puVar.f41430b = paint;
                    puVar.f41431c = true;
                    paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                    x8Var = puVar;
                } else if (i10 != 7) {
                    x8Var = new gu(ruVar, nuVar.getContext());
                } else {
                    org.telegram.ui.Components.zm zmVar = new org.telegram.ui.Components.zm(nuVar.getContext(), 13);
                    int i12 = org.telegram.ui.ActionBar.g6.f23053d6;
                    int i13 = nu.f40929l3;
                    zmVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i12, nuVar.f35277l2));
                    x8Var = zmVar;
                }
                return new org.telegram.ui.Components.lk0(x8Var);
            default:
                xb0 xb0Var = (xb0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    wb0Var = new org.telegram.ui.Cells.j4(context3);
                } else if (i10 == 1) {
                    wb0Var = new vb0(xb0Var, context3);
                } else if (i10 == 2) {
                    wb0Var = new qb0(context3);
                } else if (i10 == 3 || i10 == 4) {
                    wb0Var = new wb0(xb0Var, context3);
                } else if (i10 == 5) {
                    wb0Var = new org.telegram.ui.Cells.l8(23, context3, null, false, true);
                }
                return new org.telegram.ui.Components.lk0(wb0Var);
        }
    }
}
