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
public abstract class jo extends LinearLayout {
    public static final int L = 0;
    public boolean E;
    public AnimatorSet F;
    public boolean G;
    public boolean H;
    public float I;
    public int J;
    public boolean K;
    public TLRPC.Document f25365a;
    public final TextView f25366b;
    public final TextView f25367c;
    public io d;
    public final int e;
    public final FrameLayout f25368f;
    public u9 h;
    public u9 f25369n;
    public final org.telegram.ui.ActionBar.f6 f25370r;
    public boolean f25371s;
    public bj0 v;
    public TextView f25372w;
    public bi.o f25373x;
    public boolean f25374y;

    public jo(Context context, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        setOrientation(1);
        this.e = i10;
        this.f25370r = f6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.f25366b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextAlignment(4);
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.f25367c = textView2;
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25368f = frameLayout;
        u9 u9Var = new u9(context);
        this.h = u9Var;
        u9Var.getImageReceiver().setAspectFit(true);
        frameLayout.addView(this.h, w7.x5.c(112.0f, 112));
        w7.z5.a(this.h);
        u9 u9Var2 = new u9(context);
        this.f25369n = u9Var2;
        u9Var2.getImageReceiver().setAspectFit(true);
        frameLayout.addView(this.f25369n, w7.x5.c(112.0f, 112));
        this.f25369n.setVisibility(8);
        this.f25369n.setAlpha(0.0f);
        w7.z5.a(this.f25369n);
        e();
        int i11 = org.telegram.ui.ActionBar.j6.f18958ic;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        String string = LocaleController.getString(R.string.NoMessages);
        String string2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        textView.setText(string);
        textView2.setText(string2);
        textView2.setMaxWidth(ci.f4.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.f25365a = document;
        if (document == null) {
            this.f25365a = MediaDataController.getInstance(i10).getGreetingsSticker();
        }
    }

    public static void a(jo joVar) {
        AnimatorSet animatorSet = joVar.F;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        joVar.f25369n.setVisibility(0);
        joVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        joVar.F = animatorSet2;
        animatorSet2.setDuration(420L);
        joVar.F.setInterpolator(qr.h);
        joVar.F.addListener(new aa(joVar));
        AnimatorSet animatorSet3 = joVar.F;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(joVar.f25369n, property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(joVar.f25369n, property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(joVar.f25369n, property3, 0.7f, 1.0f);
        u9 u9Var = joVar.f25369n;
        float[] fArr = {-AndroidUtilities.dp(24.0f), 0.0f};
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(u9Var, property4, fArr), ObjectAnimator.ofFloat(joVar.h, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(joVar.h, property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(joVar.h, property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(joVar.h, property4, 0.0f, AndroidUtilities.dp(24.0f)));
        joVar.F.start();
    }

    public static String b(TLRPC.Document document) {
        float min;
        float f7;
        int i10;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            f7 = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f7 = 0.5f;
        }
        float f10 = min * f7;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 < document.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                    i11 = documentAttribute.f18128w;
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
        return a4.a.k((int) (f12 / f13), (int) (i13 / f13), "_");
    }

    public final void c(boolean z10, boolean z11, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        if (this.f25374y == z10) {
            return;
        }
        this.f25374y = z10;
        this.E = z11;
        if (z10) {
            if (this.v == null) {
                ?? imageView = new ImageView(getContext());
                this.v = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.v.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.v.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(78.0f), 469762048));
                if (z11) {
                    this.v.setImageResource(R.drawable.filled_chatlist2);
                } else {
                    this.v.f(R.raw.large_message_lock, 80, 80, null);
                    this.v.setOnClickListener(new f0(this, 8));
                }
            }
            this.v.d();
            if (this.f25372w == null) {
                TextView textView = new TextView(getContext());
                this.f25372w = textView;
                textView.setTextAlignment(4);
                this.f25372w.setGravity(17);
                this.f25372w.setTextSize(1, 13.0f);
            }
            this.f25372w.setText(spannableStringBuilder);
            TextView textView2 = this.f25372w;
            textView2.setMaxWidth(ci.f4.a(textView2.getText(), this.f25372w.getPaint()));
            TextView textView3 = this.f25372w;
            int i10 = org.telegram.ui.ActionBar.j6.f18958ic;
            org.telegram.ui.ActionBar.f6 f6Var = this.f25370r;
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            this.f25372w.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            if (this.f25373x == null) {
                bi.o oVar = new bi.o(getContext(), 6);
                this.f25373x = oVar;
                oVar.setTextAlignment(4);
                this.f25373x.setGravity(17);
                this.f25373x.setTypeface(AndroidUtilities.bold());
                this.f25373x.setTextSize(1, 14.0f);
                this.f25373x.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                bi.o oVar2 = this.f25373x;
                int dp = AndroidUtilities.dp(15.0f);
                oVar2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 503316480, 855638016, 855638016));
                w7.z5.a(this.f25373x);
            }
            this.f25373x.setText(str);
            this.f25373x.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            this.f25373x.setOnClickListener(onClickListener);
        }
        e();
    }

