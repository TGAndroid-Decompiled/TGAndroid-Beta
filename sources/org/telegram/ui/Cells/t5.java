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
import org.telegram.messenger.em;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.uq;
import org.telegram.ui.PhotoViewer;
public final class t5 extends FrameLayout {
    public static final Rect f20433a0 = new Rect();
    public boolean E;
    public final boolean F;
    public MediaController.PhotoEntry G;
    public MediaController.SearchImage H;
    public final Paint I;
    public AnimatorSet J;
    public final org.telegram.ui.ActionBar.f6 K;
    public uh.h L;
    public uh.g M;
    public boolean N;
    public boolean O;
    public long P;
    public boolean Q;
    public Bitmap R;
    public Float S;
    public float T;
    public r5 U;
    public SpannableString V;
    public SpannableString W;
    public final p5 f20434a;
    public final o5 f20435b;
    public final FrameLayout f20436c;
    public final tp d;
    public final ImageView e;
    public final TextView f20437f;
    public final q5 h;
    public AnimatorSet f20438n;
    public boolean f20439r;
    public boolean f20440s;
    public boolean v;
    public s5 f20441w;
    public boolean f20442x;
    public int f20443y;

    public t5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.F = true;
        this.I = new Paint();
        new Path();
        this.T = 1.0f;
        this.K = f6Var;
        setWillNotDraw(false);
        o5 o5Var = new o5(this, context);
        this.f20435b = o5Var;
        addView(o5Var, w7.a6.c(80.0f, 80));
        p5 p5Var = new p5(this, context);
        this.f20434a = p5Var;
        p5Var.setBlurAllowed(true);
        o5Var.addView(p5Var, w7.a6.c(-1.0f, -1));
        q5 q5Var = new q5(context, 0);
        q5Var.f19717b = new RectF();
        this.h = q5Var;
        q5Var.setWillNotDraw(false);
        q5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        o5Var.addView(q5Var, w7.a6.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        q5Var.addView(imageView, w7.a6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f20437f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        q5Var.addView(textView, w7.a6.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        tp tpVar = new tp(context, 24, f6Var);
        this.d = tpVar;
        tpVar.setDrawBackgroundAsArc(7);
        tpVar.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
        addView(tpVar, w7.a6.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        tpVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f20436c = frameLayout;
        addView(frameLayout, w7.a6.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.f20443y = AndroidUtilities.dp(80.0f);
    }

    public final boolean a() {
        return this.d.f27462a.f21057q;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        float f7;
        float f10;
        this.d.f27462a.f(i10, z10, z11);
        boolean z12 = false;
        if (this.f20442x) {
            AnimatorSet animatorSet = this.J;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.J = null;
            }
            float f11 = 1.0f;
            o5 o5Var = this.f20435b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.J = animatorSet2;
                if (z10) {
                    f10 = 0.787f;
                } else {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o5Var, View.SCALE_X, f10);
                if (z10) {
                    f11 = 0.787f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(o5Var, View.SCALE_Y, f11));
                this.J.setDuration(200L);
                this.J.addListener(new ai.e(19, this, z10));
                this.J.start();
            } else {
                if (z10) {
                    f7 = 0.787f;
                } else {
                    f7 = 1.0f;
                }
                o5Var.setScaleX(f7);
                if (z10) {
                    f11 = 0.787f;
                }
                o5Var.setScaleY(f11);
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
            p5 p5Var = this.f20434a;
            if (isLaidOut) {
                Bitmap bitmap = this.R;
                this.R = AndroidUtilities.snapshotView(p5Var);
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
            p5Var.setHasBlur(z10);
            p5Var.invalidate();
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
            tp tpVar = this.d;
            float f10 = 1.0f;
            if (tpVar.f27462a.f21057q) {
                f7 = 0.787f;
            } else {
                f7 = 1.0f;
            }
            o5 o5Var = this.f20435b;
            o5Var.setScaleX(f7);
            if (tpVar.f27462a.f21057q) {
                f10 = 0.787f;
            }
            o5Var.setScaleY(f10);
        }
    }

    public final void d(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        float f7;
        boolean z15 = false;
        this.v = false;
        this.G = photoEntry;
        this.f20439r = z12;
        this.f20440s = z13;
        boolean z16 = photoEntry.isVideo;
        float f10 = 0.0f;
        ImageView imageView = this.e;
        TextView textView = this.f20437f;
        q5 q5Var = this.h;
        p5 p5Var = this.f20434a;
        if (z16 && !photoEntry.isLivePhoto()) {
            p5Var.q(0, true);
            q5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
            textView.setText(AndroidUtilities.formatShortDuration(this.G.duration));
        } else if (this.G.isHighQuality() && a()) {
            q5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
            textView.setText(LocaleController.getString(R.string.ShortHighQuality));
        } else {
            imageView.setVisibility(8);
            q5Var.setVisibility(4);
        }
        MediaController.PhotoEntry photoEntry2 = this.G;
        String str = photoEntry2.coverPath;
        if (str != null) {
            p5Var.f(str, null, org.telegram.ui.ActionBar.j6.R4);
        } else {
            String str2 = photoEntry2.thumbPath;
            if (str2 != null) {
                p5Var.f(str2, null, org.telegram.ui.ActionBar.j6.R4);
            } else if (photoEntry2.path != null) {
                if (photoEntry2.isVideo && !photoEntry2.isLivePhoto()) {
                    p5Var.f("vthumb://" + this.G.imageId + ":" + this.G.path, null, org.telegram.ui.ActionBar.j6.R4);
                } else {
                    MediaController.PhotoEntry photoEntry3 = this.G;
                    p5Var.p(photoEntry3.orientation, photoEntry3.invert, true);
                    p5Var.f("thumb://" + this.G.imageId + ":" + this.G.path, null, org.telegram.ui.ActionBar.j6.R4);
                }
            } else {
                p5Var.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
            }
        }
        if (z11 && PhotoViewer.L1(this.G.path)) {
            z14 = true;
        } else {
            z14 = false;
        }
        p5Var.getImageReceiver().setVisible(!z14, true);
        if (z14) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.d.setAlpha(f7);
        if (!z14) {
            f10 = 1.0f;
        }
        q5Var.setAlpha(f10);
        requestLayout();
        setHasSpoiler(photoEntry.hasSpoiler);
        if (photoEntry.isHighQuality() && a()) {
            z15 = true;
        }
        setHighQuality(z15);
        f(photoEntry.starsAmount, z10);
    }

    public final void e(org.telegram.messenger.MediaController.SearchImage r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t5.e(org.telegram.messenger.MediaController$SearchImage):void");
    }

    public final void f(long j3, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        if (z10 == this.Q && j3 == this.P) {
            return;
        }
        this.P = j3;
        this.Q = z10;
        if (j3 > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.V == null) {
                this.V = new SpannableString("⭐");
                uq uqVar = new uq(R.drawable.star_small_inner, 0);
                uqVar.setScale(0.7f, 0.7f);
                SpannableString spannableString = this.V;
                spannableString.setSpan(uqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.V);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.W == null) {
                    this.W = new SpannableString("l");
                    uq uqVar2 = new uq(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.W;
                    spannableString2.setSpan(uqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.W);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j3));
            }
        } else {
            spannableStringBuilder = null;
        }
        p5 p5Var = this.f20434a;
        p5Var.setBlurredText(spannableStringBuilder);
        p5Var.invalidate();
        this.f20435b.invalidate();
    }

    public final void g(boolean z10) {
        float f7;
        float f10 = 1.0f;
        tp tpVar = this.d;
        if (!z10 || tpVar.getAlpha() != 1.0f) {
            if (!z10 && tpVar.getAlpha() == 0.0f) {
                return;
            }
            AnimatorSet animatorSet = this.f20438n;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f20438n = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f20438n = animatorSet2;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            this.f20438n.setDuration(180L);
            AnimatorSet animatorSet3 = this.f20438n;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float[] fArr = {f7};
            q5 q5Var = this.h;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q5Var, property, fArr);
            if (!z10) {
                f10 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(tpVar, property, f10));
            this.f20438n.addListener(new bi.h(this, 28));
            this.f20438n.start();
        }
    }

    public tp getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.f20436c;
    }

