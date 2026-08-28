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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.sx0;
public class c6 extends FrameLayout implements sx0, td.b {
    public Integer A;
    public final td.a f24195a;
    public final td.a f24196b;
    public final org.telegram.ui.ActionBar.b6 f24197c;
    public final fh.s d;
    public yg.d f24198e;
    public final ImageView f24199f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.h5 f24200n;
    public final dp f24201r;
    public boolean f24202s;
    public boolean v;
    public AnimatorSet f24203w;
    public boolean f24204x;
    public final qg f24205y;

    public c6(Context context, int i9, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        float f13;
        int i14;
        int i15;
        float f14;
        float f15;
        int i16;
        int i17;
        float f16;
        float f17;
        int i18;
        int i19;
        float f18;
        float f19;
        int i20;
        gr grVar = gr.h;
        this.f24195a = new td.a(0, this, grVar, 380L, false);
        this.f24196b = new td.a(1, this, grVar, 380L, false);
        this.f24197c = b6Var;
        fh.s sVar = new fh.s(this, context, b6Var, 1);
        this.d = sVar;
        sVar.setAllowTextEntitiesIntersection(true);
        sVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        sVar.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, b6Var));
        sVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.H6, b6Var));
        sVar.setTextSize(1, 16.0f);
        sVar.setMaxLines(Integer.MAX_VALUE);
        sVar.setBackground(null);
        sVar.setImeOptions(sVar.getImeOptions() | 268435456);
        sVar.setInputType(sVar.getInputType() | 16384);
        sVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        if (onClickListener != null) {
            if (i9 == 1) {
                i14 = 92;
            } else {
                i14 = 58;
            }
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i21 = i15 | 16;
            if (z10) {
                f14 = i14;
            } else {
                f14 = 54.0f;
            }
            if (!z10) {
                f15 = i14;
            } else {
                f15 = 54.0f;
            }
            addView(sVar, g7.e6.d(-1, -2.0f, i21, f14, 0.0f, f15, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i22 = org.telegram.ui.ActionBar.f6.f23162m6;
            int v02 = org.telegram.ui.ActionBar.f6.v0(i22, b6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
            if (LocaleController.isRTL) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            addView(imageView, g7.e6.d(48, 48.0f, i16 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f24199f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Vh, b6Var), 1, -1));
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i22, b6Var), mode));
            imageView2.setContentDescription(LocaleController.getString(R.string.Delete));
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i17 = 3;
            } else {
                i17 = 5;
            }
            int i23 = i17 | 48;
            if (z11) {
                f16 = 3.0f;
            } else {
                f16 = 0.0f;
            }
            if (z11) {
                f17 = 0.0f;
            } else {
                f17 = 3.0f;
            }
            addView(imageView2, g7.e6.d(48, 50.0f, i23, f16, 0.0f, f17, 0.0f));
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            this.f24200n = h5Var;
            h5Var.setTextSize(13);
            org.telegram.ui.ActionBar.h5 h5Var2 = this.f24200n;
            if (LocaleController.isRTL) {
                i18 = 3;
            } else {
                i18 = 5;
            }
            h5Var2.setGravity(i18 | 48);
            View view = this.f24200n;
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i19 = 3;
            } else {
                i19 = 5;
            }
            int i24 = i19 | 48;
            if (z12) {
                f18 = 20.0f;
            } else {
                f18 = 0.0f;
            }
            if (z12) {
                f19 = 0.0f;
            } else {
                f19 = 20.0f;
            }
            addView(view, g7.e6.d(48, 24.0f, i24, f18, 43.0f, f19, 0.0f));
            dp dpVar = new dp(context, 21, b6Var);
            this.f24201r = dpVar;
            dpVar.b(-1, i22, org.telegram.ui.ActionBar.f6.f23128k7);
            dpVar.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            dpVar.setDrawUnchecked(true);
            dpVar.a(true, false);
            dpVar.setAlpha(0.0f);
            dpVar.setDrawBackgroundAsArc(8);
            if (LocaleController.isRTL) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            addView(dpVar, g7.e6.d(48, 48.0f, i20 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            dpVar.setOnClickListener(new View.OnClickListener(this) {
                public final c6 f24142b;

                {
                    this.f24142b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            c6 c6Var = this.f24142b;
                            dp dpVar2 = c6Var.f24201r;
                            if (dpVar2.getTag() != null) {
                                c6Var.h(c6Var, !dpVar2.f27781a.f26313q);
                                return;
                            }
                            return;
                        default:
                            c6 c6Var2 = this.f24142b;
                            c6Var2.j(c6Var2);
                            return;
                    }
                }
            });
        } else {
            if (i9 == 1) {
                i10 = 70;
            } else {
                i10 = 19;
            }
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i25 = i11 | 16;
            if (z13) {
                f10 = i10;
            } else {
                f10 = 19.0f;
            }
            if (z13) {
                f11 = 19.0f;
            } else {
                f11 = i10;
            }
            addView(sVar, g7.e6.d(-1, -2.0f, i25, f10, 0.0f, f11, 0.0f));
        }
        if (i9 == 1) {
            qg qgVar = new qg(context);
            this.f24205y = qgVar;
            qgVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23162m6, b6Var), PorterDuff.Mode.SRC_IN));
            qgVar.j(og.f31383e, false);
            int dp = AndroidUtilities.dp(9.5f);
            qgVar.setPadding(dp, dp, dp, dp);
            qgVar.setVisibility(8);
            if (this.f24199f == null) {
                i12 = 3;
            } else {
                i12 = 38;
            }
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i13 = 3;
            } else {
                i13 = 5;
            }
            if (z14) {
                f12 = i12;
            } else {
                f12 = 0.0f;
            }
            if (z14) {
                f13 = 0.0f;
            } else {
                f13 = i12;
            }
            addView(qgVar, g7.e6.d(48, 48.0f, i13, f12, 0.0f, f13, 0.0f));
            qgVar.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Vh, b6Var), 1, -1));
            qgVar.setOnClickListener(new View.OnClickListener(this) {
                public final c6 f24142b;

                {
                    this.f24142b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            c6 c6Var = this.f24142b;
                            dp dpVar2 = c6Var.f24201r;
                            if (dpVar2.getTag() != null) {
                                c6Var.h(c6Var, !dpVar2.f27781a.f26313q);
                                return;
                            }
                            return;
                        default:
                            c6 c6Var2 = this.f24142b;
                            c6Var2.j(c6Var2);
                            return;
                    }
                }
            });
            qgVar.setContentDescription(LocaleController.getString(R.string.Emoji));
        }
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        qg qgVar;
        int i10;
        if (i9 == 0) {
            dp dpVar = this.f24201r;
            if (dpVar != null) {
                CheckBoxBase checkBoxBase = dpVar.getCheckBoxBase();
                float f12 = this.f24195a.f47775e;
                if (checkBoxBase.f26318w != f12) {
                    checkBoxBase.f26318w = f12;
                    checkBoxBase.b();
                }
                dpVar.invalidate();
            }
        } else if (i9 == 1 && (qgVar = this.f24205y) != null) {
            float f13 = this.f24196b.f47775e;
            float f14 = 0.85f * f13;
            qgVar.setScaleX(f14);
            qgVar.setScaleY(f14);
            qgVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            qgVar.setVisibility(i10);
            org.telegram.ui.ActionBar.h5 h5Var = this.f24200n;
            if (h5Var != null && this.f24199f == null && h5Var.getVisibility() == 0) {
                if (this.f24198e != null) {
                    this.f24200n.setTranslationY(AndroidUtilities.dp(36.0f));
                } else {
                    this.f24200n.setTranslationY(AndroidUtilities.dp(26.0f) * f13);
                }
            }
        }
    }

    public final yg.d a() {
        int i9;
        float f10;
        float f11;
        int i10;
        int i11;
        float f12;
        int i12;
        float f13;
        float f14;
        ImageView imageView = this.f24199f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        yg.d dVar = new yg.d(getContext(), 38);
        this.f24198e = dVar;
        dVar.setFocusable(false);
        this.f24198e.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Vh, this.f24197c), 1, -1));
        g7.g6.a(this.f24198e);
        yg.d dVar2 = this.f24198e;
        boolean z10 = LocaleController.isRTL;
        int i13 = 5;
        if (z10) {
            i9 = 3;
        } else {
            i9 = 5;
        }
        int i14 = i9 | 48;
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
        addView(dVar2, g7.e6.d(48, 50.0f, i14, f10, 0.0f, f11, 0.0f));
        qg qgVar = this.f24205y;
        if (qgVar != null) {
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i12 = 3;
            } else {
                i12 = 5;
            }
            int i15 = i12 | 48;
            if (z11) {
                f13 = 44;
            } else {
                f13 = 0.0f;
            }
            if (z11) {
                f14 = 0.0f;
            } else {
                f14 = 44;
            }
            qgVar.setLayoutParams(g7.e6.d(48, 48.0f, i15, f13, 1.0f, f14, 0.0f));
        }
        fh.s sVar = this.d;
        if (sVar != null) {
            if (LocaleController.isRTL) {
                i10 = ((ViewGroup.MarginLayoutParams) sVar.getLayoutParams()).rightMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) sVar.getLayoutParams()).leftMargin;
            }
            float f15 = i10 / AndroidUtilities.density;
            if (qgVar != null) {
                i11 = 70;
            } else {
                i11 = 19;
            }
            int i16 = i11 + 24;
            boolean z12 = LocaleController.isRTL;
            if (!z12) {
                i13 = 3;
            }
            int i17 = i13 | 16;
            if (z12) {
                f12 = i16;
            } else {
                f12 = f15;
            }
            if (!z12) {
                f15 = i16;
            }
            sVar.setLayoutParams(g7.e6.d(-1, -2.0f, i17, f12, 0.0f, f15, 0.0f));
        }
        return this.f24198e;
    }

    public final void b(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void c() {
        int i9;
        float f10;
        float f11;
        this.f24204x = true;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.f24200n = h5Var;
        h5Var.setTextSize(13);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f24200n;
        int i10 = 5;
        if (LocaleController.isRTL) {
            i9 = 3;
        } else {
            i9 = 5;
        }
        h5Var2.setGravity(i9 | 48);
        org.telegram.ui.ActionBar.h5 h5Var3 = this.f24200n;
        boolean z10 = LocaleController.isRTL;
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
        addView(h5Var3, g7.e6.d(48, 24.0f, i11, f10, 17.0f, f11, 0.0f));
    }

    public boolean d() {
        return true;
    }

    @Override
    public final void e(bh.f fVar) {
        this.d.addTextChangedListener(fVar);
    }

    public boolean f(c6 c6Var) {
        return false;
    }

    public dp getCheckBox() {
        return this.f24201r;
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
        return this.f24205y;
    }

    @Override
    public CharSequence getFieldText() {
        fh.s sVar = this.d;
        if (sVar.length() > 0) {
            return sVar.getText();
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
        return this.f24200n;
    }

    public void h(c6 c6Var, boolean z10) {
        this.f24201r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        boolean z12;
        float f10;
        float f11;
        dp dpVar = this.f24201r;
        if (dpVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return;
        }
        AnimatorSet animatorSet = this.f24203w;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f24203w = null;
        }
        if (z10) {
            num = 1;
        }
        dpVar.setTag(num);
        ImageView imageView = this.h;
        float f12 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f24203w = animatorSet2;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            float[] fArr = {f11};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dpVar, property, fArr);
            if (!z10) {
                f12 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(imageView, property, f12));
            this.f24203w.setDuration(180L);
            this.f24203w.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        dpVar.setAlpha(f10);
        if (!z10) {
            f12 = 1.0f;
        }
        imageView.setAlpha(f12);
    }

    public final void n(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f24199f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        fh.s sVar = this.d;
        sVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            sVar.setSelection(sVar.length());
        }
        sVar.setHint(str);
        this.v = z10;
        setWillNotDraw(!z10);
    }

    public boolean o() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dp dpVar = this.f24201r;
        if (dpVar != null) {
            m(o(), false);
            dpVar.a(f(this), false);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float dp;
        int i9;
        if (this.v && d()) {
            boolean z10 = LocaleController.isRTL;
            float f11 = 20.0f;
            ImageView imageView = this.h;
            if (z10) {
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
                i9 = AndroidUtilities.dp(f11);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        qg qgVar;
        ImageView imageView;
        fh.s sVar;
        int i11;
        float f10;
        int size = View.MeasureSpec.getSize(i9);
        int i12 = 0;
        while (true) {
            int childCount = getChildCount();
            qgVar = this.f24205y;
            imageView = this.f24199f;
            sVar = this.d;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt != sVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else if (childAt == qgVar) {
                    qgVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    } else {
                        org.telegram.ui.ActionBar.h5 h5Var = this.f24200n;
                        if (childAt == h5Var) {
                            h5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                        } else {
                            dp dpVar = this.f24201r;
                            if (childAt == dpVar) {
                                dpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                            } else {
                                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                if (layoutParams != null) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                                } else {
                                    childAt.measure(i9, i10);
                                }
                            }
                        }
                    }
                }
            }
            i12++;
        }
        Integer num = this.A;
        if (num != null) {
            i11 = num.intValue();
        } else if (this.f24200n == null) {
            i11 = 42;
        } else if (imageView == null) {
            i11 = 70;
        } else if (qgVar != null) {
            i11 = 144;
        } else {
            i11 = 122;
        }
        sVar.measure(ll.d(i11, (size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = sVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), sVar.getMeasuredHeight()) + (this.v ? 1 : 0));
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f24200n;
        if (h5Var2 != null && !this.f24204x) {
            if (measuredHeight >= AndroidUtilities.dp(52.0f)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            h5Var2.setAlpha(f10);
        }
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.f24196b.a(z10, true);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i9) {
        org.telegram.ui.ActionBar.b6 b6Var = this.f24197c;
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.f24199f;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), PorterDuff.Mode.MULTIPLY));
        }
        qg qgVar = this.f24205y;
        if (qgVar != null) {
            qgVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), PorterDuff.Mode.SRC_IN));
        }
    }

    public void setShowNextButton(boolean z10) {
        this.f24202s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f24200n;
        if (h5Var == null) {
            return;
        }
        h5Var.l(str, false);
    }

    public void setTextColor(int i9) {
        this.d.setTextColor(i9);
    }

    public void setTextRight(int i9) {
        this.A = Integer.valueOf(i9);
    }

    public void i(boolean z10) {
    }

    public void j(c6 c6Var) {
    }

    public void k(fh.s sVar) {
    }

    @Override
    public final void B(float f10, int i9) {
    }

    public void g(fh.s sVar, ActionMode actionMode) {
    }
}
