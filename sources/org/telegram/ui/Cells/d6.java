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
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.nz0;
public class d6 extends FrameLayout implements nz0, me.d {
    public Integer E;
    public final me.b f21975a;
    public final me.b f21976b;
    public final org.telegram.ui.ActionBar.e6 f21977c;
    public final c6 d;
    public qh.d f21978e;
    public final ImageView f21979f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.j5 f21980n;
    public final dq f21981r;
    public boolean f21982s;
    public boolean v;
    public AnimatorSet f21983w;
    public boolean f21984x;
    public final dh f21985y;

    public d6(Context context, int i10, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.e6 e6Var) {
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
        is isVar = is.h;
        this.f21975a = new me.b(0, this, isVar, 380L, false);
        this.f21976b = new me.b(1, this, isVar, 380L, false);
        this.f21977c = e6Var;
        c6 c6Var = new c6(this, context, e6Var, 0);
        this.d = c6Var;
        c6Var.setAllowTextEntitiesIntersection(true);
        c6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        c6Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        c6Var.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.H6, e6Var));
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
                f11 = i15;
            } else {
                f11 = 54.0f;
            }
            addView(c6Var, w7.x5.a(-2.0f, f11, 0.0f, z10 ? 54.0f : i15, 0.0f, -1, i22));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i23 = org.telegram.ui.ActionBar.i6.f20966m6;
            int w02 = org.telegram.ui.ActionBar.i6.w0(i23, e6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
            if (LocaleController.isRTL) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            addView(imageView, w7.x5.a(48.0f, 6.0f, 2.0f, 6.0f, 0.0f, 48, i17 | 48));
            ImageView imageView2 = new ImageView(context);
            this.f21979f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            imageView2.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Vh, e6Var), 1, -1));
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i23, e6Var), mode));
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
            addView(imageView2, w7.x5.a(50.0f, f12, 0.0f, f13, 0.0f, 48, i24));
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
            this.f21980n = j5Var;
            j5Var.setTextSize(13);
            org.telegram.ui.ActionBar.j5 j5Var2 = this.f21980n;
            if (LocaleController.isRTL) {
                i19 = 3;
            } else {
                i19 = 5;
            }
            j5Var2.setGravity(i19 | 48);
            View view = this.f21980n;
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
            addView(view, w7.x5.a(24.0f, f14, 43.0f, f15, 0.0f, 48, i25));
            dq dqVar = new dq(context, 21, e6Var);
            this.f21981r = dqVar;
            dqVar.b(-1, i23, org.telegram.ui.ActionBar.i6.f20930k7);
            dqVar.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            dqVar.setDrawUnchecked(true);
            dqVar.a(true, false);
            dqVar.setAlpha(0.0f);
            dqVar.setDrawBackgroundAsArc(8);
            if (LocaleController.isRTL) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            addView(dqVar, w7.x5.a(48.0f, 6.0f, 2.0f, 6.0f, 0.0f, 48, i21 | 48));
            dqVar.setOnClickListener(new View.OnClickListener(this) {
                public final d6 f21852b;

                {
                    this.f21852b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            d6 d6Var = this.f21852b;
                            dq dqVar2 = d6Var.f21981r;
                            if (dqVar2.getTag() != null) {
                                d6Var.h(d6Var, !dqVar2.f25781a.f24101q);
                                return;
                            }
                            return;
                        default:
                            d6 d6Var2 = this.f21852b;
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
            addView(c6Var, w7.x5.a(-2.0f, f7, 0.0f, z13 ? 19.0f : i11, 0.0f, -1, i26));
        }
        if (i10 == 1) {
            dh dhVar = new dh(context);
            this.f21985y = dhVar;
            dhVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20966m6, e6Var), PorterDuff.Mode.SRC_IN));
            dhVar.j(bh.f24965e, false);
            int dp = AndroidUtilities.dp(9.5f);
            dhVar.setPadding(dp, dp, dp, dp);
            dhVar.setVisibility(8);
            if (this.f21979f == null) {
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
            addView(dhVar, w7.x5.a(48.0f, f10, 0.0f, z14 ? 0.0f : i13, 0.0f, 48, i14));
            dhVar.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Vh, e6Var), 1, -1));
            dhVar.setOnClickListener(new View.OnClickListener(this) {
                public final d6 f21852b;

                {
                    this.f21852b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            d6 d6Var = this.f21852b;
                            dq dqVar2 = d6Var.f21981r;
                            if (dqVar2.getTag() != null) {
                                d6Var.h(d6Var, !dqVar2.f25781a.f24101q);
                                return;
                            }
                            return;
                        default:
                            d6 d6Var2 = this.f21852b;
                            d6Var2.j(d6Var2);
                            return;
                    }
                }
            });
            dhVar.setContentDescription(LocaleController.getString(R.string.Emoji));
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
        ImageView imageView = this.f21979f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        qh.d dVar = new qh.d(getContext(), 38);
        this.f21978e = dVar;
        dVar.setFocusable(false);
        this.f21978e.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Vh, this.f21977c), 1, -1));
        w7.z5.a(this.f21978e);
        qh.d dVar2 = this.f21978e;
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
        addView(dVar2, w7.x5.a(50.0f, f7, 0.0f, f10, 0.0f, 48, i15));
        dh dhVar = this.f21985y;
        if (dhVar != null) {
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
            dhVar.setLayoutParams(w7.x5.a(48.0f, f12, 1.0f, f13, 0.0f, 48, i16));
        }
        c6 c6Var = this.d;
        if (c6Var != null) {
            if (LocaleController.isRTL) {
                i11 = ((ViewGroup.MarginLayoutParams) c6Var.getLayoutParams()).rightMargin;
            } else {
                i11 = ((ViewGroup.MarginLayoutParams) c6Var.getLayoutParams()).leftMargin;
            }
            float f14 = i11 / AndroidUtilities.density;
            if (dhVar != null) {
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
            c6Var.setLayoutParams(w7.x5.a(-2.0f, f11, 0.0f, f14, 0.0f, -1, i18));
        }
        return this.f21978e;
    }

    public final void c(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void d() {
        int i10;
        float f7;
        float f10;
        this.f21984x = true;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
        this.f21980n = j5Var;
        j5Var.setTextSize(13);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f21980n;
        int i11 = 5;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        j5Var2.setGravity(i10 | 48);
        org.telegram.ui.ActionBar.j5 j5Var3 = this.f21980n;
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
        addView(j5Var3, w7.x5.a(24.0f, f7, 17.0f, f10, 0.0f, 48, i12));
    }

    public boolean e() {
        return true;
    }

    public boolean f(d6 d6Var) {
        return false;
    }

    public dq getCheckBox() {
        return this.f21981r;
    }

    @Override
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override
    public Editable getEditText() {
        return this.d.getText();
    }

    public dh getEmojiButton() {
        return this.f21985y;
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

    public org.telegram.ui.ActionBar.j5 getTextView2() {
        return this.f21980n;
    }

    public void h(d6 d6Var, boolean z10) {
        this.f21981r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        dq dqVar = this.f21981r;
        if (dqVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return;
        }
        AnimatorSet animatorSet = this.f21983w;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f21983w = null;
        }
        if (z10) {
            num = 1;
        }
        dqVar.setTag(num);
        ImageView imageView = this.h;
        float f11 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f21983w = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dqVar, property, fArr);
            if (!z10) {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(imageView, property, f11));
            this.f21983w.setDuration(180L);
            this.f21983w.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        dqVar.setAlpha(f7);
        if (!z10) {
            f11 = 1.0f;
        }
        imageView.setAlpha(f11);
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        dh dhVar;
        int i11;
        if (i10 == 0) {
            dq dqVar = this.f21981r;
            if (dqVar != null) {
                CheckBoxBase checkBoxBase = dqVar.getCheckBoxBase();
                float f11 = this.f21975a.f16341e;
                if (checkBoxBase.f24106w != f11) {
                    checkBoxBase.f24106w = f11;
                    checkBoxBase.b();
                }
                dqVar.invalidate();
            }
        } else if (i10 == 1 && (dhVar = this.f21985y) != null) {
            float f12 = this.f21976b.f16341e;
            float f13 = 0.85f * f12;
            dhVar.setScaleX(f13);
            dhVar.setScaleY(f13);
            dhVar.setAlpha(f12);
            if (f12 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            dhVar.setVisibility(i11);
            org.telegram.ui.ActionBar.j5 j5Var = this.f21980n;
            if (j5Var != null && this.f21979f == null && j5Var.getVisibility() == 0) {
                if (this.f21978e != null) {
                    this.f21980n.setTranslationY(AndroidUtilities.dp(36.0f));
                } else {
                    this.f21980n.setTranslationY(AndroidUtilities.dp(26.0f) * f12);
                }
            }
        }
    }

    public final void o(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f21979f;
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
        dq dqVar = this.f21981r;
        if (dqVar != null) {
            m(p(), false);
            dqVar.a(f(this), false);
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
            canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f20923k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        dh dhVar;
        ImageView imageView;
        c6 c6Var;
        int i12;
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        while (true) {
            int childCount = getChildCount();
            dhVar = this.f21985y;
            imageView = this.f21979f;
            c6Var = this.d;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt != c6Var) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else if (childAt == dhVar) {
                    dhVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    } else {
                        org.telegram.ui.ActionBar.j5 j5Var = this.f21980n;
                        if (childAt == j5Var) {
                            j5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                        } else {
                            dq dqVar = this.f21981r;
                            if (childAt == dqVar) {
                                dqVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
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
        } else if (this.f21980n == null) {
            i12 = 42;
        } else if (imageView == null) {
            i12 = 70;
        } else if (dhVar != null) {
            i12 = 144;
        } else {
            i12 = 122;
        }
        c6Var.measure(bi.c(i12, (size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = c6Var.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), c6Var.getMeasuredHeight()) + (this.v ? 1 : 0));
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f21980n;
        if (j5Var2 != null && !this.f21984x) {
            if (measuredHeight >= AndroidUtilities.dp(52.0f)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            j5Var2.setAlpha(f7);
        }
    }

    public boolean p() {
        return false;
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.f21976b.a(z10, true);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i10) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f21977c;
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.f21979f;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), PorterDuff.Mode.MULTIPLY));
        }
        dh dhVar = this.f21985y;
        if (dhVar != null) {
            dhVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), PorterDuff.Mode.SRC_IN));
        }
    }

    public void setShowNextButton(boolean z10) {
        this.f21982s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.j5 j5Var = this.f21980n;
        if (j5Var == null) {
            return;
        }
        j5Var.l(str, false);
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
    public final void A(float f7, int i10) {
    }

    public void g(c6 c6Var, ActionMode actionMode) {
    }
}
