package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class oa extends FrameLayout {
    public float B;
    public ValueAnimator C;
    public boolean D;
    public boolean E;
    public final org.telegram.ui.Components.z5 F;
    public boolean f36698a;
    public final org.telegram.ui.ActionBar.f6 f36699b;
    public final org.telegram.ui.ActionBar.k5 f36700c;
    public final ImageView d;
    public final org.telegram.ui.Components.qp e;
    public final org.telegram.ui.Components.k6 f36701f;
    public final Drawable[] h;
    public float f36702n;
    public boolean f36703r;
    public ValueAnimator f36704s;
    public TLRPC.TL_username v;
    public boolean f36705w;
    public long f36706x;
    public final org.telegram.ui.Components.z5 f36707y;

    public oa(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f36698a = false;
        this.f36707y = new org.telegram.ui.Components.z5(this, 300L, org.telegram.ui.Components.mr.f27122f);
        this.F = new org.telegram.ui.Components.z5(this, 400L, org.telegram.ui.Components.mr.h);
        this.f36699b = f6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, f6Var));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
        this.f36700c = k5Var;
        k5Var.setTextSize(16);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        k5Var.setEllipsizeByGradient(true);
        addView(k5Var, k7.b6.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.qp qpVar = new org.telegram.ui.Components.qp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(1.35f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20060n6, f6Var));
        this.e = qpVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(qpVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        qpVar.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        addView(imageView, k7.b6.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(getContext(), false, true, true);
        this.f36701f = k6Var;
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20273z6, f6Var));
        k6Var.b(0.4f, 120L, org.telegram.ui.Components.mr.f27123g);
        k6Var.setTextSize(AndroidUtilities.dp(13.0f));
        addView(k6Var, k7.b6.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        ra.E.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        ra.F.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.V8, f6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z4, boolean z10, long j10) {
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        this.v = tL_username;
        this.f36705w = z4;
        this.f36706x = j10;
        invalidate();
        if (this.v == null) {
            this.D = false;
            this.E = false;
            return;
        }
        this.D = tL_username.active;
        if (j10 == 0 && tL_username.editable) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.E = z11;
        b(tL_username.username);
        boolean z13 = this.f36698a;
        org.telegram.ui.Components.k6 k6Var = this.f36701f;
        if (z13) {
            if (this.E) {
                i11 = R.string.UsernameProfileLinkEditable;
            } else if (this.D) {
                i11 = R.string.UsernameProfileLinkActive;
            } else {
                i11 = R.string.UsernameProfileLinkInactive;
            }
            k6Var.c(LocaleController.getString(i11), z10, !this.D);
        } else {
            if (this.E) {
                i10 = R.string.UsernameLinkEditable;
            } else if (this.D) {
                i10 = R.string.UsernameLinkActive;
            } else {
                i10 = R.string.UsernameLinkInactive;
            }
            k6Var.c(LocaleController.getString(i10), z10, !this.D);
        }
        if (!this.D && !this.E) {
            z12 = false;
        } else {
            z12 = true;
        }
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.C = null;
        }
        float f10 = 0.0f;
        if (z10) {
            float f11 = this.B;
            if (z12) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new na(this, 1));
            this.C.setDuration(120L);
            this.C.setInterpolator(org.telegram.ui.Components.mr.f27123g);
            this.C.start();
            return;
        }
        if (z12) {
            f10 = 1.0f;
        }
        this.B = f10;
        int i12 = org.telegram.ui.ActionBar.j6.f20273z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f36699b;
        int d = i0.a.d(this.B, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20060n6, f6Var));
        this.e.b(d);
        k6Var.setTextColor(d);
    }

    public final void b(String str) {
        if (this.E) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.k5 k5Var = this.f36700c;
        if (isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.UsernameLinkPlaceholder));
            spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, this.f36699b)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            k5Var.l(spannableStringBuilder, false);
            return;
        }
        k5Var.l("@" + str, false);
    }

    public String getUsernameEditable() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        super.onDraw(canvas);
        if (this.D) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.F.d(f10, false);
        Drawable[] drawableArr = this.h;
        if (d < 1.0f) {
            f11 = 255.0f;
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f), ra.F);
            drawableArr[1].setAlpha((int) ((1.0f - d) * 255.0f));
            f12 = 0.0f;
            drawableArr[1].setBounds(b.u(2, AndroidUtilities.dp(35.0f), drawableArr[1]), b.f(2, AndroidUtilities.dp(29.0f), drawableArr[1]), b.A(2, AndroidUtilities.dp(35.0f), drawableArr[1]), b.y(2, AndroidUtilities.dp(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f11 = 255.0f;
            f12 = 0.0f;
        }
        if (d > f12) {
            Paint paint = ra.E;
            int i10 = (int) (d * f11);
            paint.setAlpha(i10);
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f) * d, paint);
            drawableArr[0].setAlpha(i10);
            drawableArr[0].setBounds(b.u(2, AndroidUtilities.dp(35.0f), drawableArr[0]), b.f(2, AndroidUtilities.dp(29.0f), drawableArr[0]), b.A(2, AndroidUtilities.dp(35.0f), drawableArr[0]), b.y(2, AndroidUtilities.dp(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        if (this.f36705w) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        float d10 = this.f36707y.d(f13, false);
        if (d10 > f12) {
            int alpha = org.telegram.ui.ActionBar.j6.f20000k0.getAlpha();
            org.telegram.ui.ActionBar.j6.f20000k0.setAlpha((int) (alpha * d10));
            canvas.drawRect(AndroidUtilities.dp(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.j6.f20000k0);
            org.telegram.ui.ActionBar.j6.f20000k0.setAlpha(alpha);
        }
        Paint paint2 = ra.G;
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Uh, false));
        paint2.setAlpha((int) (paint2.getAlpha() * d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getWidth() - AndroidUtilities.dp(37.0f), AndroidUtilities.dp(25.0f), getWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(27.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(0.3f), AndroidUtilities.dp(0.3f), paint2);
        rectF.set(getWidth() - AndroidUtilities.dp(37.0f), AndroidUtilities.dp(31.0f), getWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(33.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(0.3f), AndroidUtilities.dp(0.3f), paint2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }

    public void setLoading(boolean z4) {
        float f10;
        if (this.f36703r != z4) {
            this.f36703r = z4;
            ValueAnimator valueAnimator = this.f36704s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.d.setVisibility(0);
            float f11 = this.f36702n;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f36704s = ofFloat;
            ofFloat.addUpdateListener(new na(this, 0));
            this.f36704s.addListener(new dg.w2(18, this, z4));
            this.f36704s.setInterpolator(org.telegram.ui.Components.mr.f27123g);
            this.f36704s.setDuration(200L);
            this.f36704s.start();
        }
    }
}
