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
public abstract class ho extends LinearLayout {
    public static final int I = 0;
    public boolean B;
    public AnimatorSet C;
    public boolean D;
    public boolean E;
    public float F;
    public int G;
    public boolean H;
    public TLRPC.Document f27574a;
    public final TextView f27575b;
    public final TextView f27576c;
    public go d;
    public final int f27577e;
    public final FrameLayout f27578f;
    public p9 h;
    public p9 f27579n;
    public final org.telegram.ui.ActionBar.g6 f27580r;
    public boolean f27581s;
    public kj0 v;
    public TextView f27582w;
    public fg.s0 f27583x;
    public boolean f27584y;

    public ho(Context context, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setOrientation(1);
        this.f27577e = i10;
        this.f27580r = g6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.f27575b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextAlignment(4);
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.f27576c = textView2;
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27578f = frameLayout;
        p9 p9Var = new p9(context);
        this.h = p9Var;
        p9Var.getImageReceiver().setAspectFit(true);
        frameLayout.addView(this.h, k7.c6.c(112.0f, 112));
        k7.e6.a(this.h);
        p9 p9Var2 = new p9(context);
        this.f27579n = p9Var2;
        p9Var2.getImageReceiver().setAspectFit(true);
        frameLayout.addView(this.f27579n, k7.c6.c(112.0f, 112));
        this.f27579n.setVisibility(8);
        this.f27579n.setAlpha(0.0f);
        k7.e6.a(this.f27579n);
        e();
        int i11 = org.telegram.ui.ActionBar.k6.ic;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        String string = LocaleController.getString(R.string.NoMessages);
        String string2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        textView.setText(string);
        textView2.setText(string2);
        textView2.setMaxWidth(qh.e3.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.f27574a = document;
        if (document == null) {
            this.f27574a = MediaDataController.getInstance(i10).getGreetingsSticker();
        }
    }

    public static void a(ho hoVar) {
        AnimatorSet animatorSet = hoVar.C;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        hoVar.f27579n.setVisibility(0);
        hoVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        hoVar.C = animatorSet2;
        animatorSet2.setDuration(420L);
        hoVar.C.setInterpolator(pr.h);
        hoVar.C.addListener(new eg.u2(hoVar));
        AnimatorSet animatorSet3 = hoVar.C;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hoVar.f27579n, property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hoVar.f27579n, property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(hoVar.f27579n, property3, 0.7f, 1.0f);
        p9 p9Var = hoVar.f27579n;
        float[] fArr = {-AndroidUtilities.dp(24.0f), 0.0f};
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(p9Var, property4, fArr), ObjectAnimator.ofFloat(hoVar.h, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(hoVar.h, property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(hoVar.h, property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(hoVar.h, property4, 0.0f, AndroidUtilities.dp(24.0f)));
        hoVar.C.start();
    }

    public static String b(TLRPC.Document document) {
        float min;
        float f10;
        int i10;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            f10 = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f10 = 0.5f;
        }
        float f11 = min * f10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 < document.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                    i11 = documentAttribute.f20852w;
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
            i10 = (int) f11;
            i11 = AndroidUtilities.dp(100.0f) + i10;
        }
        int i13 = (int) ((f11 / i11) * i10);
        int i14 = (int) f11;
        float f12 = i13;
        if (f12 > f11) {
            i14 = (int) ((f11 / f12) * i14);
            i13 = i14;
        }
        float f13 = i14;
        float f14 = AndroidUtilities.density;
        Locale locale = Locale.US;
        return e2.c.h((int) (f13 / f14), "_", (int) (i13 / f14));
    }

    public final void c(boolean z4, boolean z10, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        if (this.f27584y == z4) {
            return;
        }
        this.f27584y = z4;
        this.B = z10;
        if (z4) {
            if (this.v == null) {
                ?? imageView = new ImageView(getContext());
                this.v = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.v.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.v.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(78.0f), 469762048));
                if (z10) {
                    this.v.setImageResource(R.drawable.filled_chatlist2);
                } else {
                    this.v.f(R.raw.large_message_lock, 80, 80, null);
                    this.v.setOnClickListener(new g0(this, 8));
                }
            }
            this.v.d();
            if (this.f27582w == null) {
                TextView textView = new TextView(getContext());
                this.f27582w = textView;
                textView.setTextAlignment(4);
                this.f27582w.setGravity(17);
                this.f27582w.setTextSize(1, 13.0f);
            }
            this.f27582w.setText(spannableStringBuilder);
            TextView textView2 = this.f27582w;
            textView2.setMaxWidth(qh.e3.a(textView2.getText(), this.f27582w.getPaint()));
            TextView textView3 = this.f27582w;
            int i10 = org.telegram.ui.ActionBar.k6.ic;
            org.telegram.ui.ActionBar.g6 g6Var = this.f27580r;
            textView3.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
            this.f27582w.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            if (this.f27583x == null) {
                fg.s0 s0Var = new fg.s0(getContext(), 4);
                this.f27583x = s0Var;
                s0Var.setTextAlignment(4);
                this.f27583x.setGravity(17);
                this.f27583x.setTypeface(AndroidUtilities.bold());
                this.f27583x.setTextSize(1, 14.0f);
                this.f27583x.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                fg.s0 s0Var2 = this.f27583x;
                int dp = AndroidUtilities.dp(15.0f);
                s0Var2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, 503316480, 855638016, 855638016));
                k7.e6.a(this.f27583x);
            }
            this.f27583x.setText(str);
            this.f27583x.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
            this.f27583x.setOnClickListener(onClickListener);
        }
        e();
    }

    public final void d(CharSequence charSequence, CharSequence charSequence2) {
        String trim;
        int i10;
        this.E = true;
        String str = null;
        if (charSequence == null) {
            trim = null;
        } else {
            trim = charSequence.toString().trim();
        }
        if (TextUtils.isEmpty(trim)) {
            charSequence = LocaleController.getString(R.string.NoMessages);
        }
        this.f27575b.setText(charSequence);
        if (charSequence2 != null) {
            str = charSequence2.toString().trim();
        }
        if (TextUtils.isEmpty(str)) {
            charSequence2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        }
        TextView textView = this.f27576c;
        textView.setText(charSequence2);
        if (textView.getText().length() > 60) {
            i10 = Math.min((int) (AndroidUtilities.displaySize.x * 0.5f), qh.e3.a(textView.getText(), textView.getPaint()));
        } else {
            i10 = (int) (AndroidUtilities.displaySize.x * 0.5f);
        }
        textView.setMaxWidth(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (!this.H) {
            org.telegram.ui.ActionBar.g6 g6Var = this.f27580r;
            if (g6Var != null) {
                g6Var.l(0.0f, this.F + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.G);
            } else {
                org.telegram.ui.ActionBar.k6.q(0.0f, this.F + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.G);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.k6.T0("paintChatActionBackground", g6Var));
        } else {
            canvas2 = canvas;
        }
        if (!this.f27581s) {
            this.f27581s = true;
            setSticker(this.f27574a);
        }
        super.dispatchDraw(canvas2);
    }

    public final void e() {
        int i10;
        removeAllViews();
        if (this.f27584y) {
            addView(this.v, k7.c6.t(78, 78, 49, 20, 9, 20, 9));
            boolean premiumFeaturesBlocked = MessagesController.getInstance(this.f27577e).premiumFeaturesBlocked();
            TextView textView = this.f27582w;
            if (premiumFeaturesBlocked) {
                i10 = 13;
            } else {
                i10 = 9;
            }
            addView(textView, k7.c6.t(-2, -2, 49, 20, 0, 20, i10));
            if (!premiumFeaturesBlocked) {
                fg.s0 s0Var = this.f27583x;
                if ((s0Var != null && !TextUtils.isEmpty(s0Var.getText())) || !this.B) {
                    addView(this.f27583x, k7.c6.t(-2, 30, 49, 20, 2, 20, 13));
                    return;
                }
                return;
            }
            return;
        }
        addView(this.f27575b, k7.c6.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f27576c, k7.c6.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f27578f, k7.c6.t(112, 112, 1, 16, 10, 16, 16));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f27574a == null) {
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.f27577e).getGreetingsSticker();
            this.f27574a = greetingsSticker;
            if (this.f27581s) {
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
        this.D = true;
        boolean z4 = this.E;
        TextView textView = this.f27576c;
        if (!z4) {
            textView.setVisibility(0);
        }
        this.h.setVisibility(0);
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() > View.MeasureSpec.getSize(i11) && !this.E) {
            textView.setVisibility(8);
            this.h.setVisibility(8);
        } else {
            if (!this.E) {
                textView.setVisibility(0);
            }
            this.h.setVisibility(0);
        }
        this.D = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.D) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        this.H = true;
    }

    public void setListener(go goVar) {
        this.d = goVar;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.f27581s = true;
        this.f27579n.b();
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.k6.f21811lc, 1.0f);
        if (svgThumb != null) {
            this.h.n(ImageLocation.getForDocument(document), b(document), svgThumb, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.j(ImageLocation.getForDocument(document), b(document), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), null, 0, document2);
        }
        this.h.setOnClickListener(new co(this, document2, 0));
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.f27581s = true;
        this.f27579n.b();
        this.h.j(ImageLocation.getForPath(str), "256_256", null, null, 0, null);
    }
}
