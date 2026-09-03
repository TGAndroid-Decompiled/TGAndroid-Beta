package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.rl0;
public final class q3 extends FrameLayout {
    public int B;
    public CharSequence C;
    public int D;
    public float E;
    public final org.telegram.ui.ActionBar.f6 F;
    public final boolean f21685a;
    public final TextView f21686b;
    public final TextView f21687c;
    public final fi0 d;
    public final TextView e;
    public TLRPC.StickerSetCovered f21688f;
    public AnimatorSet h;
    public boolean f21689n;
    public boolean f21690r;
    public boolean f21691s;
    public boolean v;
    public final int f21692w;
    public final Paint f21693x;
    public int f21694y;

    public q3(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d10;
        ViewGroup.LayoutParams d11;
        ViewGroup.LayoutParams d12;
        this.f21692w = UserConfig.selectedAccount;
        this.f21693x = new Paint(1);
        this.f21685a = z10;
        this.F = f6Var;
        TextView textView = new TextView(context);
        this.f21686b = textView;
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.Se, f6Var, textView, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z4) {
            d = k7.b6.i(-2.0f, -2.0f, 8388659, i10, 8.0f, 40.0f, 0.0f);
        } else {
            d = k7.b6.d(-2, -2.0f, 51, i10, 8.0f, 40.0f, 0.0f);
        }
        addView(textView, d);
        TextView textView2 = new TextView(context);
        this.f21687c = textView2;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.We, f6Var, textView2, 1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        if (z4) {
            d10 = k7.b6.i(-2.0f, -2.0f, 8388659, i10, 30.0f, 100.0f, 0.0f);
        } else {
            d10 = k7.b6.d(-2, -2.0f, 51, i10, 30.0f, 100.0f, 0.0f);
        }
        addView(textView2, d10);
        if (z10) {
            fi0 fi0Var = new fi0(context);
            this.d = fi0Var;
            fi0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
            fi0Var.setText(LocaleController.getString(R.string.Add));
            if (z4) {
                d11 = k7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d11 = k7.b6.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(fi0Var, d11);
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setGravity(17);
            org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.Rh, f6Var, textView3, 1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.StickersRemove));
            if (z4) {
                d12 = k7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d12 = k7.b6.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(textView3, d12);
        }
        setWillNotDraw(false);
        d();
    }

    public static void a(ArrayList arrayList, rl0 rl0Var, org.telegram.ui.ActionBar.k6 k6Var) {
        arrayList.add(new org.telegram.ui.ActionBar.l6(rl0Var, 4, new Class[]{q3.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Se));
        int i10 = org.telegram.ui.ActionBar.j6.We;
        arrayList.add(new org.telegram.ui.ActionBar.l6(rl0Var, 4, new Class[]{q3.class}, new String[]{"infoTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rl0Var, 4, new Class[]{q3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rl0Var, 4, new Class[]{q3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rl0Var, 0, new Class[]{q3.class}, null, null, null, org.telegram.ui.ActionBar.j6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rl0Var, 0, new Class[]{q3.class}, org.telegram.ui.ActionBar.j6.f20000k0, null, null, org.telegram.ui.ActionBar.j6.f19882d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.f20115q6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, i10));
    }

    public final void b(boolean z4, boolean z10) {
        if (this.f21685a) {
            this.d.a(z4, z10);
        }
    }

    public final void c(TLRPC.StickerSetCovered stickerSetCovered, boolean z4, boolean z10, int i10, int i11, boolean z11) {
        boolean z12;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        float f16 = 0.0f;
        if (this.f21688f != stickerSetCovered) {
            if (z4) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            this.E = f15;
            invalidate();
        }
        this.f21688f = stickerSetCovered;
        this.f21694y = i10;
        this.B = i11;
        if (i11 != 0) {
            e();
        } else {
            this.f21686b.setText(stickerSetCovered.set.title);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z13 = stickerSet.emojis;
        TextView textView = this.f21687c;
        if (z13) {
            textView.setText(LocaleController.formatPluralString("EmojiCount", stickerSet.count, new Object[0]));
        } else {
            textView.setText(LocaleController.formatPluralString("Stickers", stickerSet.count, new Object[0]));
        }
        this.v = z4;
        if (this.f21685a) {
            boolean z14 = this.f21691s;
            fi0 fi0Var = this.d;
            if (z14) {
                fi0Var.setVisibility(0);
                if (!z11 && !MediaDataController.getInstance(this.f21692w).isStickerPackInstalled(stickerSetCovered.set.f19186id)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                this.f21690r = z12;
                TextView textView2 = this.e;
                if (z10) {
                    if (z12) {
                        textView2.setVisibility(0);
                    } else {
                        fi0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.h = animatorSet2;
                    animatorSet2.setDuration(250L);
                    AnimatorSet animatorSet3 = this.h;
                    if (this.f21690r) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    float[] fArr = {f10};
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, fArr);
                    if (this.f21690r) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    float[] fArr2 = {f11};
                    Property property2 = View.SCALE_X;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, property2, fArr2);
                    if (this.f21690r) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    float[] fArr3 = {f12};
                    Property property3 = View.SCALE_Y;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView2, property3, fArr3);
                    if (this.f21690r) {
                        f13 = 0.0f;
                    } else {
                        f13 = 1.0f;
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(fi0Var, property, f13);
                    if (this.f21690r) {
                        f14 = 0.0f;
                    } else {
                        f14 = 1.0f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(fi0Var, property2, f14);
                    if (!this.f21690r) {
                        f16 = 1.0f;
                    }
                    animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(fi0Var, property3, f16));
                    this.h.addListener(new p3(this));
                    this.h.setInterpolator(new OvershootInterpolator(1.02f));
                    this.h.start();
                    return;
                } else if (z12) {
                    textView2.setVisibility(0);
                    textView2.setAlpha(1.0f);
                    textView2.setScaleX(1.0f);
                    textView2.setScaleY(1.0f);
                    fi0Var.setVisibility(4);
                    fi0Var.setAlpha(0.0f);
                    fi0Var.setScaleX(0.0f);
                    fi0Var.setScaleY(0.0f);
                    return;
                } else {
                    fi0Var.setVisibility(0);
                    fi0Var.setAlpha(1.0f);
                    fi0Var.setScaleX(1.0f);
                    fi0Var.setScaleY(1.0f);
                    textView2.setVisibility(4);
                    textView2.setAlpha(0.0f);
                    textView2.setScaleX(0.0f);
                    textView2.setScaleY(0.0f);
                    return;
                }
            }
            fi0Var.setVisibility(8);
        }
    }

    public final void d() {
        if (this.f21685a) {
            int i10 = org.telegram.ui.ActionBar.j6.Nh;
            org.telegram.ui.ActionBar.f6 f6Var = this.F;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
            fi0 fi0Var = this.d;
            fi0Var.setProgressColor(v02);
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
            org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Qh, f6Var);
            fi0Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{14.0f}, v03));
        }
        e();
        f();
    }

    public final void e() {
        if (this.B != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f21688f.set.title);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20115q6, this.F));
                int i10 = this.f21694y;
                spannableStringBuilder.setSpan(foregroundColorSpan, i10, this.B + i10, 33);
            } catch (Exception unused) {
            }
            this.f21686b.setText(spannableStringBuilder);
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.f6 f6Var = this.F;
        if (this.C != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.C);
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20115q6, f6Var)), 0, this.D, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.We, f6Var)), this.D, this.C.length(), 33);
            } catch (Exception unused) {
            }
            this.f21687c.setText(spannableStringBuilder);
        }
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f21688f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z4 = this.v;
        org.telegram.ui.ActionBar.f6 f6Var = this.F;
        if (z4 || this.E != 0.0f) {
            if (z4) {
                float f10 = this.E;
                if (f10 != 1.0f) {
                    float f11 = f10 + 0.16f;
                    this.E = f11;
                    if (f11 > 1.0f) {
                        this.E = 1.0f;
                    } else {
                        invalidate();
                    }
                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Th, f6Var);
                    Paint paint = this.f21693x;
                    paint.setColor(v02);
                    canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.f21686b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.E, paint);
                }
            }
            if (!z4) {
                float f12 = this.E;
                if (f12 != 0.0f) {
                    float f13 = f12 - 0.16f;
                    this.E = f13;
                    if (f13 < 0.0f) {
                        this.E = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            int v022 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Th, f6Var);
            Paint paint2 = this.f21693x;
            paint2.setColor(v022);
            canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.f21686b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.E, paint2);
        }
        if (this.f21689n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        if (this.f21685a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = kf.k0.d(measuredWidth, measuredWidth2, 2, AndroidUtilities.dp(14.0f));
            } else {
                layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
            }
            measureChildWithMargins(this.f21686b, i10, measuredWidth, i11, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.f21685a) {
            this.f21691s = true;
            this.d.setOnClickListener(onClickListener);
            this.e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z4) {
        this.f21689n = z4;
    }
}
