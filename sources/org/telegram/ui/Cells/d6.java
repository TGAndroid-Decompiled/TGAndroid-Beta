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
import org.telegram.messenger.am;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.sz0;
public class d6 extends FrameLayout implements sz0, me.d {
    public Integer E;
    public final me.b f21733a;
    public final me.b f21734b;
    public final org.telegram.ui.ActionBar.c6 f21735c;
    public final c6 d;
    public qh.d f21736e;
    public final ImageView f21737f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.h5 f21738n;
    public final fq f21739r;
    public boolean f21740s;
    public boolean v;
    public AnimatorSet f21741w;
    public boolean f21742x;
    public final fh f21743y;

    public d6(Context context, int i10, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.c6 c6Var) {
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
        int i17;
        int i18;
        float f12;
        float f13;
        int i19;
        int i20;
        float f14;
        float f15;
        int i21;
        js jsVar = js.h;
        this.f21733a = new me.b(0, this, jsVar, 380L, false);
        this.f21734b = new me.b(1, this, jsVar, 380L, false);
        this.f21735c = c6Var;
        c6 c6Var2 = new c6(this, context, c6Var, 0);
        this.d = c6Var2;
        c6Var2.setAllowTextEntitiesIntersection(true);
        c6Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, c6Var));
        c6Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, c6Var));
        c6Var2.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H6, c6Var));
        c6Var2.setTextSize(1, 16.0f);
        c6Var2.setMaxLines(Integer.MAX_VALUE);
        c6Var2.setBackground(null);
        c6Var2.setImeOptions(c6Var2.getImeOptions() | 268435456);
        c6Var2.setInputType(c6Var2.getInputType() | 16384);
        c6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
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
                f11 = i15;
            } else {
                f11 = 54.0f;
            }
            addView(c6Var2, w7.w5.a(-2.0f, f11, 0.0f, z10 ? 54.0f : i15, 0.0f, -1, i22));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i23 = org.telegram.ui.ActionBar.h6.f20724m6;
            int w02 = org.telegram.ui.ActionBar.h6.w0(i23, c6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
            if (LocaleController.isRTL) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            addView(imageView, w7.w5.a(48.0f, 6.0f, 2.0f, 6.0f, 0.0f, 48, i17 | 48));
            ImageView imageView2 = new ImageView(context);
            this.f21737f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Vh, c6Var), 1, -1));
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i23, c6Var), mode));
            imageView2.setContentDescription(LocaleController.getString(R.string.Delete));
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i18 = 3;
            } else {
                i18 = 5;
            }
            int i24 = i18 | 48;
            if (z11) {
                f12 = 3.0f;
            } else {
                f12 = 0.0f;
            }
            if (z11) {
                f13 = 0.0f;
            } else {
                f13 = 3.0f;
            }
            addView(imageView2, w7.w5.a(50.0f, f12, 0.0f, f13, 0.0f, 48, i24));
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            this.f21738n = h5Var;
            h5Var.setTextSize(13);
            org.telegram.ui.ActionBar.h5 h5Var2 = this.f21738n;
            if (LocaleController.isRTL) {
                i19 = 3;
            } else {
                i19 = 5;
            }
            h5Var2.setGravity(i19 | 48);
            View view = this.f21738n;
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i20 = 3;
            } else {
                i20 = 5;
            }
            int i25 = i20 | 48;
            if (z12) {
                f14 = 20.0f;
            } else {
                f14 = 0.0f;
            }
            if (z12) {
                f15 = 0.0f;
            } else {
                f15 = 20.0f;
            }
            addView(view, w7.w5.a(24.0f, f14, 43.0f, f15, 0.0f, 48, i25));
            fq fqVar = new fq(context, 21, c6Var);
            this.f21739r = fqVar;
            fqVar.b(-1, i23, org.telegram.ui.ActionBar.h6.f20688k7);
            fqVar.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            fqVar.setDrawUnchecked(true);
            fqVar.a(true, false);
            fqVar.setAlpha(0.0f);
            fqVar.setDrawBackgroundAsArc(8);
            if (LocaleController.isRTL) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            addView(fqVar, w7.w5.a(48.0f, 6.0f, 2.0f, 6.0f, 0.0f, 48, i21 | 48));
            fqVar.setOnClickListener(new View.OnClickListener(this) {
                public final d6 f21612b;

                {
                    this.f21612b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            d6 d6Var = this.f21612b;
                            fq fqVar2 = d6Var.f21739r;
                            if (fqVar2.getTag() != null) {
                                d6Var.h(d6Var, !fqVar2.f26150a.f23874q);
                                return;
                            }
                            return;
                        default:
                            d6 d6Var2 = this.f21612b;
                            d6Var2.j(d6Var2);
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
            addView(c6Var2, w7.w5.a(-2.0f, f7, 0.0f, z13 ? 19.0f : i11, 0.0f, -1, i26));
        }
        if (i10 == 1) {
            fh fhVar = new fh(context);
            this.f21743y = fhVar;
            fhVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20724m6, c6Var), PorterDuff.Mode.SRC_IN));
            fhVar.j(dh.f25364e, false);
            int dp = AndroidUtilities.dp(9.5f);
            fhVar.setPadding(dp, dp, dp, dp);
            fhVar.setVisibility(8);
            if (this.f21737f == null) {
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
                f10 = i13;
            } else {
                f10 = 0.0f;
            }
            addView(fhVar, w7.w5.a(48.0f, f10, 0.0f, z14 ? 0.0f : i13, 0.0f, 48, i14));
            fhVar.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Vh, c6Var), 1, -1));
            fhVar.setOnClickListener(new View.OnClickListener(this) {
                public final d6 f21612b;

                {
                    this.f21612b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            d6 d6Var = this.f21612b;
                            fq fqVar2 = d6Var.f21739r;
                            if (fqVar2.getTag() != null) {
                                d6Var.h(d6Var, !fqVar2.f26150a.f23874q);
                                return;
                            }
                            return;
                        default:
                            d6 d6Var2 = this.f21612b;
                            d6Var2.j(d6Var2);
                            return;
                    }
                }
            });
            fhVar.setContentDescription(LocaleController.getString(R.string.Emoji));
        }
    }

    @Override
    public final void a(ci.h2 h2Var) {
        this.d.addTextChangedListener(h2Var);
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
        ImageView imageView = this.f21737f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        qh.d dVar = new qh.d(getContext(), 38);
        this.f21736e = dVar;
        dVar.setFocusable(false);
        this.f21736e.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Vh, this.f21735c), 1, -1));
        w7.y5.a(this.f21736e);
        qh.d dVar2 = this.f21736e;
        boolean z10 = LocaleController.isRTL;
        int i14 = 5;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        int i15 = i10 | 48;
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
        addView(dVar2, w7.w5.a(50.0f, f7, 0.0f, f10, 0.0f, 48, i15));
        fh fhVar = this.f21743y;
        if (fhVar != null) {
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
            if (!z11) {
                f13 = 44;
            }
            fhVar.setLayoutParams(w7.w5.a(48.0f, f12, 1.0f, f13, 0.0f, 48, i16));
        }
        c6 c6Var = this.d;
        if (c6Var != null) {
            if (LocaleController.isRTL) {
                i11 = ((ViewGroup.MarginLayoutParams) c6Var.getLayoutParams()).rightMargin;
            } else {
                i11 = ((ViewGroup.MarginLayoutParams) c6Var.getLayoutParams()).leftMargin;
            }
            float f14 = i11 / AndroidUtilities.density;
            if (fhVar != null) {
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
            c6Var.setLayoutParams(w7.w5.a(-2.0f, f11, 0.0f, f14, 0.0f, -1, i18));
        }
        return this.f21736e;
    }

    public final void c(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void d() {
        int i10;
        float f7;
        float f10;
        this.f21742x = true;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.f21738n = h5Var;
        h5Var.setTextSize(13);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f21738n;
        int i11 = 5;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        h5Var2.setGravity(i10 | 48);
        org.telegram.ui.ActionBar.h5 h5Var3 = this.f21738n;
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
        addView(h5Var3, w7.w5.a(24.0f, f7, 17.0f, f10, 0.0f, 48, i12));
    }

    public boolean e() {
        return true;
    }

    public boolean f(d6 d6Var) {
        return false;
    }

    public fq getCheckBox() {
        return this.f21739r;
    }

    @Override
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override
    public Editable getEditText() {
        return this.d.getText();
    }

    public fh getEmojiButton() {
        return this.f21743y;
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
    public org.telegram.ui.ActionBar.m2 getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.h5 getTextView2() {
        return this.f21738n;
    }

    public void h(d6 d6Var, boolean z10) {
        this.f21739r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        fq fqVar = this.f21739r;
        if (fqVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return;
        }
        AnimatorSet animatorSet = this.f21741w;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f21741w = null;
        }
        if (z10) {
            num = 1;
        }
        fqVar.setTag(num);
        ImageView imageView = this.h;
        float f11 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f21741w = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fqVar, property, fArr);
            if (!z10) {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(imageView, property, f11));
            this.f21741w.setDuration(180L);
            this.f21741w.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        fqVar.setAlpha(f7);
        if (!z10) {
            f11 = 1.0f;
        }
        imageView.setAlpha(f11);
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        fh fhVar;
        int i11;
        if (i10 == 0) {
            fq fqVar = this.f21739r;
            if (fqVar != null) {
                CheckBoxBase checkBoxBase = fqVar.getCheckBoxBase();
                float f11 = this.f21733a.f16087e;
                if (checkBoxBase.f23879w != f11) {
                    checkBoxBase.f23879w = f11;
                    checkBoxBase.b();
                }
                fqVar.invalidate();
            }
        } else if (i10 == 1 && (fhVar = this.f21743y) != null) {
            float f12 = this.f21734b.f16087e;
            float f13 = 0.85f * f12;
            fhVar.setScaleX(f13);
            fhVar.setScaleY(f13);
            fhVar.setAlpha(f12);
            if (f12 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            fhVar.setVisibility(i11);
            org.telegram.ui.ActionBar.h5 h5Var = this.f21738n;
            if (h5Var != null && this.f21737f == null && h5Var.getVisibility() == 0) {
                if (this.f21736e != null) {
                    this.f21738n.setTranslationY(AndroidUtilities.dp(36.0f));
                } else {
                    this.f21738n.setTranslationY(AndroidUtilities.dp(26.0f) * f12);
                }
            }
        }
    }

    public final void o(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f21737f;
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

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fq fqVar = this.f21739r;
        if (fqVar != null) {
            m(p(), false);
            fqVar.a(f(this), false);
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
            float f11 = dp;
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
            canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f20681k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        fh fhVar;
        ImageView imageView;
        c6 c6Var;
        int i12;
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        while (true) {
            int childCount = getChildCount();
            fhVar = this.f21743y;
            imageView = this.f21737f;
            c6Var = this.d;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt != c6Var) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else if (childAt == fhVar) {
                    fhVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    } else {
                        org.telegram.ui.ActionBar.h5 h5Var = this.f21738n;
                        if (childAt == h5Var) {
                            h5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                        } else {
                            fq fqVar = this.f21739r;
                            if (childAt == fqVar) {
                                fqVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
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
        } else if (this.f21738n == null) {
            i12 = 42;
        } else if (imageView == null) {
            i12 = 70;
        } else if (fhVar != null) {
            i12 = 144;
        } else {
            i12 = 122;
        }
        c6Var.measure(am.c(i12, (size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = c6Var.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), c6Var.getMeasuredHeight()) + (this.v ? 1 : 0));
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f21738n;
        if (h5Var2 != null && !this.f21742x) {
            if (measuredHeight >= AndroidUtilities.dp(52.0f)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            h5Var2.setAlpha(f7);
        }
    }

    public boolean p() {
        return false;
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.f21734b.a(z10, true);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f21735c;
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.f21737f;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        }
        fh fhVar = this.f21743y;
        if (fhVar != null) {
            fhVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, c6Var), PorterDuff.Mode.SRC_IN));
        }
    }

    public void setShowNextButton(boolean z10) {
        this.f21740s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f21738n;
        if (h5Var == null) {
            return;
        }
        h5Var.l(str, false);
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
    public final void C(float f7, int i10) {
    }

    public void g(c6 c6Var, ActionMode actionMode) {
    }
}
