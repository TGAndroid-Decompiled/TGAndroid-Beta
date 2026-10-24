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
import java.util.HashSet;
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
public abstract class ro extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public static final int L = 0;
    public boolean E;
    public AnimatorSet F;
    public boolean G;
    public boolean H;
    public float I;
    public int J;
    public boolean K;
    public TLRPC.Document f30243a;
    public final TextView f30244b;
    public final TextView f30245c;
    public qo d;
    public final int e;
    public final FrameLayout f30246f;
    public u9 h;
    public u9 f30247n;
    public final org.telegram.ui.ActionBar.g6 f30248r;
    public boolean f30249s;
    public ak0 v;
    public TextView f30250w;
    public di.n f30251x;
    public boolean f30252y;

    public ro(Context context, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setOrientation(1);
        this.e = i10;
        this.f30248r = g6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.f30244b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextAlignment(4);
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.f30245c = textView2;
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30246f = frameLayout;
        u9 u9Var = new u9(context);
        this.h = u9Var;
        u9Var.getImageReceiver().setAspectFit(true);
        frameLayout.addView(this.h, w7.z5.c(112.0f, 112));
        w7.b6.a(this.h);
        u9 u9Var2 = new u9(context);
        this.f30247n = u9Var2;
        u9Var2.getImageReceiver().setAspectFit(true);
        frameLayout.addView(this.f30247n, w7.z5.c(112.0f, 112));
        this.f30247n.setVisibility(8);
        this.f30247n.setAlpha(0.0f);
        w7.b6.a(this.f30247n);
        e();
        updateColors();
        String string = LocaleController.getString(R.string.NoMessages);
        String string2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        textView.setText(string);
        textView2.setText(string2);
        textView2.setMaxWidth(ei.x3.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.f30243a = document;
        if (document == null) {
            this.f30243a = MediaDataController.getInstance(i10).getGreetingsSticker();
        }
    }

    public static void a(ro roVar) {
        AnimatorSet animatorSet = roVar.F;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        roVar.f30247n.setVisibility(0);
        roVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        roVar.F = animatorSet2;
        animatorSet2.setDuration(420L);
        roVar.F.setInterpolator(zr.h);
        roVar.F.addListener(new org.telegram.ui.ho(roVar));
        AnimatorSet animatorSet3 = roVar.F;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(roVar.f30247n, property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(roVar.f30247n, property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(roVar.f30247n, property3, 0.7f, 1.0f);
        u9 u9Var = roVar.f30247n;
        float[] fArr = {-AndroidUtilities.dp(24.0f), 0.0f};
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(u9Var, property4, fArr), ObjectAnimator.ofFloat(roVar.h, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(roVar.h, property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(roVar.h, property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(roVar.h, property4, 0.0f, AndroidUtilities.dp(24.0f)));
        roVar.F.start();
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
                    i11 = documentAttribute.f20351w;
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
        return a1.g.k((int) (f12 / f13), (int) (i13 / f13), "_");
    }

    public final void c(boolean z10, boolean z11, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        if (this.f30252y == z10) {
            return;
        }
        this.f30252y = z10;
        this.E = z11;
        if (z10) {
            if (this.v == null) {
                ?? imageView = new ImageView(getContext());
                this.v = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.v.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.v.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(78.0f), 469762048));
                if (z11) {
                    this.v.setImageResource(R.drawable.filled_chatlist2);
                } else {
                    this.v.f(R.raw.large_message_lock, 80, 80, null);
                    this.v.setOnClickListener(new f0(this, 7));
                }
            }
            this.v.d();
            if (this.f30250w == null) {
                TextView textView = new TextView(getContext());
                this.f30250w = textView;
                textView.setTextAlignment(4);
                this.f30250w.setGravity(17);
                this.f30250w.setTextSize(1, 13.0f);
            }
            this.f30250w.setText(spannableStringBuilder);
            TextView textView2 = this.f30250w;
            textView2.setMaxWidth(ei.x3.a(textView2.getText(), this.f30250w.getPaint()));
            TextView textView3 = this.f30250w;
            int i10 = org.telegram.ui.ActionBar.k6.f21278ic;
            org.telegram.ui.ActionBar.g6 g6Var = this.f30248r;
            org.telegram.ui.ActionBar.r6.W(textView3, i10, g6Var);
            this.f30250w.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            if (this.f30251x == null) {
                di.n nVar = new di.n(getContext(), 6);
                this.f30251x = nVar;
                nVar.setTextAlignment(4);
                this.f30251x.setGravity(17);
                this.f30251x.setTypeface(AndroidUtilities.bold());
                this.f30251x.setTextSize(1, 14.0f);
                this.f30251x.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                di.n nVar2 = this.f30251x;
                int dp = AndroidUtilities.dp(15.0f);
                nVar2.setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 503316480, 855638016, 855638016));
                w7.b6.a(this.f30251x);
            }
            this.f30251x.setText(str);
            org.telegram.ui.ActionBar.r6.W(this.f30251x, i10, g6Var);
            this.f30251x.setOnClickListener(onClickListener);
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
        this.f30244b.setText(charSequence);
        if (charSequence2 != null) {
            str = charSequence2.toString().trim();
        }
        if (TextUtils.isEmpty(str)) {
            charSequence2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        }
        TextView textView = this.f30245c;
        textView.setText(charSequence2);
        if (textView.getText().length() > 60) {
            i10 = Math.min((int) (AndroidUtilities.displaySize.x * 0.5f), ei.x3.a(textView.getText(), textView.getPaint()));
        } else {
            i10 = (int) (AndroidUtilities.displaySize.x * 0.5f);
        }
        textView.setMaxWidth(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (!this.K) {
            org.telegram.ui.ActionBar.g6 g6Var = this.f30248r;
            if (g6Var != null) {
                g6Var.b(0.0f, this.I + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.J);
            } else {
                org.telegram.ui.ActionBar.k6.q(0.0f, this.I + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.J);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.k6.V0("paintChatActionBackground", g6Var));
        } else {
            canvas2 = canvas;
        }
        if (!this.f30249s) {
            this.f30249s = true;
            setSticker(this.f30243a);
        }
        super.dispatchDraw(canvas2);
    }

    public final void e() {
        int i10;
        removeAllViews();
        if (this.f30252y) {
            addView(this.v, w7.z5.t(78, 78, 49, 20, 9, 20, 9));
            boolean premiumFeaturesBlocked = MessagesController.getInstance(this.e).premiumFeaturesBlocked();
            TextView textView = this.f30250w;
            if (premiumFeaturesBlocked) {
                i10 = 13;
            } else {
                i10 = 9;
            }
            addView(textView, w7.z5.t(-2, -2, 49, 20, 0, 20, i10));
            if (!premiumFeaturesBlocked) {
                di.n nVar = this.f30251x;
                if ((nVar != null && !TextUtils.isEmpty(nVar.getText())) || !this.E) {
                    addView(this.f30251x, w7.z5.t(-2, 30, 49, 20, 2, 20, 13));
                    return;
                }
                return;
            }
            return;
        }
        addView(this.f30244b, w7.z5.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f30245c, w7.z5.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f30246f, w7.z5.t(112, 112, 1, 16, 10, 16, 16));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f30243a == null) {
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.e).getGreetingsSticker();
            this.f30243a = greetingsSticker;
            if (this.f30249s) {
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
        TextView textView = this.f30245c;
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

    public void setListener(qo qoVar) {
        this.d = qoVar;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.f30249s = true;
        this.f30247n.b();
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.k6.f21334lc, 1.0f);
        if (svgThumb != null) {
            this.h.n(ImageLocation.getForDocument(document), b(document), svgThumb, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.j(ImageLocation.getForDocument(document), b(document), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), null, 0, document2);
        }
        this.h.setOnClickListener(new oo(this, document2, 0));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.g6 g6Var = this.f30248r;
        TextView textView = this.f30244b;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21278ic, g6Var));
        }
        TextView textView2 = this.f30245c;
        if (textView2 != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21278ic, g6Var));
        }
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.f30249s = true;
        this.f30247n.b();
        this.h.j(ImageLocation.getForPath(str), "256_256", null, null, 0, null);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