    public final void d(CharSequence charSequence, CharSequence charSequence2) {
        String trim;
        int i10;
        this.H = true;
        String str = null;
        if (charSequence == null) {
            trim = null;
        } else {
            trim = charSequence.toString().trim();
        }
        if (TextUtils.isEmpty(trim)) {
            charSequence = LocaleController.getString(R.string.NoMessages);
        }
        this.f25366b.setText(charSequence);
        if (charSequence2 != null) {
            str = charSequence2.toString().trim();
        }
        if (TextUtils.isEmpty(str)) {
            charSequence2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        }
        TextView textView = this.f25367c;
        textView.setText(charSequence2);
        if (textView.getText().length() > 60) {
            i10 = Math.min((int) (AndroidUtilities.displaySize.x * 0.5f), ci.f4.a(textView.getText(), textView.getPaint()));
        } else {
            i10 = (int) (AndroidUtilities.displaySize.x * 0.5f);
        }
        textView.setMaxWidth(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (!this.K) {
            org.telegram.ui.ActionBar.f6 f6Var = this.f25370r;
            if (f6Var != null) {
                f6Var.m(0.0f, this.I + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.J);
            } else {
                org.telegram.ui.ActionBar.j6.q(0.0f, this.I + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.J);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.T0("paintChatActionBackground", f6Var));
        } else {
            canvas2 = canvas;
        }
        if (!this.f25371s) {
            this.f25371s = true;
            setSticker(this.f25365a);
        }
        super.dispatchDraw(canvas2);
    }

    public final void e() {
        int i10;
        removeAllViews();
        if (this.f25374y) {
            addView(this.v, w7.x5.t(78, 78, 49, 20, 9, 20, 9));
            boolean premiumFeaturesBlocked = MessagesController.getInstance(this.e).premiumFeaturesBlocked();
            TextView textView = this.f25372w;
            if (premiumFeaturesBlocked) {
                i10 = 13;
            } else {
                i10 = 9;
            }
            addView(textView, w7.x5.t(-2, -2, 49, 20, 0, 20, i10));
            if (!premiumFeaturesBlocked) {
                bi.o oVar = this.f25373x;
                if ((oVar != null && !TextUtils.isEmpty(oVar.getText())) || !this.E) {
                    addView(this.f25373x, w7.x5.t(-2, 30, 49, 20, 2, 20, 13));
                    return;
                }
                return;
            }
            return;
        }
        addView(this.f25366b, w7.x5.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f25367c, w7.x5.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f25368f, w7.x5.t(112, 112, 1, 16, 10, 16, 16));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f25365a == null) {
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.e).getGreetingsSticker();
            this.f25365a = greetingsSticker;
            if (this.f25371s) {
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
        this.G = true;
        boolean z10 = this.H;
        TextView textView = this.f25367c;
        if (!z10) {
            textView.setVisibility(0);
        }
        this.h.setVisibility(0);
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() > View.MeasureSpec.getSize(i11) && !this.H) {
            textView.setVisibility(8);
            this.h.setVisibility(8);
        } else {
            if (!this.H) {
                textView.setVisibility(0);
            }
            this.h.setVisibility(0);
        }
        this.G = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        this.K = true;
    }

    public void setListener(io ioVar) {
        this.d = ioVar;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.f25371s = true;
        this.f25369n.b();
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.f19014lc, 1.0f);
        if (svgThumb != null) {
            this.h.n(ImageLocation.getForDocument(document), b(document), svgThumb, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.j(ImageLocation.getForDocument(document), b(document), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), null, 0, document2);
        }
        this.h.setOnClickListener(new go(this, document2, 0));
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.f25371s = true;
        this.f25369n.b();
        this.h.j(ImageLocation.getForPath(str), "256_256", null, null, 0, null);
    }
}
