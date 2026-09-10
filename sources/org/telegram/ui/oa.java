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
    public float E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public final org.telegram.ui.Components.d6 I;
    public boolean f35435a;
    public final org.telegram.ui.ActionBar.f6 f35436b;
    public final org.telegram.ui.ActionBar.l5 f35437c;
    public final ImageView d;
    public final org.telegram.ui.Components.zp e;
    public final org.telegram.ui.Components.o6 f35438f;
    public final Drawable[] h;
    public float f35439n;
    public boolean f35440r;
    public ValueAnimator f35441s;
    public TLRPC.TL_username v;
    public boolean f35442w;
    public long f35443x;
    public final org.telegram.ui.Components.d6 f35444y;

    public oa(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f35435a = false;
        this.f35444y = new org.telegram.ui.Components.d6(this, 300L, org.telegram.ui.Components.wr.f28819f);
        this.I = new org.telegram.ui.Components.d6(this, 400L, org.telegram.ui.Components.wr.h);
        this.f35436b = f6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
        this.f35437c = l5Var;
        l5Var.setTextSize(16);
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        l5Var.setEllipsizeByGradient(true);
        addView(l5Var, w7.a6.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.zp zpVar = new org.telegram.ui.Components.zp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(1.35f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18110n6, f6Var));
        this.e = zpVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(zpVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        zpVar.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        addView(imageView, w7.a6.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getContext(), false, true, true);
        this.f35438f = o6Var;
        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18325z6, f6Var));
        o6Var.b(0.4f, 120L, org.telegram.ui.Components.wr.f28820g);
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        addView(o6Var, w7.a6.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        ra.H.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        ra.I.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.V8, f6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z10, boolean z11, long j3) {
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        this.v = tL_username;
        this.f35442w = z10;
        this.f35443x = j3;
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
        boolean z14 = this.f35435a;
        org.telegram.ui.Components.o6 o6Var = this.f35438f;
        if (z14) {
            if (this.H) {
                i11 = R.string.UsernameProfileLinkEditable;
            } else if (this.G) {
                i11 = R.string.UsernameProfileLinkActive;
            } else {
                i11 = R.string.UsernameProfileLinkInactive;
            }
            o6Var.c(LocaleController.getString(i11), z11, !this.G);
        } else {
            if (this.H) {
                i10 = R.string.UsernameLinkEditable;
            } else if (this.G) {
                i10 = R.string.UsernameLinkActive;
            } else {
                i10 = R.string.UsernameLinkInactive;
            }
            o6Var.c(LocaleController.getString(i10), z11, !this.G);
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
            ofFloat.addUpdateListener(new na(this, 1));
            this.F.setDuration(120L);
            this.F.setInterpolator(org.telegram.ui.Components.wr.f28820g);
            this.F.start();
            return;
        }
        if (z13) {
            f7 = 1.0f;
        }
        this.E = f7;
        int i12 = org.telegram.ui.ActionBar.j6.f18325z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f35436b;
        int d = i0.a.d(this.E, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18110n6, f6Var));
        this.e.b(d);
        o6Var.setTextColor(d);
    }

    public final void b(String str) {
        if (this.H) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.l5 l5Var = this.f35437c;
        if (isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.UsernameLinkPlaceholder));
            spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, this.f35436b)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            l5Var.l(spannableStringBuilder, false);
            return;
        }
        l5Var.l("@" + str, false);
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
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f), ra.I);
            drawableArr[1].setAlpha((int) ((1.0f - d) * 255.0f));
            f11 = 0.0f;
            drawableArr[1].setBounds(org.telegram.messenger.em.w(2, AndroidUtilities.dp(35.0f), drawableArr[1]), org.telegram.messenger.em.e(2, AndroidUtilities.dp(29.0f), drawableArr[1]), org.telegram.messenger.em.B(2, AndroidUtilities.dp(35.0f), drawableArr[1]), org.telegram.messenger.em.z(2, AndroidUtilities.dp(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (d > f11) {
            Paint paint = ra.H;
            int i10 = (int) (d * f10);
            paint.setAlpha(i10);
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f) * d, paint);
            drawableArr[0].setAlpha(i10);
            drawableArr[0].setBounds(org.telegram.messenger.em.w(2, AndroidUtilities.dp(35.0f), drawableArr[0]), org.telegram.messenger.em.e(2, AndroidUtilities.dp(29.0f), drawableArr[0]), org.telegram.messenger.em.B(2, AndroidUtilities.dp(35.0f), drawableArr[0]), org.telegram.messenger.em.z(2, AndroidUtilities.dp(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        if (this.f35442w) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float d10 = this.f35444y.d(f12, false);
        if (d10 > f11) {
            int alpha = org.telegram.ui.ActionBar.j6.f18049k0.getAlpha();
            org.telegram.ui.ActionBar.j6.f18049k0.setAlpha((int) (alpha * d10));
            canvas.drawRect(AndroidUtilities.dp(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.j6.f18049k0);
            org.telegram.ui.ActionBar.j6.f18049k0.setAlpha(alpha);
        }
        Paint paint2 = ra.J;
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

    public void setLoading(boolean z10) {
        float f7;
        if (this.f35440r != z10) {
            this.f35440r = z10;
            ValueAnimator valueAnimator = this.f35441s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.d.setVisibility(0);
            float f10 = this.f35439n;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f35441s = ofFloat;
            ofFloat.addUpdateListener(new na(this, 0));
            this.f35441s.addListener(new ai.e(22, this, z10));
            this.f35441s.setInterpolator(org.telegram.ui.Components.wr.f28820g);
            this.f35441s.setDuration(200L);
            this.f35441s.start();
        }
    }
}
