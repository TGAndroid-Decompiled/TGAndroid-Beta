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
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.qg;
public class c6 extends FrameLayout implements oy0, xd.b {
    public Integer B;
    public final xd.a f20915a;
    public final xd.a f20916b;
    public final org.telegram.ui.ActionBar.f6 f20917c;
    public final dh.b d;
    public dh.g e;
    public final ImageView f20918f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.k5 f20919n;
    public final lp f20920r;
    public boolean f20921s;
    public boolean v;
    public AnimatorSet f20922w;
    public boolean f20923x;
    public final qg f20924y;

    public c6(Context context, int i10, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        int i14;
        float f12;
        float f13;
        int i15;
        int i16;
        float f14;
        float f15;
        int i17;
        int i18;
        float f16;
        float f17;
        int i19;
        int i20;
        float f18;
        float f19;
        int i21;
        nr nrVar = nr.h;
        this.f20915a = new xd.a(0, this, nrVar, 380L, false);
        this.f20916b = new xd.a(1, this, nrVar, 380L, false);
        this.f20917c = f6Var;
        dh.b bVar = new dh.b(this, context, f6Var, 2);
        this.d = bVar;
        bVar.setAllowTextEntitiesIntersection(true);
        bVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        bVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19966gc, f6Var));
        bVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
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
            boolean z4 = LocaleController.isRTL;
            if (z4) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i22 = i16 | 16;
            if (z4) {
                f14 = i15;
            } else {
                f14 = 54.0f;
            }
            if (!z4) {
                f15 = i15;
            } else {
                f15 = 54.0f;
            }
            addView(bVar, k7.b6.d(-1, -2.0f, i22, f14, 0.0f, f15, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i23 = org.telegram.ui.ActionBar.j6.f20067m6;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i23, f6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
            if (LocaleController.isRTL) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            addView(imageView, k7.b6.d(48, 48.0f, i17 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f20918f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vh, f6Var), 1, -1));
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i23, f6Var), mode));
            imageView2.setContentDescription(LocaleController.getString(R.string.Delete));
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i18 = 3;
            } else {
                i18 = 5;
            }
            int i24 = i18 | 48;
            if (z10) {
                f16 = 3.0f;
            } else {
                f16 = 0.0f;
            }
            if (z10) {
                f17 = 0.0f;
            } else {
                f17 = 3.0f;
            }
            addView(imageView2, k7.b6.d(48, 50.0f, i24, f16, 0.0f, f17, 0.0f));
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
            this.f20919n = k5Var;
            k5Var.setTextSize(13);
            org.telegram.ui.ActionBar.k5 k5Var2 = this.f20919n;
            if (LocaleController.isRTL) {
                i19 = 3;
            } else {
                i19 = 5;
            }
            k5Var2.setGravity(i19 | 48);
            View view = this.f20919n;
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i20 = 3;
            } else {
                i20 = 5;
            }
            int i25 = i20 | 48;
            if (z11) {
                f18 = 20.0f;
            } else {
                f18 = 0.0f;
            }
            if (z11) {
                f19 = 0.0f;
            } else {
                f19 = 20.0f;
            }
            addView(view, k7.b6.d(48, 24.0f, i25, f18, 43.0f, f19, 0.0f));
            lp lpVar = new lp(context, 21, f6Var);
            this.f20920r = lpVar;
            lpVar.b(-1, i23, org.telegram.ui.ActionBar.j6.f20032k7);
            lpVar.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            lpVar.setDrawUnchecked(true);
            lpVar.a(true, false);
            lpVar.setAlpha(0.0f);
            lpVar.setDrawBackgroundAsArc(8);
            if (LocaleController.isRTL) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            addView(lpVar, k7.b6.d(48, 48.0f, i21 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            lpVar.setOnClickListener(new View.OnClickListener(this) {
                public final c6 f20879b;

                {
                    this.f20879b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            c6 c6Var = this.f20879b;
                            lp lpVar2 = c6Var.f20920r;
                            if (lpVar2.getTag() != null) {
                                c6Var.h(c6Var, !lpVar2.f26837a.f22965q);
                                return;
                            }
                            return;
                        default:
                            c6 c6Var2 = this.f20879b;
                            c6Var2.j(c6Var2);
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
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i26 = i12 | 16;
            if (z12) {
                f10 = i11;
            } else {
                f10 = 19.0f;
            }
            if (z12) {
                f11 = 19.0f;
            } else {
                f11 = i11;
            }
            addView(bVar, k7.b6.d(-1, -2.0f, i26, f10, 0.0f, f11, 0.0f));
        }
        if (i10 == 1) {
            qg qgVar = new qg(context);
            this.f20924y = qgVar;
            qgVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20067m6, f6Var), PorterDuff.Mode.SRC_IN));
            qgVar.j(og.e, false);
            int dp = AndroidUtilities.dp(9.5f);
            qgVar.setPadding(dp, dp, dp, dp);
            qgVar.setVisibility(8);
            if (this.f20918f == null) {
                i13 = 3;
            } else {
                i13 = 38;
            }
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i14 = 3;
            } else {
                i14 = 5;
            }
            if (z13) {
                f12 = i13;
            } else {
                f12 = 0.0f;
            }
            if (z13) {
                f13 = 0.0f;
            } else {
                f13 = i13;
            }
            addView(qgVar, k7.b6.d(48, 48.0f, i14, f12, 0.0f, f13, 0.0f));
            qgVar.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vh, f6Var), 1, -1));
            qgVar.setOnClickListener(new View.OnClickListener(this) {
                public final c6 f20879b;

                {
                    this.f20879b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            c6 c6Var = this.f20879b;
                            lp lpVar2 = c6Var.f20920r;
                            if (lpVar2.getTag() != null) {
                                c6Var.h(c6Var, !lpVar2.f26837a.f22965q);
                                return;
                            }
                            return;
                        default:
                            c6 c6Var2 = this.f20879b;
                            c6Var2.j(c6Var2);
                            return;
                    }
                }
            });
            qgVar.setContentDescription(LocaleController.getString(R.string.Emoji));
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        qg qgVar;
        int i11;
        if (i10 == 0) {
            lp lpVar = this.f20920r;
            if (lpVar != null) {
                CheckBoxBase checkBoxBase = lpVar.getCheckBoxBase();
                float f12 = this.f20915a.e;
                if (checkBoxBase.f22970w != f12) {
                    checkBoxBase.f22970w = f12;
                    checkBoxBase.b();
                }
                lpVar.invalidate();
            }
        } else if (i10 == 1 && (qgVar = this.f20924y) != null) {
            float f13 = this.f20916b.e;
            float f14 = 0.85f * f13;
            qgVar.setScaleX(f14);
            qgVar.setScaleY(f14);
            qgVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            qgVar.setVisibility(i11);
            org.telegram.ui.ActionBar.k5 k5Var = this.f20919n;
            if (k5Var != null && this.f20918f == null && k5Var.getVisibility() == 0) {
                if (this.e != null) {
                    this.f20919n.setTranslationY(AndroidUtilities.dp(36.0f));
                } else {
                    this.f20919n.setTranslationY(AndroidUtilities.dp(26.0f) * f13);
                }
            }
        }
    }

    @Override
    public final void a(dh.c cVar) {
        this.d.addTextChangedListener(cVar);
    }

    public final dh.g b() {
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        int i13;
        float f13;
        float f14;
        ImageView imageView = this.f20918f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        dh.g gVar = new dh.g(getContext(), 38);
        this.e = gVar;
        gVar.setFocusable(false);
        this.e.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vh, this.f20917c), 1, -1));
        k7.d6.a(this.e);
        dh.g gVar2 = this.e;
        boolean z4 = LocaleController.isRTL;
        int i14 = 5;
        if (z4) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        int i15 = i10 | 48;
        if (z4) {
            f10 = 4.0f;
        } else {
            f10 = 0.0f;
        }
        if (z4) {
            f11 = 0.0f;
        } else {
            f11 = 4.0f;
        }
        addView(gVar2, k7.b6.d(48, 50.0f, i15, f10, 0.0f, f11, 0.0f));
        qg qgVar = this.f20924y;
        if (qgVar != null) {
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i13 = 3;
            } else {
                i13 = 5;
            }
            int i16 = i13 | 48;
            if (z10) {
                f13 = 44;
            } else {
                f13 = 0.0f;
            }
            if (z10) {
                f14 = 0.0f;
            } else {
                f14 = 44;
            }
            qgVar.setLayoutParams(k7.b6.d(48, 48.0f, i16, f13, 1.0f, f14, 0.0f));
        }
        dh.b bVar = this.d;
        if (bVar != null) {
            if (LocaleController.isRTL) {
                i11 = ((ViewGroup.MarginLayoutParams) bVar.getLayoutParams()).rightMargin;
            } else {
                i11 = ((ViewGroup.MarginLayoutParams) bVar.getLayoutParams()).leftMargin;
            }
            float f15 = i11 / AndroidUtilities.density;
            if (qgVar != null) {
                i12 = 70;
            } else {
                i12 = 19;
            }
            int i17 = i12 + 24;
            boolean z11 = LocaleController.isRTL;
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
            bVar.setLayoutParams(k7.b6.d(-1, -2.0f, i18, f12, 0.0f, f15, 0.0f));
        }
        return this.e;
    }

    public final void c(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void d() {
        int i10;
        float f10;
        float f11;
        this.f20923x = true;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
        this.f20919n = k5Var;
        k5Var.setTextSize(13);
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f20919n;
        int i11 = 5;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        k5Var2.setGravity(i10 | 48);
        org.telegram.ui.ActionBar.k5 k5Var3 = this.f20919n;
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i11 = 3;
        }
        int i12 = i11 | 48;
        if (z4) {
            f10 = 20.0f;
        } else {
            f10 = 0.0f;
        }
        if (z4) {
            f11 = 0.0f;
        } else {
            f11 = 20.0f;
        }
        addView(k5Var3, k7.b6.d(48, 24.0f, i12, f10, 17.0f, f11, 0.0f));
    }

    public boolean e() {
        return true;
    }

    public boolean f(c6 c6Var) {
        return false;
    }

    public lp getCheckBox() {
        return this.f20920r;
    }

    @Override
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override
    public Editable getEditText() {
        return this.d.getText();
    }

    public qg getEmojiButton() {
        return this.f20924y;
    }

    @Override
    public CharSequence getFieldText() {
        dh.b bVar = this.d;
        if (bVar.length() > 0) {
            return bVar.getText();
        }
        return null;
    }

    @Override
    public org.telegram.ui.ActionBar.p2 getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.k5 getTextView2() {
        return this.f20919n;
    }

    public void h(c6 c6Var, boolean z4) {
        this.f20920r.a(z4, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z4, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        lp lpVar = this.f20920r;
        if (lpVar.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z4 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.f20922w;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f20922w = null;
        }
        if (z4) {
            num = 1;
        }
        lpVar.setTag(num);
        ImageView imageView = this.h;
        float f12 = 0.0f;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f20922w = animatorSet2;
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            float[] fArr = {f11};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lpVar, property, fArr);
            if (!z4) {
                f12 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(imageView, property, f12));
            this.f20922w.setDuration(180L);
            this.f20922w.start();
            return;
        }
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        lpVar.setAlpha(f10);
        if (!z4) {
            f12 = 1.0f;
        }
        imageView.setAlpha(f12);
    }

    public final void n(CharSequence charSequence, String str, boolean z4) {
        ImageView imageView = this.f20918f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        dh.b bVar = this.d;
        bVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            bVar.setSelection(bVar.length());
        }
        bVar.setHint(str);
        this.v = z4;
        setWillNotDraw(!z4);
    }

    public boolean o() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lp lpVar = this.f20920r;
        if (lpVar != null) {
            m(o(), false);
            lpVar.a(f(this), false);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float dp;
        int i10;
        if (this.v && e()) {
            boolean z4 = LocaleController.isRTL;
            float f11 = 20.0f;
            ImageView imageView = this.h;
            if (z4) {
                dp = 0.0f;
            } else {
                if (imageView != null) {
                    f10 = 58.0f;
                } else {
                    f10 = 20.0f;
                }
                dp = AndroidUtilities.dp(f10);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (imageView != null) {
                    f11 = 58.0f;
                }
                i10 = AndroidUtilities.dp(f11);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20025k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        qg qgVar;
        ImageView imageView;
        dh.b bVar;
        int i12;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        while (true) {
            int childCount = getChildCount();
            qgVar = this.f20924y;
            imageView = this.f20918f;
            bVar = this.d;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt != bVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else if (childAt == qgVar) {
                    qgVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    } else {
                        org.telegram.ui.ActionBar.k5 k5Var = this.f20919n;
                        if (childAt == k5Var) {
                            k5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                        } else {
                            lp lpVar = this.f20920r;
                            if (childAt == lpVar) {
                                lpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
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
        Integer num = this.B;
        if (num != null) {
            i12 = num.intValue();
        } else if (this.f20919n == null) {
            i12 = 42;
        } else if (imageView == null) {
            i12 = 70;
        } else if (qgVar != null) {
            i12 = 144;
        } else {
            i12 = 122;
        }
        bVar.measure(org.telegram.ui.b.d(i12, (size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = bVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), bVar.getMeasuredHeight()) + (this.v ? 1 : 0));
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f20919n;
        if (k5Var2 != null && !this.f20923x) {
            if (measuredHeight >= AndroidUtilities.dp(52.0f)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            k5Var2.setAlpha(f10);
        }
    }

    public void setEmojiButtonVisibility(boolean z4) {
        this.f20916b.a(z4, true);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.f20917c;
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.f20918f;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
        }
        qg qgVar = this.f20924y;
        if (qgVar != null) {
            qgVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
        }
    }

    public void setShowNextButton(boolean z4) {
        this.f20921s = z4;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.k5 k5Var = this.f20919n;
        if (k5Var == null) {
            return;
        }
        k5Var.l(str, false);
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }

    public void setTextRight(int i10) {
        this.B = Integer.valueOf(i10);
    }

    public void i(boolean z4) {
    }

    public void j(c6 c6Var) {
    }

    public void k(dh.b bVar) {
    }

    public void g(dh.b bVar, ActionMode actionMode) {
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
