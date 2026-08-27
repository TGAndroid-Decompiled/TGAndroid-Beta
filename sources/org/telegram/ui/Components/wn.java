package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;

public abstract class wn extends LinearLayout {
    public static final int H = 0;
    public boolean A;
    public AnimatorSet B;
    public boolean C;
    public boolean D;
    public float E;
    public int F;
    public boolean G;

    public TLRPC.Document f34290a;

    public final TextView f34291b;

    public final TextView f34292c;
    public vn d;

    public final int f34293e;

    public final FrameLayout f34294f;
    public n9 h;

    public n9 f34295n;

    public final org.telegram.ui.ActionBar.c6 f34296r;

    public boolean f34297s;
    public ri0 v;

    public TextView f34298w;

    public ag.e1 f34299x;

    public boolean f34300y;

    public wn(Context context, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setOrientation(1);
        this.f34293e = i10;
        this.f34296r = c6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.f34291b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextAlignment(4);
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.f34292c = textView2;
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34294f = frameLayout;
        n9 n9Var = new n9(context);
        this.h = n9Var;
        n9Var.getImageReceiver().setAspectFit(true);
        frameLayout.addView(this.h, h7.z5.c(112.0f, 112));
        h7.b6.a(this.h);
        n9 n9Var2 = new n9(context);
        this.f34295n = n9Var2;
        n9Var2.getImageReceiver().setAspectFit(true);
        frameLayout.addView(this.f34295n, h7.z5.c(112.0f, 112));
        this.f34295n.setVisibility(8);
        this.f34295n.setAlpha(0.0f);
        h7.b6.a(this.f34295n);
        e();
        int i11 = org.telegram.ui.ActionBar.g6.f23150ic;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        String string = LocaleController.getString(R.string.NoMessages);
        String string2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        textView.setText(string);
        textView2.setText(string2);
        textView2.setMaxWidth(lh.w3.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.f34290a = document;
        if (document == null) {
            this.f34290a = MediaDataController.getInstance(i10).getGreetingsSticker();
        }
    }

    public static void a(wn wnVar) {
        AnimatorSet animatorSet = wnVar.B;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        wnVar.f34295n.setVisibility(0);
        wnVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        wnVar.B = animatorSet2;
        animatorSet2.setDuration(420L);
        wnVar.B.setInterpolator(er.h);
        wnVar.B.addListener(new org.telegram.ui.go(wnVar));
        AnimatorSet animatorSet3 = wnVar.B;
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(wnVar.f34295n, (Property<n9, Float>) property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(wnVar.f34295n, (Property<n9, Float>) property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(wnVar.f34295n, (Property<n9, Float>) property3, 0.7f, 1.0f);
        n9 n9Var = wnVar.f34295n;
        float[] fArr = {-AndroidUtilities.dp(24.0f), 0.0f};
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, ObjectAnimator.ofFloat(n9Var, (Property<n9, Float>) property4, fArr), ObjectAnimator.ofFloat(wnVar.h, (Property<n9, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(wnVar.h, (Property<n9, Float>) property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(wnVar.h, (Property<n9, Float>) property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(wnVar.h, (Property<n9, Float>) property4, 0.0f, AndroidUtilities.dp(24.0f)));
        wnVar.B.start();
    }

    public static String b(TLRPC.Document document) {
        float fMin;
        float f10;
        int i10;
        if (AndroidUtilities.isTablet()) {
            fMin = AndroidUtilities.getMinTabletSide();
            f10 = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            fMin = Math.min(point.x, point.y);
            f10 = 0.5f;
        }
        float f11 = fMin * f10;
        int iDp = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= document.attributes.size()) {
                i10 = 0;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                iDp = documentAttribute.f22387w;
                i10 = documentAttribute.h;
                break;
            }
            i11++;
        }
        if (MessageObject.isAnimatedStickerDocument(document, true) && iDp == 0 && i10 == 0) {
            iDp = 512;
            i10 = 512;
        }
        if (iDp == 0) {
            i10 = (int) f11;
            iDp = AndroidUtilities.dp(100.0f) + i10;
        }
        int i12 = (int) ((f11 / iDp) * i10);
        int i13 = (int) f11;
        float f12 = i12;
        if (f12 > f11) {
            i13 = (int) ((f11 / f12) * i13);
            i12 = i13;
        }
        float f13 = i13;
        float f14 = AndroidUtilities.density;
        int i14 = (int) (f13 / f14);
        int i15 = (int) (i12 / f14);
        Locale locale = Locale.US;
        return com.google.android.recaptcha.internal.a.l(i14, "_", i15);
    }

    public final void c(boolean z10, boolean z11, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        if (this.f34300y == z10) {
            return;
        }
        this.f34300y = z10;
        this.A = z11;
        if (z10) {
            if (this.v == null) {
                ri0 ri0Var = new ri0(getContext());
                this.v = ri0Var;
                ri0Var.setScaleType(ImageView.ScaleType.CENTER);
                this.v.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.v.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(78.0f), 469762048));
                if (z11) {
                    this.v.setImageResource(R.drawable.filled_chatlist2);
                } else {
                    this.v.f(R.raw.large_message_lock, 80, 80, null);
                    this.v.setOnClickListener(new f0(this, 8));
                }
            }
            this.v.d();
            if (this.f34298w == null) {
                TextView textView = new TextView(getContext());
                this.f34298w = textView;
                textView.setTextAlignment(4);
                this.f34298w.setGravity(17);
                this.f34298w.setTextSize(1, 13.0f);
            }
            this.f34298w.setText(spannableStringBuilder);
            TextView textView2 = this.f34298w;
            textView2.setMaxWidth(lh.w3.a(textView2.getText(), this.f34298w.getPaint()));
            TextView textView3 = this.f34298w;
            int i10 = org.telegram.ui.ActionBar.g6.f23150ic;
            org.telegram.ui.ActionBar.c6 c6Var = this.f34296r;
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            this.f34298w.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            if (this.f34299x == null) {
                ag.e1 e1Var = new ag.e1(getContext(), 7);
                this.f34299x = e1Var;
                e1Var.setTextAlignment(4);
                this.f34299x.setGravity(17);
                this.f34299x.setTypeface(AndroidUtilities.bold());
                this.f34299x.setTextSize(1, 14.0f);
                this.f34299x.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                ag.e1 e1Var2 = this.f34299x;
                int iDp = AndroidUtilities.dp(15.0f);
                e1Var2.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, 503316480, 855638016, 855638016));
                h7.b6.a(this.f34299x);
            }
            this.f34299x.setText(str);
            this.f34299x.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            this.f34299x.setOnClickListener(onClickListener);
        }
        e();
    }

