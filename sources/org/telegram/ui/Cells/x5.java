package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.zq;
import org.telegram.ui.PhotoViewer;
public final class x5 extends FrameLayout {
    public static final Rect f25700a0 = new Rect();
    public boolean E;
    public final boolean F;
    public MediaController.PhotoEntry G;
    public MediaController.SearchImage H;
    public final Paint I;
    public AnimatorSet J;
    public final org.telegram.ui.ActionBar.u6 K;
    public xh.g L;
    public xh.f M;
    public boolean N;
    public boolean O;
    public long P;
    public boolean Q;
    public Bitmap R;
    public Float S;
    public float T;
    public v5 U;
    public SpannableString V;
    public SpannableString W;
    public final t5 f25701a;
    public final s5 f25702b;
    public final FrameLayout f25703c;
    public final aq d;
    public final ImageView e;
    public final TextView f25704f;
    public final u5 h;
    public AnimatorSet f25705n;
    public boolean f25706r;
    public boolean f25707s;
    public boolean v;
    public w5 f25708w;
    public boolean f25709x;
    public int f25710y;

    public x5(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.F = true;
        this.I = new Paint();
        new Path();
        this.T = 1.0f;
        this.K = u6Var;
        setWillNotDraw(false);
        s5 s5Var = new s5(this, context);
        this.f25702b = s5Var;
        addView(s5Var, kb1.g(80.0f, 80));
        t5 t5Var = new t5(this, context);
        this.f25701a = t5Var;
        t5Var.setBlurAllowed(true);
        s5Var.addView(t5Var, kb1.g(-1.0f, -1));
        u5 u5Var = new u5(context, 0);
        u5Var.f25487b = new RectF();
        this.h = u5Var;
        u5Var.setWillNotDraw(false);
        u5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        s5Var.addView(u5Var, kb1.h(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        u5Var.addView(imageView, kb1.i(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f25704f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        u5Var.addView(textView, kb1.h(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        aq aqVar = new aq(context, 24, u6Var);
        this.d = aqVar;
        aqVar.setDrawBackgroundAsArc(7);
        aqVar.b(org.telegram.ui.ActionBar.y6.W9, org.telegram.ui.ActionBar.y6.X9, org.telegram.ui.ActionBar.y6.V9);
        addView(aqVar, kb1.h(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        aqVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25703c = frameLayout;
        addView(frameLayout, kb1.h(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.f25710y = AndroidUtilities.dp(80.0f);
    }

    public final boolean a() {
        return this.d.f26634a.f26091q;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        float f7;
        float f10;
        this.d.f26634a.f(i10, z10, z11);
        boolean z12 = false;
        if (this.f25709x) {
            AnimatorSet animatorSet = this.J;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.J = null;
            }
            float f11 = 1.0f;
            s5 s5Var = this.f25702b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.J = animatorSet2;
                if (z10) {
                    f10 = 0.787f;
                } else {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(s5Var, View.SCALE_X, f10);
                if (z10) {
                    f11 = 0.787f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(s5Var, View.SCALE_Y, f11));
                this.J.setDuration(200L);
                this.J.addListener(new bh.f0(24, this, z10));
                this.J.start();
            } else {
                if (z10) {
                    f7 = 0.787f;
                } else {
                    f7 = 1.0f;
                }
                s5Var.setScaleX(f7);
                if (z10) {
                    f11 = 0.787f;
                }
                s5Var.setScaleY(f11);
            }
        }
        MediaController.PhotoEntry photoEntry = this.G;
        if (photoEntry != null && photoEntry.isHighQuality() && a()) {
            z12 = true;
        }
        setHighQuality(z12);
    }

    public final void c(boolean z10, Float f7) {
        if (this.N != z10) {
            boolean isLaidOut = isLaidOut();
            t5 t5Var = this.f25701a;
            if (isLaidOut) {
                Bitmap bitmap = this.R;
                this.R = AndroidUtilities.snapshotView(t5Var);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.T = 0.0f;
            } else {
                Bitmap bitmap2 = this.R;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.R = null;
                }
                this.T = 1.0f;
            }
            this.N = z10;
            this.S = f7;
            t5Var.setHasBlur(z10);
            t5Var.invalidate();
            if (z10) {
                h(z10);
            }
        }
    }

    @Override
    public final void clearAnimation() {
        float f7;
        super.clearAnimation();
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.J = null;
            aq aqVar = this.d;
            float f10 = 1.0f;
            if (aqVar.f26634a.f26091q) {
                f7 = 0.787f;
            } else {
                f7 = 1.0f;
            }
            s5 s5Var = this.f25702b;
            s5Var.setScaleX(f7);
            if (aqVar.f26634a.f26091q) {
                f10 = 0.787f;
            }
            s5Var.setScaleY(f10);
        }
    }

    public final void d(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        float f7;
        boolean z15 = false;
        this.v = false;
        this.G = photoEntry;
        this.f25706r = z12;
        this.f25707s = z13;
        boolean z16 = photoEntry.isVideo;
        float f10 = 0.0f;
        ImageView imageView = this.e;
        TextView textView = this.f25704f;
        u5 u5Var = this.h;
        t5 t5Var = this.f25701a;
        if (z16 && !photoEntry.isLivePhoto()) {
            t5Var.q(0, true);
            u5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
            textView.setText(AndroidUtilities.formatShortDuration(this.G.duration));
        } else if (this.G.isHighQuality() && a()) {
            u5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
            textView.setText(LocaleController.getString(R.string.ShortHighQuality));
        } else {
            imageView.setVisibility(8);
            u5Var.setVisibility(4);
        }
        MediaController.PhotoEntry photoEntry2 = this.G;
        String str = photoEntry2.coverPath;
        if (str != null) {
            t5Var.g(str, null, org.telegram.ui.ActionBar.y6.R4);
        } else {
            String str2 = photoEntry2.thumbPath;
            if (str2 != null) {
                t5Var.g(str2, null, org.telegram.ui.ActionBar.y6.R4);
            } else if (photoEntry2.path != null) {
                if (photoEntry2.isVideo && !photoEntry2.isLivePhoto()) {
                    t5Var.g("vthumb://" + this.G.imageId + ":" + this.G.path, null, org.telegram.ui.ActionBar.y6.R4);
                } else {
                    MediaController.PhotoEntry photoEntry3 = this.G;
                    t5Var.p(photoEntry3.orientation, photoEntry3.invert, true);
                    t5Var.g("thumb://" + this.G.imageId + ":" + this.G.path, null, org.telegram.ui.ActionBar.y6.R4);
                }
            } else {
                t5Var.setImageDrawable(org.telegram.ui.ActionBar.y6.R4);
            }
        }
        if (z11 && PhotoViewer.P1(this.G.path)) {
            z14 = true;
        } else {
            z14 = false;
        }
        t5Var.getImageReceiver().setVisible(!z14, true);
        if (z14) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.d.setAlpha(f7);
        if (!z14) {
            f10 = 1.0f;
        }
        u5Var.setAlpha(f10);
        requestLayout();
        setHasSpoiler(photoEntry.hasSpoiler);
        if (photoEntry.isHighQuality() && a()) {
            z15 = true;
        }
        setHighQuality(z15);
        f(photoEntry.starsAmount, z10);
    }

    public final void e(org.telegram.messenger.MediaController.SearchImage r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.x5.e(org.telegram.messenger.MediaController$SearchImage):void");
    }

    public final void f(long j10, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        if (z10 == this.Q && j10 == this.P) {
            return;
        }
        this.P = j10;
        this.Q = z10;
        if (j10 > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.V == null) {
                this.V = new SpannableString("⭐");
                zq zqVar = new zq(R.drawable.star_small_inner, 0);
                zqVar.setScale(0.7f, 0.7f);
                SpannableString spannableString = this.V;
                spannableString.setSpan(zqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.V);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.W == null) {
                    this.W = new SpannableString("l");
                    zq zqVar2 = new zq(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.W;
                    spannableString2.setSpan(zqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.W);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j10));
            }
        } else {
            spannableStringBuilder = null;
        }
        t5 t5Var = this.f25701a;
        t5Var.setBlurredText(spannableStringBuilder);
        t5Var.invalidate();
        this.f25702b.invalidate();
    }

    public final void g(boolean z10) {
        float f7;
        float f10 = 1.0f;
        aq aqVar = this.d;
        if (!z10 || aqVar.getAlpha() != 1.0f) {
            if (!z10 && aqVar.getAlpha() == 0.0f) {
                return;
            }
            AnimatorSet animatorSet = this.f25705n;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f25705n = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f25705n = animatorSet2;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            this.f25705n.setDuration(180L);
            AnimatorSet animatorSet3 = this.f25705n;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float[] fArr = {f7};
            u5 u5Var = this.h;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u5Var, property, fArr);
            if (!z10) {
                f10 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(aqVar, property, f10));
            this.f25705n.addListener(new kg.e(this, 15));
            this.f25705n.start();
        }
    }

    public aq getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.f25703c;
    }

    public org.telegram.ui.Components.y9 getImageView() {
        return this.f25701a;
    }

    public MediaController.PhotoEntry getPhotoEntry() {
        return this.G;
    }

    public float getScale() {
        return this.f25702b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z10) {
        t5 t5Var;
        s5 s5Var = this.f25702b;
        if (s5Var != null && (t5Var = this.f25701a) != null && t5Var.getMeasuredHeight() > 0 && t5Var.getMeasuredWidth() > 0) {
            if (z10) {
                if (this.M == null) {
                    this.M = xh.f.e(s5Var);
                    return;
                }
                return;
            }
            xh.f fVar = this.M;
            if (fVar != null) {
                fVar.b(this);
                this.M = null;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xh.f fVar = this.M;
        if (fVar != null) {
            if (fVar.f51913i) {
                this.M = xh.f.e(this);
            } else {
                fVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xh.f fVar = this.M;
        if (fVar != null) {
            fVar.b(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        MediaController.PhotoEntry photoEntry;
        MediaController.SearchImage searchImage;
        boolean z10 = this.d.f26634a.f26091q;
        t5 t5Var = this.f25701a;
        if (!z10 && this.f25702b.getScaleX() == 1.0f && t5Var.getImageReceiver().hasNotThumb() && t5Var.getImageReceiver().getCurrentAlpha() == 1.0f && (((photoEntry = this.G) == null || !PhotoViewer.P1(photoEntry.path)) && ((searchImage = this.H) == null || !PhotoViewer.P1(searchImage.getPathToAttach())))) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.X9, this.K);
        Paint paint = this.I;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, t5Var.getMeasuredWidth(), t5Var.getMeasuredHeight(), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder();
        MediaController.PhotoEntry photoEntry = this.G;
        if (photoEntry != null && photoEntry.isLivePhoto()) {
            sb2.append(LocaleController.getString(R.string.AttachLivePhoto));
        } else {
            MediaController.PhotoEntry photoEntry2 = this.G;
            if (photoEntry2 != null && photoEntry2.isVideo) {
                StringBuilder sb3 = new StringBuilder();
                org.telegram.ui.d3.p(R.string.AttachVideo, ", ", sb3);
                sb3.append(LocaleController.formatDuration(this.G.duration));
                sb2.append(sb3.toString());
            } else {
                sb2.append(LocaleController.getString(R.string.AttachPhoto));
            }
        }
        if (this.G != null) {
            sb2.append(". ");
            sb2.append(LocaleController.getInstance().getFormatterStats().format(this.G.dateTaken * 1000));
        }
        accessibilityNodeInfo.setText(sb2);
        if (this.d.f26634a.f26091q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, LocaleController.getString(R.string.Open)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f25709x) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25710y, 1073741824), wh.D(2.0f, this.f25710y, 1073741824));
            return;
        }
        int i12 = 6;
        if (this.E) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824);
            if (this.f25706r) {
                i12 = 0;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 80), 1073741824));
            return;
        }
        if (this.f25706r) {
            i12 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 80), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.x5.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (i10 == R.id.acc_action_open_photo) {
            View view = (View) getParent();
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, getLeft(), (getHeight() + getTop()) - 1, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, getLeft(), (getHeight() + getTop()) - 1, 0));
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setDelegate(w5 w5Var) {
        this.f25708w = w5Var;
    }

    public void setFastScrollDelegate(v5 v5Var) {
        this.U = v5Var;
    }

    public void setHasSpoiler(boolean z10) {
        c(z10, null);
    }

    public void setHighQuality(boolean z10) {
        boolean z11;
        if (z10 && a()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.O != z11) {
            this.O = z11;
            MediaController.PhotoEntry photoEntry = this.G;
            if (photoEntry != null) {
                boolean z12 = photoEntry.isVideo;
                ImageView imageView = this.e;
                u5 u5Var = this.h;
                TextView textView = this.f25704f;
                if (z12 && !photoEntry.isLivePhoto()) {
                    this.f25701a.q(0, true);
                    u5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
                    textView.setText(AndroidUtilities.formatShortDuration(this.G.duration));
                } else if (this.G.isHighQuality()) {
                    u5Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
                    textView.setText(LocaleController.getString(R.string.ShortHighQuality));
                } else {
                    imageView.setVisibility(8);
                    u5Var.setVisibility(4);
                }
            }
        }
    }

    public void setIsVertical(boolean z10) {
        this.E = z10;
    }

    public void setItemSize(int i10) {
        this.f25710y = i10;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25702b.getLayoutParams();
        int i11 = this.f25710y;
        layoutParams.height = i11;
        layoutParams.width = i11;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f25703c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        aq aqVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) aqVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int dp = AndroidUtilities.dp(5.0f);
        layoutParams3.topMargin = dp;
        layoutParams3.rightMargin = dp;
        aqVar.setDrawBackgroundAsArc(6);
        this.f25709x = true;
    }

    public void setNum(int i10) {
        this.d.setNum(i10);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.f25703c.setOnClickListener(onClickListener);
    }
}
