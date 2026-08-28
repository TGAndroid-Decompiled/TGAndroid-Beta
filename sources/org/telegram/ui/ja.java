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
public abstract class ja extends FrameLayout {
    public float A;
    public ValueAnimator B;
    public boolean C;
    public boolean D;
    public final org.telegram.ui.Components.y5 E;
    public boolean f39414a;
    public final org.telegram.ui.ActionBar.b6 f39415b;
    public final org.telegram.ui.ActionBar.h5 f39416c;
    public final ImageView d;
    public final org.telegram.ui.Components.jp f39417e;
    public final org.telegram.ui.Components.j6 f39418f;
    public final Drawable[] h;
    public float f39419n;
    public boolean f39420r;
    public ValueAnimator f39421s;
    public TLRPC.TL_username v;
    public boolean f39422w;
    public long f39423x;
    public final org.telegram.ui.Components.y5 f39424y;

    public ja(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f39414a = false;
        this.f39424y = new org.telegram.ui.Components.y5(this, 300L, org.telegram.ui.Components.gr.f28844f);
        this.E = new org.telegram.ui.Components.y5(this, 400L, org.telegram.ui.Components.gr.h);
        this.f39415b = b6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.f39416c = h5Var;
        h5Var.setTextSize(16);
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        h5Var.setEllipsizeByGradient(true);
        addView(h5Var, g7.e6.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.jp jpVar = new org.telegram.ui.Components.jp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(1.35f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23179n6, b6Var));
        this.f39417e = jpVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(jpVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        jpVar.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        addView(imageView, g7.e6.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getContext(), false, true, true);
        this.f39418f = j6Var;
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, b6Var));
        j6Var.b(0.4f, 120L, org.telegram.ui.Components.gr.f28845g);
        j6Var.setTextSize(AndroidUtilities.dp(13.0f));
        addView(j6Var, g7.e6.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        ma.D.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var));
        ma.E.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.V8, b6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z10, boolean z11, long j10) {
        boolean z12;
        int i9;
        boolean z13;
        int i10;
        this.v = tL_username;
        this.f39422w = z10;
        this.f39423x = j10;
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
        boolean z14 = this.f39414a;
        org.telegram.ui.Components.j6 j6Var = this.f39418f;
        if (z14) {
            if (this.D) {
                i10 = R.string.UsernameProfileLinkEditable;
            } else if (this.C) {
                i10 = R.string.UsernameProfileLinkActive;
            } else {
                i10 = R.string.UsernameProfileLinkInactive;
            }
            j6Var.c(LocaleController.getString(i10), z11, !this.C);
        } else {
            if (this.D) {
                i9 = R.string.UsernameLinkEditable;
            } else if (this.C) {
                i9 = R.string.UsernameLinkActive;
            } else {
                i9 = R.string.UsernameLinkInactive;
            }
            j6Var.c(LocaleController.getString(i9), z11, !this.C);
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
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.A;
            if (z13) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new ia(this, 1));
            this.B.setDuration(120L);
            this.B.setInterpolator(org.telegram.ui.Components.gr.f28845g);
            this.B.start();
            return;
        }
        if (z13) {
            f10 = 1.0f;
        }
        this.A = f10;
        int i11 = org.telegram.ui.ActionBar.f6.f23386z6;
        org.telegram.ui.ActionBar.b6 b6Var = this.f39415b;
        int d = i0.a.d(this.A, org.telegram.ui.ActionBar.f6.v0(i11, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23179n6, b6Var));
        this.f39417e.b(d);
        j6Var.setTextColor(d);
    }

    public final void b(String str) {
        if (this.D) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.h5 h5Var = this.f39416c;
        if (isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.UsernameLinkPlaceholder));
            spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.H6, this.f39415b)), 0, spannableString.length(), 33);
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
        float f10;
        float f11;
        float f12;
        float f13;
        super.onDraw(canvas);
        if (this.C) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.E.d(f10, false);
        Drawable[] drawableArr = this.h;
        if (d < 1.0f) {
            f11 = 255.0f;
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f), ma.E);
            drawableArr[1].setAlpha((int) ((1.0f - d) * 255.0f));
            f12 = 0.0f;
            drawableArr[1].setBounds(org.telegram.messenger.ll.x(2, AndroidUtilities.dp(35.0f), drawableArr[1]), org.telegram.messenger.ll.e(2, AndroidUtilities.dp(29.0f), drawableArr[1]), org.telegram.messenger.ll.B(2, AndroidUtilities.dp(35.0f), drawableArr[1]), org.telegram.messenger.ll.z(2, AndroidUtilities.dp(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f11 = 255.0f;
            f12 = 0.0f;
        }
        if (d > f12) {
            Paint paint = ma.D;
            int i9 = (int) (d * f11);
            paint.setAlpha(i9);
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f) * d, paint);
            drawableArr[0].setAlpha(i9);
            drawableArr[0].setBounds(org.telegram.messenger.ll.x(2, AndroidUtilities.dp(35.0f), drawableArr[0]), org.telegram.messenger.ll.e(2, AndroidUtilities.dp(29.0f), drawableArr[0]), org.telegram.messenger.ll.B(2, AndroidUtilities.dp(35.0f), drawableArr[0]), org.telegram.messenger.ll.z(2, AndroidUtilities.dp(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        if (this.f39422w) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        float d9 = this.f39424y.d(f13, false);
        if (d9 > f12) {
            int alpha = org.telegram.ui.ActionBar.f6.f23121k0.getAlpha();
            org.telegram.ui.ActionBar.f6.f23121k0.setAlpha((int) (alpha * d9));
            canvas.drawRect(AndroidUtilities.dp(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.f6.f23121k0);
            org.telegram.ui.ActionBar.f6.f23121k0.setAlpha(alpha);
        }
        Paint paint2 = ma.F;
        paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Uh, false));
        paint2.setAlpha((int) (paint2.getAlpha() * d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getWidth() - AndroidUtilities.dp(37.0f), AndroidUtilities.dp(25.0f), getWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(27.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(0.3f), AndroidUtilities.dp(0.3f), paint2);
        rectF.set(getWidth() - AndroidUtilities.dp(37.0f), AndroidUtilities.dp(31.0f), getWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(33.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(0.3f), AndroidUtilities.dp(0.3f), paint2);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }

    public void setLoading(boolean z10) {
        float f10;
        if (this.f39420r != z10) {
            this.f39420r = z10;
            ValueAnimator valueAnimator = this.f39421s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.d.setVisibility(0);
            float f11 = this.f39419n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f39421s = ofFloat;
            ofFloat.addUpdateListener(new ia(this, 0));
            this.f39421s.addListener(new hg.b0(26, this, z10));
            this.f39421s.setInterpolator(org.telegram.ui.Components.gr.f28845g);
            this.f39421s.setDuration(200L);
            this.f39421s.start();
        }
    }
}
