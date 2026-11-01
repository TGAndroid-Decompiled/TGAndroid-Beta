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
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.rx0;
public class e6 extends FrameLayout implements rx0, fe.e {
    public final fg D;
    public Integer E;
    public final fe.b f21859a;
    public final fe.b f21860b;
    public final org.telegram.ui.ActionBar.p6 f21861c;
    public final ih.b d;
    public ih.e e;
    public final ImageView f21862f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.u5 f21863n;
    public final ep f21864r;
    public boolean f21865s;
    public boolean f21866w;
    public AnimatorSet f21867x;
    public boolean f21868y;

    public e6(Context context, int i10, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i11;
        int i12;
        float f7;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        float f11;
        float f12;
        int i17;
        int i18;
        float f13;
        float f14;
        int i19;
        int i20;
        float f15;
        float f16;
        int i21;
        gr grVar = gr.h;
        this.f21859a = new fe.b(0, this, grVar, 380L, false);
        this.f21860b = new fe.b(1, this, grVar, 380L, false);
        this.f21861c = p6Var;
        ih.b bVar = new ih.b(this, context, p6Var, 1);
        this.d = bVar;
        bVar.setAllowTextEntitiesIntersection(true);
        org.telegram.ui.ActionBar.a7.V(bVar, org.telegram.ui.ActionBar.t6.G6, p6Var);
        org.telegram.ui.ActionBar.a7.H(bVar, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        org.telegram.ui.ActionBar.a7.E(bVar, org.telegram.ui.ActionBar.t6.H6, p6Var);
        bVar.setTextSize(1, 16.0f);
        bVar.setMaxLines(Integer.MAX_VALUE);
        bVar.setBackground(null);
        bVar.setImeOptions(bVar.getImeOptions() | 268435456);
        bVar.setInputType(bVar.getInputType() | 16384);
        bVar.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(11.0f));
        if (onClickListener != null) {
            if (i10 == 1) {
                i15 = 92;
            } else {
                i15 = 58;
            }
            boolean z10 = dd.X;
            if (z10) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i22 = i16 | 16;
            if (z10) {
                f11 = i15;
            } else {
                f11 = 54.0f;
            }
            if (!z10) {
                f12 = i15;
            } else {
                f12 = 54.0f;
            }
            addView(bVar, w7.b6.d(-1, -2.0f, i22, f11, 0.0f, f12, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(2131231848);
            int i23 = org.telegram.ui.ActionBar.t6.f21096m6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.a7.t(imageView, i23, p6Var, mode);
            if (dd.X) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            addView(imageView, w7.b6.d(48, 48.0f, i17 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f21862f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i24 = org.telegram.ui.ActionBar.t6.Ji;
            y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i24, p6Var), 1, -1);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i24);
            imageView2.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(imageView2, h02, null, N, p6Var);
            imageView2.setImageResource(2131232558);
            imageView2.setOnClickListener(onClickListener);
            org.telegram.ui.ActionBar.a7.t(imageView2, i23, p6Var, mode);
            imageView2.setContentDescription(dd.L0(2131751599, null));
            boolean z11 = dd.X;
            if (z11) {
                i18 = 3;
            } else {
                i18 = 5;
            }
            int i25 = i18 | 48;
            if (z11) {
                f13 = 3.0f;
            } else {
                f13 = 0.0f;
            }
            if (z11) {
                f14 = 0.0f;
            } else {
                f14 = 3.0f;
            }
            addView(imageView2, w7.b6.d(48, 50.0f, i25, f13, 0.0f, f14, 0.0f));
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
            this.f21863n = u5Var;
            u5Var.setTextSize(13);
            org.telegram.ui.ActionBar.u5 u5Var2 = this.f21863n;
            if (dd.X) {
                i19 = 3;
            } else {
                i19 = 5;
            }
            u5Var2.setGravity(i19 | 48);
            View view = this.f21863n;
            boolean z12 = dd.X;
            if (z12) {
                i20 = 3;
            } else {
                i20 = 5;
            }
            int i26 = i20 | 48;
            if (z12) {
                f15 = 20.0f;
            } else {
                f15 = 0.0f;
            }
            if (z12) {
                f16 = 0.0f;
            } else {
                f16 = 20.0f;
            }
            addView(view, w7.b6.d(48, 24.0f, i26, f15, 43.0f, f16, 0.0f));
            ep epVar = new ep(21, context, p6Var);
            this.f21864r = epVar;
            epVar.b(-1, i23, org.telegram.ui.ActionBar.t6.f21060k7);
            epVar.setContentDescription(dd.L0(2131754796, null));
            epVar.setDrawUnchecked(true);
            epVar.a(true, false);
            epVar.setAlpha(0.0f);
            epVar.setDrawBackgroundAsArc(8);
            if (dd.X) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            addView(epVar, w7.b6.d(48, 48.0f, i21 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            epVar.setOnClickListener(new View.OnClickListener(this) {
                public final e6 f21817b;

                {
                    this.f21817b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            e6 e6Var = this.f21817b;
                            ep epVar2 = e6Var.f21864r;
                            if (epVar2.getTag() != null) {
                                e6Var.h(e6Var, !epVar2.f25895a.f23920q);
                                return;
                            }
                            return;
                        default:
                            e6 e6Var2 = this.f21817b;
                            e6Var2.j(e6Var2);
                            return;
                    }
                }
            });
        } else {
            if (i10 == 1) {
                i11 = 70;
            } else {
                i11 = 19;
            }
            boolean z13 = dd.X;
            if (z13) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i27 = i12 | 16;
            if (z13) {
                f7 = i11;
            } else {
                f7 = 19.0f;
            }
            addView(bVar, w7.b6.d(-1, -2.0f, i27, f7, 0.0f, z13 ? 19.0f : i11, 0.0f));
        }
        if (i10 == 1) {
            fg fgVar = new fg(context);
            this.D = fgVar;
            org.telegram.ui.ActionBar.a7.t(fgVar, org.telegram.ui.ActionBar.t6.f21096m6, p6Var, PorterDuff.Mode.SRC_IN);
            fgVar.j(dg.e, false);
            int L = org.telegram.messenger.i0.L(9.5f);
            fgVar.setPadding(L, L, L, L);
            fgVar.setVisibility(8);
            if (this.f21862f == null) {
                i13 = 3;
            } else {
                i13 = 38;
            }
            boolean z14 = dd.X;
            if (z14) {
                i14 = 3;
            } else {
                i14 = 5;
            }
            if (z14) {
                f10 = i13;
            } else {
                f10 = 0.0f;
            }
            addView(fgVar, w7.b6.d(48, 48.0f, i14, f10, 0.0f, z14 ? 0.0f : i13, 0.0f));
            int i28 = org.telegram.ui.ActionBar.t6.Ji;
            y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i28, p6Var), 1, -1);
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i28);
            fgVar.setBackground(h03);
            org.telegram.ui.ActionBar.a7.k(fgVar, h03, null, N2, p6Var);
            fgVar.setOnClickListener(new View.OnClickListener(this) {
                public final e6 f21817b;

                {
                    this.f21817b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            e6 e6Var = this.f21817b;
                            ep epVar2 = e6Var.f21864r;
                            if (epVar2.getTag() != null) {
                                e6Var.h(e6Var, !epVar2.f25895a.f23920q);
                                return;
                            }
                            return;
                        default:
                            e6 e6Var2 = this.f21817b;
                            e6Var2.j(e6Var2);
                            return;
                    }
                }
            });
            fgVar.setContentDescription(dd.L0(2131751197, null));
        }
    }

    public final ih.e a() {
        int i10;
        float f7;
        float f10;
        int i11;
        int i12;
        float f11;
        int i13;
        float f12;
        ImageView imageView = this.f21862f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ih.e eVar = new ih.e(getContext(), 38);
        this.e = eVar;
        eVar.setFocusable(false);
        ih.e eVar2 = this.e;
        int i14 = org.telegram.ui.ActionBar.t6.Ji;
        org.telegram.ui.ActionBar.p6 p6Var = this.f21861c;
        org.telegram.ui.ActionBar.a7.R(eVar2, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i14, p6Var), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i14), p6Var);
        w7.e6.a(this.e);
        ih.e eVar3 = this.e;
        boolean z10 = dd.X;
        int i15 = 5;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        int i16 = i10 | 48;
        float f13 = 0.0f;
        if (z10) {
            f7 = 4.0f;
        } else {
            f7 = 0.0f;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 4.0f;
        }
        addView(eVar3, w7.b6.d(48, 50.0f, i16, f7, 0.0f, f10, 0.0f));
        fg fgVar = this.D;
        if (fgVar != null) {
            boolean z11 = dd.X;
            if (z11) {
                i13 = 3;
            } else {
                i13 = 5;
            }
            int i17 = i13 | 48;
            if (z11) {
                f12 = 44;
            } else {
                f12 = 0.0f;
            }
            if (!z11) {
                f13 = 44;
            }
            fgVar.setLayoutParams(w7.b6.d(48, 48.0f, i17, f12, 1.0f, f13, 0.0f));
        }
        ih.b bVar = this.d;
        if (bVar != null) {
            if (dd.X) {
                i11 = ((ViewGroup.MarginLayoutParams) bVar.getLayoutParams()).rightMargin;
            } else {
                i11 = ((ViewGroup.MarginLayoutParams) bVar.getLayoutParams()).leftMargin;
            }
            float f14 = i11 / org.telegram.messenger.i0.f16171p;
            if (fgVar != null) {
                i12 = 70;
            } else {
                i12 = 19;
            }
            int i18 = i12 + 24;
            boolean z12 = dd.X;
            if (!z12) {
                i15 = 3;
            }
            int i19 = i15 | 16;
            if (z12) {
                f11 = i18;
            } else {
                f11 = f14;
            }
            if (!z12) {
                f14 = i18;
            }
            bVar.setLayoutParams(w7.b6.d(-1, -2.0f, i19, f11, 0.0f, f14, 0.0f));
        }
        return this.e;
    }

    public final void b(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void c() {
        int i10;
        float f7;
        float f10;
        this.f21868y = true;
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(getContext());
        this.f21863n = u5Var;
        u5Var.setTextSize(13);
        org.telegram.ui.ActionBar.u5 u5Var2 = this.f21863n;
        int i11 = 5;
        if (dd.X) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        u5Var2.setGravity(i10 | 48);
        org.telegram.ui.ActionBar.u5 u5Var3 = this.f21863n;
        boolean z10 = dd.X;
        if (z10) {
            i11 = 3;
        }
        int i12 = i11 | 48;
        if (z10) {
            f7 = 20.0f;
        } else {
            f7 = 0.0f;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 20.0f;
        }
        addView(u5Var3, w7.b6.d(48, 24.0f, i12, f7, 17.0f, f10, 0.0f));
    }

    @Override
    public final void d(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public boolean e() {
        return true;
    }

    public boolean f(e6 e6Var) {
        return false;
    }

    public ep getCheckBox() {
        return this.f21864r;
    }

    @Override
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override
    public Editable getEditText() {
        return this.d.getText();
    }

    public fg getEmojiButton() {
        return this.D;
    }

    @Override
    public CharSequence getFieldText() {
        ih.b bVar = this.d;
        if (bVar.length() > 0) {
            return bVar.getText();
        }
        return null;
    }

    @Override
    public org.telegram.ui.ActionBar.k2 getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.u5 getTextView2() {
        return this.f21863n;
    }

    public void h(e6 e6Var, boolean z10) {
        this.f21864r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        ep epVar = this.f21864r;
        if (epVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return;
        }
        AnimatorSet animatorSet = this.f21867x;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f21867x = null;
        }
        if (z10) {
            num = 1;
        }
        epVar.setTag(num);
        ImageView imageView = this.h;
        float f11 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f21867x = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(epVar, property, fArr);
            if (!z10) {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(imageView, property, f11));
            this.f21867x.setDuration(180L);
            this.f21867x.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        epVar.setAlpha(f7);
        if (!z10) {
            f11 = 1.0f;
        }
        imageView.setAlpha(f11);
    }

    public final void n(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f21862f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        ih.b bVar = this.d;
        bVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            bVar.setSelection(bVar.length());
        }
        bVar.setHint(str);
        this.f21866w = z10;
        setWillNotDraw(!z10);
    }

    public boolean o() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ep epVar = this.f21864r;
        if (epVar != null) {
            m(o(), false);
            epVar.a(f(this), false);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float L;
        int i10;
        if (this.f21866w && e()) {
            boolean z10 = dd.X;
            float f10 = 20.0f;
            ImageView imageView = this.h;
            if (z10) {
                L = 0.0f;
            } else {
                if (imageView != null) {
                    f7 = 58.0f;
                } else {
                    f7 = 20.0f;
                }
                L = org.telegram.messenger.i0.L(f7);
            }
            float f11 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (dd.X) {
                if (imageView != null) {
                    f10 = 58.0f;
                }
                i10 = org.telegram.messenger.i0.L(f10);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        fg fgVar;
        ImageView imageView;
        ih.b bVar;
        int i12;
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        while (true) {
            int childCount = getChildCount();
            fgVar = this.D;
            imageView = this.f21862f;
            bVar = this.d;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt != bVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
                } else if (childAt == fgVar) {
                    fgVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
                    } else {
                        org.telegram.ui.ActionBar.u5 u5Var = this.f21863n;
                        if (childAt == u5Var) {
                            u5Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), 1073741824));
                        } else {
                            ep epVar = this.f21864r;
                            if (childAt == epVar) {
                                epVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
                            } else {
                                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                if (layoutParams != null) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                                } else {
                                    childAt.measure(i10, i11);
                                }
                            }
                        }
                    }
                }
            }
            i13++;
        }
        Integer num = this.E;
        if (num != null) {
            i12 = num.intValue();
        } else if (this.f21863n == null) {
            i12 = 42;
        } else if (imageView == null) {
            i12 = 70;
        } else if (fgVar != null) {
            i12 = 144;
        } else {
            i12 = 122;
        }
        bVar.measure(a30.c(i12, (size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = bVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(org.telegram.messenger.i0.L(50.0f), bVar.getMeasuredHeight()) + (this.f21866w ? 1 : 0));
        org.telegram.ui.ActionBar.u5 u5Var2 = this.f21863n;
        if (u5Var2 != null && !this.f21868y) {
            if (measuredHeight >= org.telegram.messenger.i0.L(52.0f)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            u5Var2.setAlpha(f7);
        }
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.f21860b.a(z10, true);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.f21861c;
        ImageView imageView = this.h;
        if (imageView != null) {
            org.telegram.ui.ActionBar.a7.t(imageView, i10, p6Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f21862f;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.a7.t(imageView2, i10, p6Var, PorterDuff.Mode.MULTIPLY);
        }
        fg fgVar = this.D;
        if (fgVar != null) {
            org.telegram.ui.ActionBar.a7.t(fgVar, i10, p6Var, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z10) {
        this.f21865s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.u5 u5Var = this.f21863n;
        if (u5Var == null) {
            return;
        }
        u5Var.l(str, false);
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }

    public void setTextRight(int i10) {
        this.E = Integer.valueOf(i10);
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        fg fgVar;
        int i11;
        if (i10 == 0) {
            ep epVar = this.f21864r;
            if (epVar != null) {
                CheckBoxBase checkBoxBase = epVar.getCheckBoxBase();
                float f11 = this.f21859a.e;
                if (checkBoxBase.f23925w != f11) {
                    checkBoxBase.f23925w = f11;
                    checkBoxBase.b();
                }
                epVar.invalidate();
            }
        } else if (i10 == 1 && (fgVar = this.D) != null) {
            float f12 = this.f21860b.e;
            float f13 = 0.85f * f12;
            fgVar.setScaleX(f13);
            fgVar.setScaleY(f13);
            fgVar.setAlpha(f12);
            if (f12 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            fgVar.setVisibility(i11);
            org.telegram.ui.ActionBar.u5 u5Var = this.f21863n;
            if (u5Var != null && this.f21862f == null && u5Var.getVisibility() == 0) {
                if (this.e != null) {
                    this.f21863n.setTranslationY(org.telegram.messenger.i0.L(36.0f));
                } else {
                    this.f21863n.setTranslationY(org.telegram.messenger.i0.L(26.0f) * f12);
                }
            }
        }
    }

    public void i(boolean z10) {
    }

    public void j(e6 e6Var) {
    }

    public void k(ih.b bVar) {
    }

    @Override
    public final void E(float f7, int i10) {
    }

    public void g(ih.b bVar, ActionMode actionMode) {
    }
}
