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
import org.telegram.messenger.id;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.gg;
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wq;
public class a6 extends FrameLayout implements mw0, te.b {
    public final ig D;
    public Integer E;
    public final te.a f28903a;
    public final te.a f28904b;
    public final org.telegram.ui.ActionBar.h6 f28905c;
    public final z5 d;
    public bi f28906e;
    public final ImageView f28907f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.m5 f28908n;
    public final wo f28909r;
    public boolean f28910s;
    public boolean f28911w;
    public AnimatorSet f28912x;
    public boolean f28913y;

    public a6(Context context, int i7, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.h6 h6Var) {
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
        wq wqVar = wq.h;
        this.f28903a = new te.a(0, this, wqVar, 380L, false);
        this.f28904b = new te.a(1, this, wqVar, 380L, false);
        this.f28905c = h6Var;
        z5 z5Var = new z5(this, context, h6Var, 0);
        this.d = z5Var;
        z5Var.setAllowTextEntitiesIntersection(true);
        org.telegram.ui.ActionBar.t6.U(z5Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        org.telegram.ui.ActionBar.t6.G(z5Var, org.telegram.ui.ActionBar.m6.Uc, h6Var);
        org.telegram.ui.ActionBar.t6.D(z5Var, org.telegram.ui.ActionBar.m6.H6, h6Var);
        z5Var.setTextSize(1, 16.0f);
        z5Var.setMaxLines(Integer.MAX_VALUE);
        z5Var.setBackground(null);
        z5Var.setImeOptions(z5Var.getImeOptions() | 268435456);
        z5Var.setInputType(z5Var.getInputType() | 16384);
        z5Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
        if (onClickListener != null) {
            if (i7 == 1) {
                i14 = 92;
            } else {
                i14 = 58;
            }
            boolean z9 = id.f23161a0;
            if (z9) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i21 = i15 | 16;
            if (z9) {
                f12 = i14;
            } else {
                f12 = 54.0f;
            }
            if (!z9) {
                f13 = i14;
            } else {
                f13 = 54.0f;
            }
            addView(z5Var, c8.ha.d(-1, -2.0f, i21, f12, 0.0f, f13, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(2131231849);
            int i22 = org.telegram.ui.ActionBar.m6.f28055m6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.t6.s(imageView, i22, h6Var, mode);
            if (id.f23161a0) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            addView(imageView, c8.ha.d(48, 48.0f, i16 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f28907f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i23 = org.telegram.ui.ActionBar.m6.Ji;
            y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i23, h6Var), 1, -1);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i23);
            imageView2.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(imageView2, h02, null, M, h6Var);
            imageView2.setImageResource(2131232561);
            imageView2.setOnClickListener(onClickListener);
            org.telegram.ui.ActionBar.t6.s(imageView2, i22, h6Var, mode);
            imageView2.setContentDescription(id.M0(2131751598, null));
            boolean z10 = id.f23161a0;
            if (z10) {
                i17 = 3;
            } else {
                i17 = 5;
            }
            int i24 = i17 | 48;
            if (z10) {
                f14 = 3.0f;
            } else {
                f14 = 0.0f;
            }
            if (z10) {
                f15 = 0.0f;
            } else {
                f15 = 3.0f;
            }
            addView(imageView2, c8.ha.d(48, 50.0f, i24, f14, 0.0f, f15, 0.0f));
            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
            this.f28908n = m5Var;
            m5Var.setTextSize(13);
            org.telegram.ui.ActionBar.m5 m5Var2 = this.f28908n;
            if (id.f23161a0) {
                i18 = 3;
            } else {
                i18 = 5;
            }
            m5Var2.setGravity(i18 | 48);
            View view = this.f28908n;
            boolean z11 = id.f23161a0;
            if (z11) {
                i19 = 3;
            } else {
                i19 = 5;
            }
            int i25 = i19 | 48;
            if (z11) {
                f16 = 20.0f;
            } else {
                f16 = 0.0f;
            }
            if (z11) {
                f17 = 0.0f;
            } else {
                f17 = 20.0f;
            }
            addView(view, c8.ha.d(48, 24.0f, i25, f16, 43.0f, f17, 0.0f));
            wo woVar = new wo(21, context, h6Var);
            this.f28909r = woVar;
            woVar.b(-1, i22, org.telegram.ui.ActionBar.m6.f28020k7);
            woVar.setContentDescription(id.M0(2131754796, null));
            woVar.setDrawUnchecked(true);
            woVar.a(true, false);
            woVar.setAlpha(0.0f);
            woVar.setDrawBackgroundAsArc(8);
            if (id.f23161a0) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            addView(woVar, c8.ha.d(48, 48.0f, i20 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            woVar.setOnClickListener(new View.OnClickListener(this) {
                public final a6 f30946b;

                {
                    this.f30946b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            a6 a6Var = this.f30946b;
                            wo woVar2 = a6Var.f28909r;
                            if (woVar2.getTag() != null) {
                                a6Var.h(a6Var, !woVar2.f40026a.f31279q);
                                return;
                            }
                            return;
                        default:
                            a6 a6Var2 = this.f30946b;
                            a6Var2.j(a6Var2);
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
            boolean z12 = id.f23161a0;
            if (z12) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i26 = i11 | 16;
            if (z12) {
                f10 = i10;
            } else {
                f10 = 19.0f;
            }
            addView(z5Var, c8.ha.d(-1, -2.0f, i26, f10, 0.0f, z12 ? 19.0f : i10, 0.0f));
        }
        if (i7 == 1) {
            ig igVar = new ig(context);
            this.D = igVar;
            org.telegram.ui.ActionBar.t6.s(igVar, org.telegram.ui.ActionBar.m6.f28055m6, h6Var, PorterDuff.Mode.SRC_IN);
            igVar.j(gg.f33892e, false);
            int L = org.telegram.messenger.g0.L(9.5f);
            igVar.setPadding(L, L, L, L);
            igVar.setVisibility(8);
            if (this.f28907f == null) {
                i12 = 3;
            } else {
                i12 = 38;
            }
            boolean z13 = id.f23161a0;
            if (z13) {
                i13 = 3;
            } else {
                i13 = 5;
            }
            if (z13) {
                f11 = i12;
            } else {
                f11 = 0.0f;
            }
            addView(igVar, c8.ha.d(48, 48.0f, i13, f11, 0.0f, z13 ? 0.0f : i12, 0.0f));
            int i27 = org.telegram.ui.ActionBar.m6.Ji;
            y h03 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i27, h6Var), 1, -1);
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i27);
            igVar.setBackground(h03);
            org.telegram.ui.ActionBar.t6.j(igVar, h03, null, M2, h6Var);
            igVar.setOnClickListener(new View.OnClickListener(this) {
                public final a6 f30946b;

                {
                    this.f30946b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            a6 a6Var = this.f30946b;
                            wo woVar2 = a6Var.f28909r;
                            if (woVar2.getTag() != null) {
                                a6Var.h(a6Var, !woVar2.f40026a.f31279q);
                                return;
                            }
                            return;
                        default:
                            a6 a6Var2 = this.f30946b;
                            a6Var2.j(a6Var2);
                            return;
                    }
                }
            });
            igVar.setContentDescription(id.M0(2131751196, null));
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        ig igVar;
        int i10;
        if (i7 == 0) {
            wo woVar = this.f28909r;
            if (woVar != null) {
                CheckBoxBase checkBoxBase = woVar.getCheckBoxBase();
                float f12 = this.f28903a.f55498e;
                if (checkBoxBase.f31284w != f12) {
                    checkBoxBase.f31284w = f12;
                    checkBoxBase.b();
                }
                woVar.invalidate();
            }
        } else if (i7 == 1 && (igVar = this.D) != null) {
            float f13 = this.f28904b.f55498e;
            float f14 = 0.85f * f13;
            igVar.setScaleX(f14);
            igVar.setScaleY(f14);
            igVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            igVar.setVisibility(i10);
            org.telegram.ui.ActionBar.m5 m5Var = this.f28908n;
            if (m5Var != null && this.f28907f == null && m5Var.getVisibility() == 0) {
                if (this.f28906e != null) {
                    this.f28908n.setTranslationY(org.telegram.messenger.g0.L(36.0f));
                } else {
                    this.f28908n.setTranslationY(org.telegram.messenger.g0.L(26.0f) * f13);
                }
            }
        }
    }

    public final bi a() {
        int i7;
        float f10;
        float f11;
        int i10;
        int i11;
        float f12;
        int i12;
        float f13;
        ImageView imageView = this.f28907f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        bi biVar = new bi(getContext(), 38);
        this.f28906e = biVar;
        biVar.setFocusable(false);
        bi biVar2 = this.f28906e;
        int i13 = org.telegram.ui.ActionBar.m6.Ji;
        org.telegram.ui.ActionBar.h6 h6Var = this.f28905c;
        org.telegram.ui.ActionBar.t6.Q(biVar2, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i13, h6Var), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i13), h6Var);
        c8.ka.a(this.f28906e);
        bi biVar3 = this.f28906e;
        boolean z9 = id.f23161a0;
        int i14 = 5;
        if (z9) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        int i15 = i7 | 48;
        float f14 = 0.0f;
        if (z9) {
            f10 = 4.0f;
        } else {
            f10 = 0.0f;
        }
        if (z9) {
            f11 = 0.0f;
        } else {
            f11 = 4.0f;
        }
        addView(biVar3, c8.ha.d(48, 50.0f, i15, f10, 0.0f, f11, 0.0f));
        ig igVar = this.D;
        if (igVar != null) {
            boolean z10 = id.f23161a0;
            if (z10) {
                i12 = 3;
            } else {
                i12 = 5;
            }
            int i16 = i12 | 48;
            if (z10) {
                f13 = 44;
            } else {
                f13 = 0.0f;
            }
            if (!z10) {
                f14 = 44;
            }
            igVar.setLayoutParams(c8.ha.d(48, 48.0f, i16, f13, 1.0f, f14, 0.0f));
        }
        z5 z5Var = this.d;
        if (z5Var != null) {
            if (id.f23161a0) {
                i10 = ((ViewGroup.MarginLayoutParams) z5Var.getLayoutParams()).rightMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) z5Var.getLayoutParams()).leftMargin;
            }
            float f15 = i10 / org.telegram.messenger.g0.f22566p;
            if (igVar != null) {
                i11 = 70;
            } else {
                i11 = 19;
            }
            int i17 = i11 + 24;
            boolean z11 = id.f23161a0;
            if (!z11) {
                i14 = 3;
            }
            int i18 = i14 | 16;
            if (z11) {
                f12 = i17;
            } else {
                f12 = f15;
            }
            if (!z11) {
                f15 = i17;
            }
            z5Var.setLayoutParams(c8.ha.d(-1, -2.0f, i18, f12, 0.0f, f15, 0.0f));
        }
        return this.f28906e;
    }

