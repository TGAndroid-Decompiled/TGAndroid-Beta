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
public abstract class ia extends FrameLayout {
    public float A;
    public ValueAnimator B;
    public boolean C;
    public boolean D;
    public final org.telegram.ui.Components.d6 E;
    public boolean f39171a;
    public final org.telegram.ui.ActionBar.c6 f39172b;
    public final org.telegram.ui.ActionBar.h5 f39173c;
    public final ImageView d;
    public final org.telegram.ui.Components.np f39174e;
    public final org.telegram.ui.Components.o6 f39175f;
    public final Drawable[] h;
    public float f39176n;
    public boolean f39177r;
    public ValueAnimator f39178s;
    public TLRPC.TL_username v;
    public boolean f39179w;
    public long f39180x;
    public final org.telegram.ui.Components.d6 f39181y;

    public ia(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f39171a = false;
        this.f39181y = new org.telegram.ui.Components.d6(this, 300L, org.telegram.ui.Components.jr.f29800f);
        this.E = new org.telegram.ui.Components.d6(this, 400L, org.telegram.ui.Components.jr.h);
        this.f39172b = c6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.f39173c = h5Var;
        h5Var.setTextSize(16);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        h5Var.setEllipsizeByGradient(true);
        addView(h5Var, i7.f6.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.np npVar = new org.telegram.ui.Components.np(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(1.35f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23241n6, c6Var));
        this.f39174e = npVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(npVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        npVar.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        addView(imageView, i7.f6.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getContext(), false, true, true);
        this.f39175f = o6Var;
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, c6Var));
        o6Var.b(0.4f, 120L, org.telegram.ui.Components.jr.f29801g);
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        addView(o6Var, i7.f6.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        la.D.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
        la.E.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.V8, c6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z10, boolean z11, long j10) {
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        this.v = tL_username;
        this.f39179w = z10;
        this.f39180x = j10;
        invalidate();
        if (this.v == null) {
            this.C = false;
            this.D = false;
            return;
        }
        this.C = tL_username.active;
        if (j10 == 0 && tL_username.editable) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.D = z12;
        b(tL_username.username);
        boolean z14 = this.f39171a;
        org.telegram.ui.Components.o6 o6Var = this.f39175f;
        if (z14) {
            if (this.D) {
                i11 = R.string.UsernameProfileLinkEditable;
            } else if (this.C) {
                i11 = R.string.UsernameProfileLinkActive;
            } else {
                i11 = R.string.UsernameProfileLinkInactive;
            }
            o6Var.c(LocaleController.getString(i11), z11, !this.C);
        } else {
            if (this.D) {
                i10 = R.string.UsernameLinkEditable;
            } else if (this.C) {
                i10 = R.string.UsernameLinkActive;
            } else {
                i10 = R.string.UsernameLinkInactive;
            }
            o6Var.c(LocaleController.getString(i10), z11, !this.C);
        }
        if (!this.C && !this.D) {
            z13 = false;
        } else {
            z13 = true;
        }
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B = null;
        }
        float f9 = 0.0f;
        if (z11) {
            float f10 = this.A;
            if (z13) {
                f9 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new ha(this, 1));
            this.B.setDuration(120L);
            this.B.setInterpolator(org.telegram.ui.Components.jr.f29801g);
            this.B.start();
            return;
        }
        if (z13) {
            f9 = 1.0f;
        }
        this.A = f9;
        int i12 = org.telegram.ui.ActionBar.g6.f23450z6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f39172b;
        int d = i0.a.d(this.A, org.telegram.ui.ActionBar.g6.v0(i12, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23241n6, c6Var));
        this.f39174e.b(d);
        o6Var.setTextColor(d);
    }

    public final void b(String str) {
        if (this.D) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.h5 h5Var = this.f39173c;
        if (isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.UsernameLinkPlaceholder));
            spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, this.f39172b)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            h5Var.l(spannableStringBuilder, false);
            return;
        }
        h5Var.l("@" + str, false);
    }

    public String getUsernameEditable() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        if (this.C) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        float d = this.E.d(f9, false);
        Drawable[] drawableArr = this.h;
        if (d < 1.0f) {
            f10 = 255.0f;
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f), la.E);
            drawableArr[1].setAlpha((int) ((1.0f - d) * 255.0f));
            f11 = 0.0f;
            drawableArr[1].setBounds(b.v(2, AndroidUtilities.dp(35.0f), drawableArr[1]), b.f(2, AndroidUtilities.dp(29.0f), drawableArr[1]), b.A(2, AndroidUtilities.dp(35.0f), drawableArr[1]), b.y(2, AndroidUtilities.dp(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (d > f11) {
            Paint paint = la.D;
            int i10 = (int) (d * f10);
            paint.setAlpha(i10);
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f) * d, paint);
            drawableArr[0].setAlpha(i10);
            drawableArr[0].setBounds(b.v(2, AndroidUtilities.dp(35.0f), drawableArr[0]), b.f(2, AndroidUtilities.dp(29.0f), drawableArr[0]), b.A(2, AndroidUtilities.dp(35.0f), drawableArr[0]), b.y(2, AndroidUtilities.dp(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        if (this.f39179w) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float d10 = this.f39181y.d(f12, false);
        if (d10 > f11) {
            int alpha = org.telegram.ui.ActionBar.g6.f23183k0.getAlpha();
            org.telegram.ui.ActionBar.g6.f23183k0.setAlpha((int) (alpha * d10));
            canvas.drawRect(AndroidUtilities.dp(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.g6.f23183k0);
            org.telegram.ui.ActionBar.g6.f23183k0.setAlpha(alpha);
        }
        Paint paint2 = la.F;
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Uh, false));
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
        float f9;
        if (this.f39177r != z10) {
            this.f39177r = z10;
            ValueAnimator valueAnimator = this.f39178s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.d.setVisibility(0);
            float f10 = this.f39176n;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.f39178s = ofFloat;
            ofFloat.addUpdateListener(new ha(this, 0));
            this.f39178s.addListener(new bg.z2(26, this, z10));
            this.f39178s.setInterpolator(org.telegram.ui.Components.jr.f29801g);
            this.f39178s.setDuration(200L);
            this.f39178s.start();
        }
    }
}
