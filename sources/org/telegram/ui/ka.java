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

public abstract class ka extends FrameLayout {
    public float A;
    public ValueAnimator B;
    public boolean C;
    public boolean D;
    public final org.telegram.ui.Components.y5 E;

    public boolean f39669a;

    public final org.telegram.ui.ActionBar.c6 f39670b;

    public final org.telegram.ui.ActionBar.h5 f39671c;
    public final ImageView d;

    public final org.telegram.ui.Components.hp f39672e;

    public final org.telegram.ui.Components.j6 f39673f;
    public final Drawable[] h;

    public float f39674n;

    public boolean f39675r;

    public ValueAnimator f39676s;
    public TLRPC.TL_username v;

    public boolean f39677w;

    public long f39678x;

    public final org.telegram.ui.Components.y5 f39679y;

    public ka(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f39669a = false;
        this.f39679y = new org.telegram.ui.Components.y5(this, 300L, org.telegram.ui.Components.er.f28122f);
        this.E = new org.telegram.ui.Components.y5(this, 400L, org.telegram.ui.Components.er.h);
        this.f39670b = c6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.f39671c = h5Var;
        h5Var.setTextSize(16);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        h5Var.setEllipsizeByGradient(true);
        addView(h5Var, h7.z5.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(1.35f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23234n6, c6Var));
        this.f39672e = hpVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(hpVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        hpVar.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        addView(imageView, h7.z5.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getContext(), false, true, true);
        this.f39673f = j6Var;
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, c6Var));
        j6Var.b(0.4f, 120L, org.telegram.ui.Components.er.f28123g);
        j6Var.setTextSize(AndroidUtilities.dp(13.0f));
        addView(j6Var, h7.z5.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        na.D.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
        na.E.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.V8, c6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z10, boolean z11, long j10) {
        int i10;
        int i11;
        this.v = tL_username;
        this.f39677w = z10;
        this.f39678x = j10;
        invalidate();
        if (this.v == null) {
            this.C = false;
            this.D = false;
            return;
        }
        this.C = tL_username.active;
        int i12 = 1;
        this.D = j10 == 0 && tL_username.editable;
        b(tL_username.username);
        boolean z12 = this.f39669a;
        org.telegram.ui.Components.j6 j6Var = this.f39673f;
        if (z12) {
            if (this.D) {
                i11 = R.string.UsernameProfileLinkEditable;
            } else {
                i11 = this.C ? R.string.UsernameProfileLinkActive : R.string.UsernameProfileLinkInactive;
            }
            j6Var.c(LocaleController.getString(i11), z11, !this.C);
        } else {
            if (this.D) {
                i10 = R.string.UsernameLinkEditable;
            } else {
                i10 = this.C ? R.string.UsernameLinkActive : R.string.UsernameLinkInactive;
            }
            j6Var.c(LocaleController.getString(i10), z11, !this.C);
        }
        boolean z13 = this.C || this.D;
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B = null;
        }
        if (z11) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.A, z13 ? 1.0f : 0.0f);
            this.B = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ja(this, i12));
            this.B.setDuration(120L);
            this.B.setInterpolator(org.telegram.ui.Components.er.f28123g);
            this.B.start();
            return;
        }
        this.A = z13 ? 1.0f : 0.0f;
        int i13 = org.telegram.ui.ActionBar.g6.f23441z6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f39670b;
        int iD = i0.b.d(this.A, org.telegram.ui.ActionBar.g6.v0(i13, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23234n6, c6Var));
        this.f39672e.b(iD);
        j6Var.setTextColor(iD);
    }

    public final void b(String str) {
        if (this.D) {
            str = getUsernameEditable();
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.h5 h5Var = this.f39671c;
        if (!zIsEmpty) {
            h5Var.l("@" + str, false);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.UsernameLinkPlaceholder));
            spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, this.f39670b)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            h5Var.l(spannableStringBuilder, false);
        }
    }

    public String getUsernameEditable() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        super.onDraw(canvas);
        float fD = this.E.d(this.C ? 1.0f : 0.0f, false);
        Drawable[] drawableArr = this.h;
        if (fD < 1.0f) {
            f10 = 255.0f;
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f), na.E);
            drawableArr[1].setAlpha((int) ((1.0f - fD) * 255.0f));
            f11 = 0.0f;
            drawableArr[1].setBounds(org.telegram.messenger.rl.v(2, AndroidUtilities.dp(35.0f), drawableArr[1]), org.telegram.messenger.rl.e(2, AndroidUtilities.dp(29.0f), drawableArr[1]), org.telegram.messenger.rl.A(2, AndroidUtilities.dp(35.0f), drawableArr[1]), org.telegram.messenger.rl.y(2, AndroidUtilities.dp(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (fD > f11) {
            Paint paint = na.D;
            int i10 = (int) (fD * f10);
            paint.setAlpha(i10);
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f) * fD, paint);
            drawableArr[0].setAlpha(i10);
            drawableArr[0].setBounds(org.telegram.messenger.rl.v(2, AndroidUtilities.dp(35.0f), drawableArr[0]), org.telegram.messenger.rl.e(2, AndroidUtilities.dp(29.0f), drawableArr[0]), org.telegram.messenger.rl.A(2, AndroidUtilities.dp(35.0f), drawableArr[0]), org.telegram.messenger.rl.y(2, AndroidUtilities.dp(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        float fD2 = this.f39679y.d(this.f39677w ? 1.0f : 0.0f, false);
        if (fD2 > f11) {
            int alpha = org.telegram.ui.ActionBar.g6.f23175k0.getAlpha();
            org.telegram.ui.ActionBar.g6.f23175k0.setAlpha((int) (alpha * fD2));
            canvas.drawRect(AndroidUtilities.dp(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.g6.f23175k0);
            org.telegram.ui.ActionBar.g6.f23175k0.setAlpha(alpha);
        }
        Paint paint2 = na.F;
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Uh, false));
        paint2.setAlpha((int) (paint2.getAlpha() * fD));
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
        if (this.f39675r != z10) {
            this.f39675r = z10;
            ValueAnimator valueAnimator = this.f39676s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i10 = 0;
            this.d.setVisibility(0);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f39674n, z10 ? 1.0f : 0.0f);
            this.f39676s = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ja(this, i10));
            this.f39676s.addListener(new ag.x(27, this, z10));
            this.f39676s.setInterpolator(org.telegram.ui.Components.er.f28123g);
            this.f39676s.setDuration(200L);
            this.f39676s.start();
        }
    }
}
