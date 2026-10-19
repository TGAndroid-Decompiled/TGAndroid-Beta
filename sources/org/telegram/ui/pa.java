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
    public final org.telegram.ui.Components.f6 I;
    public boolean f40156a;
    public final org.telegram.ui.ActionBar.d6 f40157b;
    public final org.telegram.ui.ActionBar.j5 f40158c;
    public final ImageView d;
    public final org.telegram.ui.Components.dq e;
    public final org.telegram.ui.Components.q6 f40159f;
    public final Drawable[] h;
    public float f40160n;
    public boolean f40161r;
    public ValueAnimator f40162s;
    public TLRPC.TL_username v;
    public boolean f40163w;
    public long f40164x;
    public final org.telegram.ui.Components.f6 f40165y;

    public pa(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f40156a = false;
        this.f40165y = new org.telegram.ui.Components.f6(this, 300L, org.telegram.ui.Components.bs.f25012f);
        this.I = new org.telegram.ui.Components.f6(this, 400L, org.telegram.ui.Components.bs.h);
        this.f40157b = d6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20987d6, d6Var));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
        this.f40158c = j5Var;
        j5Var.setTextSize(16);
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        j5Var.setEllipsizeByGradient(true);
        addView(j5Var, w7.z5.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(1.35f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21170n6, d6Var));
        this.e = dqVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(dqVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        dqVar.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        addView(imageView, w7.z5.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(getContext(), false, true, true);
        this.f40159f = q6Var;
        q6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21392z6, d6Var));
        q6Var.b(0.4f, 120L, org.telegram.ui.Components.bs.f25013g);
        q6Var.setTextSize(AndroidUtilities.dp(13.0f));
        addView(q6Var, w7.z5.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        sa.H.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var));
        sa.I.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.V8, d6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z10, boolean z11, long j10) {
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        this.v = tL_username;
        this.f40163w = z10;
        this.f40164x = j10;
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
        boolean z14 = this.f40156a;
        org.telegram.ui.Components.q6 q6Var = this.f40159f;
        if (z14) {
            if (this.H) {
                i11 = R.string.UsernameProfileLinkEditable;
            } else if (this.G) {
                i11 = R.string.UsernameProfileLinkActive;
            } else {
                i11 = R.string.UsernameProfileLinkInactive;
            }
            q6Var.c(LocaleController.getString(i11), z11, !this.G);
        } else {
            if (this.H) {
                i10 = R.string.UsernameLinkEditable;
            } else if (this.G) {
                i10 = R.string.UsernameLinkActive;
            } else {
                i10 = R.string.UsernameLinkInactive;
            }
            q6Var.c(LocaleController.getString(i10), z11, !this.G);
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
            this.F.setInterpolator(org.telegram.ui.Components.bs.f25013g);
            this.F.start();
            return;
        }
        if (z13) {
            f7 = 1.0f;
        }
        this.E = f7;
        int i12 = org.telegram.ui.ActionBar.h6.f21392z6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f40157b;
        int f11 = i0.a.f(this.E, org.telegram.ui.ActionBar.h6.w0(i12, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21170n6, d6Var));
        this.e.b(f11);
        q6Var.setTextColor(f11);
    }

    public final void b(String str) {
        if (this.H) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.j5 j5Var = this.f40158c;
        if (isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.UsernameLinkPlaceholder));
            spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H6, this.f40157b)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            j5Var.l(spannableStringBuilder, false);
            return;
        }
        j5Var.l("@" + str, false);
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
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f), sa.I);
            drawableArr[1].setAlpha((int) ((1.0f - d) * 255.0f));
            f10 = 255.0f;
            drawableArr[1].setBounds(org.telegram.ui.Cells.c1.w(2, AndroidUtilities.dp(35.0f), drawableArr[1]), org.telegram.ui.Cells.c1.f(2, AndroidUtilities.dp(29.0f), drawableArr[1]), org.telegram.ui.Cells.c1.B(2, AndroidUtilities.dp(35.0f), drawableArr[1]), org.telegram.ui.Cells.c1.A(2, AndroidUtilities.dp(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (d > f11) {
            Paint paint = sa.H;
            int i11 = (int) (d * f10);
            paint.setAlpha(i11);
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f) * d, paint);
            drawableArr[0].setAlpha(i11);
            drawableArr[0].setBounds(org.telegram.ui.Cells.c1.w(2, AndroidUtilities.dp(35.0f), drawableArr[0]), org.telegram.ui.Cells.c1.f(2, AndroidUtilities.dp(29.0f), drawableArr[0]), org.telegram.ui.Cells.c1.B(2, AndroidUtilities.dp(35.0f), drawableArr[0]), org.telegram.ui.Cells.c1.A(2, AndroidUtilities.dp(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        if (this.f40163w) {
            f12 = 1.0f;
        } else {
            f12 = f11;
        }
        float d10 = this.f40165y.d(f12, false);
        if (d10 > f11) {
            int alpha = org.telegram.ui.ActionBar.h6.f21108k0.getAlpha();
            org.telegram.ui.ActionBar.h6.f21108k0.setAlpha((int) (alpha * d10));
            canvas.drawRect(AndroidUtilities.dp(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.h6.f21108k0);
            org.telegram.ui.ActionBar.h6.f21108k0.setAlpha(alpha);
        }
        Paint paint2 = sa.J;
        paint2.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Uh, false));
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
        if (this.f40161r != z10) {
            this.f40161r = z10;
            ValueAnimator valueAnimator = this.f40162s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.d.setVisibility(0);
            float f10 = this.f40160n;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f40162s = ofFloat;
            ofFloat.addUpdateListener(new oa(this, 0));
            this.f40162s.addListener(new ah.p0(27, this, z10));
            this.f40162s.setInterpolator(org.telegram.ui.Components.bs.f25013g);
            this.f40162s.setDuration(200L);
            this.f40162s.start();
        }
    }
}
