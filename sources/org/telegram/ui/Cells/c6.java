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
import org.telegram.messenger.vl;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zg;
public class c6 extends FrameLayout implements ky0, le.d {
    public Integer E;
    public final le.b f21682a;
    public final le.b f21683b;
    public final org.telegram.ui.ActionBar.f6 f21684c;
    public final b6 d;
    public rh.d f21685e;
    public final ImageView f21686f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.j5 f21687n;
    public final mp f21688r;
    public boolean f21689s;
    public boolean v;
    public AnimatorSet f21690w;
    public boolean f21691x;
    public final bh f21692y;

    public c6(Context context, int i10, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.f6 f6Var) {
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
        pr prVar = pr.h;
        this.f21682a = new le.b(0, this, prVar, 380L, false);
        this.f21683b = new le.b(1, this, prVar, 380L, false);
        this.f21684c = f6Var;
        b6 b6Var = new b6(this, context, f6Var, 0);
        this.d = b6Var;
        b6Var.setAllowTextEntitiesIntersection(true);
        b6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        b6Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        b6Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
        b6Var.setTextSize(1, 16.0f);
        b6Var.setMaxLines(Integer.MAX_VALUE);
        b6Var.setBackground(null);
        b6Var.setImeOptions(b6Var.getImeOptions() | 268435456);
        b6Var.setInputType(b6Var.getInputType() | 16384);
        b6Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
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
            addView(b6Var, w7.x5.d(-1, -2.0f, i22, f13, 0.0f, f14, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i23 = org.telegram.ui.ActionBar.j6.f20827m6;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i23, f6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
            if (LocaleController.isRTL) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            addView(imageView, w7.x5.d(48, 48.0f, i17 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f21686f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vh, f6Var), 1, -1));
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i23, f6Var), mode));
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
            addView(imageView2, w7.x5.d(48, 50.0f, i24, f15, 0.0f, f16, 0.0f));
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
            this.f21687n = j5Var;
            j5Var.setTextSize(13);
            org.telegram.ui.ActionBar.j5 j5Var2 = this.f21687n;
            if (LocaleController.isRTL) {
                i19 = 3;
            } else {
                i19 = 5;
            }
            j5Var2.setGravity(i19 | 48);
            View view = this.f21687n;
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
            addView(view, w7.x5.d(48, 24.0f, i25, f17, 43.0f, f18, 0.0f));
            mp mpVar = new mp(context, 21, f6Var);
            this.f21688r = mpVar;
            mpVar.b(-1, i23, org.telegram.ui.ActionBar.j6.f20792k7);
            mpVar.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            mpVar.setDrawUnchecked(true);
            mpVar.a(true, false);
            mpVar.setAlpha(0.0f);
            mpVar.setDrawBackgroundAsArc(8);
            if (LocaleController.isRTL) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            addView(mpVar, w7.x5.d(48, 48.0f, i21 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            mpVar.setOnClickListener(new View.OnClickListener(this) {
                public final c6 f21614b;

                {
                    this.f21614b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            c6 c6Var = this.f21614b;
                            mp mpVar2 = c6Var.f21688r;
                            if (mpVar2.getTag() != null) {
                                c6Var.h(c6Var, !mpVar2.f28477a.f23907q);
                                return;
                            }
                            return;
                        default:
                            c6 c6Var2 = this.f21614b;
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
            addView(b6Var, w7.x5.d(-1, -2.0f, i26, f7, 0.0f, f10, 0.0f));
        }
        if (i10 == 1) {
            bh bhVar = new bh(context);
            this.f21692y = bhVar;
            bhVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20827m6, f6Var), PorterDuff.Mode.SRC_IN));
            bhVar.j(zg.f33152e, false);
            int dp = AndroidUtilities.dp(9.5f);
            bhVar.setPadding(dp, dp, dp, dp);
            bhVar.setVisibility(8);
            if (this.f21686f == null) {
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
            addView(bhVar, w7.x5.d(48, 48.0f, i14, f11, 0.0f, f12, 0.0f));
            bhVar.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vh, f6Var), 1, -1));
            bhVar.setOnClickListener(new View.OnClickListener(this) {
                public final c6 f21614b;

                {
                    this.f21614b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            c6 c6Var = this.f21614b;
                            mp mpVar2 = c6Var.f21688r;
                            if (mpVar2.getTag() != null) {
                                c6Var.h(c6Var, !mpVar2.f28477a.f23907q);
                                return;
                            }
                            return;
                        default:
                            c6 c6Var2 = this.f21614b;
                            c6Var2.j(c6Var2);
                            return;
                    }
                }
            });
            bhVar.setContentDescription(LocaleController.getString(R.string.Emoji));
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
        bh bhVar;
        int i11;
        if (i10 == 0) {
            mp mpVar = this.f21688r;
            if (mpVar != null) {
                CheckBoxBase checkBoxBase = mpVar.getCheckBoxBase();
                float f11 = this.f21682a.f15368e;
                if (checkBoxBase.f23912w != f11) {
                    checkBoxBase.f23912w = f11;
                    checkBoxBase.b();
                }
                mpVar.invalidate();
            }
        } else if (i10 == 1 && (bhVar = this.f21692y) != null) {
            float f12 = this.f21683b.f15368e;
            float f13 = 0.85f * f12;
            bhVar.setScaleX(f13);
            bhVar.setScaleY(f13);
            bhVar.setAlpha(f12);
            if (f12 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            bhVar.setVisibility(i11);
            org.telegram.ui.ActionBar.j5 j5Var = this.f21687n;
            if (j5Var != null && this.f21686f == null && j5Var.getVisibility() == 0) {
                if (this.f21685e != null) {
                    this.f21687n.setTranslationY(AndroidUtilities.dp(36.0f));
                } else {
                    this.f21687n.setTranslationY(AndroidUtilities.dp(26.0f) * f12);
                }
            }
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
        float f13;
        ImageView imageView = this.f21686f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        rh.d dVar = new rh.d(getContext(), 38);
        this.f21685e = dVar;
        dVar.setFocusable(false);
        this.f21685e.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vh, this.f21684c), 1, -1));
        w7.z5.a(this.f21685e);
        rh.d dVar2 = this.f21685e;
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
        addView(dVar2, w7.x5.d(48, 50.0f, i15, f7, 0.0f, f10, 0.0f));
        bh bhVar = this.f21692y;
        if (bhVar != null) {
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
            bhVar.setLayoutParams(w7.x5.d(48, 48.0f, i16, f12, 1.0f, f13, 0.0f));
        }
        b6 b6Var = this.d;
        if (b6Var != null) {
            if (LocaleController.isRTL) {
                i11 = ((ViewGroup.MarginLayoutParams) b6Var.getLayoutParams()).rightMargin;
            } else {
                i11 = ((ViewGroup.MarginLayoutParams) b6Var.getLayoutParams()).leftMargin;
            }
            float f14 = i11 / AndroidUtilities.density;
            if (bhVar != null) {
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
            b6Var.setLayoutParams(w7.x5.d(-1, -2.0f, i18, f11, 0.0f, f14, 0.0f));
        }
        return this.f21685e;
    }

    public final void b(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void c() {
        int i10;
        float f7;
        float f10;
        this.f21691x = true;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
        this.f21687n = j5Var;
        j5Var.setTextSize(13);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f21687n;
        int i11 = 5;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        j5Var2.setGravity(i10 | 48);
        org.telegram.ui.ActionBar.j5 j5Var3 = this.f21687n;
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
        addView(j5Var3, w7.x5.d(48, 24.0f, i12, f7, 17.0f, f10, 0.0f));
    }

    public boolean d() {
        return true;
    }

    @Override
    public final void e(di.i2 i2Var) {
        this.d.addTextChangedListener(i2Var);
    }

    public boolean f(c6 c6Var) {
        return false;
    }

    public mp getCheckBox() {
        return this.f21688r;
    }

    @Override
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override
    public Editable getEditText() {
        return this.d.getText();
    }

    public bh getEmojiButton() {
        return this.f21692y;
    }

    @Override
    public CharSequence getFieldText() {
        b6 b6Var = this.d;
        if (b6Var.length() > 0) {
            return b6Var.getText();
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
        return this.f21687n;
    }

    public void h(c6 c6Var, boolean z10) {
        this.f21688r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        mp mpVar = this.f21688r;
        if (mpVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return;
        }
        AnimatorSet animatorSet = this.f21690w;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f21690w = null;
        }
        if (z10) {
            num = 1;
        }
        mpVar.setTag(num);
        ImageView imageView = this.h;
        float f11 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f21690w = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mpVar, property, fArr);
            if (!z10) {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(imageView, property, f11));
            this.f21690w.setDuration(180L);
            this.f21690w.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        mpVar.setAlpha(f7);
        if (!z10) {
            f11 = 1.0f;
        }
        imageView.setAlpha(f11);
    }

    public final void n(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f21686f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        b6 b6Var = this.d;
        b6Var.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            b6Var.setSelection(b6Var.length());
        }
        b6Var.setHint(str);
        this.v = z10;
        setWillNotDraw(!z10);
    }

    public boolean o() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mp mpVar = this.f21688r;
        if (mpVar != null) {
            m(o(), false);
            mpVar.a(f(this), false);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float dp;
        int i10;
        if (this.v && d()) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20785k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        bh bhVar;
        ImageView imageView;
        b6 b6Var;
        int i12;
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        while (true) {
            int childCount = getChildCount();
            bhVar = this.f21692y;
            imageView = this.f21686f;
            b6Var = this.d;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt != b6Var) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else if (childAt == bhVar) {
                    bhVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    } else {
                        org.telegram.ui.ActionBar.j5 j5Var = this.f21687n;
                        if (childAt == j5Var) {
                            j5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                        } else {
                            mp mpVar = this.f21688r;
                            if (childAt == mpVar) {
                                mpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
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
        } else if (this.f21687n == null) {
            i12 = 42;
        } else if (imageView == null) {
            i12 = 70;
        } else if (bhVar != null) {
            i12 = 144;
        } else {
            i12 = 122;
        }
        b6Var.measure(vl.d(i12, (size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = b6Var.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), b6Var.getMeasuredHeight()) + (this.v ? 1 : 0));
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f21687n;
        if (j5Var2 != null && !this.f21691x) {
            if (measuredHeight >= AndroidUtilities.dp(52.0f)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            j5Var2.setAlpha(f7);
        }
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.f21683b.a(z10, true);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.f21684c;
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.f21686f;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
        }
        bh bhVar = this.f21692y;
        if (bhVar != null) {
            bhVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
        }
    }

    public void setShowNextButton(boolean z10) {
        this.f21689s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.j5 j5Var = this.f21687n;
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

    public void j(c6 c6Var) {
    }

    public void k(b6 b6Var) {
    }

    public void g(b6 b6Var, ActionMode actionMode) {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
