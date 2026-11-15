package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.pw0;
public class z5 extends FrameLayout implements pw0, te.b {
    public final pg E;
    public Integer F;
    public final te.a f32115a;
    public final te.a f32116b;
    public final org.telegram.ui.ActionBar.e6 f32117c;
    public final bi.u d;
    public ji f32118e;
    public final ImageView f32119f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.j5 f32120n;
    public final fp f32121r;
    public boolean f32122s;
    public boolean f32123w;
    public AnimatorSet f32124x;
    public boolean f32125y;

    public z5(Context context, int i7, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        int i11;
        float f10;
        int i12;
        int i13;
        float f11;
        int i14;
        int i15;
        float f12;
        float f13;
        int i16;
        int i17;
        float f14;
        float f15;
        int i18;
        int i19;
        float f16;
        float f17;
        int i20;
        er erVar = er.h;
        this.f32115a = new te.a(0, this, erVar, 380L, false);
        this.f32116b = new te.a(1, this, erVar, 380L, false);
        this.f32117c = e6Var;
        bi.u uVar = new bi.u(this, context, e6Var, 1);
        this.d = uVar;
        uVar.setAllowTextEntitiesIntersection(true);
        org.telegram.ui.ActionBar.q6.U(uVar, org.telegram.ui.ActionBar.j6.G6, e6Var);
        org.telegram.ui.ActionBar.q6.G(uVar, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        org.telegram.ui.ActionBar.q6.D(uVar, org.telegram.ui.ActionBar.j6.H6, e6Var);
        uVar.setTextSize(1, 16.0f);
        uVar.setMaxLines(Integer.MAX_VALUE);
        uVar.setBackground(null);
        uVar.setImeOptions(uVar.getImeOptions() | 268435456);
        uVar.setInputType(uVar.getInputType() | 16384);
        uVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
        if (onClickListener != null) {
            if (i7 == 1) {
                i14 = 92;
            } else {
                i14 = 58;
            }
            boolean z10 = hd.f24101a0;
            if (z10) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i21 = i15 | 16;
            if (z10) {
                f12 = i14;
            } else {
                f12 = 54.0f;
            }
            if (!z10) {
                f13 = i14;
            } else {
                f13 = 54.0f;
            }
            addView(uVar, c8.ja.d(-1, -2.0f, i21, f12, 0.0f, f13, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(2131231849);
            int i22 = org.telegram.ui.ActionBar.j6.f29014m6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.q6.s(imageView, i22, e6Var, mode);
            if (hd.f24101a0) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            addView(imageView, c8.ja.d(48, 48.0f, i16 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f32119f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i23 = org.telegram.ui.ActionBar.j6.Mi;
            y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i23, e6Var), 1, -1);
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i23);
            imageView2.setBackground(h02);
            org.telegram.ui.ActionBar.q6.j(imageView2, h02, null, M, e6Var);
            imageView2.setImageResource(2131232562);
            imageView2.setOnClickListener(onClickListener);
            org.telegram.ui.ActionBar.q6.s(imageView2, i22, e6Var, mode);
            imageView2.setContentDescription(hd.M0(2131751598, null));
            boolean z11 = hd.f24101a0;
            if (z11) {
                i17 = 3;
            } else {
                i17 = 5;
            }
            int i24 = i17 | 48;
            if (z11) {
                f14 = 3.0f;
            } else {
                f14 = 0.0f;
            }
            if (z11) {
                f15 = 0.0f;
            } else {
                f15 = 3.0f;
            }
            addView(imageView2, c8.ja.d(48, 50.0f, i24, f14, 0.0f, f15, 0.0f));
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
            this.f32120n = j5Var;
            j5Var.setTextSize(13);
            org.telegram.ui.ActionBar.j5 j5Var2 = this.f32120n;
            if (hd.f24101a0) {
                i18 = 3;
            } else {
                i18 = 5;
            }
            j5Var2.setGravity(i18 | 48);
            View view = this.f32120n;
            boolean z12 = hd.f24101a0;
            if (z12) {
                i19 = 3;
            } else {
                i19 = 5;
            }
            int i25 = i19 | 48;
            if (z12) {
                f16 = 20.0f;
            } else {
                f16 = 0.0f;
            }
            if (z12) {
                f17 = 0.0f;
            } else {
                f17 = 20.0f;
            }
            addView(view, c8.ja.d(48, 24.0f, i25, f16, 43.0f, f17, 0.0f));
            fp fpVar = new fp(21, context, e6Var);
            this.f32121r = fpVar;
            fpVar.b(-1, i22, org.telegram.ui.ActionBar.j6.f28979k7);
            fpVar.setContentDescription(hd.M0(2131754796, null));
            fpVar.setDrawUnchecked(true);
            fpVar.a(true, false);
            fpVar.setAlpha(0.0f);
            fpVar.setDrawBackgroundAsArc(8);
            if (hd.f24101a0) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            addView(fpVar, c8.ja.d(48, 48.0f, i20 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            fpVar.setOnClickListener(new View.OnClickListener(this) {
                public final z5 f32065b;

                {
                    this.f32065b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            z5 z5Var = this.f32065b;
                            fp fpVar2 = z5Var.f32121r;
                            if (fpVar2.getTag() != null) {
                                z5Var.i(z5Var, !fpVar2.f34663a.f32441q);
                                return;
                            }
                            return;
                        default:
                            z5 z5Var2 = this.f32065b;
                            z5Var2.k(z5Var2);
                            return;
                    }
                }
            });
        } else {
            if (i7 == 1) {
                i10 = 70;
            } else {
                i10 = 19;
            }
            boolean z13 = hd.f24101a0;
            if (z13) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i26 = i11 | 16;
            if (z13) {
                f10 = i10;
            } else {
                f10 = 19.0f;
            }
            addView(uVar, c8.ja.d(-1, -2.0f, i26, f10, 0.0f, z13 ? 19.0f : i10, 0.0f));
        }
        if (i7 == 1) {
            pg pgVar = new pg(context);
            this.E = pgVar;
            org.telegram.ui.ActionBar.q6.s(pgVar, org.telegram.ui.ActionBar.j6.f29014m6, e6Var, PorterDuff.Mode.SRC_IN);
            pgVar.j(ng.f37583e, false);
            int L = org.telegram.messenger.g0.L(9.5f);
            pgVar.setPadding(L, L, L, L);
            pgVar.setVisibility(8);
            if (this.f32119f == null) {
                i12 = 3;
            } else {
                i12 = 38;
            }
            boolean z14 = hd.f24101a0;
            if (z14) {
                i13 = 3;
            } else {
                i13 = 5;
            }
            if (z14) {
                f11 = i12;
            } else {
                f11 = 0.0f;
            }
            addView(pgVar, c8.ja.d(48, 48.0f, i13, f11, 0.0f, z14 ? 0.0f : i12, 0.0f));
            int i27 = org.telegram.ui.ActionBar.j6.Mi;
            y h03 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i27, e6Var), 1, -1);
            org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i27);
            pgVar.setBackground(h03);
            org.telegram.ui.ActionBar.q6.j(pgVar, h03, null, M2, e6Var);
            pgVar.setOnClickListener(new View.OnClickListener(this) {
                public final z5 f32065b;

                {
                    this.f32065b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            z5 z5Var = this.f32065b;
                            fp fpVar2 = z5Var.f32121r;
                            if (fpVar2.getTag() != null) {
                                z5Var.i(z5Var, !fpVar2.f34663a.f32441q);
                                return;
                            }
                            return;
                        default:
                            z5 z5Var2 = this.f32065b;
                            z5Var2.k(z5Var2);
                            return;
                    }
                }
            });
            pgVar.setContentDescription(hd.M0(2131751196, null));
        }
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        pg pgVar;
        int i10;
        if (i7 == 0) {
            fp fpVar = this.f32121r;
            if (fpVar != null) {
                CheckBoxBase checkBoxBase = fpVar.getCheckBoxBase();
                float f12 = this.f32115a.f57081e;
                if (checkBoxBase.f32446w != f12) {
                    checkBoxBase.f32446w = f12;
                    checkBoxBase.b();
                }
                fpVar.invalidate();
            }
        } else if (i7 == 1 && (pgVar = this.E) != null) {
            float f13 = this.f32116b.f57081e;
            float f14 = 0.85f * f13;
            pgVar.setScaleX(f14);
            pgVar.setScaleY(f14);
            pgVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            pgVar.setVisibility(i10);
            org.telegram.ui.ActionBar.j5 j5Var = this.f32120n;
            if (j5Var != null && this.f32119f == null && j5Var.getVisibility() == 0) {
                if (this.f32118e != null) {
                    this.f32120n.setTranslationY(org.telegram.messenger.g0.L(36.0f));
                } else {
                    this.f32120n.setTranslationY(org.telegram.messenger.g0.L(26.0f) * f13);
                }
            }
        }
    }

    @Override
    public final boolean a() {
        return false;
    }

    public final ji b() {
        int i7;
        float f10;
        float f11;
        int i10;
        int i11;
        float f12;
        int i12;
        float f13;
        ImageView imageView = this.f32119f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ji jiVar = new ji(getContext(), 38);
        this.f32118e = jiVar;
        jiVar.setFocusable(false);
        ji jiVar2 = this.f32118e;
        int i13 = org.telegram.ui.ActionBar.j6.Mi;
        org.telegram.ui.ActionBar.e6 e6Var = this.f32117c;
        org.telegram.ui.ActionBar.q6.Q(jiVar2, org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i13, e6Var), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i13), e6Var);
        c8.na.a(this.f32118e);
        ji jiVar3 = this.f32118e;
        boolean z10 = hd.f24101a0;
        int i14 = 5;
        if (z10) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        int i15 = i7 | 48;
        float f14 = 0.0f;
        if (z10) {
            f10 = 4.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 4.0f;
        }
        addView(jiVar3, c8.ja.d(48, 50.0f, i15, f10, 0.0f, f11, 0.0f));
        pg pgVar = this.E;
        if (pgVar != null) {
            boolean z11 = hd.f24101a0;
            if (z11) {
                i12 = 3;
            } else {
                i12 = 5;
            }
            int i16 = i12 | 48;
            if (z11) {
                f13 = 44;
            } else {
                f13 = 0.0f;
            }
            if (!z11) {
                f14 = 44;
            }
            pgVar.setLayoutParams(c8.ja.d(48, 48.0f, i16, f13, 1.0f, f14, 0.0f));
        }
        bi.u uVar = this.d;
        if (uVar != null) {
            if (hd.f24101a0) {
                i10 = ((ViewGroup.MarginLayoutParams) uVar.getLayoutParams()).rightMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) uVar.getLayoutParams()).leftMargin;
            }
            float f15 = i10 / org.telegram.messenger.g0.f23608p;
            if (pgVar != null) {
                i11 = 70;
            } else {
                i11 = 19;
            }
            int i17 = i11 + 24;
            boolean z12 = hd.f24101a0;
            if (!z12) {
                i14 = 3;
            }
            int i18 = i14 | 16;
            if (z12) {
                f12 = i17;
            } else {
                f12 = f15;
            }
            if (!z12) {
                f15 = i17;
            }
            uVar.setLayoutParams(c8.ja.d(-1, -2.0f, i18, f12, 0.0f, f15, 0.0f));
        }
        return this.f32118e;
    }

    public final void c(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void d() {
        int i7;
        float f10;
        float f11;
        this.f32125y = true;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
        this.f32120n = j5Var;
        j5Var.setTextSize(13);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f32120n;
        int i10 = 5;
        if (hd.f24101a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        j5Var2.setGravity(i7 | 48);
        org.telegram.ui.ActionBar.j5 j5Var3 = this.f32120n;
        boolean z10 = hd.f24101a0;
        if (z10) {
            i10 = 3;
        }
        int i11 = i10 | 48;
        if (z10) {
            f10 = 20.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 20.0f;
        }
        addView(j5Var3, c8.ja.d(48, 24.0f, i11, f10, 17.0f, f11, 0.0f));
    }

    @Override
    public final void e(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public boolean f() {
        return true;
    }

    public boolean g(z5 z5Var) {
        return false;
    }

    public fp getCheckBox() {
        return this.f32121r;
    }

    @Override
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override
    public float getEditFieldBottomOffset() {
        return 0.0f;
    }

    @Override
    public Editable getEditText() {
        return this.d.getText();
    }

    public pg getEmojiButton() {
        return this.E;
    }

    @Override
    public CharSequence getFieldText() {
        bi.u uVar = this.d;
        if (uVar.length() > 0) {
            return uVar.getText();
        }
        return null;
    }

    @Override
    public org.telegram.ui.ActionBar.e2 getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.j5 getTextView2() {
        return this.f32120n;
    }

    public void i(z5 z5Var, boolean z10) {
        this.f32121r.a(z10, true);
    }

    public boolean m(ArrayList arrayList) {
        return false;
    }

    public final void n(boolean z10, boolean z11) {
        boolean z12;
        float f10;
        float f11;
        fp fpVar = this.f32121r;
        if (fpVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return;
        }
        AnimatorSet animatorSet = this.f32124x;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f32124x = null;
        }
        if (z10) {
            num = 1;
        }
        fpVar.setTag(num);
        ImageView imageView = this.h;
        float f12 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f32124x = animatorSet2;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            float[] fArr = {f11};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fpVar, property, fArr);
            if (!z10) {
                f12 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(imageView, property, f12));
            this.f32124x.setDuration(180L);
            this.f32124x.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        fpVar.setAlpha(f10);
        if (!z10) {
            f12 = 1.0f;
        }
        imageView.setAlpha(f12);
    }

    public final void o(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f32119f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        bi.u uVar = this.d;
        uVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            uVar.setSelection(uVar.length());
        }
        uVar.setHint(str);
        this.f32123w = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fp fpVar = this.f32121r;
        if (fpVar != null) {
            n(p(), false);
            fpVar.a(g(this), false);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float L;
        int i7;
        if (this.f32123w && f()) {
            boolean z10 = hd.f24101a0;
            float f11 = 20.0f;
            ImageView imageView = this.h;
            if (z10) {
                L = 0.0f;
            } else {
                if (imageView != null) {
                    f10 = 58.0f;
                } else {
                    f10 = 20.0f;
                }
                L = org.telegram.messenger.g0.L(f10);
            }
            float f12 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24101a0) {
                if (imageView != null) {
                    f11 = 58.0f;
                }
                i7 = org.telegram.messenger.g0.L(f11);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f12, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        pg pgVar;
        ImageView imageView;
        bi.u uVar;
        int i11;
        float f10;
        int size = View.MeasureSpec.getSize(i7);
        int i12 = 0;
        while (true) {
            int childCount = getChildCount();
            pgVar = this.E;
            imageView = this.f32119f;
            uVar = this.d;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt != uVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                } else if (childAt == pgVar) {
                    pgVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                    } else {
                        org.telegram.ui.ActionBar.j5 j5Var = this.f32120n;
                        if (childAt == j5Var) {
                            j5Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
                        } else {
                            fp fpVar = this.f32121r;
                            if (childAt == fpVar) {
                                fpVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                            } else {
                                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                if (layoutParams != null) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                                } else {
                                    childAt.measure(i7, i10);
                                }
                            }
                        }
                    }
                }
            }
            i12++;
        }
        Integer num = this.F;
        if (num != null) {
            i11 = num.intValue();
        } else if (this.f32120n == null) {
            i11 = 42;
        } else if (imageView == null) {
            i11 = 70;
        } else if (pgVar != null) {
            i11 = 144;
        } else {
            i11 = 122;
        }
        uVar.measure(i20.c(i11, (size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = uVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(org.telegram.messenger.g0.L(50.0f), uVar.getMeasuredHeight()) + (this.f32123w ? 1 : 0));
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f32120n;
        if (j5Var2 != null && !this.f32125y) {
            if (measuredHeight >= org.telegram.messenger.g0.L(52.0f)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            j5Var2.setAlpha(f10);
        }
    }

    public boolean p() {
        return false;
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.f32116b.a(z10, true);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i7) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f32117c;
        ImageView imageView = this.h;
        if (imageView != null) {
            org.telegram.ui.ActionBar.q6.s(imageView, i7, e6Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f32119f;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.q6.s(imageView2, i7, e6Var, PorterDuff.Mode.MULTIPLY);
        }
        pg pgVar = this.E;
        if (pgVar != null) {
            org.telegram.ui.ActionBar.q6.s(pgVar, i7, e6Var, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z10) {
        this.f32122s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.j5 j5Var = this.f32120n;
        if (j5Var == null) {
            return;
        }
        j5Var.l(str, false);
    }

    public void setTextColor(int i7) {
        this.d.setTextColor(i7);
    }

    public void setTextRight(int i7) {
        this.F = Integer.valueOf(i7);
    }

    public void j(boolean z10) {
    }

    public void k(z5 z5Var) {
    }

    public void l(bi.u uVar) {
    }

    @Override
    public final void E(float f10, int i7) {
    }

    public void h(bi.u uVar, ActionMode actionMode) {
    }
}
