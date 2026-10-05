package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.tr;
public class d6 extends FrameLayout implements hz0, le.d {
    public Integer E;
    public final le.b f21927a;
    public final le.b f21928b;
    public final org.telegram.ui.ActionBar.d6 f21929c;
    public final c6 d;
    public qh.d f21930e;
    public final ImageView f21931f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.i5 f21932n;
    public final qp f21933r;
    public boolean f21934s;
    public boolean v;
    public AnimatorSet f21935w;
    public boolean f21936x;
    public final ch f21937y;

    public d6(Context context, int i10, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i11;
        int i12;
        float f7;
        float f10;
        int i13;
        int i14;
        float f11;
        float f12;
        int i15;
        int i16;
        float f13;
        float f14;
        int i17;
        int i18;
        float f15;
        float f16;
        int i19;
        int i20;
        float f17;
        float f18;
        int i21;
        tr trVar = tr.h;
        this.f21927a = new le.b(0, this, trVar, 380L, false);
        this.f21928b = new le.b(1, this, trVar, 380L, false);
        this.f21929c = d6Var;
        c6 c6Var = new c6(this, context, d6Var, 0);
        this.d = c6Var;
        c6Var.setAllowTextEntitiesIntersection(true);
        c6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var));
        c6Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, d6Var));
        c6Var.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.H6, d6Var));
        c6Var.setTextSize(1, 16.0f);
        c6Var.setMaxLines(Integer.MAX_VALUE);
        c6Var.setBackground(null);
        c6Var.setImeOptions(c6Var.getImeOptions() | 268435456);
        c6Var.setInputType(c6Var.getInputType() | 16384);
        c6Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        if (onClickListener != null) {
            if (i10 == 1) {
                i15 = 92;
            } else {
                i15 = 58;
            }
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i22 = i16 | 16;
            if (z10) {
                f13 = i15;
            } else {
                f13 = 54.0f;
            }
            if (!z10) {
                f14 = i15;
            } else {
                f14 = 54.0f;
            }
            addView(c6Var, w7.z5.d(-1, -2.0f, i22, f13, 0.0f, f14, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i23 = org.telegram.ui.ActionBar.i6.f20993m6;
            int v02 = org.telegram.ui.ActionBar.i6.v0(i23, d6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
            if (LocaleController.isRTL) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            addView(imageView, w7.z5.d(48, 48.0f, i17 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f21931f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            imageView2.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Vh, d6Var), 1, -1));
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i23, d6Var), mode));
            imageView2.setContentDescription(LocaleController.getString(R.string.Delete));
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i18 = 3;
            } else {
                i18 = 5;
            }
            int i24 = i18 | 48;
            if (z11) {
                f15 = 3.0f;
            } else {
                f15 = 0.0f;
            }
            if (z11) {
                f16 = 0.0f;
            } else {
                f16 = 3.0f;
            }
            addView(imageView2, w7.z5.d(48, 50.0f, i24, f15, 0.0f, f16, 0.0f));
            org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
            this.f21932n = i5Var;
            i5Var.setTextSize(13);
            org.telegram.ui.ActionBar.i5 i5Var2 = this.f21932n;
            if (LocaleController.isRTL) {
                i19 = 3;
            } else {
                i19 = 5;
            }
            i5Var2.setGravity(i19 | 48);
            View view = this.f21932n;
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i20 = 3;
            } else {
                i20 = 5;
            }
            int i25 = i20 | 48;
            if (z12) {
                f17 = 20.0f;
            } else {
                f17 = 0.0f;
            }
            if (z12) {
                f18 = 0.0f;
            } else {
                f18 = 20.0f;
            }
            addView(view, w7.z5.d(48, 24.0f, i25, f17, 43.0f, f18, 0.0f));
            qp qpVar = new qp(context, 21, d6Var);
            this.f21933r = qpVar;
            qpVar.b(-1, i23, org.telegram.ui.ActionBar.i6.f20957k7);
            qpVar.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            qpVar.setDrawUnchecked(true);
            qpVar.a(true, false);
            qpVar.setAlpha(0.0f);
            qpVar.setDrawBackgroundAsArc(8);
            if (LocaleController.isRTL) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            addView(qpVar, w7.z5.d(48, 48.0f, i21 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            qpVar.setOnClickListener(new View.OnClickListener(this) {
                public final d6 f21845b;

                {
                    this.f21845b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            d6 d6Var2 = this.f21845b;
                            qp qpVar2 = d6Var2.f21933r;
                            if (qpVar2.getTag() != null) {
                                d6Var2.h(d6Var2, !qpVar2.f30169a.f24101q);
                                return;
                            }
                            return;
                        default:
                            d6 d6Var3 = this.f21845b;
                            d6Var3.j(d6Var3);
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
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i26 = i12 | 16;
            if (z13) {
                f7 = i11;
            } else {
                f7 = 19.0f;
            }
            if (z13) {
                f10 = 19.0f;
            } else {
                f10 = i11;
            }
            addView(c6Var, w7.z5.d(-1, -2.0f, i26, f7, 0.0f, f10, 0.0f));
        }
        if (i10 == 1) {
            ch chVar = new ch(context);
            this.f21937y = chVar;
            chVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20993m6, d6Var), PorterDuff.Mode.SRC_IN));
            chVar.j(ah.f24598e, false);
            int dp = AndroidUtilities.dp(9.5f);
            chVar.setPadding(dp, dp, dp, dp);
            chVar.setVisibility(8);
            if (this.f21931f == null) {
                i13 = 3;
            } else {
                i13 = 38;
            }
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i14 = 3;
            } else {
                i14 = 5;
            }
            if (z14) {
                f11 = i13;
            } else {
                f11 = 0.0f;
            }
            if (z14) {
                f12 = 0.0f;
            } else {
                f12 = i13;
            }
            addView(chVar, w7.z5.d(48, 48.0f, i14, f11, 0.0f, f12, 0.0f));
            chVar.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Vh, d6Var), 1, -1));
            chVar.setOnClickListener(new View.OnClickListener(this) {
                public final d6 f21845b;

                {
                    this.f21845b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            d6 d6Var2 = this.f21845b;
                            qp qpVar2 = d6Var2.f21933r;
                            if (qpVar2.getTag() != null) {
                                d6Var2.h(d6Var2, !qpVar2.f30169a.f24101q);
                                return;
                            }
                            return;
                        default:
                            d6 d6Var3 = this.f21845b;
                            d6Var3.j(d6Var3);
                            return;
                    }
                }
            });
            chVar.setContentDescription(LocaleController.getString(R.string.Emoji));
        }
    }

    @Override
    public final void a(ci.i2 i2Var) {
        this.d.addTextChangedListener(i2Var);
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        ch chVar;
        int i11;
        if (i10 == 0) {
            qp qpVar = this.f21933r;
            if (qpVar != null) {
                CheckBoxBase checkBoxBase = qpVar.getCheckBoxBase();
                float f11 = this.f21927a.f15436e;
                if (checkBoxBase.f24106w != f11) {
                    checkBoxBase.f24106w = f11;
                    checkBoxBase.b();
                }
                qpVar.invalidate();
            }
        } else if (i10 == 1 && (chVar = this.f21937y) != null) {
            float f12 = this.f21928b.f15436e;
            float f13 = 0.85f * f12;
            chVar.setScaleX(f13);
            chVar.setScaleY(f13);
            chVar.setAlpha(f12);
            if (f12 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            chVar.setVisibility(i11);
            org.telegram.ui.ActionBar.i5 i5Var = this.f21932n;
            if (i5Var != null && this.f21931f == null && i5Var.getVisibility() == 0) {
                if (this.f21930e != null) {
                    this.f21932n.setTranslationY(AndroidUtilities.dp(36.0f));
                } else {
                    this.f21932n.setTranslationY(AndroidUtilities.dp(26.0f) * f12);
                }
            }
        }
    }

    public final qh.d b() {
        int i10;
        float f7;
        float f10;
        int i11;
        int i12;
        float f11;
        int i13;
        float f12;
        float f13;
        ImageView imageView = this.f21931f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        qh.d dVar = new qh.d(getContext(), 38);
        this.f21930e = dVar;
        dVar.setFocusable(false);
        this.f21930e.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Vh, this.f21929c), 1, -1));
        w7.b6.a(this.f21930e);
        qh.d dVar2 = this.f21930e;
        boolean z10 = LocaleController.isRTL;
        int i14 = 5;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        int i15 = i10 | 48;
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
        addView(dVar2, w7.z5.d(48, 50.0f, i15, f7, 0.0f, f10, 0.0f));
        ch chVar = this.f21937y;
        if (chVar != null) {
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i13 = 3;
            } else {
                i13 = 5;
            }
            int i16 = i13 | 48;
            if (z11) {
                f12 = 44;
            } else {
                f12 = 0.0f;
            }
            if (z11) {
                f13 = 0.0f;
            } else {
                f13 = 44;
            }
            chVar.setLayoutParams(w7.z5.d(48, 48.0f, i16, f12, 1.0f, f13, 0.0f));
        }
        c6 c6Var = this.d;
        if (c6Var != null) {
            if (LocaleController.isRTL) {
                i11 = ((ViewGroup.MarginLayoutParams) c6Var.getLayoutParams()).rightMargin;
            } else {
                i11 = ((ViewGroup.MarginLayoutParams) c6Var.getLayoutParams()).leftMargin;
            }
            float f14 = i11 / AndroidUtilities.density;
            if (chVar != null) {
                i12 = 70;
            } else {
                i12 = 19;
            }
            int i17 = i12 + 24;
            boolean z12 = LocaleController.isRTL;
            if (!z12) {
                i14 = 3;
            }
            int i18 = i14 | 16;
            if (z12) {
                f11 = i17;
            } else {
                f11 = f14;
            }
            if (!z12) {
                f14 = i17;
            }
            c6Var.setLayoutParams(w7.z5.d(-1, -2.0f, i18, f11, 0.0f, f14, 0.0f));
        }
        return this.f21930e;
    }

    public final void c(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void d() {
        int i10;
        float f7;
        float f10;
        this.f21936x = true;
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(getContext());
        this.f21932n = i5Var;
        i5Var.setTextSize(13);
        org.telegram.ui.ActionBar.i5 i5Var2 = this.f21932n;
        int i11 = 5;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        i5Var2.setGravity(i10 | 48);
        org.telegram.ui.ActionBar.i5 i5Var3 = this.f21932n;
        boolean z10 = LocaleController.isRTL;
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
        addView(i5Var3, w7.z5.d(48, 24.0f, i12, f7, 17.0f, f10, 0.0f));
    }

    public boolean e() {
        return true;
    }

    public boolean f(d6 d6Var) {
        return false;
    }

    public qp getCheckBox() {
        return this.f21933r;
    }

    @Override
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override
    public Editable getEditText() {
        return this.d.getText();
    }

    public ch getEmojiButton() {
        return this.f21937y;
    }

    @Override
    public CharSequence getFieldText() {
        c6 c6Var = this.d;
        if (c6Var.length() > 0) {
            return c6Var.getText();
        }
        return null;
    }

    @Override
    public org.telegram.ui.ActionBar.n2 getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.i5 getTextView2() {
        return this.f21932n;
    }

    public void h(d6 d6Var, boolean z10) {
        this.f21933r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        qp qpVar = this.f21933r;
        if (qpVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return;
        }
        AnimatorSet animatorSet = this.f21935w;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f21935w = null;
        }
        if (z10) {
            num = 1;
        }
        qpVar.setTag(num);
        ImageView imageView = this.h;
        float f11 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f21935w = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qpVar, property, fArr);
            if (!z10) {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(imageView, property, f11));
            this.f21935w.setDuration(180L);
            this.f21935w.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        qpVar.setAlpha(f7);
        if (!z10) {
            f11 = 1.0f;
        }
        imageView.setAlpha(f11);
    }

    public final void n(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f21931f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        c6 c6Var = this.d;
        c6Var.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            c6Var.setSelection(c6Var.length());
        }
        c6Var.setHint(str);
        this.v = z10;
        setWillNotDraw(!z10);
    }

    public boolean o() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qp qpVar = this.f21933r;
        if (qpVar != null) {
            m(o(), false);
            qpVar.a(f(this), false);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float dp;
        int i10;
        if (this.v && e()) {
            boolean z10 = LocaleController.isRTL;
            float f10 = 20.0f;
            ImageView imageView = this.h;
            if (z10) {
                dp = 0.0f;
            } else {
                if (imageView != null) {
                    f7 = 58.0f;
                } else {
                    f7 = 20.0f;
                }
                dp = AndroidUtilities.dp(f7);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (imageView != null) {
                    f10 = 58.0f;
                }
                i10 = AndroidUtilities.dp(f10);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f20950k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ch chVar;
        ImageView imageView;
        c6 c6Var;
        int i12;
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        while (true) {
            int childCount = getChildCount();
            chVar = this.f21937y;
            imageView = this.f21931f;
            c6Var = this.d;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt != c6Var) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else if (childAt == chVar) {
                    chVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    } else {
                        org.telegram.ui.ActionBar.i5 i5Var = this.f21932n;
                        if (childAt == i5Var) {
                            i5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                        } else {
                            qp qpVar = this.f21933r;
                            if (childAt == qpVar) {
                                qpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
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
        } else if (this.f21932n == null) {
            i12 = 42;
        } else if (imageView == null) {
            i12 = 70;
        } else if (chVar != null) {
            i12 = 144;
        } else {
            i12 = 122;
        }
        c6Var.measure(bi.c(i12, (size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = c6Var.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), c6Var.getMeasuredHeight()) + (this.v ? 1 : 0));
        org.telegram.ui.ActionBar.i5 i5Var2 = this.f21932n;
        if (i5Var2 != null && !this.f21936x) {
            if (measuredHeight >= AndroidUtilities.dp(52.0f)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            i5Var2.setAlpha(f7);
        }
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.f21928b.a(z10, true);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i10) {
        org.telegram.ui.ActionBar.d6 d6Var = this.f21929c;
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.f21931f;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        }
        ch chVar = this.f21937y;
        if (chVar != null) {
            chVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), PorterDuff.Mode.SRC_IN));
        }
    }

    public void setShowNextButton(boolean z10) {
        this.f21934s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.i5 i5Var = this.f21932n;
        if (i5Var == null) {
            return;
        }
        i5Var.l(str, false);
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }

    public void setTextRight(int i10) {
        this.E = Integer.valueOf(i10);
    }

    public void i(boolean z10) {
    }

    public void j(d6 d6Var) {
    }

    public void k(c6 c6Var) {
    }

    @Override
    public final void V(float f7, int i10) {
    }

    public void g(c6 c6Var, ActionMode actionMode) {
    }
}
