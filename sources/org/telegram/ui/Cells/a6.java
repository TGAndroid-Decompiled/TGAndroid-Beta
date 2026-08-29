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
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.tg;
public class a6 extends FrameLayout implements dy0, vd.b {
    public Integer A;
    public final vd.a f24081a;
    public final vd.a f24082b;
    public final org.telegram.ui.ActionBar.c6 f24083c;
    public final bh.b d;
    public bh.g f24084e;
    public final ImageView f24085f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.h5 f24086n;
    public final hp f24087r;
    public boolean f24088s;
    public boolean v;
    public AnimatorSet f24089w;
    public boolean f24090x;
    public final tg f24091y;

    public a6(Context context, int i10, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i11;
        int i12;
        float f9;
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
        jr jrVar = jr.h;
        this.f24081a = new vd.a(0, this, jrVar, 380L, false);
        this.f24082b = new vd.a(1, this, jrVar, 380L, false);
        this.f24083c = c6Var;
        bh.b bVar = new bh.b(this, context, c6Var, 2);
        this.d = bVar;
        bVar.setAllowTextEntitiesIntersection(true);
        bVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        bVar.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        bVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, c6Var));
        bVar.setTextSize(1, 16.0f);
        bVar.setMaxLines(Integer.MAX_VALUE);
        bVar.setBackground(null);
        bVar.setImeOptions(bVar.getImeOptions() | 268435456);
        bVar.setInputType(bVar.getInputType() | 16384);
        bVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
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
            addView(bVar, i7.f6.d(-1, -2.0f, i22, f13, 0.0f, f14, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i23 = org.telegram.ui.ActionBar.g6.f23223m6;
            int v02 = org.telegram.ui.ActionBar.g6.v0(i23, c6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
            if (LocaleController.isRTL) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            addView(imageView, i7.f6.d(48, 48.0f, i17 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f24085f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vh, c6Var), 1, -1));
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i23, c6Var), mode));
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
            addView(imageView2, i7.f6.d(48, 50.0f, i24, f15, 0.0f, f16, 0.0f));
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            this.f24086n = h5Var;
            h5Var.setTextSize(13);
            org.telegram.ui.ActionBar.h5 h5Var2 = this.f24086n;
            if (LocaleController.isRTL) {
                i19 = 3;
            } else {
                i19 = 5;
            }
            h5Var2.setGravity(i19 | 48);
            View view = this.f24086n;
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
            addView(view, i7.f6.d(48, 24.0f, i25, f17, 43.0f, f18, 0.0f));
            hp hpVar = new hp(context, 21, c6Var);
            this.f24087r = hpVar;
            hpVar.b(-1, i23, org.telegram.ui.ActionBar.g6.f23190k7);
            hpVar.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            hpVar.setDrawUnchecked(true);
            hpVar.a(true, false);
            hpVar.setAlpha(0.0f);
            hpVar.setDrawBackgroundAsArc(8);
            if (LocaleController.isRTL) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            addView(hpVar, i7.f6.d(48, 48.0f, i21 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            hpVar.setOnClickListener(new View.OnClickListener(this) {
                public final a6 f26053b;

                {
                    this.f26053b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            a6 a6Var = this.f26053b;
                            hp hpVar2 = a6Var.f24087r;
                            if (hpVar2.getTag() != null) {
                                a6Var.h(a6Var, !hpVar2.f29211a.f26324q);
                                return;
                            }
                            return;
                        default:
                            a6 a6Var2 = this.f26053b;
                            a6Var2.j(a6Var2);
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
                f9 = i11;
            } else {
                f9 = 19.0f;
            }
            if (z13) {
                f10 = 19.0f;
            } else {
                f10 = i11;
            }
            addView(bVar, i7.f6.d(-1, -2.0f, i26, f9, 0.0f, f10, 0.0f));
        }
        if (i10 == 1) {
            tg tgVar = new tg(context);
            this.f24091y = tgVar;
            tgVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23223m6, c6Var), PorterDuff.Mode.SRC_IN));
            tgVar.j(rg.f32296e, false);
            int dp = AndroidUtilities.dp(9.5f);
            tgVar.setPadding(dp, dp, dp, dp);
            tgVar.setVisibility(8);
            if (this.f24085f == null) {
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
            addView(tgVar, i7.f6.d(48, 48.0f, i14, f11, 0.0f, f12, 0.0f));
            tgVar.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vh, c6Var), 1, -1));
            tgVar.setOnClickListener(new View.OnClickListener(this) {
                public final a6 f26053b;

                {
                    this.f26053b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            a6 a6Var = this.f26053b;
                            hp hpVar2 = a6Var.f24087r;
                            if (hpVar2.getTag() != null) {
                                a6Var.h(a6Var, !hpVar2.f29211a.f26324q);
                                return;
                            }
                            return;
                        default:
                            a6 a6Var2 = this.f26053b;
                            a6Var2.j(a6Var2);
                            return;
                    }
                }
            });
            tgVar.setContentDescription(LocaleController.getString(R.string.Emoji));
        }
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        tg tgVar;
        int i11;
        if (i10 == 0) {
            hp hpVar = this.f24087r;
            if (hpVar != null) {
                CheckBoxBase checkBoxBase = hpVar.getCheckBoxBase();
                float f11 = this.f24081a.f49505e;
                if (checkBoxBase.f26329w != f11) {
                    checkBoxBase.f26329w = f11;
                    checkBoxBase.b();
                }
                hpVar.invalidate();
            }
        } else if (i10 == 1 && (tgVar = this.f24091y) != null) {
            float f12 = this.f24082b.f49505e;
            float f13 = 0.85f * f12;
            tgVar.setScaleX(f13);
            tgVar.setScaleY(f13);
            tgVar.setAlpha(f12);
            if (f12 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            tgVar.setVisibility(i11);
            org.telegram.ui.ActionBar.h5 h5Var = this.f24086n;
            if (h5Var != null && this.f24085f == null && h5Var.getVisibility() == 0) {
                if (this.f24084e != null) {
                    this.f24086n.setTranslationY(AndroidUtilities.dp(36.0f));
                } else {
                    this.f24086n.setTranslationY(AndroidUtilities.dp(26.0f) * f12);
                }
            }
        }
    }

    public final bh.g a() {
        int i10;
        float f9;
        float f10;
        int i11;
        int i12;
        float f11;
        int i13;
        float f12;
        float f13;
        ImageView imageView = this.f24085f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        bh.g gVar = new bh.g(getContext(), 38);
        this.f24084e = gVar;
        gVar.setFocusable(false);
        this.f24084e.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vh, this.f24083c), 1, -1));
        i7.h6.a(this.f24084e);
        bh.g gVar2 = this.f24084e;
        boolean z10 = LocaleController.isRTL;
        int i14 = 5;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        int i15 = i10 | 48;
        if (z10) {
            f9 = 4.0f;
        } else {
            f9 = 0.0f;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 4.0f;
        }
        addView(gVar2, i7.f6.d(48, 50.0f, i15, f9, 0.0f, f10, 0.0f));
        tg tgVar = this.f24091y;
        if (tgVar != null) {
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
            tgVar.setLayoutParams(i7.f6.d(48, 48.0f, i16, f12, 1.0f, f13, 0.0f));
        }
        bh.b bVar = this.d;
        if (bVar != null) {
            if (LocaleController.isRTL) {
                i11 = ((ViewGroup.MarginLayoutParams) bVar.getLayoutParams()).rightMargin;
            } else {
                i11 = ((ViewGroup.MarginLayoutParams) bVar.getLayoutParams()).leftMargin;
            }
            float f14 = i11 / AndroidUtilities.density;
            if (tgVar != null) {
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
            bVar.setLayoutParams(i7.f6.d(-1, -2.0f, i18, f11, 0.0f, f14, 0.0f));
        }
        return this.f24084e;
    }

    public final void b(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void c() {
        int i10;
        float f9;
        float f10;
        this.f24090x = true;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.f24086n = h5Var;
        h5Var.setTextSize(13);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f24086n;
        int i11 = 5;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        h5Var2.setGravity(i10 | 48);
        org.telegram.ui.ActionBar.h5 h5Var3 = this.f24086n;
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 3;
        }
        int i12 = i11 | 48;
        if (z10) {
            f9 = 20.0f;
        } else {
            f9 = 0.0f;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 20.0f;
        }
        addView(h5Var3, i7.f6.d(48, 24.0f, i12, f9, 17.0f, f10, 0.0f));
    }

    @Override
    public final void d(bh.c cVar) {
        this.d.addTextChangedListener(cVar);
    }

    public boolean e() {
        return true;
    }

    public boolean f(a6 a6Var) {
        return false;
    }

    public hp getCheckBox() {
        return this.f24087r;
    }

    @Override
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override
    public Editable getEditText() {
        return this.d.getText();
    }

    public tg getEmojiButton() {
        return this.f24091y;
    }

    @Override
    public CharSequence getFieldText() {
        bh.b bVar = this.d;
        if (bVar.length() > 0) {
            return bVar.getText();
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

    public org.telegram.ui.ActionBar.h5 getTextView2() {
        return this.f24086n;
    }

    public void h(a6 a6Var, boolean z10) {
        this.f24087r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        boolean z12;
        float f9;
        float f10;
        hp hpVar = this.f24087r;
        if (hpVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return;
        }
        AnimatorSet animatorSet = this.f24089w;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f24089w = null;
        }
        if (z10) {
            num = 1;
        }
        hpVar.setTag(num);
        ImageView imageView = this.h;
        float f11 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f24089w = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hpVar, property, fArr);
            if (!z10) {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(imageView, property, f11));
            this.f24089w.setDuration(180L);
            this.f24089w.start();
            return;
        }
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        hpVar.setAlpha(f9);
        if (!z10) {
            f11 = 1.0f;
        }
        imageView.setAlpha(f11);
    }

    public final void n(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f24085f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        bh.b bVar = this.d;
        bVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            bVar.setSelection(bVar.length());
        }
        bVar.setHint(str);
        this.v = z10;
        setWillNotDraw(!z10);
    }

    public boolean o() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hp hpVar = this.f24087r;
        if (hpVar != null) {
            m(o(), false);
            hpVar.a(f(this), false);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
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
                    f9 = 58.0f;
                } else {
                    f9 = 20.0f;
                }
                dp = AndroidUtilities.dp(f9);
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        tg tgVar;
        ImageView imageView;
        bh.b bVar;
        int i12;
        float f9;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        while (true) {
            int childCount = getChildCount();
            tgVar = this.f24091y;
            imageView = this.f24085f;
            bVar = this.d;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt != bVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else if (childAt == tgVar) {
                    tgVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    } else {
                        org.telegram.ui.ActionBar.h5 h5Var = this.f24086n;
                        if (childAt == h5Var) {
                            h5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                        } else {
                            hp hpVar = this.f24087r;
                            if (childAt == hpVar) {
                                hpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
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
        Integer num = this.A;
        if (num != null) {
            i12 = num.intValue();
        } else if (this.f24086n == null) {
            i12 = 42;
        } else if (imageView == null) {
            i12 = 70;
        } else if (tgVar != null) {
            i12 = 144;
        } else {
            i12 = 122;
        }
        bVar.measure(org.telegram.ui.b.d(i12, (size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = bVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), bVar.getMeasuredHeight()) + (this.v ? 1 : 0));
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f24086n;
        if (h5Var2 != null && !this.f24090x) {
            if (measuredHeight >= AndroidUtilities.dp(52.0f)) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            h5Var2.setAlpha(f9);
        }
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.f24082b.a(z10, true);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f24083c;
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.f24085f;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        }
        tg tgVar = this.f24091y;
        if (tgVar != null) {
            tgVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN));
        }
    }

    public void setShowNextButton(boolean z10) {
        this.f24088s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f24086n;
        if (h5Var == null) {
            return;
        }
        h5Var.l(str, false);
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }

    public void setTextRight(int i10) {
        this.A = Integer.valueOf(i10);
    }

    public void i(boolean z10) {
    }

    public void j(a6 a6Var) {
    }

    public void k(bh.b bVar) {
    }

    public void g(bh.b bVar, ActionMode actionMode) {
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
