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
import org.telegram.messenger.sk;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.zg;
public class d6 extends FrameLayout implements jz0, ne.d {
    public Integer E;
    public final ne.b f20764a;
    public final ne.b f20765b;
    public final org.telegram.ui.ActionBar.c6 f20766c;
    public final c6 d;
    public rh.d e;
    public final ImageView f20767f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.h5 f20768n;
    public final aq f20769r;
    public boolean f20770s;
    public boolean v;
    public AnimatorSet f20771w;
    public boolean f20772x;
    public final bh f20773y;

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
        es esVar = es.h;
        this.f20764a = new ne.b(0, this, esVar, 380L, false);
        this.f20765b = new ne.b(1, this, esVar, 380L, false);
        this.f20766c = c6Var;
        c6 c6Var2 = new c6(this, context, c6Var, 0);
        this.d = c6Var2;
        c6Var2.setAllowTextEntitiesIntersection(true);
        c6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        c6Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19660gc, c6Var));
        c6Var2.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.H6, c6Var));
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
            addView(c6Var2, w7.z5.a(-2.0f, f11, 0.0f, z10 ? 54.0f : i15, 0.0f, -1, i22));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i23 = org.telegram.ui.ActionBar.g6.f19764m6;
            int w02 = org.telegram.ui.ActionBar.g6.w0(i23, c6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
            if (LocaleController.isRTL) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            addView(imageView, w7.z5.a(48.0f, 6.0f, 2.0f, 6.0f, 0.0f, 48, i17 | 48));
            ImageView imageView2 = new ImageView(context);
            this.f20767f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            imageView2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Vh, c6Var), 1, -1));
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i23, c6Var), mode));
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
            addView(imageView2, w7.z5.a(50.0f, f12, 0.0f, f13, 0.0f, 48, i24));
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            this.f20768n = h5Var;
            h5Var.setTextSize(13);
            org.telegram.ui.ActionBar.h5 h5Var2 = this.f20768n;
            if (LocaleController.isRTL) {
                i19 = 3;
            } else {
                i19 = 5;
            }
            h5Var2.setGravity(i19 | 48);
            View view = this.f20768n;
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
            addView(view, w7.z5.a(24.0f, f14, 43.0f, f15, 0.0f, 48, i25));
            aq aqVar = new aq(context, 21, c6Var);
            this.f20769r = aqVar;
            aqVar.b(-1, i23, org.telegram.ui.ActionBar.g6.f19729k7);
            aqVar.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            aqVar.setDrawUnchecked(true);
            aqVar.a(true, false);
            aqVar.setAlpha(0.0f);
            aqVar.setDrawBackgroundAsArc(8);
            if (LocaleController.isRTL) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            addView(aqVar, w7.z5.a(48.0f, 6.0f, 2.0f, 6.0f, 0.0f, 48, i21 | 48));
            aqVar.setOnClickListener(new View.OnClickListener(this) {
                public final d6 f20653b;

                {
                    this.f20653b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            d6 d6Var = this.f20653b;
                            aq aqVar2 = d6Var.f20769r;
                            if (aqVar2.getTag() != null) {
                                d6Var.h(d6Var, !aqVar2.f23281a.f22792q);
                                return;
                            }
                            return;
                        default:
                            d6 d6Var2 = this.f20653b;
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
            addView(c6Var2, w7.z5.a(-2.0f, f7, 0.0f, z13 ? 19.0f : i11, 0.0f, -1, i26));
        }
        if (i10 == 1) {
            bh bhVar = new bh(context);
            this.f20773y = bhVar;
            bhVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19764m6, c6Var), PorterDuff.Mode.SRC_IN));
            bhVar.j(zg.e, false);
            int dp = AndroidUtilities.dp(9.5f);
            bhVar.setPadding(dp, dp, dp, dp);
            bhVar.setVisibility(8);
            if (this.f20767f == null) {
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
            addView(bhVar, w7.z5.a(48.0f, f10, 0.0f, z14 ? 0.0f : i13, 0.0f, 48, i14));
            bhVar.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Vh, c6Var), 1, -1));
            bhVar.setOnClickListener(new View.OnClickListener(this) {
                public final d6 f20653b;

                {
                    this.f20653b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            d6 d6Var = this.f20653b;
                            aq aqVar2 = d6Var.f20769r;
                            if (aqVar2.getTag() != null) {
                                d6Var.h(d6Var, !aqVar2.f23281a.f22792q);
                                return;
                            }
                            return;
                        default:
                            d6 d6Var2 = this.f20653b;
                            d6Var2.j(d6Var2);
                            return;
                    }
                }
            });
            bhVar.setContentDescription(LocaleController.getString(R.string.Emoji));
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
        ImageView imageView = this.f20767f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        rh.d dVar = new rh.d(getContext(), 38);
        this.e = dVar;
        dVar.setFocusable(false);
        this.e.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Vh, this.f20766c), 1, -1));
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
        addView(dVar2, w7.z5.a(50.0f, f7, 0.0f, f10, 0.0f, 48, i15));
        bh bhVar = this.f20773y;
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
            if (!z11) {
                f13 = 44;
            }
            bhVar.setLayoutParams(w7.z5.a(48.0f, f12, 1.0f, f13, 0.0f, 48, i16));
        }
        c6 c6Var = this.d;
        if (c6Var != null) {
            if (LocaleController.isRTL) {
                i11 = ((ViewGroup.MarginLayoutParams) c6Var.getLayoutParams()).rightMargin;
            } else {
                i11 = ((ViewGroup.MarginLayoutParams) c6Var.getLayoutParams()).leftMargin;
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
            c6Var.setLayoutParams(w7.z5.a(-2.0f, f11, 0.0f, f14, 0.0f, -1, i18));
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
        this.f20772x = true;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.f20768n = h5Var;
        h5Var.setTextSize(13);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f20768n;
        int i11 = 5;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        h5Var2.setGravity(i10 | 48);
        org.telegram.ui.ActionBar.h5 h5Var3 = this.f20768n;
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
        addView(h5Var3, w7.z5.a(24.0f, f7, 17.0f, f10, 0.0f, 48, i12));
    }

    public boolean d() {
        return true;
    }

    @Override
    public final void e(di.h2 h2Var) {
        this.d.addTextChangedListener(h2Var);
    }

    public boolean f(d6 d6Var) {
        return false;
    }

    public aq getCheckBox() {
        return this.f20769r;
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
        return this.f20773y;
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
        return this.f20768n;
    }

    public void h(d6 d6Var, boolean z10) {
        this.f20769r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        aq aqVar = this.f20769r;
        if (aqVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return;
        }
        AnimatorSet animatorSet = this.f20771w;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f20771w = null;
        }
        if (z10) {
            num = 1;
        }
        aqVar.setTag(num);
        ImageView imageView = this.h;
        float f11 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f20771w = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aqVar, property, fArr);
            if (!z10) {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(imageView, property, f11));
            this.f20771w.setDuration(180L);
            this.f20771w.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        aqVar.setAlpha(f7);
        if (!z10) {
            f11 = 1.0f;
        }
        imageView.setAlpha(f11);
    }

    public final void n(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f20767f;
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
        aq aqVar = this.f20769r;
        if (aqVar != null) {
            m(o(), false);
            aqVar.a(f(this), false);
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
            canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f19722k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        bh bhVar;
        ImageView imageView;
        c6 c6Var;
        int i12;
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        while (true) {
            int childCount = getChildCount();
            bhVar = this.f20773y;
            imageView = this.f20767f;
            c6Var = this.d;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt != c6Var) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else if (childAt == bhVar) {
                    bhVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    } else {
                        org.telegram.ui.ActionBar.h5 h5Var = this.f20768n;
                        if (childAt == h5Var) {
                            h5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                        } else {
                            aq aqVar = this.f20769r;
                            if (childAt == aqVar) {
                                aqVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
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
        } else if (this.f20768n == null) {
            i12 = 42;
        } else if (imageView == null) {
            i12 = 70;
        } else if (bhVar != null) {
            i12 = 144;
        } else {
            i12 = 122;
        }
        c6Var.measure(sk.c(i12, (size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = c6Var.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), c6Var.getMeasuredHeight()) + (this.v ? 1 : 0));
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f20768n;
        if (h5Var2 != null && !this.f20772x) {
            if (measuredHeight >= AndroidUtilities.dp(52.0f)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            h5Var2.setAlpha(f7);
        }
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        bh bhVar;
        int i11;
        if (i10 == 0) {
            aq aqVar = this.f20769r;
            if (aqVar != null) {
                CheckBoxBase checkBoxBase = aqVar.getCheckBoxBase();
                float f11 = this.f20764a.e;
                if (checkBoxBase.f22797w != f11) {
                    checkBoxBase.f22797w = f11;
                    checkBoxBase.b();
                }
                aqVar.invalidate();
            }
        } else if (i10 == 1 && (bhVar = this.f20773y) != null) {
            float f12 = this.f20765b.e;
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
            org.telegram.ui.ActionBar.h5 h5Var = this.f20768n;
            if (h5Var != null && this.f20767f == null && h5Var.getVisibility() == 0) {
                if (this.e != null) {
                    this.f20768n.setTranslationY(AndroidUtilities.dp(36.0f));
                } else {
                    this.f20768n.setTranslationY(AndroidUtilities.dp(26.0f) * f12);
                }
            }
        }
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.f20765b.a(z10, true);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f20766c;
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.f20767f;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        }
        bh bhVar = this.f20773y;
        if (bhVar != null) {
            bhVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), PorterDuff.Mode.SRC_IN));
        }
    }

    public void setShowNextButton(boolean z10) {
        this.f20770s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f20768n;
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
    public final void A(float f7, int i10) {
    }

    public void g(c6 c6Var, ActionMode actionMode) {
    }
}