    public org.telegram.ui.Components.w9 getImageView() {
        return this.f20434a;
    }

    public MediaController.PhotoEntry getPhotoEntry() {
        return this.G;
    }

    public float getScale() {
        return this.f20435b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z10) {
        p5 p5Var;
        o5 o5Var = this.f20435b;
        if (o5Var != null && (p5Var = this.f20434a) != null && p5Var.getMeasuredHeight() > 0 && p5Var.getMeasuredWidth() > 0) {
            if (z10) {
                if (this.M == null) {
                    this.M = uh.g.e(o5Var);
                    return;
                }
                return;
            }
            uh.g gVar = this.M;
            if (gVar != null) {
                gVar.b(this);
                this.M = null;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        uh.g gVar = this.M;
        if (gVar != null) {
            if (gVar.f42767i) {
                this.M = uh.g.e(this);
            } else {
                gVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        uh.g gVar = this.M;
        if (gVar != null) {
            gVar.b(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        MediaController.PhotoEntry photoEntry;
        MediaController.SearchImage searchImage;
        boolean z10 = this.d.f27462a.f21057q;
        p5 p5Var = this.f20434a;
        if (!z10 && this.f20435b.getScaleX() == 1.0f && p5Var.getImageReceiver().hasNotThumb() && p5Var.getImageReceiver().getCurrentAlpha() == 1.0f && (((photoEntry = this.G) == null || !PhotoViewer.L1(photoEntry.path)) && ((searchImage = this.H) == null || !PhotoViewer.L1(searchImage.getPathToAttach())))) {
            return;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.X9, this.K);
        Paint paint = this.I;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, p5Var.getMeasuredWidth(), p5Var.getMeasuredHeight(), paint);
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
                em.l(R.string.AttachVideo, ", ", sb3);
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
        if (this.d.f27462a.f21057q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, LocaleController.getString(R.string.Open)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f20442x) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f20443y, 1073741824), em.C(2.0f, this.f20443y, 1073741824));
            return;
        }
        int i12 = 6;
        if (this.E) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824);
            if (this.f20439r) {
                i12 = 0;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 80), 1073741824));
            return;
        }
        if (this.f20439r) {
            i12 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 80), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t5.onTouchEvent(android.view.MotionEvent):boolean");
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

    public void setDelegate(s5 s5Var) {
        this.f20441w = s5Var;
    }

    public void setFastScrollDelegate(r5 r5Var) {
        this.U = r5Var;
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
                q5 q5Var = this.h;
                TextView textView = this.f20437f;
                if (z12 && !photoEntry.isLivePhoto()) {
                    this.f20434a.q(0, true);
                    q5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
                    textView.setText(AndroidUtilities.formatShortDuration(this.G.duration));
                } else if (this.G.isHighQuality()) {
                    q5Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
                    textView.setText(LocaleController.getString(R.string.ShortHighQuality));
                } else {
                    imageView.setVisibility(8);
                    q5Var.setVisibility(4);
                }
            }
        }
    }

    public void setIsVertical(boolean z10) {
        this.E = z10;
    }

    public void setItemSize(int i10) {
        this.f20443y = i10;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f20435b.getLayoutParams();
        int i11 = this.f20443y;
        layoutParams.height = i11;
        layoutParams.width = i11;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f20436c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        tp tpVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) tpVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int dp = AndroidUtilities.dp(5.0f);
        layoutParams3.topMargin = dp;
        layoutParams3.rightMargin = dp;
        tpVar.setDrawBackgroundAsArc(6);
        this.f20442x = true;
    }

    public void setNum(int i10) {
        this.d.setNum(i10);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.f20436c.setOnClickListener(onClickListener);
    }
}
