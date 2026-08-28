package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k51 extends View {
    public Drawable A;
    public Rect B;
    public float C;
    public boolean D;
    public ValueAnimator E;
    public j51 F;
    public Emoji.EmojiDrawable G;
    public boolean H;
    public boolean I;
    public float J;
    public float K;
    public int L;
    public boolean M;
    public float N;
    public float O;
    public float P;
    public final a50 Q;
    public final b61 R;
    public boolean f39710a;
    public boolean f39711b;
    public int f39712c;
    public TLRPC.Document d;
    public org.telegram.ui.Components.t5 f39713e;
    public final ImageReceiver.BackgroundThreadDrawHolder[] f39714f;
    public ImageReceiver h;
    public final ImageReceiver f39715n;
    public ImageReceiver f39716r;
    public boolean f39717s;
    public TL_stars.TL_starGiftUnique v;
    public Integer f39718w;
    public hg.r0 f39719x;
    public boolean f39720y;

    public k51(b61 b61Var, Context context) {
        super(context);
        this.R = b61Var;
        this.f39710a = false;
        this.f39711b = false;
        this.f39714f = new ImageReceiver.BackgroundThreadDrawHolder[2];
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f39715n = imageReceiver;
        this.P = 1.0f;
        this.Q = new a50(this, 1);
        imageReceiver.ignoreNotifications = true;
        setFocusable(true);
    }

    public final void a(View view) {
        if (this.h == null) {
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.h = imageReceiver;
            imageReceiver.setLayerNum(7);
            if (this.D) {
                this.h.onAttachedToWindow();
            }
            this.h.setAspectFit(true);
        }
    }

    public final void b() {
        Paint paint;
        j51 j51Var = this.F;
        if (j51Var == null) {
            Context context = getContext();
            int i9 = zf.b1.H;
            this.F = new j51(this, context);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824);
            this.F.measure(makeMeasureSpec, makeMeasureSpec);
            j51 j51Var2 = this.F;
            j51Var2.layout(0, 0, j51Var2.getMeasuredWidth(), this.F.getMeasuredHeight());
            return;
        }
        j51Var.h = false;
        j51Var.f50472n = -1;
        if (j51Var.f50467a == 2 && (paint = j51Var.f50476x) != null) {
            paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        }
    }

    public final void c(TLRPC.Document document, d51 d51Var) {
        String str;
        this.d = document;
        a(d51Var);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.f6.f23162m6, 0.2f);
        if (this.R.S == 6) {
            ImageReceiver imageReceiver = this.h;
            ImageLocation forDocument = ImageLocation.getForDocument(document);
            if (!LiteMode.isEnabled(16388)) {
                str = "34_34_firstframe";
            } else {
                str = "34_34";
            }
            imageReceiver.setImage(forDocument, str, null, null, svgThumb, document.size, null, document, 0);
        } else {
            this.h.setImage(ImageLocation.getForDocument(document), "100_100_firstframe", null, null, svgThumb, 0L, "tgs", document, 0);
        }
        this.M = true;
        this.f39713e = null;
    }

    public final void d(boolean z10, boolean z11) {
        float f10;
        if (this.H != z10) {
            this.H = z10;
            if (!z11) {
                float f11 = 0.0f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.N = f10;
                if (z10) {
                    f11 = 1.0f;
                }
                this.O = f11;
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        if (!this.H && z10 && z11 && this.R.S != 14) {
            this.I = true;
            this.O = 1.0f;
            this.N = 1.0f;
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.E.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, 1.6f, 0.7f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new h51(this, 2));
            this.E.addListener(new i51(this, 2));
            this.E.setInterpolator(new LinearInterpolator());
            this.E.setDuration(200L);
            this.E.start();
            return;
        }
        this.I = false;
        d(z10, z11);
    }

    public final void f() {
        if (this.H && this.R.S != 14) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.E.cancel();
            }
            this.J = 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new h51(this, 1));
            this.E.addListener(new i51(this, 1));
            this.E.setInterpolator(new OvershootInterpolator(5.0f));
            this.E.setDuration(350L);
            this.E.start();
            d(false, true);
        }
    }

    public float getAnimatedScale() {
        return this.P;
    }

    @Override
    public final void invalidate() {
        if (hg.h0.f10609b || getParent() == null) {
            return;
        }
        ((View) getParent()).invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.D) {
            return;
        }
        this.D = true;
        Drawable drawable = this.A;
        if (drawable instanceof org.telegram.ui.Components.k5) {
            ((org.telegram.ui.Components.k5) drawable).b(this.Q);
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.setParentView((View) getParent());
            this.h.onAttachedToWindow();
        }
        this.f39715n.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.D) {
            return;
        }
        this.D = false;
        Drawable drawable = this.A;
        if (drawable instanceof org.telegram.ui.Components.k5) {
            ((org.telegram.ui.Components.k5) drawable).p(this.Q);
            ih.z2 z2Var = ((org.telegram.ui.Components.k5) this.A).f29951k;
            if (z2Var != null) {
                z2Var.setEmojiPaused(false);
            }
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            this.h.setEmojiPaused(false);
        }
        this.f39715n.onDetachedFromWindow();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        org.telegram.ui.Components.t5 t5Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f39710a) {
            str = LocaleController.getString(R.string.RemoveStatus);
        } else {
            hg.r0 r0Var = this.f39719x;
            if (r0Var == null || (str = r0Var.f10717f) == null) {
                TLRPC.Document document = this.d;
                if (document == null && (t5Var = this.f39713e) != null && (document = t5Var.document) == null) {
                    document = org.telegram.ui.Components.k5.f(this.R.R, t5Var.getDocumentId());
                }
                if (document != null) {
                    str = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    str = null;
                }
            }
        }
        if (str != null) {
            accessibilityNodeInfo.setContentDescription(str);
        }
        accessibilityNodeInfo.setSelected(this.H);
        accessibilityNodeInfo.setClickable(true);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824));
    }

    public void setAnimatedScale(float f10) {
        this.P = f10;
    }

    public void setDrawable(Drawable drawable) {
        Drawable drawable2 = this.A;
        if (drawable2 != drawable) {
            boolean z10 = this.D;
            a50 a50Var = this.Q;
            if (z10 && drawable2 != null && (drawable2 instanceof org.telegram.ui.Components.k5)) {
                ((org.telegram.ui.Components.k5) drawable2).p(a50Var);
            }
            this.A = drawable;
            if (this.D && (drawable instanceof org.telegram.ui.Components.k5)) {
                ((org.telegram.ui.Components.k5) drawable).b(a50Var);
            }
        }
    }

    public void setEmojicon(String str) {
        if (TextUtils.isEmpty(str)) {
            this.G = null;
        } else {
            this.G = Emoji.getEmojiDrawable(str);
        }
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.E) != null) {
                valueAnimator.removeAllListeners();
                this.E.cancel();
            }
            if (!z10) {
                float f10 = this.J;
                if (f10 != 0.0f && this.R.S != 14) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.E = ofFloat;
                    ofFloat.addUpdateListener(new h51(this, 0));
                    this.E.addListener(new i51(this, 0));
                    this.E.setInterpolator(new OvershootInterpolator(5.0f));
                    this.E.setDuration(350L);
                    this.E.start();
                }
            }
        }
    }

    @Override
    public final void invalidate(int i9, int i10, int i11, int i12) {
        if (hg.h0.f10609b) {
            return;
        }
        super.invalidate(i9, i10, i11, i12);
    }
}
