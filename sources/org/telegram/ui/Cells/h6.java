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
import org.telegram.messenger.vh;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.yg;
import org.telegram.ui.Components.zp;
public class h6 extends FrameLayout implements rz0, oe.d {
    public Integer E;
    public final oe.b f24197a;
    public final oe.b f24198b;
    public final org.telegram.ui.ActionBar.u6 f24199c;
    public final g6 d;
    public sh.d e;
    public final ImageView f24200f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.b6 f24201n;
    public final zp f24202r;
    public boolean f24203s;
    public boolean v;
    public AnimatorSet f24204w;
    public boolean f24205x;
    public final ah f24206y;

    public h6(Context context, int i10, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.u6 u6Var) {
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
        ds dsVar = ds.h;
        this.f24197a = new oe.b(0, this, dsVar, 380L, false);
        this.f24198b = new oe.b(1, this, dsVar, 380L, false);
        this.f24199c = u6Var;
        g6 g6Var = new g6(this, context, u6Var, 0);
        this.d = g6Var;
        g6Var.setAllowTextEntitiesIntersection(true);
        org.telegram.ui.ActionBar.f7.V(g6Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        org.telegram.ui.ActionBar.f7.H(g6Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
        org.telegram.ui.ActionBar.f7.E(g6Var, org.telegram.ui.ActionBar.y6.H6, u6Var);
        g6Var.setTextSize(1, 16.0f);
        g6Var.setMaxLines(Integer.MAX_VALUE);
        g6Var.setBackground(null);
        g6Var.setImeOptions(g6Var.getImeOptions() | 268435456);
        g6Var.setInputType(g6Var.getInputType() | 16384);
        g6Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
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
            addView(g6Var, gb1.h(-1, -2.0f, i22, f11, 0.0f, f12, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i23 = org.telegram.ui.ActionBar.y6.f23520m6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.f7.t(imageView, i23, u6Var, mode);
            if (LocaleController.isRTL) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            addView(imageView, gb1.h(48, 48.0f, i17 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f24200f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i24 = org.telegram.ui.ActionBar.y6.Vh;
            y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i24, u6Var), 1, -1);
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i24);
            imageView2.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(imageView2, g02, null, N, u6Var);
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            org.telegram.ui.ActionBar.f7.t(imageView2, i23, u6Var, mode);
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
            addView(imageView2, gb1.h(48, 50.0f, i25, f13, 0.0f, f14, 0.0f));
            org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
            this.f24201n = b6Var;
            b6Var.setTextSize(13);
            org.telegram.ui.ActionBar.b6 b6Var2 = this.f24201n;
            if (LocaleController.isRTL) {
                i19 = 3;
            } else {
                i19 = 5;
            }
            b6Var2.setGravity(i19 | 48);
            View view = this.f24201n;
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
            addView(view, gb1.h(48, 24.0f, i26, f15, 43.0f, f16, 0.0f));
            zp zpVar = new zp(context, 21, u6Var);
            this.f24202r = zpVar;
            zpVar.b(-1, i23, org.telegram.ui.ActionBar.y6.f23485k7);
            zpVar.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            zpVar.setDrawUnchecked(true);
            zpVar.a(true, false);
            zpVar.setAlpha(0.0f);
            zpVar.setDrawBackgroundAsArc(8);
            if (LocaleController.isRTL) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            addView(zpVar, gb1.h(48, 48.0f, i21 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            zpVar.setOnClickListener(new View.OnClickListener(this) {
                public final h6 f24074b;

                {
                    this.f24074b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            h6 h6Var = this.f24074b;
                            zp zpVar2 = h6Var.f24202r;
                            if (zpVar2.getTag() != null) {
                                h6Var.h(h6Var, !zpVar2.f35382a.f26089q);
                                return;
                            }
                            return;
                        default:
                            h6 h6Var2 = this.f24074b;
                            h6Var2.j(h6Var2);
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
            addView(g6Var, gb1.h(-1, -2.0f, i27, f7, 0.0f, z13 ? 19.0f : i11, 0.0f));
        }
        if (i10 == 1) {
            ah ahVar = new ah(context);
            this.f24206y = ahVar;
            org.telegram.ui.ActionBar.f7.t(ahVar, org.telegram.ui.ActionBar.y6.f23520m6, u6Var, PorterDuff.Mode.SRC_IN);
            ahVar.j(yg.e, false);
            int dp = AndroidUtilities.dp(9.5f);
            ahVar.setPadding(dp, dp, dp, dp);
            ahVar.setVisibility(8);
            if (this.f24200f == null) {
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
            addView(ahVar, gb1.h(48, 48.0f, i14, f10, 0.0f, z14 ? 0.0f : i13, 0.0f));
            int i28 = org.telegram.ui.ActionBar.y6.Vh;
            y g03 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i28, u6Var), 1, -1);
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i28);
            ahVar.setBackground(g03);
            org.telegram.ui.ActionBar.f7.k(ahVar, g03, null, N2, u6Var);
            ahVar.setOnClickListener(new View.OnClickListener(this) {
                public final h6 f24074b;

                {
                    this.f24074b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            h6 h6Var = this.f24074b;
                            zp zpVar2 = h6Var.f24202r;
                            if (zpVar2.getTag() != null) {
                                h6Var.h(h6Var, !zpVar2.f35382a.f26089q);
                                return;
                            }
                            return;
                        default:
                            h6 h6Var2 = this.f24074b;
                            h6Var2.j(h6Var2);
                            return;
                    }
                }
            });
            ahVar.setContentDescription(LocaleController.getString(R.string.Emoji));
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        ah ahVar;
        int i11;
        if (i10 == 0) {
            zp zpVar = this.f24202r;
            if (zpVar != null) {
                CheckBoxBase checkBoxBase = zpVar.getCheckBoxBase();
                float f11 = this.f24197a.e;
                if (checkBoxBase.f26094w != f11) {
                    checkBoxBase.f26094w = f11;
                    checkBoxBase.b();
                }
                zpVar.invalidate();
            }
        } else if (i10 == 1 && (ahVar = this.f24206y) != null) {
            float f12 = this.f24198b.e;
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
            org.telegram.ui.ActionBar.b6 b6Var = this.f24201n;
            if (b6Var != null && this.f24200f == null && b6Var.getVisibility() == 0) {
                if (this.e != null) {
                    this.f24201n.setTranslationY(AndroidUtilities.dp(36.0f));
                } else {
                    this.f24201n.setTranslationY(AndroidUtilities.dp(26.0f) * f12);
                }
            }
        }
    }

    public final sh.d a() {
        int i10;
        float f7;
        float f10;
        int i11;
        int i12;
        float f11;
        int i13;
        float f12;
        ImageView imageView = this.f24200f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        sh.d dVar = new sh.d(getContext(), 38);
        this.e = dVar;
        dVar.setFocusable(false);
        sh.d dVar2 = this.e;
        int i14 = org.telegram.ui.ActionBar.y6.Vh;
        org.telegram.ui.ActionBar.u6 u6Var = this.f24199c;
        org.telegram.ui.ActionBar.f7.R(dVar2, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i14, u6Var), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i14), u6Var);
        gb1.b(this.e);
        sh.d dVar3 = this.e;
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
        addView(dVar3, gb1.h(48, 50.0f, i16, f7, 0.0f, f10, 0.0f));
        ah ahVar = this.f24206y;
        if (ahVar != null) {
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
            ahVar.setLayoutParams(gb1.h(48, 48.0f, i17, f12, 1.0f, f13, 0.0f));
        }
        g6 g6Var = this.d;
        if (g6Var != null) {
            if (LocaleController.isRTL) {
                i11 = ((ViewGroup.MarginLayoutParams) g6Var.getLayoutParams()).rightMargin;
            } else {
                i11 = ((ViewGroup.MarginLayoutParams) g6Var.getLayoutParams()).leftMargin;
            }
            float f14 = i11 / AndroidUtilities.density;
            if (ahVar != null) {
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
            g6Var.setLayoutParams(gb1.h(-1, -2.0f, i19, f11, 0.0f, f14, 0.0f));
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
        this.f24205x = true;
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(getContext());
        this.f24201n = b6Var;
        b6Var.setTextSize(13);
        org.telegram.ui.ActionBar.b6 b6Var2 = this.f24201n;
        int i11 = 5;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        b6Var2.setGravity(i10 | 48);
        org.telegram.ui.ActionBar.b6 b6Var3 = this.f24201n;
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
        addView(b6Var3, gb1.h(48, 24.0f, i12, f7, 17.0f, f10, 0.0f));
    }

    @Override
    public final void d(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public boolean e() {
        return true;
    }

    public boolean f(h6 h6Var) {
        return false;
    }

    public zp getCheckBox() {
        return this.f24202r;
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
        return this.f24206y;
    }

    @Override
    public CharSequence getFieldText() {
        g6 g6Var = this.d;
        if (g6Var.length() > 0) {
            return g6Var.getText();
        }
        return null;
    }

    @Override
    public org.telegram.ui.ActionBar.r2 getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.b6 getTextView2() {
        return this.f24201n;
    }

    public void h(h6 h6Var, boolean z10) {
        this.f24202r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        zp zpVar = this.f24202r;
        if (zpVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return;
        }
        AnimatorSet animatorSet = this.f24204w;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f24204w = null;
        }
        if (z10) {
            num = 1;
        }
        zpVar.setTag(num);
        ImageView imageView = this.h;
        float f11 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f24204w = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zpVar, property, fArr);
            if (!z10) {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(imageView, property, f11));
            this.f24204w.setDuration(180L);
            this.f24204w.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        zpVar.setAlpha(f7);
        if (!z10) {
            f11 = 1.0f;
        }
        imageView.setAlpha(f11);
    }

    public final void n(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f24200f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        g6 g6Var = this.d;
        g6Var.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            g6Var.setSelection(g6Var.length());
        }
        g6Var.setHint(str);
        this.v = z10;
        setWillNotDraw(!z10);
    }

    public boolean o() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zp zpVar = this.f24202r;
        if (zpVar != null) {
            m(o(), false);
            zpVar.a(f(this), false);
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
            canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23478k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ah ahVar;
        ImageView imageView;
        g6 g6Var;
        int i12;
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        while (true) {
            int childCount = getChildCount();
            ahVar = this.f24206y;
            imageView = this.f24200f;
            g6Var = this.d;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt != g6Var) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else if (childAt == ahVar) {
                    ahVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    } else {
                        org.telegram.ui.ActionBar.b6 b6Var = this.f24201n;
                        if (childAt == b6Var) {
                            b6Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                        } else {
                            zp zpVar = this.f24202r;
                            if (childAt == zpVar) {
                                zpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
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
        } else if (this.f24201n == null) {
            i12 = 42;
        } else if (imageView == null) {
            i12 = 70;
        } else if (ahVar != null) {
            i12 = 144;
        } else {
            i12 = 122;
        }
        g6Var.measure(vh.x(i12, (size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = g6Var.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), g6Var.getMeasuredHeight()) + (this.v ? 1 : 0));
        org.telegram.ui.ActionBar.b6 b6Var2 = this.f24201n;
        if (b6Var2 != null && !this.f24205x) {
            if (measuredHeight >= AndroidUtilities.dp(52.0f)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            b6Var2.setAlpha(f7);
        }
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.f24198b.a(z10, true);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i10) {
        org.telegram.ui.ActionBar.u6 u6Var = this.f24199c;
        ImageView imageView = this.h;
        if (imageView != null) {
            org.telegram.ui.ActionBar.f7.t(imageView, i10, u6Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f24200f;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.f7.t(imageView2, i10, u6Var, PorterDuff.Mode.MULTIPLY);
        }
        ah ahVar = this.f24206y;
        if (ahVar != null) {
            org.telegram.ui.ActionBar.f7.t(ahVar, i10, u6Var, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z10) {
        this.f24203s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.b6 b6Var = this.f24201n;
        if (b6Var == null) {
            return;
        }
        b6Var.k(str);
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }

    public void setTextRight(int i10) {
        this.E = Integer.valueOf(i10);
    }

    public void i(boolean z10) {
    }

    public void j(h6 h6Var) {
    }

    public void k(g6 g6Var) {
    }

    public void g(g6 g6Var, ActionMode actionMode) {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