    public final void b(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void c() {
        int i7;
        float f10;
        float f11;
        this.f28913y = true;
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(getContext());
        this.f28908n = m5Var;
        m5Var.setTextSize(13);
        org.telegram.ui.ActionBar.m5 m5Var2 = this.f28908n;
        int i10 = 5;
        if (id.f23161a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        m5Var2.setGravity(i7 | 48);
        org.telegram.ui.ActionBar.m5 m5Var3 = this.f28908n;
        boolean z9 = id.f23161a0;
        if (z9) {
            i10 = 3;
        }
        int i11 = i10 | 48;
        if (z9) {
            f10 = 20.0f;
        } else {
            f10 = 0.0f;
        }
        if (z9) {
            f11 = 0.0f;
        } else {
            f11 = 20.0f;
        }
        addView(m5Var3, c8.ha.d(48, 24.0f, i11, f10, 17.0f, f11, 0.0f));
    }

    @Override
    public final void d(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public boolean e() {
        return true;
    }

    public boolean f(a6 a6Var) {
        return false;
    }

    public wo getCheckBox() {
        return this.f28909r;
    }

    @Override
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override
    public Editable getEditText() {
        return this.d.getText();
    }

    public ig getEmojiButton() {
        return this.D;
    }

    @Override
    public CharSequence getFieldText() {
        z5 z5Var = this.d;
        if (z5Var.length() > 0) {
            return z5Var.getText();
        }
        return null;
    }

    @Override
    public org.telegram.ui.ActionBar.f2 getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.m5 getTextView2() {
        return this.f28908n;
    }

    public void h(a6 a6Var, boolean z9) {
        this.f28909r.a(z9, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z9, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        wo woVar = this.f28909r;
        if (woVar.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.f28912x;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f28912x = null;
        }
        if (z9) {
            num = 1;
        }
        woVar.setTag(num);
        ImageView imageView = this.h;
        float f12 = 0.0f;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f28912x = animatorSet2;
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            float[] fArr = {f11};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(woVar, property, fArr);
            if (!z9) {
                f12 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(imageView, property, f12));
            this.f28912x.setDuration(180L);
            this.f28912x.start();
            return;
        }
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        woVar.setAlpha(f10);
        if (!z9) {
            f12 = 1.0f;
        }
        imageView.setAlpha(f12);
    }

    public final void n(CharSequence charSequence, String str, boolean z9) {
        ImageView imageView = this.f28907f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        z5 z5Var = this.d;
        z5Var.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            z5Var.setSelection(z5Var.length());
        }
        z5Var.setHint(str);
        this.f28911w = z9;
        setWillNotDraw(!z9);
    }

    public boolean o() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wo woVar = this.f28909r;
        if (woVar != null) {
            m(o(), false);
            woVar.a(f(this), false);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float L;
        int i7;
        if (this.f28911w && e()) {
            boolean z9 = id.f23161a0;
            float f11 = 20.0f;
            ImageView imageView = this.h;
            if (z9) {
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
            if (id.f23161a0) {
                if (imageView != null) {
                    f11 = 58.0f;
                }
                i7 = org.telegram.messenger.g0.L(f11);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f12, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ig igVar;
        ImageView imageView;
        z5 z5Var;
        int i11;
        float f10;
        int size = View.MeasureSpec.getSize(i7);
        int i12 = 0;
        while (true) {
            int childCount = getChildCount();
            igVar = this.D;
            imageView = this.f28907f;
            z5Var = this.d;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt != z5Var) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                } else if (childAt == igVar) {
                    igVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                    } else {
                        org.telegram.ui.ActionBar.m5 m5Var = this.f28908n;
                        if (childAt == m5Var) {
                            m5Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
                        } else {
                            wo woVar = this.f28909r;
                            if (childAt == woVar) {
                                woVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
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
        Integer num = this.E;
        if (num != null) {
            i11 = num.intValue();
        } else if (this.f28908n == null) {
            i11 = 42;
        } else if (imageView == null) {
            i11 = 70;
        } else if (igVar != null) {
            i11 = 144;
        } else {
            i11 = 122;
        }
        z5Var.measure(org.telegram.messenger.camera.q.c(i11, (size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = z5Var.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(org.telegram.messenger.g0.L(50.0f), z5Var.getMeasuredHeight()) + (this.f28911w ? 1 : 0));
        org.telegram.ui.ActionBar.m5 m5Var2 = this.f28908n;
        if (m5Var2 != null && !this.f28913y) {
            if (measuredHeight >= org.telegram.messenger.g0.L(52.0f)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            m5Var2.setAlpha(f10);
        }
    }

    public void setEmojiButtonVisibility(boolean z9) {
        this.f28904b.a(z9, true);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i7) {
        org.telegram.ui.ActionBar.h6 h6Var = this.f28905c;
        ImageView imageView = this.h;
        if (imageView != null) {
            org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f28907f;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.t6.s(imageView2, i7, h6Var, PorterDuff.Mode.MULTIPLY);
        }
        ig igVar = this.D;
        if (igVar != null) {
            org.telegram.ui.ActionBar.t6.s(igVar, i7, h6Var, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z9) {
        this.f28910s = z9;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.m5 m5Var = this.f28908n;
        if (m5Var == null) {
            return;
        }
        m5Var.l(str, false);
    }

    public void setTextColor(int i7) {
        this.d.setTextColor(i7);
    }

    public void setTextRight(int i7) {
        this.E = Integer.valueOf(i7);
    }

    public void i(boolean z9) {
    }

    public void j(a6 a6Var) {
    }

    public void k(z5 z5Var) {
    }

    @Override
    public final void F(float f10, int i7) {
    }

    public void g(z5 z5Var, ActionMode actionMode) {
    }
}
