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
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class qa extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public float E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public final org.telegram.ui.Components.h6 I;
    public boolean f42781a;
    public final org.telegram.ui.ActionBar.u6 f42782b;
    public final org.telegram.ui.ActionBar.b6 f42783c;
    public final ImageView d;
    public final org.telegram.ui.Components.gq e;
    public final org.telegram.ui.Components.s6 f42784f;
    public final Drawable[] h;
    public float f42785n;
    public boolean f42786r;
    public ValueAnimator f42787s;
    public TLRPC.TL_username v;
    public boolean f42788w;
    public long f42789x;
    public final org.telegram.ui.Components.h6 f42790y;

    public qa(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f42781a = false;
        this.f42790y = new org.telegram.ui.Components.h6(this, 300L, org.telegram.ui.Components.ds.f27584f);
        this.I = new org.telegram.ui.Components.h6(this, 400L, org.telegram.ui.Components.ds.h);
        this.f42782b = u6Var;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, this, u6Var);
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(getContext());
        this.f42783c = b6Var;
        b6Var.setTextSize(16);
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        b6Var.setEllipsizeByGradient(true);
        addView(b6Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.gq gqVar = new org.telegram.ui.Components.gq(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(1.35f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23538n6, u6Var));
        this.e = gqVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(gqVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        gqVar.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        addView(imageView, org.telegram.ui.Components.gb1.h(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(getContext(), false, true, true);
        this.f42784f = s6Var;
        s6Var.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23765z6, u6Var));
        s6Var.b(0.4f, 120L, org.telegram.ui.Components.ds.f27585g);
        s6Var.setTextSize(AndroidUtilities.dp(13.0f));
        addView(s6Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        ta.H.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var));
        ta.I.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.V8, u6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z10, boolean z11, long j10) {
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        this.v = tL_username;
        this.f42788w = z10;
        this.f42789x = j10;
        invalidate();
        if (this.v == null) {
            this.G = false;
            this.H = false;
            return;
        }
        this.G = tL_username.active;
        if (j10 == 0 && tL_username.editable) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.H = z12;
        b(tL_username.username);
        boolean z14 = this.f42781a;
        org.telegram.ui.Components.s6 s6Var = this.f42784f;
        if (z14) {
            if (this.H) {
                i11 = R.string.UsernameProfileLinkEditable;
            } else if (this.G) {
                i11 = R.string.UsernameProfileLinkActive;
            } else {
                i11 = R.string.UsernameProfileLinkInactive;
            }
            s6Var.c(LocaleController.getString(i11), z11, !this.G);
        } else {
            if (this.H) {
                i10 = R.string.UsernameLinkEditable;
            } else if (this.G) {
                i10 = R.string.UsernameLinkActive;
            } else {
                i10 = R.string.UsernameLinkInactive;
            }
            s6Var.c(LocaleController.getString(i10), z11, !this.G);
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
            ofFloat.addUpdateListener(new pa(this, 1));
            this.F.setDuration(120L);
            this.F.setInterpolator(org.telegram.ui.Components.ds.f27585g);
            this.F.start();
            return;
        }
        if (z13) {
            f7 = 1.0f;
        }
        this.E = f7;
        int i12 = org.telegram.ui.ActionBar.y6.f23765z6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f42782b;
        int f11 = i0.a.f(this.E, org.telegram.ui.ActionBar.y6.w0(i12, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23538n6, u6Var));
        this.e.b(f11);
        s6Var.setTextColor(f11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23765z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23538n6));
    }

    public final void b(String str) {
        if (this.H) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.b6 b6Var = this.f42783c;
        if (isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.UsernameLinkPlaceholder));
            spannableString.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.H6, this.f42782b), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            b6Var.l(spannableStringBuilder, false);
            return;
        }
        b6Var.l("@" + str, false);
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
        int i10 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
        Drawable[] drawableArr = this.h;
        if (i10 < 0) {
            f11 = 0.0f;
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f), ta.I);
            drawableArr[1].setAlpha((int) ((1.0f - d) * 255.0f));
            f10 = 255.0f;
            drawableArr[1].setBounds(d3.x(2, AndroidUtilities.dp(35.0f), drawableArr[1]), d3.i(2, AndroidUtilities.dp(29.0f), drawableArr[1]), d3.C(2, AndroidUtilities.dp(35.0f), drawableArr[1]), d3.B(2, AndroidUtilities.dp(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (d > f11) {
            Paint paint = ta.H;
            int i11 = (int) (d * f10);
            paint.setAlpha(i11);
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f) * d, paint);
            drawableArr[0].setAlpha(i11);
            drawableArr[0].setBounds(d3.x(2, AndroidUtilities.dp(35.0f), drawableArr[0]), d3.i(2, AndroidUtilities.dp(29.0f), drawableArr[0]), d3.C(2, AndroidUtilities.dp(35.0f), drawableArr[0]), d3.B(2, AndroidUtilities.dp(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        if (this.f42788w) {
            f12 = 1.0f;
        } else {
            f12 = f11;
        }
        float d10 = this.f42790y.d(f12, false);
        if (d10 > f11) {
            int alpha = org.telegram.ui.ActionBar.y6.f23476k0.getAlpha();
            org.telegram.ui.ActionBar.y6.f23476k0.setAlpha((int) (alpha * d10));
            canvas.drawRect(AndroidUtilities.dp(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.y6.f23476k0);
            org.telegram.ui.ActionBar.y6.f23476k0.setAlpha(alpha);
        }
        Paint paint2 = ta.J;
        paint2.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Uh, false));
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
        if (this.f42786r != z10) {
            this.f42786r = z10;
            ValueAnimator valueAnimator = this.f42787s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.d.setVisibility(0);
            float f10 = this.f42785n;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f42787s = ofFloat;
            ofFloat.addUpdateListener(new pa(this, 0));
            this.f42787s.addListener(new bh.f0(27, this, z10));
            this.f42787s.setInterpolator(org.telegram.ui.Components.ds.f27585g);
            this.f42787s.setDuration(200L);
            this.f42787s.start();
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.gq gqVar;
        org.telegram.ui.Components.s6 s6Var;
        org.telegram.ui.ActionBar.u6 u6Var = this.f42782b;
        try {
            ta.H.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var));
            ta.I.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.V8, u6Var));
            ValueAnimator valueAnimator = this.F;
            if ((valueAnimator == null || !valueAnimator.isRunning()) && (gqVar = this.e) != null && (s6Var = this.f42784f) != null) {
                int f7 = i0.a.f(this.E, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23765z6, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23538n6, u6Var));
                gqVar.b(f7);
                s6Var.setTextColor(f7);
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
