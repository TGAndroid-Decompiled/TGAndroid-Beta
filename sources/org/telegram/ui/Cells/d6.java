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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.tl;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.yg;
import org.telegram.ui.Components.zr;
public class d6 extends FrameLayout implements iz0, ne.d {
    public Integer E;
    public final ne.b f22278a;
    public final ne.b f22279b;
    public final org.telegram.ui.ActionBar.g6 f22280c;
    public final c6 d;
    public rh.d e;
    public final ImageView f22281f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.n5 f22282n;
    public final vp f22283r;
    public boolean f22284s;
    public boolean v;
    public AnimatorSet f22285w;
    public boolean f22286x;
    public final yg f22287y;

    public d6(Context context, int i10, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.g6 g6Var) {
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
        zr zrVar = zr.h;
        this.f22278a = new ne.b(0, this, zrVar, 380L, false);
        this.f22279b = new ne.b(1, this, zrVar, 380L, false);
        this.f22280c = g6Var;
        c6 c6Var = new c6(this, context, g6Var, 0);
        this.d = c6Var;
        c6Var.setAllowTextEntitiesIntersection(true);
        org.telegram.ui.ActionBar.r6.W(c6Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        org.telegram.ui.ActionBar.r6.I(c6Var, org.telegram.ui.ActionBar.k6.f21243gc, g6Var);
        org.telegram.ui.ActionBar.r6.F(c6Var, org.telegram.ui.ActionBar.k6.H6, g6Var);
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
            if (!z10) {
                f12 = i15;
            } else {
                f12 = 54.0f;
            }
            addView(c6Var, w7.z5.d(-1, -2.0f, i22, f11, 0.0f, f12, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i23 = org.telegram.ui.ActionBar.k6.f21347m6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.t(imageView, i23, g6Var, mode);
            if (LocaleController.isRTL) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            addView(imageView, w7.z5.d(48, 48.0f, i17 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f22281f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i24 = org.telegram.ui.ActionBar.k6.Vh;
            y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i24, g6Var), 1, -1);
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i24);
            imageView2.setBackground(g02);
            org.telegram.ui.ActionBar.r6.k(imageView2, g02, null, O, g6Var);
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            org.telegram.ui.ActionBar.r6.t(imageView2, i23, g6Var, mode);
            imageView2.setContentDescription(LocaleController.getString(R.string.Delete));
            boolean z11 = LocaleController.isRTL;
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
            addView(imageView2, w7.z5.d(48, 50.0f, i25, f13, 0.0f, f14, 0.0f));
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
            this.f22282n = n5Var;
            n5Var.setTextSize(13);
            org.telegram.ui.ActionBar.n5 n5Var2 = this.f22282n;
            if (LocaleController.isRTL) {
                i19 = 3;
            } else {
                i19 = 5;
            }
            n5Var2.setGravity(i19 | 48);
            View view = this.f22282n;
            boolean z12 = LocaleController.isRTL;
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
            addView(view, w7.z5.d(48, 24.0f, i26, f15, 43.0f, f16, 0.0f));
            vp vpVar = new vp(context, 21, g6Var);
            this.f22283r = vpVar;
            vpVar.b(-1, i23, org.telegram.ui.ActionBar.k6.f21312k7);
            vpVar.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            vpVar.setDrawUnchecked(true);
            vpVar.a(true, false);
            vpVar.setAlpha(0.0f);
            vpVar.setDrawBackgroundAsArc(8);
            if (LocaleController.isRTL) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            addView(vpVar, w7.z5.d(48, 48.0f, i21 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            vpVar.setOnClickListener(new View.OnClickListener(this) {
                public final d6 f22141b;

                {
                    this.f22141b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            d6 d6Var = this.f22141b;
                            vp vpVar2 = d6Var.f22283r;
                            if (vpVar2.getTag() != null) {
                                d6Var.h(d6Var, !vpVar2.f32005a.f24297q);
                                return;
                            }
                            return;
                        default:
                            d6 d6Var2 = this.f22141b;
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
            int i27 = i12 | 16;
            if (z13) {
                f7 = i11;
            } else {
                f7 = 19.0f;
            }
            addView(c6Var, w7.z5.d(-1, -2.0f, i27, f7, 0.0f, z13 ? 19.0f : i11, 0.0f));
        }
        if (i10 == 1) {
            yg ygVar = new yg(context);
            this.f22287y = ygVar;
            org.telegram.ui.ActionBar.r6.t(ygVar, org.telegram.ui.ActionBar.k6.f21347m6, g6Var, PorterDuff.Mode.SRC_IN);
            ygVar.j(wg.e, false);
            int dp = AndroidUtilities.dp(9.5f);
            ygVar.setPadding(dp, dp, dp, dp);
            ygVar.setVisibility(8);
            if (this.f22281f == null) {
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
            addView(ygVar, w7.z5.d(48, 48.0f, i14, f10, 0.0f, z14 ? 0.0f : i13, 0.0f));
            int i28 = org.telegram.ui.ActionBar.k6.Vh;
            y g03 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i28, g6Var), 1, -1);
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i28);
            ygVar.setBackground(g03);
            org.telegram.ui.ActionBar.r6.k(ygVar, g03, null, O2, g6Var);
            ygVar.setOnClickListener(new View.OnClickListener(this) {
                public final d6 f22141b;

                {
                    this.f22141b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            d6 d6Var = this.f22141b;
                            vp vpVar2 = d6Var.f22283r;
                            if (vpVar2.getTag() != null) {
                                d6Var.h(d6Var, !vpVar2.f32005a.f24297q);
                                return;
                            }
                            return;
                        default:
                            d6 d6Var2 = this.f22141b;
                            d6Var2.j(d6Var2);
                            return;
                    }
                }
            });
            ygVar.setContentDescription(LocaleController.getString(R.string.Emoji));
        }
    }

    public final rh.d a() {
        int i10;
        float f7;
        float f10;
        int i11;
        int i12;
        float f11;
        int i13;
        float f12;
        ImageView imageView = this.f22281f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        rh.d dVar = new rh.d(getContext(), 38);
        this.e = dVar;
        dVar.setFocusable(false);
        rh.d dVar2 = this.e;
        int i14 = org.telegram.ui.ActionBar.k6.Vh;
        org.telegram.ui.ActionBar.g6 g6Var = this.f22280c;
        org.telegram.ui.ActionBar.r6.S(dVar2, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i14, g6Var), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i14), g6Var);
        w7.b6.a(this.e);
        rh.d dVar3 = this.e;
        boolean z10 = LocaleController.isRTL;
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
        addView(dVar3, w7.z5.d(48, 50.0f, i16, f7, 0.0f, f10, 0.0f));
        yg ygVar = this.f22287y;
        if (ygVar != null) {
            boolean z11 = LocaleController.isRTL;
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
            ygVar.setLayoutParams(w7.z5.d(48, 48.0f, i17, f12, 1.0f, f13, 0.0f));
        }
        c6 c6Var = this.d;
        if (c6Var != null) {
            if (LocaleController.isRTL) {
                i11 = ((ViewGroup.MarginLayoutParams) c6Var.getLayoutParams()).rightMargin;
            } else {
                i11 = ((ViewGroup.MarginLayoutParams) c6Var.getLayoutParams()).leftMargin;
            }
            float f14 = i11 / AndroidUtilities.density;
            if (ygVar != null) {
                i12 = 70;
            } else {
                i12 = 19;
            }
            int i18 = i12 + 24;
            boolean z12 = LocaleController.isRTL;
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
            c6Var.setLayoutParams(w7.z5.d(-1, -2.0f, i19, f11, 0.0f, f14, 0.0f));
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
        this.f22286x = true;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(getContext());
        this.f22282n = n5Var;
        n5Var.setTextSize(13);
        org.telegram.ui.ActionBar.n5 n5Var2 = this.f22282n;
        int i11 = 5;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        n5Var2.setGravity(i10 | 48);
        org.telegram.ui.ActionBar.n5 n5Var3 = this.f22282n;
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
        addView(n5Var3, w7.z5.d(48, 24.0f, i12, f7, 17.0f, f10, 0.0f));
    }

    @Override
    public final void d(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public boolean e() {
        return true;
    }

    public boolean f(d6 d6Var) {
        return false;
    }

    public vp getCheckBox() {
        return this.f22283r;
    }

    @Override
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override
    public Editable getEditText() {
        return this.d.getText();
    }

    public yg getEmojiButton() {
        return this.f22287y;
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
    public org.telegram.ui.ActionBar.o2 getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.n5 getTextView2() {
        return this.f22282n;
    }

    public void h(d6 d6Var, boolean z10) {
        this.f22283r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        vp vpVar = this.f22283r;
        if (vpVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return;
        }
        AnimatorSet animatorSet = this.f22285w;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f22285w = null;
        }
        if (z10) {
            num = 1;
        }
        vpVar.setTag(num);
        ImageView imageView = this.h;
        float f11 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f22285w = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vpVar, property, fArr);
            if (!z10) {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(imageView, property, f11));
            this.f22285w.setDuration(180L);
            this.f22285w.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        vpVar.setAlpha(f7);
        if (!z10) {
            f11 = 1.0f;
        }
        imageView.setAlpha(f11);
    }

    public final void n(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f22281f;
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
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        yg ygVar;
        int i11;
        if (i10 == 0) {
            vp vpVar = this.f22283r;
            if (vpVar != null) {
                CheckBoxBase checkBoxBase = vpVar.getCheckBoxBase();
                float f11 = this.f22278a.e;
                if (checkBoxBase.f24302w != f11) {
                    checkBoxBase.f24302w = f11;
                    checkBoxBase.b();
                }
                vpVar.invalidate();
            }
        } else if (i10 == 1 && (ygVar = this.f22287y) != null) {
            float f12 = this.f22279b.e;
            float f13 = 0.85f * f12;
            ygVar.setScaleX(f13);
            ygVar.setScaleY(f13);
            ygVar.setAlpha(f12);
            if (f12 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            ygVar.setVisibility(i11);
            org.telegram.ui.ActionBar.n5 n5Var = this.f22282n;
            if (n5Var != null && this.f22281f == null && n5Var.getVisibility() == 0) {
                if (this.e != null) {
                    this.f22282n.setTranslationY(AndroidUtilities.dp(36.0f));
                } else {
                    this.f22282n.setTranslationY(AndroidUtilities.dp(26.0f) * f12);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vp vpVar = this.f22283r;
        if (vpVar != null) {
            m(p(), false);
            vpVar.a(f(this), false);
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
            canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21305k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        yg ygVar;
        ImageView imageView;
        c6 c6Var;
        int i12;
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        while (true) {
            int childCount = getChildCount();
            ygVar = this.f22287y;
            imageView = this.f22281f;
            c6Var = this.d;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt != c6Var) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else if (childAt == ygVar) {
                    ygVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    } else {
                        org.telegram.ui.ActionBar.n5 n5Var = this.f22282n;
                        if (childAt == n5Var) {
                            n5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                        } else {
                            vp vpVar = this.f22283r;
                            if (childAt == vpVar) {
                                vpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
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
        } else if (this.f22282n == null) {
            i12 = 42;
        } else if (imageView == null) {
            i12 = 70;
        } else if (ygVar != null) {
            i12 = 144;
        } else {
            i12 = 122;
        }
        c6Var.measure(tl.c(i12, (size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = c6Var.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), c6Var.getMeasuredHeight()) + (this.v ? 1 : 0));
        org.telegram.ui.ActionBar.n5 n5Var2 = this.f22282n;
        if (n5Var2 != null && !this.f22286x) {
            if (measuredHeight >= AndroidUtilities.dp(52.0f)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            n5Var2.setAlpha(f7);
        }
    }

    public boolean p() {
        return false;
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.f22279b.a(z10, true);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.f22280c;
        ImageView imageView = this.h;
        if (imageView != null) {
            org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f22281f;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.r6.t(imageView2, i10, g6Var, PorterDuff.Mode.MULTIPLY);
        }
        yg ygVar = this.f22287y;
        if (ygVar != null) {
            org.telegram.ui.ActionBar.r6.t(ygVar, i10, g6Var, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z10) {
        this.f22284s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.n5 n5Var = this.f22282n;
        if (n5Var == null) {
            return;
        }
        n5Var.k(str);
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
    public final void H(float f7, int i10) {
    }

    public void g(c6 c6Var, ActionMode actionMode) {
    }
}
