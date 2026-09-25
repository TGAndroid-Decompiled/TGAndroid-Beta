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
public abstract class na extends FrameLayout {
    public float E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public final org.telegram.ui.Components.e6 I;
    public boolean f35780a;
    public final org.telegram.ui.ActionBar.d6 f35781b;
    public final org.telegram.ui.ActionBar.h5 f35782c;
    public final ImageView d;
    public final org.telegram.ui.Components.up e;
    public final org.telegram.ui.Components.p6 f35783f;
    public final Drawable[] h;
    public float f35784n;
    public boolean f35785r;
    public ValueAnimator f35786s;
    public TLRPC.TL_username v;
    public boolean f35787w;
    public long f35788x;
    public final org.telegram.ui.Components.e6 f35789y;

    public na(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f35780a = false;
        this.f35789y = new org.telegram.ui.Components.e6(this, 300L, org.telegram.ui.Components.rr.f28031f);
        this.I = new org.telegram.ui.Components.e6(this, 400L, org.telegram.ui.Components.rr.h);
        this.f35781b = d6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d6, d6Var));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.f35782c = h5Var;
        h5Var.setTextSize(16);
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        h5Var.setEllipsizeByGradient(true);
        addView(h5Var, w7.y5.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.up upVar = new org.telegram.ui.Components.up(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(1.35f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19244n6, d6Var));
        this.e = upVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(upVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        upVar.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        addView(imageView, w7.y5.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(getContext(), false, true, true);
        this.f35783f = p6Var;
        p6Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19462z6, d6Var));
        p6Var.b(0.4f, 120L, org.telegram.ui.Components.rr.f28032g);
        p6Var.setTextSize(AndroidUtilities.dp(13.0f));
        addView(p6Var, w7.y5.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        qa.H.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var));
        qa.I.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.V8, d6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z10, boolean z11, long j3) {
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        this.v = tL_username;
        this.f35787w = z10;
        this.f35788x = j3;
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
        boolean z14 = this.f35780a;
        org.telegram.ui.Components.p6 p6Var = this.f35783f;
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
            ofFloat.addUpdateListener(new ma(this, 1));
            this.F.setDuration(120L);
            this.F.setInterpolator(org.telegram.ui.Components.rr.f28032g);
            this.F.start();
            return;
        }
        if (z13) {
            f7 = 1.0f;
        }
        this.E = f7;
        int i12 = org.telegram.ui.ActionBar.h6.f19462z6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f35781b;
        int d = i0.a.d(this.E, org.telegram.ui.ActionBar.h6.v0(i12, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19244n6, d6Var));
        this.e.b(d);
        p6Var.setTextColor(d);
    }

    public final void b(String str) {
        if (this.H) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.h5 h5Var = this.f35782c;
        if (isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.UsernameLinkPlaceholder));
            spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.H6, this.f35781b)), 0, spannableString.length(), 33);
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
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f), qa.I);
            drawableArr[1].setAlpha((int) ((1.0f - d) * 255.0f));
            f11 = 0.0f;
            drawableArr[1].setBounds(org.telegram.messenger.ok.z(2, AndroidUtilities.dp(35.0f), drawableArr[1]), org.telegram.messenger.ok.d(2, AndroidUtilities.dp(29.0f), drawableArr[1]), org.telegram.ui.Cells.c1.t(2, AndroidUtilities.dp(35.0f), drawableArr[1]), org.telegram.ui.Cells.c1.d(2, AndroidUtilities.dp(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (d > f11) {
            Paint paint = qa.H;
            int i10 = (int) (d * f10);
            paint.setAlpha(i10);
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f) * d, paint);
            drawableArr[0].setAlpha(i10);
            drawableArr[0].setBounds(org.telegram.messenger.ok.z(2, AndroidUtilities.dp(35.0f), drawableArr[0]), org.telegram.messenger.ok.d(2, AndroidUtilities.dp(29.0f), drawableArr[0]), org.telegram.ui.Cells.c1.t(2, AndroidUtilities.dp(35.0f), drawableArr[0]), org.telegram.ui.Cells.c1.d(2, AndroidUtilities.dp(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        if (this.f35787w) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float d10 = this.f35789y.d(f12, false);
        if (d10 > f11) {
            int alpha = org.telegram.ui.ActionBar.h6.f19181k0.getAlpha();
            org.telegram.ui.ActionBar.h6.f19181k0.setAlpha((int) (alpha * d10));
            canvas.drawRect(AndroidUtilities.dp(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.h6.f19181k0);
            org.telegram.ui.ActionBar.h6.f19181k0.setAlpha(alpha);
        }
        Paint paint2 = qa.J;
        paint2.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Uh, false));
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
        if (this.f35785r != z10) {
            this.f35785r = z10;
            ValueAnimator valueAnimator = this.f35786s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.d.setVisibility(0);
            float f10 = this.f35784n;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f35786s = ofFloat;
            ofFloat.addUpdateListener(new ma(this, 0));
            this.f35786s.addListener(new ai.n(26, this, z10));
            this.f35786s.setInterpolator(org.telegram.ui.Components.rr.f28032g);
            this.f35786s.setDuration(200L);
            this.f35786s.start();
        }
    }
}
