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
public abstract class yn extends LinearLayout {
    public static final int H = 0;
    public boolean A;
    public AnimatorSet B;
    public boolean C;
    public boolean D;
    public float E;
    public int F;
    public boolean G;
    public TLRPC.Document f35028a;
    public final TextView f35029b;
    public final TextView f35030c;
    public xn d;
    public final int f35031e;
    public final FrameLayout f35032f;
    public o9 h;
    public o9 f35033n;
    public final org.telegram.ui.ActionBar.b6 f35034r;
    public boolean f35035s;
    public pi0 v;
    public TextView f35036w;
    public bh.e f35037x;
    public boolean f35038y;

    public yn(Context context, int i9, TLRPC.Document document, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        setOrientation(1);
        this.f35031e = i9;
        this.f35034r = b6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.f35029b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextAlignment(4);
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.f35030c = textView2;
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35032f = frameLayout;
        o9 o9Var = new o9(context);
        this.h = o9Var;
        o9Var.getImageReceiver().setAspectFit(true);
        frameLayout.addView(this.h, g7.e6.c(112.0f, 112));
        g7.g6.a(this.h);
        o9 o9Var2 = new o9(context);
        this.f35033n = o9Var2;
        o9Var2.getImageReceiver().setAspectFit(true);
        frameLayout.addView(this.f35033n, g7.e6.c(112.0f, 112));
        this.f35033n.setVisibility(8);
        this.f35033n.setAlpha(0.0f);
        g7.g6.a(this.f35033n);
        e();
        int i10 = org.telegram.ui.ActionBar.f6.f23097ic;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        String string = LocaleController.getString(R.string.NoMessages);
        String string2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        textView.setText(string);
        textView2.setText(string2);
        textView2.setMaxWidth(kh.x3.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.f35028a = document;
        if (document == null) {
            this.f35028a = MediaDataController.getInstance(i9).getGreetingsSticker();
        }
    }

    public static void a(yn ynVar) {
        AnimatorSet animatorSet = ynVar.B;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ynVar.f35033n.setVisibility(0);
        ynVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ynVar.B = animatorSet2;
        animatorSet2.setDuration(420L);
        ynVar.B.setInterpolator(gr.h);
        ynVar.B.addListener(new u9(ynVar));
        AnimatorSet animatorSet3 = ynVar.B;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ynVar.f35033n, property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ynVar.f35033n, property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ynVar.f35033n, property3, 0.7f, 1.0f);
        o9 o9Var = ynVar.f35033n;
        float[] fArr = {-AndroidUtilities.dp(24.0f), 0.0f};
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(o9Var, property4, fArr), ObjectAnimator.ofFloat(ynVar.h, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(ynVar.h, property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(ynVar.h, property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(ynVar.h, property4, 0.0f, AndroidUtilities.dp(24.0f)));
        ynVar.B.start();
    }

    public static String b(TLRPC.Document document) {
        float min;
        float f10;
        int i9;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            f10 = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f10 = 0.5f;
        }
        float f11 = min * f10;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < document.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                    i10 = documentAttribute.f22387w;
                    i9 = documentAttribute.h;
                    break;
                }
                i11++;
            } else {
                i9 = 0;
                break;
            }
        }
        if (MessageObject.isAnimatedStickerDocument(document, true) && i10 == 0 && i9 == 0) {
            i10 = 512;
            i9 = 512;
        }
        if (i10 == 0) {
            i9 = (int) f11;
            i10 = AndroidUtilities.dp(100.0f) + i9;
        }
        int i12 = (int) ((f11 / i10) * i9);
        int i13 = (int) f11;
        float f12 = i12;
        if (f12 > f11) {
            i13 = (int) ((f11 / f12) * i13);
            i12 = i13;
        }
        float f13 = i13;
        float f14 = AndroidUtilities.density;
        Locale locale = Locale.US;
        return e2.c.l((int) (f13 / f14), "_", (int) (i12 / f14));
    }

    public final void c(boolean z10, boolean z11, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        if (this.f35038y == z10) {
            return;
        }
        this.f35038y = z10;
        this.A = z11;
        if (z10) {
            if (this.v == null) {
                ?? imageView = new ImageView(getContext());
                this.v = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.v.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.v.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(78.0f), 469762048));
                if (z11) {
                    this.v.setImageResource(R.drawable.filled_chatlist2);
                } else {
                    this.v.f(R.raw.large_message_lock, 80, 80, null);
                    this.v.setOnClickListener(new f0(this, 8));
                }
            }
            this.v.d();
            if (this.f35036w == null) {
                TextView textView = new TextView(getContext());
                this.f35036w = textView;
                textView.setTextAlignment(4);
                this.f35036w.setGravity(17);
                this.f35036w.setTextSize(1, 13.0f);
            }
            this.f35036w.setText(spannableStringBuilder);
            TextView textView2 = this.f35036w;
            textView2.setMaxWidth(kh.x3.a(textView2.getText(), this.f35036w.getPaint()));
            TextView textView3 = this.f35036w;
            int i9 = org.telegram.ui.ActionBar.f6.f23097ic;
            org.telegram.ui.ActionBar.b6 b6Var = this.f35034r;
            textView3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            this.f35036w.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            if (this.f35037x == null) {
                bh.e eVar = new bh.e(getContext(), 6);
                this.f35037x = eVar;
                eVar.setTextAlignment(4);
                this.f35037x.setGravity(17);
                this.f35037x.setTypeface(AndroidUtilities.bold());
                this.f35037x.setTextSize(1, 14.0f);
                this.f35037x.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                bh.e eVar2 = this.f35037x;
                int dp = AndroidUtilities.dp(15.0f);
                eVar2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 503316480, 855638016, 855638016));
                g7.g6.a(this.f35037x);
            }
            this.f35037x.setText(str);
            this.f35037x.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            this.f35037x.setOnClickListener(onClickListener);
        }
        e();
    }

    public final void d(CharSequence charSequence, CharSequence charSequence2) {
        String trim;
        int i9;
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
        this.f35029b.setText(charSequence);
        if (charSequence2 != null) {
            str = charSequence2.toString().trim();
        }
        if (TextUtils.isEmpty(str)) {
            charSequence2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        }
        TextView textView = this.f35030c;
        textView.setText(charSequence2);
        if (textView.getText().length() > 60) {
            i9 = Math.min((int) (AndroidUtilities.displaySize.x * 0.5f), kh.x3.a(textView.getText(), textView.getPaint()));
        } else {
            i9 = (int) (AndroidUtilities.displaySize.x * 0.5f);
        }
        textView.setMaxWidth(i9);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (!this.G) {
            org.telegram.ui.ActionBar.b6 b6Var = this.f35034r;
            if (b6Var != null) {
                b6Var.o(0.0f, this.E + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.F);
            } else {
                org.telegram.ui.ActionBar.f6.q(0.0f, this.E + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.F);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.f6.T0("paintChatActionBackground", b6Var));
        } else {
            canvas2 = canvas;
        }
        if (!this.f35035s) {
            this.f35035s = true;
            setSticker(this.f35028a);
        }
        super.dispatchDraw(canvas2);
    }

    public final void e() {
        int i9;
        removeAllViews();
        if (this.f35038y) {
            addView(this.v, g7.e6.t(78, 78, 49, 20, 9, 20, 9));
            boolean premiumFeaturesBlocked = MessagesController.getInstance(this.f35031e).premiumFeaturesBlocked();
            TextView textView = this.f35036w;
            if (premiumFeaturesBlocked) {
                i9 = 13;
            } else {
                i9 = 9;
            }
            addView(textView, g7.e6.t(-2, -2, 49, 20, 0, 20, i9));
            if (!premiumFeaturesBlocked) {
                bh.e eVar = this.f35037x;
                if ((eVar != null && !TextUtils.isEmpty(eVar.getText())) || !this.A) {
                    addView(this.f35037x, g7.e6.t(-2, 30, 49, 20, 2, 20, 13));
                    return;
                }
                return;
            }
            return;
        }
        addView(this.f35029b, g7.e6.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f35030c, g7.e6.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f35032f, g7.e6.t(112, 112, 1, 16, 10, 16, 16));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f35028a == null) {
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.f35031e).getGreetingsSticker();
            this.f35028a = greetingsSticker;
            if (this.f35035s) {
                setSticker(greetingsSticker);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public void onMeasure(int i9, int i10) {
        this.C = true;
        boolean z10 = this.D;
        TextView textView = this.f35030c;
        if (!z10) {
            textView.setVisibility(0);
        }
        this.h.setVisibility(0);
        super.onMeasure(i9, i10);
        if (getMeasuredHeight() > View.MeasureSpec.getSize(i10) && !this.D) {
            textView.setVisibility(8);
            this.h.setVisibility(8);
        } else {
            if (!this.D) {
                textView.setVisibility(0);
            }
            this.h.setVisibility(0);
        }
        this.C = false;
        super.onMeasure(i9, i10);
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

    public void setListener(xn xnVar) {
        this.d = xnVar;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.f35035s = true;
        this.f35033n.b();
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.f6.f23150lc, 1.0f);
        if (svgThumb != null) {
            this.h.n(ImageLocation.getForDocument(document), b(document), svgThumb, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.j(ImageLocation.getForDocument(document), b(document), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), null, 0, document2);
        }
        this.h.setOnClickListener(new vn(this, document2, 0));
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.f35035s = true;
        this.f35033n.b();
        this.h.j(ImageLocation.getForPath(str), "256_256", null, null, 0, null);
    }
}
