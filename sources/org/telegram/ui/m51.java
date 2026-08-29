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
public final class m51 extends View {
    public Drawable A;
    public Rect B;
    public float C;
    public boolean D;
    public ValueAnimator E;
    public l51 F;
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
    public final c50 Q;
    public final d61 R;
    public boolean f40426a;
    public boolean f40427b;
    public int f40428c;
    public TLRPC.Document d;
    public org.telegram.ui.Components.y5 f40429e;
    public final ImageReceiver.BackgroundThreadDrawHolder[] f40430f;
    public ImageReceiver h;
    public final ImageReceiver f40431n;
    public ImageReceiver f40432r;
    public boolean f40433s;
    public TL_stars.TL_starGiftUnique v;
    public Integer f40434w;
    public kg.q0 f40435x;
    public boolean f40436y;

    public m51(d61 d61Var, Context context) {
        super(context);
        this.R = d61Var;
        this.f40426a = false;
        this.f40427b = false;
        this.f40430f = new ImageReceiver.BackgroundThreadDrawHolder[2];
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f40431n = imageReceiver;
        this.P = 1.0f;
        this.Q = new c50(this, 1);
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
        l51 l51Var = this.F;
        if (l51Var == null) {
            Context context = getContext();
            int i10 = cg.t1.H;
            this.F = new l51(this, context);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824);
            this.F.measure(makeMeasureSpec, makeMeasureSpec);
            l51 l51Var2 = this.F;
            l51Var2.layout(0, 0, l51Var2.getMeasuredWidth(), this.F.getMeasuredHeight());
            return;
        }
        l51Var.h = false;
        l51Var.f3381n = -1;
        if (l51Var.f3376a == 2 && (paint = l51Var.f3385x) != null) {
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        }
    }

    public final void c(TLRPC.Document document, f51 f51Var) {
        String str;
        this.d = document;
        a(f51Var);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f23223m6, 0.2f);
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
        this.f40429e = null;
    }

    public final void d(boolean z10, boolean z11) {
        float f9;
        if (this.H != z10) {
            this.H = z10;
            if (!z11) {
                float f10 = 0.0f;
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                this.N = f9;
                if (z10) {
                    f10 = 1.0f;
                }
                this.O = f10;
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
            ofFloat.addUpdateListener(new j51(this, 2));
            this.E.addListener(new k51(this, 2));
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
            ofFloat.addUpdateListener(new j51(this, 1));
            this.E.addListener(new k51(this, 1));
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
        if (kg.g0.f13716b || getParent() == null) {
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
        if (drawable instanceof org.telegram.ui.Components.p5) {
            ((org.telegram.ui.Components.p5) drawable).b(this.Q);
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.setParentView((View) getParent());
            this.h.onAttachedToWindow();
        }
        this.f40431n.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.D) {
            return;
        }
        this.D = false;
        Drawable drawable = this.A;
        if (drawable instanceof org.telegram.ui.Components.p5) {
            ((org.telegram.ui.Components.p5) drawable).p(this.Q);
            lh.x2 x2Var = ((org.telegram.ui.Components.p5) this.A).f31593k;
            if (x2Var != null) {
                x2Var.setEmojiPaused(false);
            }
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            this.h.setEmojiPaused(false);
        }
        this.f40431n.onDetachedFromWindow();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        org.telegram.ui.Components.y5 y5Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f40426a) {
            str = LocaleController.getString(R.string.RemoveStatus);
        } else {
            kg.q0 q0Var = this.f40435x;
            if (q0Var == null || (str = q0Var.f13825f) == null) {
                TLRPC.Document document = this.d;
                if (document == null && (y5Var = this.f40429e) != null && (document = y5Var.document) == null) {
                    document = org.telegram.ui.Components.p5.f(this.R.R, y5Var.getDocumentId());
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    public void setAnimatedScale(float f9) {
        this.P = f9;
    }

    public void setDrawable(Drawable drawable) {
        Drawable drawable2 = this.A;
        if (drawable2 != drawable) {
            boolean z10 = this.D;
            c50 c50Var = this.Q;
            if (z10 && drawable2 != null && (drawable2 instanceof org.telegram.ui.Components.p5)) {
                ((org.telegram.ui.Components.p5) drawable2).p(c50Var);
            }
            this.A = drawable;
            if (this.D && (drawable instanceof org.telegram.ui.Components.p5)) {
                ((org.telegram.ui.Components.p5) drawable).b(c50Var);
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
                float f9 = this.J;
                if (f9 != 0.0f && this.R.S != 14) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, 0.0f);
                    this.E = ofFloat;
                    ofFloat.addUpdateListener(new j51(this, 0));
                    this.E.addListener(new k51(this, 0));
                    this.E.setInterpolator(new OvershootInterpolator(5.0f));
                    this.E.setDuration(350L);
                    this.E.start();
                }
            }
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (kg.g0.f13716b) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