    public final void d(CharSequence charSequence, CharSequence charSequence2) {
        this.D = true;
        if (TextUtils.isEmpty(charSequence == null ? null : charSequence.toString().trim())) {
            charSequence = LocaleController.getString(R.string.NoMessages);
        }
        this.f34291b.setText(charSequence);
        if (TextUtils.isEmpty(charSequence2 != null ? charSequence2.toString().trim() : null)) {
            charSequence2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        }
        TextView textView = this.f34292c;
        textView.setText(charSequence2);
        textView.setMaxWidth(textView.getText().length() > 60 ? Math.min((int) (AndroidUtilities.displaySize.x * 0.5f), lh.w3.a(textView.getText(), textView.getPaint())) : (int) (AndroidUtilities.displaySize.x * 0.5f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.G) {
            canvas2 = canvas;
        } else {
            org.telegram.ui.ActionBar.c6 c6Var = this.f34296r;
            if (c6Var != null) {
                c6Var.m(0.0f, this.E + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.F);
            } else {
                org.telegram.ui.ActionBar.g6.q(0.0f, this.E + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.F);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.T0("paintChatActionBackground", c6Var));
        }
        if (!this.f34297s) {
            this.f34297s = true;
            setSticker(this.f34290a);
        }
        super.dispatchDraw(canvas2);
    }

    public final void e() {
        removeAllViews();
        if (!this.f34300y) {
            addView(this.f34291b, h7.z5.t(-2, -2, 1, 20, 6, 20, 6));
            addView(this.f34292c, h7.z5.t(-2, -2, 1, 20, 6, 20, 6));
            addView(this.f34294f, h7.z5.t(112, 112, 1, 16, 10, 16, 16));
            return;
        }
        addView(this.v, h7.z5.t(78, 78, 49, 20, 9, 20, 9));
        boolean zPremiumFeaturesBlocked = MessagesController.getInstance(this.f34293e).premiumFeaturesBlocked();
        addView(this.f34298w, h7.z5.t(-2, -2, 49, 20, 0, 20, zPremiumFeaturesBlocked ? 13 : 9));
        if (zPremiumFeaturesBlocked) {
            return;
        }
        ag.e1 e1Var = this.f34299x;
        if ((e1Var == null || TextUtils.isEmpty(e1Var.getText())) && this.A) {
            return;
        }
        addView(this.f34299x, h7.z5.t(-2, 30, 49, 20, 2, 20, 13));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f34290a == null) {
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.f34293e).getGreetingsSticker();
            this.f34290a = greetingsSticker;
            if (this.f34297s) {
                setSticker(greetingsSticker);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        this.C = true;
        boolean z10 = this.D;
        TextView textView = this.f34292c;
        if (!z10) {
            textView.setVisibility(0);
        }
        this.h.setVisibility(0);
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() <= View.MeasureSpec.getSize(i11) || this.D) {
            if (!this.D) {
                textView.setVisibility(0);
            }
            this.h.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.h.setVisibility(8);
        }
        this.C = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.C) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        this.G = true;
    }

    public void setListener(vn vnVar) {
        this.d = vnVar;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.f34297s = true;
        this.f34295n.b();
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f23203lc, 1.0f);
        if (svgThumb != null) {
            this.h.n(ImageLocation.getForDocument(document), b(document), svgThumb, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.j(ImageLocation.getForDocument(document), b(document), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), null, 0, document2);
        }
        this.h.setOnClickListener(new tn(this, document2, 0));
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.f34297s = true;
        this.f34295n.b();
        this.h.j(ImageLocation.getForPath(str), "256_256", null, null, 0, null);
    }
}
