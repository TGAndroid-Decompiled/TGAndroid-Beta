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
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;
public class z5 extends FrameLayout implements mw0, qe.b {
    public final hg E;
    public Integer F;
    public final qe.a f31045a;
    public final qe.a f31046b;
    public final org.telegram.ui.ActionBar.e6 f31047c;
    public final ai.z d;
    public ai f31048e;
    public final ImageView f31049f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.k5 f31050n;
    public final wo f31051r;
    public boolean f31052s;
    public boolean f31053w;
    public AnimatorSet f31054x;
    public boolean f31055y;

    public z5(Context context, int i3, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.e6 e6Var) {
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
        xq xqVar = xq.h;
        this.f31045a = new qe.a(0, this, xqVar, 380L, false);
        this.f31046b = new qe.a(1, this, xqVar, 380L, false);
        this.f31047c = e6Var;
        ai.z zVar = new ai.z(this, context, e6Var, 1);
        this.d = zVar;
        zVar.setAllowTextEntitiesIntersection(true);
        org.telegram.ui.ActionBar.r6.V(zVar, org.telegram.ui.ActionBar.k6.G6, e6Var);
        org.telegram.ui.ActionBar.r6.H(zVar, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        org.telegram.ui.ActionBar.r6.E(zVar, org.telegram.ui.ActionBar.k6.H6, e6Var);
        zVar.setTextSize(1, 16.0f);
        zVar.setMaxLines(Integer.MAX_VALUE);
        zVar.setBackground(null);
        zVar.setImeOptions(zVar.getImeOptions() | 268435456);
        zVar.setInputType(zVar.getInputType() | 16384);
        zVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
        if (onClickListener != null) {
            if (i3 == 1) {
                i14 = 92;
            } else {
                i14 = 58;
            }
            boolean z10 = bd.f21784a0;
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
            addView(zVar, mf.d(-1, -2.0f, i21, f12, 0.0f, f13, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(2131231849);
            int i22 = org.telegram.ui.ActionBar.k6.f28043m6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.t(imageView, i22, e6Var, mode);
            if (bd.f21784a0) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            addView(imageView, mf.d(48, 48.0f, i16 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f31049f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i23 = org.telegram.ui.ActionBar.k6.Ji;
            y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i23, e6Var), 1, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i23);
            imageView2.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N, e6Var);
            imageView2.setImageResource(2131232559);
            imageView2.setOnClickListener(onClickListener);
            org.telegram.ui.ActionBar.r6.t(imageView2, i22, e6Var, mode);
            imageView2.setContentDescription(bd.M0(2131751599, null));
            boolean z11 = bd.f21784a0;
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
            addView(imageView2, mf.d(48, 50.0f, i24, f14, 0.0f, f15, 0.0f));
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
            this.f31050n = k5Var;
            k5Var.setTextSize(13);
            org.telegram.ui.ActionBar.k5 k5Var2 = this.f31050n;
            if (bd.f21784a0) {
                i18 = 3;
            } else {
                i18 = 5;
            }
            k5Var2.setGravity(i18 | 48);
            View view = this.f31050n;
            boolean z12 = bd.f21784a0;
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
            addView(view, mf.d(48, 24.0f, i25, f16, 43.0f, f17, 0.0f));
            wo woVar = new wo(21, context, e6Var);
            this.f31051r = woVar;
            woVar.b(-1, i22, org.telegram.ui.ActionBar.k6.f28008k7);
            woVar.setContentDescription(bd.M0(2131754796, null));
            woVar.setDrawUnchecked(true);
            woVar.a(true, false);
            woVar.setAlpha(0.0f);
            woVar.setDrawBackgroundAsArc(8);
            if (bd.f21784a0) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            addView(woVar, mf.d(48, 48.0f, i20 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            woVar.setOnClickListener(new View.OnClickListener(this) {
                public final z5 f30990b;

                {
                    this.f30990b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            z5 z5Var = this.f30990b;
                            wo woVar2 = z5Var.f31051r;
                            if (woVar2.getTag() != null) {
                                z5Var.h(z5Var, !woVar2.f40035a.f31334q);
                                return;
                            }
                            return;
                        default:
                            z5 z5Var2 = this.f30990b;
                            z5Var2.j(z5Var2);
                            return;
                    }
                }
            });
        } else {
            if (i3 == 1) {
                i10 = 70;
            } else {
                i10 = 19;
            }
            boolean z13 = bd.f21784a0;
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
            addView(zVar, mf.d(-1, -2.0f, i26, f10, 0.0f, z13 ? 19.0f : i10, 0.0f));
        }
        if (i3 == 1) {
            hg hgVar = new hg(context);
            this.E = hgVar;
            org.telegram.ui.ActionBar.r6.t(hgVar, org.telegram.ui.ActionBar.k6.f28043m6, e6Var, PorterDuff.Mode.SRC_IN);
            hgVar.j(fg.f33793e, false);
            int L = org.telegram.messenger.g0.L(9.5f);
            hgVar.setPadding(L, L, L, L);
            hgVar.setVisibility(8);
            if (this.f31049f == null) {
                i12 = 3;
            } else {
                i12 = 38;
            }
            boolean z14 = bd.f21784a0;
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
            addView(hgVar, mf.d(48, 48.0f, i13, f11, 0.0f, z14 ? 0.0f : i12, 0.0f));
            int i27 = org.telegram.ui.ActionBar.k6.Ji;
            y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i27, e6Var), 1, -1);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i27);
            hgVar.setBackground(h03);
            org.telegram.ui.ActionBar.r6.k(hgVar, h03, null, N2, e6Var);
            hgVar.setOnClickListener(new View.OnClickListener(this) {
                public final z5 f30990b;

                {
                    this.f30990b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            z5 z5Var = this.f30990b;
                            wo woVar2 = z5Var.f31051r;
                            if (woVar2.getTag() != null) {
                                z5Var.h(z5Var, !woVar2.f40035a.f31334q);
                                return;
                            }
                            return;
                        default:
                            z5 z5Var2 = this.f30990b;
                            z5Var2.j(z5Var2);
                            return;
                    }
                }
            });
            hgVar.setContentDescription(bd.M0(2131751197, null));
        }
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        hg hgVar;
        int i10;
        if (i3 == 0) {
            wo woVar = this.f31051r;
            if (woVar != null) {
                CheckBoxBase checkBoxBase = woVar.getCheckBoxBase();
                float f12 = this.f31045a.f53840e;
                if (checkBoxBase.f31339w != f12) {
                    checkBoxBase.f31339w = f12;
                    checkBoxBase.b();
                }
                woVar.invalidate();
            }
        } else if (i3 == 1 && (hgVar = this.E) != null) {
            float f13 = this.f31046b.f53840e;
            float f14 = 0.85f * f13;
            hgVar.setScaleX(f14);
            hgVar.setScaleY(f14);
            hgVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            hgVar.setVisibility(i10);
            org.telegram.ui.ActionBar.k5 k5Var = this.f31050n;
            if (k5Var != null && this.f31049f == null && k5Var.getVisibility() == 0) {
                if (this.f31048e != null) {
                    this.f31050n.setTranslationY(org.telegram.messenger.g0.L(36.0f));
                } else {
                    this.f31050n.setTranslationY(org.telegram.messenger.g0.L(26.0f) * f13);
                }
            }
        }
    }

    public final ai a() {
        int i3;
        float f10;
        float f11;
        int i10;
        int i11;
        float f12;
        int i12;
        float f13;
        ImageView imageView = this.f31049f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ai aiVar = new ai(getContext(), 38);
        this.f31048e = aiVar;
        aiVar.setFocusable(false);
        ai aiVar2 = this.f31048e;
        int i13 = org.telegram.ui.ActionBar.k6.Ji;
        org.telegram.ui.ActionBar.e6 e6Var = this.f31047c;
        org.telegram.ui.ActionBar.r6.R(aiVar2, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i13, e6Var), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i13), e6Var);
        pf.a(this.f31048e);
        ai aiVar3 = this.f31048e;
        boolean z10 = bd.f21784a0;
        int i14 = 5;
        if (z10) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        int i15 = i3 | 48;
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
        addView(aiVar3, mf.d(48, 50.0f, i15, f10, 0.0f, f11, 0.0f));
        hg hgVar = this.E;
        if (hgVar != null) {
            boolean z11 = bd.f21784a0;
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
            hgVar.setLayoutParams(mf.d(48, 48.0f, i16, f13, 1.0f, f14, 0.0f));
        }
        ai.z zVar = this.d;
        if (zVar != null) {
            if (bd.f21784a0) {
                i10 = ((ViewGroup.MarginLayoutParams) zVar.getLayoutParams()).rightMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) zVar.getLayoutParams()).leftMargin;
            }
            float f15 = i10 / org.telegram.messenger.g0.f22607p;
            if (hgVar != null) {
                i11 = 70;
            } else {
                i11 = 19;
            }
            int i17 = i11 + 24;
            boolean z12 = bd.f21784a0;
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
            zVar.setLayoutParams(mf.d(-1, -2.0f, i18, f12, 0.0f, f15, 0.0f));
        }
        return this.f31048e;
    }

    public final void b(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void c() {
        int i3;
        float f10;
        float f11;
        this.f31055y = true;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
        this.f31050n = k5Var;
        k5Var.setTextSize(13);
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f31050n;
        int i10 = 5;
        if (bd.f21784a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        k5Var2.setGravity(i3 | 48);
        org.telegram.ui.ActionBar.k5 k5Var3 = this.f31050n;
        boolean z10 = bd.f21784a0;
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
        addView(k5Var3, mf.d(48, 24.0f, i11, f10, 17.0f, f11, 0.0f));
    }

    @Override
    public final void d(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public boolean e() {
        return true;
    }

    public boolean f(z5 z5Var) {
        return false;
    }

    public wo getCheckBox() {
        return this.f31051r;
    }

    @Override
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override
    public Editable getEditText() {
        return this.d.getText();
    }

    public hg getEmojiButton() {
        return this.E;
    }

    @Override
    public CharSequence getFieldText() {
        ai.z zVar = this.d;
        if (zVar.length() > 0) {
            return zVar.getText();
        }
        return null;
    }

    @Override
    public org.telegram.ui.ActionBar.d2 getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.k5 getTextView2() {
        return this.f31050n;
    }

    public void h(z5 z5Var, boolean z10) {
        this.f31051r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        boolean z12;
        float f10;
        float f11;
        wo woVar = this.f31051r;
        if (woVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return;
        }
        AnimatorSet animatorSet = this.f31054x;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f31054x = null;
        }
        if (z10) {
            num = 1;
        }
        woVar.setTag(num);
        ImageView imageView = this.h;
        float f12 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f31054x = animatorSet2;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            float[] fArr = {f11};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(woVar, property, fArr);
            if (!z10) {
                f12 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(imageView, property, f12));
            this.f31054x.setDuration(180L);
            this.f31054x.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        woVar.setAlpha(f10);
        if (!z10) {
            f12 = 1.0f;
        }
        imageView.setAlpha(f12);
    }

    public final void n(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f31049f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        ai.z zVar = this.d;
        zVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            zVar.setSelection(zVar.length());
        }
        zVar.setHint(str);
        this.f31053w = z10;
        setWillNotDraw(!z10);
    }

    public boolean o() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wo woVar = this.f31051r;
        if (woVar != null) {
            m(o(), false);
            woVar.a(f(this), false);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float L;
        int i3;
        if (this.f31053w && e()) {
            boolean z10 = bd.f21784a0;
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
            if (bd.f21784a0) {
                if (imageView != null) {
                    f11 = 58.0f;
                }
                i3 = org.telegram.messenger.g0.L(f11);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f12, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        hg hgVar;
        ImageView imageView;
        ai.z zVar;
        int i11;
        float f10;
        int size = View.MeasureSpec.getSize(i3);
        int i12 = 0;
        while (true) {
            int childCount = getChildCount();
            hgVar = this.E;
            imageView = this.f31049f;
            zVar = this.d;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt != zVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                } else if (childAt == hgVar) {
                    hgVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                    } else {
                        org.telegram.ui.ActionBar.k5 k5Var = this.f31050n;
                        if (childAt == k5Var) {
                            k5Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
                        } else {
                            wo woVar = this.f31051r;
                            if (childAt == woVar) {
                                woVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                            } else {
                                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                if (layoutParams != null) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                                } else {
                                    childAt.measure(i3, i10);
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
        } else if (this.f31050n == null) {
            i11 = 42;
        } else if (imageView == null) {
            i11 = 70;
        } else if (hgVar != null) {
            i11 = 144;
        } else {
            i11 = 122;
        }
        zVar.measure(org.telegram.messenger.camera.q.c(i11, (size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = zVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(org.telegram.messenger.g0.L(50.0f), zVar.getMeasuredHeight()) + (this.f31053w ? 1 : 0));
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f31050n;
        if (k5Var2 != null && !this.f31055y) {
            if (measuredHeight >= org.telegram.messenger.g0.L(52.0f)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            k5Var2.setAlpha(f10);
        }
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.f31046b.a(z10, true);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i3) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f31047c;
        ImageView imageView = this.h;
        if (imageView != null) {
            org.telegram.ui.ActionBar.r6.t(imageView, i3, e6Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f31049f;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.r6.t(imageView2, i3, e6Var, PorterDuff.Mode.MULTIPLY);
        }
        hg hgVar = this.E;
        if (hgVar != null) {
            org.telegram.ui.ActionBar.r6.t(hgVar, i3, e6Var, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z10) {
        this.f31052s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.k5 k5Var = this.f31050n;
        if (k5Var == null) {
            return;
        }
        k5Var.l(str, false);
    }

    public void setTextColor(int i3) {
        this.d.setTextColor(i3);
    }

    public void setTextRight(int i3) {
        this.F = Integer.valueOf(i3);
    }

    public void i(boolean z10) {
    }

    public void j(z5 z5Var) {
    }

    public void k(ai.z zVar) {
    }

    @Override
    public final void F(float f10, int i3) {
    }

    public void g(ai.z zVar, ActionMode actionMode) {
    }
}
