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
public abstract class pa extends FrameLayout {
    public float E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public final org.telegram.ui.Components.e6 I;
    public boolean f39429a;
    public final org.telegram.ui.ActionBar.d6 f39430b;
    public final org.telegram.ui.ActionBar.i5 f39431c;
    public final ImageView d;
    public final org.telegram.ui.Components.wp f39432e;
    public final org.telegram.ui.Components.p6 f39433f;
    public final Drawable[] h;
    public float f39434n;
    public boolean f39435r;
    public ValueAnimator f39436s;
    public TLRPC.TL_username v;
    public boolean f39437w;
    public long f39438x;
    public final org.telegram.ui.Components.e6 f39439y;

    public pa(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f39429a = false;
        this.f39439y = new org.telegram.ui.Components.e6(this, 300L, org.telegram.ui.Components.tr.f31215f);
        this.I = new org.telegram.ui.Components.e6(this, 400L, org.telegram.ui.Components.tr.h);
        this.f39430b = d6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20827d6, d6Var));
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(getContext());
        this.f39431c = i5Var;
        i5Var.setTextSize(16);
        i5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var));
        i5Var.setEllipsizeByGradient(true);
        addView(i5Var, w7.z5.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(1.35f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21013n6, d6Var));
        this.f39432e = wpVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(wpVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        wpVar.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        addView(imageView, w7.z5.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(getContext(), false, true, true);
        this.f39433f = p6Var;
        p6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21233z6, d6Var));
        p6Var.b(0.4f, 120L, org.telegram.ui.Components.tr.f31216g);
        p6Var.setTextSize(AndroidUtilities.dp(13.0f));
        addView(p6Var, w7.z5.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        sa.H.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, d6Var));
        sa.I.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.V8, d6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z10, boolean z11, long j3) {
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        this.v = tL_username;
        this.f39437w = z10;
        this.f39438x = j3;
        invalidate();
        if (this.v == null) {
            this.G = false;
            this.H = false;
            return;
        }
        this.G = tL_username.active;
        if (j3 == 0 && tL_username.editable) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.H = z12;
        b(tL_username.username);
        boolean z14 = this.f39429a;
        org.telegram.ui.Components.p6 p6Var = this.f39433f;
        if (z14) {
            if (this.H) {
                i11 = R.string.UsernameProfileLinkEditable;
            } else if (this.G) {
                i11 = R.string.UsernameProfileLinkActive;
            } else {
                i11 = R.string.UsernameProfileLinkInactive;
            }
            p6Var.c(LocaleController.getString(i11), z11, !this.G);
        } else {
            if (this.H) {
                i10 = R.string.UsernameLinkEditable;
            } else if (this.G) {
                i10 = R.string.UsernameLinkActive;
            } else {
                i10 = R.string.UsernameLinkInactive;
            }
            p6Var.c(LocaleController.getString(i10), z11, !this.G);
        }
        if (!this.G && !this.H) {
            z13 = false;
        } else {
            z13 = true;
        }
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.E;
            if (z13) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new oa(this, 1));
            this.F.setDuration(120L);
            this.F.setInterpolator(org.telegram.ui.Components.tr.f31216g);
            this.F.start();
            return;
        }
        if (z13) {
            f7 = 1.0f;
        }
        this.E = f7;
        int i12 = org.telegram.ui.ActionBar.i6.f21233z6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f39430b;
        int d = i0.a.d(this.E, org.telegram.ui.ActionBar.i6.v0(i12, d6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21013n6, d6Var));
        this.f39432e.b(d);
        p6Var.setTextColor(d);
    }

    public final void b(String str) {
        if (this.H) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.i5 i5Var = this.f39431c;
        if (isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.UsernameLinkPlaceholder));
            spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.H6, this.f39430b)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            i5Var.l(spannableStringBuilder, false);
            return;
        }
        i5Var.l("@" + str, false);
    }

    public String getUsernameEditable() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        if (this.G) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.I.d(f7, false);
        Drawable[] drawableArr = this.h;
        if (d < 1.0f) {
            f10 = 255.0f;
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f), sa.I);
            drawableArr[1].setAlpha((int) ((1.0f - d) * 255.0f));
            f11 = 0.0f;
            drawableArr[1].setBounds(org.telegram.ui.Cells.c1.t(2, AndroidUtilities.dp(35.0f), drawableArr[1]), org.telegram.ui.Cells.c1.e(2, AndroidUtilities.dp(29.0f), drawableArr[1]), org.telegram.ui.Cells.c1.x(2, AndroidUtilities.dp(35.0f), drawableArr[1]), org.telegram.ui.Cells.c1.w(2, AndroidUtilities.dp(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (d > f11) {
            Paint paint = sa.H;
            int i10 = (int) (d * f10);
            paint.setAlpha(i10);
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f) * d, paint);
            drawableArr[0].setAlpha(i10);
            drawableArr[0].setBounds(org.telegram.ui.Cells.c1.t(2, AndroidUtilities.dp(35.0f), drawableArr[0]), org.telegram.ui.Cells.c1.e(2, AndroidUtilities.dp(29.0f), drawableArr[0]), org.telegram.ui.Cells.c1.x(2, AndroidUtilities.dp(35.0f), drawableArr[0]), org.telegram.ui.Cells.c1.w(2, AndroidUtilities.dp(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        if (this.f39437w) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float d10 = this.f39439y.d(f12, false);
        if (d10 > f11) {
            int alpha = org.telegram.ui.ActionBar.i6.f20950k0.getAlpha();
            org.telegram.ui.ActionBar.i6.f20950k0.setAlpha((int) (alpha * d10));
            canvas.drawRect(AndroidUtilities.dp(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.i6.f20950k0);
            org.telegram.ui.ActionBar.i6.f20950k0.setAlpha(alpha);
        }
        Paint paint2 = sa.J;
        paint2.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Uh, false));
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

    public void setLoading(boolean z10) {
        float f7;
        if (this.f39435r != z10) {
            this.f39435r = z10;
            ValueAnimator valueAnimator = this.f39436s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.d.setVisibility(0);
            float f10 = this.f39434n;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f39436s = ofFloat;
            ofFloat.addUpdateListener(new oa(this, 0));
            this.f39436s.addListener(new ai.n(26, this, z10));
            this.f39436s.setInterpolator(org.telegram.ui.Components.tr.f31216g);
            this.f39436s.setDuration(200L);
            this.f39436s.start();
        }
    }
}
