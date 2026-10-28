package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.xi0;
public final class q3 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public int E;
    public CharSequence F;
    public int G;
    public float H;
    public final org.telegram.ui.ActionBar.u6 I;
    public boolean J;
    public int K;
    public int L;
    public final boolean f24821a;
    public final TextView f24822b;
    public final TextView f24823c;
    public final xi0 d;
    public final TextView e;
    public TLRPC.StickerSetCovered f24824f;
    public AnimatorSet h;
    public boolean f24825n;
    public boolean f24826r;
    public boolean f24827s;
    public boolean v;
    public final int f24828w;
    public final Paint f24829x;
    public int f24830y;

    public q3(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11) {
        super(context);
        ViewGroup.LayoutParams h;
        ViewGroup.LayoutParams h10;
        ViewGroup.LayoutParams h11;
        ViewGroup.LayoutParams h12;
        this.f24828w = UserConfig.selectedAccount;
        this.f24829x = new Paint(1);
        this.f24821a = z11;
        this.I = u6Var;
        TextView textView = new TextView(context);
        this.f24822b = textView;
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.Se, u6Var, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            h = kb1.m(-2.0f, -2.0f, 8388659, i10, 8.0f, 40.0f, 0.0f);
        } else {
            h = kb1.h(-2, -2.0f, 51, i10, 8.0f, 40.0f, 0.0f);
        }
        addView(textView, h);
        TextView textView2 = new TextView(context);
        this.f24823c = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.We, u6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        if (z10) {
            h10 = kb1.m(-2.0f, -2.0f, 8388659, i10, 30.0f, 100.0f, 0.0f);
        } else {
            h10 = kb1.h(-2, -2.0f, 51, i10, 30.0f, 100.0f, 0.0f);
        }
        addView(textView2, h10);
        if (z11) {
            xi0 xi0Var = new xi0(context);
            this.d = xi0Var;
            org.telegram.ui.ActionBar.f7.V(xi0Var, org.telegram.ui.ActionBar.y6.Sh, u6Var);
            xi0Var.setText(LocaleController.getString(R.string.Add));
            if (z10) {
                h11 = kb1.m(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                h11 = kb1.h(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(xi0Var, h11);
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setGravity(17);
            org.telegram.messenger.t.r(textView3, org.telegram.ui.ActionBar.y6.Rh, u6Var, 1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.StickersRemove));
            if (z10) {
                h12 = kb1.m(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                h12 = kb1.h(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(textView3, h12);
        }
        setWillNotDraw(false);
        updateColors();
    }

    public static void a(ArrayList arrayList, org.telegram.ui.ActionBar.g7 g7Var) {
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.f23598q6));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.We));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Th));
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f24821a) {
            this.d.a(z10, z11);
        }
    }

    public final void c(TLRPC.StickerSetCovered stickerSetCovered, boolean z10, boolean z11, int i10, int i11, boolean z12) {
        boolean z13;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        float f15 = 0.0f;
        if (this.f24824f != stickerSetCovered) {
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            this.H = f14;
            invalidate();
        }
        this.f24824f = stickerSetCovered;
        this.f24830y = i10;
        this.E = i11;
        TextView textView = this.f24822b;
        if (i11 != 0) {
            if (i11 != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f24824f.set.title);
                try {
                    p10 p10Var = new p10(org.telegram.ui.ActionBar.y6.f23598q6, this.I);
                    int i12 = this.f24830y;
                    spannableStringBuilder.setSpan(p10Var, i12, this.E + i12, 33);
                } catch (Exception unused) {
                }
                textView.setText(spannableStringBuilder);
            }
        } else {
            textView.setText(stickerSetCovered.set.title);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z14 = stickerSet.emojis;
        TextView textView2 = this.f24823c;
        if (z14) {
            textView2.setText(LocaleController.formatPluralString("EmojiCount", stickerSet.count, new Object[0]));
        } else {
            textView2.setText(LocaleController.formatPluralString("Stickers", stickerSet.count, new Object[0]));
        }
        this.v = z10;
        if (this.f24821a) {
            boolean z15 = this.f24827s;
            xi0 xi0Var = this.d;
            if (z15) {
                xi0Var.setVisibility(0);
                if (!z12 && !MediaDataController.getInstance(this.f24828w).isStickerPackInstalled(stickerSetCovered.set.f22055id)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f24826r = z13;
                TextView textView3 = this.e;
                if (z11) {
                    if (z13) {
                        textView3.setVisibility(0);
                    } else {
                        xi0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.h = animatorSet2;
                    animatorSet2.setDuration(250L);
                    AnimatorSet animatorSet3 = this.h;
                    if (this.f24826r) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    float[] fArr = {f7};
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView3, property, fArr);
                    if (this.f24826r) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    float[] fArr2 = {f10};
                    Property property2 = View.SCALE_X;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, fArr2);
                    if (this.f24826r) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    float[] fArr3 = {f11};
                    Property property3 = View.SCALE_Y;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView3, property3, fArr3);
                    if (this.f24826r) {
                        f12 = 0.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(xi0Var, property, f12);
                    if (this.f24826r) {
                        f13 = 0.0f;
                    } else {
                        f13 = 1.0f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(xi0Var, property2, f13);
                    if (!this.f24826r) {
                        f15 = 1.0f;
                    }
                    animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(xi0Var, property3, f15));
                    this.h.addListener(new o3(this));
                    this.h.setInterpolator(new OvershootInterpolator(1.02f));
                    this.h.start();
                    return;
                } else if (z13) {
                    textView3.setVisibility(0);
                    textView3.setAlpha(1.0f);
                    textView3.setScaleX(1.0f);
                    textView3.setScaleY(1.0f);
                    xi0Var.setVisibility(4);
                    xi0Var.setAlpha(0.0f);
                    xi0Var.setScaleX(0.0f);
                    xi0Var.setScaleY(0.0f);
                    return;
                } else {
                    xi0Var.setVisibility(0);
                    xi0Var.setAlpha(1.0f);
                    xi0Var.setScaleX(1.0f);
                    xi0Var.setScaleY(1.0f);
                    textView3.setVisibility(4);
                    textView3.setAlpha(0.0f);
                    textView3.setScaleX(0.0f);
                    textView3.setScaleY(0.0f);
                    return;
                }
            }
            xi0Var.setVisibility(8);
        }
    }

    public final void d(int i10, CharSequence charSequence) {
        this.F = charSequence;
        this.G = i10;
        org.telegram.ui.ActionBar.u6 u6Var = this.I;
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F);
            try {
                spannableStringBuilder.setSpan(new p10(org.telegram.ui.ActionBar.y6.f23598q6, u6Var), 0, this.G, 33);
                spannableStringBuilder.setSpan(new p10(org.telegram.ui.ActionBar.y6.We, u6Var), this.G, this.F.length(), 33);
            } catch (Exception unused) {
            }
            this.f24823c.setText(spannableStringBuilder);
        }
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f24824f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.v;
        org.telegram.ui.ActionBar.u6 u6Var = this.I;
        if (z10 || this.H != 0.0f) {
            if (z10) {
                float f7 = this.H;
                if (f7 != 1.0f) {
                    float f10 = f7 + 0.16f;
                    this.H = f10;
                    if (f10 > 1.0f) {
                        this.H = 1.0f;
                    } else {
                        invalidate();
                    }
                    int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Th, u6Var);
                    Paint paint = this.f24829x;
                    paint.setColor(w02);
                    canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.f24822b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.H, paint);
                }
            }
            if (!z10) {
                float f11 = this.H;
                if (f11 != 0.0f) {
                    float f12 = f11 - 0.16f;
                    this.H = f12;
                    if (f12 < 0.0f) {
                        this.H = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            int w022 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Th, u6Var);
            Paint paint2 = this.f24829x;
            paint2.setColor(w022);
            canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.f24822b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.H, paint2);
        }
        if (this.f24825n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.y6.V0("paintDivider", u6Var));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        if (this.f24821a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = ic.a.A(measuredWidth, measuredWidth2, 2, AndroidUtilities.dp(14.0f));
            } else {
                layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
            }
            measureChildWithMargins(this.f24822b, i10, measuredWidth, i11, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.f24821a) {
            this.f24827s = true;
            this.d.setOnClickListener(onClickListener);
            this.e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f24825n = z10;
    }

    @Override
    public final void updateColors() {
        xi0 xi0Var;
        if (this.f24821a && (xi0Var = this.d) != null) {
            int i10 = org.telegram.ui.ActionBar.y6.Nh;
            org.telegram.ui.ActionBar.u6 u6Var = this.I;
            xi0Var.setProgressColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var);
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Qh, u6Var);
            if (!this.J || this.K != w02 || this.L != w03) {
                this.J = true;
                this.K = w02;
                this.L = w03;
                xi0Var.setBackground(org.telegram.ui.ActionBar.o6.e(new float[]{14.0f}, w02));
            }
            xi0Var.invalidate();
        }
        TextView textView = this.f24822b;
        if (textView != null) {
            textView.invalidate();
        }
        TextView textView2 = this.f24823c;
        if (textView2 != null) {
            textView2.invalidate();
        }
    }
}
