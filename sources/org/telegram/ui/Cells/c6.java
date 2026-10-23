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
import org.telegram.messenger.nk;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.yg;
public class c6 extends FrameLayout implements gz0, ne.d {
    public Integer E;
    public final ne.b f22095a;
    public final ne.b f22096b;
    public final org.telegram.ui.ActionBar.d6 f22097c;
    public final b6 d;
    public rh.d e;
    public final ImageView f22098f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.j5 f22099n;
    public final xp f22100r;
    public boolean f22101s;
    public boolean v;
    public AnimatorSet f22102w;
    public boolean f22103x;
    public final ah f22104y;

    public c6(Context context, int i10, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.d6 d6Var) {
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
        bs bsVar = bs.h;
        this.f22095a = new ne.b(0, this, bsVar, 380L, false);
        this.f22096b = new ne.b(1, this, bsVar, 380L, false);
        this.f22097c = d6Var;
        b6 b6Var = new b6(this, context, d6Var, 0);
        this.d = b6Var;
        b6Var.setAllowTextEntitiesIntersection(true);
        b6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        b6Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21053gc, d6Var));
        b6Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H6, d6Var));
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
                f11 = i15;
            } else {
                f11 = 54.0f;
            }
            addView(b6Var, w7.z5.d(-1, -2.0f, i22, f11, 0.0f, z10 ? 54.0f : i15, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i23 = org.telegram.ui.ActionBar.h6.f21157m6;
            int w02 = org.telegram.ui.ActionBar.h6.w0(i23, d6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
            if (LocaleController.isRTL) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            addView(imageView, w7.z5.d(48, 48.0f, i17 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f22098f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Vh, d6Var), 1, -1));
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i23, d6Var), mode));
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
            addView(imageView2, w7.z5.d(48, 50.0f, i24, f12, 0.0f, f13, 0.0f));
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
            this.f22099n = j5Var;
            j5Var.setTextSize(13);
            org.telegram.ui.ActionBar.j5 j5Var2 = this.f22099n;
            if (LocaleController.isRTL) {
                i19 = 3;
            } else {
                i19 = 5;
            }
            j5Var2.setGravity(i19 | 48);
            View view = this.f22099n;
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
            addView(view, w7.z5.d(48, 24.0f, i25, f14, 43.0f, f15, 0.0f));
            xp xpVar = new xp(context, 21, d6Var);
            this.f22100r = xpVar;
            xpVar.b(-1, i23, org.telegram.ui.ActionBar.h6.f21122k7);
            xpVar.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            xpVar.setDrawUnchecked(true);
            xpVar.a(true, false);
            xpVar.setAlpha(0.0f);
            xpVar.setDrawBackgroundAsArc(8);
            if (LocaleController.isRTL) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            addView(xpVar, w7.z5.d(48, 48.0f, i21 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            xpVar.setOnClickListener(new View.OnClickListener(this) {
                public final c6 f21984b;

                {
                    this.f21984b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            c6 c6Var = this.f21984b;
                            xp xpVar2 = c6Var.f22100r;
                            if (xpVar2.getTag() != null) {
                                c6Var.h(c6Var, !xpVar2.f32463a.f24155q);
                                return;
                            }
                            return;
                        default:
                            c6 c6Var2 = this.f21984b;
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
            addView(b6Var, w7.z5.d(-1, -2.0f, i26, f7, 0.0f, z13 ? 19.0f : i11, 0.0f));
        }
        if (i10 == 1) {
            ah ahVar = new ah(context);
            this.f22104y = ahVar;
            ahVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21157m6, d6Var), PorterDuff.Mode.SRC_IN));
            ahVar.j(yg.e, false);
            int dp = AndroidUtilities.dp(9.5f);
            ahVar.setPadding(dp, dp, dp, dp);
            ahVar.setVisibility(8);
            if (this.f22098f == null) {
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
            addView(ahVar, w7.z5.d(48, 48.0f, i14, f10, 0.0f, z14 ? 0.0f : i13, 0.0f));
            ahVar.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Vh, d6Var), 1, -1));
            ahVar.setOnClickListener(new View.OnClickListener(this) {
                public final c6 f21984b;

                {
                    this.f21984b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            c6 c6Var = this.f21984b;
                            xp xpVar2 = c6Var.f22100r;
                            if (xpVar2.getTag() != null) {
                                c6Var.h(c6Var, !xpVar2.f32463a.f24155q);
                                return;
                            }
                            return;
                        default:
                            c6 c6Var2 = this.f21984b;
                            c6Var2.j(c6Var2);
                            return;
                    }
                }
            });
            ahVar.setContentDescription(LocaleController.getString(R.string.Emoji));
        }
    }

    @Override
    public final void a(ai.u uVar) {
        this.d.addTextChangedListener(uVar);
    }

    public final rh.d b() {
        int i10;
        float f7;
        float f10;
        int i11;
        int i12;
        float f11;
        int i13;
        float f12;
        ImageView imageView = this.f22098f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        rh.d dVar = new rh.d(getContext(), 38);
        this.e = dVar;
        dVar.setFocusable(false);
        this.e.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Vh, this.f22097c), 1, -1));
        w7.b6.a(this.e);
        rh.d dVar2 = this.e;
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
        addView(dVar2, w7.z5.d(48, 50.0f, i15, f7, 0.0f, f10, 0.0f));
        ah ahVar = this.f22104y;
        if (ahVar != null) {
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
            ahVar.setLayoutParams(w7.z5.d(48, 48.0f, i16, f12, 1.0f, f13, 0.0f));
        }
        b6 b6Var = this.d;
        if (b6Var != null) {
            if (LocaleController.isRTL) {
                i11 = ((ViewGroup.MarginLayoutParams) b6Var.getLayoutParams()).rightMargin;
            } else {
                i11 = ((ViewGroup.MarginLayoutParams) b6Var.getLayoutParams()).leftMargin;
            }
            float f14 = i11 / AndroidUtilities.density;
            if (ahVar != null) {
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
            b6Var.setLayoutParams(w7.z5.d(-1, -2.0f, i18, f11, 0.0f, f14, 0.0f));
        }
        return this.e;
    }

    public final void c(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void d() {
        int i10;
        float f7;
        float f10;
        this.f22103x = true;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
        this.f22099n = j5Var;
        j5Var.setTextSize(13);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f22099n;
        int i11 = 5;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        j5Var2.setGravity(i10 | 48);
        org.telegram.ui.ActionBar.j5 j5Var3 = this.f22099n;
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
        addView(j5Var3, w7.z5.d(48, 24.0f, i12, f7, 17.0f, f10, 0.0f));
    }

    public boolean e() {
        return true;
    }

    public boolean f(c6 c6Var) {
        return false;
    }

    public xp getCheckBox() {
        return this.f22100r;
    }

    @Override
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override
    public Editable getEditText() {
        return this.d.getText();
    }

    public ah getEmojiButton() {
        return this.f22104y;
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
        return this.f22099n;
    }

    public void h(c6 c6Var, boolean z10) {
        this.f22100r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        xp xpVar = this.f22100r;
        if (xpVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return;
        }
        AnimatorSet animatorSet = this.f22102w;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f22102w = null;
        }
        if (z10) {
            num = 1;
        }
        xpVar.setTag(num);
        ImageView imageView = this.h;
        float f11 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f22102w = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xpVar, property, fArr);
            if (!z10) {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(imageView, property, f11));
            this.f22102w.setDuration(180L);
            this.f22102w.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        xpVar.setAlpha(f7);
        if (!z10) {
            f11 = 1.0f;
        }
        imageView.setAlpha(f11);
    }

    public final void n(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f22098f;
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
        xp xpVar = this.f22100r;
        if (xpVar != null) {
            m(o(), false);
            xpVar.a(f(this), false);
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
            canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f21115k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ah ahVar;
        ImageView imageView;
        b6 b6Var;
        int i12;
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        while (true) {
            int childCount = getChildCount();
            ahVar = this.f22104y;
            imageView = this.f22098f;
            b6Var = this.d;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt != b6Var) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else if (childAt == ahVar) {
                    ahVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    } else {
                        org.telegram.ui.ActionBar.j5 j5Var = this.f22099n;
                        if (childAt == j5Var) {
                            j5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                        } else {
                            xp xpVar = this.f22100r;
                            if (childAt == xpVar) {
                                xpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
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
        } else if (this.f22099n == null) {
            i12 = 42;
        } else if (imageView == null) {
            i12 = 70;
        } else if (ahVar != null) {
            i12 = 144;
        } else {
            i12 = 122;
        }
        b6Var.measure(nk.c(i12, (size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = b6Var.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), b6Var.getMeasuredHeight()) + (this.v ? 1 : 0));
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f22099n;
        if (j5Var2 != null && !this.f22103x) {
            if (measuredHeight >= AndroidUtilities.dp(52.0f)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            j5Var2.setAlpha(f7);
        }
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        ah ahVar;
        int i11;
        if (i10 == 0) {
            xp xpVar = this.f22100r;
            if (xpVar != null) {
                CheckBoxBase checkBoxBase = xpVar.getCheckBoxBase();
                float f11 = this.f22095a.e;
                if (checkBoxBase.f24160w != f11) {
                    checkBoxBase.f24160w = f11;
                    checkBoxBase.b();
                }
                xpVar.invalidate();
            }
        } else if (i10 == 1 && (ahVar = this.f22104y) != null) {
            float f12 = this.f22096b.e;
            float f13 = 0.85f * f12;
            ahVar.setScaleX(f13);
            ahVar.setScaleY(f13);
            ahVar.setAlpha(f12);
            if (f12 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            ahVar.setVisibility(i11);
            org.telegram.ui.ActionBar.j5 j5Var = this.f22099n;
            if (j5Var != null && this.f22098f == null && j5Var.getVisibility() == 0) {
                if (this.e != null) {
                    this.f22099n.setTranslationY(AndroidUtilities.dp(36.0f));
                } else {
                    this.f22099n.setTranslationY(AndroidUtilities.dp(26.0f) * f12);
                }
            }
        }
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.f22096b.a(z10, true);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i10) {
        org.telegram.ui.ActionBar.d6 d6Var = this.f22097c;
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.f22098f;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        }
        ah ahVar = this.f22104y;
        if (ahVar != null) {
            ahVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), PorterDuff.Mode.SRC_IN));
        }
    }

    public void setShowNextButton(boolean z10) {
        this.f22101s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.j5 j5Var = this.f22099n;
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

    @Override
    public final void H(float f7, int i10) {
    }

    public void g(b6 b6Var, ActionMode actionMode) {
    }
}
