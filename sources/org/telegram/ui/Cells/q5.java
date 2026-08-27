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
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cq;
import org.telegram.ui.PhotoViewer;

public final class q5 extends FrameLayout {
    public static final Rect T = new Rect();
    public boolean A;
    public final boolean B;
    public MediaController.PhotoEntry C;
    public MediaController.SearchImage D;
    public final Paint E;
    public AnimatorSet F;
    public final org.telegram.ui.ActionBar.c6 G;
    public eh.k H;
    public eh.j I;
    public boolean J;
    public boolean K;
    public long L;
    public boolean M;
    public Bitmap N;
    public Float O;
    public float P;
    public o5 Q;
    public SpannableString R;
    public SpannableString S;

    public final m5 f25053a;

    public final l5 f25054b;

    public final FrameLayout f25055c;
    public final bp d;

    public final ImageView f25056e;

    public final TextView f25057f;
    public final n5 h;

    public AnimatorSet f25058n;

    public boolean f25059r;

    public boolean f25060s;
    public boolean v;

    public p5 f25061w;

    public boolean f25062x;

    public int f25063y;

    public q5(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.B = true;
        this.E = new Paint();
        new Path();
        this.P = 1.0f;
        this.G = c6Var;
        setWillNotDraw(false);
        l5 l5Var = new l5(this, context);
        this.f25054b = l5Var;
        addView(l5Var, h7.z5.c(80.0f, 80));
        m5 m5Var = new m5(this, context);
        this.f25053a = m5Var;
        m5Var.setBlurAllowed(true);
        l5Var.addView(m5Var, h7.z5.c(-1.0f, -1));
        n5 n5Var = new n5(context, 0);
        n5Var.f24724b = new RectF();
        this.h = n5Var;
        n5Var.setWillNotDraw(false);
        n5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        l5Var.addView(n5Var, h7.z5.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f25056e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        n5Var.addView(imageView, h7.z5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f25057f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        n5Var.addView(textView, h7.z5.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        bp bpVar = new bp(context, 24, c6Var);
        this.d = bpVar;
        bpVar.setDrawBackgroundAsArc(7);
        bpVar.b(org.telegram.ui.ActionBar.g6.W9, org.telegram.ui.ActionBar.g6.X9, org.telegram.ui.ActionBar.g6.V9);
        addView(bpVar, h7.z5.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        bpVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25055c = frameLayout;
        addView(frameLayout, h7.z5.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.f25063y = AndroidUtilities.dp(80.0f);
    }

    public final boolean a() {
        return this.d.f27188a.f26309q;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        this.d.f27188a.f(i10, z10, z11);
        boolean z12 = false;
        if (this.f25062x) {
            AnimatorSet animatorSet = this.F;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.F = null;
            }
            l5 l5Var = this.f25054b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.F = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(l5Var, (Property<l5, Float>) View.SCALE_X, z10 ? 0.787f : 1.0f), ObjectAnimator.ofFloat(l5Var, (Property<l5, Float>) View.SCALE_Y, z10 ? 0.787f : 1.0f));
                this.F.setDuration(200L);
                this.F.addListener(new ag.x(24, this, z10));
                this.F.start();
            } else {
                l5Var.setScaleX(z10 ? 0.787f : 1.0f);
                l5Var.setScaleY(z10 ? 0.787f : 1.0f);
            }
        }
        MediaController.PhotoEntry photoEntry = this.C;
        if (photoEntry != null && photoEntry.isHighQuality() && a()) {
            z12 = true;
        }
        setHighQuality(z12);
    }

    public final void c(boolean z10, Float f10) {
        if (this.J != z10) {
            boolean zIsLaidOut = isLaidOut();
            m5 m5Var = this.f25053a;
            if (zIsLaidOut) {
                Bitmap bitmap = this.N;
                this.N = AndroidUtilities.snapshotView(m5Var);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.P = 0.0f;
            } else {
                Bitmap bitmap2 = this.N;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.N = null;
                }
                this.P = 1.0f;
            }
            this.J = z10;
            this.O = f10;
            m5Var.setHasBlur(z10);
            m5Var.invalidate();
            if (z10) {
                h(z10);
            }
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.F;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.F = null;
            bp bpVar = this.d;
            float f10 = bpVar.f27188a.f26309q ? 0.787f : 1.0f;
            l5 l5Var = this.f25054b;
            l5Var.setScaleX(f10);
            l5Var.setScaleY(bpVar.f27188a.f26309q ? 0.787f : 1.0f);
        }
    }

    public final void d(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        this.v = false;
        this.C = photoEntry;
        this.f25059r = z12;
        this.f25060s = z13;
        boolean z15 = photoEntry.isVideo;
        ImageView imageView = this.f25056e;
        TextView textView = this.f25057f;
        n5 n5Var = this.h;
        m5 m5Var = this.f25053a;
        if (z15 && !photoEntry.isLivePhoto()) {
            m5Var.q(0, true);
            n5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
            textView.setText(AndroidUtilities.formatShortDuration(this.C.duration));
        } else if (this.C.isHighQuality() && a()) {
            n5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
            textView.setText(LocaleController.getString(R.string.ShortHighQuality));
        } else {
            imageView.setVisibility(8);
            n5Var.setVisibility(4);
        }
        MediaController.PhotoEntry photoEntry2 = this.C;
        String str = photoEntry2.coverPath;
        if (str != null) {
            m5Var.f(str, null, org.telegram.ui.ActionBar.g6.R4);
        } else {
            String str2 = photoEntry2.thumbPath;
            if (str2 != null) {
                m5Var.f(str2, null, org.telegram.ui.ActionBar.g6.R4);
            } else if (photoEntry2.path == null) {
                m5Var.setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
            } else if (!photoEntry2.isVideo || photoEntry2.isLivePhoto()) {
                MediaController.PhotoEntry photoEntry3 = this.C;
                m5Var.p(photoEntry3.orientation, photoEntry3.invert, true);
                m5Var.f("thumb://" + this.C.imageId + ":" + this.C.path, null, org.telegram.ui.ActionBar.g6.R4);
            } else {
                m5Var.f("vthumb://" + this.C.imageId + ":" + this.C.path, null, org.telegram.ui.ActionBar.g6.R4);
            }
        }
        boolean z16 = z11 && PhotoViewer.L1(this.C.path);
        m5Var.getImageReceiver().setVisible(!z16, true);
        this.d.setAlpha(z16 ? 0.0f : 1.0f);
        n5Var.setAlpha(z16 ? 0.0f : 1.0f);
        requestLayout();
        setHasSpoiler(photoEntry.hasSpoiler);
        if (photoEntry.isHighQuality() && a()) {
            z14 = true;
        }
        setHighQuality(z14);
        f(photoEntry.starsAmount, z10);
    }

    public final void e(MediaController.SearchImage searchImage) {
        m5 m5Var;
        boolean zL1;
        float f10;
        this.v = false;
        this.D = searchImage;
        this.f25059r = false;
        Drawable drawable = this.B ? org.telegram.ui.ActionBar.g6.R4 : getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = searchImage.thumbPhotoSize;
        m5 m5Var2 = this.f25053a;
        if (photoSize != null) {
            m5Var2.h(ImageLocation.getForPhoto(photoSize, searchImage.photo), null, drawable, searchImage);
        } else {
            TLRPC.PhotoSize photoSize2 = searchImage.photoSize;
            if (photoSize2 != null) {
                m5Var2.h(ImageLocation.getForPhoto(photoSize2, searchImage.photo), "80_80", drawable, searchImage);
            } else {
                String str = searchImage.thumbPath;
                if (str == null) {
                    if (TextUtils.isEmpty(searchImage.thumbUrl)) {
                        TLRPC.Document document = searchImage.document;
                        if (document != null) {
                            MessageObject.getDocumentVideoThumb(document);
                            TLRPC.VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(searchImage.document);
                            if (documentVideoThumb != null) {
                                m5Var2.k(ImageLocation.getForDocument(documentVideoThumb, searchImage.document), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 90), searchImage.document), "52_52", -1L, null, searchImage, 1);
                                m5Var = m5Var2;
                            } else {
                                m5Var = m5Var2;
                                m5Var.h(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 320), searchImage.document), null, drawable, searchImage);
                            }
                        } else {
                            m5Var = m5Var2;
                            m5Var.setImageDrawable(drawable);
                        }
                    } else {
                        ImageLocation forPath = ImageLocation.getForPath(searchImage.thumbUrl);
                        if (searchImage.type == 1 && searchImage.thumbUrl.endsWith("mp4")) {
                            forPath.imageType = 2;
                        }
                        m5Var2.h(forPath, null, drawable, searchImage);
                    }
                    zL1 = PhotoViewer.L1(searchImage.getPathToAttach());
                    m5Var.getImageReceiver().setVisible(!zL1, true);
                    if (zL1) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    this.d.setAlpha(f10);
                    this.h.setAlpha(zL1 ? 0.0f : 1.0f);
                    requestLayout();
                    setHasSpoiler(false);
                    setHighQuality(false);
                    f(0L, false);
                }
                m5Var2.f(str, null, drawable);
            }
        }
        m5Var = m5Var2;
        zL1 = PhotoViewer.L1(searchImage.getPathToAttach());
        m5Var.getImageReceiver().setVisible(!zL1, true);
        if (zL1) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.d.setAlpha(f10);
        this.h.setAlpha(zL1 ? 0.0f : 1.0f);
        requestLayout();
        setHasSpoiler(false);
        setHighQuality(false);
        f(0L, false);
    }

    public final void f(long j10, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        if (z10 == this.M && j10 == this.L) {
            return;
        }
        this.L = j10;
        this.M = z10;
        if (j10 > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.R == null) {
                this.R = new SpannableString("⭐");
                cq cqVar = new cq(R.drawable.star_small_inner, 0);
                cqVar.setScale(0.7f, 0.7f);
                SpannableString spannableString = this.R;
                spannableString.setSpan(cqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.R);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.S == null) {
                    this.S = new SpannableString("l");
                    cq cqVar2 = new cq(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.S;
                    spannableString2.setSpan(cqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.S);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j10));
            }
        } else {
            spannableStringBuilder = null;
        }
        m5 m5Var = this.f25053a;
        m5Var.setBlurredText(spannableStringBuilder);
        m5Var.invalidate();
        this.f25054b.invalidate();
    }

    public final void g(boolean z10) {
        bp bpVar = this.d;
        if (z10 && bpVar.getAlpha() == 1.0f) {
            return;
        }
        if (z10 || bpVar.getAlpha() != 0.0f) {
            AnimatorSet animatorSet = this.f25058n;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f25058n = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f25058n = animatorSet2;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            this.f25058n.setDuration(180L);
            AnimatorSet animatorSet3 = this.f25058n;
            float[] fArr = {z10 ? 1.0f : 0.0f};
            n5 n5Var = this.h;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property, fArr), ObjectAnimator.ofFloat(bpVar, (Property<bp, Float>) property, z10 ? 1.0f : 0.0f));
            this.f25058n.addListener(new lh.h9(this, 16));
            this.f25058n.start();
        }
    }

    public bp getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.f25055c;
    }

    public org.telegram.ui.Components.n9 getImageView() {
        return this.f25053a;
    }

    public MediaController.PhotoEntry getPhotoEntry() {
        return this.C;
    }

    public float getScale() {
        return this.f25054b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z10) {
        m5 m5Var;
        l5 l5Var = this.f25054b;
        if (l5Var == null || (m5Var = this.f25053a) == null || m5Var.getMeasuredHeight() <= 0 || m5Var.getMeasuredWidth() <= 0) {
            return;
        }
        if (z10) {
            if (this.I == null) {
                this.I = eh.j.e(l5Var);
            }
        } else {
            eh.j jVar = this.I;
            if (jVar != null) {
                jVar.b(this);
                this.I = null;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        eh.j jVar = this.I;
        if (jVar != null) {
            if (jVar.f5506i) {
                this.I = eh.j.e(this);
            } else {
                jVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        eh.j jVar = this.I;
        if (jVar != null) {
            jVar.b(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        MediaController.PhotoEntry photoEntry;
        MediaController.SearchImage searchImage;
        boolean z10 = this.d.f27188a.f26309q;
        m5 m5Var = this.f25053a;
        if (!z10 && this.f25054b.getScaleX() == 1.0f && m5Var.getImageReceiver().hasNotThumb() && m5Var.getImageReceiver().getCurrentAlpha() == 1.0f && (((photoEntry = this.C) == null || !PhotoViewer.L1(photoEntry.path)) && ((searchImage = this.D) == null || !PhotoViewer.L1(searchImage.getPathToAttach())))) {
            return;
        }
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.X9, this.G);
        Paint paint = this.E;
        paint.setColor(iV0);
        canvas.drawRect(0.0f, 0.0f, m5Var.getMeasuredWidth(), m5Var.getMeasuredHeight(), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder();
        MediaController.PhotoEntry photoEntry = this.C;
        if (photoEntry == null || !photoEntry.isLivePhoto()) {
            MediaController.PhotoEntry photoEntry2 = this.C;
            if (photoEntry2 == null || !photoEntry2.isVideo) {
                sb2.append(LocaleController.getString(R.string.AttachPhoto));
            } else {
                StringBuilder sb3 = new StringBuilder();
                rl.j(R.string.AttachVideo, ", ", sb3);
                sb3.append(LocaleController.formatDuration(this.C.duration));
                sb2.append(sb3.toString());
            }
        } else {
            sb2.append(LocaleController.getString(R.string.AttachLivePhoto));
        }
        if (this.C != null) {
            sb2.append(". ");
            sb2.append(LocaleController.getInstance().getFormatterStats().format(this.C.dateTaken * 1000));
        }
        accessibilityNodeInfo.setText(sb2);
        if (this.d.f27188a.f26309q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, LocaleController.getString(R.string.Open)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f25062x) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25063y, 1073741824), rl.B(2.0f, this.f25063y, 1073741824));
            return;
        }
        if (this.A) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f25059r ? 0 : 6) + 80), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f25059r ? 0 : 6) + 80), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f25055c;
        Rect rect = T;
        frameLayout.getHitRect(rect);
        boolean z10 = true;
        if (motionEvent.getAction() == 0) {
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.v = true;
                invalidate();
            }
            if (z10) {
                return z10;
            }
            return super.onTouchEvent(motionEvent);
        }
        if (this.v) {
            if (motionEvent.getAction() == 1) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.v = false;
                playSoundEffect(0);
                sendAccessibilityEvent(1);
                this.f25061w.d(this);
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.v = false;
                invalidate();
            } else if (motionEvent.getAction() == 2 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.v = false;
                invalidate();
            }
        }
        z10 = false;
        if (z10) {
            return super.onTouchEvent(motionEvent);
        }
        return z10;
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

    public void setDelegate(p5 p5Var) {
        this.f25061w = p5Var;
    }

    public void setFastScrollDelegate(o5 o5Var) {
        this.Q = o5Var;
    }

    public void setHasSpoiler(boolean z10) {
        c(z10, null);
    }

    public void setHighQuality(boolean z10) {
        boolean z11 = z10 && a();
        if (this.K != z11) {
            this.K = z11;
            MediaController.PhotoEntry photoEntry = this.C;
            if (photoEntry != null) {
                boolean z12 = photoEntry.isVideo;
                ImageView imageView = this.f25056e;
                n5 n5Var = this.h;
                TextView textView = this.f25057f;
                if (z12 && !photoEntry.isLivePhoto()) {
                    this.f25053a.q(0, true);
                    n5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
                    textView.setText(AndroidUtilities.formatShortDuration(this.C.duration));
                    return;
                }
                if (!this.C.isHighQuality()) {
                    imageView.setVisibility(8);
                    n5Var.setVisibility(4);
                } else {
                    n5Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
                    textView.setText(LocaleController.getString(R.string.ShortHighQuality));
                }
            }
        }
    }

    public void setIsVertical(boolean z10) {
        this.A = z10;
    }

    public void setItemSize(int i10) {
        this.f25063y = i10;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25054b.getLayoutParams();
        int i11 = this.f25063y;
        layoutParams.height = i11;
        layoutParams.width = i11;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f25055c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        bp bpVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) bpVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int iDp = AndroidUtilities.dp(5.0f);
        layoutParams3.topMargin = iDp;
        layoutParams3.rightMargin = iDp;
        bpVar.setDrawBackgroundAsArc(6);
        this.f25062x = true;
    }

    public void setNum(int i10) {
        this.d.setNum(i10);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.f25055c.setOnClickListener(onClickListener);
    }
}
