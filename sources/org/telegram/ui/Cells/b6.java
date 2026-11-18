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
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.yg;
public class b6 extends FrameLayout implements ww0, te.b {
    public final yg E;
    public Integer F;
    public final te.a f30442a;
    public final te.a f30443b;
    public final org.telegram.ui.ActionBar.i6 f30444c;
    public final bi.u d;
    public ri f30445e;
    public final ImageView f30446f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.n5 f30447n;
    public final mp f30448r;
    public boolean f30449s;
    public boolean f30450w;
    public AnimatorSet f30451x;
    public boolean f30452y;

    public b6(Context context, int i7, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.i6 i6Var) {
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
        lr lrVar = lr.h;
        this.f30442a = new te.a(0, this, lrVar, 380L, false);
        this.f30443b = new te.a(1, this, lrVar, 380L, false);
        this.f30444c = i6Var;
        bi.u uVar = new bi.u(this, context, i6Var, 1);
        this.d = uVar;
        uVar.setAllowTextEntitiesIntersection(true);
        org.telegram.ui.ActionBar.u6.U(uVar, org.telegram.ui.ActionBar.n6.G6, i6Var);
        org.telegram.ui.ActionBar.u6.G(uVar, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        org.telegram.ui.ActionBar.u6.D(uVar, org.telegram.ui.ActionBar.n6.H6, i6Var);
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
            boolean z10 = gd.f24213a0;
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
            addView(uVar, c8.ma.d(-1, -2.0f, i21, f12, 0.0f, f13, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(2131231850);
            int i22 = org.telegram.ui.ActionBar.n6.f29559m6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.u6.s(imageView, i22, i6Var, mode);
            if (gd.f24213a0) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            addView(imageView, c8.ma.d(48, 48.0f, i16 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f30446f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i23 = org.telegram.ui.ActionBar.n6.Mi;
            y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i23, i6Var), 1, -1);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i23);
            imageView2.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(imageView2, h02, null, M, i6Var);
            imageView2.setImageResource(2131232563);
            imageView2.setOnClickListener(onClickListener);
            org.telegram.ui.ActionBar.u6.s(imageView2, i22, i6Var, mode);
            imageView2.setContentDescription(gd.M0(2131751587, null));
            boolean z11 = gd.f24213a0;
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
            addView(imageView2, c8.ma.d(48, 50.0f, i24, f14, 0.0f, f15, 0.0f));
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
            this.f30447n = n5Var;
            n5Var.setTextSize(13);
            org.telegram.ui.ActionBar.n5 n5Var2 = this.f30447n;
            if (gd.f24213a0) {
                i18 = 3;
            } else {
                i18 = 5;
            }
            n5Var2.setGravity(i18 | 48);
            View view = this.f30447n;
            boolean z12 = gd.f24213a0;
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
            addView(view, c8.ma.d(48, 24.0f, i25, f16, 43.0f, f17, 0.0f));
            mp mpVar = new mp(21, context, i6Var);
            this.f30448r = mpVar;
            mpVar.b(-1, i22, org.telegram.ui.ActionBar.n6.f29524k7);
            mpVar.setContentDescription(gd.M0(2131754796, null));
            mpVar.setDrawUnchecked(true);
            mpVar.a(true, false);
            mpVar.setAlpha(0.0f);
            mpVar.setDrawBackgroundAsArc(8);
            if (gd.f24213a0) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            addView(mpVar, c8.ma.d(48, 48.0f, i20 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            mpVar.setOnClickListener(new View.OnClickListener(this) {
                public final b6 f30384b;

                {
                    this.f30384b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            b6 b6Var = this.f30384b;
                            mp mpVar2 = b6Var.f30448r;
                            if (mpVar2.getTag() != null) {
                                b6Var.i(b6Var, !mpVar2.f37598a.f32838q);
                                return;
                            }
                            return;
                        default:
                            b6 b6Var2 = this.f30384b;
                            b6Var2.k(b6Var2);
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
            boolean z13 = gd.f24213a0;
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
            addView(uVar, c8.ma.d(-1, -2.0f, i26, f10, 0.0f, z13 ? 19.0f : i10, 0.0f));
        }
        if (i7 == 1) {
            yg ygVar = new yg(context);
            this.E = ygVar;
            org.telegram.ui.ActionBar.u6.s(ygVar, org.telegram.ui.ActionBar.n6.f29559m6, i6Var, PorterDuff.Mode.SRC_IN);
            ygVar.j(wg.f41711e, false);
            int L = org.telegram.messenger.g0.L(9.5f);
            ygVar.setPadding(L, L, L, L);
            ygVar.setVisibility(8);
            if (this.f30446f == null) {
                i12 = 3;
            } else {
                i12 = 38;
            }
            boolean z14 = gd.f24213a0;
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
            addView(ygVar, c8.ma.d(48, 48.0f, i13, f11, 0.0f, z14 ? 0.0f : i12, 0.0f));
            int i27 = org.telegram.ui.ActionBar.n6.Mi;
            y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i27, i6Var), 1, -1);
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i27);
            ygVar.setBackground(h03);
            org.telegram.ui.ActionBar.u6.j(ygVar, h03, null, M2, i6Var);
            ygVar.setOnClickListener(new View.OnClickListener(this) {
                public final b6 f30384b;

                {
                    this.f30384b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            b6 b6Var = this.f30384b;
                            mp mpVar2 = b6Var.f30448r;
                            if (mpVar2.getTag() != null) {
                                b6Var.i(b6Var, !mpVar2.f37598a.f32838q);
                                return;
                            }
                            return;
                        default:
                            b6 b6Var2 = this.f30384b;
                            b6Var2.k(b6Var2);
                            return;
                    }
                }
            });
            ygVar.setContentDescription(gd.M0(2131751185, null));
        }
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        yg ygVar;
        int i10;
        if (i7 == 0) {
            mp mpVar = this.f30448r;
            if (mpVar != null) {
                CheckBoxBase checkBoxBase = mpVar.getCheckBoxBase();
                float f12 = this.f30442a.f57657e;
                if (checkBoxBase.f32843w != f12) {
                    checkBoxBase.f32843w = f12;
                    checkBoxBase.b();
                }
                mpVar.invalidate();
            }
        } else if (i7 == 1 && (ygVar = this.E) != null) {
            float f13 = this.f30443b.f57657e;
            float f14 = 0.85f * f13;
            ygVar.setScaleX(f14);
            ygVar.setScaleY(f14);
            ygVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ygVar.setVisibility(i10);
            org.telegram.ui.ActionBar.n5 n5Var = this.f30447n;
            if (n5Var != null && this.f30446f == null && n5Var.getVisibility() == 0) {
                if (this.f30445e != null) {
                    this.f30447n.setTranslationY(org.telegram.messenger.g0.L(36.0f));
                } else {
                    this.f30447n.setTranslationY(org.telegram.messenger.g0.L(26.0f) * f13);
                }
            }
        }
    }

    @Override
    public final boolean a() {
        return false;
    }

    public final ri b() {
        int i7;
        float f10;
        float f11;
        int i10;
        int i11;
        float f12;
        int i12;
        float f13;
        ImageView imageView = this.f30446f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ri riVar = new ri(getContext(), 38);
        this.f30445e = riVar;
        riVar.setFocusable(false);
        ri riVar2 = this.f30445e;
        int i13 = org.telegram.ui.ActionBar.n6.Mi;
        org.telegram.ui.ActionBar.i6 i6Var = this.f30444c;
        org.telegram.ui.ActionBar.u6.Q(riVar2, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i13, i6Var), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i13), i6Var);
        c8.ra.a(this.f30445e);
        ri riVar3 = this.f30445e;
        boolean z10 = gd.f24213a0;
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
        addView(riVar3, c8.ma.d(48, 50.0f, i15, f10, 0.0f, f11, 0.0f));
        yg ygVar = this.E;
        if (ygVar != null) {
            boolean z11 = gd.f24213a0;
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
            ygVar.setLayoutParams(c8.ma.d(48, 48.0f, i16, f13, 1.0f, f14, 0.0f));
        }
        bi.u uVar = this.d;
        if (uVar != null) {
            if (gd.f24213a0) {
                i10 = ((ViewGroup.MarginLayoutParams) uVar.getLayoutParams()).rightMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) uVar.getLayoutParams()).leftMargin;
            }
            float f15 = i10 / org.telegram.messenger.g0.f24117p;
            if (ygVar != null) {
                i11 = 70;
            } else {
                i11 = 19;
            }
            int i17 = i11 + 24;
            boolean z12 = gd.f24213a0;
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
            uVar.setLayoutParams(c8.ma.d(-1, -2.0f, i18, f12, 0.0f, f15, 0.0f));
        }
        return this.f30445e;
    }

    public final void c(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void d() {
        int i7;
        float f10;
        float f11;
        this.f30452y = true;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(getContext());
        this.f30447n = n5Var;
        n5Var.setTextSize(13);
        org.telegram.ui.ActionBar.n5 n5Var2 = this.f30447n;
        int i10 = 5;
        if (gd.f24213a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        n5Var2.setGravity(i7 | 48);
        org.telegram.ui.ActionBar.n5 n5Var3 = this.f30447n;
        boolean z10 = gd.f24213a0;
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
        addView(n5Var3, c8.ma.d(48, 24.0f, i11, f10, 17.0f, f11, 0.0f));
    }

    @Override
    public final void e(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public boolean f() {
        return true;
    }

    public boolean g(b6 b6Var) {
        return false;
    }

    public mp getCheckBox() {
        return this.f30448r;
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

    public yg getEmojiButton() {
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
    public org.telegram.ui.ActionBar.h2 getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.n5 getTextView2() {
        return this.f30447n;
    }

    public void i(b6 b6Var, boolean z10) {
        this.f30448r.a(z10, true);
    }

    public boolean m(ArrayList arrayList) {
        return false;
    }

    public final void n(boolean z10, boolean z11) {
        boolean z12;
        float f10;
        float f11;
        mp mpVar = this.f30448r;
        if (mpVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return;
        }
        AnimatorSet animatorSet = this.f30451x;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f30451x = null;
        }
        if (z10) {
            num = 1;
        }
        mpVar.setTag(num);
        ImageView imageView = this.h;
        float f12 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f30451x = animatorSet2;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            float[] fArr = {f11};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mpVar, property, fArr);
            if (!z10) {
                f12 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(imageView, property, f12));
            this.f30451x.setDuration(180L);
            this.f30451x.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        mpVar.setAlpha(f10);
        if (!z10) {
            f12 = 1.0f;
        }
        imageView.setAlpha(f12);
    }

    public final void o(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f30446f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        bi.u uVar = this.d;
        uVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            uVar.setSelection(uVar.length());
        }
        uVar.setHint(str);
        this.f30450w = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mp mpVar = this.f30448r;
        if (mpVar != null) {
            n(p(), false);
            mpVar.a(g(this), false);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float L;
        int i7;
        if (this.f30450w && f()) {
            boolean z10 = gd.f24213a0;
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
            if (gd.f24213a0) {
                if (imageView != null) {
                    f11 = 58.0f;
                }
                i7 = org.telegram.messenger.g0.L(f11);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f12, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29517k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        yg ygVar;
        ImageView imageView;
        bi.u uVar;
        int i11;
        float f10;
        int size = View.MeasureSpec.getSize(i7);
        int i12 = 0;
        while (true) {
            int childCount = getChildCount();
            ygVar = this.E;
            imageView = this.f30446f;
            uVar = this.d;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt != uVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                } else if (childAt == ygVar) {
                    ygVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                    } else {
                        org.telegram.ui.ActionBar.n5 n5Var = this.f30447n;
                        if (childAt == n5Var) {
                            n5Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
                        } else {
                            mp mpVar = this.f30448r;
                            if (childAt == mpVar) {
                                mpVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
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
        } else if (this.f30447n == null) {
            i11 = 42;
        } else if (imageView == null) {
            i11 = 70;
        } else if (ygVar != null) {
            i11 = 144;
        } else {
            i11 = 122;
        }
        uVar.measure(n10.c(i11, (size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = uVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(org.telegram.messenger.g0.L(50.0f), uVar.getMeasuredHeight()) + (this.f30450w ? 1 : 0));
        org.telegram.ui.ActionBar.n5 n5Var2 = this.f30447n;
        if (n5Var2 != null && !this.f30452y) {
            if (measuredHeight >= org.telegram.messenger.g0.L(52.0f)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            n5Var2.setAlpha(f10);
        }
    }

    public boolean p() {
        return false;
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.f30443b.a(z10, true);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f30444c;
        ImageView imageView = this.h;
        if (imageView != null) {
            org.telegram.ui.ActionBar.u6.s(imageView, i7, i6Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f30446f;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.u6.s(imageView2, i7, i6Var, PorterDuff.Mode.MULTIPLY);
        }
        yg ygVar = this.E;
        if (ygVar != null) {
            org.telegram.ui.ActionBar.u6.s(ygVar, i7, i6Var, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z10) {
        this.f30449s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.n5 n5Var = this.f30447n;
        if (n5Var == null) {
            return;
        }
        n5Var.l(str, false);
    }

    public void setTextColor(int i7) {
        this.d.setTextColor(i7);
    }

    public void setTextRight(int i7) {
        this.F = Integer.valueOf(i7);
    }

    public void j(boolean z10) {
    }

    public void k(b6 b6Var) {
    }

    public void l(bi.u uVar) {
    }

    @Override
    public final void D(float f10, int i7) {
    }

    public void h(bi.u uVar, ActionMode actionMode) {
    }
}
