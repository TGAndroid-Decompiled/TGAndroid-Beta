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
public abstract class co extends LinearLayout {
    public static final int H = 0;
    public boolean A;
    public AnimatorSet B;
    public boolean C;
    public boolean D;
    public float E;
    public int F;
    public boolean G;
    public TLRPC.Document f27512a;
    public final TextView f27513b;
    public final TextView f27514c;
    public bo d;
    public final int f27515e;
    public final FrameLayout f27516f;
    public t9 h;
    public t9 f27517n;
    public final org.telegram.ui.ActionBar.c6 f27518r;
    public boolean f27519s;
    public aj0 v;
    public TextView f27520w;
    public cg.s0 f27521x;
    public boolean f27522y;

    public co(Context context, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setOrientation(1);
        this.f27515e = i10;
        this.f27518r = c6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.f27513b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextAlignment(4);
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.f27514c = textView2;
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27516f = frameLayout;
        t9 t9Var = new t9(context);
        this.h = t9Var;
        t9Var.getImageReceiver().setAspectFit(true);
        frameLayout.addView(this.h, i7.f6.c(112.0f, 112));
        i7.h6.a(this.h);
        t9 t9Var2 = new t9(context);
        this.f27517n = t9Var2;
        t9Var2.getImageReceiver().setAspectFit(true);
        frameLayout.addView(this.f27517n, i7.f6.c(112.0f, 112));
        this.f27517n.setVisibility(8);
        this.f27517n.setAlpha(0.0f);
        i7.h6.a(this.f27517n);
        e();
        int i11 = org.telegram.ui.ActionBar.g6.f23158ic;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        String string = LocaleController.getString(R.string.NoMessages);
        String string2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        textView.setText(string);
        textView2.setText(string2);
        textView2.setMaxWidth(nh.t3.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.f27512a = document;
        if (document == null) {
            this.f27512a = MediaDataController.getInstance(i10).getGreetingsSticker();
        }
    }

    public static void a(co coVar) {
        AnimatorSet animatorSet = coVar.B;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        coVar.f27517n.setVisibility(0);
        coVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        coVar.B = animatorSet2;
        animatorSet2.setDuration(420L);
        coVar.B.setInterpolator(jr.h);
        coVar.B.addListener(new z9(coVar));
        AnimatorSet animatorSet3 = coVar.B;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(coVar.f27517n, property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(coVar.f27517n, property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(coVar.f27517n, property3, 0.7f, 1.0f);
        t9 t9Var = coVar.f27517n;
        float[] fArr = {-AndroidUtilities.dp(24.0f), 0.0f};
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(t9Var, property4, fArr), ObjectAnimator.ofFloat(coVar.h, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(coVar.h, property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(coVar.h, property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(coVar.h, property4, 0.0f, AndroidUtilities.dp(24.0f)));
        coVar.B.start();
    }

    public static String b(TLRPC.Document document) {
        float min;
        float f9;
        int i10;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            f9 = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f9 = 0.5f;
        }
        float f10 = min * f9;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 < document.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                    i11 = documentAttribute.f22399w;
                    i10 = documentAttribute.h;
                    break;
                }
                i12++;
            } else {
                i10 = 0;
                break;
            }
        }
        if (MessageObject.isAnimatedStickerDocument(document, true) && i11 == 0 && i10 == 0) {
            i11 = 512;
            i10 = 512;
        }
        if (i11 == 0) {
            i10 = (int) f10;
            i11 = AndroidUtilities.dp(100.0f) + i10;
        }
        int i13 = (int) ((f10 / i11) * i10);
        int i14 = (int) f10;
        float f11 = i13;
        if (f11 > f10) {
            i14 = (int) ((f10 / f11) * i14);
            i13 = i14;
        }
        float f12 = i14;
        float f13 = AndroidUtilities.density;
        Locale locale = Locale.US;
        return com.google.android.recaptcha.internal.a.k((int) (f12 / f13), "_", (int) (i13 / f13));
    }

    public final void c(boolean z10, boolean z11, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        if (this.f27522y == z10) {
            return;
        }
        this.f27522y = z10;
        this.A = z11;
        if (z10) {
            if (this.v == null) {
                ?? imageView = new ImageView(getContext());
                this.v = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.v.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.v.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(78.0f), 469762048));
                if (z11) {
                    this.v.setImageResource(R.drawable.filled_chatlist2);
                } else {
                    this.v.f(R.raw.large_message_lock, 80, 80, null);
                    this.v.setOnClickListener(new h0(this, 8));
                }
            }
            this.v.d();
            if (this.f27520w == null) {
                TextView textView = new TextView(getContext());
                this.f27520w = textView;
                textView.setTextAlignment(4);
                this.f27520w.setGravity(17);
                this.f27520w.setTextSize(1, 13.0f);
            }
            this.f27520w.setText(spannableStringBuilder);
            TextView textView2 = this.f27520w;
            textView2.setMaxWidth(nh.t3.a(textView2.getText(), this.f27520w.getPaint()));
            TextView textView3 = this.f27520w;
            int i10 = org.telegram.ui.ActionBar.g6.f23158ic;
            org.telegram.ui.ActionBar.c6 c6Var = this.f27518r;
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            this.f27520w.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            if (this.f27521x == null) {
                cg.s0 s0Var = new cg.s0(getContext(), 6);
                this.f27521x = s0Var;
                s0Var.setTextAlignment(4);
                this.f27521x.setGravity(17);
                this.f27521x.setTypeface(AndroidUtilities.bold());
                this.f27521x.setTextSize(1, 14.0f);
                this.f27521x.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                cg.s0 s0Var2 = this.f27521x;
                int dp = AndroidUtilities.dp(15.0f);
                s0Var2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 503316480, 855638016, 855638016));
                i7.h6.a(this.f27521x);
            }
            this.f27521x.setText(str);
            this.f27521x.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            this.f27521x.setOnClickListener(onClickListener);
        }
        e();
    }

    public final void d(CharSequence charSequence, CharSequence charSequence2) {
        String trim;
        int i10;
        this.D = true;
        String str = null;
        if (charSequence == null) {
            trim = null;
        } else {
            trim = charSequence.toString().trim();
        }
        if (TextUtils.isEmpty(trim)) {
            charSequence = LocaleController.getString(R.string.NoMessages);
        }
        this.f27513b.setText(charSequence);
        if (charSequence2 != null) {
            str = charSequence2.toString().trim();
        }
        if (TextUtils.isEmpty(str)) {
            charSequence2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        }
        TextView textView = this.f27514c;
        textView.setText(charSequence2);
        if (textView.getText().length() > 60) {
            i10 = Math.min((int) (AndroidUtilities.displaySize.x * 0.5f), nh.t3.a(textView.getText(), textView.getPaint()));
        } else {
            i10 = (int) (AndroidUtilities.displaySize.x * 0.5f);
        }
        textView.setMaxWidth(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (!this.G) {
            org.telegram.ui.ActionBar.c6 c6Var = this.f27518r;
            if (c6Var != null) {
                c6Var.l(0.0f, this.E + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.F);
            } else {
                org.telegram.ui.ActionBar.g6.q(0.0f, this.E + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.F);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.T0("paintChatActionBackground", c6Var));
        } else {
            canvas2 = canvas;
        }
        if (!this.f27519s) {
            this.f27519s = true;
            setSticker(this.f27512a);
        }
        super.dispatchDraw(canvas2);
    }

    public final void e() {
        int i10;
        removeAllViews();
        if (this.f27522y) {
            addView(this.v, i7.f6.t(78, 78, 49, 20, 9, 20, 9));
            boolean premiumFeaturesBlocked = MessagesController.getInstance(this.f27515e).premiumFeaturesBlocked();
            TextView textView = this.f27520w;
            if (premiumFeaturesBlocked) {
                i10 = 13;
            } else {
                i10 = 9;
            }
            addView(textView, i7.f6.t(-2, -2, 49, 20, 0, 20, i10));
            if (!premiumFeaturesBlocked) {
                cg.s0 s0Var = this.f27521x;
                if ((s0Var != null && !TextUtils.isEmpty(s0Var.getText())) || !this.A) {
                    addView(this.f27521x, i7.f6.t(-2, 30, 49, 20, 2, 20, 13));
                    return;
                }
                return;
            }
            return;
        }
        addView(this.f27513b, i7.f6.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f27514c, i7.f6.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f27516f, i7.f6.t(112, 112, 1, 16, 10, 16, 16));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f27512a == null) {
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.f27515e).getGreetingsSticker();
            this.f27512a = greetingsSticker;
            if (this.f27519s) {
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
        TextView textView = this.f27514c;
        if (!z10) {
            textView.setVisibility(0);
        }
        this.h.setVisibility(0);
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() > View.MeasureSpec.getSize(i11) && !this.D) {
            textView.setVisibility(8);
            this.h.setVisibility(8);
        } else {
            if (!this.D) {
                textView.setVisibility(0);
            }
            this.h.setVisibility(0);
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

    public void setListener(bo boVar) {
        this.d = boVar;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.f27519s = true;
        this.f27517n.b();
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.lc, 1.0f);
        if (svgThumb != null) {
            this.h.n(ImageLocation.getForDocument(document), b(document), svgThumb, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.j(ImageLocation.getForDocument(document), b(document), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), null, 0, document2);
        }
        this.h.setOnClickListener(new zn(this, document2, 0));
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.f27519s = true;
        this.f27517n.b();
        this.h.j(ImageLocation.getForPath(str), "256_256", null, null, 0, null);
    }
}
